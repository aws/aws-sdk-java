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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetModelCompositeModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetModelCompositeModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset model. This can be either the actual ID in UUID format, or else <code>externalId:</code>
     * followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * The ID of a composite model on this asset model. This can be either the actual ID in UUID format, or else
     * <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String assetModelCompositeModelId;

    /**
     * <p>
     * The ID of the asset model. This can be either the actual ID in UUID format, or else <code>externalId:</code>
     * followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model. This can be either the actual ID in UUID format, or else
     *        <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *        >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model. This can be either the actual ID in UUID format, or else <code>externalId:</code>
     * followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The ID of the asset model. This can be either the actual ID in UUID format, or else
     *         <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *         >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model. This can be either the actual ID in UUID format, or else <code>externalId:</code>
     * followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model. This can be either the actual ID in UUID format, or else
     *        <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *        >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelRequest withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * The ID of a composite model on this asset model. This can be either the actual ID in UUID format, or else
     * <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetModelCompositeModelId
     *        The ID of a composite model on this asset model. This can be either the actual ID in UUID format, or else
     *        <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *        >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setAssetModelCompositeModelId(String assetModelCompositeModelId) {
        this.assetModelCompositeModelId = assetModelCompositeModelId;
    }

    /**
     * <p>
     * The ID of a composite model on this asset model. This can be either the actual ID in UUID format, or else
     * <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The ID of a composite model on this asset model. This can be either the actual ID in UUID format, or else
     *         <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *         >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getAssetModelCompositeModelId() {
        return this.assetModelCompositeModelId;
    }

    /**
     * <p>
     * The ID of a composite model on this asset model. This can be either the actual ID in UUID format, or else
     * <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     * >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param assetModelCompositeModelId
     *        The ID of a composite model on this asset model. This can be either the actual ID in UUID format, or else
     *        <code>externalId:</code> followed by the external ID, if it has one. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references"
     *        >Referencing objects with external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetModelCompositeModelRequest withAssetModelCompositeModelId(String assetModelCompositeModelId) {
        setAssetModelCompositeModelId(assetModelCompositeModelId);
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
        if (getAssetModelCompositeModelId() != null)
            sb.append("AssetModelCompositeModelId: ").append(getAssetModelCompositeModelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssetModelCompositeModelRequest == false)
            return false;
        DescribeAssetModelCompositeModelRequest other = (DescribeAssetModelCompositeModelRequest) obj;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getAssetModelCompositeModelId() == null ^ this.getAssetModelCompositeModelId() == null)
            return false;
        if (other.getAssetModelCompositeModelId() != null && other.getAssetModelCompositeModelId().equals(this.getAssetModelCompositeModelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getAssetModelCompositeModelId() == null) ? 0 : getAssetModelCompositeModelId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssetModelCompositeModelRequest clone() {
        return (DescribeAssetModelCompositeModelRequest) super.clone();
    }

}
