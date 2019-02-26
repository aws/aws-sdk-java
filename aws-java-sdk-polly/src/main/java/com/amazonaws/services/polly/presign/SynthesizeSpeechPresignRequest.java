/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.polly.presign;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.polly.model.OutputFormat;
import com.amazonaws.services.polly.model.SpeechMarkType;
import com.amazonaws.services.polly.model.SynthesizeSpeechRequest;
import com.amazonaws.services.polly.model.TextType;
import com.amazonaws.services.polly.model.VoiceId;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Presigning input for {@link AmazonPollyPresigners#getPresignedSynthesizeSpeechUrl(SynthesizeSpeechPresignRequest)}.
 */
public class SynthesizeSpeechPresignRequest implements Serializable {

    private Date expirationDate;

    private AWSCredentialsProvider signingCredentials;

    private java.util.List<String> lexiconNames;

    private String outputFormat;

    private String sampleRate;

    private java.util.List<String> speechMarkTypes;

    private String text;

    private String textType;

    private String voiceId;

    private String languageCode;

    /**
     * @return Expiration of the presigned request. Default is {@link AmazonPollyPresigners#SYNTHESIZE_SPEECH_DEFAULT_EXPIRATION_MINUTES}
     * minutes if not overridden.
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the expiration of the presigned request. Default is {@link AmazonPollyPresigners#SYNTHESIZE_SPEECH_DEFAULT_EXPIRATION_MINUTES}
     * minutes if not overridden.
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Sets the expiration of the presigned request. Default is {@link AmazonPollyPresigners#SYNTHESIZE_SPEECH_DEFAULT_EXPIRATION_MINUTES}
     * minutes if not overridden.
     *
     * @return This object for method chaining.
     */
    public SynthesizeSpeechPresignRequest withExpirationDate(Date date) {
        setExpirationDate(date);
        return this;
    }

    /**
     * @return Credentials to use in presigning the request. If not provided, client credentials are used.
     */
    public AWSCredentialsProvider getSigningCredentials() {
        return signingCredentials;
    }

    /**
     * @param signingCredentials Credentials to use in presigning the request. If not provided, client credentials are used.
     */
    public void setSigningCredentials(AWSCredentialsProvider signingCredentials) {
        this.signingCredentials = signingCredentials;
    }

    /**
     * @param signingCredentials Credentials to use in presigning the request. If not provided, client credentials are used.
     * @return This object for method chaining.
     */
    public SynthesizeSpeechPresignRequest withSigningCredentials(AWSCredentialsProvider signingCredentials) {
        this.signingCredentials = signingCredentials;
        return this;
    }

    /**
     * @see SynthesizeSpeechRequest#getLexiconNames()
     */
    public java.util.List<String> getLexiconNames() {
        return lexiconNames;
    }

    /**
     * @see SynthesizeSpeechRequest#setLexiconNames(Collection)
     */
    public void setLexiconNames(java.util.Collection<String> lexiconNames) {
        if (lexiconNames == null) {
            this.lexiconNames = null;
            return;
        }

        this.lexiconNames = new java.util.ArrayList<String>(lexiconNames);
    }

    /**
     * <p> <b>NOTE:</b> This method appends the values to the existing list (if any). Use {@link
     * #setLexiconNames(java.util.Collection)} or {@link #withLexiconNames(java.util.Collection)} if you want to override the
     * existing values. </p>
     *
     * @see SynthesizeSpeechRequest#withLexiconNames(String...)
     */
    public SynthesizeSpeechPresignRequest withLexiconNames(String... lexiconNames) {
        if (this.lexiconNames == null) {
            setLexiconNames(new java.util.ArrayList<String>(lexiconNames.length));
        }
        for (String ele : lexiconNames) {
            this.lexiconNames.add(ele);
        }
        return this;
    }

    /**
     * @see SynthesizeSpeechRequest#withLexiconNames(Collection)
     */
    public SynthesizeSpeechPresignRequest withLexiconNames(java.util.Collection<String> lexiconNames) {
        setLexiconNames(lexiconNames);
        return this;
    }

    /**
     * @see SynthesizeSpeechRequest#setOutputFormat(String)
     */
    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * @see SynthesizeSpeechRequest#getOutputFormat()
     */
    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * @see SynthesizeSpeechRequest#withOutputFormat(String)
     */
    public SynthesizeSpeechPresignRequest withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * @see SynthesizeSpeechRequest#setOutputFormat(OutputFormat)
     */
    public void setOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
    }

    /**
     * @see SynthesizeSpeechRequest#withOutputFormat(OutputFormat)
     */
    public SynthesizeSpeechPresignRequest withOutputFormat(OutputFormat outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * @see SynthesizeSpeechRequest#setSampleRate(String)
     */
    public void setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * @see SynthesizeSpeechRequest#getSampleRate()
     */
    public String getSampleRate() {
        return this.sampleRate;
    }

    /**
     * @see SynthesizeSpeechRequest#withSampleRate(String)
     */
    public SynthesizeSpeechPresignRequest withSampleRate(String sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * @see SynthesizeSpeechRequest#setText(String)
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @see SynthesizeSpeechRequest#getText()
     */
    public String getText() {
        return this.text;
    }

    /**
     * @see SynthesizeSpeechRequest#withText(String)
     */
    public SynthesizeSpeechPresignRequest withText(String text) {
        setText(text);
        return this;
    }

    /**
     * @see SynthesizeSpeechRequest#setTextType(String)
     */
    public void setTextType(String textType) {
        this.textType = textType;
    }

    /**
     * @see SynthesizeSpeechRequest#getTextType()
     */
    public String getTextType() {
        return this.textType;
    }

    /**
     * @see SynthesizeSpeechRequest#withTextType(String)
     */
    public SynthesizeSpeechPresignRequest withTextType(String textType) {
        setTextType(textType);
        return this;
    }

    /**
     * @see SynthesizeSpeechRequest#setTextType(TextType)
     */
    public void setTextType(TextType textType) {
        this.textType = textType.toString();
    }

    /**
     * @see SynthesizeSpeechRequest#withTextType(TextType)
     */
    public SynthesizeSpeechPresignRequest withTextType(TextType textType) {
        setTextType(textType);
        return this;
    }

    /**
     * @see SynthesizeSpeechRequest#setVoiceId(String)
     */
    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * @see SynthesizeSpeechRequest#getVoiceId()
     */
    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * @see SynthesizeSpeechRequest#withVoiceId(String)
     */
    public SynthesizeSpeechPresignRequest withVoiceId(String voiceId) {
        setVoiceId(voiceId);
        return this;
    }

    /**
     * @see SynthesizeSpeechRequest#setVoiceId(VoiceId)
     */
    public void setVoiceId(VoiceId voiceId) {
        this.voiceId = voiceId.toString();
    }

    /**
     * @see SynthesizeSpeechRequest#withVoiceId(VoiceId)
     */
    public SynthesizeSpeechPresignRequest withVoiceId(VoiceId voiceId) {
        setVoiceId(voiceId);
        return this;
    }

    /**
     * @see SynthesizeSpeechRequest#getSpeechMarkTypes()
     */
    public java.util.List<String> getSpeechMarkTypes() {
        return speechMarkTypes;
    }

    /**
     * @see SynthesizeSpeechRequest#setSpeechMarkTypes(Collection)
     */
    public void setSpeechMarkTypes(java.util.Collection<String> speechMarkTypes) {
        if (speechMarkTypes == null) {
            this.speechMarkTypes = null;
            return;
        }

        this.speechMarkTypes = new java.util.ArrayList<String>(speechMarkTypes);
    }

    /**
     * <p> <b>NOTE:</b> This method appends the values to the existing list (if any). Use {@link
     * #setSpeechMarkTypes(Collection)} or {@link #withSpeechMarkTypes(java.util.Collection)} if you want to override the
     * existing values. </p>
     *
     *  @see SynthesizeSpeechRequest#withSpeechMarkTypes(String...)
     */
    public SynthesizeSpeechPresignRequest withSpeechMarkTypes(String... speechMarkTypes) {
        if (this.speechMarkTypes == null) {
            setSpeechMarkTypes(new java.util.ArrayList<String>(speechMarkTypes.length));
        }
        for (String ele : speechMarkTypes) {
            this.speechMarkTypes.add(ele);
        }
        return this;
    }

    /**
     * @see SynthesizeSpeechRequest#withSpeechMarkTypes(Collection)
     */
    public SynthesizeSpeechPresignRequest withSpeechMarkTypes(java.util.Collection<String> speechMarkTypes) {
        setSpeechMarkTypes(speechMarkTypes);
        return this;
    }

    /**
     * <p> <b>NOTE:</b> This method appends the values to the existing list (if any). Use {@link
     * #setSpeechMarkTypes(Collection)} or {@link #withSpeechMarkTypes(java.util.Collection)} if you want to override the
     * existing values. </p>
     *
     * @see SynthesizeSpeechRequest#withSpeechMarkTypes(SpeechMarkType...)
     */
    public SynthesizeSpeechPresignRequest withSpeechMarkTypes(SpeechMarkType... speechMarkTypes) {
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
     * @see SynthesizeSpeechRequest#getLanguageCode()
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * @see SynthesizeSpeechRequest#setLanguageCode(String)
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * @see SynthesizeSpeechRequest#withLanguageCode(String)
     */
    public SynthesizeSpeechPresignRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }
}
