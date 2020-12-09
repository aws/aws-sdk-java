/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListKeywordsForDataSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKeywordsForDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The control mapping data source to which the keywords apply.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The pagination token used to fetch the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Represents the maximum number of results per page, or per API request call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The control mapping data source to which the keywords apply.
     * </p>
     * 
     * @param source
     *        The control mapping data source to which the keywords apply.
     * @see SourceType
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The control mapping data source to which the keywords apply.
     * </p>
     * 
     * @return The control mapping data source to which the keywords apply.
     * @see SourceType
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The control mapping data source to which the keywords apply.
     * </p>
     * 
     * @param source
     *        The control mapping data source to which the keywords apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ListKeywordsForDataSourceRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The control mapping data source to which the keywords apply.
     * </p>
     * 
     * @param source
     *        The control mapping data source to which the keywords apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ListKeywordsForDataSourceRequest withSource(SourceType source) {
        this.source = source.toString();
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

    public ListKeywordsForDataSourceRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Represents the maximum number of results per page, or per API request call.
     * </p>
     * 
     * @param maxResults
     *        Represents the maximum number of results per page, or per API request call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Represents the maximum number of results per page, or per API request call.
     * </p>
     * 
     * @return Represents the maximum number of results per page, or per API request call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Represents the maximum number of results per page, or per API request call.
     * </p>
     * 
     * @param maxResults
     *        Represents the maximum number of results per page, or per API request call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeywordsForDataSourceRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKeywordsForDataSourceRequest == false)
            return false;
        ListKeywordsForDataSourceRequest other = (ListKeywordsForDataSourceRequest) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListKeywordsForDataSourceRequest clone() {
        return (ListKeywordsForDataSourceRequest) super.clone();
    }

}
