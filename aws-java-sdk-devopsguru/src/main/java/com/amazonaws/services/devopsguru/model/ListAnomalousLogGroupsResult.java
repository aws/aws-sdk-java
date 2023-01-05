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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListAnomalousLogGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnomalousLogGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the insight containing the log groups.
     * </p>
     */
    private String insightId;
    /**
     * <p>
     * The list of Amazon CloudWatch log groups that are related to an insight.
     * </p>
     */
    private java.util.List<AnomalousLogGroup> anomalousLogGroups;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the insight containing the log groups.
     * </p>
     * 
     * @param insightId
     *        The ID of the insight containing the log groups.
     */

    public void setInsightId(String insightId) {
        this.insightId = insightId;
    }

    /**
     * <p>
     * The ID of the insight containing the log groups.
     * </p>
     * 
     * @return The ID of the insight containing the log groups.
     */

    public String getInsightId() {
        return this.insightId;
    }

    /**
     * <p>
     * The ID of the insight containing the log groups.
     * </p>
     * 
     * @param insightId
     *        The ID of the insight containing the log groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalousLogGroupsResult withInsightId(String insightId) {
        setInsightId(insightId);
        return this;
    }

    /**
     * <p>
     * The list of Amazon CloudWatch log groups that are related to an insight.
     * </p>
     * 
     * @return The list of Amazon CloudWatch log groups that are related to an insight.
     */

    public java.util.List<AnomalousLogGroup> getAnomalousLogGroups() {
        return anomalousLogGroups;
    }

    /**
     * <p>
     * The list of Amazon CloudWatch log groups that are related to an insight.
     * </p>
     * 
     * @param anomalousLogGroups
     *        The list of Amazon CloudWatch log groups that are related to an insight.
     */

    public void setAnomalousLogGroups(java.util.Collection<AnomalousLogGroup> anomalousLogGroups) {
        if (anomalousLogGroups == null) {
            this.anomalousLogGroups = null;
            return;
        }

        this.anomalousLogGroups = new java.util.ArrayList<AnomalousLogGroup>(anomalousLogGroups);
    }

    /**
     * <p>
     * The list of Amazon CloudWatch log groups that are related to an insight.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnomalousLogGroups(java.util.Collection)} or {@link #withAnomalousLogGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param anomalousLogGroups
     *        The list of Amazon CloudWatch log groups that are related to an insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalousLogGroupsResult withAnomalousLogGroups(AnomalousLogGroup... anomalousLogGroups) {
        if (this.anomalousLogGroups == null) {
            setAnomalousLogGroups(new java.util.ArrayList<AnomalousLogGroup>(anomalousLogGroups.length));
        }
        for (AnomalousLogGroup ele : anomalousLogGroups) {
            this.anomalousLogGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Amazon CloudWatch log groups that are related to an insight.
     * </p>
     * 
     * @param anomalousLogGroups
     *        The list of Amazon CloudWatch log groups that are related to an insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalousLogGroupsResult withAnomalousLogGroups(java.util.Collection<AnomalousLogGroup> anomalousLogGroups) {
        setAnomalousLogGroups(anomalousLogGroups);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalousLogGroupsResult withNextToken(String nextToken) {
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
        if (getInsightId() != null)
            sb.append("InsightId: ").append(getInsightId()).append(",");
        if (getAnomalousLogGroups() != null)
            sb.append("AnomalousLogGroups: ").append(getAnomalousLogGroups()).append(",");
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

        if (obj instanceof ListAnomalousLogGroupsResult == false)
            return false;
        ListAnomalousLogGroupsResult other = (ListAnomalousLogGroupsResult) obj;
        if (other.getInsightId() == null ^ this.getInsightId() == null)
            return false;
        if (other.getInsightId() != null && other.getInsightId().equals(this.getInsightId()) == false)
            return false;
        if (other.getAnomalousLogGroups() == null ^ this.getAnomalousLogGroups() == null)
            return false;
        if (other.getAnomalousLogGroups() != null && other.getAnomalousLogGroups().equals(this.getAnomalousLogGroups()) == false)
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

        hashCode = prime * hashCode + ((getInsightId() == null) ? 0 : getInsightId().hashCode());
        hashCode = prime * hashCode + ((getAnomalousLogGroups() == null) ? 0 : getAnomalousLogGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAnomalousLogGroupsResult clone() {
        try {
            return (ListAnomalousLogGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
