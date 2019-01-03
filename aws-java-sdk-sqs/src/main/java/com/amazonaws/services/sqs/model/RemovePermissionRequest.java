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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/RemovePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemovePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of the Amazon SQS queue from which permissions are removed.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * The identification of the permission to remove. This is the label added using the
     * <code> <a>AddPermission</a> </code> action.
     * </p>
     */
    private String label;

    /**
     * Default constructor for RemovePermissionRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public RemovePermissionRequest() {
    }

    /**
     * Constructs a new RemovePermissionRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue from which permissions are removed.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     * @param label
     *        The identification of the permission to remove. This is the label added using the
     *        <code> <a>AddPermission</a> </code> action.
     */
    public RemovePermissionRequest(String queueUrl, String label) {
        setQueueUrl(queueUrl);
        setLabel(label);
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue from which permissions are removed.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue from which permissions are removed.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue from which permissions are removed.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @return The URL of the Amazon SQS queue from which permissions are removed.</p>
     *         <p>
     *         Queue URLs and names are case-sensitive.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue from which permissions are removed.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue from which permissions are removed.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * The identification of the permission to remove. This is the label added using the
     * <code> <a>AddPermission</a> </code> action.
     * </p>
     * 
     * @param label
     *        The identification of the permission to remove. This is the label added using the
     *        <code> <a>AddPermission</a> </code> action.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The identification of the permission to remove. This is the label added using the
     * <code> <a>AddPermission</a> </code> action.
     * </p>
     * 
     * @return The identification of the permission to remove. This is the label added using the
     *         <code> <a>AddPermission</a> </code> action.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The identification of the permission to remove. This is the label added using the
     * <code> <a>AddPermission</a> </code> action.
     * </p>
     * 
     * @param label
     *        The identification of the permission to remove. This is the label added using the
     *        <code> <a>AddPermission</a> </code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withLabel(String label) {
        setLabel(label);
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
        if (getQueueUrl() != null)
            sb.append("QueueUrl: ").append(getQueueUrl()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemovePermissionRequest == false)
            return false;
        RemovePermissionRequest other = (RemovePermissionRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        return hashCode;
    }

    @Override
    public RemovePermissionRequest clone() {
        return (RemovePermissionRequest) super.clone();
    }

}
