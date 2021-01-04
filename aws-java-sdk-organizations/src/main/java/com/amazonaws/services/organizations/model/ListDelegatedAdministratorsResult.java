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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListDelegatedAdministrators"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDelegatedAdministratorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of delegated administrators in your organization.
     * </p>
     */
    private java.util.List<DelegatedAdministrator> delegatedAdministrators;
    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of delegated administrators in your organization.
     * </p>
     * 
     * @return The list of delegated administrators in your organization.
     */

    public java.util.List<DelegatedAdministrator> getDelegatedAdministrators() {
        return delegatedAdministrators;
    }

    /**
     * <p>
     * The list of delegated administrators in your organization.
     * </p>
     * 
     * @param delegatedAdministrators
     *        The list of delegated administrators in your organization.
     */

    public void setDelegatedAdministrators(java.util.Collection<DelegatedAdministrator> delegatedAdministrators) {
        if (delegatedAdministrators == null) {
            this.delegatedAdministrators = null;
            return;
        }

        this.delegatedAdministrators = new java.util.ArrayList<DelegatedAdministrator>(delegatedAdministrators);
    }

    /**
     * <p>
     * The list of delegated administrators in your organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDelegatedAdministrators(java.util.Collection)} or
     * {@link #withDelegatedAdministrators(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param delegatedAdministrators
     *        The list of delegated administrators in your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDelegatedAdministratorsResult withDelegatedAdministrators(DelegatedAdministrator... delegatedAdministrators) {
        if (this.delegatedAdministrators == null) {
            setDelegatedAdministrators(new java.util.ArrayList<DelegatedAdministrator>(delegatedAdministrators.length));
        }
        for (DelegatedAdministrator ele : delegatedAdministrators) {
            this.delegatedAdministrators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of delegated administrators in your organization.
     * </p>
     * 
     * @param delegatedAdministrators
     *        The list of delegated administrators in your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDelegatedAdministratorsResult withDelegatedAdministrators(java.util.Collection<DelegatedAdministrator> delegatedAdministrators) {
        setDelegatedAdministrators(delegatedAdministrators);
        return this;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, indicates that more output is available than is included in the current response. Use this
     *        value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *        next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *        back as <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @return If present, indicates that more output is available than is included in the current response. Use this
     *         value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *         next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *         back as <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, indicates that more output is available than is included in the current response. Use this
     *        value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *        next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *        back as <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDelegatedAdministratorsResult withNextToken(String nextToken) {
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
        if (getDelegatedAdministrators() != null)
            sb.append("DelegatedAdministrators: ").append(getDelegatedAdministrators()).append(",");
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

        if (obj instanceof ListDelegatedAdministratorsResult == false)
            return false;
        ListDelegatedAdministratorsResult other = (ListDelegatedAdministratorsResult) obj;
        if (other.getDelegatedAdministrators() == null ^ this.getDelegatedAdministrators() == null)
            return false;
        if (other.getDelegatedAdministrators() != null && other.getDelegatedAdministrators().equals(this.getDelegatedAdministrators()) == false)
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

        hashCode = prime * hashCode + ((getDelegatedAdministrators() == null) ? 0 : getDelegatedAdministrators().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDelegatedAdministratorsResult clone() {
        try {
            return (ListDelegatedAdministratorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
