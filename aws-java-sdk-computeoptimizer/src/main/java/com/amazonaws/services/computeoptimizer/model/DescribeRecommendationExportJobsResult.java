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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/DescribeRecommendationExportJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecommendationExportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of objects that describe recommendation export jobs.
     * </p>
     */
    private java.util.List<RecommendationExportJob> recommendationExportJobs;
    /**
     * <p>
     * The token to use to advance to the next page of export jobs.
     * </p>
     * <p>
     * This value is null when there are no more pages of export jobs to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that describe recommendation export jobs.
     * </p>
     * 
     * @return An array of objects that describe recommendation export jobs.
     */

    public java.util.List<RecommendationExportJob> getRecommendationExportJobs() {
        return recommendationExportJobs;
    }

    /**
     * <p>
     * An array of objects that describe recommendation export jobs.
     * </p>
     * 
     * @param recommendationExportJobs
     *        An array of objects that describe recommendation export jobs.
     */

    public void setRecommendationExportJobs(java.util.Collection<RecommendationExportJob> recommendationExportJobs) {
        if (recommendationExportJobs == null) {
            this.recommendationExportJobs = null;
            return;
        }

        this.recommendationExportJobs = new java.util.ArrayList<RecommendationExportJob>(recommendationExportJobs);
    }

    /**
     * <p>
     * An array of objects that describe recommendation export jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationExportJobs(java.util.Collection)} or
     * {@link #withRecommendationExportJobs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendationExportJobs
     *        An array of objects that describe recommendation export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecommendationExportJobsResult withRecommendationExportJobs(RecommendationExportJob... recommendationExportJobs) {
        if (this.recommendationExportJobs == null) {
            setRecommendationExportJobs(new java.util.ArrayList<RecommendationExportJob>(recommendationExportJobs.length));
        }
        for (RecommendationExportJob ele : recommendationExportJobs) {
            this.recommendationExportJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe recommendation export jobs.
     * </p>
     * 
     * @param recommendationExportJobs
     *        An array of objects that describe recommendation export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecommendationExportJobsResult withRecommendationExportJobs(java.util.Collection<RecommendationExportJob> recommendationExportJobs) {
        setRecommendationExportJobs(recommendationExportJobs);
        return this;
    }

    /**
     * <p>
     * The token to use to advance to the next page of export jobs.
     * </p>
     * <p>
     * This value is null when there are no more pages of export jobs to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of export jobs.</p>
     *        <p>
     *        This value is null when there are no more pages of export jobs to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of export jobs.
     * </p>
     * <p>
     * This value is null when there are no more pages of export jobs to return.
     * </p>
     * 
     * @return The token to use to advance to the next page of export jobs.</p>
     *         <p>
     *         This value is null when there are no more pages of export jobs to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of export jobs.
     * </p>
     * <p>
     * This value is null when there are no more pages of export jobs to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of export jobs.</p>
     *        <p>
     *        This value is null when there are no more pages of export jobs to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecommendationExportJobsResult withNextToken(String nextToken) {
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
        if (getRecommendationExportJobs() != null)
            sb.append("RecommendationExportJobs: ").append(getRecommendationExportJobs()).append(",");
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

        if (obj instanceof DescribeRecommendationExportJobsResult == false)
            return false;
        DescribeRecommendationExportJobsResult other = (DescribeRecommendationExportJobsResult) obj;
        if (other.getRecommendationExportJobs() == null ^ this.getRecommendationExportJobs() == null)
            return false;
        if (other.getRecommendationExportJobs() != null && other.getRecommendationExportJobs().equals(this.getRecommendationExportJobs()) == false)
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

        hashCode = prime * hashCode + ((getRecommendationExportJobs() == null) ? 0 : getRecommendationExportJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecommendationExportJobsResult clone() {
        try {
            return (DescribeRecommendationExportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
