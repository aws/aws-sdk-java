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
 * Udp Group Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UdpGroupSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UdpGroupSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When dropTs
     * is selected the entire transport stream will stop being emitted. When dropProgram is selected the program can be
     * dropped from the transport stream (and replaced with null packets to meet the TS bitrate requirement). Or, when
     * emitProgram is chosen the transport stream will continue to be produced normally with repeat frames, black frames,
     * or slate frames substituted for the absent input video.
     */
    private String inputLossAction;
    /** Indicates ID3 frame that has the timecode. */
    private String timedMetadataId3Frame;
    /** Timed Metadata interval in seconds. */
    private Integer timedMetadataId3Period;

    /**
     * Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When dropTs
     * is selected the entire transport stream will stop being emitted. When dropProgram is selected the program can be
     * dropped from the transport stream (and replaced with null packets to meet the TS bitrate requirement). Or, when
     * emitProgram is chosen the transport stream will continue to be produced normally with repeat frames, black frames,
     * or slate frames substituted for the absent input video.
     * 
     * @param inputLossAction
     *        Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When
     *        dropTs is selected the entire transport stream will stop being emitted. When dropProgram is selected the
     *        program can be dropped from the transport stream (and replaced with null packets to meet the TS bitrate
     *        requirement). Or, when emitProgram is chosen the transport stream will continue to be produced normally
     *        with repeat frames, black frames, or slate frames substituted for the absent input video.
     * @see InputLossActionForUdpOut
     */

    public void setInputLossAction(String inputLossAction) {
        this.inputLossAction = inputLossAction;
    }

    /**
     * Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When dropTs
     * is selected the entire transport stream will stop being emitted. When dropProgram is selected the program can be
     * dropped from the transport stream (and replaced with null packets to meet the TS bitrate requirement). Or, when
     * emitProgram is chosen the transport stream will continue to be produced normally with repeat frames, black frames,
     * or slate frames substituted for the absent input video.
     * 
     * @return Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When
     *         dropTs is selected the entire transport stream will stop being emitted. When dropProgram is selected the
     *         program can be dropped from the transport stream (and replaced with null packets to meet the TS bitrate
     *         requirement). Or, when emitProgram is chosen the transport stream will continue to be produced normally
     *         with repeat frames, black frames, or slate frames substituted for the absent input video.
     * @see InputLossActionForUdpOut
     */

    public String getInputLossAction() {
        return this.inputLossAction;
    }

    /**
     * Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When dropTs
     * is selected the entire transport stream will stop being emitted. When dropProgram is selected the program can be
     * dropped from the transport stream (and replaced with null packets to meet the TS bitrate requirement). Or, when
     * emitProgram is chosen the transport stream will continue to be produced normally with repeat frames, black frames,
     * or slate frames substituted for the absent input video.
     * 
     * @param inputLossAction
     *        Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When
     *        dropTs is selected the entire transport stream will stop being emitted. When dropProgram is selected the
     *        program can be dropped from the transport stream (and replaced with null packets to meet the TS bitrate
     *        requirement). Or, when emitProgram is chosen the transport stream will continue to be produced normally
     *        with repeat frames, black frames, or slate frames substituted for the absent input video.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputLossActionForUdpOut
     */

    public UdpGroupSettings withInputLossAction(String inputLossAction) {
        setInputLossAction(inputLossAction);
        return this;
    }

    /**
     * Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When dropTs
     * is selected the entire transport stream will stop being emitted. When dropProgram is selected the program can be
     * dropped from the transport stream (and replaced with null packets to meet the TS bitrate requirement). Or, when
     * emitProgram is chosen the transport stream will continue to be produced normally with repeat frames, black frames,
     * or slate frames substituted for the absent input video.
     * 
     * @param inputLossAction
     *        Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When
     *        dropTs is selected the entire transport stream will stop being emitted. When dropProgram is selected the
     *        program can be dropped from the transport stream (and replaced with null packets to meet the TS bitrate
     *        requirement). Or, when emitProgram is chosen the transport stream will continue to be produced normally
     *        with repeat frames, black frames, or slate frames substituted for the absent input video.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputLossActionForUdpOut
     */

    public UdpGroupSettings withInputLossAction(InputLossActionForUdpOut inputLossAction) {
        this.inputLossAction = inputLossAction.toString();
        return this;
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * 
     * @param timedMetadataId3Frame
     *        Indicates ID3 frame that has the timecode.
     * @see UdpTimedMetadataId3Frame
     */

    public void setTimedMetadataId3Frame(String timedMetadataId3Frame) {
        this.timedMetadataId3Frame = timedMetadataId3Frame;
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * 
     * @return Indicates ID3 frame that has the timecode.
     * @see UdpTimedMetadataId3Frame
     */

    public String getTimedMetadataId3Frame() {
        return this.timedMetadataId3Frame;
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * 
     * @param timedMetadataId3Frame
     *        Indicates ID3 frame that has the timecode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UdpTimedMetadataId3Frame
     */

    public UdpGroupSettings withTimedMetadataId3Frame(String timedMetadataId3Frame) {
        setTimedMetadataId3Frame(timedMetadataId3Frame);
        return this;
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * 
     * @param timedMetadataId3Frame
     *        Indicates ID3 frame that has the timecode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UdpTimedMetadataId3Frame
     */

    public UdpGroupSettings withTimedMetadataId3Frame(UdpTimedMetadataId3Frame timedMetadataId3Frame) {
        this.timedMetadataId3Frame = timedMetadataId3Frame.toString();
        return this;
    }

    /**
     * Timed Metadata interval in seconds.
     * 
     * @param timedMetadataId3Period
     *        Timed Metadata interval in seconds.
     */

    public void setTimedMetadataId3Period(Integer timedMetadataId3Period) {
        this.timedMetadataId3Period = timedMetadataId3Period;
    }

    /**
     * Timed Metadata interval in seconds.
     * 
     * @return Timed Metadata interval in seconds.
     */

    public Integer getTimedMetadataId3Period() {
        return this.timedMetadataId3Period;
    }

    /**
     * Timed Metadata interval in seconds.
     * 
     * @param timedMetadataId3Period
     *        Timed Metadata interval in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UdpGroupSettings withTimedMetadataId3Period(Integer timedMetadataId3Period) {
        setTimedMetadataId3Period(timedMetadataId3Period);
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
        if (getInputLossAction() != null)
            sb.append("InputLossAction: ").append(getInputLossAction()).append(",");
        if (getTimedMetadataId3Frame() != null)
            sb.append("TimedMetadataId3Frame: ").append(getTimedMetadataId3Frame()).append(",");
        if (getTimedMetadataId3Period() != null)
            sb.append("TimedMetadataId3Period: ").append(getTimedMetadataId3Period());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UdpGroupSettings == false)
            return false;
        UdpGroupSettings other = (UdpGroupSettings) obj;
        if (other.getInputLossAction() == null ^ this.getInputLossAction() == null)
            return false;
        if (other.getInputLossAction() != null && other.getInputLossAction().equals(this.getInputLossAction()) == false)
            return false;
        if (other.getTimedMetadataId3Frame() == null ^ this.getTimedMetadataId3Frame() == null)
            return false;
        if (other.getTimedMetadataId3Frame() != null && other.getTimedMetadataId3Frame().equals(this.getTimedMetadataId3Frame()) == false)
            return false;
        if (other.getTimedMetadataId3Period() == null ^ this.getTimedMetadataId3Period() == null)
            return false;
        if (other.getTimedMetadataId3Period() != null && other.getTimedMetadataId3Period().equals(this.getTimedMetadataId3Period()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputLossAction() == null) ? 0 : getInputLossAction().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataId3Frame() == null) ? 0 : getTimedMetadataId3Frame().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataId3Period() == null) ? 0 : getTimedMetadataId3Period().hashCode());
        return hashCode;
    }

    @Override
    public UdpGroupSettings clone() {
        try {
            return (UdpGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.UdpGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
