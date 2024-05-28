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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceProfileDomain"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVoiceProfileDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the voice profile domain.
     * </p>
     */
    private VoiceProfileDomain voiceProfileDomain;

    /**
     * <p>
     * The details of the voice profile domain.
     * </p>
     * 
     * @param voiceProfileDomain
     *        The details of the voice profile domain.
     */

    public void setVoiceProfileDomain(VoiceProfileDomain voiceProfileDomain) {
        this.voiceProfileDomain = voiceProfileDomain;
    }

    /**
     * <p>
     * The details of the voice profile domain.
     * </p>
     * 
     * @return The details of the voice profile domain.
     */

    public VoiceProfileDomain getVoiceProfileDomain() {
        return this.voiceProfileDomain;
    }

    /**
     * <p>
     * The details of the voice profile domain.
     * </p>
     * 
     * @param voiceProfileDomain
     *        The details of the voice profile domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVoiceProfileDomainResult withVoiceProfileDomain(VoiceProfileDomain voiceProfileDomain) {
        setVoiceProfileDomain(voiceProfileDomain);
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
        if (getVoiceProfileDomain() != null)
            sb.append("VoiceProfileDomain: ").append(getVoiceProfileDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVoiceProfileDomainResult == false)
            return false;
        GetVoiceProfileDomainResult other = (GetVoiceProfileDomainResult) obj;
        if (other.getVoiceProfileDomain() == null ^ this.getVoiceProfileDomain() == null)
            return false;
        if (other.getVoiceProfileDomain() != null && other.getVoiceProfileDomain().equals(this.getVoiceProfileDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceProfileDomain() == null) ? 0 : getVoiceProfileDomain().hashCode());
        return hashCode;
    }

    @Override
    public GetVoiceProfileDomainResult clone() {
        try {
            return (GetVoiceProfileDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
