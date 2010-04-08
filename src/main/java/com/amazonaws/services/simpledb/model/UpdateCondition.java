/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Specifies the conditions under which data should be updated. If an
 * update condition is specified for a request, the data will only be
 * updated if the condition is satisfied. For example, if an attribute
 * with a specific name and value exists, or if a specific attribute
 * doesn't exist.
 * </p>
 */
public class UpdateCondition {

    /**
     * The name of the attribute involved in the condition.
     */
    private String name;

    /**
     * The value of an attribute. This value can only be specified when the
     * exists parameter is equal to true.
     */
    private String value;

    /**
     * True if the specified attribute must exist with the specified value in
     * order for this update condition to be satisfied, otherwise false if
     * the specified attribute should not exist in order for this update
     * condition to be satisfied.
     */
    private Boolean exists;

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
     * exists parameter is equal to true.
     *
     * @return The value of an attribute. This value can only be specified when the
     *         exists parameter is equal to true.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value of an attribute. This value can only be specified when the
     * exists parameter is equal to true.
     *
     * @param value The value of an attribute. This value can only be specified when the
     *         exists parameter is equal to true.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value of an attribute. This value can only be specified when the
     * exists parameter is equal to true.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value of an attribute. This value can only be specified when the
     *         exists parameter is equal to true.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateCondition withValue(String value) {
        this.value = value;
        return this;
    }
    
    
    /**
     * True if the specified attribute must exist with the specified value in
     * order for this update condition to be satisfied, otherwise false if
     * the specified attribute should not exist in order for this update
     * condition to be satisfied.
     *
     * @return True if the specified attribute must exist with the specified value in
     *         order for this update condition to be satisfied, otherwise false if
     *         the specified attribute should not exist in order for this update
     *         condition to be satisfied.
     */
    public Boolean isExists() {
        return exists;
    }
    
    /**
     * True if the specified attribute must exist with the specified value in
     * order for this update condition to be satisfied, otherwise false if
     * the specified attribute should not exist in order for this update
     * condition to be satisfied.
     *
     * @param exists True if the specified attribute must exist with the specified value in
     *         order for this update condition to be satisfied, otherwise false if
     *         the specified attribute should not exist in order for this update
     *         condition to be satisfied.
     */
    public void setExists(Boolean exists) {
        this.exists = exists;
    }
    
    /**
     * True if the specified attribute must exist with the specified value in
     * order for this update condition to be satisfied, otherwise false if
     * the specified attribute should not exist in order for this update
     * condition to be satisfied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exists True if the specified attribute must exist with the specified value in
     *         order for this update condition to be satisfied, otherwise false if
     *         the specified attribute should not exist in order for this update
     *         condition to be satisfied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateCondition withExists(Boolean exists) {
        this.exists = exists;
        return this;
    }
    
    
    /**
     * True if the specified attribute must exist with the specified value in
     * order for this update condition to be satisfied, otherwise false if
     * the specified attribute should not exist in order for this update
     * condition to be satisfied.
     *
     * @return True if the specified attribute must exist with the specified value in
     *         order for this update condition to be satisfied, otherwise false if
     *         the specified attribute should not exist in order for this update
     *         condition to be satisfied.
     */
    public Boolean getExists() {
        return exists;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("Name: " + name + ", ");
        sb.append("Value: " + value + ", ");
        sb.append("Exists: " + exists + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    