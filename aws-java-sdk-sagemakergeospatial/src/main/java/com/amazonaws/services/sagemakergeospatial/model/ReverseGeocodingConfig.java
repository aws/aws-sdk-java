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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ReverseGeocodingConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReverseGeocodingConfig implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String xAttributeName;
    /** <p/> */
    private String yAttributeName;

    /**
     * <p/>
     * 
     * @param xAttributeName
     */

    public void setXAttributeName(String xAttributeName) {
        this.xAttributeName = xAttributeName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getXAttributeName() {
        return this.xAttributeName;
    }

    /**
     * <p/>
     * 
     * @param xAttributeName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReverseGeocodingConfig withXAttributeName(String xAttributeName) {
        setXAttributeName(xAttributeName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param yAttributeName
     */

    public void setYAttributeName(String yAttributeName) {
        this.yAttributeName = yAttributeName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getYAttributeName() {
        return this.yAttributeName;
    }

    /**
     * <p/>
     * 
     * @param yAttributeName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReverseGeocodingConfig withYAttributeName(String yAttributeName) {
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

        if (obj instanceof ReverseGeocodingConfig == false)
            return false;
        ReverseGeocodingConfig other = (ReverseGeocodingConfig) obj;
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

        hashCode = prime * hashCode + ((getXAttributeName() == null) ? 0 : getXAttributeName().hashCode());
        hashCode = prime * hashCode + ((getYAttributeName() == null) ? 0 : getYAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public ReverseGeocodingConfig clone() {
        try {
            return (ReverseGeocodingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.ReverseGeocodingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
