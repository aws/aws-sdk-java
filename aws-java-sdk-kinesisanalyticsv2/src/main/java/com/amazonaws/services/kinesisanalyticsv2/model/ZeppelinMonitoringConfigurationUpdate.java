/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Updates to the monitoring configuration for Apache Zeppelin within a Kinesis Data Analytics Studio notebook.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ZeppelinMonitoringConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZeppelinMonitoringConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Updates to the logging level for Apache Zeppelin within a Kinesis Data Analytics Studio notebook.
     * </p>
     */
    private String logLevelUpdate;

    /**
     * <p>
     * Updates to the logging level for Apache Zeppelin within a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param logLevelUpdate
     *        Updates to the logging level for Apache Zeppelin within a Kinesis Data Analytics Studio notebook.
     * @see LogLevel
     */

    public void setLogLevelUpdate(String logLevelUpdate) {
        this.logLevelUpdate = logLevelUpdate;
    }

    /**
     * <p>
     * Updates to the logging level for Apache Zeppelin within a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @return Updates to the logging level for Apache Zeppelin within a Kinesis Data Analytics Studio notebook.
     * @see LogLevel
     */

    public String getLogLevelUpdate() {
        return this.logLevelUpdate;
    }

    /**
     * <p>
     * Updates to the logging level for Apache Zeppelin within a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param logLevelUpdate
     *        Updates to the logging level for Apache Zeppelin within a Kinesis Data Analytics Studio notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public ZeppelinMonitoringConfigurationUpdate withLogLevelUpdate(String logLevelUpdate) {
        setLogLevelUpdate(logLevelUpdate);
        return this;
    }

    /**
     * <p>
     * Updates to the logging level for Apache Zeppelin within a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param logLevelUpdate
     *        Updates to the logging level for Apache Zeppelin within a Kinesis Data Analytics Studio notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public ZeppelinMonitoringConfigurationUpdate withLogLevelUpdate(LogLevel logLevelUpdate) {
        this.logLevelUpdate = logLevelUpdate.toString();
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
        if (getLogLevelUpdate() != null)
            sb.append("LogLevelUpdate: ").append(getLogLevelUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZeppelinMonitoringConfigurationUpdate == false)
            return false;
        ZeppelinMonitoringConfigurationUpdate other = (ZeppelinMonitoringConfigurationUpdate) obj;
        if (other.getLogLevelUpdate() == null ^ this.getLogLevelUpdate() == null)
            return false;
        if (other.getLogLevelUpdate() != null && other.getLogLevelUpdate().equals(this.getLogLevelUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogLevelUpdate() == null) ? 0 : getLogLevelUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ZeppelinMonitoringConfigurationUpdate clone() {
        try {
            return (ZeppelinMonitoringConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ZeppelinMonitoringConfigurationUpdateMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
