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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpointWeightsAndCapacities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEndpointWeightsAndCapacitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an existing Amazon SageMaker endpoint.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * An object that provides new capacity and weight values for a variant.
     * </p>
     */
    private java.util.List<DesiredWeightAndCapacity> desiredWeightsAndCapacities;

    /**
     * <p>
     * The name of an existing Amazon SageMaker endpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of an existing Amazon SageMaker endpoint.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of an existing Amazon SageMaker endpoint.
     * </p>
     * 
     * @return The name of an existing Amazon SageMaker endpoint.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of an existing Amazon SageMaker endpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of an existing Amazon SageMaker endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointWeightsAndCapacitiesRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * An object that provides new capacity and weight values for a variant.
     * </p>
     * 
     * @return An object that provides new capacity and weight values for a variant.
     */

    public java.util.List<DesiredWeightAndCapacity> getDesiredWeightsAndCapacities() {
        return desiredWeightsAndCapacities;
    }

    /**
     * <p>
     * An object that provides new capacity and weight values for a variant.
     * </p>
     * 
     * @param desiredWeightsAndCapacities
     *        An object that provides new capacity and weight values for a variant.
     */

    public void setDesiredWeightsAndCapacities(java.util.Collection<DesiredWeightAndCapacity> desiredWeightsAndCapacities) {
        if (desiredWeightsAndCapacities == null) {
            this.desiredWeightsAndCapacities = null;
            return;
        }

        this.desiredWeightsAndCapacities = new java.util.ArrayList<DesiredWeightAndCapacity>(desiredWeightsAndCapacities);
    }

    /**
     * <p>
     * An object that provides new capacity and weight values for a variant.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDesiredWeightsAndCapacities(java.util.Collection)} or
     * {@link #withDesiredWeightsAndCapacities(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param desiredWeightsAndCapacities
     *        An object that provides new capacity and weight values for a variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointWeightsAndCapacitiesRequest withDesiredWeightsAndCapacities(DesiredWeightAndCapacity... desiredWeightsAndCapacities) {
        if (this.desiredWeightsAndCapacities == null) {
            setDesiredWeightsAndCapacities(new java.util.ArrayList<DesiredWeightAndCapacity>(desiredWeightsAndCapacities.length));
        }
        for (DesiredWeightAndCapacity ele : desiredWeightsAndCapacities) {
            this.desiredWeightsAndCapacities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that provides new capacity and weight values for a variant.
     * </p>
     * 
     * @param desiredWeightsAndCapacities
     *        An object that provides new capacity and weight values for a variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointWeightsAndCapacitiesRequest withDesiredWeightsAndCapacities(java.util.Collection<DesiredWeightAndCapacity> desiredWeightsAndCapacities) {
        setDesiredWeightsAndCapacities(desiredWeightsAndCapacities);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getDesiredWeightsAndCapacities() != null)
            sb.append("DesiredWeightsAndCapacities: ").append(getDesiredWeightsAndCapacities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointWeightsAndCapacitiesRequest == false)
            return false;
        UpdateEndpointWeightsAndCapacitiesRequest other = (UpdateEndpointWeightsAndCapacitiesRequest) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getDesiredWeightsAndCapacities() == null ^ this.getDesiredWeightsAndCapacities() == null)
            return false;
        if (other.getDesiredWeightsAndCapacities() != null && other.getDesiredWeightsAndCapacities().equals(this.getDesiredWeightsAndCapacities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getDesiredWeightsAndCapacities() == null) ? 0 : getDesiredWeightsAndCapacities().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEndpointWeightsAndCapacitiesRequest clone() {
        return (UpdateEndpointWeightsAndCapacitiesRequest) super.clone();
    }

}
