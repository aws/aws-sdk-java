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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an action to write to a DynamoDB table.
 * </p>
 * <p>
 * The <code>tableName</code>, <code>hashKeyField</code>, and <code>rangeKeyField</code> values must match the values
 * used when you created the table.
 * </p>
 * <p>
 * The <code>hashKeyValue</code> and <code>rangeKeyvalue</code> fields use a substitution template syntax. These
 * templates provide data at runtime. The syntax is as follows: ${<i>sql-expression</i>}.
 * </p>
 * <p>
 * You can specify any valid expression in a WHERE or SELECT clause, including JSON properties, comparisons,
 * calculations, and functions. For example, the following field uses the third level of the topic:
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamoDBAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The type of operation to be performed. This follows the substitution template, so it can be
     * <code>${operation}</code>, but the substitution must result in one of the following: <code>INSERT</code>,
     * <code>UPDATE</code>, or <code>DELETE</code>.
     * </p>
     */
    private String operation;
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
     * The hash key type. Valid values are "STRING" or "NUMBER"
     * </p>
     */
    private String hashKeyType;
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
     * The range key type. Valid values are "STRING" or "NUMBER"
     * </p>
     */
    private String rangeKeyType;
    /**
     * <p>
     * The action payload. This name can be customized.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access to the DynamoDB table.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * </p>
     * 
     * @return The ARN of the IAM role that grants access to the DynamoDB table.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants access to the DynamoDB table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The type of operation to be performed. This follows the substitution template, so it can be
     * <code>${operation}</code>, but the substitution must result in one of the following: <code>INSERT</code>,
     * <code>UPDATE</code>, or <code>DELETE</code>.
     * </p>
     * 
     * @param operation
     *        The type of operation to be performed. This follows the substitution template, so it can be
     *        <code>${operation}</code>, but the substitution must result in one of the following: <code>INSERT</code>,
     *        <code>UPDATE</code>, or <code>DELETE</code>.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The type of operation to be performed. This follows the substitution template, so it can be
     * <code>${operation}</code>, but the substitution must result in one of the following: <code>INSERT</code>,
     * <code>UPDATE</code>, or <code>DELETE</code>.
     * </p>
     * 
     * @return The type of operation to be performed. This follows the substitution template, so it can be
     *         <code>${operation}</code>, but the substitution must result in one of the following: <code>INSERT</code>,
     *         <code>UPDATE</code>, or <code>DELETE</code>.
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The type of operation to be performed. This follows the substitution template, so it can be
     * <code>${operation}</code>, but the substitution must result in one of the following: <code>INSERT</code>,
     * <code>UPDATE</code>, or <code>DELETE</code>.
     * </p>
     * 
     * @param operation
     *        The type of operation to be performed. This follows the substitution template, so it can be
     *        <code>${operation}</code>, but the substitution must result in one of the following: <code>INSERT</code>,
     *        <code>UPDATE</code>, or <code>DELETE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withOperation(String operation) {
        setOperation(operation);
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
     * @return Returns a reference to this object so that method calls can be chained together.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withHashKeyValue(String hashKeyValue) {
        setHashKeyValue(hashKeyValue);
        return this;
    }

    /**
     * <p>
     * The hash key type. Valid values are "STRING" or "NUMBER"
     * </p>
     * 
     * @param hashKeyType
     *        The hash key type. Valid values are "STRING" or "NUMBER"
     * @see DynamoKeyType
     */

    public void setHashKeyType(String hashKeyType) {
        this.hashKeyType = hashKeyType;
    }

    /**
     * <p>
     * The hash key type. Valid values are "STRING" or "NUMBER"
     * </p>
     * 
     * @return The hash key type. Valid values are "STRING" or "NUMBER"
     * @see DynamoKeyType
     */

    public String getHashKeyType() {
        return this.hashKeyType;
    }

    /**
     * <p>
     * The hash key type. Valid values are "STRING" or "NUMBER"
     * </p>
     * 
     * @param hashKeyType
     *        The hash key type. Valid values are "STRING" or "NUMBER"
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DynamoKeyType
     */

    public DynamoDBAction withHashKeyType(String hashKeyType) {
        setHashKeyType(hashKeyType);
        return this;
    }

    /**
     * <p>
     * The hash key type. Valid values are "STRING" or "NUMBER"
     * </p>
     * 
     * @param hashKeyType
     *        The hash key type. Valid values are "STRING" or "NUMBER"
     * @see DynamoKeyType
     */

    public void setHashKeyType(DynamoKeyType hashKeyType) {
        withHashKeyType(hashKeyType);
    }

    /**
     * <p>
     * The hash key type. Valid values are "STRING" or "NUMBER"
     * </p>
     * 
     * @param hashKeyType
     *        The hash key type. Valid values are "STRING" or "NUMBER"
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DynamoKeyType
     */

    public DynamoDBAction withHashKeyType(DynamoKeyType hashKeyType) {
        this.hashKeyType = hashKeyType.toString();
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
     * @return Returns a reference to this object so that method calls can be chained together.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withRangeKeyValue(String rangeKeyValue) {
        setRangeKeyValue(rangeKeyValue);
        return this;
    }

    /**
     * <p>
     * The range key type. Valid values are "STRING" or "NUMBER"
     * </p>
     * 
     * @param rangeKeyType
     *        The range key type. Valid values are "STRING" or "NUMBER"
     * @see DynamoKeyType
     */

    public void setRangeKeyType(String rangeKeyType) {
        this.rangeKeyType = rangeKeyType;
    }

    /**
     * <p>
     * The range key type. Valid values are "STRING" or "NUMBER"
     * </p>
     * 
     * @return The range key type. Valid values are "STRING" or "NUMBER"
     * @see DynamoKeyType
     */

    public String getRangeKeyType() {
        return this.rangeKeyType;
    }

    /**
     * <p>
     * The range key type. Valid values are "STRING" or "NUMBER"
     * </p>
     * 
     * @param rangeKeyType
     *        The range key type. Valid values are "STRING" or "NUMBER"
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DynamoKeyType
     */

    public DynamoDBAction withRangeKeyType(String rangeKeyType) {
        setRangeKeyType(rangeKeyType);
        return this;
    }

    /**
     * <p>
     * The range key type. Valid values are "STRING" or "NUMBER"
     * </p>
     * 
     * @param rangeKeyType
     *        The range key type. Valid values are "STRING" or "NUMBER"
     * @see DynamoKeyType
     */

    public void setRangeKeyType(DynamoKeyType rangeKeyType) {
        withRangeKeyType(rangeKeyType);
    }

    /**
     * <p>
     * The range key type. Valid values are "STRING" or "NUMBER"
     * </p>
     * 
     * @param rangeKeyType
     *        The range key type. Valid values are "STRING" or "NUMBER"
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DynamoKeyType
     */

    public DynamoDBAction withRangeKeyType(DynamoKeyType rangeKeyType) {
        this.rangeKeyType = rangeKeyType.toString();
        return this;
    }

    /**
     * <p>
     * The action payload. This name can be customized.
     * </p>
     * 
     * @param payloadField
     *        The action payload. This name can be customized.
     */

    public void setPayloadField(String payloadField) {
        this.payloadField = payloadField;
    }

    /**
     * <p>
     * The action payload. This name can be customized.
     * </p>
     * 
     * @return The action payload. This name can be customized.
     */

    public String getPayloadField() {
        return this.payloadField;
    }

    /**
     * <p>
     * The action payload. This name can be customized.
     * </p>
     * 
     * @param payloadField
     *        The action payload. This name can be customized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBAction withPayloadField(String payloadField) {
        setPayloadField(payloadField);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getHashKeyField() != null)
            sb.append("HashKeyField: ").append(getHashKeyField()).append(",");
        if (getHashKeyValue() != null)
            sb.append("HashKeyValue: ").append(getHashKeyValue()).append(",");
        if (getHashKeyType() != null)
            sb.append("HashKeyType: ").append(getHashKeyType()).append(",");
        if (getRangeKeyField() != null)
            sb.append("RangeKeyField: ").append(getRangeKeyField()).append(",");
        if (getRangeKeyValue() != null)
            sb.append("RangeKeyValue: ").append(getRangeKeyValue()).append(",");
        if (getRangeKeyType() != null)
            sb.append("RangeKeyType: ").append(getRangeKeyType()).append(",");
        if (getPayloadField() != null)
            sb.append("PayloadField: ").append(getPayloadField());
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
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getHashKeyField() == null ^ this.getHashKeyField() == null)
            return false;
        if (other.getHashKeyField() != null && other.getHashKeyField().equals(this.getHashKeyField()) == false)
            return false;
        if (other.getHashKeyValue() == null ^ this.getHashKeyValue() == null)
            return false;
        if (other.getHashKeyValue() != null && other.getHashKeyValue().equals(this.getHashKeyValue()) == false)
            return false;
        if (other.getHashKeyType() == null ^ this.getHashKeyType() == null)
            return false;
        if (other.getHashKeyType() != null && other.getHashKeyType().equals(this.getHashKeyType()) == false)
            return false;
        if (other.getRangeKeyField() == null ^ this.getRangeKeyField() == null)
            return false;
        if (other.getRangeKeyField() != null && other.getRangeKeyField().equals(this.getRangeKeyField()) == false)
            return false;
        if (other.getRangeKeyValue() == null ^ this.getRangeKeyValue() == null)
            return false;
        if (other.getRangeKeyValue() != null && other.getRangeKeyValue().equals(this.getRangeKeyValue()) == false)
            return false;
        if (other.getRangeKeyType() == null ^ this.getRangeKeyType() == null)
            return false;
        if (other.getRangeKeyType() != null && other.getRangeKeyType().equals(this.getRangeKeyType()) == false)
            return false;
        if (other.getPayloadField() == null ^ this.getPayloadField() == null)
            return false;
        if (other.getPayloadField() != null && other.getPayloadField().equals(this.getPayloadField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getHashKeyField() == null) ? 0 : getHashKeyField().hashCode());
        hashCode = prime * hashCode + ((getHashKeyValue() == null) ? 0 : getHashKeyValue().hashCode());
        hashCode = prime * hashCode + ((getHashKeyType() == null) ? 0 : getHashKeyType().hashCode());
        hashCode = prime * hashCode + ((getRangeKeyField() == null) ? 0 : getRangeKeyField().hashCode());
        hashCode = prime * hashCode + ((getRangeKeyValue() == null) ? 0 : getRangeKeyValue().hashCode());
        hashCode = prime * hashCode + ((getRangeKeyType() == null) ? 0 : getRangeKeyType().hashCode());
        hashCode = prime * hashCode + ((getPayloadField() == null) ? 0 : getPayloadField().hashCode());
        return hashCode;
    }

    @Override
    public DynamoDBAction clone() {
        try {
            return (DynamoDBAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.DynamoDBActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
