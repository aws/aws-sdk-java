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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide
 * encryption keys.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/SpekeKeyProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpekeKeyProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * An Amazon Resource Name (ARN) of a Certificate Manager certificate that MediaPackage will use for enforcing
     * secure end-to-end data transfer with the key provider service.
     */
    private String certificateArn;
    /** The resource ID to include in key requests. */
    private String resourceId;
    /**
     * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental MediaPackage will assume when accessing the key
     * provider service.
     */
    private String roleArn;
    /** The system IDs to include in key requests. */
    private java.util.List<String> systemIds;
    /** The URL of the external key provider service. */
    private String url;

    /**
     * An Amazon Resource Name (ARN) of a Certificate Manager certificate that MediaPackage will use for enforcing
     * secure end-to-end data transfer with the key provider service.
     * 
     * @param certificateArn
     *        An Amazon Resource Name (ARN) of a Certificate Manager certificate that MediaPackage will use for
     *        enforcing secure end-to-end data transfer with the key provider service.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * An Amazon Resource Name (ARN) of a Certificate Manager certificate that MediaPackage will use for enforcing
     * secure end-to-end data transfer with the key provider service.
     * 
     * @return An Amazon Resource Name (ARN) of a Certificate Manager certificate that MediaPackage will use for
     *         enforcing secure end-to-end data transfer with the key provider service.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * An Amazon Resource Name (ARN) of a Certificate Manager certificate that MediaPackage will use for enforcing
     * secure end-to-end data transfer with the key provider service.
     * 
     * @param certificateArn
     *        An Amazon Resource Name (ARN) of a Certificate Manager certificate that MediaPackage will use for
     *        enforcing secure end-to-end data transfer with the key provider service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * The resource ID to include in key requests.
     * 
     * @param resourceId
     *        The resource ID to include in key requests.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * The resource ID to include in key requests.
     * 
     * @return The resource ID to include in key requests.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * The resource ID to include in key requests.
     * 
     * @param resourceId
     *        The resource ID to include in key requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental MediaPackage will assume when accessing the key
     * provider service.
     * 
     * @param roleArn
     *        An Amazon Resource Name (ARN) of an IAM role that AWS Elemental MediaPackage will assume when accessing
     *        the key provider service.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental MediaPackage will assume when accessing the key
     * provider service.
     * 
     * @return An Amazon Resource Name (ARN) of an IAM role that AWS Elemental MediaPackage will assume when accessing
     *         the key provider service.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental MediaPackage will assume when accessing the key
     * provider service.
     * 
     * @param roleArn
     *        An Amazon Resource Name (ARN) of an IAM role that AWS Elemental MediaPackage will assume when accessing
     *        the key provider service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * The system IDs to include in key requests.
     * 
     * @return The system IDs to include in key requests.
     */

    public java.util.List<String> getSystemIds() {
        return systemIds;
    }

    /**
     * The system IDs to include in key requests.
     * 
     * @param systemIds
     *        The system IDs to include in key requests.
     */

    public void setSystemIds(java.util.Collection<String> systemIds) {
        if (systemIds == null) {
            this.systemIds = null;
            return;
        }

        this.systemIds = new java.util.ArrayList<String>(systemIds);
    }

    /**
     * The system IDs to include in key requests.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSystemIds(java.util.Collection)} or {@link #withSystemIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param systemIds
     *        The system IDs to include in key requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withSystemIds(String... systemIds) {
        if (this.systemIds == null) {
            setSystemIds(new java.util.ArrayList<String>(systemIds.length));
        }
        for (String ele : systemIds) {
            this.systemIds.add(ele);
        }
        return this;
    }

    /**
     * The system IDs to include in key requests.
     * 
     * @param systemIds
     *        The system IDs to include in key requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withSystemIds(java.util.Collection<String> systemIds) {
        setSystemIds(systemIds);
        return this;
    }

    /**
     * The URL of the external key provider service.
     * 
     * @param url
     *        The URL of the external key provider service.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The URL of the external key provider service.
     * 
     * @return The URL of the external key provider service.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * The URL of the external key provider service.
     * 
     * @param url
     *        The URL of the external key provider service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withUrl(String url) {
        setUrl(url);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSystemIds() != null)
            sb.append("SystemIds: ").append(getSystemIds()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpekeKeyProvider == false)
            return false;
        SpekeKeyProvider other = (SpekeKeyProvider) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSystemIds() == null ^ this.getSystemIds() == null)
            return false;
        if (other.getSystemIds() != null && other.getSystemIds().equals(this.getSystemIds()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSystemIds() == null) ? 0 : getSystemIds().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public SpekeKeyProvider clone() {
        try {
            return (SpekeKeyProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackage.model.transform.SpekeKeyProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
