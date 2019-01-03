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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/GetQueueUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueueUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric characters,
     * hyphens (<code>-</code>), and underscores (<code>_</code>).
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueName;
    /**
     * <p>
     * The AWS account ID of the account that created the queue.
     * </p>
     */
    private String queueOwnerAWSAccountId;

    /**
     * Default constructor for GetQueueUrlRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public GetQueueUrlRequest() {
    }

    /**
     * Constructs a new GetQueueUrlRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueName
     *        The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric
     *        characters, hyphens (<code>-</code>), and underscores (<code>_</code>).</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */
    public GetQueueUrlRequest(String queueName) {
        setQueueName(queueName);
    }

    /**
     * <p>
     * The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric characters,
     * hyphens (<code>-</code>), and underscores (<code>_</code>).
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueName
     *        The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric
     *        characters, hyphens (<code>-</code>), and underscores (<code>_</code>).</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * <p>
     * The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric characters,
     * hyphens (<code>-</code>), and underscores (<code>_</code>).
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @return The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric
     *         characters, hyphens (<code>-</code>), and underscores (<code>_</code>).</p>
     *         <p>
     *         Queue URLs and names are case-sensitive.
     */

    public String getQueueName() {
        return this.queueName;
    }

    /**
     * <p>
     * The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric characters,
     * hyphens (<code>-</code>), and underscores (<code>_</code>).
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueName
     *        The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric
     *        characters, hyphens (<code>-</code>), and underscores (<code>_</code>).</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueUrlRequest withQueueName(String queueName) {
        setQueueName(queueName);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the account that created the queue.
     * </p>
     * 
     * @param queueOwnerAWSAccountId
     *        The AWS account ID of the account that created the queue.
     */

    public void setQueueOwnerAWSAccountId(String queueOwnerAWSAccountId) {
        this.queueOwnerAWSAccountId = queueOwnerAWSAccountId;
    }

    /**
     * <p>
     * The AWS account ID of the account that created the queue.
     * </p>
     * 
     * @return The AWS account ID of the account that created the queue.
     */

    public String getQueueOwnerAWSAccountId() {
        return this.queueOwnerAWSAccountId;
    }

    /**
     * <p>
     * The AWS account ID of the account that created the queue.
     * </p>
     * 
     * @param queueOwnerAWSAccountId
     *        The AWS account ID of the account that created the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueUrlRequest withQueueOwnerAWSAccountId(String queueOwnerAWSAccountId) {
        setQueueOwnerAWSAccountId(queueOwnerAWSAccountId);
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
        if (getQueueName() != null)
            sb.append("QueueName: ").append(getQueueName()).append(",");
        if (getQueueOwnerAWSAccountId() != null)
            sb.append("QueueOwnerAWSAccountId: ").append(getQueueOwnerAWSAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueueUrlRequest == false)
            return false;
        GetQueueUrlRequest other = (GetQueueUrlRequest) obj;
        if (other.getQueueName() == null ^ this.getQueueName() == null)
            return false;
        if (other.getQueueName() != null && other.getQueueName().equals(this.getQueueName()) == false)
            return false;
        if (other.getQueueOwnerAWSAccountId() == null ^ this.getQueueOwnerAWSAccountId() == null)
            return false;
        if (other.getQueueOwnerAWSAccountId() != null && other.getQueueOwnerAWSAccountId().equals(this.getQueueOwnerAWSAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueName() == null) ? 0 : getQueueName().hashCode());
        hashCode = prime * hashCode + ((getQueueOwnerAWSAccountId() == null) ? 0 : getQueueOwnerAWSAccountId().hashCode());
        return hashCode;
    }

    @Override
    public GetQueueUrlRequest clone() {
        return (GetQueueUrlRequest) super.clone();
    }

}
