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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpointConfigs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEndpointConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of endpoint configurations.
     * </p>
     */
    private java.util.List<EndpointConfigSummary> endpointConfigs;
    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of endpoint
     * configurations, use it in the subsequent request
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of endpoint configurations.
     * </p>
     * 
     * @return An array of endpoint configurations.
     */

    public java.util.List<EndpointConfigSummary> getEndpointConfigs() {
        return endpointConfigs;
    }

    /**
     * <p>
     * An array of endpoint configurations.
     * </p>
     * 
     * @param endpointConfigs
     *        An array of endpoint configurations.
     */

    public void setEndpointConfigs(java.util.Collection<EndpointConfigSummary> endpointConfigs) {
        if (endpointConfigs == null) {
            this.endpointConfigs = null;
            return;
        }

        this.endpointConfigs = new java.util.ArrayList<EndpointConfigSummary>(endpointConfigs);
    }

    /**
     * <p>
     * An array of endpoint configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointConfigs(java.util.Collection)} or {@link #withEndpointConfigs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param endpointConfigs
     *        An array of endpoint configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointConfigsResult withEndpointConfigs(EndpointConfigSummary... endpointConfigs) {
        if (this.endpointConfigs == null) {
            setEndpointConfigs(new java.util.ArrayList<EndpointConfigSummary>(endpointConfigs.length));
        }
        for (EndpointConfigSummary ele : endpointConfigs) {
            this.endpointConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of endpoint configurations.
     * </p>
     * 
     * @param endpointConfigs
     *        An array of endpoint configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointConfigsResult withEndpointConfigs(java.util.Collection<EndpointConfigSummary> endpointConfigs) {
        setEndpointConfigs(endpointConfigs);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of endpoint
     * configurations, use it in the subsequent request
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of endpoint
     *        configurations, use it in the subsequent request
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of endpoint
     * configurations, use it in the subsequent request
     * </p>
     * 
     * @return If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of endpoint
     *         configurations, use it in the subsequent request
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of endpoint
     * configurations, use it in the subsequent request
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of endpoint
     *        configurations, use it in the subsequent request
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointConfigsResult withNextToken(String nextToken) {
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
        if (getEndpointConfigs() != null)
            sb.append("EndpointConfigs: ").append(getEndpointConfigs()).append(",");
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

        if (obj instanceof ListEndpointConfigsResult == false)
            return false;
        ListEndpointConfigsResult other = (ListEndpointConfigsResult) obj;
        if (other.getEndpointConfigs() == null ^ this.getEndpointConfigs() == null)
            return false;
        if (other.getEndpointConfigs() != null && other.getEndpointConfigs().equals(this.getEndpointConfigs()) == false)
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

        hashCode = prime * hashCode + ((getEndpointConfigs() == null) ? 0 : getEndpointConfigs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEndpointConfigsResult clone() {
        try {
            return (ListEndpointConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
