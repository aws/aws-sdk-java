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

/**
 * <p>
 * Specifies the attribute to update and how to perform the update. Possible values: <code>PUT</code> (default), <code>ADD</code> or <code>DELETE</code>
 * .
 * </p>
 */
public class AttributeValueUpdate {

    /**
     * AttributeValue can be <code>String</code>, <code>Number</code>,
     * <code>StringSet</code>, <code>NumberSet</code>.
     */
    private AttributeValue value;

    /**
     * The type of action for an item update operation. Only use the add
     * action for numbers or sets; the specified value is added to the
     * existing value. If a set of values is specified, the values are added
     * to the existing set. Adds the specified attribute. If the attribute
     * exists, it is replaced by the new value. If no value is specified,
     * this removes the attribute and its value. If a set of values is
     * specified, then the values in the specified set are removed from the
     * old set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     */
    private String action;

    /**
     * Default constructor for a new AttributeValueUpdate object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AttributeValueUpdate() {}
    
    /**
     * Constructs a new AttributeValueUpdate object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param value AttributeValue can be <code>String</code>,
     * <code>Number</code>, <code>StringSet</code>, <code>NumberSet</code>.
     * @param action The type of action for an item update operation. Only
     * use the add action for numbers or sets; the specified value is added
     * to the existing value. If a set of values is specified, the values are
     * added to the existing set. Adds the specified attribute. If the
     * attribute exists, it is replaced by the new value. If no value is
     * specified, this removes the attribute and its value. If a set of
     * values is specified, then the values in the specified set are removed
     * from the old set.
     */
    public AttributeValueUpdate(AttributeValue value, String action) {
        this.value = value;
        this.action = action;
    }

    
    
    /**
     * Constructs a new AttributeValueUpdate object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param value AttributeValue can be <code>String</code>,
     * <code>Number</code>, <code>StringSet</code>, <code>NumberSet</code>.
     * @param action The type of action for an item update operation. Only
     * use the add action for numbers or sets; the specified value is added
     * to the existing value. If a set of values is specified, the values are
     * added to the existing set. Adds the specified attribute. If the
     * attribute exists, it is replaced by the new value. If no value is
     * specified, this removes the attribute and its value. If a set of
     * values is specified, then the values in the specified set are removed
     * from the old set.
     */
    public AttributeValueUpdate(AttributeValue value, AttributeAction action) {
        this.value = value;
        this.action = action.toString();
    }
    
    /**
     * AttributeValue can be <code>String</code>, <code>Number</code>,
     * <code>StringSet</code>, <code>NumberSet</code>.
     *
     * @return AttributeValue can be <code>String</code>, <code>Number</code>,
     *         <code>StringSet</code>, <code>NumberSet</code>.
     */
    public AttributeValue getValue() {
        return value;
    }
    
    /**
     * AttributeValue can be <code>String</code>, <code>Number</code>,
     * <code>StringSet</code>, <code>NumberSet</code>.
     *
     * @param value AttributeValue can be <code>String</code>, <code>Number</code>,
     *         <code>StringSet</code>, <code>NumberSet</code>.
     */
    public void setValue(AttributeValue value) {
        this.value = value;
    }
    
    /**
     * AttributeValue can be <code>String</code>, <code>Number</code>,
     * <code>StringSet</code>, <code>NumberSet</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value AttributeValue can be <code>String</code>, <code>Number</code>,
     *         <code>StringSet</code>, <code>NumberSet</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttributeValueUpdate withValue(AttributeValue value) {
        this.value = value;
        return this;
    }
    
    
    /**
     * The type of action for an item update operation. Only use the add
     * action for numbers or sets; the specified value is added to the
     * existing value. If a set of values is specified, the values are added
     * to the existing set. Adds the specified attribute. If the attribute
     * exists, it is replaced by the new value. If no value is specified,
     * this removes the attribute and its value. If a set of values is
     * specified, then the values in the specified set are removed from the
     * old set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @return The type of action for an item update operation. Only use the add
     *         action for numbers or sets; the specified value is added to the
     *         existing value. If a set of values is specified, the values are added
     *         to the existing set. Adds the specified attribute. If the attribute
     *         exists, it is replaced by the new value. If no value is specified,
     *         this removes the attribute and its value. If a set of values is
     *         specified, then the values in the specified set are removed from the
     *         old set.
     *
     * @see AttributeAction
     */
    public String getAction() {
        return action;
    }
    
