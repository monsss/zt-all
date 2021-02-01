package com.monsss.javagrammar;

import java.io.IOException;
import java.lang.ref.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ReferenceTest {
    public static void main(String[] args) throws InterruptedException, IOException {

//        final ReferenceQueue referenceQueue=new ReferenceQueue();
//
//        Object value = new Object();
//        Map<Object, Object> map = new HashMap<Object, Object>();
//        for(int i = 0;i < 10000;i++) {
//            byte[] bytes = new byte[1024*1024];
//            WeakReference<byte[]> weakReference = new WeakReference<byte[]>(bytes, referenceQueue);
//            map.put(weakReference, value);
//        }
//        System.out.println("map.size->" + map.size());
//        Thread thread = new Thread(() -> {
//            try {
//                int cnt = 0;
//                WeakReference<byte[]> k;
//                while((k = (WeakReference) referenceQueue.remove()) != null) {
//                    System.out.println((cnt++) + "回收了:" + k);
//                    System.out.println("k.get() = " + k.get());
//                }
//            } catch(InterruptedException e) {
//                //结束循环
//            }
//        });
//        thread.setDaemon(true);
//        thread.start();
//
//
//        map.clear();
//        System.gc();
//        Thread.sleep(100000);
//
//        final ReferenceQueue weakReferenceQueue=new ReferenceQueue();
//        A weakA = new A();
//        WeakReference weakReference = new WeakReference(weakA,weakReferenceQueue);//B b = new B(a);a = null;
//        new Thread(new Runnable() {
//            public void run() {
//                while (true){
//                    Object obj = weakReferenceQueue.poll();
//                    if (obj != null) {
//                        try {
//                            Field rereferent = Reference.class
//                                    .getDeclaredField("referent");
//                            rereferent.setAccessible(true);
//                            Object result = rereferent.get(obj);
//                            System.out.println("gc will collect："
//                                    + result.getClass() + "@"
//                                    + result.hashCode() + "\t"
//                                    + (String) result);
//
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            }
//        }).start();
//        weakA=null;
//        Thread.currentThread().sleep(3000);
//        System.gc();
//        Thread.currentThread().sleep(3000);


//        final ReferenceQueue softReferenceQueue=new ReferenceQueue();
//        A softA = new A();
//        SoftReference softReference = new SoftReference(softA,softReferenceQueue);//B b = new B(a);a = null;
//
//        new Thread(new Runnable() {
//            public void run() {
//                while (true){
//                    Object obj = softReferenceQueue.poll();
//                    if (obj != null) {
//                        try {
//                            Field rereferent = Reference.class
//                                    .getDeclaredField("referent");
//                            rereferent.setAccessible(true);
//                            Object result = rereferent.get(obj);
//                            System.out.println("gc will collect："
//                                    + result.getClass() + "@"
//                                    + result.hashCode() + "\t"
//                                    + (String) result);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            }
//        }).start();
//        softA=null;
//        Thread.currentThread().sleep(3000);
//        System.gc();
//        Thread.currentThread().sleep(3000);



        final ReferenceQueue phantomReferenceQueue = new ReferenceQueue ();
        A phantomA = new A();
        PhantomReference phantomReference = new PhantomReference(phantomA, phantomReferenceQueue);
        Thread thread=new Thread(new Runnable() {
            public void run() {
                while (true){
                    Object obj = phantomReferenceQueue.poll();
                    if (obj != null) {
                        try {
                            Thread.sleep(60000);
                            Field rereferent = Reference.class
                                    .getDeclaredField("referent");
                            rereferent.setAccessible(true);
                            Object result = rereferent.get(obj);
                            System.out.println("gc will collect："
                                    + result.getClass() + "@"
                                    + result.hashCode() + "\t"
                                    + (String) result);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        phantomA=null;
        Thread.currentThread().sleep(30000);
        System.gc();
        Thread.currentThread().sleep(30000000);
        System.out.println("true = " + true);
    }
}
class A{

}
class B{
    private A a;

    public B(A a) {
        this.a = a;
    }
}