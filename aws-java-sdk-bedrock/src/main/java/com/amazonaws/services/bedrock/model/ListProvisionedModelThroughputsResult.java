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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListProvisionedModelThroughputs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProvisionedModelThroughputsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * If there are more results than the number you specified in the <code>maxResults</code> field, this value is
     * returned. To see the next batch of results, include this value in the <code>nextToken</code> field in another
     * list request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of summaries, one for each Provisioned Throughput in the response.
     * </p>
     */
    private java.util.List<ProvisionedModelSummary> provisionedModelSummaries;

    /**
     * <p>
     * If there are more results than the number you specified in the <code>maxResults</code> field, this value is
     * returned. To see the next batch of results, include this value in the <code>nextToken</code> field in another
     * list request.
     * </p>
     * 
     * @param nextToken
     *        If there are more results than the number you specified in the <code>maxResults</code> field, this value
     *        is returned. To see the next batch of results, include this value in the <code>nextToken</code> field in
     *        another list request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more results than the number you specified in the <code>maxResults</code> field, this value is
     * returned. To see the next batch of results, include this value in the <code>nextToken</code> field in another
     * list request.
     * </p>
     * 
     * @return If there are more results than the number you specified in the <code>maxResults</code> field, this value
     *         is returned. To see the next batch of results, include this value in the <code>nextToken</code> field in
     *         another list request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more results than the number you specified in the <code>maxResults</code> field, this value is
     * returned. To see the next batch of results, include this value in the <code>nextToken</code> field in another
     * list request.
     * </p>
     * 
     * @param nextToken
     *        If there are more results than the number you specified in the <code>maxResults</code> field, this value
     *        is returned. To see the next batch of results, include this value in the <code>nextToken</code> field in
     *        another list request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedModelThroughputsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of summaries, one for each Provisioned Throughput in the response.
     * </p>
     * 
     * @return A list of summaries, one for each Provisioned Throughput in the response.
     */

    public java.util.List<ProvisionedModelSummary> getProvisionedModelSummaries() {
        return provisionedModelSummaries;
    }

    /**
     * <p>
     * A list of summaries, one for each Provisioned Throughput in the response.
     * </p>
     * 
     * @param provisionedModelSummaries
     *        A list of summaries, one for each Provisioned Throughput in the response.
     */

    public void setProvisionedModelSummaries(java.util.Collection<ProvisionedModelSummary> provisionedModelSummaries) {
        if (provisionedModelSummaries == null) {
            this.provisionedModelSummaries = null;
            return;
        }

        this.provisionedModelSummaries = new java.util.ArrayList<ProvisionedModelSummary>(provisionedModelSummaries);
    }

    /**
     * <p>
     * A list of summaries, one for each Provisioned Throughput in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisionedModelSummaries(java.util.Collection)} or
     * {@link #withProvisionedModelSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisionedModelSummaries
     *        A list of summaries, one for each Provisioned Throughput in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedModelThroughputsResult withProvisionedModelSummaries(ProvisionedModelSummary... provisionedModelSummaries) {
        if (this.provisionedModelSummaries == null) {
            setProvisionedModelSummaries(new java.util.ArrayList<ProvisionedModelSummary>(provisionedModelSummaries.length));
        }
        for (ProvisionedModelSummary ele : provisionedModelSummaries) {
            this.provisionedModelSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of summaries, one for each Provisioned Throughput in the response.
     * </p>
     * 
     * @param provisionedModelSummaries
     *        A list of summaries, one for each Provisioned Throughput in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedModelThroughputsResult withProvisionedModelSummaries(java.util.Collection<ProvisionedModelSummary> provisionedModelSummaries) {
        setProvisionedModelSummaries(provisionedModelSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getProvisionedModelSummaries() != null)
            sb.append("ProvisionedModelSummaries: ").append(getProvisionedModelSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProvisionedModelThroughputsResult == false)
            return false;
        ListProvisionedModelThroughputsResult other = (ListProvisionedModelThroughputsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProvisionedModelSummaries() == null ^ this.getProvisionedModelSummaries() == null)
            return false;
        if (other.getProvisionedModelSummaries() != null && other.getProvisionedModelSummaries().equals(this.getProvisionedModelSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProvisionedModelSummaries() == null) ? 0 : getProvisionedModelSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListProvisionedModelThroughputsResult clone() {
        try {
            return (ListProvisionedModelThroughputsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
