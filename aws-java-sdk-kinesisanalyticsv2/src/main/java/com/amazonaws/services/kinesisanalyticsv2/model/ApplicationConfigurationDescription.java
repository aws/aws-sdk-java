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
 * Describes details about the application code and starting parameters for an Amazon Kinesis Data Analytics
 * application.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details about inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics
     * application.
     * </p>
     */
    private SqlApplicationConfigurationDescription sqlApplicationConfigurationDescription;
    /**
     * <p>
     * The details about the application code for a Java-based Kinesis Data Analytics application.
     * </p>
     */
    private ApplicationCodeConfigurationDescription applicationCodeConfigurationDescription;
    /**
     * <p>
     * The details about the starting properties for a Kinesis Data Analytics application.
     * </p>
     */
    private RunConfigurationDescription runConfigurationDescription;
    /**
     * <p>
     * The details about a Java-based Kinesis Data Analytics application.
     * </p>
     */
    private FlinkApplicationConfigurationDescription flinkApplicationConfigurationDescription;
    /**
     * <p>
     * Describes execution properties for a Java-based Kinesis Data Analytics application.
     * </p>
     */
    private EnvironmentPropertyDescriptions environmentPropertyDescriptions;
    /**
     * <p>
     * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     */
    private ApplicationSnapshotConfigurationDescription applicationSnapshotConfigurationDescription;

    /**
     * <p>
     * The details about inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics
     * application.
     * </p>
     * 
     * @param sqlApplicationConfigurationDescription
     *        The details about inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics
     *        application.
     */

    public void setSqlApplicationConfigurationDescription(SqlApplicationConfigurationDescription sqlApplicationConfigurationDescription) {
        this.sqlApplicationConfigurationDescription = sqlApplicationConfigurationDescription;
    }

    /**
     * <p>
     * The details about inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics
     * application.
     * </p>
     * 
     * @return The details about inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics
     *         application.
     */

    public SqlApplicationConfigurationDescription getSqlApplicationConfigurationDescription() {
        return this.sqlApplicationConfigurationDescription;
    }

    /**
     * <p>
     * The details about inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics
     * application.
     * </p>
     * 
     * @param sqlApplicationConfigurationDescription
     *        The details about inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfigurationDescription withSqlApplicationConfigurationDescription(
            SqlApplicationConfigurationDescription sqlApplicationConfigurationDescription) {
        setSqlApplicationConfigurationDescription(sqlApplicationConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * The details about the application code for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param applicationCodeConfigurationDescription
     *        The details about the application code for a Java-based Kinesis Data Analytics application.
     */

    public void setApplicationCodeConfigurationDescription(ApplicationCodeConfigurationDescription applicationCodeConfigurationDescription) {
        this.applicationCodeConfigurationDescription = applicationCodeConfigurationDescription;
    }

    /**
     * <p>
     * The details about the application code for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return The details about the application code for a Java-based Kinesis Data Analytics application.
     */

    public ApplicationCodeConfigurationDescription getApplicationCodeConfigurationDescription() {
        return this.applicationCodeConfigurationDescription;
    }

    /**
     * <p>
     * The details about the application code for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param applicationCodeConfigurationDescription
     *        The details about the application code for a Java-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfigurationDescription withApplicationCodeConfigurationDescription(
            ApplicationCodeConfigurationDescription applicationCodeConfigurationDescription) {
        setApplicationCodeConfigurationDescription(applicationCodeConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * The details about the starting properties for a Kinesis Data Analytics application.
     * </p>
     * 
     * @param runConfigurationDescription
     *        The details about the starting properties for a Kinesis Data Analytics application.
     */

    public void setRunConfigurationDescription(RunConfigurationDescription runConfigurationDescription) {
        this.runConfigurationDescription = runConfigurationDescription;
    }

    /**
     * <p>
     * The details about the starting properties for a Kinesis Data Analytics application.
     * </p>
     * 
     * @return The details about the starting properties for a Kinesis Data Analytics application.
     */

    public RunConfigurationDescription getRunConfigurationDescription() {
        return this.runConfigurationDescription;
    }

    /**
     * <p>
     * The details about the starting properties for a Kinesis Data Analytics application.
     * </p>
     * 
     * @param runConfigurationDescription
     *        The details about the starting properties for a Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfigurationDescription withRunConfigurationDescription(RunConfigurationDescription runConfigurationDescription) {
        setRunConfigurationDescription(runConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * The details about a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param flinkApplicationConfigurationDescription
     *        The details about a Java-based Kinesis Data Analytics application.
     */

    public void setFlinkApplicationConfigurationDescription(FlinkApplicationConfigurationDescription flinkApplicationConfigurationDescription) {
        this.flinkApplicationConfigurationDescription = flinkApplicationConfigurationDescription;
    }

    /**
     * <p>
     * The details about a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return The details about a Java-based Kinesis Data Analytics application.
     */

    public FlinkApplicationConfigurationDescription getFlinkApplicationConfigurationDescription() {
        return this.flinkApplicationConfigurationDescription;
    }

    /**
     * <p>
     * The details about a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param flinkApplicationConfigurationDescription
     *        The details about a Java-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfigurationDescription withFlinkApplicationConfigurationDescription(
            FlinkApplicationConfigurationDescription flinkApplicationConfigurationDescription) {
        setFlinkApplicationConfigurationDescription(flinkApplicationConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * Describes execution properties for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param environmentPropertyDescriptions
     *        Describes execution properties for a Java-based Kinesis Data Analytics application.
     */

    public void setEnvironmentPropertyDescriptions(EnvironmentPropertyDescriptions environmentPropertyDescriptions) {
        this.environmentPropertyDescriptions = environmentPropertyDescriptions;
    }

    /**
     * <p>
     * Describes execution properties for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return Describes execution properties for a Java-based Kinesis Data Analytics application.
     */

    public EnvironmentPropertyDescriptions getEnvironmentPropertyDescriptions() {
        return this.environmentPropertyDescriptions;
    }

    /**
     * <p>
     * Describes execution properties for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param environmentPropertyDescriptions
     *        Describes execution properties for a Java-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfigurationDescription withEnvironmentPropertyDescriptions(EnvironmentPropertyDescriptions environmentPropertyDescriptions) {
        setEnvironmentPropertyDescriptions(environmentPropertyDescriptions);
        return this;
    }

    /**
     * <p>
     * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param applicationSnapshotConfigurationDescription
     *        Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     */

    public void setApplicationSnapshotConfigurationDescription(ApplicationSnapshotConfigurationDescription applicationSnapshotConfigurationDescription) {
        this.applicationSnapshotConfigurationDescription = applicationSnapshotConfigurationDescription;
    }

    /**
     * <p>
     * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     */

    public ApplicationSnapshotConfigurationDescription getApplicationSnapshotConfigurationDescription() {
        return this.applicationSnapshotConfigurationDescription;
    }

    /**
     * <p>
     * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param applicationSnapshotConfigurationDescription
     *        Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfigurationDescription withApplicationSnapshotConfigurationDescription(
            ApplicationSnapshotConfigurationDescription applicationSnapshotConfigurationDescription) {
        setApplicationSnapshotConfigurationDescription(applicationSnapshotConfigurationDescription);
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
        if (getSqlApplicationConfigurationDescription() != null)
            sb.append("SqlApplicationConfigurationDescription: ").append(getSqlApplicationConfigurationDescription()).append(",");
        if (getApplicationCodeConfigurationDescription() != null)
            sb.append("ApplicationCodeConfigurationDescription: ").append(getApplicationCodeConfigurationDescription()).append(",");
        if (getRunConfigurationDescription() != null)
            sb.append("RunConfigurationDescription: ").append(getRunConfigurationDescription()).append(",");
        if (getFlinkApplicationConfigurationDescription() != null)
            sb.append("FlinkApplicationConfigurationDescription: ").append(getFlinkApplicationConfigurationDescription()).append(",");
        if (getEnvironmentPropertyDescriptions() != null)
            sb.append("EnvironmentPropertyDescriptions: ").append(getEnvironmentPropertyDescriptions()).append(",");
        if (getApplicationSnapshotConfigurationDescription() != null)
            sb.append("ApplicationSnapshotConfigurationDescription: ").append(getApplicationSnapshotConfigurationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationConfigurationDescription == false)
            return false;
        ApplicationConfigurationDescription other = (ApplicationConfigurationDescription) obj;
        if (other.getSqlApplicationConfigurationDescription() == null ^ this.getSqlApplicationConfigurationDescription() == null)
            return false;
        if (other.getSqlApplicationConfigurationDescription() != null
                && other.getSqlApplicationConfigurationDescription().equals(this.getSqlApplicationConfigurationDescription()) == false)
            return false;
        if (other.getApplicationCodeConfigurationDescription() == null ^ this.getApplicationCodeConfigurationDescription() == null)
            return false;
        if (other.getApplicationCodeConfigurationDescription() != null
                && other.getApplicationCodeConfigurationDescription().equals(this.getApplicationCodeConfigurationDescription()) == false)
            return false;
        if (other.getRunConfigurationDescription() == null ^ this.getRunConfigurationDescription() == null)
            return false;
        if (other.getRunConfigurationDescription() != null && other.getRunConfigurationDescription().equals(this.getRunConfigurationDescription()) == false)
            return false;
        if (other.getFlinkApplicationConfigurationDescription() == null ^ this.getFlinkApplicationConfigurationDescription() == null)
            return false;
        if (other.getFlinkApplicationConfigurationDescription() != null
                && other.getFlinkApplicationConfigurationDescription().equals(this.getFlinkApplicationConfigurationDescription()) == false)
            return false;
        if (other.getEnvironmentPropertyDescriptions() == null ^ this.getEnvironmentPropertyDescriptions() == null)
            return false;
        if (other.getEnvironmentPropertyDescriptions() != null
                && other.getEnvironmentPropertyDescriptions().equals(this.getEnvironmentPropertyDescriptions()) == false)
            return false;
        if (other.getApplicationSnapshotConfigurationDescription() == null ^ this.getApplicationSnapshotConfigurationDescription() == null)
            return false;
        if (other.getApplicationSnapshotConfigurationDescription() != null
                && other.getApplicationSnapshotConfigurationDescription().equals(this.getApplicationSnapshotConfigurationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSqlApplicationConfigurationDescription() == null) ? 0 : getSqlApplicationConfigurationDescription().hashCode());
        hashCode = prime * hashCode + ((getApplicationCodeConfigurationDescription() == null) ? 0 : getApplicationCodeConfigurationDescription().hashCode());
        hashCode = prime * hashCode + ((getRunConfigurationDescription() == null) ? 0 : getRunConfigurationDescription().hashCode());
        hashCode = prime * hashCode + ((getFlinkApplicationConfigurationDescription() == null) ? 0 : getFlinkApplicationConfigurationDescription().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentPropertyDescriptions() == null) ? 0 : getEnvironmentPropertyDescriptions().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationSnapshotConfigurationDescription() == null) ? 0 : getApplicationSnapshotConfigurationDescription().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationConfigurationDescription clone() {
        try {
            return (ApplicationConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationConfigurationDescriptionMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
