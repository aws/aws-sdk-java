/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCertificates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCertificatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The new default certificate identifier to override the current one with.
     * </p>
     * <p>
     * To determine the valid values, use the <code>describe-certificates</code> AWS CLI command or the
     * <code>DescribeCertificates</code> API operation.
     * </p>
     */
    private String certificateIdentifier;
    /**
     * <p>
     * A value that indicates whether to remove the override for the default certificate. If the override is removed,
     * the default certificate is the system default.
     * </p>
     */
    private Boolean removeCustomerOverride;

    /**
     * <p>
     * The new default certificate identifier to override the current one with.
     * </p>
     * <p>
     * To determine the valid values, use the <code>describe-certificates</code> AWS CLI command or the
     * <code>DescribeCertificates</code> API operation.
     * </p>
     * 
     * @param certificateIdentifier
     *        The new default certificate identifier to override the current one with.</p>
     *        <p>
     *        To determine the valid values, use the <code>describe-certificates</code> AWS CLI command or the
     *        <code>DescribeCertificates</code> API operation.
     */

    public void setCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
    }

    /**
     * <p>
     * The new default certificate identifier to override the current one with.
     * </p>
     * <p>
     * To determine the valid values, use the <code>describe-certificates</code> AWS CLI command or the
     * <code>DescribeCertificates</code> API operation.
     * </p>
     * 
     * @return The new default certificate identifier to override the current one with.</p>
     *         <p>
     *         To determine the valid values, use the <code>describe-certificates</code> AWS CLI command or the
     *         <code>DescribeCertificates</code> API operation.
     */

    public String getCertificateIdentifier() {
        return this.certificateIdentifier;
    }

    /**
     * <p>
     * The new default certificate identifier to override the current one with.
     * </p>
     * <p>
     * To determine the valid values, use the <code>describe-certificates</code> AWS CLI command or the
     * <code>DescribeCertificates</code> API operation.
     * </p>
     * 
     * @param certificateIdentifier
     *        The new default certificate identifier to override the current one with.</p>
     *        <p>
     *        To determine the valid values, use the <code>describe-certificates</code> AWS CLI command or the
     *        <code>DescribeCertificates</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCertificatesRequest withCertificateIdentifier(String certificateIdentifier) {
        setCertificateIdentifier(certificateIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to remove the override for the default certificate. If the override is removed,
     * the default certificate is the system default.
     * </p>
     * 
     * @param removeCustomerOverride
     *        A value that indicates whether to remove the override for the default certificate. If the override is
     *        removed, the default certificate is the system default.
     */

    public void setRemoveCustomerOverride(Boolean removeCustomerOverride) {
        this.removeCustomerOverride = removeCustomerOverride;
    }

    /**
     * <p>
     * A value that indicates whether to remove the override for the default certificate. If the override is removed,
     * the default certificate is the system default.
     * </p>
     * 
     * @return A value that indicates whether to remove the override for the default certificate. If the override is
     *         removed, the default certificate is the system default.
     */

    public Boolean getRemoveCustomerOverride() {
        return this.removeCustomerOverride;
    }

    /**
     * <p>
     * A value that indicates whether to remove the override for the default certificate. If the override is removed,
     * the default certificate is the system default.
     * </p>
     * 
     * @param removeCustomerOverride
     *        A value that indicates whether to remove the override for the default certificate. If the override is
     *        removed, the default certificate is the system default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCertificatesRequest withRemoveCustomerOverride(Boolean removeCustomerOverride) {
        setRemoveCustomerOverride(removeCustomerOverride);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to remove the override for the default certificate. If the override is removed,
     * the default certificate is the system default.
     * </p>
     * 
     * @return A value that indicates whether to remove the override for the default certificate. If the override is
     *         removed, the default certificate is the system default.
     */

    public Boolean isRemoveCustomerOverride() {
        return this.removeCustomerOverride;
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
        if (getCertificateIdentifier() != null)
            sb.append("CertificateIdentifier: ").append(getCertificateIdentifier()).append(",");
        if (getRemoveCustomerOverride() != null)
            sb.append("RemoveCustomerOverride: ").append(getRemoveCustomerOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCertificatesRequest == false)
            return false;
        ModifyCertificatesRequest other = (ModifyCertificatesRequest) obj;
        if (other.getCertificateIdentifier() == null ^ this.getCertificateIdentifier() == null)
            return false;
        if (other.getCertificateIdentifier() != null && other.getCertificateIdentifier().equals(this.getCertificateIdentifier()) == false)
            return false;
        if (other.getRemoveCustomerOverride() == null ^ this.getRemoveCustomerOverride() == null)
            return false;
        if (other.getRemoveCustomerOverride() != null && other.getRemoveCustomerOverride().equals(this.getRemoveCustomerOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateIdentifier() == null) ? 0 : getCertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRemoveCustomerOverride() == null) ? 0 : getRemoveCustomerOverride().hashCode());
        return hashCode;
    }

    @Override
    public ModifyCertificatesRequest clone() {
        return (ModifyCertificatesRequest) super.clone();
    }

}
