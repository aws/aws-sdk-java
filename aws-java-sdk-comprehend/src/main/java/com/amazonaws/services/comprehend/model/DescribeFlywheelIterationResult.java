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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeFlywheelIteration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFlywheelIterationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration properties of a flywheel iteration.
     * </p>
     */
    private FlywheelIterationProperties flywheelIterationProperties;

    /**
     * <p>
     * The configuration properties of a flywheel iteration.
     * </p>
     * 
     * @param flywheelIterationProperties
     *        The configuration properties of a flywheel iteration.
     */

    public void setFlywheelIterationProperties(FlywheelIterationProperties flywheelIterationProperties) {
        this.flywheelIterationProperties = flywheelIterationProperties;
    }

    /**
     * <p>
     * The configuration properties of a flywheel iteration.
     * </p>
     * 
     * @return The configuration properties of a flywheel iteration.
     */

    public FlywheelIterationProperties getFlywheelIterationProperties() {
        return this.flywheelIterationProperties;
    }

    /**
     * <p>
     * The configuration properties of a flywheel iteration.
     * </p>
     * 
     * @param flywheelIterationProperties
     *        The configuration properties of a flywheel iteration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlywheelIterationResult withFlywheelIterationProperties(FlywheelIterationProperties flywheelIterationProperties) {
        setFlywheelIterationProperties(flywheelIterationProperties);
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
        if (getFlywheelIterationProperties() != null)
            sb.append("FlywheelIterationProperties: ").append(getFlywheelIterationProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFlywheelIterationResult == false)
            return false;
        DescribeFlywheelIterationResult other = (DescribeFlywheelIterationResult) obj;
        if (other.getFlywheelIterationProperties() == null ^ this.getFlywheelIterationProperties() == null)
            return false;
        if (other.getFlywheelIterationProperties() != null && other.getFlywheelIterationProperties().equals(this.getFlywheelIterationProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlywheelIterationProperties() == null) ? 0 : getFlywheelIterationProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFlywheelIterationResult clone() {
        try {
            return (DescribeFlywheelIterationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
