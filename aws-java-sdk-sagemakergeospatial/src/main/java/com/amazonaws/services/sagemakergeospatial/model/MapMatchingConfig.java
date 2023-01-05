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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/MapMatchingConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MapMatchingConfig implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String idAttributeName;
    /**
     * <p>
     * The name of the timestamp attribute.
     * </p>
     */
    private String timestampAttributeName;
    /**
     * <p>
     * The name of the X-attribute
     * </p>
     */
    private String xAttributeName;
    /**
     * <p>
     * The name of the Y-attribute
     * </p>
     */
    private String yAttributeName;

    /**
     * <p/>
     * 
     * @param idAttributeName
     */

    public void setIdAttributeName(String idAttributeName) {
        this.idAttributeName = idAttributeName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getIdAttributeName() {
        return this.idAttributeName;
    }

    /**
     * <p/>
     * 
     * @param idAttributeName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapMatchingConfig withIdAttributeName(String idAttributeName) {
        setIdAttributeName(idAttributeName);
        return this;
    }

    /**
     * <p>
     * The name of the timestamp attribute.
     * </p>
     * 
     * @param timestampAttributeName
     *        The name of the timestamp attribute.
     */

    public void setTimestampAttributeName(String timestampAttributeName) {
        this.timestampAttributeName = timestampAttributeName;
    }

    /**
     * <p>
     * The name of the timestamp attribute.
     * </p>
     * 
     * @return The name of the timestamp attribute.
     */

    public String getTimestampAttributeName() {
        return this.timestampAttributeName;
    }

    /**
     * <p>
     * The name of the timestamp attribute.
     * </p>
     * 
     * @param timestampAttributeName
     *        The name of the timestamp attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapMatchingConfig withTimestampAttributeName(String timestampAttributeName) {
        setTimestampAttributeName(timestampAttributeName);
        return this;
    }

    /**
     * <p>
     * The name of the X-attribute
     * </p>
     * 
     * @param xAttributeName
     *        The name of the X-attribute
     */

    public void setXAttributeName(String xAttributeName) {
        this.xAttributeName = xAttributeName;
    }

    /**
     * <p>
     * The name of the X-attribute
     * </p>
     * 
     * @return The name of the X-attribute
     */

    public String getXAttributeName() {
        return this.xAttributeName;
    }

    /**
     * <p>
     * The name of the X-attribute
     * </p>
     * 
     * @param xAttributeName
     *        The name of the X-attribute
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapMatchingConfig withXAttributeName(String xAttributeName) {
        setXAttributeName(xAttributeName);
        return this;
    }

    /**
     * <p>
     * The name of the Y-attribute
     * </p>
     * 
     * @param yAttributeName
     *        The name of the Y-attribute
     */

    public void setYAttributeName(String yAttributeName) {
        this.yAttributeName = yAttributeName;
    }

    /**
     * <p>
     * The name of the Y-attribute
     * </p>
     * 
     * @return The name of the Y-attribute
     */

    public String getYAttributeName() {
        return this.yAttributeName;
    }

    /**
     * <p>
     * The name of the Y-attribute
     * </p>
     * 
     * @param yAttributeName
     *        The name of the Y-attribute
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapMatchingConfig withYAttributeName(String yAttributeName) {
        setYAttributeName(yAttributeName);
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
        if (getIdAttributeName() != null)
            sb.append("IdAttributeName: ").append(getIdAttributeName()).append(",");
        if (getTimestampAttributeName() != null)
            sb.append("TimestampAttributeName: ").append(getTimestampAttributeName()).append(",");
        if (getXAttributeName() != null)
            sb.append("XAttributeName: ").append(getXAttributeName()).append(",");
        if (getYAttributeName() != null)
            sb.append("YAttributeName: ").append(getYAttributeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MapMatchingConfig == false)
            return false;
        MapMatchingConfig other = (MapMatchingConfig) obj;
        if (other.getIdAttributeName() == null ^ this.getIdAttributeName() == null)
            return false;
        if (other.getIdAttributeName() != null && other.getIdAttributeName().equals(this.getIdAttributeName()) == false)
            return false;
        if (other.getTimestampAttributeName() == null ^ this.getTimestampAttributeName() == null)
            return false;
        if (other.getTimestampAttributeName() != null && other.getTimestampAttributeName().equals(this.getTimestampAttributeName()) == false)
            return false;
        if (other.getXAttributeName() == null ^ this.getXAttributeName() == null)
            return false;
        if (other.getXAttributeName() != null && other.getXAttributeName().equals(this.getXAttributeName()) == false)
            return false;
        if (other.getYAttributeName() == null ^ this.getYAttributeName() == null)
            return false;
        if (other.getYAttributeName() != null && other.getYAttributeName().equals(this.getYAttributeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdAttributeName() == null) ? 0 : getIdAttributeName().hashCode());
        hashCode = prime * hashCode + ((getTimestampAttributeName() == null) ? 0 : getTimestampAttributeName().hashCode());
        hashCode = prime * hashCode + ((getXAttributeName() == null) ? 0 : getXAttributeName().hashCode());
        hashCode = prime * hashCode + ((getYAttributeName() == null) ? 0 : getYAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public MapMatchingConfig clone() {
        try {
            return (MapMatchingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.MapMatchingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
