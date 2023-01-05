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
 * Contains information about the configuration of a model in a deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EdgeDeploymentModelConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeDeploymentModelConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name the device application uses to reference this model.
     * </p>
     */
    private String modelHandle;
    /**
     * <p>
     * The edge packaging job associated with this deployment.
     * </p>
     */
    private String edgePackagingJobName;

    /**
     * <p>
     * The name the device application uses to reference this model.
     * </p>
     * 
     * @param modelHandle
     *        The name the device application uses to reference this model.
     */

    public void setModelHandle(String modelHandle) {
        this.modelHandle = modelHandle;
    }

    /**
     * <p>
     * The name the device application uses to reference this model.
     * </p>
     * 
     * @return The name the device application uses to reference this model.
     */

    public String getModelHandle() {
        return this.modelHandle;
    }

    /**
     * <p>
     * The name the device application uses to reference this model.
     * </p>
     * 
     * @param modelHandle
     *        The name the device application uses to reference this model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeDeploymentModelConfig withModelHandle(String modelHandle) {
        setModelHandle(modelHandle);
        return this;
    }

    /**
     * <p>
     * The edge packaging job associated with this deployment.
     * </p>
     * 
     * @param edgePackagingJobName
     *        The edge packaging job associated with this deployment.
     */

    public void setEdgePackagingJobName(String edgePackagingJobName) {
        this.edgePackagingJobName = edgePackagingJobName;
    }

    /**
     * <p>
     * The edge packaging job associated with this deployment.
     * </p>
     * 
     * @return The edge packaging job associated with this deployment.
     */

    public String getEdgePackagingJobName() {
        return this.edgePackagingJobName;
    }

    /**
     * <p>
     * The edge packaging job associated with this deployment.
     * </p>
     * 
     * @param edgePackagingJobName
     *        The edge packaging job associated with this deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeDeploymentModelConfig withEdgePackagingJobName(String edgePackagingJobName) {
        setEdgePackagingJobName(edgePackagingJobName);
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
        if (getModelHandle() != null)
            sb.append("ModelHandle: ").append(getModelHandle()).append(",");
        if (getEdgePackagingJobName() != null)
            sb.append("EdgePackagingJobName: ").append(getEdgePackagingJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgeDeploymentModelConfig == false)
            return false;
        EdgeDeploymentModelConfig other = (EdgeDeploymentModelConfig) obj;
        if (other.getModelHandle() == null ^ this.getModelHandle() == null)
            return false;
        if (other.getModelHandle() != null && other.getModelHandle().equals(this.getModelHandle()) == false)
            return false;
        if (other.getEdgePackagingJobName() == null ^ this.getEdgePackagingJobName() == null)
            return false;
        if (other.getEdgePackagingJobName() != null && other.getEdgePackagingJobName().equals(this.getEdgePackagingJobName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelHandle() == null) ? 0 : getModelHandle().hashCode());
        hashCode = prime * hashCode + ((getEdgePackagingJobName() == null) ? 0 : getEdgePackagingJobName().hashCode());
        return hashCode;
    }

    @Override
    public EdgeDeploymentModelConfig clone() {
        try {
            return (EdgeDeploymentModelConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EdgeDeploymentModelConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
