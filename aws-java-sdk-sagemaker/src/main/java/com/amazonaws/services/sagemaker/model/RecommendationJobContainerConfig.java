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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies mandatory fields for running an Inference Recommender job directly in the <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateInferenceRecommendationsJob.html"
 * >CreateInferenceRecommendationsJob</a> API. The fields specified in <code>ContainerConfig</code> override the
 * corresponding fields in the model package. Use <code>ContainerConfig</code> if you want to specify these fields for
 * the recommendation job but don't want to edit them in your model package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RecommendationJobContainerConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationJobContainerConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The machine learning domain of the model and its components.
     * </p>
     * <p>
     * Valid Values: <code>COMPUTER_VISION | NATURAL_LANGUAGE_PROCESSING | MACHINE_LEARNING</code>
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The machine learning task that the model accomplishes.
     * </p>
     * <p>
     * Valid Values:
     * <code>IMAGE_CLASSIFICATION | OBJECT_DETECTION | TEXT_GENERATION | IMAGE_SEGMENTATION | FILL_MASK | CLASSIFICATION | REGRESSION | OTHER</code>
     * </p>
     */
    private String task;
    /**
     * <p>
     * The machine learning framework of the container image.
     * </p>
     * <p>
     * Valid Values: <code>TENSORFLOW | PYTORCH | XGBOOST | SAGEMAKER-SCIKIT-LEARN</code>
     * </p>
     */
    private String framework;
    /**
     * <p>
     * The framework version of the container image.
     * </p>
     */
    private String frameworkVersion;
    /**
     * <p>
     * Specifies the <code>SamplePayloadUrl</code> and all other sample payload-related fields.
     * </p>
     */
    private RecommendationJobPayloadConfig payloadConfig;
    /**
     * <p>
     * The name of a pre-trained machine learning model benchmarked by Amazon SageMaker Inference Recommender that
     * matches your model.
     * </p>
     * <p>
     * Valid Values:
     * <code>efficientnetb7 | unet | xgboost | faster-rcnn-resnet101 | nasnetlarge | vgg16 | inception-v3 | mask-rcnn | sagemaker-scikit-learn | densenet201-gluon | resnet18v2-gluon | xception | densenet201 | yolov4 | resnet152 | bert-base-cased | xceptionV1-keras | resnet50 | retinanet</code>
     * </p>
     */
    private String nearestModelName;
    /**
     * <p>
     * A list of the instance types that are used to generate inferences in real-time.
     * </p>
     */
    private java.util.List<String> supportedInstanceTypes;

    /**
     * <p>
     * The machine learning domain of the model and its components.
     * </p>
     * <p>
     * Valid Values: <code>COMPUTER_VISION | NATURAL_LANGUAGE_PROCESSING | MACHINE_LEARNING</code>
     * </p>
     * 
     * @param domain
     *        The machine learning domain of the model and its components.</p>
     *        <p>
     *        Valid Values: <code>COMPUTER_VISION | NATURAL_LANGUAGE_PROCESSING | MACHINE_LEARNING</code>
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The machine learning domain of the model and its components.
     * </p>
     * <p>
     * Valid Values: <code>COMPUTER_VISION | NATURAL_LANGUAGE_PROCESSING | MACHINE_LEARNING</code>
     * </p>
     * 
     * @return The machine learning domain of the model and its components.</p>
     *         <p>
     *         Valid Values: <code>COMPUTER_VISION | NATURAL_LANGUAGE_PROCESSING | MACHINE_LEARNING</code>
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The machine learning domain of the model and its components.
     * </p>
     * <p>
     * Valid Values: <code>COMPUTER_VISION | NATURAL_LANGUAGE_PROCESSING | MACHINE_LEARNING</code>
     * </p>
     * 
     * @param domain
     *        The machine learning domain of the model and its components.</p>
     *        <p>
     *        Valid Values: <code>COMPUTER_VISION | NATURAL_LANGUAGE_PROCESSING | MACHINE_LEARNING</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobContainerConfig withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The machine learning task that the model accomplishes.
     * </p>
     * <p>
     * Valid Values:
     * <code>IMAGE_CLASSIFICATION | OBJECT_DETECTION | TEXT_GENERATION | IMAGE_SEGMENTATION | FILL_MASK | CLASSIFICATION | REGRESSION | OTHER</code>
     * </p>
     * 
     * @param task
     *        The machine learning task that the model accomplishes.</p>
     *        <p>
     *        Valid Values:
     *        <code>IMAGE_CLASSIFICATION | OBJECT_DETECTION | TEXT_GENERATION | IMAGE_SEGMENTATION | FILL_MASK | CLASSIFICATION | REGRESSION | OTHER</code>
     */

    public void setTask(String task) {
        this.task = task;
    }

    /**
     * <p>
     * The machine learning task that the model accomplishes.
     * </p>
     * <p>
     * Valid Values:
     * <code>IMAGE_CLASSIFICATION | OBJECT_DETECTION | TEXT_GENERATION | IMAGE_SEGMENTATION | FILL_MASK | CLASSIFICATION | REGRESSION | OTHER</code>
     * </p>
     * 
     * @return The machine learning task that the model accomplishes.</p>
     *         <p>
     *         Valid Values:
     *         <code>IMAGE_CLASSIFICATION | OBJECT_DETECTION | TEXT_GENERATION | IMAGE_SEGMENTATION | FILL_MASK | CLASSIFICATION | REGRESSION | OTHER</code>
     */

    public String getTask() {
        return this.task;
    }

    /**
     * <p>
     * The machine learning task that the model accomplishes.
     * </p>
     * <p>
     * Valid Values:
     * <code>IMAGE_CLASSIFICATION | OBJECT_DETECTION | TEXT_GENERATION | IMAGE_SEGMENTATION | FILL_MASK | CLASSIFICATION | REGRESSION | OTHER</code>
     * </p>
     * 
     * @param task
     *        The machine learning task that the model accomplishes.</p>
     *        <p>
     *        Valid Values:
     *        <code>IMAGE_CLASSIFICATION | OBJECT_DETECTION | TEXT_GENERATION | IMAGE_SEGMENTATION | FILL_MASK | CLASSIFICATION | REGRESSION | OTHER</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobContainerConfig withTask(String task) {
        setTask(task);
        return this;
    }

    /**
     * <p>
     * The machine learning framework of the container image.
     * </p>
     * <p>
     * Valid Values: <code>TENSORFLOW | PYTORCH | XGBOOST | SAGEMAKER-SCIKIT-LEARN</code>
     * </p>
     * 
     * @param framework
     *        The machine learning framework of the container image.</p>
     *        <p>
     *        Valid Values: <code>TENSORFLOW | PYTORCH | XGBOOST | SAGEMAKER-SCIKIT-LEARN</code>
     */

    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * The machine learning framework of the container image.
     * </p>
     * <p>
     * Valid Values: <code>TENSORFLOW | PYTORCH | XGBOOST | SAGEMAKER-SCIKIT-LEARN</code>
     * </p>
     * 
     * @return The machine learning framework of the container image.</p>
     *         <p>
     *         Valid Values: <code>TENSORFLOW | PYTORCH | XGBOOST | SAGEMAKER-SCIKIT-LEARN</code>
     */

    public String getFramework() {
        return this.framework;
    }

    /**
     * <p>
     * The machine learning framework of the container image.
     * </p>
     * <p>
     * Valid Values: <code>TENSORFLOW | PYTORCH | XGBOOST | SAGEMAKER-SCIKIT-LEARN</code>
     * </p>
     * 
     * @param framework
     *        The machine learning framework of the container image.</p>
     *        <p>
     *        Valid Values: <code>TENSORFLOW | PYTORCH | XGBOOST | SAGEMAKER-SCIKIT-LEARN</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobContainerConfig withFramework(String framework) {
        setFramework(framework);
        return this;
    }

    /**
     * <p>
     * The framework version of the container image.
     * </p>
     * 
     * @param frameworkVersion
     *        The framework version of the container image.
     */

    public void setFrameworkVersion(String frameworkVersion) {
        this.frameworkVersion = frameworkVersion;
    }

    /**
     * <p>
     * The framework version of the container image.
     * </p>
     * 
     * @return The framework version of the container image.
     */

    public String getFrameworkVersion() {
        return this.frameworkVersion;
    }

    /**
     * <p>
     * The framework version of the container image.
     * </p>
     * 
     * @param frameworkVersion
     *        The framework version of the container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobContainerConfig withFrameworkVersion(String frameworkVersion) {
        setFrameworkVersion(frameworkVersion);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>SamplePayloadUrl</code> and all other sample payload-related fields.
     * </p>
     * 
     * @param payloadConfig
     *        Specifies the <code>SamplePayloadUrl</code> and all other sample payload-related fields.
     */

    public void setPayloadConfig(RecommendationJobPayloadConfig payloadConfig) {
        this.payloadConfig = payloadConfig;
    }

    /**
     * <p>
     * Specifies the <code>SamplePayloadUrl</code> and all other sample payload-related fields.
     * </p>
     * 
     * @return Specifies the <code>SamplePayloadUrl</code> and all other sample payload-related fields.
     */

    public RecommendationJobPayloadConfig getPayloadConfig() {
        return this.payloadConfig;
    }

    /**
     * <p>
     * Specifies the <code>SamplePayloadUrl</code> and all other sample payload-related fields.
     * </p>
     * 
     * @param payloadConfig
     *        Specifies the <code>SamplePayloadUrl</code> and all other sample payload-related fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobContainerConfig withPayloadConfig(RecommendationJobPayloadConfig payloadConfig) {
        setPayloadConfig(payloadConfig);
        return this;
    }

    /**
     * <p>
     * The name of a pre-trained machine learning model benchmarked by Amazon SageMaker Inference Recommender that
     * matches your model.
     * </p>
     * <p>
     * Valid Values:
     * <code>efficientnetb7 | unet | xgboost | faster-rcnn-resnet101 | nasnetlarge | vgg16 | inception-v3 | mask-rcnn | sagemaker-scikit-learn | densenet201-gluon | resnet18v2-gluon | xception | densenet201 | yolov4 | resnet152 | bert-base-cased | xceptionV1-keras | resnet50 | retinanet</code>
     * </p>
     * 
     * @param nearestModelName
     *        The name of a pre-trained machine learning model benchmarked by Amazon SageMaker Inference Recommender
     *        that matches your model.</p>
     *        <p>
     *        Valid Values:
     *        <code>efficientnetb7 | unet | xgboost | faster-rcnn-resnet101 | nasnetlarge | vgg16 | inception-v3 | mask-rcnn | sagemaker-scikit-learn | densenet201-gluon | resnet18v2-gluon | xception | densenet201 | yolov4 | resnet152 | bert-base-cased | xceptionV1-keras | resnet50 | retinanet</code>
     */

    public void setNearestModelName(String nearestModelName) {
        this.nearestModelName = nearestModelName;
    }

    /**
     * <p>
     * The name of a pre-trained machine learning model benchmarked by Amazon SageMaker Inference Recommender that
     * matches your model.
     * </p>
     * <p>
     * Valid Values:
     * <code>efficientnetb7 | unet | xgboost | faster-rcnn-resnet101 | nasnetlarge | vgg16 | inception-v3 | mask-rcnn | sagemaker-scikit-learn | densenet201-gluon | resnet18v2-gluon | xception | densenet201 | yolov4 | resnet152 | bert-base-cased | xceptionV1-keras | resnet50 | retinanet</code>
     * </p>
     * 
     * @return The name of a pre-trained machine learning model benchmarked by Amazon SageMaker Inference Recommender
     *         that matches your model.</p>
     *         <p>
     *         Valid Values:
     *         <code>efficientnetb7 | unet | xgboost | faster-rcnn-resnet101 | nasnetlarge | vgg16 | inception-v3 | mask-rcnn | sagemaker-scikit-learn | densenet201-gluon | resnet18v2-gluon | xception | densenet201 | yolov4 | resnet152 | bert-base-cased | xceptionV1-keras | resnet50 | retinanet</code>
     */

    public String getNearestModelName() {
        return this.nearestModelName;
    }

    /**
     * <p>
     * The name of a pre-trained machine learning model benchmarked by Amazon SageMaker Inference Recommender that
     * matches your model.
     * </p>
     * <p>
     * Valid Values:
     * <code>efficientnetb7 | unet | xgboost | faster-rcnn-resnet101 | nasnetlarge | vgg16 | inception-v3 | mask-rcnn | sagemaker-scikit-learn | densenet201-gluon | resnet18v2-gluon | xception | densenet201 | yolov4 | resnet152 | bert-base-cased | xceptionV1-keras | resnet50 | retinanet</code>
     * </p>
     * 
     * @param nearestModelName
     *        The name of a pre-trained machine learning model benchmarked by Amazon SageMaker Inference Recommender
     *        that matches your model.</p>
     *        <p>
     *        Valid Values:
     *        <code>efficientnetb7 | unet | xgboost | faster-rcnn-resnet101 | nasnetlarge | vgg16 | inception-v3 | mask-rcnn | sagemaker-scikit-learn | densenet201-gluon | resnet18v2-gluon | xception | densenet201 | yolov4 | resnet152 | bert-base-cased | xceptionV1-keras | resnet50 | retinanet</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobContainerConfig withNearestModelName(String nearestModelName) {
        setNearestModelName(nearestModelName);
        return this;
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in real-time.
     * </p>
     * 
     * @return A list of the instance types that are used to generate inferences in real-time.
     */

    public java.util.List<String> getSupportedInstanceTypes() {
        return supportedInstanceTypes;
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in real-time.
     * </p>
     * 
     * @param supportedInstanceTypes
     *        A list of the instance types that are used to generate inferences in real-time.
     */

    public void setSupportedInstanceTypes(java.util.Collection<String> supportedInstanceTypes) {
        if (supportedInstanceTypes == null) {
            this.supportedInstanceTypes = null;
            return;
        }

        this.supportedInstanceTypes = new java.util.ArrayList<String>(supportedInstanceTypes);
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in real-time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedInstanceTypes(java.util.Collection)} or
     * {@link #withSupportedInstanceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedInstanceTypes
     *        A list of the instance types that are used to generate inferences in real-time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobContainerConfig withSupportedInstanceTypes(String... supportedInstanceTypes) {
        if (this.supportedInstanceTypes == null) {
            setSupportedInstanceTypes(new java.util.ArrayList<String>(supportedInstanceTypes.length));
        }
        for (String ele : supportedInstanceTypes) {
            this.supportedInstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in real-time.
     * </p>
     * 
     * @param supportedInstanceTypes
     *        A list of the instance types that are used to generate inferences in real-time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobContainerConfig withSupportedInstanceTypes(java.util.Collection<String> supportedInstanceTypes) {
        setSupportedInstanceTypes(supportedInstanceTypes);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getTask() != null)
            sb.append("Task: ").append(getTask()).append(",");
        if (getFramework() != null)
            sb.append("Framework: ").append(getFramework()).append(",");
        if (getFrameworkVersion() != null)
            sb.append("FrameworkVersion: ").append(getFrameworkVersion()).append(",");
        if (getPayloadConfig() != null)
            sb.append("PayloadConfig: ").append(getPayloadConfig()).append(",");
        if (getNearestModelName() != null)
            sb.append("NearestModelName: ").append(getNearestModelName()).append(",");
        if (getSupportedInstanceTypes() != null)
            sb.append("SupportedInstanceTypes: ").append(getSupportedInstanceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationJobContainerConfig == false)
            return false;
        RecommendationJobContainerConfig other = (RecommendationJobContainerConfig) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null && other.getFramework().equals(this.getFramework()) == false)
            return false;
        if (other.getFrameworkVersion() == null ^ this.getFrameworkVersion() == null)
            return false;
        if (other.getFrameworkVersion() != null && other.getFrameworkVersion().equals(this.getFrameworkVersion()) == false)
            return false;
        if (other.getPayloadConfig() == null ^ this.getPayloadConfig() == null)
            return false;
        if (other.getPayloadConfig() != null && other.getPayloadConfig().equals(this.getPayloadConfig()) == false)
            return false;
        if (other.getNearestModelName() == null ^ this.getNearestModelName() == null)
            return false;
        if (other.getNearestModelName() != null && other.getNearestModelName().equals(this.getNearestModelName()) == false)
            return false;
        if (other.getSupportedInstanceTypes() == null ^ this.getSupportedInstanceTypes() == null)
            return false;
        if (other.getSupportedInstanceTypes() != null && other.getSupportedInstanceTypes().equals(this.getSupportedInstanceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode + ((getFrameworkVersion() == null) ? 0 : getFrameworkVersion().hashCode());
        hashCode = prime * hashCode + ((getPayloadConfig() == null) ? 0 : getPayloadConfig().hashCode());
        hashCode = prime * hashCode + ((getNearestModelName() == null) ? 0 : getNearestModelName().hashCode());
        hashCode = prime * hashCode + ((getSupportedInstanceTypes() == null) ? 0 : getSupportedInstanceTypes().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationJobContainerConfig clone() {
        try {
            return (RecommendationJobContainerConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RecommendationJobContainerConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
