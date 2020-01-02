/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateSystemInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSystemInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
     * </p>
     */
    private java.util.List<Tag> tags;

    private DefinitionDocument definition;
    /**
     * <p>
     * The target type of the deployment. Valid values are <code>GREENGRASS</code> and <code>CLOUD</code>.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The name of the Greengrass group where the system instance will be deployed. This value is required if the value
     * of the <code>target</code> parameter is <code>GREENGRASS</code>.
     * </p>
     */
    private String greengrassGroupName;
    /**
     * <p>
     * The name of the Amazon Simple Storage Service bucket that will be used to store and deploy the system instance's
     * resource file. This value is required if the value of the <code>target</code> parameter is
     * <code>GREENGRASS</code>.
     * </p>
     */
    private String s3BucketName;

    private MetricsConfiguration metricsConfiguration;
    /**
     * <p>
     * The ARN of the IAM role that AWS IoT Things Graph will assume when it executes the flow. This role must have read
     * and write access to AWS Lambda and AWS IoT and any other AWS services that the flow uses when it executes. This
     * value is required if the value of the <code>target</code> parameter is <code>CLOUD</code>.
     * </p>
     */
    private String flowActionsRoleArn;

    /**
     * <p>
     * Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
     * </p>
     * 
     * @return Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
     * </p>
     * 
     * @param tags
     *        Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSystemInstanceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
     * </p>
     * 
     * @param tags
     *        Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSystemInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * @param definition
     */

    public void setDefinition(DefinitionDocument definition) {
        this.definition = definition;
    }

    /**
     * @return
     */

    public DefinitionDocument getDefinition() {
        return this.definition;
    }

    /**
     * @param definition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSystemInstanceRequest withDefinition(DefinitionDocument definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The target type of the deployment. Valid values are <code>GREENGRASS</code> and <code>CLOUD</code>.
     * </p>
     * 
     * @param target
     *        The target type of the deployment. Valid values are <code>GREENGRASS</code> and <code>CLOUD</code>.
     * @see DeploymentTarget
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target type of the deployment. Valid values are <code>GREENGRASS</code> and <code>CLOUD</code>.
     * </p>
     * 
     * @return The target type of the deployment. Valid values are <code>GREENGRASS</code> and <code>CLOUD</code>.
     * @see DeploymentTarget
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target type of the deployment. Valid values are <code>GREENGRASS</code> and <code>CLOUD</code>.
     * </p>
     * 
     * @param target
     *        The target type of the deployment. Valid values are <code>GREENGRASS</code> and <code>CLOUD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentTarget
     */

    public CreateSystemInstanceRequest withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The target type of the deployment. Valid values are <code>GREENGRASS</code> and <code>CLOUD</code>.
     * </p>
     * 
     * @param target
     *        The target type of the deployment. Valid values are <code>GREENGRASS</code> and <code>CLOUD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentTarget
     */

    public CreateSystemInstanceRequest withTarget(DeploymentTarget target) {
        this.target = target.toString();
        return this;
    }

    /**
     * <p>
     * The name of the Greengrass group where the system instance will be deployed. This value is required if the value
     * of the <code>target</code> parameter is <code>GREENGRASS</code>.
     * </p>
     * 
     * @param greengrassGroupName
     *        The name of the Greengrass group where the system instance will be deployed. This value is required if the
     *        value of the <code>target</code> parameter is <code>GREENGRASS</code>.
     */

    public void setGreengrassGroupName(String greengrassGroupName) {
        this.greengrassGroupName = greengrassGroupName;
    }

    /**
     * <p>
     * The name of the Greengrass group where the system instance will be deployed. This value is required if the value
     * of the <code>target</code> parameter is <code>GREENGRASS</code>.
     * </p>
     * 
     * @return The name of the Greengrass group where the system instance will be deployed. This value is required if
     *         the value of the <code>target</code> parameter is <code>GREENGRASS</code>.
     */

    public String getGreengrassGroupName() {
        return this.greengrassGroupName;
    }

    /**
     * <p>
     * The name of the Greengrass group where the system instance will be deployed. This value is required if the value
     * of the <code>target</code> parameter is <code>GREENGRASS</code>.
     * </p>
     * 
     * @param greengrassGroupName
     *        The name of the Greengrass group where the system instance will be deployed. This value is required if the
     *        value of the <code>target</code> parameter is <code>GREENGRASS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSystemInstanceRequest withGreengrassGroupName(String greengrassGroupName) {
        setGreengrassGroupName(greengrassGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Simple Storage Service bucket that will be used to store and deploy the system instance's
     * resource file. This value is required if the value of the <code>target</code> parameter is
     * <code>GREENGRASS</code>.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the Amazon Simple Storage Service bucket that will be used to store and deploy the system
     *        instance's resource file. This value is required if the value of the <code>target</code> parameter is
     *        <code>GREENGRASS</code>.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon Simple Storage Service bucket that will be used to store and deploy the system instance's
     * resource file. This value is required if the value of the <code>target</code> parameter is
     * <code>GREENGRASS</code>.
     * </p>
     * 
     * @return The name of the Amazon Simple Storage Service bucket that will be used to store and deploy the system
     *         instance's resource file. This value is required if the value of the <code>target</code> parameter is
     *         <code>GREENGRASS</code>.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon Simple Storage Service bucket that will be used to store and deploy the system instance's
     * resource file. This value is required if the value of the <code>target</code> parameter is
     * <code>GREENGRASS</code>.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the Amazon Simple Storage Service bucket that will be used to store and deploy the system
     *        instance's resource file. This value is required if the value of the <code>target</code> parameter is
     *        <code>GREENGRASS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSystemInstanceRequest withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * @param metricsConfiguration
     */

    public void setMetricsConfiguration(MetricsConfiguration metricsConfiguration) {
        this.metricsConfiguration = metricsConfiguration;
    }

    /**
     * @return
     */

    public MetricsConfiguration getMetricsConfiguration() {
        return this.metricsConfiguration;
    }

    /**
     * @param metricsConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSystemInstanceRequest withMetricsConfiguration(MetricsConfiguration metricsConfiguration) {
        setMetricsConfiguration(metricsConfiguration);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that AWS IoT Things Graph will assume when it executes the flow. This role must have read
     * and write access to AWS Lambda and AWS IoT and any other AWS services that the flow uses when it executes. This
     * value is required if the value of the <code>target</code> parameter is <code>CLOUD</code>.
     * </p>
     * 
     * @param flowActionsRoleArn
     *        The ARN of the IAM role that AWS IoT Things Graph will assume when it executes the flow. This role must
     *        have read and write access to AWS Lambda and AWS IoT and any other AWS services that the flow uses when it
     *        executes. This value is required if the value of the <code>target</code> parameter is <code>CLOUD</code>.
     */

    public void setFlowActionsRoleArn(String flowActionsRoleArn) {
        this.flowActionsRoleArn = flowActionsRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that AWS IoT Things Graph will assume when it executes the flow. This role must have read
     * and write access to AWS Lambda and AWS IoT and any other AWS services that the flow uses when it executes. This
     * value is required if the value of the <code>target</code> parameter is <code>CLOUD</code>.
     * </p>
     * 
     * @return The ARN of the IAM role that AWS IoT Things Graph will assume when it executes the flow. This role must
     *         have read and write access to AWS Lambda and AWS IoT and any other AWS services that the flow uses when
     *         it executes. This value is required if the value of the <code>target</code> parameter is
     *         <code>CLOUD</code>.
     */

    public String getFlowActionsRoleArn() {
        return this.flowActionsRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that AWS IoT Things Graph will assume when it executes the flow. This role must have read
     * and write access to AWS Lambda and AWS IoT and any other AWS services that the flow uses when it executes. This
     * value is required if the value of the <code>target</code> parameter is <code>CLOUD</code>.
     * </p>
     * 
     * @param flowActionsRoleArn
     *        The ARN of the IAM role that AWS IoT Things Graph will assume when it executes the flow. This role must
     *        have read and write access to AWS Lambda and AWS IoT and any other AWS services that the flow uses when it
     *        executes. This value is required if the value of the <code>target</code> parameter is <code>CLOUD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSystemInstanceRequest withFlowActionsRoleArn(String flowActionsRoleArn) {
        setFlowActionsRoleArn(flowActionsRoleArn);
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getGreengrassGroupName() != null)
            sb.append("GreengrassGroupName: ").append(getGreengrassGroupName()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getMetricsConfiguration() != null)
            sb.append("MetricsConfiguration: ").append(getMetricsConfiguration()).append(",");
        if (getFlowActionsRoleArn() != null)
            sb.append("FlowActionsRoleArn: ").append(getFlowActionsRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSystemInstanceRequest == false)
            return false;
        CreateSystemInstanceRequest other = (CreateSystemInstanceRequest) obj;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getGreengrassGroupName() == null ^ this.getGreengrassGroupName() == null)
            return false;
        if (other.getGreengrassGroupName() != null && other.getGreengrassGroupName().equals(this.getGreengrassGroupName()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getMetricsConfiguration() == null ^ this.getMetricsConfiguration() == null)
            return false;
        if (other.getMetricsConfiguration() != null && other.getMetricsConfiguration().equals(this.getMetricsConfiguration()) == false)
            return false;
        if (other.getFlowActionsRoleArn() == null ^ this.getFlowActionsRoleArn() == null)
            return false;
        if (other.getFlowActionsRoleArn() != null && other.getFlowActionsRoleArn().equals(this.getFlowActionsRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getGreengrassGroupName() == null) ? 0 : getGreengrassGroupName().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getMetricsConfiguration() == null) ? 0 : getMetricsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFlowActionsRoleArn() == null) ? 0 : getFlowActionsRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateSystemInstanceRequest clone() {
        return (CreateSystemInstanceRequest) super.clone();
    }

}
