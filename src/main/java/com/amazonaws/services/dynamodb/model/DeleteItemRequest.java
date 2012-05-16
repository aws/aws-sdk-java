/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodb.AmazonDynamoDB#deleteItem(DeleteItemRequest) DeleteItem operation}.
 * <p>
 * Deletes a single item in a table by primary key.
 * </p>
 * <p>
 * You can perform a conditional delete operation that deletes the item if it exists, or if it has an expected attribute value.
 * </p>
 *
 * @see com.amazonaws.services.dynamodb.AmazonDynamoDB#deleteItem(DeleteItemRequest)
 */
public class DeleteItemRequest extends AmazonWebServiceRequest {

    /**
     * The name of the table in which you want to delete an item. Allowed
     * characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * The primary key that uniquely identifies each item in a table. A
     * primary key can be a one attribute (hash) primary key or a two
     * attribute (hash-and-range) primary key.
     */
    private Key key;

    /**
     * Designates an attribute for a conditional modification. The
     * <code>Expected</code> parameter allows you to provide an attribute
     * name, and whether or not Amazon DynamoDB should check to see if the
     * attribute has a particular value before modifying it.
     */
    private java.util.Map<String,ExpectedAttributeValue> expected;

    /**
     * Use this parameter if you want to get the attribute name-value pairs
     * before or after they are modified. For <code>PUT</code> operations,
     * the possible parameter values are <code>NONE</code> (default) or
     * <code>ALL_OLD</code>. For update operations, the possible parameter
     * values are <code>NONE</code> (default) or <code>ALL_OLD</code>,
     * <code>UPDATED_OLD</code>, <code>ALL_NEW</code> or
     * <code>UPDATED_NEW</code>. <ul> <li><code>NONE</code>: Nothing is
     * returned.</li> <li><code>ALL_OLD</code>: Returns the attributes of the
     * item as they were before the operation.</li>
     * <li><code>UPDATED_OLD</code>: Returns the values of the updated
     * attributes, only, as they were before the operation.</li>
     * <li><code>ALL_NEW</code>: Returns all the attributes and their new
     * values after the operation.</li> <li><code>UPDATED_NEW</code>: Returns
     * the values of the updated attributes, only, as they are after the
     * operation.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     */
    private String returnValues;

    /**
     * Default constructor for a new DeleteItemRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteItemRequest() {}
    
    /**
     * Constructs a new DeleteItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table in which you want to delete an
     * item. Allowed characters are <code>a-z</code>, <code>A-Z</code>,
     * <code>0-9</code>, <code>_</code> (underscore), <code>-</code> (hyphen)
     * and <code>.</code> (period).
     * @param key The primary key that uniquely identifies each item in a
     * table. A primary key can be a one attribute (hash) primary key or a
     * two attribute (hash-and-range) primary key.
     */
    public DeleteItemRequest(String tableName, Key key) {
        this.tableName = tableName;
        this.key = key;
    }

    
    
    /**
     * The name of the table in which you want to delete an item. Allowed
     * characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table in which you want to delete an item. Allowed
     *         characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table in which you want to delete an item. Allowed
     * characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table in which you want to delete an item. Allowed
     *         characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table in which you want to delete an item. Allowed
     * characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table in which you want to delete an item. Allowed
     *         characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
    
    /**
     * The primary key that uniquely identifies each item in a table. A
     * primary key can be a one attribute (hash) primary key or a two
     * attribute (hash-and-range) primary key.
     *
     * @return The primary key that uniquely identifies each item in a table. A
     *         primary key can be a one attribute (hash) primary key or a two
     *         attribute (hash-and-range) primary key.
     */
    public Key getKey() {
        return key;
    }
    
    /**
     * The primary key that uniquely identifies each item in a table. A
     * primary key can be a one attribute (hash) primary key or a two
     * attribute (hash-and-range) primary key.
     *
     * @param key The primary key that uniquely identifies each item in a table. A
     *         primary key can be a one attribute (hash) primary key or a two
     *         attribute (hash-and-range) primary key.
     */
    public void setKey(Key key) {
        this.key = key;
    }
    
