/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes execution properties for a Java-based Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/EnvironmentProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the execution property groups.
     * </p>
     */
    private java.util.List<PropertyGroup> propertyGroups;

    /**
     * <p>
     * Describes the execution property groups.
     * </p>
     * 
     * @return Describes the execution property groups.
     */

    public java.util.List<PropertyGroup> getPropertyGroups() {
        return propertyGroups;
    }

    /**
     * <p>
     * Describes the execution property groups.
     * </p>
     * 
     * @param propertyGroups
     *        Describes the execution property groups.
     */

    public void setPropertyGroups(java.util.Collection<PropertyGroup> propertyGroups) {
        if (propertyGroups == null) {
            this.propertyGroups = null;
            return;
        }

        this.propertyGroups = new java.util.ArrayList<PropertyGroup>(propertyGroups);
    }

    /**
     * <p>
     * Describes the execution property groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyGroups(java.util.Collection)} or {@link #withPropertyGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param propertyGroups
     *        Describes the execution property groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentProperties withPropertyGroups(PropertyGroup... propertyGroups) {
        if (this.propertyGroups == null) {
            setPropertyGroups(new java.util.ArrayList<PropertyGroup>(propertyGroups.length));
        }
        for (PropertyGroup ele : propertyGroups) {
            this.propertyGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the execution property groups.
     * </p>
     * 
     * @param propertyGroups
     *        Describes the execution property groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentProperties withPropertyGroups(java.util.Collection<PropertyGroup> propertyGroups) {
        setPropertyGroups(propertyGroups);
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
        if (getPropertyGroups() != null)
            sb.append("PropertyGroups: ").append(getPropertyGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentProperties == false)
            return false;
        EnvironmentProperties other = (EnvironmentProperties) obj;
        if (other.getPropertyGroups() == null ^ this.getPropertyGroups() == null)
            return false;
        if (other.getPropertyGroups() != null && other.getPropertyGroups().equals(this.getPropertyGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyGroups() == null) ? 0 : getPropertyGroups().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentProperties clone() {
        try {
            return (EnvironmentProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.EnvironmentPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
