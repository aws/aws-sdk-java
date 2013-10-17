/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;


/**
 * <p>
 * An attribute value used with conditional <i>DeleteItem</i> ,
 * <i>PutItem</i> or <i>UpdateItem</i> operations. Amazon DynamoDB will check to see if the attribute value already exists; or if
 * the attribute exists and has a particular value before updating it.
 * </p>
 */
public class ExpectedAttributeValue implements Serializable {

    /**
     * Represents the data for an attribute. You can set one, and only one,
     * of the elements.
     */
    private AttributeValue value;

    /**
     * Causes Amazon DynamoDB to evaluate the value before attempting a
     * conditional operation: <ul> <li> <p>If <i>Exists</i> is
     * <code>true</code>, Amazon DynamoDB will check to see if that attribute
     * value already exists in the table. If it is found, then the operation
     * succeeds. If it is not found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, Amazon DynamoDB assumes that the attribute
     * value does <i>not</i> exist in the table. If in fact the value does
     * not exist, then the assumption is valid and the operation succeeds. If
     * the value is found, despite the assumption that it does not exist, the
     * operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     * </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     * If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     * the attribute exists: You don't have to set <i>Exists</i> to
     * <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul> <p>If you specify more
     * than one condition for <i>Exists</i>, then all of the conditions must
     * evaluate to true. (In other words, the conditions are ANDed together.)
     * Otherwise, the conditional operation will fail.
     */
    private Boolean exists;

    /**
     * Default constructor for a new ExpectedAttributeValue object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ExpectedAttributeValue() {}
    
    /**
     * Constructs a new ExpectedAttributeValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param value Represents the data for an attribute. You can set one,
     * and only one, of the elements.
     */
    public ExpectedAttributeValue(AttributeValue value) {
        setValue(value);
    }

    /**
     * Constructs a new ExpectedAttributeValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param exists Causes Amazon DynamoDB to evaluate the value before
     * attempting a conditional operation: <ul> <li> <p>If <i>Exists</i> is
     * <code>true</code>, Amazon DynamoDB will check to see if that attribute
     * value already exists in the table. If it is found, then the operation
     * succeeds. If it is not found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, Amazon DynamoDB assumes that the attribute
     * value does <i>not</i> exist in the table. If in fact the value does
     * not exist, then the assumption is valid and the operation succeeds. If
     * the value is found, despite the assumption that it does not exist, the
     * operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     * </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     * If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     * the attribute exists: You don't have to set <i>Exists</i> to
     * <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul> <p>If you specify more
     * than one condition for <i>Exists</i>, then all of the conditions must
     * evaluate to true. (In other words, the conditions are ANDed together.)
     * Otherwise, the conditional operation will fail.
     */
    public ExpectedAttributeValue(Boolean exists) {
        setExists(exists);
    }

    /**
     * Represents the data for an attribute. You can set one, and only one,
     * of the elements.
     *
     * @return Represents the data for an attribute. You can set one, and only one,
     *         of the elements.
     */
    public AttributeValue getValue() {
        return value;
    }
    
    /**
     * Represents the data for an attribute. You can set one, and only one,
     * of the elements.
     *
     * @param value Represents the data for an attribute. You can set one, and only one,
     *         of the elements.
     */
    public void setValue(AttributeValue value) {
        this.value = value;
    }
    
