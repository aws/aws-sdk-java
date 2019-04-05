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
 * Describes the execution properties for a Java-based Amazon Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/EnvironmentPropertyDescriptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentPropertyDescriptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the execution property groups.
     * </p>
     */
    private java.util.List<PropertyGroup> propertyGroupDescriptions;

    /**
     * <p>
     * Describes the execution property groups.
     * </p>
     * 
     * @return Describes the execution property groups.
     */

    public java.util.List<PropertyGroup> getPropertyGroupDescriptions() {
        return propertyGroupDescriptions;
    }

    /**
     * <p>
     * Describes the execution property groups.
     * </p>
     * 
     * @param propertyGroupDescriptions
     *        Describes the execution property groups.
     */

    public void setPropertyGroupDescriptions(java.util.Collection<PropertyGroup> propertyGroupDescriptions) {
        if (propertyGroupDescriptions == null) {
            this.propertyGroupDescriptions = null;
            return;
        }

        this.propertyGroupDescriptions = new java.util.ArrayList<PropertyGroup>(propertyGroupDescriptions);
    }

    /**
     * <p>
     * Describes the execution property groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyGroupDescriptions(java.util.Collection)} or
     * {@link #withPropertyGroupDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param propertyGroupDescriptions
     *        Describes the execution property groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentPropertyDescriptions withPropertyGroupDescriptions(PropertyGroup... propertyGroupDescriptions) {
        if (this.propertyGroupDescriptions == null) {
            setPropertyGroupDescriptions(new java.util.ArrayList<PropertyGroup>(propertyGroupDescriptions.length));
        }
        for (PropertyGroup ele : propertyGroupDescriptions) {
            this.propertyGroupDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the execution property groups.
     * </p>
     * 
     * @param propertyGroupDescriptions
     *        Describes the execution property groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentPropertyDescriptions withPropertyGroupDescriptions(java.util.Collection<PropertyGroup> propertyGroupDescriptions) {
        setPropertyGroupDescriptions(propertyGroupDescriptions);
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
        if (getPropertyGroupDescriptions() != null)
            sb.append("PropertyGroupDescriptions: ").append(getPropertyGroupDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentPropertyDescriptions == false)
            return false;
        EnvironmentPropertyDescriptions other = (EnvironmentPropertyDescriptions) obj;
        if (other.getPropertyGroupDescriptions() == null ^ this.getPropertyGroupDescriptions() == null)
            return false;
        if (other.getPropertyGroupDescriptions() != null && other.getPropertyGroupDescriptions().equals(this.getPropertyGroupDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyGroupDescriptions() == null) ? 0 : getPropertyGroupDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentPropertyDescriptions clone() {
        try {
            return (EnvironmentPropertyDescriptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.EnvironmentPropertyDescriptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
