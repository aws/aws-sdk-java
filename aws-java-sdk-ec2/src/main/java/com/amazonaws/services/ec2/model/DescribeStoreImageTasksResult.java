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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStoreImageTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The information about the AMI store tasks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StoreImageTaskResult> storeImageTaskResults;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The information about the AMI store tasks.
     * </p>
     * 
     * @return The information about the AMI store tasks.
     */

    public java.util.List<StoreImageTaskResult> getStoreImageTaskResults() {
        if (storeImageTaskResults == null) {
            storeImageTaskResults = new com.amazonaws.internal.SdkInternalList<StoreImageTaskResult>();
        }
        return storeImageTaskResults;
    }

    /**
     * <p>
     * The information about the AMI store tasks.
     * </p>
     * 
     * @param storeImageTaskResults
     *        The information about the AMI store tasks.
     */

    public void setStoreImageTaskResults(java.util.Collection<StoreImageTaskResult> storeImageTaskResults) {
        if (storeImageTaskResults == null) {
            this.storeImageTaskResults = null;
            return;
        }

        this.storeImageTaskResults = new com.amazonaws.internal.SdkInternalList<StoreImageTaskResult>(storeImageTaskResults);
    }

    /**
     * <p>
     * The information about the AMI store tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStoreImageTaskResults(java.util.Collection)} or
     * {@link #withStoreImageTaskResults(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param storeImageTaskResults
     *        The information about the AMI store tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStoreImageTasksResult withStoreImageTaskResults(StoreImageTaskResult... storeImageTaskResults) {
        if (this.storeImageTaskResults == null) {
            setStoreImageTaskResults(new com.amazonaws.internal.SdkInternalList<StoreImageTaskResult>(storeImageTaskResults.length));
        }
        for (StoreImageTaskResult ele : storeImageTaskResults) {
            this.storeImageTaskResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information about the AMI store tasks.
     * </p>
     * 
     * @param storeImageTaskResults
     *        The information about the AMI store tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStoreImageTasksResult withStoreImageTaskResults(java.util.Collection<StoreImageTaskResult> storeImageTaskResults) {
        setStoreImageTaskResults(storeImageTaskResults);
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

    public DescribeStoreImageTasksResult withNextToken(String nextToken) {
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
        if (getStoreImageTaskResults() != null)
            sb.append("StoreImageTaskResults: ").append(getStoreImageTaskResults()).append(",");
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

        if (obj instanceof DescribeStoreImageTasksResult == false)
            return false;
        DescribeStoreImageTasksResult other = (DescribeStoreImageTasksResult) obj;
        if (other.getStoreImageTaskResults() == null ^ this.getStoreImageTaskResults() == null)
            return false;
        if (other.getStoreImageTaskResults() != null && other.getStoreImageTaskResults().equals(this.getStoreImageTaskResults()) == false)
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

        hashCode = prime * hashCode + ((getStoreImageTaskResults() == null) ? 0 : getStoreImageTaskResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStoreImageTasksResult clone() {
        try {
            return (DescribeStoreImageTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
