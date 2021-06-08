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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchDisassociateProjectAssets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateProjectAssetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the project from which to disassociate the assets.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * The IDs of the assets to be disassociated from the project.
     * </p>
     */
    private java.util.List<String> assetIds;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the project from which to disassociate the assets.
     * </p>
     * 
     * @param projectId
     *        The ID of the project from which to disassociate the assets.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the project from which to disassociate the assets.
     * </p>
     * 
     * @return The ID of the project from which to disassociate the assets.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The ID of the project from which to disassociate the assets.
     * </p>
     * 
     * @param projectId
     *        The ID of the project from which to disassociate the assets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateProjectAssetsRequest withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * The IDs of the assets to be disassociated from the project.
     * </p>
     * 
     * @return The IDs of the assets to be disassociated from the project.
     */

    public java.util.List<String> getAssetIds() {
        return assetIds;
    }

    /**
     * <p>
     * The IDs of the assets to be disassociated from the project.
     * </p>
     * 
     * @param assetIds
     *        The IDs of the assets to be disassociated from the project.
     */

    public void setAssetIds(java.util.Collection<String> assetIds) {
        if (assetIds == null) {
            this.assetIds = null;
            return;
        }

        this.assetIds = new java.util.ArrayList<String>(assetIds);
    }

    /**
     * <p>
     * The IDs of the assets to be disassociated from the project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetIds(java.util.Collection)} or {@link #withAssetIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param assetIds
     *        The IDs of the assets to be disassociated from the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateProjectAssetsRequest withAssetIds(String... assetIds) {
        if (this.assetIds == null) {
            setAssetIds(new java.util.ArrayList<String>(assetIds.length));
        }
        for (String ele : assetIds) {
            this.assetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the assets to be disassociated from the project.
     * </p>
     * 
     * @param assetIds
     *        The IDs of the assets to be disassociated from the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateProjectAssetsRequest withAssetIds(java.util.Collection<String> assetIds) {
        setAssetIds(assetIds);
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

    public BatchDisassociateProjectAssetsRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getAssetIds() != null)
            sb.append("AssetIds: ").append(getAssetIds()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisassociateProjectAssetsRequest == false)
            return false;
        BatchDisassociateProjectAssetsRequest other = (BatchDisassociateProjectAssetsRequest) obj;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getAssetIds() == null ^ this.getAssetIds() == null)
            return false;
        if (other.getAssetIds() != null && other.getAssetIds().equals(this.getAssetIds()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getAssetIds() == null) ? 0 : getAssetIds().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateProjectAssetsRequest clone() {
        return (BatchDisassociateProjectAssetsRequest) super.clone();
    }

}
