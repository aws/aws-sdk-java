/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The results of a Trusted Advisor check returned by <a>DescribeTrustedAdvisorCheckResult</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/TrustedAdvisorCheckResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustedAdvisorCheckResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     */
    private String checkId;
    /**
     * <p>
     * The time of the last refresh of the check.
     * </p>
     */
    private String timestamp;
    /**
     * <p>
     * The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
     * </p>
     */
    private String status;

    private TrustedAdvisorResourcesSummary resourcesSummary;
    /**
     * <p>
     * Summary information that relates to the category of the check. Cost Optimizing is the only category that is
     * currently supported.
     * </p>
     */
    private TrustedAdvisorCategorySpecificSummary categorySpecificSummary;
    /**
     * <p>
     * The details about each resource listed in the check result.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrustedAdvisorResourceDetail> flaggedResources;

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * 
     * @param checkId
     *        The unique identifier for the Trusted Advisor check.
     */

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * 
     * @return The unique identifier for the Trusted Advisor check.
     */

    public String getCheckId() {
        return this.checkId;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * 
     * @param checkId
     *        The unique identifier for the Trusted Advisor check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckResult withCheckId(String checkId) {
        setCheckId(checkId);
        return this;
    }

    /**
     * <p>
     * The time of the last refresh of the check.
     * </p>
     * 
     * @param timestamp
     *        The time of the last refresh of the check.
     */

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time of the last refresh of the check.
     * </p>
     * 
     * @return The time of the last refresh of the check.
     */

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time of the last refresh of the check.
     * </p>
     * 
     * @param timestamp
     *        The time of the last refresh of the check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckResult withTimestamp(String timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
     * </p>
     * 
     * @param status
     *        The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
     * </p>
     * 
     * @return The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
     * </p>
     * 
     * @param status
     *        The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param resourcesSummary
     */

    public void setResourcesSummary(TrustedAdvisorResourcesSummary resourcesSummary) {
        this.resourcesSummary = resourcesSummary;
    }

    /**
     * @return
     */

    public TrustedAdvisorResourcesSummary getResourcesSummary() {
        return this.resourcesSummary;
    }

    /**
     * @param resourcesSummary
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckResult withResourcesSummary(TrustedAdvisorResourcesSummary resourcesSummary) {
        setResourcesSummary(resourcesSummary);
        return this;
    }

    /**
     * <p>
     * Summary information that relates to the category of the check. Cost Optimizing is the only category that is
     * currently supported.
     * </p>
     * 
     * @param categorySpecificSummary
     *        Summary information that relates to the category of the check. Cost Optimizing is the only category that
     *        is currently supported.
     */

    public void setCategorySpecificSummary(TrustedAdvisorCategorySpecificSummary categorySpecificSummary) {
        this.categorySpecificSummary = categorySpecificSummary;
    }

    /**
     * <p>
     * Summary information that relates to the category of the check. Cost Optimizing is the only category that is
     * currently supported.
     * </p>
     * 
     * @return Summary information that relates to the category of the check. Cost Optimizing is the only category that
     *         is currently supported.
     */

    public TrustedAdvisorCategorySpecificSummary getCategorySpecificSummary() {
        return this.categorySpecificSummary;
    }

    /**
     * <p>
     * Summary information that relates to the category of the check. Cost Optimizing is the only category that is
     * currently supported.
     * </p>
     * 
     * @param categorySpecificSummary
     *        Summary information that relates to the category of the check. Cost Optimizing is the only category that
     *        is currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckResult withCategorySpecificSummary(TrustedAdvisorCategorySpecificSummary categorySpecificSummary) {
        setCategorySpecificSummary(categorySpecificSummary);
        return this;
    }

    /**
     * <p>
     * The details about each resource listed in the check result.
     * </p>
     * 
     * @return The details about each resource listed in the check result.
     */

    public java.util.List<TrustedAdvisorResourceDetail> getFlaggedResources() {
        if (flaggedResources == null) {
            flaggedResources = new com.amazonaws.internal.SdkInternalList<TrustedAdvisorResourceDetail>();
        }
        return flaggedResources;
    }

    /**
     * <p>
     * The details about each resource listed in the check result.
     * </p>
     * 
     * @param flaggedResources
     *        The details about each resource listed in the check result.
     */

    public void setFlaggedResources(java.util.Collection<TrustedAdvisorResourceDetail> flaggedResources) {
        if (flaggedResources == null) {
            this.flaggedResources = null;
            return;
        }

        this.flaggedResources = new com.amazonaws.internal.SdkInternalList<TrustedAdvisorResourceDetail>(flaggedResources);
    }

    /**
     * <p>
     * The details about each resource listed in the check result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlaggedResources(java.util.Collection)} or {@link #withFlaggedResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param flaggedResources
     *        The details about each resource listed in the check result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckResult withFlaggedResources(TrustedAdvisorResourceDetail... flaggedResources) {
        if (this.flaggedResources == null) {
            setFlaggedResources(new com.amazonaws.internal.SdkInternalList<TrustedAdvisorResourceDetail>(flaggedResources.length));
        }
        for (TrustedAdvisorResourceDetail ele : flaggedResources) {
            this.flaggedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details about each resource listed in the check result.
     * </p>
     * 
     * @param flaggedResources
     *        The details about each resource listed in the check result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckResult withFlaggedResources(java.util.Collection<TrustedAdvisorResourceDetail> flaggedResources) {
        setFlaggedResources(flaggedResources);
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
        if (getCheckId() != null)
            sb.append("CheckId: ").append(getCheckId()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getResourcesSummary() != null)
            sb.append("ResourcesSummary: ").append(getResourcesSummary()).append(",");
        if (getCategorySpecificSummary() != null)
            sb.append("CategorySpecificSummary: ").append(getCategorySpecificSummary()).append(",");
        if (getFlaggedResources() != null)
            sb.append("FlaggedResources: ").append(getFlaggedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorCheckResult == false)
            return false;
        TrustedAdvisorCheckResult other = (TrustedAdvisorCheckResult) obj;
        if (other.getCheckId() == null ^ this.getCheckId() == null)
            return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getResourcesSummary() == null ^ this.getResourcesSummary() == null)
            return false;
        if (other.getResourcesSummary() != null && other.getResourcesSummary().equals(this.getResourcesSummary()) == false)
            return false;
        if (other.getCategorySpecificSummary() == null ^ this.getCategorySpecificSummary() == null)
            return false;
        if (other.getCategorySpecificSummary() != null && other.getCategorySpecificSummary().equals(this.getCategorySpecificSummary()) == false)
            return false;
        if (other.getFlaggedResources() == null ^ this.getFlaggedResources() == null)
            return false;
        if (other.getFlaggedResources() != null && other.getFlaggedResources().equals(this.getFlaggedResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getResourcesSummary() == null) ? 0 : getResourcesSummary().hashCode());
        hashCode = prime * hashCode + ((getCategorySpecificSummary() == null) ? 0 : getCategorySpecificSummary().hashCode());
        hashCode = prime * hashCode + ((getFlaggedResources() == null) ? 0 : getFlaggedResources().hashCode());
        return hashCode;
    }

    @Override
    public TrustedAdvisorCheckResult clone() {
        try {
            return (TrustedAdvisorCheckResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.TrustedAdvisorCheckResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
