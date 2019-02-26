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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the new policy. This parameter is required.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * Details of the new policy, including the identity of the principal that is enabled to put logs to this account.
     * This is formatted as a JSON string.
     * </p>
     * <p>
     * The following example creates a resource policy enabling the Route 53 service to put DNS query logs in to the
     * specified log group. Replace "logArn" with the ARN of your CloudWatch Logs resource, such as a log group or log
     * stream.
     * </p>
     * <p>
     * <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * Name of the new policy. This parameter is required.
     * </p>
     * 
     * @param policyName
     *        Name of the new policy. This parameter is required.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * Name of the new policy. This parameter is required.
     * </p>
     * 
     * @return Name of the new policy. This parameter is required.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * Name of the new policy. This parameter is required.
     * </p>
     * 
     * @param policyName
     *        Name of the new policy. This parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * Details of the new policy, including the identity of the principal that is enabled to put logs to this account.
     * This is formatted as a JSON string.
     * </p>
     * <p>
     * The following example creates a resource policy enabling the Route 53 service to put DNS query logs in to the
     * specified log group. Replace "logArn" with the ARN of your CloudWatch Logs resource, such as a log group or log
     * stream.
     * </p>
     * <p>
     * <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     * </p>
     * 
     * @param policyDocument
     *        Details of the new policy, including the identity of the principal that is enabled to put logs to this
     *        account. This is formatted as a JSON string.</p>
     *        <p>
     *        The following example creates a resource policy enabling the Route 53 service to put DNS query logs in to
     *        the specified log group. Replace "logArn" with the ARN of your CloudWatch Logs resource, such as a log
     *        group or log stream.
     *        </p>
     *        <p>
     *        <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * Details of the new policy, including the identity of the principal that is enabled to put logs to this account.
     * This is formatted as a JSON string.
     * </p>
     * <p>
     * The following example creates a resource policy enabling the Route 53 service to put DNS query logs in to the
     * specified log group. Replace "logArn" with the ARN of your CloudWatch Logs resource, such as a log group or log
     * stream.
     * </p>
     * <p>
     * <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     * </p>
     * 
     * @return Details of the new policy, including the identity of the principal that is enabled to put logs to this
     *         account. This is formatted as a JSON string.</p>
     *         <p>
     *         The following example creates a resource policy enabling the Route 53 service to put DNS query logs in to
     *         the specified log group. Replace "logArn" with the ARN of your CloudWatch Logs resource, such as a log
     *         group or log stream.
     *         </p>
     *         <p>
     *         <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * Details of the new policy, including the identity of the principal that is enabled to put logs to this account.
     * This is formatted as a JSON string.
     * </p>
     * <p>
     * The following example creates a resource policy enabling the Route 53 service to put DNS query logs in to the
     * specified log group. Replace "logArn" with the ARN of your CloudWatch Logs resource, such as a log group or log
     * stream.
     * </p>
     * <p>
     * <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     * </p>
     * 
     * @param policyDocument
     *        Details of the new policy, including the identity of the principal that is enabled to put logs to this
     *        account. This is formatted as a JSON string.</p>
     *        <p>
     *        The following example creates a resource policy enabling the Route 53 service to put DNS query logs in to
     *        the specified log group. Replace "logArn" with the ARN of your CloudWatch Logs resource, such as a log
     *        group or log stream.
     *        </p>
     *        <p>
     *        <code>{ "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] } </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicyDocument(String policyDocument) {
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
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

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
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

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
