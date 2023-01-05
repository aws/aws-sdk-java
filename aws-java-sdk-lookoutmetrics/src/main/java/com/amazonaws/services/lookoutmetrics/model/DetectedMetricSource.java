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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An inferred data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DetectedMetricSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectedMetricSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data source's source configuration.
     * </p>
     */
    private DetectedS3SourceConfig s3SourceConfig;

    /**
     * <p>
     * The data source's source configuration.
     * </p>
     * 
     * @param s3SourceConfig
     *        The data source's source configuration.
     */

    public void setS3SourceConfig(DetectedS3SourceConfig s3SourceConfig) {
        this.s3SourceConfig = s3SourceConfig;
    }

    /**
     * <p>
     * The data source's source configuration.
     * </p>
     * 
     * @return The data source's source configuration.
     */

    public DetectedS3SourceConfig getS3SourceConfig() {
        return this.s3SourceConfig;
    }

    /**
     * <p>
     * The data source's source configuration.
     * </p>
     * 
     * @param s3SourceConfig
     *        The data source's source configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedMetricSource withS3SourceConfig(DetectedS3SourceConfig s3SourceConfig) {
        setS3SourceConfig(s3SourceConfig);
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
        if (getS3SourceConfig() != null)
            sb.append("S3SourceConfig: ").append(getS3SourceConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectedMetricSource == false)
            return false;
        DetectedMetricSource other = (DetectedMetricSource) obj;
        if (other.getS3SourceConfig() == null ^ this.getS3SourceConfig() == null)
            return false;
        if (other.getS3SourceConfig() != null && other.getS3SourceConfig().equals(this.getS3SourceConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3SourceConfig() == null) ? 0 : getS3SourceConfig().hashCode());
        return hashCode;
    }

    @Override
    public DetectedMetricSource clone() {
        try {
            return (DetectedMetricSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.DetectedMetricSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
