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
package com.amazonaws.services.iot1clickprojects.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a device for a placement template (see <a>PlacementTemplate</a>).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DeviceTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device type, which currently must be <code>"button"</code>.
     * </p>
     */
    private String deviceType;
    /**
     * <p>
     * An optional Lambda function to invoke instead of the default Lambda function provided by the placement template.
     * </p>
     */
    private java.util.Map<String, String> callbackOverrides;

    /**
     * <p>
     * The device type, which currently must be <code>"button"</code>.
     * </p>
     * 
     * @param deviceType
     *        The device type, which currently must be <code>"button"</code>.
     */

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * The device type, which currently must be <code>"button"</code>.
     * </p>
     * 
     * @return The device type, which currently must be <code>"button"</code>.
     */

    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * <p>
     * The device type, which currently must be <code>"button"</code>.
     * </p>
     * 
     * @param deviceType
     *        The device type, which currently must be <code>"button"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceTemplate withDeviceType(String deviceType) {
        setDeviceType(deviceType);
        return this;
    }

    /**
     * <p>
     * An optional Lambda function to invoke instead of the default Lambda function provided by the placement template.
     * </p>
     * 
     * @return An optional Lambda function to invoke instead of the default Lambda function provided by the placement
     *         template.
     */

    public java.util.Map<String, String> getCallbackOverrides() {
        return callbackOverrides;
    }

    /**
     * <p>
     * An optional Lambda function to invoke instead of the default Lambda function provided by the placement template.
     * </p>
     * 
     * @param callbackOverrides
     *        An optional Lambda function to invoke instead of the default Lambda function provided by the placement
     *        template.
     */

    public void setCallbackOverrides(java.util.Map<String, String> callbackOverrides) {
        this.callbackOverrides = callbackOverrides;
    }

    /**
     * <p>
     * An optional Lambda function to invoke instead of the default Lambda function provided by the placement template.
     * </p>
     * 
     * @param callbackOverrides
     *        An optional Lambda function to invoke instead of the default Lambda function provided by the placement
     *        template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceTemplate withCallbackOverrides(java.util.Map<String, String> callbackOverrides) {
        setCallbackOverrides(callbackOverrides);
        return this;
    }

    public DeviceTemplate addCallbackOverridesEntry(String key, String value) {
        if (null == this.callbackOverrides) {
            this.callbackOverrides = new java.util.HashMap<String, String>();
        }
        if (this.callbackOverrides.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.callbackOverrides.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CallbackOverrides.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceTemplate clearCallbackOverridesEntries() {
        this.callbackOverrides = null;
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
        if (getDeviceType() != null)
            sb.append("DeviceType: ").append(getDeviceType()).append(",");
        if (getCallbackOverrides() != null)
            sb.append("CallbackOverrides: ").append(getCallbackOverrides());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceTemplate == false)
            return false;
        DeviceTemplate other = (DeviceTemplate) obj;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        if (other.getCallbackOverrides() == null ^ this.getCallbackOverrides() == null)
            return false;
        if (other.getCallbackOverrides() != null && other.getCallbackOverrides().equals(this.getCallbackOverrides()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        hashCode = prime * hashCode + ((getCallbackOverrides() == null) ? 0 : getCallbackOverrides().hashCode());
        return hashCode;
    }

    @Override
    public DeviceTemplate clone() {
        try {
            return (DeviceTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot1clickprojects.model.transform.DeviceTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
