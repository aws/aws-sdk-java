/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateVPCConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVPCConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC connection.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the VPC connection that you are updating. This ID is a unique identifier for each Amazon Web Services
     * Region in anAmazon Web Services account.
     * </p>
     */
    private String vPCConnectionId;
    /**
     * <p>
     * The update status of the VPC connection's last update.
     * </p>
     */
    private String updateStatus;
    /**
     * <p>
     * The availability status of the VPC connection.
     * </p>
     */
    private String availabilityStatus;
    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC connection.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the VPC connection.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the VPC connection.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPC connection.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVPCConnectionResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC connection that you are updating. This ID is a unique identifier for each Amazon Web Services
     * Region in anAmazon Web Services account.
     * </p>
     * 
     * @param vPCConnectionId
     *        The ID of the VPC connection that you are updating. This ID is a unique identifier for each Amazon Web
     *        Services Region in anAmazon Web Services account.
     */

    public void setVPCConnectionId(String vPCConnectionId) {
        this.vPCConnectionId = vPCConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC connection that you are updating. This ID is a unique identifier for each Amazon Web Services
     * Region in anAmazon Web Services account.
     * </p>
     * 
     * @return The ID of the VPC connection that you are updating. This ID is a unique identifier for each Amazon Web
     *         Services Region in anAmazon Web Services account.
     */

    public String getVPCConnectionId() {
        return this.vPCConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC connection that you are updating. This ID is a unique identifier for each Amazon Web Services
     * Region in anAmazon Web Services account.
     * </p>
     * 
     * @param vPCConnectionId
     *        The ID of the VPC connection that you are updating. This ID is a unique identifier for each Amazon Web
     *        Services Region in anAmazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVPCConnectionResult withVPCConnectionId(String vPCConnectionId) {
        setVPCConnectionId(vPCConnectionId);
        return this;
    }

    /**
     * <p>
     * The update status of the VPC connection's last update.
     * </p>
     * 
     * @param updateStatus
     *        The update status of the VPC connection's last update.
     * @see VPCConnectionResourceStatus
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The update status of the VPC connection's last update.
     * </p>
     * 
     * @return The update status of the VPC connection's last update.
     * @see VPCConnectionResourceStatus
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The update status of the VPC connection's last update.
     * </p>
     * 
     * @param updateStatus
     *        The update status of the VPC connection's last update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VPCConnectionResourceStatus
     */

    public UpdateVPCConnectionResult withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * The update status of the VPC connection's last update.
     * </p>
     * 
     * @param updateStatus
     *        The update status of the VPC connection's last update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VPCConnectionResourceStatus
     */

    public UpdateVPCConnectionResult withUpdateStatus(VPCConnectionResourceStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The availability status of the VPC connection.
     * </p>
     * 
     * @param availabilityStatus
     *        The availability status of the VPC connection.
     * @see VPCConnectionAvailabilityStatus
     */

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    /**
     * <p>
     * The availability status of the VPC connection.
     * </p>
     * 
     * @return The availability status of the VPC connection.
     * @see VPCConnectionAvailabilityStatus
     */

    public String getAvailabilityStatus() {
        return this.availabilityStatus;
    }

    /**
     * <p>
     * The availability status of the VPC connection.
     * </p>
     * 
     * @param availabilityStatus
     *        The availability status of the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VPCConnectionAvailabilityStatus
     */

    public UpdateVPCConnectionResult withAvailabilityStatus(String availabilityStatus) {
        setAvailabilityStatus(availabilityStatus);
        return this;
    }

    /**
     * <p>
     * The availability status of the VPC connection.
     * </p>
     * 
     * @param availabilityStatus
     *        The availability status of the VPC connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VPCConnectionAvailabilityStatus
     */

    public UpdateVPCConnectionResult withAvailabilityStatus(VPCConnectionAvailabilityStatus availabilityStatus) {
        this.availabilityStatus = availabilityStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @return The Amazon Web Services request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVPCConnectionResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVPCConnectionResult withStatus(Integer status) {
        setStatus(status);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getVPCConnectionId() != null)
            sb.append("VPCConnectionId: ").append(getVPCConnectionId()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus()).append(",");
        if (getAvailabilityStatus() != null)
            sb.append("AvailabilityStatus: ").append(getAvailabilityStatus()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
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

        if (obj instanceof UpdateVPCConnectionResult == false)
            return false;
        UpdateVPCConnectionResult other = (UpdateVPCConnectionResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVPCConnectionId() == null ^ this.getVPCConnectionId() == null)
            return false;
        if (other.getVPCConnectionId() != null && other.getVPCConnectionId().equals(this.getVPCConnectionId()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        if (other.getAvailabilityStatus() == null ^ this.getAvailabilityStatus() == null)
            return false;
        if (other.getAvailabilityStatus() != null && other.getAvailabilityStatus().equals(this.getAvailabilityStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getVPCConnectionId() == null) ? 0 : getVPCConnectionId().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityStatus() == null) ? 0 : getAvailabilityStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVPCConnectionResult clone() {
        try {
            return (UpdateVPCConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
