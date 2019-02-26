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
import com.amazonaws.services.ec2.model.transform.DeleteVpcEndpointConnectionNotificationsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVpcEndpointConnectionNotificationsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteVpcEndpointConnectionNotificationsRequest> {

    /**
     * <p>
     * One or more notification IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> connectionNotificationIds;

    /**
     * <p>
     * One or more notification IDs.
     * </p>
     * 
     * @return One or more notification IDs.
     */

    public java.util.List<String> getConnectionNotificationIds() {
        if (connectionNotificationIds == null) {
            connectionNotificationIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return connectionNotificationIds;
    }

    /**
     * <p>
     * One or more notification IDs.
     * </p>
     * 
     * @param connectionNotificationIds
     *        One or more notification IDs.
     */

    public void setConnectionNotificationIds(java.util.Collection<String> connectionNotificationIds) {
        if (connectionNotificationIds == null) {
            this.connectionNotificationIds = null;
            return;
        }

        this.connectionNotificationIds = new com.amazonaws.internal.SdkInternalList<String>(connectionNotificationIds);
    }

    /**
     * <p>
     * One or more notification IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectionNotificationIds(java.util.Collection)} or
     * {@link #withConnectionNotificationIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param connectionNotificationIds
     *        One or more notification IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcEndpointConnectionNotificationsRequest withConnectionNotificationIds(String... connectionNotificationIds) {
        if (this.connectionNotificationIds == null) {
            setConnectionNotificationIds(new com.amazonaws.internal.SdkInternalList<String>(connectionNotificationIds.length));
        }
        for (String ele : connectionNotificationIds) {
            this.connectionNotificationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more notification IDs.
     * </p>
     * 
     * @param connectionNotificationIds
     *        One or more notification IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcEndpointConnectionNotificationsRequest withConnectionNotificationIds(java.util.Collection<String> connectionNotificationIds) {
        setConnectionNotificationIds(connectionNotificationIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteVpcEndpointConnectionNotificationsRequest> getDryRunRequest() {
        Request<DeleteVpcEndpointConnectionNotificationsRequest> request = new DeleteVpcEndpointConnectionNotificationsRequestMarshaller().marshall(this);
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
        if (getConnectionNotificationIds() != null)
            sb.append("ConnectionNotificationIds: ").append(getConnectionNotificationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVpcEndpointConnectionNotificationsRequest == false)
            return false;
        DeleteVpcEndpointConnectionNotificationsRequest other = (DeleteVpcEndpointConnectionNotificationsRequest) obj;
        if (other.getConnectionNotificationIds() == null ^ this.getConnectionNotificationIds() == null)
            return false;
        if (other.getConnectionNotificationIds() != null && other.getConnectionNotificationIds().equals(this.getConnectionNotificationIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionNotificationIds() == null) ? 0 : getConnectionNotificationIds().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVpcEndpointConnectionNotificationsRequest clone() {
        return (DeleteVpcEndpointConnectionNotificationsRequest) super.clone();
    }
}
