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
 * Information about the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorChecks</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorChecks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustedAdvisorChecksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about all available Trusted Advisor checks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrustedAdvisorCheckDescription> checks;

    /**
     * <p>
     * Information about all available Trusted Advisor checks.
     * </p>
     * 
     * @return Information about all available Trusted Advisor checks.
     */

    public java.util.List<TrustedAdvisorCheckDescription> getChecks() {
        if (checks == null) {
            checks = new com.amazonaws.internal.SdkInternalList<TrustedAdvisorCheckDescription>();
        }
        return checks;
    }

    /**
     * <p>
     * Information about all available Trusted Advisor checks.
     * </p>
     * 
     * @param checks
     *        Information about all available Trusted Advisor checks.
     */

    public void setChecks(java.util.Collection<TrustedAdvisorCheckDescription> checks) {
        if (checks == null) {
            this.checks = null;
            return;
        }

        this.checks = new com.amazonaws.internal.SdkInternalList<TrustedAdvisorCheckDescription>(checks);
    }

    /**
     * <p>
     * Information about all available Trusted Advisor checks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChecks(java.util.Collection)} or {@link #withChecks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param checks
     *        Information about all available Trusted Advisor checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedAdvisorChecksResult withChecks(TrustedAdvisorCheckDescription... checks) {
        if (this.checks == null) {
            setChecks(new com.amazonaws.internal.SdkInternalList<TrustedAdvisorCheckDescription>(checks.length));
        }
        for (TrustedAdvisorCheckDescription ele : checks) {
            this.checks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about all available Trusted Advisor checks.
     * </p>
     * 
     * @param checks
     *        Information about all available Trusted Advisor checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedAdvisorChecksResult withChecks(java.util.Collection<TrustedAdvisorCheckDescription> checks) {
        setChecks(checks);
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
        if (getChecks() != null)
            sb.append("Checks: ").append(getChecks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrustedAdvisorChecksResult == false)
            return false;
        DescribeTrustedAdvisorChecksResult other = (DescribeTrustedAdvisorChecksResult) obj;
        if (other.getChecks() == null ^ this.getChecks() == null)
            return false;
        if (other.getChecks() != null && other.getChecks().equals(this.getChecks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChecks() == null) ? 0 : getChecks().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrustedAdvisorChecksResult clone() {
        try {
            return (DescribeTrustedAdvisorChecksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
