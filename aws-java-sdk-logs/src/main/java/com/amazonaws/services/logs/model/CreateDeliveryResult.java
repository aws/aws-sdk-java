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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateDelivery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeliveryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains information about the delivery that you just created.
     * </p>
     */
    private Delivery delivery;

    /**
     * <p>
     * A structure that contains information about the delivery that you just created.
     * </p>
     * 
     * @param delivery
     *        A structure that contains information about the delivery that you just created.
     */

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    /**
     * <p>
     * A structure that contains information about the delivery that you just created.
     * </p>
     * 
     * @return A structure that contains information about the delivery that you just created.
     */

    public Delivery getDelivery() {
        return this.delivery;
    }

    /**
     * <p>
     * A structure that contains information about the delivery that you just created.
     * </p>
     * 
     * @param delivery
     *        A structure that contains information about the delivery that you just created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryResult withDelivery(Delivery delivery) {
        setDelivery(delivery);
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
        if (getDelivery() != null)
            sb.append("Delivery: ").append(getDelivery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeliveryResult == false)
            return false;
        CreateDeliveryResult other = (CreateDeliveryResult) obj;
        if (other.getDelivery() == null ^ this.getDelivery() == null)
            return false;
        if (other.getDelivery() != null && other.getDelivery().equals(this.getDelivery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDelivery() == null) ? 0 : getDelivery().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeliveryResult clone() {
        try {
            return (CreateDeliveryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
