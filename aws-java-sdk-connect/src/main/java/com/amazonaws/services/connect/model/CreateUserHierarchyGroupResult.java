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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUserHierarchyGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserHierarchyGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the hierarchy group.
     * </p>
     */
    private String hierarchyGroupId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * </p>
     */
    private String hierarchyGroupArn;

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

    public CreateUserHierarchyGroupResult withHierarchyGroupId(String hierarchyGroupId) {
        setHierarchyGroupId(hierarchyGroupId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * </p>
     * 
     * @param hierarchyGroupArn
     *        The Amazon Resource Name (ARN) of the hierarchy group.
     */

    public void setHierarchyGroupArn(String hierarchyGroupArn) {
        this.hierarchyGroupArn = hierarchyGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the hierarchy group.
     */

    public String getHierarchyGroupArn() {
        return this.hierarchyGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * </p>
     * 
     * @param hierarchyGroupArn
     *        The Amazon Resource Name (ARN) of the hierarchy group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserHierarchyGroupResult withHierarchyGroupArn(String hierarchyGroupArn) {
        setHierarchyGroupArn(hierarchyGroupArn);
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
        if (getHierarchyGroupId() != null)
            sb.append("HierarchyGroupId: ").append(getHierarchyGroupId()).append(",");
        if (getHierarchyGroupArn() != null)
            sb.append("HierarchyGroupArn: ").append(getHierarchyGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserHierarchyGroupResult == false)
            return false;
        CreateUserHierarchyGroupResult other = (CreateUserHierarchyGroupResult) obj;
        if (other.getHierarchyGroupId() == null ^ this.getHierarchyGroupId() == null)
            return false;
        if (other.getHierarchyGroupId() != null && other.getHierarchyGroupId().equals(this.getHierarchyGroupId()) == false)
            return false;
        if (other.getHierarchyGroupArn() == null ^ this.getHierarchyGroupArn() == null)
            return false;
        if (other.getHierarchyGroupArn() != null && other.getHierarchyGroupArn().equals(this.getHierarchyGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHierarchyGroupId() == null) ? 0 : getHierarchyGroupId().hashCode());
        hashCode = prime * hashCode + ((getHierarchyGroupArn() == null) ? 0 : getHierarchyGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserHierarchyGroupResult clone() {
        try {
            return (CreateUserHierarchyGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
