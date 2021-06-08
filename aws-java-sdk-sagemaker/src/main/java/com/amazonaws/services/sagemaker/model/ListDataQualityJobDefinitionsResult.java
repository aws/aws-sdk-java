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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDataQualityJobDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataQualityJobDefinitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of data quality monitoring job definitions.
     * </p>
     */
    private java.util.List<MonitoringJobDefinitionSummary> jobDefinitionSummaries;
    /**
     * <p>
     * If the result of the previous <code>ListDataQualityJobDefinitions</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of data quality monitoring job definitions, use the
     * token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of data quality monitoring job definitions.
     * </p>
     * 
     * @return A list of data quality monitoring job definitions.
     */

    public java.util.List<MonitoringJobDefinitionSummary> getJobDefinitionSummaries() {
        return jobDefinitionSummaries;
    }

    /**
     * <p>
     * A list of data quality monitoring job definitions.
     * </p>
     * 
     * @param jobDefinitionSummaries
     *        A list of data quality monitoring job definitions.
     */

    public void setJobDefinitionSummaries(java.util.Collection<MonitoringJobDefinitionSummary> jobDefinitionSummaries) {
        if (jobDefinitionSummaries == null) {
            this.jobDefinitionSummaries = null;
            return;
        }

        this.jobDefinitionSummaries = new java.util.ArrayList<MonitoringJobDefinitionSummary>(jobDefinitionSummaries);
    }

    /**
     * <p>
     * A list of data quality monitoring job definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobDefinitionSummaries(java.util.Collection)} or
     * {@link #withJobDefinitionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param jobDefinitionSummaries
     *        A list of data quality monitoring job definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataQualityJobDefinitionsResult withJobDefinitionSummaries(MonitoringJobDefinitionSummary... jobDefinitionSummaries) {
        if (this.jobDefinitionSummaries == null) {
            setJobDefinitionSummaries(new java.util.ArrayList<MonitoringJobDefinitionSummary>(jobDefinitionSummaries.length));
        }
        for (MonitoringJobDefinitionSummary ele : jobDefinitionSummaries) {
            this.jobDefinitionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of data quality monitoring job definitions.
     * </p>
     * 
     * @param jobDefinitionSummaries
     *        A list of data quality monitoring job definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataQualityJobDefinitionsResult withJobDefinitionSummaries(java.util.Collection<MonitoringJobDefinitionSummary> jobDefinitionSummaries) {
        setJobDefinitionSummaries(jobDefinitionSummaries);
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>ListDataQualityJobDefinitions</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of data quality monitoring job definitions, use the
     * token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListDataQualityJobDefinitions</code> request was truncated, the
     *        response includes a <code>NextToken</code>. To retrieve the next set of data quality monitoring job
     *        definitions, use the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListDataQualityJobDefinitions</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of data quality monitoring job definitions, use the
     * token in the next request.
     * </p>
     * 
     * @return If the result of the previous <code>ListDataQualityJobDefinitions</code> request was truncated, the
     *         response includes a <code>NextToken</code>. To retrieve the next set of data quality monitoring job
     *         definitions, use the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListDataQualityJobDefinitions</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of data quality monitoring job definitions, use the
     * token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListDataQualityJobDefinitions</code> request was truncated, the
     *        response includes a <code>NextToken</code>. To retrieve the next set of data quality monitoring job
     *        definitions, use the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataQualityJobDefinitionsResult withNextToken(String nextToken) {
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
        if (getJobDefinitionSummaries() != null)
            sb.append("JobDefinitionSummaries: ").append(getJobDefinitionSummaries()).append(",");
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

        if (obj instanceof ListDataQualityJobDefinitionsResult == false)
            return false;
        ListDataQualityJobDefinitionsResult other = (ListDataQualityJobDefinitionsResult) obj;
        if (other.getJobDefinitionSummaries() == null ^ this.getJobDefinitionSummaries() == null)
            return false;
        if (other.getJobDefinitionSummaries() != null && other.getJobDefinitionSummaries().equals(this.getJobDefinitionSummaries()) == false)
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

        hashCode = prime * hashCode + ((getJobDefinitionSummaries() == null) ? 0 : getJobDefinitionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDataQualityJobDefinitionsResult clone() {
        try {
            return (ListDataQualityJobDefinitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
