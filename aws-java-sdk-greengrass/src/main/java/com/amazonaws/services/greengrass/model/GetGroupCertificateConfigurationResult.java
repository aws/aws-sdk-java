/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupCertificateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupCertificateConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /** Amount of time when the certificate authority expires in milliseconds. */
    private String certificateAuthorityExpiryInMilliseconds;
    /** Amount of time when the certificate expires in milliseconds. */
    private String certificateExpiryInMilliseconds;
    /** Id of the group the certificate configuration belongs to. */
    private String groupId;

    /**
     * Amount of time when the certificate authority expires in milliseconds.
     * 
     * @param certificateAuthorityExpiryInMilliseconds
     *        Amount of time when the certificate authority expires in milliseconds.
     */

    public void setCertificateAuthorityExpiryInMilliseconds(String certificateAuthorityExpiryInMilliseconds) {
        this.certificateAuthorityExpiryInMilliseconds = certificateAuthorityExpiryInMilliseconds;
    }

    /**
     * Amount of time when the certificate authority expires in milliseconds.
     * 
     * @return Amount of time when the certificate authority expires in milliseconds.
     */

    public String getCertificateAuthorityExpiryInMilliseconds() {
        return this.certificateAuthorityExpiryInMilliseconds;
    }

    /**
     * Amount of time when the certificate authority expires in milliseconds.
     * 
     * @param certificateAuthorityExpiryInMilliseconds
     *        Amount of time when the certificate authority expires in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupCertificateConfigurationResult withCertificateAuthorityExpiryInMilliseconds(String certificateAuthorityExpiryInMilliseconds) {
        setCertificateAuthorityExpiryInMilliseconds(certificateAuthorityExpiryInMilliseconds);
        return this;
    }

    /**
     * Amount of time when the certificate expires in milliseconds.
     * 
     * @param certificateExpiryInMilliseconds
     *        Amount of time when the certificate expires in milliseconds.
     */

    public void setCertificateExpiryInMilliseconds(String certificateExpiryInMilliseconds) {
        this.certificateExpiryInMilliseconds = certificateExpiryInMilliseconds;
    }

    /**
     * Amount of time when the certificate expires in milliseconds.
     * 
     * @return Amount of time when the certificate expires in milliseconds.
     */

    public String getCertificateExpiryInMilliseconds() {
        return this.certificateExpiryInMilliseconds;
    }

    /**
     * Amount of time when the certificate expires in milliseconds.
     * 
     * @param certificateExpiryInMilliseconds
     *        Amount of time when the certificate expires in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupCertificateConfigurationResult withCertificateExpiryInMilliseconds(String certificateExpiryInMilliseconds) {
        setCertificateExpiryInMilliseconds(certificateExpiryInMilliseconds);
        return this;
    }

    /**
     * Id of the group the certificate configuration belongs to.
     * 
     * @param groupId
     *        Id of the group the certificate configuration belongs to.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * Id of the group the certificate configuration belongs to.
     * 
     * @return Id of the group the certificate configuration belongs to.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Id of the group the certificate configuration belongs to.
     * 
     * @param groupId
     *        Id of the group the certificate configuration belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupCertificateConfigurationResult withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificateAuthorityExpiryInMilliseconds() != null)
            sb.append("CertificateAuthorityExpiryInMilliseconds: ").append(getCertificateAuthorityExpiryInMilliseconds()).append(",");
        if (getCertificateExpiryInMilliseconds() != null)
            sb.append("CertificateExpiryInMilliseconds: ").append(getCertificateExpiryInMilliseconds()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupCertificateConfigurationResult == false)
            return false;
        GetGroupCertificateConfigurationResult other = (GetGroupCertificateConfigurationResult) obj;
        if (other.getCertificateAuthorityExpiryInMilliseconds() == null ^ this.getCertificateAuthorityExpiryInMilliseconds() == null)
            return false;
        if (other.getCertificateAuthorityExpiryInMilliseconds() != null
                && other.getCertificateAuthorityExpiryInMilliseconds().equals(this.getCertificateAuthorityExpiryInMilliseconds()) == false)
            return false;
        if (other.getCertificateExpiryInMilliseconds() == null ^ this.getCertificateExpiryInMilliseconds() == null)
            return false;
        if (other.getCertificateExpiryInMilliseconds() != null
                && other.getCertificateExpiryInMilliseconds().equals(this.getCertificateExpiryInMilliseconds()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityExpiryInMilliseconds() == null) ? 0 : getCertificateAuthorityExpiryInMilliseconds().hashCode());
        hashCode = prime * hashCode + ((getCertificateExpiryInMilliseconds() == null) ? 0 : getCertificateExpiryInMilliseconds().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupCertificateConfigurationResult clone() {
        try {
            return (GetGroupCertificateConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
