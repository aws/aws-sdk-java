/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;


/**
 * <p>
 * A complex type that contains information about viewer certificates for this distribution.
 * </p>
 */
public class ViewerCertificate implements Serializable {

    /**
     * The IAM certificate identifier of the custom viewer certificate for
     * this distribution.
     */
    private String iAMCertificateId;

    /**
     * Set to true if you want to use the default *.cloudfront.net viewer
     * certificate for this distribution. Omit this value if you are setting
     * an IAMCertificateId.
     */
    private Boolean cloudFrontDefaultCertificate;

    /**
     * The IAM certificate identifier of the custom viewer certificate for
     * this distribution.
     *
     * @return The IAM certificate identifier of the custom viewer certificate for
     *         this distribution.
     */
    public String getIAMCertificateId() {
        return iAMCertificateId;
    }
    
    /**
     * The IAM certificate identifier of the custom viewer certificate for
     * this distribution.
     *
     * @param iAMCertificateId The IAM certificate identifier of the custom viewer certificate for
     *         this distribution.
     */
    public void setIAMCertificateId(String iAMCertificateId) {
        this.iAMCertificateId = iAMCertificateId;
    }
    
    /**
     * The IAM certificate identifier of the custom viewer certificate for
     * this distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iAMCertificateId The IAM certificate identifier of the custom viewer certificate for
     *         this distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ViewerCertificate withIAMCertificateId(String iAMCertificateId) {
        this.iAMCertificateId = iAMCertificateId;
        return this;
    }

    /**
     * Set to true if you want to use the default *.cloudfront.net viewer
     * certificate for this distribution. Omit this value if you are setting
     * an IAMCertificateId.
     *
     * @return Set to true if you want to use the default *.cloudfront.net viewer
     *         certificate for this distribution. Omit this value if you are setting
     *         an IAMCertificateId.
     */
    public Boolean isCloudFrontDefaultCertificate() {
        return cloudFrontDefaultCertificate;
    }
    
    /**
     * Set to true if you want to use the default *.cloudfront.net viewer
     * certificate for this distribution. Omit this value if you are setting
     * an IAMCertificateId.
     *
     * @param cloudFrontDefaultCertificate Set to true if you want to use the default *.cloudfront.net viewer
     *         certificate for this distribution. Omit this value if you are setting
     *         an IAMCertificateId.
     */
    public void setCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
    }
    
    /**
     * Set to true if you want to use the default *.cloudfront.net viewer
     * certificate for this distribution. Omit this value if you are setting
     * an IAMCertificateId.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudFrontDefaultCertificate Set to true if you want to use the default *.cloudfront.net viewer
     *         certificate for this distribution. Omit this value if you are setting
     *         an IAMCertificateId.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ViewerCertificate withCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
        return this;
    }

    /**
     * Set to true if you want to use the default *.cloudfront.net viewer
     * certificate for this distribution. Omit this value if you are setting
     * an IAMCertificateId.
     *
     * @return Set to true if you want to use the default *.cloudfront.net viewer
     *         certificate for this distribution. Omit this value if you are setting
     *         an IAMCertificateId.
     */
    public Boolean getCloudFrontDefaultCertificate() {
        return cloudFrontDefaultCertificate;
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
        if (getIAMCertificateId() != null) sb.append("IAMCertificateId: " + getIAMCertificateId() + ",");
        if (isCloudFrontDefaultCertificate() != null) sb.append("CloudFrontDefaultCertificate: " + isCloudFrontDefaultCertificate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIAMCertificateId() == null) ? 0 : getIAMCertificateId().hashCode()); 
        hashCode = prime * hashCode + ((isCloudFrontDefaultCertificate() == null) ? 0 : isCloudFrontDefaultCertificate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ViewerCertificate == false) return false;
        ViewerCertificate other = (ViewerCertificate)obj;
        
        if (other.getIAMCertificateId() == null ^ this.getIAMCertificateId() == null) return false;
        if (other.getIAMCertificateId() != null && other.getIAMCertificateId().equals(this.getIAMCertificateId()) == false) return false; 
        if (other.isCloudFrontDefaultCertificate() == null ^ this.isCloudFrontDefaultCertificate() == null) return false;
        if (other.isCloudFrontDefaultCertificate() != null && other.isCloudFrontDefaultCertificate().equals(this.isCloudFrontDefaultCertificate()) == false) return false; 
        return true;
    }
    
}
    