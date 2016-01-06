/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * A CA certificate for an AWS account.
 * </p>
 */
public class Certificate implements Serializable, Cloneable {

    /**
     * The unique key that identifies a certificate.
     */
    private String certificateIdentifier;

    /**
     * The type of the certificate.
     */
    private String certificateType;

    /**
     * The thumbprint of the certificate.
     */
    private String thumbprint;

    /**
     * The starting date from which the certificate is valid.
     */
    private java.util.Date validFrom;

    /**
     * The final date that the certificate continues to be valid.
     */
    private java.util.Date validTill;

    /**
     * The unique key that identifies a certificate.
     *
     * @return The unique key that identifies a certificate.
     */
    public String getCertificateIdentifier() {
        return certificateIdentifier;
    }
    
    /**
     * The unique key that identifies a certificate.
     *
     * @param certificateIdentifier The unique key that identifies a certificate.
     */
    public void setCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
    }
    
    /**
     * The unique key that identifies a certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificateIdentifier The unique key that identifies a certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Certificate withCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
        return this;
    }

    /**
     * The type of the certificate.
     *
     * @return The type of the certificate.
     */
    public String getCertificateType() {
        return certificateType;
    }
    
    /**
     * The type of the certificate.
     *
     * @param certificateType The type of the certificate.
     */
    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }
    
    /**
     * The type of the certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificateType The type of the certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Certificate withCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * The thumbprint of the certificate.
     *
     * @return The thumbprint of the certificate.
     */
    public String getThumbprint() {
        return thumbprint;
    }
    
    /**
     * The thumbprint of the certificate.
     *
     * @param thumbprint The thumbprint of the certificate.
     */
    public void setThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
    }
    
    /**
     * The thumbprint of the certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param thumbprint The thumbprint of the certificate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Certificate withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * The starting date from which the certificate is valid.
     *
     * @return The starting date from which the certificate is valid.
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }
    
    /**
     * The starting date from which the certificate is valid.
     *
     * @param validFrom The starting date from which the certificate is valid.
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }
    
    /**
     * The starting date from which the certificate is valid.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validFrom The starting date from which the certificate is valid.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Certificate withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * The final date that the certificate continues to be valid.
     *
     * @return The final date that the certificate continues to be valid.
     */
    public java.util.Date getValidTill() {
        return validTill;
    }
    
    /**
     * The final date that the certificate continues to be valid.
     *
     * @param validTill The final date that the certificate continues to be valid.
     */
    public void setValidTill(java.util.Date validTill) {
        this.validTill = validTill;
    }
    
    /**
     * The final date that the certificate continues to be valid.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validTill The final date that the certificate continues to be valid.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Certificate withValidTill(java.util.Date validTill) {
        this.validTill = validTill;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificateIdentifier() != null) sb.append("CertificateIdentifier: " + getCertificateIdentifier() + ",");
        if (getCertificateType() != null) sb.append("CertificateType: " + getCertificateType() + ",");
        if (getThumbprint() != null) sb.append("Thumbprint: " + getThumbprint() + ",");
        if (getValidFrom() != null) sb.append("ValidFrom: " + getValidFrom() + ",");
        if (getValidTill() != null) sb.append("ValidTill: " + getValidTill() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCertificateIdentifier() == null) ? 0 : getCertificateIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateType() == null) ? 0 : getCertificateType().hashCode()); 
        hashCode = prime * hashCode + ((getThumbprint() == null) ? 0 : getThumbprint().hashCode()); 
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode()); 
        hashCode = prime * hashCode + ((getValidTill() == null) ? 0 : getValidTill().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Certificate == false) return false;
        Certificate other = (Certificate)obj;
        
        if (other.getCertificateIdentifier() == null ^ this.getCertificateIdentifier() == null) return false;
        if (other.getCertificateIdentifier() != null && other.getCertificateIdentifier().equals(this.getCertificateIdentifier()) == false) return false; 
        if (other.getCertificateType() == null ^ this.getCertificateType() == null) return false;
        if (other.getCertificateType() != null && other.getCertificateType().equals(this.getCertificateType()) == false) return false; 
        if (other.getThumbprint() == null ^ this.getThumbprint() == null) return false;
        if (other.getThumbprint() != null && other.getThumbprint().equals(this.getThumbprint()) == false) return false; 
        if (other.getValidFrom() == null ^ this.getValidFrom() == null) return false;
        if (other.getValidFrom() != null && other.getValidFrom().equals(this.getValidFrom()) == false) return false; 
        if (other.getValidTill() == null ^ this.getValidTill() == null) return false;
        if (other.getValidTill() != null && other.getValidTill().equals(this.getValidTill()) == false) return false; 
        return true;
    }
    
    @Override
    public Certificate clone() {
        try {
            return (Certificate) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    