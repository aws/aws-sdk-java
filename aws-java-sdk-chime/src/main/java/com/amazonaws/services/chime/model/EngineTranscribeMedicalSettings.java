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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings specific to the Amazon Transcribe Medical engine.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/EngineTranscribeMedicalSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineTranscribeMedicalSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The language code specified for the Amazon Transcribe Medical engine.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The specialty specified for the Amazon Transcribe Medical engine.
     * </p>
     */
    private String specialty;
    /**
     * <p>
     * The type of transcription.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the vocabulary passed to Amazon Transcribe Medical.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe Medical. If you don't specify a Region, Amazon Chime uses the
     * meeting's Region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Set this field to <code>PHI</code> to identify personal health information in the transcription output.
     * </p>
     */
    private String contentIdentificationType;

    /**
     * <p>
     * The language code specified for the Amazon Transcribe Medical engine.
     * </p>
     * 
     * @param languageCode
     *        The language code specified for the Amazon Transcribe Medical engine.
     * @see TranscribeMedicalLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code specified for the Amazon Transcribe Medical engine.
     * </p>
     * 
     * @return The language code specified for the Amazon Transcribe Medical engine.
     * @see TranscribeMedicalLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code specified for the Amazon Transcribe Medical engine.
     * </p>
     * 
     * @param languageCode
     *        The language code specified for the Amazon Transcribe Medical engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeMedicalLanguageCode
     */

    public EngineTranscribeMedicalSettings withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code specified for the Amazon Transcribe Medical engine.
     * </p>
     * 
     * @param languageCode
     *        The language code specified for the Amazon Transcribe Medical engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeMedicalLanguageCode
     */

    public EngineTranscribeMedicalSettings withLanguageCode(TranscribeMedicalLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The specialty specified for the Amazon Transcribe Medical engine.
     * </p>
     * 
     * @param specialty
     *        The specialty specified for the Amazon Transcribe Medical engine.
     * @see TranscribeMedicalSpecialty
     */

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * <p>
     * The specialty specified for the Amazon Transcribe Medical engine.
     * </p>
     * 
     * @return The specialty specified for the Amazon Transcribe Medical engine.
     * @see TranscribeMedicalSpecialty
     */

    public String getSpecialty() {
        return this.specialty;
    }

    /**
     * <p>
     * The specialty specified for the Amazon Transcribe Medical engine.
     * </p>
     * 
     * @param specialty
     *        The specialty specified for the Amazon Transcribe Medical engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeMedicalSpecialty
     */

    public EngineTranscribeMedicalSettings withSpecialty(String specialty) {
        setSpecialty(specialty);
        return this;
    }

    /**
     * <p>
     * The specialty specified for the Amazon Transcribe Medical engine.
     * </p>
     * 
     * @param specialty
     *        The specialty specified for the Amazon Transcribe Medical engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeMedicalSpecialty
     */

    public EngineTranscribeMedicalSettings withSpecialty(TranscribeMedicalSpecialty specialty) {
        this.specialty = specialty.toString();
        return this;
    }

    /**
     * <p>
     * The type of transcription.
     * </p>
     * 
     * @param type
     *        The type of transcription.
     * @see TranscribeMedicalType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of transcription.
     * </p>
     * 
     * @return The type of transcription.
     * @see TranscribeMedicalType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of transcription.
     * </p>
     * 
     * @param type
     *        The type of transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeMedicalType
     */

    public EngineTranscribeMedicalSettings withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of transcription.
     * </p>
     * 
     * @param type
     *        The type of transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeMedicalType
     */

    public EngineTranscribeMedicalSettings withType(TranscribeMedicalType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary passed to Amazon Transcribe Medical.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary passed to Amazon Transcribe Medical.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary passed to Amazon Transcribe Medical.
     * </p>
     * 
     * @return The name of the vocabulary passed to Amazon Transcribe Medical.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary passed to Amazon Transcribe Medical.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary passed to Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineTranscribeMedicalSettings withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe Medical. If you don't specify a Region, Amazon Chime uses the
     * meeting's Region.
     * </p>
     * 
     * @param region
     *        The AWS Region passed to Amazon Transcribe Medical. If you don't specify a Region, Amazon Chime uses the
     *        meeting's Region.
     * @see TranscribeMedicalRegion
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe Medical. If you don't specify a Region, Amazon Chime uses the
     * meeting's Region.
     * </p>
     * 
     * @return The AWS Region passed to Amazon Transcribe Medical. If you don't specify a Region, Amazon Chime uses the
     *         meeting's Region.
     * @see TranscribeMedicalRegion
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe Medical. If you don't specify a Region, Amazon Chime uses the
     * meeting's Region.
     * </p>
     * 
     * @param region
     *        The AWS Region passed to Amazon Transcribe Medical. If you don't specify a Region, Amazon Chime uses the
     *        meeting's Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeMedicalRegion
     */

    public EngineTranscribeMedicalSettings withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe Medical. If you don't specify a Region, Amazon Chime uses the
     * meeting's Region.
     * </p>
     * 
     * @param region
     *        The AWS Region passed to Amazon Transcribe Medical. If you don't specify a Region, Amazon Chime uses the
     *        meeting's Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeMedicalRegion
     */

    public EngineTranscribeMedicalSettings withRegion(TranscribeMedicalRegion region) {
        this.region = region.toString();
        return this;
    }

    /**
     * <p>
     * Set this field to <code>PHI</code> to identify personal health information in the transcription output.
     * </p>
     * 
     * @param contentIdentificationType
     *        Set this field to <code>PHI</code> to identify personal health information in the transcription output.
     * @see TranscribeMedicalContentIdentificationType
     */

    public void setContentIdentificationType(String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
    }

    /**
     * <p>
     * Set this field to <code>PHI</code> to identify personal health information in the transcription output.
     * </p>
     * 
     * @return Set this field to <code>PHI</code> to identify personal health information in the transcription output.
     * @see TranscribeMedicalContentIdentificationType
     */

    public String getContentIdentificationType() {
        return this.contentIdentificationType;
    }

    /**
     * <p>
     * Set this field to <code>PHI</code> to identify personal health information in the transcription output.
     * </p>
     * 
     * @param contentIdentificationType
     *        Set this field to <code>PHI</code> to identify personal health information in the transcription output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeMedicalContentIdentificationType
     */

    public EngineTranscribeMedicalSettings withContentIdentificationType(String contentIdentificationType) {
        setContentIdentificationType(contentIdentificationType);
        return this;
    }

    /**
     * <p>
     * Set this field to <code>PHI</code> to identify personal health information in the transcription output.
     * </p>
     * 
     * @param contentIdentificationType
     *        Set this field to <code>PHI</code> to identify personal health information in the transcription output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeMedicalContentIdentificationType
     */

    public EngineTranscribeMedicalSettings withContentIdentificationType(TranscribeMedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getSpecialty() != null)
            sb.append("Specialty: ").append(getSpecialty()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getContentIdentificationType() != null)
            sb.append("ContentIdentificationType: ").append(getContentIdentificationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EngineTranscribeMedicalSettings == false)
            return false;
        EngineTranscribeMedicalSettings other = (EngineTranscribeMedicalSettings) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getSpecialty() == null ^ this.getSpecialty() == null)
            return false;
        if (other.getSpecialty() != null && other.getSpecialty().equals(this.getSpecialty()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getContentIdentificationType() == null ^ this.getContentIdentificationType() == null)
            return false;
        if (other.getContentIdentificationType() != null && other.getContentIdentificationType().equals(this.getContentIdentificationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getSpecialty() == null) ? 0 : getSpecialty().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getContentIdentificationType() == null) ? 0 : getContentIdentificationType().hashCode());
        return hashCode;
    }

    @Override
    public EngineTranscribeMedicalSettings clone() {
        try {
            return (EngineTranscribeMedicalSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.EngineTranscribeMedicalSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
