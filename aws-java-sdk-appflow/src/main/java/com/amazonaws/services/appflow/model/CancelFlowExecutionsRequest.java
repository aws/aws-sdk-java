/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CancelFlowExecutions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelFlowExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a flow with active runs that you want to cancel.
     * </p>
     */
    private String flowName;
    /**
     * <p>
     * The ID of each active run to cancel. These runs must belong to the flow you specify in your request.
     * </p>
     * <p>
     * If you omit this parameter, your request ends all active runs that belong to the flow.
     * </p>
     */
    private java.util.List<String> executionIds;

    /**
     * <p>
     * The name of a flow with active runs that you want to cancel.
     * </p>
     * 
     * @param flowName
     *        The name of a flow with active runs that you want to cancel.
     */

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    /**
     * <p>
     * The name of a flow with active runs that you want to cancel.
     * </p>
     * 
     * @return The name of a flow with active runs that you want to cancel.
     */

    public String getFlowName() {
        return this.flowName;
    }

    /**
     * <p>
     * The name of a flow with active runs that you want to cancel.
     * </p>
     * 
     * @param flowName
     *        The name of a flow with active runs that you want to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelFlowExecutionsRequest withFlowName(String flowName) {
        setFlowName(flowName);
        return this;
    }

    /**
     * <p>
     * The ID of each active run to cancel. These runs must belong to the flow you specify in your request.
     * </p>
     * <p>
     * If you omit this parameter, your request ends all active runs that belong to the flow.
     * </p>
     * 
     * @return The ID of each active run to cancel. These runs must belong to the flow you specify in your request.</p>
     *         <p>
     *         If you omit this parameter, your request ends all active runs that belong to the flow.
     */

    public java.util.List<String> getExecutionIds() {
        return executionIds;
    }

    /**
     * <p>
     * The ID of each active run to cancel. These runs must belong to the flow you specify in your request.
     * </p>
     * <p>
     * If you omit this parameter, your request ends all active runs that belong to the flow.
     * </p>
     * 
     * @param executionIds
     *        The ID of each active run to cancel. These runs must belong to the flow you specify in your request.</p>
     *        <p>
     *        If you omit this parameter, your request ends all active runs that belong to the flow.
     */

    public void setExecutionIds(java.util.Collection<String> executionIds) {
        if (executionIds == null) {
            this.executionIds = null;
            return;
        }

        this.executionIds = new java.util.ArrayList<String>(executionIds);
    }

    /**
     * <p>
     * The ID of each active run to cancel. These runs must belong to the flow you specify in your request.
     * </p>
     * <p>
     * If you omit this parameter, your request ends all active runs that belong to the flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExecutionIds(java.util.Collection)} or {@link #withExecutionIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param executionIds
     *        The ID of each active run to cancel. These runs must belong to the flow you specify in your request.</p>
     *        <p>
     *        If you omit this parameter, your request ends all active runs that belong to the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelFlowExecutionsRequest withExecutionIds(String... executionIds) {
        if (this.executionIds == null) {
            setExecutionIds(new java.util.ArrayList<String>(executionIds.length));
        }
        for (String ele : executionIds) {
            this.executionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of each active run to cancel. These runs must belong to the flow you specify in your request.
     * </p>
     * <p>
     * If you omit this parameter, your request ends all active runs that belong to the flow.
     * </p>
     * 
     * @param executionIds
     *        The ID of each active run to cancel. These runs must belong to the flow you specify in your request.</p>
     *        <p>
     *        If you omit this parameter, your request ends all active runs that belong to the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelFlowExecutionsRequest withExecutionIds(java.util.Collection<String> executionIds) {
        setExecutionIds(executionIds);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFlowName() != null)
            sb.append("FlowName: ").append(getFlowName()).append(",");
        if (getExecutionIds() != null)
            sb.append("ExecutionIds: ").append(getExecutionIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelFlowExecutionsRequest == false)
            return false;
        CancelFlowExecutionsRequest other = (CancelFlowExecutionsRequest) obj;
        if (other.getFlowName() == null ^ this.getFlowName() == null)
            return false;
        if (other.getFlowName() != null && other.getFlowName().equals(this.getFlowName()) == false)
            return false;
        if (other.getExecutionIds() == null ^ this.getExecutionIds() == null)
            return false;
        if (other.getExecutionIds() != null && other.getExecutionIds().equals(this.getExecutionIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowName() == null) ? 0 : getFlowName().hashCode());
        hashCode = prime * hashCode + ((getExecutionIds() == null) ? 0 : getExecutionIds().hashCode());
        return hashCode;
    }

    @Override
    public CancelFlowExecutionsRequest clone() {
        return (CancelFlowExecutionsRequest) super.clone();
    }

}
