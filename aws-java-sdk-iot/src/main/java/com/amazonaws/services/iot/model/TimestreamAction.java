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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Timestream rule action writes attributes (measures) from an MQTT message into an Amazon Timestream table. For
 * more information, see the <a
 * href="https://docs.aws.amazon.com/iot/latest/developerguide/timestream-rule-action.html">Timestream</a> topic rule
 * action documentation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimestreamAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the role that grants permission to write to the Amazon Timestream database table.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The name of an Amazon Timestream database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the database table into which to write the measure records.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Metadata attributes of the time series that are written in each measure record.
     * </p>
     */
    private java.util.List<TimestreamDimension> dimensions;
    /**
     * <p>
     * Specifies an application-defined value to replace the default value assigned to the Timestream record's timestamp
     * in the <code>time</code> column.
     * </p>
     * <p>
     * You can use this property to specify the value and the precision of the Timestream record's timestamp. You can
     * specify a value from the message payload or a value computed by a substitution template.
     * </p>
     * <p>
     * If omitted, the topic rule action assigns the timestamp, in milliseconds, at the time it processed the rule.
     * </p>
     */
    private TimestreamTimestamp timestamp;

    /**
     * <p>
     * The ARN of the role that grants permission to write to the Amazon Timestream database table.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to write to the Amazon Timestream database table.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to write to the Amazon Timestream database table.
     * </p>
     * 
     * @return The ARN of the role that grants permission to write to the Amazon Timestream database table.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to write to the Amazon Timestream database table.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to write to the Amazon Timestream database table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The name of an Amazon Timestream database.
     * </p>
     * 
     * @param databaseName
     *        The name of an Amazon Timestream database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of an Amazon Timestream database.
     * </p>
     * 
     * @return The name of an Amazon Timestream database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of an Amazon Timestream database.
     * </p>
     * 
     * @param databaseName
     *        The name of an Amazon Timestream database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamAction withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the database table into which to write the measure records.
     * </p>
     * 
     * @param tableName
     *        The name of the database table into which to write the measure records.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the database table into which to write the measure records.
     * </p>
     * 
     * @return The name of the database table into which to write the measure records.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the database table into which to write the measure records.
     * </p>
     * 
     * @param tableName
     *        The name of the database table into which to write the measure records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamAction withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Metadata attributes of the time series that are written in each measure record.
     * </p>
     * 
     * @return Metadata attributes of the time series that are written in each measure record.
     */

    public java.util.List<TimestreamDimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * Metadata attributes of the time series that are written in each measure record.
     * </p>
     * 
     * @param dimensions
     *        Metadata attributes of the time series that are written in each measure record.
     */

    public void setDimensions(java.util.Collection<TimestreamDimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<TimestreamDimension>(dimensions);
    }

    /**
     * <p>
     * Metadata attributes of the time series that are written in each measure record.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        Metadata attributes of the time series that are written in each measure record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamAction withDimensions(TimestreamDimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new java.util.ArrayList<TimestreamDimension>(dimensions.length));
        }
        for (TimestreamDimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata attributes of the time series that are written in each measure record.
     * </p>
     * 
     * @param dimensions
     *        Metadata attributes of the time series that are written in each measure record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamAction withDimensions(java.util.Collection<TimestreamDimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * Specifies an application-defined value to replace the default value assigned to the Timestream record's timestamp
     * in the <code>time</code> column.
     * </p>
     * <p>
     * You can use this property to specify the value and the precision of the Timestream record's timestamp. You can
     * specify a value from the message payload or a value computed by a substitution template.
     * </p>
     * <p>
     * If omitted, the topic rule action assigns the timestamp, in milliseconds, at the time it processed the rule.
     * </p>
     * 
     * @param timestamp
     *        Specifies an application-defined value to replace the default value assigned to the Timestream record's
     *        timestamp in the <code>time</code> column.</p>
     *        <p>
     *        You can use this property to specify the value and the precision of the Timestream record's timestamp. You
     *        can specify a value from the message payload or a value computed by a substitution template.
     *        </p>
     *        <p>
     *        If omitted, the topic rule action assigns the timestamp, in milliseconds, at the time it processed the
     *        rule.
     */

    public void setTimestamp(TimestreamTimestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Specifies an application-defined value to replace the default value assigned to the Timestream record's timestamp
     * in the <code>time</code> column.
     * </p>
     * <p>
     * You can use this property to specify the value and the precision of the Timestream record's timestamp. You can
     * specify a value from the message payload or a value computed by a substitution template.
     * </p>
     * <p>
     * If omitted, the topic rule action assigns the timestamp, in milliseconds, at the time it processed the rule.
     * </p>
     * 
     * @return Specifies an application-defined value to replace the default value assigned to the Timestream record's
     *         timestamp in the <code>time</code> column.</p>
     *         <p>
     *         You can use this property to specify the value and the precision of the Timestream record's timestamp.
     *         You can specify a value from the message payload or a value computed by a substitution template.
     *         </p>
     *         <p>
     *         If omitted, the topic rule action assigns the timestamp, in milliseconds, at the time it processed the
     *         rule.
     */

    public TimestreamTimestamp getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Specifies an application-defined value to replace the default value assigned to the Timestream record's timestamp
     * in the <code>time</code> column.
     * </p>
     * <p>
     * You can use this property to specify the value and the precision of the Timestream record's timestamp. You can
     * specify a value from the message payload or a value computed by a substitution template.
     * </p>
     * <p>
     * If omitted, the topic rule action assigns the timestamp, in milliseconds, at the time it processed the rule.
     * </p>
     * 
     * @param timestamp
     *        Specifies an application-defined value to replace the default value assigned to the Timestream record's
     *        timestamp in the <code>time</code> column.</p>
     *        <p>
     *        You can use this property to specify the value and the precision of the Timestream record's timestamp. You
     *        can specify a value from the message payload or a value computed by a substitution template.
     *        </p>
     *        <p>
     *        If omitted, the topic rule action assigns the timestamp, in milliseconds, at the time it processed the
     *        rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamAction withTimestamp(TimestreamTimestamp timestamp) {
        setTimestamp(timestamp);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimestreamAction == false)
            return false;
        TimestreamAction other = (TimestreamAction) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public TimestreamAction clone() {
        try {
            return (TimestreamAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.TimestreamActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
