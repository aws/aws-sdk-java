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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>DeliverConfigSnapshot</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeliverConfigSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliverConfigSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery channel through which the snapshot is delivered.
     * </p>
     */
    private String deliveryChannelName;

    /**
     * <p>
     * The name of the delivery channel through which the snapshot is delivered.
     * </p>
     * 
     * @param deliveryChannelName
     *        The name of the delivery channel through which the snapshot is delivered.
     */

    public void setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
    }

    /**
     * <p>
     * The name of the delivery channel through which the snapshot is delivered.
     * </p>
     * 
     * @return The name of the delivery channel through which the snapshot is delivered.
     */

    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    /**
     * <p>
     * The name of the delivery channel through which the snapshot is delivered.
     * </p>
     * 
     * @param deliveryChannelName
     *        The name of the delivery channel through which the snapshot is delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliverConfigSnapshotRequest withDeliveryChannelName(String deliveryChannelName) {
        setDeliveryChannelName(deliveryChannelName);
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
        if (getDeliveryChannelName() != null)
            sb.append("DeliveryChannelName: ").append(getDeliveryChannelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliverConfigSnapshotRequest == false)
            return false;
        DeliverConfigSnapshotRequest other = (DeliverConfigSnapshotRequest) obj;
        if (other.getDeliveryChannelName() == null ^ this.getDeliveryChannelName() == null)
            return false;
        if (other.getDeliveryChannelName() != null && other.getDeliveryChannelName().equals(this.getDeliveryChannelName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryChannelName() == null) ? 0 : getDeliveryChannelName().hashCode());
        return hashCode;
    }

    @Override
    public DeliverConfigSnapshotRequest clone() {
        return (DeliverConfigSnapshotRequest) super.clone();
    }

}
