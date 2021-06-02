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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input to <a>ModifyGlobalCluster</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyGlobalCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyGlobalClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the global cluster being modified. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * The new identifier for a global cluster when you modify a global cluster. This value is stored as a lowercase
     * string.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * <p>
     * The first character must be a letter
     * </p>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     */
    private String newGlobalClusterIdentifier;
    /**
     * <p>
     * Indicates if the global cluster has deletion protection enabled. The global cluster can't be deleted when
     * deletion protection is enabled.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * The identifier for the global cluster being modified. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalClusterIdentifier
     *        The identifier for the global cluster being modified. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing global cluster.
     *        </p>
     *        </li>
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The identifier for the global cluster being modified. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier for the global cluster being modified. This parameter isn't case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing global cluster.
     *         </p>
     *         </li>
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * The identifier for the global cluster being modified. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalClusterIdentifier
     *        The identifier for the global cluster being modified. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing global cluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The new identifier for a global cluster when you modify a global cluster. This value is stored as a lowercase
     * string.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * <p>
     * The first character must be a letter
     * </p>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * 
     * @param newGlobalClusterIdentifier
     *        The new identifier for a global cluster when you modify a global cluster. This value is stored as a
     *        lowercase string.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens
     *        </p>
     *        <p>
     *        The first character must be a letter
     *        </p>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster2</code>
     */

    public void setNewGlobalClusterIdentifier(String newGlobalClusterIdentifier) {
        this.newGlobalClusterIdentifier = newGlobalClusterIdentifier;
    }

    /**
     * <p>
     * The new identifier for a global cluster when you modify a global cluster. This value is stored as a lowercase
     * string.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * <p>
     * The first character must be a letter
     * </p>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * 
     * @return The new identifier for a global cluster when you modify a global cluster. This value is stored as a
     *         lowercase string.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens
     *         </p>
     *         <p>
     *         The first character must be a letter
     *         </p>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster2</code>
     */

    public String getNewGlobalClusterIdentifier() {
        return this.newGlobalClusterIdentifier;
    }

    /**
     * <p>
     * The new identifier for a global cluster when you modify a global cluster. This value is stored as a lowercase
     * string.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * <p>
     * The first character must be a letter
     * </p>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * 
     * @param newGlobalClusterIdentifier
     *        The new identifier for a global cluster when you modify a global cluster. This value is stored as a
     *        lowercase string.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens
     *        </p>
     *        <p>
     *        The first character must be a letter
     *        </p>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalClusterRequest withNewGlobalClusterIdentifier(String newGlobalClusterIdentifier) {
        setNewGlobalClusterIdentifier(newGlobalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Indicates if the global cluster has deletion protection enabled. The global cluster can't be deleted when
     * deletion protection is enabled.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates if the global cluster has deletion protection enabled. The global cluster can't be deleted when
     *        deletion protection is enabled.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Indicates if the global cluster has deletion protection enabled. The global cluster can't be deleted when
     * deletion protection is enabled.
     * </p>
     * 
     * @return Indicates if the global cluster has deletion protection enabled. The global cluster can't be deleted when
     *         deletion protection is enabled.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Indicates if the global cluster has deletion protection enabled. The global cluster can't be deleted when
     * deletion protection is enabled.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates if the global cluster has deletion protection enabled. The global cluster can't be deleted when
     *        deletion protection is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalClusterRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * Indicates if the global cluster has deletion protection enabled. The global cluster can't be deleted when
     * deletion protection is enabled.
     * </p>
     * 
     * @return Indicates if the global cluster has deletion protection enabled. The global cluster can't be deleted when
     *         deletion protection is enabled.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
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
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: ").append(getGlobalClusterIdentifier()).append(",");
        if (getNewGlobalClusterIdentifier() != null)
            sb.append("NewGlobalClusterIdentifier: ").append(getNewGlobalClusterIdentifier()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyGlobalClusterRequest == false)
            return false;
        ModifyGlobalClusterRequest other = (ModifyGlobalClusterRequest) obj;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getNewGlobalClusterIdentifier() == null ^ this.getNewGlobalClusterIdentifier() == null)
            return false;
        if (other.getNewGlobalClusterIdentifier() != null && other.getNewGlobalClusterIdentifier().equals(this.getNewGlobalClusterIdentifier()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getNewGlobalClusterIdentifier() == null) ? 0 : getNewGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        return hashCode;
    }

    @Override
    public ModifyGlobalClusterRequest clone() {
        return (ModifyGlobalClusterRequest) super.clone();
    }

}
