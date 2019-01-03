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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetInstancesHealthStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstancesHealthStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains the IDs and the health status of the instances that you specified in the
     * <code>GetInstancesHealthStatus</code> request.
     * </p>
     */
    private java.util.Map<String, String> status;
    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     * <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A complex type that contains the IDs and the health status of the instances that you specified in the
     * <code>GetInstancesHealthStatus</code> request.
     * </p>
     * 
     * @return A complex type that contains the IDs and the health status of the instances that you specified in the
     *         <code>GetInstancesHealthStatus</code> request.
     */

    public java.util.Map<String, String> getStatus() {
        return status;
    }

    /**
     * <p>
     * A complex type that contains the IDs and the health status of the instances that you specified in the
     * <code>GetInstancesHealthStatus</code> request.
     * </p>
     * 
     * @param status
     *        A complex type that contains the IDs and the health status of the instances that you specified in the
     *        <code>GetInstancesHealthStatus</code> request.
     */

    public void setStatus(java.util.Map<String, String> status) {
        this.status = status;
    }

    /**
     * <p>
     * A complex type that contains the IDs and the health status of the instances that you specified in the
     * <code>GetInstancesHealthStatus</code> request.
     * </p>
     * 
     * @param status
     *        A complex type that contains the IDs and the health status of the instances that you specified in the
     *        <code>GetInstancesHealthStatus</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstancesHealthStatusResult withStatus(java.util.Map<String, String> status) {
        setStatus(status);
        return this;
    }

    public GetInstancesHealthStatusResult addStatusEntry(String key, String value) {
        if (null == this.status) {
            this.status = new java.util.HashMap<String, String>();
        }
        if (this.status.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.status.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Status.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstancesHealthStatusResult clearStatusEntries() {
        this.status = null;
        return this;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     * <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     *        <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     *        <code>NextToken</code> from the previous response in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     * <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * 
     * @return If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     *         <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     *         <code>NextToken</code> from the previous response in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     * <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> instances match the specified criteria, you can submit another
     *        <code>GetInstancesHealthStatus</code> request to get the next group of results. Specify the value of
     *        <code>NextToken</code> from the previous response in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstancesHealthStatusResult withNextToken(String nextToken) {
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof GetInstancesHealthStatusResult == false)
            return false;
        GetInstancesHealthStatusResult other = (GetInstancesHealthStatusResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInstancesHealthStatusResult clone() {
        try {
            return (GetInstancesHealthStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
