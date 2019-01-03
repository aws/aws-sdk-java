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
package com.amazonaws.services.polly.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/StartSpeechSynthesisTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSpeechSynthesisTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are
     * applied only if the language of the lexicon is the same as the language of the voice.
     * </p>
     */
    private java.util.List<String> lexiconNames;
    /**
     * <p>
     * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm.
     * For speech marks, this will be json.
     * </p>
     */
    private String outputFormat;
    /**
     * <p>
     * Amazon S3 bucket name to which the output file will be saved.
     * </p>
     */
    private String outputS3BucketName;
    /**
     * <p>
     * The Amazon S3 key prefix for the output speech file.
     * </p>
     */
    private String outputS3KeyPrefix;
    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050". The default value is "22050".
     * </p>
     * <p>
     * Valid values for pcm are "8000" and "16000" The default value is "16000".
     * </p>
     */
    private String sampleRate;
    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     */
    private java.util.List<String> speechMarkTypes;
    /**
     * <p>
     * The input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input text.
     * </p>
     */
    private String text;
    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value is plain text.
     * </p>
     */
    private String textType;
    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     */
    private String voiceId;
    /**
     * <p>
     * Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual voice, such
     * as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the
     * bilingual voice. The default language for any voice is the one returned by the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation for the
     * <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will use Indian English
     * rather than Hindi.
     * </p>
     */
    private String languageCode;

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are
     * applied only if the language of the lexicon is the same as the language of the voice.
     * </p>
     * 
     * @return List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons
     *         are applied only if the language of the lexicon is the same as the language of the voice.
     */

    public java.util.List<String> getLexiconNames() {
        return lexiconNames;
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are
     * applied only if the language of the lexicon is the same as the language of the voice.
     * </p>
     * 
     * @param lexiconNames
     *        List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons
     *        are applied only if the language of the lexicon is the same as the language of the voice.
     */

    public void setLexiconNames(java.util.Collection<String> lexiconNames) {
        if (lexiconNames == null) {
            this.lexiconNames = null;
            return;
        }

        this.lexiconNames = new java.util.ArrayList<String>(lexiconNames);
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are
     * applied only if the language of the lexicon is the same as the language of the voice.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLexiconNames(java.util.Collection)} or {@link #withLexiconNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lexiconNames
     *        List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons
     *        are applied only if the language of the lexicon is the same as the language of the voice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeechSynthesisTaskRequest withLexiconNames(String... lexiconNames) {
        if (this.lexiconNames == null) {
            setLexiconNames(new java.util.ArrayList<String>(lexiconNames.length));
        }
        for (String ele : lexiconNames) {
            this.lexiconNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are
     * applied only if the language of the lexicon is the same as the language of the voice.
     * </p>
     * 
     * @param lexiconNames
     *        List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons
     *        are applied only if the language of the lexicon is the same as the language of the voice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeechSynthesisTaskRequest withLexiconNames(java.util.Collection<String> lexiconNames) {
        setLexiconNames(lexiconNames);
        return this;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm.
     * For speech marks, this will be json.
     * </p>
     * 
     * @param outputFormat
     *        The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis,
     *        or pcm. For speech marks, this will be json.
     * @see OutputFormat
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm.
     * For speech marks, this will be json.
     * </p>
     * 
     * @return The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis,
     *         or pcm. For speech marks, this will be json.
     * @see OutputFormat
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm.
     * For speech marks, this will be json.
     * </p>
     * 
     * @param outputFormat
     *        The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis,
     *        or pcm. For speech marks, this will be json.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public StartSpeechSynthesisTaskRequest withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm.
     * For speech marks, this will be json.
     * </p>
     * 
     * @param outputFormat
     *        The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis,
     *        or pcm. For speech marks, this will be json.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public StartSpeechSynthesisTaskRequest withOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
        return this;
    }

    /**
     * <p>
     * Amazon S3 bucket name to which the output file will be saved.
     * </p>
     * 
     * @param outputS3BucketName
     *        Amazon S3 bucket name to which the output file will be saved.
     */

    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * Amazon S3 bucket name to which the output file will be saved.
     * </p>
     * 
     * @return Amazon S3 bucket name to which the output file will be saved.
     */

    public String getOutputS3BucketName() {
        return this.outputS3BucketName;
    }

    /**
     * <p>
     * Amazon S3 bucket name to which the output file will be saved.
     * </p>
     * 
     * @param outputS3BucketName
     *        Amazon S3 bucket name to which the output file will be saved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeechSynthesisTaskRequest withOutputS3BucketName(String outputS3BucketName) {
        setOutputS3BucketName(outputS3BucketName);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 key prefix for the output speech file.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The Amazon S3 key prefix for the output speech file.
     */

    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The Amazon S3 key prefix for the output speech file.
     * </p>
     * 
     * @return The Amazon S3 key prefix for the output speech file.
     */

    public String getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix;
    }

    /**
     * <p>
     * The Amazon S3 key prefix for the output speech file.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The Amazon S3 key prefix for the output speech file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeechSynthesisTaskRequest withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        setOutputS3KeyPrefix(outputS3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050". The default value is "22050".
     * </p>
     * <p>
     * Valid values for pcm are "8000" and "16000" The default value is "16000".
     * </p>
     * 
     * @param sampleRate
     *        The audio frequency specified in Hz.</p>
     *        <p>
     *        The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050". The default value is "22050".
     *        </p>
     *        <p>
     *        Valid values for pcm are "8000" and "16000" The default value is "16000".
     */

    public void setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050". The default value is "22050".
     * </p>
     * <p>
     * Valid values for pcm are "8000" and "16000" The default value is "16000".
     * </p>
     * 
     * @return The audio frequency specified in Hz.</p>
     *         <p>
     *         The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050". The default value is "22050".
     *         </p>
     *         <p>
     *         Valid values for pcm are "8000" and "16000" The default value is "16000".
     */

    public String getSampleRate() {
        return this.sampleRate;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050". The default value is "22050".
     * </p>
     * <p>
     * Valid values for pcm are "8000" and "16000" The default value is "16000".
     * </p>
     * 
     * @param sampleRate
     *        The audio frequency specified in Hz.</p>
     *        <p>
     *        The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050". The default value is "22050".
     *        </p>
     *        <p>
     *        Valid values for pcm are "8000" and "16000" The default value is "16000".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeechSynthesisTaskRequest withSampleRate(String sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
     * </p>
     * 
     * @param snsTopicArn
     *        ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
     * </p>
     * 
     * @return ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
     * </p>
     * 
     * @param snsTopicArn
     *        ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeechSynthesisTaskRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     * 
     * @return The type of speech marks returned for the input text.
     * @see SpeechMarkType
     */

    public java.util.List<String> getSpeechMarkTypes() {
        return speechMarkTypes;
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     * 
     * @param speechMarkTypes
     *        The type of speech marks returned for the input text.
     * @see SpeechMarkType
     */

    public void setSpeechMarkTypes(java.util.Collection<String> speechMarkTypes) {
        if (speechMarkTypes == null) {
            this.speechMarkTypes = null;
            return;
        }

        this.speechMarkTypes = new java.util.ArrayList<String>(speechMarkTypes);
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpeechMarkTypes(java.util.Collection)} or {@link #withSpeechMarkTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param speechMarkTypes
     *        The type of speech marks returned for the input text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpeechMarkType
     */

    public StartSpeechSynthesisTaskRequest withSpeechMarkTypes(String... speechMarkTypes) {
        if (this.speechMarkTypes == null) {
            setSpeechMarkTypes(new java.util.ArrayList<String>(speechMarkTypes.length));
        }
        for (String ele : speechMarkTypes) {
            this.speechMarkTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     * 
     * @param speechMarkTypes
     *        The type of speech marks returned for the input text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpeechMarkType
     */

    public StartSpeechSynthesisTaskRequest withSpeechMarkTypes(java.util.Collection<String> speechMarkTypes) {
        setSpeechMarkTypes(speechMarkTypes);
        return this;
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     * 
     * @param speechMarkTypes
     *        The type of speech marks returned for the input text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpeechMarkType
     */

    public StartSpeechSynthesisTaskRequest withSpeechMarkTypes(SpeechMarkType... speechMarkTypes) {
        java.util.ArrayList<String> speechMarkTypesCopy = new java.util.ArrayList<String>(speechMarkTypes.length);
        for (SpeechMarkType value : speechMarkTypes) {
            speechMarkTypesCopy.add(value.toString());
        }
        if (getSpeechMarkTypes() == null) {
            setSpeechMarkTypes(speechMarkTypesCopy);
        } else {
            getSpeechMarkTypes().addAll(speechMarkTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input text.
     * </p>
     * 
     * @param text
     *        The input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input
     *        text.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input text.
     * </p>
     * 
     * @return The input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input
     *         text.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input text.
     * </p>
     * 
     * @param text
     *        The input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input
     *        text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeechSynthesisTaskRequest withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value is plain text.
     * </p>
     * 
     * @param textType
     *        Specifies whether the input text is plain text or SSML. The default value is plain text.
     * @see TextType
     */

    public void setTextType(String textType) {
        this.textType = textType;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value is plain text.
     * </p>
     * 
     * @return Specifies whether the input text is plain text or SSML. The default value is plain text.
     * @see TextType
     */

    public String getTextType() {
        return this.textType;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value is plain text.
     * </p>
     * 
     * @param textType
     *        Specifies whether the input text is plain text or SSML. The default value is plain text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextType
     */

    public StartSpeechSynthesisTaskRequest withTextType(String textType) {
        setTextType(textType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value is plain text.
     * </p>
     * 
     * @param textType
     *        Specifies whether the input text is plain text or SSML. The default value is plain text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextType
     */

    public StartSpeechSynthesisTaskRequest withTextType(TextType textType) {
        this.textType = textType.toString();
        return this;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * 
     * @param voiceId
     *        Voice ID to use for the synthesis.
     * @see VoiceId
     */

    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * 
     * @return Voice ID to use for the synthesis.
     * @see VoiceId
     */

    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * 
     * @param voiceId
     *        Voice ID to use for the synthesis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceId
     */

    public StartSpeechSynthesisTaskRequest withVoiceId(String voiceId) {
        setVoiceId(voiceId);
        return this;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * 
     * @param voiceId
     *        Voice ID to use for the synthesis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceId
     */

    public StartSpeechSynthesisTaskRequest withVoiceId(VoiceId voiceId) {
        this.voiceId = voiceId.toString();
        return this;
    }

    /**
     * <p>
     * Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual voice, such
     * as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the
     * bilingual voice. The default language for any voice is the one returned by the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation for the
     * <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will use Indian English
     * rather than Hindi.
     * </p>
     * 
     * @param languageCode
     *        Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual
     *        voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN). </p>
     *        <p>
     *        If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language
     *        of the bilingual voice. The default language for any voice is the one returned by the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation
     *        for the <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will use
     *        Indian English rather than Hindi.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual voice, such
     * as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the
     * bilingual voice. The default language for any voice is the one returned by the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation for the
     * <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will use Indian English
     * rather than Hindi.
     * </p>
     * 
     * @return Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual
     *         voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN). </p>
     *         <p>
     *         If a bilingual voice is used and no language code is specified, Amazon Polly will use the default
     *         language of the bilingual voice. The default language for any voice is the one returned by the <a
     *         href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation
     *         for the <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will
     *         use Indian English rather than Hindi.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual voice, such
     * as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the
     * bilingual voice. The default language for any voice is the one returned by the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation for the
     * <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will use Indian English
     * rather than Hindi.
     * </p>
     * 
     * @param languageCode
     *        Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual
     *        voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN). </p>
     *        <p>
     *        If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language
     *        of the bilingual voice. The default language for any voice is the one returned by the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation
     *        for the <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will use
     *        Indian English rather than Hindi.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartSpeechSynthesisTaskRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual voice, such
     * as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the
     * bilingual voice. The default language for any voice is the one returned by the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation for the
     * <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will use Indian English
     * rather than Hindi.
     * </p>
     * 
     * @param languageCode
     *        Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual
     *        voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN). </p>
     *        <p>
     *        If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language
     *        of the bilingual voice. The default language for any voice is the one returned by the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation
     *        for the <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will use
     *        Indian English rather than Hindi.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public StartSpeechSynthesisTaskRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
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
        if (getLexiconNames() != null)
            sb.append("LexiconNames: ").append("***Sensitive Data Redacted***").append(",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: ").append(getOutputFormat()).append(",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: ").append(getOutputS3BucketName()).append(",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: ").append(getOutputS3KeyPrefix()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getSpeechMarkTypes() != null)
            sb.append("SpeechMarkTypes: ").append(getSpeechMarkTypes()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getTextType() != null)
            sb.append("TextType: ").append(getTextType()).append(",");
        if (getVoiceId() != null)
            sb.append("VoiceId: ").append(getVoiceId()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSpeechSynthesisTaskRequest == false)
            return false;
        StartSpeechSynthesisTaskRequest other = (StartSpeechSynthesisTaskRequest) obj;
        if (other.getLexiconNames() == null ^ this.getLexiconNames() == null)
            return false;
        if (other.getLexiconNames() != null && other.getLexiconNames().equals(this.getLexiconNames()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        if (other.getOutputS3BucketName() == null ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null && other.getOutputS3BucketName().equals(this.getOutputS3BucketName()) == false)
            return false;
        if (other.getOutputS3KeyPrefix() == null ^ this.getOutputS3KeyPrefix() == null)
            return false;
        if (other.getOutputS3KeyPrefix() != null && other.getOutputS3KeyPrefix().equals(this.getOutputS3KeyPrefix()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSpeechMarkTypes() == null ^ this.getSpeechMarkTypes() == null)
            return false;
        if (other.getSpeechMarkTypes() != null && other.getSpeechMarkTypes().equals(this.getSpeechMarkTypes()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getTextType() == null ^ this.getTextType() == null)
            return false;
        if (other.getTextType() != null && other.getTextType().equals(this.getTextType()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLexiconNames() == null) ? 0 : getLexiconNames().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSpeechMarkTypes() == null) ? 0 : getSpeechMarkTypes().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getTextType() == null) ? 0 : getTextType().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public StartSpeechSynthesisTaskRequest clone() {
        return (StartSpeechSynthesisTaskRequest) super.clone();
    }

}
