/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Epoch Locking Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/EpochLockingSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EpochLockingSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Optional. Enter a value here to use a custom epoch, instead of the standard epoch (which started at
     * 1970-01-01T00:00:00 UTC). Specify the start time of the custom epoch, in YYYY-MM-DDTHH:MM:SS in UTC. The time
     * must be 2000-01-01T00:00:00 or later. Always set the MM:SS portion to 00:00.
     */
    private String customEpoch;
    /**
     * Optional. Enter a time for the jam sync. The default is midnight UTC. When epoch locking is enabled, MediaLive
     * performs a daily jam sync on every output encode to ensure timecodes don’t diverge from the wall clock. The jam
     * sync applies only to encodes with frame rate of 29.97 or 59.94 FPS. To override, enter a time in HH:MM:SS in UTC.
     * Always set the MM:SS portion to 00:00.
     */
    private String jamSyncTime;

    /**
     * Optional. Enter a value here to use a custom epoch, instead of the standard epoch (which started at
     * 1970-01-01T00:00:00 UTC). Specify the start time of the custom epoch, in YYYY-MM-DDTHH:MM:SS in UTC. The time
     * must be 2000-01-01T00:00:00 or later. Always set the MM:SS portion to 00:00.
     * 
     * @param customEpoch
     *        Optional. Enter a value here to use a custom epoch, instead of the standard epoch (which started at
     *        1970-01-01T00:00:00 UTC). Specify the start time of the custom epoch, in YYYY-MM-DDTHH:MM:SS in UTC. The
     *        time must be 2000-01-01T00:00:00 or later. Always set the MM:SS portion to 00:00.
     */

    public void setCustomEpoch(String customEpoch) {
        this.customEpoch = customEpoch;
    }

    /**
     * Optional. Enter a value here to use a custom epoch, instead of the standard epoch (which started at
     * 1970-01-01T00:00:00 UTC). Specify the start time of the custom epoch, in YYYY-MM-DDTHH:MM:SS in UTC. The time
     * must be 2000-01-01T00:00:00 or later. Always set the MM:SS portion to 00:00.
     * 
     * @return Optional. Enter a value here to use a custom epoch, instead of the standard epoch (which started at
     *         1970-01-01T00:00:00 UTC). Specify the start time of the custom epoch, in YYYY-MM-DDTHH:MM:SS in UTC. The
     *         time must be 2000-01-01T00:00:00 or later. Always set the MM:SS portion to 00:00.
     */

    public String getCustomEpoch() {
        return this.customEpoch;
    }

    /**
     * Optional. Enter a value here to use a custom epoch, instead of the standard epoch (which started at
     * 1970-01-01T00:00:00 UTC). Specify the start time of the custom epoch, in YYYY-MM-DDTHH:MM:SS in UTC. The time
     * must be 2000-01-01T00:00:00 or later. Always set the MM:SS portion to 00:00.
     * 
     * @param customEpoch
     *        Optional. Enter a value here to use a custom epoch, instead of the standard epoch (which started at
     *        1970-01-01T00:00:00 UTC). Specify the start time of the custom epoch, in YYYY-MM-DDTHH:MM:SS in UTC. The
     *        time must be 2000-01-01T00:00:00 or later. Always set the MM:SS portion to 00:00.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EpochLockingSettings withCustomEpoch(String customEpoch) {
        setCustomEpoch(customEpoch);
        return this;
    }

    /**
     * Optional. Enter a time for the jam sync. The default is midnight UTC. When epoch locking is enabled, MediaLive
     * performs a daily jam sync on every output encode to ensure timecodes don’t diverge from the wall clock. The jam
     * sync applies only to encodes with frame rate of 29.97 or 59.94 FPS. To override, enter a time in HH:MM:SS in UTC.
     * Always set the MM:SS portion to 00:00.
     * 
     * @param jamSyncTime
     *        Optional. Enter a time for the jam sync. The default is midnight UTC. When epoch locking is enabled,
     *        MediaLive performs a daily jam sync on every output encode to ensure timecodes don’t diverge from the wall
     *        clock. The jam sync applies only to encodes with frame rate of 29.97 or 59.94 FPS. To override, enter a
     *        time in HH:MM:SS in UTC. Always set the MM:SS portion to 00:00.
     */

    public void setJamSyncTime(String jamSyncTime) {
        this.jamSyncTime = jamSyncTime;
    }

    /**
     * Optional. Enter a time for the jam sync. The default is midnight UTC. When epoch locking is enabled, MediaLive
     * performs a daily jam sync on every output encode to ensure timecodes don’t diverge from the wall clock. The jam
     * sync applies only to encodes with frame rate of 29.97 or 59.94 FPS. To override, enter a time in HH:MM:SS in UTC.
     * Always set the MM:SS portion to 00:00.
     * 
     * @return Optional. Enter a time for the jam sync. The default is midnight UTC. When epoch locking is enabled,
     *         MediaLive performs a daily jam sync on every output encode to ensure timecodes don’t diverge from the
     *         wall clock. The jam sync applies only to encodes with frame rate of 29.97 or 59.94 FPS. To override,
     *         enter a time in HH:MM:SS in UTC. Always set the MM:SS portion to 00:00.
     */

    public String getJamSyncTime() {
        return this.jamSyncTime;
    }

    /**
     * Optional. Enter a time for the jam sync. The default is midnight UTC. When epoch locking is enabled, MediaLive
     * performs a daily jam sync on every output encode to ensure timecodes don’t diverge from the wall clock. The jam
     * sync applies only to encodes with frame rate of 29.97 or 59.94 FPS. To override, enter a time in HH:MM:SS in UTC.
     * Always set the MM:SS portion to 00:00.
     * 
     * @param jamSyncTime
     *        Optional. Enter a time for the jam sync. The default is midnight UTC. When epoch locking is enabled,
     *        MediaLive performs a daily jam sync on every output encode to ensure timecodes don’t diverge from the wall
     *        clock. The jam sync applies only to encodes with frame rate of 29.97 or 59.94 FPS. To override, enter a
     *        time in HH:MM:SS in UTC. Always set the MM:SS portion to 00:00.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EpochLockingSettings withJamSyncTime(String jamSyncTime) {
        setJamSyncTime(jamSyncTime);
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
        if (getCustomEpoch() != null)
            sb.append("CustomEpoch: ").append(getCustomEpoch()).append(",");
        if (getJamSyncTime() != null)
            sb.append("JamSyncTime: ").append(getJamSyncTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EpochLockingSettings == false)
            return false;
        EpochLockingSettings other = (EpochLockingSettings) obj;
        if (other.getCustomEpoch() == null ^ this.getCustomEpoch() == null)
            return false;
        if (other.getCustomEpoch() != null && other.getCustomEpoch().equals(this.getCustomEpoch()) == false)
            return false;
        if (other.getJamSyncTime() == null ^ this.getJamSyncTime() == null)
            return false;
        if (other.getJamSyncTime() != null && other.getJamSyncTime().equals(this.getJamSyncTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomEpoch() == null) ? 0 : getCustomEpoch().hashCode());
        hashCode = prime * hashCode + ((getJamSyncTime() == null) ? 0 : getJamSyncTime().hashCode());
        return hashCode;
    }

    @Override
    public EpochLockingSettings clone() {
        try {
            return (EpochLockingSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.EpochLockingSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
