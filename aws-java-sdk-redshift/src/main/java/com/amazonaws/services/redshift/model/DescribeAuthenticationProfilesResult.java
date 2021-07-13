/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeAuthenticationProfiles"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAuthenticationProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of authentication profiles.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AuthenticationProfile> authenticationProfiles;

    /**
     * <p>
     * The list of authentication profiles.
     * </p>
     * 
     * @return The list of authentication profiles.
     */

    public java.util.List<AuthenticationProfile> getAuthenticationProfiles() {
        if (authenticationProfiles == null) {
            authenticationProfiles = new com.amazonaws.internal.SdkInternalList<AuthenticationProfile>();
        }
        return authenticationProfiles;
    }

    /**
     * <p>
     * The list of authentication profiles.
     * </p>
     * 
     * @param authenticationProfiles
     *        The list of authentication profiles.
     */

    public void setAuthenticationProfiles(java.util.Collection<AuthenticationProfile> authenticationProfiles) {
        if (authenticationProfiles == null) {
            this.authenticationProfiles = null;
            return;
        }

        this.authenticationProfiles = new com.amazonaws.internal.SdkInternalList<AuthenticationProfile>(authenticationProfiles);
    }

    /**
     * <p>
     * The list of authentication profiles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthenticationProfiles(java.util.Collection)} or
     * {@link #withAuthenticationProfiles(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param authenticationProfiles
     *        The list of authentication profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuthenticationProfilesResult withAuthenticationProfiles(AuthenticationProfile... authenticationProfiles) {
        if (this.authenticationProfiles == null) {
            setAuthenticationProfiles(new com.amazonaws.internal.SdkInternalList<AuthenticationProfile>(authenticationProfiles.length));
        }
        for (AuthenticationProfile ele : authenticationProfiles) {
            this.authenticationProfiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of authentication profiles.
     * </p>
     * 
     * @param authenticationProfiles
     *        The list of authentication profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuthenticationProfilesResult withAuthenticationProfiles(java.util.Collection<AuthenticationProfile> authenticationProfiles) {
        setAuthenticationProfiles(authenticationProfiles);
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
        if (getAuthenticationProfiles() != null)
            sb.append("AuthenticationProfiles: ").append(getAuthenticationProfiles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAuthenticationProfilesResult == false)
            return false;
        DescribeAuthenticationProfilesResult other = (DescribeAuthenticationProfilesResult) obj;
        if (other.getAuthenticationProfiles() == null ^ this.getAuthenticationProfiles() == null)
            return false;
        if (other.getAuthenticationProfiles() != null && other.getAuthenticationProfiles().equals(this.getAuthenticationProfiles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationProfiles() == null) ? 0 : getAuthenticationProfiles().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAuthenticationProfilesResult clone() {
        try {
            return (DescribeAuthenticationProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
