/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemakeredgemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a model deployed on an edge device that is registered with SageMaker Edge Manager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/Model" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Model implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The version of the model.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The timestamp of the last data sample taken.
     * </p>
     */
    private java.util.Date latestSampleTime;
    /**
     * <p>
     * The timestamp of the last inference that was made.
     * </p>
     */
    private java.util.Date latestInference;
    /**
     * <p>
     * Information required for model metrics.
     * </p>
     */
    private java.util.List<EdgeMetric> modelMetrics;

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @return The name of the model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @return The version of the model.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last data sample taken.
     * </p>
     * 
     * @param latestSampleTime
     *        The timestamp of the last data sample taken.
     */

    public void setLatestSampleTime(java.util.Date latestSampleTime) {
        this.latestSampleTime = latestSampleTime;
    }

    /**
     * <p>
     * The timestamp of the last data sample taken.
     * </p>
     * 
     * @return The timestamp of the last data sample taken.
     */

    public java.util.Date getLatestSampleTime() {
        return this.latestSampleTime;
    }

    /**
     * <p>
     * The timestamp of the last data sample taken.
     * </p>
     * 
     * @param latestSampleTime
     *        The timestamp of the last data sample taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withLatestSampleTime(java.util.Date latestSampleTime) {
        setLatestSampleTime(latestSampleTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last inference that was made.
     * </p>
     * 
     * @param latestInference
     *        The timestamp of the last inference that was made.
     */

    public void setLatestInference(java.util.Date latestInference) {
        this.latestInference = latestInference;
    }

    /**
     * <p>
     * The timestamp of the last inference that was made.
     * </p>
     * 
     * @return The timestamp of the last inference that was made.
     */

    public java.util.Date getLatestInference() {
        return this.latestInference;
    }

    /**
     * <p>
     * The timestamp of the last inference that was made.
     * </p>
     * 
     * @param latestInference
     *        The timestamp of the last inference that was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withLatestInference(java.util.Date latestInference) {
        setLatestInference(latestInference);
        return this;
    }

    /**
     * <p>
     * Information required for model metrics.
     * </p>
     * 
     * @return Information required for model metrics.
     */

    public java.util.List<EdgeMetric> getModelMetrics() {
        return modelMetrics;
    }

    /**
     * <p>
     * Information required for model metrics.
     * </p>
     * 
     * @param modelMetrics
     *        Information required for model metrics.
     */

    public void setModelMetrics(java.util.Collection<EdgeMetric> modelMetrics) {
        if (modelMetrics == null) {
            this.modelMetrics = null;
            return;
        }

        this.modelMetrics = new java.util.ArrayList<EdgeMetric>(modelMetrics);
    }

    /**
     * <p>
     * Information required for model metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelMetrics(java.util.Collection)} or {@link #withModelMetrics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param modelMetrics
     *        Information required for model metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withModelMetrics(EdgeMetric... modelMetrics) {
        if (this.modelMetrics == null) {
            setModelMetrics(new java.util.ArrayList<EdgeMetric>(modelMetrics.length));
        }
        for (EdgeMetric ele : modelMetrics) {
            this.modelMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information required for model metrics.
     * </p>
     * 
     * @param modelMetrics
     *        Information required for model metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withModelMetrics(java.util.Collection<EdgeMetric> modelMetrics) {
        setModelMetrics(modelMetrics);
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getLatestSampleTime() != null)
            sb.append("LatestSampleTime: ").append(getLatestSampleTime()).append(",");
        if (getLatestInference() != null)
            sb.append("LatestInference: ").append(getLatestInference()).append(",");
        if (getModelMetrics() != null)
            sb.append("ModelMetrics: ").append(getModelMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Model == false)
            return false;
        Model other = (Model) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getLatestSampleTime() == null ^ this.getLatestSampleTime() == null)
            return false;
        if (other.getLatestSampleTime() != null && other.getLatestSampleTime().equals(this.getLatestSampleTime()) == false)
            return false;
        if (other.getLatestInference() == null ^ this.getLatestInference() == null)
            return false;
        if (other.getLatestInference() != null && other.getLatestInference().equals(this.getLatestInference()) == false)
            return false;
        if (other.getModelMetrics() == null ^ this.getModelMetrics() == null)
            return false;
        if (other.getModelMetrics() != null && other.getModelMetrics().equals(this.getModelMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getLatestSampleTime() == null) ? 0 : getLatestSampleTime().hashCode());
        hashCode = prime * hashCode + ((getLatestInference() == null) ? 0 : getLatestInference().hashCode());
        hashCode = prime * hashCode + ((getModelMetrics() == null) ? 0 : getModelMetrics().hashCode());
        return hashCode;
    }

    @Override
    public Model clone() {
        try {
            return (Model) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakeredgemanager.model.transform.ModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
