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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a deployment of a stack or app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/Deployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Deployment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The deployment ID.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The app ID.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Date when the deployment was created.
     * </p>
     */
    private String createdAt;
    /**
     * <p>
     * Date when the deployment completed.
     * </p>
     */
    private String completedAt;
    /**
     * <p>
     * The deployment duration.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The user's IAM ARN.
     * </p>
     */
    private String iamUserArn;
    /**
     * <p>
     * A user-defined comment.
     * </p>
     */
    private String comment;

    private DeploymentCommand command;
    /**
     * <p>
     * The deployment status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * running
     * </p>
     * </li>
     * <li>
     * <p>
     * successful
     * </p>
     * </li>
     * <li>
     * <p>
     * failed
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A string that contains user-defined custom JSON. It can be used to override the corresponding default stack
     * configuration attribute values for stack or to pass data to recipes. The string should be in the following
     * format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>.
     * </p>
     */
    private String customJson;
    /**
     * <p>
     * The IDs of the target instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;

    /**
     * <p>
     * The deployment ID.
     * </p>
     * 
     * @param deploymentId
     *        The deployment ID.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The deployment ID.
     * </p>
     * 
     * @return The deployment ID.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The deployment ID.
     * </p>
     * 
     * @param deploymentId
     *        The deployment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @return The app ID.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Date when the deployment was created.
     * </p>
     * 
     * @param createdAt
     *        Date when the deployment was created.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Date when the deployment was created.
     * </p>
     * 
     * @return Date when the deployment was created.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Date when the deployment was created.
     * </p>
     * 
     * @param createdAt
     *        Date when the deployment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Date when the deployment completed.
     * </p>
     * 
     * @param completedAt
     *        Date when the deployment completed.
     */

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * Date when the deployment completed.
     * </p>
     * 
     * @return Date when the deployment completed.
     */

    public String getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * Date when the deployment completed.
     * </p>
     * 
     * @param completedAt
     *        Date when the deployment completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withCompletedAt(String completedAt) {
        setCompletedAt(completedAt);
        return this;
    }

    /**
     * <p>
     * The deployment duration.
     * </p>
     * 
     * @param duration
     *        The deployment duration.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The deployment duration.
     * </p>
     * 
     * @return The deployment duration.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The deployment duration.
     * </p>
     * 
     * @param duration
     *        The deployment duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The user's IAM ARN.
     * </p>
     * 
     * @param iamUserArn
     *        The user's IAM ARN.
     */

    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }

    /**
     * <p>
     * The user's IAM ARN.
     * </p>
     * 
     * @return The user's IAM ARN.
     */

    public String getIamUserArn() {
        return this.iamUserArn;
    }

    /**
     * <p>
     * The user's IAM ARN.
     * </p>
     * 
     * @param iamUserArn
     *        The user's IAM ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withIamUserArn(String iamUserArn) {
        setIamUserArn(iamUserArn);
        return this;
    }

    /**
     * <p>
     * A user-defined comment.
     * </p>
     * 
     * @param comment
     *        A user-defined comment.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A user-defined comment.
     * </p>
     * 
     * @return A user-defined comment.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A user-defined comment.
     * </p>
     * 
     * @param comment
     *        A user-defined comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * @param command
     */

    public void setCommand(DeploymentCommand command) {
        this.command = command;
    }

    /**
     * @return
     */

    public DeploymentCommand getCommand() {
        return this.command;
    }

    /**
     * @param command
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withCommand(DeploymentCommand command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The deployment status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * running
     * </p>
     * </li>
     * <li>
     * <p>
     * successful
     * </p>
     * </li>
     * <li>
     * <p>
     * failed
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        running
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        successful
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        failed
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The deployment status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * running
     * </p>
     * </li>
     * <li>
     * <p>
     * successful
     * </p>
     * </li>
     * <li>
     * <p>
     * failed
     * </p>
     * </li>
     * </ul>
     * 
     * @return The deployment status:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         running
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         successful
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         failed
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The deployment status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * running
     * </p>
     * </li>
     * <li>
     * <p>
     * successful
     * </p>
     * </li>
     * <li>
     * <p>
     * failed
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        running
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        successful
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        failed
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A string that contains user-defined custom JSON. It can be used to override the corresponding default stack
     * configuration attribute values for stack or to pass data to recipes. The string should be in the following
     * format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>.
     * </p>
     * 
     * @param customJson
     *        A string that contains user-defined custom JSON. It can be used to override the corresponding default
     *        stack configuration attribute values for stack or to pass data to recipes. The string should be in the
     *        following format:</p>
     *        <p>
     *        <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *        </p>
     *        <p>
     *        For more information on custom JSON, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *        Modify the Stack Configuration Attributes</a>.
     */

    public void setCustomJson(String customJson) {
        this.customJson = customJson;
    }

    /**
     * <p>
     * A string that contains user-defined custom JSON. It can be used to override the corresponding default stack
     * configuration attribute values for stack or to pass data to recipes. The string should be in the following
     * format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>.
     * </p>
     * 
     * @return A string that contains user-defined custom JSON. It can be used to override the corresponding default
     *         stack configuration attribute values for stack or to pass data to recipes. The string should be in the
     *         following format:</p>
     *         <p>
     *         <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *         </p>
     *         <p>
     *         For more information on custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *         Modify the Stack Configuration Attributes</a>.
     */

    public String getCustomJson() {
        return this.customJson;
    }

    /**
     * <p>
     * A string that contains user-defined custom JSON. It can be used to override the corresponding default stack
     * configuration attribute values for stack or to pass data to recipes. The string should be in the following
     * format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>.
     * </p>
     * 
     * @param customJson
     *        A string that contains user-defined custom JSON. It can be used to override the corresponding default
     *        stack configuration attribute values for stack or to pass data to recipes. The string should be in the
     *        following format:</p>
     *        <p>
     *        <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *        </p>
     *        <p>
     *        For more information on custom JSON, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *        Modify the Stack Configuration Attributes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withCustomJson(String customJson) {
        setCustomJson(customJson);
        return this;
    }

    /**
     * <p>
     * The IDs of the target instances.
     * </p>
     * 
     * @return The IDs of the target instances.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * The IDs of the target instances.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the target instances.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * The IDs of the target instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the target instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the target instances.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the target instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCompletedAt() != null)
            sb.append("CompletedAt: ").append(getCompletedAt()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getIamUserArn() != null)
            sb.append("IamUserArn: ").append(getIamUserArn()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCustomJson() != null)
            sb.append("CustomJson: ").append(getCustomJson()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds());
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
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null)
            return false;
        if (other.getIamUserArn() != null && other.getIamUserArn().equals(this.getIamUserArn()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCustomJson() == null ^ this.getCustomJson() == null)
            return false;
        if (other.getCustomJson() != null && other.getCustomJson().equals(this.getCustomJson()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCustomJson() == null) ? 0 : getCustomJson().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
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
        com.amazonaws.services.opsworks.model.transform.DeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
