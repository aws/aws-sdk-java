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
 * JSON-formatted pair of strings consisting of a code and name that represent a severity level that can be applied to a support case.
 * </p>
 */
public class SeverityLevel implements Serializable {

    /**
     * String that represents one of four values: "low," "medium," "high,"
     * and "urgent". These values correspond to response times returned to
     * the caller in the string <code>SeverityLevel.name</code>.
     */
    private String code;

    /**
     * Name of severity levels that correspond to the severity level codes.
     */
    private String name;

    /**
     * String that represents one of four values: "low," "medium," "high,"
     * and "urgent". These values correspond to response times returned to
     * the caller in the string <code>SeverityLevel.name</code>.
     *
     * @return String that represents one of four values: "low," "medium," "high,"
     *         and "urgent". These values correspond to response times returned to
     *         the caller in the string <code>SeverityLevel.name</code>.
     */
    public String getCode() {
        return code;
    }
    
    /**
     * String that represents one of four values: "low," "medium," "high,"
     * and "urgent". These values correspond to response times returned to
     * the caller in the string <code>SeverityLevel.name</code>.
     *
     * @param code String that represents one of four values: "low," "medium," "high,"
     *         and "urgent". These values correspond to response times returned to
     *         the caller in the string <code>SeverityLevel.name</code>.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * String that represents one of four values: "low," "medium," "high,"
     * and "urgent". These values correspond to response times returned to
     * the caller in the string <code>SeverityLevel.name</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code String that represents one of four values: "low," "medium," "high,"
     *         and "urgent". These values correspond to response times returned to
     *         the caller in the string <code>SeverityLevel.name</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SeverityLevel withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Name of severity levels that correspond to the severity level codes.
     *
     * @return Name of severity levels that correspond to the severity level codes.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Name of severity levels that correspond to the severity level codes.
     *
     * @param name Name of severity levels that correspond to the severity level codes.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Name of severity levels that correspond to the severity level codes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name Name of severity levels that correspond to the severity level codes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SeverityLevel withName(String name) {
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

        if (obj instanceof SeverityLevel == false) return false;
        SeverityLevel other = (SeverityLevel)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
}
    