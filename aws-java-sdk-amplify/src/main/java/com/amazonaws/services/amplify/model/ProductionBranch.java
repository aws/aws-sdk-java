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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the information about a production branch for an Amplify app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ProductionBranch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductionBranch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The last deploy time of the production branch.
     * </p>
     */
    private java.util.Date lastDeployTime;
    /**
     * <p>
     * The status of the production branch.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The thumbnail URL for the production branch.
     * </p>
     */
    private String thumbnailUrl;
    /**
     * <p>
     * The branch name for the production branch.
     * </p>
     */
    private String branchName;

    /**
     * <p>
     * The last deploy time of the production branch.
     * </p>
     * 
     * @param lastDeployTime
     *        The last deploy time of the production branch.
     */

    public void setLastDeployTime(java.util.Date lastDeployTime) {
        this.lastDeployTime = lastDeployTime;
    }

    /**
     * <p>
     * The last deploy time of the production branch.
     * </p>
     * 
     * @return The last deploy time of the production branch.
     */

    public java.util.Date getLastDeployTime() {
        return this.lastDeployTime;
    }

    /**
     * <p>
     * The last deploy time of the production branch.
     * </p>
     * 
     * @param lastDeployTime
     *        The last deploy time of the production branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionBranch withLastDeployTime(java.util.Date lastDeployTime) {
        setLastDeployTime(lastDeployTime);
        return this;
    }

    /**
     * <p>
     * The status of the production branch.
     * </p>
     * 
     * @param status
     *        The status of the production branch.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the production branch.
     * </p>
     * 
     * @return The status of the production branch.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the production branch.
     * </p>
     * 
     * @param status
     *        The status of the production branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionBranch withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The thumbnail URL for the production branch.
     * </p>
     * 
     * @param thumbnailUrl
     *        The thumbnail URL for the production branch.
     */

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * <p>
     * The thumbnail URL for the production branch.
     * </p>
     * 
     * @return The thumbnail URL for the production branch.
     */

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /**
     * <p>
     * The thumbnail URL for the production branch.
     * </p>
     * 
     * @param thumbnailUrl
     *        The thumbnail URL for the production branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionBranch withThumbnailUrl(String thumbnailUrl) {
        setThumbnailUrl(thumbnailUrl);
        return this;
    }

    /**
     * <p>
     * The branch name for the production branch.
     * </p>
     * 
     * @param branchName
     *        The branch name for the production branch.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The branch name for the production branch.
     * </p>
     * 
     * @return The branch name for the production branch.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The branch name for the production branch.
     * </p>
     * 
     * @param branchName
     *        The branch name for the production branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionBranch withBranchName(String branchName) {
        setBranchName(branchName);
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
        if (getLastDeployTime() != null)
            sb.append("LastDeployTime: ").append(getLastDeployTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getThumbnailUrl() != null)
            sb.append("ThumbnailUrl: ").append(getThumbnailUrl()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductionBranch == false)
            return false;
        ProductionBranch other = (ProductionBranch) obj;
        if (other.getLastDeployTime() == null ^ this.getLastDeployTime() == null)
            return false;
        if (other.getLastDeployTime() != null && other.getLastDeployTime().equals(this.getLastDeployTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getThumbnailUrl() == null ^ this.getThumbnailUrl() == null)
            return false;
        if (other.getThumbnailUrl() != null && other.getThumbnailUrl().equals(this.getThumbnailUrl()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastDeployTime() == null) ? 0 : getLastDeployTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getThumbnailUrl() == null) ? 0 : getThumbnailUrl().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        return hashCode;
    }

    @Override
    public ProductionBranch clone() {
        try {
            return (ProductionBranch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.ProductionBranchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
