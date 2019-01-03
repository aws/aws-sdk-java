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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * SynthesisTask object that provides information about a speech synthesis task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/SynthesisTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SynthesisTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Polly generated identifier for a speech synthesis task.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * Current status of the individual speech synthesis task.
     * </p>
     */
    private String taskStatus;
    /**
     * <p>
     * Reason for the current status of a specific speech synthesis task, including errors if the task has failed.
     * </p>
     */
    private String taskStatusReason;
    /**
     * <p>
     * Pathway for the output speech file.
     * </p>
     */
    private String outputUri;
    /**
     * <p>
     * Timestamp for the time the synthesis task was started.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Number of billable characters synthesized.
     * </p>
     */
    private Integer requestCharacters;
    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
     * </p>
     */
    private String snsTopicArn;
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
     * The type of speech marks returned for the input text.
     * </p>
     */
    private java.util.List<String> speechMarkTypes;
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
     * Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as Aditi,
     * which can be used for either Indian English (en-IN) or Hindi (hi-IN).
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
     * The Amazon Polly generated identifier for a speech synthesis task.
     * </p>
     * 
     * @param taskId
     *        The Amazon Polly generated identifier for a speech synthesis task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The Amazon Polly generated identifier for a speech synthesis task.
     * </p>
     * 
     * @return The Amazon Polly generated identifier for a speech synthesis task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The Amazon Polly generated identifier for a speech synthesis task.
     * </p>
     * 
     * @param taskId
     *        The Amazon Polly generated identifier for a speech synthesis task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SynthesisTask withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * Current status of the individual speech synthesis task.
     * </p>
     * 
     * @param taskStatus
     *        Current status of the individual speech synthesis task.
     * @see TaskStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * Current status of the individual speech synthesis task.
     * </p>
     * 
     * @return Current status of the individual speech synthesis task.
     * @see TaskStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * Current status of the individual speech synthesis task.
     * </p>
     * 
     * @param taskStatus
     *        Current status of the individual speech synthesis task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public SynthesisTask withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * Current status of the individual speech synthesis task.
     * </p>
     * 
     * @param taskStatus
     *        Current status of the individual speech synthesis task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public SynthesisTask withTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * Reason for the current status of a specific speech synthesis task, including errors if the task has failed.
     * </p>
     * 
     * @param taskStatusReason
     *        Reason for the current status of a specific speech synthesis task, including errors if the task has
     *        failed.
     */

    public void setTaskStatusReason(String taskStatusReason) {
        this.taskStatusReason = taskStatusReason;
    }

    /**
     * <p>
     * Reason for the current status of a specific speech synthesis task, including errors if the task has failed.
     * </p>
     * 
     * @return Reason for the current status of a specific speech synthesis task, including errors if the task has
     *         failed.
     */

    public String getTaskStatusReason() {
        return this.taskStatusReason;
    }

    /**
     * <p>
     * Reason for the current status of a specific speech synthesis task, including errors if the task has failed.
     * </p>
     * 
     * @param taskStatusReason
     *        Reason for the current status of a specific speech synthesis task, including errors if the task has
     *        failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SynthesisTask withTaskStatusReason(String taskStatusReason) {
        setTaskStatusReason(taskStatusReason);
        return this;
    }

    /**
     * <p>
     * Pathway for the output speech file.
     * </p>
     * 
     * @param outputUri
     *        Pathway for the output speech file.
     */

    public void setOutputUri(String outputUri) {
        this.outputUri = outputUri;
    }

    /**
     * <p>
     * Pathway for the output speech file.
     * </p>
     * 
     * @return Pathway for the output speech file.
     */

    public String getOutputUri() {
        return this.outputUri;
    }

    /**
     * <p>
     * Pathway for the output speech file.
     * </p>
     * 
     * @param outputUri
     *        Pathway for the output speech file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SynthesisTask withOutputUri(String outputUri) {
        setOutputUri(outputUri);
        return this;
    }

    /**
     * <p>
     * Timestamp for the time the synthesis task was started.
     * </p>
     * 
     * @param creationTime
     *        Timestamp for the time the synthesis task was started.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Timestamp for the time the synthesis task was started.
     * </p>
     * 
     * @return Timestamp for the time the synthesis task was started.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Timestamp for the time the synthesis task was started.
     * </p>
     * 
     * @param creationTime
     *        Timestamp for the time the synthesis task was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SynthesisTask withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Number of billable characters synthesized.
     * </p>
     * 
     * @param requestCharacters
     *        Number of billable characters synthesized.
     */

    public void setRequestCharacters(Integer requestCharacters) {
        this.requestCharacters = requestCharacters;
    }

    /**
     * <p>
     * Number of billable characters synthesized.
     * </p>
     * 
     * @return Number of billable characters synthesized.
     */

    public Integer getRequestCharacters() {
        return this.requestCharacters;
    }

    /**
     * <p>
     * Number of billable characters synthesized.
     * </p>
     * 
     * @param requestCharacters
     *        Number of billable characters synthesized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SynthesisTask withRequestCharacters(Integer requestCharacters) {
        setRequestCharacters(requestCharacters);
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

    public SynthesisTask withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

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

    public SynthesisTask withLexiconNames(String... lexiconNames) {
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

    public SynthesisTask withLexiconNames(java.util.Collection<String> lexiconNames) {
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

    public SynthesisTask withOutputFormat(String outputFormat) {
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

    public SynthesisTask withOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
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

    public SynthesisTask withSampleRate(String sampleRate) {
        setSampleRate(sampleRate);
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

    public SynthesisTask withSpeechMarkTypes(String... speechMarkTypes) {
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

    public SynthesisTask withSpeechMarkTypes(java.util.Collection<String> speechMarkTypes) {
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

    public SynthesisTask withSpeechMarkTypes(SpeechMarkType... speechMarkTypes) {
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

    public SynthesisTask withTextType(String textType) {
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

    public SynthesisTask withTextType(TextType textType) {
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

    public SynthesisTask withVoiceId(String voiceId) {
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

    public SynthesisTask withVoiceId(VoiceId voiceId) {
        this.voiceId = voiceId.toString();
        return this;
    }

    /**
     * <p>
     * Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as Aditi,
     * which can be used for either Indian English (en-IN) or Hindi (hi-IN).
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
     *        Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as
     *        Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN). </p>
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
     * Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as Aditi,
     * which can be used for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the
     * bilingual voice. The default language for any voice is the one returned by the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation for the
     * <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will use Indian English
     * rather than Hindi.
     * </p>
     * 
     * @return Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as
     *         Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN). </p>
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
     * Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as Aditi,
     * which can be used for either Indian English (en-IN) or Hindi (hi-IN).
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
     *        Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as
     *        Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN). </p>
     *        <p>
     *        If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language
     *        of the bilingual voice. The default language for any voice is the one returned by the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation
     *        for the <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will use
     *        Indian English rather than Hindi.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public SynthesisTask withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as Aditi,
     * which can be used for either Indian English (en-IN) or Hindi (hi-IN).
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
     *        Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as
     *        Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN). </p>
     *        <p>
     *        If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language
     *        of the bilingual voice. The default language for any voice is the one returned by the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation
     *        for the <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will use
     *        Indian English rather than Hindi.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public SynthesisTask withLanguageCode(LanguageCode languageCode) {
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getTaskStatus() != null)
            sb.append("TaskStatus: ").append(getTaskStatus()).append(",");
        if (getTaskStatusReason() != null)
            sb.append("TaskStatusReason: ").append(getTaskStatusReason()).append(",");
        if (getOutputUri() != null)
            sb.append("OutputUri: ").append(getOutputUri()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getRequestCharacters() != null)
            sb.append("RequestCharacters: ").append(getRequestCharacters()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getLexiconNames() != null)
            sb.append("LexiconNames: ").append("***Sensitive Data Redacted***").append(",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: ").append(getOutputFormat()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate()).append(",");
        if (getSpeechMarkTypes() != null)
            sb.append("SpeechMarkTypes: ").append(getSpeechMarkTypes()).append(",");
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

        if (obj instanceof SynthesisTask == false)
            return false;
        SynthesisTask other = (SynthesisTask) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getTaskStatusReason() == null ^ this.getTaskStatusReason() == null)
            return false;
        if (other.getTaskStatusReason() != null && other.getTaskStatusReason().equals(this.getTaskStatusReason()) == false)
            return false;
        if (other.getOutputUri() == null ^ this.getOutputUri() == null)
            return false;
        if (other.getOutputUri() != null && other.getOutputUri().equals(this.getOutputUri()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getRequestCharacters() == null ^ this.getRequestCharacters() == null)
            return false;
        if (other.getRequestCharacters() != null && other.getRequestCharacters().equals(this.getRequestCharacters()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getLexiconNames() == null ^ this.getLexiconNames() == null)
            return false;
        if (other.getLexiconNames() != null && other.getLexiconNames().equals(this.getLexiconNames()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getSpeechMarkTypes() == null ^ this.getSpeechMarkTypes() == null)
            return false;
        if (other.getSpeechMarkTypes() != null && other.getSpeechMarkTypes().equals(this.getSpeechMarkTypes()) == false)
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

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskStatusReason() == null) ? 0 : getTaskStatusReason().hashCode());
        hashCode = prime * hashCode + ((getOutputUri() == null) ? 0 : getOutputUri().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getRequestCharacters() == null) ? 0 : getRequestCharacters().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getLexiconNames() == null) ? 0 : getLexiconNames().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getSpeechMarkTypes() == null) ? 0 : getSpeechMarkTypes().hashCode());
        hashCode = prime * hashCode + ((getTextType() == null) ? 0 : getTextType().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public SynthesisTask clone() {
        try {
            return (SynthesisTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.polly.model.transform.SynthesisTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