    /**
     * The type of action for an item update operation. Only use the add
     * action for numbers or sets; the specified value is added to the
     * existing value. If a set of values is specified, the values are added
     * to the existing set. Adds the specified attribute. If the attribute
     * exists, it is replaced by the new value. If no value is specified,
     * this removes the attribute and its value. If a set of values is
     * specified, then the values in the specified set are removed from the
     * old set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @param action The type of action for an item update operation. Only use the add
     *         action for numbers or sets; the specified value is added to the
     *         existing value. If a set of values is specified, the values are added
     *         to the existing set. Adds the specified attribute. If the attribute
     *         exists, it is replaced by the new value. If no value is specified,
     *         this removes the attribute and its value. If a set of values is
     *         specified, then the values in the specified set are removed from the
     *         old set.
     *
     * @see AttributeAction
     */
    public void setAction(String action) {
        this.action = action;
    }
    
    /**
     * The type of action for an item update operation. Only use the add
     * action for numbers or sets; the specified value is added to the
     * existing value. If a set of values is specified, the values are added
     * to the existing set. Adds the specified attribute. If the attribute
     * exists, it is replaced by the new value. If no value is specified,
     * this removes the attribute and its value. If a set of values is
     * specified, then the values in the specified set are removed from the
     * old set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @param action The type of action for an item update operation. Only use the add
     *         action for numbers or sets; the specified value is added to the
     *         existing value. If a set of values is specified, the values are added
     *         to the existing set. Adds the specified attribute. If the attribute
     *         exists, it is replaced by the new value. If no value is specified,
     *         this removes the attribute and its value. If a set of values is
     *         specified, then the values in the specified set are removed from the
     *         old set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see AttributeAction
     */
    public AttributeValueUpdate withAction(String action) {
        this.action = action;
        return this;
    }
    
    
    /**
     * The type of action for an item update operation. Only use the add
     * action for numbers or sets; the specified value is added to the
     * existing value. If a set of values is specified, the values are added
     * to the existing set. Adds the specified attribute. If the attribute
     * exists, it is replaced by the new value. If no value is specified,
     * this removes the attribute and its value. If a set of values is
     * specified, then the values in the specified set are removed from the
     * old set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @param action The type of action for an item update operation. Only use the add
     *         action for numbers or sets; the specified value is added to the
     *         existing value. If a set of values is specified, the values are added
     *         to the existing set. Adds the specified attribute. If the attribute
     *         exists, it is replaced by the new value. If no value is specified,
     *         this removes the attribute and its value. If a set of values is
     *         specified, then the values in the specified set are removed from the
     *         old set.
     *
     * @see AttributeAction
     */
    public void setAction(AttributeAction action) {
        this.action = action.toString();
    }
    
    /**
     * The type of action for an item update operation. Only use the add
     * action for numbers or sets; the specified value is added to the
     * existing value. If a set of values is specified, the values are added
     * to the existing set. Adds the specified attribute. If the attribute
     * exists, it is replaced by the new value. If no value is specified,
     * this removes the attribute and its value. If a set of values is
     * specified, then the values in the specified set are removed from the
     * old set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @param action The type of action for an item update operation. Only use the add
     *         action for numbers or sets; the specified value is added to the
     *         existing value. If a set of values is specified, the values are added
     *         to the existing set. Adds the specified attribute. If the attribute
     *         exists, it is replaced by the new value. If no value is specified,
     *         this removes the attribute and its value. If a set of values is
     *         specified, then the values in the specified set are removed from the
     *         old set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see AttributeAction
     */
    public AttributeValueUpdate withAction(AttributeAction action) {
        this.action = action.toString();
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
        if (value != null) sb.append("Value: " + value + ", ");
        if (action != null) sb.append("Action: " + action + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof AttributeValueUpdate == false) return false;
        AttributeValueUpdate other = (AttributeValueUpdate)obj;
        
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.getAction() == null ^ this.getAction() == null) return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false) return false; 
        return true;
    }
    
}
    