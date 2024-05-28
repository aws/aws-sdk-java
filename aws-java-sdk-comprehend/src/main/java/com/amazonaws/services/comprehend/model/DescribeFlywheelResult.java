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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeFlywheel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFlywheelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The flywheel properties.
     * </p>
     */
    private FlywheelProperties flywheelProperties;

    /**
     * <p>
     * The flywheel properties.
     * </p>
     * 
     * @param flywheelProperties
     *        The flywheel properties.
     */

    public void setFlywheelProperties(FlywheelProperties flywheelProperties) {
        this.flywheelProperties = flywheelProperties;
    }

    /**
     * <p>
     * The flywheel properties.
     * </p>
     * 
     * @return The flywheel properties.
     */

    public FlywheelProperties getFlywheelProperties() {
        return this.flywheelProperties;
    }

    /**
     * <p>
     * The flywheel properties.
     * </p>
     * 
     * @param flywheelProperties
     *        The flywheel properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlywheelResult withFlywheelProperties(FlywheelProperties flywheelProperties) {
        setFlywheelProperties(flywheelProperties);
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
        if (getFlywheelProperties() != null)
            sb.append("FlywheelProperties: ").append(getFlywheelProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFlywheelResult == false)
            return false;
        DescribeFlywheelResult other = (DescribeFlywheelResult) obj;
        if (other.getFlywheelProperties() == null ^ this.getFlywheelProperties() == null)
            return false;
        if (other.getFlywheelProperties() != null && other.getFlywheelProperties().equals(this.getFlywheelProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlywheelProperties() == null) ? 0 : getFlywheelProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFlywheelResult clone() {
        try {
            return (DescribeFlywheelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
