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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of recommended deployment configurations for the model. To get more advanced recommendations, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateInferenceRecommendationsJob.html"
 * >CreateInferenceRecommendationsJob</a> to create an inference recommendation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeploymentRecommendation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Status of the deployment recommendation. The status <code>NOT_APPLICABLE</code> means that SageMaker is unable to
     * provide a default recommendation for the model using the information provided. If the deployment status is
     * <code>IN_PROGRESS</code>, retry your API call after a few seconds to get a <code>COMPLETED</code> deployment
     * recommendation.
     * </p>
     */
    private String recommendationStatus;
    /**
     * <p>
     * A list of <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_RealTimeInferenceRecommendation.html"
     * >RealTimeInferenceRecommendation</a> items.
     * </p>
     */
    private java.util.List<RealTimeInferenceRecommendation> realTimeInferenceRecommendations;

    /**
     * <p>
     * Status of the deployment recommendation. The status <code>NOT_APPLICABLE</code> means that SageMaker is unable to
     * provide a default recommendation for the model using the information provided. If the deployment status is
     * <code>IN_PROGRESS</code>, retry your API call after a few seconds to get a <code>COMPLETED</code> deployment
     * recommendation.
     * </p>
     * 
     * @param recommendationStatus
     *        Status of the deployment recommendation. The status <code>NOT_APPLICABLE</code> means that SageMaker is
     *        unable to provide a default recommendation for the model using the information provided. If the deployment
     *        status is <code>IN_PROGRESS</code>, retry your API call after a few seconds to get a
     *        <code>COMPLETED</code> deployment recommendation.
     * @see RecommendationStatus
     */

    public void setRecommendationStatus(String recommendationStatus) {
        this.recommendationStatus = recommendationStatus;
    }

    /**
     * <p>
     * Status of the deployment recommendation. The status <code>NOT_APPLICABLE</code> means that SageMaker is unable to
     * provide a default recommendation for the model using the information provided. If the deployment status is
     * <code>IN_PROGRESS</code>, retry your API call after a few seconds to get a <code>COMPLETED</code> deployment
     * recommendation.
     * </p>
     * 
     * @return Status of the deployment recommendation. The status <code>NOT_APPLICABLE</code> means that SageMaker is
     *         unable to provide a default recommendation for the model using the information provided. If the
     *         deployment status is <code>IN_PROGRESS</code>, retry your API call after a few seconds to get a
     *         <code>COMPLETED</code> deployment recommendation.
     * @see RecommendationStatus
     */

    public String getRecommendationStatus() {
        return this.recommendationStatus;
    }

    /**
     * <p>
     * Status of the deployment recommendation. The status <code>NOT_APPLICABLE</code> means that SageMaker is unable to
     * provide a default recommendation for the model using the information provided. If the deployment status is
     * <code>IN_PROGRESS</code>, retry your API call after a few seconds to get a <code>COMPLETED</code> deployment
     * recommendation.
     * </p>
     * 
     * @param recommendationStatus
     *        Status of the deployment recommendation. The status <code>NOT_APPLICABLE</code> means that SageMaker is
     *        unable to provide a default recommendation for the model using the information provided. If the deployment
     *        status is <code>IN_PROGRESS</code>, retry your API call after a few seconds to get a
     *        <code>COMPLETED</code> deployment recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public DeploymentRecommendation withRecommendationStatus(String recommendationStatus) {
        setRecommendationStatus(recommendationStatus);
        return this;
    }

    /**
     * <p>
     * Status of the deployment recommendation. The status <code>NOT_APPLICABLE</code> means that SageMaker is unable to
     * provide a default recommendation for the model using the information provided. If the deployment status is
     * <code>IN_PROGRESS</code>, retry your API call after a few seconds to get a <code>COMPLETED</code> deployment
     * recommendation.
     * </p>
     * 
     * @param recommendationStatus
     *        Status of the deployment recommendation. The status <code>NOT_APPLICABLE</code> means that SageMaker is
     *        unable to provide a default recommendation for the model using the information provided. If the deployment
     *        status is <code>IN_PROGRESS</code>, retry your API call after a few seconds to get a
     *        <code>COMPLETED</code> deployment recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public DeploymentRecommendation withRecommendationStatus(RecommendationStatus recommendationStatus) {
        this.recommendationStatus = recommendationStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_RealTimeInferenceRecommendation.html"
     * >RealTimeInferenceRecommendation</a> items.
     * </p>
     * 
     * @return A list of <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_RealTimeInferenceRecommendation.html"
     *         >RealTimeInferenceRecommendation</a> items.
     */

    public java.util.List<RealTimeInferenceRecommendation> getRealTimeInferenceRecommendations() {
        return realTimeInferenceRecommendations;
    }

    /**
     * <p>
     * A list of <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_RealTimeInferenceRecommendation.html"
     * >RealTimeInferenceRecommendation</a> items.
     * </p>
     * 
     * @param realTimeInferenceRecommendations
     *        A list of <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_RealTimeInferenceRecommendation.html"
     *        >RealTimeInferenceRecommendation</a> items.
     */

    public void setRealTimeInferenceRecommendations(java.util.Collection<RealTimeInferenceRecommendation> realTimeInferenceRecommendations) {
        if (realTimeInferenceRecommendations == null) {
            this.realTimeInferenceRecommendations = null;
            return;
        }

        this.realTimeInferenceRecommendations = new java.util.ArrayList<RealTimeInferenceRecommendation>(realTimeInferenceRecommendations);
    }

    /**
     * <p>
     * A list of <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_RealTimeInferenceRecommendation.html"
     * >RealTimeInferenceRecommendation</a> items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRealTimeInferenceRecommendations(java.util.Collection)} or
     * {@link #withRealTimeInferenceRecommendations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param realTimeInferenceRecommendations
     *        A list of <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_RealTimeInferenceRecommendation.html"
     *        >RealTimeInferenceRecommendation</a> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentRecommendation withRealTimeInferenceRecommendations(RealTimeInferenceRecommendation... realTimeInferenceRecommendations) {
        if (this.realTimeInferenceRecommendations == null) {
            setRealTimeInferenceRecommendations(new java.util.ArrayList<RealTimeInferenceRecommendation>(realTimeInferenceRecommendations.length));
        }
        for (RealTimeInferenceRecommendation ele : realTimeInferenceRecommendations) {
            this.realTimeInferenceRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_RealTimeInferenceRecommendation.html"
     * >RealTimeInferenceRecommendation</a> items.
     * </p>
     * 
     * @param realTimeInferenceRecommendations
     *        A list of <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_RealTimeInferenceRecommendation.html"
     *        >RealTimeInferenceRecommendation</a> items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentRecommendation withRealTimeInferenceRecommendations(java.util.Collection<RealTimeInferenceRecommendation> realTimeInferenceRecommendations) {
        setRealTimeInferenceRecommendations(realTimeInferenceRecommendations);
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
        if (getRecommendationStatus() != null)
            sb.append("RecommendationStatus: ").append(getRecommendationStatus()).append(",");
        if (getRealTimeInferenceRecommendations() != null)
            sb.append("RealTimeInferenceRecommendations: ").append(getRealTimeInferenceRecommendations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentRecommendation == false)
            return false;
        DeploymentRecommendation other = (DeploymentRecommendation) obj;
        if (other.getRecommendationStatus() == null ^ this.getRecommendationStatus() == null)
            return false;
        if (other.getRecommendationStatus() != null && other.getRecommendationStatus().equals(this.getRecommendationStatus()) == false)
            return false;
        if (other.getRealTimeInferenceRecommendations() == null ^ this.getRealTimeInferenceRecommendations() == null)
            return false;
        if (other.getRealTimeInferenceRecommendations() != null
                && other.getRealTimeInferenceRecommendations().equals(this.getRealTimeInferenceRecommendations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationStatus() == null) ? 0 : getRecommendationStatus().hashCode());
        hashCode = prime * hashCode + ((getRealTimeInferenceRecommendations() == null) ? 0 : getRealTimeInferenceRecommendations().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentRecommendation clone() {
        try {
            return (DeploymentRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DeploymentRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
