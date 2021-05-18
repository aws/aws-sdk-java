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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/UpdateService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want to update.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * The source configuration to apply to the App Runner service.
     * </p>
     * <p>
     * You can change the configuration of the code or image repository that the service uses. However, you can't switch
     * from code to image or the other way around. This means that you must provide the same structure member of
     * <code>SourceConfiguration</code> that you originally included when you created the service. Specifically, you can
     * include either <code>CodeRepository</code> or <code>ImageRepository</code>. To update the source configuration,
     * set the values to members of the structure that you include.
     * </p>
     */
    private SourceConfiguration sourceConfiguration;
    /**
     * <p>
     * The runtime configuration to apply to instances (scaling units) of the App Runner service.
     * </p>
     */
    private InstanceConfiguration instanceConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     * associate with your service.
     * </p>
     */
    private String autoScalingConfigurationArn;
    /**
     * <p>
     * The settings for the health check that AWS App Runner performs to monitor the health of your service.
     * </p>
     */
    private HealthCheckConfiguration healthCheckConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want to update.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the App Runner service that you want to update.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the App Runner service that you want to update.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want to update.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the App Runner service that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * The source configuration to apply to the App Runner service.
     * </p>
     * <p>
     * You can change the configuration of the code or image repository that the service uses. However, you can't switch
     * from code to image or the other way around. This means that you must provide the same structure member of
     * <code>SourceConfiguration</code> that you originally included when you created the service. Specifically, you can
     * include either <code>CodeRepository</code> or <code>ImageRepository</code>. To update the source configuration,
     * set the values to members of the structure that you include.
     * </p>
     * 
     * @param sourceConfiguration
     *        The source configuration to apply to the App Runner service.</p>
     *        <p>
     *        You can change the configuration of the code or image repository that the service uses. However, you can't
     *        switch from code to image or the other way around. This means that you must provide the same structure
     *        member of <code>SourceConfiguration</code> that you originally included when you created the service.
     *        Specifically, you can include either <code>CodeRepository</code> or <code>ImageRepository</code>. To
     *        update the source configuration, set the values to members of the structure that you include.
     */

    public void setSourceConfiguration(SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
    }

    /**
     * <p>
     * The source configuration to apply to the App Runner service.
     * </p>
     * <p>
     * You can change the configuration of the code or image repository that the service uses. However, you can't switch
     * from code to image or the other way around. This means that you must provide the same structure member of
     * <code>SourceConfiguration</code> that you originally included when you created the service. Specifically, you can
     * include either <code>CodeRepository</code> or <code>ImageRepository</code>. To update the source configuration,
     * set the values to members of the structure that you include.
     * </p>
     * 
     * @return The source configuration to apply to the App Runner service.</p>
     *         <p>
     *         You can change the configuration of the code or image repository that the service uses. However, you
     *         can't switch from code to image or the other way around. This means that you must provide the same
     *         structure member of <code>SourceConfiguration</code> that you originally included when you created the
     *         service. Specifically, you can include either <code>CodeRepository</code> or <code>ImageRepository</code>
     *         . To update the source configuration, set the values to members of the structure that you include.
     */

    public SourceConfiguration getSourceConfiguration() {
        return this.sourceConfiguration;
    }

    /**
     * <p>
     * The source configuration to apply to the App Runner service.
     * </p>
     * <p>
     * You can change the configuration of the code or image repository that the service uses. However, you can't switch
     * from code to image or the other way around. This means that you must provide the same structure member of
     * <code>SourceConfiguration</code> that you originally included when you created the service. Specifically, you can
     * include either <code>CodeRepository</code> or <code>ImageRepository</code>. To update the source configuration,
     * set the values to members of the structure that you include.
     * </p>
     * 
     * @param sourceConfiguration
     *        The source configuration to apply to the App Runner service.</p>
     *        <p>
     *        You can change the configuration of the code or image repository that the service uses. However, you can't
     *        switch from code to image or the other way around. This means that you must provide the same structure
     *        member of <code>SourceConfiguration</code> that you originally included when you created the service.
     *        Specifically, you can include either <code>CodeRepository</code> or <code>ImageRepository</code>. To
     *        update the source configuration, set the values to members of the structure that you include.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withSourceConfiguration(SourceConfiguration sourceConfiguration) {
        setSourceConfiguration(sourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The runtime configuration to apply to instances (scaling units) of the App Runner service.
     * </p>
     * 
     * @param instanceConfiguration
     *        The runtime configuration to apply to instances (scaling units) of the App Runner service.
     */

    public void setInstanceConfiguration(InstanceConfiguration instanceConfiguration) {
        this.instanceConfiguration = instanceConfiguration;
    }

    /**
     * <p>
     * The runtime configuration to apply to instances (scaling units) of the App Runner service.
     * </p>
     * 
     * @return The runtime configuration to apply to instances (scaling units) of the App Runner service.
     */

    public InstanceConfiguration getInstanceConfiguration() {
        return this.instanceConfiguration;
    }

    /**
     * <p>
     * The runtime configuration to apply to instances (scaling units) of the App Runner service.
     * </p>
     * 
     * @param instanceConfiguration
     *        The runtime configuration to apply to instances (scaling units) of the App Runner service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withInstanceConfiguration(InstanceConfiguration instanceConfiguration) {
        setInstanceConfiguration(instanceConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     * associate with your service.
     * </p>
     * 
     * @param autoScalingConfigurationArn
     *        The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     *        associate with your service.
     */

    public void setAutoScalingConfigurationArn(String autoScalingConfigurationArn) {
        this.autoScalingConfigurationArn = autoScalingConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     * associate with your service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     *         associate with your service.
     */

    public String getAutoScalingConfigurationArn() {
        return this.autoScalingConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     * associate with your service.
     * </p>
     * 
     * @param autoScalingConfigurationArn
     *        The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that you want to
     *        associate with your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withAutoScalingConfigurationArn(String autoScalingConfigurationArn) {
        setAutoScalingConfigurationArn(autoScalingConfigurationArn);
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

    public UpdateServiceRequest withHealthCheckConfiguration(HealthCheckConfiguration healthCheckConfiguration) {
        setHealthCheckConfiguration(healthCheckConfiguration);
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
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getSourceConfiguration() != null)
            sb.append("SourceConfiguration: ").append(getSourceConfiguration()).append(",");
        if (getInstanceConfiguration() != null)
            sb.append("InstanceConfiguration: ").append(getInstanceConfiguration()).append(",");
        if (getAutoScalingConfigurationArn() != null)
            sb.append("AutoScalingConfigurationArn: ").append(getAutoScalingConfigurationArn()).append(",");
        if (getHealthCheckConfiguration() != null)
            sb.append("HealthCheckConfiguration: ").append(getHealthCheckConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceRequest == false)
            return false;
        UpdateServiceRequest other = (UpdateServiceRequest) obj;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getSourceConfiguration() == null ^ this.getSourceConfiguration() == null)
            return false;
        if (other.getSourceConfiguration() != null && other.getSourceConfiguration().equals(this.getSourceConfiguration()) == false)
            return false;
        if (other.getInstanceConfiguration() == null ^ this.getInstanceConfiguration() == null)
            return false;
        if (other.getInstanceConfiguration() != null && other.getInstanceConfiguration().equals(this.getInstanceConfiguration()) == false)
            return false;
        if (other.getAutoScalingConfigurationArn() == null ^ this.getAutoScalingConfigurationArn() == null)
            return false;
        if (other.getAutoScalingConfigurationArn() != null && other.getAutoScalingConfigurationArn().equals(this.getAutoScalingConfigurationArn()) == false)
            return false;
        if (other.getHealthCheckConfiguration() == null ^ this.getHealthCheckConfiguration() == null)
            return false;
        if (other.getHealthCheckConfiguration() != null && other.getHealthCheckConfiguration().equals(this.getHealthCheckConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getSourceConfiguration() == null) ? 0 : getSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInstanceConfiguration() == null) ? 0 : getInstanceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingConfigurationArn() == null) ? 0 : getAutoScalingConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckConfiguration() == null) ? 0 : getHealthCheckConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceRequest clone() {
        return (UpdateServiceRequest) super.clone();
    }

}
