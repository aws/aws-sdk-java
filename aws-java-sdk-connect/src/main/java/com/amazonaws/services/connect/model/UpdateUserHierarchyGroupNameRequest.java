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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchyGroupName"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserHierarchyGroupNameRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the hierarchy group. Must not be more than 100 characters.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     */
    private String hierarchyGroupId;
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The name of the hierarchy group. Must not be more than 100 characters.
     * </p>
     * 
     * @param name
     *        The name of the hierarchy group. Must not be more than 100 characters.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the hierarchy group. Must not be more than 100 characters.
     * </p>
     * 
     * @return The name of the hierarchy group. Must not be more than 100 characters.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the hierarchy group. Must not be more than 100 characters.
     * </p>
     * 
     * @param name
     *        The name of the hierarchy group. Must not be more than 100 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserHierarchyGroupNameRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     * 
     * @param hierarchyGroupId
     *        The identifier of the hierarchy group.
     */

    public void setHierarchyGroupId(String hierarchyGroupId) {
        this.hierarchyGroupId = hierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     * 
     * @return The identifier of the hierarchy group.
     */

    public String getHierarchyGroupId() {
        return this.hierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     * 
     * @param hierarchyGroupId
     *        The identifier of the hierarchy group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserHierarchyGroupNameRequest withHierarchyGroupId(String hierarchyGroupId) {
        setHierarchyGroupId(hierarchyGroupId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserHierarchyGroupNameRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getHierarchyGroupId() != null)
            sb.append("HierarchyGroupId: ").append(getHierarchyGroupId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserHierarchyGroupNameRequest == false)
            return false;
        UpdateUserHierarchyGroupNameRequest other = (UpdateUserHierarchyGroupNameRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHierarchyGroupId() == null ^ this.getHierarchyGroupId() == null)
            return false;
        if (other.getHierarchyGroupId() != null && other.getHierarchyGroupId().equals(this.getHierarchyGroupId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getHierarchyGroupId() == null) ? 0 : getHierarchyGroupId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserHierarchyGroupNameRequest clone() {
        return (UpdateUserHierarchyGroupNameRequest) super.clone();
    }

}
