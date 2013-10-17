/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Describes a deployment of a stack or app.
 * </p>
 */
public class Deployment implements Serializable {

    /**
     * The deployment ID.
     */
    private String deploymentId;

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * The app ID.
     */
    private String appId;

    /**
     * Date when the deployment was created.
     */
    private String createdAt;

    /**
     * Date when the deployment completed.
     */
    private String completedAt;

    /**
     * The deployment duration.
     */
    private Integer duration;

    /**
     * The user's IAM ARN.
     */
    private String iamUserArn;

    /**
     * A user-defined comment.
     */
    private String comment;

    /**
     * Used to specify a deployment operation.
     */
    private DeploymentCommand command;

    /**
     * The deployment status: <ul> <li>running</li> <li>successful</li>
     * <li>failed</li> </ul>
     */
    private String status;

    /**
     * A string that contains user-defined custom JSON. It is used to
     * override the corresponding default stack configuration JSON values for
     * stack. The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     * Custom JSON to Modify the Stack Configuration JSON</a>.
     */
    private String customJson;

    /**
     * The IDs of the target instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIds;

    /**
     * The deployment ID.
     *
     * @return The deployment ID.
     */
    public String getDeploymentId() {
        return deploymentId;
    }
    
    /**
     * The deployment ID.
     *
     * @param deploymentId The deployment ID.
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }
    
    /**
     * The deployment ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentId The deployment ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * The stack ID.
     *
     * @return The stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID.
     *
     * @param stackId The stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The app ID.
     *
     * @return The app ID.
     */
    public String getAppId() {
        return appId;
    }
    
    /**
     * The app ID.
     *
     * @param appId The app ID.
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }
    
    /**
     * The app ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appId The app ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Date when the deployment was created.
     *
     * @return Date when the deployment was created.
     */
    public String getCreatedAt() {
        return createdAt;
    }
    
    /**
     * Date when the deployment was created.
     *
     * @param createdAt Date when the deployment was created.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * Date when the deployment was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt Date when the deployment was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Date when the deployment completed.
     *
     * @return Date when the deployment completed.
     */
    public String getCompletedAt() {
        return completedAt;
    }
    
    /**
     * Date when the deployment completed.
     *
     * @param completedAt Date when the deployment completed.
     */
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }
    
    /**
     * Date when the deployment completed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param completedAt Date when the deployment completed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * The deployment duration.
     *
     * @return The deployment duration.
     */
    public Integer getDuration() {
        return duration;
    }
    
    /**
     * The deployment duration.
     *
     * @param duration The deployment duration.
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    /**
     * The deployment duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The deployment duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The user's IAM ARN.
     *
     * @return The user's IAM ARN.
     */
    public String getIamUserArn() {
        return iamUserArn;
    }
    
    /**
     * The user's IAM ARN.
     *
     * @param iamUserArn The user's IAM ARN.
     */
    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }
    
    /**
     * The user's IAM ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamUserArn The user's IAM ARN.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
        return this;
    }

    /**
     * A user-defined comment.
     *
     * @return A user-defined comment.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * A user-defined comment.
     *
     * @param comment A user-defined comment.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * A user-defined comment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param comment A user-defined comment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Used to specify a deployment operation.
     *
     * @return Used to specify a deployment operation.
     */
    public DeploymentCommand getCommand() {
        return command;
    }
    
    /**
     * Used to specify a deployment operation.
     *
     * @param command Used to specify a deployment operation.
     */
    public void setCommand(DeploymentCommand command) {
        this.command = command;
    }
    
    /**
     * Used to specify a deployment operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param command Used to specify a deployment operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withCommand(DeploymentCommand command) {
        this.command = command;
        return this;
    }

    /**
     * The deployment status: <ul> <li>running</li> <li>successful</li>
     * <li>failed</li> </ul>
     *
     * @return The deployment status: <ul> <li>running</li> <li>successful</li>
     *         <li>failed</li> </ul>
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The deployment status: <ul> <li>running</li> <li>successful</li>
     * <li>failed</li> </ul>
     *
     * @param status The deployment status: <ul> <li>running</li> <li>successful</li>
     *         <li>failed</li> </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The deployment status: <ul> <li>running</li> <li>successful</li>
     * <li>failed</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The deployment status: <ul> <li>running</li> <li>successful</li>
     *         <li>failed</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * A string that contains user-defined custom JSON. It is used to
     * override the corresponding default stack configuration JSON values for
     * stack. The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     * Custom JSON to Modify the Stack Configuration JSON</a>.
     *
     * @return A string that contains user-defined custom JSON. It is used to
     *         override the corresponding default stack configuration JSON values for
     *         stack. The string should be in the following format and must escape
     *         characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     *         \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     *         Custom JSON to Modify the Stack Configuration JSON</a>.
     */
    public String getCustomJson() {
        return customJson;
    }
    
    /**
     * A string that contains user-defined custom JSON. It is used to
     * override the corresponding default stack configuration JSON values for
     * stack. The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     * Custom JSON to Modify the Stack Configuration JSON</a>.
     *
     * @param customJson A string that contains user-defined custom JSON. It is used to
     *         override the corresponding default stack configuration JSON values for
     *         stack. The string should be in the following format and must escape
     *         characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     *         \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     *         Custom JSON to Modify the Stack Configuration JSON</a>.
     */
    public void setCustomJson(String customJson) {
        this.customJson = customJson;
    }
    
    /**
     * A string that contains user-defined custom JSON. It is used to
     * override the corresponding default stack configuration JSON values for
     * stack. The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     * Custom JSON to Modify the Stack Configuration JSON</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customJson A string that contains user-defined custom JSON. It is used to
     *         override the corresponding default stack configuration JSON values for
     *         stack. The string should be in the following format and must escape
     *         characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     *         \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use
     *         Custom JSON to Modify the Stack Configuration JSON</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withCustomJson(String customJson) {
        this.customJson = customJson;
        return this;
    }

    /**
     * The IDs of the target instances.
     *
     * @return The IDs of the target instances.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
              instanceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceIds.setAutoConstruct(true);
        }
        return instanceIds;
    }
    
    /**
     * The IDs of the target instances.
     *
     * @param instanceIds The IDs of the target instances.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
        instanceIdsCopy.addAll(instanceIds);
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * The IDs of the target instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The IDs of the target instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the target instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The IDs of the target instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Deployment withInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
            instanceIdsCopy.addAll(instanceIds);
            this.instanceIds = instanceIdsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeploymentId() != null) sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getAppId() != null) sb.append("AppId: " + getAppId() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getCompletedAt() != null) sb.append("CompletedAt: " + getCompletedAt() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getIamUserArn() != null) sb.append("IamUserArn: " + getIamUserArn() + ",");
        if (getComment() != null) sb.append("Comment: " + getComment() + ",");
        if (getCommand() != null) sb.append("Command: " + getCommand() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getCustomJson() != null) sb.append("CustomJson: " + getCustomJson() + ",");
        if (getInstanceIds() != null) sb.append("InstanceIds: " + getInstanceIds() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Deployment == false) return false;
        Deployment other = (Deployment)obj;
        
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null) return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false) return false; 
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getAppId() == null ^ this.getAppId() == null) return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null) return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null) return false;
        if (other.getIamUserArn() != null && other.getIamUserArn().equals(this.getIamUserArn()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        if (other.getCommand() == null ^ this.getCommand() == null) return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getCustomJson() == null ^ this.getCustomJson() == null) return false;
        if (other.getCustomJson() != null && other.getCustomJson().equals(this.getCustomJson()) == false) return false; 
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        return true;
    }
    
}
    