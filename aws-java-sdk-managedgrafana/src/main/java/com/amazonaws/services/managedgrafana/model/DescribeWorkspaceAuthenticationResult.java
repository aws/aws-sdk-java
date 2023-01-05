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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspaceAuthentication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspaceAuthenticationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A structure containing information about the authentication methods used in the workspace.
     * </p>
     */
    private AuthenticationDescription authentication;

    /**
     * <p>
     * A structure containing information about the authentication methods used in the workspace.
     * </p>
     * 
     * @param authentication
     *        A structure containing information about the authentication methods used in the workspace.
     */

    public void setAuthentication(AuthenticationDescription authentication) {
        this.authentication = authentication;
    }

    /**
     * <p>
     * A structure containing information about the authentication methods used in the workspace.
     * </p>
     * 
     * @return A structure containing information about the authentication methods used in the workspace.
     */

    public AuthenticationDescription getAuthentication() {
        return this.authentication;
    }

    /**
     * <p>
     * A structure containing information about the authentication methods used in the workspace.
     * </p>
     * 
     * @param authentication
     *        A structure containing information about the authentication methods used in the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceAuthenticationResult withAuthentication(AuthenticationDescription authentication) {
        setAuthentication(authentication);
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
        if (getAuthentication() != null)
            sb.append("Authentication: ").append(getAuthentication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkspaceAuthenticationResult == false)
            return false;
        DescribeWorkspaceAuthenticationResult other = (DescribeWorkspaceAuthenticationResult) obj;
        if (other.getAuthentication() == null ^ this.getAuthentication() == null)
            return false;
        if (other.getAuthentication() != null && other.getAuthentication().equals(this.getAuthentication()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspaceAuthenticationResult clone() {
        try {
            return (DescribeWorkspaceAuthenticationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
