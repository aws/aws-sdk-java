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

/**
 * <p>
 * UpdateVTLDeviceTypeOutput
 * </p>
 */
public class UpdateVTLDeviceTypeResult implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the medium changer you have
     * selected.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String vTLDeviceARN;

    /**
     * The Amazon Resource Name (ARN) of the medium changer you have
     * selected.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the medium changer you have
     *         selected.
     */
    public String getVTLDeviceARN() {
        return vTLDeviceARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the medium changer you have
     * selected.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDeviceARN The Amazon Resource Name (ARN) of the medium changer you have
     *         selected.
     */
    public void setVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the medium changer you have
     * selected.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDeviceARN The Amazon Resource Name (ARN) of the medium changer you have
     *         selected.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateVTLDeviceTypeResult withVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
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
        if (getVTLDeviceARN() != null) sb.append("VTLDeviceARN: " + getVTLDeviceARN() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVTLDeviceARN() == null) ? 0 : getVTLDeviceARN().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateVTLDeviceTypeResult == false) return false;
        UpdateVTLDeviceTypeResult other = (UpdateVTLDeviceTypeResult)obj;
        
        if (other.getVTLDeviceARN() == null ^ this.getVTLDeviceARN() == null) return false;
        if (other.getVTLDeviceARN() != null && other.getVTLDeviceARN().equals(this.getVTLDeviceARN()) == false) return false; 
        return true;
    }
    
}
    