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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetDeliveryDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeliveryDestinationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure containing information about the delivery destination.
     * </p>
     */
    private DeliveryDestination deliveryDestination;

    /**
     * <p>
     * A structure containing information about the delivery destination.
     * </p>
     * 
     * @param deliveryDestination
     *        A structure containing information about the delivery destination.
     */

    public void setDeliveryDestination(DeliveryDestination deliveryDestination) {
        this.deliveryDestination = deliveryDestination;
    }

    /**
     * <p>
     * A structure containing information about the delivery destination.
     * </p>
     * 
     * @return A structure containing information about the delivery destination.
     */

    public DeliveryDestination getDeliveryDestination() {
        return this.deliveryDestination;
    }

    /**
     * <p>
     * A structure containing information about the delivery destination.
     * </p>
     * 
     * @param deliveryDestination
     *        A structure containing information about the delivery destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliveryDestinationResult withDeliveryDestination(DeliveryDestination deliveryDestination) {
        setDeliveryDestination(deliveryDestination);
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
        if (getDeliveryDestination() != null)
            sb.append("DeliveryDestination: ").append(getDeliveryDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeliveryDestinationResult == false)
            return false;
        GetDeliveryDestinationResult other = (GetDeliveryDestinationResult) obj;
        if (other.getDeliveryDestination() == null ^ this.getDeliveryDestination() == null)
            return false;
        if (other.getDeliveryDestination() != null && other.getDeliveryDestination().equals(this.getDeliveryDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryDestination() == null) ? 0 : getDeliveryDestination().hashCode());
        return hashCode;
    }

    @Override
    public GetDeliveryDestinationResult clone() {
        try {
            return (GetDeliveryDestinationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
