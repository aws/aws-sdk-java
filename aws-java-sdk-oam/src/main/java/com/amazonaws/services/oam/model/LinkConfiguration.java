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
package com.amazonaws.services.oam.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use this structure to optionally create filters that specify that only some metric namespaces or log groups are to be
 * shared from the source account to the monitoring account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/LinkConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LinkConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use this structure to filter which log groups are to send log events from the source account to the monitoring
     * account.
     * </p>
     */
    private LogGroupConfiguration logGroupConfiguration;
    /**
     * <p>
     * Use this structure to filter which metric namespaces are to be shared from the source account to the monitoring
     * account.
     * </p>
     */
    private MetricConfiguration metricConfiguration;

    /**
     * <p>
     * Use this structure to filter which log groups are to send log events from the source account to the monitoring
     * account.
     * </p>
     * 
     * @param logGroupConfiguration
     *        Use this structure to filter which log groups are to send log events from the source account to the
     *        monitoring account.
     */

    public void setLogGroupConfiguration(LogGroupConfiguration logGroupConfiguration) {
        this.logGroupConfiguration = logGroupConfiguration;
    }

    /**
     * <p>
     * Use this structure to filter which log groups are to send log events from the source account to the monitoring
     * account.
     * </p>
     * 
     * @return Use this structure to filter which log groups are to send log events from the source account to the
     *         monitoring account.
     */

    public LogGroupConfiguration getLogGroupConfiguration() {
        return this.logGroupConfiguration;
    }

    /**
     * <p>
     * Use this structure to filter which log groups are to send log events from the source account to the monitoring
     * account.
     * </p>
     * 
     * @param logGroupConfiguration
     *        Use this structure to filter which log groups are to send log events from the source account to the
     *        monitoring account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinkConfiguration withLogGroupConfiguration(LogGroupConfiguration logGroupConfiguration) {
        setLogGroupConfiguration(logGroupConfiguration);
        return this;
    }

    /**
     * <p>
     * Use this structure to filter which metric namespaces are to be shared from the source account to the monitoring
     * account.
     * </p>
     * 
     * @param metricConfiguration
     *        Use this structure to filter which metric namespaces are to be shared from the source account to the
     *        monitoring account.
     */

    public void setMetricConfiguration(MetricConfiguration metricConfiguration) {
        this.metricConfiguration = metricConfiguration;
    }

    /**
     * <p>
     * Use this structure to filter which metric namespaces are to be shared from the source account to the monitoring
     * account.
     * </p>
     * 
     * @return Use this structure to filter which metric namespaces are to be shared from the source account to the
     *         monitoring account.
     */

    public MetricConfiguration getMetricConfiguration() {
        return this.metricConfiguration;
    }

    /**
     * <p>
     * Use this structure to filter which metric namespaces are to be shared from the source account to the monitoring
     * account.
     * </p>
     * 
     * @param metricConfiguration
     *        Use this structure to filter which metric namespaces are to be shared from the source account to the
     *        monitoring account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinkConfiguration withMetricConfiguration(MetricConfiguration metricConfiguration) {
        setMetricConfiguration(metricConfiguration);
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
        if (getLogGroupConfiguration() != null)
            sb.append("LogGroupConfiguration: ").append(getLogGroupConfiguration()).append(",");
        if (getMetricConfiguration() != null)
            sb.append("MetricConfiguration: ").append(getMetricConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LinkConfiguration == false)
            return false;
        LinkConfiguration other = (LinkConfiguration) obj;
        if (other.getLogGroupConfiguration() == null ^ this.getLogGroupConfiguration() == null)
            return false;
        if (other.getLogGroupConfiguration() != null && other.getLogGroupConfiguration().equals(this.getLogGroupConfiguration()) == false)
            return false;
        if (other.getMetricConfiguration() == null ^ this.getMetricConfiguration() == null)
            return false;
        if (other.getMetricConfiguration() != null && other.getMetricConfiguration().equals(this.getMetricConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupConfiguration() == null) ? 0 : getLogGroupConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMetricConfiguration() == null) ? 0 : getMetricConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public LinkConfiguration clone() {
        try {
            return (LinkConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.oam.model.transform.LinkConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
