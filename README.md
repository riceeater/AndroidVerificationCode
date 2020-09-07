类滴滴验证码输入框，长这样：

![](image/自定义View-验证码仿滴滴.gif)



### 实现思路

**笔者这里决定继承RelativeLayout来实现自定义验证码的功能。显示验证码可以使用几个TextView，这里需要将TextView统一管理，所以还需要一个TextView数组。有光标，那自然而然的就想到了EditText，可以使用一个透明背景的EditText。几个验证码可以使用TextView以一定的规则进行排列，通过监听EditText的输入，拦截到输入字符，并将字符传递给TextView数组，并将EditText置为空，同时重设TextView选中状态，移动EditText光标。笔者这里采用给EditText设置paddingLeft的方式来实现光标的移动，当然，需要经过一些计算。OK，大概思路就是这样了，具体的代码我们继续看下面的。**

### 使用：

```xml
<com.xylitolz.androidverificationcode.view.VerificationCodeView
        android:id="@+id/view_verification"
		android:layout_width="240dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        app:vcv_code_size="16sp"
        app:vcv_code_bg_focus="@drawable/bg_text_focused"
        app:vcv_code_bg_normal="@drawable/bg_text_normal"
        app:vcv_code_color="@color/text_border_focused"
        app:vcv_code_number="4"
        app:vcv_code_width="50dp"/>
```



效果参考上图



相关博客地址：[Android自定义View-仿滴滴自定义验证码输入框](https://riceeater.github.io/articles/Android/View/VerificationCodeView/) 