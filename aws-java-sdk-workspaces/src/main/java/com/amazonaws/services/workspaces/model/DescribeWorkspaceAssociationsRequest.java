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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspaceAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the WorkSpace.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The resource types of the associated resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> associatedResourceTypes;

    /**
     * <p>
     * The identifier of the WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The identifier of the WorkSpace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The identifier of the WorkSpace.
     * </p>
     * 
     * @return The identifier of the WorkSpace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The identifier of the WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The identifier of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceAssociationsRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The resource types of the associated resources.
     * </p>
     * 
     * @return The resource types of the associated resources.
     * @see WorkSpaceAssociatedResourceType
     */

    public java.util.List<String> getAssociatedResourceTypes() {
        if (associatedResourceTypes == null) {
            associatedResourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return associatedResourceTypes;
    }

    /**
     * <p>
     * The resource types of the associated resources.
     * </p>
     * 
     * @param associatedResourceTypes
     *        The resource types of the associated resources.
     * @see WorkSpaceAssociatedResourceType
     */

    public void setAssociatedResourceTypes(java.util.Collection<String> associatedResourceTypes) {
        if (associatedResourceTypes == null) {
            this.associatedResourceTypes = null;
            return;
        }

        this.associatedResourceTypes = new com.amazonaws.internal.SdkInternalList<String>(associatedResourceTypes);
    }

    /**
     * <p>
     * The resource types of the associated resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedResourceTypes(java.util.Collection)} or
     * {@link #withAssociatedResourceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param associatedResourceTypes
     *        The resource types of the associated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkSpaceAssociatedResourceType
     */

    public DescribeWorkspaceAssociationsRequest withAssociatedResourceTypes(String... associatedResourceTypes) {
        if (this.associatedResourceTypes == null) {
            setAssociatedResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(associatedResourceTypes.length));
        }
        for (String ele : associatedResourceTypes) {
            this.associatedResourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource types of the associated resources.
     * </p>
     * 
     * @param associatedResourceTypes
     *        The resource types of the associated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkSpaceAssociatedResourceType
     */

    public DescribeWorkspaceAssociationsRequest withAssociatedResourceTypes(java.util.Collection<String> associatedResourceTypes) {
        setAssociatedResourceTypes(associatedResourceTypes);
        return this;
    }

    /**
     * <p>
     * The resource types of the associated resources.
     * </p>
     * 
     * @param associatedResourceTypes
     *        The resource types of the associated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkSpaceAssociatedResourceType
     */

    public DescribeWorkspaceAssociationsRequest withAssociatedResourceTypes(WorkSpaceAssociatedResourceType... associatedResourceTypes) {
        com.amazonaws.internal.SdkInternalList<String> associatedResourceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                associatedResourceTypes.length);
        for (WorkSpaceAssociatedResourceType value : associatedResourceTypes) {
            associatedResourceTypesCopy.add(value.toString());
        }
        if (getAssociatedResourceTypes() == null) {
            setAssociatedResourceTypes(associatedResourceTypesCopy);
        } else {
            getAssociatedResourceTypes().addAll(associatedResourceTypesCopy);
        }
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getAssociatedResourceTypes() != null)
            sb.append("AssociatedResourceTypes: ").append(getAssociatedResourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkspaceAssociationsRequest == false)
            return false;
        DescribeWorkspaceAssociationsRequest other = (DescribeWorkspaceAssociationsRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getAssociatedResourceTypes() == null ^ this.getAssociatedResourceTypes() == null)
            return false;
        if (other.getAssociatedResourceTypes() != null && other.getAssociatedResourceTypes().equals(this.getAssociatedResourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getAssociatedResourceTypes() == null) ? 0 : getAssociatedResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspaceAssociationsRequest clone() {
        return (DescribeWorkspaceAssociationsRequest) super.clone();
    }

}
