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
 * Represents a request to perform an <code>UpdateItem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Update" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Update implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     * attribute.
     * </p>
     */
    private java.util.Map<String, AttributeValue> key;
    /**
     * <p>
     * An expression that defines one or more attributes to be updated, the action to be performed on them, and new
     * value(s) for them.
     * </p>
     */
    private String updateExpression;
    /**
     * <p>
     * Name of the table for the <code>UpdateItem</code> request.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A condition that must be satisfied in order for a conditional update to succeed.
     * </p>
     */
    private String conditionExpression;
    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression.
     * </p>
     */
    private java.util.Map<String, String> expressionAttributeNames;
    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     */
    private java.util.Map<String, AttributeValue> expressionAttributeValues;
    /**
     * <p>
     * Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item attributes if the <code>Update</code>
     * condition fails. For <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are: NONE, ALL_OLD,
     * UPDATED_OLD, ALL_NEW, UPDATED_NEW.
     * </p>
     */
    private String returnValuesOnConditionCheckFailure;

    /**
     * <p>
     * The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     * attribute.
     * </p>
     * 
     * @return The primary key of the item to be updated. Each element consists of an attribute name and a value for
     *         that attribute.
     */

    public java.util.Map<String, AttributeValue> getKey() {
        return key;
    }

    /**
     * <p>
     * The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     * attribute.
     * </p>
     * 
     * @param key
     *        The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     *        attribute.
     */

    public void setKey(java.util.Map<String, AttributeValue> key) {
        this.key = key;
    }

    /**
     * <p>
     * The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     * attribute.
     * </p>
     * 
     * @param key
     *        The primary key of the item to be updated. Each element consists of an attribute name and a value for that
     *        attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update withKey(java.util.Map<String, AttributeValue> key) {
        setKey(key);
        return this;
    }

    public Update addKeyEntry(String key, AttributeValue value) {
        if (null == this.key) {
            this.key = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.key.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.key.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Key.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update clearKeyEntries() {
        this.key = null;
        return this;
    }

    /**
     * <p>
     * An expression that defines one or more attributes to be updated, the action to be performed on them, and new
     * value(s) for them.
     * </p>
     * 
     * @param updateExpression
     *        An expression that defines one or more attributes to be updated, the action to be performed on them, and
     *        new value(s) for them.
     */

    public void setUpdateExpression(String updateExpression) {
        this.updateExpression = updateExpression;
    }

    /**
     * <p>
     * An expression that defines one or more attributes to be updated, the action to be performed on them, and new
     * value(s) for them.
     * </p>
     * 
     * @return An expression that defines one or more attributes to be updated, the action to be performed on them, and
     *         new value(s) for them.
     */

    public String getUpdateExpression() {
        return this.updateExpression;
    }

    /**
     * <p>
     * An expression that defines one or more attributes to be updated, the action to be performed on them, and new
     * value(s) for them.
     * </p>
     * 
     * @param updateExpression
     *        An expression that defines one or more attributes to be updated, the action to be performed on them, and
     *        new value(s) for them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update withUpdateExpression(String updateExpression) {
        setUpdateExpression(updateExpression);
        return this;
    }

    /**
     * <p>
     * Name of the table for the <code>UpdateItem</code> request.
     * </p>
     * 
     * @param tableName
     *        Name of the table for the <code>UpdateItem</code> request.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Name of the table for the <code>UpdateItem</code> request.
     * </p>
     * 
     * @return Name of the table for the <code>UpdateItem</code> request.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Name of the table for the <code>UpdateItem</code> request.
     * </p>
     * 
     * @param tableName
     *        Name of the table for the <code>UpdateItem</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional update to succeed.
     * </p>
     * 
     * @param conditionExpression
     *        A condition that must be satisfied in order for a conditional update to succeed.
     */

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional update to succeed.
     * </p>
     * 
     * @return A condition that must be satisfied in order for a conditional update to succeed.
     */

    public String getConditionExpression() {
        return this.conditionExpression;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional update to succeed.
     * </p>
     * 
     * @param conditionExpression
     *        A condition that must be satisfied in order for a conditional update to succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update withConditionExpression(String conditionExpression) {
        setConditionExpression(conditionExpression);
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression.
     * </p>
     * 
     * @return One or more substitution tokens for attribute names in an expression.
     */

    public java.util.Map<String, String> getExpressionAttributeNames() {
        return expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression.
     * </p>
     * 
     * @param expressionAttributeNames
     *        One or more substitution tokens for attribute names in an expression.
     */

    public void setExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression.
     * </p>
     * 
     * @param expressionAttributeNames
     *        One or more substitution tokens for attribute names in an expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update withExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    public Update addExpressionAttributeNamesEntry(String key, String value) {
        if (null == this.expressionAttributeNames) {
            this.expressionAttributeNames = new java.util.HashMap<String, String>();
        }
        if (this.expressionAttributeNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.expressionAttributeNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeNames.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
        return this;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * 
     * @return One or more values that can be substituted in an expression.
     */

    public java.util.Map<String, AttributeValue> getExpressionAttributeValues() {
        return expressionAttributeValues;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * 
     * @param expressionAttributeValues
     *        One or more values that can be substituted in an expression.
     */

    public void setExpressionAttributeValues(java.util.Map<String, AttributeValue> expressionAttributeValues) {
        this.expressionAttributeValues = expressionAttributeValues;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * 
     * @param expressionAttributeValues
     *        One or more values that can be substituted in an expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update withExpressionAttributeValues(java.util.Map<String, AttributeValue> expressionAttributeValues) {
        setExpressionAttributeValues(expressionAttributeValues);
        return this;
    }

    public Update addExpressionAttributeValuesEntry(String key, AttributeValue value) {
        if (null == this.expressionAttributeValues) {
            this.expressionAttributeValues = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.expressionAttributeValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.expressionAttributeValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeValues.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
    }

    /**
     * <p>
     * Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item attributes if the <code>Update</code>
     * condition fails. For <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are: NONE, ALL_OLD,
     * UPDATED_OLD, ALL_NEW, UPDATED_NEW.
     * </p>
     * 
     * @param returnValuesOnConditionCheckFailure
     *        Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item attributes if the <code>Update</code>
     *        condition fails. For <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are: NONE,
     *        ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW.
     * @see ReturnValuesOnConditionCheckFailure
     */

    public void setReturnValuesOnConditionCheckFailure(String returnValuesOnConditionCheckFailure) {
        this.returnValuesOnConditionCheckFailure = returnValuesOnConditionCheckFailure;
    }

    /**
     * <p>
     * Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item attributes if the <code>Update</code>
     * condition fails. For <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are: NONE, ALL_OLD,
     * UPDATED_OLD, ALL_NEW, UPDATED_NEW.
     * </p>
     * 
     * @return Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item attributes if the
     *         <code>Update</code> condition fails. For <code>ReturnValuesOnConditionCheckFailure</code>, the valid
     *         values are: NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW.
     * @see ReturnValuesOnConditionCheckFailure
     */

    public String getReturnValuesOnConditionCheckFailure() {
        return this.returnValuesOnConditionCheckFailure;
    }

    /**
     * <p>
     * Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item attributes if the <code>Update</code>
     * condition fails. For <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are: NONE, ALL_OLD,
     * UPDATED_OLD, ALL_NEW, UPDATED_NEW.
     * </p>
     * 
     * @param returnValuesOnConditionCheckFailure
     *        Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item attributes if the <code>Update</code>
     *        condition fails. For <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are: NONE,
     *        ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnValuesOnConditionCheckFailure
     */

    public Update withReturnValuesOnConditionCheckFailure(String returnValuesOnConditionCheckFailure) {
        setReturnValuesOnConditionCheckFailure(returnValuesOnConditionCheckFailure);
        return this;
    }

    /**
     * <p>
     * Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item attributes if the <code>Update</code>
     * condition fails. For <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are: NONE, ALL_OLD,
     * UPDATED_OLD, ALL_NEW, UPDATED_NEW.
     * </p>
     * 
     * @param returnValuesOnConditionCheckFailure
     *        Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item attributes if the <code>Update</code>
     *        condition fails. For <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are: NONE,
     *        ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnValuesOnConditionCheckFailure
     */

    public Update withReturnValuesOnConditionCheckFailure(ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure) {
        this.returnValuesOnConditionCheckFailure = returnValuesOnConditionCheckFailure.toString();
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getUpdateExpression() != null)
            sb.append("UpdateExpression: ").append(getUpdateExpression()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getConditionExpression() != null)
            sb.append("ConditionExpression: ").append(getConditionExpression()).append(",");
        if (getExpressionAttributeNames() != null)
            sb.append("ExpressionAttributeNames: ").append(getExpressionAttributeNames()).append(",");
        if (getExpressionAttributeValues() != null)
            sb.append("ExpressionAttributeValues: ").append(getExpressionAttributeValues()).append(",");
        if (getReturnValuesOnConditionCheckFailure() != null)
            sb.append("ReturnValuesOnConditionCheckFailure: ").append(getReturnValuesOnConditionCheckFailure());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Update == false)
            return false;
        Update other = (Update) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getUpdateExpression() == null ^ this.getUpdateExpression() == null)
            return false;
        if (other.getUpdateExpression() != null && other.getUpdateExpression().equals(this.getUpdateExpression()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getConditionExpression() == null ^ this.getConditionExpression() == null)
            return false;
        if (other.getConditionExpression() != null && other.getConditionExpression().equals(this.getConditionExpression()) == false)
            return false;
        if (other.getExpressionAttributeNames() == null ^ this.getExpressionAttributeNames() == null)
            return false;
        if (other.getExpressionAttributeNames() != null && other.getExpressionAttributeNames().equals(this.getExpressionAttributeNames()) == false)
            return false;
        if (other.getExpressionAttributeValues() == null ^ this.getExpressionAttributeValues() == null)
            return false;
        if (other.getExpressionAttributeValues() != null && other.getExpressionAttributeValues().equals(this.getExpressionAttributeValues()) == false)
            return false;
        if (other.getReturnValuesOnConditionCheckFailure() == null ^ this.getReturnValuesOnConditionCheckFailure() == null)
            return false;
        if (other.getReturnValuesOnConditionCheckFailure() != null
                && other.getReturnValuesOnConditionCheckFailure().equals(this.getReturnValuesOnConditionCheckFailure()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getUpdateExpression() == null) ? 0 : getUpdateExpression().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getConditionExpression() == null) ? 0 : getConditionExpression().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeValues() == null) ? 0 : getExpressionAttributeValues().hashCode());
        hashCode = prime * hashCode + ((getReturnValuesOnConditionCheckFailure() == null) ? 0 : getReturnValuesOnConditionCheckFailure().hashCode());
        return hashCode;
    }

    @Override
    public Update clone() {
        try {
            return (Update) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.UpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
