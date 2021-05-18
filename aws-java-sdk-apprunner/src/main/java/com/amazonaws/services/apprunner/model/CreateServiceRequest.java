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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the new service. It must be unique across all the running App Runner services in your AWS account in
     * the AWS Region.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The source to deploy to the App Runner service. It can be a code or an image repository.
     * </p>
     */
    private SourceConfiguration sourceConfiguration;
    /**
     * <p>
     * The runtime configuration of instances (scaling units) of the App Runner service.
     * </p>
     */
    private InstanceConfiguration instanceConfiguration;
    /**
     * <p>
     * An optional list of metadata items that you can associate with your service resource. A tag is a key-value pair.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it
     * maintains and your service logs. By default, App Runner uses an AWS managed CMK.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * The settings for the health check that AWS App Runner performs to monitor the health of your service.
     * </p>
     */
    private HealthCheckConfiguration healthCheckConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     * associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling
     * configuration.
     * </p>
     */
    private String autoScalingConfigurationArn;

    /**
     * <p>
     * A name for the new service. It must be unique across all the running App Runner services in your AWS account in
     * the AWS Region.
     * </p>
     * 
     * @param serviceName
     *        A name for the new service. It must be unique across all the running App Runner services in your AWS
     *        account in the AWS Region.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * A name for the new service. It must be unique across all the running App Runner services in your AWS account in
     * the AWS Region.
     * </p>
     * 
     * @return A name for the new service. It must be unique across all the running App Runner services in your AWS
     *         account in the AWS Region.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * A name for the new service. It must be unique across all the running App Runner services in your AWS account in
     * the AWS Region.
     * </p>
     * 
     * @param serviceName
     *        A name for the new service. It must be unique across all the running App Runner services in your AWS
     *        account in the AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The source to deploy to the App Runner service. It can be a code or an image repository.
     * </p>
     * 
     * @param sourceConfiguration
     *        The source to deploy to the App Runner service. It can be a code or an image repository.
     */

    public void setSourceConfiguration(SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
    }

    /**
     * <p>
     * The source to deploy to the App Runner service. It can be a code or an image repository.
     * </p>
     * 
     * @return The source to deploy to the App Runner service. It can be a code or an image repository.
     */

    public SourceConfiguration getSourceConfiguration() {
        return this.sourceConfiguration;
    }

    /**
     * <p>
     * The source to deploy to the App Runner service. It can be a code or an image repository.
     * </p>
     * 
     * @param sourceConfiguration
     *        The source to deploy to the App Runner service. It can be a code or an image repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withSourceConfiguration(SourceConfiguration sourceConfiguration) {
        setSourceConfiguration(sourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The runtime configuration of instances (scaling units) of the App Runner service.
     * </p>
     * 
     * @param instanceConfiguration
     *        The runtime configuration of instances (scaling units) of the App Runner service.
     */

    public void setInstanceConfiguration(InstanceConfiguration instanceConfiguration) {
        this.instanceConfiguration = instanceConfiguration;
    }

    /**
     * <p>
     * The runtime configuration of instances (scaling units) of the App Runner service.
     * </p>
     * 
     * @return The runtime configuration of instances (scaling units) of the App Runner service.
     */

    public InstanceConfiguration getInstanceConfiguration() {
        return this.instanceConfiguration;
    }

    /**
     * <p>
     * The runtime configuration of instances (scaling units) of the App Runner service.
     * </p>
     * 
     * @param instanceConfiguration
     *        The runtime configuration of instances (scaling units) of the App Runner service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withInstanceConfiguration(InstanceConfiguration instanceConfiguration) {
        setInstanceConfiguration(instanceConfiguration);
        return this;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with your service resource. A tag is a key-value pair.
     * </p>
     * 
     * @return An optional list of metadata items that you can associate with your service resource. A tag is a
     *         key-value pair.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with your service resource. A tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with your service resource. A tag is a key-value
     *        pair.
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
     * An optional list of metadata items that you can associate with your service resource. A tag is a key-value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with your service resource. A tag is a key-value
     *        pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTags(Tag... tags) {
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
     * An optional list of metadata items that you can associate with your service resource. A tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with your service resource. A tag is a key-value
     *        pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it
     * maintains and your service logs. By default, App Runner uses an AWS managed CMK.
     * </p>
     * 
     * @param encryptionConfiguration
     *        An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that
     *        it maintains and your service logs. By default, App Runner uses an AWS managed CMK.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it
     * maintains and your service logs. By default, App Runner uses an AWS managed CMK.
     * </p>
     * 
     * @return An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that
     *         it maintains and your service logs. By default, App Runner uses an AWS managed CMK.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it
     * maintains and your service logs. By default, App Runner uses an AWS managed CMK.
     * </p>
     * 
     * @param encryptionConfiguration
     *        An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that
     *        it maintains and your service logs. By default, App Runner uses an AWS managed CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The settings for the health check that AWS App Runner performs to monitor the health of your service.
     * </p>
     * 
     * @param healthCheckConfiguration
     *        The settings for the health check that AWS App Runner performs to monitor the health of your service.
     */

    public void setHealthCheckConfiguration(HealthCheckConfiguration healthCheckConfiguration) {
        this.healthCheckConfiguration = healthCheckConfiguration;
    }

    /**
     * <p>
     * The settings for the health check that AWS App Runner performs to monitor the health of your service.
     * </p>
     * 
     * @return The settings for the health check that AWS App Runner performs to monitor the health of your service.
     */

    public HealthCheckConfiguration getHealthCheckConfiguration() {
        return this.healthCheckConfiguration;
    }

    /**
     * <p>
     * The settings for the health check that AWS App Runner performs to monitor the health of your service.
     * </p>
     * 
     * @param healthCheckConfiguration
     *        The settings for the health check that AWS App Runner performs to monitor the health of your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withHealthCheckConfiguration(HealthCheckConfiguration healthCheckConfiguration) {
        setHealthCheckConfiguration(healthCheckConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     * associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling
     * configuration.
     * </p>
     * 
     * @param autoScalingConfigurationArn
     *        The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     *        associate with your service. If not provided, App Runner associates the latest revision of a default auto
     *        scaling configuration.
     */

    public void setAutoScalingConfigurationArn(String autoScalingConfigurationArn) {
        this.autoScalingConfigurationArn = autoScalingConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     * associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling
     * configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     *         associate with your service. If not provided, App Runner associates the latest revision of a default auto
     *         scaling configuration.
     */

    public String getAutoScalingConfigurationArn() {
        return this.autoScalingConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     * associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling
     * configuration.
     * </p>
     * 
     * @param autoScalingConfigurationArn
     *        The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     *        associate with your service. If not provided, App Runner associates the latest revision of a default auto
     *        scaling configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withAutoScalingConfigurationArn(String autoScalingConfigurationArn) {
        setAutoScalingConfigurationArn(autoScalingConfigurationArn);
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getSourceConfiguration() != null)
            sb.append("SourceConfiguration: ").append(getSourceConfiguration()).append(",");
        if (getInstanceConfiguration() != null)
            sb.append("InstanceConfiguration: ").append(getInstanceConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getHealthCheckConfiguration() != null)
            sb.append("HealthCheckConfiguration: ").append(getHealthCheckConfiguration()).append(",");
        if (getAutoScalingConfigurationArn() != null)
            sb.append("AutoScalingConfigurationArn: ").append(getAutoScalingConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceRequest == false)
            return false;
        CreateServiceRequest other = (CreateServiceRequest) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getSourceConfiguration() == null ^ this.getSourceConfiguration() == null)
            return false;
        if (other.getSourceConfiguration() != null && other.getSourceConfiguration().equals(this.getSourceConfiguration()) == false)
            return false;
        if (other.getInstanceConfiguration() == null ^ this.getInstanceConfiguration() == null)
            return false;
        if (other.getInstanceConfiguration() != null && other.getInstanceConfiguration().equals(this.getInstanceConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getHealthCheckConfiguration() == null ^ this.getHealthCheckConfiguration() == null)
            return false;
        if (other.getHealthCheckConfiguration() != null && other.getHealthCheckConfiguration().equals(this.getHealthCheckConfiguration()) == false)
            return false;
        if (other.getAutoScalingConfigurationArn() == null ^ this.getAutoScalingConfigurationArn() == null)
            return false;
        if (other.getAutoScalingConfigurationArn() != null && other.getAutoScalingConfigurationArn().equals(this.getAutoScalingConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getSourceConfiguration() == null) ? 0 : getSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInstanceConfiguration() == null) ? 0 : getInstanceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckConfiguration() == null) ? 0 : getHealthCheckConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingConfigurationArn() == null) ? 0 : getAutoScalingConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceRequest clone() {
        return (CreateServiceRequest) super.clone();
    }

}
