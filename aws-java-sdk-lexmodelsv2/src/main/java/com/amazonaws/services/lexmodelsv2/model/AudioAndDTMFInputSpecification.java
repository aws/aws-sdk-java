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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the audio and DTMF input specification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AudioAndDTMFInputSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioAndDTMFInputSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time for which a bot waits before assuming that the customer isn't going to speak or press a key. This timeout is
     * shared between Audio and DTMF inputs.
     * </p>
     */
    private Integer startTimeoutMs;
    /**
     * <p>
     * Specifies the settings on audio input.
     * </p>
     */
    private AudioSpecification audioSpecification;
    /**
     * <p>
     * Specifies the settings on DTMF input.
     * </p>
     */
    private DTMFSpecification dtmfSpecification;

    /**
     * <p>
     * Time for which a bot waits before assuming that the customer isn't going to speak or press a key. This timeout is
     * shared between Audio and DTMF inputs.
     * </p>
     * 
     * @param startTimeoutMs
     *        Time for which a bot waits before assuming that the customer isn't going to speak or press a key. This
     *        timeout is shared between Audio and DTMF inputs.
     */

    public void setStartTimeoutMs(Integer startTimeoutMs) {
        this.startTimeoutMs = startTimeoutMs;
    }

    /**
     * <p>
     * Time for which a bot waits before assuming that the customer isn't going to speak or press a key. This timeout is
     * shared between Audio and DTMF inputs.
     * </p>
     * 
     * @return Time for which a bot waits before assuming that the customer isn't going to speak or press a key. This
     *         timeout is shared between Audio and DTMF inputs.
     */

    public Integer getStartTimeoutMs() {
        return this.startTimeoutMs;
    }

    /**
     * <p>
     * Time for which a bot waits before assuming that the customer isn't going to speak or press a key. This timeout is
     * shared between Audio and DTMF inputs.
     * </p>
     * 
     * @param startTimeoutMs
     *        Time for which a bot waits before assuming that the customer isn't going to speak or press a key. This
     *        timeout is shared between Audio and DTMF inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioAndDTMFInputSpecification withStartTimeoutMs(Integer startTimeoutMs) {
        setStartTimeoutMs(startTimeoutMs);
        return this;
    }

    /**
     * <p>
     * Specifies the settings on audio input.
     * </p>
     * 
     * @param audioSpecification
     *        Specifies the settings on audio input.
     */

    public void setAudioSpecification(AudioSpecification audioSpecification) {
        this.audioSpecification = audioSpecification;
    }

    /**
     * <p>
     * Specifies the settings on audio input.
     * </p>
     * 
     * @return Specifies the settings on audio input.
     */

    public AudioSpecification getAudioSpecification() {
        return this.audioSpecification;
    }

    /**
     * <p>
     * Specifies the settings on audio input.
     * </p>
     * 
     * @param audioSpecification
     *        Specifies the settings on audio input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioAndDTMFInputSpecification withAudioSpecification(AudioSpecification audioSpecification) {
        setAudioSpecification(audioSpecification);
        return this;
    }

    /**
     * <p>
     * Specifies the settings on DTMF input.
     * </p>
     * 
     * @param dtmfSpecification
     *        Specifies the settings on DTMF input.
     */

    public void setDtmfSpecification(DTMFSpecification dtmfSpecification) {
        this.dtmfSpecification = dtmfSpecification;
    }

    /**
     * <p>
     * Specifies the settings on DTMF input.
     * </p>
     * 
     * @return Specifies the settings on DTMF input.
     */

    public DTMFSpecification getDtmfSpecification() {
        return this.dtmfSpecification;
    }

    /**
     * <p>
     * Specifies the settings on DTMF input.
     * </p>
     * 
     * @param dtmfSpecification
     *        Specifies the settings on DTMF input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioAndDTMFInputSpecification withDtmfSpecification(DTMFSpecification dtmfSpecification) {
        setDtmfSpecification(dtmfSpecification);
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
        if (getStartTimeoutMs() != null)
            sb.append("StartTimeoutMs: ").append(getStartTimeoutMs()).append(",");
        if (getAudioSpecification() != null)
            sb.append("AudioSpecification: ").append(getAudioSpecification()).append(",");
        if (getDtmfSpecification() != null)
            sb.append("DtmfSpecification: ").append(getDtmfSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioAndDTMFInputSpecification == false)
            return false;
        AudioAndDTMFInputSpecification other = (AudioAndDTMFInputSpecification) obj;
        if (other.getStartTimeoutMs() == null ^ this.getStartTimeoutMs() == null)
            return false;
        if (other.getStartTimeoutMs() != null && other.getStartTimeoutMs().equals(this.getStartTimeoutMs()) == false)
            return false;
        if (other.getAudioSpecification() == null ^ this.getAudioSpecification() == null)
            return false;
        if (other.getAudioSpecification() != null && other.getAudioSpecification().equals(this.getAudioSpecification()) == false)
            return false;
        if (other.getDtmfSpecification() == null ^ this.getDtmfSpecification() == null)
            return false;
        if (other.getDtmfSpecification() != null && other.getDtmfSpecification().equals(this.getDtmfSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTimeoutMs() == null) ? 0 : getStartTimeoutMs().hashCode());
        hashCode = prime * hashCode + ((getAudioSpecification() == null) ? 0 : getAudioSpecification().hashCode());
        hashCode = prime * hashCode + ((getDtmfSpecification() == null) ? 0 : getDtmfSpecification().hashCode());
        return hashCode;
    }

    @Override
    public AudioAndDTMFInputSpecification clone() {
        try {
            return (AudioAndDTMFInputSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AudioAndDTMFInputSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
