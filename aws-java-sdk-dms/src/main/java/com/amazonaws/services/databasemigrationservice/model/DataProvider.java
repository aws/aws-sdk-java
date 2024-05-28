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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that defines a data provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DataProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data provider.
     * </p>
     */
    private String dataProviderName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the data provider.
     * </p>
     */
    private String dataProviderArn;
    /**
     * <p>
     * The time the data provider was created.
     * </p>
     */
    private java.util.Date dataProviderCreationTime;
    /**
     * <p>
     * A description of the data provider. Descriptions can have up to 31 characters. A description can contain only
     * ASCII letters, digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter.
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
     * The settings in JSON format for a data provider.
     * </p>
     */
    private DataProviderSettings settings;

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

    public DataProvider withDataProviderName(String dataProviderName) {
        setDataProviderName(dataProviderName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the data provider.
     * </p>
     * 
     * @param dataProviderArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the data provider.
     */

    public void setDataProviderArn(String dataProviderArn) {
        this.dataProviderArn = dataProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the data provider.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the data provider.
     */

    public String getDataProviderArn() {
        return this.dataProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the data provider.
     * </p>
     * 
     * @param dataProviderArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProvider withDataProviderArn(String dataProviderArn) {
        setDataProviderArn(dataProviderArn);
        return this;
    }

    /**
     * <p>
     * The time the data provider was created.
     * </p>
     * 
     * @param dataProviderCreationTime
     *        The time the data provider was created.
     */

    public void setDataProviderCreationTime(java.util.Date dataProviderCreationTime) {
        this.dataProviderCreationTime = dataProviderCreationTime;
    }

    /**
     * <p>
     * The time the data provider was created.
     * </p>
     * 
     * @return The time the data provider was created.
     */

    public java.util.Date getDataProviderCreationTime() {
        return this.dataProviderCreationTime;
    }

    /**
     * <p>
     * The time the data provider was created.
     * </p>
     * 
     * @param dataProviderCreationTime
     *        The time the data provider was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProvider withDataProviderCreationTime(java.util.Date dataProviderCreationTime) {
        setDataProviderCreationTime(dataProviderCreationTime);
        return this;
    }

    /**
     * <p>
     * A description of the data provider. Descriptions can have up to 31 characters. A description can contain only
     * ASCII letters, digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter.
     * </p>
     * 
     * @param description
     *        A description of the data provider. Descriptions can have up to 31 characters. A description can contain
     *        only ASCII letters, digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive
     *        hyphens, and can only begin with a letter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the data provider. Descriptions can have up to 31 characters. A description can contain only
     * ASCII letters, digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter.
     * </p>
     * 
     * @return A description of the data provider. Descriptions can have up to 31 characters. A description can contain
     *         only ASCII letters, digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two
     *         consecutive hyphens, and can only begin with a letter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the data provider. Descriptions can have up to 31 characters. A description can contain only
     * ASCII letters, digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens,
     * and can only begin with a letter.
     * </p>
     * 
     * @param description
     *        A description of the data provider. Descriptions can have up to 31 characters. A description can contain
     *        only ASCII letters, digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive
     *        hyphens, and can only begin with a letter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProvider withDescription(String description) {
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

    public DataProvider withEngine(String engine) {
        setEngine(engine);
        return this;
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

    public DataProvider withSettings(DataProviderSettings settings) {
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
        if (getDataProviderName() != null)
            sb.append("DataProviderName: ").append(getDataProviderName()).append(",");
        if (getDataProviderArn() != null)
            sb.append("DataProviderArn: ").append(getDataProviderArn()).append(",");
        if (getDataProviderCreationTime() != null)
            sb.append("DataProviderCreationTime: ").append(getDataProviderCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
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

        if (obj instanceof DataProvider == false)
            return false;
        DataProvider other = (DataProvider) obj;
        if (other.getDataProviderName() == null ^ this.getDataProviderName() == null)
            return false;
        if (other.getDataProviderName() != null && other.getDataProviderName().equals(this.getDataProviderName()) == false)
            return false;
        if (other.getDataProviderArn() == null ^ this.getDataProviderArn() == null)
            return false;
        if (other.getDataProviderArn() != null && other.getDataProviderArn().equals(this.getDataProviderArn()) == false)
            return false;
        if (other.getDataProviderCreationTime() == null ^ this.getDataProviderCreationTime() == null)
            return false;
        if (other.getDataProviderCreationTime() != null && other.getDataProviderCreationTime().equals(this.getDataProviderCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
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

        hashCode = prime * hashCode + ((getDataProviderName() == null) ? 0 : getDataProviderName().hashCode());
        hashCode = prime * hashCode + ((getDataProviderArn() == null) ? 0 : getDataProviderArn().hashCode());
        hashCode = prime * hashCode + ((getDataProviderCreationTime() == null) ? 0 : getDataProviderCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public DataProvider clone() {
        try {
            return (DataProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.DataProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
