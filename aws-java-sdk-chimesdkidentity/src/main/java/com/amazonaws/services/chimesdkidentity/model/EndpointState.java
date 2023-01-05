/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A read-only field that represents the state of an <code>AppInstanceUserEndpoint</code>. Supported values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active and able to receive messages. When
 * <code>ACTIVE</code>, the <code>EndpointStatusReason</code> remains empty.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is inactive and can't receive message. When INACTIVE,
 * the corresponding reason will be conveyed through EndpointStatusReason.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>INVALID_DEVICE_TOKEN</code> indicates that an <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due
 * to invalid device token
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>INVALID_PINPOINT_ARN</code> indicates that an <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due
 * to an invalid pinpoint ARN that was input through the <code>ResourceArn</code> field.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/EndpointState" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the <code>EndpointStatus</code>.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param status
     *        Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>.
     * @see EndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @return Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>.
     * @see EndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param status
     *        Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public EndpointState withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param status
     *        Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public EndpointState withStatus(EndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the <code>EndpointStatus</code>.
     * </p>
     * 
     * @param statusReason
     *        The reason for the <code>EndpointStatus</code>.
     * @see EndpointStatusReason
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the <code>EndpointStatus</code>.
     * </p>
     * 
     * @return The reason for the <code>EndpointStatus</code>.
     * @see EndpointStatusReason
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the <code>EndpointStatus</code>.
     * </p>
     * 
     * @param statusReason
     *        The reason for the <code>EndpointStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatusReason
     */

    public EndpointState withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The reason for the <code>EndpointStatus</code>.
     * </p>
     * 
     * @param statusReason
     *        The reason for the <code>EndpointStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatusReason
     */

    public EndpointState withStatusReason(EndpointStatusReason statusReason) {
        this.statusReason = statusReason.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointState == false)
            return false;
        EndpointState other = (EndpointState) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public EndpointState clone() {
        try {
            return (EndpointState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkidentity.model.transform.EndpointStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
