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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Access Control List. You can authenticate users with Access Contol Lists. ACLs enable you to control cluster
 * access by grouping users. These Access control lists are designed as a way to organize access to clusters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ACL" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ACL implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Access Control List
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates ACL status. Can be "creating", "active", "modifying", "deleting".
     * </p>
     */
    private String status;
    /**
     * <p>
     * The list of user names that belong to the ACL.
     * </p>
     */
    private java.util.List<String> userNames;
    /**
     * <p>
     * The minimum engine version supported for the ACL
     * </p>
     */
    private String minimumEngineVersion;
    /**
     * <p>
     * A list of updates being applied to the ACL.
     * </p>
     */
    private ACLPendingChanges pendingChanges;
    /**
     * <p>
     * A list of clusters associated with the ACL.
     * </p>
     */
    private java.util.List<String> clusters;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ACL
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The name of the Access Control List
     * </p>
     * 
     * @param name
     *        The name of the Access Control List
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Access Control List
     * </p>
     * 
     * @return The name of the Access Control List
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Access Control List
     * </p>
     * 
     * @param name
     *        The name of the Access Control List
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACL withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates ACL status. Can be "creating", "active", "modifying", "deleting".
     * </p>
     * 
     * @param status
     *        Indicates ACL status. Can be "creating", "active", "modifying", "deleting".
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates ACL status. Can be "creating", "active", "modifying", "deleting".
     * </p>
     * 
     * @return Indicates ACL status. Can be "creating", "active", "modifying", "deleting".
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates ACL status. Can be "creating", "active", "modifying", "deleting".
     * </p>
     * 
     * @param status
     *        Indicates ACL status. Can be "creating", "active", "modifying", "deleting".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACL withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The list of user names that belong to the ACL.
     * </p>
     * 
     * @return The list of user names that belong to the ACL.
     */

    public java.util.List<String> getUserNames() {
        return userNames;
    }

    /**
     * <p>
     * The list of user names that belong to the ACL.
     * </p>
     * 
     * @param userNames
     *        The list of user names that belong to the ACL.
     */

    public void setUserNames(java.util.Collection<String> userNames) {
        if (userNames == null) {
            this.userNames = null;
            return;
        }

        this.userNames = new java.util.ArrayList<String>(userNames);
    }

    /**
     * <p>
     * The list of user names that belong to the ACL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserNames(java.util.Collection)} or {@link #withUserNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userNames
     *        The list of user names that belong to the ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACL withUserNames(String... userNames) {
        if (this.userNames == null) {
            setUserNames(new java.util.ArrayList<String>(userNames.length));
        }
        for (String ele : userNames) {
            this.userNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user names that belong to the ACL.
     * </p>
     * 
     * @param userNames
     *        The list of user names that belong to the ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACL withUserNames(java.util.Collection<String> userNames) {
        setUserNames(userNames);
        return this;
    }

    /**
     * <p>
     * The minimum engine version supported for the ACL
     * </p>
     * 
     * @param minimumEngineVersion
     *        The minimum engine version supported for the ACL
     */

    public void setMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
    }

    /**
     * <p>
     * The minimum engine version supported for the ACL
     * </p>
     * 
     * @return The minimum engine version supported for the ACL
     */

    public String getMinimumEngineVersion() {
        return this.minimumEngineVersion;
    }

    /**
     * <p>
     * The minimum engine version supported for the ACL
     * </p>
     * 
     * @param minimumEngineVersion
     *        The minimum engine version supported for the ACL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACL withMinimumEngineVersion(String minimumEngineVersion) {
        setMinimumEngineVersion(minimumEngineVersion);
        return this;
    }

    /**
     * <p>
     * A list of updates being applied to the ACL.
     * </p>
     * 
     * @param pendingChanges
     *        A list of updates being applied to the ACL.
     */

    public void setPendingChanges(ACLPendingChanges pendingChanges) {
        this.pendingChanges = pendingChanges;
    }

    /**
     * <p>
     * A list of updates being applied to the ACL.
     * </p>
     * 
     * @return A list of updates being applied to the ACL.
     */

    public ACLPendingChanges getPendingChanges() {
        return this.pendingChanges;
    }

    /**
     * <p>
     * A list of updates being applied to the ACL.
     * </p>
     * 
     * @param pendingChanges
     *        A list of updates being applied to the ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACL withPendingChanges(ACLPendingChanges pendingChanges) {
        setPendingChanges(pendingChanges);
        return this;
    }

    /**
     * <p>
     * A list of clusters associated with the ACL.
     * </p>
     * 
     * @return A list of clusters associated with the ACL.
     */

    public java.util.List<String> getClusters() {
        return clusters;
    }

    /**
     * <p>
     * A list of clusters associated with the ACL.
     * </p>
     * 
     * @param clusters
     *        A list of clusters associated with the ACL.
     */

    public void setClusters(java.util.Collection<String> clusters) {
        if (clusters == null) {
            this.clusters = null;
            return;
        }

        this.clusters = new java.util.ArrayList<String>(clusters);
    }

    /**
     * <p>
     * A list of clusters associated with the ACL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusters(java.util.Collection)} or {@link #withClusters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param clusters
     *        A list of clusters associated with the ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACL withClusters(String... clusters) {
        if (this.clusters == null) {
            setClusters(new java.util.ArrayList<String>(clusters.length));
        }
        for (String ele : clusters) {
            this.clusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of clusters associated with the ACL.
     * </p>
     * 
     * @param clusters
     *        A list of clusters associated with the ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACL withClusters(java.util.Collection<String> clusters) {
        setClusters(clusters);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ACL
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the ACL
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ACL
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ACL
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ACL
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the ACL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACL withARN(String aRN) {
        setARN(aRN);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUserNames() != null)
            sb.append("UserNames: ").append(getUserNames()).append(",");
        if (getMinimumEngineVersion() != null)
            sb.append("MinimumEngineVersion: ").append(getMinimumEngineVersion()).append(",");
        if (getPendingChanges() != null)
            sb.append("PendingChanges: ").append(getPendingChanges()).append(",");
        if (getClusters() != null)
            sb.append("Clusters: ").append(getClusters()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ACL == false)
            return false;
        ACL other = (ACL) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUserNames() == null ^ this.getUserNames() == null)
            return false;
        if (other.getUserNames() != null && other.getUserNames().equals(this.getUserNames()) == false)
            return false;
        if (other.getMinimumEngineVersion() == null ^ this.getMinimumEngineVersion() == null)
            return false;
        if (other.getMinimumEngineVersion() != null && other.getMinimumEngineVersion().equals(this.getMinimumEngineVersion()) == false)
            return false;
        if (other.getPendingChanges() == null ^ this.getPendingChanges() == null)
            return false;
        if (other.getPendingChanges() != null && other.getPendingChanges().equals(this.getPendingChanges()) == false)
            return false;
        if (other.getClusters() == null ^ this.getClusters() == null)
            return false;
        if (other.getClusters() != null && other.getClusters().equals(this.getClusters()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUserNames() == null) ? 0 : getUserNames().hashCode());
        hashCode = prime * hashCode + ((getMinimumEngineVersion() == null) ? 0 : getMinimumEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getPendingChanges() == null) ? 0 : getPendingChanges().hashCode());
        hashCode = prime * hashCode + ((getClusters() == null) ? 0 : getClusters().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public ACL clone() {
        try {
            return (ACL) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ACLMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
