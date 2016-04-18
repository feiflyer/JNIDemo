package fast.flyer.com.jnidemo;

/**
 * Created by liangchuanfei on 16/4/18.
 */
public class JNItest {
    static{
        System.loadLibrary("hello-jni");
    }

    public static native String getStrFromJni();
}
