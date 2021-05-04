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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/StartCostEstimation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCostEstimationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The collection of AWS resources used to create a monthly DevOps Guru cost estimate.
     * </p>
     */
    private CostEstimationResourceCollectionFilter resourceCollection;
    /**
     * <p>
     * The idempotency token used to identify each cost estimate request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The collection of AWS resources used to create a monthly DevOps Guru cost estimate.
     * </p>
     * 
     * @param resourceCollection
     *        The collection of AWS resources used to create a monthly DevOps Guru cost estimate.
     */

    public void setResourceCollection(CostEstimationResourceCollectionFilter resourceCollection) {
        this.resourceCollection = resourceCollection;
    }

    /**
     * <p>
     * The collection of AWS resources used to create a monthly DevOps Guru cost estimate.
     * </p>
     * 
     * @return The collection of AWS resources used to create a monthly DevOps Guru cost estimate.
     */

    public CostEstimationResourceCollectionFilter getResourceCollection() {
        return this.resourceCollection;
    }

    /**
     * <p>
     * The collection of AWS resources used to create a monthly DevOps Guru cost estimate.
     * </p>
     * 
     * @param resourceCollection
     *        The collection of AWS resources used to create a monthly DevOps Guru cost estimate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCostEstimationRequest withResourceCollection(CostEstimationResourceCollectionFilter resourceCollection) {
        setResourceCollection(resourceCollection);
        return this;
    }

    /**
     * <p>
     * The idempotency token used to identify each cost estimate request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token used to identify each cost estimate request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token used to identify each cost estimate request.
     * </p>
     * 
     * @return The idempotency token used to identify each cost estimate request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token used to identify each cost estimate request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token used to identify each cost estimate request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCostEstimationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getResourceCollection() != null)
            sb.append("ResourceCollection: ").append(getResourceCollection()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartCostEstimationRequest == false)
            return false;
        StartCostEstimationRequest other = (StartCostEstimationRequest) obj;
        if (other.getResourceCollection() == null ^ this.getResourceCollection() == null)
            return false;
        if (other.getResourceCollection() != null && other.getResourceCollection().equals(this.getResourceCollection()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartCostEstimationRequest clone() {
        return (StartCostEstimationRequest) super.clone();
    }

}
