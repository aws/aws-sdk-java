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
 * Selector for Audio
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AudioSelector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * Selects a specific language code from within an audio source, using the ISO 639-2 or ISO 639-3 three-letter
     * language code
     */
    private String customLanguageCode;
    /**
     * Enable this setting on one audio selector to set it as the default for the job. The service uses this default for
     * outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
     */
    private String defaultSelection;
    /** Specifies audio data from an external file source. */
    private String externalAudioFileInput;
    /** Selects a specific language code from within an audio source. */
    private String languageCode;
    /** Specifies a time delta in milliseconds to offset the audio from the input video. */
    private Integer offset;
    /** Selects a specific PID from within an audio source (e.g. 257 selects PID 0x101). */
    private java.util.List<Integer> pids;
    /**
     * Use this setting for input streams that contain Dolby E, to have the service extract specific program data from
     * the track. To select multiple programs, create multiple selectors with the same Track and different Program
     * numbers. In the console, this setting is visible when you set Selector type to Track. Choose the program number
     * from the dropdown list. If you are sending a JSON file, provide the program ID, which is part of the audio
     * metadata. If your input file has incorrect metadata, you can choose All channels instead of a program number to
     * have the service ignore the program IDs and include all the programs in the track.
     */
    private Integer programSelection;
    /**
     * Use these settings to reorder the audio channels of one input to match those of another input. This allows you to
     * combine the two files into a single output, one after the other.
     */
    private RemixSettings remixSettings;
    /** Specifies the type of the audio selector. */
    private String selectorType;
    /**
     * Identify a track from the input audio to include in this selector by entering the track index number. To include
     * several tracks in a single audio selector, specify multiple tracks as follows. Using the console, enter a
     * comma-separated list. For examle, type "1,2,3" to include tracks 1 through 3. Specifying directly in your JSON job
     * file, provide the track numbers in an array. For example, "tracks": [1,2,3].
     */
    private java.util.List<Integer> tracks;

    /**
     * Selects a specific language code from within an audio source, using the ISO 639-2 or ISO 639-3 three-letter
     * language code
     * 
     * @param customLanguageCode
     *        Selects a specific language code from within an audio source, using the ISO 639-2 or ISO 639-3
     *        three-letter language code
     */

    public void setCustomLanguageCode(String customLanguageCode) {
        this.customLanguageCode = customLanguageCode;
    }

    /**
     * Selects a specific language code from within an audio source, using the ISO 639-2 or ISO 639-3 three-letter
     * language code
     * 
     * @return Selects a specific language code from within an audio source, using the ISO 639-2 or ISO 639-3
     *         three-letter language code
     */

    public String getCustomLanguageCode() {
        return this.customLanguageCode;
    }

    /**
     * Selects a specific language code from within an audio source, using the ISO 639-2 or ISO 639-3 three-letter
     * language code
     * 
     * @param customLanguageCode
     *        Selects a specific language code from within an audio source, using the ISO 639-2 or ISO 639-3
     *        three-letter language code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelector withCustomLanguageCode(String customLanguageCode) {
        setCustomLanguageCode(customLanguageCode);
        return this;
    }

    /**
     * Enable this setting on one audio selector to set it as the default for the job. The service uses this default for
     * outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
     * 
     * @param defaultSelection
     *        Enable this setting on one audio selector to set it as the default for the job. The service uses this
     *        default for outputs where it can't find the specified input audio. If you don't set a default, those
     *        outputs have no audio.
     * @see AudioDefaultSelection
     */

    public void setDefaultSelection(String defaultSelection) {
        this.defaultSelection = defaultSelection;
    }

    /**
     * Enable this setting on one audio selector to set it as the default for the job. The service uses this default for
     * outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
     * 
     * @return Enable this setting on one audio selector to set it as the default for the job. The service uses this
     *         default for outputs where it can't find the specified input audio. If you don't set a default, those
     *         outputs have no audio.
     * @see AudioDefaultSelection
     */

    public String getDefaultSelection() {
        return this.defaultSelection;
    }

    /**
     * Enable this setting on one audio selector to set it as the default for the job. The service uses this default for
     * outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
     * 
     * @param defaultSelection
     *        Enable this setting on one audio selector to set it as the default for the job. The service uses this
     *        default for outputs where it can't find the specified input audio. If you don't set a default, those
     *        outputs have no audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioDefaultSelection
     */

    public AudioSelector withDefaultSelection(String defaultSelection) {
        setDefaultSelection(defaultSelection);
        return this;
    }

    /**
     * Enable this setting on one audio selector to set it as the default for the job. The service uses this default for
     * outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
     * 
     * @param defaultSelection
     *        Enable this setting on one audio selector to set it as the default for the job. The service uses this
     *        default for outputs where it can't find the specified input audio. If you don't set a default, those
     *        outputs have no audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioDefaultSelection
     */

    public AudioSelector withDefaultSelection(AudioDefaultSelection defaultSelection) {
        this.defaultSelection = defaultSelection.toString();
        return this;
    }

    /**
     * Specifies audio data from an external file source.
     * 
     * @param externalAudioFileInput
     *        Specifies audio data from an external file source.
     */

    public void setExternalAudioFileInput(String externalAudioFileInput) {
        this.externalAudioFileInput = externalAudioFileInput;
    }

    /**
     * Specifies audio data from an external file source.
     * 
     * @return Specifies audio data from an external file source.
     */

    public String getExternalAudioFileInput() {
        return this.externalAudioFileInput;
    }

    /**
     * Specifies audio data from an external file source.
     * 
     * @param externalAudioFileInput
     *        Specifies audio data from an external file source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelector withExternalAudioFileInput(String externalAudioFileInput) {
        setExternalAudioFileInput(externalAudioFileInput);
        return this;
    }

    /**
     * Selects a specific language code from within an audio source.
     * 
     * @param languageCode
     *        Selects a specific language code from within an audio source.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Selects a specific language code from within an audio source.
     * 
     * @return Selects a specific language code from within an audio source.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * Selects a specific language code from within an audio source.
     * 
     * @param languageCode
     *        Selects a specific language code from within an audio source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public AudioSelector withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * Selects a specific language code from within an audio source.
     * 
     * @param languageCode
     *        Selects a specific language code from within an audio source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public AudioSelector withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * Specifies a time delta in milliseconds to offset the audio from the input video.
     * 
     * @param offset
     *        Specifies a time delta in milliseconds to offset the audio from the input video.
     */

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Specifies a time delta in milliseconds to offset the audio from the input video.
     * 
     * @return Specifies a time delta in milliseconds to offset the audio from the input video.
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     * Specifies a time delta in milliseconds to offset the audio from the input video.
     * 
     * @param offset
     *        Specifies a time delta in milliseconds to offset the audio from the input video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelector withOffset(Integer offset) {
        setOffset(offset);
        return this;
    }

    /**
     * Selects a specific PID from within an audio source (e.g. 257 selects PID 0x101).
     * 
     * @return Selects a specific PID from within an audio source (e.g. 257 selects PID 0x101).
     */

    public java.util.List<Integer> getPids() {
        return pids;
    }

    /**
     * Selects a specific PID from within an audio source (e.g. 257 selects PID 0x101).
     * 
     * @param pids
     *        Selects a specific PID from within an audio source (e.g. 257 selects PID 0x101).
     */

    public void setPids(java.util.Collection<Integer> pids) {
        if (pids == null) {
            this.pids = null;
            return;
        }

        this.pids = new java.util.ArrayList<Integer>(pids);
    }

    /**
     * Selects a specific PID from within an audio source (e.g. 257 selects PID 0x101).
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPids(java.util.Collection)} or {@link #withPids(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param pids
     *        Selects a specific PID from within an audio source (e.g. 257 selects PID 0x101).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelector withPids(Integer... pids) {
        if (this.pids == null) {
            setPids(new java.util.ArrayList<Integer>(pids.length));
        }
        for (Integer ele : pids) {
            this.pids.add(ele);
        }
        return this;
    }

    /**
     * Selects a specific PID from within an audio source (e.g. 257 selects PID 0x101).
     * 
     * @param pids
     *        Selects a specific PID from within an audio source (e.g. 257 selects PID 0x101).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelector withPids(java.util.Collection<Integer> pids) {
        setPids(pids);
        return this;
    }

    /**
     * Use this setting for input streams that contain Dolby E, to have the service extract specific program data from
     * the track. To select multiple programs, create multiple selectors with the same Track and different Program
     * numbers. In the console, this setting is visible when you set Selector type to Track. Choose the program number
     * from the dropdown list. If you are sending a JSON file, provide the program ID, which is part of the audio
     * metadata. If your input file has incorrect metadata, you can choose All channels instead of a program number to
     * have the service ignore the program IDs and include all the programs in the track.
     * 
     * @param programSelection
     *        Use this setting for input streams that contain Dolby E, to have the service extract specific program data
     *        from the track. To select multiple programs, create multiple selectors with the same Track and different
     *        Program numbers. In the console, this setting is visible when you set Selector type to Track. Choose the
     *        program number from the dropdown list. If you are sending a JSON file, provide the program ID, which is
     *        part of the audio metadata. If your input file has incorrect metadata, you can choose All channels instead
     *        of a program number to have the service ignore the program IDs and include all the programs in the track.
     */

    public void setProgramSelection(Integer programSelection) {
        this.programSelection = programSelection;
    }

    /**
     * Use this setting for input streams that contain Dolby E, to have the service extract specific program data from
     * the track. To select multiple programs, create multiple selectors with the same Track and different Program
     * numbers. In the console, this setting is visible when you set Selector type to Track. Choose the program number
     * from the dropdown list. If you are sending a JSON file, provide the program ID, which is part of the audio
     * metadata. If your input file has incorrect metadata, you can choose All channels instead of a program number to
     * have the service ignore the program IDs and include all the programs in the track.
     * 
     * @return Use this setting for input streams that contain Dolby E, to have the service extract specific program
     *         data from the track. To select multiple programs, create multiple selectors with the same Track and
     *         different Program numbers. In the console, this setting is visible when you set Selector type to Track.
     *         Choose the program number from the dropdown list. If you are sending a JSON file, provide the program ID,
     *         which is part of the audio metadata. If your input file has incorrect metadata, you can choose All
     *         channels instead of a program number to have the service ignore the program IDs and include all the
     *         programs in the track.
     */

    public Integer getProgramSelection() {
        return this.programSelection;
    }

    /**
     * Use this setting for input streams that contain Dolby E, to have the service extract specific program data from
     * the track. To select multiple programs, create multiple selectors with the same Track and different Program
     * numbers. In the console, this setting is visible when you set Selector type to Track. Choose the program number
     * from the dropdown list. If you are sending a JSON file, provide the program ID, which is part of the audio
     * metadata. If your input file has incorrect metadata, you can choose All channels instead of a program number to
     * have the service ignore the program IDs and include all the programs in the track.
     * 
     * @param programSelection
     *        Use this setting for input streams that contain Dolby E, to have the service extract specific program data
     *        from the track. To select multiple programs, create multiple selectors with the same Track and different
     *        Program numbers. In the console, this setting is visible when you set Selector type to Track. Choose the
     *        program number from the dropdown list. If you are sending a JSON file, provide the program ID, which is
     *        part of the audio metadata. If your input file has incorrect metadata, you can choose All channels instead
     *        of a program number to have the service ignore the program IDs and include all the programs in the track.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelector withProgramSelection(Integer programSelection) {
        setProgramSelection(programSelection);
        return this;
    }

    /**
     * Use these settings to reorder the audio channels of one input to match those of another input. This allows you to
     * combine the two files into a single output, one after the other.
     * 
     * @param remixSettings
     *        Use these settings to reorder the audio channels of one input to match those of another input. This allows
     *        you to combine the two files into a single output, one after the other.
     */

    public void setRemixSettings(RemixSettings remixSettings) {
        this.remixSettings = remixSettings;
    }

    /**
     * Use these settings to reorder the audio channels of one input to match those of another input. This allows you to
     * combine the two files into a single output, one after the other.
     * 
     * @return Use these settings to reorder the audio channels of one input to match those of another input. This
     *         allows you to combine the two files into a single output, one after the other.
     */

    public RemixSettings getRemixSettings() {
        return this.remixSettings;
    }

    /**
     * Use these settings to reorder the audio channels of one input to match those of another input. This allows you to
     * combine the two files into a single output, one after the other.
     * 
     * @param remixSettings
     *        Use these settings to reorder the audio channels of one input to match those of another input. This allows
     *        you to combine the two files into a single output, one after the other.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelector withRemixSettings(RemixSettings remixSettings) {
        setRemixSettings(remixSettings);
        return this;
    }

    /**
     * Specifies the type of the audio selector.
     * 
     * @param selectorType
     *        Specifies the type of the audio selector.
     * @see AudioSelectorType
     */

    public void setSelectorType(String selectorType) {
        this.selectorType = selectorType;
    }

    /**
     * Specifies the type of the audio selector.
     * 
     * @return Specifies the type of the audio selector.
     * @see AudioSelectorType
     */

    public String getSelectorType() {
        return this.selectorType;
    }

    /**
     * Specifies the type of the audio selector.
     * 
     * @param selectorType
     *        Specifies the type of the audio selector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioSelectorType
     */

    public AudioSelector withSelectorType(String selectorType) {
        setSelectorType(selectorType);
        return this;
    }

    /**
     * Specifies the type of the audio selector.
     * 
     * @param selectorType
     *        Specifies the type of the audio selector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioSelectorType
     */

    public AudioSelector withSelectorType(AudioSelectorType selectorType) {
        this.selectorType = selectorType.toString();
        return this;
    }

    /**
     * Identify a track from the input audio to include in this selector by entering the track index number. To include
     * several tracks in a single audio selector, specify multiple tracks as follows. Using the console, enter a
     * comma-separated list. For examle, type "1,2,3" to include tracks 1 through 3. Specifying directly in your JSON job
     * file, provide the track numbers in an array. For example, "tracks": [1,2,3].
     * 
     * @return Identify a track from the input audio to include in this selector by entering the track index number. To
     *         include several tracks in a single audio selector, specify multiple tracks as follows. Using the console,
     *         enter a comma-separated list. For examle, type "1,2,3" to include tracks 1 through 3. Specifying directly
     *         in your JSON job file, provide the track numbers in an array. For example, "tracks": [1,2,3].
     */

    public java.util.List<Integer> getTracks() {
        return tracks;
    }

    /**
     * Identify a track from the input audio to include in this selector by entering the track index number. To include
     * several tracks in a single audio selector, specify multiple tracks as follows. Using the console, enter a
     * comma-separated list. For examle, type "1,2,3" to include tracks 1 through 3. Specifying directly in your JSON job
     * file, provide the track numbers in an array. For example, "tracks": [1,2,3].
     * 
     * @param tracks
     *        Identify a track from the input audio to include in this selector by entering the track index number. To
     *        include several tracks in a single audio selector, specify multiple tracks as follows. Using the console,
     *        enter a comma-separated list. For examle, type "1,2,3" to include tracks 1 through 3. Specifying directly
     *        in your JSON job file, provide the track numbers in an array. For example, "tracks": [1,2,3].
     */

    public void setTracks(java.util.Collection<Integer> tracks) {
        if (tracks == null) {
            this.tracks = null;
            return;
        }

        this.tracks = new java.util.ArrayList<Integer>(tracks);
    }

    /**
     * Identify a track from the input audio to include in this selector by entering the track index number. To include
     * several tracks in a single audio selector, specify multiple tracks as follows. Using the console, enter a
     * comma-separated list. For examle, type "1,2,3" to include tracks 1 through 3. Specifying directly in your JSON job
     * file, provide the track numbers in an array. For example, "tracks": [1,2,3].
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTracks(java.util.Collection)} or {@link #withTracks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tracks
     *        Identify a track from the input audio to include in this selector by entering the track index number. To
     *        include several tracks in a single audio selector, specify multiple tracks as follows. Using the console,
     *        enter a comma-separated list. For examle, type "1,2,3" to include tracks 1 through 3. Specifying directly
     *        in your JSON job file, provide the track numbers in an array. For example, "tracks": [1,2,3].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelector withTracks(Integer... tracks) {
        if (this.tracks == null) {
            setTracks(new java.util.ArrayList<Integer>(tracks.length));
        }
        for (Integer ele : tracks) {
            this.tracks.add(ele);
        }
        return this;
    }

    /**
     * Identify a track from the input audio to include in this selector by entering the track index number. To include
     * several tracks in a single audio selector, specify multiple tracks as follows. Using the console, enter a
     * comma-separated list. For examle, type "1,2,3" to include tracks 1 through 3. Specifying directly in your JSON job
     * file, provide the track numbers in an array. For example, "tracks": [1,2,3].
     * 
     * @param tracks
     *        Identify a track from the input audio to include in this selector by entering the track index number. To
     *        include several tracks in a single audio selector, specify multiple tracks as follows. Using the console,
     *        enter a comma-separated list. For examle, type "1,2,3" to include tracks 1 through 3. Specifying directly
     *        in your JSON job file, provide the track numbers in an array. For example, "tracks": [1,2,3].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelector withTracks(java.util.Collection<Integer> tracks) {
        setTracks(tracks);
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
        if (getCustomLanguageCode() != null)
            sb.append("CustomLanguageCode: ").append(getCustomLanguageCode()).append(",");
        if (getDefaultSelection() != null)
            sb.append("DefaultSelection: ").append(getDefaultSelection()).append(",");
        if (getExternalAudioFileInput() != null)
            sb.append("ExternalAudioFileInput: ").append(getExternalAudioFileInput()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getOffset() != null)
            sb.append("Offset: ").append(getOffset()).append(",");
        if (getPids() != null)
            sb.append("Pids: ").append(getPids()).append(",");
        if (getProgramSelection() != null)
            sb.append("ProgramSelection: ").append(getProgramSelection()).append(",");
        if (getRemixSettings() != null)
            sb.append("RemixSettings: ").append(getRemixSettings()).append(",");
        if (getSelectorType() != null)
            sb.append("SelectorType: ").append(getSelectorType()).append(",");
        if (getTracks() != null)
            sb.append("Tracks: ").append(getTracks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioSelector == false)
            return false;
        AudioSelector other = (AudioSelector) obj;
        if (other.getCustomLanguageCode() == null ^ this.getCustomLanguageCode() == null)
            return false;
        if (other.getCustomLanguageCode() != null && other.getCustomLanguageCode().equals(this.getCustomLanguageCode()) == false)
            return false;
        if (other.getDefaultSelection() == null ^ this.getDefaultSelection() == null)
            return false;
        if (other.getDefaultSelection() != null && other.getDefaultSelection().equals(this.getDefaultSelection()) == false)
            return false;
        if (other.getExternalAudioFileInput() == null ^ this.getExternalAudioFileInput() == null)
            return false;
        if (other.getExternalAudioFileInput() != null && other.getExternalAudioFileInput().equals(this.getExternalAudioFileInput()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        if (other.getPids() == null ^ this.getPids() == null)
            return false;
        if (other.getPids() != null && other.getPids().equals(this.getPids()) == false)
            return false;
        if (other.getProgramSelection() == null ^ this.getProgramSelection() == null)
            return false;
        if (other.getProgramSelection() != null && other.getProgramSelection().equals(this.getProgramSelection()) == false)
            return false;
        if (other.getRemixSettings() == null ^ this.getRemixSettings() == null)
            return false;
        if (other.getRemixSettings() != null && other.getRemixSettings().equals(this.getRemixSettings()) == false)
            return false;
        if (other.getSelectorType() == null ^ this.getSelectorType() == null)
            return false;
        if (other.getSelectorType() != null && other.getSelectorType().equals(this.getSelectorType()) == false)
            return false;
        if (other.getTracks() == null ^ this.getTracks() == null)
            return false;
        if (other.getTracks() != null && other.getTracks().equals(this.getTracks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomLanguageCode() == null) ? 0 : getCustomLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getDefaultSelection() == null) ? 0 : getDefaultSelection().hashCode());
        hashCode = prime * hashCode + ((getExternalAudioFileInput() == null) ? 0 : getExternalAudioFileInput().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        hashCode = prime * hashCode + ((getPids() == null) ? 0 : getPids().hashCode());
        hashCode = prime * hashCode + ((getProgramSelection() == null) ? 0 : getProgramSelection().hashCode());
        hashCode = prime * hashCode + ((getRemixSettings() == null) ? 0 : getRemixSettings().hashCode());
        hashCode = prime * hashCode + ((getSelectorType() == null) ? 0 : getSelectorType().hashCode());
        hashCode = prime * hashCode + ((getTracks() == null) ? 0 : getTracks().hashCode());
        return hashCode;
    }

    @Override
    public AudioSelector clone() {
        try {
            return (AudioSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AudioSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
