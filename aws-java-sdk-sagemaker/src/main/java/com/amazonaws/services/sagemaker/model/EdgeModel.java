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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The model on the edge device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EdgeModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The model version.
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

    public EdgeModel withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * 
     * @param modelVersion
     *        The model version.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * 
     * @return The model version.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * 
     * @param modelVersion
     *        The model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeModel withModelVersion(String modelVersion) {
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

    public EdgeModel withLatestSampleTime(java.util.Date latestSampleTime) {
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

    public EdgeModel withLatestInference(java.util.Date latestInference) {
        setLatestInference(latestInference);
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
            sb.append("LatestInference: ").append(getLatestInference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgeModel == false)
            return false;
        EdgeModel other = (EdgeModel) obj;
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
        return hashCode;
    }

    @Override
    public EdgeModel clone() {
        try {
            return (EdgeModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EdgeModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
