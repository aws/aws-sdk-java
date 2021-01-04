/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowVpcInterface"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveFlowVpcInterfaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The ARN of the flow that is associated with the VPC interface you removed. */
    private String flowArn;
    /** IDs of network interfaces associated with the removed VPC interface that Media Connect was unable to remove. */
    private java.util.List<String> nonDeletedNetworkInterfaceIds;
    /** The name of the VPC interface that was removed. */
    private String vpcInterfaceName;

    /**
     * The ARN of the flow that is associated with the VPC interface you removed.
     * 
     * @param flowArn
     *        The ARN of the flow that is associated with the VPC interface you removed.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The ARN of the flow that is associated with the VPC interface you removed.
     * 
     * @return The ARN of the flow that is associated with the VPC interface you removed.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The ARN of the flow that is associated with the VPC interface you removed.
     * 
     * @param flowArn
     *        The ARN of the flow that is associated with the VPC interface you removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFlowVpcInterfaceResult withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * IDs of network interfaces associated with the removed VPC interface that Media Connect was unable to remove.
     * 
     * @return IDs of network interfaces associated with the removed VPC interface that Media Connect was unable to
     *         remove.
     */

    public java.util.List<String> getNonDeletedNetworkInterfaceIds() {
        return nonDeletedNetworkInterfaceIds;
    }

    /**
     * IDs of network interfaces associated with the removed VPC interface that Media Connect was unable to remove.
     * 
     * @param nonDeletedNetworkInterfaceIds
     *        IDs of network interfaces associated with the removed VPC interface that Media Connect was unable to
     *        remove.
     */

    public void setNonDeletedNetworkInterfaceIds(java.util.Collection<String> nonDeletedNetworkInterfaceIds) {
        if (nonDeletedNetworkInterfaceIds == null) {
            this.nonDeletedNetworkInterfaceIds = null;
            return;
        }

        this.nonDeletedNetworkInterfaceIds = new java.util.ArrayList<String>(nonDeletedNetworkInterfaceIds);
    }

    /**
     * IDs of network interfaces associated with the removed VPC interface that Media Connect was unable to remove.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNonDeletedNetworkInterfaceIds(java.util.Collection)} or
     * {@link #withNonDeletedNetworkInterfaceIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param nonDeletedNetworkInterfaceIds
     *        IDs of network interfaces associated with the removed VPC interface that Media Connect was unable to
     *        remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFlowVpcInterfaceResult withNonDeletedNetworkInterfaceIds(String... nonDeletedNetworkInterfaceIds) {
        if (this.nonDeletedNetworkInterfaceIds == null) {
            setNonDeletedNetworkInterfaceIds(new java.util.ArrayList<String>(nonDeletedNetworkInterfaceIds.length));
        }
        for (String ele : nonDeletedNetworkInterfaceIds) {
            this.nonDeletedNetworkInterfaceIds.add(ele);
        }
        return this;
    }

    /**
     * IDs of network interfaces associated with the removed VPC interface that Media Connect was unable to remove.
     * 
     * @param nonDeletedNetworkInterfaceIds
     *        IDs of network interfaces associated with the removed VPC interface that Media Connect was unable to
     *        remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFlowVpcInterfaceResult withNonDeletedNetworkInterfaceIds(java.util.Collection<String> nonDeletedNetworkInterfaceIds) {
        setNonDeletedNetworkInterfaceIds(nonDeletedNetworkInterfaceIds);
        return this;
    }

    /**
     * The name of the VPC interface that was removed.
     * 
     * @param vpcInterfaceName
     *        The name of the VPC interface that was removed.
     */

    public void setVpcInterfaceName(String vpcInterfaceName) {
        this.vpcInterfaceName = vpcInterfaceName;
    }

    /**
     * The name of the VPC interface that was removed.
     * 
     * @return The name of the VPC interface that was removed.
     */

    public String getVpcInterfaceName() {
        return this.vpcInterfaceName;
    }

    /**
     * The name of the VPC interface that was removed.
     * 
     * @param vpcInterfaceName
     *        The name of the VPC interface that was removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFlowVpcInterfaceResult withVpcInterfaceName(String vpcInterfaceName) {
        setVpcInterfaceName(vpcInterfaceName);
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getNonDeletedNetworkInterfaceIds() != null)
            sb.append("NonDeletedNetworkInterfaceIds: ").append(getNonDeletedNetworkInterfaceIds()).append(",");
        if (getVpcInterfaceName() != null)
            sb.append("VpcInterfaceName: ").append(getVpcInterfaceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveFlowVpcInterfaceResult == false)
            return false;
        RemoveFlowVpcInterfaceResult other = (RemoveFlowVpcInterfaceResult) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getNonDeletedNetworkInterfaceIds() == null ^ this.getNonDeletedNetworkInterfaceIds() == null)
            return false;
        if (other.getNonDeletedNetworkInterfaceIds() != null
                && other.getNonDeletedNetworkInterfaceIds().equals(this.getNonDeletedNetworkInterfaceIds()) == false)
            return false;
        if (other.getVpcInterfaceName() == null ^ this.getVpcInterfaceName() == null)
            return false;
        if (other.getVpcInterfaceName() != null && other.getVpcInterfaceName().equals(this.getVpcInterfaceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getNonDeletedNetworkInterfaceIds() == null) ? 0 : getNonDeletedNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getVpcInterfaceName() == null) ? 0 : getVpcInterfaceName().hashCode());
        return hashCode;
    }

    @Override
    public RemoveFlowVpcInterfaceResult clone() {
        try {
            return (RemoveFlowVpcInterfaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
