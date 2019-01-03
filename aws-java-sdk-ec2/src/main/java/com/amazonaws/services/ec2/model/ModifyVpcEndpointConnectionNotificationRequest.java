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
import com.amazonaws.services.ec2.model.transform.ModifyVpcEndpointConnectionNotificationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpcEndpointConnectionNotificationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyVpcEndpointConnectionNotificationRequest> {

    /**
     * <p>
     * The ID of the notification.
     * </p>
     */
    private String connectionNotificationId;
    /**
     * <p>
     * The ARN for the SNS topic for the notification.
     * </p>
     */
    private String connectionNotificationArn;
    /**
     * <p>
     * One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>,
     * <code>Delete</code>, and <code>Reject</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> connectionEvents;

    /**
     * <p>
     * The ID of the notification.
     * </p>
     * 
     * @param connectionNotificationId
     *        The ID of the notification.
     */

    public void setConnectionNotificationId(String connectionNotificationId) {
        this.connectionNotificationId = connectionNotificationId;
    }

    /**
     * <p>
     * The ID of the notification.
     * </p>
     * 
     * @return The ID of the notification.
     */

    public String getConnectionNotificationId() {
        return this.connectionNotificationId;
    }

    /**
     * <p>
     * The ID of the notification.
     * </p>
     * 
     * @param connectionNotificationId
     *        The ID of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointConnectionNotificationRequest withConnectionNotificationId(String connectionNotificationId) {
        setConnectionNotificationId(connectionNotificationId);
        return this;
    }

    /**
     * <p>
     * The ARN for the SNS topic for the notification.
     * </p>
     * 
     * @param connectionNotificationArn
     *        The ARN for the SNS topic for the notification.
     */

    public void setConnectionNotificationArn(String connectionNotificationArn) {
        this.connectionNotificationArn = connectionNotificationArn;
    }

    /**
     * <p>
     * The ARN for the SNS topic for the notification.
     * </p>
     * 
     * @return The ARN for the SNS topic for the notification.
     */

    public String getConnectionNotificationArn() {
        return this.connectionNotificationArn;
    }

    /**
     * <p>
     * The ARN for the SNS topic for the notification.
     * </p>
     * 
     * @param connectionNotificationArn
     *        The ARN for the SNS topic for the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointConnectionNotificationRequest withConnectionNotificationArn(String connectionNotificationArn) {
        setConnectionNotificationArn(connectionNotificationArn);
        return this;
    }

    /**
     * <p>
     * One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>,
     * <code>Delete</code>, and <code>Reject</code>.
     * </p>
     * 
     * @return One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>,
     *         <code>Delete</code>, and <code>Reject</code>.
     */

    public java.util.List<String> getConnectionEvents() {
        if (connectionEvents == null) {
            connectionEvents = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return connectionEvents;
    }

    /**
     * <p>
     * One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>,
     * <code>Delete</code>, and <code>Reject</code>.
     * </p>
     * 
     * @param connectionEvents
     *        One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>,
     *        <code>Delete</code>, and <code>Reject</code>.
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
     * One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>,
     * <code>Delete</code>, and <code>Reject</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectionEvents(java.util.Collection)} or {@link #withConnectionEvents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param connectionEvents
     *        One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>,
     *        <code>Delete</code>, and <code>Reject</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointConnectionNotificationRequest withConnectionEvents(String... connectionEvents) {
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
     * One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>,
     * <code>Delete</code>, and <code>Reject</code>.
     * </p>
     * 
     * @param connectionEvents
     *        One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>,
     *        <code>Delete</code>, and <code>Reject</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointConnectionNotificationRequest withConnectionEvents(java.util.Collection<String> connectionEvents) {
        setConnectionEvents(connectionEvents);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVpcEndpointConnectionNotificationRequest> getDryRunRequest() {
        Request<ModifyVpcEndpointConnectionNotificationRequest> request = new ModifyVpcEndpointConnectionNotificationRequestMarshaller().marshall(this);
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
        if (getConnectionNotificationId() != null)
            sb.append("ConnectionNotificationId: ").append(getConnectionNotificationId()).append(",");
        if (getConnectionNotificationArn() != null)
            sb.append("ConnectionNotificationArn: ").append(getConnectionNotificationArn()).append(",");
        if (getConnectionEvents() != null)
            sb.append("ConnectionEvents: ").append(getConnectionEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcEndpointConnectionNotificationRequest == false)
            return false;
        ModifyVpcEndpointConnectionNotificationRequest other = (ModifyVpcEndpointConnectionNotificationRequest) obj;
        if (other.getConnectionNotificationId() == null ^ this.getConnectionNotificationId() == null)
            return false;
        if (other.getConnectionNotificationId() != null && other.getConnectionNotificationId().equals(this.getConnectionNotificationId()) == false)
            return false;
        if (other.getConnectionNotificationArn() == null ^ this.getConnectionNotificationArn() == null)
            return false;
        if (other.getConnectionNotificationArn() != null && other.getConnectionNotificationArn().equals(this.getConnectionNotificationArn()) == false)
            return false;
        if (other.getConnectionEvents() == null ^ this.getConnectionEvents() == null)
            return false;
        if (other.getConnectionEvents() != null && other.getConnectionEvents().equals(this.getConnectionEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionNotificationId() == null) ? 0 : getConnectionNotificationId().hashCode());
        hashCode = prime * hashCode + ((getConnectionNotificationArn() == null) ? 0 : getConnectionNotificationArn().hashCode());
        hashCode = prime * hashCode + ((getConnectionEvents() == null) ? 0 : getConnectionEvents().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpcEndpointConnectionNotificationRequest clone() {
        return (ModifyVpcEndpointConnectionNotificationRequest) super.clone();
    }
}
