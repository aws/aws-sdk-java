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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container for the values required to configure logging for the pipeline. If you don't specify these values,
 * OpenSearch Ingestion will not publish logs from your application to CloudWatch Logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/LogPublishingOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogPublishingOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether logs should be published.
     * </p>
     */
    private Boolean isLoggingEnabled;
    /**
     * <p>
     * The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch Logs. This parameter is required if
     * <code>IsLoggingEnabled</code> is set to <code>true</code>.
     * </p>
     */
    private CloudWatchLogDestination cloudWatchLogDestination;

    /**
     * <p>
     * Whether logs should be published.
     * </p>
     * 
     * @param isLoggingEnabled
     *        Whether logs should be published.
     */

    public void setIsLoggingEnabled(Boolean isLoggingEnabled) {
        this.isLoggingEnabled = isLoggingEnabled;
    }

    /**
     * <p>
     * Whether logs should be published.
     * </p>
     * 
     * @return Whether logs should be published.
     */

    public Boolean getIsLoggingEnabled() {
        return this.isLoggingEnabled;
    }

    /**
     * <p>
     * Whether logs should be published.
     * </p>
     * 
     * @param isLoggingEnabled
     *        Whether logs should be published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogPublishingOptions withIsLoggingEnabled(Boolean isLoggingEnabled) {
        setIsLoggingEnabled(isLoggingEnabled);
        return this;
    }

    /**
     * <p>
     * Whether logs should be published.
     * </p>
     * 
     * @return Whether logs should be published.
     */

    public Boolean isLoggingEnabled() {
        return this.isLoggingEnabled;
    }

    /**
     * <p>
     * The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch Logs. This parameter is required if
     * <code>IsLoggingEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param cloudWatchLogDestination
     *        The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch Logs. This parameter is required
     *        if <code>IsLoggingEnabled</code> is set to <code>true</code>.
     */

    public void setCloudWatchLogDestination(CloudWatchLogDestination cloudWatchLogDestination) {
        this.cloudWatchLogDestination = cloudWatchLogDestination;
    }

    /**
     * <p>
     * The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch Logs. This parameter is required if
     * <code>IsLoggingEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @return The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch Logs. This parameter is required
     *         if <code>IsLoggingEnabled</code> is set to <code>true</code>.
     */

    public CloudWatchLogDestination getCloudWatchLogDestination() {
        return this.cloudWatchLogDestination;
    }

    /**
     * <p>
     * The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch Logs. This parameter is required if
     * <code>IsLoggingEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param cloudWatchLogDestination
     *        The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch Logs. This parameter is required
     *        if <code>IsLoggingEnabled</code> is set to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogPublishingOptions withCloudWatchLogDestination(CloudWatchLogDestination cloudWatchLogDestination) {
        setCloudWatchLogDestination(cloudWatchLogDestination);
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
        if (getIsLoggingEnabled() != null)
            sb.append("IsLoggingEnabled: ").append(getIsLoggingEnabled()).append(",");
        if (getCloudWatchLogDestination() != null)
            sb.append("CloudWatchLogDestination: ").append(getCloudWatchLogDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogPublishingOptions == false)
            return false;
        LogPublishingOptions other = (LogPublishingOptions) obj;
        if (other.getIsLoggingEnabled() == null ^ this.getIsLoggingEnabled() == null)
            return false;
        if (other.getIsLoggingEnabled() != null && other.getIsLoggingEnabled().equals(this.getIsLoggingEnabled()) == false)
            return false;
        if (other.getCloudWatchLogDestination() == null ^ this.getCloudWatchLogDestination() == null)
            return false;
        if (other.getCloudWatchLogDestination() != null && other.getCloudWatchLogDestination().equals(this.getCloudWatchLogDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsLoggingEnabled() == null) ? 0 : getIsLoggingEnabled().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogDestination() == null) ? 0 : getCloudWatchLogDestination().hashCode());
        return hashCode;
    }

    @Override
    public LogPublishingOptions clone() {
        try {
            return (LogPublishingOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.osis.model.transform.LogPublishingOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
