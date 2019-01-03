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
 * Specifies the creation parameters for an Amazon Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The creation and update parameters for an SQL-based Kinesis Data Analytics application.
     * </p>
     */
    private SqlApplicationConfiguration sqlApplicationConfiguration;
    /**
     * <p>
     * The creation and update parameters for a Java-based Kinesis Data Analytics application.
     * </p>
     */
    private FlinkApplicationConfiguration flinkApplicationConfiguration;
    /**
     * <p>
     * Describes execution properties for a Java-based Kinesis Data Analytics application.
     * </p>
     */
    private EnvironmentProperties environmentProperties;
    /**
     * <p>
     * The code location and type parameters for a Java-based Kinesis Data Analytics application.
     * </p>
     */
    private ApplicationCodeConfiguration applicationCodeConfiguration;
    /**
     * <p>
     * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     */
    private ApplicationSnapshotConfiguration applicationSnapshotConfiguration;

    /**
     * <p>
     * The creation and update parameters for an SQL-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param sqlApplicationConfiguration
     *        The creation and update parameters for an SQL-based Kinesis Data Analytics application.
     */

    public void setSqlApplicationConfiguration(SqlApplicationConfiguration sqlApplicationConfiguration) {
        this.sqlApplicationConfiguration = sqlApplicationConfiguration;
    }

    /**
     * <p>
     * The creation and update parameters for an SQL-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return The creation and update parameters for an SQL-based Kinesis Data Analytics application.
     */

    public SqlApplicationConfiguration getSqlApplicationConfiguration() {
        return this.sqlApplicationConfiguration;
    }

    /**
     * <p>
     * The creation and update parameters for an SQL-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param sqlApplicationConfiguration
     *        The creation and update parameters for an SQL-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfiguration withSqlApplicationConfiguration(SqlApplicationConfiguration sqlApplicationConfiguration) {
        setSqlApplicationConfiguration(sqlApplicationConfiguration);
        return this;
    }

    /**
     * <p>
     * The creation and update parameters for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param flinkApplicationConfiguration
     *        The creation and update parameters for a Java-based Kinesis Data Analytics application.
     */

    public void setFlinkApplicationConfiguration(FlinkApplicationConfiguration flinkApplicationConfiguration) {
        this.flinkApplicationConfiguration = flinkApplicationConfiguration;
    }

    /**
     * <p>
     * The creation and update parameters for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return The creation and update parameters for a Java-based Kinesis Data Analytics application.
     */

    public FlinkApplicationConfiguration getFlinkApplicationConfiguration() {
        return this.flinkApplicationConfiguration;
    }

    /**
     * <p>
     * The creation and update parameters for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param flinkApplicationConfiguration
     *        The creation and update parameters for a Java-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfiguration withFlinkApplicationConfiguration(FlinkApplicationConfiguration flinkApplicationConfiguration) {
        setFlinkApplicationConfiguration(flinkApplicationConfiguration);
        return this;
    }

    /**
     * <p>
     * Describes execution properties for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param environmentProperties
     *        Describes execution properties for a Java-based Kinesis Data Analytics application.
     */

    public void setEnvironmentProperties(EnvironmentProperties environmentProperties) {
        this.environmentProperties = environmentProperties;
    }

    /**
     * <p>
     * Describes execution properties for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return Describes execution properties for a Java-based Kinesis Data Analytics application.
     */

    public EnvironmentProperties getEnvironmentProperties() {
        return this.environmentProperties;
    }

    /**
     * <p>
     * Describes execution properties for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param environmentProperties
     *        Describes execution properties for a Java-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfiguration withEnvironmentProperties(EnvironmentProperties environmentProperties) {
        setEnvironmentProperties(environmentProperties);
        return this;
    }

    /**
     * <p>
     * The code location and type parameters for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param applicationCodeConfiguration
     *        The code location and type parameters for a Java-based Kinesis Data Analytics application.
     */

    public void setApplicationCodeConfiguration(ApplicationCodeConfiguration applicationCodeConfiguration) {
        this.applicationCodeConfiguration = applicationCodeConfiguration;
    }

    /**
     * <p>
     * The code location and type parameters for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return The code location and type parameters for a Java-based Kinesis Data Analytics application.
     */

    public ApplicationCodeConfiguration getApplicationCodeConfiguration() {
        return this.applicationCodeConfiguration;
    }

    /**
     * <p>
     * The code location and type parameters for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param applicationCodeConfiguration
     *        The code location and type parameters for a Java-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfiguration withApplicationCodeConfiguration(ApplicationCodeConfiguration applicationCodeConfiguration) {
        setApplicationCodeConfiguration(applicationCodeConfiguration);
        return this;
    }

    /**
     * <p>
     * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param applicationSnapshotConfiguration
     *        Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     */

    public void setApplicationSnapshotConfiguration(ApplicationSnapshotConfiguration applicationSnapshotConfiguration) {
        this.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
    }

    /**
     * <p>
     * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     */

    public ApplicationSnapshotConfiguration getApplicationSnapshotConfiguration() {
        return this.applicationSnapshotConfiguration;
    }

    /**
     * <p>
     * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param applicationSnapshotConfiguration
     *        Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfiguration withApplicationSnapshotConfiguration(ApplicationSnapshotConfiguration applicationSnapshotConfiguration) {
        setApplicationSnapshotConfiguration(applicationSnapshotConfiguration);
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
        if (getSqlApplicationConfiguration() != null)
            sb.append("SqlApplicationConfiguration: ").append(getSqlApplicationConfiguration()).append(",");
        if (getFlinkApplicationConfiguration() != null)
            sb.append("FlinkApplicationConfiguration: ").append(getFlinkApplicationConfiguration()).append(",");
        if (getEnvironmentProperties() != null)
            sb.append("EnvironmentProperties: ").append(getEnvironmentProperties()).append(",");
        if (getApplicationCodeConfiguration() != null)
            sb.append("ApplicationCodeConfiguration: ").append(getApplicationCodeConfiguration()).append(",");
        if (getApplicationSnapshotConfiguration() != null)
            sb.append("ApplicationSnapshotConfiguration: ").append(getApplicationSnapshotConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationConfiguration == false)
            return false;
        ApplicationConfiguration other = (ApplicationConfiguration) obj;
        if (other.getSqlApplicationConfiguration() == null ^ this.getSqlApplicationConfiguration() == null)
            return false;
        if (other.getSqlApplicationConfiguration() != null && other.getSqlApplicationConfiguration().equals(this.getSqlApplicationConfiguration()) == false)
            return false;
        if (other.getFlinkApplicationConfiguration() == null ^ this.getFlinkApplicationConfiguration() == null)
            return false;
        if (other.getFlinkApplicationConfiguration() != null
                && other.getFlinkApplicationConfiguration().equals(this.getFlinkApplicationConfiguration()) == false)
            return false;
        if (other.getEnvironmentProperties() == null ^ this.getEnvironmentProperties() == null)
            return false;
        if (other.getEnvironmentProperties() != null && other.getEnvironmentProperties().equals(this.getEnvironmentProperties()) == false)
            return false;
        if (other.getApplicationCodeConfiguration() == null ^ this.getApplicationCodeConfiguration() == null)
            return false;
        if (other.getApplicationCodeConfiguration() != null && other.getApplicationCodeConfiguration().equals(this.getApplicationCodeConfiguration()) == false)
            return false;
        if (other.getApplicationSnapshotConfiguration() == null ^ this.getApplicationSnapshotConfiguration() == null)
            return false;
        if (other.getApplicationSnapshotConfiguration() != null
                && other.getApplicationSnapshotConfiguration().equals(this.getApplicationSnapshotConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSqlApplicationConfiguration() == null) ? 0 : getSqlApplicationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFlinkApplicationConfiguration() == null) ? 0 : getFlinkApplicationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentProperties() == null) ? 0 : getEnvironmentProperties().hashCode());
        hashCode = prime * hashCode + ((getApplicationCodeConfiguration() == null) ? 0 : getApplicationCodeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getApplicationSnapshotConfiguration() == null) ? 0 : getApplicationSnapshotConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationConfiguration clone() {
        try {
            return (ApplicationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
