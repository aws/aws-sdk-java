/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyCertificateBasedAuthProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCertificateBasedAuthPropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The resource identifiers, in the form of directory IDs.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The properties of the certificate-based authentication.
     * </p>
     */
    private CertificateBasedAuthProperties certificateBasedAuthProperties;
    /**
     * <p>
     * The properties of the certificate-based authentication you want to delete.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> propertiesToDelete;

    /**
     * <p>
     * The resource identifiers, in the form of directory IDs.
     * </p>
     * 
     * @param resourceId
     *        The resource identifiers, in the form of directory IDs.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource identifiers, in the form of directory IDs.
     * </p>
     * 
     * @return The resource identifiers, in the form of directory IDs.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource identifiers, in the form of directory IDs.
     * </p>
     * 
     * @param resourceId
     *        The resource identifiers, in the form of directory IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCertificateBasedAuthPropertiesRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The properties of the certificate-based authentication.
     * </p>
     * 
     * @param certificateBasedAuthProperties
     *        The properties of the certificate-based authentication.
     */

    public void setCertificateBasedAuthProperties(CertificateBasedAuthProperties certificateBasedAuthProperties) {
        this.certificateBasedAuthProperties = certificateBasedAuthProperties;
    }

    /**
     * <p>
     * The properties of the certificate-based authentication.
     * </p>
     * 
     * @return The properties of the certificate-based authentication.
     */

    public CertificateBasedAuthProperties getCertificateBasedAuthProperties() {
        return this.certificateBasedAuthProperties;
    }

    /**
     * <p>
     * The properties of the certificate-based authentication.
     * </p>
     * 
     * @param certificateBasedAuthProperties
     *        The properties of the certificate-based authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCertificateBasedAuthPropertiesRequest withCertificateBasedAuthProperties(CertificateBasedAuthProperties certificateBasedAuthProperties) {
        setCertificateBasedAuthProperties(certificateBasedAuthProperties);
        return this;
    }

    /**
     * <p>
     * The properties of the certificate-based authentication you want to delete.
     * </p>
     * 
     * @return The properties of the certificate-based authentication you want to delete.
     * @see DeletableCertificateBasedAuthProperty
     */

    public java.util.List<String> getPropertiesToDelete() {
        if (propertiesToDelete == null) {
            propertiesToDelete = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return propertiesToDelete;
    }

    /**
     * <p>
     * The properties of the certificate-based authentication you want to delete.
     * </p>
     * 
     * @param propertiesToDelete
     *        The properties of the certificate-based authentication you want to delete.
     * @see DeletableCertificateBasedAuthProperty
     */

    public void setPropertiesToDelete(java.util.Collection<String> propertiesToDelete) {
        if (propertiesToDelete == null) {
            this.propertiesToDelete = null;
            return;
        }

        this.propertiesToDelete = new com.amazonaws.internal.SdkInternalList<String>(propertiesToDelete);
    }

    /**
     * <p>
     * The properties of the certificate-based authentication you want to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertiesToDelete(java.util.Collection)} or {@link #withPropertiesToDelete(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param propertiesToDelete
     *        The properties of the certificate-based authentication you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletableCertificateBasedAuthProperty
     */

    public ModifyCertificateBasedAuthPropertiesRequest withPropertiesToDelete(String... propertiesToDelete) {
        if (this.propertiesToDelete == null) {
            setPropertiesToDelete(new com.amazonaws.internal.SdkInternalList<String>(propertiesToDelete.length));
        }
        for (String ele : propertiesToDelete) {
            this.propertiesToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties of the certificate-based authentication you want to delete.
     * </p>
     * 
     * @param propertiesToDelete
     *        The properties of the certificate-based authentication you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletableCertificateBasedAuthProperty
     */

    public ModifyCertificateBasedAuthPropertiesRequest withPropertiesToDelete(java.util.Collection<String> propertiesToDelete) {
        setPropertiesToDelete(propertiesToDelete);
        return this;
    }

    /**
     * <p>
     * The properties of the certificate-based authentication you want to delete.
     * </p>
     * 
     * @param propertiesToDelete
     *        The properties of the certificate-based authentication you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletableCertificateBasedAuthProperty
     */

    public ModifyCertificateBasedAuthPropertiesRequest withPropertiesToDelete(DeletableCertificateBasedAuthProperty... propertiesToDelete) {
        com.amazonaws.internal.SdkInternalList<String> propertiesToDeleteCopy = new com.amazonaws.internal.SdkInternalList<String>(propertiesToDelete.length);
        for (DeletableCertificateBasedAuthProperty value : propertiesToDelete) {
            propertiesToDeleteCopy.add(value.toString());
        }
        if (getPropertiesToDelete() == null) {
            setPropertiesToDelete(propertiesToDeleteCopy);
        } else {
            getPropertiesToDelete().addAll(propertiesToDeleteCopy);
        }
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getCertificateBasedAuthProperties() != null)
            sb.append("CertificateBasedAuthProperties: ").append(getCertificateBasedAuthProperties()).append(",");
        if (getPropertiesToDelete() != null)
            sb.append("PropertiesToDelete: ").append(getPropertiesToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCertificateBasedAuthPropertiesRequest == false)
            return false;
        ModifyCertificateBasedAuthPropertiesRequest other = (ModifyCertificateBasedAuthPropertiesRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getCertificateBasedAuthProperties() == null ^ this.getCertificateBasedAuthProperties() == null)
            return false;
        if (other.getCertificateBasedAuthProperties() != null
                && other.getCertificateBasedAuthProperties().equals(this.getCertificateBasedAuthProperties()) == false)
            return false;
        if (other.getPropertiesToDelete() == null ^ this.getPropertiesToDelete() == null)
            return false;
        if (other.getPropertiesToDelete() != null && other.getPropertiesToDelete().equals(this.getPropertiesToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getCertificateBasedAuthProperties() == null) ? 0 : getCertificateBasedAuthProperties().hashCode());
        hashCode = prime * hashCode + ((getPropertiesToDelete() == null) ? 0 : getPropertiesToDelete().hashCode());
        return hashCode;
    }

    @Override
    public ModifyCertificateBasedAuthPropertiesRequest clone() {
        return (ModifyCertificateBasedAuthPropertiesRequest) super.clone();
    }

}
