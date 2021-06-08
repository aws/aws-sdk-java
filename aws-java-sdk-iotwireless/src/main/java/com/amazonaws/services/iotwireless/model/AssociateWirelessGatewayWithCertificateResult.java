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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessGatewayWithCertificate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateWirelessGatewayWithCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ID of the certificate associated with the wireless gateway.
     * </p>
     */
    private String iotCertificateId;

    /**
     * <p>
     * The ID of the certificate associated with the wireless gateway.
     * </p>
     * 
     * @param iotCertificateId
     *        The ID of the certificate associated with the wireless gateway.
     */

    public void setIotCertificateId(String iotCertificateId) {
        this.iotCertificateId = iotCertificateId;
    }

    /**
     * <p>
     * The ID of the certificate associated with the wireless gateway.
     * </p>
     * 
     * @return The ID of the certificate associated with the wireless gateway.
     */

    public String getIotCertificateId() {
        return this.iotCertificateId;
    }

    /**
     * <p>
     * The ID of the certificate associated with the wireless gateway.
     * </p>
     * 
     * @param iotCertificateId
     *        The ID of the certificate associated with the wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateWirelessGatewayWithCertificateResult withIotCertificateId(String iotCertificateId) {
        setIotCertificateId(iotCertificateId);
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
        if (getIotCertificateId() != null)
            sb.append("IotCertificateId: ").append(getIotCertificateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateWirelessGatewayWithCertificateResult == false)
            return false;
        AssociateWirelessGatewayWithCertificateResult other = (AssociateWirelessGatewayWithCertificateResult) obj;
        if (other.getIotCertificateId() == null ^ this.getIotCertificateId() == null)
            return false;
        if (other.getIotCertificateId() != null && other.getIotCertificateId().equals(this.getIotCertificateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIotCertificateId() == null) ? 0 : getIotCertificateId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateWirelessGatewayWithCertificateResult clone() {
        try {
            return (AssociateWirelessGatewayWithCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
