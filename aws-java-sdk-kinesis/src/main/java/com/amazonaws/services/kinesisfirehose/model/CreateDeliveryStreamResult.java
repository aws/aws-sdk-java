/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of <a>CreateDeliveryStream</a>.
 * </p>
 */
public class CreateDeliveryStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the delivery stream.
     * </p>
     */
    private String deliveryStreamARN;

    /**
     * <p>
     * The ARN of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamARN
     *        The ARN of the delivery stream.
     */

    public void setDeliveryStreamARN(String deliveryStreamARN) {
        this.deliveryStreamARN = deliveryStreamARN;
    }

    /**
     * <p>
     * The ARN of the delivery stream.
     * </p>
     * 
     * @return The ARN of the delivery stream.
     */

    public String getDeliveryStreamARN() {
        return this.deliveryStreamARN;
    }

    /**
     * <p>
     * The ARN of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamARN
     *        The ARN of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryStreamResult withDeliveryStreamARN(String deliveryStreamARN) {
        setDeliveryStreamARN(deliveryStreamARN);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeliveryStreamARN() != null)
            sb.append("DeliveryStreamARN: " + getDeliveryStreamARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeliveryStreamResult == false)
            return false;
        CreateDeliveryStreamResult other = (CreateDeliveryStreamResult) obj;
        if (other.getDeliveryStreamARN() == null ^ this.getDeliveryStreamARN() == null)
            return false;
        if (other.getDeliveryStreamARN() != null && other.getDeliveryStreamARN().equals(this.getDeliveryStreamARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStreamARN() == null) ? 0 : getDeliveryStreamARN().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeliveryStreamResult clone() {
        try {
            return (CreateDeliveryStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
