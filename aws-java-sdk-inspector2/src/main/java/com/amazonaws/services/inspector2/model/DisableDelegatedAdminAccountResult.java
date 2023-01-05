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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DisableDelegatedAdminAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableDelegatedAdminAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID of the successfully disabled delegated administrator.
     * </p>
     */
    private String delegatedAdminAccountId;

    /**
     * <p>
     * The Amazon Web Services account ID of the successfully disabled delegated administrator.
     * </p>
     * 
     * @param delegatedAdminAccountId
     *        The Amazon Web Services account ID of the successfully disabled delegated administrator.
     */

    public void setDelegatedAdminAccountId(String delegatedAdminAccountId) {
        this.delegatedAdminAccountId = delegatedAdminAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the successfully disabled delegated administrator.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the successfully disabled delegated administrator.
     */

    public String getDelegatedAdminAccountId() {
        return this.delegatedAdminAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the successfully disabled delegated administrator.
     * </p>
     * 
     * @param delegatedAdminAccountId
     *        The Amazon Web Services account ID of the successfully disabled delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableDelegatedAdminAccountResult withDelegatedAdminAccountId(String delegatedAdminAccountId) {
        setDelegatedAdminAccountId(delegatedAdminAccountId);
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
        if (getDelegatedAdminAccountId() != null)
            sb.append("DelegatedAdminAccountId: ").append(getDelegatedAdminAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableDelegatedAdminAccountResult == false)
            return false;
        DisableDelegatedAdminAccountResult other = (DisableDelegatedAdminAccountResult) obj;
        if (other.getDelegatedAdminAccountId() == null ^ this.getDelegatedAdminAccountId() == null)
            return false;
        if (other.getDelegatedAdminAccountId() != null && other.getDelegatedAdminAccountId().equals(this.getDelegatedAdminAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDelegatedAdminAccountId() == null) ? 0 : getDelegatedAdminAccountId().hashCode());
        return hashCode;
    }

    @Override
    public DisableDelegatedAdminAccountResult clone() {
        try {
            return (DisableDelegatedAdminAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
