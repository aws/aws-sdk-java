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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateGroupCertificateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGroupCertificateConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The amount of time remaining before the certificate expires, in milliseconds. */
    private String certificateExpiryInMilliseconds;
    /** The ID of the Greengrass group. */
    private String groupId;

    /**
     * The amount of time remaining before the certificate expires, in milliseconds.
     * 
     * @param certificateExpiryInMilliseconds
     *        The amount of time remaining before the certificate expires, in milliseconds.
     */

    public void setCertificateExpiryInMilliseconds(String certificateExpiryInMilliseconds) {
        this.certificateExpiryInMilliseconds = certificateExpiryInMilliseconds;
    }

    /**
     * The amount of time remaining before the certificate expires, in milliseconds.
     * 
     * @return The amount of time remaining before the certificate expires, in milliseconds.
     */

    public String getCertificateExpiryInMilliseconds() {
        return this.certificateExpiryInMilliseconds;
    }

    /**
     * The amount of time remaining before the certificate expires, in milliseconds.
     * 
     * @param certificateExpiryInMilliseconds
     *        The amount of time remaining before the certificate expires, in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupCertificateConfigurationRequest withCertificateExpiryInMilliseconds(String certificateExpiryInMilliseconds) {
        setCertificateExpiryInMilliseconds(certificateExpiryInMilliseconds);
        return this;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @param groupId
     *        The ID of the Greengrass group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @return The ID of the Greengrass group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @param groupId
     *        The ID of the Greengrass group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupCertificateConfigurationRequest withGroupId(String groupId) {
        setGroupId(groupId);
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

        if (obj instanceof UpdateGroupCertificateConfigurationRequest == false)
            return false;
        UpdateGroupCertificateConfigurationRequest other = (UpdateGroupCertificateConfigurationRequest) obj;
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

        hashCode = prime * hashCode + ((getCertificateExpiryInMilliseconds() == null) ? 0 : getCertificateExpiryInMilliseconds().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGroupCertificateConfigurationRequest clone() {
        return (UpdateGroupCertificateConfigurationRequest) super.clone();
    }

}
