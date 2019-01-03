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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupCertificateAuthority"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupCertificateAuthorityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The ARN of the certificate authority for the group. */
    private String groupCertificateAuthorityArn;
    /** The ID of the certificate authority for the group. */
    private String groupCertificateAuthorityId;
    /** The PEM encoded certificate for the group. */
    private String pemEncodedCertificate;

    /**
     * The ARN of the certificate authority for the group.
     * 
     * @param groupCertificateAuthorityArn
     *        The ARN of the certificate authority for the group.
     */

    public void setGroupCertificateAuthorityArn(String groupCertificateAuthorityArn) {
        this.groupCertificateAuthorityArn = groupCertificateAuthorityArn;
    }

    /**
     * The ARN of the certificate authority for the group.
     * 
     * @return The ARN of the certificate authority for the group.
     */

    public String getGroupCertificateAuthorityArn() {
        return this.groupCertificateAuthorityArn;
    }

    /**
     * The ARN of the certificate authority for the group.
     * 
     * @param groupCertificateAuthorityArn
     *        The ARN of the certificate authority for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupCertificateAuthorityResult withGroupCertificateAuthorityArn(String groupCertificateAuthorityArn) {
        setGroupCertificateAuthorityArn(groupCertificateAuthorityArn);
        return this;
    }

    /**
     * The ID of the certificate authority for the group.
     * 
     * @param groupCertificateAuthorityId
     *        The ID of the certificate authority for the group.
     */

    public void setGroupCertificateAuthorityId(String groupCertificateAuthorityId) {
        this.groupCertificateAuthorityId = groupCertificateAuthorityId;
    }

    /**
     * The ID of the certificate authority for the group.
     * 
     * @return The ID of the certificate authority for the group.
     */

    public String getGroupCertificateAuthorityId() {
        return this.groupCertificateAuthorityId;
    }

    /**
     * The ID of the certificate authority for the group.
     * 
     * @param groupCertificateAuthorityId
     *        The ID of the certificate authority for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupCertificateAuthorityResult withGroupCertificateAuthorityId(String groupCertificateAuthorityId) {
        setGroupCertificateAuthorityId(groupCertificateAuthorityId);
        return this;
    }

    /**
     * The PEM encoded certificate for the group.
     * 
     * @param pemEncodedCertificate
     *        The PEM encoded certificate for the group.
     */

    public void setPemEncodedCertificate(String pemEncodedCertificate) {
        this.pemEncodedCertificate = pemEncodedCertificate;
    }

    /**
     * The PEM encoded certificate for the group.
     * 
     * @return The PEM encoded certificate for the group.
     */

    public String getPemEncodedCertificate() {
        return this.pemEncodedCertificate;
    }

    /**
     * The PEM encoded certificate for the group.
     * 
     * @param pemEncodedCertificate
     *        The PEM encoded certificate for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupCertificateAuthorityResult withPemEncodedCertificate(String pemEncodedCertificate) {
        setPemEncodedCertificate(pemEncodedCertificate);
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
        if (getGroupCertificateAuthorityArn() != null)
            sb.append("GroupCertificateAuthorityArn: ").append(getGroupCertificateAuthorityArn()).append(",");
        if (getGroupCertificateAuthorityId() != null)
            sb.append("GroupCertificateAuthorityId: ").append(getGroupCertificateAuthorityId()).append(",");
        if (getPemEncodedCertificate() != null)
            sb.append("PemEncodedCertificate: ").append(getPemEncodedCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupCertificateAuthorityResult == false)
            return false;
        GetGroupCertificateAuthorityResult other = (GetGroupCertificateAuthorityResult) obj;
        if (other.getGroupCertificateAuthorityArn() == null ^ this.getGroupCertificateAuthorityArn() == null)
            return false;
        if (other.getGroupCertificateAuthorityArn() != null && other.getGroupCertificateAuthorityArn().equals(this.getGroupCertificateAuthorityArn()) == false)
            return false;
        if (other.getGroupCertificateAuthorityId() == null ^ this.getGroupCertificateAuthorityId() == null)
            return false;
        if (other.getGroupCertificateAuthorityId() != null && other.getGroupCertificateAuthorityId().equals(this.getGroupCertificateAuthorityId()) == false)
            return false;
        if (other.getPemEncodedCertificate() == null ^ this.getPemEncodedCertificate() == null)
            return false;
        if (other.getPemEncodedCertificate() != null && other.getPemEncodedCertificate().equals(this.getPemEncodedCertificate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupCertificateAuthorityArn() == null) ? 0 : getGroupCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getGroupCertificateAuthorityId() == null) ? 0 : getGroupCertificateAuthorityId().hashCode());
        hashCode = prime * hashCode + ((getPemEncodedCertificate() == null) ? 0 : getPemEncodedCertificate().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupCertificateAuthorityResult clone() {
        try {
            return (GetGroupCertificateAuthorityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
