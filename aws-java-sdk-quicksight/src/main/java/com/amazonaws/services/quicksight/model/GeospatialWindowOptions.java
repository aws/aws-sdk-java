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
 * The window options of the geospatial map visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GeospatialWindowOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeospatialWindowOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bounds options (north, south, west, east) of the geospatial window options.
     * </p>
     */
    private GeospatialCoordinateBounds bounds;
    /**
     * <p>
     * The map zoom modes (manual, auto) of the geospatial window options.
     * </p>
     */
    private String mapZoomMode;

    /**
     * <p>
     * The bounds options (north, south, west, east) of the geospatial window options.
     * </p>
     * 
     * @param bounds
     *        The bounds options (north, south, west, east) of the geospatial window options.
     */

    public void setBounds(GeospatialCoordinateBounds bounds) {
        this.bounds = bounds;
    }

    /**
     * <p>
     * The bounds options (north, south, west, east) of the geospatial window options.
     * </p>
     * 
     * @return The bounds options (north, south, west, east) of the geospatial window options.
     */

    public GeospatialCoordinateBounds getBounds() {
        return this.bounds;
    }

    /**
     * <p>
     * The bounds options (north, south, west, east) of the geospatial window options.
     * </p>
     * 
     * @param bounds
     *        The bounds options (north, south, west, east) of the geospatial window options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialWindowOptions withBounds(GeospatialCoordinateBounds bounds) {
        setBounds(bounds);
        return this;
    }

    /**
     * <p>
     * The map zoom modes (manual, auto) of the geospatial window options.
     * </p>
     * 
     * @param mapZoomMode
     *        The map zoom modes (manual, auto) of the geospatial window options.
     * @see MapZoomMode
     */

    public void setMapZoomMode(String mapZoomMode) {
        this.mapZoomMode = mapZoomMode;
    }

    /**
     * <p>
     * The map zoom modes (manual, auto) of the geospatial window options.
     * </p>
     * 
     * @return The map zoom modes (manual, auto) of the geospatial window options.
     * @see MapZoomMode
     */

    public String getMapZoomMode() {
        return this.mapZoomMode;
    }

    /**
     * <p>
     * The map zoom modes (manual, auto) of the geospatial window options.
     * </p>
     * 
     * @param mapZoomMode
     *        The map zoom modes (manual, auto) of the geospatial window options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MapZoomMode
     */

    public GeospatialWindowOptions withMapZoomMode(String mapZoomMode) {
        setMapZoomMode(mapZoomMode);
        return this;
    }

    /**
     * <p>
     * The map zoom modes (manual, auto) of the geospatial window options.
     * </p>
     * 
     * @param mapZoomMode
     *        The map zoom modes (manual, auto) of the geospatial window options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MapZoomMode
     */

    public GeospatialWindowOptions withMapZoomMode(MapZoomMode mapZoomMode) {
        this.mapZoomMode = mapZoomMode.toString();
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
        if (getBounds() != null)
            sb.append("Bounds: ").append(getBounds()).append(",");
        if (getMapZoomMode() != null)
            sb.append("MapZoomMode: ").append(getMapZoomMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeospatialWindowOptions == false)
            return false;
        GeospatialWindowOptions other = (GeospatialWindowOptions) obj;
        if (other.getBounds() == null ^ this.getBounds() == null)
            return false;
        if (other.getBounds() != null && other.getBounds().equals(this.getBounds()) == false)
            return false;
        if (other.getMapZoomMode() == null ^ this.getMapZoomMode() == null)
            return false;
        if (other.getMapZoomMode() != null && other.getMapZoomMode().equals(this.getMapZoomMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBounds() == null) ? 0 : getBounds().hashCode());
        hashCode = prime * hashCode + ((getMapZoomMode() == null) ? 0 : getMapZoomMode().hashCode());
        return hashCode;
    }

    @Override
    public GeospatialWindowOptions clone() {
        try {
            return (GeospatialWindowOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GeospatialWindowOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
