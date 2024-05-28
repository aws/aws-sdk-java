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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The monitoring configuration object you can configure to send metrics to Amazon Managed Service for Prometheus for a
 * job run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/PrometheusMonitoringConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrometheusMonitoringConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The remote write URL in the Amazon Managed Service for Prometheus workspace to send metrics to.
     * </p>
     */
    private String remoteWriteUrl;

    /**
     * <p>
     * The remote write URL in the Amazon Managed Service for Prometheus workspace to send metrics to.
     * </p>
     * 
     * @param remoteWriteUrl
     *        The remote write URL in the Amazon Managed Service for Prometheus workspace to send metrics to.
     */

    public void setRemoteWriteUrl(String remoteWriteUrl) {
        this.remoteWriteUrl = remoteWriteUrl;
    }

    /**
     * <p>
     * The remote write URL in the Amazon Managed Service for Prometheus workspace to send metrics to.
     * </p>
     * 
     * @return The remote write URL in the Amazon Managed Service for Prometheus workspace to send metrics to.
     */

    public String getRemoteWriteUrl() {
        return this.remoteWriteUrl;
    }

    /**
     * <p>
     * The remote write URL in the Amazon Managed Service for Prometheus workspace to send metrics to.
     * </p>
     * 
     * @param remoteWriteUrl
     *        The remote write URL in the Amazon Managed Service for Prometheus workspace to send metrics to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrometheusMonitoringConfiguration withRemoteWriteUrl(String remoteWriteUrl) {
        setRemoteWriteUrl(remoteWriteUrl);
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
        if (getRemoteWriteUrl() != null)
            sb.append("RemoteWriteUrl: ").append(getRemoteWriteUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrometheusMonitoringConfiguration == false)
            return false;
        PrometheusMonitoringConfiguration other = (PrometheusMonitoringConfiguration) obj;
        if (other.getRemoteWriteUrl() == null ^ this.getRemoteWriteUrl() == null)
            return false;
        if (other.getRemoteWriteUrl() != null && other.getRemoteWriteUrl().equals(this.getRemoteWriteUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRemoteWriteUrl() == null) ? 0 : getRemoteWriteUrl().hashCode());
        return hashCode;
    }

    @Override
    public PrometheusMonitoringConfiguration clone() {
        try {
            return (PrometheusMonitoringConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.PrometheusMonitoringConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
