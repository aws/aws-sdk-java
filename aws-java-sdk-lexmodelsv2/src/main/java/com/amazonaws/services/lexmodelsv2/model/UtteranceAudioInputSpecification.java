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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the audio for an utterance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UtteranceAudioInputSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtteranceAudioInputSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon S3 file pointing to the audio.
     * </p>
     */
    private String audioFileS3Location;

    /**
     * <p>
     * Amazon S3 file pointing to the audio.
     * </p>
     * 
     * @param audioFileS3Location
     *        Amazon S3 file pointing to the audio.
     */

    public void setAudioFileS3Location(String audioFileS3Location) {
        this.audioFileS3Location = audioFileS3Location;
    }

    /**
     * <p>
     * Amazon S3 file pointing to the audio.
     * </p>
     * 
     * @return Amazon S3 file pointing to the audio.
     */

    public String getAudioFileS3Location() {
        return this.audioFileS3Location;
    }

    /**
     * <p>
     * Amazon S3 file pointing to the audio.
     * </p>
     * 
     * @param audioFileS3Location
     *        Amazon S3 file pointing to the audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceAudioInputSpecification withAudioFileS3Location(String audioFileS3Location) {
        setAudioFileS3Location(audioFileS3Location);
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
        if (getAudioFileS3Location() != null)
            sb.append("AudioFileS3Location: ").append(getAudioFileS3Location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UtteranceAudioInputSpecification == false)
            return false;
        UtteranceAudioInputSpecification other = (UtteranceAudioInputSpecification) obj;
        if (other.getAudioFileS3Location() == null ^ this.getAudioFileS3Location() == null)
            return false;
        if (other.getAudioFileS3Location() != null && other.getAudioFileS3Location().equals(this.getAudioFileS3Location()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioFileS3Location() == null) ? 0 : getAudioFileS3Location().hashCode());
        return hashCode;
    }

    @Override
    public UtteranceAudioInputSpecification clone() {
        try {
            return (UtteranceAudioInputSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UtteranceAudioInputSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
