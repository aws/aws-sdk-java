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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the result of a successful invocation of the ListMFADevices action.
 * </p>
 */
public class ListMFADevicesResult implements Serializable {

    /**
     * A list of MFA devices.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MFADevice> mFADevices;

    /**
     * A flag that indicates whether there are more MFA devices to list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more MFA devices in the list.
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
     * A list of MFA devices.
     *
     * @return A list of MFA devices.
     */
    public java.util.List<MFADevice> getMFADevices() {
        if (mFADevices == null) {
              mFADevices = new com.amazonaws.internal.ListWithAutoConstructFlag<MFADevice>();
              mFADevices.setAutoConstruct(true);
        }
        return mFADevices;
    }
    
    /**
     * A list of MFA devices.
     *
     * @param mFADevices A list of MFA devices.
     */
    public void setMFADevices(java.util.Collection<MFADevice> mFADevices) {
        if (mFADevices == null) {
            this.mFADevices = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MFADevice> mFADevicesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MFADevice>(mFADevices.size());
        mFADevicesCopy.addAll(mFADevices);
        this.mFADevices = mFADevicesCopy;
    }
    
    /**
     * A list of MFA devices.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mFADevices A list of MFA devices.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMFADevicesResult withMFADevices(MFADevice... mFADevices) {
        if (getMFADevices() == null) setMFADevices(new java.util.ArrayList<MFADevice>(mFADevices.length));
        for (MFADevice value : mFADevices) {
            getMFADevices().add(value);
        }
        return this;
    }
    
    /**
     * A list of MFA devices.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mFADevices A list of MFA devices.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMFADevicesResult withMFADevices(java.util.Collection<MFADevice> mFADevices) {
        if (mFADevices == null) {
            this.mFADevices = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MFADevice> mFADevicesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MFADevice>(mFADevices.size());
            mFADevicesCopy.addAll(mFADevices);
            this.mFADevices = mFADevicesCopy;
        }

        return this;
    }

    /**
     * A flag that indicates whether there are more MFA devices to list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more MFA devices in the list.
     *
     * @return A flag that indicates whether there are more MFA devices to list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more MFA devices in the list.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more MFA devices to list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more MFA devices in the list.
     *
     * @param isTruncated A flag that indicates whether there are more MFA devices to list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more MFA devices in the list.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more MFA devices to list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more MFA devices in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more MFA devices to list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more MFA devices in the list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMFADevicesResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more MFA devices to list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more MFA devices in the list.
     *
     * @return A flag that indicates whether there are more MFA devices to list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more MFA devices in the list.
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
    public ListMFADevicesResult withMarker(String marker) {
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
        if (getMFADevices() != null) sb.append("MFADevices: " + getMFADevices() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMFADevices() == null) ? 0 : getMFADevices().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListMFADevicesResult == false) return false;
        ListMFADevicesResult other = (ListMFADevicesResult)obj;
        
        if (other.getMFADevices() == null ^ this.getMFADevices() == null) return false;
        if (other.getMFADevices() != null && other.getMFADevices().equals(this.getMFADevices()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    