/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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
     * The bundle identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^wsb-[0-9a-z]{8,63}$<br/>
     */
    private String bundleId;

    /**
     * The name of the bundle.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String name;

    /**
     * The owner of the bundle. This contains the owner's account identifier,
     * or <code>AMAZON</code> if the bundle is provided by AWS.
     */
    private String owner;

    /**
     * The bundle description.
     */
    private String description;

    /**
     * A <a>UserStorage</a> object that specifies the amount of user storage
     * that the bundle contains.
     */
    private UserStorage userStorage;

    /**
     * A <a>ComputeType</a> object that specifies the compute type for the
     * bundle.
     */
    private ComputeType computeType;

    /**
     * The bundle identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^wsb-[0-9a-z]{8,63}$<br/>
     *
     * @return The bundle identifier.
     */
    public String getBundleId() {
        return bundleId;
    }
    
    /**
     * The bundle identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^wsb-[0-9a-z]{8,63}$<br/>
     *
     * @param bundleId The bundle identifier.
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }
    
    /**
     * The bundle identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^wsb-[0-9a-z]{8,63}$<br/>
     *
     * @param bundleId The bundle identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceBundle withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * The name of the bundle.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The name of the bundle.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the bundle.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name The name of the bundle.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the bundle.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name The name of the bundle.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceBundle withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The owner of the bundle. This contains the owner's account identifier,
     * or <code>AMAZON</code> if the bundle is provided by AWS.
     *
     * @return The owner of the bundle. This contains the owner's account identifier,
     *         or <code>AMAZON</code> if the bundle is provided by AWS.
     */
    public String getOwner() {
        return owner;
    }
    
    /**
     * The owner of the bundle. This contains the owner's account identifier,
     * or <code>AMAZON</code> if the bundle is provided by AWS.
     *
     * @param owner The owner of the bundle. This contains the owner's account identifier,
     *         or <code>AMAZON</code> if the bundle is provided by AWS.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    /**
     * The owner of the bundle. This contains the owner's account identifier,
     * or <code>AMAZON</code> if the bundle is provided by AWS.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param owner The owner of the bundle. This contains the owner's account identifier,
     *         or <code>AMAZON</code> if the bundle is provided by AWS.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceBundle withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * The bundle description.
     *
     * @return The bundle description.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The bundle description.
     *
     * @param description The bundle description.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The bundle description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The bundle description.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceBundle withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * A <a>UserStorage</a> object that specifies the amount of user storage
     * that the bundle contains.
     *
     * @return A <a>UserStorage</a> object that specifies the amount of user storage
     *         that the bundle contains.
     */
    public UserStorage getUserStorage() {
        return userStorage;
    }
    
    /**
     * A <a>UserStorage</a> object that specifies the amount of user storage
     * that the bundle contains.
     *
     * @param userStorage A <a>UserStorage</a> object that specifies the amount of user storage
     *         that the bundle contains.
     */
    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }
    
    /**
     * A <a>UserStorage</a> object that specifies the amount of user storage
     * that the bundle contains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userStorage A <a>UserStorage</a> object that specifies the amount of user storage
     *         that the bundle contains.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceBundle withUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
        return this;
    }

    /**
     * A <a>ComputeType</a> object that specifies the compute type for the
     * bundle.
     *
     * @return A <a>ComputeType</a> object that specifies the compute type for the
     *         bundle.
     */
    public ComputeType getComputeType() {
        return computeType;
    }
    
    /**
     * A <a>ComputeType</a> object that specifies the compute type for the
     * bundle.
     *
     * @param computeType A <a>ComputeType</a> object that specifies the compute type for the
     *         bundle.
     */
    public void setComputeType(ComputeType computeType) {
        this.computeType = computeType;
    }
    
    /**
     * A <a>ComputeType</a> object that specifies the compute type for the
     * bundle.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param computeType A <a>ComputeType</a> object that specifies the compute type for the
     *         bundle.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkspaceBundle withComputeType(ComputeType computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBundleId() != null) sb.append("BundleId: " + getBundleId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getOwner() != null) sb.append("Owner: " + getOwner() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getUserStorage() != null) sb.append("UserStorage: " + getUserStorage() + ",");
        if (getComputeType() != null) sb.append("ComputeType: " + getComputeType() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkspaceBundle == false) return false;
        WorkspaceBundle other = (WorkspaceBundle)obj;
        
        if (other.getBundleId() == null ^ this.getBundleId() == null) return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getOwner() == null ^ this.getOwner() == null) return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getUserStorage() == null ^ this.getUserStorage() == null) return false;
        if (other.getUserStorage() != null && other.getUserStorage().equals(this.getUserStorage()) == false) return false; 
        if (other.getComputeType() == null ^ this.getComputeType() == null) return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false) return false; 
        return true;
    }
    
    @Override
    public WorkspaceBundle clone() {
        try {
            return (WorkspaceBundle) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    