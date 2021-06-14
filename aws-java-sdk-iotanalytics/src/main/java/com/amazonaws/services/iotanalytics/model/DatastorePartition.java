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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single partition in a data store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatastorePartition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatastorePartition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A partition defined by an <code>attributeName</code>.
     * </p>
     */
    private Partition attributePartition;
    /**
     * <p>
     * A partition defined by an <code>attributeName</code> and a timestamp format.
     * </p>
     */
    private TimestampPartition timestampPartition;

    /**
     * <p>
     * A partition defined by an <code>attributeName</code>.
     * </p>
     * 
     * @param attributePartition
     *        A partition defined by an <code>attributeName</code>.
     */

    public void setAttributePartition(Partition attributePartition) {
        this.attributePartition = attributePartition;
    }

    /**
     * <p>
     * A partition defined by an <code>attributeName</code>.
     * </p>
     * 
     * @return A partition defined by an <code>attributeName</code>.
     */

    public Partition getAttributePartition() {
        return this.attributePartition;
    }

    /**
     * <p>
     * A partition defined by an <code>attributeName</code>.
     * </p>
     * 
     * @param attributePartition
     *        A partition defined by an <code>attributeName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastorePartition withAttributePartition(Partition attributePartition) {
        setAttributePartition(attributePartition);
        return this;
    }

    /**
     * <p>
     * A partition defined by an <code>attributeName</code> and a timestamp format.
     * </p>
     * 
     * @param timestampPartition
     *        A partition defined by an <code>attributeName</code> and a timestamp format.
     */

    public void setTimestampPartition(TimestampPartition timestampPartition) {
        this.timestampPartition = timestampPartition;
    }

    /**
     * <p>
     * A partition defined by an <code>attributeName</code> and a timestamp format.
     * </p>
     * 
     * @return A partition defined by an <code>attributeName</code> and a timestamp format.
     */

    public TimestampPartition getTimestampPartition() {
        return this.timestampPartition;
    }

    /**
     * <p>
     * A partition defined by an <code>attributeName</code> and a timestamp format.
     * </p>
     * 
     * @param timestampPartition
     *        A partition defined by an <code>attributeName</code> and a timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastorePartition withTimestampPartition(TimestampPartition timestampPartition) {
        setTimestampPartition(timestampPartition);
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
        if (getAttributePartition() != null)
            sb.append("AttributePartition: ").append(getAttributePartition()).append(",");
        if (getTimestampPartition() != null)
            sb.append("TimestampPartition: ").append(getTimestampPartition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatastorePartition == false)
            return false;
        DatastorePartition other = (DatastorePartition) obj;
        if (other.getAttributePartition() == null ^ this.getAttributePartition() == null)
            return false;
        if (other.getAttributePartition() != null && other.getAttributePartition().equals(this.getAttributePartition()) == false)
            return false;
        if (other.getTimestampPartition() == null ^ this.getTimestampPartition() == null)
            return false;
        if (other.getTimestampPartition() != null && other.getTimestampPartition().equals(this.getTimestampPartition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributePartition() == null) ? 0 : getAttributePartition().hashCode());
        hashCode = prime * hashCode + ((getTimestampPartition() == null) ? 0 : getTimestampPartition().hashCode());
        return hashCode;
    }

    @Override
    public DatastorePartition clone() {
        try {
            return (DatastorePartition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatastorePartitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
