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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Description of audio output
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AudioDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioDescription implements Serializable, Cloneable, StructuredPojo {

    /** Advanced audio normalization settings. */
    private AudioNormalizationSettings audioNormalizationSettings;
    /**
     * Specifies which audio data to use from each input. In the simplest case, specify an
     * "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you specify
     * "Audio Selector 3", then the third audio selector will be used from each input. If an input does not have an
     * "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If there is no audio
     * selector marked as "default", silence will be inserted for the duration of that input. Alternatively, an
     * "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar default/silence behavior.
     * If no audio_source_name is specified, then "Audio Selector 1" will be chosen automatically.
     */
    private String audioSourceName;
    /**
     * Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following are
     * defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired
     * Commentary, 4-255 = Reserved.
     */
    private Integer audioType;
    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the
     * output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise
     * the value in Audio Type is included in the output. Note that this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     */
    private String audioTypeControl;
    /**
     * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to audio
     * encoding. The settings in this group vary depending on the value you choose for Audio codec (Codec). For each
     * codec enum you choose, define the corresponding settings object. The following lists the codec enum, settings
     * object pairs. * AAC, AacSettings * MP2, Mp2Settings * WAV, WavSettings * AIFF, AiffSettings * AC3, Ac3Settings *
     * EAC3, Eac3Settings
     */
    private AudioCodecSettings codecSettings;
    /**
     * Specify the language for this audio output track, using the ISO 639-2 or ISO 639-3 three-letter language code.
     * The language specified will be used when 'Follow Input Language Code' is not selected or when 'Follow Input
     * Language Code' is selected but there is no ISO 639 language code specified by the input.
     */
    private String customLanguageCode;
    /**
     * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down
     * will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected
     * but there is no ISO 639 language code specified by the input.
     */
    private String languageCode;
    /**
     * Choosing FOLLOW_INPUT will cause the ISO 639 language code of the output to follow the ISO 639 language code of
     * the input. The language specified for languageCode' will be used when USE_CONFIGURED is selected or when
     * FOLLOW_INPUT is selected but there is no ISO 639 language code specified by the input.
     */
    private String languageCodeControl;
    /** Advanced audio remixing settings. */
    private RemixSettings remixSettings;
    /**
     * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or Director
     * Commentary). Alphanumeric characters, spaces, and underscore are legal.
     */
    private String streamName;

    /**
     * Advanced audio normalization settings.
     * 
     * @param audioNormalizationSettings
     *        Advanced audio normalization settings.
     */

    public void setAudioNormalizationSettings(AudioNormalizationSettings audioNormalizationSettings) {
        this.audioNormalizationSettings = audioNormalizationSettings;
    }

    /**
     * Advanced audio normalization settings.
     * 
     * @return Advanced audio normalization settings.
     */

    public AudioNormalizationSettings getAudioNormalizationSettings() {
        return this.audioNormalizationSettings;
    }

    /**
     * Advanced audio normalization settings.
     * 
     * @param audioNormalizationSettings
     *        Advanced audio normalization settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withAudioNormalizationSettings(AudioNormalizationSettings audioNormalizationSettings) {
        setAudioNormalizationSettings(audioNormalizationSettings);
        return this;
    }

    /**
     * Specifies which audio data to use from each input. In the simplest case, specify an
     * "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you specify
     * "Audio Selector 3", then the third audio selector will be used from each input. If an input does not have an
     * "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If there is no audio
     * selector marked as "default", silence will be inserted for the duration of that input. Alternatively, an
     * "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar default/silence behavior.
     * If no audio_source_name is specified, then "Audio Selector 1" will be chosen automatically.
     * 
     * @param audioSourceName
     *        Specifies which audio data to use from each input. In the simplest case, specify an
     *        "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you
     *        specify "Audio Selector 3", then the third audio selector will be used from each input. If an input does
     *        not have an "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If
     *        there is no audio selector marked as "default", silence will be inserted for the duration of that input.
     *        Alternatively, an "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar
     *        default/silence behavior. If no audio_source_name is specified, then "Audio Selector 1" will be chosen
     *        automatically.
     */

    public void setAudioSourceName(String audioSourceName) {
        this.audioSourceName = audioSourceName;
    }

    /**
     * Specifies which audio data to use from each input. In the simplest case, specify an
     * "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you specify
     * "Audio Selector 3", then the third audio selector will be used from each input. If an input does not have an
     * "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If there is no audio
     * selector marked as "default", silence will be inserted for the duration of that input. Alternatively, an
     * "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar default/silence behavior.
     * If no audio_source_name is specified, then "Audio Selector 1" will be chosen automatically.
     * 
     * @return Specifies which audio data to use from each input. In the simplest case, specify an
     *         "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you
     *         specify "Audio Selector 3", then the third audio selector will be used from each input. If an input does
     *         not have an "Audio Selector 3", then the audio selector marked as "default" in that input will be used.
     *         If there is no audio selector marked as "default", silence will be inserted for the duration of that
     *         input. Alternatively, an "Audio Selector Group":#inputs-audio_selector_group name may be specified, with
     *         similar default/silence behavior. If no audio_source_name is specified, then "Audio Selector 1" will be
     *         chosen automatically.
     */

    public String getAudioSourceName() {
        return this.audioSourceName;
    }

    /**
     * Specifies which audio data to use from each input. In the simplest case, specify an
     * "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you specify
     * "Audio Selector 3", then the third audio selector will be used from each input. If an input does not have an
     * "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If there is no audio
     * selector marked as "default", silence will be inserted for the duration of that input. Alternatively, an
     * "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar default/silence behavior.
     * If no audio_source_name is specified, then "Audio Selector 1" will be chosen automatically.
     * 
     * @param audioSourceName
     *        Specifies which audio data to use from each input. In the simplest case, specify an
     *        "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you
     *        specify "Audio Selector 3", then the third audio selector will be used from each input. If an input does
     *        not have an "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If
     *        there is no audio selector marked as "default", silence will be inserted for the duration of that input.
     *        Alternatively, an "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar
     *        default/silence behavior. If no audio_source_name is specified, then "Audio Selector 1" will be chosen
     *        automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withAudioSourceName(String audioSourceName) {
        setAudioSourceName(audioSourceName);
        return this;
    }

    /**
     * Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following are
     * defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired
     * Commentary, 4-255 = Reserved.
     * 
     * @param audioType
     *        Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following
     *        are defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually
     *        Impaired Commentary, 4-255 = Reserved.
     */

    public void setAudioType(Integer audioType) {
        this.audioType = audioType;
    }

    /**
     * Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following are
     * defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired
     * Commentary, 4-255 = Reserved.
     * 
     * @return Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following
     *         are defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually
     *         Impaired Commentary, 4-255 = Reserved.
     */

    public Integer getAudioType() {
        return this.audioType;
    }

    /**
     * Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following are
     * defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired
     * Commentary, 4-255 = Reserved.
     * 
     * @param audioType
     *        Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following
     *        are defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually
     *        Impaired Commentary, 4-255 = Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withAudioType(Integer audioType) {
        setAudioType(audioType);
        return this;
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the
     * output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise
     * the value in Audio Type is included in the output. Note that this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * 
     * @param audioTypeControl
     *        When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through
     *        to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the
     *        output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType
     *        are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * @see AudioTypeControl
     */

    public void setAudioTypeControl(String audioTypeControl) {
        this.audioTypeControl = audioTypeControl;
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the
     * output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise
     * the value in Audio Type is included in the output. Note that this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * 
     * @return When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through
     *         to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the
     *         output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType
     *         are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * @see AudioTypeControl
     */

    public String getAudioTypeControl() {
        return this.audioTypeControl;
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the
     * output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise
     * the value in Audio Type is included in the output. Note that this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * 
     * @param audioTypeControl
     *        When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through
     *        to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the
     *        output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType
     *        are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioTypeControl
     */

    public AudioDescription withAudioTypeControl(String audioTypeControl) {
        setAudioTypeControl(audioTypeControl);
        return this;
    }

    /**
     * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the
     * output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise
     * the value in Audio Type is included in the output. Note that this field and audioType are both ignored if
     * audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * 
     * @param audioTypeControl
     *        When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through
     *        to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the
     *        output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType
     *        are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioTypeControl
     */

    public AudioDescription withAudioTypeControl(AudioTypeControl audioTypeControl) {
        this.audioTypeControl = audioTypeControl.toString();
        return this;
    }

    /**
     * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to audio
     * encoding. The settings in this group vary depending on the value you choose for Audio codec (Codec). For each
     * codec enum you choose, define the corresponding settings object. The following lists the codec enum, settings
     * object pairs. * AAC, AacSettings * MP2, Mp2Settings * WAV, WavSettings * AIFF, AiffSettings * AC3, Ac3Settings *
     * EAC3, Eac3Settings
     * 
     * @param codecSettings
     *        Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to
     *        audio encoding. The settings in this group vary depending on the value you choose for Audio codec (Codec).
     *        For each codec enum you choose, define the corresponding settings object. The following lists the codec
     *        enum, settings object pairs. * AAC, AacSettings * MP2, Mp2Settings * WAV, WavSettings * AIFF, AiffSettings
     *        * AC3, Ac3Settings * EAC3, Eac3Settings
     */

    public void setCodecSettings(AudioCodecSettings codecSettings) {
        this.codecSettings = codecSettings;
    }

    /**
     * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to audio
     * encoding. The settings in this group vary depending on the value you choose for Audio codec (Codec). For each
     * codec enum you choose, define the corresponding settings object. The following lists the codec enum, settings
     * object pairs. * AAC, AacSettings * MP2, Mp2Settings * WAV, WavSettings * AIFF, AiffSettings * AC3, Ac3Settings *
     * EAC3, Eac3Settings
     * 
     * @return Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to
     *         audio encoding. The settings in this group vary depending on the value you choose for Audio codec
     *         (Codec). For each codec enum you choose, define the corresponding settings object. The following lists
     *         the codec enum, settings object pairs. * AAC, AacSettings * MP2, Mp2Settings * WAV, WavSettings * AIFF,
     *         AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings
     */

    public AudioCodecSettings getCodecSettings() {
        return this.codecSettings;
    }

    /**
     * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to audio
     * encoding. The settings in this group vary depending on the value you choose for Audio codec (Codec). For each
     * codec enum you choose, define the corresponding settings object. The following lists the codec enum, settings
     * object pairs. * AAC, AacSettings * MP2, Mp2Settings * WAV, WavSettings * AIFF, AiffSettings * AC3, Ac3Settings *
     * EAC3, Eac3Settings
     * 
     * @param codecSettings
     *        Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to
     *        audio encoding. The settings in this group vary depending on the value you choose for Audio codec (Codec).
     *        For each codec enum you choose, define the corresponding settings object. The following lists the codec
     *        enum, settings object pairs. * AAC, AacSettings * MP2, Mp2Settings * WAV, WavSettings * AIFF, AiffSettings
     *        * AC3, Ac3Settings * EAC3, Eac3Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withCodecSettings(AudioCodecSettings codecSettings) {
        setCodecSettings(codecSettings);
        return this;
    }

    /**
     * Specify the language for this audio output track, using the ISO 639-2 or ISO 639-3 three-letter language code.
     * The language specified will be used when 'Follow Input Language Code' is not selected or when 'Follow Input
     * Language Code' is selected but there is no ISO 639 language code specified by the input.
     * 
     * @param customLanguageCode
     *        Specify the language for this audio output track, using the ISO 639-2 or ISO 639-3 three-letter language
     *        code. The language specified will be used when 'Follow Input Language Code' is not selected or when
     *        'Follow Input Language Code' is selected but there is no ISO 639 language code specified by the input.
     */

    public void setCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
    }

    /**
     * Specify the language for this audio output track, using the ISO 639-2 or ISO 639-3 three-letter language code.
     * The language specified will be used when 'Follow Input Language Code' is not selected or when 'Follow Input
     * Language Code' is selected but there is no ISO 639 language code specified by the input.
     * 
     * @return Specify the language for this audio output track, using the ISO 639-2 or ISO 639-3 three-letter language
     *         code. The language specified will be used when 'Follow Input Language Code' is not selected or when
     *         'Follow Input Language Code' is selected but there is no ISO 639 language code specified by the input.
     */

    public String getCustomLanguageCode() {
        return this.customLanguageCode;
    }

    /**
     * Specify the language for this audio output track, using the ISO 639-2 or ISO 639-3 three-letter language code.
     * The language specified will be used when 'Follow Input Language Code' is not selected or when 'Follow Input
     * Language Code' is selected but there is no ISO 639 language code specified by the input.
     * 
     * @param customLanguageCode
     *        Specify the language for this audio output track, using the ISO 639-2 or ISO 639-3 three-letter language
     *        code. The language specified will be used when 'Follow Input Language Code' is not selected or when
     *        'Follow Input Language Code' is selected but there is no ISO 639 language code specified by the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withCustomLanguageCode(String customLanguageCode) {
        setCustomLanguageCode(customLanguageCode);
        return this;
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down
     * will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected
     * but there is no ISO 639 language code specified by the input.
     * 
     * @param languageCode
     *        Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code'
     *        drop down will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language
     *        Code' is selected but there is no ISO 639 language code specified by the input.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down
     * will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected
     * but there is no ISO 639 language code specified by the input.
     * 
     * @return Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code'
     *         drop down will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language
     *         Code' is selected but there is no ISO 639 language code specified by the input.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down
     * will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected
     * but there is no ISO 639 language code specified by the input.
     * 
     * @param languageCode
     *        Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code'
     *        drop down will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language
     *        Code' is selected but there is no ISO 639 language code specified by the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public AudioDescription withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down
     * will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected
     * but there is no ISO 639 language code specified by the input.
     * 
     * @param languageCode
     *        Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code'
     *        drop down will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language
     *        Code' is selected but there is no ISO 639 language code specified by the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public AudioDescription withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * Choosing FOLLOW_INPUT will cause the ISO 639 language code of the output to follow the ISO 639 language code of
     * the input. The language specified for languageCode' will be used when USE_CONFIGURED is selected or when
     * FOLLOW_INPUT is selected but there is no ISO 639 language code specified by the input.
     * 
     * @param languageCodeControl
     *        Choosing FOLLOW_INPUT will cause the ISO 639 language code of the output to follow the ISO 639 language
     *        code of the input. The language specified for languageCode' will be used when USE_CONFIGURED is selected
     *        or when FOLLOW_INPUT is selected but there is no ISO 639 language code specified by the input.
     * @see AudioLanguageCodeControl
     */

    public void setLanguageCodeControl(String languageCodeControl) {
        this.languageCodeControl = languageCodeControl;
    }

    /**
     * Choosing FOLLOW_INPUT will cause the ISO 639 language code of the output to follow the ISO 639 language code of
     * the input. The language specified for languageCode' will be used when USE_CONFIGURED is selected or when
     * FOLLOW_INPUT is selected but there is no ISO 639 language code specified by the input.
     * 
     * @return Choosing FOLLOW_INPUT will cause the ISO 639 language code of the output to follow the ISO 639 language
     *         code of the input. The language specified for languageCode' will be used when USE_CONFIGURED is selected
     *         or when FOLLOW_INPUT is selected but there is no ISO 639 language code specified by the input.
     * @see AudioLanguageCodeControl
     */

    public String getLanguageCodeControl() {
        return this.languageCodeControl;
    }

    /**
     * Choosing FOLLOW_INPUT will cause the ISO 639 language code of the output to follow the ISO 639 language code of
     * the input. The language specified for languageCode' will be used when USE_CONFIGURED is selected or when
     * FOLLOW_INPUT is selected but there is no ISO 639 language code specified by the input.
     * 
     * @param languageCodeControl
     *        Choosing FOLLOW_INPUT will cause the ISO 639 language code of the output to follow the ISO 639 language
     *        code of the input. The language specified for languageCode' will be used when USE_CONFIGURED is selected
     *        or when FOLLOW_INPUT is selected but there is no ISO 639 language code specified by the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioLanguageCodeControl
     */

    public AudioDescription withLanguageCodeControl(String languageCodeControl) {
        setLanguageCodeControl(languageCodeControl);
        return this;
    }

    /**
     * Choosing FOLLOW_INPUT will cause the ISO 639 language code of the output to follow the ISO 639 language code of
     * the input. The language specified for languageCode' will be used when USE_CONFIGURED is selected or when
     * FOLLOW_INPUT is selected but there is no ISO 639 language code specified by the input.
     * 
     * @param languageCodeControl
     *        Choosing FOLLOW_INPUT will cause the ISO 639 language code of the output to follow the ISO 639 language
     *        code of the input. The language specified for languageCode' will be used when USE_CONFIGURED is selected
     *        or when FOLLOW_INPUT is selected but there is no ISO 639 language code specified by the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioLanguageCodeControl
     */

    public AudioDescription withLanguageCodeControl(AudioLanguageCodeControl languageCodeControl) {
        this.languageCodeControl = languageCodeControl.toString();
        return this;
    }

    /**
     * Advanced audio remixing settings.
     * 
     * @param remixSettings
     *        Advanced audio remixing settings.
     */

    public void setRemixSettings(RemixSettings remixSettings) {
        this.remixSettings = remixSettings;
    }

    /**
     * Advanced audio remixing settings.
     * 
     * @return Advanced audio remixing settings.
     */

    public RemixSettings getRemixSettings() {
        return this.remixSettings;
    }

    /**
     * Advanced audio remixing settings.
     * 
     * @param remixSettings
     *        Advanced audio remixing settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withRemixSettings(RemixSettings remixSettings) {
        setRemixSettings(remixSettings);
        return this;
    }

    /**
     * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or Director
     * Commentary). Alphanumeric characters, spaces, and underscore are legal.
     * 
     * @param streamName
     *        Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or
     *        Director Commentary). Alphanumeric characters, spaces, and underscore are legal.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or Director
     * Commentary). Alphanumeric characters, spaces, and underscore are legal.
     * 
     * @return Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or
     *         Director Commentary). Alphanumeric characters, spaces, and underscore are legal.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or Director
     * Commentary). Alphanumeric characters, spaces, and underscore are legal.
     * 
     * @param streamName
     *        Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or
     *        Director Commentary). Alphanumeric characters, spaces, and underscore are legal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioDescription withStreamName(String streamName) {
        setStreamName(streamName);
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
        if (getAudioNormalizationSettings() != null)
            sb.append("AudioNormalizationSettings: ").append(getAudioNormalizationSettings()).append(",");
        if (getAudioSourceName() != null)
            sb.append("AudioSourceName: ").append(getAudioSourceName()).append(",");
        if (getAudioType() != null)
            sb.append("AudioType: ").append(getAudioType()).append(",");
        if (getAudioTypeControl() != null)
            sb.append("AudioTypeControl: ").append(getAudioTypeControl()).append(",");
        if (getCodecSettings() != null)
            sb.append("CodecSettings: ").append(getCodecSettings()).append(",");
        if (getCustomLanguageCode() != null)
            sb.append("CustomLanguageCode: ").append(getCustomLanguageCode()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLanguageCodeControl() != null)
            sb.append("LanguageCodeControl: ").append(getLanguageCodeControl()).append(",");
        if (getRemixSettings() != null)
            sb.append("RemixSettings: ").append(getRemixSettings()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioDescription == false)
            return false;
        AudioDescription other = (AudioDescription) obj;
        if (other.getAudioNormalizationSettings() == null ^ this.getAudioNormalizationSettings() == null)
            return false;
        if (other.getAudioNormalizationSettings() != null && other.getAudioNormalizationSettings().equals(this.getAudioNormalizationSettings()) == false)
            return false;
        if (other.getAudioSourceName() == null ^ this.getAudioSourceName() == null)
            return false;
        if (other.getAudioSourceName() != null && other.getAudioSourceName().equals(this.getAudioSourceName()) == false)
            return false;
        if (other.getAudioType() == null ^ this.getAudioType() == null)
            return false;
        if (other.getAudioType() != null && other.getAudioType().equals(this.getAudioType()) == false)
            return false;
        if (other.getAudioTypeControl() == null ^ this.getAudioTypeControl() == null)
            return false;
        if (other.getAudioTypeControl() != null && other.getAudioTypeControl().equals(this.getAudioTypeControl()) == false)
            return false;
        if (other.getCodecSettings() == null ^ this.getCodecSettings() == null)
            return false;
        if (other.getCodecSettings() != null && other.getCodecSettings().equals(this.getCodecSettings()) == false)
            return false;
        if (other.getCustomLanguageCode() == null ^ this.getCustomLanguageCode() == null)
            return false;
        if (other.getCustomLanguageCode() != null && other.getCustomLanguageCode().equals(this.getCustomLanguageCode()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageCodeControl() == null ^ this.getLanguageCodeControl() == null)
            return false;
        if (other.getLanguageCodeControl() != null && other.getLanguageCodeControl().equals(this.getLanguageCodeControl()) == false)
            return false;
        if (other.getRemixSettings() == null ^ this.getRemixSettings() == null)
            return false;
        if (other.getRemixSettings() != null && other.getRemixSettings().equals(this.getRemixSettings()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioNormalizationSettings() == null) ? 0 : getAudioNormalizationSettings().hashCode());
        hashCode = prime * hashCode + ((getAudioSourceName() == null) ? 0 : getAudioSourceName().hashCode());
        hashCode = prime * hashCode + ((getAudioType() == null) ? 0 : getAudioType().hashCode());
        hashCode = prime * hashCode + ((getAudioTypeControl() == null) ? 0 : getAudioTypeControl().hashCode());
        hashCode = prime * hashCode + ((getCodecSettings() == null) ? 0 : getCodecSettings().hashCode());
        hashCode = prime * hashCode + ((getCustomLanguageCode() == null) ? 0 : getCustomLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageCodeControl() == null) ? 0 : getLanguageCodeControl().hashCode());
        hashCode = prime * hashCode + ((getRemixSettings() == null) ? 0 : getRemixSettings().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public AudioDescription clone() {
        try {
            return (AudioDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AudioDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
