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
 * Audio Normalization Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AudioNormalizationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioNormalizationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms to the
     * EBU R-128 specification.
     */
    private String algorithm;
    /**
     * When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly, the
     * audio will be measured but not adjusted.
     */
    private String algorithmControl;
    /**
     * Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according to the
     * chosen algorithm. The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128 specification (1770-2)
     * recommends a target of -23 LKFS.
     */
    private Double targetLkfs;

    /**
     * Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms to the
     * EBU R-128 specification.
     * 
     * @param algorithm
     *        Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms
     *        to the EBU R-128 specification.
     * @see AudioNormalizationAlgorithm
     */

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms to the
     * EBU R-128 specification.
     * 
     * @return Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms
     *         to the EBU R-128 specification.
     * @see AudioNormalizationAlgorithm
     */

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms to the
     * EBU R-128 specification.
     * 
     * @param algorithm
     *        Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms
     *        to the EBU R-128 specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioNormalizationAlgorithm
     */

    public AudioNormalizationSettings withAlgorithm(String algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms to the
     * EBU R-128 specification.
     * 
     * @param algorithm
     *        Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms
     *        to the EBU R-128 specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioNormalizationAlgorithm
     */

    public AudioNormalizationSettings withAlgorithm(AudioNormalizationAlgorithm algorithm) {
        this.algorithm = algorithm.toString();
        return this;
    }

    /**
     * When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly, the
     * audio will be measured but not adjusted.
     * 
     * @param algorithmControl
     *        When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly,
     *        the audio will be measured but not adjusted.
     * @see AudioNormalizationAlgorithmControl
     */

    public void setAlgorithmControl(String algorithmControl) {
        this.algorithmControl = algorithmControl;
    }

    /**
     * When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly, the
     * audio will be measured but not adjusted.
     * 
     * @return When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly,
     *         the audio will be measured but not adjusted.
     * @see AudioNormalizationAlgorithmControl
     */

    public String getAlgorithmControl() {
        return this.algorithmControl;
    }

    /**
     * When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly, the
     * audio will be measured but not adjusted.
     * 
     * @param algorithmControl
     *        When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly,
     *        the audio will be measured but not adjusted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioNormalizationAlgorithmControl
     */

    public AudioNormalizationSettings withAlgorithmControl(String algorithmControl) {
        setAlgorithmControl(algorithmControl);
        return this;
    }

    /**
     * When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly, the
     * audio will be measured but not adjusted.
     * 
     * @param algorithmControl
     *        When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly,
     *        the audio will be measured but not adjusted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioNormalizationAlgorithmControl
     */

    public AudioNormalizationSettings withAlgorithmControl(AudioNormalizationAlgorithmControl algorithmControl) {
        this.algorithmControl = algorithmControl.toString();
        return this;
    }

    /**
     * Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according to the
     * chosen algorithm. The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128 specification (1770-2)
     * recommends a target of -23 LKFS.
     * 
     * @param targetLkfs
     *        Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according
     *        to the chosen algorithm. The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128
     *        specification (1770-2) recommends a target of -23 LKFS.
     */

    public void setTargetLkfs(Double targetLkfs) {
        this.targetLkfs = targetLkfs;
    }

    /**
     * Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according to the
     * chosen algorithm. The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128 specification (1770-2)
     * recommends a target of -23 LKFS.
     * 
     * @return Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according
     *         to the chosen algorithm. The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128
     *         specification (1770-2) recommends a target of -23 LKFS.
     */

    public Double getTargetLkfs() {
        return this.targetLkfs;
    }

    /**
     * Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according to the
     * chosen algorithm. The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128 specification (1770-2)
     * recommends a target of -23 LKFS.
     * 
     * @param targetLkfs
     *        Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according
     *        to the chosen algorithm. The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128
     *        specification (1770-2) recommends a target of -23 LKFS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioNormalizationSettings withTargetLkfs(Double targetLkfs) {
        setTargetLkfs(targetLkfs);
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: ").append(getAlgorithm()).append(",");
        if (getAlgorithmControl() != null)
            sb.append("AlgorithmControl: ").append(getAlgorithmControl()).append(",");
        if (getTargetLkfs() != null)
            sb.append("TargetLkfs: ").append(getTargetLkfs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioNormalizationSettings == false)
            return false;
        AudioNormalizationSettings other = (AudioNormalizationSettings) obj;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getAlgorithmControl() == null ^ this.getAlgorithmControl() == null)
            return false;
        if (other.getAlgorithmControl() != null && other.getAlgorithmControl().equals(this.getAlgorithmControl()) == false)
            return false;
        if (other.getTargetLkfs() == null ^ this.getTargetLkfs() == null)
            return false;
        if (other.getTargetLkfs() != null && other.getTargetLkfs().equals(this.getTargetLkfs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmControl() == null) ? 0 : getAlgorithmControl().hashCode());
        hashCode = prime * hashCode + ((getTargetLkfs() == null) ? 0 : getTargetLkfs().hashCode());
        return hashCode;
    }

    @Override
    public AudioNormalizationSettings clone() {
        try {
            return (AudioNormalizationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AudioNormalizationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
