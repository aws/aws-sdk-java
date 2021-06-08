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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an AWS App Runner service. It can describe a service in any state, including deleted services.
 * </p>
 * <p>
 * This type contains the full information about a service, including configuration details. It's returned by the <a
 * href="https://docs.aws.amazon.com/apprunner/latest/api/API_CreateService.html">CreateService</a>, <a
 * href="https://docs.aws.amazon.com/apprunner/latest/api/API_DescribeService.html">DescribeService</a>, and <a
 * href="https://docs.aws.amazon.com/apprunner/latest/api/API_DeleteService.html">DeleteService</a> actions. A subset of
 * this information is returned by the <a
 * href="https://docs.aws.amazon.com/apprunner/latest/api/API_ListServices.html">ListServices</a> action using the <a
 * href="https://docs.aws.amazon.com/apprunner/latest/api/API_ServiceSummary.html">ServiceSummary</a> type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/Service" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Service implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The customer-provided service name.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * An ID that App Runner generated for this service. It's unique within the AWS Region.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of this service.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * A subdomain URL that App Runner generated for this service. You can use this URL to access your service web
     * application.
     * </p>
     */
    private String serviceUrl;
    /**
     * <p>
     * The time when the App Runner service was created. It's in the Unix time stamp format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time when the App Runner service was last updated at. It's in the Unix time stamp format.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The time when the App Runner service was deleted. It's in the Unix time stamp format.
     * </p>
     */
    private java.util.Date deletedAt;
    /**
     * <p>
     * The current state of the App Runner service. These particular values mean the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> – The service failed to create. To troubleshoot this failure, read the failure events
     * and logs, change any parameters that need to be fixed, and retry the call to create the service.
     * </p>
     * <p>
     * The failed service isn't usable, and still counts towards your service quota. When you're done analyzing the
     * failure, delete the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> – The service failed to delete and can't be successfully recovered. Retry the service
     * deletion call to ensure that all related resources are removed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The source deployed to the App Runner service. It can be a code or an image repository.
     * </p>
     */
    private SourceConfiguration sourceConfiguration;
    /**
     * <p>
     * The runtime configuration of instances (scaling units) of this service.
     * </p>
     */
    private InstanceConfiguration instanceConfiguration;
    /**
     * <p>
     * The encryption key that App Runner uses to encrypt the service logs and the copy of the source repository that
     * App Runner maintains for the service. It can be either a customer-provided encryption key or an AWS managed CMK.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * The settings for the health check that App Runner performs to monitor the health of this service.
     * </p>
     */
    private HealthCheckConfiguration healthCheckConfiguration;
    /**
     * <p>
     * Summary information for the App Runner automatic scaling configuration resource that's associated with this
     * service.
     * </p>
     */
    private AutoScalingConfigurationSummary autoScalingConfigurationSummary;

    /**
     * <p>
     * The customer-provided service name.
     * </p>
     * 
     * @param serviceName
     *        The customer-provided service name.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The customer-provided service name.
     * </p>
     * 
     * @return The customer-provided service name.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The customer-provided service name.
     * </p>
     * 
     * @param serviceName
     *        The customer-provided service name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * An ID that App Runner generated for this service. It's unique within the AWS Region.
     * </p>
     * 
     * @param serviceId
     *        An ID that App Runner generated for this service. It's unique within the AWS Region.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * An ID that App Runner generated for this service. It's unique within the AWS Region.
     * </p>
     * 
     * @return An ID that App Runner generated for this service. It's unique within the AWS Region.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * An ID that App Runner generated for this service. It's unique within the AWS Region.
     * </p>
     * 
     * @param serviceId
     *        An ID that App Runner generated for this service. It's unique within the AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this service.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of this service.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of this service.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this service.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * A subdomain URL that App Runner generated for this service. You can use this URL to access your service web
     * application.
     * </p>
     * 
     * @param serviceUrl
     *        A subdomain URL that App Runner generated for this service. You can use this URL to access your service
     *        web application.
     */

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    /**
     * <p>
     * A subdomain URL that App Runner generated for this service. You can use this URL to access your service web
     * application.
     * </p>
     * 
     * @return A subdomain URL that App Runner generated for this service. You can use this URL to access your service
     *         web application.
     */

    public String getServiceUrl() {
        return this.serviceUrl;
    }

    /**
     * <p>
     * A subdomain URL that App Runner generated for this service. You can use this URL to access your service web
     * application.
     * </p>
     * 
     * @param serviceUrl
     *        A subdomain URL that App Runner generated for this service. You can use this URL to access your service
     *        web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withServiceUrl(String serviceUrl) {
        setServiceUrl(serviceUrl);
        return this;
    }

    /**
     * <p>
     * The time when the App Runner service was created. It's in the Unix time stamp format.
     * </p>
     * 
     * @param createdAt
     *        The time when the App Runner service was created. It's in the Unix time stamp format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the App Runner service was created. It's in the Unix time stamp format.
     * </p>
     * 
     * @return The time when the App Runner service was created. It's in the Unix time stamp format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the App Runner service was created. It's in the Unix time stamp format.
     * </p>
     * 
     * @param createdAt
     *        The time when the App Runner service was created. It's in the Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time when the App Runner service was last updated at. It's in the Unix time stamp format.
     * </p>
     * 
     * @param updatedAt
     *        The time when the App Runner service was last updated at. It's in the Unix time stamp format.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time when the App Runner service was last updated at. It's in the Unix time stamp format.
     * </p>
     * 
     * @return The time when the App Runner service was last updated at. It's in the Unix time stamp format.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time when the App Runner service was last updated at. It's in the Unix time stamp format.
     * </p>
     * 
     * @param updatedAt
     *        The time when the App Runner service was last updated at. It's in the Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The time when the App Runner service was deleted. It's in the Unix time stamp format.
     * </p>
     * 
     * @param deletedAt
     *        The time when the App Runner service was deleted. It's in the Unix time stamp format.
     */

    public void setDeletedAt(java.util.Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * <p>
     * The time when the App Runner service was deleted. It's in the Unix time stamp format.
     * </p>
     * 
     * @return The time when the App Runner service was deleted. It's in the Unix time stamp format.
     */

    public java.util.Date getDeletedAt() {
        return this.deletedAt;
    }

    /**
     * <p>
     * The time when the App Runner service was deleted. It's in the Unix time stamp format.
     * </p>
     * 
     * @param deletedAt
     *        The time when the App Runner service was deleted. It's in the Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withDeletedAt(java.util.Date deletedAt) {
        setDeletedAt(deletedAt);
        return this;
    }

    /**
     * <p>
     * The current state of the App Runner service. These particular values mean the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> – The service failed to create. To troubleshoot this failure, read the failure events
     * and logs, change any parameters that need to be fixed, and retry the call to create the service.
     * </p>
     * <p>
     * The failed service isn't usable, and still counts towards your service quota. When you're done analyzing the
     * failure, delete the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> – The service failed to delete and can't be successfully recovered. Retry the service
     * deletion call to ensure that all related resources are removed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current state of the App Runner service. These particular values mean the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> – The service failed to create. To troubleshoot this failure, read the failure
     *        events and logs, change any parameters that need to be fixed, and retry the call to create the service.
     *        </p>
     *        <p>
     *        The failed service isn't usable, and still counts towards your service quota. When you're done analyzing
     *        the failure, delete the service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> – The service failed to delete and can't be successfully recovered. Retry the
     *        service deletion call to ensure that all related resources are removed.
     *        </p>
     *        </li>
     * @see ServiceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the App Runner service. These particular values mean the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> – The service failed to create. To troubleshoot this failure, read the failure events
     * and logs, change any parameters that need to be fixed, and retry the call to create the service.
     * </p>
     * <p>
     * The failed service isn't usable, and still counts towards your service quota. When you're done analyzing the
     * failure, delete the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> – The service failed to delete and can't be successfully recovered. Retry the service
     * deletion call to ensure that all related resources are removed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the App Runner service. These particular values mean the following.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_FAILED</code> – The service failed to create. To troubleshoot this failure, read the failure
     *         events and logs, change any parameters that need to be fixed, and retry the call to create the service.
     *         </p>
     *         <p>
     *         The failed service isn't usable, and still counts towards your service quota. When you're done analyzing
     *         the failure, delete the service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_FAILED</code> – The service failed to delete and can't be successfully recovered. Retry the
     *         service deletion call to ensure that all related resources are removed.
     *         </p>
     *         </li>
     * @see ServiceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the App Runner service. These particular values mean the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> – The service failed to create. To troubleshoot this failure, read the failure events
     * and logs, change any parameters that need to be fixed, and retry the call to create the service.
     * </p>
     * <p>
     * The failed service isn't usable, and still counts towards your service quota. When you're done analyzing the
     * failure, delete the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> – The service failed to delete and can't be successfully recovered. Retry the service
     * deletion call to ensure that all related resources are removed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current state of the App Runner service. These particular values mean the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> – The service failed to create. To troubleshoot this failure, read the failure
     *        events and logs, change any parameters that need to be fixed, and retry the call to create the service.
     *        </p>
     *        <p>
     *        The failed service isn't usable, and still counts towards your service quota. When you're done analyzing
     *        the failure, delete the service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> – The service failed to delete and can't be successfully recovered. Retry the
     *        service deletion call to ensure that all related resources are removed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceStatus
     */

    public Service withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the App Runner service. These particular values mean the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> – The service failed to create. To troubleshoot this failure, read the failure events
     * and logs, change any parameters that need to be fixed, and retry the call to create the service.
     * </p>
     * <p>
     * The failed service isn't usable, and still counts towards your service quota. When you're done analyzing the
     * failure, delete the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code> – The service failed to delete and can't be successfully recovered. Retry the service
     * deletion call to ensure that all related resources are removed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current state of the App Runner service. These particular values mean the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> – The service failed to create. To troubleshoot this failure, read the failure
     *        events and logs, change any parameters that need to be fixed, and retry the call to create the service.
     *        </p>
     *        <p>
     *        The failed service isn't usable, and still counts towards your service quota. When you're done analyzing
     *        the failure, delete the service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code> – The service failed to delete and can't be successfully recovered. Retry the
     *        service deletion call to ensure that all related resources are removed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceStatus
     */

    public Service withStatus(ServiceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The source deployed to the App Runner service. It can be a code or an image repository.
     * </p>
     * 
     * @param sourceConfiguration
     *        The source deployed to the App Runner service. It can be a code or an image repository.
     */

    public void setSourceConfiguration(SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
    }

    /**
     * <p>
     * The source deployed to the App Runner service. It can be a code or an image repository.
     * </p>
     * 
     * @return The source deployed to the App Runner service. It can be a code or an image repository.
     */

    public SourceConfiguration getSourceConfiguration() {
        return this.sourceConfiguration;
    }

    /**
     * <p>
     * The source deployed to the App Runner service. It can be a code or an image repository.
     * </p>
     * 
     * @param sourceConfiguration
     *        The source deployed to the App Runner service. It can be a code or an image repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withSourceConfiguration(SourceConfiguration sourceConfiguration) {
        setSourceConfiguration(sourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The runtime configuration of instances (scaling units) of this service.
     * </p>
     * 
     * @param instanceConfiguration
     *        The runtime configuration of instances (scaling units) of this service.
     */

    public void setInstanceConfiguration(InstanceConfiguration instanceConfiguration) {
        this.instanceConfiguration = instanceConfiguration;
    }

    /**
     * <p>
     * The runtime configuration of instances (scaling units) of this service.
     * </p>
     * 
     * @return The runtime configuration of instances (scaling units) of this service.
     */

    public InstanceConfiguration getInstanceConfiguration() {
        return this.instanceConfiguration;
    }

    /**
     * <p>
     * The runtime configuration of instances (scaling units) of this service.
     * </p>
     * 
     * @param instanceConfiguration
     *        The runtime configuration of instances (scaling units) of this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withInstanceConfiguration(InstanceConfiguration instanceConfiguration) {
        setInstanceConfiguration(instanceConfiguration);
        return this;
    }

    /**
     * <p>
     * The encryption key that App Runner uses to encrypt the service logs and the copy of the source repository that
     * App Runner maintains for the service. It can be either a customer-provided encryption key or an AWS managed CMK.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption key that App Runner uses to encrypt the service logs and the copy of the source repository
     *        that App Runner maintains for the service. It can be either a customer-provided encryption key or an AWS
     *        managed CMK.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption key that App Runner uses to encrypt the service logs and the copy of the source repository that
     * App Runner maintains for the service. It can be either a customer-provided encryption key or an AWS managed CMK.
     * </p>
     * 
     * @return The encryption key that App Runner uses to encrypt the service logs and the copy of the source repository
     *         that App Runner maintains for the service. It can be either a customer-provided encryption key or an AWS
     *         managed CMK.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption key that App Runner uses to encrypt the service logs and the copy of the source repository that
     * App Runner maintains for the service. It can be either a customer-provided encryption key or an AWS managed CMK.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption key that App Runner uses to encrypt the service logs and the copy of the source repository
     *        that App Runner maintains for the service. It can be either a customer-provided encryption key or an AWS
     *        managed CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The settings for the health check that App Runner performs to monitor the health of this service.
     * </p>
     * 
     * @param healthCheckConfiguration
     *        The settings for the health check that App Runner performs to monitor the health of this service.
     */

    public void setHealthCheckConfiguration(HealthCheckConfiguration healthCheckConfiguration) {
        this.healthCheckConfiguration = healthCheckConfiguration;
    }

    /**
     * <p>
     * The settings for the health check that App Runner performs to monitor the health of this service.
     * </p>
     * 
     * @return The settings for the health check that App Runner performs to monitor the health of this service.
     */

    public HealthCheckConfiguration getHealthCheckConfiguration() {
        return this.healthCheckConfiguration;
    }

    /**
     * <p>
     * The settings for the health check that App Runner performs to monitor the health of this service.
     * </p>
     * 
     * @param healthCheckConfiguration
     *        The settings for the health check that App Runner performs to monitor the health of this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withHealthCheckConfiguration(HealthCheckConfiguration healthCheckConfiguration) {
        setHealthCheckConfiguration(healthCheckConfiguration);
        return this;
    }

    /**
     * <p>
     * Summary information for the App Runner automatic scaling configuration resource that's associated with this
     * service.
     * </p>
     * 
     * @param autoScalingConfigurationSummary
     *        Summary information for the App Runner automatic scaling configuration resource that's associated with
     *        this service.
     */

    public void setAutoScalingConfigurationSummary(AutoScalingConfigurationSummary autoScalingConfigurationSummary) {
        this.autoScalingConfigurationSummary = autoScalingConfigurationSummary;
    }

    /**
     * <p>
     * Summary information for the App Runner automatic scaling configuration resource that's associated with this
     * service.
     * </p>
     * 
     * @return Summary information for the App Runner automatic scaling configuration resource that's associated with
     *         this service.
     */

    public AutoScalingConfigurationSummary getAutoScalingConfigurationSummary() {
        return this.autoScalingConfigurationSummary;
    }

    /**
     * <p>
     * Summary information for the App Runner automatic scaling configuration resource that's associated with this
     * service.
     * </p>
     * 
     * @param autoScalingConfigurationSummary
     *        Summary information for the App Runner automatic scaling configuration resource that's associated with
     *        this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withAutoScalingConfigurationSummary(AutoScalingConfigurationSummary autoScalingConfigurationSummary) {
        setAutoScalingConfigurationSummary(autoScalingConfigurationSummary);
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
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getServiceUrl() != null)
            sb.append("ServiceUrl: ").append(getServiceUrl()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getDeletedAt() != null)
            sb.append("DeletedAt: ").append(getDeletedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSourceConfiguration() != null)
            sb.append("SourceConfiguration: ").append(getSourceConfiguration()).append(",");
        if (getInstanceConfiguration() != null)
            sb.append("InstanceConfiguration: ").append(getInstanceConfiguration()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getHealthCheckConfiguration() != null)
            sb.append("HealthCheckConfiguration: ").append(getHealthCheckConfiguration()).append(",");
        if (getAutoScalingConfigurationSummary() != null)
            sb.append("AutoScalingConfigurationSummary: ").append(getAutoScalingConfigurationSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Service == false)
            return false;
        Service other = (Service) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getServiceUrl() == null ^ this.getServiceUrl() == null)
            return false;
        if (other.getServiceUrl() != null && other.getServiceUrl().equals(this.getServiceUrl()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getDeletedAt() == null ^ this.getDeletedAt() == null)
            return false;
        if (other.getDeletedAt() != null && other.getDeletedAt().equals(this.getDeletedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSourceConfiguration() == null ^ this.getSourceConfiguration() == null)
            return false;
        if (other.getSourceConfiguration() != null && other.getSourceConfiguration().equals(this.getSourceConfiguration()) == false)
            return false;
        if (other.getInstanceConfiguration() == null ^ this.getInstanceConfiguration() == null)
            return false;
        if (other.getInstanceConfiguration() != null && other.getInstanceConfiguration().equals(this.getInstanceConfiguration()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getHealthCheckConfiguration() == null ^ this.getHealthCheckConfiguration() == null)
            return false;
        if (other.getHealthCheckConfiguration() != null && other.getHealthCheckConfiguration().equals(this.getHealthCheckConfiguration()) == false)
            return false;
        if (other.getAutoScalingConfigurationSummary() == null ^ this.getAutoScalingConfigurationSummary() == null)
            return false;
        if (other.getAutoScalingConfigurationSummary() != null
                && other.getAutoScalingConfigurationSummary().equals(this.getAutoScalingConfigurationSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getServiceUrl() == null) ? 0 : getServiceUrl().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeletedAt() == null) ? 0 : getDeletedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceConfiguration() == null) ? 0 : getSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInstanceConfiguration() == null) ? 0 : getInstanceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckConfiguration() == null) ? 0 : getHealthCheckConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingConfigurationSummary() == null) ? 0 : getAutoScalingConfigurationSummary().hashCode());
        return hashCode;
    }

    @Override
    public Service clone() {
        try {
            return (Service) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.ServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
