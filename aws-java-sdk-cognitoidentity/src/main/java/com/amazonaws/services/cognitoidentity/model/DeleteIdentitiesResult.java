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

/**
 * <p>
 * Returned in response to a successful <code>DeleteIdentities</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/DeleteIdentities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIdentitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
     * </p>
     */
    private java.util.List<UnprocessedIdentityId> unprocessedIdentityIds;

    /**
     * <p>
     * An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
     * </p>
     * 
     * @return An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
     */

    public java.util.List<UnprocessedIdentityId> getUnprocessedIdentityIds() {
        return unprocessedIdentityIds;
    }

    /**
     * <p>
     * An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
     * </p>
     * 
     * @param unprocessedIdentityIds
     *        An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
     */

    public void setUnprocessedIdentityIds(java.util.Collection<UnprocessedIdentityId> unprocessedIdentityIds) {
        if (unprocessedIdentityIds == null) {
            this.unprocessedIdentityIds = null;
            return;
        }

        this.unprocessedIdentityIds = new java.util.ArrayList<UnprocessedIdentityId>(unprocessedIdentityIds);
    }

    /**
     * <p>
     * An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedIdentityIds(java.util.Collection)} or
     * {@link #withUnprocessedIdentityIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedIdentityIds
     *        An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIdentitiesResult withUnprocessedIdentityIds(UnprocessedIdentityId... unprocessedIdentityIds) {
        if (this.unprocessedIdentityIds == null) {
            setUnprocessedIdentityIds(new java.util.ArrayList<UnprocessedIdentityId>(unprocessedIdentityIds.length));
        }
        for (UnprocessedIdentityId ele : unprocessedIdentityIds) {
            this.unprocessedIdentityIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
     * </p>
     * 
     * @param unprocessedIdentityIds
     *        An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIdentitiesResult withUnprocessedIdentityIds(java.util.Collection<UnprocessedIdentityId> unprocessedIdentityIds) {
        setUnprocessedIdentityIds(unprocessedIdentityIds);
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
        if (getUnprocessedIdentityIds() != null)
            sb.append("UnprocessedIdentityIds: ").append(getUnprocessedIdentityIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIdentitiesResult == false)
            return false;
        DeleteIdentitiesResult other = (DeleteIdentitiesResult) obj;
        if (other.getUnprocessedIdentityIds() == null ^ this.getUnprocessedIdentityIds() == null)
            return false;
        if (other.getUnprocessedIdentityIds() != null && other.getUnprocessedIdentityIds().equals(this.getUnprocessedIdentityIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnprocessedIdentityIds() == null) ? 0 : getUnprocessedIdentityIds().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIdentitiesResult clone() {
        try {
            return (DeleteIdentitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
