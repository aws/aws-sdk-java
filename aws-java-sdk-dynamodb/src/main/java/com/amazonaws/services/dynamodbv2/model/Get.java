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
 * Specifies an item and related attribute values to retrieve in a <code>TransactGetItem</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Get" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Get implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects that specifies the primary key of the item to
     * retrieve.
     * </p>
     */
    private java.util.Map<String, AttributeValue> key;
    /**
     * <p>
     * The name of the table from which to retrieve the specified item.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes
     * in the expression must be separated by commas. If no attribute names are specified, then all attributes of the
     * specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
     * </p>
     */
    private String projectionExpression;
    /**
     * <p>
     * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
     * </p>
     */
    private java.util.Map<String, String> expressionAttributeNames;

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects that specifies the primary key of the item to
     * retrieve.
     * </p>
     * 
     * @return A map of attribute names to <code>AttributeValue</code> objects that specifies the primary key of the
     *         item to retrieve.
     */

    public java.util.Map<String, AttributeValue> getKey() {
        return key;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects that specifies the primary key of the item to
     * retrieve.
     * </p>
     * 
     * @param key
     *        A map of attribute names to <code>AttributeValue</code> objects that specifies the primary key of the item
     *        to retrieve.
     */

    public void setKey(java.util.Map<String, AttributeValue> key) {
        this.key = key;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects that specifies the primary key of the item to
     * retrieve.
     * </p>
     * 
     * @param key
     *        A map of attribute names to <code>AttributeValue</code> objects that specifies the primary key of the item
     *        to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get withKey(java.util.Map<String, AttributeValue> key) {
        setKey(key);
        return this;
    }

    public Get addKeyEntry(String key, AttributeValue value) {
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

    public Get clearKeyEntries() {
        this.key = null;
        return this;
    }

    /**
     * <p>
     * The name of the table from which to retrieve the specified item.
     * </p>
     * 
     * @param tableName
     *        The name of the table from which to retrieve the specified item.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table from which to retrieve the specified item.
     * </p>
     * 
     * @return The name of the table from which to retrieve the specified item.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table from which to retrieve the specified item.
     * </p>
     * 
     * @param tableName
     *        The name of the table from which to retrieve the specified item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes
     * in the expression must be separated by commas. If no attribute names are specified, then all attributes of the
     * specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
     * </p>
     * 
     * @param projectionExpression
     *        A string that identifies one or more attributes of the specified item to retrieve from the table. The
     *        attributes in the expression must be separated by commas. If no attribute names are specified, then all
     *        attributes of the specified item are returned. If any of the requested attributes are not found, they do
     *        not appear in the result.
     */

    public void setProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
    }

    /**
     * <p>
     * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes
     * in the expression must be separated by commas. If no attribute names are specified, then all attributes of the
     * specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
     * </p>
     * 
     * @return A string that identifies one or more attributes of the specified item to retrieve from the table. The
     *         attributes in the expression must be separated by commas. If no attribute names are specified, then all
     *         attributes of the specified item are returned. If any of the requested attributes are not found, they do
     *         not appear in the result.
     */

    public String getProjectionExpression() {
        return this.projectionExpression;
    }

    /**
     * <p>
     * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes
     * in the expression must be separated by commas. If no attribute names are specified, then all attributes of the
     * specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
     * </p>
     * 
     * @param projectionExpression
     *        A string that identifies one or more attributes of the specified item to retrieve from the table. The
     *        attributes in the expression must be separated by commas. If no attribute names are specified, then all
     *        attributes of the specified item are returned. If any of the requested attributes are not found, they do
     *        not appear in the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get withProjectionExpression(String projectionExpression) {
        setProjectionExpression(projectionExpression);
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
     * </p>
     * 
     * @return One or more substitution tokens for attribute names in the ProjectionExpression parameter.
     */

    public java.util.Map<String, String> getExpressionAttributeNames() {
        return expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
     * </p>
     * 
     * @param expressionAttributeNames
     *        One or more substitution tokens for attribute names in the ProjectionExpression parameter.
     */

    public void setExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
     * </p>
     * 
     * @param expressionAttributeNames
     *        One or more substitution tokens for attribute names in the ProjectionExpression parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Get withExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    public Get addExpressionAttributeNamesEntry(String key, String value) {
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

    public Get clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getProjectionExpression() != null)
            sb.append("ProjectionExpression: ").append(getProjectionExpression()).append(",");
        if (getExpressionAttributeNames() != null)
            sb.append("ExpressionAttributeNames: ").append(getExpressionAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Get == false)
            return false;
        Get other = (Get) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getProjectionExpression() == null ^ this.getProjectionExpression() == null)
            return false;
        if (other.getProjectionExpression() != null && other.getProjectionExpression().equals(this.getProjectionExpression()) == false)
            return false;
        if (other.getExpressionAttributeNames() == null ^ this.getExpressionAttributeNames() == null)
            return false;
        if (other.getExpressionAttributeNames() != null && other.getExpressionAttributeNames().equals(this.getExpressionAttributeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getProjectionExpression() == null) ? 0 : getProjectionExpression().hashCode());
        hashCode = prime * hashCode + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public Get clone() {
        try {
            return (Get) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.GetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
