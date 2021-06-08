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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListDelegatedServicesForAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDelegatedServicesForAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The services for which the account is a delegated administrator.
     * </p>
     */
    private java.util.List<DelegatedService> delegatedServices;
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
     * The services for which the account is a delegated administrator.
     * </p>
     * 
     * @return The services for which the account is a delegated administrator.
     */

    public java.util.List<DelegatedService> getDelegatedServices() {
        return delegatedServices;
    }

    /**
     * <p>
     * The services for which the account is a delegated administrator.
     * </p>
     * 
     * @param delegatedServices
     *        The services for which the account is a delegated administrator.
     */

    public void setDelegatedServices(java.util.Collection<DelegatedService> delegatedServices) {
        if (delegatedServices == null) {
            this.delegatedServices = null;
            return;
        }

        this.delegatedServices = new java.util.ArrayList<DelegatedService>(delegatedServices);
    }

    /**
     * <p>
     * The services for which the account is a delegated administrator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDelegatedServices(java.util.Collection)} or {@link #withDelegatedServices(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param delegatedServices
     *        The services for which the account is a delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDelegatedServicesForAccountResult withDelegatedServices(DelegatedService... delegatedServices) {
        if (this.delegatedServices == null) {
            setDelegatedServices(new java.util.ArrayList<DelegatedService>(delegatedServices.length));
        }
        for (DelegatedService ele : delegatedServices) {
            this.delegatedServices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The services for which the account is a delegated administrator.
     * </p>
     * 
     * @param delegatedServices
     *        The services for which the account is a delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDelegatedServicesForAccountResult withDelegatedServices(java.util.Collection<DelegatedService> delegatedServices) {
        setDelegatedServices(delegatedServices);
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

    public ListDelegatedServicesForAccountResult withNextToken(String nextToken) {
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
        if (getDelegatedServices() != null)
            sb.append("DelegatedServices: ").append(getDelegatedServices()).append(",");
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

        if (obj instanceof ListDelegatedServicesForAccountResult == false)
            return false;
        ListDelegatedServicesForAccountResult other = (ListDelegatedServicesForAccountResult) obj;
        if (other.getDelegatedServices() == null ^ this.getDelegatedServices() == null)
            return false;
        if (other.getDelegatedServices() != null && other.getDelegatedServices().equals(this.getDelegatedServices()) == false)
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

        hashCode = prime * hashCode + ((getDelegatedServices() == null) ? 0 : getDelegatedServices().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDelegatedServicesForAccountResult clone() {
        try {
            return (ListDelegatedServicesForAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
