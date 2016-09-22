/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * 
 */
public class ListVolumesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String gatewayARN;

    private String marker;

    private com.amazonaws.internal.SdkInternalList<VolumeInfo> volumeInfos;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVolumesResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * @param marker
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * @return
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * @param marker
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVolumesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<VolumeInfo> getVolumeInfos() {
        if (volumeInfos == null) {
            volumeInfos = new com.amazonaws.internal.SdkInternalList<VolumeInfo>();
        }
        return volumeInfos;
    }

    /**
     * @param volumeInfos
     */

    public void setVolumeInfos(java.util.Collection<VolumeInfo> volumeInfos) {
        if (volumeInfos == null) {
            this.volumeInfos = null;
            return;
        }

        this.volumeInfos = new com.amazonaws.internal.SdkInternalList<VolumeInfo>(volumeInfos);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeInfos(java.util.Collection)} or {@link #withVolumeInfos(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumeInfos
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVolumesResult withVolumeInfos(VolumeInfo... volumeInfos) {
        if (this.volumeInfos == null) {
            setVolumeInfos(new com.amazonaws.internal.SdkInternalList<VolumeInfo>(volumeInfos.length));
        }
        for (VolumeInfo ele : volumeInfos) {
            this.volumeInfos.add(ele);
        }
        return this;
    }

    /**
     * @param volumeInfos
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVolumesResult withVolumeInfos(java.util.Collection<VolumeInfo> volumeInfos) {
        setVolumeInfos(volumeInfos);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getVolumeInfos() != null)
            sb.append("VolumeInfos: " + getVolumeInfos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVolumesResult == false)
            return false;
        ListVolumesResult other = (ListVolumesResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getVolumeInfos() == null ^ this.getVolumeInfos() == null)
            return false;
        if (other.getVolumeInfos() != null && other.getVolumeInfos().equals(this.getVolumeInfos()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getVolumeInfos() == null) ? 0 : getVolumeInfos().hashCode());
        return hashCode;
    }

    @Override
    public ListVolumesResult clone() {
        try {
            return (ListVolumesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
