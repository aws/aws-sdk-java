/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.pojo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

import com.amazonaws.services.simpleworkflow.flow.*;
import com.amazonaws.services.simpleworkflow.flow.core.*;
import com.amazonaws.services.simpleworkflow.flow.generic.*;

@SuppressWarnings("rawtypes")
public class POJOWorkflowDefinition extends WorkflowDefinition {

    private final MethodConverterPair workflowMethod;

    private final Map<String, MethodConverterPair> signals;

    private final MethodConverterPair getStateMethod;

    private final Object workflowImplementationInstance;

    private final DataConverter converter;

    private final DecisionContext context;

    public POJOWorkflowDefinition(Object workflowImplmentationInstance, MethodConverterPair workflowImplementationMethod,
            Map<String, MethodConverterPair> signals, MethodConverterPair getStateMethod, DataConverter converter,
            DecisionContext context)
            throws ClassNotFoundException, SecurityException, NoSuchMethodException, NoSuchFieldException {
        this.workflowImplementationInstance = workflowImplmentationInstance;
        this.workflowMethod = workflowImplementationMethod;
        this.getStateMethod = getStateMethod;
        this.signals = signals;
        this.converter = converter;
        this.context = context;
    }

    @Override
    public Promise<String> execute(final String input) throws WorkflowException {
        final DataConverter c;
        if (workflowMethod.getConverter() == null) {
            c = converter;
        }
        else {
            c = workflowMethod.getConverter();
        }
        final Settable<String> result = new Settable<String>();
        final AtomicReference<Promise> methodResult = new AtomicReference<Promise>();
        new TryCatchFinally() {

            @Override
            protected void doTry() throws Throwable {
                //TODO: Support ability to call workflow using old client 
                // after new parameters were added to @Execute method
                // It requires creation of parameters array of the correct size and
                // populating the new parameter values with default values for each type
                Object[] parameters = c.fromData(input, Object[].class);
                Method method = workflowMethod.getMethod();
                Object r = invokeMethod(method, parameters);
                if (!method.getReturnType().equals(Void.TYPE)) {
                    methodResult.set((Promise) r);
                }
            }

            @Override
            protected void doCatch(Throwable e) throws Throwable {
                if (!(e instanceof CancellationException) || !context.getWorkflowContext().isCancelRequested()) {
                    throwWorkflowException(c, e);
                }
            }

            @Override
            protected void doFinally() throws Throwable {
                Promise r = methodResult.get();
                if (r == null || r.isReady()) {
                    Object workflowResult = r == null ? null : r.get();
                    String convertedResult = c.toData(workflowResult);
                    result.set(convertedResult);
                }
            }
        };
        return result;
    }

    @Override
    public void signalRecieved(String signalName, String details) throws WorkflowException {
        MethodConverterPair signalMethod = signals.get(signalName);
        if (signalMethod != null) {
            DataConverter c = signalMethod.getConverter();
            if (c == null) {
                c = converter;
            }
            Method method = signalMethod.getMethod();
            Object[] parameters = c.fromData(details, Object[].class);
            try {
                invokeMethod(method, parameters);
            }
            catch (Throwable e) {
                throwWorkflowException(c, e);
                throw new IllegalStateException("Unreacheable");
            }
        }
        else {
            // TODO: Unhandled signal
        }
    }

    @Override
    public String getWorkflowState() throws WorkflowException {
        if (getStateMethod == null) {
            return null;
        }
        final DataConverter c;
        if (getStateMethod.getConverter() == null) {
            c = converter;
        }
        else {
            c = getStateMethod.getConverter();
        }
        try {
            Method method = getStateMethod.getMethod();
            Object result = invokeMethod(method, null);
            return c.toData(result);
        }
        catch (Throwable e) {
            throwWorkflowException(c, e);
            throw new IllegalStateException("Unreacheable");
        }
    }

    private Object invokeMethod(final Method method, final Object[] input) throws Throwable {
        try {
            return method.invoke(workflowImplementationInstance, input);
        }
        catch (InvocationTargetException invocationException) {
            if (invocationException.getTargetException() != null) {
                throw invocationException.getTargetException();
            }
            throw invocationException;
        }
    }

    private void throwWorkflowException(DataConverter c, Throwable exception) throws WorkflowException {
        if (exception instanceof WorkflowException) {
            throw (WorkflowException)exception;
        }
        String reason = exception.getMessage();
        String details = null;
        try {
            details = c.toData(exception);
        }
        catch (DataConverterException dataConverterException) {
            if (dataConverterException.getCause() == null) {
                dataConverterException.initCause(exception);
            }
            throw dataConverterException;
        }

        throw new WorkflowException(reason, details);
    }

    public Object getImplementationInstance() {
        return workflowImplementationInstance;
    }

}
