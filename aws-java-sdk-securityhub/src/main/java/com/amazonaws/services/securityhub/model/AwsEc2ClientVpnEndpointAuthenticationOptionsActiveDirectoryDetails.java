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
 * Provides details about an Active Directory that’s used to authenticate an Client VPN endpoint.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Active Directory used for authentication.
     * </p>
     */
    private String directoryId;

    /**
     * <p>
     * The ID of the Active Directory used for authentication.
     * </p>
     * 
     * @param directoryId
     *        The ID of the Active Directory used for authentication.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The ID of the Active Directory used for authentication.
     * </p>
     * 
     * @return The ID of the Active Directory used for authentication.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The ID of the Active Directory used for authentication.
     * </p>
     * 
     * @param directoryId
     *        The ID of the Active Directory used for authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetails withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetails == false)
            return false;
        AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetails other = (AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetails) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetails clone() {
        try {
            return (AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetailsMarshaller.getInstance().marshall(
                this, protocolMarshaller);
    }
}
