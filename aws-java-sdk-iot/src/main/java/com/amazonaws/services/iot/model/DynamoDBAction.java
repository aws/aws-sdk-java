/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an action to write to a DynamoDB table.
 * </p>
 * <p>
 * The <code>tableName</code>, <code>hashKeyField</code>, and
 * <code>rangeKeyField</code> values must match the values used when you created
 * the table.
 * </p>
 * <p>
 * The <code>hashKeyValue</code> and <code>rangeKeyvalue</code> fields use a
 * substitution template syntax. These templates provide data at runtime. The
 * syntax is as follows: ${<i>sql-expression</i>}.
 * </p>
 * <p>
 * You can specify any expression that's valid in a WHERE or SELECT clause,
 * including JSON properties, comparisons, calculations, and functions. For
 * example, the following field uses the third level of the topic:
 * </p>
 * <p>
 * <code>"hashKeyValue": "${topic(3)}"</code>
 * </p>
 * <p>
 * The following field uses the timestamp:
 * </p>
 * <p>
 * <code>"rangeKeyValue": "${timestamp()}"</code>
 * </p>
 */
public class DynamoDBAction implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The hash key name.
     * </p>
     */
    private String hashKeyField;
    /**
     * <p>
     * The hash key value.
     * </p>
     */
    private String hashKeyValue;
    /**
     * <p>
     * The range key name.
     * </p>
     */
    private String rangeKeyField;
    /**
     * <p>
     * The range key value.
     * </p>
     */
    private String rangeKeyValue;
    /**
     * <p>
     * The action payload, this name can be customized.
     * </p>
     */
    private String payloadField;

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     * 
     * @param tableName
     *        The name of the DynamoDB table.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     * 
     * @return The name of the DynamoDB table.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     * 
     * @param tableName
     *        The name of the DynamoDB table.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @return The ARN of the IAM role that grants access.
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The hash key name.
     * </p>
     * 
     * @param hashKeyField
     *        The hash key name.
     */
    public void setHashKeyField(String hashKeyField) {
        this.hashKeyField = hashKeyField;
    }

    /**
     * <p>
     * The hash key name.
     * </p>
     * 
     * @return The hash key name.
     */
    public String getHashKeyField() {
        return this.hashKeyField;
    }

    /**
     * <p>
     * The hash key name.
     * </p>
     * 
     * @param hashKeyField
     *        The hash key name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withHashKeyField(String hashKeyField) {
        setHashKeyField(hashKeyField);
        return this;
    }

    /**
     * <p>
     * The hash key value.
     * </p>
     * 
     * @param hashKeyValue
     *        The hash key value.
     */
    public void setHashKeyValue(String hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }

    /**
     * <p>
     * The hash key value.
     * </p>
     * 
     * @return The hash key value.
     */
    public String getHashKeyValue() {
        return this.hashKeyValue;
    }

    /**
     * <p>
     * The hash key value.
     * </p>
     * 
     * @param hashKeyValue
     *        The hash key value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withHashKeyValue(String hashKeyValue) {
        setHashKeyValue(hashKeyValue);
        return this;
    }

    /**
     * <p>
     * The range key name.
     * </p>
     * 
     * @param rangeKeyField
     *        The range key name.
     */
    public void setRangeKeyField(String rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
    }

    /**
     * <p>
     * The range key name.
     * </p>
     * 
     * @return The range key name.
     */
    public String getRangeKeyField() {
        return this.rangeKeyField;
    }

    /**
     * <p>
     * The range key name.
     * </p>
     * 
     * @param rangeKeyField
     *        The range key name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withRangeKeyField(String rangeKeyField) {
        setRangeKeyField(rangeKeyField);
        return this;
    }

    /**
     * <p>
     * The range key value.
     * </p>
     * 
     * @param rangeKeyValue
     *        The range key value.
     */
    public void setRangeKeyValue(String rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
    }

    /**
     * <p>
     * The range key value.
     * </p>
     * 
     * @return The range key value.
     */
    public String getRangeKeyValue() {
        return this.rangeKeyValue;
    }

    /**
     * <p>
     * The range key value.
     * </p>
     * 
     * @param rangeKeyValue
     *        The range key value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withRangeKeyValue(String rangeKeyValue) {
        setRangeKeyValue(rangeKeyValue);
        return this;
    }

    /**
     * <p>
     * The action payload, this name can be customized.
     * </p>
     * 
     * @param payloadField
     *        The action payload, this name can be customized.
     */
    public void setPayloadField(String payloadField) {
        this.payloadField = payloadField;
    }

    /**
     * <p>
     * The action payload, this name can be customized.
     * </p>
     * 
     * @return The action payload, this name can be customized.
     */
    public String getPayloadField() {
        return this.payloadField;
    }

    /**
     * <p>
     * The action payload, this name can be customized.
     * </p>
     * 
     * @param payloadField
     *        The action payload, this name can be customized.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DynamoDBAction withPayloadField(String payloadField) {
        setPayloadField(payloadField);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getHashKeyField() != null)
            sb.append("HashKeyField: " + getHashKeyField() + ",");
        if (getHashKeyValue() != null)
            sb.append("HashKeyValue: " + getHashKeyValue() + ",");
        if (getRangeKeyField() != null)
            sb.append("RangeKeyField: " + getRangeKeyField() + ",");
        if (getRangeKeyValue() != null)
            sb.append("RangeKeyValue: " + getRangeKeyValue() + ",");
        if (getPayloadField() != null)
            sb.append("PayloadField: " + getPayloadField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamoDBAction == false)
            return false;
        DynamoDBAction other = (DynamoDBAction) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null
                && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getHashKeyField() == null ^ this.getHashKeyField() == null)
            return false;
        if (other.getHashKeyField() != null
                && other.getHashKeyField().equals(this.getHashKeyField()) == false)
            return false;
        if (other.getHashKeyValue() == null ^ this.getHashKeyValue() == null)
            return false;
        if (other.getHashKeyValue() != null
                && other.getHashKeyValue().equals(this.getHashKeyValue()) == false)
            return false;
        if (other.getRangeKeyField() == null ^ this.getRangeKeyField() == null)
            return false;
        if (other.getRangeKeyField() != null
                && other.getRangeKeyField().equals(this.getRangeKeyField()) == false)
            return false;
        if (other.getRangeKeyValue() == null ^ this.getRangeKeyValue() == null)
            return false;
        if (other.getRangeKeyValue() != null
                && other.getRangeKeyValue().equals(this.getRangeKeyValue()) == false)
            return false;
        if (other.getPayloadField() == null ^ this.getPayloadField() == null)
            return false;
        if (other.getPayloadField() != null
                && other.getPayloadField().equals(this.getPayloadField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode
                + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getHashKeyField() == null) ? 0 : getHashKeyField()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHashKeyValue() == null) ? 0 : getHashKeyValue()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRangeKeyField() == null) ? 0 : getRangeKeyField()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRangeKeyValue() == null) ? 0 : getRangeKeyValue()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPayloadField() == null) ? 0 : getPayloadField()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DynamoDBAction clone() {
        try {
            return (DynamoDBAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}