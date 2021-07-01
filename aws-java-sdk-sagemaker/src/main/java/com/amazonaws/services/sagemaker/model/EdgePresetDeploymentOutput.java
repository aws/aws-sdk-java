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
 * The output of a SageMaker Edge Manager deployable resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EdgePresetDeploymentOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgePresetDeploymentOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The deployment type created by SageMaker Edge Manager. Currently only supports Amazon Web Services IoT Greengrass
     * Version 2 components.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the generated deployable resource.
     * </p>
     */
    private String artifact;
    /**
     * <p>
     * The status of the deployable resource.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Returns a message describing the status of the deployed resource.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The deployment type created by SageMaker Edge Manager. Currently only supports Amazon Web Services IoT Greengrass
     * Version 2 components.
     * </p>
     * 
     * @param type
     *        The deployment type created by SageMaker Edge Manager. Currently only supports Amazon Web Services IoT
     *        Greengrass Version 2 components.
     * @see EdgePresetDeploymentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The deployment type created by SageMaker Edge Manager. Currently only supports Amazon Web Services IoT Greengrass
     * Version 2 components.
     * </p>
     * 
     * @return The deployment type created by SageMaker Edge Manager. Currently only supports Amazon Web Services IoT
     *         Greengrass Version 2 components.
     * @see EdgePresetDeploymentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The deployment type created by SageMaker Edge Manager. Currently only supports Amazon Web Services IoT Greengrass
     * Version 2 components.
     * </p>
     * 
     * @param type
     *        The deployment type created by SageMaker Edge Manager. Currently only supports Amazon Web Services IoT
     *        Greengrass Version 2 components.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgePresetDeploymentType
     */

    public EdgePresetDeploymentOutput withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The deployment type created by SageMaker Edge Manager. Currently only supports Amazon Web Services IoT Greengrass
     * Version 2 components.
     * </p>
     * 
     * @param type
     *        The deployment type created by SageMaker Edge Manager. Currently only supports Amazon Web Services IoT
     *        Greengrass Version 2 components.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgePresetDeploymentType
     */

    public EdgePresetDeploymentOutput withType(EdgePresetDeploymentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the generated deployable resource.
     * </p>
     * 
     * @param artifact
     *        The Amazon Resource Name (ARN) of the generated deployable resource.
     */

    public void setArtifact(String artifact) {
        this.artifact = artifact;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the generated deployable resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the generated deployable resource.
     */

    public String getArtifact() {
        return this.artifact;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the generated deployable resource.
     * </p>
     * 
     * @param artifact
     *        The Amazon Resource Name (ARN) of the generated deployable resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgePresetDeploymentOutput withArtifact(String artifact) {
        setArtifact(artifact);
        return this;
    }

    /**
     * <p>
     * The status of the deployable resource.
     * </p>
     * 
     * @param status
     *        The status of the deployable resource.
     * @see EdgePresetDeploymentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deployable resource.
     * </p>
     * 
     * @return The status of the deployable resource.
     * @see EdgePresetDeploymentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the deployable resource.
     * </p>
     * 
     * @param status
     *        The status of the deployable resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgePresetDeploymentStatus
     */

    public EdgePresetDeploymentOutput withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the deployable resource.
     * </p>
     * 
     * @param status
     *        The status of the deployable resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgePresetDeploymentStatus
     */

    public EdgePresetDeploymentOutput withStatus(EdgePresetDeploymentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Returns a message describing the status of the deployed resource.
     * </p>
     * 
     * @param statusMessage
     *        Returns a message describing the status of the deployed resource.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Returns a message describing the status of the deployed resource.
     * </p>
     * 
     * @return Returns a message describing the status of the deployed resource.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Returns a message describing the status of the deployed resource.
     * </p>
     * 
     * @param statusMessage
     *        Returns a message describing the status of the deployed resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgePresetDeploymentOutput withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getArtifact() != null)
            sb.append("Artifact: ").append(getArtifact()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgePresetDeploymentOutput == false)
            return false;
        EdgePresetDeploymentOutput other = (EdgePresetDeploymentOutput) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getArtifact() == null ^ this.getArtifact() == null)
            return false;
        if (other.getArtifact() != null && other.getArtifact().equals(this.getArtifact()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getArtifact() == null) ? 0 : getArtifact().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public EdgePresetDeploymentOutput clone() {
        try {
            return (EdgePresetDeploymentOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EdgePresetDeploymentOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
