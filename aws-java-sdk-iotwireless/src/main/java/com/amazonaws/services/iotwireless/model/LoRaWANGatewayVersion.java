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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * LoRaWANGatewayVersion object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANGatewayVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANGatewayVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the wireless gateway firmware.
     * </p>
     */
    private String packageVersion;
    /**
     * <p>
     * The model number of the wireless gateway.
     * </p>
     */
    private String model;
    /**
     * <p>
     * The basic station version of the wireless gateway.
     * </p>
     */
    private String station;

    /**
     * <p>
     * The version of the wireless gateway firmware.
     * </p>
     * 
     * @param packageVersion
     *        The version of the wireless gateway firmware.
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * The version of the wireless gateway firmware.
     * </p>
     * 
     * @return The version of the wireless gateway firmware.
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * The version of the wireless gateway firmware.
     * </p>
     * 
     * @param packageVersion
     *        The version of the wireless gateway firmware.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGatewayVersion withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
        return this;
    }

    /**
     * <p>
     * The model number of the wireless gateway.
     * </p>
     * 
     * @param model
     *        The model number of the wireless gateway.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The model number of the wireless gateway.
     * </p>
     * 
     * @return The model number of the wireless gateway.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * The model number of the wireless gateway.
     * </p>
     * 
     * @param model
     *        The model number of the wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGatewayVersion withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The basic station version of the wireless gateway.
     * </p>
     * 
     * @param station
     *        The basic station version of the wireless gateway.
     */

    public void setStation(String station) {
        this.station = station;
    }

    /**
     * <p>
     * The basic station version of the wireless gateway.
     * </p>
     * 
     * @return The basic station version of the wireless gateway.
     */

    public String getStation() {
        return this.station;
    }

    /**
     * <p>
     * The basic station version of the wireless gateway.
     * </p>
     * 
     * @param station
     *        The basic station version of the wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGatewayVersion withStation(String station) {
        setStation(station);
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
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getStation() != null)
            sb.append("Station: ").append(getStation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANGatewayVersion == false)
            return false;
        LoRaWANGatewayVersion other = (LoRaWANGatewayVersion) obj;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getStation() == null ^ this.getStation() == null)
            return false;
        if (other.getStation() != null && other.getStation().equals(this.getStation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getStation() == null) ? 0 : getStation().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANGatewayVersion clone() {
        try {
            return (LoRaWANGatewayVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANGatewayVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
