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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceGenerationJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAudienceGenerationJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The audience generation jobs that match the request.
     * </p>
     */
    private java.util.List<AudienceGenerationJobSummary> audienceGenerationJobs;
    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The audience generation jobs that match the request.
     * </p>
     * 
     * @return The audience generation jobs that match the request.
     */

    public java.util.List<AudienceGenerationJobSummary> getAudienceGenerationJobs() {
        return audienceGenerationJobs;
    }

    /**
     * <p>
     * The audience generation jobs that match the request.
     * </p>
     * 
     * @param audienceGenerationJobs
     *        The audience generation jobs that match the request.
     */

    public void setAudienceGenerationJobs(java.util.Collection<AudienceGenerationJobSummary> audienceGenerationJobs) {
        if (audienceGenerationJobs == null) {
            this.audienceGenerationJobs = null;
            return;
        }

        this.audienceGenerationJobs = new java.util.ArrayList<AudienceGenerationJobSummary>(audienceGenerationJobs);
    }

    /**
     * <p>
     * The audience generation jobs that match the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudienceGenerationJobs(java.util.Collection)} or
     * {@link #withAudienceGenerationJobs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param audienceGenerationJobs
     *        The audience generation jobs that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAudienceGenerationJobsResult withAudienceGenerationJobs(AudienceGenerationJobSummary... audienceGenerationJobs) {
        if (this.audienceGenerationJobs == null) {
            setAudienceGenerationJobs(new java.util.ArrayList<AudienceGenerationJobSummary>(audienceGenerationJobs.length));
        }
        for (AudienceGenerationJobSummary ele : audienceGenerationJobs) {
            this.audienceGenerationJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The audience generation jobs that match the request.
     * </p>
     * 
     * @param audienceGenerationJobs
     *        The audience generation jobs that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAudienceGenerationJobsResult withAudienceGenerationJobs(java.util.Collection<AudienceGenerationJobSummary> audienceGenerationJobs) {
        setAudienceGenerationJobs(audienceGenerationJobs);
        return this;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @return The token value retrieved from a previous call to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAudienceGenerationJobsResult withNextToken(String nextToken) {
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
        if (getAudienceGenerationJobs() != null)
            sb.append("AudienceGenerationJobs: ").append(getAudienceGenerationJobs()).append(",");
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

        if (obj instanceof ListAudienceGenerationJobsResult == false)
            return false;
        ListAudienceGenerationJobsResult other = (ListAudienceGenerationJobsResult) obj;
        if (other.getAudienceGenerationJobs() == null ^ this.getAudienceGenerationJobs() == null)
            return false;
        if (other.getAudienceGenerationJobs() != null && other.getAudienceGenerationJobs().equals(this.getAudienceGenerationJobs()) == false)
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

        hashCode = prime * hashCode + ((getAudienceGenerationJobs() == null) ? 0 : getAudienceGenerationJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAudienceGenerationJobsResult clone() {
        try {
            return (ListAudienceGenerationJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
