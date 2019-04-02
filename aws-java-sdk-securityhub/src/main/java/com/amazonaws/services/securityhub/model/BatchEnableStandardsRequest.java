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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchEnableStandards" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchEnableStandardsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of standards that you want to enable.
     * </p>
     * <important>
     * <p>
     * In this release, Security Hub only supports the CIS AWS Foundations standard.
     * </p>
     * <p>
     * Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     * </p>
     * </important>
     */
    private java.util.List<StandardsSubscriptionRequest> standardsSubscriptionRequests;

    /**
     * <p>
     * The list of standards that you want to enable.
     * </p>
     * <important>
     * <p>
     * In this release, Security Hub only supports the CIS AWS Foundations standard.
     * </p>
     * <p>
     * Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     * </p>
     * </important>
     * 
     * @return The list of standards that you want to enable.</p> <important>
     *         <p>
     *         In this release, Security Hub only supports the CIS AWS Foundations standard.
     *         </p>
     *         <p>
     *         Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     *         </p>
     */

    public java.util.List<StandardsSubscriptionRequest> getStandardsSubscriptionRequests() {
        return standardsSubscriptionRequests;
    }

    /**
     * <p>
     * The list of standards that you want to enable.
     * </p>
     * <important>
     * <p>
     * In this release, Security Hub only supports the CIS AWS Foundations standard.
     * </p>
     * <p>
     * Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     * </p>
     * </important>
     * 
     * @param standardsSubscriptionRequests
     *        The list of standards that you want to enable.</p> <important>
     *        <p>
     *        In this release, Security Hub only supports the CIS AWS Foundations standard.
     *        </p>
     *        <p>
     *        Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     *        </p>
     */

    public void setStandardsSubscriptionRequests(java.util.Collection<StandardsSubscriptionRequest> standardsSubscriptionRequests) {
        if (standardsSubscriptionRequests == null) {
            this.standardsSubscriptionRequests = null;
            return;
        }

        this.standardsSubscriptionRequests = new java.util.ArrayList<StandardsSubscriptionRequest>(standardsSubscriptionRequests);
    }

    /**
     * <p>
     * The list of standards that you want to enable.
     * </p>
     * <important>
     * <p>
     * In this release, Security Hub only supports the CIS AWS Foundations standard.
     * </p>
     * <p>
     * Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStandardsSubscriptionRequests(java.util.Collection)} or
     * {@link #withStandardsSubscriptionRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param standardsSubscriptionRequests
     *        The list of standards that you want to enable.</p> <important>
     *        <p>
     *        In this release, Security Hub only supports the CIS AWS Foundations standard.
     *        </p>
     *        <p>
     *        Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEnableStandardsRequest withStandardsSubscriptionRequests(StandardsSubscriptionRequest... standardsSubscriptionRequests) {
        if (this.standardsSubscriptionRequests == null) {
            setStandardsSubscriptionRequests(new java.util.ArrayList<StandardsSubscriptionRequest>(standardsSubscriptionRequests.length));
        }
        for (StandardsSubscriptionRequest ele : standardsSubscriptionRequests) {
            this.standardsSubscriptionRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of standards that you want to enable.
     * </p>
     * <important>
     * <p>
     * In this release, Security Hub only supports the CIS AWS Foundations standard.
     * </p>
     * <p>
     * Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     * </p>
     * </important>
     * 
     * @param standardsSubscriptionRequests
     *        The list of standards that you want to enable.</p> <important>
     *        <p>
     *        In this release, Security Hub only supports the CIS AWS Foundations standard.
     *        </p>
     *        <p>
     *        Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEnableStandardsRequest withStandardsSubscriptionRequests(java.util.Collection<StandardsSubscriptionRequest> standardsSubscriptionRequests) {
        setStandardsSubscriptionRequests(standardsSubscriptionRequests);
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
        if (getStandardsSubscriptionRequests() != null)
            sb.append("StandardsSubscriptionRequests: ").append(getStandardsSubscriptionRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchEnableStandardsRequest == false)
            return false;
        BatchEnableStandardsRequest other = (BatchEnableStandardsRequest) obj;
        if (other.getStandardsSubscriptionRequests() == null ^ this.getStandardsSubscriptionRequests() == null)
            return false;
        if (other.getStandardsSubscriptionRequests() != null
                && other.getStandardsSubscriptionRequests().equals(this.getStandardsSubscriptionRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsSubscriptionRequests() == null) ? 0 : getStandardsSubscriptionRequests().hashCode());
        return hashCode;
    }

    @Override
    public BatchEnableStandardsRequest clone() {
        return (BatchEnableStandardsRequest) super.clone();
    }

}
