package java.lang;
/*
     Equipe:
   @author André
   @author Lucas
   @author Pedro
   @author Valmir
*/

//Observação: A Thread é acionada, quando o usuário adiciona um novo amigo.

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.security.AccessControlContext;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import sun.misc.Contended;
import sun.nio.ch.Interruptible;
import sun.reflect.CallerSensitive;

public class Thread implements Runnable {

    private static class Caches {

        static final ConcurrentMap<WeakClassKey, Boolean> subclassAudits;
        static final ReferenceQueue<Class<?>> subclassAuditsQueue;

        private Caches() {
            // compiled code
        }
    }

    public enum State {

        NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED

        private State() {
            // compiled code
        }
    }

    @FunctionalInterface
    public static interface UncaughtExceptionHandler {

        public void uncaughtException(Thread thread, Throwable thrwbl);
    }

    static class WeakClassKey extends WeakReference<Class<?>> {

        private final int hash;

        WeakClassKey(Class<?> type, ReferenceQueue<Class<?>> rq) {
            // compiled code
        }

        public int hashCode() {
            // compiled code
        }

        public boolean equals(Object o) {
            // compiled code
        }
    }
    private volatile String name;
    private int priority;
    private Thread threadQ;
    private long eetop;
    private boolean single_step;
    private boolean daemon;
    private boolean stillborn;
    private Runnable target;
    private ThreadGroup group;
    private ClassLoader contextClassLoader;
    private AccessControlContext inheritedAccessControlContext;
    private static int threadInitNumber;
    ThreadLocal.ThreadLocalMap threadLocals;
    ThreadLocal.ThreadLocalMap inheritableThreadLocals;
    private long stackSize;
    private long nativeParkEventPointer;
    private long tid;
    private static long threadSeqNumber;
    private volatile int threadStatus;
    volatile Object parkBlocker;
    private volatile Interruptible blocker;
    private final Object blockerLock;
    public static final int MIN_PRIORITY = 1;
    public static final int NORM_PRIORITY = 5;
    public static final int MAX_PRIORITY = 10;
    private static final StackTraceElement[] EMPTY_STACK_TRACE;
    private static final RuntimePermission SUBCLASS_IMPLEMENTATION_PERMISSION;
    private volatile UncaughtExceptionHandler uncaughtExceptionHandler;
    private static volatile UncaughtExceptionHandler defaultUncaughtExceptionHandler;
    @Contended(value = "tlr")
    long threadLocalRandomSeed;
    @Contended(value = "tlr")
    int threadLocalRandomProbe;
    @Contended(value = "tlr")
    int threadLocalRandomSecondarySeed;

    private static native void registerNatives();

    private static synchronized int nextThreadNum() {
        // compiled code
    }

    private static synchronized long nextThreadID() {
        // compiled code
    }

    void blockedOn(Interruptible i) {
        // compiled code
    }

    public static native Thread currentThread();

    public static native void yield();

    public static native void sleep(long l) throws InterruptedException;

    public static void sleep(long l, int i) throws InterruptedException {
        // compiled code
    }

    private void init(ThreadGroup tg, Runnable r, String string, long l) {
        // compiled code
    }

    private void init(ThreadGroup tg, Runnable r, String string, long l, AccessControlContext acc) {
        // compiled code
    }

    protected Object clone() throws CloneNotSupportedException {
        // compiled code
    }

    public Thread() {
        // compiled code
    }

    public Thread(Runnable r) {
        // compiled code
    }

    Thread(Runnable r, AccessControlContext acc) {
        // compiled code
    }

    public Thread(ThreadGroup tg, Runnable r) {
        // compiled code
    }

    public Thread(String string) {
        // compiled code
    }

    public Thread(ThreadGroup tg, String string) {
        // compiled code
    }

    public Thread(Runnable r, String string) {
        // compiled code
    }

    public Thread(ThreadGroup tg, Runnable r, String string) {
        // compiled code
    }

    public Thread(ThreadGroup tg, Runnable r, String string, long l) {
        // compiled code
    }

    public synchronized void start() {
        // compiled code
    }

    private native void start0();

    public void run() {
        // compiled code
    }

    private void exit() {
        // compiled code
    }

    @Deprecated
    public final void stop() {
        // compiled code
    }

    @Deprecated
    public final synchronized void stop(Throwable thrwbl) {
        // compiled code
    }

    public void interrupt() {
        // compiled code
    }

    public static boolean interrupted() {
        // compiled code
    }

    public boolean isInterrupted() {
        // compiled code
    }

    private native boolean isInterrupted(boolean bln);

    @Deprecated
    public void destroy() {
        // compiled code
    }

    public final native boolean isAlive();

    @Deprecated
    public final void suspend() {
        // compiled code
    }

    @Deprecated
    public final void resume() {
        // compiled code
    }

    public final void setPriority(int i) {
        // compiled code
    }

    public final int getPriority() {
        // compiled code
    }

    public final synchronized void setName(String string) {
        // compiled code
    }

    public final String getName() {
        // compiled code
    }

    public final ThreadGroup getThreadGroup() {
        // compiled code
    }

    public static int activeCount() {
        // compiled code
    }

    public static int enumerate(Thread[] threads) {
        // compiled code
    }

    @Deprecated
    public native int countStackFrames();

    public final synchronized void join(long l) throws InterruptedException {
        // compiled code
    }

    public final synchronized void join(long l, int i) throws InterruptedException {
        // compiled code
    }

    public final void join() throws InterruptedException {
        // compiled code
    }

    public static void dumpStack() {
        // compiled code
    }

    public final void setDaemon(boolean bln) {
        // compiled code
    }

    public final boolean isDaemon() {
        // compiled code
    }

    public final void checkAccess() {
        // compiled code
    }

    public String toString() {
        // compiled code
    }

    @CallerSensitive
    public ClassLoader getContextClassLoader() {
        // compiled code
    }

    public void setContextClassLoader(ClassLoader cl) {
        // compiled code
    }

    public static native boolean holdsLock(Object o);

    public StackTraceElement[] getStackTrace() {
        // compiled code
    }

    public static Map<Thread, StackTraceElement[]> getAllStackTraces() {
        // compiled code
    }

    private static boolean isCCLOverridden(Class<?> type) {
        // compiled code
    }

    private static boolean auditSubclass(Class<?> type) {
        // compiled code
    }

    private static native StackTraceElement[][] dumpThreads(Thread[] threads);

    private static native Thread[] getThreads();

    public long getId() {
        // compiled code
    }

    public State getState() {
        // compiled code
    }

    public static void setDefaultUncaughtExceptionHandler(UncaughtExceptionHandler ueh) {
        // compiled code
    }

    public static UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() {
        // compiled code
    }

    public UncaughtExceptionHandler getUncaughtExceptionHandler() {
        // compiled code
    }

    public void setUncaughtExceptionHandler(UncaughtExceptionHandler ueh) {
        // compiled code
    }

    private void dispatchUncaughtException(Throwable thrwbl) {
        // compiled code
    }

    static void processQueue(ReferenceQueue<Class<?>> rq, ConcurrentMap<? extends WeakReference<Class<?>>, ?> cm) {
        // compiled code
    }

    private native void setPriority0(int i);

    private native void stop0(Object o);

    private native void suspend0();

    private native void resume0();

    private native void interrupt0();

    private native void setNativeName(String string);
}
