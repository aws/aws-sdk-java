/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#addPermission(AddPermissionRequest) AddPermission operation}.
 * <p>
 * Adds a permission to a queue for a specific
 * <a href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"> principal </a>
 * . This allows for sharing access to the queue.
 * </p>
 * <p>
 * When you create a queue, you have full control access rights for the
 * queue. Only you (as owner of the queue) can grant or deny permissions
 * to the queue. For more information about these permissions, see
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"> Shared Queues </a>
 * in the <i>Amazon SQS Developer Guide</i> .
 * </p>
 * <p>
 * <b>NOTE:</b> AddPermission writes an Amazon SQS-generated policy. If
 * you want to write your own policy, use SetQueueAttributes to upload
 * your policy. For more information about writing your own policy, see
 * Using The Access Policy Language in the Amazon SQS Developer Guide.
 * </p>
 * <p>
 * <b>NOTE:</b>Some API actions take lists of parameters. These lists are
 * specified using the param.n notation. Values of n are integers
 * starting from 1. For example, a parameter list with two elements looks
 * like this:
 * </p>
 * <p>
 * <code>&Attribute.1=this</code>
 * </p>
 * <p>
 * <code>&Attribute.2=that</code>
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#addPermission(AddPermissionRequest)
 */
public class AddPermissionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The URL of the Amazon SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * The unique identification of the permission you're setting (e.g.,
     * <code>AliceSendMessage</code>). Constraints: Maximum 80 characters;
     * alphanumeric characters, hyphens (-), and underscores (_) are allowed.
     */
    private String label;

    /**
     * The AWS account number of the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>
     * who will be given permission. The principal must have an AWS account,
     * but does not need to be signed up for Amazon SQS. For information
     * about locating the AWS account identification, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AWSCredentials.html">Your
     * AWS Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> aWSAccountIds;

    /**
     * The action the client wants to allow for the specified principal. The
     * following are valid values: <code>* | SendMessage | ReceiveMessage |
     * DeleteMessage | ChangeMessageVisibility | GetQueueAttributes |
     * GetQueueUrl</code>. For more information about these actions, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html#PermissionTypes">Understanding
     * Permissions</a> in the <i>Amazon SQS Developer Guide</i>.
     * <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     * <code>ChangeMessageVisibility</code> for the <code>ActionName.n</code>
     * also grants permissions for the corresponding batch versions of those
     * actions: <code>SendMessageBatch</code>,
     * <code>DeleteMessageBatch</code>, and
     * <code>ChangeMessageVisibilityBatch</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> actions;

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
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     * @param label The unique identification of the permission you're
     * setting (e.g., <code>AliceSendMessage</code>). Constraints: Maximum 80
     * characters; alphanumeric characters, hyphens (-), and underscores (_)
     * are allowed.
     * @param aWSAccountIds The AWS account number of the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>
     * who will be given permission. The principal must have an AWS account,
     * but does not need to be signed up for Amazon SQS. For information
     * about locating the AWS account identification, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AWSCredentials.html">Your
     * AWS Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     * @param actions The action the client wants to allow for the specified
     * principal. The following are valid values: <code>* | SendMessage |
     * ReceiveMessage | DeleteMessage | ChangeMessageVisibility |
     * GetQueueAttributes | GetQueueUrl</code>. For more information about
     * these actions, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html#PermissionTypes">Understanding
     * Permissions</a> in the <i>Amazon SQS Developer Guide</i>.
     * <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     * <code>ChangeMessageVisibility</code> for the <code>ActionName.n</code>
     * also grants permissions for the corresponding batch versions of those
     * actions: <code>SendMessageBatch</code>,
     * <code>DeleteMessageBatch</code>, and
     * <code>ChangeMessageVisibilityBatch</code>.
     */
    public AddPermissionRequest(String queueUrl, String label, java.util.List<String> aWSAccountIds, java.util.List<String> actions) {
        setQueueUrl(queueUrl);
        setLabel(label);
        setAWSAccountIds(aWSAccountIds);
        setActions(actions);
    }

    /**
     * The URL of the Amazon SQS queue to take action on.
     *
     * @return The URL of the Amazon SQS queue to take action on.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * The URL of the Amazon SQS queue to take action on.
     *
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * The URL of the Amazon SQS queue to take action on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * The unique identification of the permission you're setting (e.g.,
     * <code>AliceSendMessage</code>). Constraints: Maximum 80 characters;
     * alphanumeric characters, hyphens (-), and underscores (_) are allowed.
     *
     * @return The unique identification of the permission you're setting (e.g.,
     *         <code>AliceSendMessage</code>). Constraints: Maximum 80 characters;
     *         alphanumeric characters, hyphens (-), and underscores (_) are allowed.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * The unique identification of the permission you're setting (e.g.,
     * <code>AliceSendMessage</code>). Constraints: Maximum 80 characters;
     * alphanumeric characters, hyphens (-), and underscores (_) are allowed.
     *
     * @param label The unique identification of the permission you're setting (e.g.,
     *         <code>AliceSendMessage</code>). Constraints: Maximum 80 characters;
     *         alphanumeric characters, hyphens (-), and underscores (_) are allowed.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * The unique identification of the permission you're setting (e.g.,
     * <code>AliceSendMessage</code>). Constraints: Maximum 80 characters;
     * alphanumeric characters, hyphens (-), and underscores (_) are allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param label The unique identification of the permission you're setting (e.g.,
     *         <code>AliceSendMessage</code>). Constraints: Maximum 80 characters;
     *         alphanumeric characters, hyphens (-), and underscores (_) are allowed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * The AWS account number of the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>
     * who will be given permission. The principal must have an AWS account,
     * but does not need to be signed up for Amazon SQS. For information
     * about locating the AWS account identification, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AWSCredentials.html">Your
     * AWS Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     *
     * @return The AWS account number of the <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>
     *         who will be given permission. The principal must have an AWS account,
     *         but does not need to be signed up for Amazon SQS. For information
     *         about locating the AWS account identification, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AWSCredentials.html">Your
     *         AWS Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     */
    public java.util.List<String> getAWSAccountIds() {
        if (aWSAccountIds == null) {
              aWSAccountIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              aWSAccountIds.setAutoConstruct(true);
        }
        return aWSAccountIds;
    }
    
    /**
     * The AWS account number of the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>
     * who will be given permission. The principal must have an AWS account,
     * but does not need to be signed up for Amazon SQS. For information
     * about locating the AWS account identification, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AWSCredentials.html">Your
     * AWS Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     *
     * @param aWSAccountIds The AWS account number of the <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>
     *         who will be given permission. The principal must have an AWS account,
     *         but does not need to be signed up for Amazon SQS. For information
     *         about locating the AWS account identification, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AWSCredentials.html">Your
     *         AWS Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     */
    public void setAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        if (aWSAccountIds == null) {
            this.aWSAccountIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> aWSAccountIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(aWSAccountIds.size());
        aWSAccountIdsCopy.addAll(aWSAccountIds);
        this.aWSAccountIds = aWSAccountIdsCopy;
    }
    
    /**
     * The AWS account number of the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>
     * who will be given permission. The principal must have an AWS account,
     * but does not need to be signed up for Amazon SQS. For information
     * about locating the AWS account identification, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AWSCredentials.html">Your
     * AWS Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccountIds The AWS account number of the <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>
     *         who will be given permission. The principal must have an AWS account,
     *         but does not need to be signed up for Amazon SQS. For information
     *         about locating the AWS account identification, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AWSCredentials.html">Your
     *         AWS Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withAWSAccountIds(String... aWSAccountIds) {
        if (getAWSAccountIds() == null) setAWSAccountIds(new java.util.ArrayList<String>(aWSAccountIds.length));
        for (String value : aWSAccountIds) {
            getAWSAccountIds().add(value);
        }
        return this;
    }
    
    /**
     * The AWS account number of the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>
     * who will be given permission. The principal must have an AWS account,
     * but does not need to be signed up for Amazon SQS. For information
     * about locating the AWS account identification, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AWSCredentials.html">Your
     * AWS Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccountIds The AWS account number of the <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>
     *         who will be given permission. The principal must have an AWS account,
     *         but does not need to be signed up for Amazon SQS. For information
     *         about locating the AWS account identification, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AWSCredentials.html">Your
     *         AWS Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        if (aWSAccountIds == null) {
            this.aWSAccountIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> aWSAccountIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(aWSAccountIds.size());
            aWSAccountIdsCopy.addAll(aWSAccountIds);
            this.aWSAccountIds = aWSAccountIdsCopy;
        }

        return this;
    }

    /**
     * The action the client wants to allow for the specified principal. The
     * following are valid values: <code>* | SendMessage | ReceiveMessage |
     * DeleteMessage | ChangeMessageVisibility | GetQueueAttributes |
     * GetQueueUrl</code>. For more information about these actions, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html#PermissionTypes">Understanding
     * Permissions</a> in the <i>Amazon SQS Developer Guide</i>.
     * <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     * <code>ChangeMessageVisibility</code> for the <code>ActionName.n</code>
     * also grants permissions for the corresponding batch versions of those
     * actions: <code>SendMessageBatch</code>,
     * <code>DeleteMessageBatch</code>, and
     * <code>ChangeMessageVisibilityBatch</code>.
     *
     * @return The action the client wants to allow for the specified principal. The
     *         following are valid values: <code>* | SendMessage | ReceiveMessage |
     *         DeleteMessage | ChangeMessageVisibility | GetQueueAttributes |
     *         GetQueueUrl</code>. For more information about these actions, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html#PermissionTypes">Understanding
     *         Permissions</a> in the <i>Amazon SQS Developer Guide</i>.
     *         <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     *         <code>ChangeMessageVisibility</code> for the <code>ActionName.n</code>
     *         also grants permissions for the corresponding batch versions of those
     *         actions: <code>SendMessageBatch</code>,
     *         <code>DeleteMessageBatch</code>, and
     *         <code>ChangeMessageVisibilityBatch</code>.
     */
    public java.util.List<String> getActions() {
        if (actions == null) {
              actions = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              actions.setAutoConstruct(true);
        }
        return actions;
    }
    
    /**
     * The action the client wants to allow for the specified principal. The
     * following are valid values: <code>* | SendMessage | ReceiveMessage |
     * DeleteMessage | ChangeMessageVisibility | GetQueueAttributes |
     * GetQueueUrl</code>. For more information about these actions, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html#PermissionTypes">Understanding
     * Permissions</a> in the <i>Amazon SQS Developer Guide</i>.
     * <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     * <code>ChangeMessageVisibility</code> for the <code>ActionName.n</code>
     * also grants permissions for the corresponding batch versions of those
     * actions: <code>SendMessageBatch</code>,
     * <code>DeleteMessageBatch</code>, and
     * <code>ChangeMessageVisibilityBatch</code>.
     *
     * @param actions The action the client wants to allow for the specified principal. The
     *         following are valid values: <code>* | SendMessage | ReceiveMessage |
     *         DeleteMessage | ChangeMessageVisibility | GetQueueAttributes |
     *         GetQueueUrl</code>. For more information about these actions, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html#PermissionTypes">Understanding
     *         Permissions</a> in the <i>Amazon SQS Developer Guide</i>.
     *         <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     *         <code>ChangeMessageVisibility</code> for the <code>ActionName.n</code>
     *         also grants permissions for the corresponding batch versions of those
     *         actions: <code>SendMessageBatch</code>,
     *         <code>DeleteMessageBatch</code>, and
     *         <code>ChangeMessageVisibilityBatch</code>.
     */
    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> actionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(actions.size());
        actionsCopy.addAll(actions);
        this.actions = actionsCopy;
    }
    
    /**
     * The action the client wants to allow for the specified principal. The
     * following are valid values: <code>* | SendMessage | ReceiveMessage |
     * DeleteMessage | ChangeMessageVisibility | GetQueueAttributes |
     * GetQueueUrl</code>. For more information about these actions, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html#PermissionTypes">Understanding
     * Permissions</a> in the <i>Amazon SQS Developer Guide</i>.
     * <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     * <code>ChangeMessageVisibility</code> for the <code>ActionName.n</code>
     * also grants permissions for the corresponding batch versions of those
     * actions: <code>SendMessageBatch</code>,
     * <code>DeleteMessageBatch</code>, and
     * <code>ChangeMessageVisibilityBatch</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actions The action the client wants to allow for the specified principal. The
     *         following are valid values: <code>* | SendMessage | ReceiveMessage |
     *         DeleteMessage | ChangeMessageVisibility | GetQueueAttributes |
     *         GetQueueUrl</code>. For more information about these actions, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html#PermissionTypes">Understanding
     *         Permissions</a> in the <i>Amazon SQS Developer Guide</i>.
     *         <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     *         <code>ChangeMessageVisibility</code> for the <code>ActionName.n</code>
     *         also grants permissions for the corresponding batch versions of those
     *         actions: <code>SendMessageBatch</code>,
     *         <code>DeleteMessageBatch</code>, and
     *         <code>ChangeMessageVisibilityBatch</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withActions(String... actions) {
        if (getActions() == null) setActions(new java.util.ArrayList<String>(actions.length));
        for (String value : actions) {
            getActions().add(value);
        }
        return this;
    }
    
    /**
     * The action the client wants to allow for the specified principal. The
     * following are valid values: <code>* | SendMessage | ReceiveMessage |
     * DeleteMessage | ChangeMessageVisibility | GetQueueAttributes |
     * GetQueueUrl</code>. For more information about these actions, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html#PermissionTypes">Understanding
     * Permissions</a> in the <i>Amazon SQS Developer Guide</i>.
     * <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     * <code>ChangeMessageVisibility</code> for the <code>ActionName.n</code>
     * also grants permissions for the corresponding batch versions of those
     * actions: <code>SendMessageBatch</code>,
     * <code>DeleteMessageBatch</code>, and
     * <code>ChangeMessageVisibilityBatch</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actions The action the client wants to allow for the specified principal. The
     *         following are valid values: <code>* | SendMessage | ReceiveMessage |
     *         DeleteMessage | ChangeMessageVisibility | GetQueueAttributes |
     *         GetQueueUrl</code>. For more information about these actions, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html#PermissionTypes">Understanding
     *         Permissions</a> in the <i>Amazon SQS Developer Guide</i>.
     *         <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or
     *         <code>ChangeMessageVisibility</code> for the <code>ActionName.n</code>
     *         also grants permissions for the corresponding batch versions of those
     *         actions: <code>SendMessageBatch</code>,
     *         <code>DeleteMessageBatch</code>, and
     *         <code>ChangeMessageVisibilityBatch</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> actionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(actions.size());
            actionsCopy.addAll(actions);
            this.actions = actionsCopy;
        }

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
        if (getLabel() != null) sb.append("Label: " + getLabel() + ",");
        if (getAWSAccountIds() != null) sb.append("AWSAccountIds: " + getAWSAccountIds() + ",");
        if (getActions() != null) sb.append("Actions: " + getActions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode()); 
        hashCode = prime * hashCode + ((getAWSAccountIds() == null) ? 0 : getAWSAccountIds().hashCode()); 
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddPermissionRequest == false) return false;
        AddPermissionRequest other = (AddPermissionRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.getLabel() == null ^ this.getLabel() == null) return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false) return false; 
        if (other.getAWSAccountIds() == null ^ this.getAWSAccountIds() == null) return false;
        if (other.getAWSAccountIds() != null && other.getAWSAccountIds().equals(this.getAWSAccountIds()) == false) return false; 
        if (other.getActions() == null ^ this.getActions() == null) return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false) return false; 
        return true;
    }
    
}
    