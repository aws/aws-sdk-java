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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The number of worlds that will be created. You can configure the number of unique floorplans and the number of unique
 * interiors for each floor plan. For example, if you want 1 world with 20 unique interiors, you set
 * <code>floorplanCount = 1</code> and <code>interiorCountPerFloorplan = 20</code>. This will result in 20 worlds (
 * <code>floorplanCount</code> * <code>interiorCountPerFloorplan)</code>.
 * </p>
 * <p>
 * If you set <code>floorplanCount = 4</code> and <code>interiorCountPerFloorplan = 5</code>, there will be 20 worlds
 * with 5 unique floor plans.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/WorldCount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorldCount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of unique floorplans.
     * </p>
     */
    private Integer floorplanCount;
    /**
     * <p>
     * The number of unique interiors per floorplan.
     * </p>
     */
    private Integer interiorCountPerFloorplan;

    /**
     * <p>
     * The number of unique floorplans.
     * </p>
     * 
     * @param floorplanCount
     *        The number of unique floorplans.
     */

    public void setFloorplanCount(Integer floorplanCount) {
        this.floorplanCount = floorplanCount;
    }

    /**
     * <p>
     * The number of unique floorplans.
     * </p>
     * 
     * @return The number of unique floorplans.
     */

    public Integer getFloorplanCount() {
        return this.floorplanCount;
    }

    /**
     * <p>
     * The number of unique floorplans.
     * </p>
     * 
     * @param floorplanCount
     *        The number of unique floorplans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldCount withFloorplanCount(Integer floorplanCount) {
        setFloorplanCount(floorplanCount);
        return this;
    }

    /**
     * <p>
     * The number of unique interiors per floorplan.
     * </p>
     * 
     * @param interiorCountPerFloorplan
     *        The number of unique interiors per floorplan.
     */

    public void setInteriorCountPerFloorplan(Integer interiorCountPerFloorplan) {
        this.interiorCountPerFloorplan = interiorCountPerFloorplan;
    }

    /**
     * <p>
     * The number of unique interiors per floorplan.
     * </p>
     * 
     * @return The number of unique interiors per floorplan.
     */

    public Integer getInteriorCountPerFloorplan() {
        return this.interiorCountPerFloorplan;
    }

    /**
     * <p>
     * The number of unique interiors per floorplan.
     * </p>
     * 
     * @param interiorCountPerFloorplan
     *        The number of unique interiors per floorplan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldCount withInteriorCountPerFloorplan(Integer interiorCountPerFloorplan) {
        setInteriorCountPerFloorplan(interiorCountPerFloorplan);
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
        if (getFloorplanCount() != null)
            sb.append("FloorplanCount: ").append(getFloorplanCount()).append(",");
        if (getInteriorCountPerFloorplan() != null)
            sb.append("InteriorCountPerFloorplan: ").append(getInteriorCountPerFloorplan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorldCount == false)
            return false;
        WorldCount other = (WorldCount) obj;
        if (other.getFloorplanCount() == null ^ this.getFloorplanCount() == null)
            return false;
        if (other.getFloorplanCount() != null && other.getFloorplanCount().equals(this.getFloorplanCount()) == false)
            return false;
        if (other.getInteriorCountPerFloorplan() == null ^ this.getInteriorCountPerFloorplan() == null)
            return false;
        if (other.getInteriorCountPerFloorplan() != null && other.getInteriorCountPerFloorplan().equals(this.getInteriorCountPerFloorplan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFloorplanCount() == null) ? 0 : getFloorplanCount().hashCode());
        hashCode = prime * hashCode + ((getInteriorCountPerFloorplan() == null) ? 0 : getInteriorCountPerFloorplan().hashCode());
        return hashCode;
    }

    @Override
    public WorldCount clone() {
        try {
            return (WorldCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.WorldCountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
