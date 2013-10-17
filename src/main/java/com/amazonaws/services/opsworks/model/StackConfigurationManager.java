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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Describes the configuration manager.
 * </p>
 */
public class StackConfigurationManager implements Serializable {

    /**
     * The name. This parameter must be set to "Chef".
     */
    private String name;

    /**
     * The Chef version. This parameter must be set to "0.9" or "11.4". The
     * default value is "0.9". However, we expect to change the default value
     * to "11.4" in September 2013.
     */
    private String version;

    /**
     * The name. This parameter must be set to "Chef".
     *
     * @return The name. This parameter must be set to "Chef".
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name. This parameter must be set to "Chef".
     *
     * @param name The name. This parameter must be set to "Chef".
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name. This parameter must be set to "Chef".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name. This parameter must be set to "Chef".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackConfigurationManager withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The Chef version. This parameter must be set to "0.9" or "11.4". The
     * default value is "0.9". However, we expect to change the default value
     * to "11.4" in September 2013.
     *
     * @return The Chef version. This parameter must be set to "0.9" or "11.4". The
     *         default value is "0.9". However, we expect to change the default value
     *         to "11.4" in September 2013.
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * The Chef version. This parameter must be set to "0.9" or "11.4". The
     * default value is "0.9". However, we expect to change the default value
     * to "11.4" in September 2013.
     *
     * @param version The Chef version. This parameter must be set to "0.9" or "11.4". The
     *         default value is "0.9". However, we expect to change the default value
     *         to "11.4" in September 2013.
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * The Chef version. This parameter must be set to "0.9" or "11.4". The
     * default value is "0.9". However, we expect to change the default value
     * to "11.4" in September 2013.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param version The Chef version. This parameter must be set to "0.9" or "11.4". The
     *         default value is "0.9". However, we expect to change the default value
     *         to "11.4" in September 2013.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackConfigurationManager withVersion(String version) {
        this.version = version;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StackConfigurationManager == false) return false;
        StackConfigurationManager other = (StackConfigurationManager)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        return true;
    }
    
}
    