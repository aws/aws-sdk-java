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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListManagedPoliciesInPermissionSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListManagedPoliciesInPermissionSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The array of the <a>AttachedManagedPolicy</a> data type object.
     * </p>
     */
    private java.util.List<AttachedManagedPolicy> attachedManagedPolicies;
    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The array of the <a>AttachedManagedPolicy</a> data type object.
     * </p>
     * 
     * @return The array of the <a>AttachedManagedPolicy</a> data type object.
     */

    public java.util.List<AttachedManagedPolicy> getAttachedManagedPolicies() {
        return attachedManagedPolicies;
    }

    /**
     * <p>
     * The array of the <a>AttachedManagedPolicy</a> data type object.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        The array of the <a>AttachedManagedPolicy</a> data type object.
     */

    public void setAttachedManagedPolicies(java.util.Collection<AttachedManagedPolicy> attachedManagedPolicies) {
        if (attachedManagedPolicies == null) {
            this.attachedManagedPolicies = null;
            return;
        }

        this.attachedManagedPolicies = new java.util.ArrayList<AttachedManagedPolicy>(attachedManagedPolicies);
    }

    /**
     * <p>
     * The array of the <a>AttachedManagedPolicy</a> data type object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachedManagedPolicies(java.util.Collection)} or
     * {@link #withAttachedManagedPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        The array of the <a>AttachedManagedPolicy</a> data type object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedPoliciesInPermissionSetResult withAttachedManagedPolicies(AttachedManagedPolicy... attachedManagedPolicies) {
        if (this.attachedManagedPolicies == null) {
            setAttachedManagedPolicies(new java.util.ArrayList<AttachedManagedPolicy>(attachedManagedPolicies.length));
        }
        for (AttachedManagedPolicy ele : attachedManagedPolicies) {
            this.attachedManagedPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of the <a>AttachedManagedPolicy</a> data type object.
     * </p>
     * 
     * @param attachedManagedPolicies
     *        The array of the <a>AttachedManagedPolicy</a> data type object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedPoliciesInPermissionSetResult withAttachedManagedPolicies(java.util.Collection<AttachedManagedPolicy> attachedManagedPolicies) {
        setAttachedManagedPolicies(attachedManagedPolicies);
        return this;
    }

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the list API. Initially the value is null. Use the output of previous API calls
     *        to make subsequent calls.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     * 
     * @return The pagination token for the list API. Initially the value is null. Use the output of previous API calls
     *         to make subsequent calls.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the list API. Initially the value is null. Use the output of previous API calls
     *        to make subsequent calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedPoliciesInPermissionSetResult withNextToken(String nextToken) {
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
        if (getAttachedManagedPolicies() != null)
            sb.append("AttachedManagedPolicies: ").append(getAttachedManagedPolicies()).append(",");
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

        if (obj instanceof ListManagedPoliciesInPermissionSetResult == false)
            return false;
        ListManagedPoliciesInPermissionSetResult other = (ListManagedPoliciesInPermissionSetResult) obj;
        if (other.getAttachedManagedPolicies() == null ^ this.getAttachedManagedPolicies() == null)
            return false;
        if (other.getAttachedManagedPolicies() != null && other.getAttachedManagedPolicies().equals(this.getAttachedManagedPolicies()) == false)
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

        hashCode = prime * hashCode + ((getAttachedManagedPolicies() == null) ? 0 : getAttachedManagedPolicies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListManagedPoliciesInPermissionSetResult clone() {
        try {
            return (ListManagedPoliciesInPermissionSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
