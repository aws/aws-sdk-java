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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchyStructure"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserHierarchyStructureRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The hierarchy levels to update.
     * </p>
     */
    private HierarchyStructureUpdate hierarchyStructure;
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The hierarchy levels to update.
     * </p>
     * 
     * @param hierarchyStructure
     *        The hierarchy levels to update.
     */

    public void setHierarchyStructure(HierarchyStructureUpdate hierarchyStructure) {
        this.hierarchyStructure = hierarchyStructure;
    }

    /**
     * <p>
     * The hierarchy levels to update.
     * </p>
     * 
     * @return The hierarchy levels to update.
     */

    public HierarchyStructureUpdate getHierarchyStructure() {
        return this.hierarchyStructure;
    }

    /**
     * <p>
     * The hierarchy levels to update.
     * </p>
     * 
     * @param hierarchyStructure
     *        The hierarchy levels to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserHierarchyStructureRequest withHierarchyStructure(HierarchyStructureUpdate hierarchyStructure) {
        setHierarchyStructure(hierarchyStructure);
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

    public UpdateUserHierarchyStructureRequest withInstanceId(String instanceId) {
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
        if (getHierarchyStructure() != null)
            sb.append("HierarchyStructure: ").append(getHierarchyStructure()).append(",");
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

        if (obj instanceof UpdateUserHierarchyStructureRequest == false)
            return false;
        UpdateUserHierarchyStructureRequest other = (UpdateUserHierarchyStructureRequest) obj;
        if (other.getHierarchyStructure() == null ^ this.getHierarchyStructure() == null)
            return false;
        if (other.getHierarchyStructure() != null && other.getHierarchyStructure().equals(this.getHierarchyStructure()) == false)
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

        hashCode = prime * hashCode + ((getHierarchyStructure() == null) ? 0 : getHierarchyStructure().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserHierarchyStructureRequest clone() {
        return (UpdateUserHierarchyStructureRequest) super.clone();
    }

}
