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
 * The static data configuration of the reference line data configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ReferenceLineStaticDataConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceLineStaticDataConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The double input of the static data.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The double input of the static data.
     * </p>
     * 
     * @param value
     *        The double input of the static data.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The double input of the static data.
     * </p>
     * 
     * @return The double input of the static data.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The double input of the static data.
     * </p>
     * 
     * @param value
     *        The double input of the static data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLineStaticDataConfiguration withValue(Double value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceLineStaticDataConfiguration == false)
            return false;
        ReferenceLineStaticDataConfiguration other = (ReferenceLineStaticDataConfiguration) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceLineStaticDataConfiguration clone() {
        try {
            return (ReferenceLineStaticDataConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ReferenceLineStaticDataConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
