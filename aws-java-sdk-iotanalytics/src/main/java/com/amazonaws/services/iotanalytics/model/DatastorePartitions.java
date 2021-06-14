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
 * Contains information about partitions in a data store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatastorePartitions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatastorePartitions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of partitions in a data store.
     * </p>
     */
    private java.util.List<DatastorePartition> partitions;

    /**
     * <p>
     * A list of partitions in a data store.
     * </p>
     * 
     * @return A list of partitions in a data store.
     */

    public java.util.List<DatastorePartition> getPartitions() {
        return partitions;
    }

    /**
     * <p>
     * A list of partitions in a data store.
     * </p>
     * 
     * @param partitions
     *        A list of partitions in a data store.
     */

    public void setPartitions(java.util.Collection<DatastorePartition> partitions) {
        if (partitions == null) {
            this.partitions = null;
            return;
        }

        this.partitions = new java.util.ArrayList<DatastorePartition>(partitions);
    }

    /**
     * <p>
     * A list of partitions in a data store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitions(java.util.Collection)} or {@link #withPartitions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param partitions
     *        A list of partitions in a data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastorePartitions withPartitions(DatastorePartition... partitions) {
        if (this.partitions == null) {
            setPartitions(new java.util.ArrayList<DatastorePartition>(partitions.length));
        }
        for (DatastorePartition ele : partitions) {
            this.partitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of partitions in a data store.
     * </p>
     * 
     * @param partitions
     *        A list of partitions in a data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastorePartitions withPartitions(java.util.Collection<DatastorePartition> partitions) {
        setPartitions(partitions);
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
        if (getPartitions() != null)
            sb.append("Partitions: ").append(getPartitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatastorePartitions == false)
            return false;
        DatastorePartitions other = (DatastorePartitions) obj;
        if (other.getPartitions() == null ^ this.getPartitions() == null)
            return false;
        if (other.getPartitions() != null && other.getPartitions().equals(this.getPartitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartitions() == null) ? 0 : getPartitions().hashCode());
        return hashCode;
    }

    @Override
    public DatastorePartitions clone() {
        try {
            return (DatastorePartitions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatastorePartitionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
