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
 * Holds the settings for a single schedule action.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ScheduleActionSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleActionSettings implements Serializable, Cloneable, StructuredPojo {

    /** Action to insert HLS metadata */
    private HlsTimedMetadataScheduleActionSettings hlsTimedMetadataSettings;
    /** Action to switch the input */
    private InputSwitchScheduleActionSettings inputSwitchSettings;
    /** Action to pause or unpause one or both channel pipelines */
    private PauseStateScheduleActionSettings pauseStateSettings;
    /** Action to insert SCTE-35 return_to_network message */
    private Scte35ReturnToNetworkScheduleActionSettings scte35ReturnToNetworkSettings;
    /** Action to insert SCTE-35 splice_insert message */
    private Scte35SpliceInsertScheduleActionSettings scte35SpliceInsertSettings;
    /** Action to insert SCTE-35 time_signal message */
    private Scte35TimeSignalScheduleActionSettings scte35TimeSignalSettings;
    /** Action to activate a static image overlay */
    private StaticImageActivateScheduleActionSettings staticImageActivateSettings;
    /** Action to deactivate a static image overlay */
    private StaticImageDeactivateScheduleActionSettings staticImageDeactivateSettings;

    /**
     * Action to insert HLS metadata
     * 
     * @param hlsTimedMetadataSettings
     *        Action to insert HLS metadata
     */

    public void setHlsTimedMetadataSettings(HlsTimedMetadataScheduleActionSettings hlsTimedMetadataSettings) {
        this.hlsTimedMetadataSettings = hlsTimedMetadataSettings;
    }

    /**
     * Action to insert HLS metadata
     * 
     * @return Action to insert HLS metadata
     */

    public HlsTimedMetadataScheduleActionSettings getHlsTimedMetadataSettings() {
        return this.hlsTimedMetadataSettings;
    }

    /**
     * Action to insert HLS metadata
     * 
     * @param hlsTimedMetadataSettings
     *        Action to insert HLS metadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withHlsTimedMetadataSettings(HlsTimedMetadataScheduleActionSettings hlsTimedMetadataSettings) {
        setHlsTimedMetadataSettings(hlsTimedMetadataSettings);
        return this;
    }

    /**
     * Action to switch the input
     * 
     * @param inputSwitchSettings
     *        Action to switch the input
     */

    public void setInputSwitchSettings(InputSwitchScheduleActionSettings inputSwitchSettings) {
        this.inputSwitchSettings = inputSwitchSettings;
    }

    /**
     * Action to switch the input
     * 
     * @return Action to switch the input
     */

    public InputSwitchScheduleActionSettings getInputSwitchSettings() {
        return this.inputSwitchSettings;
    }

    /**
     * Action to switch the input
     * 
     * @param inputSwitchSettings
     *        Action to switch the input
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withInputSwitchSettings(InputSwitchScheduleActionSettings inputSwitchSettings) {
        setInputSwitchSettings(inputSwitchSettings);
        return this;
    }

    /**
     * Action to pause or unpause one or both channel pipelines
     * 
     * @param pauseStateSettings
     *        Action to pause or unpause one or both channel pipelines
     */

    public void setPauseStateSettings(PauseStateScheduleActionSettings pauseStateSettings) {
        this.pauseStateSettings = pauseStateSettings;
    }

    /**
     * Action to pause or unpause one or both channel pipelines
     * 
     * @return Action to pause or unpause one or both channel pipelines
     */

    public PauseStateScheduleActionSettings getPauseStateSettings() {
        return this.pauseStateSettings;
    }

    /**
     * Action to pause or unpause one or both channel pipelines
     * 
     * @param pauseStateSettings
     *        Action to pause or unpause one or both channel pipelines
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withPauseStateSettings(PauseStateScheduleActionSettings pauseStateSettings) {
        setPauseStateSettings(pauseStateSettings);
        return this;
    }

    /**
     * Action to insert SCTE-35 return_to_network message
     * 
     * @param scte35ReturnToNetworkSettings
     *        Action to insert SCTE-35 return_to_network message
     */

    public void setScte35ReturnToNetworkSettings(Scte35ReturnToNetworkScheduleActionSettings scte35ReturnToNetworkSettings) {
        this.scte35ReturnToNetworkSettings = scte35ReturnToNetworkSettings;
    }

    /**
     * Action to insert SCTE-35 return_to_network message
     * 
     * @return Action to insert SCTE-35 return_to_network message
     */

    public Scte35ReturnToNetworkScheduleActionSettings getScte35ReturnToNetworkSettings() {
        return this.scte35ReturnToNetworkSettings;
    }

    /**
     * Action to insert SCTE-35 return_to_network message
     * 
     * @param scte35ReturnToNetworkSettings
     *        Action to insert SCTE-35 return_to_network message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withScte35ReturnToNetworkSettings(Scte35ReturnToNetworkScheduleActionSettings scte35ReturnToNetworkSettings) {
        setScte35ReturnToNetworkSettings(scte35ReturnToNetworkSettings);
        return this;
    }

    /**
     * Action to insert SCTE-35 splice_insert message
     * 
     * @param scte35SpliceInsertSettings
     *        Action to insert SCTE-35 splice_insert message
     */

    public void setScte35SpliceInsertSettings(Scte35SpliceInsertScheduleActionSettings scte35SpliceInsertSettings) {
        this.scte35SpliceInsertSettings = scte35SpliceInsertSettings;
    }

    /**
     * Action to insert SCTE-35 splice_insert message
     * 
     * @return Action to insert SCTE-35 splice_insert message
     */

    public Scte35SpliceInsertScheduleActionSettings getScte35SpliceInsertSettings() {
        return this.scte35SpliceInsertSettings;
    }

    /**
     * Action to insert SCTE-35 splice_insert message
     * 
     * @param scte35SpliceInsertSettings
     *        Action to insert SCTE-35 splice_insert message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withScte35SpliceInsertSettings(Scte35SpliceInsertScheduleActionSettings scte35SpliceInsertSettings) {
        setScte35SpliceInsertSettings(scte35SpliceInsertSettings);
        return this;
    }

    /**
     * Action to insert SCTE-35 time_signal message
     * 
     * @param scte35TimeSignalSettings
     *        Action to insert SCTE-35 time_signal message
     */

    public void setScte35TimeSignalSettings(Scte35TimeSignalScheduleActionSettings scte35TimeSignalSettings) {
        this.scte35TimeSignalSettings = scte35TimeSignalSettings;
    }

    /**
     * Action to insert SCTE-35 time_signal message
     * 
     * @return Action to insert SCTE-35 time_signal message
     */

    public Scte35TimeSignalScheduleActionSettings getScte35TimeSignalSettings() {
        return this.scte35TimeSignalSettings;
    }

    /**
     * Action to insert SCTE-35 time_signal message
     * 
     * @param scte35TimeSignalSettings
     *        Action to insert SCTE-35 time_signal message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withScte35TimeSignalSettings(Scte35TimeSignalScheduleActionSettings scte35TimeSignalSettings) {
        setScte35TimeSignalSettings(scte35TimeSignalSettings);
        return this;
    }

    /**
     * Action to activate a static image overlay
     * 
     * @param staticImageActivateSettings
     *        Action to activate a static image overlay
     */

    public void setStaticImageActivateSettings(StaticImageActivateScheduleActionSettings staticImageActivateSettings) {
        this.staticImageActivateSettings = staticImageActivateSettings;
    }

    /**
     * Action to activate a static image overlay
     * 
     * @return Action to activate a static image overlay
     */

    public StaticImageActivateScheduleActionSettings getStaticImageActivateSettings() {
        return this.staticImageActivateSettings;
    }

    /**
     * Action to activate a static image overlay
     * 
     * @param staticImageActivateSettings
     *        Action to activate a static image overlay
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withStaticImageActivateSettings(StaticImageActivateScheduleActionSettings staticImageActivateSettings) {
        setStaticImageActivateSettings(staticImageActivateSettings);
        return this;
    }

    /**
     * Action to deactivate a static image overlay
     * 
     * @param staticImageDeactivateSettings
     *        Action to deactivate a static image overlay
     */

    public void setStaticImageDeactivateSettings(StaticImageDeactivateScheduleActionSettings staticImageDeactivateSettings) {
        this.staticImageDeactivateSettings = staticImageDeactivateSettings;
    }

    /**
     * Action to deactivate a static image overlay
     * 
     * @return Action to deactivate a static image overlay
     */

    public StaticImageDeactivateScheduleActionSettings getStaticImageDeactivateSettings() {
        return this.staticImageDeactivateSettings;
    }

    /**
     * Action to deactivate a static image overlay
     * 
     * @param staticImageDeactivateSettings
     *        Action to deactivate a static image overlay
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withStaticImageDeactivateSettings(StaticImageDeactivateScheduleActionSettings staticImageDeactivateSettings) {
        setStaticImageDeactivateSettings(staticImageDeactivateSettings);
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
        if (getHlsTimedMetadataSettings() != null)
            sb.append("HlsTimedMetadataSettings: ").append(getHlsTimedMetadataSettings()).append(",");
        if (getInputSwitchSettings() != null)
            sb.append("InputSwitchSettings: ").append(getInputSwitchSettings()).append(",");
        if (getPauseStateSettings() != null)
            sb.append("PauseStateSettings: ").append(getPauseStateSettings()).append(",");
        if (getScte35ReturnToNetworkSettings() != null)
            sb.append("Scte35ReturnToNetworkSettings: ").append(getScte35ReturnToNetworkSettings()).append(",");
        if (getScte35SpliceInsertSettings() != null)
            sb.append("Scte35SpliceInsertSettings: ").append(getScte35SpliceInsertSettings()).append(",");
        if (getScte35TimeSignalSettings() != null)
            sb.append("Scte35TimeSignalSettings: ").append(getScte35TimeSignalSettings()).append(",");
        if (getStaticImageActivateSettings() != null)
            sb.append("StaticImageActivateSettings: ").append(getStaticImageActivateSettings()).append(",");
        if (getStaticImageDeactivateSettings() != null)
            sb.append("StaticImageDeactivateSettings: ").append(getStaticImageDeactivateSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleActionSettings == false)
            return false;
        ScheduleActionSettings other = (ScheduleActionSettings) obj;
        if (other.getHlsTimedMetadataSettings() == null ^ this.getHlsTimedMetadataSettings() == null)
            return false;
        if (other.getHlsTimedMetadataSettings() != null && other.getHlsTimedMetadataSettings().equals(this.getHlsTimedMetadataSettings()) == false)
            return false;
        if (other.getInputSwitchSettings() == null ^ this.getInputSwitchSettings() == null)
            return false;
        if (other.getInputSwitchSettings() != null && other.getInputSwitchSettings().equals(this.getInputSwitchSettings()) == false)
            return false;
        if (other.getPauseStateSettings() == null ^ this.getPauseStateSettings() == null)
            return false;
        if (other.getPauseStateSettings() != null && other.getPauseStateSettings().equals(this.getPauseStateSettings()) == false)
            return false;
        if (other.getScte35ReturnToNetworkSettings() == null ^ this.getScte35ReturnToNetworkSettings() == null)
            return false;
        if (other.getScte35ReturnToNetworkSettings() != null
                && other.getScte35ReturnToNetworkSettings().equals(this.getScte35ReturnToNetworkSettings()) == false)
            return false;
        if (other.getScte35SpliceInsertSettings() == null ^ this.getScte35SpliceInsertSettings() == null)
            return false;
        if (other.getScte35SpliceInsertSettings() != null && other.getScte35SpliceInsertSettings().equals(this.getScte35SpliceInsertSettings()) == false)
            return false;
        if (other.getScte35TimeSignalSettings() == null ^ this.getScte35TimeSignalSettings() == null)
            return false;
        if (other.getScte35TimeSignalSettings() != null && other.getScte35TimeSignalSettings().equals(this.getScte35TimeSignalSettings()) == false)
            return false;
        if (other.getStaticImageActivateSettings() == null ^ this.getStaticImageActivateSettings() == null)
            return false;
        if (other.getStaticImageActivateSettings() != null && other.getStaticImageActivateSettings().equals(this.getStaticImageActivateSettings()) == false)
            return false;
        if (other.getStaticImageDeactivateSettings() == null ^ this.getStaticImageDeactivateSettings() == null)
            return false;
        if (other.getStaticImageDeactivateSettings() != null
                && other.getStaticImageDeactivateSettings().equals(this.getStaticImageDeactivateSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHlsTimedMetadataSettings() == null) ? 0 : getHlsTimedMetadataSettings().hashCode());
        hashCode = prime * hashCode + ((getInputSwitchSettings() == null) ? 0 : getInputSwitchSettings().hashCode());
        hashCode = prime * hashCode + ((getPauseStateSettings() == null) ? 0 : getPauseStateSettings().hashCode());
        hashCode = prime * hashCode + ((getScte35ReturnToNetworkSettings() == null) ? 0 : getScte35ReturnToNetworkSettings().hashCode());
        hashCode = prime * hashCode + ((getScte35SpliceInsertSettings() == null) ? 0 : getScte35SpliceInsertSettings().hashCode());
        hashCode = prime * hashCode + ((getScte35TimeSignalSettings() == null) ? 0 : getScte35TimeSignalSettings().hashCode());
        hashCode = prime * hashCode + ((getStaticImageActivateSettings() == null) ? 0 : getStaticImageActivateSettings().hashCode());
        hashCode = prime * hashCode + ((getStaticImageDeactivateSettings() == null) ? 0 : getStaticImageDeactivateSettings().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleActionSettings clone() {
        try {
            return (ScheduleActionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.ScheduleActionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
