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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/UpdateStudio" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStudioRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon EMR Studio to update.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * A descriptive name for the Amazon EMR Studio.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A detailed description to assign to the Amazon EMR Studio.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of subnet IDs to associate with the Amazon EMR Studio. The list can include new subnet IDs, but must also
     * include all of the subnet IDs previously associated with the Studio. The list order does not matter. A Studio can
     * have a maximum of 5 subnets. The subnets must belong to the same VPC as the Studio.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * The Amazon S3 location to back up Workspaces and notebook files for the Amazon EMR Studio.
     * </p>
     */
    private String defaultS3Location;

    /**
     * <p>
     * The ID of the Amazon EMR Studio to update.
     * </p>
     * 
     * @param studioId
     *        The ID of the Amazon EMR Studio to update.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio to update.
     * </p>
     * 
     * @return The ID of the Amazon EMR Studio to update.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio to update.
     * </p>
     * 
     * @param studioId
     *        The ID of the Amazon EMR Studio to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioRequest withStudioId(String studioId) {
        setStudioId(studioId);
        return this;
    }

    /**
     * <p>
     * A descriptive name for the Amazon EMR Studio.
     * </p>
     * 
     * @param name
     *        A descriptive name for the Amazon EMR Studio.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive name for the Amazon EMR Studio.
     * </p>
     * 
     * @return A descriptive name for the Amazon EMR Studio.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive name for the Amazon EMR Studio.
     * </p>
     * 
     * @param name
     *        A descriptive name for the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A detailed description to assign to the Amazon EMR Studio.
     * </p>
     * 
     * @param description
     *        A detailed description to assign to the Amazon EMR Studio.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A detailed description to assign to the Amazon EMR Studio.
     * </p>
     * 
     * @return A detailed description to assign to the Amazon EMR Studio.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A detailed description to assign to the Amazon EMR Studio.
     * </p>
     * 
     * @param description
     *        A detailed description to assign to the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs to associate with the Amazon EMR Studio. The list can include new subnet IDs, but must also
     * include all of the subnet IDs previously associated with the Studio. The list order does not matter. A Studio can
     * have a maximum of 5 subnets. The subnets must belong to the same VPC as the Studio.
     * </p>
     * 
     * @return A list of subnet IDs to associate with the Amazon EMR Studio. The list can include new subnet IDs, but
     *         must also include all of the subnet IDs previously associated with the Studio. The list order does not
     *         matter. A Studio can have a maximum of 5 subnets. The subnets must belong to the same VPC as the Studio.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet IDs to associate with the Amazon EMR Studio. The list can include new subnet IDs, but must also
     * include all of the subnet IDs previously associated with the Studio. The list order does not matter. A Studio can
     * have a maximum of 5 subnets. The subnets must belong to the same VPC as the Studio.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs to associate with the Amazon EMR Studio. The list can include new subnet IDs, but
     *        must also include all of the subnet IDs previously associated with the Studio. The list order does not
     *        matter. A Studio can have a maximum of 5 subnets. The subnets must belong to the same VPC as the Studio.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of subnet IDs to associate with the Amazon EMR Studio. The list can include new subnet IDs, but must also
     * include all of the subnet IDs previously associated with the Studio. The list order does not matter. A Studio can
     * have a maximum of 5 subnets. The subnets must belong to the same VPC as the Studio.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs to associate with the Amazon EMR Studio. The list can include new subnet IDs, but
     *        must also include all of the subnet IDs previously associated with the Studio. The list order does not
     *        matter. A Studio can have a maximum of 5 subnets. The subnets must belong to the same VPC as the Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs to associate with the Amazon EMR Studio. The list can include new subnet IDs, but must also
     * include all of the subnet IDs previously associated with the Studio. The list order does not matter. A Studio can
     * have a maximum of 5 subnets. The subnets must belong to the same VPC as the Studio.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs to associate with the Amazon EMR Studio. The list can include new subnet IDs, but
     *        must also include all of the subnet IDs previously associated with the Studio. The list order does not
     *        matter. A Studio can have a maximum of 5 subnets. The subnets must belong to the same VPC as the Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location to back up Workspaces and notebook files for the Amazon EMR Studio.
     * </p>
     * 
     * @param defaultS3Location
     *        The Amazon S3 location to back up Workspaces and notebook files for the Amazon EMR Studio.
     */

    public void setDefaultS3Location(String defaultS3Location) {
        this.defaultS3Location = defaultS3Location;
    }

    /**
     * <p>
     * The Amazon S3 location to back up Workspaces and notebook files for the Amazon EMR Studio.
     * </p>
     * 
     * @return The Amazon S3 location to back up Workspaces and notebook files for the Amazon EMR Studio.
     */

    public String getDefaultS3Location() {
        return this.defaultS3Location;
    }

    /**
     * <p>
     * The Amazon S3 location to back up Workspaces and notebook files for the Amazon EMR Studio.
     * </p>
     * 
     * @param defaultS3Location
     *        The Amazon S3 location to back up Workspaces and notebook files for the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioRequest withDefaultS3Location(String defaultS3Location) {
        setDefaultS3Location(defaultS3Location);
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
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getDefaultS3Location() != null)
            sb.append("DefaultS3Location: ").append(getDefaultS3Location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStudioRequest == false)
            return false;
        UpdateStudioRequest other = (UpdateStudioRequest) obj;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getDefaultS3Location() == null ^ this.getDefaultS3Location() == null)
            return false;
        if (other.getDefaultS3Location() != null && other.getDefaultS3Location().equals(this.getDefaultS3Location()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getDefaultS3Location() == null) ? 0 : getDefaultS3Location().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStudioRequest clone() {
        return (UpdateStudioRequest) super.clone();
    }

}
