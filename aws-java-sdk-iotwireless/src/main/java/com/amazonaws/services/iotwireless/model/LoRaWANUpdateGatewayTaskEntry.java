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
 * LoRaWANUpdateGatewayTaskEntry object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANUpdateGatewayTaskEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANUpdateGatewayTaskEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the gateways that should receive the update.
     * </p>
     */
    private LoRaWANGatewayVersion currentVersion;
    /**
     * <p>
     * The firmware version to update the gateway to.
     * </p>
     */
    private LoRaWANGatewayVersion updateVersion;

    /**
     * <p>
     * The version of the gateways that should receive the update.
     * </p>
     * 
     * @param currentVersion
     *        The version of the gateways that should receive the update.
     */

    public void setCurrentVersion(LoRaWANGatewayVersion currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The version of the gateways that should receive the update.
     * </p>
     * 
     * @return The version of the gateways that should receive the update.
     */

    public LoRaWANGatewayVersion getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The version of the gateways that should receive the update.
     * </p>
     * 
     * @param currentVersion
     *        The version of the gateways that should receive the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANUpdateGatewayTaskEntry withCurrentVersion(LoRaWANGatewayVersion currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * The firmware version to update the gateway to.
     * </p>
     * 
     * @param updateVersion
     *        The firmware version to update the gateway to.
     */

    public void setUpdateVersion(LoRaWANGatewayVersion updateVersion) {
        this.updateVersion = updateVersion;
    }

    /**
     * <p>
     * The firmware version to update the gateway to.
     * </p>
     * 
     * @return The firmware version to update the gateway to.
     */

    public LoRaWANGatewayVersion getUpdateVersion() {
        return this.updateVersion;
    }

    /**
     * <p>
     * The firmware version to update the gateway to.
     * </p>
     * 
     * @param updateVersion
     *        The firmware version to update the gateway to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANUpdateGatewayTaskEntry withUpdateVersion(LoRaWANGatewayVersion updateVersion) {
        setUpdateVersion(updateVersion);
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
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getUpdateVersion() != null)
            sb.append("UpdateVersion: ").append(getUpdateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANUpdateGatewayTaskEntry == false)
            return false;
        LoRaWANUpdateGatewayTaskEntry other = (LoRaWANUpdateGatewayTaskEntry) obj;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getUpdateVersion() == null ^ this.getUpdateVersion() == null)
            return false;
        if (other.getUpdateVersion() != null && other.getUpdateVersion().equals(this.getUpdateVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getUpdateVersion() == null) ? 0 : getUpdateVersion().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANUpdateGatewayTaskEntry clone() {
        try {
            return (LoRaWANUpdateGatewayTaskEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANUpdateGatewayTaskEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
