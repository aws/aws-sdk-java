/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#addPermission(AddPermissionRequest) AddPermission operation}.
 * <p>
 * The AddPermission action adds a permission to a queue for a specific
 * principal. This allows for sharing access to the queue.
 * </p>
 * <p>
 * When you create a queue, you have full control access rights for the
 * queue. Only you (as owner of the queue) can grant or deny permissions
 * to the queue. For more information about these permissions, see Shared
 * Queues in the Amazon SQS Developer Guide.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#addPermission(AddPermissionRequest)
 */
public class AddPermissionRequest extends AmazonWebServiceRequest {

    /**
     * 
     */
    private String queueUrl;

    /**
     * 
     */
    private String label;

    /**
     * The AWS account number of the principal who will be given permission.
     * The principal must have an AWS account, but does not need to be signed
     * up for Amazon SQS.
     */
    private java.util.List<String> aWSAccountIds;

    /**
     * The action the client wants to allow for the specified principal.
     */
    private java.util.List<String> actions;

    /**
     * Default constructor for a new AddPermissionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AddPermissionRequest() {}
    
    /**
     * Constructs a new AddPermissionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl
     * @param label
     * @param aWSAccountIds The AWS account number of the principal who will
     * be given permission. The principal must have an AWS account, but does
     * not need to be signed up for Amazon SQS.
     * @param actions The action the client wants to allow for the specified
     * principal.
     */
    public AddPermissionRequest(String queueUrl, String label, java.util.List<String> aWSAccountIds, java.util.List<String> actions) {
        this.queueUrl = queueUrl;
        this.label = label;
        this.aWSAccountIds = aWSAccountIds;
        this.actions = actions;
    }
    
    /**
     * 
     *
     * @return 
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * 
     *
     * @param queueUrl 
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddPermissionRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * 
     *
     * @param label 
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param label 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddPermissionRequest withLabel(String label) {
        this.label = label;
        return this;
    }
    
    
    /**
     * The AWS account number of the principal who will be given permission.
     * The principal must have an AWS account, but does not need to be signed
     * up for Amazon SQS.
     *
     * @return The AWS account number of the principal who will be given permission.
     *         The principal must have an AWS account, but does not need to be signed
     *         up for Amazon SQS.
     */
    public java.util.List<String> getAWSAccountIds() {
        if (aWSAccountIds == null) {
            aWSAccountIds = new java.util.ArrayList<String>();
        }
        return aWSAccountIds;
    }
    
    /**
     * The AWS account number of the principal who will be given permission.
     * The principal must have an AWS account, but does not need to be signed
     * up for Amazon SQS.
     *
     * @param aWSAccountIds The AWS account number of the principal who will be given permission.
     *         The principal must have an AWS account, but does not need to be signed
     *         up for Amazon SQS.
     */
    public void setAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        java.util.List<String> aWSAccountIdsCopy = new java.util.ArrayList<String>();
        if (aWSAccountIds != null) {
            aWSAccountIdsCopy.addAll(aWSAccountIds);
        }
        this.aWSAccountIds = aWSAccountIdsCopy;
    }
    
    /**
     * The AWS account number of the principal who will be given permission.
     * The principal must have an AWS account, but does not need to be signed
     * up for Amazon SQS.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccountIds The AWS account number of the principal who will be given permission.
     *         The principal must have an AWS account, but does not need to be signed
     *         up for Amazon SQS.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddPermissionRequest withAWSAccountIds(String... aWSAccountIds) {
        for (String value : aWSAccountIds) {
            getAWSAccountIds().add(value);
        }
        return this;
    }
    
    /**
     * The AWS account number of the principal who will be given permission.
     * The principal must have an AWS account, but does not need to be signed
     * up for Amazon SQS.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccountIds The AWS account number of the principal who will be given permission.
     *         The principal must have an AWS account, but does not need to be signed
     *         up for Amazon SQS.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddPermissionRequest withAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        java.util.List<String> aWSAccountIdsCopy = new java.util.ArrayList<String>();
        if (aWSAccountIds != null) {
            aWSAccountIdsCopy.addAll(aWSAccountIds);
        }
        this.aWSAccountIds = aWSAccountIdsCopy;

        return this;
    }
    
    /**
     * The action the client wants to allow for the specified principal.
     *
     * @return The action the client wants to allow for the specified principal.
     */
    public java.util.List<String> getActions() {
        if (actions == null) {
            actions = new java.util.ArrayList<String>();
        }
        return actions;
    }
    
    /**
     * The action the client wants to allow for the specified principal.
     *
     * @param actions The action the client wants to allow for the specified principal.
     */
    public void setActions(java.util.Collection<String> actions) {
        java.util.List<String> actionsCopy = new java.util.ArrayList<String>();
        if (actions != null) {
            actionsCopy.addAll(actions);
        }
        this.actions = actionsCopy;
    }
    
    /**
     * The action the client wants to allow for the specified principal.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actions The action the client wants to allow for the specified principal.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddPermissionRequest withActions(String... actions) {
        for (String value : actions) {
            getActions().add(value);
        }
        return this;
    }
    
    /**
     * The action the client wants to allow for the specified principal.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actions The action the client wants to allow for the specified principal.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddPermissionRequest withActions(java.util.Collection<String> actions) {
        java.util.List<String> actionsCopy = new java.util.ArrayList<String>();
        if (actions != null) {
            actionsCopy.addAll(actions);
        }
        this.actions = actionsCopy;

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
        sb.append("QueueUrl: " + queueUrl + ", ");
        sb.append("Label: " + label + ", ");
        sb.append("AWSAccountIds: " + aWSAccountIds + ", ");
        sb.append("Actions: " + actions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    