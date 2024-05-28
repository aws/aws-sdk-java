/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyDataProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDataProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the data provider. Identifiers must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * </p>
     */
    private String dataProviderIdentifier;
    /**
     * <p>
     * The name of the data provider.
     * </p>
     */
    private String dataProviderName;
    /**
     * <p>
     * A user-friendly description of the data provider.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of database engine for the data provider. Valid values include <code>"aurora"</code>,
     * <code>"aurora-postgresql"</code>, <code>"mysql"</code>, <code>"oracle"</code>, <code>"postgres"</code>,
     * <code>"sqlserver"</code>, <code>redshift</code>, <code>mariadb</code>, <code>mongodb</code>, and
     * <code>docdb</code>. A value of <code>"aurora"</code> represents Amazon Aurora MySQL-Compatible Edition.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * If this attribute is Y, the current call to <code>ModifyDataProvider</code> replaces all existing data provider
     * settings with the exact settings that you specify in this call. If this attribute is N, the current call to
     * <code>ModifyDataProvider</code> does two things:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It replaces any data provider settings that already exist with new values, for settings with the same names.
     * </p>
     * </li>
     * <li>
     * <p>
     * It creates new data provider settings that you specify in the call, for settings with different names.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean exactSettings;
    /**
     * <p>
     * The settings in JSON format for a data provider.
     * </p>
     */
    private DataProviderSettings settings;

    /**
     * <p>
     * The identifier of the data provider. Identifiers must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * </p>
     * 
     * @param dataProviderIdentifier
     *        The identifier of the data provider. Identifiers must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */

    public void setDataProviderIdentifier(String dataProviderIdentifier) {
        this.dataProviderIdentifier = dataProviderIdentifier;
    }

    /**
     * <p>
     * The identifier of the data provider. Identifiers must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * </p>
     * 
     * @return The identifier of the data provider. Identifiers must begin with a letter and must contain only ASCII
     *         letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */

    public String getDataProviderIdentifier() {
        return this.dataProviderIdentifier;
    }

    /**
     * <p>
     * The identifier of the data provider. Identifiers must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * </p>
     * 
     * @param dataProviderIdentifier
     *        The identifier of the data provider. Identifiers must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDataProviderRequest withDataProviderIdentifier(String dataProviderIdentifier) {
        setDataProviderIdentifier(dataProviderIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the data provider.
     * </p>
     * 
     * @param dataProviderName
     *        The name of the data provider.
     */

    public void setDataProviderName(String dataProviderName) {
        this.dataProviderName = dataProviderName;
    }

    /**
     * <p>
     * The name of the data provider.
     * </p>
     * 
     * @return The name of the data provider.
     */

    public String getDataProviderName() {
        return this.dataProviderName;
    }

    /**
     * <p>
     * The name of the data provider.
     * </p>
     * 
     * @param dataProviderName
     *        The name of the data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDataProviderRequest withDataProviderName(String dataProviderName) {
        setDataProviderName(dataProviderName);
        return this;
    }

    /**
     * <p>
     * A user-friendly description of the data provider.
     * </p>
     * 
     * @param description
     *        A user-friendly description of the data provider.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-friendly description of the data provider.
     * </p>
     * 
     * @return A user-friendly description of the data provider.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-friendly description of the data provider.
     * </p>
     * 
     * @param description
     *        A user-friendly description of the data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDataProviderRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of database engine for the data provider. Valid values include <code>"aurora"</code>,
     * <code>"aurora-postgresql"</code>, <code>"mysql"</code>, <code>"oracle"</code>, <code>"postgres"</code>,
     * <code>"sqlserver"</code>, <code>redshift</code>, <code>mariadb</code>, <code>mongodb</code>, and
     * <code>docdb</code>. A value of <code>"aurora"</code> represents Amazon Aurora MySQL-Compatible Edition.
     * </p>
     * 
     * @param engine
     *        The type of database engine for the data provider. Valid values include <code>"aurora"</code>,
     *        <code>"aurora-postgresql"</code>, <code>"mysql"</code>, <code>"oracle"</code>, <code>"postgres"</code>,
     *        <code>"sqlserver"</code>, <code>redshift</code>, <code>mariadb</code>, <code>mongodb</code>, and
     *        <code>docdb</code>. A value of <code>"aurora"</code> represents Amazon Aurora MySQL-Compatible Edition.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The type of database engine for the data provider. Valid values include <code>"aurora"</code>,
     * <code>"aurora-postgresql"</code>, <code>"mysql"</code>, <code>"oracle"</code>, <code>"postgres"</code>,
     * <code>"sqlserver"</code>, <code>redshift</code>, <code>mariadb</code>, <code>mongodb</code>, and
     * <code>docdb</code>. A value of <code>"aurora"</code> represents Amazon Aurora MySQL-Compatible Edition.
     * </p>
     * 
     * @return The type of database engine for the data provider. Valid values include <code>"aurora"</code>,
     *         <code>"aurora-postgresql"</code>, <code>"mysql"</code>, <code>"oracle"</code>, <code>"postgres"</code>,
     *         <code>"sqlserver"</code>, <code>redshift</code>, <code>mariadb</code>, <code>mongodb</code>, and
     *         <code>docdb</code>. A value of <code>"aurora"</code> represents Amazon Aurora MySQL-Compatible Edition.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The type of database engine for the data provider. Valid values include <code>"aurora"</code>,
     * <code>"aurora-postgresql"</code>, <code>"mysql"</code>, <code>"oracle"</code>, <code>"postgres"</code>,
     * <code>"sqlserver"</code>, <code>redshift</code>, <code>mariadb</code>, <code>mongodb</code>, and
     * <code>docdb</code>. A value of <code>"aurora"</code> represents Amazon Aurora MySQL-Compatible Edition.
     * </p>
     * 
     * @param engine
     *        The type of database engine for the data provider. Valid values include <code>"aurora"</code>,
     *        <code>"aurora-postgresql"</code>, <code>"mysql"</code>, <code>"oracle"</code>, <code>"postgres"</code>,
     *        <code>"sqlserver"</code>, <code>redshift</code>, <code>mariadb</code>, <code>mongodb</code>, and
     *        <code>docdb</code>. A value of <code>"aurora"</code> represents Amazon Aurora MySQL-Compatible Edition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDataProviderRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * If this attribute is Y, the current call to <code>ModifyDataProvider</code> replaces all existing data provider
     * settings with the exact settings that you specify in this call. If this attribute is N, the current call to
     * <code>ModifyDataProvider</code> does two things:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It replaces any data provider settings that already exist with new values, for settings with the same names.
     * </p>
     * </li>
     * <li>
     * <p>
     * It creates new data provider settings that you specify in the call, for settings with different names.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exactSettings
     *        If this attribute is Y, the current call to <code>ModifyDataProvider</code> replaces all existing data
     *        provider settings with the exact settings that you specify in this call. If this attribute is N, the
     *        current call to <code>ModifyDataProvider</code> does two things: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It replaces any data provider settings that already exist with new values, for settings with the same
     *        names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It creates new data provider settings that you specify in the call, for settings with different names.
     *        </p>
     *        </li>
     */

    public void setExactSettings(Boolean exactSettings) {
        this.exactSettings = exactSettings;
    }

    /**
     * <p>
     * If this attribute is Y, the current call to <code>ModifyDataProvider</code> replaces all existing data provider
     * settings with the exact settings that you specify in this call. If this attribute is N, the current call to
     * <code>ModifyDataProvider</code> does two things:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It replaces any data provider settings that already exist with new values, for settings with the same names.
     * </p>
     * </li>
     * <li>
     * <p>
     * It creates new data provider settings that you specify in the call, for settings with different names.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If this attribute is Y, the current call to <code>ModifyDataProvider</code> replaces all existing data
     *         provider settings with the exact settings that you specify in this call. If this attribute is N, the
     *         current call to <code>ModifyDataProvider</code> does two things: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         It replaces any data provider settings that already exist with new values, for settings with the same
     *         names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It creates new data provider settings that you specify in the call, for settings with different names.
     *         </p>
     *         </li>
     */

    public Boolean getExactSettings() {
        return this.exactSettings;
    }

    /**
     * <p>
     * If this attribute is Y, the current call to <code>ModifyDataProvider</code> replaces all existing data provider
     * settings with the exact settings that you specify in this call. If this attribute is N, the current call to
     * <code>ModifyDataProvider</code> does two things:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It replaces any data provider settings that already exist with new values, for settings with the same names.
     * </p>
     * </li>
     * <li>
     * <p>
     * It creates new data provider settings that you specify in the call, for settings with different names.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exactSettings
     *        If this attribute is Y, the current call to <code>ModifyDataProvider</code> replaces all existing data
     *        provider settings with the exact settings that you specify in this call. If this attribute is N, the
     *        current call to <code>ModifyDataProvider</code> does two things: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It replaces any data provider settings that already exist with new values, for settings with the same
     *        names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It creates new data provider settings that you specify in the call, for settings with different names.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDataProviderRequest withExactSettings(Boolean exactSettings) {
        setExactSettings(exactSettings);
        return this;
    }

    /**
     * <p>
     * If this attribute is Y, the current call to <code>ModifyDataProvider</code> replaces all existing data provider
     * settings with the exact settings that you specify in this call. If this attribute is N, the current call to
     * <code>ModifyDataProvider</code> does two things:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It replaces any data provider settings that already exist with new values, for settings with the same names.
     * </p>
     * </li>
     * <li>
     * <p>
     * It creates new data provider settings that you specify in the call, for settings with different names.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If this attribute is Y, the current call to <code>ModifyDataProvider</code> replaces all existing data
     *         provider settings with the exact settings that you specify in this call. If this attribute is N, the
     *         current call to <code>ModifyDataProvider</code> does two things: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         It replaces any data provider settings that already exist with new values, for settings with the same
     *         names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It creates new data provider settings that you specify in the call, for settings with different names.
     *         </p>
     *         </li>
     */

    public Boolean isExactSettings() {
        return this.exactSettings;
    }

    /**
     * <p>
     * The settings in JSON format for a data provider.
     * </p>
     * 
     * @param settings
     *        The settings in JSON format for a data provider.
     */

    public void setSettings(DataProviderSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * The settings in JSON format for a data provider.
     * </p>
     * 
     * @return The settings in JSON format for a data provider.
     */

    public DataProviderSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * The settings in JSON format for a data provider.
     * </p>
     * 
     * @param settings
     *        The settings in JSON format for a data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDataProviderRequest withSettings(DataProviderSettings settings) {
        setSettings(settings);
        return this;
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
        if (getDataProviderIdentifier() != null)
            sb.append("DataProviderIdentifier: ").append(getDataProviderIdentifier()).append(",");
        if (getDataProviderName() != null)
            sb.append("DataProviderName: ").append(getDataProviderName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getExactSettings() != null)
            sb.append("ExactSettings: ").append(getExactSettings()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDataProviderRequest == false)
            return false;
        ModifyDataProviderRequest other = (ModifyDataProviderRequest) obj;
        if (other.getDataProviderIdentifier() == null ^ this.getDataProviderIdentifier() == null)
            return false;
        if (other.getDataProviderIdentifier() != null && other.getDataProviderIdentifier().equals(this.getDataProviderIdentifier()) == false)
            return false;
        if (other.getDataProviderName() == null ^ this.getDataProviderName() == null)
            return false;
        if (other.getDataProviderName() != null && other.getDataProviderName().equals(this.getDataProviderName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getExactSettings() == null ^ this.getExactSettings() == null)
            return false;
        if (other.getExactSettings() != null && other.getExactSettings().equals(this.getExactSettings()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataProviderIdentifier() == null) ? 0 : getDataProviderIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDataProviderName() == null) ? 0 : getDataProviderName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getExactSettings() == null) ? 0 : getExactSettings().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDataProviderRequest clone() {
        return (ModifyDataProviderRequest) super.clone();
    }

}
