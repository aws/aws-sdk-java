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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings for logging audio of conversations between Amazon Lex and a user. You specify whether to log audio and the
 * Amazon S3 bucket where the audio file is stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AudioLogSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioLogSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether audio logging in enabled for the bot.
     * </p>
     */
    private Boolean enabled;

    private AudioLogDestination destination;

    /**
     * <p>
     * Determines whether audio logging in enabled for the bot.
     * </p>
     * 
     * @param enabled
     *        Determines whether audio logging in enabled for the bot.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Determines whether audio logging in enabled for the bot.
     * </p>
     * 
     * @return Determines whether audio logging in enabled for the bot.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Determines whether audio logging in enabled for the bot.
     * </p>
     * 
     * @param enabled
     *        Determines whether audio logging in enabled for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioLogSetting withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Determines whether audio logging in enabled for the bot.
     * </p>
     * 
     * @return Determines whether audio logging in enabled for the bot.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * @param destination
     */

    public void setDestination(AudioLogDestination destination) {
        this.destination = destination;
    }

    /**
     * @return
     */

    public AudioLogDestination getDestination() {
        return this.destination;
    }

    /**
     * @param destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioLogSetting withDestination(AudioLogDestination destination) {
        setDestination(destination);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioLogSetting == false)
            return false;
        AudioLogSetting other = (AudioLogSetting) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public AudioLogSetting clone() {
        try {
            return (AudioLogSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AudioLogSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
