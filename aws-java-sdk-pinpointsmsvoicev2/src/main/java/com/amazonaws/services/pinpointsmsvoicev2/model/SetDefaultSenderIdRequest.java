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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetDefaultSenderId"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetDefaultSenderIdRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration set to updated with a new default SenderId. This field can be the ConsigurationSetName or
     * ConfigurationSetArn.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * The current sender ID for the configuration set. When sending a text message to a destination country which
     * supports SenderIds, the default sender ID on the configuration set specified on <a>SendTextMessage</a> will be
     * used if no dedicated origination phone numbers or registered SenderIds are available in your account, instead of
     * a generic sender ID, such as 'NOTICE'.
     * </p>
     */
    private String senderId;

    /**
     * <p>
     * The configuration set to updated with a new default SenderId. This field can be the ConsigurationSetName or
     * ConfigurationSetArn.
     * </p>
     * 
     * @param configurationSetName
     *        The configuration set to updated with a new default SenderId. This field can be the ConsigurationSetName
     *        or ConfigurationSetArn.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The configuration set to updated with a new default SenderId. This field can be the ConsigurationSetName or
     * ConfigurationSetArn.
     * </p>
     * 
     * @return The configuration set to updated with a new default SenderId. This field can be the ConsigurationSetName
     *         or ConfigurationSetArn.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The configuration set to updated with a new default SenderId. This field can be the ConsigurationSetName or
     * ConfigurationSetArn.
     * </p>
     * 
     * @param configurationSetName
     *        The configuration set to updated with a new default SenderId. This field can be the ConsigurationSetName
     *        or ConfigurationSetArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetDefaultSenderIdRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * The current sender ID for the configuration set. When sending a text message to a destination country which
     * supports SenderIds, the default sender ID on the configuration set specified on <a>SendTextMessage</a> will be
     * used if no dedicated origination phone numbers or registered SenderIds are available in your account, instead of
     * a generic sender ID, such as 'NOTICE'.
     * </p>
     * 
     * @param senderId
     *        The current sender ID for the configuration set. When sending a text message to a destination country
     *        which supports SenderIds, the default sender ID on the configuration set specified on
     *        <a>SendTextMessage</a> will be used if no dedicated origination phone numbers or registered SenderIds are
     *        available in your account, instead of a generic sender ID, such as 'NOTICE'.
     */

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * <p>
     * The current sender ID for the configuration set. When sending a text message to a destination country which
     * supports SenderIds, the default sender ID on the configuration set specified on <a>SendTextMessage</a> will be
     * used if no dedicated origination phone numbers or registered SenderIds are available in your account, instead of
     * a generic sender ID, such as 'NOTICE'.
     * </p>
     * 
     * @return The current sender ID for the configuration set. When sending a text message to a destination country
     *         which supports SenderIds, the default sender ID on the configuration set specified on
     *         <a>SendTextMessage</a> will be used if no dedicated origination phone numbers or registered SenderIds are
     *         available in your account, instead of a generic sender ID, such as 'NOTICE'.
     */

    public String getSenderId() {
        return this.senderId;
    }

    /**
     * <p>
     * The current sender ID for the configuration set. When sending a text message to a destination country which
     * supports SenderIds, the default sender ID on the configuration set specified on <a>SendTextMessage</a> will be
     * used if no dedicated origination phone numbers or registered SenderIds are available in your account, instead of
     * a generic sender ID, such as 'NOTICE'.
     * </p>
     * 
     * @param senderId
     *        The current sender ID for the configuration set. When sending a text message to a destination country
     *        which supports SenderIds, the default sender ID on the configuration set specified on
     *        <a>SendTextMessage</a> will be used if no dedicated origination phone numbers or registered SenderIds are
     *        available in your account, instead of a generic sender ID, such as 'NOTICE'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetDefaultSenderIdRequest withSenderId(String senderId) {
        setSenderId(senderId);
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getSenderId() != null)
            sb.append("SenderId: ").append(getSenderId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetDefaultSenderIdRequest == false)
            return false;
        SetDefaultSenderIdRequest other = (SetDefaultSenderIdRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getSenderId() == null ^ this.getSenderId() == null)
            return false;
        if (other.getSenderId() != null && other.getSenderId().equals(this.getSenderId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        return hashCode;
    }

    @Override
    public SetDefaultSenderIdRequest clone() {
        return (SetDefaultSenderIdRequest) super.clone();
    }

}
