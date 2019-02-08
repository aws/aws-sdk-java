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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateDeploymentJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The requested deployment configuration.
     * </p>
     */
    private DeploymentConfig deploymentConfig;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet to deploy.
     * </p>
     */
    private String fleet;
    /**
     * <p>
     * The deployment application configuration.
     * </p>
     */
    private java.util.List<DeploymentApplicationConfig> deploymentApplicationConfigs;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the deployment job.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The requested deployment configuration.
     * </p>
     * 
     * @param deploymentConfig
     *        The requested deployment configuration.
     */

    public void setDeploymentConfig(DeploymentConfig deploymentConfig) {
        this.deploymentConfig = deploymentConfig;
    }

    /**
     * <p>
     * The requested deployment configuration.
     * </p>
     * 
     * @return The requested deployment configuration.
     */

    public DeploymentConfig getDeploymentConfig() {
        return this.deploymentConfig;
    }

    /**
     * <p>
     * The requested deployment configuration.
     * </p>
     * 
     * @param deploymentConfig
     *        The requested deployment configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobRequest withDeploymentConfig(DeploymentConfig deploymentConfig) {
        setDeploymentConfig(deploymentConfig);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet to deploy.
     * </p>
     * 
     * @param fleet
     *        The Amazon Resource Name (ARN) of the fleet to deploy.
     */

    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet to deploy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the fleet to deploy.
     */

    public String getFleet() {
        return this.fleet;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet to deploy.
     * </p>
     * 
     * @param fleet
     *        The Amazon Resource Name (ARN) of the fleet to deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobRequest withFleet(String fleet) {
        setFleet(fleet);
        return this;
    }

    /**
     * <p>
     * The deployment application configuration.
     * </p>
     * 
     * @return The deployment application configuration.
     */

    public java.util.List<DeploymentApplicationConfig> getDeploymentApplicationConfigs() {
        return deploymentApplicationConfigs;
    }

    /**
     * <p>
     * The deployment application configuration.
     * </p>
     * 
     * @param deploymentApplicationConfigs
     *        The deployment application configuration.
     */

    public void setDeploymentApplicationConfigs(java.util.Collection<DeploymentApplicationConfig> deploymentApplicationConfigs) {
        if (deploymentApplicationConfigs == null) {
            this.deploymentApplicationConfigs = null;
            return;
        }

        this.deploymentApplicationConfigs = new java.util.ArrayList<DeploymentApplicationConfig>(deploymentApplicationConfigs);
    }

    /**
     * <p>
     * The deployment application configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentApplicationConfigs(java.util.Collection)} or
     * {@link #withDeploymentApplicationConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deploymentApplicationConfigs
     *        The deployment application configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobRequest withDeploymentApplicationConfigs(DeploymentApplicationConfig... deploymentApplicationConfigs) {
        if (this.deploymentApplicationConfigs == null) {
            setDeploymentApplicationConfigs(new java.util.ArrayList<DeploymentApplicationConfig>(deploymentApplicationConfigs.length));
        }
        for (DeploymentApplicationConfig ele : deploymentApplicationConfigs) {
            this.deploymentApplicationConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The deployment application configuration.
     * </p>
     * 
     * @param deploymentApplicationConfigs
     *        The deployment application configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobRequest withDeploymentApplicationConfigs(java.util.Collection<DeploymentApplicationConfig> deploymentApplicationConfigs) {
        setDeploymentApplicationConfigs(deploymentApplicationConfigs);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the deployment job.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to the deployment job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the deployment job.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the deployment job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the deployment job.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateDeploymentJobRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDeploymentConfig() != null)
            sb.append("DeploymentConfig: ").append(getDeploymentConfig()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getFleet() != null)
            sb.append("Fleet: ").append(getFleet()).append(",");
        if (getDeploymentApplicationConfigs() != null)
            sb.append("DeploymentApplicationConfigs: ").append(getDeploymentApplicationConfigs()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentJobRequest == false)
            return false;
        CreateDeploymentJobRequest other = (CreateDeploymentJobRequest) obj;
        if (other.getDeploymentConfig() == null ^ this.getDeploymentConfig() == null)
            return false;
        if (other.getDeploymentConfig() != null && other.getDeploymentConfig().equals(this.getDeploymentConfig()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getFleet() == null ^ this.getFleet() == null)
            return false;
        if (other.getFleet() != null && other.getFleet().equals(this.getFleet()) == false)
            return false;
        if (other.getDeploymentApplicationConfigs() == null ^ this.getDeploymentApplicationConfigs() == null)
            return false;
        if (other.getDeploymentApplicationConfigs() != null && other.getDeploymentApplicationConfigs().equals(this.getDeploymentApplicationConfigs()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentConfig() == null) ? 0 : getDeploymentConfig().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getFleet() == null) ? 0 : getFleet().hashCode());
        hashCode = prime * hashCode + ((getDeploymentApplicationConfigs() == null) ? 0 : getDeploymentApplicationConfigs().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentJobRequest clone() {
        return (CreateDeploymentJobRequest) super.clone();
    }

}
