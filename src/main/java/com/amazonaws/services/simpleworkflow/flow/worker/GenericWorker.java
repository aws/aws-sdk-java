/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.worker;

import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.management.ManagementFactory;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.WorkerBase;
import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;
import com.amazonaws.services.simpleworkflow.model.DomainAlreadyExistsException;
import com.amazonaws.services.simpleworkflow.model.RegisterDomainRequest;

public abstract class GenericWorker implements WorkerBase {

    class ExecutorThreadFactory implements ThreadFactory {

        private AtomicInteger threadIndex = new AtomicInteger();

        private final String threadPrefix;

        public ExecutorThreadFactory(String threadPrefix) {
            this.threadPrefix = threadPrefix;
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread result = new Thread(r);
            result.setName(threadPrefix + (threadIndex.incrementAndGet()));
            result.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            return result;
        }
    }

    private class PollServiceTask implements Runnable {

        private final TaskPoller poller;

        PollServiceTask(TaskPoller poller) {
            this.poller = poller;
        }

        @Override
        public void run() {
            try {
                if (log.isDebugEnabled()) {
                    log.debug("poll task begin");
                }

                if (pollExecutor.isTerminating()) {
                    return;
                }
                pollBackoffThrottler.throttle();
                if (pollExecutor.isTerminating()) {
                    return;
                }
                if (pollRateThrottler != null) {
                    pollRateThrottler.throttle();
                }

                CountDownLatch suspender = GenericWorker.this.suspendLatch.get();
                if (suspender != null) {
                    if (log.isDebugEnabled()) {
                        log.debug("poll task suspending latchCount=" + suspender.getCount());
                    }
                    suspender.await();
                }

                if (pollExecutor.isTerminating()) {
                    return;
                }
                poller.pollAndProcessSingleTask();
                pollBackoffThrottler.success();
            }
            catch (Throwable e) {
                pollBackoffThrottler.failure();
                if (!(e.getCause() instanceof InterruptedException)) {
                    uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), e);
                }
            }
            finally {
                // Resubmit itself back to pollExecutor
                if (!pollExecutor.isShutdown()) {
                    pollExecutor.execute(this);
                }
            }
        }
    }

    private static final Log log = LogFactory.getLog(GenericWorker.class);

    protected static final int MAX_IDENTITY_LENGTH = 256;

    protected AmazonSimpleWorkflow service;

    protected String domain;

    protected boolean registerDomain;

    protected long domainRetentionPeriodInDays = FlowConstants.NONE;

    private String taskListToPoll;

    private int maximumPollRateIntervalMilliseconds = 1000;

    private double maximumPollRatePerSecond;

    private double pollBackoffCoefficient = 2;

    private long pollBackoffInitialInterval = 100;

    private long pollBackoffMaximumInterval = 60000;

    private boolean disableServiceShutdownOnStop;

    private ThreadPoolExecutor pollExecutor;

    private String identity = ManagementFactory.getRuntimeMXBean().getName();

    protected final AtomicReference<CountDownLatch> suspendLatch = new AtomicReference<CountDownLatch>();

    private int pollThreadCount = 1;

    private BackoffThrottler pollBackoffThrottler;

    private Throttler pollRateThrottler;

    protected UncaughtExceptionHandler uncaughtExceptionHandler = new UncaughtExceptionHandler() {

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            log.error("Failure in thread " + t.getName(), e);
        }
    };

    private TaskPoller poller;

    public GenericWorker(AmazonSimpleWorkflow service, String domain, String taskListToPoll) {
        this.service = service;
        this.domain = domain;
        this.taskListToPoll = taskListToPoll;
    }

    public GenericWorker() {
        identity = ManagementFactory.getRuntimeMXBean().getName();
        int length = Math.min(identity.length(), GenericWorker.MAX_IDENTITY_LENGTH);
        identity = identity.substring(0, length);
    }

    @Override
    public AmazonSimpleWorkflow getService() {
        return service;
    }

    public void setService(AmazonSimpleWorkflow service) {
        this.service = service;
    }

    @Override
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public boolean isRegisterDomain() {
        return registerDomain;
    }

    /**
     * Should domain be registered on startup. Default is <code>false</code>.
     * When enabled {@link #setDomainRetentionPeriodInDays(Long)} property is
     * required.
     */
    @Override
    public void setRegisterDomain(boolean registerDomain) {
        this.registerDomain = registerDomain;
    }

    @Override
    public long getDomainRetentionPeriodInDays() {
        return domainRetentionPeriodInDays;
    }

    @Override
    public void setDomainRetentionPeriodInDays(long domainRetentionPeriodInDays) {
        this.domainRetentionPeriodInDays = domainRetentionPeriodInDays;
    }

    @Override
    public String getTaskListToPoll() {
        return taskListToPoll;
    }

    public void setTaskListToPoll(String taskListToPoll) {
        this.taskListToPoll = taskListToPoll;
    }

    @Override
    public double getMaximumPollRatePerSecond() {
        return maximumPollRatePerSecond;
    }

    @Override
    public void setMaximumPollRatePerSecond(double maximumPollRatePerSecond) {
        this.maximumPollRatePerSecond = maximumPollRatePerSecond;
    }

    @Override
    public int getMaximumPollRateIntervalMilliseconds() {
        return maximumPollRateIntervalMilliseconds;
    }

    @Override
    public void setMaximumPollRateIntervalMilliseconds(int maximumPollRateIntervalMilliseconds) {
        this.maximumPollRateIntervalMilliseconds = maximumPollRateIntervalMilliseconds;
    }

    @Override
    public UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return uncaughtExceptionHandler;
    }

    @Override
    public void setUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    @Override
    public String getIdentity() {
        return identity;
    }

    @Override
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public long getPollBackoffInitialInterval() {
        return pollBackoffInitialInterval;
    }

    @Override
    public void setPollBackoffInitialInterval(long backoffInitialInterval) {
        if (backoffInitialInterval < 0) {
            throw new IllegalArgumentException("expected value should be positive or 0: " + backoffInitialInterval);
        }
        this.pollBackoffInitialInterval = backoffInitialInterval;
    }

    @Override
    public long getPollBackoffMaximumInterval() {
        return pollBackoffMaximumInterval;
    }

    @Override
    public void setPollBackoffMaximumInterval(long backoffMaximumInterval) {
        if (backoffMaximumInterval <= 0) {
            throw new IllegalArgumentException("expected value should be positive: " + backoffMaximumInterval);
        }
        this.pollBackoffMaximumInterval = backoffMaximumInterval;
    }

    /**
     * @see #setDisableServiceShutdownOnStop(boolean)
     */
    @Override
    public boolean isDisableServiceShutdownOnStop() {
        return disableServiceShutdownOnStop;
    }

    /**
     * By default when @{link {@link #shutdown()} or @{link
     * {@link #shutdownNow()} is called the worker calls
     * {@link AmazonSimpleWorkflow#shutdown()} on the service instance it is
     * configured with before shutting down internal thread pools. Otherwise
     * threads that are waiting on a poll request might block shutdown for the
     * duration of a poll. This flag allows disabling this behavior.
     * 
     * @param disableServiceShutdownOnStop
     *            <code>true</code> means do not call
     *            {@link AmazonSimpleWorkflow#shutdown()}
     */
    @Override
    public void setDisableServiceShutdownOnStop(boolean disableServiceShutdownOnStop) {
        this.disableServiceShutdownOnStop = disableServiceShutdownOnStop;
    }

    @Override
    public double getPollBackoffCoefficient() {
        return pollBackoffCoefficient;
    }

    @Override
    public void setPollBackoffCoefficient(double backoffCoefficient) {
        if (backoffCoefficient < 1.0) {
            throw new IllegalArgumentException("expected value should be bigger or equal to 1.0: " + backoffCoefficient);
        }
        this.pollBackoffCoefficient = backoffCoefficient;
    }

    @Override
    public int getPollThreadCount() {
        return pollThreadCount;
    }

    @Override
    public void setPollThreadCount(int threadCount) {
        checkStarted();
        this.pollThreadCount = threadCount;
    }

    @Override
    public void start() {
        if (log.isInfoEnabled()) {
            log.info("start: " + toString());
        }
        checkStarted();
        checkRequiredProperty(service, "service");
        checkRequiredProperty(domain, "domain");
        checkRequiredProperty(taskListToPoll, "taskListToPoll");
        checkRequredProperties();

        if (registerDomain) {
            registerDomain();
        }

        registerTypesToPoll();

        if (maximumPollRatePerSecond > 0.0) {
            pollRateThrottler = new Throttler("pollRateThrottler " + taskListToPoll, maximumPollRatePerSecond,
                    maximumPollRateIntervalMilliseconds);
        }

        pollExecutor = new ThreadPoolExecutor(pollThreadCount, pollThreadCount, 1, TimeUnit.MINUTES,
                new LinkedBlockingQueue<Runnable>(pollThreadCount));
        ExecutorThreadFactory pollExecutorThreadFactory = getExecutorThreadFactory();
        pollExecutor.setThreadFactory(pollExecutorThreadFactory);

        pollBackoffThrottler = new BackoffThrottler(pollBackoffInitialInterval, pollBackoffMaximumInterval,
                pollBackoffCoefficient);
        poller = createPoller();
        for (int i = 0; i < pollThreadCount; i++) {
            pollExecutor.execute(new PollServiceTask(poller));
        }
    }

    private ExecutorThreadFactory getExecutorThreadFactory() {
        ExecutorThreadFactory pollExecutorThreadFactory = new ExecutorThreadFactory(getPollThreadNamePrefix());
        return pollExecutorThreadFactory;
    }

    protected abstract String getPollThreadNamePrefix();

    protected abstract TaskPoller createPoller();

    protected abstract void checkRequredProperties();

    private void registerDomain() {
        if (domainRetentionPeriodInDays == FlowConstants.NONE) {
            throw new IllegalStateException("required property domainRetentionPeriodInSeconds is not set");
        }
        try {
            service.registerDomain(new RegisterDomainRequest().withName(domain).withWorkflowExecutionRetentionPeriodInDays(
                    String.valueOf(domainRetentionPeriodInDays)));
        }
        catch (DomainAlreadyExistsException e) {
            if (log.isTraceEnabled()) {
                log.trace("Domain is already registered: " + domain);
            }
        }
    }

    protected void checkRequiredProperty(Object value, String name) {
        if (value == null) {
            throw new IllegalStateException("required property " + name + " is not set");
        }
    }

    protected void checkStarted() {
        if (isStarted()) {
            throw new IllegalStateException("started");
        }
    }

    private boolean isStarted() {
        return pollExecutor != null;
    }

    @Override
    public void shutdown() {
        if (log.isInfoEnabled()) {
            log.info("shutdown");
        }
        if (!isStarted()) {
            return;
        }
        if (!disableServiceShutdownOnStop) {
            service.shutdown();
        }
        pollExecutor.shutdown();
        poller.shutdown();
    }

    @Override
    public void shutdownNow() {
        if (log.isInfoEnabled()) {
            log.info("shutdownNow");
        }
        if (!isStarted()) {
            return;
        }
        if (!disableServiceShutdownOnStop) {
            service.shutdown();
        }
        pollExecutor.shutdownNow();
        poller.shutdownNow();
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        long start = System.currentTimeMillis();
        boolean terminated = pollExecutor.awaitTermination(timeout, unit);
        long elapsed = System.currentTimeMillis() - start;
        long left = TimeUnit.MILLISECONDS.convert(timeout, unit) - elapsed;
        return poller.awaitTermination(left, TimeUnit.MILLISECONDS) && terminated;
    }

    @Override
    public boolean shutdownAndAwaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        if (!isStarted()) {
            return true;
        }
        long start = System.currentTimeMillis();
        if (!disableServiceShutdownOnStop) {
            service.shutdown();
        }
        pollExecutor.shutdownNow();
        try {
            pollExecutor.awaitTermination(timeout, unit);
        }
        finally {
            poller.shutdown();
        }
        long elapsed = System.currentTimeMillis() - start;
        long left = TimeUnit.MILLISECONDS.convert(timeout, unit) - elapsed;
        return awaitTermination(left, TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[service=" + service + ", domain=" + domain + ", taskListToPoll="
                + taskListToPoll + ", identity=" + identity + ", backoffInitialInterval=" + pollBackoffInitialInterval
                + ", backoffMaximumInterval=" + pollBackoffMaximumInterval + ", backoffCoefficient=" + pollBackoffCoefficient
                + "]";
    }

    @Override
    public boolean isRunning() {
        return isStarted() && !pollExecutor.isTerminated();
    }

    @Override
    public void suspendPolling() {
        if (log.isInfoEnabled()) {
            log.info("suspendPolling");
        }
        suspendLatch.set(new CountDownLatch(1));
    }

    @Override
    public void resumePolling() {
        if (log.isInfoEnabled()) {
            log.info("resumePolling");
        }
        CountDownLatch existing = suspendLatch.getAndSet(null);
        if (existing != null) {
            existing.countDown();
        }
    }

}
