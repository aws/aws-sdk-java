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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/SynthesizeSpeech" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm.
     * For speech marks, this will be json.
     * </p>
     * <p>
     * When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
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
     * The type of speech marks returned for the input text.
     * </p>
     */
    private java.util.List<String> speechMarkTypes;
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
     * Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual voice, such
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
     * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm.
     * For speech marks, this will be json.
     * </p>
     * <p>
     * When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
     * </p>
     * 
     * @param outputFormat
     *        The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis,
     *        or pcm. For speech marks, this will be json. </p>
     *        <p>
     *        When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian
     *        format.
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
     * <p>
     * When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
     * </p>
     * 
     * @return The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis,
     *         or pcm. For speech marks, this will be json. </p>
     *         <p>
     *         When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian
     *         format.
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
     * <p>
     * When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
     * </p>
     * 
     * @param outputFormat
     *        The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis,
     *        or pcm. For speech marks, this will be json. </p>
     *        <p>
     *        When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public SynthesizeSpeechRequest withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm.
     * For speech marks, this will be json.
     * </p>
     * <p>
     * When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
     * </p>
     * 
     * @param outputFormat
     *        The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis,
     *        or pcm. For speech marks, this will be json. </p>
     *        <p>
     *        When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian
     *        format.
     * @see OutputFormat
     */

    public void setOutputFormat(OutputFormat outputFormat) {
        withOutputFormat(outputFormat);
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm.
     * For speech marks, this will be json.
     * </p>
     * <p>
     * When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
     * </p>
     * 
     * @param outputFormat
     *        The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis,
     *        or pcm. For speech marks, this will be json. </p>
     *        <p>
     *        When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public SynthesizeSpeechRequest withOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
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

    public SynthesizeSpeechRequest withSpeechMarkTypes(String... speechMarkTypes) {
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

    public SynthesizeSpeechRequest withSpeechMarkTypes(java.util.Collection<String> speechMarkTypes) {
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

    public SynthesizeSpeechRequest withSpeechMarkTypes(SpeechMarkType... speechMarkTypes) {
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
        withTextType(textType);
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
        this.textType = textType.toString();
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
        withVoiceId(voiceId);
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
        this.voiceId = voiceId.toString();
        return this;
    }

    /**
     * <p>
     * Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual voice, such
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
     *        Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual
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
     * Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual voice, such
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
     * @return Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual
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
     * Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual voice, such
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
     *        Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual
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

    public SynthesizeSpeechRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual voice, such
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
     *        Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual
     *        voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN). </p>
     *        <p>
     *        If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language
     *        of the bilingual voice. The default language for any voice is the one returned by the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html">DescribeVoices</a> operation
     *        for the <code>LanguageCode</code> parameter. For example, if no language code is specified, Aditi will use
     *        Indian English rather than Hindi.
     * @see LanguageCode
     */

    public void setLanguageCode(LanguageCode languageCode) {
        withLanguageCode(languageCode);
    }

    /**
     * <p>
     * Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual voice, such
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
     *        Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual
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

    public SynthesizeSpeechRequest withLanguageCode(LanguageCode languageCode) {
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
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate()).append(",");
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
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getSpeechMarkTypes() == null) ? 0 : getSpeechMarkTypes().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getTextType() == null) ? 0 : getTextType().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public SynthesizeSpeechRequest clone() {
        return (SynthesizeSpeechRequest) super.clone();
    }

}
