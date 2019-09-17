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
 * Settings to specify when an action should occur. Only one of the options must be selected.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ScheduleActionStartSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleActionStartSettings implements Serializable, Cloneable, StructuredPojo {

    /** Option for specifying the start time for an action. */
    private FixedModeScheduleActionStartSettings fixedModeScheduleActionStartSettings;
    /** Option for specifying an action as relative to another action. */
    private FollowModeScheduleActionStartSettings followModeScheduleActionStartSettings;
    /** Option for specifying an action that should be applied immediately. */
    private ImmediateModeScheduleActionStartSettings immediateModeScheduleActionStartSettings;

    /**
     * Option for specifying the start time for an action.
     * 
     * @param fixedModeScheduleActionStartSettings
     *        Option for specifying the start time for an action.
     */

    public void setFixedModeScheduleActionStartSettings(FixedModeScheduleActionStartSettings fixedModeScheduleActionStartSettings) {
        this.fixedModeScheduleActionStartSettings = fixedModeScheduleActionStartSettings;
    }

    /**
     * Option for specifying the start time for an action.
     * 
     * @return Option for specifying the start time for an action.
     */

    public FixedModeScheduleActionStartSettings getFixedModeScheduleActionStartSettings() {
        return this.fixedModeScheduleActionStartSettings;
    }

    /**
     * Option for specifying the start time for an action.
     * 
     * @param fixedModeScheduleActionStartSettings
     *        Option for specifying the start time for an action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionStartSettings withFixedModeScheduleActionStartSettings(FixedModeScheduleActionStartSettings fixedModeScheduleActionStartSettings) {
        setFixedModeScheduleActionStartSettings(fixedModeScheduleActionStartSettings);
        return this;
    }

    /**
     * Option for specifying an action as relative to another action.
     * 
     * @param followModeScheduleActionStartSettings
     *        Option for specifying an action as relative to another action.
     */

    public void setFollowModeScheduleActionStartSettings(FollowModeScheduleActionStartSettings followModeScheduleActionStartSettings) {
        this.followModeScheduleActionStartSettings = followModeScheduleActionStartSettings;
    }

    /**
     * Option for specifying an action as relative to another action.
     * 
     * @return Option for specifying an action as relative to another action.
     */

    public FollowModeScheduleActionStartSettings getFollowModeScheduleActionStartSettings() {
        return this.followModeScheduleActionStartSettings;
    }

    /**
     * Option for specifying an action as relative to another action.
     * 
     * @param followModeScheduleActionStartSettings
     *        Option for specifying an action as relative to another action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionStartSettings withFollowModeScheduleActionStartSettings(FollowModeScheduleActionStartSettings followModeScheduleActionStartSettings) {
        setFollowModeScheduleActionStartSettings(followModeScheduleActionStartSettings);
        return this;
    }

    /**
     * Option for specifying an action that should be applied immediately.
     * 
     * @param immediateModeScheduleActionStartSettings
     *        Option for specifying an action that should be applied immediately.
     */

    public void setImmediateModeScheduleActionStartSettings(ImmediateModeScheduleActionStartSettings immediateModeScheduleActionStartSettings) {
        this.immediateModeScheduleActionStartSettings = immediateModeScheduleActionStartSettings;
    }

    /**
     * Option for specifying an action that should be applied immediately.
     * 
     * @return Option for specifying an action that should be applied immediately.
     */

    public ImmediateModeScheduleActionStartSettings getImmediateModeScheduleActionStartSettings() {
        return this.immediateModeScheduleActionStartSettings;
    }

    /**
     * Option for specifying an action that should be applied immediately.
     * 
     * @param immediateModeScheduleActionStartSettings
     *        Option for specifying an action that should be applied immediately.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionStartSettings withImmediateModeScheduleActionStartSettings(
            ImmediateModeScheduleActionStartSettings immediateModeScheduleActionStartSettings) {
        setImmediateModeScheduleActionStartSettings(immediateModeScheduleActionStartSettings);
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
        if (getFixedModeScheduleActionStartSettings() != null)
            sb.append("FixedModeScheduleActionStartSettings: ").append(getFixedModeScheduleActionStartSettings()).append(",");
        if (getFollowModeScheduleActionStartSettings() != null)
            sb.append("FollowModeScheduleActionStartSettings: ").append(getFollowModeScheduleActionStartSettings()).append(",");
        if (getImmediateModeScheduleActionStartSettings() != null)
            sb.append("ImmediateModeScheduleActionStartSettings: ").append(getImmediateModeScheduleActionStartSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleActionStartSettings == false)
            return false;
        ScheduleActionStartSettings other = (ScheduleActionStartSettings) obj;
        if (other.getFixedModeScheduleActionStartSettings() == null ^ this.getFixedModeScheduleActionStartSettings() == null)
            return false;
        if (other.getFixedModeScheduleActionStartSettings() != null
                && other.getFixedModeScheduleActionStartSettings().equals(this.getFixedModeScheduleActionStartSettings()) == false)
            return false;
        if (other.getFollowModeScheduleActionStartSettings() == null ^ this.getFollowModeScheduleActionStartSettings() == null)
            return false;
        if (other.getFollowModeScheduleActionStartSettings() != null
                && other.getFollowModeScheduleActionStartSettings().equals(this.getFollowModeScheduleActionStartSettings()) == false)
            return false;
        if (other.getImmediateModeScheduleActionStartSettings() == null ^ this.getImmediateModeScheduleActionStartSettings() == null)
            return false;
        if (other.getImmediateModeScheduleActionStartSettings() != null
                && other.getImmediateModeScheduleActionStartSettings().equals(this.getImmediateModeScheduleActionStartSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFixedModeScheduleActionStartSettings() == null) ? 0 : getFixedModeScheduleActionStartSettings().hashCode());
        hashCode = prime * hashCode + ((getFollowModeScheduleActionStartSettings() == null) ? 0 : getFollowModeScheduleActionStartSettings().hashCode());
        hashCode = prime * hashCode + ((getImmediateModeScheduleActionStartSettings() == null) ? 0 : getImmediateModeScheduleActionStartSettings().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleActionStartSettings clone() {
        try {
            return (ScheduleActionStartSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.ScheduleActionStartSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
