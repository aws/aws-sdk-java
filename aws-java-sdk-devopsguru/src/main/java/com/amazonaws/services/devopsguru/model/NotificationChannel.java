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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a notification channel. A notification channel is used to notify you when DevOps Guru creates an
 * insight. The one supported notification channel is Amazon Simple Notification Service (Amazon SNS).
 * </p>
 * <p>
 * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru permission
 * to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using Amazon SNS in
 * your account. For more information, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html">Permissions for cross
 * account Amazon SNS topics</a>.
 * </p>
 * <p>
 * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service customer-managed key (CMK), then
 * you must add permissions to the CMK. For more information, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html">Permissions for AWS
 * KMS–encrypted Amazon SNS topics</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/NotificationChannel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationChannel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a notification channel.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A <code>NotificationChannelConfig</code> object that contains information about configured notification channels.
     * </p>
     */
    private NotificationChannelConfig config;

    /**
     * <p>
     * The ID of a notification channel.
     * </p>
     * 
     * @param id
     *        The ID of a notification channel.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of a notification channel.
     * </p>
     * 
     * @return The ID of a notification channel.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of a notification channel.
     * </p>
     * 
     * @param id
     *        The ID of a notification channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationChannel withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A <code>NotificationChannelConfig</code> object that contains information about configured notification channels.
     * </p>
     * 
     * @param config
     *        A <code>NotificationChannelConfig</code> object that contains information about configured notification
     *        channels.
     */

    public void setConfig(NotificationChannelConfig config) {
        this.config = config;
    }

    /**
     * <p>
     * A <code>NotificationChannelConfig</code> object that contains information about configured notification channels.
     * </p>
     * 
     * @return A <code>NotificationChannelConfig</code> object that contains information about configured notification
     *         channels.
     */

    public NotificationChannelConfig getConfig() {
        return this.config;
    }

    /**
     * <p>
     * A <code>NotificationChannelConfig</code> object that contains information about configured notification channels.
     * </p>
     * 
     * @param config
     *        A <code>NotificationChannelConfig</code> object that contains information about configured notification
     *        channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationChannel withConfig(NotificationChannelConfig config) {
        setConfig(config);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getConfig() != null)
            sb.append("Config: ").append(getConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationChannel == false)
            return false;
        NotificationChannel other = (NotificationChannel) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        return hashCode;
    }

    @Override
    public NotificationChannel clone() {
        try {
            return (NotificationChannel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.NotificationChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
