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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/AddPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of the Amazon SQS queue to which permissions are added.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * The unique identification of the permission you're setting (for example, <code>AliceSendMessage</code>). Maximum
     * 80 characters. Allowed characters include alphanumeric characters, hyphens (<code>-</code>), and underscores (
     * <code>_</code>).
     * </p>
     */
    private String label;
    /**
     * <p>
     * The AWS account number of the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a> who is given permission. The
     * principal must have an AWS account, but does not need to be signed up for Amazon SQS. For information about
     * locating the AWS account identification, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     * >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> aWSAccountIds;
    /**
     * <p>
     * The action the client wants to allow for the specified principal. Valid values: the name of any action or
     * <code>*</code>.
     * </p>
     * <p>
     * For more information about these actions, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     * >Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a> in the <i>Amazon Simple
     * Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code> for
     * <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those actions:
     * <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and <code>ChangeMessageVisibilityBatch</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> actions;

    /**
     * Default constructor for AddPermissionRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public AddPermissionRequest() {
    }

    /**
     * Constructs a new AddPermissionRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to which permissions are added.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     * @param label
     *        The unique identification of the permission you're setting (for example, <code>AliceSendMessage</code>).
     *        Maximum 80 characters. Allowed characters include alphanumeric characters, hyphens (<code>-</code>), and
     *        underscores (<code>_</code>).
     * @param aWSAccountIds
     *        The AWS account number of the <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a> who is given
     *        permission. The principal must have an AWS account, but does not need to be signed up for Amazon SQS. For
     *        information about locating the AWS account identification, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     *        >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @param actions
     *        The action the client wants to allow for the specified principal. Valid values: the name of any action or
     *        <code>*</code>.
     *        </p>
     *        <p>
     *        For more information about these actions, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     *        >Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a> in the <i>Amazon
     *        Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code>
     *        for <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those
     *        actions: <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and
     *        <code>ChangeMessageVisibilityBatch</code>.
     */
    public AddPermissionRequest(String queueUrl, String label, java.util.List<String> aWSAccountIds, java.util.List<String> actions) {
        setQueueUrl(queueUrl);
        setLabel(label);
        setAWSAccountIds(aWSAccountIds);
        setActions(actions);
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to which permissions are added.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to which permissions are added.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to which permissions are added.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @return The URL of the Amazon SQS queue to which permissions are added.</p>
     *         <p>
     *         Queue URLs and names are case-sensitive.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to which permissions are added.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to which permissions are added.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * The unique identification of the permission you're setting (for example, <code>AliceSendMessage</code>). Maximum
     * 80 characters. Allowed characters include alphanumeric characters, hyphens (<code>-</code>), and underscores (
     * <code>_</code>).
     * </p>
     * 
     * @param label
     *        The unique identification of the permission you're setting (for example, <code>AliceSendMessage</code>).
     *        Maximum 80 characters. Allowed characters include alphanumeric characters, hyphens (<code>-</code>), and
     *        underscores (<code>_</code>).
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The unique identification of the permission you're setting (for example, <code>AliceSendMessage</code>). Maximum
     * 80 characters. Allowed characters include alphanumeric characters, hyphens (<code>-</code>), and underscores (
     * <code>_</code>).
     * </p>
     * 
     * @return The unique identification of the permission you're setting (for example, <code>AliceSendMessage</code>).
     *         Maximum 80 characters. Allowed characters include alphanumeric characters, hyphens (<code>-</code>), and
     *         underscores (<code>_</code>).
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The unique identification of the permission you're setting (for example, <code>AliceSendMessage</code>). Maximum
     * 80 characters. Allowed characters include alphanumeric characters, hyphens (<code>-</code>), and underscores (
     * <code>_</code>).
     * </p>
     * 
     * @param label
     *        The unique identification of the permission you're setting (for example, <code>AliceSendMessage</code>).
     *        Maximum 80 characters. Allowed characters include alphanumeric characters, hyphens (<code>-</code>), and
     *        underscores (<code>_</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The AWS account number of the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a> who is given permission. The
     * principal must have an AWS account, but does not need to be signed up for Amazon SQS. For information about
     * locating the AWS account identification, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     * >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @return The AWS account number of the <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a> who is given
     *         permission. The principal must have an AWS account, but does not need to be signed up for Amazon SQS. For
     *         information about locating the AWS account identification, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     *         >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */

    public java.util.List<String> getAWSAccountIds() {
        if (aWSAccountIds == null) {
            aWSAccountIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return aWSAccountIds;
    }

    /**
     * <p>
     * The AWS account number of the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a> who is given permission. The
     * principal must have an AWS account, but does not need to be signed up for Amazon SQS. For information about
     * locating the AWS account identification, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     * >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param aWSAccountIds
     *        The AWS account number of the <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a> who is given
     *        permission. The principal must have an AWS account, but does not need to be signed up for Amazon SQS. For
     *        information about locating the AWS account identification, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     *        >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */

    public void setAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        if (aWSAccountIds == null) {
            this.aWSAccountIds = null;
            return;
        }

        this.aWSAccountIds = new com.amazonaws.internal.SdkInternalList<String>(aWSAccountIds);
    }

    /**
     * <p>
     * The AWS account number of the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a> who is given permission. The
     * principal must have an AWS account, but does not need to be signed up for Amazon SQS. For information about
     * locating the AWS account identification, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     * >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAWSAccountIds(java.util.Collection)} or {@link #withAWSAccountIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param aWSAccountIds
     *        The AWS account number of the <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a> who is given
     *        permission. The principal must have an AWS account, but does not need to be signed up for Amazon SQS. For
     *        information about locating the AWS account identification, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     *        >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withAWSAccountIds(String... aWSAccountIds) {
        if (this.aWSAccountIds == null) {
            setAWSAccountIds(new com.amazonaws.internal.SdkInternalList<String>(aWSAccountIds.length));
        }
        for (String ele : aWSAccountIds) {
            this.aWSAccountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS account number of the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a> who is given permission. The
     * principal must have an AWS account, but does not need to be signed up for Amazon SQS. For information about
     * locating the AWS account identification, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     * >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param aWSAccountIds
     *        The AWS account number of the <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a> who is given
     *        permission. The principal must have an AWS account, but does not need to be signed up for Amazon SQS. For
     *        information about locating the AWS account identification, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication"
     *        >Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withAWSAccountIds(java.util.Collection<String> aWSAccountIds) {
        setAWSAccountIds(aWSAccountIds);
        return this;
    }

    /**
     * <p>
     * The action the client wants to allow for the specified principal. Valid values: the name of any action or
     * <code>*</code>.
     * </p>
     * <p>
     * For more information about these actions, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     * >Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a> in the <i>Amazon Simple
     * Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code> for
     * <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those actions:
     * <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and <code>ChangeMessageVisibilityBatch</code>.
     * </p>
     * 
     * @return The action the client wants to allow for the specified principal. Valid values: the name of any action or
     *         <code>*</code>.</p>
     *         <p>
     *         For more information about these actions, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     *         >Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a> in the
     *         <i>Amazon Simple Queue Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code>
     *         for <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those
     *         actions: <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and
     *         <code>ChangeMessageVisibilityBatch</code>.
     */

    public java.util.List<String> getActions() {
        if (actions == null) {
            actions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return actions;
    }

    /**
     * <p>
     * The action the client wants to allow for the specified principal. Valid values: the name of any action or
     * <code>*</code>.
     * </p>
     * <p>
     * For more information about these actions, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     * >Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a> in the <i>Amazon Simple
     * Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code> for
     * <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those actions:
     * <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and <code>ChangeMessageVisibilityBatch</code>.
     * </p>
     * 
     * @param actions
     *        The action the client wants to allow for the specified principal. Valid values: the name of any action or
     *        <code>*</code>.</p>
     *        <p>
     *        For more information about these actions, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     *        >Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a> in the <i>Amazon
     *        Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code>
     *        for <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those
     *        actions: <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and
     *        <code>ChangeMessageVisibilityBatch</code>.
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new com.amazonaws.internal.SdkInternalList<String>(actions);
    }

    /**
     * <p>
     * The action the client wants to allow for the specified principal. Valid values: the name of any action or
     * <code>*</code>.
     * </p>
     * <p>
     * For more information about these actions, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     * >Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a> in the <i>Amazon Simple
     * Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code> for
     * <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those actions:
     * <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and <code>ChangeMessageVisibilityBatch</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The action the client wants to allow for the specified principal. Valid values: the name of any action or
     *        <code>*</code>.</p>
     *        <p>
     *        For more information about these actions, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     *        >Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a> in the <i>Amazon
     *        Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code>
     *        for <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those
     *        actions: <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and
     *        <code>ChangeMessageVisibilityBatch</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withActions(String... actions) {
        if (this.actions == null) {
            setActions(new com.amazonaws.internal.SdkInternalList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The action the client wants to allow for the specified principal. Valid values: the name of any action or
     * <code>*</code>.
     * </p>
     * <p>
     * For more information about these actions, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     * >Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a> in the <i>Amazon Simple
     * Queue Service Developer Guide</i>.
     * </p>
     * <p>
     * Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code> for
     * <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those actions:
     * <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and <code>ChangeMessageVisibilityBatch</code>.
     * </p>
     * 
     * @param actions
     *        The action the client wants to allow for the specified principal. Valid values: the name of any action or
     *        <code>*</code>.</p>
     *        <p>
     *        For more information about these actions, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html"
     *        >Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a> in the <i>Amazon
     *        Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code>
     *        for <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those
     *        actions: <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and
     *        <code>ChangeMessageVisibilityBatch</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withActions(java.util.Collection<String> actions) {
        setActions(actions);
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
            sb.append("Label: ").append(getLabel()).append(",");
        if (getAWSAccountIds() != null)
            sb.append("AWSAccountIds: ").append(getAWSAccountIds()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddPermissionRequest == false)
            return false;
        AddPermissionRequest other = (AddPermissionRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getAWSAccountIds() == null ^ this.getAWSAccountIds() == null)
            return false;
        if (other.getAWSAccountIds() != null && other.getAWSAccountIds().equals(this.getAWSAccountIds()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
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
    public AddPermissionRequest clone() {
        return (AddPermissionRequest) super.clone();
    }

}
