/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for profile jobs. Configuration can be used to select columns, do evaluations, and override default
 * parameters of evaluations. When configuration is undefined, the profile job will apply default settings to all
 * supported columns.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ProfileConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration for inter-column evaluations. Configuration can be used to select evaluations and override
     * parameters of evaluations. When configuration is undefined, the profile job will run all supported inter-column
     * evaluations.
     * </p>
     */
    private StatisticsConfiguration datasetStatisticsConfiguration;
    /**
     * <p>
     * List of column selectors. ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
     * undefined, the profile job will profile all supported columns.
     * </p>
     */
    private java.util.List<ColumnSelector> profileColumns;
    /**
     * <p>
     * List of configurations for column evaluations. ColumnStatisticsConfigurations are used to select evaluations and
     * override parameters of evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
     * profile job will profile all supported columns and run all supported evaluations.
     * </p>
     */
    private java.util.List<ColumnStatisticsConfiguration> columnStatisticsConfigurations;
    /**
     * <p>
     * Configuration of entity detection for a profile job. When undefined, entity detection is disabled.
     * </p>
     */
    private EntityDetectorConfiguration entityDetectorConfiguration;

    /**
     * <p>
     * Configuration for inter-column evaluations. Configuration can be used to select evaluations and override
     * parameters of evaluations. When configuration is undefined, the profile job will run all supported inter-column
     * evaluations.
     * </p>
     * 
     * @param datasetStatisticsConfiguration
     *        Configuration for inter-column evaluations. Configuration can be used to select evaluations and override
     *        parameters of evaluations. When configuration is undefined, the profile job will run all supported
     *        inter-column evaluations.
     */

    public void setDatasetStatisticsConfiguration(StatisticsConfiguration datasetStatisticsConfiguration) {
        this.datasetStatisticsConfiguration = datasetStatisticsConfiguration;
    }

    /**
     * <p>
     * Configuration for inter-column evaluations. Configuration can be used to select evaluations and override
     * parameters of evaluations. When configuration is undefined, the profile job will run all supported inter-column
     * evaluations.
     * </p>
     * 
     * @return Configuration for inter-column evaluations. Configuration can be used to select evaluations and override
     *         parameters of evaluations. When configuration is undefined, the profile job will run all supported
     *         inter-column evaluations.
     */

    public StatisticsConfiguration getDatasetStatisticsConfiguration() {
        return this.datasetStatisticsConfiguration;
    }

    /**
     * <p>
     * Configuration for inter-column evaluations. Configuration can be used to select evaluations and override
     * parameters of evaluations. When configuration is undefined, the profile job will run all supported inter-column
     * evaluations.
     * </p>
     * 
     * @param datasetStatisticsConfiguration
     *        Configuration for inter-column evaluations. Configuration can be used to select evaluations and override
     *        parameters of evaluations. When configuration is undefined, the profile job will run all supported
     *        inter-column evaluations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileConfiguration withDatasetStatisticsConfiguration(StatisticsConfiguration datasetStatisticsConfiguration) {
        setDatasetStatisticsConfiguration(datasetStatisticsConfiguration);
        return this;
    }

    /**
     * <p>
     * List of column selectors. ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
     * undefined, the profile job will profile all supported columns.
     * </p>
     * 
     * @return List of column selectors. ProfileColumns can be used to select columns from the dataset. When
     *         ProfileColumns is undefined, the profile job will profile all supported columns.
     */

    public java.util.List<ColumnSelector> getProfileColumns() {
        return profileColumns;
    }

    /**
     * <p>
     * List of column selectors. ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
     * undefined, the profile job will profile all supported columns.
     * </p>
     * 
     * @param profileColumns
     *        List of column selectors. ProfileColumns can be used to select columns from the dataset. When
     *        ProfileColumns is undefined, the profile job will profile all supported columns.
     */

    public void setProfileColumns(java.util.Collection<ColumnSelector> profileColumns) {
        if (profileColumns == null) {
            this.profileColumns = null;
            return;
        }

        this.profileColumns = new java.util.ArrayList<ColumnSelector>(profileColumns);
    }

    /**
     * <p>
     * List of column selectors. ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
     * undefined, the profile job will profile all supported columns.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileColumns(java.util.Collection)} or {@link #withProfileColumns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param profileColumns
     *        List of column selectors. ProfileColumns can be used to select columns from the dataset. When
     *        ProfileColumns is undefined, the profile job will profile all supported columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileConfiguration withProfileColumns(ColumnSelector... profileColumns) {
        if (this.profileColumns == null) {
            setProfileColumns(new java.util.ArrayList<ColumnSelector>(profileColumns.length));
        }
        for (ColumnSelector ele : profileColumns) {
            this.profileColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of column selectors. ProfileColumns can be used to select columns from the dataset. When ProfileColumns is
     * undefined, the profile job will profile all supported columns.
     * </p>
     * 
     * @param profileColumns
     *        List of column selectors. ProfileColumns can be used to select columns from the dataset. When
     *        ProfileColumns is undefined, the profile job will profile all supported columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileConfiguration withProfileColumns(java.util.Collection<ColumnSelector> profileColumns) {
        setProfileColumns(profileColumns);
        return this;
    }

    /**
     * <p>
     * List of configurations for column evaluations. ColumnStatisticsConfigurations are used to select evaluations and
     * override parameters of evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
     * profile job will profile all supported columns and run all supported evaluations.
     * </p>
     * 
     * @return List of configurations for column evaluations. ColumnStatisticsConfigurations are used to select
     *         evaluations and override parameters of evaluations for particular columns. When
     *         ColumnStatisticsConfigurations is undefined, the profile job will profile all supported columns and run
     *         all supported evaluations.
     */

    public java.util.List<ColumnStatisticsConfiguration> getColumnStatisticsConfigurations() {
        return columnStatisticsConfigurations;
    }

    /**
     * <p>
     * List of configurations for column evaluations. ColumnStatisticsConfigurations are used to select evaluations and
     * override parameters of evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
     * profile job will profile all supported columns and run all supported evaluations.
     * </p>
     * 
     * @param columnStatisticsConfigurations
     *        List of configurations for column evaluations. ColumnStatisticsConfigurations are used to select
     *        evaluations and override parameters of evaluations for particular columns. When
     *        ColumnStatisticsConfigurations is undefined, the profile job will profile all supported columns and run
     *        all supported evaluations.
     */

    public void setColumnStatisticsConfigurations(java.util.Collection<ColumnStatisticsConfiguration> columnStatisticsConfigurations) {
        if (columnStatisticsConfigurations == null) {
            this.columnStatisticsConfigurations = null;
            return;
        }

        this.columnStatisticsConfigurations = new java.util.ArrayList<ColumnStatisticsConfiguration>(columnStatisticsConfigurations);
    }

    /**
     * <p>
     * List of configurations for column evaluations. ColumnStatisticsConfigurations are used to select evaluations and
     * override parameters of evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
     * profile job will profile all supported columns and run all supported evaluations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnStatisticsConfigurations(java.util.Collection)} or
     * {@link #withColumnStatisticsConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param columnStatisticsConfigurations
     *        List of configurations for column evaluations. ColumnStatisticsConfigurations are used to select
     *        evaluations and override parameters of evaluations for particular columns. When
     *        ColumnStatisticsConfigurations is undefined, the profile job will profile all supported columns and run
     *        all supported evaluations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileConfiguration withColumnStatisticsConfigurations(ColumnStatisticsConfiguration... columnStatisticsConfigurations) {
        if (this.columnStatisticsConfigurations == null) {
            setColumnStatisticsConfigurations(new java.util.ArrayList<ColumnStatisticsConfiguration>(columnStatisticsConfigurations.length));
        }
        for (ColumnStatisticsConfiguration ele : columnStatisticsConfigurations) {
            this.columnStatisticsConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of configurations for column evaluations. ColumnStatisticsConfigurations are used to select evaluations and
     * override parameters of evaluations for particular columns. When ColumnStatisticsConfigurations is undefined, the
     * profile job will profile all supported columns and run all supported evaluations.
     * </p>
     * 
     * @param columnStatisticsConfigurations
     *        List of configurations for column evaluations. ColumnStatisticsConfigurations are used to select
     *        evaluations and override parameters of evaluations for particular columns. When
     *        ColumnStatisticsConfigurations is undefined, the profile job will profile all supported columns and run
     *        all supported evaluations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileConfiguration withColumnStatisticsConfigurations(java.util.Collection<ColumnStatisticsConfiguration> columnStatisticsConfigurations) {
        setColumnStatisticsConfigurations(columnStatisticsConfigurations);
        return this;
    }

    /**
     * <p>
     * Configuration of entity detection for a profile job. When undefined, entity detection is disabled.
     * </p>
     * 
     * @param entityDetectorConfiguration
     *        Configuration of entity detection for a profile job. When undefined, entity detection is disabled.
     */

    public void setEntityDetectorConfiguration(EntityDetectorConfiguration entityDetectorConfiguration) {
        this.entityDetectorConfiguration = entityDetectorConfiguration;
    }

    /**
     * <p>
     * Configuration of entity detection for a profile job. When undefined, entity detection is disabled.
     * </p>
     * 
     * @return Configuration of entity detection for a profile job. When undefined, entity detection is disabled.
     */

    public EntityDetectorConfiguration getEntityDetectorConfiguration() {
        return this.entityDetectorConfiguration;
    }

    /**
     * <p>
     * Configuration of entity detection for a profile job. When undefined, entity detection is disabled.
     * </p>
     * 
     * @param entityDetectorConfiguration
     *        Configuration of entity detection for a profile job. When undefined, entity detection is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileConfiguration withEntityDetectorConfiguration(EntityDetectorConfiguration entityDetectorConfiguration) {
        setEntityDetectorConfiguration(entityDetectorConfiguration);
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
        if (getDatasetStatisticsConfiguration() != null)
            sb.append("DatasetStatisticsConfiguration: ").append(getDatasetStatisticsConfiguration()).append(",");
        if (getProfileColumns() != null)
            sb.append("ProfileColumns: ").append(getProfileColumns()).append(",");
        if (getColumnStatisticsConfigurations() != null)
            sb.append("ColumnStatisticsConfigurations: ").append(getColumnStatisticsConfigurations()).append(",");
        if (getEntityDetectorConfiguration() != null)
            sb.append("EntityDetectorConfiguration: ").append(getEntityDetectorConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfileConfiguration == false)
            return false;
        ProfileConfiguration other = (ProfileConfiguration) obj;
        if (other.getDatasetStatisticsConfiguration() == null ^ this.getDatasetStatisticsConfiguration() == null)
            return false;
        if (other.getDatasetStatisticsConfiguration() != null
                && other.getDatasetStatisticsConfiguration().equals(this.getDatasetStatisticsConfiguration()) == false)
            return false;
        if (other.getProfileColumns() == null ^ this.getProfileColumns() == null)
            return false;
        if (other.getProfileColumns() != null && other.getProfileColumns().equals(this.getProfileColumns()) == false)
            return false;
        if (other.getColumnStatisticsConfigurations() == null ^ this.getColumnStatisticsConfigurations() == null)
            return false;
        if (other.getColumnStatisticsConfigurations() != null
                && other.getColumnStatisticsConfigurations().equals(this.getColumnStatisticsConfigurations()) == false)
            return false;
        if (other.getEntityDetectorConfiguration() == null ^ this.getEntityDetectorConfiguration() == null)
            return false;
        if (other.getEntityDetectorConfiguration() != null && other.getEntityDetectorConfiguration().equals(this.getEntityDetectorConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetStatisticsConfiguration() == null) ? 0 : getDatasetStatisticsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getProfileColumns() == null) ? 0 : getProfileColumns().hashCode());
        hashCode = prime * hashCode + ((getColumnStatisticsConfigurations() == null) ? 0 : getColumnStatisticsConfigurations().hashCode());
        hashCode = prime * hashCode + ((getEntityDetectorConfiguration() == null) ? 0 : getEntityDetectorConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ProfileConfiguration clone() {
        try {
            return (ProfileConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.ProfileConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
