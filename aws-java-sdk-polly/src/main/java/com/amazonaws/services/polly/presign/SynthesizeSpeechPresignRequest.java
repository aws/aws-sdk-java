/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.polly.model.TextType;
import com.amazonaws.services.polly.model.VoiceId;

import java.io.Serializable;
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

    private String text;

    private String textType;

    private String voiceId;


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

    public java.util.List<String> getLexiconNames() {
        return lexiconNames;
    }

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
     * @return Returns a reference to this object so that method calls can be chained together.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public SynthesizeSpeechPresignRequest withLexiconNames(java.util.Collection<String> lexiconNames) {
        setLexiconNames(lexiconNames);
        return this;
    }

    /**
     * @see OutputFormat
     */
    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * @see OutputFormat
     */
    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */
    public SynthesizeSpeechPresignRequest withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * @see OutputFormat
     */
    public void setOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
    }

    /**
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see com.amazonaws.services.polly.model.OutputFormat
     */
    public SynthesizeSpeechPresignRequest withOutputFormat(OutputFormat outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * @param sampleRate
     */
    public void setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * @return
     */
    public String getSampleRate() {
        return this.sampleRate;
    }

    /**
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public SynthesizeSpeechPresignRequest withSampleRate(String sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public SynthesizeSpeechPresignRequest withText(String text) {
        setText(text);
        return this;
    }

    /**
     * @see TextType
     */
    public void setTextType(String textType) {
        this.textType = textType;
    }

    /**
     * @see TextType
     */
    public String getTextType() {
        return this.textType;
    }

    /**
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextType
     */
    public SynthesizeSpeechPresignRequest withTextType(String textType) {
        setTextType(textType);
        return this;
    }

    /**
     * @see TextType
     */
    public void setTextType(TextType textType) {
        this.textType = textType.toString();
    }

    /**
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextType
     */
    public SynthesizeSpeechPresignRequest withTextType(TextType textType) {
        setTextType(textType);
        return this;
    }

    /**
     * @see VoiceId
     */
    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * @see VoiceId
     */
    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceId
     */
    public SynthesizeSpeechPresignRequest withVoiceId(String voiceId) {
        setVoiceId(voiceId);
        return this;
    }

    /**
     * @see VoiceId
     */
    public void setVoiceId(VoiceId voiceId) {
        this.voiceId = voiceId.toString();
    }

    /**
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceId
     */
    public SynthesizeSpeechPresignRequest withVoiceId(VoiceId voiceId) {
        setVoiceId(voiceId);
        return this;
    }
}
