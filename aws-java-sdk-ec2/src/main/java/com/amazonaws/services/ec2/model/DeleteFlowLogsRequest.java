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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteFlowLogs(DeleteFlowLogsRequest) DeleteFlowLogs operation}.
 * <p>
 * Deletes one or more flow logs.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteFlowLogs(DeleteFlowLogsRequest)
 */
public class DeleteFlowLogsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * One or more flow log IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> flowLogIds;

    /**
     * One or more flow log IDs.
     *
     * @return One or more flow log IDs.
     */
    public java.util.List<String> getFlowLogIds() {
        if (flowLogIds == null) {
              flowLogIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              flowLogIds.setAutoConstruct(true);
        }
        return flowLogIds;
    }
    
    /**
     * One or more flow log IDs.
     *
     * @param flowLogIds One or more flow log IDs.
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
     * One or more flow log IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFlowLogIds(java.util.Collection)} or {@link
     * #withFlowLogIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param flowLogIds One or more flow log IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteFlowLogsRequest withFlowLogIds(String... flowLogIds) {
        if (getFlowLogIds() == null) setFlowLogIds(new java.util.ArrayList<String>(flowLogIds.length));
        for (String value : flowLogIds) {
            getFlowLogIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more flow log IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param flowLogIds One or more flow log IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteFlowLogsRequest withFlowLogIds(java.util.Collection<String> flowLogIds) {
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
        if (getFlowLogIds() != null) sb.append("FlowLogIds: " + getFlowLogIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFlowLogIds() == null) ? 0 : getFlowLogIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteFlowLogsRequest == false) return false;
        DeleteFlowLogsRequest other = (DeleteFlowLogsRequest)obj;
        
        if (other.getFlowLogIds() == null ^ this.getFlowLogIds() == null) return false;
        if (other.getFlowLogIds() != null && other.getFlowLogIds().equals(this.getFlowLogIds()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteFlowLogsRequest clone() {
        
            return (DeleteFlowLogsRequest) super.clone();
    }

}
    