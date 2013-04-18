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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#createDeployment(CreateDeploymentRequest) CreateDeployment operation}.
 * <p>
 * Deploys a stack or app.
 * </p>
 * 
 * <ul>
 * <li>App deployment generates a <code>deploy</code> event, which runs the associated recipes and passes them a JSON stack configuration object that
 * includes information about the app. </li>
 * <li>Stack deployment runs the <code>deploy</code> recipes but does not raise an event.</li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#createDeployment(CreateDeploymentRequest)
 */
public class CreateDeploymentRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * The app ID, for app deployments.
     */
    private String appId;

    /**
     * The instance IDs for the deployment targets.
     */
    private java.util.List<String> instanceIds;

    /**
     * A <code>DeploymentCommand</code> object that describes details of the
     * operation.
     */
    private DeploymentCommand command;

    /**
     * A user-defined comment.
     */
    private String comment;

    /**
     * A string that contains user-defined, custom JSON. It is used to
     * override the corresponding default stack configuration JSON values.
     * The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code>
     */
    private String customJson;

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
    public CreateDeploymentRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    
    
    /**
     * The app ID, for app deployments.
     *
     * @return The app ID, for app deployments.
     */
    public String getAppId() {
        return appId;
    }
    
    /**
     * The app ID, for app deployments.
     *
     * @param appId The app ID, for app deployments.
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }
    
    /**
     * The app ID, for app deployments.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appId The app ID, for app deployments.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDeploymentRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    
    /**
     * The instance IDs for the deployment targets.
     *
     * @return The instance IDs for the deployment targets.
     */
    public java.util.List<String> getInstanceIds() {
        
        if (instanceIds == null) {
            instanceIds = new java.util.ArrayList<String>();
        }
        return instanceIds;
    }
    
    /**
     * The instance IDs for the deployment targets.
     *
     * @param instanceIds The instance IDs for the deployment targets.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>(instanceIds.size());
        instanceIdsCopy.addAll(instanceIds);
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * The instance IDs for the deployment targets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The instance IDs for the deployment targets.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDeploymentRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * The instance IDs for the deployment targets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The instance IDs for the deployment targets.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDeploymentRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
        } else {
            java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>(instanceIds.size());
            instanceIdsCopy.addAll(instanceIds);
            this.instanceIds = instanceIdsCopy;
        }

        return this;
    }
    
    /**
     * A <code>DeploymentCommand</code> object that describes details of the
     * operation.
     *
     * @return A <code>DeploymentCommand</code> object that describes details of the
     *         operation.
     */
    public DeploymentCommand getCommand() {
        return command;
    }
    
    /**
     * A <code>DeploymentCommand</code> object that describes details of the
     * operation.
     *
     * @param command A <code>DeploymentCommand</code> object that describes details of the
     *         operation.
     */
    public void setCommand(DeploymentCommand command) {
        this.command = command;
    }
    
    /**
     * A <code>DeploymentCommand</code> object that describes details of the
     * operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param command A <code>DeploymentCommand</code> object that describes details of the
     *         operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDeploymentRequest withCommand(DeploymentCommand command) {
        this.command = command;
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
    public CreateDeploymentRequest withComment(String comment) {
        this.comment = comment;
        return this;
    }
    
    
    /**
     * A string that contains user-defined, custom JSON. It is used to
     * override the corresponding default stack configuration JSON values.
     * The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code>
     *
     * @return A string that contains user-defined, custom JSON. It is used to
     *         override the corresponding default stack configuration JSON values.
     *         The string should be in the following format and must escape
     *         characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     *         \"value2\",...}"</code>
     */
    public String getCustomJson() {
        return customJson;
    }
    
    /**
     * A string that contains user-defined, custom JSON. It is used to
     * override the corresponding default stack configuration JSON values.
     * The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code>
     *
     * @param customJson A string that contains user-defined, custom JSON. It is used to
     *         override the corresponding default stack configuration JSON values.
     *         The string should be in the following format and must escape
     *         characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     *         \"value2\",...}"</code>
     */
    public void setCustomJson(String customJson) {
        this.customJson = customJson;
    }
    
    /**
     * A string that contains user-defined, custom JSON. It is used to
     * override the corresponding default stack configuration JSON values.
     * The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customJson A string that contains user-defined, custom JSON. It is used to
     *         override the corresponding default stack configuration JSON values.
     *         The string should be in the following format and must escape
     *         characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     *         \"value2\",...}"</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDeploymentRequest withCustomJson(String customJson) {
        this.customJson = customJson;
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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");    	
        if (getAppId() != null) sb.append("AppId: " + getAppId() + ",");    	
        if (getInstanceIds() != null) sb.append("InstanceIds: " + getInstanceIds() + ",");    	
        if (getCommand() != null) sb.append("Command: " + getCommand() + ",");    	
        if (getComment() != null) sb.append("Comment: " + getComment() + ",");    	
        if (getCustomJson() != null) sb.append("CustomJson: " + getCustomJson() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode()); 
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        hashCode = prime * hashCode + ((getCustomJson() == null) ? 0 : getCustomJson().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDeploymentRequest == false) return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getAppId() == null ^ this.getAppId() == null) return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false) return false; 
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        if (other.getCommand() == null ^ this.getCommand() == null) return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        if (other.getCustomJson() == null ^ this.getCustomJson() == null) return false;
        if (other.getCustomJson() != null && other.getCustomJson().equals(this.getCustomJson()) == false) return false; 
        return true;
    }
    
}
    