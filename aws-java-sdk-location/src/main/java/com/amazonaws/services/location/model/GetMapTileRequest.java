/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapTile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMapTileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The map resource to retrieve the map tiles from.
     * </p>
     */
    private String mapName;
    /**
     * <p>
     * The X axis value for the map tile.
     * </p>
     */
    private String x;
    /**
     * <p>
     * The Y axis value for the map tile.
     * </p>
     */
    private String y;
    /**
     * <p>
     * The zoom value for the map tile.
     * </p>
     */
    private String z;

    /**
     * <p>
     * The map resource to retrieve the map tiles from.
     * </p>
     * 
     * @param mapName
     *        The map resource to retrieve the map tiles from.
     */

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The map resource to retrieve the map tiles from.
     * </p>
     * 
     * @return The map resource to retrieve the map tiles from.
     */

    public String getMapName() {
        return this.mapName;
    }

    /**
     * <p>
     * The map resource to retrieve the map tiles from.
     * </p>
     * 
     * @param mapName
     *        The map resource to retrieve the map tiles from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapTileRequest withMapName(String mapName) {
        setMapName(mapName);
        return this;
    }

    /**
     * <p>
     * The X axis value for the map tile.
     * </p>
     * 
     * @param x
     *        The X axis value for the map tile.
     */

    public void setX(String x) {
        this.x = x;
    }

    /**
     * <p>
     * The X axis value for the map tile.
     * </p>
     * 
     * @return The X axis value for the map tile.
     */

    public String getX() {
        return this.x;
    }

    /**
     * <p>
     * The X axis value for the map tile.
     * </p>
     * 
     * @param x
     *        The X axis value for the map tile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapTileRequest withX(String x) {
        setX(x);
        return this;
    }

    /**
     * <p>
     * The Y axis value for the map tile.
     * </p>
     * 
     * @param y
     *        The Y axis value for the map tile.
     */

    public void setY(String y) {
        this.y = y;
    }

    /**
     * <p>
     * The Y axis value for the map tile.
     * </p>
     * 
     * @return The Y axis value for the map tile.
     */

    public String getY() {
        return this.y;
    }

    /**
     * <p>
     * The Y axis value for the map tile.
     * </p>
     * 
     * @param y
     *        The Y axis value for the map tile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapTileRequest withY(String y) {
        setY(y);
        return this;
    }

    /**
     * <p>
     * The zoom value for the map tile.
     * </p>
     * 
     * @param z
     *        The zoom value for the map tile.
     */

    public void setZ(String z) {
        this.z = z;
    }

    /**
     * <p>
     * The zoom value for the map tile.
     * </p>
     * 
     * @return The zoom value for the map tile.
     */

    public String getZ() {
        return this.z;
    }

    /**
     * <p>
     * The zoom value for the map tile.
     * </p>
     * 
     * @param z
     *        The zoom value for the map tile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapTileRequest withZ(String z) {
        setZ(z);
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
        if (getMapName() != null)
            sb.append("MapName: ").append(getMapName()).append(",");
        if (getX() != null)
            sb.append("X: ").append(getX()).append(",");
        if (getY() != null)
            sb.append("Y: ").append(getY()).append(",");
        if (getZ() != null)
            sb.append("Z: ").append(getZ());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMapTileRequest == false)
            return false;
        GetMapTileRequest other = (GetMapTileRequest) obj;
        if (other.getMapName() == null ^ this.getMapName() == null)
            return false;
        if (other.getMapName() != null && other.getMapName().equals(this.getMapName()) == false)
            return false;
        if (other.getX() == null ^ this.getX() == null)
            return false;
        if (other.getX() != null && other.getX().equals(this.getX()) == false)
            return false;
        if (other.getY() == null ^ this.getY() == null)
            return false;
        if (other.getY() != null && other.getY().equals(this.getY()) == false)
            return false;
        if (other.getZ() == null ^ this.getZ() == null)
            return false;
        if (other.getZ() != null && other.getZ().equals(this.getZ()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        hashCode = prime * hashCode + ((getX() == null) ? 0 : getX().hashCode());
        hashCode = prime * hashCode + ((getY() == null) ? 0 : getY().hashCode());
        hashCode = prime * hashCode + ((getZ() == null) ? 0 : getZ().hashCode());
        return hashCode;
    }

    @Override
    public GetMapTileRequest clone() {
        return (GetMapTileRequest) super.clone();
    }

}
