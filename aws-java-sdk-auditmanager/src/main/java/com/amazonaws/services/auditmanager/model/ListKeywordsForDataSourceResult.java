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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListKeywordsForDataSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKeywordsForDataSourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of keywords for the specified event mapping source.
     * </p>
     */
    private java.util.List<String> keywords;
    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of keywords for the specified event mapping source.
     * </p>
     * 
     * @return The list of keywords for the specified event mapping source.
     */

    public java.util.List<String> getKeywords() {
        return keywords;
    }

    /**
     * <p>
     * The list of keywords for the specified event mapping source.
     * </p>
     * 
     * @param keywords
     *        The list of keywords for the specified event mapping source.
     */

    public void setKeywords(java.util.Collection<String> keywords) {
        if (keywords == null) {
            this.keywords = null;
            return;
        }

        this.keywords = new java.util.ArrayList<String>(keywords);
    }

    /**
     * <p>
     * The list of keywords for the specified event mapping source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeywords(java.util.Collection)} or {@link #withKeywords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param keywords
     *        The list of keywords for the specified event mapping source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeywordsForDataSourceResult withKeywords(String... keywords) {
        if (this.keywords == null) {
            setKeywords(new java.util.ArrayList<String>(keywords.length));
        }
        for (String ele : keywords) {
            this.keywords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of keywords for the specified event mapping source.
     * </p>
     * 
     * @param keywords
     *        The list of keywords for the specified event mapping source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeywordsForDataSourceResult withKeywords(java.util.Collection<String> keywords) {
        setKeywords(keywords);
        return this;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @return The pagination token used to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeywordsForDataSourceResult withNextToken(String nextToken) {
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
        if (getKeywords() != null)
            sb.append("Keywords: ").append(getKeywords()).append(",");
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

        if (obj instanceof ListKeywordsForDataSourceResult == false)
            return false;
        ListKeywordsForDataSourceResult other = (ListKeywordsForDataSourceResult) obj;
        if (other.getKeywords() == null ^ this.getKeywords() == null)
            return false;
        if (other.getKeywords() != null && other.getKeywords().equals(this.getKeywords()) == false)
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

        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListKeywordsForDataSourceResult clone() {
        try {
            return (ListKeywordsForDataSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
