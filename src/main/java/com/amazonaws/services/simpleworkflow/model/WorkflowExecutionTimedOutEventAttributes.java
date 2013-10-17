/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * Provides details of the <code>WorkflowExecutionTimedOut</code> event.
 * </p>
 */
public class WorkflowExecutionTimedOutEventAttributes implements Serializable {

    /**
     * The type of timeout that caused this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START_TO_CLOSE
     */
    private String timeoutType;

    /**
     * The policy used for the child workflow executions of this workflow
     * execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     */
    private String childPolicy;

    /**
     * The type of timeout that caused this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START_TO_CLOSE
     *
     * @return The type of timeout that caused this event.
     *
     * @see WorkflowExecutionTimeoutType
     */
    public String getTimeoutType() {
        return timeoutType;
    }
    
    /**
     * The type of timeout that caused this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START_TO_CLOSE
     *
     * @param timeoutType The type of timeout that caused this event.
     *
     * @see WorkflowExecutionTimeoutType
     */
    public void setTimeoutType(String timeoutType) {
        this.timeoutType = timeoutType;
    }
    
    /**
     * The type of timeout that caused this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START_TO_CLOSE
     *
     * @param timeoutType The type of timeout that caused this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see WorkflowExecutionTimeoutType
     */
    public WorkflowExecutionTimedOutEventAttributes withTimeoutType(String timeoutType) {
        this.timeoutType = timeoutType;
        return this;
    }

    /**
     * The type of timeout that caused this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START_TO_CLOSE
     *
     * @param timeoutType The type of timeout that caused this event.
     *
     * @see WorkflowExecutionTimeoutType
     */
    public void setTimeoutType(WorkflowExecutionTimeoutType timeoutType) {
        this.timeoutType = timeoutType.toString();
    }
    
    /**
     * The type of timeout that caused this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START_TO_CLOSE
     *
     * @param timeoutType The type of timeout that caused this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see WorkflowExecutionTimeoutType
     */
    public WorkflowExecutionTimedOutEventAttributes withTimeoutType(WorkflowExecutionTimeoutType timeoutType) {
        this.timeoutType = timeoutType.toString();
        return this;
    }

    /**
     * The policy used for the child workflow executions of this workflow
     * execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @return The policy used for the child workflow executions of this workflow
     *         execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public String getChildPolicy() {
        return childPolicy;
    }
    
    /**
     * The policy used for the child workflow executions of this workflow
     * execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy used for the child workflow executions of this workflow
     *         execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }
    
    /**
     * The policy used for the child workflow executions of this workflow
     * execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy used for the child workflow executions of this workflow
     *         execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public WorkflowExecutionTimedOutEventAttributes withChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
        return this;
    }

    /**
     * The policy used for the child workflow executions of this workflow
     * execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy used for the child workflow executions of this workflow
     *         execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
    }
    
    /**
     * The policy used for the child workflow executions of this workflow
     * execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy used for the child workflow executions of this workflow
     *         execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public WorkflowExecutionTimedOutEventAttributes withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimeoutType() != null) sb.append("TimeoutType: " + getTimeoutType() + ",");
        if (getChildPolicy() != null) sb.append("ChildPolicy: " + getChildPolicy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTimeoutType() == null) ? 0 : getTimeoutType().hashCode()); 
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowExecutionTimedOutEventAttributes == false) return false;
        WorkflowExecutionTimedOutEventAttributes other = (WorkflowExecutionTimedOutEventAttributes)obj;
        
        if (other.getTimeoutType() == null ^ this.getTimeoutType() == null) return false;
        if (other.getTimeoutType() != null && other.getTimeoutType().equals(this.getTimeoutType()) == false) return false; 
        if (other.getChildPolicy() == null ^ this.getChildPolicy() == null) return false;
        if (other.getChildPolicy() != null && other.getChildPolicy().equals(this.getChildPolicy()) == false) return false; 
        return true;
    }
    
}
    