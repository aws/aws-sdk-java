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
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;


/**
 * <p>
 * Specifies the conditions under which data should be updated. If an update condition is specified for a request, the data will only be updated if the
 * condition is satisfied. For example, if an attribute with a specific name and value exists, or if a specific attribute doesn't exist.
 * </p>
 */
public class UpdateCondition implements Serializable {

    /**
     * The name of the attribute involved in the condition.
     */
    private String name;

    /**
     * The value of an attribute. This value can only be specified when the
     * <code>Exists</code> parameter is equal to <code>true</code>.
     */
    private String value;

    /**
     * A value specifying whether or not the specified attribute must exist
     * with the specified value in order for the update condition to be
     * satisfied. Specify <code>true</code> if the attribute must exist for
     * the update condition to be satisfied. Specify <code>false</code> if
     * the attribute should not exist in order for the update condition to be
     * satisfied.
     */
    private Boolean exists;

    /**
     * Default constructor for a new UpdateCondition object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateCondition() {}
    
    /**
     * Constructs a new UpdateCondition object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The name of the attribute involved in the condition.
     * @param value The value of an attribute. This value can only be
     * specified when the <code>Exists</code> parameter is equal to
     * <code>true</code>.
     * @param exists A value specifying whether or not the specified
     * attribute must exist with the specified value in order for the update
     * condition to be satisfied. Specify <code>true</code> if the attribute
     * must exist for the update condition to be satisfied. Specify
     * <code>false</code> if the attribute should not exist in order for the
     * update condition to be satisfied.
     */
    public UpdateCondition(String name, String value, Boolean exists) {
        setName(name);
        setValue(value);
        setExists(exists);
    }

    /**
     * The name of the attribute involved in the condition.
     *
     * @return The name of the attribute involved in the condition.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the attribute involved in the condition.
     *
     * @param name The name of the attribute involved in the condition.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the attribute involved in the condition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the attribute involved in the condition.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateCondition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The value of an attribute. This value can only be specified when the
     * <code>Exists</code> parameter is equal to <code>true</code>.
     *
     * @return The value of an attribute. This value can only be specified when the
     *         <code>Exists</code> parameter is equal to <code>true</code>.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value of an attribute. This value can only be specified when the
     * <code>Exists</code> parameter is equal to <code>true</code>.
     *
     * @param value The value of an attribute. This value can only be specified when the
     *         <code>Exists</code> parameter is equal to <code>true</code>.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value of an attribute. This value can only be specified when the
     * <code>Exists</code> parameter is equal to <code>true</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value of an attribute. This value can only be specified when the
     *         <code>Exists</code> parameter is equal to <code>true</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateCondition withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * A value specifying whether or not the specified attribute must exist
     * with the specified value in order for the update condition to be
     * satisfied. Specify <code>true</code> if the attribute must exist for
     * the update condition to be satisfied. Specify <code>false</code> if
     * the attribute should not exist in order for the update condition to be
     * satisfied.
     *
     * @return A value specifying whether or not the specified attribute must exist
     *         with the specified value in order for the update condition to be
     *         satisfied. Specify <code>true</code> if the attribute must exist for
     *         the update condition to be satisfied. Specify <code>false</code> if
     *         the attribute should not exist in order for the update condition to be
     *         satisfied.
     */
    public Boolean isExists() {
        return exists;
    }
    
    /**
     * A value specifying whether or not the specified attribute must exist
     * with the specified value in order for the update condition to be
     * satisfied. Specify <code>true</code> if the attribute must exist for
     * the update condition to be satisfied. Specify <code>false</code> if
     * the attribute should not exist in order for the update condition to be
     * satisfied.
     *
     * @param exists A value specifying whether or not the specified attribute must exist
     *         with the specified value in order for the update condition to be
     *         satisfied. Specify <code>true</code> if the attribute must exist for
     *         the update condition to be satisfied. Specify <code>false</code> if
     *         the attribute should not exist in order for the update condition to be
     *         satisfied.
     */
    public void setExists(Boolean exists) {
        this.exists = exists;
    }
    
    /**
     * A value specifying whether or not the specified attribute must exist
     * with the specified value in order for the update condition to be
     * satisfied. Specify <code>true</code> if the attribute must exist for
     * the update condition to be satisfied. Specify <code>false</code> if
     * the attribute should not exist in order for the update condition to be
     * satisfied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exists A value specifying whether or not the specified attribute must exist
     *         with the specified value in order for the update condition to be
     *         satisfied. Specify <code>true</code> if the attribute must exist for
     *         the update condition to be satisfied. Specify <code>false</code> if
     *         the attribute should not exist in order for the update condition to be
     *         satisfied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateCondition withExists(Boolean exists) {
        this.exists = exists;
        return this;
    }

    /**
     * A value specifying whether or not the specified attribute must exist
     * with the specified value in order for the update condition to be
     * satisfied. Specify <code>true</code> if the attribute must exist for
     * the update condition to be satisfied. Specify <code>false</code> if
     * the attribute should not exist in order for the update condition to be
     * satisfied.
     *
     * @return A value specifying whether or not the specified attribute must exist
     *         with the specified value in order for the update condition to be
     *         satisfied. Specify <code>true</code> if the attribute must exist for
     *         the update condition to be satisfied. Specify <code>false</code> if
     *         the attribute should not exist in order for the update condition to be
     *         satisfied.
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (isExists() != null) sb.append("Exists: " + isExists() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((isExists() == null) ? 0 : isExists().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateCondition == false) return false;
        UpdateCondition other = (UpdateCondition)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.isExists() == null ^ this.isExists() == null) return false;
        if (other.isExists() != null && other.isExists().equals(this.isExists()) == false) return false; 
        return true;
    }
    
}
    