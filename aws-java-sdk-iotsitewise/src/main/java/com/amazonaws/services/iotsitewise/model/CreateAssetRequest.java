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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAsset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A friendly name for the asset.
     * </p>
     */
    private String assetName;
    /**
     * <p>
     * The ID of the asset model from which to create the asset. This can be either the actual ID in UUID format, or
     * else <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A list of key-value pairs that contain metadata for the asset. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A description for the asset.
     * </p>
     */
    private String assetDescription;
    /**
     * <p>
     * The ID to assign to the asset, if desired. IoT SiteWise automatically generates a unique ID for you, so this
     * parameter is never required. However, if you prefer to supply your own ID instead, you can specify it here in
     * UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * An external ID to assign to the asset. The external ID must be unique within your Amazon Web Services account.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String assetExternalId;

    /**
     * <p>
     * A friendly name for the asset.
     * </p>
     * 
     * @param assetName
     *        A friendly name for the asset.
     */

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * <p>
     * A friendly name for the asset.
     * </p>
     * 
     * @return A friendly name for the asset.
     */

    public String getAssetName() {
        return this.assetName;
    }

    /**
     * <p>
     * A friendly name for the asset.
     * </p>
     * 
     * @param assetName
     *        A friendly name for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRequest withAssetName(String assetName) {
        setAssetName(assetName);
        return this;
    }

    /**
     * <p>
     * The ID of the asset model from which to create the asset. This can be either the actual ID in UUID format, or
     * else <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model from which to create the asset. This can be either the actual ID in UUID format,
     *        or else <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references">
     *        Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model from which to create the asset. This can be either the actual ID in UUID format, or
     * else <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The ID of the asset model from which to create the asset. This can be either the actual ID in UUID
     *         format, or else <code>externalId:</code> followed by the external ID, if it has one. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *         >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model from which to create the asset. This can be either the actual ID in UUID format, or
     * else <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model from which to create the asset. This can be either the actual ID in UUID format,
     *        or else <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references">
     *        Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRequest withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @return A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *         reuse this client token if a new idempotent request is required.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the asset. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs that contain metadata for the asset. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *         SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the asset. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the asset. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *        SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the asset. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the asset. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *        SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAssetRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A description for the asset.
     * </p>
     * 
     * @param assetDescription
     *        A description for the asset.
     */

    public void setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
    }

    /**
     * <p>
     * A description for the asset.
     * </p>
     * 
     * @return A description for the asset.
     */

    public String getAssetDescription() {
        return this.assetDescription;
    }

    /**
     * <p>
     * A description for the asset.
     * </p>
     * 
     * @param assetDescription
     *        A description for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRequest withAssetDescription(String assetDescription) {
        setAssetDescription(assetDescription);
        return this;
    }

    /**
     * <p>
     * The ID to assign to the asset, if desired. IoT SiteWise automatically generates a unique ID for you, so this
     * parameter is never required. However, if you prefer to supply your own ID instead, you can specify it here in
     * UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @param assetId
     *        The ID to assign to the asset, if desired. IoT SiteWise automatically generates a unique ID for you, so
     *        this parameter is never required. However, if you prefer to supply your own ID instead, you can specify it
     *        here in UUID format. If you specify your own ID, it must be globally unique.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID to assign to the asset, if desired. IoT SiteWise automatically generates a unique ID for you, so this
     * parameter is never required. However, if you prefer to supply your own ID instead, you can specify it here in
     * UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @return The ID to assign to the asset, if desired. IoT SiteWise automatically generates a unique ID for you, so
     *         this parameter is never required. However, if you prefer to supply your own ID instead, you can specify
     *         it here in UUID format. If you specify your own ID, it must be globally unique.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID to assign to the asset, if desired. IoT SiteWise automatically generates a unique ID for you, so this
     * parameter is never required. However, if you prefer to supply your own ID instead, you can specify it here in
     * UUID format. If you specify your own ID, it must be globally unique.
     * </p>
     * 
     * @param assetId
     *        The ID to assign to the asset, if desired. IoT SiteWise automatically generates a unique ID for you, so
     *        this parameter is never required. However, if you prefer to supply your own ID instead, you can specify it
     *        here in UUID format. If you specify your own ID, it must be globally unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRequest withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * An external ID to assign to the asset. The external ID must be unique within your Amazon Web Services account.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetExternalId
     *        An external ID to assign to the asset. The external ID must be unique within your Amazon Web Services
     *        account. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setAssetExternalId(String assetExternalId) {
        this.assetExternalId = assetExternalId;
    }

    /**
     * <p>
     * An external ID to assign to the asset. The external ID must be unique within your Amazon Web Services account.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return An external ID to assign to the asset. The external ID must be unique within your Amazon Web Services
     *         account. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *         external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getAssetExternalId() {
        return this.assetExternalId;
    }

    /**
     * <p>
     * An external ID to assign to the asset. The external ID must be unique within your Amazon Web Services account.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetExternalId
     *        An external ID to assign to the asset. The external ID must be unique within your Amazon Web Services
     *        account. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetRequest withAssetExternalId(String assetExternalId) {
        setAssetExternalId(assetExternalId);
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
        if (getAssetModelId() != null)
            sb.append("AssetModelId: ").append(getAssetModelId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAssetDescription() != null)
            sb.append("AssetDescription: ").append(getAssetDescription()).append(",");
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getAssetExternalId() != null)
            sb.append("AssetExternalId: ").append(getAssetExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssetRequest == false)
            return false;
        CreateAssetRequest other = (CreateAssetRequest) obj;
        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAssetDescription() == null ^ this.getAssetDescription() == null)
            return false;
        if (other.getAssetDescription() != null && other.getAssetDescription().equals(this.getAssetDescription()) == false)
            return false;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetExternalId() == null ^ this.getAssetExternalId() == null)
            return false;
        if (other.getAssetExternalId() != null && other.getAssetExternalId().equals(this.getAssetExternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAssetDescription() == null) ? 0 : getAssetDescription().hashCode());
        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAssetExternalId() == null) ? 0 : getAssetExternalId().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssetRequest clone() {
        return (CreateAssetRequest) super.clone();
    }

}
