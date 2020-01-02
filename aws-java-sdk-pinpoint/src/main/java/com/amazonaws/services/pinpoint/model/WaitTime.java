/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a duration or a date and time that indicates when Amazon Pinpoint determines whether an activity's
 * conditions have been met or an activity moves participants to the next activity in a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/WaitTime" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WaitTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of time to wait, as a duration in ISO 8601 format, before determining whether the activity's
     * conditions have been met or moving participants to the next activity in the journey.
     * </p>
     */
    private String waitFor;
    /**
     * <p>
     * The date and time, in ISO 8601 format, when Amazon Pinpoint determines whether the activity's conditions have
     * been met or the activity moves participants to the next activity in the journey.
     * </p>
     */
    private String waitUntil;

    /**
     * <p>
     * The amount of time to wait, as a duration in ISO 8601 format, before determining whether the activity's
     * conditions have been met or moving participants to the next activity in the journey.
     * </p>
     * 
     * @param waitFor
     *        The amount of time to wait, as a duration in ISO 8601 format, before determining whether the activity's
     *        conditions have been met or moving participants to the next activity in the journey.
     */

    public void setWaitFor(String waitFor) {
        this.waitFor = waitFor;
    }

    /**
     * <p>
     * The amount of time to wait, as a duration in ISO 8601 format, before determining whether the activity's
     * conditions have been met or moving participants to the next activity in the journey.
     * </p>
     * 
     * @return The amount of time to wait, as a duration in ISO 8601 format, before determining whether the activity's
     *         conditions have been met or moving participants to the next activity in the journey.
     */

    public String getWaitFor() {
        return this.waitFor;
    }

    /**
     * <p>
     * The amount of time to wait, as a duration in ISO 8601 format, before determining whether the activity's
     * conditions have been met or moving participants to the next activity in the journey.
     * </p>
     * 
     * @param waitFor
     *        The amount of time to wait, as a duration in ISO 8601 format, before determining whether the activity's
     *        conditions have been met or moving participants to the next activity in the journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaitTime withWaitFor(String waitFor) {
        setWaitFor(waitFor);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when Amazon Pinpoint determines whether the activity's conditions have
     * been met or the activity moves participants to the next activity in the journey.
     * </p>
     * 
     * @param waitUntil
     *        The date and time, in ISO 8601 format, when Amazon Pinpoint determines whether the activity's conditions
     *        have been met or the activity moves participants to the next activity in the journey.
     */

    public void setWaitUntil(String waitUntil) {
        this.waitUntil = waitUntil;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when Amazon Pinpoint determines whether the activity's conditions have
     * been met or the activity moves participants to the next activity in the journey.
     * </p>
     * 
     * @return The date and time, in ISO 8601 format, when Amazon Pinpoint determines whether the activity's conditions
     *         have been met or the activity moves participants to the next activity in the journey.
     */

    public String getWaitUntil() {
        return this.waitUntil;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when Amazon Pinpoint determines whether the activity's conditions have
     * been met or the activity moves participants to the next activity in the journey.
     * </p>
     * 
     * @param waitUntil
     *        The date and time, in ISO 8601 format, when Amazon Pinpoint determines whether the activity's conditions
     *        have been met or the activity moves participants to the next activity in the journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaitTime withWaitUntil(String waitUntil) {
        setWaitUntil(waitUntil);
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
        if (getWaitFor() != null)
            sb.append("WaitFor: ").append(getWaitFor()).append(",");
        if (getWaitUntil() != null)
            sb.append("WaitUntil: ").append(getWaitUntil());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WaitTime == false)
            return false;
        WaitTime other = (WaitTime) obj;
        if (other.getWaitFor() == null ^ this.getWaitFor() == null)
            return false;
        if (other.getWaitFor() != null && other.getWaitFor().equals(this.getWaitFor()) == false)
            return false;
        if (other.getWaitUntil() == null ^ this.getWaitUntil() == null)
            return false;
        if (other.getWaitUntil() != null && other.getWaitUntil().equals(this.getWaitUntil()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWaitFor() == null) ? 0 : getWaitFor().hashCode());
        hashCode = prime * hashCode + ((getWaitUntil() == null) ? 0 : getWaitUntil().hashCode());
        return hashCode;
    }

    @Override
    public WaitTime clone() {
        try {
            return (WaitTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.WaitTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
