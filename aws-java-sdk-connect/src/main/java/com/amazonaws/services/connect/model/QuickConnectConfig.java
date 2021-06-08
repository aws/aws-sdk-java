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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configuration settings for a quick connect.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/QuickConnectConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuickConnectConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to
     * assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     */
    private String quickConnectType;
    /**
     * <p>
     * The user configuration. This is required only if QuickConnectType is USER.
     * </p>
     */
    private UserQuickConnectConfig userConfig;
    /**
     * <p>
     * The queue configuration. This is required only if QuickConnectType is QUEUE.
     * </p>
     */
    private QueueQuickConnectConfig queueConfig;
    /**
     * <p>
     * The phone configuration. This is required only if QuickConnectType is PHONE_NUMBER.
     * </p>
     */
    private PhoneNumberQuickConnectConfig phoneConfig;

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to
     * assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * 
     * @param quickConnectType
     *        The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are
     *        prompted to assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * @see QuickConnectType
     */

    public void setQuickConnectType(String quickConnectType) {
        this.quickConnectType = quickConnectType;
    }

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to
     * assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * 
     * @return The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are
     *         prompted to assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * @see QuickConnectType
     */

    public String getQuickConnectType() {
        return this.quickConnectType;
    }

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to
     * assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * 
     * @param quickConnectType
     *        The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are
     *        prompted to assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuickConnectType
     */

    public QuickConnectConfig withQuickConnectType(String quickConnectType) {
        setQuickConnectType(quickConnectType);
        return this;
    }

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to
     * assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * 
     * @param quickConnectType
     *        The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are
     *        prompted to assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuickConnectType
     */

    public QuickConnectConfig withQuickConnectType(QuickConnectType quickConnectType) {
        this.quickConnectType = quickConnectType.toString();
        return this;
    }

    /**
     * <p>
     * The user configuration. This is required only if QuickConnectType is USER.
     * </p>
     * 
     * @param userConfig
     *        The user configuration. This is required only if QuickConnectType is USER.
     */

    public void setUserConfig(UserQuickConnectConfig userConfig) {
        this.userConfig = userConfig;
    }

    /**
     * <p>
     * The user configuration. This is required only if QuickConnectType is USER.
     * </p>
     * 
     * @return The user configuration. This is required only if QuickConnectType is USER.
     */

    public UserQuickConnectConfig getUserConfig() {
        return this.userConfig;
    }

    /**
     * <p>
     * The user configuration. This is required only if QuickConnectType is USER.
     * </p>
     * 
     * @param userConfig
     *        The user configuration. This is required only if QuickConnectType is USER.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickConnectConfig withUserConfig(UserQuickConnectConfig userConfig) {
        setUserConfig(userConfig);
        return this;
    }

    /**
     * <p>
     * The queue configuration. This is required only if QuickConnectType is QUEUE.
     * </p>
     * 
     * @param queueConfig
     *        The queue configuration. This is required only if QuickConnectType is QUEUE.
     */

    public void setQueueConfig(QueueQuickConnectConfig queueConfig) {
        this.queueConfig = queueConfig;
    }

    /**
     * <p>
     * The queue configuration. This is required only if QuickConnectType is QUEUE.
     * </p>
     * 
     * @return The queue configuration. This is required only if QuickConnectType is QUEUE.
     */

    public QueueQuickConnectConfig getQueueConfig() {
        return this.queueConfig;
    }

    /**
     * <p>
     * The queue configuration. This is required only if QuickConnectType is QUEUE.
     * </p>
     * 
     * @param queueConfig
     *        The queue configuration. This is required only if QuickConnectType is QUEUE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickConnectConfig withQueueConfig(QueueQuickConnectConfig queueConfig) {
        setQueueConfig(queueConfig);
        return this;
    }

    /**
     * <p>
     * The phone configuration. This is required only if QuickConnectType is PHONE_NUMBER.
     * </p>
     * 
     * @param phoneConfig
     *        The phone configuration. This is required only if QuickConnectType is PHONE_NUMBER.
     */

    public void setPhoneConfig(PhoneNumberQuickConnectConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    /**
     * <p>
     * The phone configuration. This is required only if QuickConnectType is PHONE_NUMBER.
     * </p>
     * 
     * @return The phone configuration. This is required only if QuickConnectType is PHONE_NUMBER.
     */

    public PhoneNumberQuickConnectConfig getPhoneConfig() {
        return this.phoneConfig;
    }

    /**
     * <p>
     * The phone configuration. This is required only if QuickConnectType is PHONE_NUMBER.
     * </p>
     * 
     * @param phoneConfig
     *        The phone configuration. This is required only if QuickConnectType is PHONE_NUMBER.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickConnectConfig withPhoneConfig(PhoneNumberQuickConnectConfig phoneConfig) {
        setPhoneConfig(phoneConfig);
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
        if (getQuickConnectType() != null)
            sb.append("QuickConnectType: ").append(getQuickConnectType()).append(",");
        if (getUserConfig() != null)
            sb.append("UserConfig: ").append(getUserConfig()).append(",");
        if (getQueueConfig() != null)
            sb.append("QueueConfig: ").append(getQueueConfig()).append(",");
        if (getPhoneConfig() != null)
            sb.append("PhoneConfig: ").append(getPhoneConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuickConnectConfig == false)
            return false;
        QuickConnectConfig other = (QuickConnectConfig) obj;
        if (other.getQuickConnectType() == null ^ this.getQuickConnectType() == null)
            return false;
        if (other.getQuickConnectType() != null && other.getQuickConnectType().equals(this.getQuickConnectType()) == false)
            return false;
        if (other.getUserConfig() == null ^ this.getUserConfig() == null)
            return false;
        if (other.getUserConfig() != null && other.getUserConfig().equals(this.getUserConfig()) == false)
            return false;
        if (other.getQueueConfig() == null ^ this.getQueueConfig() == null)
            return false;
        if (other.getQueueConfig() != null && other.getQueueConfig().equals(this.getQueueConfig()) == false)
            return false;
        if (other.getPhoneConfig() == null ^ this.getPhoneConfig() == null)
            return false;
        if (other.getPhoneConfig() != null && other.getPhoneConfig().equals(this.getPhoneConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuickConnectType() == null) ? 0 : getQuickConnectType().hashCode());
        hashCode = prime * hashCode + ((getUserConfig() == null) ? 0 : getUserConfig().hashCode());
        hashCode = prime * hashCode + ((getQueueConfig() == null) ? 0 : getQueueConfig().hashCode());
        hashCode = prime * hashCode + ((getPhoneConfig() == null) ? 0 : getPhoneConfig().hashCode());
        return hashCode;
    }

    @Override
    public QuickConnectConfig clone() {
        try {
            return (QuickConnectConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.QuickConnectConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
