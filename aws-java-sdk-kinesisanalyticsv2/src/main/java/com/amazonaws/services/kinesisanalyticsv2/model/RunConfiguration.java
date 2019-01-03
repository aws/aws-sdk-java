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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the starting parameters for an Amazon Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/RunConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
     * </p>
     */
    private java.util.List<SqlRunConfiguration> sqlRunConfigurations;
    /**
     * <p>
     * Describes the restore behavior of a restarting application.
     * </p>
     */
    private ApplicationRestoreConfiguration applicationRestoreConfiguration;

    /**
     * <p>
     * Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
     */

    public java.util.List<SqlRunConfiguration> getSqlRunConfigurations() {
        return sqlRunConfigurations;
    }

    /**
     * <p>
     * Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param sqlRunConfigurations
     *        Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
     */

    public void setSqlRunConfigurations(java.util.Collection<SqlRunConfiguration> sqlRunConfigurations) {
        if (sqlRunConfigurations == null) {
            this.sqlRunConfigurations = null;
            return;
        }

        this.sqlRunConfigurations = new java.util.ArrayList<SqlRunConfiguration>(sqlRunConfigurations);
    }

    /**
     * <p>
     * Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSqlRunConfigurations(java.util.Collection)} or {@link #withSqlRunConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param sqlRunConfigurations
     *        Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunConfiguration withSqlRunConfigurations(SqlRunConfiguration... sqlRunConfigurations) {
        if (this.sqlRunConfigurations == null) {
            setSqlRunConfigurations(new java.util.ArrayList<SqlRunConfiguration>(sqlRunConfigurations.length));
        }
        for (SqlRunConfiguration ele : sqlRunConfigurations) {
            this.sqlRunConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param sqlRunConfigurations
     *        Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunConfiguration withSqlRunConfigurations(java.util.Collection<SqlRunConfiguration> sqlRunConfigurations) {
        setSqlRunConfigurations(sqlRunConfigurations);
        return this;
    }

    /**
     * <p>
     * Describes the restore behavior of a restarting application.
     * </p>
     * 
     * @param applicationRestoreConfiguration
     *        Describes the restore behavior of a restarting application.
     */

    public void setApplicationRestoreConfiguration(ApplicationRestoreConfiguration applicationRestoreConfiguration) {
        this.applicationRestoreConfiguration = applicationRestoreConfiguration;
    }

    /**
     * <p>
     * Describes the restore behavior of a restarting application.
     * </p>
     * 
     * @return Describes the restore behavior of a restarting application.
     */

    public ApplicationRestoreConfiguration getApplicationRestoreConfiguration() {
        return this.applicationRestoreConfiguration;
    }

    /**
     * <p>
     * Describes the restore behavior of a restarting application.
     * </p>
     * 
     * @param applicationRestoreConfiguration
     *        Describes the restore behavior of a restarting application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunConfiguration withApplicationRestoreConfiguration(ApplicationRestoreConfiguration applicationRestoreConfiguration) {
        setApplicationRestoreConfiguration(applicationRestoreConfiguration);
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
        if (getSqlRunConfigurations() != null)
            sb.append("SqlRunConfigurations: ").append(getSqlRunConfigurations()).append(",");
        if (getApplicationRestoreConfiguration() != null)
            sb.append("ApplicationRestoreConfiguration: ").append(getApplicationRestoreConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunConfiguration == false)
            return false;
        RunConfiguration other = (RunConfiguration) obj;
        if (other.getSqlRunConfigurations() == null ^ this.getSqlRunConfigurations() == null)
            return false;
        if (other.getSqlRunConfigurations() != null && other.getSqlRunConfigurations().equals(this.getSqlRunConfigurations()) == false)
            return false;
        if (other.getApplicationRestoreConfiguration() == null ^ this.getApplicationRestoreConfiguration() == null)
            return false;
        if (other.getApplicationRestoreConfiguration() != null
                && other.getApplicationRestoreConfiguration().equals(this.getApplicationRestoreConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSqlRunConfigurations() == null) ? 0 : getSqlRunConfigurations().hashCode());
        hashCode = prime * hashCode + ((getApplicationRestoreConfiguration() == null) ? 0 : getApplicationRestoreConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RunConfiguration clone() {
        try {
            return (RunConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.RunConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
