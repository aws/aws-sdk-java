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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information on the records ingested by this request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/RecordsIngested" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordsIngested implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Total count of successfully ingested records.
     * </p>
     */
    private Integer total;
    /**
     * <p>
     * Count of records ingested into the memory store.
     * </p>
     */
    private Integer memoryStore;
    /**
     * <p>
     * Count of records ingested into the magnetic store.
     * </p>
     */
    private Integer magneticStore;

    /**
     * <p>
     * Total count of successfully ingested records.
     * </p>
     * 
     * @param total
     *        Total count of successfully ingested records.
     */

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * <p>
     * Total count of successfully ingested records.
     * </p>
     * 
     * @return Total count of successfully ingested records.
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     * <p>
     * Total count of successfully ingested records.
     * </p>
     * 
     * @param total
     *        Total count of successfully ingested records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordsIngested withTotal(Integer total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * Count of records ingested into the memory store.
     * </p>
     * 
     * @param memoryStore
     *        Count of records ingested into the memory store.
     */

    public void setMemoryStore(Integer memoryStore) {
        this.memoryStore = memoryStore;
    }

    /**
     * <p>
     * Count of records ingested into the memory store.
     * </p>
     * 
     * @return Count of records ingested into the memory store.
     */

    public Integer getMemoryStore() {
        return this.memoryStore;
    }

    /**
     * <p>
     * Count of records ingested into the memory store.
     * </p>
     * 
     * @param memoryStore
     *        Count of records ingested into the memory store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordsIngested withMemoryStore(Integer memoryStore) {
        setMemoryStore(memoryStore);
        return this;
    }

    /**
     * <p>
     * Count of records ingested into the magnetic store.
     * </p>
     * 
     * @param magneticStore
     *        Count of records ingested into the magnetic store.
     */

    public void setMagneticStore(Integer magneticStore) {
        this.magneticStore = magneticStore;
    }

    /**
     * <p>
     * Count of records ingested into the magnetic store.
     * </p>
     * 
     * @return Count of records ingested into the magnetic store.
     */

    public Integer getMagneticStore() {
        return this.magneticStore;
    }

    /**
     * <p>
     * Count of records ingested into the magnetic store.
     * </p>
     * 
     * @param magneticStore
     *        Count of records ingested into the magnetic store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordsIngested withMagneticStore(Integer magneticStore) {
        setMagneticStore(magneticStore);
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
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getMemoryStore() != null)
            sb.append("MemoryStore: ").append(getMemoryStore()).append(",");
        if (getMagneticStore() != null)
            sb.append("MagneticStore: ").append(getMagneticStore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordsIngested == false)
            return false;
        RecordsIngested other = (RecordsIngested) obj;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getMemoryStore() == null ^ this.getMemoryStore() == null)
            return false;
        if (other.getMemoryStore() != null && other.getMemoryStore().equals(this.getMemoryStore()) == false)
            return false;
        if (other.getMagneticStore() == null ^ this.getMagneticStore() == null)
            return false;
        if (other.getMagneticStore() != null && other.getMagneticStore().equals(this.getMagneticStore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getMemoryStore() == null) ? 0 : getMemoryStore().hashCode());
        hashCode = prime * hashCode + ((getMagneticStore() == null) ? 0 : getMagneticStore().hashCode());
        return hashCode;
    }

    @Override
    public RecordsIngested clone() {
        try {
            return (RecordsIngested) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.RecordsIngestedMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
