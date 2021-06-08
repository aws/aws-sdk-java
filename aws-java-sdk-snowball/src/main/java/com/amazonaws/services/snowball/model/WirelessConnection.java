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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures the wireless connection on an AWS Snowcone device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/WirelessConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WirelessConnection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables the Wi-Fi adapter on an AWS Snowcone device.
     * </p>
     */
    private Boolean isWifiEnabled;

    /**
     * <p>
     * Enables the Wi-Fi adapter on an AWS Snowcone device.
     * </p>
     * 
     * @param isWifiEnabled
     *        Enables the Wi-Fi adapter on an AWS Snowcone device.
     */

    public void setIsWifiEnabled(Boolean isWifiEnabled) {
        this.isWifiEnabled = isWifiEnabled;
    }

    /**
     * <p>
     * Enables the Wi-Fi adapter on an AWS Snowcone device.
     * </p>
     * 
     * @return Enables the Wi-Fi adapter on an AWS Snowcone device.
     */

    public Boolean getIsWifiEnabled() {
        return this.isWifiEnabled;
    }

    /**
     * <p>
     * Enables the Wi-Fi adapter on an AWS Snowcone device.
     * </p>
     * 
     * @param isWifiEnabled
     *        Enables the Wi-Fi adapter on an AWS Snowcone device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WirelessConnection withIsWifiEnabled(Boolean isWifiEnabled) {
        setIsWifiEnabled(isWifiEnabled);
        return this;
    }

    /**
     * <p>
     * Enables the Wi-Fi adapter on an AWS Snowcone device.
     * </p>
     * 
     * @return Enables the Wi-Fi adapter on an AWS Snowcone device.
     */

    public Boolean isWifiEnabled() {
        return this.isWifiEnabled;
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
        if (getIsWifiEnabled() != null)
            sb.append("IsWifiEnabled: ").append(getIsWifiEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WirelessConnection == false)
            return false;
        WirelessConnection other = (WirelessConnection) obj;
        if (other.getIsWifiEnabled() == null ^ this.getIsWifiEnabled() == null)
            return false;
        if (other.getIsWifiEnabled() != null && other.getIsWifiEnabled().equals(this.getIsWifiEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsWifiEnabled() == null) ? 0 : getIsWifiEnabled().hashCode());
        return hashCode;
    }

    @Override
    public WirelessConnection clone() {
        try {
            return (WirelessConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.WirelessConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