    /**
     * Represents the data for an attribute. You can set one, and only one,
     * of the elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value Represents the data for an attribute. You can set one, and only one,
     *         of the elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExpectedAttributeValue withValue(AttributeValue value) {
        this.value = value;
        return this;
    }

    /**
     * Causes Amazon DynamoDB to evaluate the value before attempting a
     * conditional operation: <ul> <li> <p>If <i>Exists</i> is
     * <code>true</code>, Amazon DynamoDB will check to see if that attribute
     * value already exists in the table. If it is found, then the operation
     * succeeds. If it is not found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, Amazon DynamoDB assumes that the attribute
     * value does <i>not</i> exist in the table. If in fact the value does
     * not exist, then the assumption is valid and the operation succeeds. If
     * the value is found, despite the assumption that it does not exist, the
     * operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     * </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     * If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     * the attribute exists: You don't have to set <i>Exists</i> to
     * <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul> <p>If you specify more
     * than one condition for <i>Exists</i>, then all of the conditions must
     * evaluate to true. (In other words, the conditions are ANDed together.)
     * Otherwise, the conditional operation will fail.
     *
     * @return Causes Amazon DynamoDB to evaluate the value before attempting a
     *         conditional operation: <ul> <li> <p>If <i>Exists</i> is
     *         <code>true</code>, Amazon DynamoDB will check to see if that attribute
     *         value already exists in the table. If it is found, then the operation
     *         succeeds. If it is not found, the operation fails with a
     *         <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     *         is <code>false</code>, Amazon DynamoDB assumes that the attribute
     *         value does <i>not</i> exist in the table. If in fact the value does
     *         not exist, then the assumption is valid and the operation succeeds. If
     *         the value is found, despite the assumption that it does not exist, the
     *         operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     *         </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     *         If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     *         the attribute exists: You don't have to set <i>Exists</i> to
     *         <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     *         <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     *         <code>true</code> but there is no <i>Value</i> to check. (You expect a
     *         value to exist, but don't specify what that value is.) </li> <li>
     *         <p><i>Exists</i> is <code>false</code> but you also specify a
     *         <i>Value</i>. (You cannot expect an attribute to have a value, while
     *         also expecting it not to exist.) </li> </ul> <p>If you specify more
     *         than one condition for <i>Exists</i>, then all of the conditions must
     *         evaluate to true. (In other words, the conditions are ANDed together.)
     *         Otherwise, the conditional operation will fail.
     */
    public Boolean isExists() {
        return exists;
    }
    
    /**
     * Causes Amazon DynamoDB to evaluate the value before attempting a
     * conditional operation: <ul> <li> <p>If <i>Exists</i> is
     * <code>true</code>, Amazon DynamoDB will check to see if that attribute
     * value already exists in the table. If it is found, then the operation
     * succeeds. If it is not found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, Amazon DynamoDB assumes that the attribute
     * value does <i>not</i> exist in the table. If in fact the value does
     * not exist, then the assumption is valid and the operation succeeds. If
     * the value is found, despite the assumption that it does not exist, the
     * operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     * </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     * If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     * the attribute exists: You don't have to set <i>Exists</i> to
     * <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul> <p>If you specify more
     * than one condition for <i>Exists</i>, then all of the conditions must
     * evaluate to true. (In other words, the conditions are ANDed together.)
     * Otherwise, the conditional operation will fail.
     *
     * @param exists Causes Amazon DynamoDB to evaluate the value before attempting a
     *         conditional operation: <ul> <li> <p>If <i>Exists</i> is
     *         <code>true</code>, Amazon DynamoDB will check to see if that attribute
     *         value already exists in the table. If it is found, then the operation
     *         succeeds. If it is not found, the operation fails with a
     *         <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     *         is <code>false</code>, Amazon DynamoDB assumes that the attribute
     *         value does <i>not</i> exist in the table. If in fact the value does
     *         not exist, then the assumption is valid and the operation succeeds. If
     *         the value is found, despite the assumption that it does not exist, the
     *         operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     *         </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     *         If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     *         the attribute exists: You don't have to set <i>Exists</i> to
     *         <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     *         <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     *         <code>true</code> but there is no <i>Value</i> to check. (You expect a
     *         value to exist, but don't specify what that value is.) </li> <li>
     *         <p><i>Exists</i> is <code>false</code> but you also specify a
     *         <i>Value</i>. (You cannot expect an attribute to have a value, while
     *         also expecting it not to exist.) </li> </ul> <p>If you specify more
     *         than one condition for <i>Exists</i>, then all of the conditions must
     *         evaluate to true. (In other words, the conditions are ANDed together.)
     *         Otherwise, the conditional operation will fail.
     */
    public void setExists(Boolean exists) {
        this.exists = exists;
    }
    
