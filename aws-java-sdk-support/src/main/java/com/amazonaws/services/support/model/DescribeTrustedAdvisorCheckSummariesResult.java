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

/**
 * <p>
 * The summaries of the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorCheckSummaries</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckSummaries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustedAdvisorCheckSummariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The summary information for the requested Trusted Advisor checks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrustedAdvisorCheckSummary> summaries;

    /**
     * <p>
     * The summary information for the requested Trusted Advisor checks.
     * </p>
     * 
     * @return The summary information for the requested Trusted Advisor checks.
     */

    public java.util.List<TrustedAdvisorCheckSummary> getSummaries() {
        if (summaries == null) {
            summaries = new com.amazonaws.internal.SdkInternalList<TrustedAdvisorCheckSummary>();
        }
        return summaries;
    }

    /**
     * <p>
     * The summary information for the requested Trusted Advisor checks.
     * </p>
     * 
     * @param summaries
     *        The summary information for the requested Trusted Advisor checks.
     */

    public void setSummaries(java.util.Collection<TrustedAdvisorCheckSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new com.amazonaws.internal.SdkInternalList<TrustedAdvisorCheckSummary>(summaries);
    }

    /**
     * <p>
     * The summary information for the requested Trusted Advisor checks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaries(java.util.Collection)} or {@link #withSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaries
     *        The summary information for the requested Trusted Advisor checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedAdvisorCheckSummariesResult withSummaries(TrustedAdvisorCheckSummary... summaries) {
        if (this.summaries == null) {
            setSummaries(new com.amazonaws.internal.SdkInternalList<TrustedAdvisorCheckSummary>(summaries.length));
        }
        for (TrustedAdvisorCheckSummary ele : summaries) {
            this.summaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary information for the requested Trusted Advisor checks.
     * </p>
     * 
     * @param summaries
     *        The summary information for the requested Trusted Advisor checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedAdvisorCheckSummariesResult withSummaries(java.util.Collection<TrustedAdvisorCheckSummary> summaries) {
        setSummaries(summaries);
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
        if (getSummaries() != null)
            sb.append("Summaries: ").append(getSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrustedAdvisorCheckSummariesResult == false)
            return false;
        DescribeTrustedAdvisorCheckSummariesResult other = (DescribeTrustedAdvisorCheckSummariesResult) obj;
        if (other.getSummaries() == null ^ this.getSummaries() == null)
            return false;
        if (other.getSummaries() != null && other.getSummaries().equals(this.getSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummaries() == null) ? 0 : getSummaries().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrustedAdvisorCheckSummariesResult clone() {
        try {
            return (DescribeTrustedAdvisorCheckSummariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
