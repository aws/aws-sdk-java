/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListMetadataTransferJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMetadataTransferJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata transfer job's source type.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The metadata transfer job's destination type.
     * </p>
     */
    private String destinationType;
    /**
     * <p>
     * An object that filters metadata transfer jobs.
     * </p>
     */
    private java.util.List<ListMetadataTransferJobsFilter> filters;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The metadata transfer job's source type.
     * </p>
     * 
     * @param sourceType
     *        The metadata transfer job's source type.
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The metadata transfer job's source type.
     * </p>
     * 
     * @return The metadata transfer job's source type.
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The metadata transfer job's source type.
     * </p>
     * 
     * @param sourceType
     *        The metadata transfer job's source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ListMetadataTransferJobsRequest withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job's source type.
     * </p>
     * 
     * @param sourceType
     *        The metadata transfer job's source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ListMetadataTransferJobsRequest withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The metadata transfer job's destination type.
     * </p>
     * 
     * @param destinationType
     *        The metadata transfer job's destination type.
     * @see DestinationType
     */

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * <p>
     * The metadata transfer job's destination type.
     * </p>
     * 
     * @return The metadata transfer job's destination type.
     * @see DestinationType
     */

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * <p>
     * The metadata transfer job's destination type.
     * </p>
     * 
     * @param destinationType
     *        The metadata transfer job's destination type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public ListMetadataTransferJobsRequest withDestinationType(String destinationType) {
        setDestinationType(destinationType);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job's destination type.
     * </p>
     * 
     * @param destinationType
     *        The metadata transfer job's destination type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public ListMetadataTransferJobsRequest withDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType.toString();
        return this;
    }

    /**
     * <p>
     * An object that filters metadata transfer jobs.
     * </p>
     * 
     * @return An object that filters metadata transfer jobs.
     */

    public java.util.List<ListMetadataTransferJobsFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An object that filters metadata transfer jobs.
     * </p>
     * 
     * @param filters
     *        An object that filters metadata transfer jobs.
     */

    public void setFilters(java.util.Collection<ListMetadataTransferJobsFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ListMetadataTransferJobsFilter>(filters);
    }

    /**
     * <p>
     * An object that filters metadata transfer jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An object that filters metadata transfer jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataTransferJobsRequest withFilters(ListMetadataTransferJobsFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ListMetadataTransferJobsFilter>(filters.length));
        }
        for (ListMetadataTransferJobsFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that filters metadata transfer jobs.
     * </p>
     * 
     * @param filters
     *        An object that filters metadata transfer jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataTransferJobsRequest withFilters(java.util.Collection<ListMetadataTransferJobsFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @return The string that specifies the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataTransferJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @return The maximum number of results to return at one time.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataTransferJobsRequest withMaxResults(Integer maxResults) {
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
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getDestinationType() != null)
            sb.append("DestinationType: ").append(getDestinationType()).append(",");
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

        if (obj instanceof ListMetadataTransferJobsRequest == false)
            return false;
        ListMetadataTransferJobsRequest other = (ListMetadataTransferJobsRequest) obj;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null && other.getDestinationType().equals(this.getDestinationType()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListMetadataTransferJobsRequest clone() {
        return (ListMetadataTransferJobsRequest) super.clone();
    }

}
