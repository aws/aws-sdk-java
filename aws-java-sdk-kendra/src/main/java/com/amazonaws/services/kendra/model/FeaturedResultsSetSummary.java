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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for a set of featured results. Featured results are placed above all other results for certain
 * queries. If there's an exact match of a query, then one or more specific documents are featured in the search
 * results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/FeaturedResultsSetSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeaturedResultsSetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the set of featured results.
     * </p>
     */
    private String featuredResultsSetId;
    /**
     * <p>
     * The name for the set of featured results.
     * </p>
     */
    private String featuredResultsSetName;
    /**
     * <p>
     * The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results are
     * ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>. You can
     * set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     * >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per featured
     * results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Unix timestamp when the set of featured results was last updated.
     * </p>
     */
    private Long lastUpdatedTimestamp;
    /**
     * <p>
     * The Unix timestamp when the set of featured results was created.
     * </p>
     */
    private Long creationTimestamp;

    /**
     * <p>
     * The identifier of the set of featured results.
     * </p>
     * 
     * @param featuredResultsSetId
     *        The identifier of the set of featured results.
     */

    public void setFeaturedResultsSetId(String featuredResultsSetId) {
        this.featuredResultsSetId = featuredResultsSetId;
    }

    /**
     * <p>
     * The identifier of the set of featured results.
     * </p>
     * 
     * @return The identifier of the set of featured results.
     */

    public String getFeaturedResultsSetId() {
        return this.featuredResultsSetId;
    }

    /**
     * <p>
     * The identifier of the set of featured results.
     * </p>
     * 
     * @param featuredResultsSetId
     *        The identifier of the set of featured results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSetSummary withFeaturedResultsSetId(String featuredResultsSetId) {
        setFeaturedResultsSetId(featuredResultsSetId);
        return this;
    }

    /**
     * <p>
     * The name for the set of featured results.
     * </p>
     * 
     * @param featuredResultsSetName
     *        The name for the set of featured results.
     */

    public void setFeaturedResultsSetName(String featuredResultsSetName) {
        this.featuredResultsSetName = featuredResultsSetName;
    }

    /**
     * <p>
     * The name for the set of featured results.
     * </p>
     * 
     * @return The name for the set of featured results.
     */

    public String getFeaturedResultsSetName() {
        return this.featuredResultsSetName;
    }

    /**
     * <p>
     * The name for the set of featured results.
     * </p>
     * 
     * @param featuredResultsSetName
     *        The name for the set of featured results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSetSummary withFeaturedResultsSetName(String featuredResultsSetName) {
        setFeaturedResultsSetName(featuredResultsSetName);
        return this;
    }

    /**
     * <p>
     * The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results are
     * ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>. You can
     * set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     * >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per featured
     * results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results
     *        are ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>.
     *        You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     *        >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per
     *        featured results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @see FeaturedResultsSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results are
     * ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>. You can
     * set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     * >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per featured
     * results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @return The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured
     *         results are ready for use. You can still configure your settings before setting the status to
     *         <code>ACTIVE</code>. You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html">
     *         UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per
     *         featured results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @see FeaturedResultsSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results are
     * ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>. You can
     * set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     * >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per featured
     * results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results
     *        are ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>.
     *        You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     *        >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per
     *        featured results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeaturedResultsSetStatus
     */

    public FeaturedResultsSetSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results are
     * ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>. You can
     * set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     * >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per featured
     * results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results
     *        are ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>.
     *        You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     *        >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per
     *        featured results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeaturedResultsSetStatus
     */

    public FeaturedResultsSetSummary withStatus(FeaturedResultsSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the set of featured results was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The Unix timestamp when the set of featured results was last updated.
     */

    public void setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp when the set of featured results was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the set of featured results was last updated.
     */

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp when the set of featured results was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The Unix timestamp when the set of featured results was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSetSummary withLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the set of featured results was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp when the set of featured results was created.
     */

    public void setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp when the set of featured results was created.
     * </p>
     * 
     * @return The Unix timestamp when the set of featured results was created.
     */

    public Long getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp when the set of featured results was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp when the set of featured results was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSetSummary withCreationTimestamp(Long creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
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
        if (getFeaturedResultsSetId() != null)
            sb.append("FeaturedResultsSetId: ").append(getFeaturedResultsSetId()).append(",");
        if (getFeaturedResultsSetName() != null)
            sb.append("FeaturedResultsSetName: ").append(getFeaturedResultsSetName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeaturedResultsSetSummary == false)
            return false;
        FeaturedResultsSetSummary other = (FeaturedResultsSetSummary) obj;
        if (other.getFeaturedResultsSetId() == null ^ this.getFeaturedResultsSetId() == null)
            return false;
        if (other.getFeaturedResultsSetId() != null && other.getFeaturedResultsSetId().equals(this.getFeaturedResultsSetId()) == false)
            return false;
        if (other.getFeaturedResultsSetName() == null ^ this.getFeaturedResultsSetName() == null)
            return false;
        if (other.getFeaturedResultsSetName() != null && other.getFeaturedResultsSetName().equals(this.getFeaturedResultsSetName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeaturedResultsSetId() == null) ? 0 : getFeaturedResultsSetId().hashCode());
        hashCode = prime * hashCode + ((getFeaturedResultsSetName() == null) ? 0 : getFeaturedResultsSetName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public FeaturedResultsSetSummary clone() {
        try {
            return (FeaturedResultsSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.FeaturedResultsSetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
