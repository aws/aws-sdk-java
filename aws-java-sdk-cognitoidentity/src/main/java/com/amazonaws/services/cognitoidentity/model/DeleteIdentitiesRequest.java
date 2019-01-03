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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the <code>DeleteIdentities</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DeleteIdentities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIdentitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of 1-60 identities that you want to delete.
     * </p>
     */
    private java.util.List<String> identityIdsToDelete;

    /**
     * <p>
     * A list of 1-60 identities that you want to delete.
     * </p>
     * 
     * @return A list of 1-60 identities that you want to delete.
     */

    public java.util.List<String> getIdentityIdsToDelete() {
        return identityIdsToDelete;
    }

    /**
     * <p>
     * A list of 1-60 identities that you want to delete.
     * </p>
     * 
     * @param identityIdsToDelete
     *        A list of 1-60 identities that you want to delete.
     */

    public void setIdentityIdsToDelete(java.util.Collection<String> identityIdsToDelete) {
        if (identityIdsToDelete == null) {
            this.identityIdsToDelete = null;
            return;
        }

        this.identityIdsToDelete = new java.util.ArrayList<String>(identityIdsToDelete);
    }

    /**
     * <p>
     * A list of 1-60 identities that you want to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityIdsToDelete(java.util.Collection)} or {@link #withIdentityIdsToDelete(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param identityIdsToDelete
     *        A list of 1-60 identities that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIdentitiesRequest withIdentityIdsToDelete(String... identityIdsToDelete) {
        if (this.identityIdsToDelete == null) {
            setIdentityIdsToDelete(new java.util.ArrayList<String>(identityIdsToDelete.length));
        }
        for (String ele : identityIdsToDelete) {
            this.identityIdsToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of 1-60 identities that you want to delete.
     * </p>
     * 
     * @param identityIdsToDelete
     *        A list of 1-60 identities that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIdentitiesRequest withIdentityIdsToDelete(java.util.Collection<String> identityIdsToDelete) {
        setIdentityIdsToDelete(identityIdsToDelete);
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
        if (getIdentityIdsToDelete() != null)
            sb.append("IdentityIdsToDelete: ").append(getIdentityIdsToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIdentitiesRequest == false)
            return false;
        DeleteIdentitiesRequest other = (DeleteIdentitiesRequest) obj;
        if (other.getIdentityIdsToDelete() == null ^ this.getIdentityIdsToDelete() == null)
            return false;
        if (other.getIdentityIdsToDelete() != null && other.getIdentityIdsToDelete().equals(this.getIdentityIdsToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityIdsToDelete() == null) ? 0 : getIdentityIdsToDelete().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIdentitiesRequest clone() {
        return (DeleteIdentitiesRequest) super.clone();
    }

}
