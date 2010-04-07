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
 * Replaceable Attribute
 */
public class ReplaceableAttribute {

    /**
     * Attribute Name.
     */
    private String name;

    /**
     * Attribute Value.
     */
    private String value;

    /**
     * Flag to specify whether to replace the Attribute/Value or to add a new
     * Attribute/Value. The default setting is false.
     */
    private Boolean replace;

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
    public ReplaceableAttribute withName(String name) {
        this.name = name;
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
    public ReplaceableAttribute withValue(String value) {
        this.value = value;
        return this;
    }
    
    
    /**
     * Flag to specify whether to replace the Attribute/Value or to add a new
     * Attribute/Value. The default setting is false.
     *
     * @return Flag to specify whether to replace the Attribute/Value or to add a new
     *         Attribute/Value. The default setting is false.
     */
    public Boolean isReplace() {
        return replace;
    }
    
    /**
     * Flag to specify whether to replace the Attribute/Value or to add a new
     * Attribute/Value. The default setting is false.
     *
     * @param replace Flag to specify whether to replace the Attribute/Value or to add a new
     *         Attribute/Value. The default setting is false.
     */
    public void setReplace(Boolean replace) {
        this.replace = replace;
    }
    
    /**
     * Flag to specify whether to replace the Attribute/Value or to add a new
     * Attribute/Value. The default setting is false.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replace Flag to specify whether to replace the Attribute/Value or to add a new
     *         Attribute/Value. The default setting is false.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReplaceableAttribute withReplace(Boolean replace) {
        this.replace = replace;
        return this;
    }
    
    
    /**
     * Flag to specify whether to replace the Attribute/Value or to add a new
     * Attribute/Value. The default setting is false.
     *
     * @return Flag to specify whether to replace the Attribute/Value or to add a new
     *         Attribute/Value. The default setting is false.
     */
    public Boolean getReplace() {
        return replace;
    }
    
}
    