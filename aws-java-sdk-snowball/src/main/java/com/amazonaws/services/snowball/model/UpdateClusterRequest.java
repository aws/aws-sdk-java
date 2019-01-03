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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/UpdateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster ID of the cluster that you want to update, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The new role Amazon Resource Name (ARN) that you want to associate with this cluster. To create a role ARN, use
     * the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in
     * AWS Identity and Access Management (IAM).
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The updated description of this cluster.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     * <a>LambdaResource</a> objects.
     * </p>
     */
    private JobResource resources;
    /**
     * <p>
     * The ID of the updated <a>Address</a> object.
     * </p>
     */
    private String addressId;
    /**
     * <p>
     * The updated shipping option value of this cluster's <a>ShippingDetails</a> object.
     * </p>
     */
    private String shippingOption;
    /**
     * <p>
     * The new or updated <a>Notification</a> object.
     * </p>
     */
    private Notification notification;
    /**
     * <p>
     * The updated ID for the forwarding address for a cluster. This field is not supported in most regions.
     * </p>
     */
    private String forwardingAddressId;

    /**
     * <p>
     * The cluster ID of the cluster that you want to update, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param clusterId
     *        The cluster ID of the cluster that you want to update, for example
     *        <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The cluster ID of the cluster that you want to update, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @return The cluster ID of the cluster that you want to update, for example
     *         <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The cluster ID of the cluster that you want to update, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param clusterId
     *        The cluster ID of the cluster that you want to update, for example
     *        <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The new role Amazon Resource Name (ARN) that you want to associate with this cluster. To create a role ARN, use
     * the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in
     * AWS Identity and Access Management (IAM).
     * </p>
     * 
     * @param roleARN
     *        The new role Amazon Resource Name (ARN) that you want to associate with this cluster. To create a role
     *        ARN, use the <a
     *        href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in
     *        AWS Identity and Access Management (IAM).
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The new role Amazon Resource Name (ARN) that you want to associate with this cluster. To create a role ARN, use
     * the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in
     * AWS Identity and Access Management (IAM).
     * </p>
     * 
     * @return The new role Amazon Resource Name (ARN) that you want to associate with this cluster. To create a role
     *         ARN, use the <a
     *         href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action
     *         in AWS Identity and Access Management (IAM).
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The new role Amazon Resource Name (ARN) that you want to associate with this cluster. To create a role ARN, use
     * the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in
     * AWS Identity and Access Management (IAM).
     * </p>
     * 
     * @param roleARN
     *        The new role Amazon Resource Name (ARN) that you want to associate with this cluster. To create a role
     *        ARN, use the <a
     *        href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> API action in
     *        AWS Identity and Access Management (IAM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The updated description of this cluster.
     * </p>
     * 
     * @param description
     *        The updated description of this cluster.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of this cluster.
     * </p>
     * 
     * @return The updated description of this cluster.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description of this cluster.
     * </p>
     * 
     * @param description
     *        The updated description of this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     * <a>LambdaResource</a> objects.
     * </p>
     * 
     * @param resources
     *        The updated arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     *        <a>LambdaResource</a> objects.
     */

    public void setResources(JobResource resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * The updated arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     * <a>LambdaResource</a> objects.
     * </p>
     * 
     * @return The updated arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     *         <a>LambdaResource</a> objects.
     */

    public JobResource getResources() {
        return this.resources;
    }

    /**
     * <p>
     * The updated arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     * <a>LambdaResource</a> objects.
     * </p>
     * 
     * @param resources
     *        The updated arrays of <a>JobResource</a> objects that can include updated <a>S3Resource</a> objects or
     *        <a>LambdaResource</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withResources(JobResource resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The ID of the updated <a>Address</a> object.
     * </p>
     * 
     * @param addressId
     *        The ID of the updated <a>Address</a> object.
     */

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The ID of the updated <a>Address</a> object.
     * </p>
     * 
     * @return The ID of the updated <a>Address</a> object.
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     * <p>
     * The ID of the updated <a>Address</a> object.
     * </p>
     * 
     * @param addressId
     *        The ID of the updated <a>Address</a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withAddressId(String addressId) {
        setAddressId(addressId);
        return this;
    }

    /**
     * <p>
     * The updated shipping option value of this cluster's <a>ShippingDetails</a> object.
     * </p>
     * 
     * @param shippingOption
     *        The updated shipping option value of this cluster's <a>ShippingDetails</a> object.
     * @see ShippingOption
     */

    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }

    /**
     * <p>
     * The updated shipping option value of this cluster's <a>ShippingDetails</a> object.
     * </p>
     * 
     * @return The updated shipping option value of this cluster's <a>ShippingDetails</a> object.
     * @see ShippingOption
     */

    public String getShippingOption() {
        return this.shippingOption;
    }

    /**
     * <p>
     * The updated shipping option value of this cluster's <a>ShippingDetails</a> object.
     * </p>
     * 
     * @param shippingOption
     *        The updated shipping option value of this cluster's <a>ShippingDetails</a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShippingOption
     */

    public UpdateClusterRequest withShippingOption(String shippingOption) {
        setShippingOption(shippingOption);
        return this;
    }

    /**
     * <p>
     * The updated shipping option value of this cluster's <a>ShippingDetails</a> object.
     * </p>
     * 
     * @param shippingOption
     *        The updated shipping option value of this cluster's <a>ShippingDetails</a> object.
     * @see ShippingOption
     */

    public void setShippingOption(ShippingOption shippingOption) {
        withShippingOption(shippingOption);
    }

    /**
     * <p>
     * The updated shipping option value of this cluster's <a>ShippingDetails</a> object.
     * </p>
     * 
     * @param shippingOption
     *        The updated shipping option value of this cluster's <a>ShippingDetails</a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShippingOption
     */

    public UpdateClusterRequest withShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
        return this;
    }

    /**
     * <p>
     * The new or updated <a>Notification</a> object.
     * </p>
     * 
     * @param notification
     *        The new or updated <a>Notification</a> object.
     */

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The new or updated <a>Notification</a> object.
     * </p>
     * 
     * @return The new or updated <a>Notification</a> object.
     */

    public Notification getNotification() {
        return this.notification;
    }

    /**
     * <p>
     * The new or updated <a>Notification</a> object.
     * </p>
     * 
     * @param notification
     *        The new or updated <a>Notification</a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * The updated ID for the forwarding address for a cluster. This field is not supported in most regions.
     * </p>
     * 
     * @param forwardingAddressId
     *        The updated ID for the forwarding address for a cluster. This field is not supported in most regions.
     */

    public void setForwardingAddressId(String forwardingAddressId) {
        this.forwardingAddressId = forwardingAddressId;
    }

    /**
     * <p>
     * The updated ID for the forwarding address for a cluster. This field is not supported in most regions.
     * </p>
     * 
     * @return The updated ID for the forwarding address for a cluster. This field is not supported in most regions.
     */

    public String getForwardingAddressId() {
        return this.forwardingAddressId;
    }

    /**
     * <p>
     * The updated ID for the forwarding address for a cluster. This field is not supported in most regions.
     * </p>
     * 
     * @param forwardingAddressId
     *        The updated ID for the forwarding address for a cluster. This field is not supported in most regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withForwardingAddressId(String forwardingAddressId) {
        setForwardingAddressId(forwardingAddressId);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getAddressId() != null)
            sb.append("AddressId: ").append(getAddressId()).append(",");
        if (getShippingOption() != null)
            sb.append("ShippingOption: ").append(getShippingOption()).append(",");
        if (getNotification() != null)
            sb.append("Notification: ").append(getNotification()).append(",");
        if (getForwardingAddressId() != null)
            sb.append("ForwardingAddressId: ").append(getForwardingAddressId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClusterRequest == false)
            return false;
        UpdateClusterRequest other = (UpdateClusterRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getAddressId() == null ^ this.getAddressId() == null)
            return false;
        if (other.getAddressId() != null && other.getAddressId().equals(this.getAddressId()) == false)
            return false;
        if (other.getShippingOption() == null ^ this.getShippingOption() == null)
            return false;
        if (other.getShippingOption() != null && other.getShippingOption().equals(this.getShippingOption()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getForwardingAddressId() == null ^ this.getForwardingAddressId() == null)
            return false;
        if (other.getForwardingAddressId() != null && other.getForwardingAddressId().equals(this.getForwardingAddressId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime * hashCode + ((getShippingOption() == null) ? 0 : getShippingOption().hashCode());
        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getForwardingAddressId() == null) ? 0 : getForwardingAddressId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateClusterRequest clone() {
        return (UpdateClusterRequest) super.clone();
    }

}
