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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetDeliverySource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeliverySourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure containing information about the delivery source.
     * </p>
     */
    private DeliverySource deliverySource;

    /**
     * <p>
     * A structure containing information about the delivery source.
     * </p>
     * 
     * @param deliverySource
     *        A structure containing information about the delivery source.
     */

    public void setDeliverySource(DeliverySource deliverySource) {
        this.deliverySource = deliverySource;
    }

    /**
     * <p>
     * A structure containing information about the delivery source.
     * </p>
     * 
     * @return A structure containing information about the delivery source.
     */

    public DeliverySource getDeliverySource() {
        return this.deliverySource;
    }

    /**
     * <p>
     * A structure containing information about the delivery source.
     * </p>
     * 
     * @param deliverySource
     *        A structure containing information about the delivery source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverySourceResult withDeliverySource(DeliverySource deliverySource) {
        setDeliverySource(deliverySource);
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
        if (getDeliverySource() != null)
            sb.append("DeliverySource: ").append(getDeliverySource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeliverySourceResult == false)
            return false;
        GetDeliverySourceResult other = (GetDeliverySourceResult) obj;
        if (other.getDeliverySource() == null ^ this.getDeliverySource() == null)
            return false;
        if (other.getDeliverySource() != null && other.getDeliverySource().equals(this.getDeliverySource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliverySource() == null) ? 0 : getDeliverySource().hashCode());
        return hashCode;
    }

    @Override
    public GetDeliverySourceResult clone() {
        try {
            return (GetDeliverySourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
