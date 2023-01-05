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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetDelegatedAdminAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDelegatedAdminAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     * </p>
     */
    private DelegatedAdmin delegatedAdmin;

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param delegatedAdmin
     *        The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     */

    public void setDelegatedAdmin(DelegatedAdmin delegatedAdmin) {
        this.delegatedAdmin = delegatedAdmin;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     */

    public DelegatedAdmin getDelegatedAdmin() {
        return this.delegatedAdmin;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param delegatedAdmin
     *        The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDelegatedAdminAccountResult withDelegatedAdmin(DelegatedAdmin delegatedAdmin) {
        setDelegatedAdmin(delegatedAdmin);
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
        if (getDelegatedAdmin() != null)
            sb.append("DelegatedAdmin: ").append(getDelegatedAdmin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDelegatedAdminAccountResult == false)
            return false;
        GetDelegatedAdminAccountResult other = (GetDelegatedAdminAccountResult) obj;
        if (other.getDelegatedAdmin() == null ^ this.getDelegatedAdmin() == null)
            return false;
        if (other.getDelegatedAdmin() != null && other.getDelegatedAdmin().equals(this.getDelegatedAdmin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDelegatedAdmin() == null) ? 0 : getDelegatedAdmin().hashCode());
        return hashCode;
    }

    @Override
    public GetDelegatedAdminAccountResult clone() {
        try {
            return (GetDelegatedAdminAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
