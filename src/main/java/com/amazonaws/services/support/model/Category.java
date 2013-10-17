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
package com.amazonaws.services.support.model;

import java.io.Serializable;


/**
 * <p>
 * JSON-formatted name/value pair that represents the name and category of problem selected from the <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"> DescribeServices </a> response for each AWS service.
 * </p>
 */
public class Category implements Serializable {

    /**
     * Category code for the support case.
     */
    private String code;

    /**
     * Category name for the support case.
     */
    private String name;

    /**
     * Category code for the support case.
     *
     * @return Category code for the support case.
     */
    public String getCode() {
        return code;
    }
    
    /**
     * Category code for the support case.
     *
     * @param code Category code for the support case.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * Category code for the support case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code Category code for the support case.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Category withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Category name for the support case.
     *
     * @return Category name for the support case.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Category name for the support case.
     *
     * @param name Category name for the support case.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Category name for the support case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name Category name for the support case.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Category withName(String name) {
        this.name = name;
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
        if (getCode() != null) sb.append("Code: " + getCode() + ",");
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Category == false) return false;
        Category other = (Category)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
}
    