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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the location of the output produced by the labeling job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelingJobOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket location of the manifest file for labeled data.
     * </p>
     */
    private String outputDatasetS3Uri;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model trained as part of automated data
     * labeling.
     * </p>
     */
    private String finalActiveLearningModelArn;

    /**
     * <p>
     * The Amazon S3 bucket location of the manifest file for labeled data.
     * </p>
     * 
     * @param outputDatasetS3Uri
     *        The Amazon S3 bucket location of the manifest file for labeled data.
     */

    public void setOutputDatasetS3Uri(String outputDatasetS3Uri) {
        this.outputDatasetS3Uri = outputDatasetS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 bucket location of the manifest file for labeled data.
     * </p>
     * 
     * @return The Amazon S3 bucket location of the manifest file for labeled data.
     */

    public String getOutputDatasetS3Uri() {
        return this.outputDatasetS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 bucket location of the manifest file for labeled data.
     * </p>
     * 
     * @param outputDatasetS3Uri
     *        The Amazon S3 bucket location of the manifest file for labeled data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobOutput withOutputDatasetS3Uri(String outputDatasetS3Uri) {
        setOutputDatasetS3Uri(outputDatasetS3Uri);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model trained as part of automated data
     * labeling.
     * </p>
     * 
     * @param finalActiveLearningModelArn
     *        The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model trained as part of automated
     *        data labeling.
     */

    public void setFinalActiveLearningModelArn(String finalActiveLearningModelArn) {
        this.finalActiveLearningModelArn = finalActiveLearningModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model trained as part of automated data
     * labeling.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model trained as part of automated
     *         data labeling.
     */

    public String getFinalActiveLearningModelArn() {
        return this.finalActiveLearningModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model trained as part of automated data
     * labeling.
     * </p>
     * 
     * @param finalActiveLearningModelArn
     *        The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model trained as part of automated
     *        data labeling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobOutput withFinalActiveLearningModelArn(String finalActiveLearningModelArn) {
        setFinalActiveLearningModelArn(finalActiveLearningModelArn);
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
        if (getOutputDatasetS3Uri() != null)
            sb.append("OutputDatasetS3Uri: ").append(getOutputDatasetS3Uri()).append(",");
        if (getFinalActiveLearningModelArn() != null)
            sb.append("FinalActiveLearningModelArn: ").append(getFinalActiveLearningModelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobOutput == false)
            return false;
        LabelingJobOutput other = (LabelingJobOutput) obj;
        if (other.getOutputDatasetS3Uri() == null ^ this.getOutputDatasetS3Uri() == null)
            return false;
        if (other.getOutputDatasetS3Uri() != null && other.getOutputDatasetS3Uri().equals(this.getOutputDatasetS3Uri()) == false)
            return false;
        if (other.getFinalActiveLearningModelArn() == null ^ this.getFinalActiveLearningModelArn() == null)
            return false;
        if (other.getFinalActiveLearningModelArn() != null && other.getFinalActiveLearningModelArn().equals(this.getFinalActiveLearningModelArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputDatasetS3Uri() == null) ? 0 : getOutputDatasetS3Uri().hashCode());
        hashCode = prime * hashCode + ((getFinalActiveLearningModelArn() == null) ? 0 : getFinalActiveLearningModelArn().hashCode());
        return hashCode;
    }

    @Override
    public LabelingJobOutput clone() {
        try {
            return (LabelingJobOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelingJobOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
