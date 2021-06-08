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
 * Provides summary information for an AWS App Runner service.
 * </p>
 * <p>
 * This type contains limited information about a service. It doesn't include configuration details. It's returned by
 * the <a href="https://docs.aws.amazon.com/apprunner/latest/api/API_ListServices.html">ListServices</a> action.
 * Complete service information is returned by the <a
 * href="https://docs.aws.amazon.com/apprunner/latest/api/API_CreateService.html">CreateService</a>, <a
 * href="https://docs.aws.amazon.com/apprunner/latest/api/API_DescribeService.html">DescribeService</a>, and <a
 * href="https://docs.aws.amazon.com/apprunner/latest/api/API_DeleteService.html">DeleteService</a> actions using the <a
 * href="https://docs.aws.amazon.com/apprunner/latest/api/API_Service.html">Service</a> type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ServiceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The time when the App Runner service was last updated. It's in theUnix time stamp format.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The current state of the App Runner service. These particular values mean the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> – The service failed to create. Read the failure events and logs, change any
     * parameters that need to be fixed, and retry the call to create the service.
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

    public ServiceSummary withServiceName(String serviceName) {
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

    public ServiceSummary withServiceId(String serviceId) {
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

    public ServiceSummary withServiceArn(String serviceArn) {
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

    public ServiceSummary withServiceUrl(String serviceUrl) {
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

    public ServiceSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time when the App Runner service was last updated. It's in theUnix time stamp format.
     * </p>
     * 
     * @param updatedAt
     *        The time when the App Runner service was last updated. It's in theUnix time stamp format.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time when the App Runner service was last updated. It's in theUnix time stamp format.
     * </p>
     * 
     * @return The time when the App Runner service was last updated. It's in theUnix time stamp format.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time when the App Runner service was last updated. It's in theUnix time stamp format.
     * </p>
     * 
     * @param updatedAt
     *        The time when the App Runner service was last updated. It's in theUnix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The current state of the App Runner service. These particular values mean the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> – The service failed to create. Read the failure events and logs, change any
     * parameters that need to be fixed, and retry the call to create the service.
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
     *        <code>CREATE_FAILED</code> – The service failed to create. Read the failure events and logs, change any
     *        parameters that need to be fixed, and retry the call to create the service.
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
     * <code>CREATE_FAILED</code> – The service failed to create. Read the failure events and logs, change any
     * parameters that need to be fixed, and retry the call to create the service.
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
     *         <code>CREATE_FAILED</code> – The service failed to create. Read the failure events and logs, change any
     *         parameters that need to be fixed, and retry the call to create the service.
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
     * <code>CREATE_FAILED</code> – The service failed to create. Read the failure events and logs, change any
     * parameters that need to be fixed, and retry the call to create the service.
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
     *        <code>CREATE_FAILED</code> – The service failed to create. Read the failure events and logs, change any
     *        parameters that need to be fixed, and retry the call to create the service.
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

    public ServiceSummary withStatus(String status) {
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
     * <code>CREATE_FAILED</code> – The service failed to create. Read the failure events and logs, change any
     * parameters that need to be fixed, and retry the call to create the service.
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
     *        <code>CREATE_FAILED</code> – The service failed to create. Read the failure events and logs, change any
     *        parameters that need to be fixed, and retry the call to create the service.
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

    public ServiceSummary withStatus(ServiceStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceSummary == false)
            return false;
        ServiceSummary other = (ServiceSummary) obj;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ServiceSummary clone() {
        try {
            return (ServiceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.ServiceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
