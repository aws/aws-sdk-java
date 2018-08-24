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
 * Fixed mode schedule action start settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/FixedModeScheduleActionStartSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FixedModeScheduleActionStartSettings implements Serializable, Cloneable, StructuredPojo {

    /** Fixed timestamp action start. Conforms to ISO-8601. */
    private String time;

    /**
     * Fixed timestamp action start. Conforms to ISO-8601.
     * 
     * @param time
     *        Fixed timestamp action start. Conforms to ISO-8601.
     */

    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Fixed timestamp action start. Conforms to ISO-8601.
     * 
     * @return Fixed timestamp action start. Conforms to ISO-8601.
     */

    public String getTime() {
        return this.time;
    }

    /**
     * Fixed timestamp action start. Conforms to ISO-8601.
     * 
     * @param time
     *        Fixed timestamp action start. Conforms to ISO-8601.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FixedModeScheduleActionStartSettings withTime(String time) {
        setTime(time);
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
        if (getTime() != null)
            sb.append("Time: ").append(getTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FixedModeScheduleActionStartSettings == false)
            return false;
        FixedModeScheduleActionStartSettings other = (FixedModeScheduleActionStartSettings) obj;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        return hashCode;
    }

    @Override
    public FixedModeScheduleActionStartSettings clone() {
        try {
            return (FixedModeScheduleActionStartSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.FixedModeScheduleActionStartSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
