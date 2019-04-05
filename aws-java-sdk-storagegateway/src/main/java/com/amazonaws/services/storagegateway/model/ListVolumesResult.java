/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListVolumesOutput$Marker</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListVolumesOutput$VolumeInfos</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListVolumes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVolumesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * Use the marker in your next request to continue pagination of iSCSI volumes. If there are no more volumes to
     * list, this field does not appear in the response body.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * An array of <a>VolumeInfo</a> objects, where each object describes an iSCSI volume. If no volumes are defined for
     * the gateway, then <code>VolumeInfos</code> is an empty array "[]".
     * </p>
     */
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
     * <p>
     * Use the marker in your next request to continue pagination of iSCSI volumes. If there are no more volumes to
     * list, this field does not appear in the response body.
     * </p>
     * 
     * @param marker
     *        Use the marker in your next request to continue pagination of iSCSI volumes. If there are no more volumes
     *        to list, this field does not appear in the response body.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use the marker in your next request to continue pagination of iSCSI volumes. If there are no more volumes to
     * list, this field does not appear in the response body.
     * </p>
     * 
     * @return Use the marker in your next request to continue pagination of iSCSI volumes. If there are no more volumes
     *         to list, this field does not appear in the response body.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use the marker in your next request to continue pagination of iSCSI volumes. If there are no more volumes to
     * list, this field does not appear in the response body.
     * </p>
     * 
     * @param marker
     *        Use the marker in your next request to continue pagination of iSCSI volumes. If there are no more volumes
     *        to list, this field does not appear in the response body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVolumesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * An array of <a>VolumeInfo</a> objects, where each object describes an iSCSI volume. If no volumes are defined for
     * the gateway, then <code>VolumeInfos</code> is an empty array "[]".
     * </p>
     * 
     * @return An array of <a>VolumeInfo</a> objects, where each object describes an iSCSI volume. If no volumes are
     *         defined for the gateway, then <code>VolumeInfos</code> is an empty array "[]".
     */

    public java.util.List<VolumeInfo> getVolumeInfos() {
        if (volumeInfos == null) {
            volumeInfos = new com.amazonaws.internal.SdkInternalList<VolumeInfo>();
        }
        return volumeInfos;
    }

    /**
     * <p>
     * An array of <a>VolumeInfo</a> objects, where each object describes an iSCSI volume. If no volumes are defined for
     * the gateway, then <code>VolumeInfos</code> is an empty array "[]".
     * </p>
     * 
     * @param volumeInfos
     *        An array of <a>VolumeInfo</a> objects, where each object describes an iSCSI volume. If no volumes are
     *        defined for the gateway, then <code>VolumeInfos</code> is an empty array "[]".
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
     * An array of <a>VolumeInfo</a> objects, where each object describes an iSCSI volume. If no volumes are defined for
     * the gateway, then <code>VolumeInfos</code> is an empty array "[]".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeInfos(java.util.Collection)} or {@link #withVolumeInfos(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumeInfos
     *        An array of <a>VolumeInfo</a> objects, where each object describes an iSCSI volume. If no volumes are
     *        defined for the gateway, then <code>VolumeInfos</code> is an empty array "[]".
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
     * <p>
     * An array of <a>VolumeInfo</a> objects, where each object describes an iSCSI volume. If no volumes are defined for
     * the gateway, then <code>VolumeInfos</code> is an empty array "[]".
     * </p>
     * 
     * @param volumeInfos
     *        An array of <a>VolumeInfo</a> objects, where each object describes an iSCSI volume. If no volumes are
     *        defined for the gateway, then <code>VolumeInfos</code> is an empty array "[]".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVolumesResult withVolumeInfos(java.util.Collection<VolumeInfo> volumeInfos) {
        setVolumeInfos(volumeInfos);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getVolumeInfos() != null)
            sb.append("VolumeInfos: ").append(getVolumeInfos());
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
