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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the amount of provisioned throughput capacity consumed on a table or an index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Capacity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Capacity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of read capacity units consumed on a table or an index.
     * </p>
     */
    private Double readCapacityUnits;
    /**
     * <p>
     * The total number of write capacity units consumed on a table or an index.
     * </p>
     */
    private Double writeCapacityUnits;
    /**
     * <p>
     * The total number of capacity units consumed on a table or an index.
     * </p>
     */
    private Double capacityUnits;

    /**
     * <p>
     * The total number of read capacity units consumed on a table or an index.
     * </p>
     * 
     * @param readCapacityUnits
     *        The total number of read capacity units consumed on a table or an index.
     */

    public void setReadCapacityUnits(Double readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }

    /**
     * <p>
     * The total number of read capacity units consumed on a table or an index.
     * </p>
     * 
     * @return The total number of read capacity units consumed on a table or an index.
     */

    public Double getReadCapacityUnits() {
        return this.readCapacityUnits;
    }

    /**
     * <p>
     * The total number of read capacity units consumed on a table or an index.
     * </p>
     * 
     * @param readCapacityUnits
     *        The total number of read capacity units consumed on a table or an index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withReadCapacityUnits(Double readCapacityUnits) {
        setReadCapacityUnits(readCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The total number of write capacity units consumed on a table or an index.
     * </p>
     * 
     * @param writeCapacityUnits
     *        The total number of write capacity units consumed on a table or an index.
     */

    public void setWriteCapacityUnits(Double writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
    }

    /**
     * <p>
     * The total number of write capacity units consumed on a table or an index.
     * </p>
     * 
     * @return The total number of write capacity units consumed on a table or an index.
     */

    public Double getWriteCapacityUnits() {
        return this.writeCapacityUnits;
    }

    /**
     * <p>
     * The total number of write capacity units consumed on a table or an index.
     * </p>
     * 
     * @param writeCapacityUnits
     *        The total number of write capacity units consumed on a table or an index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withWriteCapacityUnits(Double writeCapacityUnits) {
        setWriteCapacityUnits(writeCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The total number of capacity units consumed on a table or an index.
     * </p>
     * 
     * @param capacityUnits
     *        The total number of capacity units consumed on a table or an index.
     */

    public void setCapacityUnits(Double capacityUnits) {
        this.capacityUnits = capacityUnits;
    }

    /**
     * <p>
     * The total number of capacity units consumed on a table or an index.
     * </p>
     * 
     * @return The total number of capacity units consumed on a table or an index.
     */

    public Double getCapacityUnits() {
        return this.capacityUnits;
    }

    /**
     * <p>
     * The total number of capacity units consumed on a table or an index.
     * </p>
     * 
     * @param capacityUnits
     *        The total number of capacity units consumed on a table or an index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withCapacityUnits(Double capacityUnits) {
        setCapacityUnits(capacityUnits);
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
            sb.append("ReadCapacityUnits: ").append(getReadCapacityUnits()).append(",");
        if (getWriteCapacityUnits() != null)
            sb.append("WriteCapacityUnits: ").append(getWriteCapacityUnits()).append(",");
        if (getCapacityUnits() != null)
            sb.append("CapacityUnits: ").append(getCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Capacity == false)
            return false;
        Capacity other = (Capacity) obj;
        if (other.getReadCapacityUnits() == null ^ this.getReadCapacityUnits() == null)
            return false;
        if (other.getReadCapacityUnits() != null && other.getReadCapacityUnits().equals(this.getReadCapacityUnits()) == false)
            return false;
        if (other.getWriteCapacityUnits() == null ^ this.getWriteCapacityUnits() == null)
            return false;
        if (other.getWriteCapacityUnits() != null && other.getWriteCapacityUnits().equals(this.getWriteCapacityUnits()) == false)
            return false;
        if (other.getCapacityUnits() == null ^ this.getCapacityUnits() == null)
            return false;
        if (other.getCapacityUnits() != null && other.getCapacityUnits().equals(this.getCapacityUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReadCapacityUnits() == null) ? 0 : getReadCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getWriteCapacityUnits() == null) ? 0 : getWriteCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getCapacityUnits() == null) ? 0 : getCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public Capacity clone() {
        try {
            return (Capacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.CapacityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
