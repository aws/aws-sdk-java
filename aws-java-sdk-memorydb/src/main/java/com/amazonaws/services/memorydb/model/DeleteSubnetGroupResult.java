/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteSubnetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSubnetGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The subnet group object that has been deleted.
     * </p>
     */
    private SubnetGroup subnetGroup;

    /**
     * <p>
     * The subnet group object that has been deleted.
     * </p>
     * 
     * @param subnetGroup
     *        The subnet group object that has been deleted.
     */

    public void setSubnetGroup(SubnetGroup subnetGroup) {
        this.subnetGroup = subnetGroup;
    }

    /**
     * <p>
     * The subnet group object that has been deleted.
     * </p>
     * 
     * @return The subnet group object that has been deleted.
     */

    public SubnetGroup getSubnetGroup() {
        return this.subnetGroup;
    }

    /**
     * <p>
     * The subnet group object that has been deleted.
     * </p>
     * 
     * @param subnetGroup
     *        The subnet group object that has been deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSubnetGroupResult withSubnetGroup(SubnetGroup subnetGroup) {
        setSubnetGroup(subnetGroup);
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
        if (getSubnetGroup() != null)
            sb.append("SubnetGroup: ").append(getSubnetGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSubnetGroupResult == false)
            return false;
        DeleteSubnetGroupResult other = (DeleteSubnetGroupResult) obj;
        if (other.getSubnetGroup() == null ^ this.getSubnetGroup() == null)
            return false;
        if (other.getSubnetGroup() != null && other.getSubnetGroup().equals(this.getSubnetGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetGroup() == null) ? 0 : getSubnetGroup().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSubnetGroupResult clone() {
        try {
            return (DeleteSubnetGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
