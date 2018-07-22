document.addEventListener('DOMContentLoaded', function() {
    var s1 = new Suggest();
    s1.init();
}, false);

function Suggest() {
    //提示框对应的输入框
    this.oMenu = document.getElementById('username');
    //提示框对应的提示层    
    this.oContent=document.getElementById('');
    this.oUl = document.getElementById('suggest');
    this.aLis = this.oUl.getElementsByTagName('li');

}
  
Suggest.prototype = {
    constructor: Suggest,
    init: function() {

        var that = this;
        var iNow = 1;
        
        this.oInput.addEventListener('input', function() {
            //效果1：文本框输入的时候，提示框显示
            that.showUl();
            //效果3：提示框自动补充邮箱后缀，并在用户输入@之后，自动进行过滤
            that.changeUl();
            that.sel(iNow);
        }, false);
        //效果2：失去焦点的时候，提示框隐藏
        this.oInput.addEventListener('blur', function() {
            that.hideUl();
        }, false);
        // 
        //效果4，点击对应的提示项，文本框的内容随之改变，同时提示框消失

        for (var i = 1; i < this.aLis.length; i++) {
            this.aLis[i].index = i;
            this.aLis[i].addEventListener('mouseover', function() {
                that.sel(this.index);
                iNow = this.index;
            }, false);
            this.aLis[i].addEventListener('mousedown',function(){
                that.oInput.value=this.innerHTML;
            },false);
        }

        //效果5：上下键盘可以切换提示选中项
        //效果6：当按下回车键时，文本框内容随之改变，同时提示框消失
        //焦点在哪个控件上，就给哪个控件添加处理时间
        this.oInput.addEventListener('keydown', function(e) {
            var event = e || window.event;
            var code = event.charCode || event.keyCode;
            if (code == 38) { //向上
                iNow--;
                if (iNow == 0) {
                    iNow = that.aLis.length - 1;
                }
            } else if (code == 40) {
                iNow++;
                if (iNow == that.aLis.length ) {
                    iNow = 1;
                }
            }
            that.sel(iNow);
            //如果按下的是回车键
            if(code==13){
                that.oInput.value=that.aLis[iNow].innerHTML;
                that.oInput.blur();
            }
        }, false);
        

        

    },
    showUl: function() {
        this.oUl.style.display = 'block';
        for (var i = 0; i < this.aLis.length; i++) {
            this.aLis[i].style.display = 'block';
            this.aLis[i].className = '';
        }
    },
    hideUl: function() {
        this.oUl.style.display = 'none';
    },
    changeUl: function() {
        var value = this.oInput.value;
        var suffix = value.substring(value.indexOf('@') + 1);
        var reg = new RegExp('@' + suffix);
        var match = reg.test(value);

        for (var i = 1, len = this.aLis.length; i < len; i++) {
            var emailText = this.aLis[i].getAttribute('email');
            //分为两种情况，输入内容包含@，以及输入内容不包含@
            if (match) {
                //说明输入内容包含@
                //根据输入的后缀进行过滤，只显示匹配的邮箱
                if (reg.test(emailText)) {
                    this.aLis[i].innerHTML = value.substring(0, value.indexOf('@')) + emailText;
                } else {
                    this.aLis[i].style.display = 'none';
                }

            } else {
                //说明输入内容不包含@
                this.aLis[i].innerHTML = value + emailText;
            }

        }
    },
    sel: function(iNow) {
        for (var i = 1; i < this.aLis.length; i++) {
            this.aLis[i].className = '';
        }
        if (this.oInput.value) {
            this.aLis[iNow].className = 'active';
        }
    },

};