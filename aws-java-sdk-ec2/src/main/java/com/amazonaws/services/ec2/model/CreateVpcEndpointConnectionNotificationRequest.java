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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateVpcEndpointConnectionNotificationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcEndpointConnectionNotificationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateVpcEndpointConnectionNotificationRequest> {

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * The ARN of the SNS topic for the notifications.
     * </p>
     */
    private String connectionNotificationArn;
    /**
     * <p>
     * One or more endpoint events for which to receive notifications. Valid values are <code>Accept</code>,
     * <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> connectionEvents;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the endpoint service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * 
     * @return The ID of the endpoint service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointConnectionNotificationRequest withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the endpoint.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * 
     * @return The ID of the endpoint.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointConnectionNotificationRequest withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * The ARN of the SNS topic for the notifications.
     * </p>
     * 
     * @param connectionNotificationArn
     *        The ARN of the SNS topic for the notifications.
     */

    public void setConnectionNotificationArn(String connectionNotificationArn) {
        this.connectionNotificationArn = connectionNotificationArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic for the notifications.
     * </p>
     * 
     * @return The ARN of the SNS topic for the notifications.
     */

    public String getConnectionNotificationArn() {
        return this.connectionNotificationArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic for the notifications.
     * </p>
     * 
     * @param connectionNotificationArn
     *        The ARN of the SNS topic for the notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointConnectionNotificationRequest withConnectionNotificationArn(String connectionNotificationArn) {
        setConnectionNotificationArn(connectionNotificationArn);
        return this;
    }

    /**
     * <p>
     * One or more endpoint events for which to receive notifications. Valid values are <code>Accept</code>,
     * <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     * 
     * @return One or more endpoint events for which to receive notifications. Valid values are <code>Accept</code>,
     *         <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     */

    public java.util.List<String> getConnectionEvents() {
        if (connectionEvents == null) {
            connectionEvents = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return connectionEvents;
    }

    /**
     * <p>
     * One or more endpoint events for which to receive notifications. Valid values are <code>Accept</code>,
     * <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     * 
     * @param connectionEvents
     *        One or more endpoint events for which to receive notifications. Valid values are <code>Accept</code>,
     *        <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     */

    public void setConnectionEvents(java.util.Collection<String> connectionEvents) {
        if (connectionEvents == null) {
            this.connectionEvents = null;
            return;
        }

        this.connectionEvents = new com.amazonaws.internal.SdkInternalList<String>(connectionEvents);
    }

    /**
     * <p>
     * One or more endpoint events for which to receive notifications. Valid values are <code>Accept</code>,
     * <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectionEvents(java.util.Collection)} or {@link #withConnectionEvents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param connectionEvents
     *        One or more endpoint events for which to receive notifications. Valid values are <code>Accept</code>,
     *        <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointConnectionNotificationRequest withConnectionEvents(String... connectionEvents) {
        if (this.connectionEvents == null) {
            setConnectionEvents(new com.amazonaws.internal.SdkInternalList<String>(connectionEvents.length));
        }
        for (String ele : connectionEvents) {
            this.connectionEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more endpoint events for which to receive notifications. Valid values are <code>Accept</code>,
     * <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     * 
     * @param connectionEvents
     *        One or more endpoint events for which to receive notifications. Valid values are <code>Accept</code>,
     *        <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointConnectionNotificationRequest withConnectionEvents(java.util.Collection<String> connectionEvents) {
        setConnectionEvents(connectionEvents);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointConnectionNotificationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVpcEndpointConnectionNotificationRequest> getDryRunRequest() {
        Request<CreateVpcEndpointConnectionNotificationRequest> request = new CreateVpcEndpointConnectionNotificationRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getConnectionNotificationArn() != null)
            sb.append("ConnectionNotificationArn: ").append(getConnectionNotificationArn()).append(",");
        if (getConnectionEvents() != null)
            sb.append("ConnectionEvents: ").append(getConnectionEvents()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcEndpointConnectionNotificationRequest == false)
            return false;
        CreateVpcEndpointConnectionNotificationRequest other = (CreateVpcEndpointConnectionNotificationRequest) obj;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getConnectionNotificationArn() == null ^ this.getConnectionNotificationArn() == null)
            return false;
        if (other.getConnectionNotificationArn() != null && other.getConnectionNotificationArn().equals(this.getConnectionNotificationArn()) == false)
            return false;
        if (other.getConnectionEvents() == null ^ this.getConnectionEvents() == null)
            return false;
        if (other.getConnectionEvents() != null && other.getConnectionEvents().equals(this.getConnectionEvents()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getConnectionNotificationArn() == null) ? 0 : getConnectionNotificationArn().hashCode());
        hashCode = prime * hashCode + ((getConnectionEvents() == null) ? 0 : getConnectionEvents().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcEndpointConnectionNotificationRequest clone() {
        return (CreateVpcEndpointConnectionNotificationRequest) super.clone();
    }
}
