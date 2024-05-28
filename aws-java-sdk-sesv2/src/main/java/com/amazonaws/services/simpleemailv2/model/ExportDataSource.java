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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains details about the data source of the export job. It can only contain one of
 * <code>MetricsDataSource</code> or <code>MessageInsightsDataSource</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ExportDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportDataSource implements Serializable, Cloneable, StructuredPojo {

    private MetricsDataSource metricsDataSource;

    private MessageInsightsDataSource messageInsightsDataSource;

    /**
     * @param metricsDataSource
     */

    public void setMetricsDataSource(MetricsDataSource metricsDataSource) {
        this.metricsDataSource = metricsDataSource;
    }

    /**
     * @return
     */

    public MetricsDataSource getMetricsDataSource() {
        return this.metricsDataSource;
    }

    /**
     * @param metricsDataSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDataSource withMetricsDataSource(MetricsDataSource metricsDataSource) {
        setMetricsDataSource(metricsDataSource);
        return this;
    }

    /**
     * @param messageInsightsDataSource
     */

    public void setMessageInsightsDataSource(MessageInsightsDataSource messageInsightsDataSource) {
        this.messageInsightsDataSource = messageInsightsDataSource;
    }

    /**
     * @return
     */

    public MessageInsightsDataSource getMessageInsightsDataSource() {
        return this.messageInsightsDataSource;
    }

    /**
     * @param messageInsightsDataSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDataSource withMessageInsightsDataSource(MessageInsightsDataSource messageInsightsDataSource) {
        setMessageInsightsDataSource(messageInsightsDataSource);
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
        if (getMetricsDataSource() != null)
            sb.append("MetricsDataSource: ").append(getMetricsDataSource()).append(",");
        if (getMessageInsightsDataSource() != null)
            sb.append("MessageInsightsDataSource: ").append(getMessageInsightsDataSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportDataSource == false)
            return false;
        ExportDataSource other = (ExportDataSource) obj;
        if (other.getMetricsDataSource() == null ^ this.getMetricsDataSource() == null)
            return false;
        if (other.getMetricsDataSource() != null && other.getMetricsDataSource().equals(this.getMetricsDataSource()) == false)
            return false;
        if (other.getMessageInsightsDataSource() == null ^ this.getMessageInsightsDataSource() == null)
            return false;
        if (other.getMessageInsightsDataSource() != null && other.getMessageInsightsDataSource().equals(this.getMessageInsightsDataSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricsDataSource() == null) ? 0 : getMetricsDataSource().hashCode());
        hashCode = prime * hashCode + ((getMessageInsightsDataSource() == null) ? 0 : getMessageInsightsDataSource().hashCode());
        return hashCode;
    }

    @Override
    public ExportDataSource clone() {
        try {
            return (ExportDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.ExportDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
