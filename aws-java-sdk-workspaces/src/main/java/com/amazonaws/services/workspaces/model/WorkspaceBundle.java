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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a WorkSpace bundle.
 * </p>
 */
public class WorkspaceBundle implements Serializable, Cloneable {

    /**
     * <p>
     * The bundle identifier.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The name of the bundle.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The owner of the bundle. This contains the owner's account identifier, or <code>AMAZON</code> if the bundle is
     * provided by AWS.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The bundle description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A <a>UserStorage</a> object that specifies the amount of user storage that the bundle contains.
     * </p>
     */
    private UserStorage userStorage;
    /**
     * <p>
     * A <a>ComputeType</a> object that specifies the compute type for the bundle.
     * </p>
     */
    private ComputeType computeType;

    /**
     * <p>
     * The bundle identifier.
     * </p>
     * 
     * @param bundleId
     *        The bundle identifier.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The bundle identifier.
     * </p>
     * 
     * @return The bundle identifier.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The bundle identifier.
     * </p>
     * 
     * @param bundleId
     *        The bundle identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The name of the bundle.
     * </p>
     * 
     * @param name
     *        The name of the bundle.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bundle.
     * </p>
     * 
     * @return The name of the bundle.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the bundle.
     * </p>
     * 
     * @param name
     *        The name of the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The owner of the bundle. This contains the owner's account identifier, or <code>AMAZON</code> if the bundle is
     * provided by AWS.
     * </p>
     * 
     * @param owner
     *        The owner of the bundle. This contains the owner's account identifier, or <code>AMAZON</code> if the
     *        bundle is provided by AWS.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the bundle. This contains the owner's account identifier, or <code>AMAZON</code> if the bundle is
     * provided by AWS.
     * </p>
     * 
     * @return The owner of the bundle. This contains the owner's account identifier, or <code>AMAZON</code> if the
     *         bundle is provided by AWS.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the bundle. This contains the owner's account identifier, or <code>AMAZON</code> if the bundle is
     * provided by AWS.
     * </p>
     * 
     * @param owner
     *        The owner of the bundle. This contains the owner's account identifier, or <code>AMAZON</code> if the
     *        bundle is provided by AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The bundle description.
     * </p>
     * 
     * @param description
     *        The bundle description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The bundle description.
     * </p>
     * 
     * @return The bundle description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The bundle description.
     * </p>
     * 
     * @param description
     *        The bundle description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A <a>UserStorage</a> object that specifies the amount of user storage that the bundle contains.
     * </p>
     * 
     * @param userStorage
     *        A <a>UserStorage</a> object that specifies the amount of user storage that the bundle contains.
     */

    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    /**
     * <p>
     * A <a>UserStorage</a> object that specifies the amount of user storage that the bundle contains.
     * </p>
     * 
     * @return A <a>UserStorage</a> object that specifies the amount of user storage that the bundle contains.
     */

    public UserStorage getUserStorage() {
        return this.userStorage;
    }

    /**
     * <p>
     * A <a>UserStorage</a> object that specifies the amount of user storage that the bundle contains.
     * </p>
     * 
     * @param userStorage
     *        A <a>UserStorage</a> object that specifies the amount of user storage that the bundle contains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withUserStorage(UserStorage userStorage) {
        setUserStorage(userStorage);
        return this;
    }

    /**
     * <p>
     * A <a>ComputeType</a> object that specifies the compute type for the bundle.
     * </p>
     * 
     * @param computeType
     *        A <a>ComputeType</a> object that specifies the compute type for the bundle.
     */

    public void setComputeType(ComputeType computeType) {
        this.computeType = computeType;
    }

    /**
     * <p>
     * A <a>ComputeType</a> object that specifies the compute type for the bundle.
     * </p>
     * 
     * @return A <a>ComputeType</a> object that specifies the compute type for the bundle.
     */

    public ComputeType getComputeType() {
        return this.computeType;
    }

    /**
     * <p>
     * A <a>ComputeType</a> object that specifies the compute type for the bundle.
     * </p>
     * 
     * @param computeType
     *        A <a>ComputeType</a> object that specifies the compute type for the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceBundle withComputeType(ComputeType computeType) {
        setComputeType(computeType);
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
        if (getBundleId() != null)
            sb.append("BundleId: " + getBundleId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getUserStorage() != null)
            sb.append("UserStorage: " + getUserStorage() + ",");
        if (getComputeType() != null)
            sb.append("ComputeType: " + getComputeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkspaceBundle == false)
            return false;
        WorkspaceBundle other = (WorkspaceBundle) obj;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUserStorage() == null ^ this.getUserStorage() == null)
            return false;
        if (other.getUserStorage() != null && other.getUserStorage().equals(this.getUserStorage()) == false)
            return false;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUserStorage() == null) ? 0 : getUserStorage().hashCode());
        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceBundle clone() {
        try {
            return (WorkspaceBundle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
