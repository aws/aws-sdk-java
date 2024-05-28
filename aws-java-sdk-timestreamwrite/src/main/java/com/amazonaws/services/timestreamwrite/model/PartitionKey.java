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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An attribute used in partitioning data in a table. A dimension key partitions data using the values of the dimension
 * specified by the dimension-name as partition key, while a measure key partitions data using measure names (values of
 * the 'measure_name' column).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/PartitionKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PartitionKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the partition key. Options are DIMENSION (dimension key) and MEASURE (measure key).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the attribute used for a dimension key.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The level of enforcement for the specification of a dimension key in ingested records. Options are REQUIRED
     * (dimension key must be specified) and OPTIONAL (dimension key does not have to be specified).
     * </p>
     */
    private String enforcementInRecord;

    /**
     * <p>
     * The type of the partition key. Options are DIMENSION (dimension key) and MEASURE (measure key).
     * </p>
     * 
     * @param type
     *        The type of the partition key. Options are DIMENSION (dimension key) and MEASURE (measure key).
     * @see PartitionKeyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the partition key. Options are DIMENSION (dimension key) and MEASURE (measure key).
     * </p>
     * 
     * @return The type of the partition key. Options are DIMENSION (dimension key) and MEASURE (measure key).
     * @see PartitionKeyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the partition key. Options are DIMENSION (dimension key) and MEASURE (measure key).
     * </p>
     * 
     * @param type
     *        The type of the partition key. Options are DIMENSION (dimension key) and MEASURE (measure key).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartitionKeyType
     */

    public PartitionKey withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the partition key. Options are DIMENSION (dimension key) and MEASURE (measure key).
     * </p>
     * 
     * @param type
     *        The type of the partition key. Options are DIMENSION (dimension key) and MEASURE (measure key).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartitionKeyType
     */

    public PartitionKey withType(PartitionKeyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the attribute used for a dimension key.
     * </p>
     * 
     * @param name
     *        The name of the attribute used for a dimension key.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the attribute used for a dimension key.
     * </p>
     * 
     * @return The name of the attribute used for a dimension key.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the attribute used for a dimension key.
     * </p>
     * 
     * @param name
     *        The name of the attribute used for a dimension key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionKey withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The level of enforcement for the specification of a dimension key in ingested records. Options are REQUIRED
     * (dimension key must be specified) and OPTIONAL (dimension key does not have to be specified).
     * </p>
     * 
     * @param enforcementInRecord
     *        The level of enforcement for the specification of a dimension key in ingested records. Options are
     *        REQUIRED (dimension key must be specified) and OPTIONAL (dimension key does not have to be specified).
     * @see PartitionKeyEnforcementLevel
     */

    public void setEnforcementInRecord(String enforcementInRecord) {
        this.enforcementInRecord = enforcementInRecord;
    }

    /**
     * <p>
     * The level of enforcement for the specification of a dimension key in ingested records. Options are REQUIRED
     * (dimension key must be specified) and OPTIONAL (dimension key does not have to be specified).
     * </p>
     * 
     * @return The level of enforcement for the specification of a dimension key in ingested records. Options are
     *         REQUIRED (dimension key must be specified) and OPTIONAL (dimension key does not have to be specified).
     * @see PartitionKeyEnforcementLevel
     */

    public String getEnforcementInRecord() {
        return this.enforcementInRecord;
    }

    /**
     * <p>
     * The level of enforcement for the specification of a dimension key in ingested records. Options are REQUIRED
     * (dimension key must be specified) and OPTIONAL (dimension key does not have to be specified).
     * </p>
     * 
     * @param enforcementInRecord
     *        The level of enforcement for the specification of a dimension key in ingested records. Options are
     *        REQUIRED (dimension key must be specified) and OPTIONAL (dimension key does not have to be specified).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartitionKeyEnforcementLevel
     */

    public PartitionKey withEnforcementInRecord(String enforcementInRecord) {
        setEnforcementInRecord(enforcementInRecord);
        return this;
    }

    /**
     * <p>
     * The level of enforcement for the specification of a dimension key in ingested records. Options are REQUIRED
     * (dimension key must be specified) and OPTIONAL (dimension key does not have to be specified).
     * </p>
     * 
     * @param enforcementInRecord
     *        The level of enforcement for the specification of a dimension key in ingested records. Options are
     *        REQUIRED (dimension key must be specified) and OPTIONAL (dimension key does not have to be specified).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartitionKeyEnforcementLevel
     */

    public PartitionKey withEnforcementInRecord(PartitionKeyEnforcementLevel enforcementInRecord) {
        this.enforcementInRecord = enforcementInRecord.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEnforcementInRecord() != null)
            sb.append("EnforcementInRecord: ").append(getEnforcementInRecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartitionKey == false)
            return false;
        PartitionKey other = (PartitionKey) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEnforcementInRecord() == null ^ this.getEnforcementInRecord() == null)
            return false;
        if (other.getEnforcementInRecord() != null && other.getEnforcementInRecord().equals(this.getEnforcementInRecord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEnforcementInRecord() == null) ? 0 : getEnforcementInRecord().hashCode());
        return hashCode;
    }

    @Override
    public PartitionKey clone() {
        try {
            return (PartitionKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.PartitionKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
