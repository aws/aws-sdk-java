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
package com.amazonaws.services.simpleworkflow.flow.core;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * TODO: Deal with repeating async stack frames due to recursion. 
 * So
 * at a
 * at -- continuation -- (repeated:1)
 * at b
 * at -- continuation -- (repeated:1)
 * at c
 * at -- continuation -- (repeated:1)
 * at d
 * at -- continuation -- (repeated:1)
 * at c
 * at -- continuation -- (repeated:1)
 * at d
 * </pre>
 * Should become something like
 * <pre>
 * at a
 * at -- continuation -- (repeated:1)
 * at b
 * at -- continuation -- (repeated:2)
 *   at c
 *   at -- continuation -- (repeated:1)
 *   at d
 *  </pre>
 */
class AsyncStackTrace {

    private final StackTraceElement[] stackTrace;

    private final AsyncStackTrace parentTrace;

    private String startFrom;
    
    private boolean hideStartFromMethod;

    private final int skip;

    /**
     * When set to true disables the removal of any stack elements.
     * Useful for troubleshooting the broken traces.
     */
    private static final boolean printRawTrace = false;

    public AsyncStackTrace(AsyncStackTrace parentTrace, StackTraceElement[] stackTrace, int skip) {
        super();
        this.parentTrace = parentTrace;
        this.stackTrace = stackTrace;
        this.skip = skip;
    }

    public StackTraceElement[] getStackTrace() {
        if (printRawTrace) {
            return printRawTrace();
        }
        List<StackTraceElement> result = new ArrayList<StackTraceElement>();
        getStackTrace(result);
        return result.toArray(new StackTraceElement[0]);
    }

    private void getStackTrace(List<StackTraceElement> result) {
        for (int i = skip; i < stackTrace.length; i++) {
            StackTraceElement element = stackTrace[i];
            if (i == skip && result.size() > 0) {
                StackTraceElement separator = new StackTraceElement("--- continuation ---", "", "", 0);
                result.add(separator);
            }
            if (startFrom != null && element.getMethodName().contains(startFrom)) {
                if (!hideStartFromMethod) {
                    result.add(element);
                }
                break;
            }
            result.add(element);
        }
        if (parentTrace != null) {
            parentTrace.getStackTrace(result);
        }
    }

    private StackTraceElement[] printRawTrace() {
        if (parentTrace != null) {
            StackTraceElement[] parentStack = parentTrace.getStackTrace();
            int parentLength = parentStack.length;
            if (parentLength > 0) {
                StackTraceElement separator = new StackTraceElement("---continuation---", "", "", 0);
                StackTraceElement[] result = new StackTraceElement[stackTrace.length + parentLength + 1];
                System.arraycopy(stackTrace, 0, result, 0, stackTrace.length);
                result[stackTrace.length] = separator;
                System.arraycopy(parentStack, 0, result, stackTrace.length + 1, parentLength);
                return result;
            }
        }
        return stackTrace;
    }

    public void setStartFrom(String startFrom) {
        this.startFrom = startFrom;
    }

    public void setHideStartFromMethod(boolean hideStartFromMethod) {
        this.hideStartFromMethod = hideStartFromMethod;
    }

    public String toString() {
        return stackTraceToString(getStackTrace());
    }

    private String stackTraceToString(StackTraceElement[] trace) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < trace.length; i++) {
            if (i > 0) {
                result.append("\n\tat ");
            }
            else {
                result.append("\tat ");
            }
            result.append(trace[i]);
        }
        return result.toString();
    }


}
