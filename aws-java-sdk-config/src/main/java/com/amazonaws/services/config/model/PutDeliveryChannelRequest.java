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
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#putDeliveryChannel(PutDeliveryChannelRequest) PutDeliveryChannel operation}.
 * <p>
 * Creates a new delivery channel object to deliver the configuration
 * information to an Amazon S3 bucket, and to an Amazon SNS topic.
 * </p>
 * <p>
 * You can use this action to change the Amazon S3 bucket or an Amazon
 * SNS topic of the existing delivery channel. To change the Amazon S3
 * bucket or an Amazon SNS topic, call this action and specify the
 * changed values for the S3 bucket and the SNS topic. If you specify a
 * different value for either the S3 bucket or the SNS topic, this action
 * will keep the existing value for the parameter that is not changed.
 * </p>
 * <p>
 * <b>NOTE:</b> Currently, you can specify only one delivery channel per
 * account.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#putDeliveryChannel(PutDeliveryChannelRequest)
 */
public class PutDeliveryChannelRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The configuration delivery channel object that delivers the
     * configuration information to an Amazon S3 bucket, and to an Amazon SNS
     * topic.
     */
    private DeliveryChannel deliveryChannel;

    /**
     * The configuration delivery channel object that delivers the
     * configuration information to an Amazon S3 bucket, and to an Amazon SNS
     * topic.
     *
     * @return The configuration delivery channel object that delivers the
     *         configuration information to an Amazon S3 bucket, and to an Amazon SNS
     *         topic.
     */
    public DeliveryChannel getDeliveryChannel() {
        return deliveryChannel;
    }
    
    /**
     * The configuration delivery channel object that delivers the
     * configuration information to an Amazon S3 bucket, and to an Amazon SNS
     * topic.
     *
     * @param deliveryChannel The configuration delivery channel object that delivers the
     *         configuration information to an Amazon S3 bucket, and to an Amazon SNS
     *         topic.
     */
    public void setDeliveryChannel(DeliveryChannel deliveryChannel) {
        this.deliveryChannel = deliveryChannel;
    }
    
    /**
     * The configuration delivery channel object that delivers the
     * configuration information to an Amazon S3 bucket, and to an Amazon SNS
     * topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliveryChannel The configuration delivery channel object that delivers the
     *         configuration information to an Amazon S3 bucket, and to an Amazon SNS
     *         topic.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutDeliveryChannelRequest withDeliveryChannel(DeliveryChannel deliveryChannel) {
        this.deliveryChannel = deliveryChannel;
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
        if (getDeliveryChannel() != null) sb.append("DeliveryChannel: " + getDeliveryChannel() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeliveryChannel() == null) ? 0 : getDeliveryChannel().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutDeliveryChannelRequest == false) return false;
        PutDeliveryChannelRequest other = (PutDeliveryChannelRequest)obj;
        
        if (other.getDeliveryChannel() == null ^ this.getDeliveryChannel() == null) return false;
        if (other.getDeliveryChannel() != null && other.getDeliveryChannel().equals(this.getDeliveryChannel()) == false) return false; 
        return true;
    }
    
}
    