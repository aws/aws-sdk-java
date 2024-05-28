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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the configuration settings for an Amazon Transcribe processor.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/AmazonTranscribeProcessorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTranscribeProcessorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The language code that represents the language spoken in your audio.
     * </p>
     * <p>
     * If you're unsure of the language spoken in your audio, consider using <code>IdentifyLanguage</code> to enable
     * automatic language identification.
     * </p>
     * <p>
     * For a list of languages that real-time Call Analytics supports, see the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages table</a> in
     * the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The name of the custom vocabulary that you specified in your Call Analytics request.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The name of the custom vocabulary filter that you specified in your Call Analytics request.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     */
    private String vocabularyFilterName;
    /**
     * <p>
     * The vocabulary filtering method used in your Call Analytics transcription.
     * </p>
     */
    private String vocabularyFilterMethod;
    /**
     * <p>
     * Enables speaker partitioning (diarization) in your transcription output. Speaker partitioning labels the speech
     * from individual speakers in your media file.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers (diarization)</a>
     * in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     */
    private Boolean showSpeakerLabel;
    /**
     * <p>
     * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in
     * your output, but may impact accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     */
    private Boolean enablePartialResultsStabilization;
    /**
     * <p>
     * The level of stability to use when you enable partial results stabilization (
     * <code>EnablePartialResultsStabilization</code>).
     * </p>
     * <p>
     * Low stability provides the highest accuracy. High stability transcribes faster, but with slightly lower accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     */
    private String partialResultsStability;
    /**
     * <p>
     * Labels all personally identifiable information (PII) identified in your transcript.
     * </p>
     * <p>
     * Content identification is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is flagged
     * upon complete transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set <code>ContentIdentificationType</code> and <code>ContentRedactionType</code> in the same request.
     * If you set both, your request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     */
    private String contentIdentificationType;
    /**
     * <p>
     * Redacts all personally identifiable information (PII) identified in your transcript.
     * </p>
     * <p>
     * Content redaction is performed at the segment level; PII specified in PiiEntityTypes is redacted upon complete
     * transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set ContentRedactionType and ContentIdentificationType in the same request. If you set both, your
     * request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     */
    private String contentRedactionType;
    /**
     * <p>
     * The types of personally identifiable information (PII) to redact from a transcript. You can include as many types
     * as you'd like, or you can select <code>ALL</code>.
     * </p>
     * <p>
     * To include <code>PiiEntityTypes</code> in your Call Analytics request, you must also include
     * <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>, but you can't include both.
     * </p>
     * <p>
     * Values must be comma-separated and can include: <code>ADDRESS</code>, <code>BANK_ACCOUNT_NUMBER</code>,
     * <code>BANK_ROUTING</code>, <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>,
     * <code>CREDIT_DEBIT_NUMBER</code>, <code>EMAIL</code>, <code>NAME</code>, <code>PHONE</code>, <code>PIN</code>,
     * <code>SSN</code>, or <code>ALL</code>.
     * </p>
     * <p>
     * If you leave this parameter empty, the default behavior is equivalent to <code>ALL</code>.
     * </p>
     */
    private String piiEntityTypes;
    /**
     * <p>
     * The name of the custom language model that you want to use when processing your transcription. Note that language
     * model names are case sensitive.
     * </p>
     * <p>
     * The language of the specified language model must match the language code you specify in your transcription
     * request. If the languages don't match, the custom language model isn't applied. There are no errors or warnings
     * associated with a language mismatch.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language models</a> in
     * the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     */
    private String languageModelName;
    /**
     * <p>
     * If true, <code>TranscriptEvents</code> with <code>IsPartial: true</code> are filtered out of the insights target.
     * </p>
     */
    private Boolean filterPartialResults;
    /**
     * <p>
     * Turns language identification on or off.
     * </p>
     */
    private Boolean identifyLanguage;
    /**
     * <p>
     * The language options for the transcription, such as automatic language detection.
     * </p>
     */
    private String languageOptions;
    /**
     * <p>
     * The preferred language for the transcription.
     * </p>
     */
    private String preferredLanguage;
    /**
     * <p>
     * The names of the custom vocabulary or vocabularies used during transcription.
     * </p>
     */
    private String vocabularyNames;
    /**
     * <p>
     * The names of the custom vocabulary filter or filters using during transcription.
     * </p>
     */
    private String vocabularyFilterNames;

    /**
     * <p>
     * The language code that represents the language spoken in your audio.
     * </p>
     * <p>
     * If you're unsure of the language spoken in your audio, consider using <code>IdentifyLanguage</code> to enable
     * automatic language identification.
     * </p>
     * <p>
     * For a list of languages that real-time Call Analytics supports, see the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages table</a> in
     * the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language spoken in your audio.</p>
     *        <p>
     *        If you're unsure of the language spoken in your audio, consider using <code>IdentifyLanguage</code> to
     *        enable automatic language identification.
     *        </p>
     *        <p>
     *        For a list of languages that real-time Call Analytics supports, see the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages
     *        table</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @see CallAnalyticsLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code that represents the language spoken in your audio.
     * </p>
     * <p>
     * If you're unsure of the language spoken in your audio, consider using <code>IdentifyLanguage</code> to enable
     * automatic language identification.
     * </p>
     * <p>
     * For a list of languages that real-time Call Analytics supports, see the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages table</a> in
     * the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return The language code that represents the language spoken in your audio.</p>
     *         <p>
     *         If you're unsure of the language spoken in your audio, consider using <code>IdentifyLanguage</code> to
     *         enable automatic language identification.
     *         </p>
     *         <p>
     *         For a list of languages that real-time Call Analytics supports, see the <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages
     *         table</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @see CallAnalyticsLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code that represents the language spoken in your audio.
     * </p>
     * <p>
     * If you're unsure of the language spoken in your audio, consider using <code>IdentifyLanguage</code> to enable
     * automatic language identification.
     * </p>
     * <p>
     * For a list of languages that real-time Call Analytics supports, see the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages table</a> in
     * the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language spoken in your audio.</p>
     *        <p>
     *        If you're unsure of the language spoken in your audio, consider using <code>IdentifyLanguage</code> to
     *        enable automatic language identification.
     *        </p>
     *        <p>
     *        For a list of languages that real-time Call Analytics supports, see the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages
     *        table</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsLanguageCode
     */

    public AmazonTranscribeProcessorConfiguration withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language spoken in your audio.
     * </p>
     * <p>
     * If you're unsure of the language spoken in your audio, consider using <code>IdentifyLanguage</code> to enable
     * automatic language identification.
     * </p>
     * <p>
     * For a list of languages that real-time Call Analytics supports, see the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages table</a> in
     * the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language spoken in your audio.</p>
     *        <p>
     *        If you're unsure of the language spoken in your audio, consider using <code>IdentifyLanguage</code> to
     *        enable automatic language identification.
     *        </p>
     *        <p>
     *        For a list of languages that real-time Call Analytics supports, see the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages
     *        table</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsLanguageCode
     */

    public AmazonTranscribeProcessorConfiguration withLanguageCode(CallAnalyticsLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The name of the custom vocabulary that you specified in your Call Analytics request.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the custom vocabulary that you specified in your Call Analytics request.</p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 200.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary that you specified in your Call Analytics request.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     * 
     * @return The name of the custom vocabulary that you specified in your Call Analytics request.</p>
     *         <p>
     *         Length Constraints: Minimum length of 1. Maximum length of 200.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary that you specified in your Call Analytics request.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the custom vocabulary that you specified in your Call Analytics request.</p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeProcessorConfiguration withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter that you specified in your Call Analytics request.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the custom vocabulary filter that you specified in your Call Analytics request.</p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 200.
     */

    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter that you specified in your Call Analytics request.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     * 
     * @return The name of the custom vocabulary filter that you specified in your Call Analytics request.</p>
     *         <p>
     *         Length Constraints: Minimum length of 1. Maximum length of 200.
     */

    public String getVocabularyFilterName() {
        return this.vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter that you specified in your Call Analytics request.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the custom vocabulary filter that you specified in your Call Analytics request.</p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeProcessorConfiguration withVocabularyFilterName(String vocabularyFilterName) {
        setVocabularyFilterName(vocabularyFilterName);
        return this;
    }

    /**
     * <p>
     * The vocabulary filtering method used in your Call Analytics transcription.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        The vocabulary filtering method used in your Call Analytics transcription.
     * @see VocabularyFilterMethod
     */

    public void setVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
    }

    /**
     * <p>
     * The vocabulary filtering method used in your Call Analytics transcription.
     * </p>
     * 
     * @return The vocabulary filtering method used in your Call Analytics transcription.
     * @see VocabularyFilterMethod
     */

    public String getVocabularyFilterMethod() {
        return this.vocabularyFilterMethod;
    }

    /**
     * <p>
     * The vocabulary filtering method used in your Call Analytics transcription.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        The vocabulary filtering method used in your Call Analytics transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyFilterMethod
     */

    public AmazonTranscribeProcessorConfiguration withVocabularyFilterMethod(String vocabularyFilterMethod) {
        setVocabularyFilterMethod(vocabularyFilterMethod);
        return this;
    }

    /**
     * <p>
     * The vocabulary filtering method used in your Call Analytics transcription.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        The vocabulary filtering method used in your Call Analytics transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyFilterMethod
     */

    public AmazonTranscribeProcessorConfiguration withVocabularyFilterMethod(VocabularyFilterMethod vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod.toString();
        return this;
    }

    /**
     * <p>
     * Enables speaker partitioning (diarization) in your transcription output. Speaker partitioning labels the speech
     * from individual speakers in your media file.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers (diarization)</a>
     * in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param showSpeakerLabel
     *        Enables speaker partitioning (diarization) in your transcription output. Speaker partitioning labels the
     *        speech from individual speakers in your media file.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers
     *        (diarization)</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public void setShowSpeakerLabel(Boolean showSpeakerLabel) {
        this.showSpeakerLabel = showSpeakerLabel;
    }

    /**
     * <p>
     * Enables speaker partitioning (diarization) in your transcription output. Speaker partitioning labels the speech
     * from individual speakers in your media file.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers (diarization)</a>
     * in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return Enables speaker partitioning (diarization) in your transcription output. Speaker partitioning labels the
     *         speech from individual speakers in your media file.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers
     *         (diarization)</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public Boolean getShowSpeakerLabel() {
        return this.showSpeakerLabel;
    }

    /**
     * <p>
     * Enables speaker partitioning (diarization) in your transcription output. Speaker partitioning labels the speech
     * from individual speakers in your media file.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers (diarization)</a>
     * in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param showSpeakerLabel
     *        Enables speaker partitioning (diarization) in your transcription output. Speaker partitioning labels the
     *        speech from individual speakers in your media file.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers
     *        (diarization)</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeProcessorConfiguration withShowSpeakerLabel(Boolean showSpeakerLabel) {
        setShowSpeakerLabel(showSpeakerLabel);
        return this;
    }

    /**
     * <p>
     * Enables speaker partitioning (diarization) in your transcription output. Speaker partitioning labels the speech
     * from individual speakers in your media file.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers (diarization)</a>
     * in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return Enables speaker partitioning (diarization) in your transcription output. Speaker partitioning labels the
     *         speech from individual speakers in your media file.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/diarization.html">Partitioning speakers
     *         (diarization)</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public Boolean isShowSpeakerLabel() {
        return this.showSpeakerLabel;
    }

    /**
     * <p>
     * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in
     * your output, but may impact accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param enablePartialResultsStabilization
     *        Enables partial result stabilization for your transcription. Partial result stabilization can reduce
     *        latency in your output, but may impact accuracy.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     *        >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public void setEnablePartialResultsStabilization(Boolean enablePartialResultsStabilization) {
        this.enablePartialResultsStabilization = enablePartialResultsStabilization;
    }

    /**
     * <p>
     * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in
     * your output, but may impact accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return Enables partial result stabilization for your transcription. Partial result stabilization can reduce
     *         latency in your output, but may impact accuracy.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     *         >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public Boolean getEnablePartialResultsStabilization() {
        return this.enablePartialResultsStabilization;
    }

    /**
     * <p>
     * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in
     * your output, but may impact accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param enablePartialResultsStabilization
     *        Enables partial result stabilization for your transcription. Partial result stabilization can reduce
     *        latency in your output, but may impact accuracy.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     *        >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeProcessorConfiguration withEnablePartialResultsStabilization(Boolean enablePartialResultsStabilization) {
        setEnablePartialResultsStabilization(enablePartialResultsStabilization);
        return this;
    }

    /**
     * <p>
     * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in
     * your output, but may impact accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return Enables partial result stabilization for your transcription. Partial result stabilization can reduce
     *         latency in your output, but may impact accuracy.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     *         >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public Boolean isEnablePartialResultsStabilization() {
        return this.enablePartialResultsStabilization;
    }

    /**
     * <p>
     * The level of stability to use when you enable partial results stabilization (
     * <code>EnablePartialResultsStabilization</code>).
     * </p>
     * <p>
     * Low stability provides the highest accuracy. High stability transcribes faster, but with slightly lower accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param partialResultsStability
     *        The level of stability to use when you enable partial results stabilization (
     *        <code>EnablePartialResultsStabilization</code>).</p>
     *        <p>
     *        Low stability provides the highest accuracy. High stability transcribes faster, but with slightly lower
     *        accuracy.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     *        >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @see PartialResultsStability
     */

    public void setPartialResultsStability(String partialResultsStability) {
        this.partialResultsStability = partialResultsStability;
    }

    /**
     * <p>
     * The level of stability to use when you enable partial results stabilization (
     * <code>EnablePartialResultsStabilization</code>).
     * </p>
     * <p>
     * Low stability provides the highest accuracy. High stability transcribes faster, but with slightly lower accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return The level of stability to use when you enable partial results stabilization (
     *         <code>EnablePartialResultsStabilization</code>).</p>
     *         <p>
     *         Low stability provides the highest accuracy. High stability transcribes faster, but with slightly lower
     *         accuracy.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     *         >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @see PartialResultsStability
     */

    public String getPartialResultsStability() {
        return this.partialResultsStability;
    }

    /**
     * <p>
     * The level of stability to use when you enable partial results stabilization (
     * <code>EnablePartialResultsStabilization</code>).
     * </p>
     * <p>
     * Low stability provides the highest accuracy. High stability transcribes faster, but with slightly lower accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param partialResultsStability
     *        The level of stability to use when you enable partial results stabilization (
     *        <code>EnablePartialResultsStabilization</code>).</p>
     *        <p>
     *        Low stability provides the highest accuracy. High stability transcribes faster, but with slightly lower
     *        accuracy.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     *        >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartialResultsStability
     */

    public AmazonTranscribeProcessorConfiguration withPartialResultsStability(String partialResultsStability) {
        setPartialResultsStability(partialResultsStability);
        return this;
    }

    /**
     * <p>
     * The level of stability to use when you enable partial results stabilization (
     * <code>EnablePartialResultsStabilization</code>).
     * </p>
     * <p>
     * Low stability provides the highest accuracy. High stability transcribes faster, but with slightly lower accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param partialResultsStability
     *        The level of stability to use when you enable partial results stabilization (
     *        <code>EnablePartialResultsStabilization</code>).</p>
     *        <p>
     *        Low stability provides the highest accuracy. High stability transcribes faster, but with slightly lower
     *        accuracy.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     *        >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartialResultsStability
     */

    public AmazonTranscribeProcessorConfiguration withPartialResultsStability(PartialResultsStability partialResultsStability) {
        this.partialResultsStability = partialResultsStability.toString();
        return this;
    }

    /**
     * <p>
     * Labels all personally identifiable information (PII) identified in your transcript.
     * </p>
     * <p>
     * Content identification is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is flagged
     * upon complete transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set <code>ContentIdentificationType</code> and <code>ContentRedactionType</code> in the same request.
     * If you set both, your request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param contentIdentificationType
     *        Labels all personally identifiable information (PII) identified in your transcript.</p>
     *        <p>
     *        Content identification is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is
     *        flagged upon complete transcription of an audio segment.
     *        </p>
     *        <p>
     *        You can’t set <code>ContentIdentificationType</code> and <code>ContentRedactionType</code> in the same
     *        request. If you set both, your request returns a <code>BadRequestException</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting or identifying
     *        personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @see ContentType
     */

    public void setContentIdentificationType(String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
    }

    /**
     * <p>
     * Labels all personally identifiable information (PII) identified in your transcript.
     * </p>
     * <p>
     * Content identification is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is flagged
     * upon complete transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set <code>ContentIdentificationType</code> and <code>ContentRedactionType</code> in the same request.
     * If you set both, your request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return Labels all personally identifiable information (PII) identified in your transcript.</p>
     *         <p>
     *         Content identification is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is
     *         flagged upon complete transcription of an audio segment.
     *         </p>
     *         <p>
     *         You can’t set <code>ContentIdentificationType</code> and <code>ContentRedactionType</code> in the same
     *         request. If you set both, your request returns a <code>BadRequestException</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting or identifying
     *         personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @see ContentType
     */

    public String getContentIdentificationType() {
        return this.contentIdentificationType;
    }

    /**
     * <p>
     * Labels all personally identifiable information (PII) identified in your transcript.
     * </p>
     * <p>
     * Content identification is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is flagged
     * upon complete transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set <code>ContentIdentificationType</code> and <code>ContentRedactionType</code> in the same request.
     * If you set both, your request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param contentIdentificationType
     *        Labels all personally identifiable information (PII) identified in your transcript.</p>
     *        <p>
     *        Content identification is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is
     *        flagged upon complete transcription of an audio segment.
     *        </p>
     *        <p>
     *        You can’t set <code>ContentIdentificationType</code> and <code>ContentRedactionType</code> in the same
     *        request. If you set both, your request returns a <code>BadRequestException</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting or identifying
     *        personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public AmazonTranscribeProcessorConfiguration withContentIdentificationType(String contentIdentificationType) {
        setContentIdentificationType(contentIdentificationType);
        return this;
    }

    /**
     * <p>
     * Labels all personally identifiable information (PII) identified in your transcript.
     * </p>
     * <p>
     * Content identification is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is flagged
     * upon complete transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set <code>ContentIdentificationType</code> and <code>ContentRedactionType</code> in the same request.
     * If you set both, your request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param contentIdentificationType
     *        Labels all personally identifiable information (PII) identified in your transcript.</p>
     *        <p>
     *        Content identification is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is
     *        flagged upon complete transcription of an audio segment.
     *        </p>
     *        <p>
     *        You can’t set <code>ContentIdentificationType</code> and <code>ContentRedactionType</code> in the same
     *        request. If you set both, your request returns a <code>BadRequestException</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting or identifying
     *        personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public AmazonTranscribeProcessorConfiguration withContentIdentificationType(ContentType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
        return this;
    }

    /**
     * <p>
     * Redacts all personally identifiable information (PII) identified in your transcript.
     * </p>
     * <p>
     * Content redaction is performed at the segment level; PII specified in PiiEntityTypes is redacted upon complete
     * transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set ContentRedactionType and ContentIdentificationType in the same request. If you set both, your
     * request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param contentRedactionType
     *        Redacts all personally identifiable information (PII) identified in your transcript.</p>
     *        <p>
     *        Content redaction is performed at the segment level; PII specified in PiiEntityTypes is redacted upon
     *        complete transcription of an audio segment.
     *        </p>
     *        <p>
     *        You can’t set ContentRedactionType and ContentIdentificationType in the same request. If you set both,
     *        your request returns a <code>BadRequestException</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting or identifying
     *        personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @see ContentType
     */

    public void setContentRedactionType(String contentRedactionType) {
        this.contentRedactionType = contentRedactionType;
    }

    /**
     * <p>
     * Redacts all personally identifiable information (PII) identified in your transcript.
     * </p>
     * <p>
     * Content redaction is performed at the segment level; PII specified in PiiEntityTypes is redacted upon complete
     * transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set ContentRedactionType and ContentIdentificationType in the same request. If you set both, your
     * request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return Redacts all personally identifiable information (PII) identified in your transcript.</p>
     *         <p>
     *         Content redaction is performed at the segment level; PII specified in PiiEntityTypes is redacted upon
     *         complete transcription of an audio segment.
     *         </p>
     *         <p>
     *         You can’t set ContentRedactionType and ContentIdentificationType in the same request. If you set both,
     *         your request returns a <code>BadRequestException</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting or identifying
     *         personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @see ContentType
     */

    public String getContentRedactionType() {
        return this.contentRedactionType;
    }

    /**
     * <p>
     * Redacts all personally identifiable information (PII) identified in your transcript.
     * </p>
     * <p>
     * Content redaction is performed at the segment level; PII specified in PiiEntityTypes is redacted upon complete
     * transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set ContentRedactionType and ContentIdentificationType in the same request. If you set both, your
     * request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param contentRedactionType
     *        Redacts all personally identifiable information (PII) identified in your transcript.</p>
     *        <p>
     *        Content redaction is performed at the segment level; PII specified in PiiEntityTypes is redacted upon
     *        complete transcription of an audio segment.
     *        </p>
     *        <p>
     *        You can’t set ContentRedactionType and ContentIdentificationType in the same request. If you set both,
     *        your request returns a <code>BadRequestException</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting or identifying
     *        personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public AmazonTranscribeProcessorConfiguration withContentRedactionType(String contentRedactionType) {
        setContentRedactionType(contentRedactionType);
        return this;
    }

    /**
     * <p>
     * Redacts all personally identifiable information (PII) identified in your transcript.
     * </p>
     * <p>
     * Content redaction is performed at the segment level; PII specified in PiiEntityTypes is redacted upon complete
     * transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set ContentRedactionType and ContentIdentificationType in the same request. If you set both, your
     * request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param contentRedactionType
     *        Redacts all personally identifiable information (PII) identified in your transcript.</p>
     *        <p>
     *        Content redaction is performed at the segment level; PII specified in PiiEntityTypes is redacted upon
     *        complete transcription of an audio segment.
     *        </p>
     *        <p>
     *        You can’t set ContentRedactionType and ContentIdentificationType in the same request. If you set both,
     *        your request returns a <code>BadRequestException</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting or identifying
     *        personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public AmazonTranscribeProcessorConfiguration withContentRedactionType(ContentType contentRedactionType) {
        this.contentRedactionType = contentRedactionType.toString();
        return this;
    }

    /**
     * <p>
     * The types of personally identifiable information (PII) to redact from a transcript. You can include as many types
     * as you'd like, or you can select <code>ALL</code>.
     * </p>
     * <p>
     * To include <code>PiiEntityTypes</code> in your Call Analytics request, you must also include
     * <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>, but you can't include both.
     * </p>
     * <p>
     * Values must be comma-separated and can include: <code>ADDRESS</code>, <code>BANK_ACCOUNT_NUMBER</code>,
     * <code>BANK_ROUTING</code>, <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>,
     * <code>CREDIT_DEBIT_NUMBER</code>, <code>EMAIL</code>, <code>NAME</code>, <code>PHONE</code>, <code>PIN</code>,
     * <code>SSN</code>, or <code>ALL</code>.
     * </p>
     * <p>
     * If you leave this parameter empty, the default behavior is equivalent to <code>ALL</code>.
     * </p>
     * 
     * @param piiEntityTypes
     *        The types of personally identifiable information (PII) to redact from a transcript. You can include as
     *        many types as you'd like, or you can select <code>ALL</code>.</p>
     *        <p>
     *        To include <code>PiiEntityTypes</code> in your Call Analytics request, you must also include
     *        <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>, but you can't include both.
     *        </p>
     *        <p>
     *        Values must be comma-separated and can include: <code>ADDRESS</code>, <code>BANK_ACCOUNT_NUMBER</code>,
     *        <code>BANK_ROUTING</code>, <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>,
     *        <code>CREDIT_DEBIT_NUMBER</code>, <code>EMAIL</code>, <code>NAME</code>, <code>PHONE</code>,
     *        <code>PIN</code>, <code>SSN</code>, or <code>ALL</code>.
     *        </p>
     *        <p>
     *        If you leave this parameter empty, the default behavior is equivalent to <code>ALL</code>.
     */

    public void setPiiEntityTypes(String piiEntityTypes) {
        this.piiEntityTypes = piiEntityTypes;
    }

    /**
     * <p>
     * The types of personally identifiable information (PII) to redact from a transcript. You can include as many types
     * as you'd like, or you can select <code>ALL</code>.
     * </p>
     * <p>
     * To include <code>PiiEntityTypes</code> in your Call Analytics request, you must also include
     * <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>, but you can't include both.
     * </p>
     * <p>
     * Values must be comma-separated and can include: <code>ADDRESS</code>, <code>BANK_ACCOUNT_NUMBER</code>,
     * <code>BANK_ROUTING</code>, <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>,
     * <code>CREDIT_DEBIT_NUMBER</code>, <code>EMAIL</code>, <code>NAME</code>, <code>PHONE</code>, <code>PIN</code>,
     * <code>SSN</code>, or <code>ALL</code>.
     * </p>
     * <p>
     * If you leave this parameter empty, the default behavior is equivalent to <code>ALL</code>.
     * </p>
     * 
     * @return The types of personally identifiable information (PII) to redact from a transcript. You can include as
     *         many types as you'd like, or you can select <code>ALL</code>.</p>
     *         <p>
     *         To include <code>PiiEntityTypes</code> in your Call Analytics request, you must also include
     *         <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>, but you can't include both.
     *         </p>
     *         <p>
     *         Values must be comma-separated and can include: <code>ADDRESS</code>, <code>BANK_ACCOUNT_NUMBER</code>,
     *         <code>BANK_ROUTING</code>, <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>,
     *         <code>CREDIT_DEBIT_NUMBER</code>, <code>EMAIL</code>, <code>NAME</code>, <code>PHONE</code>,
     *         <code>PIN</code>, <code>SSN</code>, or <code>ALL</code>.
     *         </p>
     *         <p>
     *         If you leave this parameter empty, the default behavior is equivalent to <code>ALL</code>.
     */

    public String getPiiEntityTypes() {
        return this.piiEntityTypes;
    }

    /**
     * <p>
     * The types of personally identifiable information (PII) to redact from a transcript. You can include as many types
     * as you'd like, or you can select <code>ALL</code>.
     * </p>
     * <p>
     * To include <code>PiiEntityTypes</code> in your Call Analytics request, you must also include
     * <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>, but you can't include both.
     * </p>
     * <p>
     * Values must be comma-separated and can include: <code>ADDRESS</code>, <code>BANK_ACCOUNT_NUMBER</code>,
     * <code>BANK_ROUTING</code>, <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>,
     * <code>CREDIT_DEBIT_NUMBER</code>, <code>EMAIL</code>, <code>NAME</code>, <code>PHONE</code>, <code>PIN</code>,
     * <code>SSN</code>, or <code>ALL</code>.
     * </p>
     * <p>
     * If you leave this parameter empty, the default behavior is equivalent to <code>ALL</code>.
     * </p>
     * 
     * @param piiEntityTypes
     *        The types of personally identifiable information (PII) to redact from a transcript. You can include as
     *        many types as you'd like, or you can select <code>ALL</code>.</p>
     *        <p>
     *        To include <code>PiiEntityTypes</code> in your Call Analytics request, you must also include
     *        <code>ContentIdentificationType</code> or <code>ContentRedactionType</code>, but you can't include both.
     *        </p>
     *        <p>
     *        Values must be comma-separated and can include: <code>ADDRESS</code>, <code>BANK_ACCOUNT_NUMBER</code>,
     *        <code>BANK_ROUTING</code>, <code>CREDIT_DEBIT_CVV</code>, <code>CREDIT_DEBIT_EXPIRY</code>,
     *        <code>CREDIT_DEBIT_NUMBER</code>, <code>EMAIL</code>, <code>NAME</code>, <code>PHONE</code>,
     *        <code>PIN</code>, <code>SSN</code>, or <code>ALL</code>.
     *        </p>
     *        <p>
     *        If you leave this parameter empty, the default behavior is equivalent to <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeProcessorConfiguration withPiiEntityTypes(String piiEntityTypes) {
        setPiiEntityTypes(piiEntityTypes);
        return this;
    }

    /**
     * <p>
     * The name of the custom language model that you want to use when processing your transcription. Note that language
     * model names are case sensitive.
     * </p>
     * <p>
     * The language of the specified language model must match the language code you specify in your transcription
     * request. If the languages don't match, the custom language model isn't applied. There are no errors or warnings
     * associated with a language mismatch.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language models</a> in
     * the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param languageModelName
     *        The name of the custom language model that you want to use when processing your transcription. Note that
     *        language model names are case sensitive.</p>
     *        <p>
     *        The language of the specified language model must match the language code you specify in your
     *        transcription request. If the languages don't match, the custom language model isn't applied. There are no
     *        errors or warnings associated with a language mismatch.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language
     *        models</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public void setLanguageModelName(String languageModelName) {
        this.languageModelName = languageModelName;
    }

    /**
     * <p>
     * The name of the custom language model that you want to use when processing your transcription. Note that language
     * model names are case sensitive.
     * </p>
     * <p>
     * The language of the specified language model must match the language code you specify in your transcription
     * request. If the languages don't match, the custom language model isn't applied. There are no errors or warnings
     * associated with a language mismatch.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language models</a> in
     * the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return The name of the custom language model that you want to use when processing your transcription. Note that
     *         language model names are case sensitive.</p>
     *         <p>
     *         The language of the specified language model must match the language code you specify in your
     *         transcription request. If the languages don't match, the custom language model isn't applied. There are
     *         no errors or warnings associated with a language mismatch.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language
     *         models</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public String getLanguageModelName() {
        return this.languageModelName;
    }

    /**
     * <p>
     * The name of the custom language model that you want to use when processing your transcription. Note that language
     * model names are case sensitive.
     * </p>
     * <p>
     * The language of the specified language model must match the language code you specify in your transcription
     * request. If the languages don't match, the custom language model isn't applied. There are no errors or warnings
     * associated with a language mismatch.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language models</a> in
     * the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param languageModelName
     *        The name of the custom language model that you want to use when processing your transcription. Note that
     *        language model names are case sensitive.</p>
     *        <p>
     *        The language of the specified language model must match the language code you specify in your
     *        transcription request. If the languages don't match, the custom language model isn't applied. There are no
     *        errors or warnings associated with a language mismatch.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language
     *        models</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeProcessorConfiguration withLanguageModelName(String languageModelName) {
        setLanguageModelName(languageModelName);
        return this;
    }

    /**
     * <p>
     * If true, <code>TranscriptEvents</code> with <code>IsPartial: true</code> are filtered out of the insights target.
     * </p>
     * 
     * @param filterPartialResults
     *        If true, <code>TranscriptEvents</code> with <code>IsPartial: true</code> are filtered out of the insights
     *        target.
     */

    public void setFilterPartialResults(Boolean filterPartialResults) {
        this.filterPartialResults = filterPartialResults;
    }

    /**
     * <p>
     * If true, <code>TranscriptEvents</code> with <code>IsPartial: true</code> are filtered out of the insights target.
     * </p>
     * 
     * @return If true, <code>TranscriptEvents</code> with <code>IsPartial: true</code> are filtered out of the insights
     *         target.
     */

    public Boolean getFilterPartialResults() {
        return this.filterPartialResults;
    }

    /**
     * <p>
     * If true, <code>TranscriptEvents</code> with <code>IsPartial: true</code> are filtered out of the insights target.
     * </p>
     * 
     * @param filterPartialResults
     *        If true, <code>TranscriptEvents</code> with <code>IsPartial: true</code> are filtered out of the insights
     *        target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeProcessorConfiguration withFilterPartialResults(Boolean filterPartialResults) {
        setFilterPartialResults(filterPartialResults);
        return this;
    }

    /**
     * <p>
     * If true, <code>TranscriptEvents</code> with <code>IsPartial: true</code> are filtered out of the insights target.
     * </p>
     * 
     * @return If true, <code>TranscriptEvents</code> with <code>IsPartial: true</code> are filtered out of the insights
     *         target.
     */

    public Boolean isFilterPartialResults() {
        return this.filterPartialResults;
    }

    /**
     * <p>
     * Turns language identification on or off.
     * </p>
     * 
     * @param identifyLanguage
     *        Turns language identification on or off.
     */

    public void setIdentifyLanguage(Boolean identifyLanguage) {
        this.identifyLanguage = identifyLanguage;
    }

    /**
     * <p>
     * Turns language identification on or off.
     * </p>
     * 
     * @return Turns language identification on or off.
     */

    public Boolean getIdentifyLanguage() {
        return this.identifyLanguage;
    }

    /**
     * <p>
     * Turns language identification on or off.
     * </p>
     * 
     * @param identifyLanguage
     *        Turns language identification on or off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeProcessorConfiguration withIdentifyLanguage(Boolean identifyLanguage) {
        setIdentifyLanguage(identifyLanguage);
        return this;
    }

    /**
     * <p>
     * Turns language identification on or off.
     * </p>
     * 
     * @return Turns language identification on or off.
     */

    public Boolean isIdentifyLanguage() {
        return this.identifyLanguage;
    }

    /**
     * <p>
     * The language options for the transcription, such as automatic language detection.
     * </p>
     * 
     * @param languageOptions
     *        The language options for the transcription, such as automatic language detection.
     */

    public void setLanguageOptions(String languageOptions) {
        this.languageOptions = languageOptions;
    }

    /**
     * <p>
     * The language options for the transcription, such as automatic language detection.
     * </p>
     * 
     * @return The language options for the transcription, such as automatic language detection.
     */

    public String getLanguageOptions() {
        return this.languageOptions;
    }

    /**
     * <p>
     * The language options for the transcription, such as automatic language detection.
     * </p>
     * 
     * @param languageOptions
     *        The language options for the transcription, such as automatic language detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeProcessorConfiguration withLanguageOptions(String languageOptions) {
        setLanguageOptions(languageOptions);
        return this;
    }

    /**
     * <p>
     * The preferred language for the transcription.
     * </p>
     * 
     * @param preferredLanguage
     *        The preferred language for the transcription.
     * @see CallAnalyticsLanguageCode
     */

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    /**
     * <p>
     * The preferred language for the transcription.
     * </p>
     * 
     * @return The preferred language for the transcription.
     * @see CallAnalyticsLanguageCode
     */

    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    /**
     * <p>
     * The preferred language for the transcription.
     * </p>
     * 
     * @param preferredLanguage
     *        The preferred language for the transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsLanguageCode
     */

    public AmazonTranscribeProcessorConfiguration withPreferredLanguage(String preferredLanguage) {
        setPreferredLanguage(preferredLanguage);
        return this;
    }

    /**
     * <p>
     * The preferred language for the transcription.
     * </p>
     * 
     * @param preferredLanguage
     *        The preferred language for the transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsLanguageCode
     */

    public AmazonTranscribeProcessorConfiguration withPreferredLanguage(CallAnalyticsLanguageCode preferredLanguage) {
        this.preferredLanguage = preferredLanguage.toString();
        return this;
    }

    /**
     * <p>
     * The names of the custom vocabulary or vocabularies used during transcription.
     * </p>
     * 
     * @param vocabularyNames
     *        The names of the custom vocabulary or vocabularies used during transcription.
     */

    public void setVocabularyNames(String vocabularyNames) {
        this.vocabularyNames = vocabularyNames;
    }

    /**
     * <p>
     * The names of the custom vocabulary or vocabularies used during transcription.
     * </p>
     * 
     * @return The names of the custom vocabulary or vocabularies used during transcription.
     */

    public String getVocabularyNames() {
        return this.vocabularyNames;
    }

    /**
     * <p>
     * The names of the custom vocabulary or vocabularies used during transcription.
     * </p>
     * 
     * @param vocabularyNames
     *        The names of the custom vocabulary or vocabularies used during transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeProcessorConfiguration withVocabularyNames(String vocabularyNames) {
        setVocabularyNames(vocabularyNames);
        return this;
    }

    /**
     * <p>
     * The names of the custom vocabulary filter or filters using during transcription.
     * </p>
     * 
     * @param vocabularyFilterNames
     *        The names of the custom vocabulary filter or filters using during transcription.
     */

    public void setVocabularyFilterNames(String vocabularyFilterNames) {
        this.vocabularyFilterNames = vocabularyFilterNames;
    }

    /**
     * <p>
     * The names of the custom vocabulary filter or filters using during transcription.
     * </p>
     * 
     * @return The names of the custom vocabulary filter or filters using during transcription.
     */

    public String getVocabularyFilterNames() {
        return this.vocabularyFilterNames;
    }

    /**
     * <p>
     * The names of the custom vocabulary filter or filters using during transcription.
     * </p>
     * 
     * @param vocabularyFilterNames
     *        The names of the custom vocabulary filter or filters using during transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeProcessorConfiguration withVocabularyFilterNames(String vocabularyFilterNames) {
        setVocabularyFilterNames(vocabularyFilterNames);
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
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName()).append(",");
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: ").append(getVocabularyFilterName()).append(",");
        if (getVocabularyFilterMethod() != null)
            sb.append("VocabularyFilterMethod: ").append(getVocabularyFilterMethod()).append(",");
        if (getShowSpeakerLabel() != null)
            sb.append("ShowSpeakerLabel: ").append(getShowSpeakerLabel()).append(",");
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
            sb.append("LanguageModelName: ").append(getLanguageModelName()).append(",");
        if (getFilterPartialResults() != null)
            sb.append("FilterPartialResults: ").append(getFilterPartialResults()).append(",");
        if (getIdentifyLanguage() != null)
            sb.append("IdentifyLanguage: ").append(getIdentifyLanguage()).append(",");
        if (getLanguageOptions() != null)
            sb.append("LanguageOptions: ").append(getLanguageOptions()).append(",");
        if (getPreferredLanguage() != null)
            sb.append("PreferredLanguage: ").append(getPreferredLanguage()).append(",");
        if (getVocabularyNames() != null)
            sb.append("VocabularyNames: ").append(getVocabularyNames()).append(",");
        if (getVocabularyFilterNames() != null)
            sb.append("VocabularyFilterNames: ").append(getVocabularyFilterNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonTranscribeProcessorConfiguration == false)
            return false;
        AmazonTranscribeProcessorConfiguration other = (AmazonTranscribeProcessorConfiguration) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getVocabularyFilterMethod() == null ^ this.getVocabularyFilterMethod() == null)
            return false;
        if (other.getVocabularyFilterMethod() != null && other.getVocabularyFilterMethod().equals(this.getVocabularyFilterMethod()) == false)
            return false;
        if (other.getShowSpeakerLabel() == null ^ this.getShowSpeakerLabel() == null)
            return false;
        if (other.getShowSpeakerLabel() != null && other.getShowSpeakerLabel().equals(this.getShowSpeakerLabel()) == false)
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
        if (other.getFilterPartialResults() == null ^ this.getFilterPartialResults() == null)
            return false;
        if (other.getFilterPartialResults() != null && other.getFilterPartialResults().equals(this.getFilterPartialResults()) == false)
            return false;
        if (other.getIdentifyLanguage() == null ^ this.getIdentifyLanguage() == null)
            return false;
        if (other.getIdentifyLanguage() != null && other.getIdentifyLanguage().equals(this.getIdentifyLanguage()) == false)
            return false;
        if (other.getLanguageOptions() == null ^ this.getLanguageOptions() == null)
            return false;
        if (other.getLanguageOptions() != null && other.getLanguageOptions().equals(this.getLanguageOptions()) == false)
            return false;
        if (other.getPreferredLanguage() == null ^ this.getPreferredLanguage() == null)
            return false;
        if (other.getPreferredLanguage() != null && other.getPreferredLanguage().equals(this.getPreferredLanguage()) == false)
            return false;
        if (other.getVocabularyNames() == null ^ this.getVocabularyNames() == null)
            return false;
        if (other.getVocabularyNames() != null && other.getVocabularyNames().equals(this.getVocabularyNames()) == false)
            return false;
        if (other.getVocabularyFilterNames() == null ^ this.getVocabularyFilterNames() == null)
            return false;
        if (other.getVocabularyFilterNames() != null && other.getVocabularyFilterNames().equals(this.getVocabularyFilterNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterMethod() == null) ? 0 : getVocabularyFilterMethod().hashCode());
        hashCode = prime * hashCode + ((getShowSpeakerLabel() == null) ? 0 : getShowSpeakerLabel().hashCode());
        hashCode = prime * hashCode + ((getEnablePartialResultsStabilization() == null) ? 0 : getEnablePartialResultsStabilization().hashCode());
        hashCode = prime * hashCode + ((getPartialResultsStability() == null) ? 0 : getPartialResultsStability().hashCode());
        hashCode = prime * hashCode + ((getContentIdentificationType() == null) ? 0 : getContentIdentificationType().hashCode());
        hashCode = prime * hashCode + ((getContentRedactionType() == null) ? 0 : getContentRedactionType().hashCode());
        hashCode = prime * hashCode + ((getPiiEntityTypes() == null) ? 0 : getPiiEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getLanguageModelName() == null) ? 0 : getLanguageModelName().hashCode());
        hashCode = prime * hashCode + ((getFilterPartialResults() == null) ? 0 : getFilterPartialResults().hashCode());
        hashCode = prime * hashCode + ((getIdentifyLanguage() == null) ? 0 : getIdentifyLanguage().hashCode());
        hashCode = prime * hashCode + ((getLanguageOptions() == null) ? 0 : getLanguageOptions().hashCode());
        hashCode = prime * hashCode + ((getPreferredLanguage() == null) ? 0 : getPreferredLanguage().hashCode());
        hashCode = prime * hashCode + ((getVocabularyNames() == null) ? 0 : getVocabularyNames().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterNames() == null) ? 0 : getVocabularyFilterNames().hashCode());
        return hashCode;
    }

    @Override
    public AmazonTranscribeProcessorConfiguration clone() {
        try {
            return (AmazonTranscribeProcessorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.AmazonTranscribeProcessorConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
