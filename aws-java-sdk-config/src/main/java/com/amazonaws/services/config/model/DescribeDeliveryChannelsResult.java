/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the DescribeDeliveryChannels action.
 * </p>
 */
public class DescribeDeliveryChannelsResult implements Serializable {

    /**
     * A list that contains the descriptions of the specified delivery
     * channel.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DeliveryChannel> deliveryChannels;

    /**
     * A list that contains the descriptions of the specified delivery
     * channel.
     *
     * @return A list that contains the descriptions of the specified delivery
     *         channel.
     */
    public java.util.List<DeliveryChannel> getDeliveryChannels() {
        if (deliveryChannels == null) {
              deliveryChannels = new com.amazonaws.internal.ListWithAutoConstructFlag<DeliveryChannel>();
              deliveryChannels.setAutoConstruct(true);
        }
        return deliveryChannels;
    }
    
    /**
     * A list that contains the descriptions of the specified delivery
     * channel.
     *
     * @param deliveryChannels A list that contains the descriptions of the specified delivery
     *         channel.
     */
    public void setDeliveryChannels(java.util.Collection<DeliveryChannel> deliveryChannels) {
        if (deliveryChannels == null) {
            this.deliveryChannels = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DeliveryChannel> deliveryChannelsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DeliveryChannel>(deliveryChannels.size());
        deliveryChannelsCopy.addAll(deliveryChannels);
        this.deliveryChannels = deliveryChannelsCopy;
    }
    
    /**
     * A list that contains the descriptions of the specified delivery
     * channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliveryChannels A list that contains the descriptions of the specified delivery
     *         channel.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDeliveryChannelsResult withDeliveryChannels(DeliveryChannel... deliveryChannels) {
        if (getDeliveryChannels() == null) setDeliveryChannels(new java.util.ArrayList<DeliveryChannel>(deliveryChannels.length));
        for (DeliveryChannel value : deliveryChannels) {
            getDeliveryChannels().add(value);
        }
        return this;
    }
    
    /**
     * A list that contains the descriptions of the specified delivery
     * channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliveryChannels A list that contains the descriptions of the specified delivery
     *         channel.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDeliveryChannelsResult withDeliveryChannels(java.util.Collection<DeliveryChannel> deliveryChannels) {
        if (deliveryChannels == null) {
            this.deliveryChannels = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DeliveryChannel> deliveryChannelsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DeliveryChannel>(deliveryChannels.size());
            deliveryChannelsCopy.addAll(deliveryChannels);
            this.deliveryChannels = deliveryChannelsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeliveryChannels() != null) sb.append("DeliveryChannels: " + getDeliveryChannels() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeliveryChannels() == null) ? 0 : getDeliveryChannels().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDeliveryChannelsResult == false) return false;
        DescribeDeliveryChannelsResult other = (DescribeDeliveryChannelsResult)obj;
        
        if (other.getDeliveryChannels() == null ^ this.getDeliveryChannels() == null) return false;
        if (other.getDeliveryChannels() != null && other.getDeliveryChannels().equals(this.getDeliveryChannels()) == false) return false; 
        return true;
    }
    
}
    