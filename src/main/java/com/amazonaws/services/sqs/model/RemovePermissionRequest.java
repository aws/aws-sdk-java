/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sqs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#removePermission(RemovePermissionRequest) RemovePermission operation}.
 * <p>
 * The <code>RemovePermission</code> action revokes any permissions in the queue policy that matches the specified <code>Label</code> parameter. Only the
 * owner of the queue can remove permissions.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#removePermission(RemovePermissionRequest)
 */
public class RemovePermissionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The URL of the SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * The identification of the permission to remove. This is the label
     * added with the <a>AddPermission</a> operation.
     */
    private String label;

    /**
     * Default constructor for a new RemovePermissionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RemovePermissionRequest() {}
    
    /**
     * Constructs a new RemovePermissionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the SQS queue to take action on.
     * @param label The identification of the permission to remove. This is
     * the label added with the <a>AddPermission</a> operation.
     */
    public RemovePermissionRequest(String queueUrl, String label) {
        setQueueUrl(queueUrl);
        setLabel(label);
    }

    /**
     * The URL of the SQS queue to take action on.
     *
     * @return The URL of the SQS queue to take action on.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * The URL of the SQS queue to take action on.
     *
     * @param queueUrl The URL of the SQS queue to take action on.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * The URL of the SQS queue to take action on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The URL of the SQS queue to take action on.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemovePermissionRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * The identification of the permission to remove. This is the label
     * added with the <a>AddPermission</a> operation.
     *
     * @return The identification of the permission to remove. This is the label
     *         added with the <a>AddPermission</a> operation.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * The identification of the permission to remove. This is the label
     * added with the <a>AddPermission</a> operation.
     *
     * @param label The identification of the permission to remove. This is the label
     *         added with the <a>AddPermission</a> operation.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * The identification of the permission to remove. This is the label
     * added with the <a>AddPermission</a> operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param label The identification of the permission to remove. This is the label
     *         added with the <a>AddPermission</a> operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemovePermissionRequest withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getQueueUrl() != null) sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (getLabel() != null) sb.append("Label: " + getLabel() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RemovePermissionRequest == false) return false;
        RemovePermissionRequest other = (RemovePermissionRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.getLabel() == null ^ this.getLabel() == null) return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false) return false; 
        return true;
    }
    
}
    