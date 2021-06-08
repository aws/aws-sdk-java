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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the retention settings for a channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ChannelRetentionSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelRetentionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time in days to retain the messages in a channel.
     * </p>
     */
    private Integer retentionDays;

    /**
     * <p>
     * The time in days to retain the messages in a channel.
     * </p>
     * 
     * @param retentionDays
     *        The time in days to retain the messages in a channel.
     */

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    /**
     * <p>
     * The time in days to retain the messages in a channel.
     * </p>
     * 
     * @return The time in days to retain the messages in a channel.
     */

    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * <p>
     * The time in days to retain the messages in a channel.
     * </p>
     * 
     * @param retentionDays
     *        The time in days to retain the messages in a channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelRetentionSettings withRetentionDays(Integer retentionDays) {
        setRetentionDays(retentionDays);
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
        if (getRetentionDays() != null)
            sb.append("RetentionDays: ").append(getRetentionDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelRetentionSettings == false)
            return false;
        ChannelRetentionSettings other = (ChannelRetentionSettings) obj;
        if (other.getRetentionDays() == null ^ this.getRetentionDays() == null)
            return false;
        if (other.getRetentionDays() != null && other.getRetentionDays().equals(this.getRetentionDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetentionDays() == null) ? 0 : getRetentionDays().hashCode());
        return hashCode;
    }

    @Override
    public ChannelRetentionSettings clone() {
        try {
            return (ChannelRetentionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ChannelRetentionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
