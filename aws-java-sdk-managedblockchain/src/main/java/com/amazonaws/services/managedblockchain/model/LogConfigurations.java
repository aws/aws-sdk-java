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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of log configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/LogConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogConfigurations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameters for publishing logs to Amazon CloudWatch Logs.
     * </p>
     */
    private LogConfiguration cloudwatch;

    /**
     * <p>
     * Parameters for publishing logs to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param cloudwatch
     *        Parameters for publishing logs to Amazon CloudWatch Logs.
     */

    public void setCloudwatch(LogConfiguration cloudwatch) {
        this.cloudwatch = cloudwatch;
    }

    /**
     * <p>
     * Parameters for publishing logs to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return Parameters for publishing logs to Amazon CloudWatch Logs.
     */

    public LogConfiguration getCloudwatch() {
        return this.cloudwatch;
    }

    /**
     * <p>
     * Parameters for publishing logs to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param cloudwatch
     *        Parameters for publishing logs to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfigurations withCloudwatch(LogConfiguration cloudwatch) {
        setCloudwatch(cloudwatch);
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
        if (getCloudwatch() != null)
            sb.append("Cloudwatch: ").append(getCloudwatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogConfigurations == false)
            return false;
        LogConfigurations other = (LogConfigurations) obj;
        if (other.getCloudwatch() == null ^ this.getCloudwatch() == null)
            return false;
        if (other.getCloudwatch() != null && other.getCloudwatch().equals(this.getCloudwatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudwatch() == null) ? 0 : getCloudwatch().hashCode());
        return hashCode;
    }

    @Override
    public LogConfigurations clone() {
        try {
            return (LogConfigurations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.LogConfigurationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
