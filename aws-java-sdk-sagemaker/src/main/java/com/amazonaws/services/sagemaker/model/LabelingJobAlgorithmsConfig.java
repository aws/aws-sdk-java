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
 * Provides configuration information for auto-labeling of your data objects. A <code>LabelingJobAlgorithmsConfig</code>
 * object must be supplied in order to use auto-labeling.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelingJobAlgorithmsConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobAlgorithmsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of the
     * following ARNs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Image classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Object detection</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     * </p>
     * </li>
     * </ul>
     */
    private String labelingJobAlgorithmSpecificationArn;
    /**
     * <p>
     * At the end of an auto-label job Amazon SageMaker Ground Truth sends the Amazon Resource Nam (ARN) of the final
     * model used for auto-labeling. You can use this model as the starting point for subsequent similar jobs by
     * providing the ARN of the model here.
     * </p>
     */
    private String initialActiveLearningModelArn;
    /**
     * <p>
     * Provides configuration information for a labeling job.
     * </p>
     */
    private LabelingJobResourceConfig labelingJobResourceConfig;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of the
     * following ARNs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Image classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Object detection</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelingJobAlgorithmSpecificationArn
     *        Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of
     *        the following ARNs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Image classification</i>
     *        </p>
     *        <p>
     *        <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Text classification</i>
     *        </p>
     *        <p>
     *        <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Object detection</i>
     *        </p>
     *        <p>
     *        <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     *        </p>
     *        </li>
     */

    public void setLabelingJobAlgorithmSpecificationArn(String labelingJobAlgorithmSpecificationArn) {
        this.labelingJobAlgorithmSpecificationArn = labelingJobAlgorithmSpecificationArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of the
     * following ARNs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Image classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Object detection</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of
     *         the following ARNs:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Image classification</i>
     *         </p>
     *         <p>
     *         <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Text classification</i>
     *         </p>
     *         <p>
     *         <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Object detection</i>
     *         </p>
     *         <p>
     *         <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     *         </p>
     *         </li>
     */

    public String getLabelingJobAlgorithmSpecificationArn() {
        return this.labelingJobAlgorithmSpecificationArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of the
     * following ARNs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Image classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Object detection</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelingJobAlgorithmSpecificationArn
     *        Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of
     *        the following ARNs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Image classification</i>
     *        </p>
     *        <p>
     *        <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Text classification</i>
     *        </p>
     *        <p>
     *        <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Object detection</i>
     *        </p>
     *        <p>
     *        <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobAlgorithmsConfig withLabelingJobAlgorithmSpecificationArn(String labelingJobAlgorithmSpecificationArn) {
        setLabelingJobAlgorithmSpecificationArn(labelingJobAlgorithmSpecificationArn);
        return this;
    }

    /**
     * <p>
     * At the end of an auto-label job Amazon SageMaker Ground Truth sends the Amazon Resource Nam (ARN) of the final
     * model used for auto-labeling. You can use this model as the starting point for subsequent similar jobs by
     * providing the ARN of the model here.
     * </p>
     * 
     * @param initialActiveLearningModelArn
     *        At the end of an auto-label job Amazon SageMaker Ground Truth sends the Amazon Resource Nam (ARN) of the
     *        final model used for auto-labeling. You can use this model as the starting point for subsequent similar
     *        jobs by providing the ARN of the model here.
     */

    public void setInitialActiveLearningModelArn(String initialActiveLearningModelArn) {
        this.initialActiveLearningModelArn = initialActiveLearningModelArn;
    }

    /**
     * <p>
     * At the end of an auto-label job Amazon SageMaker Ground Truth sends the Amazon Resource Nam (ARN) of the final
     * model used for auto-labeling. You can use this model as the starting point for subsequent similar jobs by
     * providing the ARN of the model here.
     * </p>
     * 
     * @return At the end of an auto-label job Amazon SageMaker Ground Truth sends the Amazon Resource Nam (ARN) of the
     *         final model used for auto-labeling. You can use this model as the starting point for subsequent similar
     *         jobs by providing the ARN of the model here.
     */

    public String getInitialActiveLearningModelArn() {
        return this.initialActiveLearningModelArn;
    }

    /**
     * <p>
     * At the end of an auto-label job Amazon SageMaker Ground Truth sends the Amazon Resource Nam (ARN) of the final
     * model used for auto-labeling. You can use this model as the starting point for subsequent similar jobs by
     * providing the ARN of the model here.
     * </p>
     * 
     * @param initialActiveLearningModelArn
     *        At the end of an auto-label job Amazon SageMaker Ground Truth sends the Amazon Resource Nam (ARN) of the
     *        final model used for auto-labeling. You can use this model as the starting point for subsequent similar
     *        jobs by providing the ARN of the model here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobAlgorithmsConfig withInitialActiveLearningModelArn(String initialActiveLearningModelArn) {
        setInitialActiveLearningModelArn(initialActiveLearningModelArn);
        return this;
    }

    /**
     * <p>
     * Provides configuration information for a labeling job.
     * </p>
     * 
     * @param labelingJobResourceConfig
     *        Provides configuration information for a labeling job.
     */

    public void setLabelingJobResourceConfig(LabelingJobResourceConfig labelingJobResourceConfig) {
        this.labelingJobResourceConfig = labelingJobResourceConfig;
    }

    /**
     * <p>
     * Provides configuration information for a labeling job.
     * </p>
     * 
     * @return Provides configuration information for a labeling job.
     */

    public LabelingJobResourceConfig getLabelingJobResourceConfig() {
        return this.labelingJobResourceConfig;
    }

    /**
     * <p>
     * Provides configuration information for a labeling job.
     * </p>
     * 
     * @param labelingJobResourceConfig
     *        Provides configuration information for a labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobAlgorithmsConfig withLabelingJobResourceConfig(LabelingJobResourceConfig labelingJobResourceConfig) {
        setLabelingJobResourceConfig(labelingJobResourceConfig);
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
        if (getLabelingJobAlgorithmSpecificationArn() != null)
            sb.append("LabelingJobAlgorithmSpecificationArn: ").append(getLabelingJobAlgorithmSpecificationArn()).append(",");
        if (getInitialActiveLearningModelArn() != null)
            sb.append("InitialActiveLearningModelArn: ").append(getInitialActiveLearningModelArn()).append(",");
        if (getLabelingJobResourceConfig() != null)
            sb.append("LabelingJobResourceConfig: ").append(getLabelingJobResourceConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobAlgorithmsConfig == false)
            return false;
        LabelingJobAlgorithmsConfig other = (LabelingJobAlgorithmsConfig) obj;
        if (other.getLabelingJobAlgorithmSpecificationArn() == null ^ this.getLabelingJobAlgorithmSpecificationArn() == null)
            return false;
        if (other.getLabelingJobAlgorithmSpecificationArn() != null
                && other.getLabelingJobAlgorithmSpecificationArn().equals(this.getLabelingJobAlgorithmSpecificationArn()) == false)
            return false;
        if (other.getInitialActiveLearningModelArn() == null ^ this.getInitialActiveLearningModelArn() == null)
            return false;
        if (other.getInitialActiveLearningModelArn() != null
                && other.getInitialActiveLearningModelArn().equals(this.getInitialActiveLearningModelArn()) == false)
            return false;
        if (other.getLabelingJobResourceConfig() == null ^ this.getLabelingJobResourceConfig() == null)
            return false;
        if (other.getLabelingJobResourceConfig() != null && other.getLabelingJobResourceConfig().equals(this.getLabelingJobResourceConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelingJobAlgorithmSpecificationArn() == null) ? 0 : getLabelingJobAlgorithmSpecificationArn().hashCode());
        hashCode = prime * hashCode + ((getInitialActiveLearningModelArn() == null) ? 0 : getInitialActiveLearningModelArn().hashCode());
        hashCode = prime * hashCode + ((getLabelingJobResourceConfig() == null) ? 0 : getLabelingJobResourceConfig().hashCode());
        return hashCode;
    }

    @Override
    public LabelingJobAlgorithmsConfig clone() {
        try {
            return (LabelingJobAlgorithmsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelingJobAlgorithmsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
