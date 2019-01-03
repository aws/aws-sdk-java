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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array or endpoint objects.
     * </p>
     */
    private java.util.List<EndpointSummary> endpoints;
    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use
     * it in the subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array or endpoint objects.
     * </p>
     * 
     * @return An array or endpoint objects.
     */

    public java.util.List<EndpointSummary> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * An array or endpoint objects.
     * </p>
     * 
     * @param endpoints
     *        An array or endpoint objects.
     */

    public void setEndpoints(java.util.Collection<EndpointSummary> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<EndpointSummary>(endpoints);
    }

    /**
     * <p>
     * An array or endpoint objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        An array or endpoint objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsResult withEndpoints(EndpointSummary... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<EndpointSummary>(endpoints.length));
        }
        for (EndpointSummary ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array or endpoint objects.
     * </p>
     * 
     * @param endpoints
     *        An array or endpoint objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsResult withEndpoints(java.util.Collection<EndpointSummary> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use
     * it in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training
     *        jobs, use it in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use
     * it in the subsequent request.
     * </p>
     * 
     * @return If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training
     *         jobs, use it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use
     * it in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training
     *        jobs, use it in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsResult withNextToken(String nextToken) {
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
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
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

        if (obj instanceof ListEndpointsResult == false)
            return false;
        ListEndpointsResult other = (ListEndpointsResult) obj;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
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

        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEndpointsResult clone() {
        try {
            return (ListEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
