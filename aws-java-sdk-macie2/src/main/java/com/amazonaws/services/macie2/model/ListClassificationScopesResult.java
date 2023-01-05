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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListClassificationScopes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClassificationScopesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array that specifies the unique identifier and name of the classification scope for the account.
     * </p>
     */
    private java.util.List<ClassificationScopeSummary> classificationScopes;
    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array that specifies the unique identifier and name of the classification scope for the account.
     * </p>
     * 
     * @return An array that specifies the unique identifier and name of the classification scope for the account.
     */

    public java.util.List<ClassificationScopeSummary> getClassificationScopes() {
        return classificationScopes;
    }

    /**
     * <p>
     * An array that specifies the unique identifier and name of the classification scope for the account.
     * </p>
     * 
     * @param classificationScopes
     *        An array that specifies the unique identifier and name of the classification scope for the account.
     */

    public void setClassificationScopes(java.util.Collection<ClassificationScopeSummary> classificationScopes) {
        if (classificationScopes == null) {
            this.classificationScopes = null;
            return;
        }

        this.classificationScopes = new java.util.ArrayList<ClassificationScopeSummary>(classificationScopes);
    }

    /**
     * <p>
     * An array that specifies the unique identifier and name of the classification scope for the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClassificationScopes(java.util.Collection)} or {@link #withClassificationScopes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param classificationScopes
     *        An array that specifies the unique identifier and name of the classification scope for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClassificationScopesResult withClassificationScopes(ClassificationScopeSummary... classificationScopes) {
        if (this.classificationScopes == null) {
            setClassificationScopes(new java.util.ArrayList<ClassificationScopeSummary>(classificationScopes.length));
        }
        for (ClassificationScopeSummary ele : classificationScopes) {
            this.classificationScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that specifies the unique identifier and name of the classification scope for the account.
     * </p>
     * 
     * @param classificationScopes
     *        An array that specifies the unique identifier and name of the classification scope for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClassificationScopesResult withClassificationScopes(java.util.Collection<ClassificationScopeSummary> classificationScopes) {
        setClassificationScopes(classificationScopes);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @return The string to use in a subsequent request to get the next page of results in a paginated response. This
     *         value is null if there are no additional pages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClassificationScopesResult withNextToken(String nextToken) {
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
        if (getClassificationScopes() != null)
            sb.append("ClassificationScopes: ").append(getClassificationScopes()).append(",");
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

        if (obj instanceof ListClassificationScopesResult == false)
            return false;
        ListClassificationScopesResult other = (ListClassificationScopesResult) obj;
        if (other.getClassificationScopes() == null ^ this.getClassificationScopes() == null)
            return false;
        if (other.getClassificationScopes() != null && other.getClassificationScopes().equals(this.getClassificationScopes()) == false)
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

        hashCode = prime * hashCode + ((getClassificationScopes() == null) ? 0 : getClassificationScopes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListClassificationScopesResult clone() {
        try {
            return (ListClassificationScopesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
