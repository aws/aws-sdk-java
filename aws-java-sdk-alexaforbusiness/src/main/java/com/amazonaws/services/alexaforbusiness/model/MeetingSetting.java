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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The values that indicate whether a pin is always required (YES), never required (NO), or OPTIONAL.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If YES, Alexa will always ask for a meeting pin.
 * </p>
 * </li>
 * <li>
 * <p>
 * If NO, Alexa will never ask for a meeting pin.
 * </p>
 * </li>
 * <li>
 * <p>
 * If OPTIONAL, Alexa will ask if you have a meeting pin and if the customer responds with yes, it will ask for the
 * meeting pin.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/MeetingSetting" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeetingSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The values that indicate whether the pin is always required.
     * </p>
     */
    private String requirePin;

    /**
     * <p>
     * The values that indicate whether the pin is always required.
     * </p>
     * 
     * @param requirePin
     *        The values that indicate whether the pin is always required.
     * @see RequirePin
     */

    public void setRequirePin(String requirePin) {
        this.requirePin = requirePin;
    }

    /**
     * <p>
     * The values that indicate whether the pin is always required.
     * </p>
     * 
     * @return The values that indicate whether the pin is always required.
     * @see RequirePin
     */

    public String getRequirePin() {
        return this.requirePin;
    }

    /**
     * <p>
     * The values that indicate whether the pin is always required.
     * </p>
     * 
     * @param requirePin
     *        The values that indicate whether the pin is always required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequirePin
     */

    public MeetingSetting withRequirePin(String requirePin) {
        setRequirePin(requirePin);
        return this;
    }

    /**
     * <p>
     * The values that indicate whether the pin is always required.
     * </p>
     * 
     * @param requirePin
     *        The values that indicate whether the pin is always required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequirePin
     */

    public MeetingSetting withRequirePin(RequirePin requirePin) {
        this.requirePin = requirePin.toString();
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
        if (getRequirePin() != null)
            sb.append("RequirePin: ").append(getRequirePin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeetingSetting == false)
            return false;
        MeetingSetting other = (MeetingSetting) obj;
        if (other.getRequirePin() == null ^ this.getRequirePin() == null)
            return false;
        if (other.getRequirePin() != null && other.getRequirePin().equals(this.getRequirePin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequirePin() == null) ? 0 : getRequirePin().hashCode());
        return hashCode;
    }

    @Override
    public MeetingSetting clone() {
        try {
            return (MeetingSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.MeetingSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
