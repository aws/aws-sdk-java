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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains counts of vulnerability findings from image scans that run when you create new Image Builder images, or
 * build new versions of existing images. The vulnerability counts are grouped by severity level. The counts are
 * aggregated across resources to create the final tally for the account that owns them.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/AccountAggregation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the account that owns the aggregated resource findings.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Counts by severity level for medium severity and higher level findings, plus a total for all of the findings.
     * </p>
     */
    private SeverityCounts severityCounts;

    /**
     * <p>
     * Identifies the account that owns the aggregated resource findings.
     * </p>
     * 
     * @param accountId
     *        Identifies the account that owns the aggregated resource findings.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Identifies the account that owns the aggregated resource findings.
     * </p>
     * 
     * @return Identifies the account that owns the aggregated resource findings.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * Identifies the account that owns the aggregated resource findings.
     * </p>
     * 
     * @param accountId
     *        Identifies the account that owns the aggregated resource findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAggregation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Counts by severity level for medium severity and higher level findings, plus a total for all of the findings.
     * </p>
     * 
     * @param severityCounts
     *        Counts by severity level for medium severity and higher level findings, plus a total for all of the
     *        findings.
     */

    public void setSeverityCounts(SeverityCounts severityCounts) {
        this.severityCounts = severityCounts;
    }

    /**
     * <p>
     * Counts by severity level for medium severity and higher level findings, plus a total for all of the findings.
     * </p>
     * 
     * @return Counts by severity level for medium severity and higher level findings, plus a total for all of the
     *         findings.
     */

    public SeverityCounts getSeverityCounts() {
        return this.severityCounts;
    }

    /**
     * <p>
     * Counts by severity level for medium severity and higher level findings, plus a total for all of the findings.
     * </p>
     * 
     * @param severityCounts
     *        Counts by severity level for medium severity and higher level findings, plus a total for all of the
     *        findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAggregation withSeverityCounts(SeverityCounts severityCounts) {
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

        if (obj instanceof AccountAggregation == false)
            return false;
        AccountAggregation other = (AccountAggregation) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
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
        hashCode = prime * hashCode + ((getSeverityCounts() == null) ? 0 : getSeverityCounts().hashCode());
        return hashCode;
    }

    @Override
    public AccountAggregation clone() {
        try {
            return (AccountAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.AccountAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
