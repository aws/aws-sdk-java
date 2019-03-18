/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetGlobalSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGlobalSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime Business Calling settings.
     * </p>
     */
    private BusinessCallingSettings businessCalling;
    /**
     * <p>
     * The Amazon Chime Voice Connector settings.
     * </p>
     */
    private VoiceConnectorSettings voiceConnector;

    /**
     * <p>
     * The Amazon Chime Business Calling settings.
     * </p>
     * 
     * @param businessCalling
     *        The Amazon Chime Business Calling settings.
     */

    public void setBusinessCalling(BusinessCallingSettings businessCalling) {
        this.businessCalling = businessCalling;
    }

    /**
     * <p>
     * The Amazon Chime Business Calling settings.
     * </p>
     * 
     * @return The Amazon Chime Business Calling settings.
     */

    public BusinessCallingSettings getBusinessCalling() {
        return this.businessCalling;
    }

    /**
     * <p>
     * The Amazon Chime Business Calling settings.
     * </p>
     * 
     * @param businessCalling
     *        The Amazon Chime Business Calling settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlobalSettingsResult withBusinessCalling(BusinessCallingSettings businessCalling) {
        setBusinessCalling(businessCalling);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector settings.
     * </p>
     * 
     * @param voiceConnector
     *        The Amazon Chime Voice Connector settings.
     */

    public void setVoiceConnector(VoiceConnectorSettings voiceConnector) {
        this.voiceConnector = voiceConnector;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector settings.
     * </p>
     * 
     * @return The Amazon Chime Voice Connector settings.
     */

    public VoiceConnectorSettings getVoiceConnector() {
        return this.voiceConnector;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector settings.
     * </p>
     * 
     * @param voiceConnector
     *        The Amazon Chime Voice Connector settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlobalSettingsResult withVoiceConnector(VoiceConnectorSettings voiceConnector) {
        setVoiceConnector(voiceConnector);
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
        if (getBusinessCalling() != null)
            sb.append("BusinessCalling: ").append(getBusinessCalling()).append(",");
        if (getVoiceConnector() != null)
            sb.append("VoiceConnector: ").append(getVoiceConnector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGlobalSettingsResult == false)
            return false;
        GetGlobalSettingsResult other = (GetGlobalSettingsResult) obj;
        if (other.getBusinessCalling() == null ^ this.getBusinessCalling() == null)
            return false;
        if (other.getBusinessCalling() != null && other.getBusinessCalling().equals(this.getBusinessCalling()) == false)
            return false;
        if (other.getVoiceConnector() == null ^ this.getVoiceConnector() == null)
            return false;
        if (other.getVoiceConnector() != null && other.getVoiceConnector().equals(this.getVoiceConnector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBusinessCalling() == null) ? 0 : getBusinessCalling().hashCode());
        hashCode = prime * hashCode + ((getVoiceConnector() == null) ? 0 : getVoiceConnector().hashCode());
        return hashCode;
    }

    @Override
    public GetGlobalSettingsResult clone() {
        try {
            return (GetGlobalSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
