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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSubnetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDBSubnetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database subnet group to delete.
     * </p>
     * <note>
     * <p>
     * You can't delete the default subnet group.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;

    /**
     * <p>
     * The name of the database subnet group to delete.
     * </p>
     * <note>
     * <p>
     * You can't delete the default subnet group.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The name of the database subnet group to delete.</p> <note>
     *        <p>
     *        You can't delete the default subnet group.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <p>
     *        Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the database subnet group to delete.
     * </p>
     * <note>
     * <p>
     * You can't delete the default subnet group.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @return The name of the database subnet group to delete.</p> <note>
     *         <p>
     *         You can't delete the default subnet group.
     *         </p>
     *         </note>
     *         <p>
     *         Constraints:
     *         </p>
     *         <p>
     *         Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the database subnet group to delete.
     * </p>
     * <note>
     * <p>
     * You can't delete the default subnet group.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The name of the database subnet group to delete.</p> <note>
     *        <p>
     *        You can't delete the default subnet group.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <p>
     *        Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBSubnetGroupRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
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
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBSubnetGroupRequest == false)
            return false;
        DeleteDBSubnetGroupRequest other = (DeleteDBSubnetGroupRequest) obj;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDBSubnetGroupRequest clone() {
        return (DeleteDBSubnetGroupRequest) super.clone();
    }

}
