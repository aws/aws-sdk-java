/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The job ID of the job that you want to update, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The new role Amazon Resource Name (ARN) that you want to associate with this job. To create a role ARN, use the
     * <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS Identity and
     * Access Management (IAM) API action.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The new or updated <a>Notification</a> object.
     * </p>
     */
    private Notification notification;
    /**
     * <p>
     * The updated <a>S3Resource</a> object (for a single Amazon S3 bucket or key range), or the updated
     * <a>JobResource</a> object (for multiple buckets or key ranges).
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
     * The updated shipping option value of this job's <a>ShippingDetails</a> object.
     * </p>
     */
    private String shippingOption;
    /**
     * <p>
     * The updated description of this job's <a>JobMetadata</a> object.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated <code>SnowballCapacityPreference</code> of this job's <a>JobMetadata</a> object. The 50 TB Snowballs
     * are only available in the US regions.
     * </p>
     */
    private String snowballCapacityPreference;

    /**
     * <p>
     * The job ID of the job that you want to update, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param jobId
     *        The job ID of the job that you want to update, for example
     *        <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID of the job that you want to update, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @return The job ID of the job that you want to update, for example
     *         <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID of the job that you want to update, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param jobId
     *        The job ID of the job that you want to update, for example
     *        <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The new role Amazon Resource Name (ARN) that you want to associate with this job. To create a role ARN, use the
     * <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS Identity and
     * Access Management (IAM) API action.
     * </p>
     * 
     * @param roleARN
     *        The new role Amazon Resource Name (ARN) that you want to associate with this job. To create a role ARN,
     *        use the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a>
     *        AWS Identity and Access Management (IAM) API action.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The new role Amazon Resource Name (ARN) that you want to associate with this job. To create a role ARN, use the
     * <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS Identity and
     * Access Management (IAM) API action.
     * </p>
     * 
     * @return The new role Amazon Resource Name (ARN) that you want to associate with this job. To create a role ARN,
     *         use the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a>
     *         AWS Identity and Access Management (IAM) API action.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The new role Amazon Resource Name (ARN) that you want to associate with this job. To create a role ARN, use the
     * <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a> AWS Identity and
     * Access Management (IAM) API action.
     * </p>
     * 
     * @param roleARN
     *        The new role Amazon Resource Name (ARN) that you want to associate with this job. To create a role ARN,
     *        use the <a href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html">CreateRole</a>
     *        AWS Identity and Access Management (IAM) API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
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

    public UpdateJobRequest withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * The updated <a>S3Resource</a> object (for a single Amazon S3 bucket or key range), or the updated
     * <a>JobResource</a> object (for multiple buckets or key ranges).
     * </p>
     * 
     * @param resources
     *        The updated <a>S3Resource</a> object (for a single Amazon S3 bucket or key range), or the updated
     *        <a>JobResource</a> object (for multiple buckets or key ranges).
     */

    public void setResources(JobResource resources) {
        this.resources = resources;
    }

    /**
     * <p>
     * The updated <a>S3Resource</a> object (for a single Amazon S3 bucket or key range), or the updated
     * <a>JobResource</a> object (for multiple buckets or key ranges).
     * </p>
     * 
     * @return The updated <a>S3Resource</a> object (for a single Amazon S3 bucket or key range), or the updated
     *         <a>JobResource</a> object (for multiple buckets or key ranges).
     */

    public JobResource getResources() {
        return this.resources;
    }

    /**
     * <p>
     * The updated <a>S3Resource</a> object (for a single Amazon S3 bucket or key range), or the updated
     * <a>JobResource</a> object (for multiple buckets or key ranges).
     * </p>
     * 
     * @param resources
     *        The updated <a>S3Resource</a> object (for a single Amazon S3 bucket or key range), or the updated
     *        <a>JobResource</a> object (for multiple buckets or key ranges).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withResources(JobResource resources) {
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

    public UpdateJobRequest withAddressId(String addressId) {
        setAddressId(addressId);
        return this;
    }

    /**
     * <p>
     * The updated shipping option value of this job's <a>ShippingDetails</a> object.
     * </p>
     * 
     * @param shippingOption
     *        The updated shipping option value of this job's <a>ShippingDetails</a> object.
     * @see ShippingOption
     */

    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }

    /**
     * <p>
     * The updated shipping option value of this job's <a>ShippingDetails</a> object.
     * </p>
     * 
     * @return The updated shipping option value of this job's <a>ShippingDetails</a> object.
     * @see ShippingOption
     */

    public String getShippingOption() {
        return this.shippingOption;
    }

    /**
     * <p>
     * The updated shipping option value of this job's <a>ShippingDetails</a> object.
     * </p>
     * 
     * @param shippingOption
     *        The updated shipping option value of this job's <a>ShippingDetails</a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShippingOption
     */

    public UpdateJobRequest withShippingOption(String shippingOption) {
        setShippingOption(shippingOption);
        return this;
    }

    /**
     * <p>
     * The updated shipping option value of this job's <a>ShippingDetails</a> object.
     * </p>
     * 
     * @param shippingOption
     *        The updated shipping option value of this job's <a>ShippingDetails</a> object.
     * @see ShippingOption
     */

    public void setShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
    }

    /**
     * <p>
     * The updated shipping option value of this job's <a>ShippingDetails</a> object.
     * </p>
     * 
     * @param shippingOption
     *        The updated shipping option value of this job's <a>ShippingDetails</a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShippingOption
     */

    public UpdateJobRequest withShippingOption(ShippingOption shippingOption) {
        setShippingOption(shippingOption);
        return this;
    }

    /**
     * <p>
     * The updated description of this job's <a>JobMetadata</a> object.
     * </p>
     * 
     * @param description
     *        The updated description of this job's <a>JobMetadata</a> object.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of this job's <a>JobMetadata</a> object.
     * </p>
     * 
     * @return The updated description of this job's <a>JobMetadata</a> object.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description of this job's <a>JobMetadata</a> object.
     * </p>
     * 
     * @param description
     *        The updated description of this job's <a>JobMetadata</a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated <code>SnowballCapacityPreference</code> of this job's <a>JobMetadata</a> object. The 50 TB Snowballs
     * are only available in the US regions.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        The updated <code>SnowballCapacityPreference</code> of this job's <a>JobMetadata</a> object. The 50 TB
     *        Snowballs are only available in the US regions.
     * @see SnowballCapacity
     */

    public void setSnowballCapacityPreference(String snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference;
    }

    /**
     * <p>
     * The updated <code>SnowballCapacityPreference</code> of this job's <a>JobMetadata</a> object. The 50 TB Snowballs
     * are only available in the US regions.
     * </p>
     * 
     * @return The updated <code>SnowballCapacityPreference</code> of this job's <a>JobMetadata</a> object. The 50 TB
     *         Snowballs are only available in the US regions.
     * @see SnowballCapacity
     */

    public String getSnowballCapacityPreference() {
        return this.snowballCapacityPreference;
    }

    /**
     * <p>
     * The updated <code>SnowballCapacityPreference</code> of this job's <a>JobMetadata</a> object. The 50 TB Snowballs
     * are only available in the US regions.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        The updated <code>SnowballCapacityPreference</code> of this job's <a>JobMetadata</a> object. The 50 TB
     *        Snowballs are only available in the US regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballCapacity
     */

    public UpdateJobRequest withSnowballCapacityPreference(String snowballCapacityPreference) {
        setSnowballCapacityPreference(snowballCapacityPreference);
        return this;
    }

    /**
     * <p>
     * The updated <code>SnowballCapacityPreference</code> of this job's <a>JobMetadata</a> object. The 50 TB Snowballs
     * are only available in the US regions.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        The updated <code>SnowballCapacityPreference</code> of this job's <a>JobMetadata</a> object. The 50 TB
     *        Snowballs are only available in the US regions.
     * @see SnowballCapacity
     */

    public void setSnowballCapacityPreference(SnowballCapacity snowballCapacityPreference) {
        this.snowballCapacityPreference = snowballCapacityPreference.toString();
    }

    /**
     * <p>
     * The updated <code>SnowballCapacityPreference</code> of this job's <a>JobMetadata</a> object. The 50 TB Snowballs
     * are only available in the US regions.
     * </p>
     * 
     * @param snowballCapacityPreference
     *        The updated <code>SnowballCapacityPreference</code> of this job's <a>JobMetadata</a> object. The 50 TB
     *        Snowballs are only available in the US regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballCapacity
     */

    public UpdateJobRequest withSnowballCapacityPreference(SnowballCapacity snowballCapacityPreference) {
        setSnowballCapacityPreference(snowballCapacityPreference);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getNotification() != null)
            sb.append("Notification: " + getNotification() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getAddressId() != null)
            sb.append("AddressId: " + getAddressId() + ",");
        if (getShippingOption() != null)
            sb.append("ShippingOption: " + getShippingOption() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSnowballCapacityPreference() != null)
            sb.append("SnowballCapacityPreference: " + getSnowballCapacityPreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobRequest == false)
            return false;
        UpdateJobRequest other = (UpdateJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSnowballCapacityPreference() == null ^ this.getSnowballCapacityPreference() == null)
            return false;
        if (other.getSnowballCapacityPreference() != null && other.getSnowballCapacityPreference().equals(this.getSnowballCapacityPreference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime * hashCode + ((getShippingOption() == null) ? 0 : getShippingOption().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSnowballCapacityPreference() == null) ? 0 : getSnowballCapacityPreference().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobRequest clone() {
        return (UpdateJobRequest) super.clone();
    }
}
