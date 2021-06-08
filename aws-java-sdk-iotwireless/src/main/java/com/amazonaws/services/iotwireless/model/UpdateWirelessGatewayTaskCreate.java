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
 * UpdateWirelessGatewayTaskCreate object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateWirelessGatewayTaskCreate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWirelessGatewayTaskCreate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The link to the S3 bucket.
     * </p>
     */
    private String updateDataSource;
    /**
     * <p>
     * The IAM role used to read data from the S3 bucket.
     * </p>
     */
    private String updateDataRole;
    /**
     * <p>
     * The properties that relate to the LoRaWAN wireless gateway.
     * </p>
     */
    private LoRaWANUpdateGatewayTaskCreate loRaWAN;

    /**
     * <p>
     * The link to the S3 bucket.
     * </p>
     * 
     * @param updateDataSource
     *        The link to the S3 bucket.
     */

    public void setUpdateDataSource(String updateDataSource) {
        this.updateDataSource = updateDataSource;
    }

    /**
     * <p>
     * The link to the S3 bucket.
     * </p>
     * 
     * @return The link to the S3 bucket.
     */

    public String getUpdateDataSource() {
        return this.updateDataSource;
    }

    /**
     * <p>
     * The link to the S3 bucket.
     * </p>
     * 
     * @param updateDataSource
     *        The link to the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessGatewayTaskCreate withUpdateDataSource(String updateDataSource) {
        setUpdateDataSource(updateDataSource);
        return this;
    }

    /**
     * <p>
     * The IAM role used to read data from the S3 bucket.
     * </p>
     * 
     * @param updateDataRole
     *        The IAM role used to read data from the S3 bucket.
     */

    public void setUpdateDataRole(String updateDataRole) {
        this.updateDataRole = updateDataRole;
    }

    /**
     * <p>
     * The IAM role used to read data from the S3 bucket.
     * </p>
     * 
     * @return The IAM role used to read data from the S3 bucket.
     */

    public String getUpdateDataRole() {
        return this.updateDataRole;
    }

    /**
     * <p>
     * The IAM role used to read data from the S3 bucket.
     * </p>
     * 
     * @param updateDataRole
     *        The IAM role used to read data from the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessGatewayTaskCreate withUpdateDataRole(String updateDataRole) {
        setUpdateDataRole(updateDataRole);
        return this;
    }

    /**
     * <p>
     * The properties that relate to the LoRaWAN wireless gateway.
     * </p>
     * 
     * @param loRaWAN
     *        The properties that relate to the LoRaWAN wireless gateway.
     */

    public void setLoRaWAN(LoRaWANUpdateGatewayTaskCreate loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * <p>
     * The properties that relate to the LoRaWAN wireless gateway.
     * </p>
     * 
     * @return The properties that relate to the LoRaWAN wireless gateway.
     */

    public LoRaWANUpdateGatewayTaskCreate getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * <p>
     * The properties that relate to the LoRaWAN wireless gateway.
     * </p>
     * 
     * @param loRaWAN
     *        The properties that relate to the LoRaWAN wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessGatewayTaskCreate withLoRaWAN(LoRaWANUpdateGatewayTaskCreate loRaWAN) {
        setLoRaWAN(loRaWAN);
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
        if (getUpdateDataSource() != null)
            sb.append("UpdateDataSource: ").append(getUpdateDataSource()).append(",");
        if (getUpdateDataRole() != null)
            sb.append("UpdateDataRole: ").append(getUpdateDataRole()).append(",");
        if (getLoRaWAN() != null)
            sb.append("LoRaWAN: ").append(getLoRaWAN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWirelessGatewayTaskCreate == false)
            return false;
        UpdateWirelessGatewayTaskCreate other = (UpdateWirelessGatewayTaskCreate) obj;
        if (other.getUpdateDataSource() == null ^ this.getUpdateDataSource() == null)
            return false;
        if (other.getUpdateDataSource() != null && other.getUpdateDataSource().equals(this.getUpdateDataSource()) == false)
            return false;
        if (other.getUpdateDataRole() == null ^ this.getUpdateDataRole() == null)
            return false;
        if (other.getUpdateDataRole() != null && other.getUpdateDataRole().equals(this.getUpdateDataRole()) == false)
            return false;
        if (other.getLoRaWAN() == null ^ this.getLoRaWAN() == null)
            return false;
        if (other.getLoRaWAN() != null && other.getLoRaWAN().equals(this.getLoRaWAN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateDataSource() == null) ? 0 : getUpdateDataSource().hashCode());
        hashCode = prime * hashCode + ((getUpdateDataRole() == null) ? 0 : getUpdateDataRole().hashCode());
        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWirelessGatewayTaskCreate clone() {
        try {
            return (UpdateWirelessGatewayTaskCreate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.UpdateWirelessGatewayTaskCreateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
