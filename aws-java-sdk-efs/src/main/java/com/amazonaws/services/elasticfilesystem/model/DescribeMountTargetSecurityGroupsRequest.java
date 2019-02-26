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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeMountTargetSecurityGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMountTargetSecurityGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the mount target whose security groups you want to retrieve.
     * </p>
     */
    private String mountTargetId;

    /**
     * <p>
     * The ID of the mount target whose security groups you want to retrieve.
     * </p>
     * 
     * @param mountTargetId
     *        The ID of the mount target whose security groups you want to retrieve.
     */

    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }

    /**
     * <p>
     * The ID of the mount target whose security groups you want to retrieve.
     * </p>
     * 
     * @return The ID of the mount target whose security groups you want to retrieve.
     */

    public String getMountTargetId() {
        return this.mountTargetId;
    }

    /**
     * <p>
     * The ID of the mount target whose security groups you want to retrieve.
     * </p>
     * 
     * @param mountTargetId
     *        The ID of the mount target whose security groups you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMountTargetSecurityGroupsRequest withMountTargetId(String mountTargetId) {
        setMountTargetId(mountTargetId);
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
        if (getMountTargetId() != null)
            sb.append("MountTargetId: ").append(getMountTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMountTargetSecurityGroupsRequest == false)
            return false;
        DescribeMountTargetSecurityGroupsRequest other = (DescribeMountTargetSecurityGroupsRequest) obj;
        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null)
            return false;
        if (other.getMountTargetId() != null && other.getMountTargetId().equals(this.getMountTargetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMountTargetId() == null) ? 0 : getMountTargetId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMountTargetSecurityGroupsRequest clone() {
        return (DescribeMountTargetSecurityGroupsRequest) super.clone();
    }

}
