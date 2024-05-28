/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateCustomDomainAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCustomDomainAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The custom domain name’s certificate Amazon resource name (ARN).
     * </p>
     */
    private String customDomainCertificateArn;
    /**
     * <p>
     * The expiration time for the certificate.
     * </p>
     */
    private java.util.Date customDomainCertificateExpiryTime;
    /**
     * <p>
     * The custom domain name associated with the workgroup.
     * </p>
     */
    private String customDomainName;
    /**
     * <p>
     * The name of the workgroup associated with the database.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * The custom domain name’s certificate Amazon resource name (ARN).
     * </p>
     * 
     * @param customDomainCertificateArn
     *        The custom domain name’s certificate Amazon resource name (ARN).
     */

    public void setCustomDomainCertificateArn(String customDomainCertificateArn) {
        this.customDomainCertificateArn = customDomainCertificateArn;
    }

    /**
     * <p>
     * The custom domain name’s certificate Amazon resource name (ARN).
     * </p>
     * 
     * @return The custom domain name’s certificate Amazon resource name (ARN).
     */

    public String getCustomDomainCertificateArn() {
        return this.customDomainCertificateArn;
    }

    /**
     * <p>
     * The custom domain name’s certificate Amazon resource name (ARN).
     * </p>
     * 
     * @param customDomainCertificateArn
     *        The custom domain name’s certificate Amazon resource name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomDomainAssociationResult withCustomDomainCertificateArn(String customDomainCertificateArn) {
        setCustomDomainCertificateArn(customDomainCertificateArn);
        return this;
    }

    /**
     * <p>
     * The expiration time for the certificate.
     * </p>
     * 
     * @param customDomainCertificateExpiryTime
     *        The expiration time for the certificate.
     */

    public void setCustomDomainCertificateExpiryTime(java.util.Date customDomainCertificateExpiryTime) {
        this.customDomainCertificateExpiryTime = customDomainCertificateExpiryTime;
    }

    /**
     * <p>
     * The expiration time for the certificate.
     * </p>
     * 
     * @return The expiration time for the certificate.
     */

    public java.util.Date getCustomDomainCertificateExpiryTime() {
        return this.customDomainCertificateExpiryTime;
    }

    /**
     * <p>
     * The expiration time for the certificate.
     * </p>
     * 
     * @param customDomainCertificateExpiryTime
     *        The expiration time for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomDomainAssociationResult withCustomDomainCertificateExpiryTime(java.util.Date customDomainCertificateExpiryTime) {
        setCustomDomainCertificateExpiryTime(customDomainCertificateExpiryTime);
        return this;
    }

    /**
     * <p>
     * The custom domain name associated with the workgroup.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name associated with the workgroup.
     */

    public void setCustomDomainName(String customDomainName) {
        this.customDomainName = customDomainName;
    }

    /**
     * <p>
     * The custom domain name associated with the workgroup.
     * </p>
     * 
     * @return The custom domain name associated with the workgroup.
     */

    public String getCustomDomainName() {
        return this.customDomainName;
    }

    /**
     * <p>
     * The custom domain name associated with the workgroup.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name associated with the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomDomainAssociationResult withCustomDomainName(String customDomainName) {
        setCustomDomainName(customDomainName);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup associated with the database.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup associated with the database.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup associated with the database.
     * </p>
     * 
     * @return The name of the workgroup associated with the database.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup associated with the database.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup associated with the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomDomainAssociationResult withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
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
        if (getCustomDomainCertificateArn() != null)
            sb.append("CustomDomainCertificateArn: ").append(getCustomDomainCertificateArn()).append(",");
        if (getCustomDomainCertificateExpiryTime() != null)
            sb.append("CustomDomainCertificateExpiryTime: ").append(getCustomDomainCertificateExpiryTime()).append(",");
        if (getCustomDomainName() != null)
            sb.append("CustomDomainName: ").append(getCustomDomainName()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCustomDomainAssociationResult == false)
            return false;
        UpdateCustomDomainAssociationResult other = (UpdateCustomDomainAssociationResult) obj;
        if (other.getCustomDomainCertificateArn() == null ^ this.getCustomDomainCertificateArn() == null)
            return false;
        if (other.getCustomDomainCertificateArn() != null && other.getCustomDomainCertificateArn().equals(this.getCustomDomainCertificateArn()) == false)
            return false;
        if (other.getCustomDomainCertificateExpiryTime() == null ^ this.getCustomDomainCertificateExpiryTime() == null)
            return false;
        if (other.getCustomDomainCertificateExpiryTime() != null
                && other.getCustomDomainCertificateExpiryTime().equals(this.getCustomDomainCertificateExpiryTime()) == false)
            return false;
        if (other.getCustomDomainName() == null ^ this.getCustomDomainName() == null)
            return false;
        if (other.getCustomDomainName() != null && other.getCustomDomainName().equals(this.getCustomDomainName()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomDomainCertificateArn() == null) ? 0 : getCustomDomainCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCustomDomainCertificateExpiryTime() == null) ? 0 : getCustomDomainCertificateExpiryTime().hashCode());
        hashCode = prime * hashCode + ((getCustomDomainName() == null) ? 0 : getCustomDomainName().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCustomDomainAssociationResult clone() {
        try {
            return (UpdateCustomDomainAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
