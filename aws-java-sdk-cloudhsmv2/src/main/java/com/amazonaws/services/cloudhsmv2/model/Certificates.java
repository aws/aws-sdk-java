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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains one or more certificates or a certificate signing request (CSR).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/Certificates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Certificates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cluster's certificate signing request (CSR). The CSR exists only when the cluster's state is
     * <code>UNINITIALIZED</code>.
     * </p>
     */
    private String clusterCsr;
    /**
     * <p>
     * The HSM certificate issued (signed) by the HSM hardware.
     * </p>
     */
    private String hsmCertificate;
    /**
     * <p>
     * The HSM hardware certificate issued (signed) by AWS CloudHSM.
     * </p>
     */
    private String awsHardwareCertificate;
    /**
     * <p>
     * The HSM hardware certificate issued (signed) by the hardware manufacturer.
     * </p>
     */
    private String manufacturerHardwareCertificate;
    /**
     * <p>
     * The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
     * </p>
     */
    private String clusterCertificate;

    /**
     * <p>
     * The cluster's certificate signing request (CSR). The CSR exists only when the cluster's state is
     * <code>UNINITIALIZED</code>.
     * </p>
     * 
     * @param clusterCsr
     *        The cluster's certificate signing request (CSR). The CSR exists only when the cluster's state is
     *        <code>UNINITIALIZED</code>.
     */

    public void setClusterCsr(String clusterCsr) {
        this.clusterCsr = clusterCsr;
    }

    /**
     * <p>
     * The cluster's certificate signing request (CSR). The CSR exists only when the cluster's state is
     * <code>UNINITIALIZED</code>.
     * </p>
     * 
     * @return The cluster's certificate signing request (CSR). The CSR exists only when the cluster's state is
     *         <code>UNINITIALIZED</code>.
     */

    public String getClusterCsr() {
        return this.clusterCsr;
    }

    /**
     * <p>
     * The cluster's certificate signing request (CSR). The CSR exists only when the cluster's state is
     * <code>UNINITIALIZED</code>.
     * </p>
     * 
     * @param clusterCsr
     *        The cluster's certificate signing request (CSR). The CSR exists only when the cluster's state is
     *        <code>UNINITIALIZED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificates withClusterCsr(String clusterCsr) {
        setClusterCsr(clusterCsr);
        return this;
    }

    /**
     * <p>
     * The HSM certificate issued (signed) by the HSM hardware.
     * </p>
     * 
     * @param hsmCertificate
     *        The HSM certificate issued (signed) by the HSM hardware.
     */

    public void setHsmCertificate(String hsmCertificate) {
        this.hsmCertificate = hsmCertificate;
    }

    /**
     * <p>
     * The HSM certificate issued (signed) by the HSM hardware.
     * </p>
     * 
     * @return The HSM certificate issued (signed) by the HSM hardware.
     */

    public String getHsmCertificate() {
        return this.hsmCertificate;
    }

    /**
     * <p>
     * The HSM certificate issued (signed) by the HSM hardware.
     * </p>
     * 
     * @param hsmCertificate
     *        The HSM certificate issued (signed) by the HSM hardware.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificates withHsmCertificate(String hsmCertificate) {
        setHsmCertificate(hsmCertificate);
        return this;
    }

    /**
     * <p>
     * The HSM hardware certificate issued (signed) by AWS CloudHSM.
     * </p>
     * 
     * @param awsHardwareCertificate
     *        The HSM hardware certificate issued (signed) by AWS CloudHSM.
     */

    public void setAwsHardwareCertificate(String awsHardwareCertificate) {
        this.awsHardwareCertificate = awsHardwareCertificate;
    }

    /**
     * <p>
     * The HSM hardware certificate issued (signed) by AWS CloudHSM.
     * </p>
     * 
     * @return The HSM hardware certificate issued (signed) by AWS CloudHSM.
     */

    public String getAwsHardwareCertificate() {
        return this.awsHardwareCertificate;
    }

    /**
     * <p>
     * The HSM hardware certificate issued (signed) by AWS CloudHSM.
     * </p>
     * 
     * @param awsHardwareCertificate
     *        The HSM hardware certificate issued (signed) by AWS CloudHSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificates withAwsHardwareCertificate(String awsHardwareCertificate) {
        setAwsHardwareCertificate(awsHardwareCertificate);
        return this;
    }

    /**
     * <p>
     * The HSM hardware certificate issued (signed) by the hardware manufacturer.
     * </p>
     * 
     * @param manufacturerHardwareCertificate
     *        The HSM hardware certificate issued (signed) by the hardware manufacturer.
     */

    public void setManufacturerHardwareCertificate(String manufacturerHardwareCertificate) {
        this.manufacturerHardwareCertificate = manufacturerHardwareCertificate;
    }

    /**
     * <p>
     * The HSM hardware certificate issued (signed) by the hardware manufacturer.
     * </p>
     * 
     * @return The HSM hardware certificate issued (signed) by the hardware manufacturer.
     */

    public String getManufacturerHardwareCertificate() {
        return this.manufacturerHardwareCertificate;
    }

    /**
     * <p>
     * The HSM hardware certificate issued (signed) by the hardware manufacturer.
     * </p>
     * 
     * @param manufacturerHardwareCertificate
     *        The HSM hardware certificate issued (signed) by the hardware manufacturer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificates withManufacturerHardwareCertificate(String manufacturerHardwareCertificate) {
        setManufacturerHardwareCertificate(manufacturerHardwareCertificate);
        return this;
    }

    /**
     * <p>
     * The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
     * </p>
     * 
     * @param clusterCertificate
     *        The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
     */

    public void setClusterCertificate(String clusterCertificate) {
        this.clusterCertificate = clusterCertificate;
    }

    /**
     * <p>
     * The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
     * </p>
     * 
     * @return The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
     */

    public String getClusterCertificate() {
        return this.clusterCertificate;
    }

    /**
     * <p>
     * The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
     * </p>
     * 
     * @param clusterCertificate
     *        The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificates withClusterCertificate(String clusterCertificate) {
        setClusterCertificate(clusterCertificate);
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
        if (getClusterCsr() != null)
            sb.append("ClusterCsr: ").append(getClusterCsr()).append(",");
        if (getHsmCertificate() != null)
            sb.append("HsmCertificate: ").append(getHsmCertificate()).append(",");
        if (getAwsHardwareCertificate() != null)
            sb.append("AwsHardwareCertificate: ").append(getAwsHardwareCertificate()).append(",");
        if (getManufacturerHardwareCertificate() != null)
            sb.append("ManufacturerHardwareCertificate: ").append(getManufacturerHardwareCertificate()).append(",");
        if (getClusterCertificate() != null)
            sb.append("ClusterCertificate: ").append(getClusterCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Certificates == false)
            return false;
        Certificates other = (Certificates) obj;
        if (other.getClusterCsr() == null ^ this.getClusterCsr() == null)
            return false;
        if (other.getClusterCsr() != null && other.getClusterCsr().equals(this.getClusterCsr()) == false)
            return false;
        if (other.getHsmCertificate() == null ^ this.getHsmCertificate() == null)
            return false;
        if (other.getHsmCertificate() != null && other.getHsmCertificate().equals(this.getHsmCertificate()) == false)
            return false;
        if (other.getAwsHardwareCertificate() == null ^ this.getAwsHardwareCertificate() == null)
            return false;
        if (other.getAwsHardwareCertificate() != null && other.getAwsHardwareCertificate().equals(this.getAwsHardwareCertificate()) == false)
            return false;
        if (other.getManufacturerHardwareCertificate() == null ^ this.getManufacturerHardwareCertificate() == null)
            return false;
        if (other.getManufacturerHardwareCertificate() != null
                && other.getManufacturerHardwareCertificate().equals(this.getManufacturerHardwareCertificate()) == false)
            return false;
        if (other.getClusterCertificate() == null ^ this.getClusterCertificate() == null)
            return false;
        if (other.getClusterCertificate() != null && other.getClusterCertificate().equals(this.getClusterCertificate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterCsr() == null) ? 0 : getClusterCsr().hashCode());
        hashCode = prime * hashCode + ((getHsmCertificate() == null) ? 0 : getHsmCertificate().hashCode());
        hashCode = prime * hashCode + ((getAwsHardwareCertificate() == null) ? 0 : getAwsHardwareCertificate().hashCode());
        hashCode = prime * hashCode + ((getManufacturerHardwareCertificate() == null) ? 0 : getManufacturerHardwareCertificate().hashCode());
        hashCode = prime * hashCode + ((getClusterCertificate() == null) ? 0 : getClusterCertificate().hashCode());
        return hashCode;
    }

    @Override
    public Certificates clone() {
        try {
            return (Certificates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudhsmv2.model.transform.CertificatesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
