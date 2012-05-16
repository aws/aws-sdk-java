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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodb.AmazonDynamoDB#putItem(PutItemRequest) PutItem operation}.
 * <p>
 * Creates a new item, or replaces an old item with a new item (including all the attributes).
 * </p>
 * <p>
 * If an item already exists in the specified table with the same primary key, the new item completely replaces the existing item. You can perform a
 * conditional put (insert a new item if one with the specified primary key doesn't exist), or replace an existing item if it has certain attribute
 * values.
 * </p>
 *
 * @see com.amazonaws.services.dynamodb.AmazonDynamoDB#putItem(PutItemRequest)
 */
public class PutItemRequest extends AmazonWebServiceRequest {

    /**
     * The name of the table in which you want to put an item. Allowed
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
     * A map of the attributes for the item, and must include the primary key
     * values that define the item. Other attribute name-value pairs can be
     * provided for the item.
     */
    private java.util.Map<String,AttributeValue> item;

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
     * Default constructor for a new PutItemRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PutItemRequest() {}
    
    /**
     * Constructs a new PutItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table in which you want to put an
     * item. Allowed characters are <code>a-z</code>, <code>A-Z</code>,
     * <code>0-9</code>, <code>_</code> (underscore), <code>-</code> (hyphen)
     * and <code>.</code> (period).
     * @param item A map of the attributes for the item, and must include the
     * primary key values that define the item. Other attribute name-value
     * pairs can be provided for the item.
     */
    public PutItemRequest(String tableName, java.util.Map<String,AttributeValue> item) {
        this.tableName = tableName;
        this.item = item;
    }

    
    
    /**
     * The name of the table in which you want to put an item. Allowed
     * characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table in which you want to put an item. Allowed
     *         characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table in which you want to put an item. Allowed
     * characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table in which you want to put an item. Allowed
     *         characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table in which you want to put an item. Allowed
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
     * @param tableName The name of the table in which you want to put an item. Allowed
     *         characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
    
    /**
     * A map of the attributes for the item, and must include the primary key
     * values that define the item. Other attribute name-value pairs can be
     * provided for the item.
     *
     * @return A map of the attributes for the item, and must include the primary key
     *         values that define the item. Other attribute name-value pairs can be
     *         provided for the item.
     */
    public java.util.Map<String,AttributeValue> getItem() {
        
        return item;
    }
    
    /**
     * A map of the attributes for the item, and must include the primary key
     * values that define the item. Other attribute name-value pairs can be
     * provided for the item.
     *
     * @param item A map of the attributes for the item, and must include the primary key
     *         values that define the item. Other attribute name-value pairs can be
     *         provided for the item.
     */
    public void setItem(java.util.Map<String,AttributeValue> item) {
        this.item = item;
    }
    
    /**
     * A map of the attributes for the item, and must include the primary key
     * values that define the item. Other attribute name-value pairs can be
     * provided for the item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param item A map of the attributes for the item, and must include the primary key
     *         values that define the item. Other attribute name-value pairs can be
     *         provided for the item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutItemRequest withItem(java.util.Map<String,AttributeValue> item) {
        setItem(item);
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
    public PutItemRequest withExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
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
    public PutItemRequest withReturnValues(String returnValues) {
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
    public PutItemRequest withReturnValues(ReturnValue returnValues) {
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
        if (item != null) sb.append("Item: " + item + ", ");
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
        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode()); 
        hashCode = prime * hashCode + ((getExpected() == null) ? 0 : getExpected().hashCode()); 
        hashCode = prime * hashCode + ((getReturnValues() == null) ? 0 : getReturnValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof PutItemRequest == false) return false;
        PutItemRequest other = (PutItemRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getItem() == null ^ this.getItem() == null) return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false) return false; 
        if (other.getExpected() == null ^ this.getExpected() == null) return false;
        if (other.getExpected() != null && other.getExpected().equals(this.getExpected()) == false) return false; 
        if (other.getReturnValues() == null ^ this.getReturnValues() == null) return false;
        if (other.getReturnValues() != null && other.getReturnValues().equals(this.getReturnValues()) == false) return false; 
        return true;
    }
    
}
    