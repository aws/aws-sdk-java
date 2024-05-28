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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the last deployment of the environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/Deployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Deployment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the last deployment of the environment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The status of the last deployment of the environment.
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * The type of the last deployment of the environment.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * The failure reason of the last deployment of the environment.
     * </p>
     */
    private EnvironmentError failureReason;
    /**
     * <p>
     * Specifies whether the last deployment of the environment is complete.
     * </p>
     */
    private Boolean isDeploymentComplete;
    /**
     * <p>
     * The messages of the last deployment of the environment.
     * </p>
     */
    private java.util.List<String> messages;

    /**
     * <p>
     * The identifier of the last deployment of the environment.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the last deployment of the environment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The identifier of the last deployment of the environment.
     * </p>
     * 
     * @return The identifier of the last deployment of the environment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The identifier of the last deployment of the environment.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the last deployment of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The status of the last deployment of the environment.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the last deployment of the environment.
     * @see DeploymentStatus
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The status of the last deployment of the environment.
     * </p>
     * 
     * @return The status of the last deployment of the environment.
     * @see DeploymentStatus
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * The status of the last deployment of the environment.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the last deployment of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Deployment withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the last deployment of the environment.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the last deployment of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Deployment withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of the last deployment of the environment.
     * </p>
     * 
     * @param deploymentType
     *        The type of the last deployment of the environment.
     * @see DeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * The type of the last deployment of the environment.
     * </p>
     * 
     * @return The type of the last deployment of the environment.
     * @see DeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * The type of the last deployment of the environment.
     * </p>
     * 
     * @param deploymentType
     *        The type of the last deployment of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public Deployment withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * The type of the last deployment of the environment.
     * </p>
     * 
     * @param deploymentType
     *        The type of the last deployment of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public Deployment withDeploymentType(DeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * The failure reason of the last deployment of the environment.
     * </p>
     * 
     * @param failureReason
     *        The failure reason of the last deployment of the environment.
     */

    public void setFailureReason(EnvironmentError failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The failure reason of the last deployment of the environment.
     * </p>
     * 
     * @return The failure reason of the last deployment of the environment.
     */

    public EnvironmentError getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The failure reason of the last deployment of the environment.
     * </p>
     * 
     * @param failureReason
     *        The failure reason of the last deployment of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withFailureReason(EnvironmentError failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Specifies whether the last deployment of the environment is complete.
     * </p>
     * 
     * @param isDeploymentComplete
     *        Specifies whether the last deployment of the environment is complete.
     */

    public void setIsDeploymentComplete(Boolean isDeploymentComplete) {
        this.isDeploymentComplete = isDeploymentComplete;
    }

    /**
     * <p>
     * Specifies whether the last deployment of the environment is complete.
     * </p>
     * 
     * @return Specifies whether the last deployment of the environment is complete.
     */

    public Boolean getIsDeploymentComplete() {
        return this.isDeploymentComplete;
    }

    /**
     * <p>
     * Specifies whether the last deployment of the environment is complete.
     * </p>
     * 
     * @param isDeploymentComplete
     *        Specifies whether the last deployment of the environment is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withIsDeploymentComplete(Boolean isDeploymentComplete) {
        setIsDeploymentComplete(isDeploymentComplete);
        return this;
    }

    /**
     * <p>
     * Specifies whether the last deployment of the environment is complete.
     * </p>
     * 
     * @return Specifies whether the last deployment of the environment is complete.
     */

    public Boolean isDeploymentComplete() {
        return this.isDeploymentComplete;
    }

    /**
     * <p>
     * The messages of the last deployment of the environment.
     * </p>
     * 
     * @return The messages of the last deployment of the environment.
     */

    public java.util.List<String> getMessages() {
        return messages;
    }

    /**
     * <p>
     * The messages of the last deployment of the environment.
     * </p>
     * 
     * @param messages
     *        The messages of the last deployment of the environment.
     */

    public void setMessages(java.util.Collection<String> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<String>(messages);
    }

    /**
     * <p>
     * The messages of the last deployment of the environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        The messages of the last deployment of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withMessages(String... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<String>(messages.length));
        }
        for (String ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The messages of the last deployment of the environment.
     * </p>
     * 
     * @param messages
     *        The messages of the last deployment of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withMessages(java.util.Collection<String> messages) {
        setMessages(messages);
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
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getIsDeploymentComplete() != null)
            sb.append("IsDeploymentComplete: ").append(getIsDeploymentComplete()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Deployment == false)
            return false;
        Deployment other = (Deployment) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getIsDeploymentComplete() == null ^ this.getIsDeploymentComplete() == null)
            return false;
        if (other.getIsDeploymentComplete() != null && other.getIsDeploymentComplete().equals(this.getIsDeploymentComplete()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getIsDeploymentComplete() == null) ? 0 : getIsDeploymentComplete().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        return hashCode;
    }

    @Override
    public Deployment clone() {
        try {
            return (Deployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.DeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
