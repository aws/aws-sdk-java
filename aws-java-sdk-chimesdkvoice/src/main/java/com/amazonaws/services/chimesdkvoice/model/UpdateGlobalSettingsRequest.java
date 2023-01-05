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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateGlobalSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGlobalSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private VoiceConnectorSettings voiceConnector;

    /**
     * @param voiceConnector
     */

    public void setVoiceConnector(VoiceConnectorSettings voiceConnector) {
        this.voiceConnector = voiceConnector;
    }

    /**
     * @return
     */

    public VoiceConnectorSettings getVoiceConnector() {
        return this.voiceConnector;
    }

    /**
     * @param voiceConnector
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalSettingsRequest withVoiceConnector(VoiceConnectorSettings voiceConnector) {
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

        if (obj instanceof UpdateGlobalSettingsRequest == false)
            return false;
        UpdateGlobalSettingsRequest other = (UpdateGlobalSettingsRequest) obj;
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

        hashCode = prime * hashCode + ((getVoiceConnector() == null) ? 0 : getVoiceConnector().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGlobalSettingsRequest clone() {
        return (UpdateGlobalSettingsRequest) super.clone();
    }

}
