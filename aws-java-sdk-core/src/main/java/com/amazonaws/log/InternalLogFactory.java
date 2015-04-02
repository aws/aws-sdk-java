package com.amazonaws.log;

import com.amazonaws.annotation.ThreadSafe;

/**
 * Can be used to configure the default log factory for the AWSJavaClientCore
 * and AWSJavaClientSigners. Default to JUL, unless AWSJavaClientRuntime is
 * present which will default it to Jakarta Commons Logging.
 */
@ThreadSafe
public abstract class InternalLogFactory {
    private static volatile InternalLogFactory factory = new JulLogFactory();
    /** True if the log factory has been explicitly configured; false otherwise. */
    private static volatile boolean factoryConfigured;

    /**
     * Returns an SDK logger that logs using the currently configured default
     * log factory, given the class.
     */
    public static InternalLogApi getLog(Class<?> clazz) {
        return factoryConfigured
             ? factory.doGetLog(clazz)
             : new InternalLog(clazz.getName()); // will look up actual logger per log
    }

    /**
     * Returns an SDK logger that logs using the currently configured default
     * log factory, given the name.
     */
    public static InternalLogApi getLog(String name) {
        return factoryConfigured
             ? factory.doGetLog(name)
             : new InternalLog(name); // will look up actual logger per log
    }

    /**
     * SPI to return a logger given a class.
     */
    protected abstract InternalLogApi doGetLog(Class<?> clazz);

    /**
     * SPI to return a logger given a name.
     */
    protected abstract InternalLogApi doGetLog(String name);

    /**
     * Returns the current default log factory.
     */
    public static InternalLogFactory getFactory() {
        return factory;
    }

    /**
     * Used to explicitly configure the log factory. The log factory can only be
     * configured at most once. All subsequent configurations will have no
     * effect.
     * 
     * Note explicitly configuring the log factory will have positive
     * performance impact on all subsequent logging, since the specific logger
     * can be directly referenced instead of being searched every time.
     * 
     * @param factory
     *            the log factory to be used internally by the SDK
     *
     * @return true if the log factory is successfully configured; false
     *         otherwise (ie the log factory is not allowed to be configured
     *         more than once for performance reasons.)
     */
    public synchronized static boolean configureFactory(
            InternalLogFactory factory) {
        if (factory == null)
            throw new IllegalArgumentException();
        if (factoryConfigured)
            return false;
        InternalLogFactory.factory = factory;
        factoryConfigured = true;
        return true;
    }
}
