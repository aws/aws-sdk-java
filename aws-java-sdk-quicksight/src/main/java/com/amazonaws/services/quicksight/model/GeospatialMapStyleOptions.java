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
 * The map style options of the geospatial map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GeospatialMapStyleOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeospatialMapStyleOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The base map style of the geospatial map.
     * </p>
     */
    private String baseMapStyle;

    /**
     * <p>
     * The base map style of the geospatial map.
     * </p>
     * 
     * @param baseMapStyle
     *        The base map style of the geospatial map.
     * @see BaseMapStyleType
     */

    public void setBaseMapStyle(String baseMapStyle) {
        this.baseMapStyle = baseMapStyle;
    }

    /**
     * <p>
     * The base map style of the geospatial map.
     * </p>
     * 
     * @return The base map style of the geospatial map.
     * @see BaseMapStyleType
     */

    public String getBaseMapStyle() {
        return this.baseMapStyle;
    }

    /**
     * <p>
     * The base map style of the geospatial map.
     * </p>
     * 
     * @param baseMapStyle
     *        The base map style of the geospatial map.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaseMapStyleType
     */

    public GeospatialMapStyleOptions withBaseMapStyle(String baseMapStyle) {
        setBaseMapStyle(baseMapStyle);
        return this;
    }

    /**
     * <p>
     * The base map style of the geospatial map.
     * </p>
     * 
     * @param baseMapStyle
     *        The base map style of the geospatial map.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaseMapStyleType
     */

    public GeospatialMapStyleOptions withBaseMapStyle(BaseMapStyleType baseMapStyle) {
        this.baseMapStyle = baseMapStyle.toString();
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
        if (getBaseMapStyle() != null)
            sb.append("BaseMapStyle: ").append(getBaseMapStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeospatialMapStyleOptions == false)
            return false;
        GeospatialMapStyleOptions other = (GeospatialMapStyleOptions) obj;
        if (other.getBaseMapStyle() == null ^ this.getBaseMapStyle() == null)
            return false;
        if (other.getBaseMapStyle() != null && other.getBaseMapStyle().equals(this.getBaseMapStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseMapStyle() == null) ? 0 : getBaseMapStyle().hashCode());
        return hashCode;
    }

    @Override
    public GeospatialMapStyleOptions clone() {
        try {
            return (GeospatialMapStyleOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GeospatialMapStyleOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
