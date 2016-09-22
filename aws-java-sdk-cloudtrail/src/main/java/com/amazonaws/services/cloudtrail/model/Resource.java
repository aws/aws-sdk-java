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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the type and name of a resource referenced by an event.
 * </p>
 */
public class Resource implements Serializable, Cloneable {

    /**
     * <p>
     * The type of a resource referenced by the event returned. When the resource type cannot be determined, null is
     * returned. Some examples of resource types are: <b>Instance</b> for EC2, <b>Trail</b> for CloudTrail,
     * <b>DBInstance</b> for RDS, and <b>AccessKey</b> for IAM. For a list of resource types supported for event lookup,
     * see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/lookup_supported_resourcetypes.html">Resource
     * Types Supported for Event Lookup</a>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The name of the resource referenced by the event returned. These are user-created names whose values will depend
     * on the environment. For example, the resource name might be "auto-scaling-test-group" for an Auto Scaling Group
     * or "i-1234567" for an EC2 Instance.
     * </p>
     */
    private String resourceName;

    /**
     * <p>
     * The type of a resource referenced by the event returned. When the resource type cannot be determined, null is
     * returned. Some examples of resource types are: <b>Instance</b> for EC2, <b>Trail</b> for CloudTrail,
     * <b>DBInstance</b> for RDS, and <b>AccessKey</b> for IAM. For a list of resource types supported for event lookup,
     * see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/lookup_supported_resourcetypes.html">Resource
     * Types Supported for Event Lookup</a>.
     * </p>
     * 
     * @param resourceType
     *        The type of a resource referenced by the event returned. When the resource type cannot be determined, null
     *        is returned. Some examples of resource types are: <b>Instance</b> for EC2, <b>Trail</b> for CloudTrail,
     *        <b>DBInstance</b> for RDS, and <b>AccessKey</b> for IAM. For a list of resource types supported for event
     *        lookup, see <a
     *        href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/lookup_supported_resourcetypes.html"
     *        >Resource Types Supported for Event Lookup</a>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of a resource referenced by the event returned. When the resource type cannot be determined, null is
     * returned. Some examples of resource types are: <b>Instance</b> for EC2, <b>Trail</b> for CloudTrail,
     * <b>DBInstance</b> for RDS, and <b>AccessKey</b> for IAM. For a list of resource types supported for event lookup,
     * see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/lookup_supported_resourcetypes.html">Resource
     * Types Supported for Event Lookup</a>.
     * </p>
     * 
     * @return The type of a resource referenced by the event returned. When the resource type cannot be determined,
     *         null is returned. Some examples of resource types are: <b>Instance</b> for EC2, <b>Trail</b> for
     *         CloudTrail, <b>DBInstance</b> for RDS, and <b>AccessKey</b> for IAM. For a list of resource types
     *         supported for event lookup, see <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/lookup_supported_resourcetypes.html"
     *         >Resource Types Supported for Event Lookup</a>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of a resource referenced by the event returned. When the resource type cannot be determined, null is
     * returned. Some examples of resource types are: <b>Instance</b> for EC2, <b>Trail</b> for CloudTrail,
     * <b>DBInstance</b> for RDS, and <b>AccessKey</b> for IAM. For a list of resource types supported for event lookup,
     * see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/lookup_supported_resourcetypes.html">Resource
     * Types Supported for Event Lookup</a>.
     * </p>
     * 
     * @param resourceType
     *        The type of a resource referenced by the event returned. When the resource type cannot be determined, null
     *        is returned. Some examples of resource types are: <b>Instance</b> for EC2, <b>Trail</b> for CloudTrail,
     *        <b>DBInstance</b> for RDS, and <b>AccessKey</b> for IAM. For a list of resource types supported for event
     *        lookup, see <a
     *        href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/lookup_supported_resourcetypes.html"
     *        >Resource Types Supported for Event Lookup</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The name of the resource referenced by the event returned. These are user-created names whose values will depend
     * on the environment. For example, the resource name might be "auto-scaling-test-group" for an Auto Scaling Group
     * or "i-1234567" for an EC2 Instance.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource referenced by the event returned. These are user-created names whose values will
     *        depend on the environment. For example, the resource name might be "auto-scaling-test-group" for an Auto
     *        Scaling Group or "i-1234567" for an EC2 Instance.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource referenced by the event returned. These are user-created names whose values will depend
     * on the environment. For example, the resource name might be "auto-scaling-test-group" for an Auto Scaling Group
     * or "i-1234567" for an EC2 Instance.
     * </p>
     * 
     * @return The name of the resource referenced by the event returned. These are user-created names whose values will
     *         depend on the environment. For example, the resource name might be "auto-scaling-test-group" for an Auto
     *         Scaling Group or "i-1234567" for an EC2 Instance.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource referenced by the event returned. These are user-created names whose values will depend
     * on the environment. For example, the resource name might be "auto-scaling-test-group" for an Auto Scaling Group
     * or "i-1234567" for an EC2 Instance.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource referenced by the event returned. These are user-created names whose values will
     *        depend on the environment. For example, the resource name might be "auto-scaling-test-group" for an Auto
     *        Scaling Group or "i-1234567" for an EC2 Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withResourceName(String resourceName) {
        setResourceName(resourceName);
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
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceName() != null)
            sb.append("ResourceName: " + getResourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
