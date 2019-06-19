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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorOrigination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutVoiceConnectorOriginationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     */
    private String voiceConnectorId;
    /**
     * <p>
     * The origination setting details to add.
     * </p>
     */
    private Origination origination;

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Amazon Chime Voice Connector ID.
     */

    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @return The Amazon Chime Voice Connector ID.
     */

    public String getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Amazon Chime Voice Connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVoiceConnectorOriginationRequest withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * <p>
     * The origination setting details to add.
     * </p>
     * 
     * @param origination
     *        The origination setting details to add.
     */

    public void setOrigination(Origination origination) {
        this.origination = origination;
    }

    /**
     * <p>
     * The origination setting details to add.
     * </p>
     * 
     * @return The origination setting details to add.
     */

    public Origination getOrigination() {
        return this.origination;
    }

    /**
     * <p>
     * The origination setting details to add.
     * </p>
     * 
     * @param origination
     *        The origination setting details to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVoiceConnectorOriginationRequest withOrigination(Origination origination) {
        setOrigination(origination);
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
        if (getVoiceConnectorId() != null)
            sb.append("VoiceConnectorId: ").append(getVoiceConnectorId()).append(",");
        if (getOrigination() != null)
            sb.append("Origination: ").append(getOrigination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutVoiceConnectorOriginationRequest == false)
            return false;
        PutVoiceConnectorOriginationRequest other = (PutVoiceConnectorOriginationRequest) obj;
        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getOrigination() == null ^ this.getOrigination() == null)
            return false;
        if (other.getOrigination() != null && other.getOrigination().equals(this.getOrigination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getOrigination() == null) ? 0 : getOrigination().hashCode());
        return hashCode;
    }

    @Override
    public PutVoiceConnectorOriginationRequest clone() {
        return (PutVoiceConnectorOriginationRequest) super.clone();
    }

}
