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

/**
 * <p>
 * Describes the attachment of a VPC to an internet gateway or an egress-only internet gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InternetGatewayAttachment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternetGatewayAttachment implements Serializable, Cloneable {

    /**
     * <p>
     * The current state of the attachment. For an internet gateway, the state is <code>available</code> when attached
     * to a VPC; otherwise, this value is not returned.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The current state of the attachment. For an internet gateway, the state is <code>available</code> when attached
     * to a VPC; otherwise, this value is not returned.
     * </p>
     * 
     * @param state
     *        The current state of the attachment. For an internet gateway, the state is <code>available</code> when
     *        attached to a VPC; otherwise, this value is not returned.
     * @see AttachmentStatus
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the attachment. For an internet gateway, the state is <code>available</code> when attached
     * to a VPC; otherwise, this value is not returned.
     * </p>
     * 
     * @return The current state of the attachment. For an internet gateway, the state is <code>available</code> when
     *         attached to a VPC; otherwise, this value is not returned.
     * @see AttachmentStatus
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the attachment. For an internet gateway, the state is <code>available</code> when attached
     * to a VPC; otherwise, this value is not returned.
     * </p>
     * 
     * @param state
     *        The current state of the attachment. For an internet gateway, the state is <code>available</code> when
     *        attached to a VPC; otherwise, this value is not returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentStatus
     */

    public InternetGatewayAttachment withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the attachment. For an internet gateway, the state is <code>available</code> when attached
     * to a VPC; otherwise, this value is not returned.
     * </p>
     * 
     * @param state
     *        The current state of the attachment. For an internet gateway, the state is <code>available</code> when
     *        attached to a VPC; otherwise, this value is not returned.
     * @see AttachmentStatus
     */

    public void setState(AttachmentStatus state) {
        withState(state);
    }

    /**
     * <p>
     * The current state of the attachment. For an internet gateway, the state is <code>available</code> when attached
     * to a VPC; otherwise, this value is not returned.
     * </p>
     * 
     * @param state
     *        The current state of the attachment. For an internet gateway, the state is <code>available</code> when
     *        attached to a VPC; otherwise, this value is not returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentStatus
     */

    public InternetGatewayAttachment withState(AttachmentStatus state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetGatewayAttachment withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InternetGatewayAttachment == false)
            return false;
        InternetGatewayAttachment other = (InternetGatewayAttachment) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public InternetGatewayAttachment clone() {
        try {
            return (InternetGatewayAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
