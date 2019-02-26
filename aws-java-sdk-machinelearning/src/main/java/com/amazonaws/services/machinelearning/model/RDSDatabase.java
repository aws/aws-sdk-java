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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The database details of an Amazon RDS database.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDSDatabase implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of an RDS DB instance.
     * </p>
     */
    private String instanceIdentifier;

    private String databaseName;

    /**
     * <p>
     * The ID of an RDS DB instance.
     * </p>
     * 
     * @param instanceIdentifier
     *        The ID of an RDS DB instance.
     */

    public void setInstanceIdentifier(String instanceIdentifier) {
        this.instanceIdentifier = instanceIdentifier;
    }

    /**
     * <p>
     * The ID of an RDS DB instance.
     * </p>
     * 
     * @return The ID of an RDS DB instance.
     */

    public String getInstanceIdentifier() {
        return this.instanceIdentifier;
    }

    /**
     * <p>
     * The ID of an RDS DB instance.
     * </p>
     * 
     * @param instanceIdentifier
     *        The ID of an RDS DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDatabase withInstanceIdentifier(String instanceIdentifier) {
        setInstanceIdentifier(instanceIdentifier);
        return this;
    }

    /**
     * @param databaseName
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * @return
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @param databaseName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDatabase withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
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
        if (getInstanceIdentifier() != null)
            sb.append("InstanceIdentifier: ").append(getInstanceIdentifier()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RDSDatabase == false)
            return false;
        RDSDatabase other = (RDSDatabase) obj;
        if (other.getInstanceIdentifier() == null ^ this.getInstanceIdentifier() == null)
            return false;
        if (other.getInstanceIdentifier() != null && other.getInstanceIdentifier().equals(this.getInstanceIdentifier()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceIdentifier() == null) ? 0 : getInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        return hashCode;
    }

    @Override
    public RDSDatabase clone() {
        try {
            return (RDSDatabase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.machinelearning.model.transform.RDSDatabaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
