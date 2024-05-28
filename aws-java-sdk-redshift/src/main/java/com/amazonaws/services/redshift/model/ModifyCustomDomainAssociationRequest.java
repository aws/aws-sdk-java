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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyCustomDomainAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCustomDomainAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The custom domain name for a changed custom domain association.
     * </p>
     */
    private String customDomainName;
    /**
     * <p>
     * The certificate Amazon Resource Name (ARN) for the changed custom domain association.
     * </p>
     */
    private String customDomainCertificateArn;
    /**
     * <p>
     * The identifier of the cluster to change a custom domain association for.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The custom domain name for a changed custom domain association.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name for a changed custom domain association.
     */

    public void setCustomDomainName(String customDomainName) {
        this.customDomainName = customDomainName;
    }

    /**
     * <p>
     * The custom domain name for a changed custom domain association.
     * </p>
     * 
     * @return The custom domain name for a changed custom domain association.
     */

    public String getCustomDomainName() {
        return this.customDomainName;
    }

    /**
     * <p>
     * The custom domain name for a changed custom domain association.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name for a changed custom domain association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDomainAssociationRequest withCustomDomainName(String customDomainName) {
        setCustomDomainName(customDomainName);
        return this;
    }

    /**
     * <p>
     * The certificate Amazon Resource Name (ARN) for the changed custom domain association.
     * </p>
     * 
     * @param customDomainCertificateArn
     *        The certificate Amazon Resource Name (ARN) for the changed custom domain association.
     */

    public void setCustomDomainCertificateArn(String customDomainCertificateArn) {
        this.customDomainCertificateArn = customDomainCertificateArn;
    }

    /**
     * <p>
     * The certificate Amazon Resource Name (ARN) for the changed custom domain association.
     * </p>
     * 
     * @return The certificate Amazon Resource Name (ARN) for the changed custom domain association.
     */

    public String getCustomDomainCertificateArn() {
        return this.customDomainCertificateArn;
    }

    /**
     * <p>
     * The certificate Amazon Resource Name (ARN) for the changed custom domain association.
     * </p>
     * 
     * @param customDomainCertificateArn
     *        The certificate Amazon Resource Name (ARN) for the changed custom domain association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDomainAssociationRequest withCustomDomainCertificateArn(String customDomainCertificateArn) {
        setCustomDomainCertificateArn(customDomainCertificateArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster to change a custom domain association for.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster to change a custom domain association for.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster to change a custom domain association for.
     * </p>
     * 
     * @return The identifier of the cluster to change a custom domain association for.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster to change a custom domain association for.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster to change a custom domain association for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDomainAssociationRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
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
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCustomDomainAssociationRequest == false)
            return false;
        ModifyCustomDomainAssociationRequest other = (ModifyCustomDomainAssociationRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomDomainName() == null) ? 0 : getCustomDomainName().hashCode());
        hashCode = prime * hashCode + ((getCustomDomainCertificateArn() == null) ? 0 : getCustomDomainCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ModifyCustomDomainAssociationRequest clone() {
        return (ModifyCustomDomainAssociationRequest) super.clone();
    }

}
