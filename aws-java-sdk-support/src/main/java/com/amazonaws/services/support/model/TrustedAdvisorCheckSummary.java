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
 * A summary of a Trusted Advisor check result, including the alert status, last refresh, and number of resources
 * examined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/TrustedAdvisorCheckSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustedAdvisorCheckSummary implements Serializable, Cloneable, StructuredPojo {

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
    /**
     * <p>
     * Specifies whether the Trusted Advisor check has flagged resources.
     * </p>
     */
    private Boolean hasFlaggedResources;

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

    public TrustedAdvisorCheckSummary withCheckId(String checkId) {
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

    public TrustedAdvisorCheckSummary withTimestamp(String timestamp) {
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

    public TrustedAdvisorCheckSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Trusted Advisor check has flagged resources.
     * </p>
     * 
     * @param hasFlaggedResources
     *        Specifies whether the Trusted Advisor check has flagged resources.
     */

    public void setHasFlaggedResources(Boolean hasFlaggedResources) {
        this.hasFlaggedResources = hasFlaggedResources;
    }

    /**
     * <p>
     * Specifies whether the Trusted Advisor check has flagged resources.
     * </p>
     * 
     * @return Specifies whether the Trusted Advisor check has flagged resources.
     */

    public Boolean getHasFlaggedResources() {
        return this.hasFlaggedResources;
    }

    /**
     * <p>
     * Specifies whether the Trusted Advisor check has flagged resources.
     * </p>
     * 
     * @param hasFlaggedResources
     *        Specifies whether the Trusted Advisor check has flagged resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckSummary withHasFlaggedResources(Boolean hasFlaggedResources) {
        setHasFlaggedResources(hasFlaggedResources);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Trusted Advisor check has flagged resources.
     * </p>
     * 
     * @return Specifies whether the Trusted Advisor check has flagged resources.
     */

    public Boolean isHasFlaggedResources() {
        return this.hasFlaggedResources;
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

    public TrustedAdvisorCheckSummary withResourcesSummary(TrustedAdvisorResourcesSummary resourcesSummary) {
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

    public TrustedAdvisorCheckSummary withCategorySpecificSummary(TrustedAdvisorCategorySpecificSummary categorySpecificSummary) {
        setCategorySpecificSummary(categorySpecificSummary);
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
        if (getHasFlaggedResources() != null)
            sb.append("HasFlaggedResources: ").append(getHasFlaggedResources()).append(",");
        if (getResourcesSummary() != null)
            sb.append("ResourcesSummary: ").append(getResourcesSummary()).append(",");
        if (getCategorySpecificSummary() != null)
            sb.append("CategorySpecificSummary: ").append(getCategorySpecificSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorCheckSummary == false)
            return false;
        TrustedAdvisorCheckSummary other = (TrustedAdvisorCheckSummary) obj;
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
        if (other.getHasFlaggedResources() == null ^ this.getHasFlaggedResources() == null)
            return false;
        if (other.getHasFlaggedResources() != null && other.getHasFlaggedResources().equals(this.getHasFlaggedResources()) == false)
            return false;
        if (other.getResourcesSummary() == null ^ this.getResourcesSummary() == null)
            return false;
        if (other.getResourcesSummary() != null && other.getResourcesSummary().equals(this.getResourcesSummary()) == false)
            return false;
        if (other.getCategorySpecificSummary() == null ^ this.getCategorySpecificSummary() == null)
            return false;
        if (other.getCategorySpecificSummary() != null && other.getCategorySpecificSummary().equals(this.getCategorySpecificSummary()) == false)
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
        hashCode = prime * hashCode + ((getHasFlaggedResources() == null) ? 0 : getHasFlaggedResources().hashCode());
        hashCode = prime * hashCode + ((getResourcesSummary() == null) ? 0 : getResourcesSummary().hashCode());
        hashCode = prime * hashCode + ((getCategorySpecificSummary() == null) ? 0 : getCategorySpecificSummary().hashCode());
        return hashCode;
    }

    @Override
    public TrustedAdvisorCheckSummary clone() {
        try {
            return (TrustedAdvisorCheckSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.TrustedAdvisorCheckSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