    /**
     * The primary key that uniquely identifies each item in a table. A
     * primary key can be a one attribute (hash) primary key or a two
     * attribute (hash-and-range) primary key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The primary key that uniquely identifies each item in a table. A
     *         primary key can be a one attribute (hash) primary key or a two
     *         attribute (hash-and-range) primary key.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteItemRequest withKey(Key key) {
        this.key = key;
        return this;
    }
    
    
    /**
     * Designates an attribute for a conditional modification. The
     * <code>Expected</code> parameter allows you to provide an attribute
     * name, and whether or not Amazon DynamoDB should check to see if the
     * attribute has a particular value before modifying it.
     *
     * @return Designates an attribute for a conditional modification. The
     *         <code>Expected</code> parameter allows you to provide an attribute
     *         name, and whether or not Amazon DynamoDB should check to see if the
     *         attribute has a particular value before modifying it.
     */
    public java.util.Map<String,ExpectedAttributeValue> getExpected() {
        
        return expected;
    }
    
    /**
     * Designates an attribute for a conditional modification. The
     * <code>Expected</code> parameter allows you to provide an attribute
     * name, and whether or not Amazon DynamoDB should check to see if the
     * attribute has a particular value before modifying it.
     *
     * @param expected Designates an attribute for a conditional modification. The
     *         <code>Expected</code> parameter allows you to provide an attribute
     *         name, and whether or not Amazon DynamoDB should check to see if the
     *         attribute has a particular value before modifying it.
     */
    public void setExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
        this.expected = expected;
    }
    
    /**
     * Designates an attribute for a conditional modification. The
     * <code>Expected</code> parameter allows you to provide an attribute
     * name, and whether or not Amazon DynamoDB should check to see if the
     * attribute has a particular value before modifying it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expected Designates an attribute for a conditional modification. The
     *         <code>Expected</code> parameter allows you to provide an attribute
     *         name, and whether or not Amazon DynamoDB should check to see if the
     *         attribute has a particular value before modifying it.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteItemRequest withExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
        setExpected(expected);
        return this;
    }
    
    /**
     * Use this parameter if you want to get the attribute name-value pairs
     * before or after they are modified. For <code>PUT</code> operations,
     * the possible parameter values are <code>NONE</code> (default) or
     * <code>ALL_OLD</code>. For update operations, the possible parameter
     * values are <code>NONE</code> (default) or <code>ALL_OLD</code>,
     * <code>UPDATED_OLD</code>, <code>ALL_NEW</code> or
     * <code>UPDATED_NEW</code>. <ul> <li><code>NONE</code>: Nothing is
     * returned.</li> <li><code>ALL_OLD</code>: Returns the attributes of the
     * item as they were before the operation.</li>
     * <li><code>UPDATED_OLD</code>: Returns the values of the updated
     * attributes, only, as they were before the operation.</li>
     * <li><code>ALL_NEW</code>: Returns all the attributes and their new
     * values after the operation.</li> <li><code>UPDATED_NEW</code>: Returns
     * the values of the updated attributes, only, as they are after the
     * operation.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @return Use this parameter if you want to get the attribute name-value pairs
     *         before or after they are modified. For <code>PUT</code> operations,
     *         the possible parameter values are <code>NONE</code> (default) or
     *         <code>ALL_OLD</code>. For update operations, the possible parameter
     *         values are <code>NONE</code> (default) or <code>ALL_OLD</code>,
     *         <code>UPDATED_OLD</code>, <code>ALL_NEW</code> or
     *         <code>UPDATED_NEW</code>. <ul> <li><code>NONE</code>: Nothing is
     *         returned.</li> <li><code>ALL_OLD</code>: Returns the attributes of the
     *         item as they were before the operation.</li>
     *         <li><code>UPDATED_OLD</code>: Returns the values of the updated
     *         attributes, only, as they were before the operation.</li>
     *         <li><code>ALL_NEW</code>: Returns all the attributes and their new
     *         values after the operation.</li> <li><code>UPDATED_NEW</code>: Returns
     *         the values of the updated attributes, only, as they are after the
     *         operation.</li> </ul>
     *
     * @see ReturnValue
     */
    public String getReturnValues() {
        return returnValues;
    }
    
    /**
     * Use this parameter if you want to get the attribute name-value pairs
     * before or after they are modified. For <code>PUT</code> operations,
     * the possible parameter values are <code>NONE</code> (default) or
     * <code>ALL_OLD</code>. For update operations, the possible parameter
     * values are <code>NONE</code> (default) or <code>ALL_OLD</code>,
     * <code>UPDATED_OLD</code>, <code>ALL_NEW</code> or
     * <code>UPDATED_NEW</code>. <ul> <li><code>NONE</code>: Nothing is
     * returned.</li> <li><code>ALL_OLD</code>: Returns the attributes of the
     * item as they were before the operation.</li>
     * <li><code>UPDATED_OLD</code>: Returns the values of the updated
     * attributes, only, as they were before the operation.</li>
     * <li><code>ALL_NEW</code>: Returns all the attributes and their new
     * values after the operation.</li> <li><code>UPDATED_NEW</code>: Returns
     * the values of the updated attributes, only, as they are after the
     * operation.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use this parameter if you want to get the attribute name-value pairs
     *         before or after they are modified. For <code>PUT</code> operations,
     *         the possible parameter values are <code>NONE</code> (default) or
     *         <code>ALL_OLD</code>. For update operations, the possible parameter
     *         values are <code>NONE</code> (default) or <code>ALL_OLD</code>,
     *         <code>UPDATED_OLD</code>, <code>ALL_NEW</code> or
     *         <code>UPDATED_NEW</code>. <ul> <li><code>NONE</code>: Nothing is
     *         returned.</li> <li><code>ALL_OLD</code>: Returns the attributes of the
     *         item as they were before the operation.</li>
     *         <li><code>UPDATED_OLD</code>: Returns the values of the updated
     *         attributes, only, as they were before the operation.</li>
     *         <li><code>ALL_NEW</code>: Returns all the attributes and their new
     *         values after the operation.</li> <li><code>UPDATED_NEW</code>: Returns
     *         the values of the updated attributes, only, as they are after the
     *         operation.</li> </ul>
     *
     * @see ReturnValue
     */
    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues;
    }
    
    /**
     * Use this parameter if you want to get the attribute name-value pairs
     * before or after they are modified. For <code>PUT</code> operations,
     * the possible parameter values are <code>NONE</code> (default) or
     * <code>ALL_OLD</code>. For update operations, the possible parameter
     * values are <code>NONE</code> (default) or <code>ALL_OLD</code>,
     * <code>UPDATED_OLD</code>, <code>ALL_NEW</code> or
     * <code>UPDATED_NEW</code>. <ul> <li><code>NONE</code>: Nothing is
     * returned.</li> <li><code>ALL_OLD</code>: Returns the attributes of the
     * item as they were before the operation.</li>
     * <li><code>UPDATED_OLD</code>: Returns the values of the updated
     * attributes, only, as they were before the operation.</li>
     * <li><code>ALL_NEW</code>: Returns all the attributes and their new
     * values after the operation.</li> <li><code>UPDATED_NEW</code>: Returns
     * the values of the updated attributes, only, as they are after the
     * operation.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use this parameter if you want to get the attribute name-value pairs
     *         before or after they are modified. For <code>PUT</code> operations,
     *         the possible parameter values are <code>NONE</code> (default) or
     *         <code>ALL_OLD</code>. For update operations, the possible parameter
     *         values are <code>NONE</code> (default) or <code>ALL_OLD</code>,
     *         <code>UPDATED_OLD</code>, <code>ALL_NEW</code> or
     *         <code>UPDATED_NEW</code>. <ul> <li><code>NONE</code>: Nothing is
     *         returned.</li> <li><code>ALL_OLD</code>: Returns the attributes of the
     *         item as they were before the operation.</li>
     *         <li><code>UPDATED_OLD</code>: Returns the values of the updated
     *         attributes, only, as they were before the operation.</li>
     *         <li><code>ALL_NEW</code>: Returns all the attributes and their new
     *         values after the operation.</li> <li><code>UPDATED_NEW</code>: Returns
     *         the values of the updated attributes, only, as they are after the
     *         operation.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnValue
     */
    public DeleteItemRequest withReturnValues(String returnValues) {
        this.returnValues = returnValues;
        return this;
    }
    
    
    /**
     * Use this parameter if you want to get the attribute name-value pairs
     * before or after they are modified. For <code>PUT</code> operations,
     * the possible parameter values are <code>NONE</code> (default) or
     * <code>ALL_OLD</code>. For update operations, the possible parameter
     * values are <code>NONE</code> (default) or <code>ALL_OLD</code>,
     * <code>UPDATED_OLD</code>, <code>ALL_NEW</code> or
     * <code>UPDATED_NEW</code>. <ul> <li><code>NONE</code>: Nothing is
     * returned.</li> <li><code>ALL_OLD</code>: Returns the attributes of the
     * item as they were before the operation.</li>
     * <li><code>UPDATED_OLD</code>: Returns the values of the updated
     * attributes, only, as they were before the operation.</li>
     * <li><code>ALL_NEW</code>: Returns all the attributes and their new
     * values after the operation.</li> <li><code>UPDATED_NEW</code>: Returns
     * the values of the updated attributes, only, as they are after the
     * operation.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use this parameter if you want to get the attribute name-value pairs
     *         before or after they are modified. For <code>PUT</code> operations,
     *         the possible parameter values are <code>NONE</code> (default) or
     *         <code>ALL_OLD</code>. For update operations, the possible parameter
     *         values are <code>NONE</code> (default) or <code>ALL_OLD</code>,
     *         <code>UPDATED_OLD</code>, <code>ALL_NEW</code> or
     *         <code>UPDATED_NEW</code>. <ul> <li><code>NONE</code>: Nothing is
     *         returned.</li> <li><code>ALL_OLD</code>: Returns the attributes of the
     *         item as they were before the operation.</li>
     *         <li><code>UPDATED_OLD</code>: Returns the values of the updated
     *         attributes, only, as they were before the operation.</li>
     *         <li><code>ALL_NEW</code>: Returns all the attributes and their new
     *         values after the operation.</li> <li><code>UPDATED_NEW</code>: Returns
     *         the values of the updated attributes, only, as they are after the
     *         operation.</li> </ul>
     *
     * @see ReturnValue
     */
    public void setReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
    }
    
    /**
     * Use this parameter if you want to get the attribute name-value pairs
     * before or after they are modified. For <code>PUT</code> operations,
     * the possible parameter values are <code>NONE</code> (default) or
     * <code>ALL_OLD</code>. For update operations, the possible parameter
     * values are <code>NONE</code> (default) or <code>ALL_OLD</code>,
     * <code>UPDATED_OLD</code>, <code>ALL_NEW</code> or
     * <code>UPDATED_NEW</code>. <ul> <li><code>NONE</code>: Nothing is
     * returned.</li> <li><code>ALL_OLD</code>: Returns the attributes of the
     * item as they were before the operation.</li>
     * <li><code>UPDATED_OLD</code>: Returns the values of the updated
     * attributes, only, as they were before the operation.</li>
     * <li><code>ALL_NEW</code>: Returns all the attributes and their new
     * values after the operation.</li> <li><code>UPDATED_NEW</code>: Returns
     * the values of the updated attributes, only, as they are after the
     * operation.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use this parameter if you want to get the attribute name-value pairs
     *         before or after they are modified. For <code>PUT</code> operations,
     *         the possible parameter values are <code>NONE</code> (default) or
     *         <code>ALL_OLD</code>. For update operations, the possible parameter
     *         values are <code>NONE</code> (default) or <code>ALL_OLD</code>,
     *         <code>UPDATED_OLD</code>, <code>ALL_NEW</code> or
     *         <code>UPDATED_NEW</code>. <ul> <li><code>NONE</code>: Nothing is
     *         returned.</li> <li><code>ALL_OLD</code>: Returns the attributes of the
     *         item as they were before the operation.</li>
     *         <li><code>UPDATED_OLD</code>: Returns the values of the updated
     *         attributes, only, as they were before the operation.</li>
     *         <li><code>ALL_NEW</code>: Returns all the attributes and their new
     *         values after the operation.</li> <li><code>UPDATED_NEW</code>: Returns
     *         the values of the updated attributes, only, as they are after the
     *         operation.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnValue
     */
    public DeleteItemRequest withReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
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
        if (tableName != null) sb.append("TableName: " + tableName + ", ");
        if (key != null) sb.append("Key: " + key + ", ");
        if (expected != null) sb.append("Expected: " + expected + ", ");
        if (returnValues != null) sb.append("ReturnValues: " + returnValues + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getExpected() == null) ? 0 : getExpected().hashCode()); 
        hashCode = prime * hashCode + ((getReturnValues() == null) ? 0 : getReturnValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DeleteItemRequest == false) return false;
        DeleteItemRequest other = (DeleteItemRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getExpected() == null ^ this.getExpected() == null) return false;
        if (other.getExpected() != null && other.getExpected().equals(this.getExpected()) == false) return false; 
        if (other.getReturnValues() == null ^ this.getReturnValues() == null) return false;
        if (other.getReturnValues() != null && other.getReturnValues().equals(this.getReturnValues()) == false) return false; 
        return true;
    }
    
}
    