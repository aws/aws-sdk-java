/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * This data type is used as a response element in the action <a>DescribeDBEngineVersions</a>.
 * </p>
 */
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
     * The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     * parameter of the CreateDBInstance API is not specified.
     * </p>
     */
    private CharacterSet defaultCharacterSet;
    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CharacterSet> supportedCharacterSets;
    /**
     * <p>
     * A list of engine versions that this database engine version can be upgraded to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UpgradeTarget> validUpgradeTarget;
    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Timezone> supportedTimezones;

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
     * The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     * parameter of the CreateDBInstance API is not specified.
     * </p>
     * 
     * @param defaultCharacterSet
     *        The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     *        parameter of the CreateDBInstance API is not specified.
     */

    public void setDefaultCharacterSet(CharacterSet defaultCharacterSet) {
        this.defaultCharacterSet = defaultCharacterSet;
    }

    /**
     * <p>
     * The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     * parameter of the CreateDBInstance API is not specified.
     * </p>
     * 
     * @return The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     *         parameter of the CreateDBInstance API is not specified.
     */

    public CharacterSet getDefaultCharacterSet() {
        return this.defaultCharacterSet;
    }

    /**
     * <p>
     * The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     * parameter of the CreateDBInstance API is not specified.
     * </p>
     * 
     * @param defaultCharacterSet
     *        The default character set for new instances of this engine version, if the <code>CharacterSetName</code>
     *        parameter of the CreateDBInstance API is not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withDefaultCharacterSet(CharacterSet defaultCharacterSet) {
        setDefaultCharacterSet(defaultCharacterSet);
        return this;
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * 
     * @return A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of
     *         the <code>CreateDBInstance</code> action.
     */

    public java.util.List<CharacterSet> getSupportedCharacterSets() {
        if (supportedCharacterSets == null) {
            supportedCharacterSets = new com.amazonaws.internal.SdkInternalList<CharacterSet>();
        }
        return supportedCharacterSets;
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * 
     * @param supportedCharacterSets
     *        A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of
     *        the <code>CreateDBInstance</code> action.
     */

    public void setSupportedCharacterSets(java.util.Collection<CharacterSet> supportedCharacterSets) {
        if (supportedCharacterSets == null) {
            this.supportedCharacterSets = null;
            return;
        }

        this.supportedCharacterSets = new com.amazonaws.internal.SdkInternalList<CharacterSet>(supportedCharacterSets);
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedCharacterSets(java.util.Collection)} or
     * {@link #withSupportedCharacterSets(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedCharacterSets
     *        A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of
     *        the <code>CreateDBInstance</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedCharacterSets(CharacterSet... supportedCharacterSets) {
        if (this.supportedCharacterSets == null) {
            setSupportedCharacterSets(new com.amazonaws.internal.SdkInternalList<CharacterSet>(supportedCharacterSets.length));
        }
        for (CharacterSet ele : supportedCharacterSets) {
            this.supportedCharacterSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * 
     * @param supportedCharacterSets
     *        A list of the character sets supported by this engine for the <code>CharacterSetName</code> parameter of
     *        the <code>CreateDBInstance</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedCharacterSets(java.util.Collection<CharacterSet> supportedCharacterSets) {
        setSupportedCharacterSets(supportedCharacterSets);
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
        if (validUpgradeTarget == null) {
            validUpgradeTarget = new com.amazonaws.internal.SdkInternalList<UpgradeTarget>();
        }
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

        this.validUpgradeTarget = new com.amazonaws.internal.SdkInternalList<UpgradeTarget>(validUpgradeTarget);
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
            setValidUpgradeTarget(new com.amazonaws.internal.SdkInternalList<UpgradeTarget>(validUpgradeTarget.length));
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
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * 
     * @return A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     *         <code>CreateDBInstance</code> action.
     */

    public java.util.List<Timezone> getSupportedTimezones() {
        if (supportedTimezones == null) {
            supportedTimezones = new com.amazonaws.internal.SdkInternalList<Timezone>();
        }
        return supportedTimezones;
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * 
     * @param supportedTimezones
     *        A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     *        <code>CreateDBInstance</code> action.
     */

    public void setSupportedTimezones(java.util.Collection<Timezone> supportedTimezones) {
        if (supportedTimezones == null) {
            this.supportedTimezones = null;
            return;
        }

        this.supportedTimezones = new com.amazonaws.internal.SdkInternalList<Timezone>(supportedTimezones);
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedTimezones(java.util.Collection)} or {@link #withSupportedTimezones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedTimezones
     *        A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     *        <code>CreateDBInstance</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedTimezones(Timezone... supportedTimezones) {
        if (this.supportedTimezones == null) {
            setSupportedTimezones(new com.amazonaws.internal.SdkInternalList<Timezone>(supportedTimezones.length));
        }
        for (Timezone ele : supportedTimezones) {
            this.supportedTimezones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     * <code>CreateDBInstance</code> action.
     * </p>
     * 
     * @param supportedTimezones
     *        A list of the time zones supported by this engine for the <code>Timezone</code> parameter of the
     *        <code>CreateDBInstance</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBEngineVersion withSupportedTimezones(java.util.Collection<Timezone> supportedTimezones) {
        setSupportedTimezones(supportedTimezones);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: " + getDBParameterGroupFamily() + ",");
        if (getDBEngineDescription() != null)
            sb.append("DBEngineDescription: " + getDBEngineDescription() + ",");
        if (getDBEngineVersionDescription() != null)
            sb.append("DBEngineVersionDescription: " + getDBEngineVersionDescription() + ",");
        if (getDefaultCharacterSet() != null)
            sb.append("DefaultCharacterSet: " + getDefaultCharacterSet() + ",");
        if (getSupportedCharacterSets() != null)
            sb.append("SupportedCharacterSets: " + getSupportedCharacterSets() + ",");
        if (getValidUpgradeTarget() != null)
            sb.append("ValidUpgradeTarget: " + getValidUpgradeTarget() + ",");
        if (getSupportedTimezones() != null)
            sb.append("SupportedTimezones: " + getSupportedTimezones());
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
        if (other.getDefaultCharacterSet() == null ^ this.getDefaultCharacterSet() == null)
            return false;
        if (other.getDefaultCharacterSet() != null && other.getDefaultCharacterSet().equals(this.getDefaultCharacterSet()) == false)
            return false;
        if (other.getSupportedCharacterSets() == null ^ this.getSupportedCharacterSets() == null)
            return false;
        if (other.getSupportedCharacterSets() != null && other.getSupportedCharacterSets().equals(this.getSupportedCharacterSets()) == false)
            return false;
        if (other.getValidUpgradeTarget() == null ^ this.getValidUpgradeTarget() == null)
            return false;
        if (other.getValidUpgradeTarget() != null && other.getValidUpgradeTarget().equals(this.getValidUpgradeTarget()) == false)
            return false;
        if (other.getSupportedTimezones() == null ^ this.getSupportedTimezones() == null)
            return false;
        if (other.getSupportedTimezones() != null && other.getSupportedTimezones().equals(this.getSupportedTimezones()) == false)
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
        hashCode = prime * hashCode + ((getDefaultCharacterSet() == null) ? 0 : getDefaultCharacterSet().hashCode());
        hashCode = prime * hashCode + ((getSupportedCharacterSets() == null) ? 0 : getSupportedCharacterSets().hashCode());
        hashCode = prime * hashCode + ((getValidUpgradeTarget() == null) ? 0 : getValidUpgradeTarget().hashCode());
        hashCode = prime * hashCode + ((getSupportedTimezones() == null) ? 0 : getSupportedTimezones().hashCode());
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
