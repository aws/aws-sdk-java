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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAsset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset to update. This can be either the actual ID in UUID format, or else <code>externalId:</code>
     * followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * A friendly name for the asset.
     * </p>
     */
    private String assetName;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A description for the asset.
     * </p>
     */
    private String assetDescription;
    /**
     * <p>
     * An external ID to assign to the asset. The asset must not already have an external ID. The external ID must be
     * unique within your Amazon Web Services account. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String assetExternalId;

    /**
     * <p>
     * The ID of the asset to update. This can be either the actual ID in UUID format, or else <code>externalId:</code>
     * followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset to update. This can be either the actual ID in UUID format, or else
     *        <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *        >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset to update. This can be either the actual ID in UUID format, or else <code>externalId:</code>
     * followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The ID of the asset to update. This can be either the actual ID in UUID format, or else
     *         <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *         >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset to update. This can be either the actual ID in UUID format, or else <code>externalId:</code>
     * followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset to update. This can be either the actual ID in UUID format, or else
     *        <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *        >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetRequest withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

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

    public UpdateAssetRequest withAssetName(String assetName) {
        setAssetName(assetName);
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

    public UpdateAssetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public UpdateAssetRequest withAssetDescription(String assetDescription) {
        setAssetDescription(assetDescription);
        return this;
    }

    /**
     * <p>
     * An external ID to assign to the asset. The asset must not already have an external ID. The external ID must be
     * unique within your Amazon Web Services account. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetExternalId
     *        An external ID to assign to the asset. The asset must not already have an external ID. The external ID
     *        must be unique within your Amazon Web Services account. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setAssetExternalId(String assetExternalId) {
        this.assetExternalId = assetExternalId;
    }

    /**
     * <p>
     * An external ID to assign to the asset. The asset must not already have an external ID. The external ID must be
     * unique within your Amazon Web Services account. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return An external ID to assign to the asset. The asset must not already have an external ID. The external ID
     *         must be unique within your Amazon Web Services account. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *         external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getAssetExternalId() {
        return this.assetExternalId;
    }

    /**
     * <p>
     * An external ID to assign to the asset. The asset must not already have an external ID. The external ID must be
     * unique within your Amazon Web Services account. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetExternalId
     *        An external ID to assign to the asset. The asset must not already have an external ID. The external ID
     *        must be unique within your Amazon Web Services account. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetRequest withAssetExternalId(String assetExternalId) {
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getAssetName() != null)
            sb.append("AssetName: ").append(getAssetName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getAssetDescription() != null)
            sb.append("AssetDescription: ").append(getAssetDescription()).append(",");
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

        if (obj instanceof UpdateAssetRequest == false)
            return false;
        UpdateAssetRequest other = (UpdateAssetRequest) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getAssetDescription() == null ^ this.getAssetDescription() == null)
            return false;
        if (other.getAssetDescription() != null && other.getAssetDescription().equals(this.getAssetDescription()) == false)
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

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getAssetDescription() == null) ? 0 : getAssetDescription().hashCode());
        hashCode = prime * hashCode + ((getAssetExternalId() == null) ? 0 : getAssetExternalId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssetRequest clone() {
        return (UpdateAssetRequest) super.clone();
    }

}
