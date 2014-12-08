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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * A registered instance's reported operating system.
 * </p>
 */
public class ReportedOs implements Serializable {

    /**
     * The operating system family.
     */
    private String family;

    /**
     * The operating system name.
     */
    private String name;

    /**
     * The operating system version.
     */
    private String version;

    /**
     * The operating system family.
     *
     * @return The operating system family.
     */
    public String getFamily() {
        return family;
    }
    
    /**
     * The operating system family.
     *
     * @param family The operating system family.
     */
    public void setFamily(String family) {
        this.family = family;
    }
    
    /**
     * The operating system family.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param family The operating system family.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReportedOs withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * The operating system name.
     *
     * @return The operating system name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The operating system name.
     *
     * @param name The operating system name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The operating system name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The operating system name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReportedOs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The operating system version.
     *
     * @return The operating system version.
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * The operating system version.
     *
     * @param version The operating system version.
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * The operating system version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param version The operating system version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReportedOs withVersion(String version) {
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
        if (getFamily() != null) sb.append("Family: " + getFamily() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReportedOs == false) return false;
        ReportedOs other = (ReportedOs)obj;
        
        if (other.getFamily() == null ^ this.getFamily() == null) return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        return true;
    }
    
}
    