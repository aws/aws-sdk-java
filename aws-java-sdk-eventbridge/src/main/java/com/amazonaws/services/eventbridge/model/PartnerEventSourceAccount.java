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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The AWS account that a partner event source has been offered to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PartnerEventSourceAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PartnerEventSourceAccount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account ID that the partner event source was offered to.
     * </p>
     */
    private String account;
    /**
     * <p>
     * The date and time the event source was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time that the event source will expire, if the AWS account doesn't create a matching event bus for
     * it.
     * </p>
     */
    private java.util.Date expirationTime;
    /**
     * <p>
     * The state of the event source. If it is ACTIVE, you have already created a matching event bus for this event
     * source, and that event bus is active. If it is PENDING, either you haven't yet created a matching event bus, or
     * that event bus is deactivated. If it is DELETED, you have created a matching event bus, but the event source has
     * since been deleted.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The AWS account ID that the partner event source was offered to.
     * </p>
     * 
     * @param account
     *        The AWS account ID that the partner event source was offered to.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The AWS account ID that the partner event source was offered to.
     * </p>
     * 
     * @return The AWS account ID that the partner event source was offered to.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The AWS account ID that the partner event source was offered to.
     * </p>
     * 
     * @param account
     *        The AWS account ID that the partner event source was offered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartnerEventSourceAccount withAccount(String account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * The date and time the event source was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the event source was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the event source was created.
     * </p>
     * 
     * @return The date and time the event source was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time the event source was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the event source was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartnerEventSourceAccount withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the event source will expire, if the AWS account doesn't create a matching event bus for
     * it.
     * </p>
     * 
     * @param expirationTime
     *        The date and time that the event source will expire, if the AWS account doesn't create a matching event
     *        bus for it.
     */

    public void setExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * The date and time that the event source will expire, if the AWS account doesn't create a matching event bus for
     * it.
     * </p>
     * 
     * @return The date and time that the event source will expire, if the AWS account doesn't create a matching event
     *         bus for it.
     */

    public java.util.Date getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * <p>
     * The date and time that the event source will expire, if the AWS account doesn't create a matching event bus for
     * it.
     * </p>
     * 
     * @param expirationTime
     *        The date and time that the event source will expire, if the AWS account doesn't create a matching event
     *        bus for it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartnerEventSourceAccount withExpirationTime(java.util.Date expirationTime) {
        setExpirationTime(expirationTime);
        return this;
    }

    /**
     * <p>
     * The state of the event source. If it is ACTIVE, you have already created a matching event bus for this event
     * source, and that event bus is active. If it is PENDING, either you haven't yet created a matching event bus, or
     * that event bus is deactivated. If it is DELETED, you have created a matching event bus, but the event source has
     * since been deleted.
     * </p>
     * 
     * @param state
     *        The state of the event source. If it is ACTIVE, you have already created a matching event bus for this
     *        event source, and that event bus is active. If it is PENDING, either you haven't yet created a matching
     *        event bus, or that event bus is deactivated. If it is DELETED, you have created a matching event bus, but
     *        the event source has since been deleted.
     * @see EventSourceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the event source. If it is ACTIVE, you have already created a matching event bus for this event
     * source, and that event bus is active. If it is PENDING, either you haven't yet created a matching event bus, or
     * that event bus is deactivated. If it is DELETED, you have created a matching event bus, but the event source has
     * since been deleted.
     * </p>
     * 
     * @return The state of the event source. If it is ACTIVE, you have already created a matching event bus for this
     *         event source, and that event bus is active. If it is PENDING, either you haven't yet created a matching
     *         event bus, or that event bus is deactivated. If it is DELETED, you have created a matching event bus, but
     *         the event source has since been deleted.
     * @see EventSourceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the event source. If it is ACTIVE, you have already created a matching event bus for this event
     * source, and that event bus is active. If it is PENDING, either you haven't yet created a matching event bus, or
     * that event bus is deactivated. If it is DELETED, you have created a matching event bus, but the event source has
     * since been deleted.
     * </p>
     * 
     * @param state
     *        The state of the event source. If it is ACTIVE, you have already created a matching event bus for this
     *        event source, and that event bus is active. If it is PENDING, either you haven't yet created a matching
     *        event bus, or that event bus is deactivated. If it is DELETED, you have created a matching event bus, but
     *        the event source has since been deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceState
     */

    public PartnerEventSourceAccount withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the event source. If it is ACTIVE, you have already created a matching event bus for this event
     * source, and that event bus is active. If it is PENDING, either you haven't yet created a matching event bus, or
     * that event bus is deactivated. If it is DELETED, you have created a matching event bus, but the event source has
     * since been deleted.
     * </p>
     * 
     * @param state
     *        The state of the event source. If it is ACTIVE, you have already created a matching event bus for this
     *        event source, and that event bus is active. If it is PENDING, either you haven't yet created a matching
     *        event bus, or that event bus is deactivated. If it is DELETED, you have created a matching event bus, but
     *        the event source has since been deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceState
     */

    public PartnerEventSourceAccount withState(EventSourceState state) {
        this.state = state.toString();
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
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: ").append(getExpirationTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartnerEventSourceAccount == false)
            return false;
        PartnerEventSourceAccount other = (PartnerEventSourceAccount) obj;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public PartnerEventSourceAccount clone() {
        try {
            return (PartnerEventSourceAccount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.PartnerEventSourceAccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
