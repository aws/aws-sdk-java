/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

/**
 * <p>
 * The BlockDeviceMapping data type.
 * </p>
 */
public class BlockDeviceMapping {

    /**
     * The virtual name associated with the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String virtualName;

    /**
     * The name of the device within Amazon EC2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String deviceName;

    /**
     * The Elastic Block Storage volume information.
     */
    private Ebs ebs;

    /**
     * The virtual name associated with the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The virtual name associated with the device.
     */
    public String getVirtualName() {
        return virtualName;
    }
    
    /**
     * The virtual name associated with the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param virtualName The virtual name associated with the device.
     */
    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }
    
    /**
     * The virtual name associated with the device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param virtualName The virtual name associated with the device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BlockDeviceMapping withVirtualName(String virtualName) {
        this.virtualName = virtualName;
        return this;
    }
    
    
    /**
     * The name of the device within Amazon EC2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the device within Amazon EC2.
     */
    public String getDeviceName() {
        return deviceName;
    }
    
    /**
     * The name of the device within Amazon EC2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param deviceName The name of the device within Amazon EC2.
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    /**
     * The name of the device within Amazon EC2.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param deviceName The name of the device within Amazon EC2.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    
    
    /**
     * The Elastic Block Storage volume information.
     *
     * @return The Elastic Block Storage volume information.
     */
    public Ebs getEbs() {
        return ebs;
    }
    
    /**
     * The Elastic Block Storage volume information.
     *
     * @param ebs The Elastic Block Storage volume information.
     */
    public void setEbs(Ebs ebs) {
        this.ebs = ebs;
    }
    
    /**
     * The Elastic Block Storage volume information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebs The Elastic Block Storage volume information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BlockDeviceMapping withEbs(Ebs ebs) {
        this.ebs = ebs;
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
        sb.append("VirtualName: " + virtualName + ", ");
        sb.append("DeviceName: " + deviceName + ", ");
        sb.append("Ebs: " + ebs + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    