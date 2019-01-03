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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Live Event input parameters. There can be multiple inputs in a single Live Event.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputSettings implements Serializable, Cloneable, StructuredPojo {

    /** Used to select the audio stream to decode for inputs that have multiple available. */
    private java.util.List<AudioSelector> audioSelectors;
    /** Used to select the caption input to use for inputs that have multiple available. */
    private java.util.List<CaptionSelector> captionSelectors;
    /** Enable or disable the deblock filter when filtering. */
    private String deblockFilter;
    /** Enable or disable the denoise filter when filtering. */
    private String denoiseFilter;
    /** Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest). */
    private Integer filterStrength;
    /**
     * Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default. 1) auto -
     * filtering will be applied depending on input type/quality 2) disabled - no filtering will be applied to the input
     * 3) forced - filtering will be applied regardless of input type
     */
    private String inputFilter;
    /** Input settings. */
    private NetworkInputSettings networkInputSettings;
    /** Loop input if it is a file. This allows a file input to be streamed indefinitely. */
    private String sourceEndBehavior;
    /** Informs which video elementary stream to decode for input types that have multiple available. */
    private VideoSelector videoSelector;

    /**
     * Used to select the audio stream to decode for inputs that have multiple available.
     * 
     * @return Used to select the audio stream to decode for inputs that have multiple available.
     */

    public java.util.List<AudioSelector> getAudioSelectors() {
        return audioSelectors;
    }

    /**
     * Used to select the audio stream to decode for inputs that have multiple available.
     * 
     * @param audioSelectors
     *        Used to select the audio stream to decode for inputs that have multiple available.
     */

    public void setAudioSelectors(java.util.Collection<AudioSelector> audioSelectors) {
        if (audioSelectors == null) {
            this.audioSelectors = null;
            return;
        }

        this.audioSelectors = new java.util.ArrayList<AudioSelector>(audioSelectors);
    }

    /**
     * Used to select the audio stream to decode for inputs that have multiple available.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudioSelectors(java.util.Collection)} or {@link #withAudioSelectors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param audioSelectors
     *        Used to select the audio stream to decode for inputs that have multiple available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSettings withAudioSelectors(AudioSelector... audioSelectors) {
        if (this.audioSelectors == null) {
            setAudioSelectors(new java.util.ArrayList<AudioSelector>(audioSelectors.length));
        }
        for (AudioSelector ele : audioSelectors) {
            this.audioSelectors.add(ele);
        }
        return this;
    }

    /**
     * Used to select the audio stream to decode for inputs that have multiple available.
     * 
     * @param audioSelectors
     *        Used to select the audio stream to decode for inputs that have multiple available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSettings withAudioSelectors(java.util.Collection<AudioSelector> audioSelectors) {
        setAudioSelectors(audioSelectors);
        return this;
    }

    /**
     * Used to select the caption input to use for inputs that have multiple available.
     * 
     * @return Used to select the caption input to use for inputs that have multiple available.
     */

    public java.util.List<CaptionSelector> getCaptionSelectors() {
        return captionSelectors;
    }

    /**
     * Used to select the caption input to use for inputs that have multiple available.
     * 
     * @param captionSelectors
     *        Used to select the caption input to use for inputs that have multiple available.
     */

    public void setCaptionSelectors(java.util.Collection<CaptionSelector> captionSelectors) {
        if (captionSelectors == null) {
            this.captionSelectors = null;
            return;
        }

        this.captionSelectors = new java.util.ArrayList<CaptionSelector>(captionSelectors);
    }

    /**
     * Used to select the caption input to use for inputs that have multiple available.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCaptionSelectors(java.util.Collection)} or {@link #withCaptionSelectors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param captionSelectors
     *        Used to select the caption input to use for inputs that have multiple available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSettings withCaptionSelectors(CaptionSelector... captionSelectors) {
        if (this.captionSelectors == null) {
            setCaptionSelectors(new java.util.ArrayList<CaptionSelector>(captionSelectors.length));
        }
        for (CaptionSelector ele : captionSelectors) {
            this.captionSelectors.add(ele);
        }
        return this;
    }

    /**
     * Used to select the caption input to use for inputs that have multiple available.
     * 
     * @param captionSelectors
     *        Used to select the caption input to use for inputs that have multiple available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSettings withCaptionSelectors(java.util.Collection<CaptionSelector> captionSelectors) {
        setCaptionSelectors(captionSelectors);
        return this;
    }

    /**
     * Enable or disable the deblock filter when filtering.
     * 
     * @param deblockFilter
     *        Enable or disable the deblock filter when filtering.
     * @see InputDeblockFilter
     */

    public void setDeblockFilter(String deblockFilter) {
        this.deblockFilter = deblockFilter;
    }

    /**
     * Enable or disable the deblock filter when filtering.
     * 
     * @return Enable or disable the deblock filter when filtering.
     * @see InputDeblockFilter
     */

    public String getDeblockFilter() {
        return this.deblockFilter;
    }

    /**
     * Enable or disable the deblock filter when filtering.
     * 
     * @param deblockFilter
     *        Enable or disable the deblock filter when filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeblockFilter
     */

    public InputSettings withDeblockFilter(String deblockFilter) {
        setDeblockFilter(deblockFilter);
        return this;
    }

    /**
     * Enable or disable the deblock filter when filtering.
     * 
     * @param deblockFilter
     *        Enable or disable the deblock filter when filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeblockFilter
     */

    public InputSettings withDeblockFilter(InputDeblockFilter deblockFilter) {
        this.deblockFilter = deblockFilter.toString();
        return this;
    }

    /**
     * Enable or disable the denoise filter when filtering.
     * 
     * @param denoiseFilter
     *        Enable or disable the denoise filter when filtering.
     * @see InputDenoiseFilter
     */

    public void setDenoiseFilter(String denoiseFilter) {
        this.denoiseFilter = denoiseFilter;
    }

    /**
     * Enable or disable the denoise filter when filtering.
     * 
     * @return Enable or disable the denoise filter when filtering.
     * @see InputDenoiseFilter
     */

    public String getDenoiseFilter() {
        return this.denoiseFilter;
    }

    /**
     * Enable or disable the denoise filter when filtering.
     * 
     * @param denoiseFilter
     *        Enable or disable the denoise filter when filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDenoiseFilter
     */

    public InputSettings withDenoiseFilter(String denoiseFilter) {
        setDenoiseFilter(denoiseFilter);
        return this;
    }

    /**
     * Enable or disable the denoise filter when filtering.
     * 
     * @param denoiseFilter
     *        Enable or disable the denoise filter when filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDenoiseFilter
     */

    public InputSettings withDenoiseFilter(InputDenoiseFilter denoiseFilter) {
        this.denoiseFilter = denoiseFilter.toString();
        return this;
    }

    /**
     * Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
     * 
     * @param filterStrength
     *        Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
     */

    public void setFilterStrength(Integer filterStrength) {
        this.filterStrength = filterStrength;
    }

    /**
     * Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
     * 
     * @return Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
     */

    public Integer getFilterStrength() {
        return this.filterStrength;
    }

    /**
     * Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
     * 
     * @param filterStrength
     *        Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSettings withFilterStrength(Integer filterStrength) {
        setFilterStrength(filterStrength);
        return this;
    }

    /**
     * Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default. 1) auto -
     * filtering will be applied depending on input type/quality 2) disabled - no filtering will be applied to the input
     * 3) forced - filtering will be applied regardless of input type
     * 
     * @param inputFilter
     *        Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default. 1) auto -
     *        filtering will be applied depending on input type/quality 2) disabled - no filtering will be applied to
     *        the input 3) forced - filtering will be applied regardless of input type
     * @see InputFilter
     */

    public void setInputFilter(String inputFilter) {
        this.inputFilter = inputFilter;
    }

    /**
     * Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default. 1) auto -
     * filtering will be applied depending on input type/quality 2) disabled - no filtering will be applied to the input
     * 3) forced - filtering will be applied regardless of input type
     * 
     * @return Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default. 1) auto
     *         - filtering will be applied depending on input type/quality 2) disabled - no filtering will be applied to
     *         the input 3) forced - filtering will be applied regardless of input type
     * @see InputFilter
     */

    public String getInputFilter() {
        return this.inputFilter;
    }

    /**
     * Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default. 1) auto -
     * filtering will be applied depending on input type/quality 2) disabled - no filtering will be applied to the input
     * 3) forced - filtering will be applied regardless of input type
     * 
     * @param inputFilter
     *        Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default. 1) auto -
     *        filtering will be applied depending on input type/quality 2) disabled - no filtering will be applied to
     *        the input 3) forced - filtering will be applied regardless of input type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFilter
     */

    public InputSettings withInputFilter(String inputFilter) {
        setInputFilter(inputFilter);
        return this;
    }

    /**
     * Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default. 1) auto -
     * filtering will be applied depending on input type/quality 2) disabled - no filtering will be applied to the input
     * 3) forced - filtering will be applied regardless of input type
     * 
     * @param inputFilter
     *        Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default. 1) auto -
     *        filtering will be applied depending on input type/quality 2) disabled - no filtering will be applied to
     *        the input 3) forced - filtering will be applied regardless of input type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFilter
     */

    public InputSettings withInputFilter(InputFilter inputFilter) {
        this.inputFilter = inputFilter.toString();
        return this;
    }

    /**
     * Input settings.
     * 
     * @param networkInputSettings
     *        Input settings.
     */

    public void setNetworkInputSettings(NetworkInputSettings networkInputSettings) {
        this.networkInputSettings = networkInputSettings;
    }

    /**
     * Input settings.
     * 
     * @return Input settings.
     */

    public NetworkInputSettings getNetworkInputSettings() {
        return this.networkInputSettings;
    }

    /**
     * Input settings.
     * 
     * @param networkInputSettings
     *        Input settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSettings withNetworkInputSettings(NetworkInputSettings networkInputSettings) {
        setNetworkInputSettings(networkInputSettings);
        return this;
    }

    /**
     * Loop input if it is a file. This allows a file input to be streamed indefinitely.
     * 
     * @param sourceEndBehavior
     *        Loop input if it is a file. This allows a file input to be streamed indefinitely.
     * @see InputSourceEndBehavior
     */

    public void setSourceEndBehavior(String sourceEndBehavior) {
        this.sourceEndBehavior = sourceEndBehavior;
    }

    /**
     * Loop input if it is a file. This allows a file input to be streamed indefinitely.
     * 
     * @return Loop input if it is a file. This allows a file input to be streamed indefinitely.
     * @see InputSourceEndBehavior
     */

    public String getSourceEndBehavior() {
        return this.sourceEndBehavior;
    }

    /**
     * Loop input if it is a file. This allows a file input to be streamed indefinitely.
     * 
     * @param sourceEndBehavior
     *        Loop input if it is a file. This allows a file input to be streamed indefinitely.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputSourceEndBehavior
     */

    public InputSettings withSourceEndBehavior(String sourceEndBehavior) {
        setSourceEndBehavior(sourceEndBehavior);
        return this;
    }

    /**
     * Loop input if it is a file. This allows a file input to be streamed indefinitely.
     * 
     * @param sourceEndBehavior
     *        Loop input if it is a file. This allows a file input to be streamed indefinitely.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputSourceEndBehavior
     */

    public InputSettings withSourceEndBehavior(InputSourceEndBehavior sourceEndBehavior) {
        this.sourceEndBehavior = sourceEndBehavior.toString();
        return this;
    }

    /**
     * Informs which video elementary stream to decode for input types that have multiple available.
     * 
     * @param videoSelector
     *        Informs which video elementary stream to decode for input types that have multiple available.
     */

    public void setVideoSelector(VideoSelector videoSelector) {
        this.videoSelector = videoSelector;
    }

    /**
     * Informs which video elementary stream to decode for input types that have multiple available.
     * 
     * @return Informs which video elementary stream to decode for input types that have multiple available.
     */

    public VideoSelector getVideoSelector() {
        return this.videoSelector;
    }

    /**
     * Informs which video elementary stream to decode for input types that have multiple available.
     * 
     * @param videoSelector
     *        Informs which video elementary stream to decode for input types that have multiple available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSettings withVideoSelector(VideoSelector videoSelector) {
        setVideoSelector(videoSelector);
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
        if (getAudioSelectors() != null)
            sb.append("AudioSelectors: ").append(getAudioSelectors()).append(",");
        if (getCaptionSelectors() != null)
            sb.append("CaptionSelectors: ").append(getCaptionSelectors()).append(",");
        if (getDeblockFilter() != null)
            sb.append("DeblockFilter: ").append(getDeblockFilter()).append(",");
        if (getDenoiseFilter() != null)
            sb.append("DenoiseFilter: ").append(getDenoiseFilter()).append(",");
        if (getFilterStrength() != null)
            sb.append("FilterStrength: ").append(getFilterStrength()).append(",");
        if (getInputFilter() != null)
            sb.append("InputFilter: ").append(getInputFilter()).append(",");
        if (getNetworkInputSettings() != null)
            sb.append("NetworkInputSettings: ").append(getNetworkInputSettings()).append(",");
        if (getSourceEndBehavior() != null)
            sb.append("SourceEndBehavior: ").append(getSourceEndBehavior()).append(",");
        if (getVideoSelector() != null)
            sb.append("VideoSelector: ").append(getVideoSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputSettings == false)
            return false;
        InputSettings other = (InputSettings) obj;
        if (other.getAudioSelectors() == null ^ this.getAudioSelectors() == null)
            return false;
        if (other.getAudioSelectors() != null && other.getAudioSelectors().equals(this.getAudioSelectors()) == false)
            return false;
        if (other.getCaptionSelectors() == null ^ this.getCaptionSelectors() == null)
            return false;
        if (other.getCaptionSelectors() != null && other.getCaptionSelectors().equals(this.getCaptionSelectors()) == false)
            return false;
        if (other.getDeblockFilter() == null ^ this.getDeblockFilter() == null)
            return false;
        if (other.getDeblockFilter() != null && other.getDeblockFilter().equals(this.getDeblockFilter()) == false)
            return false;
        if (other.getDenoiseFilter() == null ^ this.getDenoiseFilter() == null)
            return false;
        if (other.getDenoiseFilter() != null && other.getDenoiseFilter().equals(this.getDenoiseFilter()) == false)
            return false;
        if (other.getFilterStrength() == null ^ this.getFilterStrength() == null)
            return false;
        if (other.getFilterStrength() != null && other.getFilterStrength().equals(this.getFilterStrength()) == false)
            return false;
        if (other.getInputFilter() == null ^ this.getInputFilter() == null)
            return false;
        if (other.getInputFilter() != null && other.getInputFilter().equals(this.getInputFilter()) == false)
            return false;
        if (other.getNetworkInputSettings() == null ^ this.getNetworkInputSettings() == null)
            return false;
        if (other.getNetworkInputSettings() != null && other.getNetworkInputSettings().equals(this.getNetworkInputSettings()) == false)
            return false;
        if (other.getSourceEndBehavior() == null ^ this.getSourceEndBehavior() == null)
            return false;
        if (other.getSourceEndBehavior() != null && other.getSourceEndBehavior().equals(this.getSourceEndBehavior()) == false)
            return false;
        if (other.getVideoSelector() == null ^ this.getVideoSelector() == null)
            return false;
        if (other.getVideoSelector() != null && other.getVideoSelector().equals(this.getVideoSelector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioSelectors() == null) ? 0 : getAudioSelectors().hashCode());
        hashCode = prime * hashCode + ((getCaptionSelectors() == null) ? 0 : getCaptionSelectors().hashCode());
        hashCode = prime * hashCode + ((getDeblockFilter() == null) ? 0 : getDeblockFilter().hashCode());
        hashCode = prime * hashCode + ((getDenoiseFilter() == null) ? 0 : getDenoiseFilter().hashCode());
        hashCode = prime * hashCode + ((getFilterStrength() == null) ? 0 : getFilterStrength().hashCode());
        hashCode = prime * hashCode + ((getInputFilter() == null) ? 0 : getInputFilter().hashCode());
        hashCode = prime * hashCode + ((getNetworkInputSettings() == null) ? 0 : getNetworkInputSettings().hashCode());
        hashCode = prime * hashCode + ((getSourceEndBehavior() == null) ? 0 : getSourceEndBehavior().hashCode());
        hashCode = prime * hashCode + ((getVideoSelector() == null) ? 0 : getVideoSelector().hashCode());
        return hashCode;
    }

    @Override
    public InputSettings clone() {
        try {
            return (InputSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
