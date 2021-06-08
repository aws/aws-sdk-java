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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAsset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     */
    private String assetArn;
    /**
     * <p>
     * The name of the asset.
     * </p>
     */
    private String assetName;
    /**
     * <p>
     * The ID of the asset model that was used to create the asset.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * The list of asset properties for the asset.
     * </p>
     * <p>
     * This object doesn't include properties that you define in composite models. You can find composite model
     * properties in the <code>assetCompositeModels</code> object.
     * </p>
     */
    private java.util.List<AssetProperty> assetProperties;
    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     * parent/child asset relationships.
     * </p>
     */
    private java.util.List<AssetHierarchy> assetHierarchies;
    /**
     * <p>
     * The composite models for the asset.
     * </p>
     */
    private java.util.List<AssetCompositeModel> assetCompositeModels;
    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date assetCreationDate;
    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date assetLastUpdateDate;
    /**
     * <p>
     * The current status of the asset, which contains a state and any error message.
     * </p>
     */
    private AssetStatus assetStatus;

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @return The ID of the asset.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetId(String assetId) {
        setAssetId(assetId);
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
     * @param assetArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        asset, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     */

    public void setAssetArn(String assetArn) {
        this.assetArn = assetArn;
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

    public String getAssetArn() {
        return this.assetArn;
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
     * @param assetArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        asset, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetArn(String assetArn) {
        setAssetArn(assetArn);
        return this;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @param assetName
     *        The name of the asset.
     */

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @return The name of the asset.
     */

    public String getAssetName() {
        return this.assetName;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @param assetName
     *        The name of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetName(String assetName) {
        setAssetName(assetName);
        return this;
    }

    /**
     * <p>
     * The ID of the asset model that was used to create the asset.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model that was used to create the asset.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model that was used to create the asset.
     * </p>
     * 
     * @return The ID of the asset model that was used to create the asset.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model that was used to create the asset.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model that was used to create the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * The list of asset properties for the asset.
     * </p>
     * <p>
     * This object doesn't include properties that you define in composite models. You can find composite model
     * properties in the <code>assetCompositeModels</code> object.
     * </p>
     * 
     * @return The list of asset properties for the asset.</p>
     *         <p>
     *         This object doesn't include properties that you define in composite models. You can find composite model
     *         properties in the <code>assetCompositeModels</code> object.
     */

    public java.util.List<AssetProperty> getAssetProperties() {
        return assetProperties;
    }

    /**
     * <p>
     * The list of asset properties for the asset.
     * </p>
     * <p>
     * This object doesn't include properties that you define in composite models. You can find composite model
     * properties in the <code>assetCompositeModels</code> object.
     * </p>
     * 
     * @param assetProperties
     *        The list of asset properties for the asset.</p>
     *        <p>
     *        This object doesn't include properties that you define in composite models. You can find composite model
     *        properties in the <code>assetCompositeModels</code> object.
     */

    public void setAssetProperties(java.util.Collection<AssetProperty> assetProperties) {
        if (assetProperties == null) {
            this.assetProperties = null;
            return;
        }

        this.assetProperties = new java.util.ArrayList<AssetProperty>(assetProperties);
    }

    /**
     * <p>
     * The list of asset properties for the asset.
     * </p>
     * <p>
     * This object doesn't include properties that you define in composite models. You can find composite model
     * properties in the <code>assetCompositeModels</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetProperties(java.util.Collection)} or {@link #withAssetProperties(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param assetProperties
     *        The list of asset properties for the asset.</p>
     *        <p>
     *        This object doesn't include properties that you define in composite models. You can find composite model
     *        properties in the <code>assetCompositeModels</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetProperties(AssetProperty... assetProperties) {
        if (this.assetProperties == null) {
            setAssetProperties(new java.util.ArrayList<AssetProperty>(assetProperties.length));
        }
        for (AssetProperty ele : assetProperties) {
            this.assetProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of asset properties for the asset.
     * </p>
     * <p>
     * This object doesn't include properties that you define in composite models. You can find composite model
     * properties in the <code>assetCompositeModels</code> object.
     * </p>
     * 
     * @param assetProperties
     *        The list of asset properties for the asset.</p>
     *        <p>
     *        This object doesn't include properties that you define in composite models. You can find composite model
     *        properties in the <code>assetCompositeModels</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetProperties(java.util.Collection<AssetProperty> assetProperties) {
        setAssetProperties(assetProperties);
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

    public java.util.List<AssetHierarchy> getAssetHierarchies() {
        return assetHierarchies;
    }

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     * parent/child asset relationships.
     * </p>
     * 
     * @param assetHierarchies
     *        A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     *        parent/child asset relationships.
     */

    public void setAssetHierarchies(java.util.Collection<AssetHierarchy> assetHierarchies) {
        if (assetHierarchies == null) {
            this.assetHierarchies = null;
            return;
        }

        this.assetHierarchies = new java.util.ArrayList<AssetHierarchy>(assetHierarchies);
    }

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     * parent/child asset relationships.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetHierarchies(java.util.Collection)} or {@link #withAssetHierarchies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param assetHierarchies
     *        A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     *        parent/child asset relationships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetHierarchies(AssetHierarchy... assetHierarchies) {
        if (this.assetHierarchies == null) {
            setAssetHierarchies(new java.util.ArrayList<AssetHierarchy>(assetHierarchies.length));
        }
        for (AssetHierarchy ele : assetHierarchies) {
            this.assetHierarchies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     * parent/child asset relationships.
     * </p>
     * 
     * @param assetHierarchies
     *        A list of asset hierarchies that each contain a <code>hierarchyId</code>. A hierarchy specifies allowed
     *        parent/child asset relationships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetHierarchies(java.util.Collection<AssetHierarchy> assetHierarchies) {
        setAssetHierarchies(assetHierarchies);
        return this;
    }

    /**
     * <p>
     * The composite models for the asset.
     * </p>
     * 
     * @return The composite models for the asset.
     */

    public java.util.List<AssetCompositeModel> getAssetCompositeModels() {
        return assetCompositeModels;
    }

    /**
     * <p>
     * The composite models for the asset.
     * </p>
     * 
     * @param assetCompositeModels
     *        The composite models for the asset.
     */

    public void setAssetCompositeModels(java.util.Collection<AssetCompositeModel> assetCompositeModels) {
        if (assetCompositeModels == null) {
            this.assetCompositeModels = null;
            return;
        }

        this.assetCompositeModels = new java.util.ArrayList<AssetCompositeModel>(assetCompositeModels);
    }

    /**
     * <p>
     * The composite models for the asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetCompositeModels(java.util.Collection)} or {@link #withAssetCompositeModels(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param assetCompositeModels
     *        The composite models for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetCompositeModels(AssetCompositeModel... assetCompositeModels) {
        if (this.assetCompositeModels == null) {
            setAssetCompositeModels(new java.util.ArrayList<AssetCompositeModel>(assetCompositeModels.length));
        }
        for (AssetCompositeModel ele : assetCompositeModels) {
            this.assetCompositeModels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The composite models for the asset.
     * </p>
     * 
     * @param assetCompositeModels
     *        The composite models for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetCompositeModels(java.util.Collection<AssetCompositeModel> assetCompositeModels) {
        setAssetCompositeModels(assetCompositeModels);
        return this;
    }

    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     * 
     * @param assetCreationDate
     *        The date the asset was created, in Unix epoch time.
     */

    public void setAssetCreationDate(java.util.Date assetCreationDate) {
        this.assetCreationDate = assetCreationDate;
    }

    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     * 
     * @return The date the asset was created, in Unix epoch time.
     */

    public java.util.Date getAssetCreationDate() {
        return this.assetCreationDate;
    }

    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     * 
     * @param assetCreationDate
     *        The date the asset was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetCreationDate(java.util.Date assetCreationDate) {
        setAssetCreationDate(assetCreationDate);
        return this;
    }

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     * 
     * @param assetLastUpdateDate
     *        The date the asset was last updated, in Unix epoch time.
     */

    public void setAssetLastUpdateDate(java.util.Date assetLastUpdateDate) {
        this.assetLastUpdateDate = assetLastUpdateDate;
    }

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the asset was last updated, in Unix epoch time.
     */

    public java.util.Date getAssetLastUpdateDate() {
        return this.assetLastUpdateDate;
    }

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     * 
     * @param assetLastUpdateDate
     *        The date the asset was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetLastUpdateDate(java.util.Date assetLastUpdateDate) {
        setAssetLastUpdateDate(assetLastUpdateDate);
        return this;
    }

    /**
     * <p>
     * The current status of the asset, which contains a state and any error message.
     * </p>
     * 
     * @param assetStatus
     *        The current status of the asset, which contains a state and any error message.
     */

    public void setAssetStatus(AssetStatus assetStatus) {
        this.assetStatus = assetStatus;
    }

    /**
     * <p>
     * The current status of the asset, which contains a state and any error message.
     * </p>
     * 
     * @return The current status of the asset, which contains a state and any error message.
     */

    public AssetStatus getAssetStatus() {
        return this.assetStatus;
    }

    /**
     * <p>
     * The current status of the asset, which contains a state and any error message.
     * </p>
     * 
     * @param assetStatus
     *        The current status of the asset, which contains a state and any error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetResult withAssetStatus(AssetStatus assetStatus) {
        setAssetStatus(assetStatus);
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getAssetArn() != null)
            sb.append("AssetArn: ").append(getAssetArn()).append(",");
        if (getAssetName() != null)
            sb.append("AssetName: ").append(getAssetName()).append(",");
        if (getAssetModelId() != null)
            sb.append("AssetModelId: ").append(getAssetModelId()).append(",");
        if (getAssetProperties() != null)
            sb.append("AssetProperties: ").append(getAssetProperties()).append(",");
        if (getAssetHierarchies() != null)
            sb.append("AssetHierarchies: ").append(getAssetHierarchies()).append(",");
        if (getAssetCompositeModels() != null)
            sb.append("AssetCompositeModels: ").append(getAssetCompositeModels()).append(",");
        if (getAssetCreationDate() != null)
            sb.append("AssetCreationDate: ").append(getAssetCreationDate()).append(",");
        if (getAssetLastUpdateDate() != null)
            sb.append("AssetLastUpdateDate: ").append(getAssetLastUpdateDate()).append(",");
        if (getAssetStatus() != null)
            sb.append("AssetStatus: ").append(getAssetStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssetResult == false)
            return false;
        DescribeAssetResult other = (DescribeAssetResult) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetArn() == null ^ this.getAssetArn() == null)
            return false;
        if (other.getAssetArn() != null && other.getAssetArn().equals(this.getAssetArn()) == false)
            return false;
        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getAssetProperties() == null ^ this.getAssetProperties() == null)
            return false;
        if (other.getAssetProperties() != null && other.getAssetProperties().equals(this.getAssetProperties()) == false)
            return false;
        if (other.getAssetHierarchies() == null ^ this.getAssetHierarchies() == null)
            return false;
        if (other.getAssetHierarchies() != null && other.getAssetHierarchies().equals(this.getAssetHierarchies()) == false)
            return false;
        if (other.getAssetCompositeModels() == null ^ this.getAssetCompositeModels() == null)
            return false;
        if (other.getAssetCompositeModels() != null && other.getAssetCompositeModels().equals(this.getAssetCompositeModels()) == false)
            return false;
        if (other.getAssetCreationDate() == null ^ this.getAssetCreationDate() == null)
            return false;
        if (other.getAssetCreationDate() != null && other.getAssetCreationDate().equals(this.getAssetCreationDate()) == false)
            return false;
        if (other.getAssetLastUpdateDate() == null ^ this.getAssetLastUpdateDate() == null)
            return false;
        if (other.getAssetLastUpdateDate() != null && other.getAssetLastUpdateDate().equals(this.getAssetLastUpdateDate()) == false)
            return false;
        if (other.getAssetStatus() == null ^ this.getAssetStatus() == null)
            return false;
        if (other.getAssetStatus() != null && other.getAssetStatus().equals(this.getAssetStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAssetArn() == null) ? 0 : getAssetArn().hashCode());
        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetProperties() == null) ? 0 : getAssetProperties().hashCode());
        hashCode = prime * hashCode + ((getAssetHierarchies() == null) ? 0 : getAssetHierarchies().hashCode());
        hashCode = prime * hashCode + ((getAssetCompositeModels() == null) ? 0 : getAssetCompositeModels().hashCode());
        hashCode = prime * hashCode + ((getAssetCreationDate() == null) ? 0 : getAssetCreationDate().hashCode());
        hashCode = prime * hashCode + ((getAssetLastUpdateDate() == null) ? 0 : getAssetLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getAssetStatus() == null) ? 0 : getAssetStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssetResult clone() {
        try {
            return (DescribeAssetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
