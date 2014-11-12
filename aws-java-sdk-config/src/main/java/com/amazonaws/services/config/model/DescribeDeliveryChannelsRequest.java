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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#describeDeliveryChannels(DescribeDeliveryChannelsRequest) DescribeDeliveryChannels operation}.
 * <p>
 * Returns details about the specified delivery channel. If a delivery
 * channel is not specified, this action returns the details of all
 * delivery channels associated with the account.
 * </p>
 * <p>
 * <b>NOTE:</b> Currently, you can specify only one delivery channel per
 * account.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#describeDeliveryChannels(DescribeDeliveryChannelsRequest)
 */
public class DescribeDeliveryChannelsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A list of delivery channel names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> deliveryChannelNames;

    /**
     * A list of delivery channel names.
     *
     * @return A list of delivery channel names.
     */
    public java.util.List<String> getDeliveryChannelNames() {
        if (deliveryChannelNames == null) {
              deliveryChannelNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              deliveryChannelNames.setAutoConstruct(true);
        }
        return deliveryChannelNames;
    }
    
    /**
     * A list of delivery channel names.
     *
     * @param deliveryChannelNames A list of delivery channel names.
     */
    public void setDeliveryChannelNames(java.util.Collection<String> deliveryChannelNames) {
        if (deliveryChannelNames == null) {
            this.deliveryChannelNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> deliveryChannelNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(deliveryChannelNames.size());
        deliveryChannelNamesCopy.addAll(deliveryChannelNames);
        this.deliveryChannelNames = deliveryChannelNamesCopy;
    }
    
    /**
     * A list of delivery channel names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliveryChannelNames A list of delivery channel names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDeliveryChannelsRequest withDeliveryChannelNames(String... deliveryChannelNames) {
        if (getDeliveryChannelNames() == null) setDeliveryChannelNames(new java.util.ArrayList<String>(deliveryChannelNames.length));
        for (String value : deliveryChannelNames) {
            getDeliveryChannelNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of delivery channel names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliveryChannelNames A list of delivery channel names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDeliveryChannelsRequest withDeliveryChannelNames(java.util.Collection<String> deliveryChannelNames) {
        if (deliveryChannelNames == null) {
            this.deliveryChannelNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> deliveryChannelNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(deliveryChannelNames.size());
            deliveryChannelNamesCopy.addAll(deliveryChannelNames);
            this.deliveryChannelNames = deliveryChannelNamesCopy;
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
        if (getDeliveryChannelNames() != null) sb.append("DeliveryChannelNames: " + getDeliveryChannelNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeliveryChannelNames() == null) ? 0 : getDeliveryChannelNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDeliveryChannelsRequest == false) return false;
        DescribeDeliveryChannelsRequest other = (DescribeDeliveryChannelsRequest)obj;
        
        if (other.getDeliveryChannelNames() == null ^ this.getDeliveryChannelNames() == null) return false;
        if (other.getDeliveryChannelNames() != null && other.getDeliveryChannelNames().equals(this.getDeliveryChannelNames()) == false) return false; 
        return true;
    }
    
}
    