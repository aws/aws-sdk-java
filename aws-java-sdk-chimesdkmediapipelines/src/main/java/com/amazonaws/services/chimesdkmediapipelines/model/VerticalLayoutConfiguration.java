/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the configuration settings for a vertical layout.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/VerticalLayoutConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerticalLayoutConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets the automatic ordering of the video tiles.
     * </p>
     */
    private String tileOrder;
    /**
     * <p>
     * Sets the position of vertical tiles.
     * </p>
     */
    private String tilePosition;
    /**
     * <p>
     * The maximum number of tiles to display.
     * </p>
     */
    private Integer tileCount;
    /**
     * <p>
     * Sets the aspect ratio of the video tiles, such as 16:9.
     * </p>
     */
    private String tileAspectRatio;

    /**
     * <p>
     * Sets the automatic ordering of the video tiles.
     * </p>
     * 
     * @param tileOrder
     *        Sets the automatic ordering of the video tiles.
     * @see TileOrder
     */

    public void setTileOrder(String tileOrder) {
        this.tileOrder = tileOrder;
    }

    /**
     * <p>
     * Sets the automatic ordering of the video tiles.
     * </p>
     * 
     * @return Sets the automatic ordering of the video tiles.
     * @see TileOrder
     */

    public String getTileOrder() {
        return this.tileOrder;
    }

    /**
     * <p>
     * Sets the automatic ordering of the video tiles.
     * </p>
     * 
     * @param tileOrder
     *        Sets the automatic ordering of the video tiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TileOrder
     */

    public VerticalLayoutConfiguration withTileOrder(String tileOrder) {
        setTileOrder(tileOrder);
        return this;
    }

    /**
     * <p>
     * Sets the automatic ordering of the video tiles.
     * </p>
     * 
     * @param tileOrder
     *        Sets the automatic ordering of the video tiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TileOrder
     */

    public VerticalLayoutConfiguration withTileOrder(TileOrder tileOrder) {
        this.tileOrder = tileOrder.toString();
        return this;
    }

    /**
     * <p>
     * Sets the position of vertical tiles.
     * </p>
     * 
     * @param tilePosition
     *        Sets the position of vertical tiles.
     * @see VerticalTilePosition
     */

    public void setTilePosition(String tilePosition) {
        this.tilePosition = tilePosition;
    }

    /**
     * <p>
     * Sets the position of vertical tiles.
     * </p>
     * 
     * @return Sets the position of vertical tiles.
     * @see VerticalTilePosition
     */

    public String getTilePosition() {
        return this.tilePosition;
    }

    /**
     * <p>
     * Sets the position of vertical tiles.
     * </p>
     * 
     * @param tilePosition
     *        Sets the position of vertical tiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerticalTilePosition
     */

    public VerticalLayoutConfiguration withTilePosition(String tilePosition) {
        setTilePosition(tilePosition);
        return this;
    }

    /**
     * <p>
     * Sets the position of vertical tiles.
     * </p>
     * 
     * @param tilePosition
     *        Sets the position of vertical tiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerticalTilePosition
     */

    public VerticalLayoutConfiguration withTilePosition(VerticalTilePosition tilePosition) {
        this.tilePosition = tilePosition.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of tiles to display.
     * </p>
     * 
     * @param tileCount
     *        The maximum number of tiles to display.
     */

    public void setTileCount(Integer tileCount) {
        this.tileCount = tileCount;
    }

    /**
     * <p>
     * The maximum number of tiles to display.
     * </p>
     * 
     * @return The maximum number of tiles to display.
     */

    public Integer getTileCount() {
        return this.tileCount;
    }

    /**
     * <p>
     * The maximum number of tiles to display.
     * </p>
     * 
     * @param tileCount
     *        The maximum number of tiles to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerticalLayoutConfiguration withTileCount(Integer tileCount) {
        setTileCount(tileCount);
        return this;
    }

    /**
     * <p>
     * Sets the aspect ratio of the video tiles, such as 16:9.
     * </p>
     * 
     * @param tileAspectRatio
     *        Sets the aspect ratio of the video tiles, such as 16:9.
     */

    public void setTileAspectRatio(String tileAspectRatio) {
        this.tileAspectRatio = tileAspectRatio;
    }

    /**
     * <p>
     * Sets the aspect ratio of the video tiles, such as 16:9.
     * </p>
     * 
     * @return Sets the aspect ratio of the video tiles, such as 16:9.
     */

    public String getTileAspectRatio() {
        return this.tileAspectRatio;
    }

    /**
     * <p>
     * Sets the aspect ratio of the video tiles, such as 16:9.
     * </p>
     * 
     * @param tileAspectRatio
     *        Sets the aspect ratio of the video tiles, such as 16:9.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerticalLayoutConfiguration withTileAspectRatio(String tileAspectRatio) {
        setTileAspectRatio(tileAspectRatio);
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
        if (getTileOrder() != null)
            sb.append("TileOrder: ").append(getTileOrder()).append(",");
        if (getTilePosition() != null)
            sb.append("TilePosition: ").append(getTilePosition()).append(",");
        if (getTileCount() != null)
            sb.append("TileCount: ").append(getTileCount()).append(",");
        if (getTileAspectRatio() != null)
            sb.append("TileAspectRatio: ").append(getTileAspectRatio());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerticalLayoutConfiguration == false)
            return false;
        VerticalLayoutConfiguration other = (VerticalLayoutConfiguration) obj;
        if (other.getTileOrder() == null ^ this.getTileOrder() == null)
            return false;
        if (other.getTileOrder() != null && other.getTileOrder().equals(this.getTileOrder()) == false)
            return false;
        if (other.getTilePosition() == null ^ this.getTilePosition() == null)
            return false;
        if (other.getTilePosition() != null && other.getTilePosition().equals(this.getTilePosition()) == false)
            return false;
        if (other.getTileCount() == null ^ this.getTileCount() == null)
            return false;
        if (other.getTileCount() != null && other.getTileCount().equals(this.getTileCount()) == false)
            return false;
        if (other.getTileAspectRatio() == null ^ this.getTileAspectRatio() == null)
            return false;
        if (other.getTileAspectRatio() != null && other.getTileAspectRatio().equals(this.getTileAspectRatio()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTileOrder() == null) ? 0 : getTileOrder().hashCode());
        hashCode = prime * hashCode + ((getTilePosition() == null) ? 0 : getTilePosition().hashCode());
        hashCode = prime * hashCode + ((getTileCount() == null) ? 0 : getTileCount().hashCode());
        hashCode = prime * hashCode + ((getTileAspectRatio() == null) ? 0 : getTileAspectRatio().hashCode());
        return hashCode;
    }

    @Override
    public VerticalLayoutConfiguration clone() {
        try {
            return (VerticalLayoutConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.VerticalLayoutConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
