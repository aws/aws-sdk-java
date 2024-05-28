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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateDataProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-friendly name for the data provider.
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
     * The settings in JSON format for a data provider.
     * </p>
     */
    private DataProviderSettings settings;
    /**
     * <p>
     * One or more tags to be assigned to the data provider.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A user-friendly name for the data provider.
     * </p>
     * 
     * @param dataProviderName
     *        A user-friendly name for the data provider.
     */

    public void setDataProviderName(String dataProviderName) {
        this.dataProviderName = dataProviderName;
    }

    /**
     * <p>
     * A user-friendly name for the data provider.
     * </p>
     * 
     * @return A user-friendly name for the data provider.
     */

    public String getDataProviderName() {
        return this.dataProviderName;
    }

    /**
     * <p>
     * A user-friendly name for the data provider.
     * </p>
     * 
     * @param dataProviderName
     *        A user-friendly name for the data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataProviderRequest withDataProviderName(String dataProviderName) {
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

    public CreateDataProviderRequest withDescription(String description) {
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

    public CreateDataProviderRequest withEngine(String engine) {
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

    public CreateDataProviderRequest withSettings(DataProviderSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * One or more tags to be assigned to the data provider.
     * </p>
     * 
     * @return One or more tags to be assigned to the data provider.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags to be assigned to the data provider.
     * </p>
     * 
     * @param tags
     *        One or more tags to be assigned to the data provider.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tags to be assigned to the data provider.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags to be assigned to the data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataProviderRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags to be assigned to the data provider.
     * </p>
     * 
     * @param tags
     *        One or more tags to be assigned to the data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataProviderRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataProviderRequest == false)
            return false;
        CreateDataProviderRequest other = (CreateDataProviderRequest) obj;
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
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataProviderName() == null) ? 0 : getDataProviderName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataProviderRequest clone() {
        return (CreateDataProviderRequest) super.clone();
    }

}
