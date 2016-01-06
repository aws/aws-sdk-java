/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * The version of the database engine that a DB instance can be upgraded
 * to.
 * </p>
 */
public class UpgradeTarget implements Serializable, Cloneable {

    /**
     * The name of the upgrade target database engine.
     */
    private String engine;

    /**
     * The version number of the upgrade target database engine.
     */
    private String engineVersion;

    /**
     * The version of the database engine that a DB instance can be upgraded
     * to.
     */
    private String description;

    /**
     * A value that indicates whether the target version will be applied to
     * any source DB instances that have AutoMinorVersionUpgrade set to true.
     */
    private Boolean autoUpgrade;

    /**
     * A value that indicates whether a database engine will be upgraded to a
     * major version.
     */
    private Boolean isMajorVersionUpgrade;

    /**
     * The name of the upgrade target database engine.
     *
     * @return The name of the upgrade target database engine.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the upgrade target database engine.
     *
     * @param engine The name of the upgrade target database engine.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the upgrade target database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the upgrade target database engine.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpgradeTarget withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The version number of the upgrade target database engine.
     *
     * @return The version number of the upgrade target database engine.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version number of the upgrade target database engine.
     *
     * @param engineVersion The version number of the upgrade target database engine.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version number of the upgrade target database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version number of the upgrade target database engine.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpgradeTarget withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * The version of the database engine that a DB instance can be upgraded
     * to.
     *
     * @return The version of the database engine that a DB instance can be upgraded
     *         to.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The version of the database engine that a DB instance can be upgraded
     * to.
     *
     * @param description The version of the database engine that a DB instance can be upgraded
     *         to.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The version of the database engine that a DB instance can be upgraded
     * to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The version of the database engine that a DB instance can be upgraded
     *         to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpgradeTarget withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * A value that indicates whether the target version will be applied to
     * any source DB instances that have AutoMinorVersionUpgrade set to true.
     *
     * @return A value that indicates whether the target version will be applied to
     *         any source DB instances that have AutoMinorVersionUpgrade set to true.
     */
    public Boolean isAutoUpgrade() {
        return autoUpgrade;
    }
    
    /**
     * A value that indicates whether the target version will be applied to
     * any source DB instances that have AutoMinorVersionUpgrade set to true.
     *
     * @param autoUpgrade A value that indicates whether the target version will be applied to
     *         any source DB instances that have AutoMinorVersionUpgrade set to true.
     */
    public void setAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
    }
    
    /**
     * A value that indicates whether the target version will be applied to
     * any source DB instances that have AutoMinorVersionUpgrade set to true.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoUpgrade A value that indicates whether the target version will be applied to
     *         any source DB instances that have AutoMinorVersionUpgrade set to true.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpgradeTarget withAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
        return this;
    }

    /**
     * A value that indicates whether the target version will be applied to
     * any source DB instances that have AutoMinorVersionUpgrade set to true.
     *
     * @return A value that indicates whether the target version will be applied to
     *         any source DB instances that have AutoMinorVersionUpgrade set to true.
     */
    public Boolean getAutoUpgrade() {
        return autoUpgrade;
    }

    /**
     * A value that indicates whether a database engine will be upgraded to a
     * major version.
     *
     * @return A value that indicates whether a database engine will be upgraded to a
     *         major version.
     */
    public Boolean isMajorVersionUpgrade() {
        return isMajorVersionUpgrade;
    }
    
    /**
     * A value that indicates whether a database engine will be upgraded to a
     * major version.
     *
     * @param isMajorVersionUpgrade A value that indicates whether a database engine will be upgraded to a
     *         major version.
     */
    public void setIsMajorVersionUpgrade(Boolean isMajorVersionUpgrade) {
        this.isMajorVersionUpgrade = isMajorVersionUpgrade;
    }
    
    /**
     * A value that indicates whether a database engine will be upgraded to a
     * major version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isMajorVersionUpgrade A value that indicates whether a database engine will be upgraded to a
     *         major version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpgradeTarget withIsMajorVersionUpgrade(Boolean isMajorVersionUpgrade) {
        this.isMajorVersionUpgrade = isMajorVersionUpgrade;
        return this;
    }

    /**
     * A value that indicates whether a database engine will be upgraded to a
     * major version.
     *
     * @return A value that indicates whether a database engine will be upgraded to a
     *         major version.
     */
    public Boolean getIsMajorVersionUpgrade() {
        return isMajorVersionUpgrade;
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
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (isAutoUpgrade() != null) sb.append("AutoUpgrade: " + isAutoUpgrade() + ",");
        if (isMajorVersionUpgrade() != null) sb.append("IsMajorVersionUpgrade: " + isMajorVersionUpgrade() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((isAutoUpgrade() == null) ? 0 : isAutoUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((isMajorVersionUpgrade() == null) ? 0 : isMajorVersionUpgrade().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpgradeTarget == false) return false;
        UpgradeTarget other = (UpgradeTarget)obj;
        
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.isAutoUpgrade() == null ^ this.isAutoUpgrade() == null) return false;
        if (other.isAutoUpgrade() != null && other.isAutoUpgrade().equals(this.isAutoUpgrade()) == false) return false; 
        if (other.isMajorVersionUpgrade() == null ^ this.isMajorVersionUpgrade() == null) return false;
        if (other.isMajorVersionUpgrade() != null && other.isMajorVersionUpgrade().equals(this.isMajorVersionUpgrade()) == false) return false; 
        return true;
    }
    
    @Override
    public UpgradeTarget clone() {
        try {
            return (UpgradeTarget) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    