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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPrincipals" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPrincipalsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that contain the details about the principals.
     * </p>
     */
    private java.util.List<Principal> principals;
    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that contain the details about the principals.
     * </p>
     * 
     * @return An array of objects that contain the details about the principals.
     */

    public java.util.List<Principal> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * An array of objects that contain the details about the principals.
     * </p>
     * 
     * @param principals
     *        An array of objects that contain the details about the principals.
     */

    public void setPrincipals(java.util.Collection<Principal> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<Principal>(principals);
    }

    /**
     * <p>
     * An array of objects that contain the details about the principals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        An array of objects that contain the details about the principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrincipalsResult withPrincipals(Principal... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<Principal>(principals.length));
        }
        for (Principal ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that contain the details about the principals.
     * </p>
     * 
     * @param principals
     *        An array of objects that contain the details about the principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrincipalsResult withPrincipals(java.util.Collection<Principal> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that more output is available than is included in the current response.
     *        Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *        get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *        comes back as <code>null</code>. This indicates that this is the last page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @return If present, this value indicates that more output is available than is included in the current response.
     *         Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *         get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *         comes back as <code>null</code>. This indicates that this is the last page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that more output is available than is included in the current response.
     *        Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *        get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *        comes back as <code>null</code>. This indicates that this is the last page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrincipalsResult withNextToken(String nextToken) {
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
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
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

        if (obj instanceof ListPrincipalsResult == false)
            return false;
        ListPrincipalsResult other = (ListPrincipalsResult) obj;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
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

        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPrincipalsResult clone() {
        try {
            return (ListPrincipalsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
