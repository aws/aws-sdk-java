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
package com.amazonaws.services.identitymanagement.model;

/**
 * <p>
 * Contains the result of a successful invocation of the
 * ListVirtualMFADevices action.
 * </p>
 */
public class ListVirtualMFADevicesResult {

    private java.util.List<VirtualMFADevice> virtualMFADevices;

    /**
     * A flag that indicates whether there are more items to list. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items
     * the list.
     */
    private Boolean isTruncated;

    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     */
    private String marker;

    /**
     * Returns the value of the VirtualMFADevices property for this object.
     *
     * @return The value of the VirtualMFADevices property for this object.
     */
    public java.util.List<VirtualMFADevice> getVirtualMFADevices() {
        
        if (virtualMFADevices == null) {
            virtualMFADevices = new java.util.ArrayList<VirtualMFADevice>();
        }
        return virtualMFADevices;
    }
    
    /**
     * Sets the value of the VirtualMFADevices property for this object.
     *
     * @param virtualMFADevices The new value for the VirtualMFADevices property for this object.
     */
    public void setVirtualMFADevices(java.util.Collection<VirtualMFADevice> virtualMFADevices) {
        java.util.List<VirtualMFADevice> virtualMFADevicesCopy = new java.util.ArrayList<VirtualMFADevice>();
        if (virtualMFADevices != null) {
            virtualMFADevicesCopy.addAll(virtualMFADevices);
        }
        this.virtualMFADevices = virtualMFADevicesCopy;
    }
    
    /**
     * Sets the value of the VirtualMFADevices property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualMFADevices The new value for the VirtualMFADevices property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListVirtualMFADevicesResult withVirtualMFADevices(VirtualMFADevice... virtualMFADevices) {
        if (getVirtualMFADevices() == null) setVirtualMFADevices(new java.util.ArrayList<VirtualMFADevice>());
        for (VirtualMFADevice value : virtualMFADevices) {
            getVirtualMFADevices().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the VirtualMFADevices property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualMFADevices The new value for the VirtualMFADevices property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListVirtualMFADevicesResult withVirtualMFADevices(java.util.Collection<VirtualMFADevice> virtualMFADevices) {
        java.util.List<VirtualMFADevice> virtualMFADevicesCopy = new java.util.ArrayList<VirtualMFADevice>();
        if (virtualMFADevices != null) {
            virtualMFADevicesCopy.addAll(virtualMFADevices);
        }
        this.virtualMFADevices = virtualMFADevicesCopy;

        return this;
    }
    
    /**
     * A flag that indicates whether there are more items to list. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items
     * the list.
     *
     * @return A flag that indicates whether there are more items to list. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more items
     *         the list.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more items to list. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items
     * the list.
     *
     * @param isTruncated A flag that indicates whether there are more items to list. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more items
     *         the list.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more items to list. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items
     * the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more items to list. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more items
     *         the list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListVirtualMFADevicesResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    
    
    /**
     * A flag that indicates whether there are more items to list. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items
     * the list.
     *
     * @return A flag that indicates whether there are more items to list. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more items
     *         the list.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @return If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListVirtualMFADevicesResult withMarker(String marker) {
        this.marker = marker;
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
        sb.append("VirtualMFADevices: " + virtualMFADevices + ", ");
        sb.append("IsTruncated: " + isTruncated + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    