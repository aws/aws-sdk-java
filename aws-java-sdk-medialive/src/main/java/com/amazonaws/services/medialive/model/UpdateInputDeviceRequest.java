/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to update an input device.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateInputDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInputDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The settings that you want to apply to the HD input device. */
    private InputDeviceConfigurableSettings hdDeviceSettings;
    /** The unique ID of the input device. For example, hd-123456789abcdef. */
    private String inputDeviceId;
    /** The name that you assigned to this input device (not the unique ID). */
    private String name;
    /** The settings that you want to apply to the UHD input device. */
    private InputDeviceConfigurableSettings uhdDeviceSettings;

    /**
     * The settings that you want to apply to the HD input device.
     * 
     * @param hdDeviceSettings
     *        The settings that you want to apply to the HD input device.
     */

    public void setHdDeviceSettings(InputDeviceConfigurableSettings hdDeviceSettings) {
        this.hdDeviceSettings = hdDeviceSettings;
    }

    /**
     * The settings that you want to apply to the HD input device.
     * 
     * @return The settings that you want to apply to the HD input device.
     */

    public InputDeviceConfigurableSettings getHdDeviceSettings() {
        return this.hdDeviceSettings;
    }

    /**
     * The settings that you want to apply to the HD input device.
     * 
     * @param hdDeviceSettings
     *        The settings that you want to apply to the HD input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputDeviceRequest withHdDeviceSettings(InputDeviceConfigurableSettings hdDeviceSettings) {
        setHdDeviceSettings(hdDeviceSettings);
        return this;
    }

    /**
     * The unique ID of the input device. For example, hd-123456789abcdef.
     * 
     * @param inputDeviceId
     *        The unique ID of the input device. For example, hd-123456789abcdef.
     */

    public void setInputDeviceId(String inputDeviceId) {
        this.inputDeviceId = inputDeviceId;
    }

    /**
     * The unique ID of the input device. For example, hd-123456789abcdef.
     * 
     * @return The unique ID of the input device. For example, hd-123456789abcdef.
     */

    public String getInputDeviceId() {
        return this.inputDeviceId;
    }

    /**
     * The unique ID of the input device. For example, hd-123456789abcdef.
     * 
     * @param inputDeviceId
     *        The unique ID of the input device. For example, hd-123456789abcdef.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputDeviceRequest withInputDeviceId(String inputDeviceId) {
        setInputDeviceId(inputDeviceId);
        return this;
    }

    /**
     * The name that you assigned to this input device (not the unique ID).
     * 
     * @param name
     *        The name that you assigned to this input device (not the unique ID).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name that you assigned to this input device (not the unique ID).
     * 
     * @return The name that you assigned to this input device (not the unique ID).
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name that you assigned to this input device (not the unique ID).
     * 
     * @param name
     *        The name that you assigned to this input device (not the unique ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputDeviceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The settings that you want to apply to the UHD input device.
     * 
     * @param uhdDeviceSettings
     *        The settings that you want to apply to the UHD input device.
     */

    public void setUhdDeviceSettings(InputDeviceConfigurableSettings uhdDeviceSettings) {
        this.uhdDeviceSettings = uhdDeviceSettings;
    }

    /**
     * The settings that you want to apply to the UHD input device.
     * 
     * @return The settings that you want to apply to the UHD input device.
     */

    public InputDeviceConfigurableSettings getUhdDeviceSettings() {
        return this.uhdDeviceSettings;
    }

    /**
     * The settings that you want to apply to the UHD input device.
     * 
     * @param uhdDeviceSettings
     *        The settings that you want to apply to the UHD input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputDeviceRequest withUhdDeviceSettings(InputDeviceConfigurableSettings uhdDeviceSettings) {
        setUhdDeviceSettings(uhdDeviceSettings);
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
        if (getHdDeviceSettings() != null)
            sb.append("HdDeviceSettings: ").append(getHdDeviceSettings()).append(",");
        if (getInputDeviceId() != null)
            sb.append("InputDeviceId: ").append(getInputDeviceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUhdDeviceSettings() != null)
            sb.append("UhdDeviceSettings: ").append(getUhdDeviceSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInputDeviceRequest == false)
            return false;
        UpdateInputDeviceRequest other = (UpdateInputDeviceRequest) obj;
        if (other.getHdDeviceSettings() == null ^ this.getHdDeviceSettings() == null)
            return false;
        if (other.getHdDeviceSettings() != null && other.getHdDeviceSettings().equals(this.getHdDeviceSettings()) == false)
            return false;
        if (other.getInputDeviceId() == null ^ this.getInputDeviceId() == null)
            return false;
        if (other.getInputDeviceId() != null && other.getInputDeviceId().equals(this.getInputDeviceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUhdDeviceSettings() == null ^ this.getUhdDeviceSettings() == null)
            return false;
        if (other.getUhdDeviceSettings() != null && other.getUhdDeviceSettings().equals(this.getUhdDeviceSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHdDeviceSettings() == null) ? 0 : getHdDeviceSettings().hashCode());
        hashCode = prime * hashCode + ((getInputDeviceId() == null) ? 0 : getInputDeviceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUhdDeviceSettings() == null) ? 0 : getUhdDeviceSettings().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInputDeviceRequest clone() {
        return (UpdateInputDeviceRequest) super.clone();
    }

}
