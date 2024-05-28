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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/PutChannelExpirationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutChannelExpirationSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The channel ARN.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * Settings that control the interval after which a channel is deleted.
     * </p>
     */
    private ExpirationSettings expirationSettings;

    /**
     * <p>
     * The channel ARN.
     * </p>
     * 
     * @param channelArn
     *        The channel ARN.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The channel ARN.
     * </p>
     * 
     * @return The channel ARN.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The channel ARN.
     * </p>
     * 
     * @param channelArn
     *        The channel ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelExpirationSettingsResult withChannelArn(String channelArn) {
        setChannelArn(channelArn);
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

    public PutChannelExpirationSettingsResult withExpirationSettings(ExpirationSettings expirationSettings) {
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

        if (obj instanceof PutChannelExpirationSettingsResult == false)
            return false;
        PutChannelExpirationSettingsResult other = (PutChannelExpirationSettingsResult) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
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
        hashCode = prime * hashCode + ((getExpirationSettings() == null) ? 0 : getExpirationSettings().hashCode());
        return hashCode;
    }

    @Override
    public PutChannelExpirationSettingsResult clone() {
        try {
            return (PutChannelExpirationSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
