/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The recipient of <code>AnomalySubscription</code> notifications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/Subscriber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subscriber implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The email address or SNS Amazon Resource Name (ARN), depending on the <code>Type</code>.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The notification delivery channel.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Indicates if the subscriber accepts the notifications.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The email address or SNS Amazon Resource Name (ARN), depending on the <code>Type</code>.
     * </p>
     * 
     * @param address
     *        The email address or SNS Amazon Resource Name (ARN), depending on the <code>Type</code>.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The email address or SNS Amazon Resource Name (ARN), depending on the <code>Type</code>.
     * </p>
     * 
     * @return The email address or SNS Amazon Resource Name (ARN), depending on the <code>Type</code>.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The email address or SNS Amazon Resource Name (ARN), depending on the <code>Type</code>.
     * </p>
     * 
     * @param address
     *        The email address or SNS Amazon Resource Name (ARN), depending on the <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscriber withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The notification delivery channel.
     * </p>
     * 
     * @param type
     *        The notification delivery channel.
     * @see SubscriberType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The notification delivery channel.
     * </p>
     * 
     * @return The notification delivery channel.
     * @see SubscriberType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The notification delivery channel.
     * </p>
     * 
     * @param type
     *        The notification delivery channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriberType
     */

    public Subscriber withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The notification delivery channel.
     * </p>
     * 
     * @param type
     *        The notification delivery channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriberType
     */

    public Subscriber withType(SubscriberType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Indicates if the subscriber accepts the notifications.
     * </p>
     * 
     * @param status
     *        Indicates if the subscriber accepts the notifications.
     * @see SubscriberStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates if the subscriber accepts the notifications.
     * </p>
     * 
     * @return Indicates if the subscriber accepts the notifications.
     * @see SubscriberStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates if the subscriber accepts the notifications.
     * </p>
     * 
     * @param status
     *        Indicates if the subscriber accepts the notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriberStatus
     */

    public Subscriber withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates if the subscriber accepts the notifications.
     * </p>
     * 
     * @param status
     *        Indicates if the subscriber accepts the notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriberStatus
     */

    public Subscriber withStatus(SubscriberStatus status) {
        this.status = status.toString();
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subscriber == false)
            return false;
        Subscriber other = (Subscriber) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Subscriber clone() {
        try {
            return (Subscriber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SubscriberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
