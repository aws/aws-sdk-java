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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A response that contains the results of a finding aggregation by image layer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ImageLayerAggregationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageLayerAggregationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the container image hosting the layer image.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The layer hash.
     * </p>
     */
    private String layerHash;
    /**
     * <p>
     * The repository the layer resides in.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * The resource ID of the container image layer.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * An object that represents the count of matched findings per severity.
     * </p>
     */
    private SeverityCounts severityCounts;

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the container image hosting the layer image.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that owns the container image hosting the layer image.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the container image hosting the layer image.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that owns the container image hosting the layer image.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the container image hosting the layer image.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that owns the container image hosting the layer image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageLayerAggregationResponse withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The layer hash.
     * </p>
     * 
     * @param layerHash
     *        The layer hash.
     */

    public void setLayerHash(String layerHash) {
        this.layerHash = layerHash;
    }

    /**
     * <p>
     * The layer hash.
     * </p>
     * 
     * @return The layer hash.
     */

    public String getLayerHash() {
        return this.layerHash;
    }

    /**
     * <p>
     * The layer hash.
     * </p>
     * 
     * @param layerHash
     *        The layer hash.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageLayerAggregationResponse withLayerHash(String layerHash) {
        setLayerHash(layerHash);
        return this;
    }

    /**
     * <p>
     * The repository the layer resides in.
     * </p>
     * 
     * @param repository
     *        The repository the layer resides in.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The repository the layer resides in.
     * </p>
     * 
     * @return The repository the layer resides in.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The repository the layer resides in.
     * </p>
     * 
     * @param repository
     *        The repository the layer resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageLayerAggregationResponse withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * The resource ID of the container image layer.
     * </p>
     * 
     * @param resourceId
     *        The resource ID of the container image layer.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID of the container image layer.
     * </p>
     * 
     * @return The resource ID of the container image layer.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID of the container image layer.
     * </p>
     * 
     * @param resourceId
     *        The resource ID of the container image layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageLayerAggregationResponse withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * An object that represents the count of matched findings per severity.
     * </p>
     * 
     * @param severityCounts
     *        An object that represents the count of matched findings per severity.
     */

    public void setSeverityCounts(SeverityCounts severityCounts) {
        this.severityCounts = severityCounts;
    }

    /**
     * <p>
     * An object that represents the count of matched findings per severity.
     * </p>
     * 
     * @return An object that represents the count of matched findings per severity.
     */

    public SeverityCounts getSeverityCounts() {
        return this.severityCounts;
    }

    /**
     * <p>
     * An object that represents the count of matched findings per severity.
     * </p>
     * 
     * @param severityCounts
     *        An object that represents the count of matched findings per severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageLayerAggregationResponse withSeverityCounts(SeverityCounts severityCounts) {
        setSeverityCounts(severityCounts);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getLayerHash() != null)
            sb.append("LayerHash: ").append(getLayerHash()).append(",");
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getSeverityCounts() != null)
            sb.append("SeverityCounts: ").append(getSeverityCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageLayerAggregationResponse == false)
            return false;
        ImageLayerAggregationResponse other = (ImageLayerAggregationResponse) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getLayerHash() == null ^ this.getLayerHash() == null)
            return false;
        if (other.getLayerHash() != null && other.getLayerHash().equals(this.getLayerHash()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getSeverityCounts() == null ^ this.getSeverityCounts() == null)
            return false;
        if (other.getSeverityCounts() != null && other.getSeverityCounts().equals(this.getSeverityCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getLayerHash() == null) ? 0 : getLayerHash().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getSeverityCounts() == null) ? 0 : getSeverityCounts().hashCode());
        return hashCode;
    }

    @Override
    public ImageLayerAggregationResponse clone() {
        try {
            return (ImageLayerAggregationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ImageLayerAggregationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
