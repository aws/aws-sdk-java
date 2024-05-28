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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateCustomDomainAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomDomainAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The custom domain name for the association result.
     * </p>
     */
    private String customDomainName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate associated with the custom domain name.
     * </p>
     */
    private String customDomainCertificateArn;
    /**
     * <p>
     * The identifier of the cluster that the custom domain is associated with.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The expiration time for the certificate for the custom domain.
     * </p>
     */
    private String customDomainCertExpiryTime;

    /**
     * <p>
     * The custom domain name for the association result.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name for the association result.
     */

    public void setCustomDomainName(String customDomainName) {
        this.customDomainName = customDomainName;
    }

    /**
     * <p>
     * The custom domain name for the association result.
     * </p>
     * 
     * @return The custom domain name for the association result.
     */

    public String getCustomDomainName() {
        return this.customDomainName;
    }

    /**
     * <p>
     * The custom domain name for the association result.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name for the association result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDomainAssociationResult withCustomDomainName(String customDomainName) {
        setCustomDomainName(customDomainName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate associated with the custom domain name.
     * </p>
     * 
     * @param customDomainCertificateArn
     *        The Amazon Resource Name (ARN) for the certificate associated with the custom domain name.
     */

    public void setCustomDomainCertificateArn(String customDomainCertificateArn) {
        this.customDomainCertificateArn = customDomainCertificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate associated with the custom domain name.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the certificate associated with the custom domain name.
     */

    public String getCustomDomainCertificateArn() {
        return this.customDomainCertificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate associated with the custom domain name.
     * </p>
     * 
     * @param customDomainCertificateArn
     *        The Amazon Resource Name (ARN) for the certificate associated with the custom domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDomainAssociationResult withCustomDomainCertificateArn(String customDomainCertificateArn) {
        setCustomDomainCertificateArn(customDomainCertificateArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster that the custom domain is associated with.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster that the custom domain is associated with.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster that the custom domain is associated with.
     * </p>
     * 
     * @return The identifier of the cluster that the custom domain is associated with.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster that the custom domain is associated with.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster that the custom domain is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDomainAssociationResult withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The expiration time for the certificate for the custom domain.
     * </p>
     * 
     * @param customDomainCertExpiryTime
     *        The expiration time for the certificate for the custom domain.
     */

    public void setCustomDomainCertExpiryTime(String customDomainCertExpiryTime) {
        this.customDomainCertExpiryTime = customDomainCertExpiryTime;
    }

    /**
     * <p>
     * The expiration time for the certificate for the custom domain.
     * </p>
     * 
     * @return The expiration time for the certificate for the custom domain.
     */

    public String getCustomDomainCertExpiryTime() {
        return this.customDomainCertExpiryTime;
    }

    /**
     * <p>
     * The expiration time for the certificate for the custom domain.
     * </p>
     * 
     * @param customDomainCertExpiryTime
     *        The expiration time for the certificate for the custom domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDomainAssociationResult withCustomDomainCertExpiryTime(String customDomainCertExpiryTime) {
        setCustomDomainCertExpiryTime(customDomainCertExpiryTime);
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
        if (getCustomDomainName() != null)
            sb.append("CustomDomainName: ").append(getCustomDomainName()).append(",");
        if (getCustomDomainCertificateArn() != null)
            sb.append("CustomDomainCertificateArn: ").append(getCustomDomainCertificateArn()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getCustomDomainCertExpiryTime() != null)
            sb.append("CustomDomainCertExpiryTime: ").append(getCustomDomainCertExpiryTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomDomainAssociationResult == false)
            return false;
        CreateCustomDomainAssociationResult other = (CreateCustomDomainAssociationResult) obj;
        if (other.getCustomDomainName() == null ^ this.getCustomDomainName() == null)
            return false;
        if (other.getCustomDomainName() != null && other.getCustomDomainName().equals(this.getCustomDomainName()) == false)
            return false;
        if (other.getCustomDomainCertificateArn() == null ^ this.getCustomDomainCertificateArn() == null)
            return false;
        if (other.getCustomDomainCertificateArn() != null && other.getCustomDomainCertificateArn().equals(this.getCustomDomainCertificateArn()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getCustomDomainCertExpiryTime() == null ^ this.getCustomDomainCertExpiryTime() == null)
            return false;
        if (other.getCustomDomainCertExpiryTime() != null && other.getCustomDomainCertExpiryTime().equals(this.getCustomDomainCertExpiryTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomDomainName() == null) ? 0 : getCustomDomainName().hashCode());
        hashCode = prime * hashCode + ((getCustomDomainCertificateArn() == null) ? 0 : getCustomDomainCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getCustomDomainCertExpiryTime() == null) ? 0 : getCustomDomainCertExpiryTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomDomainAssociationResult clone() {
        try {
            return (CreateCustomDomainAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
