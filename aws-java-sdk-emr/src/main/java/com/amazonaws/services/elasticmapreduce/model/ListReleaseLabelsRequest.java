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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListReleaseLabels" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReleaseLabelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the results of the request. <code>Prefix</code> specifies the prefix of release labels to return.
     * <code>Application</code> specifies the application (with/without version) of release labels to return.
     * </p>
     */
    private ReleaseLabelFilter filters;
    /**
     * <p>
     * Specifies the next page of results. If <code>NextToken</code> is not specified, which is usually the case for the
     * first request of ListReleaseLabels, the first page of results are determined by other filtering parameters or by
     * the latest version. The <code>ListReleaseLabels</code> request fails if the identity (Amazon Web Services account
     * ID) and all filtering parameters are different from the original request, or if the <code>NextToken</code> is
     * expired or tampered with.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Defines the maximum number of release labels to return in a single response. The default is <code>100</code>.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Filters the results of the request. <code>Prefix</code> specifies the prefix of release labels to return.
     * <code>Application</code> specifies the application (with/without version) of release labels to return.
     * </p>
     * 
     * @param filters
     *        Filters the results of the request. <code>Prefix</code> specifies the prefix of release labels to return.
     *        <code>Application</code> specifies the application (with/without version) of release labels to return.
     */

    public void setFilters(ReleaseLabelFilter filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Filters the results of the request. <code>Prefix</code> specifies the prefix of release labels to return.
     * <code>Application</code> specifies the application (with/without version) of release labels to return.
     * </p>
     * 
     * @return Filters the results of the request. <code>Prefix</code> specifies the prefix of release labels to return.
     *         <code>Application</code> specifies the application (with/without version) of release labels to return.
     */

    public ReleaseLabelFilter getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * Filters the results of the request. <code>Prefix</code> specifies the prefix of release labels to return.
     * <code>Application</code> specifies the application (with/without version) of release labels to return.
     * </p>
     * 
     * @param filters
     *        Filters the results of the request. <code>Prefix</code> specifies the prefix of release labels to return.
     *        <code>Application</code> specifies the application (with/without version) of release labels to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReleaseLabelsRequest withFilters(ReleaseLabelFilter filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Specifies the next page of results. If <code>NextToken</code> is not specified, which is usually the case for the
     * first request of ListReleaseLabels, the first page of results are determined by other filtering parameters or by
     * the latest version. The <code>ListReleaseLabels</code> request fails if the identity (Amazon Web Services account
     * ID) and all filtering parameters are different from the original request, or if the <code>NextToken</code> is
     * expired or tampered with.
     * </p>
     * 
     * @param nextToken
     *        Specifies the next page of results. If <code>NextToken</code> is not specified, which is usually the case
     *        for the first request of ListReleaseLabels, the first page of results are determined by other filtering
     *        parameters or by the latest version. The <code>ListReleaseLabels</code> request fails if the identity
     *        (Amazon Web Services account ID) and all filtering parameters are different from the original request, or
     *        if the <code>NextToken</code> is expired or tampered with.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies the next page of results. If <code>NextToken</code> is not specified, which is usually the case for the
     * first request of ListReleaseLabels, the first page of results are determined by other filtering parameters or by
     * the latest version. The <code>ListReleaseLabels</code> request fails if the identity (Amazon Web Services account
     * ID) and all filtering parameters are different from the original request, or if the <code>NextToken</code> is
     * expired or tampered with.
     * </p>
     * 
     * @return Specifies the next page of results. If <code>NextToken</code> is not specified, which is usually the case
     *         for the first request of ListReleaseLabels, the first page of results are determined by other filtering
     *         parameters or by the latest version. The <code>ListReleaseLabels</code> request fails if the identity
     *         (Amazon Web Services account ID) and all filtering parameters are different from the original request, or
     *         if the <code>NextToken</code> is expired or tampered with.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies the next page of results. If <code>NextToken</code> is not specified, which is usually the case for the
     * first request of ListReleaseLabels, the first page of results are determined by other filtering parameters or by
     * the latest version. The <code>ListReleaseLabels</code> request fails if the identity (Amazon Web Services account
     * ID) and all filtering parameters are different from the original request, or if the <code>NextToken</code> is
     * expired or tampered with.
     * </p>
     * 
     * @param nextToken
     *        Specifies the next page of results. If <code>NextToken</code> is not specified, which is usually the case
     *        for the first request of ListReleaseLabels, the first page of results are determined by other filtering
     *        parameters or by the latest version. The <code>ListReleaseLabels</code> request fails if the identity
     *        (Amazon Web Services account ID) and all filtering parameters are different from the original request, or
     *        if the <code>NextToken</code> is expired or tampered with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReleaseLabelsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Defines the maximum number of release labels to return in a single response. The default is <code>100</code>.
     * </p>
     * 
     * @param maxResults
     *        Defines the maximum number of release labels to return in a single response. The default is
     *        <code>100</code>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Defines the maximum number of release labels to return in a single response. The default is <code>100</code>.
     * </p>
     * 
     * @return Defines the maximum number of release labels to return in a single response. The default is
     *         <code>100</code>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Defines the maximum number of release labels to return in a single response. The default is <code>100</code>.
     * </p>
     * 
     * @param maxResults
     *        Defines the maximum number of release labels to return in a single response. The default is
     *        <code>100</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReleaseLabelsRequest withMaxResults(Integer maxResults) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof ListReleaseLabelsRequest == false)
            return false;
        ListReleaseLabelsRequest other = (ListReleaseLabelsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListReleaseLabelsRequest clone() {
        return (ListReleaseLabelsRequest) super.clone();
    }

}
