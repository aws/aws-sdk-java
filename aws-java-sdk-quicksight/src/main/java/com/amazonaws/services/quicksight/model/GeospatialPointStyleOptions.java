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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The point style of the geospatial map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GeospatialPointStyleOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeospatialPointStyleOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The selected point styles (point, cluster) of the geospatial map.
     * </p>
     */
    private String selectedPointStyle;
    /**
     * <p>
     * The cluster marker configuration of the geospatial point style.
     * </p>
     */
    private ClusterMarkerConfiguration clusterMarkerConfiguration;

    /**
     * <p>
     * The selected point styles (point, cluster) of the geospatial map.
     * </p>
     * 
     * @param selectedPointStyle
     *        The selected point styles (point, cluster) of the geospatial map.
     * @see GeospatialSelectedPointStyle
     */

    public void setSelectedPointStyle(String selectedPointStyle) {
        this.selectedPointStyle = selectedPointStyle;
    }

    /**
     * <p>
     * The selected point styles (point, cluster) of the geospatial map.
     * </p>
     * 
     * @return The selected point styles (point, cluster) of the geospatial map.
     * @see GeospatialSelectedPointStyle
     */

    public String getSelectedPointStyle() {
        return this.selectedPointStyle;
    }

    /**
     * <p>
     * The selected point styles (point, cluster) of the geospatial map.
     * </p>
     * 
     * @param selectedPointStyle
     *        The selected point styles (point, cluster) of the geospatial map.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeospatialSelectedPointStyle
     */

    public GeospatialPointStyleOptions withSelectedPointStyle(String selectedPointStyle) {
        setSelectedPointStyle(selectedPointStyle);
        return this;
    }

    /**
     * <p>
     * The selected point styles (point, cluster) of the geospatial map.
     * </p>
     * 
     * @param selectedPointStyle
     *        The selected point styles (point, cluster) of the geospatial map.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeospatialSelectedPointStyle
     */

    public GeospatialPointStyleOptions withSelectedPointStyle(GeospatialSelectedPointStyle selectedPointStyle) {
        this.selectedPointStyle = selectedPointStyle.toString();
        return this;
    }

    /**
     * <p>
     * The cluster marker configuration of the geospatial point style.
     * </p>
     * 
     * @param clusterMarkerConfiguration
     *        The cluster marker configuration of the geospatial point style.
     */

    public void setClusterMarkerConfiguration(ClusterMarkerConfiguration clusterMarkerConfiguration) {
        this.clusterMarkerConfiguration = clusterMarkerConfiguration;
    }

    /**
     * <p>
     * The cluster marker configuration of the geospatial point style.
     * </p>
     * 
     * @return The cluster marker configuration of the geospatial point style.
     */

    public ClusterMarkerConfiguration getClusterMarkerConfiguration() {
        return this.clusterMarkerConfiguration;
    }

    /**
     * <p>
     * The cluster marker configuration of the geospatial point style.
     * </p>
     * 
     * @param clusterMarkerConfiguration
     *        The cluster marker configuration of the geospatial point style.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialPointStyleOptions withClusterMarkerConfiguration(ClusterMarkerConfiguration clusterMarkerConfiguration) {
        setClusterMarkerConfiguration(clusterMarkerConfiguration);
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
        if (getSelectedPointStyle() != null)
            sb.append("SelectedPointStyle: ").append(getSelectedPointStyle()).append(",");
        if (getClusterMarkerConfiguration() != null)
            sb.append("ClusterMarkerConfiguration: ").append(getClusterMarkerConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeospatialPointStyleOptions == false)
            return false;
        GeospatialPointStyleOptions other = (GeospatialPointStyleOptions) obj;
        if (other.getSelectedPointStyle() == null ^ this.getSelectedPointStyle() == null)
            return false;
        if (other.getSelectedPointStyle() != null && other.getSelectedPointStyle().equals(this.getSelectedPointStyle()) == false)
            return false;
        if (other.getClusterMarkerConfiguration() == null ^ this.getClusterMarkerConfiguration() == null)
            return false;
        if (other.getClusterMarkerConfiguration() != null && other.getClusterMarkerConfiguration().equals(this.getClusterMarkerConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectedPointStyle() == null) ? 0 : getSelectedPointStyle().hashCode());
        hashCode = prime * hashCode + ((getClusterMarkerConfiguration() == null) ? 0 : getClusterMarkerConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GeospatialPointStyleOptions clone() {
        try {
            return (GeospatialPointStyleOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GeospatialPointStyleOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
