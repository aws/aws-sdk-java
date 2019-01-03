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
 * Defines a training job and a batch transform job that Amazon SageMaker runs to validate your algorithm.
 * </p>
 * <p>
 * The data provided in the validation profile is made available to your buyers on AWS Marketplace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AlgorithmValidationProfile"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlgorithmValidationProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the profile for the algorithm. The name must have 1 to 63 characters. Valid characters are a-z, A-Z,
     * 0-9, and - (hyphen).
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The <code>TrainingJobDefinition</code> object that describes the training job that Amazon SageMaker runs to
     * validate your algorithm.
     * </p>
     */
    private TrainingJobDefinition trainingJobDefinition;
    /**
     * <p>
     * The <code>TransformJobDefinition</code> object that describes the transform job that Amazon SageMaker runs to
     * validate your algorithm.
     * </p>
     */
    private TransformJobDefinition transformJobDefinition;

    /**
     * <p>
     * The name of the profile for the algorithm. The name must have 1 to 63 characters. Valid characters are a-z, A-Z,
     * 0-9, and - (hyphen).
     * </p>
     * 
     * @param profileName
     *        The name of the profile for the algorithm. The name must have 1 to 63 characters. Valid characters are
     *        a-z, A-Z, 0-9, and - (hyphen).
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of the profile for the algorithm. The name must have 1 to 63 characters. Valid characters are a-z, A-Z,
     * 0-9, and - (hyphen).
     * </p>
     * 
     * @return The name of the profile for the algorithm. The name must have 1 to 63 characters. Valid characters are
     *         a-z, A-Z, 0-9, and - (hyphen).
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The name of the profile for the algorithm. The name must have 1 to 63 characters. Valid characters are a-z, A-Z,
     * 0-9, and - (hyphen).
     * </p>
     * 
     * @param profileName
     *        The name of the profile for the algorithm. The name must have 1 to 63 characters. Valid characters are
     *        a-z, A-Z, 0-9, and - (hyphen).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmValidationProfile withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The <code>TrainingJobDefinition</code> object that describes the training job that Amazon SageMaker runs to
     * validate your algorithm.
     * </p>
     * 
     * @param trainingJobDefinition
     *        The <code>TrainingJobDefinition</code> object that describes the training job that Amazon SageMaker runs
     *        to validate your algorithm.
     */

    public void setTrainingJobDefinition(TrainingJobDefinition trainingJobDefinition) {
        this.trainingJobDefinition = trainingJobDefinition;
    }

    /**
     * <p>
     * The <code>TrainingJobDefinition</code> object that describes the training job that Amazon SageMaker runs to
     * validate your algorithm.
     * </p>
     * 
     * @return The <code>TrainingJobDefinition</code> object that describes the training job that Amazon SageMaker runs
     *         to validate your algorithm.
     */

    public TrainingJobDefinition getTrainingJobDefinition() {
        return this.trainingJobDefinition;
    }

    /**
     * <p>
     * The <code>TrainingJobDefinition</code> object that describes the training job that Amazon SageMaker runs to
     * validate your algorithm.
     * </p>
     * 
     * @param trainingJobDefinition
     *        The <code>TrainingJobDefinition</code> object that describes the training job that Amazon SageMaker runs
     *        to validate your algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmValidationProfile withTrainingJobDefinition(TrainingJobDefinition trainingJobDefinition) {
        setTrainingJobDefinition(trainingJobDefinition);
        return this;
    }

    /**
     * <p>
     * The <code>TransformJobDefinition</code> object that describes the transform job that Amazon SageMaker runs to
     * validate your algorithm.
     * </p>
     * 
     * @param transformJobDefinition
     *        The <code>TransformJobDefinition</code> object that describes the transform job that Amazon SageMaker runs
     *        to validate your algorithm.
     */

    public void setTransformJobDefinition(TransformJobDefinition transformJobDefinition) {
        this.transformJobDefinition = transformJobDefinition;
    }

    /**
     * <p>
     * The <code>TransformJobDefinition</code> object that describes the transform job that Amazon SageMaker runs to
     * validate your algorithm.
     * </p>
     * 
     * @return The <code>TransformJobDefinition</code> object that describes the transform job that Amazon SageMaker
     *         runs to validate your algorithm.
     */

    public TransformJobDefinition getTransformJobDefinition() {
        return this.transformJobDefinition;
    }

    /**
     * <p>
     * The <code>TransformJobDefinition</code> object that describes the transform job that Amazon SageMaker runs to
     * validate your algorithm.
     * </p>
     * 
     * @param transformJobDefinition
     *        The <code>TransformJobDefinition</code> object that describes the transform job that Amazon SageMaker runs
     *        to validate your algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmValidationProfile withTransformJobDefinition(TransformJobDefinition transformJobDefinition) {
        setTransformJobDefinition(transformJobDefinition);
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
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getTrainingJobDefinition() != null)
            sb.append("TrainingJobDefinition: ").append(getTrainingJobDefinition()).append(",");
        if (getTransformJobDefinition() != null)
            sb.append("TransformJobDefinition: ").append(getTransformJobDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmValidationProfile == false)
            return false;
        AlgorithmValidationProfile other = (AlgorithmValidationProfile) obj;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getTrainingJobDefinition() == null ^ this.getTrainingJobDefinition() == null)
            return false;
        if (other.getTrainingJobDefinition() != null && other.getTrainingJobDefinition().equals(this.getTrainingJobDefinition()) == false)
            return false;
        if (other.getTransformJobDefinition() == null ^ this.getTransformJobDefinition() == null)
            return false;
        if (other.getTransformJobDefinition() != null && other.getTransformJobDefinition().equals(this.getTransformJobDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobDefinition() == null) ? 0 : getTrainingJobDefinition().hashCode());
        hashCode = prime * hashCode + ((getTransformJobDefinition() == null) ? 0 : getTransformJobDefinition().hashCode());
        return hashCode;
    }

    @Override
    public AlgorithmValidationProfile clone() {
        try {
            return (AlgorithmValidationProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AlgorithmValidationProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
