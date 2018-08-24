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
 * When the schedule action starts.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ScheduleActionStartSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleActionStartSettings implements Serializable, Cloneable, StructuredPojo {

    /** Fixed timestamp action start. Conforms to ISO-8601. */
    private FixedModeScheduleActionStartSettings fixedModeScheduleActionStartSettings;

    /**
     * Fixed timestamp action start. Conforms to ISO-8601.
     * 
     * @param fixedModeScheduleActionStartSettings
     *        Fixed timestamp action start. Conforms to ISO-8601.
     */

    public void setFixedModeScheduleActionStartSettings(FixedModeScheduleActionStartSettings fixedModeScheduleActionStartSettings) {
        this.fixedModeScheduleActionStartSettings = fixedModeScheduleActionStartSettings;
    }

    /**
     * Fixed timestamp action start. Conforms to ISO-8601.
     * 
     * @return Fixed timestamp action start. Conforms to ISO-8601.
     */

    public FixedModeScheduleActionStartSettings getFixedModeScheduleActionStartSettings() {
        return this.fixedModeScheduleActionStartSettings;
    }

    /**
     * Fixed timestamp action start. Conforms to ISO-8601.
     * 
     * @param fixedModeScheduleActionStartSettings
     *        Fixed timestamp action start. Conforms to ISO-8601.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActionStartSettings withFixedModeScheduleActionStartSettings(FixedModeScheduleActionStartSettings fixedModeScheduleActionStartSettings) {
        setFixedModeScheduleActionStartSettings(fixedModeScheduleActionStartSettings);
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
        if (getFixedModeScheduleActionStartSettings() != null)
            sb.append("FixedModeScheduleActionStartSettings: ").append(getFixedModeScheduleActionStartSettings());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFixedModeScheduleActionStartSettings() == null) ? 0 : getFixedModeScheduleActionStartSettings().hashCode());
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
