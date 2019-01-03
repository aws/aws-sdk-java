/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFlowLogsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The IDs of the flow logs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> flowLogIds;
    /**
     * <p>
     * Information about the flow logs that could not be created successfully.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UnsuccessfulItem> unsuccessful;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsResult withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The IDs of the flow logs.
     * </p>
     * 
     * @return The IDs of the flow logs.
     */

    public java.util.List<String> getFlowLogIds() {
        if (flowLogIds == null) {
            flowLogIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return flowLogIds;
    }

    /**
     * <p>
     * The IDs of the flow logs.
     * </p>
     * 
     * @param flowLogIds
     *        The IDs of the flow logs.
     */

    public void setFlowLogIds(java.util.Collection<String> flowLogIds) {
        if (flowLogIds == null) {
            this.flowLogIds = null;
            return;
        }

        this.flowLogIds = new com.amazonaws.internal.SdkInternalList<String>(flowLogIds);
    }

    /**
     * <p>
     * The IDs of the flow logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlowLogIds(java.util.Collection)} or {@link #withFlowLogIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param flowLogIds
     *        The IDs of the flow logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsResult withFlowLogIds(String... flowLogIds) {
        if (this.flowLogIds == null) {
            setFlowLogIds(new com.amazonaws.internal.SdkInternalList<String>(flowLogIds.length));
        }
        for (String ele : flowLogIds) {
            this.flowLogIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the flow logs.
     * </p>
     * 
     * @param flowLogIds
     *        The IDs of the flow logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsResult withFlowLogIds(java.util.Collection<String> flowLogIds) {
        setFlowLogIds(flowLogIds);
        return this;
    }

    /**
     * <p>
     * Information about the flow logs that could not be created successfully.
     * </p>
     * 
     * @return Information about the flow logs that could not be created successfully.
     */

    public java.util.List<UnsuccessfulItem> getUnsuccessful() {
        if (unsuccessful == null) {
            unsuccessful = new com.amazonaws.internal.SdkInternalList<UnsuccessfulItem>();
        }
        return unsuccessful;
    }

    /**
     * <p>
     * Information about the flow logs that could not be created successfully.
     * </p>
     * 
     * @param unsuccessful
     *        Information about the flow logs that could not be created successfully.
     */

    public void setUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }

        this.unsuccessful = new com.amazonaws.internal.SdkInternalList<UnsuccessfulItem>(unsuccessful);
    }

    /**
     * <p>
     * Information about the flow logs that could not be created successfully.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnsuccessful(java.util.Collection)} or {@link #withUnsuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param unsuccessful
     *        Information about the flow logs that could not be created successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsResult withUnsuccessful(UnsuccessfulItem... unsuccessful) {
        if (this.unsuccessful == null) {
            setUnsuccessful(new com.amazonaws.internal.SdkInternalList<UnsuccessfulItem>(unsuccessful.length));
        }
        for (UnsuccessfulItem ele : unsuccessful) {
            this.unsuccessful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the flow logs that could not be created successfully.
     * </p>
     * 
     * @param unsuccessful
     *        Information about the flow logs that could not be created successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowLogsResult withUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        setUnsuccessful(unsuccessful);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFlowLogIds() != null)
            sb.append("FlowLogIds: ").append(getFlowLogIds()).append(",");
        if (getUnsuccessful() != null)
            sb.append("Unsuccessful: ").append(getUnsuccessful());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFlowLogsResult == false)
            return false;
        CreateFlowLogsResult other = (CreateFlowLogsResult) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFlowLogIds() == null ^ this.getFlowLogIds() == null)
            return false;
        if (other.getFlowLogIds() != null && other.getFlowLogIds().equals(this.getFlowLogIds()) == false)
            return false;
        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null)
            return false;
        if (other.getUnsuccessful() != null && other.getUnsuccessful().equals(this.getUnsuccessful()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFlowLogIds() == null) ? 0 : getFlowLogIds().hashCode());
        hashCode = prime * hashCode + ((getUnsuccessful() == null) ? 0 : getUnsuccessful().hashCode());
        return hashCode;
    }

    @Override
    public CreateFlowLogsResult clone() {
        try {
            return (CreateFlowLogsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
