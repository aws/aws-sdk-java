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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusterOperationsV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClusterOperationsV2Request extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The arn of the cluster whose operations are being requested. */
    private String clusterArn;
    /** The maxResults of the query. */
    private Integer maxResults;
    /** The nextToken of the query. */
    private String nextToken;

    /**
     * The arn of the cluster whose operations are being requested.
     * 
     * @param clusterArn
     *        The arn of the cluster whose operations are being requested.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * The arn of the cluster whose operations are being requested.
     * 
     * @return The arn of the cluster whose operations are being requested.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * The arn of the cluster whose operations are being requested.
     * 
     * @param clusterArn
     *        The arn of the cluster whose operations are being requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterOperationsV2Request withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * The maxResults of the query.
     * 
     * @param maxResults
     *        The maxResults of the query.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maxResults of the query.
     * 
     * @return The maxResults of the query.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The maxResults of the query.
     * 
     * @param maxResults
     *        The maxResults of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterOperationsV2Request withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * The nextToken of the query.
     * 
     * @param nextToken
     *        The nextToken of the query.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The nextToken of the query.
     * 
     * @return The nextToken of the query.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The nextToken of the query.
     * 
     * @param nextToken
     *        The nextToken of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterOperationsV2Request withNextToken(String nextToken) {
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
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

        if (obj instanceof ListClusterOperationsV2Request == false)
            return false;
        ListClusterOperationsV2Request other = (ListClusterOperationsV2Request) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
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

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListClusterOperationsV2Request clone() {
        return (ListClusterOperationsV2Request) super.clone();
    }

}
