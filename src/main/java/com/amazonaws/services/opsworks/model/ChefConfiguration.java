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
 * Describes the Chef configuration.
 * </p>
 */
public class ChefConfiguration implements Serializable {

    /**
     * Whether to enable Berkshelf.
     */
    private Boolean manageBerkshelf;

    /**
     * The Berkshelf version.
     */
    private String berkshelfVersion;

    /**
     * Whether to enable Berkshelf.
     *
     * @return Whether to enable Berkshelf.
     */
    public Boolean isManageBerkshelf() {
        return manageBerkshelf;
    }
    
    /**
     * Whether to enable Berkshelf.
     *
     * @param manageBerkshelf Whether to enable Berkshelf.
     */
    public void setManageBerkshelf(Boolean manageBerkshelf) {
        this.manageBerkshelf = manageBerkshelf;
    }
    
    /**
     * Whether to enable Berkshelf.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param manageBerkshelf Whether to enable Berkshelf.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChefConfiguration withManageBerkshelf(Boolean manageBerkshelf) {
        this.manageBerkshelf = manageBerkshelf;
        return this;
    }

    /**
     * Whether to enable Berkshelf.
     *
     * @return Whether to enable Berkshelf.
     */
    public Boolean getManageBerkshelf() {
        return manageBerkshelf;
    }

    /**
     * The Berkshelf version.
     *
     * @return The Berkshelf version.
     */
    public String getBerkshelfVersion() {
        return berkshelfVersion;
    }
    
    /**
     * The Berkshelf version.
     *
     * @param berkshelfVersion The Berkshelf version.
     */
    public void setBerkshelfVersion(String berkshelfVersion) {
        this.berkshelfVersion = berkshelfVersion;
    }
    
    /**
     * The Berkshelf version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param berkshelfVersion The Berkshelf version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChefConfiguration withBerkshelfVersion(String berkshelfVersion) {
        this.berkshelfVersion = berkshelfVersion;
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
        if (isManageBerkshelf() != null) sb.append("ManageBerkshelf: " + isManageBerkshelf() + ",");
        if (getBerkshelfVersion() != null) sb.append("BerkshelfVersion: " + getBerkshelfVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isManageBerkshelf() == null) ? 0 : isManageBerkshelf().hashCode()); 
        hashCode = prime * hashCode + ((getBerkshelfVersion() == null) ? 0 : getBerkshelfVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChefConfiguration == false) return false;
        ChefConfiguration other = (ChefConfiguration)obj;
        
        if (other.isManageBerkshelf() == null ^ this.isManageBerkshelf() == null) return false;
        if (other.isManageBerkshelf() != null && other.isManageBerkshelf().equals(this.isManageBerkshelf()) == false) return false; 
        if (other.getBerkshelfVersion() == null ^ this.getBerkshelfVersion() == null) return false;
        if (other.getBerkshelfVersion() != null && other.getBerkshelfVersion().equals(this.getBerkshelfVersion()) == false) return false; 
        return true;
    }
    
}
    