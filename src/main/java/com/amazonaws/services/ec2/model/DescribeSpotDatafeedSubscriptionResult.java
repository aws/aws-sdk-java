/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Describe Spot Datafeed Subscription Result
 */
public class DescribeSpotDatafeedSubscriptionResult implements Serializable {

    /**
     * The Spot Instance datafeed subscription.
     */
    private SpotDatafeedSubscription spotDatafeedSubscription;

    /**
     * The Spot Instance datafeed subscription.
     *
     * @return The Spot Instance datafeed subscription.
     */
    public SpotDatafeedSubscription getSpotDatafeedSubscription() {
        return spotDatafeedSubscription;
    }
    
    /**
     * The Spot Instance datafeed subscription.
     *
     * @param spotDatafeedSubscription The Spot Instance datafeed subscription.
     */
    public void setSpotDatafeedSubscription(SpotDatafeedSubscription spotDatafeedSubscription) {
        this.spotDatafeedSubscription = spotDatafeedSubscription;
    }
    
    /**
     * The Spot Instance datafeed subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotDatafeedSubscription The Spot Instance datafeed subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotDatafeedSubscriptionResult withSpotDatafeedSubscription(SpotDatafeedSubscription spotDatafeedSubscription) {
        this.spotDatafeedSubscription = spotDatafeedSubscription;
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
        if (getSpotDatafeedSubscription() != null) sb.append("SpotDatafeedSubscription: " + getSpotDatafeedSubscription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotDatafeedSubscription() == null) ? 0 : getSpotDatafeedSubscription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotDatafeedSubscriptionResult == false) return false;
        DescribeSpotDatafeedSubscriptionResult other = (DescribeSpotDatafeedSubscriptionResult)obj;
        
        if (other.getSpotDatafeedSubscription() == null ^ this.getSpotDatafeedSubscription() == null) return false;
        if (other.getSpotDatafeedSubscription() != null && other.getSpotDatafeedSubscription().equals(this.getSpotDatafeedSubscription()) == false) return false; 
        return true;
    }
    
}
    