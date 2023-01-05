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
 * A response that contains details on the results of a finding aggregation by title.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/TitleAggregationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TitleAggregationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon Web Services account associated with the findings.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * An object that represent the count of matched findings per severity.
     * </p>
     */
    private SeverityCounts severityCounts;
    /**
     * <p>
     * The title that the findings were aggregated on.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The vulnerability ID of the finding.
     * </p>
     */
    private String vulnerabilityId;

    /**
     * <p>
     * The ID of the Amazon Web Services account associated with the findings.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account associated with the findings.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account associated with the findings.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account associated with the findings.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account associated with the findings.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account associated with the findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TitleAggregationResponse withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * An object that represent the count of matched findings per severity.
     * </p>
     * 
     * @param severityCounts
     *        An object that represent the count of matched findings per severity.
     */

    public void setSeverityCounts(SeverityCounts severityCounts) {
        this.severityCounts = severityCounts;
    }

    /**
     * <p>
     * An object that represent the count of matched findings per severity.
     * </p>
     * 
     * @return An object that represent the count of matched findings per severity.
     */

    public SeverityCounts getSeverityCounts() {
        return this.severityCounts;
    }

    /**
     * <p>
     * An object that represent the count of matched findings per severity.
     * </p>
     * 
     * @param severityCounts
     *        An object that represent the count of matched findings per severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TitleAggregationResponse withSeverityCounts(SeverityCounts severityCounts) {
        setSeverityCounts(severityCounts);
        return this;
    }

    /**
     * <p>
     * The title that the findings were aggregated on.
     * </p>
     * 
     * @param title
     *        The title that the findings were aggregated on.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title that the findings were aggregated on.
     * </p>
     * 
     * @return The title that the findings were aggregated on.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title that the findings were aggregated on.
     * </p>
     * 
     * @param title
     *        The title that the findings were aggregated on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TitleAggregationResponse withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The vulnerability ID of the finding.
     * </p>
     * 
     * @param vulnerabilityId
     *        The vulnerability ID of the finding.
     */

    public void setVulnerabilityId(String vulnerabilityId) {
        this.vulnerabilityId = vulnerabilityId;
    }

    /**
     * <p>
     * The vulnerability ID of the finding.
     * </p>
     * 
     * @return The vulnerability ID of the finding.
     */

    public String getVulnerabilityId() {
        return this.vulnerabilityId;
    }

    /**
     * <p>
     * The vulnerability ID of the finding.
     * </p>
     * 
     * @param vulnerabilityId
     *        The vulnerability ID of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TitleAggregationResponse withVulnerabilityId(String vulnerabilityId) {
        setVulnerabilityId(vulnerabilityId);
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
        if (getSeverityCounts() != null)
            sb.append("SeverityCounts: ").append(getSeverityCounts()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getVulnerabilityId() != null)
            sb.append("VulnerabilityId: ").append(getVulnerabilityId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TitleAggregationResponse == false)
            return false;
        TitleAggregationResponse other = (TitleAggregationResponse) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getSeverityCounts() == null ^ this.getSeverityCounts() == null)
            return false;
        if (other.getSeverityCounts() != null && other.getSeverityCounts().equals(this.getSeverityCounts()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getVulnerabilityId() == null ^ this.getVulnerabilityId() == null)
            return false;
        if (other.getVulnerabilityId() != null && other.getVulnerabilityId().equals(this.getVulnerabilityId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getSeverityCounts() == null) ? 0 : getSeverityCounts().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getVulnerabilityId() == null) ? 0 : getVulnerabilityId().hashCode());
        return hashCode;
    }

    @Override
    public TitleAggregationResponse clone() {
        try {
            return (TitleAggregationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.TitleAggregationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
