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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/PropertyFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyFilter implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private Property property;

    /**
     * <p/>
     * 
     * @param property
     */

    public void setProperty(Property property) {
        this.property = property;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Property getProperty() {
        return this.property;
    }

    /**
     * <p/>
     * 
     * @param property
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyFilter withProperty(Property property) {
        setProperty(property);
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
        if (getProperty() != null)
            sb.append("Property: ").append(getProperty());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyFilter == false)
            return false;
        PropertyFilter other = (PropertyFilter) obj;
        if (other.getProperty() == null ^ this.getProperty() == null)
            return false;
        if (other.getProperty() != null && other.getProperty().equals(this.getProperty()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProperty() == null) ? 0 : getProperty().hashCode());
        return hashCode;
    }

    @Override
    public PropertyFilter clone() {
        try {
            return (PropertyFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.PropertyFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