    /**
     * Causes Amazon DynamoDB to evaluate the value before attempting a
     * conditional operation: <ul> <li> <p>If <i>Exists</i> is
     * <code>true</code>, Amazon DynamoDB will check to see if that attribute
     * value already exists in the table. If it is found, then the operation
     * succeeds. If it is not found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, Amazon DynamoDB assumes that the attribute
     * value does <i>not</i> exist in the table. If in fact the value does
     * not exist, then the assumption is valid and the operation succeeds. If
     * the value is found, despite the assumption that it does not exist, the
     * operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     * </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     * If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     * the attribute exists: You don't have to set <i>Exists</i> to
     * <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul> <p>If you specify more
     * than one condition for <i>Exists</i>, then all of the conditions must
     * evaluate to true. (In other words, the conditions are ANDed together.)
     * Otherwise, the conditional operation will fail.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exists Causes Amazon DynamoDB to evaluate the value before attempting a
     *         conditional operation: <ul> <li> <p>If <i>Exists</i> is
     *         <code>true</code>, Amazon DynamoDB will check to see if that attribute
     *         value already exists in the table. If it is found, then the operation
     *         succeeds. If it is not found, the operation fails with a
     *         <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     *         is <code>false</code>, Amazon DynamoDB assumes that the attribute
     *         value does <i>not</i> exist in the table. If in fact the value does
     *         not exist, then the assumption is valid and the operation succeeds. If
     *         the value is found, despite the assumption that it does not exist, the
     *         operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     *         </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     *         If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     *         the attribute exists: You don't have to set <i>Exists</i> to
     *         <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     *         <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     *         <code>true</code> but there is no <i>Value</i> to check. (You expect a
     *         value to exist, but don't specify what that value is.) </li> <li>
     *         <p><i>Exists</i> is <code>false</code> but you also specify a
     *         <i>Value</i>. (You cannot expect an attribute to have a value, while
     *         also expecting it not to exist.) </li> </ul> <p>If you specify more
     *         than one condition for <i>Exists</i>, then all of the conditions must
     *         evaluate to true. (In other words, the conditions are ANDed together.)
     *         Otherwise, the conditional operation will fail.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExpectedAttributeValue withExists(Boolean exists) {
        this.exists = exists;
        return this;
    }

    /**
     * Causes Amazon DynamoDB to evaluate the value before attempting a
     * conditional operation: <ul> <li> <p>If <i>Exists</i> is
     * <code>true</code>, Amazon DynamoDB will check to see if that attribute
     * value already exists in the table. If it is found, then the operation
     * succeeds. If it is not found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, Amazon DynamoDB assumes that the attribute
     * value does <i>not</i> exist in the table. If in fact the value does
     * not exist, then the assumption is valid and the operation succeeds. If
     * the value is found, despite the assumption that it does not exist, the
     * operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     * </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     * If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     * the attribute exists: You don't have to set <i>Exists</i> to
     * <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul> <p>If you specify more
     * than one condition for <i>Exists</i>, then all of the conditions must
     * evaluate to true. (In other words, the conditions are ANDed together.)
     * Otherwise, the conditional operation will fail.
     *
     * @return Causes Amazon DynamoDB to evaluate the value before attempting a
     *         conditional operation: <ul> <li> <p>If <i>Exists</i> is
     *         <code>true</code>, Amazon DynamoDB will check to see if that attribute
     *         value already exists in the table. If it is found, then the operation
     *         succeeds. If it is not found, the operation fails with a
     *         <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     *         is <code>false</code>, Amazon DynamoDB assumes that the attribute
     *         value does <i>not</i> exist in the table. If in fact the value does
     *         not exist, then the assumption is valid and the operation succeeds. If
     *         the value is found, despite the assumption that it does not exist, the
     *         operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     *         </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     *         If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     *         the attribute exists: You don't have to set <i>Exists</i> to
     *         <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     *         <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     *         <code>true</code> but there is no <i>Value</i> to check. (You expect a
     *         value to exist, but don't specify what that value is.) </li> <li>
     *         <p><i>Exists</i> is <code>false</code> but you also specify a
     *         <i>Value</i>. (You cannot expect an attribute to have a value, while
     *         also expecting it not to exist.) </li> </ul> <p>If you specify more
     *         than one condition for <i>Exists</i>, then all of the conditions must
     *         evaluate to true. (In other words, the conditions are ANDed together.)
     *         Otherwise, the conditional operation will fail.
     */
    public Boolean getExists() {
        return exists;
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
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (isExists() != null) sb.append("Exists: " + isExists() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((isExists() == null) ? 0 : isExists().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ExpectedAttributeValue == false) return false;
        ExpectedAttributeValue other = (ExpectedAttributeValue)obj;
        
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.isExists() == null ^ this.isExists() == null) return false;
        if (other.isExists() != null && other.isExists().equals(this.isExists()) == false) return false; 
        return true;
    }
    
}
    