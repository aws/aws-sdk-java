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
package com.amazonaws.services.simpleworkflow.flow.core;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;

/**
 * Asynchronous equivalent of synchronous try-catch-finally. <h3>Overview</h3>
 * <p>
 * SWF Flow error handling relies on the idea that any asynchronous task (which
 * includes methods annotated as {@link Asynchronous}) is executed in a parent
 * context. In the case of an exception being thrown from a task, all sibling
 * tasks that share the same parent context are canceled. After successful
 * cancellation the exception is propagated to the parent context for handling.
 * </p>
 * <p>
 * <code>TryCatchFinally</code> {@link #doTry()}, {@link #doFinally()} and
 * {@link #doCatch(Throwable)} methods serve as parent scopes for tasks created
 * during their execution.
 * </p>
 * <p>
 * For example if any {@link Task} (or method annotated with
 * {@link Asynchronous}) that originates (possibly indirectly through parent
 * task) in {@link #doTry()} throws an exception all other tasks that originated
 * in {@link #doTry()} are canceled and only then {@link #doCatch(Throwable)} is
 * called. Through this cancellation mechanism it is guaranteed that
 * {@link #doCatch(Throwable)} is called at most once even if there are multiple
 * parallel tasks executing in the {@link #doTry()} scope.
 * </p>
 * <p>
 * If failure happens in a task originated in {@link #doCatch(Throwable)} then
 * all its siblings are canceled first and then {@link #doFinally()} is called.
 * </p>
 * <p>
 * The same happens if task originated in {@link #doFinally()} fails. All it
 * siblings are canceled and then parent scope of the
 * <code>TryCatchFinally</code> is given chance to handle the exception.
 * </p>
 * <h3>Cancellation</h3>
 * <p>
 * The cancellation semantic depends on the task implementation. {@link Task}
 * (or method annotated with {@link Asynchronous}) that has not started
 * execution is never given chance to execute after cancellation. Task which is
 * already executing is not interrupted and completes (or fails).
 * {@link ExternalTask} cancellation depends on the external resource. For
 * example SWF activities and child workflows that are modeled as
 * {@link ExternalTask}s are canceled through SWF API.
 * </p>
 * <p>
 * When <code>TryCatchFinally</code> itself is canceled because of sibling task
 * failure it handles its own cancellation in the following order:
 * </p>
 * <ol>
 * <li>If doTry hasn't started yet then <code>TryCatchFinally</code> is
 * considered canceled immediately.</li>
 * <li>If are any outstanding task that originated in {@link #doTry()} then
 * cancellation of all of them is requested.</li>
 * <li>After all tasks originated in doTry are canceled call
 * {@link #doCatch(Throwable)} with {@link CancellationException}.</li>
 * <li>After all tasks originated in doCatch are completed call
 * {@link #doFinally()}.</li>
 * <li>After all tasks originated in {@link #doFinally()} are completed consider
 * TryCathFinally canceled</li>
 * </ol>
 * <p>
 * {@link #doCatch(Throwable)} and {@link #doFinally()}
 * <em>are not cancelable</em>. It means that cancellation request always waits
 * for completion of all tasks that originate in these methods. Special care
 * should be taken when writing code in {@link #doCatch(Throwable)} and in
 * {@link #doFinally()} to ensure that in all possible failure scenarios they
 * don't end up in a stuck state.
 * </p>
 * <p>
 * <code>TryCatchFinally</code> can be canceled explicitly through
 * {@link #cancel(Throwable)} method. In case of explicit cancellation any
 * exception including {@link CancellationException} that is rethrown from
 * {@link #doCatch(Throwable)} or {@link #doFinally()} is propagated to the
 * parent context.
 * </p>
 * <h3>Daemon Tasks</h3>
 * <p>
 * It is pretty common to have tasks that have their lifecycle linked to some
 * other tasks. For example notification activity that is sent out if some other
 * activity is not completed in a specified period of time. The timer and the
 * notification activity should be canceled as soon as the monitored activity is
 * completed. Such use case can be supported by wrapping timer and notification
 * activity in <code>TryCatchFinally</code> which is explicitly canceled upon
 * monitored activity completion. The more convenient way to perform such
 * cleanup is by marking a Task (or method annotated with {@link Asynchronous})
 * as daemon. The asynchronous scope in absence of failures is executed in the
 * following sequence:
 * <ol>
 * <li>The scope method (for example {@link #doTry()}) is executed.</li>
 * <li>All tasks that are created during its execution are executed (when
 * Promises they are waiting on become ready) possibly creating more tasks.</li>
 * <li>When all <em>non daemon</em> tasks originated in the scope method are
 * completed cancellation requests are sent to all <em>daemon</em> siblings.</li>
 * <li>The scope is completed after all daemon tasks are canceled.
 * </ol>
 * <p>
 * Pass <code>true</code> to the first argument of
 * {@link Task#Task(boolean, Promise...)} constructor to mark a Task as daemon.
 * Use {@link Asynchronous#daemon()} annotation parameter to mark an
 * asynchronous method as daemon. Any task that is created during execution of a
 * daemon task is marked as daemon. <code>TryCatchFinally</code> also can be
 * marked as daemon through {@link #TryCatchFinally(boolean, Promise...)}
 * constructor or by by being created by a daemon task. Note that
 * TryCatchFinally doesn't pass its daemon flag to tasks created in
 * {@link #doTry()}, {@link #doCatch(Throwable)} and {@link #doFinally()}. It is
 * because each of these methods acts as a separate asynchronous scope and the
 * rules of execution described above apply to them.
 * </p>
 * <h3>Miscellaneous</h3>
 * <p>
 * In case of multiple simultaneous exceptions (which is possible for external
 * tasks) or if cancellation of a child results in any exception that is not
 * {@link CancellationException} the last exception "wins". I.e. it becomes the
 * exception delivered to {@link #doCatch(Throwable)} method.
 * </p>
 * <p>
 * Note that instances of {@link Promise} do not participate in error handling
 * the way {@link Future} does. If method that returns Promise throws an
 * exception the Promise state and return value are not changed. It is similar
 * to behavior of variables in case of synchronous code.
 * </p>
 * <h3>Usage Examples</h3>
 * <p>
 * Basic error handling:
 * </p>
 * 
 * <pre>
 * new TryCatchFinally() {
 * 
 *     final List&lt;Promise&lt;String&gt;&gt; instances = new ArrayList&lt;Promise&lt;String&gt;&gt;();
 * 
 *     protected void doTry() throws Throwable {
 *         for (int i = 0; i &lt; count; i++) {
 *             Promise&lt;String&gt; instanceId = ec2.startInstance();
 *             instances.add(instanceId);
 *         }
 *         performSimulation(instances);
 *     }
 * 
 *     protected void doCatch(Throwable e) throws Throwable {
 *         mail.notifySimulationFailure(e);
 *     }
 * 
 *     protected void doFinally() throws Throwable {
 *         for (int i = 0; i &lt; count; i++) {
 *             Promise&lt;String&gt; instanceId = instances.get(i);
 *             if (instanceId.isReady()) {
 *                 ec2.stopInstance(instanceId.get());
 *             }
 *         }
 *     }
 * };
 * </pre>
 * <p>
 * Daemon example:
 * </p>
 * 
 * <pre>
 * 
 * 
 * protected void doTry() throws Throwable {
 *     for (int i = 0; i &lt; count; i++) {
 *         Promise&lt;String&gt; instanceId = ec2.startInstance();
 *         instances.add(instanceId);
 *     }
 *     performSimulation(instances);
 *     notifyOnDelay();
 * }
 * 
 * &#064;Asynchronous(daemon = true)
 * public void notifyOnDelay() {
 *     Promise&lt;Void&gt; timer = clock.scheduleTimer(3600);
 *     mail.notifyDelay(timer);
 * }
 * </pre>
 * 
 * @author fateev
 */
