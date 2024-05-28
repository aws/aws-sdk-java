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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RejectPredictions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectPredictionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The revision that is to be made to the asset.
     * </p>
     */
    private String assetRevision;
    /**
     * <p>
     * The ID of the Amazon DataZone domain.
     * </p>
     */
    private String domainId;

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

    public RejectPredictionsResult withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The revision that is to be made to the asset.
     * </p>
     * 
     * @param assetRevision
     *        The revision that is to be made to the asset.
     */

    public void setAssetRevision(String assetRevision) {
        this.assetRevision = assetRevision;
    }

    /**
     * <p>
     * The revision that is to be made to the asset.
     * </p>
     * 
     * @return The revision that is to be made to the asset.
     */

    public String getAssetRevision() {
        return this.assetRevision;
    }

    /**
     * <p>
     * The revision that is to be made to the asset.
     * </p>
     * 
     * @param assetRevision
     *        The revision that is to be made to the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectPredictionsResult withAssetRevision(String assetRevision) {
        setAssetRevision(assetRevision);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectPredictionsResult withDomainId(String domainId) {
        setDomainId(domainId);
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
        if (getAssetRevision() != null)
            sb.append("AssetRevision: ").append(getAssetRevision()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectPredictionsResult == false)
            return false;
        RejectPredictionsResult other = (RejectPredictionsResult) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetRevision() == null ^ this.getAssetRevision() == null)
            return false;
        if (other.getAssetRevision() != null && other.getAssetRevision().equals(this.getAssetRevision()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAssetRevision() == null) ? 0 : getAssetRevision().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        return hashCode;
    }

    @Override
    public RejectPredictionsResult clone() {
        try {
            return (RejectPredictionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
