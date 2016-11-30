/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class SynthesizeSpeechRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are
     * applied only if the language of the lexicon is the same as the language of the voice. For information about
     * storing lexicons, see <a href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html">PutLexicon</a>.
     * </p>
     */
    private java.util.List<String> lexiconNames;
    /**
     * <p>
     * The audio format in which the resulting stream will be encoded.
     * </p>
     */
    private String outputFormat;
    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for <code>mp3</code> and <code>ogg_vorbis</code> are "8000", "16000", and "22050". The default
     * value is "22050".
     * </p>
     * <p>
     * Valid values for <code>pcm</code> are "8000" and "16000" The default value is "16000".
     * </p>
     */
    private String sampleRate;
    /**
     * <p>
     * Input text to synthesize. If you specify <code>ssml</code> as the <code>TextType</code>, follow the SSML format
     * for the input text.
     * </p>
     */
    private String text;
    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value is plain text. For more information,
     * see <a href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using SSML</a>.
     * </p>
     */
    private String textType;
    /**
     * <p>
     * Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation.
     * </p>
     */
    private String voiceId;

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are
     * applied only if the language of the lexicon is the same as the language of the voice. For information about
     * storing lexicons, see <a href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html">PutLexicon</a>.
     * </p>
     * 
     * @return List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons
     *         are applied only if the language of the lexicon is the same as the language of the voice. For information
     *         about storing lexicons, see <a
     *         href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html">PutLexicon</a>.
     */

    public java.util.List<String> getLexiconNames() {
        return lexiconNames;
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are
     * applied only if the language of the lexicon is the same as the language of the voice. For information about
     * storing lexicons, see <a href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html">PutLexicon</a>.
     * </p>
     * 
     * @param lexiconNames
     *        List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons
     *        are applied only if the language of the lexicon is the same as the language of the voice. For information
     *        about storing lexicons, see <a
     *        href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html">PutLexicon</a>.
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
     * applied only if the language of the lexicon is the same as the language of the voice. For information about
     * storing lexicons, see <a href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html">PutLexicon</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLexiconNames(java.util.Collection)} or {@link #withLexiconNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lexiconNames
     *        List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons
     *        are applied only if the language of the lexicon is the same as the language of the voice. For information
     *        about storing lexicons, see <a
     *        href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html">PutLexicon</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SynthesizeSpeechRequest withLexiconNames(String... lexiconNames) {
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
     * applied only if the language of the lexicon is the same as the language of the voice. For information about
     * storing lexicons, see <a href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html">PutLexicon</a>.
     * </p>
     * 
     * @param lexiconNames
     *        List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons
     *        are applied only if the language of the lexicon is the same as the language of the voice. For information
     *        about storing lexicons, see <a
     *        href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html">PutLexicon</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SynthesizeSpeechRequest withLexiconNames(java.util.Collection<String> lexiconNames) {
        setLexiconNames(lexiconNames);
        return this;
    }

    /**
     * <p>
     * The audio format in which the resulting stream will be encoded.
     * </p>
     * 
     * @param outputFormat
     *        The audio format in which the resulting stream will be encoded.
     * @see OutputFormat
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The audio format in which the resulting stream will be encoded.
     * </p>
     * 
     * @return The audio format in which the resulting stream will be encoded.
     * @see OutputFormat
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * <p>
     * The audio format in which the resulting stream will be encoded.
     * </p>
     * 
     * @param outputFormat
     *        The audio format in which the resulting stream will be encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public SynthesizeSpeechRequest withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p>
     * The audio format in which the resulting stream will be encoded.
     * </p>
     * 
     * @param outputFormat
     *        The audio format in which the resulting stream will be encoded.
     * @see OutputFormat
     */

    public void setOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
    }

    /**
     * <p>
     * The audio format in which the resulting stream will be encoded.
     * </p>
     * 
     * @param outputFormat
     *        The audio format in which the resulting stream will be encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public SynthesizeSpeechRequest withOutputFormat(OutputFormat outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for <code>mp3</code> and <code>ogg_vorbis</code> are "8000", "16000", and "22050". The default
     * value is "22050".
     * </p>
     * <p>
     * Valid values for <code>pcm</code> are "8000" and "16000" The default value is "16000".
     * </p>
     * 
     * @param sampleRate
     *        The audio frequency specified in Hz. </p>
     *        <p>
     *        The valid values for <code>mp3</code> and <code>ogg_vorbis</code> are "8000", "16000", and "22050". The
     *        default value is "22050".
     *        </p>
     *        <p>
     *        Valid values for <code>pcm</code> are "8000" and "16000" The default value is "16000".
     */

    public void setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for <code>mp3</code> and <code>ogg_vorbis</code> are "8000", "16000", and "22050". The default
     * value is "22050".
     * </p>
     * <p>
     * Valid values for <code>pcm</code> are "8000" and "16000" The default value is "16000".
     * </p>
     * 
     * @return The audio frequency specified in Hz. </p>
     *         <p>
     *         The valid values for <code>mp3</code> and <code>ogg_vorbis</code> are "8000", "16000", and "22050". The
     *         default value is "22050".
     *         </p>
     *         <p>
     *         Valid values for <code>pcm</code> are "8000" and "16000" The default value is "16000".
     */

    public String getSampleRate() {
        return this.sampleRate;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for <code>mp3</code> and <code>ogg_vorbis</code> are "8000", "16000", and "22050". The default
     * value is "22050".
     * </p>
     * <p>
     * Valid values for <code>pcm</code> are "8000" and "16000" The default value is "16000".
     * </p>
     * 
     * @param sampleRate
     *        The audio frequency specified in Hz. </p>
     *        <p>
     *        The valid values for <code>mp3</code> and <code>ogg_vorbis</code> are "8000", "16000", and "22050". The
     *        default value is "22050".
     *        </p>
     *        <p>
     *        Valid values for <code>pcm</code> are "8000" and "16000" The default value is "16000".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SynthesizeSpeechRequest withSampleRate(String sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * <p>
     * Input text to synthesize. If you specify <code>ssml</code> as the <code>TextType</code>, follow the SSML format
     * for the input text.
     * </p>
     * 
     * @param text
     *        Input text to synthesize. If you specify <code>ssml</code> as the <code>TextType</code>, follow the SSML
     *        format for the input text.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * Input text to synthesize. If you specify <code>ssml</code> as the <code>TextType</code>, follow the SSML format
     * for the input text.
     * </p>
     * 
     * @return Input text to synthesize. If you specify <code>ssml</code> as the <code>TextType</code>, follow the SSML
     *         format for the input text.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * Input text to synthesize. If you specify <code>ssml</code> as the <code>TextType</code>, follow the SSML format
     * for the input text.
     * </p>
     * 
     * @param text
     *        Input text to synthesize. If you specify <code>ssml</code> as the <code>TextType</code>, follow the SSML
     *        format for the input text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SynthesizeSpeechRequest withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value is plain text. For more information,
     * see <a href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using SSML</a>.
     * </p>
     * 
     * @param textType
     *        Specifies whether the input text is plain text or SSML. The default value is plain text. For more
     *        information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using SSML</a>.
     * @see TextType
     */

    public void setTextType(String textType) {
        this.textType = textType;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value is plain text. For more information,
     * see <a href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using SSML</a>.
     * </p>
     * 
     * @return Specifies whether the input text is plain text or SSML. The default value is plain text. For more
     *         information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using SSML</a>.
     * @see TextType
     */

    public String getTextType() {
        return this.textType;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value is plain text. For more information,
     * see <a href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using SSML</a>.
     * </p>
     * 
     * @param textType
     *        Specifies whether the input text is plain text or SSML. The default value is plain text. For more
     *        information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using SSML</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextType
     */

    public SynthesizeSpeechRequest withTextType(String textType) {
        setTextType(textType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value is plain text. For more information,
     * see <a href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using SSML</a>.
     * </p>
     * 
     * @param textType
     *        Specifies whether the input text is plain text or SSML. The default value is plain text. For more
     *        information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using SSML</a>.
     * @see TextType
     */

    public void setTextType(TextType textType) {
        this.textType = textType.toString();
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value is plain text. For more information,
     * see <a href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using SSML</a>.
     * </p>
     * 
     * @param textType
     *        Specifies whether the input text is plain text or SSML. The default value is plain text. For more
     *        information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using SSML</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextType
     */

    public SynthesizeSpeechRequest withTextType(TextType textType) {
        setTextType(textType);
        return this;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation.
     * </p>
     * 
     * @param voiceId
     *        Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the <a
     *        href="http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation.
     * @see VoiceId
     */

    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation.
     * </p>
     * 
     * @return Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the <a
     *         href="http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation.
     * @see VoiceId
     */

    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation.
     * </p>
     * 
     * @param voiceId
     *        Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the <a
     *        href="http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceId
     */

    public SynthesizeSpeechRequest withVoiceId(String voiceId) {
        setVoiceId(voiceId);
        return this;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation.
     * </p>
     * 
     * @param voiceId
     *        Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the <a
     *        href="http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation.
     * @see VoiceId
     */

    public void setVoiceId(VoiceId voiceId) {
        this.voiceId = voiceId.toString();
    }

    /**
     * <p>
     * Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation.
     * </p>
     * 
     * @param voiceId
     *        Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the <a
     *        href="http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceId
     */

    public SynthesizeSpeechRequest withVoiceId(VoiceId voiceId) {
        setVoiceId(voiceId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("LexiconNames: " + getLexiconNames() + ",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: " + getOutputFormat() + ",");
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate() + ",");
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getTextType() != null)
            sb.append("TextType: " + getTextType() + ",");
        if (getVoiceId() != null)
            sb.append("VoiceId: " + getVoiceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SynthesizeSpeechRequest == false)
            return false;
        SynthesizeSpeechRequest other = (SynthesizeSpeechRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLexiconNames() == null) ? 0 : getLexiconNames().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getTextType() == null) ? 0 : getTextType().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        return hashCode;
    }

    @Override
    public SynthesizeSpeechRequest clone() {
        return (SynthesizeSpeechRequest) super.clone();
    }
}
