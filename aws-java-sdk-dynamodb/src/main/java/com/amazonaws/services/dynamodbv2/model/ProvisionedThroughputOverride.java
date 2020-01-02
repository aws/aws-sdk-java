/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Replica-specific provisioned throughput settings. If not specified, uses the source table's provisioned throughput
 * settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ProvisionedThroughputOverride"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedThroughputOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Replica-specific read capacity units. If not specified, uses the source table's read capacity settings.
     * </p>
     */
    private Long readCapacityUnits;

    /**
     * <p>
     * Replica-specific read capacity units. If not specified, uses the source table's read capacity settings.
     * </p>
     * 
     * @param readCapacityUnits
     *        Replica-specific read capacity units. If not specified, uses the source table's read capacity settings.
     */

    public void setReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }

    /**
     * <p>
     * Replica-specific read capacity units. If not specified, uses the source table's read capacity settings.
     * </p>
     * 
     * @return Replica-specific read capacity units. If not specified, uses the source table's read capacity settings.
     */

    public Long getReadCapacityUnits() {
        return this.readCapacityUnits;
    }

    /**
     * <p>
     * Replica-specific read capacity units. If not specified, uses the source table's read capacity settings.
     * </p>
     * 
     * @param readCapacityUnits
     *        Replica-specific read capacity units. If not specified, uses the source table's read capacity settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedThroughputOverride withReadCapacityUnits(Long readCapacityUnits) {
        setReadCapacityUnits(readCapacityUnits);
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
        if (getReadCapacityUnits() != null)
            sb.append("ReadCapacityUnits: ").append(getReadCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedThroughputOverride == false)
            return false;
        ProvisionedThroughputOverride other = (ProvisionedThroughputOverride) obj;
        if (other.getReadCapacityUnits() == null ^ this.getReadCapacityUnits() == null)
            return false;
        if (other.getReadCapacityUnits() != null && other.getReadCapacityUnits().equals(this.getReadCapacityUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReadCapacityUnits() == null) ? 0 : getReadCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionedThroughputOverride clone() {
        try {
            return (ProvisionedThroughputOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ProvisionedThroughputOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
