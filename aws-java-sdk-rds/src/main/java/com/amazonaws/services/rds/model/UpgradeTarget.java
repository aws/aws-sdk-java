/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The version of the database engine that a DB instance can be upgraded to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/UpgradeTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradeTarget implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the upgrade target database engine.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the upgrade target database engine.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The version of the database engine that a DB instance can be upgraded to.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A value that indicates whether the target version is applied to any source DB instances that have
     * AutoMinorVersionUpgrade set to true.
     * </p>
     */
    private Boolean autoUpgrade;
    /**
     * <p>
     * A value that indicates whether a database engine is upgraded to a major version.
     * </p>
     */
    private Boolean isMajorVersionUpgrade;

    /**
     * <p>
     * The name of the upgrade target database engine.
     * </p>
     * 
     * @param engine
     *        The name of the upgrade target database engine.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the upgrade target database engine.
     * </p>
     * 
     * @return The name of the upgrade target database engine.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the upgrade target database engine.
     * </p>
     * 
     * @param engine
     *        The name of the upgrade target database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeTarget withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the upgrade target database engine.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the upgrade target database engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the upgrade target database engine.
     * </p>
     * 
     * @return The version number of the upgrade target database engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the upgrade target database engine.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the upgrade target database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeTarget withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The version of the database engine that a DB instance can be upgraded to.
     * </p>
     * 
     * @param description
     *        The version of the database engine that a DB instance can be upgraded to.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The version of the database engine that a DB instance can be upgraded to.
     * </p>
     * 
     * @return The version of the database engine that a DB instance can be upgraded to.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The version of the database engine that a DB instance can be upgraded to.
     * </p>
     * 
     * @param description
     *        The version of the database engine that a DB instance can be upgraded to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeTarget withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the target version is applied to any source DB instances that have
     * AutoMinorVersionUpgrade set to true.
     * </p>
     * 
     * @param autoUpgrade
     *        A value that indicates whether the target version is applied to any source DB instances that have
     *        AutoMinorVersionUpgrade set to true.
     */

    public void setAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether the target version is applied to any source DB instances that have
     * AutoMinorVersionUpgrade set to true.
     * </p>
     * 
     * @return A value that indicates whether the target version is applied to any source DB instances that have
     *         AutoMinorVersionUpgrade set to true.
     */

    public Boolean getAutoUpgrade() {
        return this.autoUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether the target version is applied to any source DB instances that have
     * AutoMinorVersionUpgrade set to true.
     * </p>
     * 
     * @param autoUpgrade
     *        A value that indicates whether the target version is applied to any source DB instances that have
     *        AutoMinorVersionUpgrade set to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeTarget withAutoUpgrade(Boolean autoUpgrade) {
        setAutoUpgrade(autoUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the target version is applied to any source DB instances that have
     * AutoMinorVersionUpgrade set to true.
     * </p>
     * 
     * @return A value that indicates whether the target version is applied to any source DB instances that have
     *         AutoMinorVersionUpgrade set to true.
     */

    public Boolean isAutoUpgrade() {
        return this.autoUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether a database engine is upgraded to a major version.
     * </p>
     * 
     * @param isMajorVersionUpgrade
     *        A value that indicates whether a database engine is upgraded to a major version.
     */

    public void setIsMajorVersionUpgrade(Boolean isMajorVersionUpgrade) {
        this.isMajorVersionUpgrade = isMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether a database engine is upgraded to a major version.
     * </p>
     * 
     * @return A value that indicates whether a database engine is upgraded to a major version.
     */

    public Boolean getIsMajorVersionUpgrade() {
        return this.isMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether a database engine is upgraded to a major version.
     * </p>
     * 
     * @param isMajorVersionUpgrade
     *        A value that indicates whether a database engine is upgraded to a major version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeTarget withIsMajorVersionUpgrade(Boolean isMajorVersionUpgrade) {
        setIsMajorVersionUpgrade(isMajorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether a database engine is upgraded to a major version.
     * </p>
     * 
     * @return A value that indicates whether a database engine is upgraded to a major version.
     */

    public Boolean isMajorVersionUpgrade() {
        return this.isMajorVersionUpgrade;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAutoUpgrade() != null)
            sb.append("AutoUpgrade: ").append(getAutoUpgrade()).append(",");
        if (getIsMajorVersionUpgrade() != null)
            sb.append("IsMajorVersionUpgrade: ").append(getIsMajorVersionUpgrade());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradeTarget == false)
            return false;
        UpgradeTarget other = (UpgradeTarget) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAutoUpgrade() == null ^ this.getAutoUpgrade() == null)
            return false;
        if (other.getAutoUpgrade() != null && other.getAutoUpgrade().equals(this.getAutoUpgrade()) == false)
            return false;
        if (other.getIsMajorVersionUpgrade() == null ^ this.getIsMajorVersionUpgrade() == null)
            return false;
        if (other.getIsMajorVersionUpgrade() != null && other.getIsMajorVersionUpgrade().equals(this.getIsMajorVersionUpgrade()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAutoUpgrade() == null) ? 0 : getAutoUpgrade().hashCode());
        hashCode = prime * hashCode + ((getIsMajorVersionUpgrade() == null) ? 0 : getIsMajorVersionUpgrade().hashCode());
        return hashCode;
    }

    @Override
    public UpgradeTarget clone() {
        try {
            return (UpgradeTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
