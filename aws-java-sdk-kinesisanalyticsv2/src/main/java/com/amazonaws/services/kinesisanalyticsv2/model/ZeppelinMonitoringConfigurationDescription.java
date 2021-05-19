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
 * The monitoring configuration for Apache Zeppelin within a Kinesis Data Analytics Studio notebook.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ZeppelinMonitoringConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZeppelinMonitoringConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the verbosity of the CloudWatch Logs for an application.
     * </p>
     */
    private String logLevel;

    /**
     * <p>
     * Describes the verbosity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param logLevel
     *        Describes the verbosity of the CloudWatch Logs for an application.
     * @see LogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * Describes the verbosity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @return Describes the verbosity of the CloudWatch Logs for an application.
     * @see LogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * Describes the verbosity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param logLevel
     *        Describes the verbosity of the CloudWatch Logs for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public ZeppelinMonitoringConfigurationDescription withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * Describes the verbosity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param logLevel
     *        Describes the verbosity of the CloudWatch Logs for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public ZeppelinMonitoringConfigurationDescription withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
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
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZeppelinMonitoringConfigurationDescription == false)
            return false;
        ZeppelinMonitoringConfigurationDescription other = (ZeppelinMonitoringConfigurationDescription) obj;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        return hashCode;
    }

    @Override
    public ZeppelinMonitoringConfigurationDescription clone() {
        try {
            return (ZeppelinMonitoringConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ZeppelinMonitoringConfigurationDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
