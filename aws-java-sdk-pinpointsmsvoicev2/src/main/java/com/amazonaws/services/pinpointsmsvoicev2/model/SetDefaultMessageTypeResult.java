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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetDefaultMessageType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetDefaultMessageTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated configuration set.
     * </p>
     */
    private String configurationSetArn;
    /**
     * <p>
     * The name of the configuration set that was updated.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * The new default message type of the configuration set.
     * </p>
     */
    private String messageType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated configuration set.
     * </p>
     * 
     * @param configurationSetArn
     *        The Amazon Resource Name (ARN) of the updated configuration set.
     */

    public void setConfigurationSetArn(String configurationSetArn) {
        this.configurationSetArn = configurationSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated configuration set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the updated configuration set.
     */

    public String getConfigurationSetArn() {
        return this.configurationSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated configuration set.
     * </p>
     * 
     * @param configurationSetArn
     *        The Amazon Resource Name (ARN) of the updated configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetDefaultMessageTypeResult withConfigurationSetArn(String configurationSetArn) {
        setConfigurationSetArn(configurationSetArn);
        return this;
    }

    /**
     * <p>
     * The name of the configuration set that was updated.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that was updated.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that was updated.
     * </p>
     * 
     * @return The name of the configuration set that was updated.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that was updated.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetDefaultMessageTypeResult withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * The new default message type of the configuration set.
     * </p>
     * 
     * @param messageType
     *        The new default message type of the configuration set.
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * The new default message type of the configuration set.
     * </p>
     * 
     * @return The new default message type of the configuration set.
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * The new default message type of the configuration set.
     * </p>
     * 
     * @param messageType
     *        The new default message type of the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SetDefaultMessageTypeResult withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * The new default message type of the configuration set.
     * </p>
     * 
     * @param messageType
     *        The new default message type of the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SetDefaultMessageTypeResult withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
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
        if (getConfigurationSetArn() != null)
            sb.append("ConfigurationSetArn: ").append(getConfigurationSetArn()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetDefaultMessageTypeResult == false)
            return false;
        SetDefaultMessageTypeResult other = (SetDefaultMessageTypeResult) obj;
        if (other.getConfigurationSetArn() == null ^ this.getConfigurationSetArn() == null)
            return false;
        if (other.getConfigurationSetArn() != null && other.getConfigurationSetArn().equals(this.getConfigurationSetArn()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetArn() == null) ? 0 : getConfigurationSetArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        return hashCode;
    }

    @Override
    public SetDefaultMessageTypeResult clone() {
        try {
            return (SetDefaultMessageTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
