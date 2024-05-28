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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/AssociateKmsKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateKmsKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * In your <code>AssociateKmsKey</code> operation, you must specify either the <code>resourceIdentifier</code>
     * parameter or the <code>logGroup</code> parameter, but you can't specify both.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data. This must be a symmetric KMS key.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">Amazon Resource
     * Names</a> and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using
     * Symmetric and Asymmetric Keys</a>.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies the target for this operation. You must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the following ARN to have future <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetQueryResults.html"
     * >GetQueryResults</a> operations in this account encrypt the results with the specified KMS key. Replace
     * <i>REGION</i> and <i>ACCOUNT_ID</i> with your Region and account ID.
     * </p>
     * <p>
     * <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:query-result:*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the ARN of a log group to have CloudWatch Logs use the KMS key to encrypt log events that are ingested
     * and stored by that log group. The log group ARN must be in the following format. Replace <i>REGION</i> and
     * <i>ACCOUNT_ID</i> with your Region and account ID.
     * </p>
     * <p>
     * <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:log-group:<i>LOG_GROUP_NAME</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In your <code>AssociateKmsKey</code> operation, you must specify either the <code>resourceIdentifier</code>
     * parameter or the <code>logGroup</code> parameter, but you can't specify both.
     * </p>
     */
    private String resourceIdentifier;

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * In your <code>AssociateKmsKey</code> operation, you must specify either the <code>resourceIdentifier</code>
     * parameter or the <code>logGroup</code> parameter, but you can't specify both.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.</p>
     *        <p>
     *        In your <code>AssociateKmsKey</code> operation, you must specify either the
     *        <code>resourceIdentifier</code> parameter or the <code>logGroup</code> parameter, but you can't specify
     *        both.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * In your <code>AssociateKmsKey</code> operation, you must specify either the <code>resourceIdentifier</code>
     * parameter or the <code>logGroup</code> parameter, but you can't specify both.
     * </p>
     * 
     * @return The name of the log group.</p>
     *         <p>
     *         In your <code>AssociateKmsKey</code> operation, you must specify either the
     *         <code>resourceIdentifier</code> parameter or the <code>logGroup</code> parameter, but you can't specify
     *         both.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * In your <code>AssociateKmsKey</code> operation, you must specify either the <code>resourceIdentifier</code>
     * parameter or the <code>logGroup</code> parameter, but you can't specify both.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.</p>
     *        <p>
     *        In your <code>AssociateKmsKey</code> operation, you must specify either the
     *        <code>resourceIdentifier</code> parameter or the <code>logGroup</code> parameter, but you can't specify
     *        both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateKmsKeyRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data. This must be a symmetric KMS key.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">Amazon Resource
     * Names</a> and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using
     * Symmetric and Asymmetric Keys</a>.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data. This must be a symmetric
     *        KMS key. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">Amazon
     *        Resource Names</a> and <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using Symmetric and
     *        Asymmetric Keys</a>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data. This must be a symmetric KMS key.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">Amazon Resource
     * Names</a> and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using
     * Symmetric and Asymmetric Keys</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data. This must be a symmetric
     *         KMS key. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">Amazon
     *         Resource Names</a> and <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using Symmetric
     *         and Asymmetric Keys</a>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data. This must be a symmetric KMS key.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">Amazon Resource
     * Names</a> and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using
     * Symmetric and Asymmetric Keys</a>.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data. This must be a symmetric
     *        KMS key. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">Amazon
     *        Resource Names</a> and <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using Symmetric and
     *        Asymmetric Keys</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateKmsKeyRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies the target for this operation. You must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the following ARN to have future <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetQueryResults.html"
     * >GetQueryResults</a> operations in this account encrypt the results with the specified KMS key. Replace
     * <i>REGION</i> and <i>ACCOUNT_ID</i> with your Region and account ID.
     * </p>
     * <p>
     * <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:query-result:*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the ARN of a log group to have CloudWatch Logs use the KMS key to encrypt log events that are ingested
     * and stored by that log group. The log group ARN must be in the following format. Replace <i>REGION</i> and
     * <i>ACCOUNT_ID</i> with your Region and account ID.
     * </p>
     * <p>
     * <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:log-group:<i>LOG_GROUP_NAME</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In your <code>AssociateKmsKey</code> operation, you must specify either the <code>resourceIdentifier</code>
     * parameter or the <code>logGroup</code> parameter, but you can't specify both.
     * </p>
     * 
     * @param resourceIdentifier
     *        Specifies the target for this operation. You must specify one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify the following ARN to have future <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetQueryResults.html"
     *        >GetQueryResults</a> operations in this account encrypt the results with the specified KMS key. Replace
     *        <i>REGION</i> and <i>ACCOUNT_ID</i> with your Region and account ID.
     *        </p>
     *        <p>
     *        <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:query-result:*</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify the ARN of a log group to have CloudWatch Logs use the KMS key to encrypt log events that are
     *        ingested and stored by that log group. The log group ARN must be in the following format. Replace
     *        <i>REGION</i> and <i>ACCOUNT_ID</i> with your Region and account ID.
     *        </p>
     *        <p>
     *        <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:log-group:<i>LOG_GROUP_NAME</i> </code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In your <code>AssociateKmsKey</code> operation, you must specify either the
     *        <code>resourceIdentifier</code> parameter or the <code>logGroup</code> parameter, but you can't specify
     *        both.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * Specifies the target for this operation. You must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the following ARN to have future <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetQueryResults.html"
     * >GetQueryResults</a> operations in this account encrypt the results with the specified KMS key. Replace
     * <i>REGION</i> and <i>ACCOUNT_ID</i> with your Region and account ID.
     * </p>
     * <p>
     * <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:query-result:*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the ARN of a log group to have CloudWatch Logs use the KMS key to encrypt log events that are ingested
     * and stored by that log group. The log group ARN must be in the following format. Replace <i>REGION</i> and
     * <i>ACCOUNT_ID</i> with your Region and account ID.
     * </p>
     * <p>
     * <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:log-group:<i>LOG_GROUP_NAME</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In your <code>AssociateKmsKey</code> operation, you must specify either the <code>resourceIdentifier</code>
     * parameter or the <code>logGroup</code> parameter, but you can't specify both.
     * </p>
     * 
     * @return Specifies the target for this operation. You must specify one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify the following ARN to have future <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetQueryResults.html"
     *         >GetQueryResults</a> operations in this account encrypt the results with the specified KMS key. Replace
     *         <i>REGION</i> and <i>ACCOUNT_ID</i> with your Region and account ID.
     *         </p>
     *         <p>
     *         <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:query-result:*</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify the ARN of a log group to have CloudWatch Logs use the KMS key to encrypt log events that are
     *         ingested and stored by that log group. The log group ARN must be in the following format. Replace
     *         <i>REGION</i> and <i>ACCOUNT_ID</i> with your Region and account ID.
     *         </p>
     *         <p>
     *         <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:log-group:<i>LOG_GROUP_NAME</i> </code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In your <code>AssociateKmsKey</code> operation, you must specify either the
     *         <code>resourceIdentifier</code> parameter or the <code>logGroup</code> parameter, but you can't specify
     *         both.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * Specifies the target for this operation. You must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the following ARN to have future <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetQueryResults.html"
     * >GetQueryResults</a> operations in this account encrypt the results with the specified KMS key. Replace
     * <i>REGION</i> and <i>ACCOUNT_ID</i> with your Region and account ID.
     * </p>
     * <p>
     * <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:query-result:*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the ARN of a log group to have CloudWatch Logs use the KMS key to encrypt log events that are ingested
     * and stored by that log group. The log group ARN must be in the following format. Replace <i>REGION</i> and
     * <i>ACCOUNT_ID</i> with your Region and account ID.
     * </p>
     * <p>
     * <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:log-group:<i>LOG_GROUP_NAME</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In your <code>AssociateKmsKey</code> operation, you must specify either the <code>resourceIdentifier</code>
     * parameter or the <code>logGroup</code> parameter, but you can't specify both.
     * </p>
     * 
     * @param resourceIdentifier
     *        Specifies the target for this operation. You must specify one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify the following ARN to have future <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetQueryResults.html"
     *        >GetQueryResults</a> operations in this account encrypt the results with the specified KMS key. Replace
     *        <i>REGION</i> and <i>ACCOUNT_ID</i> with your Region and account ID.
     *        </p>
     *        <p>
     *        <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:query-result:*</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify the ARN of a log group to have CloudWatch Logs use the KMS key to encrypt log events that are
     *        ingested and stored by that log group. The log group ARN must be in the following format. Replace
     *        <i>REGION</i> and <i>ACCOUNT_ID</i> with your Region and account ID.
     *        </p>
     *        <p>
     *        <code>arn:aws:logs:<i>REGION</i>:<i>ACCOUNT_ID</i>:log-group:<i>LOG_GROUP_NAME</i> </code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In your <code>AssociateKmsKey</code> operation, you must specify either the
     *        <code>resourceIdentifier</code> parameter or the <code>logGroup</code> parameter, but you can't specify
     *        both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateKmsKeyRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateKmsKeyRequest == false)
            return false;
        AssociateKmsKeyRequest other = (AssociateKmsKeyRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public AssociateKmsKeyRequest clone() {
        return (AssociateKmsKeyRequest) super.clone();
    }

}
