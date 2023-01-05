/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SendDataToMulticastGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendDataToMulticastGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String id;

    private String payloadData;

    private MulticastWirelessMetadata wirelessMetadata;

    /**
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataToMulticastGroupRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param payloadData
     */

    public void setPayloadData(String payloadData) {
        this.payloadData = payloadData;
    }

    /**
     * @return
     */

    public String getPayloadData() {
        return this.payloadData;
    }

    /**
     * @param payloadData
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataToMulticastGroupRequest withPayloadData(String payloadData) {
        setPayloadData(payloadData);
        return this;
    }

    /**
     * @param wirelessMetadata
     */

    public void setWirelessMetadata(MulticastWirelessMetadata wirelessMetadata) {
        this.wirelessMetadata = wirelessMetadata;
    }

    /**
     * @return
     */

    public MulticastWirelessMetadata getWirelessMetadata() {
        return this.wirelessMetadata;
    }

    /**
     * @param wirelessMetadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataToMulticastGroupRequest withWirelessMetadata(MulticastWirelessMetadata wirelessMetadata) {
        setWirelessMetadata(wirelessMetadata);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPayloadData() != null)
            sb.append("PayloadData: ").append(getPayloadData()).append(",");
        if (getWirelessMetadata() != null)
            sb.append("WirelessMetadata: ").append(getWirelessMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendDataToMulticastGroupRequest == false)
            return false;
        SendDataToMulticastGroupRequest other = (SendDataToMulticastGroupRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPayloadData() == null ^ this.getPayloadData() == null)
            return false;
        if (other.getPayloadData() != null && other.getPayloadData().equals(this.getPayloadData()) == false)
            return false;
        if (other.getWirelessMetadata() == null ^ this.getWirelessMetadata() == null)
            return false;
        if (other.getWirelessMetadata() != null && other.getWirelessMetadata().equals(this.getWirelessMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPayloadData() == null) ? 0 : getPayloadData().hashCode());
        hashCode = prime * hashCode + ((getWirelessMetadata() == null) ? 0 : getWirelessMetadata().hashCode());
        return hashCode;
    }

    @Override
    public SendDataToMulticastGroupRequest clone() {
        return (SendDataToMulticastGroupRequest) super.clone();
    }

}
