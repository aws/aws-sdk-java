/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetAssociatedRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssociatedRoleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Time when the role was associated for the group. */
    private String associatedAt;
    /** Arn of the role that is associated with the group. */
    private String roleArn;

    /**
     * Time when the role was associated for the group.
     * 
     * @param associatedAt
     *        Time when the role was associated for the group.
     */

    public void setAssociatedAt(String associatedAt) {
        this.associatedAt = associatedAt;
    }

    /**
     * Time when the role was associated for the group.
     * 
     * @return Time when the role was associated for the group.
     */

    public String getAssociatedAt() {
        return this.associatedAt;
    }

    /**
     * Time when the role was associated for the group.
     * 
     * @param associatedAt
     *        Time when the role was associated for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedRoleResult withAssociatedAt(String associatedAt) {
        setAssociatedAt(associatedAt);
        return this;
    }

    /**
     * Arn of the role that is associated with the group.
     * 
     * @param roleArn
     *        Arn of the role that is associated with the group.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * Arn of the role that is associated with the group.
     * 
     * @return Arn of the role that is associated with the group.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * Arn of the role that is associated with the group.
     * 
     * @param roleArn
     *        Arn of the role that is associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedRoleResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getAssociatedAt() != null)
            sb.append("AssociatedAt: ").append(getAssociatedAt()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssociatedRoleResult == false)
            return false;
        GetAssociatedRoleResult other = (GetAssociatedRoleResult) obj;
        if (other.getAssociatedAt() == null ^ this.getAssociatedAt() == null)
            return false;
        if (other.getAssociatedAt() != null && other.getAssociatedAt().equals(this.getAssociatedAt()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatedAt() == null) ? 0 : getAssociatedAt().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public GetAssociatedRoleResult clone() {
        try {
            return (GetAssociatedRoleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
