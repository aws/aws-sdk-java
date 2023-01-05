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
package com.amazonaws.services.chimesdkmeetings.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the current transcription operation. Must contain <code>EngineTranscribeSettings</code> or
 * <code>EngineTranscribeMedicalSettings</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/TranscriptionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranscriptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The transcription configuration settings passed to Amazon Transcribe.
     * </p>
     */
    private EngineTranscribeSettings engineTranscribeSettings;
    /**
     * <p>
     * The transcription configuration settings passed to Amazon Transcribe Medical.
     * </p>
     */
    private EngineTranscribeMedicalSettings engineTranscribeMedicalSettings;

    /**
     * <p>
     * The transcription configuration settings passed to Amazon Transcribe.
     * </p>
     * 
     * @param engineTranscribeSettings
     *        The transcription configuration settings passed to Amazon Transcribe.
     */

    public void setEngineTranscribeSettings(EngineTranscribeSettings engineTranscribeSettings) {
        this.engineTranscribeSettings = engineTranscribeSettings;
    }

    /**
     * <p>
     * The transcription configuration settings passed to Amazon Transcribe.
     * </p>
     * 
     * @return The transcription configuration settings passed to Amazon Transcribe.
     */

    public EngineTranscribeSettings getEngineTranscribeSettings() {
        return this.engineTranscribeSettings;
    }

    /**
     * <p>
     * The transcription configuration settings passed to Amazon Transcribe.
     * </p>
     * 
     * @param engineTranscribeSettings
     *        The transcription configuration settings passed to Amazon Transcribe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionConfiguration withEngineTranscribeSettings(EngineTranscribeSettings engineTranscribeSettings) {
        setEngineTranscribeSettings(engineTranscribeSettings);
        return this;
    }

    /**
     * <p>
     * The transcription configuration settings passed to Amazon Transcribe Medical.
     * </p>
     * 
     * @param engineTranscribeMedicalSettings
     *        The transcription configuration settings passed to Amazon Transcribe Medical.
     */

    public void setEngineTranscribeMedicalSettings(EngineTranscribeMedicalSettings engineTranscribeMedicalSettings) {
        this.engineTranscribeMedicalSettings = engineTranscribeMedicalSettings;
    }

    /**
     * <p>
     * The transcription configuration settings passed to Amazon Transcribe Medical.
     * </p>
     * 
     * @return The transcription configuration settings passed to Amazon Transcribe Medical.
     */

    public EngineTranscribeMedicalSettings getEngineTranscribeMedicalSettings() {
        return this.engineTranscribeMedicalSettings;
    }

    /**
     * <p>
     * The transcription configuration settings passed to Amazon Transcribe Medical.
     * </p>
     * 
     * @param engineTranscribeMedicalSettings
     *        The transcription configuration settings passed to Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionConfiguration withEngineTranscribeMedicalSettings(EngineTranscribeMedicalSettings engineTranscribeMedicalSettings) {
        setEngineTranscribeMedicalSettings(engineTranscribeMedicalSettings);
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
        if (getEngineTranscribeSettings() != null)
            sb.append("EngineTranscribeSettings: ").append(getEngineTranscribeSettings()).append(",");
        if (getEngineTranscribeMedicalSettings() != null)
            sb.append("EngineTranscribeMedicalSettings: ").append(getEngineTranscribeMedicalSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptionConfiguration == false)
            return false;
        TranscriptionConfiguration other = (TranscriptionConfiguration) obj;
        if (other.getEngineTranscribeSettings() == null ^ this.getEngineTranscribeSettings() == null)
            return false;
        if (other.getEngineTranscribeSettings() != null && other.getEngineTranscribeSettings().equals(this.getEngineTranscribeSettings()) == false)
            return false;
        if (other.getEngineTranscribeMedicalSettings() == null ^ this.getEngineTranscribeMedicalSettings() == null)
            return false;
        if (other.getEngineTranscribeMedicalSettings() != null
                && other.getEngineTranscribeMedicalSettings().equals(this.getEngineTranscribeMedicalSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineTranscribeSettings() == null) ? 0 : getEngineTranscribeSettings().hashCode());
        hashCode = prime * hashCode + ((getEngineTranscribeMedicalSettings() == null) ? 0 : getEngineTranscribeMedicalSettings().hashCode());
        return hashCode;
    }

    @Override
    public TranscriptionConfiguration clone() {
        try {
            return (TranscriptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmeetings.model.transform.TranscriptionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
