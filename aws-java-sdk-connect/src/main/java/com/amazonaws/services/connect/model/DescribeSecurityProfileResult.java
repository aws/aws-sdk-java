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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeSecurityProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSecurityProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The security profile.
     * </p>
     */
    private SecurityProfile securityProfile;

    /**
     * <p>
     * The security profile.
     * </p>
     * 
     * @param securityProfile
     *        The security profile.
     */

    public void setSecurityProfile(SecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
    }

    /**
     * <p>
     * The security profile.
     * </p>
     * 
     * @return The security profile.
     */

    public SecurityProfile getSecurityProfile() {
        return this.securityProfile;
    }

    /**
     * <p>
     * The security profile.
     * </p>
     * 
     * @param securityProfile
     *        The security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityProfileResult withSecurityProfile(SecurityProfile securityProfile) {
        setSecurityProfile(securityProfile);
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
        if (getSecurityProfile() != null)
            sb.append("SecurityProfile: ").append(getSecurityProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSecurityProfileResult == false)
            return false;
        DescribeSecurityProfileResult other = (DescribeSecurityProfileResult) obj;
        if (other.getSecurityProfile() == null ^ this.getSecurityProfile() == null)
            return false;
        if (other.getSecurityProfile() != null && other.getSecurityProfile().equals(this.getSecurityProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityProfile() == null) ? 0 : getSecurityProfile().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSecurityProfileResult clone() {
        try {
            return (DescribeSecurityProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
