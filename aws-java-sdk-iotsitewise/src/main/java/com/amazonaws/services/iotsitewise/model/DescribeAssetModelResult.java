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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset model.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset
     * model, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     * </p>
     */
    private String assetModelArn;
    /**
     * <p>
     * The name of the asset model.
     * </p>
     */
    private String assetModelName;
    /**
     * <p>
     * The asset model's description.
     * </p>
     */
    private String assetModelDescription;
    /**
     * <p>
     * The list of asset properties for the asset model.
     * </p>
     * <p>
     * This object doesn't include properties that you define in composite models. You can find composite model
     * properties in the <code>assetModelCompositeModels</code> object.
     * </p>
     */
    private java.util.List<AssetModelProperty> assetModelProperties;
    /**
     * <p>
     * A list of asset model hierarchies that each contain a <code>childAssetModelId</code> and a
     * <code>hierarchyId</code> (named <code>id</code>). A hierarchy specifies allowed parent/child asset relationships
     * for an asset model.
     * </p>
     */
    private java.util.List<AssetModelHierarchy> assetModelHierarchies;
    /**
     * <p>
     * The list of composite asset models for the asset model.
     * </p>
     */
    private java.util.List<AssetModelCompositeModel> assetModelCompositeModels;
    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date assetModelCreationDate;
    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date assetModelLastUpdateDate;
    /**
     * <p>
     * The current status of the asset model, which contains a state and any error message.
     * </p>
     */
    private AssetModelStatus assetModelStatus;

    /**
     * <p>
     * The ID of the asset model.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model.
     * </p>
     * 
     * @return The ID of the asset model.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset
     * model, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     * </p>
     * 
     * @param assetModelArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        asset model, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     */

    public void setAssetModelArn(String assetModelArn) {
        this.assetModelArn = assetModelArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset
     * model, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         asset model, which has the following format.</p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     */

    public String getAssetModelArn() {
        return this.assetModelArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset
     * model, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     * </p>
     * 
     * @param assetModelArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        asset model, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelArn(String assetModelArn) {
        setAssetModelArn(assetModelArn);
        return this;
    }

    /**
     * <p>
     * The name of the asset model.
     * </p>
     * 
     * @param assetModelName
     *        The name of the asset model.
     */

    public void setAssetModelName(String assetModelName) {
        this.assetModelName = assetModelName;
    }

    /**
     * <p>
     * The name of the asset model.
     * </p>
     * 
     * @return The name of the asset model.
     */

    public String getAssetModelName() {
        return this.assetModelName;
    }

    /**
     * <p>
     * The name of the asset model.
     * </p>
     * 
     * @param assetModelName
     *        The name of the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelName(String assetModelName) {
        setAssetModelName(assetModelName);
        return this;
    }

    /**
     * <p>
     * The asset model's description.
     * </p>
     * 
     * @param assetModelDescription
     *        The asset model's description.
     */

    public void setAssetModelDescription(String assetModelDescription) {
        this.assetModelDescription = assetModelDescription;
    }

    /**
     * <p>
     * The asset model's description.
     * </p>
     * 
     * @return The asset model's description.
     */

    public String getAssetModelDescription() {
        return this.assetModelDescription;
    }

    /**
     * <p>
     * The asset model's description.
     * </p>
     * 
     * @param assetModelDescription
     *        The asset model's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelDescription(String assetModelDescription) {
        setAssetModelDescription(assetModelDescription);
        return this;
    }

    /**
     * <p>
     * The list of asset properties for the asset model.
     * </p>
     * <p>
     * This object doesn't include properties that you define in composite models. You can find composite model
     * properties in the <code>assetModelCompositeModels</code> object.
     * </p>
     * 
     * @return The list of asset properties for the asset model.</p>
     *         <p>
     *         This object doesn't include properties that you define in composite models. You can find composite model
     *         properties in the <code>assetModelCompositeModels</code> object.
     */

    public java.util.List<AssetModelProperty> getAssetModelProperties() {
        return assetModelProperties;
    }

    /**
     * <p>
     * The list of asset properties for the asset model.
     * </p>
     * <p>
     * This object doesn't include properties that you define in composite models. You can find composite model
     * properties in the <code>assetModelCompositeModels</code> object.
     * </p>
     * 
     * @param assetModelProperties
     *        The list of asset properties for the asset model.</p>
     *        <p>
     *        This object doesn't include properties that you define in composite models. You can find composite model
     *        properties in the <code>assetModelCompositeModels</code> object.
     */

    public void setAssetModelProperties(java.util.Collection<AssetModelProperty> assetModelProperties) {
        if (assetModelProperties == null) {
            this.assetModelProperties = null;
            return;
        }

        this.assetModelProperties = new java.util.ArrayList<AssetModelProperty>(assetModelProperties);
    }

    /**
     * <p>
     * The list of asset properties for the asset model.
     * </p>
     * <p>
     * This object doesn't include properties that you define in composite models. You can find composite model
     * properties in the <code>assetModelCompositeModels</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelProperties(java.util.Collection)} or {@link #withAssetModelProperties(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param assetModelProperties
     *        The list of asset properties for the asset model.</p>
     *        <p>
     *        This object doesn't include properties that you define in composite models. You can find composite model
     *        properties in the <code>assetModelCompositeModels</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelProperties(AssetModelProperty... assetModelProperties) {
        if (this.assetModelProperties == null) {
            setAssetModelProperties(new java.util.ArrayList<AssetModelProperty>(assetModelProperties.length));
        }
        for (AssetModelProperty ele : assetModelProperties) {
            this.assetModelProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of asset properties for the asset model.
     * </p>
     * <p>
     * This object doesn't include properties that you define in composite models. You can find composite model
     * properties in the <code>assetModelCompositeModels</code> object.
     * </p>
     * 
     * @param assetModelProperties
     *        The list of asset properties for the asset model.</p>
     *        <p>
     *        This object doesn't include properties that you define in composite models. You can find composite model
     *        properties in the <code>assetModelCompositeModels</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelProperties(java.util.Collection<AssetModelProperty> assetModelProperties) {
        setAssetModelProperties(assetModelProperties);
        return this;
    }

    /**
     * <p>
     * A list of asset model hierarchies that each contain a <code>childAssetModelId</code> and a
     * <code>hierarchyId</code> (named <code>id</code>). A hierarchy specifies allowed parent/child asset relationships
     * for an asset model.
     * </p>
     * 
     * @return A list of asset model hierarchies that each contain a <code>childAssetModelId</code> and a
     *         <code>hierarchyId</code> (named <code>id</code>). A hierarchy specifies allowed parent/child asset
     *         relationships for an asset model.
     */

    public java.util.List<AssetModelHierarchy> getAssetModelHierarchies() {
        return assetModelHierarchies;
    }

    /**
     * <p>
     * A list of asset model hierarchies that each contain a <code>childAssetModelId</code> and a
     * <code>hierarchyId</code> (named <code>id</code>). A hierarchy specifies allowed parent/child asset relationships
     * for an asset model.
     * </p>
     * 
     * @param assetModelHierarchies
     *        A list of asset model hierarchies that each contain a <code>childAssetModelId</code> and a
     *        <code>hierarchyId</code> (named <code>id</code>). A hierarchy specifies allowed parent/child asset
     *        relationships for an asset model.
     */

    public void setAssetModelHierarchies(java.util.Collection<AssetModelHierarchy> assetModelHierarchies) {
        if (assetModelHierarchies == null) {
            this.assetModelHierarchies = null;
            return;
        }

        this.assetModelHierarchies = new java.util.ArrayList<AssetModelHierarchy>(assetModelHierarchies);
    }

    /**
     * <p>
     * A list of asset model hierarchies that each contain a <code>childAssetModelId</code> and a
     * <code>hierarchyId</code> (named <code>id</code>). A hierarchy specifies allowed parent/child asset relationships
     * for an asset model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelHierarchies(java.util.Collection)} or
     * {@link #withAssetModelHierarchies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assetModelHierarchies
     *        A list of asset model hierarchies that each contain a <code>childAssetModelId</code> and a
     *        <code>hierarchyId</code> (named <code>id</code>). A hierarchy specifies allowed parent/child asset
     *        relationships for an asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelHierarchies(AssetModelHierarchy... assetModelHierarchies) {
        if (this.assetModelHierarchies == null) {
            setAssetModelHierarchies(new java.util.ArrayList<AssetModelHierarchy>(assetModelHierarchies.length));
        }
        for (AssetModelHierarchy ele : assetModelHierarchies) {
            this.assetModelHierarchies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of asset model hierarchies that each contain a <code>childAssetModelId</code> and a
     * <code>hierarchyId</code> (named <code>id</code>). A hierarchy specifies allowed parent/child asset relationships
     * for an asset model.
     * </p>
     * 
     * @param assetModelHierarchies
     *        A list of asset model hierarchies that each contain a <code>childAssetModelId</code> and a
     *        <code>hierarchyId</code> (named <code>id</code>). A hierarchy specifies allowed parent/child asset
     *        relationships for an asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelHierarchies(java.util.Collection<AssetModelHierarchy> assetModelHierarchies) {
        setAssetModelHierarchies(assetModelHierarchies);
        return this;
    }

    /**
     * <p>
     * The list of composite asset models for the asset model.
     * </p>
     * 
     * @return The list of composite asset models for the asset model.
     */

    public java.util.List<AssetModelCompositeModel> getAssetModelCompositeModels() {
        return assetModelCompositeModels;
    }

    /**
     * <p>
     * The list of composite asset models for the asset model.
     * </p>
     * 
     * @param assetModelCompositeModels
     *        The list of composite asset models for the asset model.
     */

    public void setAssetModelCompositeModels(java.util.Collection<AssetModelCompositeModel> assetModelCompositeModels) {
        if (assetModelCompositeModels == null) {
            this.assetModelCompositeModels = null;
            return;
        }

        this.assetModelCompositeModels = new java.util.ArrayList<AssetModelCompositeModel>(assetModelCompositeModels);
    }

    /**
     * <p>
     * The list of composite asset models for the asset model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelCompositeModels(java.util.Collection)} or
     * {@link #withAssetModelCompositeModels(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assetModelCompositeModels
     *        The list of composite asset models for the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelCompositeModels(AssetModelCompositeModel... assetModelCompositeModels) {
        if (this.assetModelCompositeModels == null) {
            setAssetModelCompositeModels(new java.util.ArrayList<AssetModelCompositeModel>(assetModelCompositeModels.length));
        }
        for (AssetModelCompositeModel ele : assetModelCompositeModels) {
            this.assetModelCompositeModels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of composite asset models for the asset model.
     * </p>
     * 
     * @param assetModelCompositeModels
     *        The list of composite asset models for the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelCompositeModels(java.util.Collection<AssetModelCompositeModel> assetModelCompositeModels) {
        setAssetModelCompositeModels(assetModelCompositeModels);
        return this;
    }

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     * 
     * @param assetModelCreationDate
     *        The date the asset model was created, in Unix epoch time.
     */

    public void setAssetModelCreationDate(java.util.Date assetModelCreationDate) {
        this.assetModelCreationDate = assetModelCreationDate;
    }

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     * 
     * @return The date the asset model was created, in Unix epoch time.
     */

    public java.util.Date getAssetModelCreationDate() {
        return this.assetModelCreationDate;
    }

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     * 
     * @param assetModelCreationDate
     *        The date the asset model was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelCreationDate(java.util.Date assetModelCreationDate) {
        setAssetModelCreationDate(assetModelCreationDate);
        return this;
    }

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     * 
     * @param assetModelLastUpdateDate
     *        The date the asset model was last updated, in Unix epoch time.
     */

    public void setAssetModelLastUpdateDate(java.util.Date assetModelLastUpdateDate) {
        this.assetModelLastUpdateDate = assetModelLastUpdateDate;
    }

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the asset model was last updated, in Unix epoch time.
     */

    public java.util.Date getAssetModelLastUpdateDate() {
        return this.assetModelLastUpdateDate;
    }

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     * 
     * @param assetModelLastUpdateDate
     *        The date the asset model was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelLastUpdateDate(java.util.Date assetModelLastUpdateDate) {
        setAssetModelLastUpdateDate(assetModelLastUpdateDate);
        return this;
    }

    /**
     * <p>
     * The current status of the asset model, which contains a state and any error message.
     * </p>
     * 
     * @param assetModelStatus
     *        The current status of the asset model, which contains a state and any error message.
     */

    public void setAssetModelStatus(AssetModelStatus assetModelStatus) {
        this.assetModelStatus = assetModelStatus;
    }

    /**
     * <p>
     * The current status of the asset model, which contains a state and any error message.
     * </p>
     * 
     * @return The current status of the asset model, which contains a state and any error message.
     */

    public AssetModelStatus getAssetModelStatus() {
        return this.assetModelStatus;
    }

    /**
     * <p>
     * The current status of the asset model, which contains a state and any error message.
     * </p>
     * 
     * @param assetModelStatus
     *        The current status of the asset model, which contains a state and any error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelResult withAssetModelStatus(AssetModelStatus assetModelStatus) {
        setAssetModelStatus(assetModelStatus);
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
        if (getAssetModelId() != null)
            sb.append("AssetModelId: ").append(getAssetModelId()).append(",");
        if (getAssetModelArn() != null)
            sb.append("AssetModelArn: ").append(getAssetModelArn()).append(",");
        if (getAssetModelName() != null)
            sb.append("AssetModelName: ").append(getAssetModelName()).append(",");
        if (getAssetModelDescription() != null)
            sb.append("AssetModelDescription: ").append(getAssetModelDescription()).append(",");
        if (getAssetModelProperties() != null)
            sb.append("AssetModelProperties: ").append(getAssetModelProperties()).append(",");
        if (getAssetModelHierarchies() != null)
            sb.append("AssetModelHierarchies: ").append(getAssetModelHierarchies()).append(",");
        if (getAssetModelCompositeModels() != null)
            sb.append("AssetModelCompositeModels: ").append(getAssetModelCompositeModels()).append(",");
        if (getAssetModelCreationDate() != null)
            sb.append("AssetModelCreationDate: ").append(getAssetModelCreationDate()).append(",");
        if (getAssetModelLastUpdateDate() != null)
            sb.append("AssetModelLastUpdateDate: ").append(getAssetModelLastUpdateDate()).append(",");
        if (getAssetModelStatus() != null)
            sb.append("AssetModelStatus: ").append(getAssetModelStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssetModelResult == false)
            return false;
        DescribeAssetModelResult other = (DescribeAssetModelResult) obj;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getAssetModelArn() == null ^ this.getAssetModelArn() == null)
            return false;
        if (other.getAssetModelArn() != null && other.getAssetModelArn().equals(this.getAssetModelArn()) == false)
            return false;
        if (other.getAssetModelName() == null ^ this.getAssetModelName() == null)
            return false;
        if (other.getAssetModelName() != null && other.getAssetModelName().equals(this.getAssetModelName()) == false)
            return false;
        if (other.getAssetModelDescription() == null ^ this.getAssetModelDescription() == null)
            return false;
        if (other.getAssetModelDescription() != null && other.getAssetModelDescription().equals(this.getAssetModelDescription()) == false)
            return false;
        if (other.getAssetModelProperties() == null ^ this.getAssetModelProperties() == null)
            return false;
        if (other.getAssetModelProperties() != null && other.getAssetModelProperties().equals(this.getAssetModelProperties()) == false)
            return false;
        if (other.getAssetModelHierarchies() == null ^ this.getAssetModelHierarchies() == null)
            return false;
        if (other.getAssetModelHierarchies() != null && other.getAssetModelHierarchies().equals(this.getAssetModelHierarchies()) == false)
            return false;
        if (other.getAssetModelCompositeModels() == null ^ this.getAssetModelCompositeModels() == null)
            return false;
        if (other.getAssetModelCompositeModels() != null && other.getAssetModelCompositeModels().equals(this.getAssetModelCompositeModels()) == false)
            return false;
        if (other.getAssetModelCreationDate() == null ^ this.getAssetModelCreationDate() == null)
            return false;
        if (other.getAssetModelCreationDate() != null && other.getAssetModelCreationDate().equals(this.getAssetModelCreationDate()) == false)
            return false;
        if (other.getAssetModelLastUpdateDate() == null ^ this.getAssetModelLastUpdateDate() == null)
            return false;
        if (other.getAssetModelLastUpdateDate() != null && other.getAssetModelLastUpdateDate().equals(this.getAssetModelLastUpdateDate()) == false)
            return false;
        if (other.getAssetModelStatus() == null ^ this.getAssetModelStatus() == null)
            return false;
        if (other.getAssetModelStatus() != null && other.getAssetModelStatus().equals(this.getAssetModelStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelArn() == null) ? 0 : getAssetModelArn().hashCode());
        hashCode = prime * hashCode + ((getAssetModelName() == null) ? 0 : getAssetModelName().hashCode());
        hashCode = prime * hashCode + ((getAssetModelDescription() == null) ? 0 : getAssetModelDescription().hashCode());
        hashCode = prime * hashCode + ((getAssetModelProperties() == null) ? 0 : getAssetModelProperties().hashCode());
        hashCode = prime * hashCode + ((getAssetModelHierarchies() == null) ? 0 : getAssetModelHierarchies().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModels() == null) ? 0 : getAssetModelCompositeModels().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCreationDate() == null) ? 0 : getAssetModelCreationDate().hashCode());
        hashCode = prime * hashCode + ((getAssetModelLastUpdateDate() == null) ? 0 : getAssetModelLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getAssetModelStatus() == null) ? 0 : getAssetModelStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssetModelResult clone() {
        try {
            return (DescribeAssetModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
