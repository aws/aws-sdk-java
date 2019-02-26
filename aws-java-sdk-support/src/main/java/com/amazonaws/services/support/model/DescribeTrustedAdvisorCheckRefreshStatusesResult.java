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
 * The statuses of the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorCheckRefreshStatuses</a>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckRefreshStatuses"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustedAdvisorCheckRefreshStatusesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The refresh status of the specified Trusted Advisor checks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrustedAdvisorCheckRefreshStatus> statuses;

    /**
     * <p>
     * The refresh status of the specified Trusted Advisor checks.
     * </p>
     * 
     * @return The refresh status of the specified Trusted Advisor checks.
     */

    public java.util.List<TrustedAdvisorCheckRefreshStatus> getStatuses() {
        if (statuses == null) {
            statuses = new com.amazonaws.internal.SdkInternalList<TrustedAdvisorCheckRefreshStatus>();
        }
        return statuses;
    }

    /**
     * <p>
     * The refresh status of the specified Trusted Advisor checks.
     * </p>
     * 
     * @param statuses
     *        The refresh status of the specified Trusted Advisor checks.
     */

    public void setStatuses(java.util.Collection<TrustedAdvisorCheckRefreshStatus> statuses) {
        if (statuses == null) {
            this.statuses = null;
            return;
        }

        this.statuses = new com.amazonaws.internal.SdkInternalList<TrustedAdvisorCheckRefreshStatus>(statuses);
    }

    /**
     * <p>
     * The refresh status of the specified Trusted Advisor checks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatuses(java.util.Collection)} or {@link #withStatuses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param statuses
     *        The refresh status of the specified Trusted Advisor checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedAdvisorCheckRefreshStatusesResult withStatuses(TrustedAdvisorCheckRefreshStatus... statuses) {
        if (this.statuses == null) {
            setStatuses(new com.amazonaws.internal.SdkInternalList<TrustedAdvisorCheckRefreshStatus>(statuses.length));
        }
        for (TrustedAdvisorCheckRefreshStatus ele : statuses) {
            this.statuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The refresh status of the specified Trusted Advisor checks.
     * </p>
     * 
     * @param statuses
     *        The refresh status of the specified Trusted Advisor checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedAdvisorCheckRefreshStatusesResult withStatuses(java.util.Collection<TrustedAdvisorCheckRefreshStatus> statuses) {
        setStatuses(statuses);
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
        if (getStatuses() != null)
            sb.append("Statuses: ").append(getStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrustedAdvisorCheckRefreshStatusesResult == false)
            return false;
        DescribeTrustedAdvisorCheckRefreshStatusesResult other = (DescribeTrustedAdvisorCheckRefreshStatusesResult) obj;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrustedAdvisorCheckRefreshStatusesResult clone() {
        try {
            return (DescribeTrustedAdvisorCheckRefreshStatusesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
