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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The optional auto scaling capacity settings for a table in provisioned capacity mode.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/AutoScalingSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The auto scaling settings for the table's write capacity.
     * </p>
     */
    private AutoScalingSettings writeCapacityAutoScaling;
    /**
     * <p>
     * The auto scaling settings for the table's read capacity.
     * </p>
     */
    private AutoScalingSettings readCapacityAutoScaling;

    /**
     * <p>
     * The auto scaling settings for the table's write capacity.
     * </p>
     * 
     * @param writeCapacityAutoScaling
     *        The auto scaling settings for the table's write capacity.
     */

    public void setWriteCapacityAutoScaling(AutoScalingSettings writeCapacityAutoScaling) {
        this.writeCapacityAutoScaling = writeCapacityAutoScaling;
    }

    /**
     * <p>
     * The auto scaling settings for the table's write capacity.
     * </p>
     * 
     * @return The auto scaling settings for the table's write capacity.
     */

    public AutoScalingSettings getWriteCapacityAutoScaling() {
        return this.writeCapacityAutoScaling;
    }

    /**
     * <p>
     * The auto scaling settings for the table's write capacity.
     * </p>
     * 
     * @param writeCapacityAutoScaling
     *        The auto scaling settings for the table's write capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingSpecification withWriteCapacityAutoScaling(AutoScalingSettings writeCapacityAutoScaling) {
        setWriteCapacityAutoScaling(writeCapacityAutoScaling);
        return this;
    }

    /**
     * <p>
     * The auto scaling settings for the table's read capacity.
     * </p>
     * 
     * @param readCapacityAutoScaling
     *        The auto scaling settings for the table's read capacity.
     */

    public void setReadCapacityAutoScaling(AutoScalingSettings readCapacityAutoScaling) {
        this.readCapacityAutoScaling = readCapacityAutoScaling;
    }

    /**
     * <p>
     * The auto scaling settings for the table's read capacity.
     * </p>
     * 
     * @return The auto scaling settings for the table's read capacity.
     */

    public AutoScalingSettings getReadCapacityAutoScaling() {
        return this.readCapacityAutoScaling;
    }

    /**
     * <p>
     * The auto scaling settings for the table's read capacity.
     * </p>
     * 
     * @param readCapacityAutoScaling
     *        The auto scaling settings for the table's read capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingSpecification withReadCapacityAutoScaling(AutoScalingSettings readCapacityAutoScaling) {
        setReadCapacityAutoScaling(readCapacityAutoScaling);
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
        if (getWriteCapacityAutoScaling() != null)
            sb.append("WriteCapacityAutoScaling: ").append(getWriteCapacityAutoScaling()).append(",");
        if (getReadCapacityAutoScaling() != null)
            sb.append("ReadCapacityAutoScaling: ").append(getReadCapacityAutoScaling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingSpecification == false)
            return false;
        AutoScalingSpecification other = (AutoScalingSpecification) obj;
        if (other.getWriteCapacityAutoScaling() == null ^ this.getWriteCapacityAutoScaling() == null)
            return false;
        if (other.getWriteCapacityAutoScaling() != null && other.getWriteCapacityAutoScaling().equals(this.getWriteCapacityAutoScaling()) == false)
            return false;
        if (other.getReadCapacityAutoScaling() == null ^ this.getReadCapacityAutoScaling() == null)
            return false;
        if (other.getReadCapacityAutoScaling() != null && other.getReadCapacityAutoScaling().equals(this.getReadCapacityAutoScaling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWriteCapacityAutoScaling() == null) ? 0 : getWriteCapacityAutoScaling().hashCode());
        hashCode = prime * hashCode + ((getReadCapacityAutoScaling() == null) ? 0 : getReadCapacityAutoScaling().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingSpecification clone() {
        try {
            return (AutoScalingSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.keyspaces.model.transform.AutoScalingSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
