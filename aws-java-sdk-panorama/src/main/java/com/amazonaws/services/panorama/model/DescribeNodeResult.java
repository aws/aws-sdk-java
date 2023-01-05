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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNodeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The node's asset name.
     * </p>
     */
    private String assetName;
    /**
     * <p>
     * The node's category.
     * </p>
     */
    private String category;
    /**
     * <p>
     * When the node was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The node's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * When the node was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The node's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The node's ID.
     * </p>
     */
    private String nodeId;
    /**
     * <p>
     * The node's interface.
     * </p>
     */
    private NodeInterface nodeInterface;
    /**
     * <p>
     * The account ID of the node's owner.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The node's ARN.
     * </p>
     */
    private String packageArn;
    /**
     * <p>
     * The node's package ID.
     * </p>
     */
    private String packageId;
    /**
     * <p>
     * The node's package name.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The node's package version.
     * </p>
     */
    private String packageVersion;
    /**
     * <p>
     * The node's patch version.
     * </p>
     */
    private String patchVersion;

    /**
     * <p>
     * The node's asset name.
     * </p>
     * 
     * @param assetName
     *        The node's asset name.
     */

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * <p>
     * The node's asset name.
     * </p>
     * 
     * @return The node's asset name.
     */

    public String getAssetName() {
        return this.assetName;
    }

    /**
     * <p>
     * The node's asset name.
     * </p>
     * 
     * @param assetName
     *        The node's asset name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withAssetName(String assetName) {
        setAssetName(assetName);
        return this;
    }

    /**
     * <p>
     * The node's category.
     * </p>
     * 
     * @param category
     *        The node's category.
     * @see NodeCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The node's category.
     * </p>
     * 
     * @return The node's category.
     * @see NodeCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The node's category.
     * </p>
     * 
     * @param category
     *        The node's category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeCategory
     */

    public DescribeNodeResult withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The node's category.
     * </p>
     * 
     * @param category
     *        The node's category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeCategory
     */

    public DescribeNodeResult withCategory(NodeCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * When the node was created.
     * </p>
     * 
     * @param createdTime
     *        When the node was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * When the node was created.
     * </p>
     * 
     * @return When the node was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * When the node was created.
     * </p>
     * 
     * @param createdTime
     *        When the node was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The node's description.
     * </p>
     * 
     * @param description
     *        The node's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The node's description.
     * </p>
     * 
     * @return The node's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The node's description.
     * </p>
     * 
     * @param description
     *        The node's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * When the node was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        When the node was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * When the node was updated.
     * </p>
     * 
     * @return When the node was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * When the node was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        When the node was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The node's name.
     * </p>
     * 
     * @param name
     *        The node's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The node's name.
     * </p>
     * 
     * @return The node's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The node's name.
     * </p>
     * 
     * @param name
     *        The node's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The node's ID.
     * </p>
     * 
     * @param nodeId
     *        The node's ID.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * The node's ID.
     * </p>
     * 
     * @return The node's ID.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * The node's ID.
     * </p>
     * 
     * @param nodeId
     *        The node's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withNodeId(String nodeId) {
        setNodeId(nodeId);
        return this;
    }

    /**
     * <p>
     * The node's interface.
     * </p>
     * 
     * @param nodeInterface
     *        The node's interface.
     */

    public void setNodeInterface(NodeInterface nodeInterface) {
        this.nodeInterface = nodeInterface;
    }

    /**
     * <p>
     * The node's interface.
     * </p>
     * 
     * @return The node's interface.
     */

    public NodeInterface getNodeInterface() {
        return this.nodeInterface;
    }

    /**
     * <p>
     * The node's interface.
     * </p>
     * 
     * @param nodeInterface
     *        The node's interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withNodeInterface(NodeInterface nodeInterface) {
        setNodeInterface(nodeInterface);
        return this;
    }

    /**
     * <p>
     * The account ID of the node's owner.
     * </p>
     * 
     * @param ownerAccount
     *        The account ID of the node's owner.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The account ID of the node's owner.
     * </p>
     * 
     * @return The account ID of the node's owner.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The account ID of the node's owner.
     * </p>
     * 
     * @param ownerAccount
     *        The account ID of the node's owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The node's ARN.
     * </p>
     * 
     * @param packageArn
     *        The node's ARN.
     */

    public void setPackageArn(String packageArn) {
        this.packageArn = packageArn;
    }

    /**
     * <p>
     * The node's ARN.
     * </p>
     * 
     * @return The node's ARN.
     */

    public String getPackageArn() {
        return this.packageArn;
    }

    /**
     * <p>
     * The node's ARN.
     * </p>
     * 
     * @param packageArn
     *        The node's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withPackageArn(String packageArn) {
        setPackageArn(packageArn);
        return this;
    }

    /**
     * <p>
     * The node's package ID.
     * </p>
     * 
     * @param packageId
     *        The node's package ID.
     */

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    /**
     * <p>
     * The node's package ID.
     * </p>
     * 
     * @return The node's package ID.
     */

    public String getPackageId() {
        return this.packageId;
    }

    /**
     * <p>
     * The node's package ID.
     * </p>
     * 
     * @param packageId
     *        The node's package ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withPackageId(String packageId) {
        setPackageId(packageId);
        return this;
    }

    /**
     * <p>
     * The node's package name.
     * </p>
     * 
     * @param packageName
     *        The node's package name.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The node's package name.
     * </p>
     * 
     * @return The node's package name.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The node's package name.
     * </p>
     * 
     * @param packageName
     *        The node's package name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The node's package version.
     * </p>
     * 
     * @param packageVersion
     *        The node's package version.
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * The node's package version.
     * </p>
     * 
     * @return The node's package version.
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * The node's package version.
     * </p>
     * 
     * @param packageVersion
     *        The node's package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
        return this;
    }

    /**
     * <p>
     * The node's patch version.
     * </p>
     * 
     * @param patchVersion
     *        The node's patch version.
     */

    public void setPatchVersion(String patchVersion) {
        this.patchVersion = patchVersion;
    }

    /**
     * <p>
     * The node's patch version.
     * </p>
     * 
     * @return The node's patch version.
     */

    public String getPatchVersion() {
        return this.patchVersion;
    }

    /**
     * <p>
     * The node's patch version.
     * </p>
     * 
     * @param patchVersion
     *        The node's patch version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeResult withPatchVersion(String patchVersion) {
        setPatchVersion(patchVersion);
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
        if (getAssetName() != null)
            sb.append("AssetName: ").append(getAssetName()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId()).append(",");
        if (getNodeInterface() != null)
            sb.append("NodeInterface: ").append(getNodeInterface()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getPackageArn() != null)
            sb.append("PackageArn: ").append(getPackageArn()).append(",");
        if (getPackageId() != null)
            sb.append("PackageId: ").append(getPackageId()).append(",");
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion()).append(",");
        if (getPatchVersion() != null)
            sb.append("PatchVersion: ").append(getPatchVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNodeResult == false)
            return false;
        DescribeNodeResult other = (DescribeNodeResult) obj;
        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        if (other.getNodeInterface() == null ^ this.getNodeInterface() == null)
            return false;
        if (other.getNodeInterface() != null && other.getNodeInterface().equals(this.getNodeInterface()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getPackageArn() == null ^ this.getPackageArn() == null)
            return false;
        if (other.getPackageArn() != null && other.getPackageArn().equals(this.getPackageArn()) == false)
            return false;
        if (other.getPackageId() == null ^ this.getPackageId() == null)
            return false;
        if (other.getPackageId() != null && other.getPackageId().equals(this.getPackageId()) == false)
            return false;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        if (other.getPatchVersion() == null ^ this.getPatchVersion() == null)
            return false;
        if (other.getPatchVersion() != null && other.getPatchVersion().equals(this.getPatchVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        hashCode = prime * hashCode + ((getNodeInterface() == null) ? 0 : getNodeInterface().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getPackageArn() == null) ? 0 : getPackageArn().hashCode());
        hashCode = prime * hashCode + ((getPackageId() == null) ? 0 : getPackageId().hashCode());
        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getPatchVersion() == null) ? 0 : getPatchVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNodeResult clone() {
        try {
            return (DescribeNodeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
