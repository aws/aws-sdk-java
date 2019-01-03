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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterTracks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterTracksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of maintenance tracks output by the <code>DescribeClusterTracks</code> operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MaintenanceTrack> maintenanceTracks;
    /**
     * <p>
     * The starting point to return a set of response tracklist records. You can retrieve the next set of response
     * records by providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of maintenance tracks output by the <code>DescribeClusterTracks</code> operation.
     * </p>
     * 
     * @return A list of maintenance tracks output by the <code>DescribeClusterTracks</code> operation.
     */

    public java.util.List<MaintenanceTrack> getMaintenanceTracks() {
        if (maintenanceTracks == null) {
            maintenanceTracks = new com.amazonaws.internal.SdkInternalList<MaintenanceTrack>();
        }
        return maintenanceTracks;
    }

    /**
     * <p>
     * A list of maintenance tracks output by the <code>DescribeClusterTracks</code> operation.
     * </p>
     * 
     * @param maintenanceTracks
     *        A list of maintenance tracks output by the <code>DescribeClusterTracks</code> operation.
     */

    public void setMaintenanceTracks(java.util.Collection<MaintenanceTrack> maintenanceTracks) {
        if (maintenanceTracks == null) {
            this.maintenanceTracks = null;
            return;
        }

        this.maintenanceTracks = new com.amazonaws.internal.SdkInternalList<MaintenanceTrack>(maintenanceTracks);
    }

    /**
     * <p>
     * A list of maintenance tracks output by the <code>DescribeClusterTracks</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMaintenanceTracks(java.util.Collection)} or {@link #withMaintenanceTracks(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param maintenanceTracks
     *        A list of maintenance tracks output by the <code>DescribeClusterTracks</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterTracksResult withMaintenanceTracks(MaintenanceTrack... maintenanceTracks) {
        if (this.maintenanceTracks == null) {
            setMaintenanceTracks(new com.amazonaws.internal.SdkInternalList<MaintenanceTrack>(maintenanceTracks.length));
        }
        for (MaintenanceTrack ele : maintenanceTracks) {
            this.maintenanceTracks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of maintenance tracks output by the <code>DescribeClusterTracks</code> operation.
     * </p>
     * 
     * @param maintenanceTracks
     *        A list of maintenance tracks output by the <code>DescribeClusterTracks</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterTracksResult withMaintenanceTracks(java.util.Collection<MaintenanceTrack> maintenanceTracks) {
        setMaintenanceTracks(maintenanceTracks);
        return this;
    }

    /**
     * <p>
     * The starting point to return a set of response tracklist records. You can retrieve the next set of response
     * records by providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        The starting point to return a set of response tracklist records. You can retrieve the next set of
     *        response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *        the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The starting point to return a set of response tracklist records. You can retrieve the next set of response
     * records by providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @return The starting point to return a set of response tracklist records. You can retrieve the next set of
     *         response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *         the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The starting point to return a set of response tracklist records. You can retrieve the next set of response
     * records by providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        The starting point to return a set of response tracklist records. You can retrieve the next set of
     *        response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterTracksResult withMarker(String marker) {
        setMarker(marker);
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
        if (getMaintenanceTracks() != null)
            sb.append("MaintenanceTracks: ").append(getMaintenanceTracks()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterTracksResult == false)
            return false;
        DescribeClusterTracksResult other = (DescribeClusterTracksResult) obj;
        if (other.getMaintenanceTracks() == null ^ this.getMaintenanceTracks() == null)
            return false;
        if (other.getMaintenanceTracks() != null && other.getMaintenanceTracks().equals(this.getMaintenanceTracks()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaintenanceTracks() == null) ? 0 : getMaintenanceTracks().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterTracksResult clone() {
        try {
            return (DescribeClusterTracksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
