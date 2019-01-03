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
import com.amazonaws.services.ec2.model.transform.CreateNetworkInterfacePermissionRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateNetworkInterfacePermission.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkInterfacePermissionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateNetworkInterfacePermissionRequest> {

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The AWS service. Currently not supported.
     * </p>
     */
    private String awsService;
    /**
     * <p>
     * The type of permission to grant.
     * </p>
     */
    private String permission;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInterfacePermissionRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @return The AWS account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInterfacePermissionRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The AWS service. Currently not supported.
     * </p>
     * 
     * @param awsService
     *        The AWS service. Currently not supported.
     */

    public void setAwsService(String awsService) {
        this.awsService = awsService;
    }

    /**
     * <p>
     * The AWS service. Currently not supported.
     * </p>
     * 
     * @return The AWS service. Currently not supported.
     */

    public String getAwsService() {
        return this.awsService;
    }

    /**
     * <p>
     * The AWS service. Currently not supported.
     * </p>
     * 
     * @param awsService
     *        The AWS service. Currently not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInterfacePermissionRequest withAwsService(String awsService) {
        setAwsService(awsService);
        return this;
    }

    /**
     * <p>
     * The type of permission to grant.
     * </p>
     * 
     * @param permission
     *        The type of permission to grant.
     * @see InterfacePermissionType
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * The type of permission to grant.
     * </p>
     * 
     * @return The type of permission to grant.
     * @see InterfacePermissionType
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * <p>
     * The type of permission to grant.
     * </p>
     * 
     * @param permission
     *        The type of permission to grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterfacePermissionType
     */

    public CreateNetworkInterfacePermissionRequest withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p>
     * The type of permission to grant.
     * </p>
     * 
     * @param permission
     *        The type of permission to grant.
     * @see InterfacePermissionType
     */

    public void setPermission(InterfacePermissionType permission) {
        withPermission(permission);
    }

    /**
     * <p>
     * The type of permission to grant.
     * </p>
     * 
     * @param permission
     *        The type of permission to grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterfacePermissionType
     */

    public CreateNetworkInterfacePermissionRequest withPermission(InterfacePermissionType permission) {
        this.permission = permission.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateNetworkInterfacePermissionRequest> getDryRunRequest() {
        Request<CreateNetworkInterfacePermissionRequest> request = new CreateNetworkInterfacePermissionRequestMarshaller().marshall(this);
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
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAwsService() != null)
            sb.append("AwsService: ").append(getAwsService()).append(",");
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNetworkInterfacePermissionRequest == false)
            return false;
        CreateNetworkInterfacePermissionRequest other = (CreateNetworkInterfacePermissionRequest) obj;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsService() == null ^ this.getAwsService() == null)
            return false;
        if (other.getAwsService() != null && other.getAwsService().equals(this.getAwsService()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsService() == null) ? 0 : getAwsService().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        return hashCode;
    }

    @Override
    public CreateNetworkInterfacePermissionRequest clone() {
        return (CreateNetworkInterfacePermissionRequest) super.clone();
    }
}
