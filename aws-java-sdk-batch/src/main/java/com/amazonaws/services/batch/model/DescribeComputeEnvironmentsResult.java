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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeComputeEnvironments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeComputeEnvironmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of compute environments.
     * </p>
     */
    private java.util.List<ComputeEnvironmentDetail> computeEnvironments;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeComputeEnvironments</code> request. When
     * the results of a <code>DescribeJobDefinitions</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of compute environments.
     * </p>
     * 
     * @return The list of compute environments.
     */

    public java.util.List<ComputeEnvironmentDetail> getComputeEnvironments() {
        return computeEnvironments;
    }

    /**
     * <p>
     * The list of compute environments.
     * </p>
     * 
     * @param computeEnvironments
     *        The list of compute environments.
     */

    public void setComputeEnvironments(java.util.Collection<ComputeEnvironmentDetail> computeEnvironments) {
        if (computeEnvironments == null) {
            this.computeEnvironments = null;
            return;
        }

        this.computeEnvironments = new java.util.ArrayList<ComputeEnvironmentDetail>(computeEnvironments);
    }

    /**
     * <p>
     * The list of compute environments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComputeEnvironments(java.util.Collection)} or {@link #withComputeEnvironments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param computeEnvironments
     *        The list of compute environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComputeEnvironmentsResult withComputeEnvironments(ComputeEnvironmentDetail... computeEnvironments) {
        if (this.computeEnvironments == null) {
            setComputeEnvironments(new java.util.ArrayList<ComputeEnvironmentDetail>(computeEnvironments.length));
        }
        for (ComputeEnvironmentDetail ele : computeEnvironments) {
            this.computeEnvironments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of compute environments.
     * </p>
     * 
     * @param computeEnvironments
     *        The list of compute environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComputeEnvironmentsResult withComputeEnvironments(java.util.Collection<ComputeEnvironmentDetail> computeEnvironments) {
        setComputeEnvironments(computeEnvironments);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeComputeEnvironments</code> request. When
     * the results of a <code>DescribeJobDefinitions</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeComputeEnvironments</code> request.
     *        When the results of a <code>DescribeJobDefinitions</code> request exceed <code>maxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeComputeEnvironments</code> request. When
     * the results of a <code>DescribeJobDefinitions</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>DescribeComputeEnvironments</code> request.
     *         When the results of a <code>DescribeJobDefinitions</code> request exceed <code>maxResults</code>, this
     *         value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeComputeEnvironments</code> request. When
     * the results of a <code>DescribeJobDefinitions</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeComputeEnvironments</code> request.
     *        When the results of a <code>DescribeJobDefinitions</code> request exceed <code>maxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComputeEnvironmentsResult withNextToken(String nextToken) {
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
        if (getComputeEnvironments() != null)
            sb.append("ComputeEnvironments: ").append(getComputeEnvironments()).append(",");
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

        if (obj instanceof DescribeComputeEnvironmentsResult == false)
            return false;
        DescribeComputeEnvironmentsResult other = (DescribeComputeEnvironmentsResult) obj;
        if (other.getComputeEnvironments() == null ^ this.getComputeEnvironments() == null)
            return false;
        if (other.getComputeEnvironments() != null && other.getComputeEnvironments().equals(this.getComputeEnvironments()) == false)
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

        hashCode = prime * hashCode + ((getComputeEnvironments() == null) ? 0 : getComputeEnvironments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeComputeEnvironmentsResult clone() {
        try {
            return (DescribeComputeEnvironmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
