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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Retrieves the Logs status for the Amazon Security Lake account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/LogsStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogsStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The health status of services, including error codes and patterns.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * Defines path the stored logs are available which has information on your systems, applications, and services.
     * </p>
     */
    private String pathToLogs;

    /**
     * <p>
     * The health status of services, including error codes and patterns.
     * </p>
     * 
     * @param healthStatus
     *        The health status of services, including error codes and patterns.
     * @see SourceStatus
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The health status of services, including error codes and patterns.
     * </p>
     * 
     * @return The health status of services, including error codes and patterns.
     * @see SourceStatus
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * The health status of services, including error codes and patterns.
     * </p>
     * 
     * @param healthStatus
     *        The health status of services, including error codes and patterns.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceStatus
     */

    public LogsStatus withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * The health status of services, including error codes and patterns.
     * </p>
     * 
     * @param healthStatus
     *        The health status of services, including error codes and patterns.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceStatus
     */

    public LogsStatus withHealthStatus(SourceStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
        return this;
    }

    /**
     * <p>
     * Defines path the stored logs are available which has information on your systems, applications, and services.
     * </p>
     * 
     * @param pathToLogs
     *        Defines path the stored logs are available which has information on your systems, applications, and
     *        services.
     */

    public void setPathToLogs(String pathToLogs) {
        this.pathToLogs = pathToLogs;
    }

    /**
     * <p>
     * Defines path the stored logs are available which has information on your systems, applications, and services.
     * </p>
     * 
     * @return Defines path the stored logs are available which has information on your systems, applications, and
     *         services.
     */

    public String getPathToLogs() {
        return this.pathToLogs;
    }

    /**
     * <p>
     * Defines path the stored logs are available which has information on your systems, applications, and services.
     * </p>
     * 
     * @param pathToLogs
     *        Defines path the stored logs are available which has information on your systems, applications, and
     *        services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsStatus withPathToLogs(String pathToLogs) {
        setPathToLogs(pathToLogs);
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
        if (getHealthStatus() != null)
            sb.append("HealthStatus: ").append(getHealthStatus()).append(",");
        if (getPathToLogs() != null)
            sb.append("PathToLogs: ").append(getPathToLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogsStatus == false)
            return false;
        LogsStatus other = (LogsStatus) obj;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getPathToLogs() == null ^ this.getPathToLogs() == null)
            return false;
        if (other.getPathToLogs() != null && other.getPathToLogs().equals(this.getPathToLogs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getPathToLogs() == null) ? 0 : getPathToLogs().hashCode());
        return hashCode;
    }

    @Override
    public LogsStatus clone() {
        try {
            return (LogsStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.LogsStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
