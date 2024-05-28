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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details for client authentication using TLS.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsMskClusterClusterInfoClientAuthenticationTlsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsMskClusterClusterInfoClientAuthenticationTlsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of Amazon Web Services Private CA Amazon Resource Names (ARNs). Amazon Web Services Private CA enables
     * creation of private certificate authority (CA) hierarchies, including root and subordinate CAs, without the
     * investment and maintenance costs of operating an on-premises CA.
     * </p>
     */
    private java.util.List<String> certificateAuthorityArnList;
    /**
     * <p>
     * Indicates whether TLS authentication is enabled or not.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * List of Amazon Web Services Private CA Amazon Resource Names (ARNs). Amazon Web Services Private CA enables
     * creation of private certificate authority (CA) hierarchies, including root and subordinate CAs, without the
     * investment and maintenance costs of operating an on-premises CA.
     * </p>
     * 
     * @return List of Amazon Web Services Private CA Amazon Resource Names (ARNs). Amazon Web Services Private CA
     *         enables creation of private certificate authority (CA) hierarchies, including root and subordinate CAs,
     *         without the investment and maintenance costs of operating an on-premises CA.
     */

    public java.util.List<String> getCertificateAuthorityArnList() {
        return certificateAuthorityArnList;
    }

    /**
     * <p>
     * List of Amazon Web Services Private CA Amazon Resource Names (ARNs). Amazon Web Services Private CA enables
     * creation of private certificate authority (CA) hierarchies, including root and subordinate CAs, without the
     * investment and maintenance costs of operating an on-premises CA.
     * </p>
     * 
     * @param certificateAuthorityArnList
     *        List of Amazon Web Services Private CA Amazon Resource Names (ARNs). Amazon Web Services Private CA
     *        enables creation of private certificate authority (CA) hierarchies, including root and subordinate CAs,
     *        without the investment and maintenance costs of operating an on-premises CA.
     */

    public void setCertificateAuthorityArnList(java.util.Collection<String> certificateAuthorityArnList) {
        if (certificateAuthorityArnList == null) {
            this.certificateAuthorityArnList = null;
            return;
        }

        this.certificateAuthorityArnList = new java.util.ArrayList<String>(certificateAuthorityArnList);
    }

    /**
     * <p>
     * List of Amazon Web Services Private CA Amazon Resource Names (ARNs). Amazon Web Services Private CA enables
     * creation of private certificate authority (CA) hierarchies, including root and subordinate CAs, without the
     * investment and maintenance costs of operating an on-premises CA.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateAuthorityArnList(java.util.Collection)} or
     * {@link #withCertificateAuthorityArnList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param certificateAuthorityArnList
     *        List of Amazon Web Services Private CA Amazon Resource Names (ARNs). Amazon Web Services Private CA
     *        enables creation of private certificate authority (CA) hierarchies, including root and subordinate CAs,
     *        without the investment and maintenance costs of operating an on-premises CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoClientAuthenticationTlsDetails withCertificateAuthorityArnList(String... certificateAuthorityArnList) {
        if (this.certificateAuthorityArnList == null) {
            setCertificateAuthorityArnList(new java.util.ArrayList<String>(certificateAuthorityArnList.length));
        }
        for (String ele : certificateAuthorityArnList) {
            this.certificateAuthorityArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Amazon Web Services Private CA Amazon Resource Names (ARNs). Amazon Web Services Private CA enables
     * creation of private certificate authority (CA) hierarchies, including root and subordinate CAs, without the
     * investment and maintenance costs of operating an on-premises CA.
     * </p>
     * 
     * @param certificateAuthorityArnList
     *        List of Amazon Web Services Private CA Amazon Resource Names (ARNs). Amazon Web Services Private CA
     *        enables creation of private certificate authority (CA) hierarchies, including root and subordinate CAs,
     *        without the investment and maintenance costs of operating an on-premises CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoClientAuthenticationTlsDetails withCertificateAuthorityArnList(java.util.Collection<String> certificateAuthorityArnList) {
        setCertificateAuthorityArnList(certificateAuthorityArnList);
        return this;
    }

    /**
     * <p>
     * Indicates whether TLS authentication is enabled or not.
     * </p>
     * 
     * @param enabled
     *        Indicates whether TLS authentication is enabled or not.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether TLS authentication is enabled or not.
     * </p>
     * 
     * @return Indicates whether TLS authentication is enabled or not.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether TLS authentication is enabled or not.
     * </p>
     * 
     * @param enabled
     *        Indicates whether TLS authentication is enabled or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoClientAuthenticationTlsDetails withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether TLS authentication is enabled or not.
     * </p>
     * 
     * @return Indicates whether TLS authentication is enabled or not.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getCertificateAuthorityArnList() != null)
            sb.append("CertificateAuthorityArnList: ").append(getCertificateAuthorityArnList()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsMskClusterClusterInfoClientAuthenticationTlsDetails == false)
            return false;
        AwsMskClusterClusterInfoClientAuthenticationTlsDetails other = (AwsMskClusterClusterInfoClientAuthenticationTlsDetails) obj;
        if (other.getCertificateAuthorityArnList() == null ^ this.getCertificateAuthorityArnList() == null)
            return false;
        if (other.getCertificateAuthorityArnList() != null && other.getCertificateAuthorityArnList().equals(this.getCertificateAuthorityArnList()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArnList() == null) ? 0 : getCertificateAuthorityArnList().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public AwsMskClusterClusterInfoClientAuthenticationTlsDetails clone() {
        try {
            return (AwsMskClusterClusterInfoClientAuthenticationTlsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsMskClusterClusterInfoClientAuthenticationTlsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
