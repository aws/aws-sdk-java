/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request parameters represent the input of a commit transaction request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/CommitTransaction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommitTransactionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The name or ARN of the secret that enables access to the DB cluster.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * The identifier of the transaction to end and commit.
     * </p>
     */
    private String transactionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitTransactionRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the DB cluster.
     * </p>
     * 
     * @param secretArn
     *        The name or ARN of the secret that enables access to the DB cluster.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the DB cluster.
     * </p>
     * 
     * @return The name or ARN of the secret that enables access to the DB cluster.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the DB cluster.
     * </p>
     * 
     * @param secretArn
     *        The name or ARN of the secret that enables access to the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitTransactionRequest withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the transaction to end and commit.
     * </p>
     * 
     * @param transactionId
     *        The identifier of the transaction to end and commit.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The identifier of the transaction to end and commit.
     * </p>
     * 
     * @return The identifier of the transaction to end and commit.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The identifier of the transaction to end and commit.
     * </p>
     * 
     * @param transactionId
     *        The identifier of the transaction to end and commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitTransactionRequest withTransactionId(String transactionId) {
        setTransactionId(transactionId);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommitTransactionRequest == false)
            return false;
        CommitTransactionRequest other = (CommitTransactionRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        return hashCode;
    }

    @Override
    public CommitTransactionRequest clone() {
        return (CommitTransactionRequest) super.clone();
    }

}
