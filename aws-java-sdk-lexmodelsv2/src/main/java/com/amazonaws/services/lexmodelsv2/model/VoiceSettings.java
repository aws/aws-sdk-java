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
 * Defines settings for using an Amazon Polly voice to communicate with a user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/VoiceSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the Amazon Polly voice to use.
     * </p>
     */
    private String voiceId;

    /**
     * <p>
     * The identifier of the Amazon Polly voice to use.
     * </p>
     * 
     * @param voiceId
     *        The identifier of the Amazon Polly voice to use.
     */

    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Polly voice to use.
     * </p>
     * 
     * @return The identifier of the Amazon Polly voice to use.
     */

    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Polly voice to use.
     * </p>
     * 
     * @param voiceId
     *        The identifier of the Amazon Polly voice to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceSettings withVoiceId(String voiceId) {
        setVoiceId(voiceId);
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
        if (getVoiceId() != null)
            sb.append("VoiceId: ").append(getVoiceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceSettings == false)
            return false;
        VoiceSettings other = (VoiceSettings) obj;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        return hashCode;
    }

    @Override
    public VoiceSettings clone() {
        try {
            return (VoiceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.VoiceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
