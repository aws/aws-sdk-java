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
 * <p>
 * A cluster ID and custom domain name tied to a specific certificate. These are typically returned in a list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CertificateAssociation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The custom domain name for the certificate association.
     * </p>
     */
    private String customDomainName;
    /**
     * <p>
     * The cluster identifier for the certificate association.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The custom domain name for the certificate association.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name for the certificate association.
     */

    public void setCustomDomainName(String customDomainName) {
        this.customDomainName = customDomainName;
    }

    /**
     * <p>
     * The custom domain name for the certificate association.
     * </p>
     * 
     * @return The custom domain name for the certificate association.
     */

    public String getCustomDomainName() {
        return this.customDomainName;
    }

    /**
     * <p>
     * The custom domain name for the certificate association.
     * </p>
     * 
     * @param customDomainName
     *        The custom domain name for the certificate association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAssociation withCustomDomainName(String customDomainName) {
        setCustomDomainName(customDomainName);
        return this;
    }

    /**
     * <p>
     * The cluster identifier for the certificate association.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier for the certificate association.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier for the certificate association.
     * </p>
     * 
     * @return The cluster identifier for the certificate association.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier for the certificate association.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier for the certificate association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateAssociation withClusterIdentifier(String clusterIdentifier) {
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

        if (obj instanceof CertificateAssociation == false)
            return false;
        CertificateAssociation other = (CertificateAssociation) obj;
        if (other.getCustomDomainName() == null ^ this.getCustomDomainName() == null)
            return false;
        if (other.getCustomDomainName() != null && other.getCustomDomainName().equals(this.getCustomDomainName()) == false)
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
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public CertificateAssociation clone() {
        try {
            return (CertificateAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
