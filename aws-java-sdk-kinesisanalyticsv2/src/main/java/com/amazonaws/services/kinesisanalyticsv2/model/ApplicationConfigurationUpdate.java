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
 * Describes updates to an application's configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes updates to an SQL-based Kinesis Data Analytics application's configuration.
     * </p>
     */
    private SqlApplicationConfigurationUpdate sqlApplicationConfigurationUpdate;
    /**
     * <p>
     * Describes updates to a Java-based Kinesis Data Analytics application's code configuration.
     * </p>
     */
    private ApplicationCodeConfigurationUpdate applicationCodeConfigurationUpdate;
    /**
     * <p>
     * Describes updates to a Java-based Kinesis Data Analytics application's configuration.
     * </p>
     */
    private FlinkApplicationConfigurationUpdate flinkApplicationConfigurationUpdate;
    /**
     * <p>
     * Describes updates to the environment properties for a Java-based Kinesis Data Analytics application.
     * </p>
     */
    private EnvironmentPropertyUpdates environmentPropertyUpdates;
    /**
     * <p>
     * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     */
    private ApplicationSnapshotConfigurationUpdate applicationSnapshotConfigurationUpdate;

    /**
     * <p>
     * Describes updates to an SQL-based Kinesis Data Analytics application's configuration.
     * </p>
     * 
     * @param sqlApplicationConfigurationUpdate
     *        Describes updates to an SQL-based Kinesis Data Analytics application's configuration.
     */

    public void setSqlApplicationConfigurationUpdate(SqlApplicationConfigurationUpdate sqlApplicationConfigurationUpdate) {
        this.sqlApplicationConfigurationUpdate = sqlApplicationConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to an SQL-based Kinesis Data Analytics application's configuration.
     * </p>
     * 
     * @return Describes updates to an SQL-based Kinesis Data Analytics application's configuration.
     */

    public SqlApplicationConfigurationUpdate getSqlApplicationConfigurationUpdate() {
        return this.sqlApplicationConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to an SQL-based Kinesis Data Analytics application's configuration.
     * </p>
     * 
     * @param sqlApplicationConfigurationUpdate
     *        Describes updates to an SQL-based Kinesis Data Analytics application's configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfigurationUpdate withSqlApplicationConfigurationUpdate(SqlApplicationConfigurationUpdate sqlApplicationConfigurationUpdate) {
        setSqlApplicationConfigurationUpdate(sqlApplicationConfigurationUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to a Java-based Kinesis Data Analytics application's code configuration.
     * </p>
     * 
     * @param applicationCodeConfigurationUpdate
     *        Describes updates to a Java-based Kinesis Data Analytics application's code configuration.
     */

    public void setApplicationCodeConfigurationUpdate(ApplicationCodeConfigurationUpdate applicationCodeConfigurationUpdate) {
        this.applicationCodeConfigurationUpdate = applicationCodeConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to a Java-based Kinesis Data Analytics application's code configuration.
     * </p>
     * 
     * @return Describes updates to a Java-based Kinesis Data Analytics application's code configuration.
     */

    public ApplicationCodeConfigurationUpdate getApplicationCodeConfigurationUpdate() {
        return this.applicationCodeConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to a Java-based Kinesis Data Analytics application's code configuration.
     * </p>
     * 
     * @param applicationCodeConfigurationUpdate
     *        Describes updates to a Java-based Kinesis Data Analytics application's code configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfigurationUpdate withApplicationCodeConfigurationUpdate(ApplicationCodeConfigurationUpdate applicationCodeConfigurationUpdate) {
        setApplicationCodeConfigurationUpdate(applicationCodeConfigurationUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to a Java-based Kinesis Data Analytics application's configuration.
     * </p>
     * 
     * @param flinkApplicationConfigurationUpdate
     *        Describes updates to a Java-based Kinesis Data Analytics application's configuration.
     */

    public void setFlinkApplicationConfigurationUpdate(FlinkApplicationConfigurationUpdate flinkApplicationConfigurationUpdate) {
        this.flinkApplicationConfigurationUpdate = flinkApplicationConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to a Java-based Kinesis Data Analytics application's configuration.
     * </p>
     * 
     * @return Describes updates to a Java-based Kinesis Data Analytics application's configuration.
     */

    public FlinkApplicationConfigurationUpdate getFlinkApplicationConfigurationUpdate() {
        return this.flinkApplicationConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to a Java-based Kinesis Data Analytics application's configuration.
     * </p>
     * 
     * @param flinkApplicationConfigurationUpdate
     *        Describes updates to a Java-based Kinesis Data Analytics application's configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfigurationUpdate withFlinkApplicationConfigurationUpdate(FlinkApplicationConfigurationUpdate flinkApplicationConfigurationUpdate) {
        setFlinkApplicationConfigurationUpdate(flinkApplicationConfigurationUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to the environment properties for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param environmentPropertyUpdates
     *        Describes updates to the environment properties for a Java-based Kinesis Data Analytics application.
     */

    public void setEnvironmentPropertyUpdates(EnvironmentPropertyUpdates environmentPropertyUpdates) {
        this.environmentPropertyUpdates = environmentPropertyUpdates;
    }

    /**
     * <p>
     * Describes updates to the environment properties for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return Describes updates to the environment properties for a Java-based Kinesis Data Analytics application.
     */

    public EnvironmentPropertyUpdates getEnvironmentPropertyUpdates() {
        return this.environmentPropertyUpdates;
    }

    /**
     * <p>
     * Describes updates to the environment properties for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param environmentPropertyUpdates
     *        Describes updates to the environment properties for a Java-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfigurationUpdate withEnvironmentPropertyUpdates(EnvironmentPropertyUpdates environmentPropertyUpdates) {
        setEnvironmentPropertyUpdates(environmentPropertyUpdates);
        return this;
    }

    /**
     * <p>
     * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param applicationSnapshotConfigurationUpdate
     *        Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     */

    public void setApplicationSnapshotConfigurationUpdate(ApplicationSnapshotConfigurationUpdate applicationSnapshotConfigurationUpdate) {
        this.applicationSnapshotConfigurationUpdate = applicationSnapshotConfigurationUpdate;
    }

    /**
     * <p>
     * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     */

    public ApplicationSnapshotConfigurationUpdate getApplicationSnapshotConfigurationUpdate() {
        return this.applicationSnapshotConfigurationUpdate;
    }

    /**
     * <p>
     * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param applicationSnapshotConfigurationUpdate
     *        Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationConfigurationUpdate withApplicationSnapshotConfigurationUpdate(
            ApplicationSnapshotConfigurationUpdate applicationSnapshotConfigurationUpdate) {
        setApplicationSnapshotConfigurationUpdate(applicationSnapshotConfigurationUpdate);
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
        if (getSqlApplicationConfigurationUpdate() != null)
            sb.append("SqlApplicationConfigurationUpdate: ").append(getSqlApplicationConfigurationUpdate()).append(",");
        if (getApplicationCodeConfigurationUpdate() != null)
            sb.append("ApplicationCodeConfigurationUpdate: ").append(getApplicationCodeConfigurationUpdate()).append(",");
        if (getFlinkApplicationConfigurationUpdate() != null)
            sb.append("FlinkApplicationConfigurationUpdate: ").append(getFlinkApplicationConfigurationUpdate()).append(",");
        if (getEnvironmentPropertyUpdates() != null)
            sb.append("EnvironmentPropertyUpdates: ").append(getEnvironmentPropertyUpdates()).append(",");
        if (getApplicationSnapshotConfigurationUpdate() != null)
            sb.append("ApplicationSnapshotConfigurationUpdate: ").append(getApplicationSnapshotConfigurationUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationConfigurationUpdate == false)
            return false;
        ApplicationConfigurationUpdate other = (ApplicationConfigurationUpdate) obj;
        if (other.getSqlApplicationConfigurationUpdate() == null ^ this.getSqlApplicationConfigurationUpdate() == null)
            return false;
        if (other.getSqlApplicationConfigurationUpdate() != null
                && other.getSqlApplicationConfigurationUpdate().equals(this.getSqlApplicationConfigurationUpdate()) == false)
            return false;
        if (other.getApplicationCodeConfigurationUpdate() == null ^ this.getApplicationCodeConfigurationUpdate() == null)
            return false;
        if (other.getApplicationCodeConfigurationUpdate() != null
                && other.getApplicationCodeConfigurationUpdate().equals(this.getApplicationCodeConfigurationUpdate()) == false)
            return false;
        if (other.getFlinkApplicationConfigurationUpdate() == null ^ this.getFlinkApplicationConfigurationUpdate() == null)
            return false;
        if (other.getFlinkApplicationConfigurationUpdate() != null
                && other.getFlinkApplicationConfigurationUpdate().equals(this.getFlinkApplicationConfigurationUpdate()) == false)
            return false;
        if (other.getEnvironmentPropertyUpdates() == null ^ this.getEnvironmentPropertyUpdates() == null)
            return false;
        if (other.getEnvironmentPropertyUpdates() != null && other.getEnvironmentPropertyUpdates().equals(this.getEnvironmentPropertyUpdates()) == false)
            return false;
        if (other.getApplicationSnapshotConfigurationUpdate() == null ^ this.getApplicationSnapshotConfigurationUpdate() == null)
            return false;
        if (other.getApplicationSnapshotConfigurationUpdate() != null
                && other.getApplicationSnapshotConfigurationUpdate().equals(this.getApplicationSnapshotConfigurationUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSqlApplicationConfigurationUpdate() == null) ? 0 : getSqlApplicationConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getApplicationCodeConfigurationUpdate() == null) ? 0 : getApplicationCodeConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getFlinkApplicationConfigurationUpdate() == null) ? 0 : getFlinkApplicationConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentPropertyUpdates() == null) ? 0 : getEnvironmentPropertyUpdates().hashCode());
        hashCode = prime * hashCode + ((getApplicationSnapshotConfigurationUpdate() == null) ? 0 : getApplicationSnapshotConfigurationUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationConfigurationUpdate clone() {
        try {
            return (ApplicationConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationConfigurationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
