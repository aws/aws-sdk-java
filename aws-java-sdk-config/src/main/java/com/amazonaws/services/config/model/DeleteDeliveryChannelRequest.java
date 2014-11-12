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
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#deleteDeliveryChannel(DeleteDeliveryChannelRequest) DeleteDeliveryChannel operation}.
 * <p>
 * Deletes the specified delivery channel.
 * </p>
 * <p>
 * The delivery channel cannot be deleted if it is the only delivery
 * channel and the configuration recorder is still running. To delete the
 * delivery channel, stop the running configuration recorder using the
 * StopConfigurationRecorder action.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#deleteDeliveryChannel(DeleteDeliveryChannelRequest)
 */
public class DeleteDeliveryChannelRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the delivery channel to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String deliveryChannelName;

    /**
     * The name of the delivery channel to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the delivery channel to delete.
     */
    public String getDeliveryChannelName() {
        return deliveryChannelName;
    }
    
    /**
     * The name of the delivery channel to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param deliveryChannelName The name of the delivery channel to delete.
     */
    public void setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
    }
    
    /**
     * The name of the delivery channel to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param deliveryChannelName The name of the delivery channel to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteDeliveryChannelRequest withDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
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
        if (getDeliveryChannelName() != null) sb.append("DeliveryChannelName: " + getDeliveryChannelName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeliveryChannelName() == null) ? 0 : getDeliveryChannelName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteDeliveryChannelRequest == false) return false;
        DeleteDeliveryChannelRequest other = (DeleteDeliveryChannelRequest)obj;
        
        if (other.getDeliveryChannelName() == null ^ this.getDeliveryChannelName() == null) return false;
        if (other.getDeliveryChannelName() != null && other.getDeliveryChannelName().equals(this.getDeliveryChannelName()) == false) return false; 
        return true;
    }
    
}
    