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
 * Options to configure how your data quality evaluation results are published.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DQResultsPublishingOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DQResultsPublishingOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The context of the evaluation.
     * </p>
     */
    private String evaluationContext;
    /**
     * <p>
     * The Amazon S3 prefix prepended to the results.
     * </p>
     */
    private String resultsS3Prefix;
    /**
     * <p>
     * Enable metrics for your data quality results.
     * </p>
     */
    private Boolean cloudWatchMetricsEnabled;
    /**
     * <p>
     * Enable publishing for your data quality results.
     * </p>
     */
    private Boolean resultsPublishingEnabled;

    /**
     * <p>
     * The context of the evaluation.
     * </p>
     * 
     * @param evaluationContext
     *        The context of the evaluation.
     */

    public void setEvaluationContext(String evaluationContext) {
        this.evaluationContext = evaluationContext;
    }

    /**
     * <p>
     * The context of the evaluation.
     * </p>
     * 
     * @return The context of the evaluation.
     */

    public String getEvaluationContext() {
        return this.evaluationContext;
    }

    /**
     * <p>
     * The context of the evaluation.
     * </p>
     * 
     * @param evaluationContext
     *        The context of the evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DQResultsPublishingOptions withEvaluationContext(String evaluationContext) {
        setEvaluationContext(evaluationContext);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 prefix prepended to the results.
     * </p>
     * 
     * @param resultsS3Prefix
     *        The Amazon S3 prefix prepended to the results.
     */

    public void setResultsS3Prefix(String resultsS3Prefix) {
        this.resultsS3Prefix = resultsS3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 prefix prepended to the results.
     * </p>
     * 
     * @return The Amazon S3 prefix prepended to the results.
     */

    public String getResultsS3Prefix() {
        return this.resultsS3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 prefix prepended to the results.
     * </p>
     * 
     * @param resultsS3Prefix
     *        The Amazon S3 prefix prepended to the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DQResultsPublishingOptions withResultsS3Prefix(String resultsS3Prefix) {
        setResultsS3Prefix(resultsS3Prefix);
        return this;
    }

    /**
     * <p>
     * Enable metrics for your data quality results.
     * </p>
     * 
     * @param cloudWatchMetricsEnabled
     *        Enable metrics for your data quality results.
     */

    public void setCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Enable metrics for your data quality results.
     * </p>
     * 
     * @return Enable metrics for your data quality results.
     */

    public Boolean getCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Enable metrics for your data quality results.
     * </p>
     * 
     * @param cloudWatchMetricsEnabled
     *        Enable metrics for your data quality results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DQResultsPublishingOptions withCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
        setCloudWatchMetricsEnabled(cloudWatchMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * Enable metrics for your data quality results.
     * </p>
     * 
     * @return Enable metrics for your data quality results.
     */

    public Boolean isCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * Enable publishing for your data quality results.
     * </p>
     * 
     * @param resultsPublishingEnabled
     *        Enable publishing for your data quality results.
     */

    public void setResultsPublishingEnabled(Boolean resultsPublishingEnabled) {
        this.resultsPublishingEnabled = resultsPublishingEnabled;
    }

    /**
     * <p>
     * Enable publishing for your data quality results.
     * </p>
     * 
     * @return Enable publishing for your data quality results.
     */

    public Boolean getResultsPublishingEnabled() {
        return this.resultsPublishingEnabled;
    }

    /**
     * <p>
     * Enable publishing for your data quality results.
     * </p>
     * 
     * @param resultsPublishingEnabled
     *        Enable publishing for your data quality results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DQResultsPublishingOptions withResultsPublishingEnabled(Boolean resultsPublishingEnabled) {
        setResultsPublishingEnabled(resultsPublishingEnabled);
        return this;
    }

    /**
     * <p>
     * Enable publishing for your data quality results.
     * </p>
     * 
     * @return Enable publishing for your data quality results.
     */

    public Boolean isResultsPublishingEnabled() {
        return this.resultsPublishingEnabled;
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
        if (getEvaluationContext() != null)
            sb.append("EvaluationContext: ").append(getEvaluationContext()).append(",");
        if (getResultsS3Prefix() != null)
            sb.append("ResultsS3Prefix: ").append(getResultsS3Prefix()).append(",");
        if (getCloudWatchMetricsEnabled() != null)
            sb.append("CloudWatchMetricsEnabled: ").append(getCloudWatchMetricsEnabled()).append(",");
        if (getResultsPublishingEnabled() != null)
            sb.append("ResultsPublishingEnabled: ").append(getResultsPublishingEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DQResultsPublishingOptions == false)
            return false;
        DQResultsPublishingOptions other = (DQResultsPublishingOptions) obj;
        if (other.getEvaluationContext() == null ^ this.getEvaluationContext() == null)
            return false;
        if (other.getEvaluationContext() != null && other.getEvaluationContext().equals(this.getEvaluationContext()) == false)
            return false;
        if (other.getResultsS3Prefix() == null ^ this.getResultsS3Prefix() == null)
            return false;
        if (other.getResultsS3Prefix() != null && other.getResultsS3Prefix().equals(this.getResultsS3Prefix()) == false)
            return false;
        if (other.getCloudWatchMetricsEnabled() == null ^ this.getCloudWatchMetricsEnabled() == null)
            return false;
        if (other.getCloudWatchMetricsEnabled() != null && other.getCloudWatchMetricsEnabled().equals(this.getCloudWatchMetricsEnabled()) == false)
            return false;
        if (other.getResultsPublishingEnabled() == null ^ this.getResultsPublishingEnabled() == null)
            return false;
        if (other.getResultsPublishingEnabled() != null && other.getResultsPublishingEnabled().equals(this.getResultsPublishingEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationContext() == null) ? 0 : getEvaluationContext().hashCode());
        hashCode = prime * hashCode + ((getResultsS3Prefix() == null) ? 0 : getResultsS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchMetricsEnabled() == null) ? 0 : getCloudWatchMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getResultsPublishingEnabled() == null) ? 0 : getResultsPublishingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public DQResultsPublishingOptions clone() {
        try {
            return (DQResultsPublishingOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DQResultsPublishingOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
