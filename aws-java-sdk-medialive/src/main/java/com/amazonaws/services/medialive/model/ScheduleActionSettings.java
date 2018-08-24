/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Settings for a single schedule action.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ScheduleActionSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleActionSettings implements Serializable, Cloneable, StructuredPojo {

    /** SCTE-35 Return to Network Settings */
    private Scte35ReturnToNetworkScheduleActionSettings scte35ReturnToNetworkSettings;
    /** SCTE-35 Splice Insert Settings */
    private Scte35SpliceInsertScheduleActionSettings scte35SpliceInsertSettings;
    /** SCTE-35 Time Signal Settings */
    private Scte35TimeSignalScheduleActionSettings scte35TimeSignalSettings;
    /** Static Image Activate */
    private StaticImageActivateScheduleActionSettings staticImageActivateSettings;
    /** Static Image Deactivate */
    private StaticImageDeactivateScheduleActionSettings staticImageDeactivateSettings;

    /**
     * SCTE-35 Return to Network Settings
     * 
     * @param scte35ReturnToNetworkSettings
     *        SCTE-35 Return to Network Settings
     */

    public void setScte35ReturnToNetworkSettings(Scte35ReturnToNetworkScheduleActionSettings scte35ReturnToNetworkSettings) {
        this.scte35ReturnToNetworkSettings = scte35ReturnToNetworkSettings;
    }

    /**
     * SCTE-35 Return to Network Settings
     * 
     * @return SCTE-35 Return to Network Settings
     */

    public Scte35ReturnToNetworkScheduleActionSettings getScte35ReturnToNetworkSettings() {
        return this.scte35ReturnToNetworkSettings;
    }

    /**
     * SCTE-35 Return to Network Settings
     * 
     * @param scte35ReturnToNetworkSettings
     *        SCTE-35 Return to Network Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withScte35ReturnToNetworkSettings(Scte35ReturnToNetworkScheduleActionSettings scte35ReturnToNetworkSettings) {
        setScte35ReturnToNetworkSettings(scte35ReturnToNetworkSettings);
        return this;
    }

    /**
     * SCTE-35 Splice Insert Settings
     * 
     * @param scte35SpliceInsertSettings
     *        SCTE-35 Splice Insert Settings
     */

    public void setScte35SpliceInsertSettings(Scte35SpliceInsertScheduleActionSettings scte35SpliceInsertSettings) {
        this.scte35SpliceInsertSettings = scte35SpliceInsertSettings;
    }

    /**
     * SCTE-35 Splice Insert Settings
     * 
     * @return SCTE-35 Splice Insert Settings
     */

    public Scte35SpliceInsertScheduleActionSettings getScte35SpliceInsertSettings() {
        return this.scte35SpliceInsertSettings;
    }

    /**
     * SCTE-35 Splice Insert Settings
     * 
     * @param scte35SpliceInsertSettings
     *        SCTE-35 Splice Insert Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withScte35SpliceInsertSettings(Scte35SpliceInsertScheduleActionSettings scte35SpliceInsertSettings) {
        setScte35SpliceInsertSettings(scte35SpliceInsertSettings);
        return this;
    }

    /**
     * SCTE-35 Time Signal Settings
     * 
     * @param scte35TimeSignalSettings
     *        SCTE-35 Time Signal Settings
     */

    public void setScte35TimeSignalSettings(Scte35TimeSignalScheduleActionSettings scte35TimeSignalSettings) {
        this.scte35TimeSignalSettings = scte35TimeSignalSettings;
    }

    /**
     * SCTE-35 Time Signal Settings
     * 
     * @return SCTE-35 Time Signal Settings
     */

    public Scte35TimeSignalScheduleActionSettings getScte35TimeSignalSettings() {
        return this.scte35TimeSignalSettings;
    }

    /**
     * SCTE-35 Time Signal Settings
     * 
     * @param scte35TimeSignalSettings
     *        SCTE-35 Time Signal Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withScte35TimeSignalSettings(Scte35TimeSignalScheduleActionSettings scte35TimeSignalSettings) {
        setScte35TimeSignalSettings(scte35TimeSignalSettings);
        return this;
    }

    /**
     * Static Image Activate
     * 
     * @param staticImageActivateSettings
     *        Static Image Activate
     */

    public void setStaticImageActivateSettings(StaticImageActivateScheduleActionSettings staticImageActivateSettings) {
        this.staticImageActivateSettings = staticImageActivateSettings;
    }

    /**
     * Static Image Activate
     * 
     * @return Static Image Activate
     */

    public StaticImageActivateScheduleActionSettings getStaticImageActivateSettings() {
        return this.staticImageActivateSettings;
    }

    /**
     * Static Image Activate
     * 
     * @param staticImageActivateSettings
     *        Static Image Activate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withStaticImageActivateSettings(StaticImageActivateScheduleActionSettings staticImageActivateSettings) {
        setStaticImageActivateSettings(staticImageActivateSettings);
        return this;
    }

    /**
     * Static Image Deactivate
     * 
     * @param staticImageDeactivateSettings
     *        Static Image Deactivate
     */

    public void setStaticImageDeactivateSettings(StaticImageDeactivateScheduleActionSettings staticImageDeactivateSettings) {
        this.staticImageDeactivateSettings = staticImageDeactivateSettings;
    }

    /**
     * Static Image Deactivate
     * 
     * @return Static Image Deactivate
     */

    public StaticImageDeactivateScheduleActionSettings getStaticImageDeactivateSettings() {
        return this.staticImageDeactivateSettings;
    }

    /**
     * Static Image Deactivate
     * 
     * @param staticImageDeactivateSettings
     *        Static Image Deactivate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionSettings withStaticImageDeactivateSettings(StaticImageDeactivateScheduleActionSettings staticImageDeactivateSettings) {
        setStaticImageDeactivateSettings(staticImageDeactivateSettings);
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
