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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value to use in an Amazon CloudWatch custom metric dimension. This is used in the <code>PublishMetrics</code>
 * <a>CustomAction</a>. A CloudWatch custom metric dimension is a name/value pair that's part of the identity of a
 * metric.
 * </p>
 * <p>
 * AWS Network Firewall sets the dimension name to <code>CustomAction</code> and you provide the dimension value.
 * </p>
 * <p>
 * For more information about CloudWatch custom metric dimensions, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#usingDimensions"
 * >Publishing Custom Metrics</a> in the <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon CloudWatch User
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/Dimension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Dimension implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value to use in the custom metric dimension.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The value to use in the custom metric dimension.
     * </p>
     * 
     * @param value
     *        The value to use in the custom metric dimension.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value to use in the custom metric dimension.
     * </p>
     * 
     * @return The value to use in the custom metric dimension.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value to use in the custom metric dimension.
     * </p>
     * 
     * @param value
     *        The value to use in the custom metric dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dimension withValue(String value) {
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
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Dimension == false)
            return false;
        Dimension other = (Dimension) obj;
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
    public Dimension clone() {
        try {
            return (Dimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.DimensionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
