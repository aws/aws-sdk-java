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
 * Global Configuration
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/GlobalConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** Value to set the initial audio gain for the Live Event. */
    private Integer initialAudioGain;
    /**
     * Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs is
     * configured the encoder will restart at the beginning of the first input. When "none" is configured the encoder
     * will transcode either black, a solid color, or a user specified slate images per the "Input Loss Behavior"
     * configuration until the next input switch occurs (which is controlled through the Channel Schedule API).
     */
    private String inputEndAction;
    /** Settings for system actions when input is lost. */
    private InputLossBehavior inputLossBehavior;
    /**
     * Indicates how MediaLive pipelines are synchronized.
     * 
     * PIPELINELOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other. EPOCHLOCKING -
     * MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
     */
    private String outputLockingMode;
    /**
     * Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock (which
     * optionally may be locked to another source via NTP) or should be locked to the clock of the source that is
     * providing the input stream.
     */
    private String outputTimingSource;
    /**
     * Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for music
     * channels with less than one video frame per second.
     */
    private String supportLowFramerateInputs;

    /**
     * Value to set the initial audio gain for the Live Event.
     * 
     * @param initialAudioGain
     *        Value to set the initial audio gain for the Live Event.
     */

    public void setInitialAudioGain(Integer initialAudioGain) {
        this.initialAudioGain = initialAudioGain;
    }

    /**
     * Value to set the initial audio gain for the Live Event.
     * 
     * @return Value to set the initial audio gain for the Live Event.
     */

    public Integer getInitialAudioGain() {
        return this.initialAudioGain;
    }

    /**
     * Value to set the initial audio gain for the Live Event.
     * 
     * @param initialAudioGain
     *        Value to set the initial audio gain for the Live Event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalConfiguration withInitialAudioGain(Integer initialAudioGain) {
        setInitialAudioGain(initialAudioGain);
        return this;
    }

    /**
     * Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs is
     * configured the encoder will restart at the beginning of the first input. When "none" is configured the encoder
     * will transcode either black, a solid color, or a user specified slate images per the "Input Loss Behavior"
     * configuration until the next input switch occurs (which is controlled through the Channel Schedule API).
     * 
     * @param inputEndAction
     *        Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs
     *        is configured the encoder will restart at the beginning of the first input. When "none" is configured the
     *        encoder will transcode either black, a solid color, or a user specified slate images per the
     *        "Input Loss Behavior" configuration until the next input switch occurs (which is controlled through the
     *        Channel Schedule API).
     * @see GlobalConfigurationInputEndAction
     */

    public void setInputEndAction(String inputEndAction) {
        this.inputEndAction = inputEndAction;
    }

    /**
     * Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs is
     * configured the encoder will restart at the beginning of the first input. When "none" is configured the encoder
     * will transcode either black, a solid color, or a user specified slate images per the "Input Loss Behavior"
     * configuration until the next input switch occurs (which is controlled through the Channel Schedule API).
     * 
     * @return Indicates the action to take when the current input completes (e.g. end-of-file). When
     *         switchAndLoopInputs is configured the encoder will restart at the beginning of the first input. When
     *         "none" is configured the encoder will transcode either black, a solid color, or a user specified slate
     *         images per the "Input Loss Behavior" configuration until the next input switch occurs (which is
     *         controlled through the Channel Schedule API).
     * @see GlobalConfigurationInputEndAction
     */

    public String getInputEndAction() {
        return this.inputEndAction;
    }

    /**
     * Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs is
     * configured the encoder will restart at the beginning of the first input. When "none" is configured the encoder
     * will transcode either black, a solid color, or a user specified slate images per the "Input Loss Behavior"
     * configuration until the next input switch occurs (which is controlled through the Channel Schedule API).
     * 
     * @param inputEndAction
     *        Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs
     *        is configured the encoder will restart at the beginning of the first input. When "none" is configured the
     *        encoder will transcode either black, a solid color, or a user specified slate images per the
     *        "Input Loss Behavior" configuration until the next input switch occurs (which is controlled through the
     *        Channel Schedule API).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalConfigurationInputEndAction
     */

    public GlobalConfiguration withInputEndAction(String inputEndAction) {
        setInputEndAction(inputEndAction);
        return this;
    }

    /**
     * Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs is
     * configured the encoder will restart at the beginning of the first input. When "none" is configured the encoder
     * will transcode either black, a solid color, or a user specified slate images per the "Input Loss Behavior"
     * configuration until the next input switch occurs (which is controlled through the Channel Schedule API).
     * 
     * @param inputEndAction
     *        Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs
     *        is configured the encoder will restart at the beginning of the first input. When "none" is configured the
     *        encoder will transcode either black, a solid color, or a user specified slate images per the
     *        "Input Loss Behavior" configuration until the next input switch occurs (which is controlled through the
     *        Channel Schedule API).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalConfigurationInputEndAction
     */

    public GlobalConfiguration withInputEndAction(GlobalConfigurationInputEndAction inputEndAction) {
        this.inputEndAction = inputEndAction.toString();
        return this;
    }

    /**
     * Settings for system actions when input is lost.
     * 
     * @param inputLossBehavior
     *        Settings for system actions when input is lost.
     */

    public void setInputLossBehavior(InputLossBehavior inputLossBehavior) {
        this.inputLossBehavior = inputLossBehavior;
    }

    /**
     * Settings for system actions when input is lost.
     * 
     * @return Settings for system actions when input is lost.
     */

    public InputLossBehavior getInputLossBehavior() {
        return this.inputLossBehavior;
    }

    /**
     * Settings for system actions when input is lost.
     * 
     * @param inputLossBehavior
     *        Settings for system actions when input is lost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalConfiguration withInputLossBehavior(InputLossBehavior inputLossBehavior) {
        setInputLossBehavior(inputLossBehavior);
        return this;
    }

    /**
     * Indicates how MediaLive pipelines are synchronized.
     * 
     * PIPELINELOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other. EPOCHLOCKING -
     * MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
     * 
     * @param outputLockingMode
     *        Indicates how MediaLive pipelines are synchronized.
     * 
     *        PIPELINELOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other.
     *        EPOCHLOCKING - MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
     * @see GlobalConfigurationOutputLockingMode
     */

    public void setOutputLockingMode(String outputLockingMode) {
        this.outputLockingMode = outputLockingMode;
    }

    /**
     * Indicates how MediaLive pipelines are synchronized.
     * 
     * PIPELINELOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other. EPOCHLOCKING -
     * MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
     * 
     * @return Indicates how MediaLive pipelines are synchronized.
     * 
     *         PIPELINELOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other.
     *         EPOCHLOCKING - MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
     * @see GlobalConfigurationOutputLockingMode
     */

    public String getOutputLockingMode() {
        return this.outputLockingMode;
    }

    /**
     * Indicates how MediaLive pipelines are synchronized.
     * 
     * PIPELINELOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other. EPOCHLOCKING -
     * MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
     * 
     * @param outputLockingMode
     *        Indicates how MediaLive pipelines are synchronized.
     * 
     *        PIPELINELOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other.
     *        EPOCHLOCKING - MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalConfigurationOutputLockingMode
     */

    public GlobalConfiguration withOutputLockingMode(String outputLockingMode) {
        setOutputLockingMode(outputLockingMode);
        return this;
    }

    /**
     * Indicates how MediaLive pipelines are synchronized.
     * 
     * PIPELINELOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other. EPOCHLOCKING -
     * MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
     * 
     * @param outputLockingMode
     *        Indicates how MediaLive pipelines are synchronized.
     * 
     *        PIPELINELOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other.
     *        EPOCHLOCKING - MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalConfigurationOutputLockingMode
     */

    public GlobalConfiguration withOutputLockingMode(GlobalConfigurationOutputLockingMode outputLockingMode) {
        this.outputLockingMode = outputLockingMode.toString();
        return this;
    }

    /**
     * Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock (which
     * optionally may be locked to another source via NTP) or should be locked to the clock of the source that is
     * providing the input stream.
     * 
     * @param outputTimingSource
     *        Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock
     *        (which optionally may be locked to another source via NTP) or should be locked to the clock of the source
     *        that is providing the input stream.
     * @see GlobalConfigurationOutputTimingSource
     */

    public void setOutputTimingSource(String outputTimingSource) {
        this.outputTimingSource = outputTimingSource;
    }

    /**
     * Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock (which
     * optionally may be locked to another source via NTP) or should be locked to the clock of the source that is
     * providing the input stream.
     * 
     * @return Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock
     *         (which optionally may be locked to another source via NTP) or should be locked to the clock of the source
     *         that is providing the input stream.
     * @see GlobalConfigurationOutputTimingSource
     */

    public String getOutputTimingSource() {
        return this.outputTimingSource;
    }

    /**
     * Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock (which
     * optionally may be locked to another source via NTP) or should be locked to the clock of the source that is
     * providing the input stream.
     * 
     * @param outputTimingSource
     *        Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock
     *        (which optionally may be locked to another source via NTP) or should be locked to the clock of the source
     *        that is providing the input stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalConfigurationOutputTimingSource
     */

    public GlobalConfiguration withOutputTimingSource(String outputTimingSource) {
        setOutputTimingSource(outputTimingSource);
        return this;
    }

    /**
     * Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock (which
     * optionally may be locked to another source via NTP) or should be locked to the clock of the source that is
     * providing the input stream.
     * 
     * @param outputTimingSource
     *        Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock
     *        (which optionally may be locked to another source via NTP) or should be locked to the clock of the source
     *        that is providing the input stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalConfigurationOutputTimingSource
     */

    public GlobalConfiguration withOutputTimingSource(GlobalConfigurationOutputTimingSource outputTimingSource) {
        this.outputTimingSource = outputTimingSource.toString();
        return this;
    }

    /**
     * Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for music
     * channels with less than one video frame per second.
     * 
     * @param supportLowFramerateInputs
     *        Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for
     *        music channels with less than one video frame per second.
     * @see GlobalConfigurationLowFramerateInputs
     */

    public void setSupportLowFramerateInputs(String supportLowFramerateInputs) {
        this.supportLowFramerateInputs = supportLowFramerateInputs;
    }

    /**
     * Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for music
     * channels with less than one video frame per second.
     * 
     * @return Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled
     *         for music channels with less than one video frame per second.
     * @see GlobalConfigurationLowFramerateInputs
     */

    public String getSupportLowFramerateInputs() {
        return this.supportLowFramerateInputs;
    }

    /**
     * Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for music
     * channels with less than one video frame per second.
     * 
     * @param supportLowFramerateInputs
     *        Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for
     *        music channels with less than one video frame per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalConfigurationLowFramerateInputs
     */

    public GlobalConfiguration withSupportLowFramerateInputs(String supportLowFramerateInputs) {
        setSupportLowFramerateInputs(supportLowFramerateInputs);
        return this;
    }

    /**
     * Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for music
     * channels with less than one video frame per second.
     * 
     * @param supportLowFramerateInputs
     *        Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for
     *        music channels with less than one video frame per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalConfigurationLowFramerateInputs
     */

    public GlobalConfiguration withSupportLowFramerateInputs(GlobalConfigurationLowFramerateInputs supportLowFramerateInputs) {
        this.supportLowFramerateInputs = supportLowFramerateInputs.toString();
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
        if (getInitialAudioGain() != null)
            sb.append("InitialAudioGain: ").append(getInitialAudioGain()).append(",");
        if (getInputEndAction() != null)
            sb.append("InputEndAction: ").append(getInputEndAction()).append(",");
        if (getInputLossBehavior() != null)
            sb.append("InputLossBehavior: ").append(getInputLossBehavior()).append(",");
        if (getOutputLockingMode() != null)
            sb.append("OutputLockingMode: ").append(getOutputLockingMode()).append(",");
        if (getOutputTimingSource() != null)
            sb.append("OutputTimingSource: ").append(getOutputTimingSource()).append(",");
        if (getSupportLowFramerateInputs() != null)
            sb.append("SupportLowFramerateInputs: ").append(getSupportLowFramerateInputs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalConfiguration == false)
            return false;
        GlobalConfiguration other = (GlobalConfiguration) obj;
        if (other.getInitialAudioGain() == null ^ this.getInitialAudioGain() == null)
            return false;
        if (other.getInitialAudioGain() != null && other.getInitialAudioGain().equals(this.getInitialAudioGain()) == false)
            return false;
        if (other.getInputEndAction() == null ^ this.getInputEndAction() == null)
            return false;
        if (other.getInputEndAction() != null && other.getInputEndAction().equals(this.getInputEndAction()) == false)
            return false;
        if (other.getInputLossBehavior() == null ^ this.getInputLossBehavior() == null)
            return false;
        if (other.getInputLossBehavior() != null && other.getInputLossBehavior().equals(this.getInputLossBehavior()) == false)
            return false;
        if (other.getOutputLockingMode() == null ^ this.getOutputLockingMode() == null)
            return false;
        if (other.getOutputLockingMode() != null && other.getOutputLockingMode().equals(this.getOutputLockingMode()) == false)
            return false;
        if (other.getOutputTimingSource() == null ^ this.getOutputTimingSource() == null)
            return false;
        if (other.getOutputTimingSource() != null && other.getOutputTimingSource().equals(this.getOutputTimingSource()) == false)
            return false;
        if (other.getSupportLowFramerateInputs() == null ^ this.getSupportLowFramerateInputs() == null)
            return false;
        if (other.getSupportLowFramerateInputs() != null && other.getSupportLowFramerateInputs().equals(this.getSupportLowFramerateInputs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialAudioGain() == null) ? 0 : getInitialAudioGain().hashCode());
        hashCode = prime * hashCode + ((getInputEndAction() == null) ? 0 : getInputEndAction().hashCode());
        hashCode = prime * hashCode + ((getInputLossBehavior() == null) ? 0 : getInputLossBehavior().hashCode());
        hashCode = prime * hashCode + ((getOutputLockingMode() == null) ? 0 : getOutputLockingMode().hashCode());
        hashCode = prime * hashCode + ((getOutputTimingSource() == null) ? 0 : getOutputTimingSource().hashCode());
        hashCode = prime * hashCode + ((getSupportLowFramerateInputs() == null) ? 0 : getSupportLowFramerateInputs().hashCode());
        return hashCode;
    }

    @Override
    public GlobalConfiguration clone() {
        try {
            return (GlobalConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.GlobalConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
