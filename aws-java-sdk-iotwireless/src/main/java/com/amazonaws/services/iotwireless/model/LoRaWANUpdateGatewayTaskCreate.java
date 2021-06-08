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
 * LoRaWANUpdateGatewayTaskCreate object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANUpdateGatewayTaskCreate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANUpdateGatewayTaskCreate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The signature used to verify the update firmware.
     * </p>
     */
    private String updateSignature;
    /**
     * <p>
     * The CRC of the signature private key to check.
     * </p>
     */
    private Long sigKeyCrc;
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
     * The signature used to verify the update firmware.
     * </p>
     * 
     * @param updateSignature
     *        The signature used to verify the update firmware.
     */

    public void setUpdateSignature(String updateSignature) {
        this.updateSignature = updateSignature;
    }

    /**
     * <p>
     * The signature used to verify the update firmware.
     * </p>
     * 
     * @return The signature used to verify the update firmware.
     */

    public String getUpdateSignature() {
        return this.updateSignature;
    }

    /**
     * <p>
     * The signature used to verify the update firmware.
     * </p>
     * 
     * @param updateSignature
     *        The signature used to verify the update firmware.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANUpdateGatewayTaskCreate withUpdateSignature(String updateSignature) {
        setUpdateSignature(updateSignature);
        return this;
    }

    /**
     * <p>
     * The CRC of the signature private key to check.
     * </p>
     * 
     * @param sigKeyCrc
     *        The CRC of the signature private key to check.
     */

    public void setSigKeyCrc(Long sigKeyCrc) {
        this.sigKeyCrc = sigKeyCrc;
    }

    /**
     * <p>
     * The CRC of the signature private key to check.
     * </p>
     * 
     * @return The CRC of the signature private key to check.
     */

    public Long getSigKeyCrc() {
        return this.sigKeyCrc;
    }

    /**
     * <p>
     * The CRC of the signature private key to check.
     * </p>
     * 
     * @param sigKeyCrc
     *        The CRC of the signature private key to check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANUpdateGatewayTaskCreate withSigKeyCrc(Long sigKeyCrc) {
        setSigKeyCrc(sigKeyCrc);
        return this;
    }

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

    public LoRaWANUpdateGatewayTaskCreate withCurrentVersion(LoRaWANGatewayVersion currentVersion) {
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

    public LoRaWANUpdateGatewayTaskCreate withUpdateVersion(LoRaWANGatewayVersion updateVersion) {
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
        if (getUpdateSignature() != null)
            sb.append("UpdateSignature: ").append(getUpdateSignature()).append(",");
        if (getSigKeyCrc() != null)
            sb.append("SigKeyCrc: ").append(getSigKeyCrc()).append(",");
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

        if (obj instanceof LoRaWANUpdateGatewayTaskCreate == false)
            return false;
        LoRaWANUpdateGatewayTaskCreate other = (LoRaWANUpdateGatewayTaskCreate) obj;
        if (other.getUpdateSignature() == null ^ this.getUpdateSignature() == null)
            return false;
        if (other.getUpdateSignature() != null && other.getUpdateSignature().equals(this.getUpdateSignature()) == false)
            return false;
        if (other.getSigKeyCrc() == null ^ this.getSigKeyCrc() == null)
            return false;
        if (other.getSigKeyCrc() != null && other.getSigKeyCrc().equals(this.getSigKeyCrc()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getUpdateSignature() == null) ? 0 : getUpdateSignature().hashCode());
        hashCode = prime * hashCode + ((getSigKeyCrc() == null) ? 0 : getSigKeyCrc().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getUpdateVersion() == null) ? 0 : getUpdateVersion().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANUpdateGatewayTaskCreate clone() {
        try {
            return (LoRaWANUpdateGatewayTaskCreate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANUpdateGatewayTaskCreateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
