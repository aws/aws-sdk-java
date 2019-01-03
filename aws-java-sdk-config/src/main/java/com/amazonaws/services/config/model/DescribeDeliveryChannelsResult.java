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
 * The output for the <a>DescribeDeliveryChannels</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeDeliveryChannels" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeliveryChannelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that contains the descriptions of the specified delivery channel.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DeliveryChannel> deliveryChannels;

    /**
     * <p>
     * A list that contains the descriptions of the specified delivery channel.
     * </p>
     * 
     * @return A list that contains the descriptions of the specified delivery channel.
     */

    public java.util.List<DeliveryChannel> getDeliveryChannels() {
        if (deliveryChannels == null) {
            deliveryChannels = new com.amazonaws.internal.SdkInternalList<DeliveryChannel>();
        }
        return deliveryChannels;
    }

    /**
     * <p>
     * A list that contains the descriptions of the specified delivery channel.
     * </p>
     * 
     * @param deliveryChannels
     *        A list that contains the descriptions of the specified delivery channel.
     */

    public void setDeliveryChannels(java.util.Collection<DeliveryChannel> deliveryChannels) {
        if (deliveryChannels == null) {
            this.deliveryChannels = null;
            return;
        }

        this.deliveryChannels = new com.amazonaws.internal.SdkInternalList<DeliveryChannel>(deliveryChannels);
    }

    /**
     * <p>
     * A list that contains the descriptions of the specified delivery channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeliveryChannels(java.util.Collection)} or {@link #withDeliveryChannels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deliveryChannels
     *        A list that contains the descriptions of the specified delivery channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveryChannelsResult withDeliveryChannels(DeliveryChannel... deliveryChannels) {
        if (this.deliveryChannels == null) {
            setDeliveryChannels(new com.amazonaws.internal.SdkInternalList<DeliveryChannel>(deliveryChannels.length));
        }
        for (DeliveryChannel ele : deliveryChannels) {
            this.deliveryChannels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains the descriptions of the specified delivery channel.
     * </p>
     * 
     * @param deliveryChannels
     *        A list that contains the descriptions of the specified delivery channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveryChannelsResult withDeliveryChannels(java.util.Collection<DeliveryChannel> deliveryChannels) {
        setDeliveryChannels(deliveryChannels);
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
        if (getDeliveryChannels() != null)
            sb.append("DeliveryChannels: ").append(getDeliveryChannels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeliveryChannelsResult == false)
            return false;
        DescribeDeliveryChannelsResult other = (DescribeDeliveryChannelsResult) obj;
        if (other.getDeliveryChannels() == null ^ this.getDeliveryChannels() == null)
            return false;
        if (other.getDeliveryChannels() != null && other.getDeliveryChannels().equals(this.getDeliveryChannels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryChannels() == null) ? 0 : getDeliveryChannels().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeliveryChannelsResult clone() {
        try {
            return (DescribeDeliveryChannelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
