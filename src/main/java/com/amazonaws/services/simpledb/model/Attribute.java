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
 * Attribute
 */
public class Attribute {

    /**
     * Attribute Name.
     */
    private String name;

    private String alternateNameEncoding;

    /**
     * Attribute Value.
     */
    private String value;

    private String alternateValueEncoding;

    /**
     * Attribute Name.
     *
     * @return Attribute Name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Attribute Name.
     *
     * @param name Attribute Name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Attribute Name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name Attribute Name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Attribute withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Returns the value of the AlternateNameEncoding property for this
     * object.
     *
     * @return The value of the AlternateNameEncoding property for this object.
     */
    public String getAlternateNameEncoding() {
        return alternateNameEncoding;
    }
    
    /**
     * Sets the value of the AlternateNameEncoding property for this object.
     *
     * @param alternateNameEncoding The new value for the AlternateNameEncoding property for this object.
     */
    public void setAlternateNameEncoding(String alternateNameEncoding) {
        this.alternateNameEncoding = alternateNameEncoding;
    }
    
    /**
     * Sets the value of the AlternateNameEncoding property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alternateNameEncoding The new value for the AlternateNameEncoding property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Attribute withAlternateNameEncoding(String alternateNameEncoding) {
        this.alternateNameEncoding = alternateNameEncoding;
        return this;
    }
    
    
    /**
     * Attribute Value.
     *
     * @return Attribute Value.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * Attribute Value.
     *
     * @param value Attribute Value.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * Attribute Value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value Attribute Value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Attribute withValue(String value) {
        this.value = value;
        return this;
    }
    
    
    /**
     * Returns the value of the AlternateValueEncoding property for this
     * object.
     *
     * @return The value of the AlternateValueEncoding property for this object.
     */
    public String getAlternateValueEncoding() {
        return alternateValueEncoding;
    }
    
    /**
     * Sets the value of the AlternateValueEncoding property for this object.
     *
     * @param alternateValueEncoding The new value for the AlternateValueEncoding property for this object.
     */
    public void setAlternateValueEncoding(String alternateValueEncoding) {
        this.alternateValueEncoding = alternateValueEncoding;
    }
    
    /**
     * Sets the value of the AlternateValueEncoding property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alternateValueEncoding The new value for the AlternateValueEncoding property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Attribute withAlternateValueEncoding(String alternateValueEncoding) {
        this.alternateValueEncoding = alternateValueEncoding;
        return this;
    }
    
    
}
    