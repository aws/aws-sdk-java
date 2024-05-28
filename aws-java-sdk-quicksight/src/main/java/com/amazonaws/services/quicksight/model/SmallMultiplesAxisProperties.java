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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures the properties of a chart's axes that are used by small multiples panels.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SmallMultiplesAxisProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SmallMultiplesAxisProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether scale of the axes are shared or independent. The default value is <code>SHARED</code>.
     * </p>
     */
    private String scale;
    /**
     * <p>
     * Defines the placement of the axis. By default, axes are rendered <code>OUTSIDE</code> of the panels. Axes with
     * <code>INDEPENDENT</code> scale are rendered <code>INSIDE</code> the panels.
     * </p>
     */
    private String placement;

    /**
     * <p>
     * Determines whether scale of the axes are shared or independent. The default value is <code>SHARED</code>.
     * </p>
     * 
     * @param scale
     *        Determines whether scale of the axes are shared or independent. The default value is <code>SHARED</code>.
     * @see SmallMultiplesAxisScale
     */

    public void setScale(String scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * Determines whether scale of the axes are shared or independent. The default value is <code>SHARED</code>.
     * </p>
     * 
     * @return Determines whether scale of the axes are shared or independent. The default value is <code>SHARED</code>.
     * @see SmallMultiplesAxisScale
     */

    public String getScale() {
        return this.scale;
    }

    /**
     * <p>
     * Determines whether scale of the axes are shared or independent. The default value is <code>SHARED</code>.
     * </p>
     * 
     * @param scale
     *        Determines whether scale of the axes are shared or independent. The default value is <code>SHARED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmallMultiplesAxisScale
     */

    public SmallMultiplesAxisProperties withScale(String scale) {
        setScale(scale);
        return this;
    }

    /**
     * <p>
     * Determines whether scale of the axes are shared or independent. The default value is <code>SHARED</code>.
     * </p>
     * 
     * @param scale
     *        Determines whether scale of the axes are shared or independent. The default value is <code>SHARED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmallMultiplesAxisScale
     */

    public SmallMultiplesAxisProperties withScale(SmallMultiplesAxisScale scale) {
        this.scale = scale.toString();
        return this;
    }

    /**
     * <p>
     * Defines the placement of the axis. By default, axes are rendered <code>OUTSIDE</code> of the panels. Axes with
     * <code>INDEPENDENT</code> scale are rendered <code>INSIDE</code> the panels.
     * </p>
     * 
     * @param placement
     *        Defines the placement of the axis. By default, axes are rendered <code>OUTSIDE</code> of the panels. Axes
     *        with <code>INDEPENDENT</code> scale are rendered <code>INSIDE</code> the panels.
     * @see SmallMultiplesAxisPlacement
     */

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * Defines the placement of the axis. By default, axes are rendered <code>OUTSIDE</code> of the panels. Axes with
     * <code>INDEPENDENT</code> scale are rendered <code>INSIDE</code> the panels.
     * </p>
     * 
     * @return Defines the placement of the axis. By default, axes are rendered <code>OUTSIDE</code> of the panels. Axes
     *         with <code>INDEPENDENT</code> scale are rendered <code>INSIDE</code> the panels.
     * @see SmallMultiplesAxisPlacement
     */

    public String getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * Defines the placement of the axis. By default, axes are rendered <code>OUTSIDE</code> of the panels. Axes with
     * <code>INDEPENDENT</code> scale are rendered <code>INSIDE</code> the panels.
     * </p>
     * 
     * @param placement
     *        Defines the placement of the axis. By default, axes are rendered <code>OUTSIDE</code> of the panels. Axes
     *        with <code>INDEPENDENT</code> scale are rendered <code>INSIDE</code> the panels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmallMultiplesAxisPlacement
     */

    public SmallMultiplesAxisProperties withPlacement(String placement) {
        setPlacement(placement);
        return this;
    }

    /**
     * <p>
     * Defines the placement of the axis. By default, axes are rendered <code>OUTSIDE</code> of the panels. Axes with
     * <code>INDEPENDENT</code> scale are rendered <code>INSIDE</code> the panels.
     * </p>
     * 
     * @param placement
     *        Defines the placement of the axis. By default, axes are rendered <code>OUTSIDE</code> of the panels. Axes
     *        with <code>INDEPENDENT</code> scale are rendered <code>INSIDE</code> the panels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmallMultiplesAxisPlacement
     */

    public SmallMultiplesAxisProperties withPlacement(SmallMultiplesAxisPlacement placement) {
        this.placement = placement.toString();
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
        if (getScale() != null)
            sb.append("Scale: ").append(getScale()).append(",");
        if (getPlacement() != null)
            sb.append("Placement: ").append(getPlacement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SmallMultiplesAxisProperties == false)
            return false;
        SmallMultiplesAxisProperties other = (SmallMultiplesAxisProperties) obj;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        return hashCode;
    }

    @Override
    public SmallMultiplesAxisProperties clone() {
        try {
            return (SmallMultiplesAxisProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SmallMultiplesAxisPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
