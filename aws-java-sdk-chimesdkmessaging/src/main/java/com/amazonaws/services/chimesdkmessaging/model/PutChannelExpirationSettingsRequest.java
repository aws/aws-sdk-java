/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/PutChannelExpirationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutChannelExpirationSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code> or <code>AppInstanceBot</code> that makes the API call.
     * </p>
     */
    private String chimeBearer;
    /**
     * <p>
     * Settings that control the interval after which a channel is deleted.
     * </p>
     */
    private ExpirationSettings expirationSettings;

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @return The ARN of the channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelExpirationSettingsRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code> or <code>AppInstanceBot</code> that makes the API call.
     * </p>
     * 
     * @param chimeBearer
     *        The ARN of the <code>AppInstanceUser</code> or <code>AppInstanceBot</code> that makes the API call.
     */

    public void setChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code> or <code>AppInstanceBot</code> that makes the API call.
     * </p>
     * 
     * @return The ARN of the <code>AppInstanceUser</code> or <code>AppInstanceBot</code> that makes the API call.
     */

    public String getChimeBearer() {
        return this.chimeBearer;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code> or <code>AppInstanceBot</code> that makes the API call.
     * </p>
     * 
     * @param chimeBearer
     *        The ARN of the <code>AppInstanceUser</code> or <code>AppInstanceBot</code> that makes the API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelExpirationSettingsRequest withChimeBearer(String chimeBearer) {
        setChimeBearer(chimeBearer);
        return this;
    }

    /**
     * <p>
     * Settings that control the interval after which a channel is deleted.
     * </p>
     * 
     * @param expirationSettings
     *        Settings that control the interval after which a channel is deleted.
     */

    public void setExpirationSettings(ExpirationSettings expirationSettings) {
        this.expirationSettings = expirationSettings;
    }

    /**
     * <p>
     * Settings that control the interval after which a channel is deleted.
     * </p>
     * 
     * @return Settings that control the interval after which a channel is deleted.
     */

    public ExpirationSettings getExpirationSettings() {
        return this.expirationSettings;
    }

    /**
     * <p>
     * Settings that control the interval after which a channel is deleted.
     * </p>
     * 
     * @param expirationSettings
     *        Settings that control the interval after which a channel is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelExpirationSettingsRequest withExpirationSettings(ExpirationSettings expirationSettings) {
        setExpirationSettings(expirationSettings);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: ").append(getChimeBearer()).append(",");
        if (getExpirationSettings() != null)
            sb.append("ExpirationSettings: ").append(getExpirationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutChannelExpirationSettingsRequest == false)
            return false;
        PutChannelExpirationSettingsRequest other = (PutChannelExpirationSettingsRequest) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null && other.getChimeBearer().equals(this.getChimeBearer()) == false)
            return false;
        if (other.getExpirationSettings() == null ^ this.getExpirationSettings() == null)
            return false;
        if (other.getExpirationSettings() != null && other.getExpirationSettings().equals(this.getExpirationSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        hashCode = prime * hashCode + ((getExpirationSettings() == null) ? 0 : getExpirationSettings().hashCode());
        return hashCode;
    }

    @Override
    public PutChannelExpirationSettingsRequest clone() {
        return (PutChannelExpirationSettingsRequest) super.clone();
    }

}
