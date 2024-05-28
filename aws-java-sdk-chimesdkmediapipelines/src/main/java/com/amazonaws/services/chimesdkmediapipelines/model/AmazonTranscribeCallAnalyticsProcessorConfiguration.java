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
 * A structure that contains the configuration settings for an Amazon Transcribe call analytics processor.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/AmazonTranscribeCallAnalyticsProcessorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTranscribeCallAnalyticsProcessorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The language code in the configuration.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Specifies the name of the custom vocabulary to use when processing a transcription. Note that vocabulary names
     * are case sensitive.
     * </p>
     * <p>
     * If the language of the specified custom vocabulary doesn't match the language identified in your media, the
     * custom vocabulary is not applied to your transcription.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html">Custom vocabularies</a> in the
     * <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * Specifies the name of the custom vocabulary filter to use when processing a transcription. Note that vocabulary
     * filter names are case sensitive.
     * </p>
     * <p>
     * If the language of the specified custom vocabulary filter doesn't match the language identified in your media,
     * the vocabulary filter is not applied to your transcription.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html">Using vocabulary filtering with
     * unwanted words</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     */
    private String vocabularyFilterName;
    /**
     * <p>
     * Specifies how to apply a vocabulary filter to a transcript.
     * </p>
     * <p>
     * To replace words with <b>***</b>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     */
    private String vocabularyFilterMethod;
    /**
     * <p>
     * Specifies the name of the custom language model to use when processing a transcription. Note that language model
     * names are case sensitive.
     * </p>
     * <p>
     * The language of the specified language model must match the language code specified in the transcription request.
     * If the languages don't match, the custom language model isn't applied. Language mismatches don't generate errors
     * or warnings.
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
     * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in
     * your output, but may impact accuracy. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     */
    private Boolean enablePartialResultsStabilization;
    /**
     * <p>
     * Specifies the level of stability to use when you enable partial results stabilization (
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
     * If you do, your request returns a <code>BadRequestException</code>.
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
     * Content redaction is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is redacted
     * upon complete transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set <code>ContentRedactionType</code> and <code>ContentIdentificationType</code> in the same request.
     * If you do, your request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     */
    private String contentRedactionType;
    /**
     * <p>
     * Specifies the types of personally identifiable information (PII) to redact from a transcript. You can include as
     * many types as you'd like, or you can select <code>ALL</code>.
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
     * Length Constraints: Minimum length of 1. Maximum length of 300.
     * </p>
     */
    private String piiEntityTypes;
    /**
     * <p>
     * If true, <code>UtteranceEvents</code> with <code>IsPartial: true</code> are filtered out of the insights target.
     * </p>
     */
    private Boolean filterPartialResults;
    /**
     * <p>
     * The settings for a post-call analysis task in an analytics configuration.
     * </p>
     */
    private PostCallAnalyticsSettings postCallAnalyticsSettings;
    /**
     * <p>
     * By default, all <code>CategoryEvents</code> are sent to the insights target. If this parameter is specified, only
     * included categories are sent to the insights target.
     * </p>
     */
    private java.util.List<String> callAnalyticsStreamCategories;

    /**
     * <p>
     * The language code in the configuration.
     * </p>
     * 
     * @param languageCode
     *        The language code in the configuration.
     * @see CallAnalyticsLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code in the configuration.
     * </p>
     * 
     * @return The language code in the configuration.
     * @see CallAnalyticsLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code in the configuration.
     * </p>
     * 
     * @param languageCode
     *        The language code in the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsLanguageCode
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code in the configuration.
     * </p>
     * 
     * @param languageCode
     *        The language code in the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsLanguageCode
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withLanguageCode(CallAnalyticsLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the name of the custom vocabulary to use when processing a transcription. Note that vocabulary names
     * are case sensitive.
     * </p>
     * <p>
     * If the language of the specified custom vocabulary doesn't match the language identified in your media, the
     * custom vocabulary is not applied to your transcription.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html">Custom vocabularies</a> in the
     * <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     * 
     * @param vocabularyName
     *        Specifies the name of the custom vocabulary to use when processing a transcription. Note that vocabulary
     *        names are case sensitive.</p>
     *        <p>
     *        If the language of the specified custom vocabulary doesn't match the language identified in your media,
     *        the custom vocabulary is not applied to your transcription.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html">Custom vocabularies</a> in
     *        the <i>Amazon Transcribe Developer Guide</i>.
     *        </p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 200.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * Specifies the name of the custom vocabulary to use when processing a transcription. Note that vocabulary names
     * are case sensitive.
     * </p>
     * <p>
     * If the language of the specified custom vocabulary doesn't match the language identified in your media, the
     * custom vocabulary is not applied to your transcription.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html">Custom vocabularies</a> in the
     * <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     * 
     * @return Specifies the name of the custom vocabulary to use when processing a transcription. Note that vocabulary
     *         names are case sensitive.</p>
     *         <p>
     *         If the language of the specified custom vocabulary doesn't match the language identified in your media,
     *         the custom vocabulary is not applied to your transcription.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html">Custom vocabularies</a> in
     *         the <i>Amazon Transcribe Developer Guide</i>.
     *         </p>
     *         <p>
     *         Length Constraints: Minimum length of 1. Maximum length of 200.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * Specifies the name of the custom vocabulary to use when processing a transcription. Note that vocabulary names
     * are case sensitive.
     * </p>
     * <p>
     * If the language of the specified custom vocabulary doesn't match the language identified in your media, the
     * custom vocabulary is not applied to your transcription.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html">Custom vocabularies</a> in the
     * <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     * 
     * @param vocabularyName
     *        Specifies the name of the custom vocabulary to use when processing a transcription. Note that vocabulary
     *        names are case sensitive.</p>
     *        <p>
     *        If the language of the specified custom vocabulary doesn't match the language identified in your media,
     *        the custom vocabulary is not applied to your transcription.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html">Custom vocabularies</a> in
     *        the <i>Amazon Transcribe Developer Guide</i>.
     *        </p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the custom vocabulary filter to use when processing a transcription. Note that vocabulary
     * filter names are case sensitive.
     * </p>
     * <p>
     * If the language of the specified custom vocabulary filter doesn't match the language identified in your media,
     * the vocabulary filter is not applied to your transcription.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html">Using vocabulary filtering with
     * unwanted words</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     * 
     * @param vocabularyFilterName
     *        Specifies the name of the custom vocabulary filter to use when processing a transcription. Note that
     *        vocabulary filter names are case sensitive.</p>
     *        <p>
     *        If the language of the specified custom vocabulary filter doesn't match the language identified in your
     *        media, the vocabulary filter is not applied to your transcription.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html">Using vocabulary
     *        filtering with unwanted words</a> in the <i>Amazon Transcribe Developer Guide</i>.
     *        </p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 200.
     */

    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * Specifies the name of the custom vocabulary filter to use when processing a transcription. Note that vocabulary
     * filter names are case sensitive.
     * </p>
     * <p>
     * If the language of the specified custom vocabulary filter doesn't match the language identified in your media,
     * the vocabulary filter is not applied to your transcription.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html">Using vocabulary filtering with
     * unwanted words</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     * 
     * @return Specifies the name of the custom vocabulary filter to use when processing a transcription. Note that
     *         vocabulary filter names are case sensitive.</p>
     *         <p>
     *         If the language of the specified custom vocabulary filter doesn't match the language identified in your
     *         media, the vocabulary filter is not applied to your transcription.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html">Using vocabulary
     *         filtering with unwanted words</a> in the <i>Amazon Transcribe Developer Guide</i>.
     *         </p>
     *         <p>
     *         Length Constraints: Minimum length of 1. Maximum length of 200.
     */

    public String getVocabularyFilterName() {
        return this.vocabularyFilterName;
    }

    /**
     * <p>
     * Specifies the name of the custom vocabulary filter to use when processing a transcription. Note that vocabulary
     * filter names are case sensitive.
     * </p>
     * <p>
     * If the language of the specified custom vocabulary filter doesn't match the language identified in your media,
     * the vocabulary filter is not applied to your transcription.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html">Using vocabulary filtering with
     * unwanted words</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 200.
     * </p>
     * 
     * @param vocabularyFilterName
     *        Specifies the name of the custom vocabulary filter to use when processing a transcription. Note that
     *        vocabulary filter names are case sensitive.</p>
     *        <p>
     *        If the language of the specified custom vocabulary filter doesn't match the language identified in your
     *        media, the vocabulary filter is not applied to your transcription.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html">Using vocabulary
     *        filtering with unwanted words</a> in the <i>Amazon Transcribe Developer Guide</i>.
     *        </p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withVocabularyFilterName(String vocabularyFilterName) {
        setVocabularyFilterName(vocabularyFilterName);
        return this;
    }

    /**
     * <p>
     * Specifies how to apply a vocabulary filter to a transcript.
     * </p>
     * <p>
     * To replace words with <b>***</b>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        Specifies how to apply a vocabulary filter to a transcript.</p>
     *        <p>
     *        To replace words with <b>***</b>, choose <code>mask</code>.
     *        </p>
     *        <p>
     *        To delete words, choose <code>remove</code>.
     *        </p>
     *        <p>
     *        To flag words without changing them, choose <code>tag</code>.
     * @see VocabularyFilterMethod
     */

    public void setVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
    }

    /**
     * <p>
     * Specifies how to apply a vocabulary filter to a transcript.
     * </p>
     * <p>
     * To replace words with <b>***</b>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * 
     * @return Specifies how to apply a vocabulary filter to a transcript.</p>
     *         <p>
     *         To replace words with <b>***</b>, choose <code>mask</code>.
     *         </p>
     *         <p>
     *         To delete words, choose <code>remove</code>.
     *         </p>
     *         <p>
     *         To flag words without changing them, choose <code>tag</code>.
     * @see VocabularyFilterMethod
     */

    public String getVocabularyFilterMethod() {
        return this.vocabularyFilterMethod;
    }

    /**
     * <p>
     * Specifies how to apply a vocabulary filter to a transcript.
     * </p>
     * <p>
     * To replace words with <b>***</b>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        Specifies how to apply a vocabulary filter to a transcript.</p>
     *        <p>
     *        To replace words with <b>***</b>, choose <code>mask</code>.
     *        </p>
     *        <p>
     *        To delete words, choose <code>remove</code>.
     *        </p>
     *        <p>
     *        To flag words without changing them, choose <code>tag</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyFilterMethod
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withVocabularyFilterMethod(String vocabularyFilterMethod) {
        setVocabularyFilterMethod(vocabularyFilterMethod);
        return this;
    }

    /**
     * <p>
     * Specifies how to apply a vocabulary filter to a transcript.
     * </p>
     * <p>
     * To replace words with <b>***</b>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        Specifies how to apply a vocabulary filter to a transcript.</p>
     *        <p>
     *        To replace words with <b>***</b>, choose <code>mask</code>.
     *        </p>
     *        <p>
     *        To delete words, choose <code>remove</code>.
     *        </p>
     *        <p>
     *        To flag words without changing them, choose <code>tag</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyFilterMethod
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withVocabularyFilterMethod(VocabularyFilterMethod vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the name of the custom language model to use when processing a transcription. Note that language model
     * names are case sensitive.
     * </p>
     * <p>
     * The language of the specified language model must match the language code specified in the transcription request.
     * If the languages don't match, the custom language model isn't applied. Language mismatches don't generate errors
     * or warnings.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language models</a> in
     * the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param languageModelName
     *        Specifies the name of the custom language model to use when processing a transcription. Note that language
     *        model names are case sensitive.</p>
     *        <p>
     *        The language of the specified language model must match the language code specified in the transcription
     *        request. If the languages don't match, the custom language model isn't applied. Language mismatches don't
     *        generate errors or warnings.
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
     * Specifies the name of the custom language model to use when processing a transcription. Note that language model
     * names are case sensitive.
     * </p>
     * <p>
     * The language of the specified language model must match the language code specified in the transcription request.
     * If the languages don't match, the custom language model isn't applied. Language mismatches don't generate errors
     * or warnings.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language models</a> in
     * the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the name of the custom language model to use when processing a transcription. Note that
     *         language model names are case sensitive.</p>
     *         <p>
     *         The language of the specified language model must match the language code specified in the transcription
     *         request. If the languages don't match, the custom language model isn't applied. Language mismatches don't
     *         generate errors or warnings.
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
     * Specifies the name of the custom language model to use when processing a transcription. Note that language model
     * names are case sensitive.
     * </p>
     * <p>
     * The language of the specified language model must match the language code specified in the transcription request.
     * If the languages don't match, the custom language model isn't applied. Language mismatches don't generate errors
     * or warnings.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language models</a> in
     * the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param languageModelName
     *        Specifies the name of the custom language model to use when processing a transcription. Note that language
     *        model names are case sensitive.</p>
     *        <p>
     *        The language of the specified language model must match the language code specified in the transcription
     *        request. If the languages don't match, the custom language model isn't applied. Language mismatches don't
     *        generate errors or warnings.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-language-models.html">Custom language
     *        models</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withLanguageModelName(String languageModelName) {
        setLanguageModelName(languageModelName);
        return this;
    }

    /**
     * <p>
     * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in
     * your output, but may impact accuracy. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param enablePartialResultsStabilization
     *        Enables partial result stabilization for your transcription. Partial result stabilization can reduce
     *        latency in your output, but may impact accuracy. For more information, see <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     *        >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public void setEnablePartialResultsStabilization(Boolean enablePartialResultsStabilization) {
        this.enablePartialResultsStabilization = enablePartialResultsStabilization;
    }

    /**
     * <p>
     * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in
     * your output, but may impact accuracy. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return Enables partial result stabilization for your transcription. Partial result stabilization can reduce
     *         latency in your output, but may impact accuracy. For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     *         >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public Boolean getEnablePartialResultsStabilization() {
        return this.enablePartialResultsStabilization;
    }

    /**
     * <p>
     * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in
     * your output, but may impact accuracy. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param enablePartialResultsStabilization
     *        Enables partial result stabilization for your transcription. Partial result stabilization can reduce
     *        latency in your output, but may impact accuracy. For more information, see <a href=
     *        "https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     *        >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withEnablePartialResultsStabilization(Boolean enablePartialResultsStabilization) {
        setEnablePartialResultsStabilization(enablePartialResultsStabilization);
        return this;
    }

    /**
     * <p>
     * Enables partial result stabilization for your transcription. Partial result stabilization can reduce latency in
     * your output, but may impact accuracy. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     * >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return Enables partial result stabilization for your transcription. Partial result stabilization can reduce
     *         latency in your output, but may impact accuracy. For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/streaming.html#streaming-partial-result-stabilization"
     *         >Partial-result stabilization</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public Boolean isEnablePartialResultsStabilization() {
        return this.enablePartialResultsStabilization;
    }

    /**
     * <p>
     * Specifies the level of stability to use when you enable partial results stabilization (
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
     *        Specifies the level of stability to use when you enable partial results stabilization (
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
     * Specifies the level of stability to use when you enable partial results stabilization (
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
     * @return Specifies the level of stability to use when you enable partial results stabilization (
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
     * Specifies the level of stability to use when you enable partial results stabilization (
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
     *        Specifies the level of stability to use when you enable partial results stabilization (
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

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withPartialResultsStability(String partialResultsStability) {
        setPartialResultsStability(partialResultsStability);
        return this;
    }

    /**
     * <p>
     * Specifies the level of stability to use when you enable partial results stabilization (
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
     *        Specifies the level of stability to use when you enable partial results stabilization (
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

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withPartialResultsStability(PartialResultsStability partialResultsStability) {
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
     * If you do, your request returns a <code>BadRequestException</code>.
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
     *        request. If you do, your request returns a <code>BadRequestException</code>.
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
     * If you do, your request returns a <code>BadRequestException</code>.
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
     *         request. If you do, your request returns a <code>BadRequestException</code>.
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
     * If you do, your request returns a <code>BadRequestException</code>.
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
     *        request. If you do, your request returns a <code>BadRequestException</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting or identifying
     *        personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withContentIdentificationType(String contentIdentificationType) {
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
     * If you do, your request returns a <code>BadRequestException</code>.
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
     *        request. If you do, your request returns a <code>BadRequestException</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting or identifying
     *        personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withContentIdentificationType(ContentType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
        return this;
    }

    /**
     * <p>
     * Redacts all personally identifiable information (PII) identified in your transcript.
     * </p>
     * <p>
     * Content redaction is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is redacted
     * upon complete transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set <code>ContentRedactionType</code> and <code>ContentIdentificationType</code> in the same request.
     * If you do, your request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param contentRedactionType
     *        Redacts all personally identifiable information (PII) identified in your transcript.</p>
     *        <p>
     *        Content redaction is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is
     *        redacted upon complete transcription of an audio segment.
     *        </p>
     *        <p>
     *        You can’t set <code>ContentRedactionType</code> and <code>ContentIdentificationType</code> in the same
     *        request. If you do, your request returns a <code>BadRequestException</code>.
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
     * Content redaction is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is redacted
     * upon complete transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set <code>ContentRedactionType</code> and <code>ContentIdentificationType</code> in the same request.
     * If you do, your request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return Redacts all personally identifiable information (PII) identified in your transcript.</p>
     *         <p>
     *         Content redaction is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is
     *         redacted upon complete transcription of an audio segment.
     *         </p>
     *         <p>
     *         You can’t set <code>ContentRedactionType</code> and <code>ContentIdentificationType</code> in the same
     *         request. If you do, your request returns a <code>BadRequestException</code>.
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
     * Content redaction is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is redacted
     * upon complete transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set <code>ContentRedactionType</code> and <code>ContentIdentificationType</code> in the same request.
     * If you do, your request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param contentRedactionType
     *        Redacts all personally identifiable information (PII) identified in your transcript.</p>
     *        <p>
     *        Content redaction is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is
     *        redacted upon complete transcription of an audio segment.
     *        </p>
     *        <p>
     *        You can’t set <code>ContentRedactionType</code> and <code>ContentIdentificationType</code> in the same
     *        request. If you do, your request returns a <code>BadRequestException</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting or identifying
     *        personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withContentRedactionType(String contentRedactionType) {
        setContentRedactionType(contentRedactionType);
        return this;
    }

    /**
     * <p>
     * Redacts all personally identifiable information (PII) identified in your transcript.
     * </p>
     * <p>
     * Content redaction is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is redacted
     * upon complete transcription of an audio segment.
     * </p>
     * <p>
     * You can’t set <code>ContentRedactionType</code> and <code>ContentIdentificationType</code> in the same request.
     * If you do, your request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting
     * or identifying personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param contentRedactionType
     *        Redacts all personally identifiable information (PII) identified in your transcript.</p>
     *        <p>
     *        Content redaction is performed at the segment level; PII specified in <code>PiiEntityTypes</code> is
     *        redacted upon complete transcription of an audio segment.
     *        </p>
     *        <p>
     *        You can’t set <code>ContentRedactionType</code> and <code>ContentIdentificationType</code> in the same
     *        request. If you do, your request returns a <code>BadRequestException</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/pii-redaction.html">Redacting or identifying
     *        personally identifiable information</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withContentRedactionType(ContentType contentRedactionType) {
        this.contentRedactionType = contentRedactionType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the types of personally identifiable information (PII) to redact from a transcript. You can include as
     * many types as you'd like, or you can select <code>ALL</code>.
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
     * Length Constraints: Minimum length of 1. Maximum length of 300.
     * </p>
     * 
     * @param piiEntityTypes
     *        Specifies the types of personally identifiable information (PII) to redact from a transcript. You can
     *        include as many types as you'd like, or you can select <code>ALL</code>.</p>
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
     *        Length Constraints: Minimum length of 1. Maximum length of 300.
     */

    public void setPiiEntityTypes(String piiEntityTypes) {
        this.piiEntityTypes = piiEntityTypes;
    }

    /**
     * <p>
     * Specifies the types of personally identifiable information (PII) to redact from a transcript. You can include as
     * many types as you'd like, or you can select <code>ALL</code>.
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
     * Length Constraints: Minimum length of 1. Maximum length of 300.
     * </p>
     * 
     * @return Specifies the types of personally identifiable information (PII) to redact from a transcript. You can
     *         include as many types as you'd like, or you can select <code>ALL</code>.</p>
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
     *         Length Constraints: Minimum length of 1. Maximum length of 300.
     */

    public String getPiiEntityTypes() {
        return this.piiEntityTypes;
    }

    /**
     * <p>
     * Specifies the types of personally identifiable information (PII) to redact from a transcript. You can include as
     * many types as you'd like, or you can select <code>ALL</code>.
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
     * Length Constraints: Minimum length of 1. Maximum length of 300.
     * </p>
     * 
     * @param piiEntityTypes
     *        Specifies the types of personally identifiable information (PII) to redact from a transcript. You can
     *        include as many types as you'd like, or you can select <code>ALL</code>.</p>
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
     *        Length Constraints: Minimum length of 1. Maximum length of 300.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withPiiEntityTypes(String piiEntityTypes) {
        setPiiEntityTypes(piiEntityTypes);
        return this;
    }

    /**
     * <p>
     * If true, <code>UtteranceEvents</code> with <code>IsPartial: true</code> are filtered out of the insights target.
     * </p>
     * 
     * @param filterPartialResults
     *        If true, <code>UtteranceEvents</code> with <code>IsPartial: true</code> are filtered out of the insights
     *        target.
     */

    public void setFilterPartialResults(Boolean filterPartialResults) {
        this.filterPartialResults = filterPartialResults;
    }

    /**
     * <p>
     * If true, <code>UtteranceEvents</code> with <code>IsPartial: true</code> are filtered out of the insights target.
     * </p>
     * 
     * @return If true, <code>UtteranceEvents</code> with <code>IsPartial: true</code> are filtered out of the insights
     *         target.
     */

    public Boolean getFilterPartialResults() {
        return this.filterPartialResults;
    }

    /**
     * <p>
     * If true, <code>UtteranceEvents</code> with <code>IsPartial: true</code> are filtered out of the insights target.
     * </p>
     * 
     * @param filterPartialResults
     *        If true, <code>UtteranceEvents</code> with <code>IsPartial: true</code> are filtered out of the insights
     *        target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withFilterPartialResults(Boolean filterPartialResults) {
        setFilterPartialResults(filterPartialResults);
        return this;
    }

    /**
     * <p>
     * If true, <code>UtteranceEvents</code> with <code>IsPartial: true</code> are filtered out of the insights target.
     * </p>
     * 
     * @return If true, <code>UtteranceEvents</code> with <code>IsPartial: true</code> are filtered out of the insights
     *         target.
     */

    public Boolean isFilterPartialResults() {
        return this.filterPartialResults;
    }

    /**
     * <p>
     * The settings for a post-call analysis task in an analytics configuration.
     * </p>
     * 
     * @param postCallAnalyticsSettings
     *        The settings for a post-call analysis task in an analytics configuration.
     */

    public void setPostCallAnalyticsSettings(PostCallAnalyticsSettings postCallAnalyticsSettings) {
        this.postCallAnalyticsSettings = postCallAnalyticsSettings;
    }

    /**
     * <p>
     * The settings for a post-call analysis task in an analytics configuration.
     * </p>
     * 
     * @return The settings for a post-call analysis task in an analytics configuration.
     */

    public PostCallAnalyticsSettings getPostCallAnalyticsSettings() {
        return this.postCallAnalyticsSettings;
    }

    /**
     * <p>
     * The settings for a post-call analysis task in an analytics configuration.
     * </p>
     * 
     * @param postCallAnalyticsSettings
     *        The settings for a post-call analysis task in an analytics configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withPostCallAnalyticsSettings(PostCallAnalyticsSettings postCallAnalyticsSettings) {
        setPostCallAnalyticsSettings(postCallAnalyticsSettings);
        return this;
    }

    /**
     * <p>
     * By default, all <code>CategoryEvents</code> are sent to the insights target. If this parameter is specified, only
     * included categories are sent to the insights target.
     * </p>
     * 
     * @return By default, all <code>CategoryEvents</code> are sent to the insights target. If this parameter is
     *         specified, only included categories are sent to the insights target.
     */

    public java.util.List<String> getCallAnalyticsStreamCategories() {
        return callAnalyticsStreamCategories;
    }

    /**
     * <p>
     * By default, all <code>CategoryEvents</code> are sent to the insights target. If this parameter is specified, only
     * included categories are sent to the insights target.
     * </p>
     * 
     * @param callAnalyticsStreamCategories
     *        By default, all <code>CategoryEvents</code> are sent to the insights target. If this parameter is
     *        specified, only included categories are sent to the insights target.
     */

    public void setCallAnalyticsStreamCategories(java.util.Collection<String> callAnalyticsStreamCategories) {
        if (callAnalyticsStreamCategories == null) {
            this.callAnalyticsStreamCategories = null;
            return;
        }

        this.callAnalyticsStreamCategories = new java.util.ArrayList<String>(callAnalyticsStreamCategories);
    }

    /**
     * <p>
     * By default, all <code>CategoryEvents</code> are sent to the insights target. If this parameter is specified, only
     * included categories are sent to the insights target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCallAnalyticsStreamCategories(java.util.Collection)} or
     * {@link #withCallAnalyticsStreamCategories(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param callAnalyticsStreamCategories
     *        By default, all <code>CategoryEvents</code> are sent to the insights target. If this parameter is
     *        specified, only included categories are sent to the insights target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withCallAnalyticsStreamCategories(String... callAnalyticsStreamCategories) {
        if (this.callAnalyticsStreamCategories == null) {
            setCallAnalyticsStreamCategories(new java.util.ArrayList<String>(callAnalyticsStreamCategories.length));
        }
        for (String ele : callAnalyticsStreamCategories) {
            this.callAnalyticsStreamCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * By default, all <code>CategoryEvents</code> are sent to the insights target. If this parameter is specified, only
     * included categories are sent to the insights target.
     * </p>
     * 
     * @param callAnalyticsStreamCategories
     *        By default, all <code>CategoryEvents</code> are sent to the insights target. If this parameter is
     *        specified, only included categories are sent to the insights target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration withCallAnalyticsStreamCategories(java.util.Collection<String> callAnalyticsStreamCategories) {
        setCallAnalyticsStreamCategories(callAnalyticsStreamCategories);
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
        if (getLanguageModelName() != null)
            sb.append("LanguageModelName: ").append(getLanguageModelName()).append(",");
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
        if (getFilterPartialResults() != null)
            sb.append("FilterPartialResults: ").append(getFilterPartialResults()).append(",");
        if (getPostCallAnalyticsSettings() != null)
            sb.append("PostCallAnalyticsSettings: ").append(getPostCallAnalyticsSettings()).append(",");
        if (getCallAnalyticsStreamCategories() != null)
            sb.append("CallAnalyticsStreamCategories: ").append(getCallAnalyticsStreamCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonTranscribeCallAnalyticsProcessorConfiguration == false)
            return false;
        AmazonTranscribeCallAnalyticsProcessorConfiguration other = (AmazonTranscribeCallAnalyticsProcessorConfiguration) obj;
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
        if (other.getLanguageModelName() == null ^ this.getLanguageModelName() == null)
            return false;
        if (other.getLanguageModelName() != null && other.getLanguageModelName().equals(this.getLanguageModelName()) == false)
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
        if (other.getFilterPartialResults() == null ^ this.getFilterPartialResults() == null)
            return false;
        if (other.getFilterPartialResults() != null && other.getFilterPartialResults().equals(this.getFilterPartialResults()) == false)
            return false;
        if (other.getPostCallAnalyticsSettings() == null ^ this.getPostCallAnalyticsSettings() == null)
            return false;
        if (other.getPostCallAnalyticsSettings() != null && other.getPostCallAnalyticsSettings().equals(this.getPostCallAnalyticsSettings()) == false)
            return false;
        if (other.getCallAnalyticsStreamCategories() == null ^ this.getCallAnalyticsStreamCategories() == null)
            return false;
        if (other.getCallAnalyticsStreamCategories() != null
                && other.getCallAnalyticsStreamCategories().equals(this.getCallAnalyticsStreamCategories()) == false)
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
        hashCode = prime * hashCode + ((getLanguageModelName() == null) ? 0 : getLanguageModelName().hashCode());
        hashCode = prime * hashCode + ((getEnablePartialResultsStabilization() == null) ? 0 : getEnablePartialResultsStabilization().hashCode());
        hashCode = prime * hashCode + ((getPartialResultsStability() == null) ? 0 : getPartialResultsStability().hashCode());
        hashCode = prime * hashCode + ((getContentIdentificationType() == null) ? 0 : getContentIdentificationType().hashCode());
        hashCode = prime * hashCode + ((getContentRedactionType() == null) ? 0 : getContentRedactionType().hashCode());
        hashCode = prime * hashCode + ((getPiiEntityTypes() == null) ? 0 : getPiiEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getFilterPartialResults() == null) ? 0 : getFilterPartialResults().hashCode());
        hashCode = prime * hashCode + ((getPostCallAnalyticsSettings() == null) ? 0 : getPostCallAnalyticsSettings().hashCode());
        hashCode = prime * hashCode + ((getCallAnalyticsStreamCategories() == null) ? 0 : getCallAnalyticsStreamCategories().hashCode());
        return hashCode;
    }

    @Override
    public AmazonTranscribeCallAnalyticsProcessorConfiguration clone() {
        try {
            return (AmazonTranscribeCallAnalyticsProcessorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.AmazonTranscribeCallAnalyticsProcessorConfigurationMarshaller.getInstance().marshall(
                this, protocolMarshaller);
    }
}
