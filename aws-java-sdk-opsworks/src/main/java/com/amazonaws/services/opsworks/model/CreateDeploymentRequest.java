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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The app ID. This parameter is required for app deployments, but not for other deployment commands.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The instance IDs for the deployment targets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * The layer IDs for the deployment targets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> layerIds;
    /**
     * <p>
     * A <code>DeploymentCommand</code> object that specifies the deployment command and any associated arguments.
     * </p>
     */
    private DeploymentCommand command;
    /**
     * <p>
     * A user-defined comment.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     * configuration JSON values. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information about custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>.
     * </p>
     */
    private String customJson;

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

    public CreateDeploymentRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The app ID. This parameter is required for app deployments, but not for other deployment commands.
     * </p>
     * 
     * @param appId
     *        The app ID. This parameter is required for app deployments, but not for other deployment commands.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The app ID. This parameter is required for app deployments, but not for other deployment commands.
     * </p>
     * 
     * @return The app ID. This parameter is required for app deployments, but not for other deployment commands.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The app ID. This parameter is required for app deployments, but not for other deployment commands.
     * </p>
     * 
     * @param appId
     *        The app ID. This parameter is required for app deployments, but not for other deployment commands.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The instance IDs for the deployment targets.
     * </p>
     * 
     * @return The instance IDs for the deployment targets.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * The instance IDs for the deployment targets.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs for the deployment targets.
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
     * The instance IDs for the deployment targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs for the deployment targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withInstanceIds(String... instanceIds) {
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
     * The instance IDs for the deployment targets.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs for the deployment targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The layer IDs for the deployment targets.
     * </p>
     * 
     * @return The layer IDs for the deployment targets.
     */

    public java.util.List<String> getLayerIds() {
        if (layerIds == null) {
            layerIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return layerIds;
    }

    /**
     * <p>
     * The layer IDs for the deployment targets.
     * </p>
     * 
     * @param layerIds
     *        The layer IDs for the deployment targets.
     */

    public void setLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
            return;
        }

        this.layerIds = new com.amazonaws.internal.SdkInternalList<String>(layerIds);
    }

    /**
     * <p>
     * The layer IDs for the deployment targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayerIds(java.util.Collection)} or {@link #withLayerIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param layerIds
     *        The layer IDs for the deployment targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withLayerIds(String... layerIds) {
        if (this.layerIds == null) {
            setLayerIds(new com.amazonaws.internal.SdkInternalList<String>(layerIds.length));
        }
        for (String ele : layerIds) {
            this.layerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The layer IDs for the deployment targets.
     * </p>
     * 
     * @param layerIds
     *        The layer IDs for the deployment targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withLayerIds(java.util.Collection<String> layerIds) {
        setLayerIds(layerIds);
        return this;
    }

    /**
     * <p>
     * A <code>DeploymentCommand</code> object that specifies the deployment command and any associated arguments.
     * </p>
     * 
     * @param command
     *        A <code>DeploymentCommand</code> object that specifies the deployment command and any associated
     *        arguments.
     */

    public void setCommand(DeploymentCommand command) {
        this.command = command;
    }

    /**
     * <p>
     * A <code>DeploymentCommand</code> object that specifies the deployment command and any associated arguments.
     * </p>
     * 
     * @return A <code>DeploymentCommand</code> object that specifies the deployment command and any associated
     *         arguments.
     */

    public DeploymentCommand getCommand() {
        return this.command;
    }

    /**
     * <p>
     * A <code>DeploymentCommand</code> object that specifies the deployment command and any associated arguments.
     * </p>
     * 
     * @param command
     *        A <code>DeploymentCommand</code> object that specifies the deployment command and any associated
     *        arguments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withCommand(DeploymentCommand command) {
        setCommand(command);
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

    public CreateDeploymentRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     * configuration JSON values. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information about custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>.
     * </p>
     * 
     * @param customJson
     *        A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     *        configuration JSON values. The string should be in the following format:</p>
     *        <p>
     *        <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *        </p>
     *        <p>
     *        For more information about custom JSON, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *        Modify the Stack Configuration Attributes</a>.
     */

    public void setCustomJson(String customJson) {
        this.customJson = customJson;
    }

    /**
     * <p>
     * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     * configuration JSON values. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information about custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>.
     * </p>
     * 
     * @return A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     *         configuration JSON values. The string should be in the following format:</p>
     *         <p>
     *         <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *         </p>
     *         <p>
     *         For more information about custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *         Modify the Stack Configuration Attributes</a>.
     */

    public String getCustomJson() {
        return this.customJson;
    }

    /**
     * <p>
     * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     * configuration JSON values. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information about custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>.
     * </p>
     * 
     * @param customJson
     *        A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     *        configuration JSON values. The string should be in the following format:</p>
     *        <p>
     *        <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *        </p>
     *        <p>
     *        For more information about custom JSON, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *        Modify the Stack Configuration Attributes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withCustomJson(String customJson) {
        setCustomJson(customJson);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getLayerIds() != null)
            sb.append("LayerIds: ").append(getLayerIds()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getCustomJson() != null)
            sb.append("CustomJson: ").append(getCustomJson());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentRequest == false)
            return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getLayerIds() == null ^ this.getLayerIds() == null)
            return false;
        if (other.getLayerIds() != null && other.getLayerIds().equals(this.getLayerIds()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getCustomJson() == null ^ this.getCustomJson() == null)
            return false;
        if (other.getCustomJson() != null && other.getCustomJson().equals(this.getCustomJson()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getLayerIds() == null) ? 0 : getLayerIds().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getCustomJson() == null) ? 0 : getCustomJson().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentRequest clone() {
        return (CreateDeploymentRequest) super.clone();
    }

}
