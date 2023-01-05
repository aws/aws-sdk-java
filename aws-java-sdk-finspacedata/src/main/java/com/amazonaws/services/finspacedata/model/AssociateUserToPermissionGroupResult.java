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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/AssociateUserToPermissionGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateUserToPermissionGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The returned status code of the response.
     * </p>
     */
    private Integer statusCode;

    /**
     * <p>
     * The returned status code of the response.
     * </p>
     * 
     * @param statusCode
     *        The returned status code of the response.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The returned status code of the response.
     * </p>
     * 
     * @return The returned status code of the response.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The returned status code of the response.
     * </p>
     * 
     * @param statusCode
     *        The returned status code of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateUserToPermissionGroupResult withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateUserToPermissionGroupResult == false)
            return false;
        AssociateUserToPermissionGroupResult other = (AssociateUserToPermissionGroupResult) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public AssociateUserToPermissionGroupResult clone() {
        try {
            return (AssociateUserToPermissionGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
