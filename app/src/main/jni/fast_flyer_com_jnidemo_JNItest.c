//
// Created by 梁传飞 on 16/4/18.
//
#include "fast_flyer_com_jnidemo_JNItest.h"

JNIEXPORT jstring JNICALL Java_fast_flyer_com_jnidemo_JNItest_getStrFromJni
  (JNIEnv * env, jobject obj){
        char* cstr = "hello from c，studio自动编译jni,牛逼";
        return (*env)->NewStringUTF(env, cstr);
  }