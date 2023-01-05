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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListCrls" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCrlsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of certificate revocation lists (CRL).
     * </p>
     */
    private java.util.List<CrlDetail> crls;
    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of certificate revocation lists (CRL).
     * </p>
     * 
     * @return A list of certificate revocation lists (CRL).
     */

    public java.util.List<CrlDetail> getCrls() {
        return crls;
    }

    /**
     * <p>
     * A list of certificate revocation lists (CRL).
     * </p>
     * 
     * @param crls
     *        A list of certificate revocation lists (CRL).
     */

    public void setCrls(java.util.Collection<CrlDetail> crls) {
        if (crls == null) {
            this.crls = null;
            return;
        }

        this.crls = new java.util.ArrayList<CrlDetail>(crls);
    }

    /**
     * <p>
     * A list of certificate revocation lists (CRL).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrls(java.util.Collection)} or {@link #withCrls(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param crls
     *        A list of certificate revocation lists (CRL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrlsResult withCrls(CrlDetail... crls) {
        if (this.crls == null) {
            setCrls(new java.util.ArrayList<CrlDetail>(crls.length));
        }
        for (CrlDetail ele : crls) {
            this.crls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of certificate revocation lists (CRL).
     * </p>
     * 
     * @param crls
     *        A list of certificate revocation lists (CRL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrlsResult withCrls(java.util.Collection<CrlDetail> crls) {
        setCrls(crls);
        return this;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous operation did not show all
     *        results. To get the next results, call the operation again with this value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @return A token that indicates where the output should continue from, if a previous operation did not show all
     *         results. To get the next results, call the operation again with this value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous operation did not show all
     *        results. To get the next results, call the operation again with this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrlsResult withNextToken(String nextToken) {
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
        if (getCrls() != null)
            sb.append("Crls: ").append(getCrls()).append(",");
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

        if (obj instanceof ListCrlsResult == false)
            return false;
        ListCrlsResult other = (ListCrlsResult) obj;
        if (other.getCrls() == null ^ this.getCrls() == null)
            return false;
        if (other.getCrls() != null && other.getCrls().equals(this.getCrls()) == false)
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

        hashCode = prime * hashCode + ((getCrls() == null) ? 0 : getCrls().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCrlsResult clone() {
        try {
            return (ListCrlsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
