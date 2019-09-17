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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/AssociateWebsiteCertificateAuthority"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateWebsiteCertificateAuthorityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A unique identifier for the CA.
     * </p>
     */
    private String websiteCaId;

    /**
     * <p>
     * A unique identifier for the CA.
     * </p>
     * 
     * @param websiteCaId
     *        A unique identifier for the CA.
     */

    public void setWebsiteCaId(String websiteCaId) {
        this.websiteCaId = websiteCaId;
    }

    /**
     * <p>
     * A unique identifier for the CA.
     * </p>
     * 
     * @return A unique identifier for the CA.
     */

    public String getWebsiteCaId() {
        return this.websiteCaId;
    }

    /**
     * <p>
     * A unique identifier for the CA.
     * </p>
     * 
     * @param websiteCaId
     *        A unique identifier for the CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateWebsiteCertificateAuthorityResult withWebsiteCaId(String websiteCaId) {
        setWebsiteCaId(websiteCaId);
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
        if (getWebsiteCaId() != null)
            sb.append("WebsiteCaId: ").append(getWebsiteCaId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateWebsiteCertificateAuthorityResult == false)
            return false;
        AssociateWebsiteCertificateAuthorityResult other = (AssociateWebsiteCertificateAuthorityResult) obj;
        if (other.getWebsiteCaId() == null ^ this.getWebsiteCaId() == null)
            return false;
        if (other.getWebsiteCaId() != null && other.getWebsiteCaId().equals(this.getWebsiteCaId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebsiteCaId() == null) ? 0 : getWebsiteCaId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateWebsiteCertificateAuthorityResult clone() {
        try {
            return (AssociateWebsiteCertificateAuthorityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
