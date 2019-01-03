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

/**
 * <p>
 * The output for the <a>DescribeDeliveryChannelStatus</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeDeliveryChannelStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeliveryChannelStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list that contains the status of a specified delivery channel.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DeliveryChannelStatus> deliveryChannelsStatus;

    /**
     * <p>
     * A list that contains the status of a specified delivery channel.
     * </p>
     * 
     * @return A list that contains the status of a specified delivery channel.
     */

    public java.util.List<DeliveryChannelStatus> getDeliveryChannelsStatus() {
        if (deliveryChannelsStatus == null) {
            deliveryChannelsStatus = new com.amazonaws.internal.SdkInternalList<DeliveryChannelStatus>();
        }
        return deliveryChannelsStatus;
    }

    /**
     * <p>
     * A list that contains the status of a specified delivery channel.
     * </p>
     * 
     * @param deliveryChannelsStatus
     *        A list that contains the status of a specified delivery channel.
     */

    public void setDeliveryChannelsStatus(java.util.Collection<DeliveryChannelStatus> deliveryChannelsStatus) {
        if (deliveryChannelsStatus == null) {
            this.deliveryChannelsStatus = null;
            return;
        }

        this.deliveryChannelsStatus = new com.amazonaws.internal.SdkInternalList<DeliveryChannelStatus>(deliveryChannelsStatus);
    }

    /**
     * <p>
     * A list that contains the status of a specified delivery channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeliveryChannelsStatus(java.util.Collection)} or
     * {@link #withDeliveryChannelsStatus(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deliveryChannelsStatus
     *        A list that contains the status of a specified delivery channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveryChannelStatusResult withDeliveryChannelsStatus(DeliveryChannelStatus... deliveryChannelsStatus) {
        if (this.deliveryChannelsStatus == null) {
            setDeliveryChannelsStatus(new com.amazonaws.internal.SdkInternalList<DeliveryChannelStatus>(deliveryChannelsStatus.length));
        }
        for (DeliveryChannelStatus ele : deliveryChannelsStatus) {
            this.deliveryChannelsStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains the status of a specified delivery channel.
     * </p>
     * 
     * @param deliveryChannelsStatus
     *        A list that contains the status of a specified delivery channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveryChannelStatusResult withDeliveryChannelsStatus(java.util.Collection<DeliveryChannelStatus> deliveryChannelsStatus) {
        setDeliveryChannelsStatus(deliveryChannelsStatus);
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
        if (getDeliveryChannelsStatus() != null)
            sb.append("DeliveryChannelsStatus: ").append(getDeliveryChannelsStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeliveryChannelStatusResult == false)
            return false;
        DescribeDeliveryChannelStatusResult other = (DescribeDeliveryChannelStatusResult) obj;
        if (other.getDeliveryChannelsStatus() == null ^ this.getDeliveryChannelsStatus() == null)
            return false;
        if (other.getDeliveryChannelsStatus() != null && other.getDeliveryChannelsStatus().equals(this.getDeliveryChannelsStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryChannelsStatus() == null) ? 0 : getDeliveryChannelsStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeliveryChannelStatusResult clone() {
        try {
            return (DescribeDeliveryChannelStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
