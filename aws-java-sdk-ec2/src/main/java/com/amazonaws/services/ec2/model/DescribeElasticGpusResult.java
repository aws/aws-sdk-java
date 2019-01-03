/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeElasticGpusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the Elastic Graphics accelerators.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ElasticGpus> elasticGpuSet;
    /**
     * <p>
     * The total number of items to return. If the total number of items available is more than the value specified in
     * max-items then a Next-Token will be provided in the output that you can use to resume pagination.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the Elastic Graphics accelerators.
     * </p>
     * 
     * @return Information about the Elastic Graphics accelerators.
     */

    public java.util.List<ElasticGpus> getElasticGpuSet() {
        if (elasticGpuSet == null) {
            elasticGpuSet = new com.amazonaws.internal.SdkInternalList<ElasticGpus>();
        }
        return elasticGpuSet;
    }

    /**
     * <p>
     * Information about the Elastic Graphics accelerators.
     * </p>
     * 
     * @param elasticGpuSet
     *        Information about the Elastic Graphics accelerators.
     */

    public void setElasticGpuSet(java.util.Collection<ElasticGpus> elasticGpuSet) {
        if (elasticGpuSet == null) {
            this.elasticGpuSet = null;
            return;
        }

        this.elasticGpuSet = new com.amazonaws.internal.SdkInternalList<ElasticGpus>(elasticGpuSet);
    }

    /**
     * <p>
     * Information about the Elastic Graphics accelerators.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticGpuSet(java.util.Collection)} or {@link #withElasticGpuSet(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param elasticGpuSet
     *        Information about the Elastic Graphics accelerators.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticGpusResult withElasticGpuSet(ElasticGpus... elasticGpuSet) {
        if (this.elasticGpuSet == null) {
            setElasticGpuSet(new com.amazonaws.internal.SdkInternalList<ElasticGpus>(elasticGpuSet.length));
        }
        for (ElasticGpus ele : elasticGpuSet) {
            this.elasticGpuSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Elastic Graphics accelerators.
     * </p>
     * 
     * @param elasticGpuSet
     *        Information about the Elastic Graphics accelerators.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticGpusResult withElasticGpuSet(java.util.Collection<ElasticGpus> elasticGpuSet) {
        setElasticGpuSet(elasticGpuSet);
        return this;
    }

    /**
     * <p>
     * The total number of items to return. If the total number of items available is more than the value specified in
     * max-items then a Next-Token will be provided in the output that you can use to resume pagination.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return. If the total number of items available is more than the value
     *        specified in max-items then a Next-Token will be provided in the output that you can use to resume
     *        pagination.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of items to return. If the total number of items available is more than the value specified in
     * max-items then a Next-Token will be provided in the output that you can use to resume pagination.
     * </p>
     * 
     * @return The total number of items to return. If the total number of items available is more than the value
     *         specified in max-items then a Next-Token will be provided in the output that you can use to resume
     *         pagination.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of items to return. If the total number of items available is more than the value specified in
     * max-items then a Next-Token will be provided in the output that you can use to resume pagination.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return. If the total number of items available is more than the value
     *        specified in max-items then a Next-Token will be provided in the output that you can use to resume
     *        pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticGpusResult withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticGpusResult withNextToken(String nextToken) {
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
        if (getElasticGpuSet() != null)
            sb.append("ElasticGpuSet: ").append(getElasticGpuSet()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeElasticGpusResult == false)
            return false;
        DescribeElasticGpusResult other = (DescribeElasticGpusResult) obj;
        if (other.getElasticGpuSet() == null ^ this.getElasticGpuSet() == null)
            return false;
        if (other.getElasticGpuSet() != null && other.getElasticGpuSet().equals(this.getElasticGpuSet()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getElasticGpuSet() == null) ? 0 : getElasticGpuSet().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeElasticGpusResult clone() {
        try {
            return (DescribeElasticGpusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
