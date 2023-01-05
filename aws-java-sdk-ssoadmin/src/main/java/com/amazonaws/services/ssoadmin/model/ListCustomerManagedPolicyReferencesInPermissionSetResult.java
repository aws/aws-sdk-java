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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListCustomerManagedPolicyReferencesInPermissionSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomerManagedPolicyReferencesInPermissionSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Specifies the names and paths of the customer managed policies that you have attached to your permission set.
     * </p>
     */
    private java.util.List<CustomerManagedPolicyReference> customerManagedPolicyReferences;
    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the names and paths of the customer managed policies that you have attached to your permission set.
     * </p>
     * 
     * @return Specifies the names and paths of the customer managed policies that you have attached to your permission
     *         set.
     */

    public java.util.List<CustomerManagedPolicyReference> getCustomerManagedPolicyReferences() {
        return customerManagedPolicyReferences;
    }

    /**
     * <p>
     * Specifies the names and paths of the customer managed policies that you have attached to your permission set.
     * </p>
     * 
     * @param customerManagedPolicyReferences
     *        Specifies the names and paths of the customer managed policies that you have attached to your permission
     *        set.
     */

    public void setCustomerManagedPolicyReferences(java.util.Collection<CustomerManagedPolicyReference> customerManagedPolicyReferences) {
        if (customerManagedPolicyReferences == null) {
            this.customerManagedPolicyReferences = null;
            return;
        }

        this.customerManagedPolicyReferences = new java.util.ArrayList<CustomerManagedPolicyReference>(customerManagedPolicyReferences);
    }

    /**
     * <p>
     * Specifies the names and paths of the customer managed policies that you have attached to your permission set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomerManagedPolicyReferences(java.util.Collection)} or
     * {@link #withCustomerManagedPolicyReferences(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customerManagedPolicyReferences
     *        Specifies the names and paths of the customer managed policies that you have attached to your permission
     *        set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomerManagedPolicyReferencesInPermissionSetResult withCustomerManagedPolicyReferences(
            CustomerManagedPolicyReference... customerManagedPolicyReferences) {
        if (this.customerManagedPolicyReferences == null) {
            setCustomerManagedPolicyReferences(new java.util.ArrayList<CustomerManagedPolicyReference>(customerManagedPolicyReferences.length));
        }
        for (CustomerManagedPolicyReference ele : customerManagedPolicyReferences) {
            this.customerManagedPolicyReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the names and paths of the customer managed policies that you have attached to your permission set.
     * </p>
     * 
     * @param customerManagedPolicyReferences
     *        Specifies the names and paths of the customer managed policies that you have attached to your permission
     *        set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomerManagedPolicyReferencesInPermissionSetResult withCustomerManagedPolicyReferences(
            java.util.Collection<CustomerManagedPolicyReference> customerManagedPolicyReferences) {
        setCustomerManagedPolicyReferences(customerManagedPolicyReferences);
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

    public ListCustomerManagedPolicyReferencesInPermissionSetResult withNextToken(String nextToken) {
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
        if (getCustomerManagedPolicyReferences() != null)
            sb.append("CustomerManagedPolicyReferences: ").append(getCustomerManagedPolicyReferences()).append(",");
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

        if (obj instanceof ListCustomerManagedPolicyReferencesInPermissionSetResult == false)
            return false;
        ListCustomerManagedPolicyReferencesInPermissionSetResult other = (ListCustomerManagedPolicyReferencesInPermissionSetResult) obj;
        if (other.getCustomerManagedPolicyReferences() == null ^ this.getCustomerManagedPolicyReferences() == null)
            return false;
        if (other.getCustomerManagedPolicyReferences() != null
                && other.getCustomerManagedPolicyReferences().equals(this.getCustomerManagedPolicyReferences()) == false)
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

        hashCode = prime * hashCode + ((getCustomerManagedPolicyReferences() == null) ? 0 : getCustomerManagedPolicyReferences().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomerManagedPolicyReferencesInPermissionSetResult clone() {
        try {
            return (ListCustomerManagedPolicyReferencesInPermissionSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
