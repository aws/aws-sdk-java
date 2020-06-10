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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/DescribeRecommendationExportJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecommendationExportJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identification numbers of the export jobs to return.
     * </p>
     * <p>
     * An export job ID is returned when you create an export using the
     * <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.
     * </p>
     * <p>
     * All export jobs created in the last seven days are returned if this parameter is omitted.
     * </p>
     */
    private java.util.List<String> jobIds;
    /**
     * <p>
     * An array of objects that describe a filter to return a more specific list of export jobs.
     * </p>
     */
    private java.util.List<JobFilter> filters;
    /**
     * <p>
     * The token to advance to the next page of export jobs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of export jobs to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identification numbers of the export jobs to return.
     * </p>
     * <p>
     * An export job ID is returned when you create an export using the
     * <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.
     * </p>
     * <p>
     * All export jobs created in the last seven days are returned if this parameter is omitted.
     * </p>
     * 
     * @return The identification numbers of the export jobs to return.</p>
     *         <p>
     *         An export job ID is returned when you create an export using the
     *         <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code>
     *         actions.
     *         </p>
     *         <p>
     *         All export jobs created in the last seven days are returned if this parameter is omitted.
     */

    public java.util.List<String> getJobIds() {
        return jobIds;
    }

    /**
     * <p>
     * The identification numbers of the export jobs to return.
     * </p>
     * <p>
     * An export job ID is returned when you create an export using the
     * <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.
     * </p>
     * <p>
     * All export jobs created in the last seven days are returned if this parameter is omitted.
     * </p>
     * 
     * @param jobIds
     *        The identification numbers of the export jobs to return.</p>
     *        <p>
     *        An export job ID is returned when you create an export using the
     *        <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code>
     *        actions.
     *        </p>
     *        <p>
     *        All export jobs created in the last seven days are returned if this parameter is omitted.
     */

    public void setJobIds(java.util.Collection<String> jobIds) {
        if (jobIds == null) {
            this.jobIds = null;
            return;
        }

        this.jobIds = new java.util.ArrayList<String>(jobIds);
    }

    /**
     * <p>
     * The identification numbers of the export jobs to return.
     * </p>
     * <p>
     * An export job ID is returned when you create an export using the
     * <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.
     * </p>
     * <p>
     * All export jobs created in the last seven days are returned if this parameter is omitted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobIds(java.util.Collection)} or {@link #withJobIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobIds
     *        The identification numbers of the export jobs to return.</p>
     *        <p>
     *        An export job ID is returned when you create an export using the
     *        <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code>
     *        actions.
     *        </p>
     *        <p>
     *        All export jobs created in the last seven days are returned if this parameter is omitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecommendationExportJobsRequest withJobIds(String... jobIds) {
        if (this.jobIds == null) {
            setJobIds(new java.util.ArrayList<String>(jobIds.length));
        }
        for (String ele : jobIds) {
            this.jobIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identification numbers of the export jobs to return.
     * </p>
     * <p>
     * An export job ID is returned when you create an export using the
     * <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code> actions.
     * </p>
     * <p>
     * All export jobs created in the last seven days are returned if this parameter is omitted.
     * </p>
     * 
     * @param jobIds
     *        The identification numbers of the export jobs to return.</p>
     *        <p>
     *        An export job ID is returned when you create an export using the
     *        <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code>
     *        actions.
     *        </p>
     *        <p>
     *        All export jobs created in the last seven days are returned if this parameter is omitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecommendationExportJobsRequest withJobIds(java.util.Collection<String> jobIds) {
        setJobIds(jobIds);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe a filter to return a more specific list of export jobs.
     * </p>
     * 
     * @return An array of objects that describe a filter to return a more specific list of export jobs.
     */

    public java.util.List<JobFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of objects that describe a filter to return a more specific list of export jobs.
     * </p>
     * 
     * @param filters
     *        An array of objects that describe a filter to return a more specific list of export jobs.
     */

    public void setFilters(java.util.Collection<JobFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<JobFilter>(filters);
    }

    /**
     * <p>
     * An array of objects that describe a filter to return a more specific list of export jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of objects that describe a filter to return a more specific list of export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecommendationExportJobsRequest withFilters(JobFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<JobFilter>(filters.length));
        }
        for (JobFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe a filter to return a more specific list of export jobs.
     * </p>
     * 
     * @param filters
     *        An array of objects that describe a filter to return a more specific list of export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecommendationExportJobsRequest withFilters(java.util.Collection<JobFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of export jobs.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of export jobs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of export jobs.
     * </p>
     * 
     * @return The token to advance to the next page of export jobs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of export jobs.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecommendationExportJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of export jobs to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of export jobs to return with a single request.</p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of export jobs to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of export jobs to return with a single request.</p>
     *         <p>
     *         To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of export jobs to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of export jobs to return with a single request.</p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecommendationExportJobsRequest withMaxResults(Integer maxResults) {
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
        if (getJobIds() != null)
            sb.append("JobIds: ").append(getJobIds()).append(",");
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

        if (obj instanceof DescribeRecommendationExportJobsRequest == false)
            return false;
        DescribeRecommendationExportJobsRequest other = (DescribeRecommendationExportJobsRequest) obj;
        if (other.getJobIds() == null ^ this.getJobIds() == null)
            return false;
        if (other.getJobIds() != null && other.getJobIds().equals(this.getJobIds()) == false)
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

        hashCode = prime * hashCode + ((getJobIds() == null) ? 0 : getJobIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecommendationExportJobsRequest clone() {
        return (DescribeRecommendationExportJobsRequest) super.clone();
    }

}
