/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains a summary of an asset model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetModelSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetModelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the asset model (used with IoT SiteWise API operations).
     * </p>
     */
    private String id;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the asset
     * model, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the asset model.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The asset model description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;
    /**
     * <p>
     * The current status of the asset model.
     * </p>
     */
    private AssetModelStatus status;
    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     */
    private String assetModelType;
    /**
     * <p>
     * The external ID of the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The ID of the asset model (used with IoT SiteWise API operations).
     * </p>
     * 
     * @param id
     *        The ID of the asset model (used with IoT SiteWise API operations).
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the asset model (used with IoT SiteWise API operations).
     * </p>
     * 
     * @return The ID of the asset model (used with IoT SiteWise API operations).
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the asset model (used with IoT SiteWise API operations).
     * </p>
     * 
     * @param id
     *        The ID of the asset model (used with IoT SiteWise API operations).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelSummary withId(String id) {
        setId(id);
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
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        asset model, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     */

    public void setArn(String arn) {
        this.arn = arn;
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

    public String getArn() {
        return this.arn;
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
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        asset model, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the asset model.
     * </p>
     * 
     * @param name
     *        The name of the asset model.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset model.
     * </p>
     * 
     * @return The name of the asset model.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the asset model.
     * </p>
     * 
     * @param name
     *        The name of the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The asset model description.
     * </p>
     * 
     * @param description
     *        The asset model description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The asset model description.
     * </p>
     * 
     * @return The asset model description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The asset model description.
     * </p>
     * 
     * @param description
     *        The asset model description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     * 
     * @param creationDate
     *        The date the asset model was created, in Unix epoch time.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     * 
     * @return The date the asset model was created, in Unix epoch time.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     * 
     * @param creationDate
     *        The date the asset model was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelSummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the asset model was last updated, in Unix epoch time.
     */

    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the asset model was last updated, in Unix epoch time.
     */

    public java.util.Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the asset model was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelSummary withLastUpdateDate(java.util.Date lastUpdateDate) {
        setLastUpdateDate(lastUpdateDate);
        return this;
    }

    /**
     * <p>
     * The current status of the asset model.
     * </p>
     * 
     * @param status
     *        The current status of the asset model.
     */

    public void setStatus(AssetModelStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the asset model.
     * </p>
     * 
     * @return The current status of the asset model.
     */

    public AssetModelStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the asset model.
     * </p>
     * 
     * @param status
     *        The current status of the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelSummary withStatus(AssetModelStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assetModelType
     *        The type of asset model.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *        component in another asset model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *        models. You can't create assets directly from this type of asset model.
     *        </p>
     *        </li>
     * @see AssetModelType
     */

    public void setAssetModelType(String assetModelType) {
        this.assetModelType = assetModelType;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of asset model.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *         component in another asset model.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *         models. You can't create assets directly from this type of asset model.
     *         </p>
     *         </li>
     * @see AssetModelType
     */

    public String getAssetModelType() {
        return this.assetModelType;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assetModelType
     *        The type of asset model.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *        component in another asset model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *        models. You can't create assets directly from this type of asset model.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetModelType
     */

    public AssetModelSummary withAssetModelType(String assetModelType) {
        setAssetModelType(assetModelType);
        return this;
    }

    /**
     * <p>
     * The type of asset model.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a component
     * in another asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset models.
     * You can't create assets directly from this type of asset model.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assetModelType
     *        The type of asset model.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ASSET_MODEL</b> – (default) An asset model that you can use to create assets. Can't be included as a
     *        component in another asset model.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPONENT_MODEL</b> – A reusable component that you can include in the composite models of other asset
     *        models. You can't create assets directly from this type of asset model.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetModelType
     */

    public AssetModelSummary withAssetModelType(AssetModelType assetModelType) {
        this.assetModelType = assetModelType.toString();
        return this;
    }

    /**
     * <p>
     * The external ID of the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        The external ID of the asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID of the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The external ID of the asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *         external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID of the asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        The external ID of the asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetModelSummary withExternalId(String externalId) {
        setExternalId(externalId);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastUpdateDate() != null)
            sb.append("LastUpdateDate: ").append(getLastUpdateDate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAssetModelType() != null)
            sb.append("AssetModelType: ").append(getAssetModelType()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetModelSummary == false)
            return false;
        AssetModelSummary other = (AssetModelSummary) obj;
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        if (other.getAssetModelType() == null ^ this.getAssetModelType() == null)
            return false;
        if (other.getAssetModelType() != null && other.getAssetModelType().equals(this.getAssetModelType()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAssetModelType() == null) ? 0 : getAssetModelType().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public AssetModelSummary clone() {
        try {
            return (AssetModelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetModelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
