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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the contact channel that Incident Manager uses to engage the contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ChannelTargetInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelTargetInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     */
    private String contactChannelId;
    /**
     * <p>
     * The number of minutes to wait to retry sending engagement in the case the engagement initially fails.
     * </p>
     */
    private Integer retryIntervalInMinutes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     * 
     * @param contactChannelId
     *        The Amazon Resource Name (ARN) of the contact channel.
     */

    public void setContactChannelId(String contactChannelId) {
        this.contactChannelId = contactChannelId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact channel.
     */

    public String getContactChannelId() {
        return this.contactChannelId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     * 
     * @param contactChannelId
     *        The Amazon Resource Name (ARN) of the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelTargetInfo withContactChannelId(String contactChannelId) {
        setContactChannelId(contactChannelId);
        return this;
    }

    /**
     * <p>
     * The number of minutes to wait to retry sending engagement in the case the engagement initially fails.
     * </p>
     * 
     * @param retryIntervalInMinutes
     *        The number of minutes to wait to retry sending engagement in the case the engagement initially fails.
     */

    public void setRetryIntervalInMinutes(Integer retryIntervalInMinutes) {
        this.retryIntervalInMinutes = retryIntervalInMinutes;
    }

    /**
     * <p>
     * The number of minutes to wait to retry sending engagement in the case the engagement initially fails.
     * </p>
     * 
     * @return The number of minutes to wait to retry sending engagement in the case the engagement initially fails.
     */

    public Integer getRetryIntervalInMinutes() {
        return this.retryIntervalInMinutes;
    }

    /**
     * <p>
     * The number of minutes to wait to retry sending engagement in the case the engagement initially fails.
     * </p>
     * 
     * @param retryIntervalInMinutes
     *        The number of minutes to wait to retry sending engagement in the case the engagement initially fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelTargetInfo withRetryIntervalInMinutes(Integer retryIntervalInMinutes) {
        setRetryIntervalInMinutes(retryIntervalInMinutes);
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
        if (getContactChannelId() != null)
            sb.append("ContactChannelId: ").append(getContactChannelId()).append(",");
        if (getRetryIntervalInMinutes() != null)
            sb.append("RetryIntervalInMinutes: ").append(getRetryIntervalInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelTargetInfo == false)
            return false;
        ChannelTargetInfo other = (ChannelTargetInfo) obj;
        if (other.getContactChannelId() == null ^ this.getContactChannelId() == null)
            return false;
        if (other.getContactChannelId() != null && other.getContactChannelId().equals(this.getContactChannelId()) == false)
            return false;
        if (other.getRetryIntervalInMinutes() == null ^ this.getRetryIntervalInMinutes() == null)
            return false;
        if (other.getRetryIntervalInMinutes() != null && other.getRetryIntervalInMinutes().equals(this.getRetryIntervalInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactChannelId() == null) ? 0 : getContactChannelId().hashCode());
        hashCode = prime * hashCode + ((getRetryIntervalInMinutes() == null) ? 0 : getRetryIntervalInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public ChannelTargetInfo clone() {
        try {
            return (ChannelTargetInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.ChannelTargetInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
