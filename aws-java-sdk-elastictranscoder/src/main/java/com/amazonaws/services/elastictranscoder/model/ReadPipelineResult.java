/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The <code>ReadPipelineResponse</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReadPipelineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A section of the response body that provides information about the pipeline.
     * </p>
     */
    private Pipeline pipeline;
    /**
     * <p>
     * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the
     * pipeline.
     * </p>
     * <p>
     * Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS
     * key, reduces processing time and prevents cross-regional charges.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Warning> warnings;

    /**
     * <p>
     * A section of the response body that provides information about the pipeline.
     * </p>
     * 
     * @param pipeline
     *        A section of the response body that provides information about the pipeline.
     */

    public void setPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    /**
     * <p>
     * A section of the response body that provides information about the pipeline.
     * </p>
     * 
     * @return A section of the response body that provides information about the pipeline.
     */

    public Pipeline getPipeline() {
        return this.pipeline;
    }

    /**
     * <p>
     * A section of the response body that provides information about the pipeline.
     * </p>
     * 
     * @param pipeline
     *        A section of the response body that provides information about the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadPipelineResult withPipeline(Pipeline pipeline) {
        setPipeline(pipeline);
        return this;
    }

    /**
     * <p>
     * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the
     * pipeline.
     * </p>
     * <p>
     * Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS
     * key, reduces processing time and prevents cross-regional charges.
     * </p>
     * 
     * @return Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as
     *         the pipeline.</p>
     *         <p>
     *         Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and
     *         AWS KMS key, reduces processing time and prevents cross-regional charges.
     */

    public java.util.List<Warning> getWarnings() {
        if (warnings == null) {
            warnings = new com.amazonaws.internal.SdkInternalList<Warning>();
        }
        return warnings;
    }

    /**
     * <p>
     * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the
     * pipeline.
     * </p>
     * <p>
     * Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS
     * key, reduces processing time and prevents cross-regional charges.
     * </p>
     * 
     * @param warnings
     *        Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as
     *        the pipeline.</p>
     *        <p>
     *        Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and
     *        AWS KMS key, reduces processing time and prevents cross-regional charges.
     */

    public void setWarnings(java.util.Collection<Warning> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new com.amazonaws.internal.SdkInternalList<Warning>(warnings);
    }

    /**
     * <p>
     * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the
     * pipeline.
     * </p>
     * <p>
     * Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS
     * key, reduces processing time and prevents cross-regional charges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as
     *        the pipeline.</p>
     *        <p>
     *        Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and
     *        AWS KMS key, reduces processing time and prevents cross-regional charges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadPipelineResult withWarnings(Warning... warnings) {
        if (this.warnings == null) {
            setWarnings(new com.amazonaws.internal.SdkInternalList<Warning>(warnings.length));
        }
        for (Warning ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the
     * pipeline.
     * </p>
     * <p>
     * Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS
     * key, reduces processing time and prevents cross-regional charges.
     * </p>
     * 
     * @param warnings
     *        Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as
     *        the pipeline.</p>
     *        <p>
     *        Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and
     *        AWS KMS key, reduces processing time and prevents cross-regional charges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadPipelineResult withWarnings(java.util.Collection<Warning> warnings) {
        setWarnings(warnings);
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
        if (getPipeline() != null)
            sb.append("Pipeline: ").append(getPipeline()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReadPipelineResult == false)
            return false;
        ReadPipelineResult other = (ReadPipelineResult) obj;
        if (other.getPipeline() == null ^ this.getPipeline() == null)
            return false;
        if (other.getPipeline() != null && other.getPipeline().equals(this.getPipeline()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipeline() == null) ? 0 : getPipeline().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public ReadPipelineResult clone() {
        try {
            return (ReadPipelineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
