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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional run options you can specify for an evaluation run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataQualityEvaluationRunAdditionalRunOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityEvaluationRunAdditionalRunOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether or not to enable CloudWatch metrics.
     * </p>
     */
    private Boolean cloudWatchMetricsEnabled;
    /**
     * <p>
     * Prefix for Amazon S3 to store results.
     * </p>
     */
    private String resultsS3Prefix;

    /**
     * <p>
     * Whether or not to enable CloudWatch metrics.
     * </p>
     * 
     * @param cloudWatchMetricsEnabled
     *        Whether or not to enable CloudWatch metrics.
     */

    public void setCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Whether or not to enable CloudWatch metrics.
     * </p>
     * 
     * @return Whether or not to enable CloudWatch metrics.
     */

    public Boolean getCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Whether or not to enable CloudWatch metrics.
     * </p>
     * 
     * @param cloudWatchMetricsEnabled
     *        Whether or not to enable CloudWatch metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityEvaluationRunAdditionalRunOptions withCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
        setCloudWatchMetricsEnabled(cloudWatchMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * Whether or not to enable CloudWatch metrics.
     * </p>
     * 
     * @return Whether or not to enable CloudWatch metrics.
     */

    public Boolean isCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Prefix for Amazon S3 to store results.
     * </p>
     * 
     * @param resultsS3Prefix
     *        Prefix for Amazon S3 to store results.
     */

    public void setResultsS3Prefix(String resultsS3Prefix) {
        this.resultsS3Prefix = resultsS3Prefix;
    }

    /**
     * <p>
     * Prefix for Amazon S3 to store results.
     * </p>
     * 
     * @return Prefix for Amazon S3 to store results.
     */

    public String getResultsS3Prefix() {
        return this.resultsS3Prefix;
    }

    /**
     * <p>
     * Prefix for Amazon S3 to store results.
     * </p>
     * 
     * @param resultsS3Prefix
     *        Prefix for Amazon S3 to store results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityEvaluationRunAdditionalRunOptions withResultsS3Prefix(String resultsS3Prefix) {
        setResultsS3Prefix(resultsS3Prefix);
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
        if (getCloudWatchMetricsEnabled() != null)
            sb.append("CloudWatchMetricsEnabled: ").append(getCloudWatchMetricsEnabled()).append(",");
        if (getResultsS3Prefix() != null)
            sb.append("ResultsS3Prefix: ").append(getResultsS3Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityEvaluationRunAdditionalRunOptions == false)
            return false;
        DataQualityEvaluationRunAdditionalRunOptions other = (DataQualityEvaluationRunAdditionalRunOptions) obj;
        if (other.getCloudWatchMetricsEnabled() == null ^ this.getCloudWatchMetricsEnabled() == null)
            return false;
        if (other.getCloudWatchMetricsEnabled() != null && other.getCloudWatchMetricsEnabled().equals(this.getCloudWatchMetricsEnabled()) == false)
            return false;
        if (other.getResultsS3Prefix() == null ^ this.getResultsS3Prefix() == null)
            return false;
        if (other.getResultsS3Prefix() != null && other.getResultsS3Prefix().equals(this.getResultsS3Prefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchMetricsEnabled() == null) ? 0 : getCloudWatchMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getResultsS3Prefix() == null) ? 0 : getResultsS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityEvaluationRunAdditionalRunOptions clone() {
        try {
            return (DataQualityEvaluationRunAdditionalRunOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataQualityEvaluationRunAdditionalRunOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
