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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateShareResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID that HealthOmics generates for the share.
     * </p>
     */
    private String shareId;
    /**
     * <p>
     * The status of the share.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the share.
     * </p>
     */
    private String shareName;

    /**
     * <p>
     * The ID that HealthOmics generates for the share.
     * </p>
     * 
     * @param shareId
     *        The ID that HealthOmics generates for the share.
     */

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    /**
     * <p>
     * The ID that HealthOmics generates for the share.
     * </p>
     * 
     * @return The ID that HealthOmics generates for the share.
     */

    public String getShareId() {
        return this.shareId;
    }

    /**
     * <p>
     * The ID that HealthOmics generates for the share.
     * </p>
     * 
     * @param shareId
     *        The ID that HealthOmics generates for the share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateShareResult withShareId(String shareId) {
        setShareId(shareId);
        return this;
    }

    /**
     * <p>
     * The status of the share.
     * </p>
     * 
     * @param status
     *        The status of the share.
     * @see ShareStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the share.
     * </p>
     * 
     * @return The status of the share.
     * @see ShareStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the share.
     * </p>
     * 
     * @param status
     *        The status of the share.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public CreateShareResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the share.
     * </p>
     * 
     * @param status
     *        The status of the share.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public CreateShareResult withStatus(ShareStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of the share.
     * </p>
     * 
     * @param shareName
     *        The name of the share.
     */

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    /**
     * <p>
     * The name of the share.
     * </p>
     * 
     * @return The name of the share.
     */

    public String getShareName() {
        return this.shareName;
    }

    /**
     * <p>
     * The name of the share.
     * </p>
     * 
     * @param shareName
     *        The name of the share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateShareResult withShareName(String shareName) {
        setShareName(shareName);
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
        if (getShareId() != null)
            sb.append("ShareId: ").append(getShareId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getShareName() != null)
            sb.append("ShareName: ").append(getShareName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateShareResult == false)
            return false;
        CreateShareResult other = (CreateShareResult) obj;
        if (other.getShareId() == null ^ this.getShareId() == null)
            return false;
        if (other.getShareId() != null && other.getShareId().equals(this.getShareId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getShareName() == null ^ this.getShareName() == null)
            return false;
        if (other.getShareName() != null && other.getShareName().equals(this.getShareName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareId() == null) ? 0 : getShareId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getShareName() == null) ? 0 : getShareName().hashCode());
        return hashCode;
    }

    @Override
    public CreateShareResult clone() {
        try {
            return (CreateShareResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
