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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Detailed information about a DB engine version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DBEngineVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBEngineVersion implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database engine.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the database engine.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     */
    private String dBParameterGroupFamily;
    /**
     * <p>
     * The description of the database engine.
     * </p>
     */
    private String dBEngineDescription;
    /**
     * <p>
     * The description of the database engine version.
     * </p>
     */
    private String dBEngineVersionDescription;
    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     */
    private java.util.List<UpgradeTarget> validUpgradeTarget;
    /**
     * <p>
     * The types of logs that the database engine has available for export to Amazon CloudWatch Logs.
     * </p>
     */
    private java.util.List<String> exportableLogTypes;
    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * <code>ExportableLogTypes</code> to CloudWatch Logs.
     * </p>
     */
    private Boolean supportsLogExportsToCloudwatchLogs;

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * 
     * @param engine
     *        The name of the database engine.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * 
     * @return The name of the database engine.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine.
     * </p>
     * 
     * @param engine
     *        The name of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     * 
     * @return The version number of the database engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB parameter group family for the database engine.
     */

    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     * 
     * @return The name of the DB parameter group family for the database engine.
     */

    public String getDBParameterGroupFamily() {
        return this.dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB parameter group family for the database engine.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB parameter group family for the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withDBParameterGroupFamily(String dBParameterGroupFamily) {
        setDBParameterGroupFamily(dBParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * The description of the database engine.
     * </p>
     * 
     * @param dBEngineDescription
     *        The description of the database engine.
     */

    public void setDBEngineDescription(String dBEngineDescription) {
        this.dBEngineDescription = dBEngineDescription;
    }

    /**
     * <p>
     * The description of the database engine.
     * </p>
     * 
     * @return The description of the database engine.
     */

    public String getDBEngineDescription() {
        return this.dBEngineDescription;
    }

    /**
     * <p>
     * The description of the database engine.
     * </p>
     * 
     * @param dBEngineDescription
     *        The description of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withDBEngineDescription(String dBEngineDescription) {
        setDBEngineDescription(dBEngineDescription);
        return this;
    }

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     * 
     * @param dBEngineVersionDescription
     *        The description of the database engine version.
     */

    public void setDBEngineVersionDescription(String dBEngineVersionDescription) {
        this.dBEngineVersionDescription = dBEngineVersionDescription;
    }

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     * 
     * @return The description of the database engine version.
     */

    public String getDBEngineVersionDescription() {
        return this.dBEngineVersionDescription;
    }

    /**
     * <p>
     * The description of the database engine version.
     * </p>
     * 
     * @param dBEngineVersionDescription
     *        The description of the database engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withDBEngineVersionDescription(String dBEngineVersionDescription) {
        setDBEngineVersionDescription(dBEngineVersionDescription);
        return this;
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     * 
     * @return A list of engine versions that this database engine version can be upgraded to.
     */

    public java.util.List<UpgradeTarget> getValidUpgradeTarget() {
        return validUpgradeTarget;
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     * 
     * @param validUpgradeTarget
     *        A list of engine versions that this database engine version can be upgraded to.
     */

    public void setValidUpgradeTarget(java.util.Collection<UpgradeTarget> validUpgradeTarget) {
        if (validUpgradeTarget == null) {
            this.validUpgradeTarget = null;
            return;
        }

        this.validUpgradeTarget = new java.util.ArrayList<UpgradeTarget>(validUpgradeTarget);
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidUpgradeTarget(java.util.Collection)} or {@link #withValidUpgradeTarget(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param validUpgradeTarget
     *        A list of engine versions that this database engine version can be upgraded to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withValidUpgradeTarget(UpgradeTarget... validUpgradeTarget) {
        if (this.validUpgradeTarget == null) {
            setValidUpgradeTarget(new java.util.ArrayList<UpgradeTarget>(validUpgradeTarget.length));
        }
        for (UpgradeTarget ele : validUpgradeTarget) {
            this.validUpgradeTarget.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     * 
     * @param validUpgradeTarget
     *        A list of engine versions that this database engine version can be upgraded to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withValidUpgradeTarget(java.util.Collection<UpgradeTarget> validUpgradeTarget) {
        setValidUpgradeTarget(validUpgradeTarget);
        return this;
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return The types of logs that the database engine has available for export to Amazon CloudWatch Logs.
     */

    public java.util.List<String> getExportableLogTypes() {
        return exportableLogTypes;
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param exportableLogTypes
     *        The types of logs that the database engine has available for export to Amazon CloudWatch Logs.
     */

    public void setExportableLogTypes(java.util.Collection<String> exportableLogTypes) {
        if (exportableLogTypes == null) {
            this.exportableLogTypes = null;
            return;
        }

        this.exportableLogTypes = new java.util.ArrayList<String>(exportableLogTypes);
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to Amazon CloudWatch Logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportableLogTypes(java.util.Collection)} or {@link #withExportableLogTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exportableLogTypes
     *        The types of logs that the database engine has available for export to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withExportableLogTypes(String... exportableLogTypes) {
        if (this.exportableLogTypes == null) {
            setExportableLogTypes(new java.util.ArrayList<String>(exportableLogTypes.length));
        }
        for (String ele : exportableLogTypes) {
            this.exportableLogTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of logs that the database engine has available for export to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param exportableLogTypes
     *        The types of logs that the database engine has available for export to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withExportableLogTypes(java.util.Collection<String> exportableLogTypes) {
        setExportableLogTypes(exportableLogTypes);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * <code>ExportableLogTypes</code> to CloudWatch Logs.
     * </p>
     * 
     * @param supportsLogExportsToCloudwatchLogs
     *        A value that indicates whether the engine version supports exporting the log types specified by
     *        <code>ExportableLogTypes</code> to CloudWatch Logs.
     */

    public void setSupportsLogExportsToCloudwatchLogs(Boolean supportsLogExportsToCloudwatchLogs) {
        this.supportsLogExportsToCloudwatchLogs = supportsLogExportsToCloudwatchLogs;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * <code>ExportableLogTypes</code> to CloudWatch Logs.
     * </p>
     * 
     * @return A value that indicates whether the engine version supports exporting the log types specified by
     *         <code>ExportableLogTypes</code> to CloudWatch Logs.
     */

    public Boolean getSupportsLogExportsToCloudwatchLogs() {
        return this.supportsLogExportsToCloudwatchLogs;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * <code>ExportableLogTypes</code> to CloudWatch Logs.
     * </p>
     * 
     * @param supportsLogExportsToCloudwatchLogs
     *        A value that indicates whether the engine version supports exporting the log types specified by
     *        <code>ExportableLogTypes</code> to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportsLogExportsToCloudwatchLogs(Boolean supportsLogExportsToCloudwatchLogs) {
        setSupportsLogExportsToCloudwatchLogs(supportsLogExportsToCloudwatchLogs);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the engine version supports exporting the log types specified by
     * <code>ExportableLogTypes</code> to CloudWatch Logs.
     * </p>
     * 
     * @return A value that indicates whether the engine version supports exporting the log types specified by
     *         <code>ExportableLogTypes</code> to CloudWatch Logs.
     */

    public Boolean isSupportsLogExportsToCloudwatchLogs() {
        return this.supportsLogExportsToCloudwatchLogs;
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
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: ").append(getDBParameterGroupFamily()).append(",");
        if (getDBEngineDescription() != null)
            sb.append("DBEngineDescription: ").append(getDBEngineDescription()).append(",");
        if (getDBEngineVersionDescription() != null)
            sb.append("DBEngineVersionDescription: ").append(getDBEngineVersionDescription()).append(",");
        if (getValidUpgradeTarget() != null)
            sb.append("ValidUpgradeTarget: ").append(getValidUpgradeTarget()).append(",");
        if (getExportableLogTypes() != null)
            sb.append("ExportableLogTypes: ").append(getExportableLogTypes()).append(",");
        if (getSupportsLogExportsToCloudwatchLogs() != null)
            sb.append("SupportsLogExportsToCloudwatchLogs: ").append(getSupportsLogExportsToCloudwatchLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBEngineVersion == false)
            return false;
        DBEngineVersion other = (DBEngineVersion) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false)
            return false;
        if (other.getDBEngineDescription() == null ^ this.getDBEngineDescription() == null)
            return false;
        if (other.getDBEngineDescription() != null && other.getDBEngineDescription().equals(this.getDBEngineDescription()) == false)
            return false;
        if (other.getDBEngineVersionDescription() == null ^ this.getDBEngineVersionDescription() == null)
            return false;
        if (other.getDBEngineVersionDescription() != null && other.getDBEngineVersionDescription().equals(this.getDBEngineVersionDescription()) == false)
            return false;
        if (other.getValidUpgradeTarget() == null ^ this.getValidUpgradeTarget() == null)
            return false;
        if (other.getValidUpgradeTarget() != null && other.getValidUpgradeTarget().equals(this.getValidUpgradeTarget()) == false)
            return false;
        if (other.getExportableLogTypes() == null ^ this.getExportableLogTypes() == null)
            return false;
        if (other.getExportableLogTypes() != null && other.getExportableLogTypes().equals(this.getExportableLogTypes()) == false)
            return false;
        if (other.getSupportsLogExportsToCloudwatchLogs() == null ^ this.getSupportsLogExportsToCloudwatchLogs() == null)
            return false;
        if (other.getSupportsLogExportsToCloudwatchLogs() != null
                && other.getSupportsLogExportsToCloudwatchLogs().equals(this.getSupportsLogExportsToCloudwatchLogs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getDBEngineDescription() == null) ? 0 : getDBEngineDescription().hashCode());
        hashCode = prime * hashCode + ((getDBEngineVersionDescription() == null) ? 0 : getDBEngineVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getValidUpgradeTarget() == null) ? 0 : getValidUpgradeTarget().hashCode());
        hashCode = prime * hashCode + ((getExportableLogTypes() == null) ? 0 : getExportableLogTypes().hashCode());
        hashCode = prime * hashCode + ((getSupportsLogExportsToCloudwatchLogs() == null) ? 0 : getSupportsLogExportsToCloudwatchLogs().hashCode());
        return hashCode;
    }

    @Override
    public DBEngineVersion clone() {
        try {
            return (DBEngineVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
