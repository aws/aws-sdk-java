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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details regarding various fraud risk analyses performed against the current session state and streamed audio of the
 * speaker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/FraudRiskDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FraudRiskDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details resulting from 'Known Fraudster Risk' analysis of the speaker.
     * </p>
     */
    private KnownFraudsterRisk knownFraudsterRisk;
    /**
     * <p>
     * The details resulting from 'Voice Spoofing Risk' analysis of the speaker.
     * </p>
     */
    private VoiceSpoofingRisk voiceSpoofingRisk;

    /**
     * <p>
     * The details resulting from 'Known Fraudster Risk' analysis of the speaker.
     * </p>
     * 
     * @param knownFraudsterRisk
     *        The details resulting from 'Known Fraudster Risk' analysis of the speaker.
     */

    public void setKnownFraudsterRisk(KnownFraudsterRisk knownFraudsterRisk) {
        this.knownFraudsterRisk = knownFraudsterRisk;
    }

    /**
     * <p>
     * The details resulting from 'Known Fraudster Risk' analysis of the speaker.
     * </p>
     * 
     * @return The details resulting from 'Known Fraudster Risk' analysis of the speaker.
     */

    public KnownFraudsterRisk getKnownFraudsterRisk() {
        return this.knownFraudsterRisk;
    }

    /**
     * <p>
     * The details resulting from 'Known Fraudster Risk' analysis of the speaker.
     * </p>
     * 
     * @param knownFraudsterRisk
     *        The details resulting from 'Known Fraudster Risk' analysis of the speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FraudRiskDetails withKnownFraudsterRisk(KnownFraudsterRisk knownFraudsterRisk) {
        setKnownFraudsterRisk(knownFraudsterRisk);
        return this;
    }

    /**
     * <p>
     * The details resulting from 'Voice Spoofing Risk' analysis of the speaker.
     * </p>
     * 
     * @param voiceSpoofingRisk
     *        The details resulting from 'Voice Spoofing Risk' analysis of the speaker.
     */

    public void setVoiceSpoofingRisk(VoiceSpoofingRisk voiceSpoofingRisk) {
        this.voiceSpoofingRisk = voiceSpoofingRisk;
    }

    /**
     * <p>
     * The details resulting from 'Voice Spoofing Risk' analysis of the speaker.
     * </p>
     * 
     * @return The details resulting from 'Voice Spoofing Risk' analysis of the speaker.
     */

    public VoiceSpoofingRisk getVoiceSpoofingRisk() {
        return this.voiceSpoofingRisk;
    }

    /**
     * <p>
     * The details resulting from 'Voice Spoofing Risk' analysis of the speaker.
     * </p>
     * 
     * @param voiceSpoofingRisk
     *        The details resulting from 'Voice Spoofing Risk' analysis of the speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FraudRiskDetails withVoiceSpoofingRisk(VoiceSpoofingRisk voiceSpoofingRisk) {
        setVoiceSpoofingRisk(voiceSpoofingRisk);
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
        if (getKnownFraudsterRisk() != null)
            sb.append("KnownFraudsterRisk: ").append(getKnownFraudsterRisk()).append(",");
        if (getVoiceSpoofingRisk() != null)
            sb.append("VoiceSpoofingRisk: ").append(getVoiceSpoofingRisk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FraudRiskDetails == false)
            return false;
        FraudRiskDetails other = (FraudRiskDetails) obj;
        if (other.getKnownFraudsterRisk() == null ^ this.getKnownFraudsterRisk() == null)
            return false;
        if (other.getKnownFraudsterRisk() != null && other.getKnownFraudsterRisk().equals(this.getKnownFraudsterRisk()) == false)
            return false;
        if (other.getVoiceSpoofingRisk() == null ^ this.getVoiceSpoofingRisk() == null)
            return false;
        if (other.getVoiceSpoofingRisk() != null && other.getVoiceSpoofingRisk().equals(this.getVoiceSpoofingRisk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKnownFraudsterRisk() == null) ? 0 : getKnownFraudsterRisk().hashCode());
        hashCode = prime * hashCode + ((getVoiceSpoofingRisk() == null) ? 0 : getVoiceSpoofingRisk().hashCode());
        return hashCode;
    }

    @Override
    public FraudRiskDetails clone() {
        try {
            return (FraudRiskDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.FraudRiskDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
