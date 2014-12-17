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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#updateVTLDeviceType(UpdateVTLDeviceTypeRequest) UpdateVTLDeviceType operation}.
 * <p>
 * This operation updates the type of medium changer in a gateway-VTL.
 * When you activate a gateway-VTL, you select a medium changer type for
 * the gateway-VTL. This operation enables you to select a different type
 * of medium changer after a gateway-VTL is activated.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#updateVTLDeviceType(UpdateVTLDeviceTypeRequest)
 */
public class UpdateVTLDeviceTypeRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the medium changer you want to
     * select.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String vTLDeviceARN;

    /**
     * The type of medium changer you want to select. <p><i>Valid Values</i>:
     * "STK-L700", "AWS-Gateway-VTL"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     */
    private String deviceType;

    /**
     * The Amazon Resource Name (ARN) of the medium changer you want to
     * select.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the medium changer you want to
     *         select.
     */
    public String getVTLDeviceARN() {
        return vTLDeviceARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the medium changer you want to
     * select.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDeviceARN The Amazon Resource Name (ARN) of the medium changer you want to
     *         select.
     */
    public void setVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the medium changer you want to
     * select.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDeviceARN The Amazon Resource Name (ARN) of the medium changer you want to
     *         select.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateVTLDeviceTypeRequest withVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
        return this;
    }

    /**
     * The type of medium changer you want to select. <p><i>Valid Values</i>:
     * "STK-L700", "AWS-Gateway-VTL"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @return The type of medium changer you want to select. <p><i>Valid Values</i>:
     *         "STK-L700", "AWS-Gateway-VTL"
     */
    public String getDeviceType() {
        return deviceType;
    }
    
    /**
     * The type of medium changer you want to select. <p><i>Valid Values</i>:
     * "STK-L700", "AWS-Gateway-VTL"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @param deviceType The type of medium changer you want to select. <p><i>Valid Values</i>:
     *         "STK-L700", "AWS-Gateway-VTL"
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
    
    /**
     * The type of medium changer you want to select. <p><i>Valid Values</i>:
     * "STK-L700", "AWS-Gateway-VTL"
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @param deviceType The type of medium changer you want to select. <p><i>Valid Values</i>:
     *         "STK-L700", "AWS-Gateway-VTL"
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateVTLDeviceTypeRequest withDeviceType(String deviceType) {
        this.deviceType = deviceType;
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
        if (getVTLDeviceARN() != null) sb.append("VTLDeviceARN: " + getVTLDeviceARN() + ",");
        if (getDeviceType() != null) sb.append("DeviceType: " + getDeviceType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVTLDeviceARN() == null) ? 0 : getVTLDeviceARN().hashCode()); 
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateVTLDeviceTypeRequest == false) return false;
        UpdateVTLDeviceTypeRequest other = (UpdateVTLDeviceTypeRequest)obj;
        
        if (other.getVTLDeviceARN() == null ^ this.getVTLDeviceARN() == null) return false;
        if (other.getVTLDeviceARN() != null && other.getVTLDeviceARN().equals(this.getVTLDeviceARN()) == false) return false; 
        if (other.getDeviceType() == null ^ this.getDeviceType() == null) return false;
        if (other.getDeviceType() != null && other.getDeviceType().equals(this.getDeviceType()) == false) return false; 
        return true;
    }
    
}
    