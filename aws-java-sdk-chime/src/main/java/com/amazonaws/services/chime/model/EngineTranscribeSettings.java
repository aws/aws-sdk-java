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
 * Settings specific to the Amazon Transcribe engine.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/EngineTranscribeSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineTranscribeSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The language code specified for the Amazon Transcribe engine.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The filtering method passed to Amazon Transcribe.
     * </p>
     */
    private String vocabularyFilterMethod;
    /**
     * <p>
     * The name of the vocabulary filter passed to Amazon Transcribe.
     * </p>
     */
    private String vocabularyFilterName;
    /**
     * <p>
     * The name of the vocabulary passed to Amazon Transcribe.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     * Region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Generates partial transcription results that are less likely to change as meeting attendees speak. It does so by
     * only allowing the last few words from the partial results to change.
     * </p>
     */
    private Boolean enablePartialResultsStabilization;
    /**
     * <p>
     * The stabity level of a partial results transcription. Determines how stable you want the transcription results to
     * be. A higher level means the transcription results are less likely to change.
     * </p>
     */
    private String partialResultsStability;
    /**
     * <p>
     * Set this field to <code>PII</code> to identify personally identifiable information in the transcription output.
     * </p>
     */
    private String contentIdentificationType;
    /**
     * <p>
     * Set this field to <code>PII</code> to redact personally identifiable information in the transcription output.
     * Content redaction is performed only upon complete transcription of the audio segments.
     * </p>
     */
    private String contentRedactionType;
    /**
     * <p>
     * Lists the PII entity types you want to identify or redact. To specify entity types, you must enable
     * <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>.
     * </p>
     * <p>
     * <code>PIIEntityTypes</code> must be comma-separated. The available values are: <code>BANK_ACCOUNT_NUMBER</code>,
     * <code>BANK_ROUTING, CREDIT_DEBIT_NUMBER</code>, <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>,
     * <code>PIN</code>, <code>EMAIL</code>, <code>ADDRESS</code>, <code>NAME</code>, <code>PHONE</code>,
     * <code>SSN</code>, and <code>ALL</code>.
     * </p>
     * <p>
     * <code>PiiEntityTypes</code> is an optional parameter with a default value of <code>ALL</code>.
     * </p>
     */
    private String piiEntityTypes;
    /**
     * <p>
     * The name of the language model used during transcription.
     * </p>
     */
    private String languageModelName;

    /**
     * <p>
     * The language code specified for the Amazon Transcribe engine.
     * </p>
     * 
     * @param languageCode
     *        The language code specified for the Amazon Transcribe engine.
     * @see TranscribeLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code specified for the Amazon Transcribe engine.
     * </p>
     * 
     * @return The language code specified for the Amazon Transcribe engine.
     * @see TranscribeLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code specified for the Amazon Transcribe engine.
     * </p>
     * 
     * @param languageCode
     *        The language code specified for the Amazon Transcribe engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeLanguageCode
     */

    public EngineTranscribeSettings withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code specified for the Amazon Transcribe engine.
     * </p>
     * 
     * @param languageCode
     *        The language code specified for the Amazon Transcribe engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeLanguageCode
     */

    public EngineTranscribeSettings withLanguageCode(TranscribeLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The filtering method passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        The filtering method passed to Amazon Transcribe.
     * @see TranscribeVocabularyFilterMethod
     */

    public void setVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
    }

    /**
     * <p>
     * The filtering method passed to Amazon Transcribe.
     * </p>
     * 
     * @return The filtering method passed to Amazon Transcribe.
     * @see TranscribeVocabularyFilterMethod
     */

    public String getVocabularyFilterMethod() {
        return this.vocabularyFilterMethod;
    }

    /**
     * <p>
     * The filtering method passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        The filtering method passed to Amazon Transcribe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeVocabularyFilterMethod
     */

    public EngineTranscribeSettings withVocabularyFilterMethod(String vocabularyFilterMethod) {
        setVocabularyFilterMethod(vocabularyFilterMethod);
        return this;
    }

    /**
     * <p>
     * The filtering method passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        The filtering method passed to Amazon Transcribe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeVocabularyFilterMethod
     */

    public EngineTranscribeSettings withVocabularyFilterMethod(TranscribeVocabularyFilterMethod vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod.toString();
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary filter passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter passed to Amazon Transcribe.
     */

    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter passed to Amazon Transcribe.
     * </p>
     * 
     * @return The name of the vocabulary filter passed to Amazon Transcribe.
     */

    public String getVocabularyFilterName() {
        return this.vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter passed to Amazon Transcribe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineTranscribeSettings withVocabularyFilterName(String vocabularyFilterName) {
        setVocabularyFilterName(vocabularyFilterName);
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary passed to Amazon Transcribe.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary passed to Amazon Transcribe.
     * </p>
     * 
     * @return The name of the vocabulary passed to Amazon Transcribe.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary passed to Amazon Transcribe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineTranscribeSettings withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     * Region.
     * </p>
     * 
     * @param region
     *        The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     *        Region.
     * @see TranscribeRegion
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     * Region.
     * </p>
     * 
     * @return The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the
     *         meeting's Region.
     * @see TranscribeRegion
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     * Region.
     * </p>
     * 
     * @param region
     *        The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeRegion
     */

    public EngineTranscribeSettings withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     * Region.
     * </p>
     * 
     * @param region
     *        The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeRegion
     */

    public EngineTranscribeSettings withRegion(TranscribeRegion region) {
        this.region = region.toString();
        return this;
    }

    /**
     * <p>
     * Generates partial transcription results that are less likely to change as meeting attendees speak. It does so by
     * only allowing the last few words from the partial results to change.
     * </p>
     * 
     * @param enablePartialResultsStabilization
     *        Generates partial transcription results that are less likely to change as meeting attendees speak. It does
     *        so by only allowing the last few words from the partial results to change.
     */

    public void setEnablePartialResultsStabilization(Boolean enablePartialResultsStabilization) {
        this.enablePartialResultsStabilization = enablePartialResultsStabilization;
    }

    /**
     * <p>
     * Generates partial transcription results that are less likely to change as meeting attendees speak. It does so by
     * only allowing the last few words from the partial results to change.
     * </p>
     * 
     * @return Generates partial transcription results that are less likely to change as meeting attendees speak. It
     *         does so by only allowing the last few words from the partial results to change.
     */

    public Boolean getEnablePartialResultsStabilization() {
        return this.enablePartialResultsStabilization;
    }

    /**
     * <p>
     * Generates partial transcription results that are less likely to change as meeting attendees speak. It does so by
     * only allowing the last few words from the partial results to change.
     * </p>
     * 
     * @param enablePartialResultsStabilization
     *        Generates partial transcription results that are less likely to change as meeting attendees speak. It does
     *        so by only allowing the last few words from the partial results to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineTranscribeSettings withEnablePartialResultsStabilization(Boolean enablePartialResultsStabilization) {
        setEnablePartialResultsStabilization(enablePartialResultsStabilization);
        return this;
    }

    /**
     * <p>
     * Generates partial transcription results that are less likely to change as meeting attendees speak. It does so by
     * only allowing the last few words from the partial results to change.
     * </p>
     * 
     * @return Generates partial transcription results that are less likely to change as meeting attendees speak. It
     *         does so by only allowing the last few words from the partial results to change.
     */

    public Boolean isEnablePartialResultsStabilization() {
        return this.enablePartialResultsStabilization;
    }

    /**
     * <p>
     * The stabity level of a partial results transcription. Determines how stable you want the transcription results to
     * be. A higher level means the transcription results are less likely to change.
     * </p>
     * 
     * @param partialResultsStability
     *        The stabity level of a partial results transcription. Determines how stable you want the transcription
     *        results to be. A higher level means the transcription results are less likely to change.
     * @see TranscribePartialResultsStability
     */

    public void setPartialResultsStability(String partialResultsStability) {
        this.partialResultsStability = partialResultsStability;
    }

    /**
     * <p>
     * The stabity level of a partial results transcription. Determines how stable you want the transcription results to
     * be. A higher level means the transcription results are less likely to change.
     * </p>
     * 
     * @return The stabity level of a partial results transcription. Determines how stable you want the transcription
     *         results to be. A higher level means the transcription results are less likely to change.
     * @see TranscribePartialResultsStability
     */

    public String getPartialResultsStability() {
        return this.partialResultsStability;
    }

    /**
     * <p>
     * The stabity level of a partial results transcription. Determines how stable you want the transcription results to
     * be. A higher level means the transcription results are less likely to change.
     * </p>
     * 
     * @param partialResultsStability
     *        The stabity level of a partial results transcription. Determines how stable you want the transcription
     *        results to be. A higher level means the transcription results are less likely to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribePartialResultsStability
     */

    public EngineTranscribeSettings withPartialResultsStability(String partialResultsStability) {
        setPartialResultsStability(partialResultsStability);
        return this;
    }

    /**
     * <p>
     * The stabity level of a partial results transcription. Determines how stable you want the transcription results to
     * be. A higher level means the transcription results are less likely to change.
     * </p>
     * 
     * @param partialResultsStability
     *        The stabity level of a partial results transcription. Determines how stable you want the transcription
     *        results to be. A higher level means the transcription results are less likely to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribePartialResultsStability
     */

    public EngineTranscribeSettings withPartialResultsStability(TranscribePartialResultsStability partialResultsStability) {
        this.partialResultsStability = partialResultsStability.toString();
        return this;
    }

    /**
     * <p>
     * Set this field to <code>PII</code> to identify personally identifiable information in the transcription output.
     * </p>
     * 
     * @param contentIdentificationType
     *        Set this field to <code>PII</code> to identify personally identifiable information in the transcription
     *        output.
     * @see TranscribeContentIdentificationType
     */

    public void setContentIdentificationType(String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
    }

    /**
     * <p>
     * Set this field to <code>PII</code> to identify personally identifiable information in the transcription output.
     * </p>
     * 
     * @return Set this field to <code>PII</code> to identify personally identifiable information in the transcription
     *         output.
     * @see TranscribeContentIdentificationType
     */

    public String getContentIdentificationType() {
        return this.contentIdentificationType;
    }

    /**
     * <p>
     * Set this field to <code>PII</code> to identify personally identifiable information in the transcription output.
     * </p>
     * 
     * @param contentIdentificationType
     *        Set this field to <code>PII</code> to identify personally identifiable information in the transcription
     *        output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeContentIdentificationType
     */

    public EngineTranscribeSettings withContentIdentificationType(String contentIdentificationType) {
        setContentIdentificationType(contentIdentificationType);
        return this;
    }

    /**
     * <p>
     * Set this field to <code>PII</code> to identify personally identifiable information in the transcription output.
     * </p>
     * 
     * @param contentIdentificationType
     *        Set this field to <code>PII</code> to identify personally identifiable information in the transcription
     *        output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeContentIdentificationType
     */

    public EngineTranscribeSettings withContentIdentificationType(TranscribeContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
        return this;
    }

    /**
     * <p>
     * Set this field to <code>PII</code> to redact personally identifiable information in the transcription output.
     * Content redaction is performed only upon complete transcription of the audio segments.
     * </p>
     * 
     * @param contentRedactionType
     *        Set this field to <code>PII</code> to redact personally identifiable information in the transcription
     *        output. Content redaction is performed only upon complete transcription of the audio segments.
     * @see TranscribeContentRedactionType
     */

    public void setContentRedactionType(String contentRedactionType) {
        this.contentRedactionType = contentRedactionType;
    }

    /**
     * <p>
     * Set this field to <code>PII</code> to redact personally identifiable information in the transcription output.
     * Content redaction is performed only upon complete transcription of the audio segments.
     * </p>
     * 
     * @return Set this field to <code>PII</code> to redact personally identifiable information in the transcription
     *         output. Content redaction is performed only upon complete transcription of the audio segments.
     * @see TranscribeContentRedactionType
     */

    public String getContentRedactionType() {
        return this.contentRedactionType;
    }

    /**
     * <p>
     * Set this field to <code>PII</code> to redact personally identifiable information in the transcription output.
     * Content redaction is performed only upon complete transcription of the audio segments.
     * </p>
     * 
     * @param contentRedactionType
     *        Set this field to <code>PII</code> to redact personally identifiable information in the transcription
     *        output. Content redaction is performed only upon complete transcription of the audio segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeContentRedactionType
     */

    public EngineTranscribeSettings withContentRedactionType(String contentRedactionType) {
        setContentRedactionType(contentRedactionType);
        return this;
    }

    /**
     * <p>
     * Set this field to <code>PII</code> to redact personally identifiable information in the transcription output.
     * Content redaction is performed only upon complete transcription of the audio segments.
     * </p>
     * 
     * @param contentRedactionType
     *        Set this field to <code>PII</code> to redact personally identifiable information in the transcription
     *        output. Content redaction is performed only upon complete transcription of the audio segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeContentRedactionType
     */

    public EngineTranscribeSettings withContentRedactionType(TranscribeContentRedactionType contentRedactionType) {
        this.contentRedactionType = contentRedactionType.toString();
        return this;
    }

    /**
     * <p>
     * Lists the PII entity types you want to identify or redact. To specify entity types, you must enable
     * <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>.
     * </p>
     * <p>
     * <code>PIIEntityTypes</code> must be comma-separated. The available values are: <code>BANK_ACCOUNT_NUMBER</code>,
     * <code>BANK_ROUTING, CREDIT_DEBIT_NUMBER</code>, <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>,
     * <code>PIN</code>, <code>EMAIL</code>, <code>ADDRESS</code>, <code>NAME</code>, <code>PHONE</code>,
     * <code>SSN</code>, and <code>ALL</code>.
     * </p>
     * <p>
     * <code>PiiEntityTypes</code> is an optional parameter with a default value of <code>ALL</code>.
     * </p>
     * 
     * @param piiEntityTypes
     *        Lists the PII entity types you want to identify or redact. To specify entity types, you must enable
     *        <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>.</p>
     *        <p>
     *        <code>PIIEntityTypes</code> must be comma-separated. The available values are:
     *        <code>BANK_ACCOUNT_NUMBER</code>, <code>BANK_ROUTING, CREDIT_DEBIT_NUMBER</code>,
     *        <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>, <code>PIN</code>, <code>EMAIL</code>,
     *        <code>ADDRESS</code>, <code>NAME</code>, <code>PHONE</code>, <code>SSN</code>, and <code>ALL</code>.
     *        </p>
     *        <p>
     *        <code>PiiEntityTypes</code> is an optional parameter with a default value of <code>ALL</code>.
     */

    public void setPiiEntityTypes(String piiEntityTypes) {
        this.piiEntityTypes = piiEntityTypes;
    }

    /**
     * <p>
     * Lists the PII entity types you want to identify or redact. To specify entity types, you must enable
     * <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>.
     * </p>
     * <p>
     * <code>PIIEntityTypes</code> must be comma-separated. The available values are: <code>BANK_ACCOUNT_NUMBER</code>,
     * <code>BANK_ROUTING, CREDIT_DEBIT_NUMBER</code>, <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>,
     * <code>PIN</code>, <code>EMAIL</code>, <code>ADDRESS</code>, <code>NAME</code>, <code>PHONE</code>,
     * <code>SSN</code>, and <code>ALL</code>.
     * </p>
     * <p>
     * <code>PiiEntityTypes</code> is an optional parameter with a default value of <code>ALL</code>.
     * </p>
     * 
     * @return Lists the PII entity types you want to identify or redact. To specify entity types, you must enable
     *         <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>.</p>
     *         <p>
     *         <code>PIIEntityTypes</code> must be comma-separated. The available values are:
     *         <code>BANK_ACCOUNT_NUMBER</code>, <code>BANK_ROUTING, CREDIT_DEBIT_NUMBER</code>,
     *         <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>, <code>PIN</code>, <code>EMAIL</code>,
     *         <code>ADDRESS</code>, <code>NAME</code>, <code>PHONE</code>, <code>SSN</code>, and <code>ALL</code>.
     *         </p>
     *         <p>
     *         <code>PiiEntityTypes</code> is an optional parameter with a default value of <code>ALL</code>.
     */

    public String getPiiEntityTypes() {
        return this.piiEntityTypes;
    }

    /**
     * <p>
     * Lists the PII entity types you want to identify or redact. To specify entity types, you must enable
     * <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>.
     * </p>
     * <p>
     * <code>PIIEntityTypes</code> must be comma-separated. The available values are: <code>BANK_ACCOUNT_NUMBER</code>,
     * <code>BANK_ROUTING, CREDIT_DEBIT_NUMBER</code>, <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>,
     * <code>PIN</code>, <code>EMAIL</code>, <code>ADDRESS</code>, <code>NAME</code>, <code>PHONE</code>,
     * <code>SSN</code>, and <code>ALL</code>.
     * </p>
     * <p>
     * <code>PiiEntityTypes</code> is an optional parameter with a default value of <code>ALL</code>.
     * </p>
     * 
     * @param piiEntityTypes
     *        Lists the PII entity types you want to identify or redact. To specify entity types, you must enable
     *        <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>.</p>
     *        <p>
     *        <code>PIIEntityTypes</code> must be comma-separated. The available values are:
     *        <code>BANK_ACCOUNT_NUMBER</code>, <code>BANK_ROUTING, CREDIT_DEBIT_NUMBER</code>,
     *        <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>, <code>PIN</code>, <code>EMAIL</code>,
     *        <code>ADDRESS</code>, <code>NAME</code>, <code>PHONE</code>, <code>SSN</code>, and <code>ALL</code>.
     *        </p>
     *        <p>
     *        <code>PiiEntityTypes</code> is an optional parameter with a default value of <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineTranscribeSettings withPiiEntityTypes(String piiEntityTypes) {
        setPiiEntityTypes(piiEntityTypes);
        return this;
    }

    /**
     * <p>
     * The name of the language model used during transcription.
     * </p>
     * 
     * @param languageModelName
     *        The name of the language model used during transcription.
     */

    public void setLanguageModelName(String languageModelName) {
        this.languageModelName = languageModelName;
    }

    /**
     * <p>
     * The name of the language model used during transcription.
     * </p>
     * 
     * @return The name of the language model used during transcription.
     */

    public String getLanguageModelName() {
        return this.languageModelName;
    }

    /**
     * <p>
     * The name of the language model used during transcription.
     * </p>
     * 
     * @param languageModelName
     *        The name of the language model used during transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineTranscribeSettings withLanguageModelName(String languageModelName) {
        setLanguageModelName(languageModelName);
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
        if (getVocabularyFilterMethod() != null)
            sb.append("VocabularyFilterMethod: ").append(getVocabularyFilterMethod()).append(",");
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: ").append(getVocabularyFilterName()).append(",");
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getEnablePartialResultsStabilization() != null)
            sb.append("EnablePartialResultsStabilization: ").append(getEnablePartialResultsStabilization()).append(",");
        if (getPartialResultsStability() != null)
            sb.append("PartialResultsStability: ").append(getPartialResultsStability()).append(",");
        if (getContentIdentificationType() != null)
            sb.append("ContentIdentificationType: ").append(getContentIdentificationType()).append(",");
        if (getContentRedactionType() != null)
            sb.append("ContentRedactionType: ").append(getContentRedactionType()).append(",");
        if (getPiiEntityTypes() != null)
            sb.append("PiiEntityTypes: ").append(getPiiEntityTypes()).append(",");
        if (getLanguageModelName() != null)
            sb.append("LanguageModelName: ").append(getLanguageModelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EngineTranscribeSettings == false)
            return false;
        EngineTranscribeSettings other = (EngineTranscribeSettings) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getVocabularyFilterMethod() == null ^ this.getVocabularyFilterMethod() == null)
            return false;
        if (other.getVocabularyFilterMethod() != null && other.getVocabularyFilterMethod().equals(this.getVocabularyFilterMethod()) == false)
            return false;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getEnablePartialResultsStabilization() == null ^ this.getEnablePartialResultsStabilization() == null)
            return false;
        if (other.getEnablePartialResultsStabilization() != null
                && other.getEnablePartialResultsStabilization().equals(this.getEnablePartialResultsStabilization()) == false)
            return false;
        if (other.getPartialResultsStability() == null ^ this.getPartialResultsStability() == null)
            return false;
        if (other.getPartialResultsStability() != null && other.getPartialResultsStability().equals(this.getPartialResultsStability()) == false)
            return false;
        if (other.getContentIdentificationType() == null ^ this.getContentIdentificationType() == null)
            return false;
        if (other.getContentIdentificationType() != null && other.getContentIdentificationType().equals(this.getContentIdentificationType()) == false)
            return false;
        if (other.getContentRedactionType() == null ^ this.getContentRedactionType() == null)
            return false;
        if (other.getContentRedactionType() != null && other.getContentRedactionType().equals(this.getContentRedactionType()) == false)
            return false;
        if (other.getPiiEntityTypes() == null ^ this.getPiiEntityTypes() == null)
            return false;
        if (other.getPiiEntityTypes() != null && other.getPiiEntityTypes().equals(this.getPiiEntityTypes()) == false)
            return false;
        if (other.getLanguageModelName() == null ^ this.getLanguageModelName() == null)
            return false;
        if (other.getLanguageModelName() != null && other.getLanguageModelName().equals(this.getLanguageModelName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterMethod() == null) ? 0 : getVocabularyFilterMethod().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getEnablePartialResultsStabilization() == null) ? 0 : getEnablePartialResultsStabilization().hashCode());
        hashCode = prime * hashCode + ((getPartialResultsStability() == null) ? 0 : getPartialResultsStability().hashCode());
        hashCode = prime * hashCode + ((getContentIdentificationType() == null) ? 0 : getContentIdentificationType().hashCode());
        hashCode = prime * hashCode + ((getContentRedactionType() == null) ? 0 : getContentRedactionType().hashCode());
        hashCode = prime * hashCode + ((getPiiEntityTypes() == null) ? 0 : getPiiEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getLanguageModelName() == null) ? 0 : getLanguageModelName().hashCode());
        return hashCode;
    }

    @Override
    public EngineTranscribeSettings clone() {
        try {
            return (EngineTranscribeSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.EngineTranscribeSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
