/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the properties of an environment tier
 * </p>
 */
public class EnvironmentTier implements Serializable {

    /**
     * The name of this environment tier.
     */
    private String name;

    /**
     * The type of this environment tier.
     */
    private String type;

    /**
     * The version of this environment tier.
     */
    private String version;

    /**
     * The name of this environment tier.
     *
     * @return The name of this environment tier.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of this environment tier.
     *
     * @param name The name of this environment tier.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of this environment tier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of this environment tier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnvironmentTier withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The type of this environment tier.
     *
     * @return The type of this environment tier.
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of this environment tier.
     *
     * @param type The type of this environment tier.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of this environment tier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The type of this environment tier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnvironmentTier withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The version of this environment tier.
     *
     * @return The version of this environment tier.
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * The version of this environment tier.
     *
     * @param version The version of this environment tier.
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * The version of this environment tier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param version The version of this environment tier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnvironmentTier withVersion(String version) {
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
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EnvironmentTier == false) return false;
        EnvironmentTier other = (EnvironmentTier)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        return true;
    }
    
}
    