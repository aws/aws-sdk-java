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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The replication details of the data replication-enabled broker. Only returned if dataReplicationMode or
 * pendingDataReplicationMode is set to CRDR.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DataReplicationMetadataOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataReplicationMetadataOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the replica/primary broker. Only returned if this broker is currently set as a primary or replica in
     * the broker's dataReplicationRole property.
     * </p>
     */
    private DataReplicationCounterpart dataReplicationCounterpart;
    /**
     * <p>
     * Defines the role of this broker in a data replication pair. When a replica broker is promoted to primary, this
     * role is interchanged.
     * </p>
     */
    private String dataReplicationRole;

    /**
     * <p>
     * Describes the replica/primary broker. Only returned if this broker is currently set as a primary or replica in
     * the broker's dataReplicationRole property.
     * </p>
     * 
     * @param dataReplicationCounterpart
     *        Describes the replica/primary broker. Only returned if this broker is currently set as a primary or
     *        replica in the broker's dataReplicationRole property.
     */

    public void setDataReplicationCounterpart(DataReplicationCounterpart dataReplicationCounterpart) {
        this.dataReplicationCounterpart = dataReplicationCounterpart;
    }

    /**
     * <p>
     * Describes the replica/primary broker. Only returned if this broker is currently set as a primary or replica in
     * the broker's dataReplicationRole property.
     * </p>
     * 
     * @return Describes the replica/primary broker. Only returned if this broker is currently set as a primary or
     *         replica in the broker's dataReplicationRole property.
     */

    public DataReplicationCounterpart getDataReplicationCounterpart() {
        return this.dataReplicationCounterpart;
    }

    /**
     * <p>
     * Describes the replica/primary broker. Only returned if this broker is currently set as a primary or replica in
     * the broker's dataReplicationRole property.
     * </p>
     * 
     * @param dataReplicationCounterpart
     *        Describes the replica/primary broker. Only returned if this broker is currently set as a primary or
     *        replica in the broker's dataReplicationRole property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationMetadataOutput withDataReplicationCounterpart(DataReplicationCounterpart dataReplicationCounterpart) {
        setDataReplicationCounterpart(dataReplicationCounterpart);
        return this;
    }

    /**
     * <p>
     * Defines the role of this broker in a data replication pair. When a replica broker is promoted to primary, this
     * role is interchanged.
     * </p>
     * 
     * @param dataReplicationRole
     *        Defines the role of this broker in a data replication pair. When a replica broker is promoted to primary,
     *        this role is interchanged.
     */

    public void setDataReplicationRole(String dataReplicationRole) {
        this.dataReplicationRole = dataReplicationRole;
    }

    /**
     * <p>
     * Defines the role of this broker in a data replication pair. When a replica broker is promoted to primary, this
     * role is interchanged.
     * </p>
     * 
     * @return Defines the role of this broker in a data replication pair. When a replica broker is promoted to primary,
     *         this role is interchanged.
     */

    public String getDataReplicationRole() {
        return this.dataReplicationRole;
    }

    /**
     * <p>
     * Defines the role of this broker in a data replication pair. When a replica broker is promoted to primary, this
     * role is interchanged.
     * </p>
     * 
     * @param dataReplicationRole
     *        Defines the role of this broker in a data replication pair. When a replica broker is promoted to primary,
     *        this role is interchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationMetadataOutput withDataReplicationRole(String dataReplicationRole) {
        setDataReplicationRole(dataReplicationRole);
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
        if (getDataReplicationCounterpart() != null)
            sb.append("DataReplicationCounterpart: ").append(getDataReplicationCounterpart()).append(",");
        if (getDataReplicationRole() != null)
            sb.append("DataReplicationRole: ").append(getDataReplicationRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataReplicationMetadataOutput == false)
            return false;
        DataReplicationMetadataOutput other = (DataReplicationMetadataOutput) obj;
        if (other.getDataReplicationCounterpart() == null ^ this.getDataReplicationCounterpart() == null)
            return false;
        if (other.getDataReplicationCounterpart() != null && other.getDataReplicationCounterpart().equals(this.getDataReplicationCounterpart()) == false)
            return false;
        if (other.getDataReplicationRole() == null ^ this.getDataReplicationRole() == null)
            return false;
        if (other.getDataReplicationRole() != null && other.getDataReplicationRole().equals(this.getDataReplicationRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataReplicationCounterpart() == null) ? 0 : getDataReplicationCounterpart().hashCode());
        hashCode = prime * hashCode + ((getDataReplicationRole() == null) ? 0 : getDataReplicationRole().hashCode());
        return hashCode;
    }

    @Override
    public DataReplicationMetadataOutput clone() {
        try {
            return (DataReplicationMetadataOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.DataReplicationMetadataOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
