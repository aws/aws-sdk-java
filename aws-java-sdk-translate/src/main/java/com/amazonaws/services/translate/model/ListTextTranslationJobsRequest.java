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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListTextTranslationJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTextTranslationJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The parameters that specify which batch translation jobs to retrieve. Filters include job name, job status, and
     * submission time. You can only set one filter at a time.
     * </p>
     */
    private TextTranslationJobFilter filter;
    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in each page. The default value is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The parameters that specify which batch translation jobs to retrieve. Filters include job name, job status, and
     * submission time. You can only set one filter at a time.
     * </p>
     * 
     * @param filter
     *        The parameters that specify which batch translation jobs to retrieve. Filters include job name, job
     *        status, and submission time. You can only set one filter at a time.
     */

    public void setFilter(TextTranslationJobFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The parameters that specify which batch translation jobs to retrieve. Filters include job name, job status, and
     * submission time. You can only set one filter at a time.
     * </p>
     * 
     * @return The parameters that specify which batch translation jobs to retrieve. Filters include job name, job
     *         status, and submission time. You can only set one filter at a time.
     */

    public TextTranslationJobFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The parameters that specify which batch translation jobs to retrieve. Filters include job name, job status, and
     * submission time. You can only set one filter at a time.
     * </p>
     * 
     * @param filter
     *        The parameters that specify which batch translation jobs to retrieve. Filters include job name, job
     *        status, and submission time. You can only set one filter at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTextTranslationJobsRequest withFilter(TextTranslationJobFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTextTranslationJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in each page. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in each page. The default value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in each page. The default value is 100.
     * </p>
     * 
     * @return The maximum number of results to return in each page. The default value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in each page. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in each page. The default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTextTranslationJobsRequest withMaxResults(Integer maxResults) {
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
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

        if (obj instanceof ListTextTranslationJobsRequest == false)
            return false;
        ListTextTranslationJobsRequest other = (ListTextTranslationJobsRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTextTranslationJobsRequest clone() {
        return (ListTextTranslationJobsRequest) super.clone();
    }

}
