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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListAssociationVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssociationVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about all versions of the association for the specified association ID.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AssociationVersionInfo> associationVersions;
    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about all versions of the association for the specified association ID.
     * </p>
     * 
     * @return Information about all versions of the association for the specified association ID.
     */

    public java.util.List<AssociationVersionInfo> getAssociationVersions() {
        if (associationVersions == null) {
            associationVersions = new com.amazonaws.internal.SdkInternalList<AssociationVersionInfo>();
        }
        return associationVersions;
    }

    /**
     * <p>
     * Information about all versions of the association for the specified association ID.
     * </p>
     * 
     * @param associationVersions
     *        Information about all versions of the association for the specified association ID.
     */

    public void setAssociationVersions(java.util.Collection<AssociationVersionInfo> associationVersions) {
        if (associationVersions == null) {
            this.associationVersions = null;
            return;
        }

        this.associationVersions = new com.amazonaws.internal.SdkInternalList<AssociationVersionInfo>(associationVersions);
    }

    /**
     * <p>
     * Information about all versions of the association for the specified association ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociationVersions(java.util.Collection)} or {@link #withAssociationVersions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param associationVersions
     *        Information about all versions of the association for the specified association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationVersionsResult withAssociationVersions(AssociationVersionInfo... associationVersions) {
        if (this.associationVersions == null) {
            setAssociationVersions(new com.amazonaws.internal.SdkInternalList<AssociationVersionInfo>(associationVersions.length));
        }
        for (AssociationVersionInfo ele : associationVersions) {
            this.associationVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about all versions of the association for the specified association ID.
     * </p>
     * 
     * @param associationVersions
     *        Information about all versions of the association for the specified association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationVersionsResult withAssociationVersions(java.util.Collection<AssociationVersionInfo> associationVersions) {
        setAssociationVersions(associationVersions);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @return The token for the next set of items to return. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationVersionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAssociationVersions() != null)
            sb.append("AssociationVersions: ").append(getAssociationVersions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssociationVersionsResult == false)
            return false;
        ListAssociationVersionsResult other = (ListAssociationVersionsResult) obj;
        if (other.getAssociationVersions() == null ^ this.getAssociationVersions() == null)
            return false;
        if (other.getAssociationVersions() != null && other.getAssociationVersions().equals(this.getAssociationVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationVersions() == null) ? 0 : getAssociationVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssociationVersionsResult clone() {
        try {
            return (ListAssociationVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
