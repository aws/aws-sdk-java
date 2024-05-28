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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDataProtectionPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDataProtectionPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify either the log group name or log group ARN.
     * </p>
     */
    private String logGroupIdentifier;
    /**
     * <p>
     * Specify the data protection policy, in JSON.
     * </p>
     * <p>
     * This policy must include two JSON blocks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of sensitive data that you
     * want to mask. For more information about the available options, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types of data
     * that you can mask</a>.
     * </p>
     * <p>
     * The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive data
     * terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You can optionally
     * use that <code>FindingsDestination</code> object to list one or more destinations to send audit findings to. If
     * you specify destinations such as log groups, Firehose streams, and S3 buckets, they must already exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match the
     * <code>DataIdentifer</code> array in the first block of the policy.
     * </p>
     * <p>
     * The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the data, and
     * it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code> object must be
     * empty.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an example data protection policy, see the <b>Examples</b> section on this page.
     * </p>
     * <important>
     * <p>
     * The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     * </p>
     * </important>
     * <p>
     * In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     * <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is used as a dimension when
     * CloudWatch Logs reports audit findings metrics to CloudWatch.
     * </p>
     * <p>
     * The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * Specify either the log group name or log group ARN.
     * </p>
     * 
     * @param logGroupIdentifier
     *        Specify either the log group name or log group ARN.
     */

    public void setLogGroupIdentifier(String logGroupIdentifier) {
        this.logGroupIdentifier = logGroupIdentifier;
    }

    /**
     * <p>
     * Specify either the log group name or log group ARN.
     * </p>
     * 
     * @return Specify either the log group name or log group ARN.
     */

    public String getLogGroupIdentifier() {
        return this.logGroupIdentifier;
    }

    /**
     * <p>
     * Specify either the log group name or log group ARN.
     * </p>
     * 
     * @param logGroupIdentifier
     *        Specify either the log group name or log group ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDataProtectionPolicyRequest withLogGroupIdentifier(String logGroupIdentifier) {
        setLogGroupIdentifier(logGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * Specify the data protection policy, in JSON.
     * </p>
     * <p>
     * This policy must include two JSON blocks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of sensitive data that you
     * want to mask. For more information about the available options, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types of data
     * that you can mask</a>.
     * </p>
     * <p>
     * The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive data
     * terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You can optionally
     * use that <code>FindingsDestination</code> object to list one or more destinations to send audit findings to. If
     * you specify destinations such as log groups, Firehose streams, and S3 buckets, they must already exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match the
     * <code>DataIdentifer</code> array in the first block of the policy.
     * </p>
     * <p>
     * The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the data, and
     * it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code> object must be
     * empty.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an example data protection policy, see the <b>Examples</b> section on this page.
     * </p>
     * <important>
     * <p>
     * The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     * </p>
     * </important>
     * <p>
     * In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     * <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is used as a dimension when
     * CloudWatch Logs reports audit findings metrics to CloudWatch.
     * </p>
     * <p>
     * The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * </p>
     * 
     * @param policyDocument
     *        Specify the data protection policy, in JSON.</p>
     *        <p>
     *        This policy must include two JSON blocks:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code>
     *        property with an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of
     *        sensitive data that you want to mask. For more information about the available options, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types
     *        of data that you can mask</a>.
     *        </p>
     *        <p>
     *        The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive
     *        data terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You can
     *        optionally use that <code>FindingsDestination</code> object to list one or more destinations to send audit
     *        findings to. If you specify destinations such as log groups, Firehose streams, and S3 buckets, they must
     *        already exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code>
     *        property with an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match
     *        the <code>DataIdentifer</code> array in the first block of the policy.
     *        </p>
     *        <p>
     *        The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the
     *        data, and it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code>
     *        object must be empty.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an example data protection policy, see the <b>Examples</b> section on this page.
     *        </p>
     *        <important>
     *        <p>
     *        The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     *        </p>
     *        </important>
     *        <p>
     *        In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     *        <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is used as a dimension
     *        when CloudWatch Logs reports audit findings metrics to CloudWatch.
     *        </p>
     *        <p>
     *        The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * Specify the data protection policy, in JSON.
     * </p>
     * <p>
     * This policy must include two JSON blocks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of sensitive data that you
     * want to mask. For more information about the available options, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types of data
     * that you can mask</a>.
     * </p>
     * <p>
     * The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive data
     * terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You can optionally
     * use that <code>FindingsDestination</code> object to list one or more destinations to send audit findings to. If
     * you specify destinations such as log groups, Firehose streams, and S3 buckets, they must already exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match the
     * <code>DataIdentifer</code> array in the first block of the policy.
     * </p>
     * <p>
     * The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the data, and
     * it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code> object must be
     * empty.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an example data protection policy, see the <b>Examples</b> section on this page.
     * </p>
     * <important>
     * <p>
     * The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     * </p>
     * </important>
     * <p>
     * In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     * <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is used as a dimension when
     * CloudWatch Logs reports audit findings metrics to CloudWatch.
     * </p>
     * <p>
     * The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * </p>
     * 
     * @return Specify the data protection policy, in JSON.</p>
     *         <p>
     *         This policy must include two JSON blocks:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code>
     *         property with an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of
     *         sensitive data that you want to mask. For more information about the available options, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types
     *         of data that you can mask</a>.
     *         </p>
     *         <p>
     *         The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive
     *         data terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You
     *         can optionally use that <code>FindingsDestination</code> object to list one or more destinations to send
     *         audit findings to. If you specify destinations such as log groups, Firehose streams, and S3 buckets, they
     *         must already exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code>
     *         property with an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match
     *         the <code>DataIdentifer</code> array in the first block of the policy.
     *         </p>
     *         <p>
     *         The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the
     *         data, and it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code>
     *         object must be empty.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For an example data protection policy, see the <b>Examples</b> section on this page.
     *         </p>
     *         <important>
     *         <p>
     *         The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     *         </p>
     *         </important>
     *         <p>
     *         In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     *         <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is used as a dimension
     *         when CloudWatch Logs reports audit findings metrics to CloudWatch.
     *         </p>
     *         <p>
     *         The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * Specify the data protection policy, in JSON.
     * </p>
     * <p>
     * This policy must include two JSON blocks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of sensitive data that you
     * want to mask. For more information about the available options, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types of data
     * that you can mask</a>.
     * </p>
     * <p>
     * The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive data
     * terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You can optionally
     * use that <code>FindingsDestination</code> object to list one or more destinations to send audit findings to. If
     * you specify destinations such as log groups, Firehose streams, and S3 buckets, they must already exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match the
     * <code>DataIdentifer</code> array in the first block of the policy.
     * </p>
     * <p>
     * The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the data, and
     * it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code> object must be
     * empty.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an example data protection policy, see the <b>Examples</b> section on this page.
     * </p>
     * <important>
     * <p>
     * The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     * </p>
     * </important>
     * <p>
     * In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     * <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is used as a dimension when
     * CloudWatch Logs reports audit findings metrics to CloudWatch.
     * </p>
     * <p>
     * The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * </p>
     * 
     * @param policyDocument
     *        Specify the data protection policy, in JSON.</p>
     *        <p>
     *        This policy must include two JSON blocks:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code>
     *        property with an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of
     *        sensitive data that you want to mask. For more information about the available options, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types
     *        of data that you can mask</a>.
     *        </p>
     *        <p>
     *        The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive
     *        data terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You can
     *        optionally use that <code>FindingsDestination</code> object to list one or more destinations to send audit
     *        findings to. If you specify destinations such as log groups, Firehose streams, and S3 buckets, they must
     *        already exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code>
     *        property with an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match
     *        the <code>DataIdentifer</code> array in the first block of the policy.
     *        </p>
     *        <p>
     *        The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the
     *        data, and it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code>
     *        object must be empty.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an example data protection policy, see the <b>Examples</b> section on this page.
     *        </p>
     *        <important>
     *        <p>
     *        The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     *        </p>
     *        </important>
     *        <p>
     *        In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     *        <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is used as a dimension
     *        when CloudWatch Logs reports audit findings metrics to CloudWatch.
     *        </p>
     *        <p>
     *        The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDataProtectionPolicyRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
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
        if (getLogGroupIdentifier() != null)
            sb.append("LogGroupIdentifier: ").append(getLogGroupIdentifier()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDataProtectionPolicyRequest == false)
            return false;
        PutDataProtectionPolicyRequest other = (PutDataProtectionPolicyRequest) obj;
        if (other.getLogGroupIdentifier() == null ^ this.getLogGroupIdentifier() == null)
            return false;
        if (other.getLogGroupIdentifier() != null && other.getLogGroupIdentifier().equals(this.getLogGroupIdentifier()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupIdentifier() == null) ? 0 : getLogGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        return hashCode;
    }

    @Override
    public PutDataProtectionPolicyRequest clone() {
        return (PutDataProtectionPolicyRequest) super.clone();
    }

}