public abstract class TryCatchFinally extends AsyncContextAware implements Cancelable {

    public enum State {
        CREATED,
        TRYING,
        CATCHING,
        FINALIZING,
        CLOSED
    }

    private final TryCatchFinallyContext context;

    public TryCatchFinally() {
        this(null, null, 7, null);
    }

    public TryCatchFinally(Promise<?>... waitFor) {
        this(null, null, 7, waitFor);
    }

    public TryCatchFinally(boolean daemon, Promise<?>... waitFor) {
        this(daemon, null, 7, waitFor);
    }

    public TryCatchFinally(AsyncContextAware parent, boolean daemon, Promise<?>... waitFor) {
        context = new TryCatchFinallyContext(parent.getContext(), this, daemon, null, 5, waitFor);
    }

    public TryCatchFinally(AsyncContextAware parent, Promise<?>... waitFor) {
        context = new TryCatchFinallyContext(parent.getContext(), this, null, null, 5, waitFor);
    }

    protected TryCatchFinally(Boolean daemon, String parentTaskMethodName, int skipStackLines, Promise<?>[] waitFor) {
        context = new TryCatchFinallyContext(this, daemon, parentTaskMethodName, skipStackLines, waitFor);
    }

    protected TryCatchFinally(AsyncContextAware parent, Boolean daemon, String parentTaskMethodName, int skipStackLines,
            Promise<?>[] waitFor) {
        context = new TryCatchFinallyContext(parent.getContext(), this, daemon, parentTaskMethodName, skipStackLines, waitFor);
    }

    public String getName() {
        return context.getName();
    }

    public void setName(String name) {
        context.setName(name);
    }

    @Override
    AsyncParentContext getContext() {
        return context;
    }

    public void cancel(Throwable cause) {
        context.cancel(cause);
    }

    public boolean isCancelRequested() {
        return context.isCancelRequested();
    }

    public StackTraceElement[] getStackTrace() {
        return context.getStackTrace().getStackTrace();
    }

    public List<AsyncTaskInfo> getAsynchronousStackTraceDump() {
        List<AsyncTaskInfo> result = new ArrayList<AsyncTaskInfo>();
        context.getAsynchronousStackTraceDump(result);
        return result;
    }

    public String getAsynchronousStackTraceDumpAsString() {
        return context.getAsynchronousStackTraceDumpAsString();
    }

    public State getState() {
        return context.getState();
    }

    @Override
    public String toString() {
        return context.toString();
    }

    protected void rethrow(final Throwable e, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                throw e;
            }
        };
    }

    protected abstract void doTry() throws Throwable;

    protected abstract void doCatch(Throwable e) throws Throwable;

    protected abstract void doFinally() throws Throwable;

}
