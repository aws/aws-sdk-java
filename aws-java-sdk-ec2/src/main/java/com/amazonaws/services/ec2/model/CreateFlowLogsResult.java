/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class CreateFlowLogsResult implements Serializable, Cloneable {

    /**
     * The IDs of the flow logs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> flowLogIds;

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request.
     */
    private String clientToken;

    /**
     * Information about the flow logs that could not be created
     * successfully.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem> unsuccessful;

    /**
     * The IDs of the flow logs.
     *
     * @return The IDs of the flow logs.
     */
    public java.util.List<String> getFlowLogIds() {
        if (flowLogIds == null) {
              flowLogIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              flowLogIds.setAutoConstruct(true);
        }
        return flowLogIds;
    }
    
    /**
     * The IDs of the flow logs.
     *
     * @param flowLogIds The IDs of the flow logs.
     */
    public void setFlowLogIds(java.util.Collection<String> flowLogIds) {
        if (flowLogIds == null) {
            this.flowLogIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> flowLogIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(flowLogIds.size());
        flowLogIdsCopy.addAll(flowLogIds);
        this.flowLogIds = flowLogIdsCopy;
    }
    
    /**
     * The IDs of the flow logs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFlowLogIds(java.util.Collection)} or {@link
     * #withFlowLogIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param flowLogIds The IDs of the flow logs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFlowLogsResult withFlowLogIds(String... flowLogIds) {
        if (getFlowLogIds() == null) setFlowLogIds(new java.util.ArrayList<String>(flowLogIds.length));
        for (String value : flowLogIds) {
            getFlowLogIds().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the flow logs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param flowLogIds The IDs of the flow logs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFlowLogsResult withFlowLogIds(java.util.Collection<String> flowLogIds) {
        if (flowLogIds == null) {
            this.flowLogIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> flowLogIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(flowLogIds.size());
            flowLogIdsCopy.addAll(flowLogIds);
            this.flowLogIds = flowLogIdsCopy;
        }

        return this;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request.
     *
     * @return Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFlowLogsResult withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * Information about the flow logs that could not be created
     * successfully.
     *
     * @return Information about the flow logs that could not be created
     *         successfully.
     */
    public java.util.List<UnsuccessfulItem> getUnsuccessful() {
        if (unsuccessful == null) {
              unsuccessful = new com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem>();
              unsuccessful.setAutoConstruct(true);
        }
        return unsuccessful;
    }
    
    /**
     * Information about the flow logs that could not be created
     * successfully.
     *
     * @param unsuccessful Information about the flow logs that could not be created
     *         successfully.
     */
    public void setUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem> unsuccessfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem>(unsuccessful.size());
        unsuccessfulCopy.addAll(unsuccessful);
        this.unsuccessful = unsuccessfulCopy;
    }
    
    /**
     * Information about the flow logs that could not be created
     * successfully.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUnsuccessful(java.util.Collection)} or {@link
     * #withUnsuccessful(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param unsuccessful Information about the flow logs that could not be created
     *         successfully.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFlowLogsResult withUnsuccessful(UnsuccessfulItem... unsuccessful) {
        if (getUnsuccessful() == null) setUnsuccessful(new java.util.ArrayList<UnsuccessfulItem>(unsuccessful.length));
        for (UnsuccessfulItem value : unsuccessful) {
            getUnsuccessful().add(value);
        }
        return this;
    }
    
    /**
     * Information about the flow logs that could not be created
     * successfully.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param unsuccessful Information about the flow logs that could not be created
     *         successfully.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFlowLogsResult withUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem> unsuccessfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem>(unsuccessful.size());
            unsuccessfulCopy.addAll(unsuccessful);
            this.unsuccessful = unsuccessfulCopy;
        }

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
        if (getFlowLogIds() != null) sb.append("FlowLogIds: " + getFlowLogIds() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getUnsuccessful() != null) sb.append("Unsuccessful: " + getUnsuccessful() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFlowLogIds() == null) ? 0 : getFlowLogIds().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        hashCode = prime * hashCode + ((getUnsuccessful() == null) ? 0 : getUnsuccessful().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateFlowLogsResult == false) return false;
        CreateFlowLogsResult other = (CreateFlowLogsResult)obj;
        
        if (other.getFlowLogIds() == null ^ this.getFlowLogIds() == null) return false;
        if (other.getFlowLogIds() != null && other.getFlowLogIds().equals(this.getFlowLogIds()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null) return false;
        if (other.getUnsuccessful() != null && other.getUnsuccessful().equals(this.getUnsuccessful()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateFlowLogsResult clone() {
        try {
            return (CreateFlowLogsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    