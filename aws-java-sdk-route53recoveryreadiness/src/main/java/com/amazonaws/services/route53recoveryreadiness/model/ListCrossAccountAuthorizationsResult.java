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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCrossAccountAuthorizations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCrossAccountAuthorizationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of cross-account authorizations.
     * </p>
     */
    private java.util.List<String> crossAccountAuthorizations;
    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of cross-account authorizations.
     * </p>
     * 
     * @return A list of cross-account authorizations.
     */

    public java.util.List<String> getCrossAccountAuthorizations() {
        return crossAccountAuthorizations;
    }

    /**
     * <p>
     * A list of cross-account authorizations.
     * </p>
     * 
     * @param crossAccountAuthorizations
     *        A list of cross-account authorizations.
     */

    public void setCrossAccountAuthorizations(java.util.Collection<String> crossAccountAuthorizations) {
        if (crossAccountAuthorizations == null) {
            this.crossAccountAuthorizations = null;
            return;
        }

        this.crossAccountAuthorizations = new java.util.ArrayList<String>(crossAccountAuthorizations);
    }

    /**
     * <p>
     * A list of cross-account authorizations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrossAccountAuthorizations(java.util.Collection)} or
     * {@link #withCrossAccountAuthorizations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param crossAccountAuthorizations
     *        A list of cross-account authorizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrossAccountAuthorizationsResult withCrossAccountAuthorizations(String... crossAccountAuthorizations) {
        if (this.crossAccountAuthorizations == null) {
            setCrossAccountAuthorizations(new java.util.ArrayList<String>(crossAccountAuthorizations.length));
        }
        for (String ele : crossAccountAuthorizations) {
            this.crossAccountAuthorizations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cross-account authorizations.
     * </p>
     * 
     * @param crossAccountAuthorizations
     *        A list of cross-account authorizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrossAccountAuthorizationsResult withCrossAccountAuthorizations(java.util.Collection<String> crossAccountAuthorizations) {
        setCrossAccountAuthorizations(crossAccountAuthorizations);
        return this;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @return The token that identifies which batch of results you want to see.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrossAccountAuthorizationsResult withNextToken(String nextToken) {
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
        if (getCrossAccountAuthorizations() != null)
            sb.append("CrossAccountAuthorizations: ").append(getCrossAccountAuthorizations()).append(",");
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

        if (obj instanceof ListCrossAccountAuthorizationsResult == false)
            return false;
        ListCrossAccountAuthorizationsResult other = (ListCrossAccountAuthorizationsResult) obj;
        if (other.getCrossAccountAuthorizations() == null ^ this.getCrossAccountAuthorizations() == null)
            return false;
        if (other.getCrossAccountAuthorizations() != null && other.getCrossAccountAuthorizations().equals(this.getCrossAccountAuthorizations()) == false)
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

        hashCode = prime * hashCode + ((getCrossAccountAuthorizations() == null) ? 0 : getCrossAccountAuthorizations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCrossAccountAuthorizationsResult clone() {
        try {
            return (ListCrossAccountAuthorizationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
