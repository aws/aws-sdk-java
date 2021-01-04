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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a summary of an asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the asset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the asset model used to create this asset.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;
    /**
     * <p>
     * The current status of the asset.
     * </p>
     */
    private AssetStatus status;
    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     * parent/child asset relationships.
     * </p>
     */
    private java.util.List<AssetHierarchy> hierarchies;

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param id
     *        The ID of the asset.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @return The ID of the asset.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param id
     *        The ID of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        asset, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         asset, which has the following format.</p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        asset, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @param name
     *        The name of the asset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @return The name of the asset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @param name
     *        The name of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the asset model used to create this asset.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model used to create this asset.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model used to create this asset.
     * </p>
     * 
     * @return The ID of the asset model used to create this asset.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model used to create this asset.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model used to create this asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     * 
     * @param creationDate
     *        The date the asset was created, in Unix epoch time.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     * 
     * @return The date the asset was created, in Unix epoch time.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     * 
     * @param creationDate
     *        The date the asset was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the asset was last updated, in Unix epoch time.
     */

    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the asset was last updated, in Unix epoch time.
     */

    public java.util.Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the asset was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary withLastUpdateDate(java.util.Date lastUpdateDate) {
        setLastUpdateDate(lastUpdateDate);
        return this;
    }

    /**
     * <p>
     * The current status of the asset.
     * </p>
     * 
     * @param status
     *        The current status of the asset.
     */

    public void setStatus(AssetStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the asset.
     * </p>
     * 
     * @return The current status of the asset.
     */

    public AssetStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the asset.
     * </p>
     * 
     * @param status
     *        The current status of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary withStatus(AssetStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     * parent/child asset relationships.
     * </p>
     * 
     * @return A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     *         parent/child asset relationships.
     */

    public java.util.List<AssetHierarchy> getHierarchies() {
        return hierarchies;
    }

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     * parent/child asset relationships.
     * </p>
     * 
     * @param hierarchies
     *        A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     *        parent/child asset relationships.
     */

    public void setHierarchies(java.util.Collection<AssetHierarchy> hierarchies) {
        if (hierarchies == null) {
            this.hierarchies = null;
            return;
        }

        this.hierarchies = new java.util.ArrayList<AssetHierarchy>(hierarchies);
    }

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     * parent/child asset relationships.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHierarchies(java.util.Collection)} or {@link #withHierarchies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hierarchies
     *        A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     *        parent/child asset relationships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary withHierarchies(AssetHierarchy... hierarchies) {
        if (this.hierarchies == null) {
            setHierarchies(new java.util.ArrayList<AssetHierarchy>(hierarchies.length));
        }
        for (AssetHierarchy ele : hierarchies) {
            this.hierarchies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     * parent/child asset relationships.
     * </p>
     * 
     * @param hierarchies
     *        A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     *        parent/child asset relationships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary withHierarchies(java.util.Collection<AssetHierarchy> hierarchies) {
        setHierarchies(hierarchies);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAssetModelId() != null)
            sb.append("AssetModelId: ").append(getAssetModelId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastUpdateDate() != null)
            sb.append("LastUpdateDate: ").append(getLastUpdateDate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getHierarchies() != null)
            sb.append("Hierarchies: ").append(getHierarchies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetSummary == false)
            return false;
        AssetSummary other = (AssetSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getHierarchies() == null ^ this.getHierarchies() == null)
            return false;
        if (other.getHierarchies() != null && other.getHierarchies().equals(this.getHierarchies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getHierarchies() == null) ? 0 : getHierarchies().hashCode());
        return hashCode;
    }

    @Override
    public AssetSummary clone() {
        try {
            return (AssetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
