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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateOpsItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOpsItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the OpsItem.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Operational data is custom data that provides useful reference details about the OpsItem. For example, you can
     * specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter
     * operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size
     * of 20 KB.
     * </p>
     * <important>
     * <p>
     * Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.
     * </p>
     * </important>
     * <p>
     * You can choose to make the data searchable by other users in the account or you can restrict search access.
     * Searchable data means that all users with access to the OpsItem Overview page (as provided by the
     * <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is not
     * searchable is only viewable by users who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API
     * action).
     * </p>
     * <p>
     * Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request. Use the
     * <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the OpsItem. To view
     * AWS CLI example commands that use these keys, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     * >Creating OpsItems Manually</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private java.util.Map<String, OpsItemDataValue> operationalData;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or
     * changed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OpsItemNotification> notifications;
    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the system.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can
     * include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RelatedOpsItem> relatedOpsItems;
    /**
     * <p>
     * The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager.
     * </p>
     */
    private String source;
    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted resource.
     * </p>
     */
    private String title;
    /**
     * <p>
     * Optional metadata that you assign to a resource. You can restrict access to OpsItems by using an inline IAM
     * policy that specifies tags. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html#OpsCenter-getting-started-user-permissions"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Tags use a key-value pair. For example:
     * </p>
     * <p>
     * <code>Key=Department,Value=Finance</code>
     * </p>
     * <note>
     * <p>
     * To add tags to an existing OpsItem, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Specify a category to assign to an OpsItem.
     * </p>
     */
    private String category;
    /**
     * <p>
     * Specify a severity to assign to an OpsItem.
     * </p>
     */
    private String severity;

    /**
     * <p>
     * Information about the OpsItem.
     * </p>
     * 
     * @param description
     *        Information about the OpsItem.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Information about the OpsItem.
     * </p>
     * 
     * @return Information about the OpsItem.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Information about the OpsItem.
     * </p>
     * 
     * @param description
     *        Information about the OpsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Operational data is custom data that provides useful reference details about the OpsItem. For example, you can
     * specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter
     * operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size
     * of 20 KB.
     * </p>
     * <important>
     * <p>
     * Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.
     * </p>
     * </important>
     * <p>
     * You can choose to make the data searchable by other users in the account or you can restrict search access.
     * Searchable data means that all users with access to the OpsItem Overview page (as provided by the
     * <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is not
     * searchable is only viewable by users who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API
     * action).
     * </p>
     * <p>
     * Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request. Use the
     * <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the OpsItem. To view
     * AWS CLI example commands that use these keys, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     * >Creating OpsItems Manually</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return Operational data is custom data that provides useful reference details about the OpsItem. For example,
     *         you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You
     *         enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has
     *         a maximum size of 20 KB.</p> <important>
     *         <p>
     *         Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws,
     *         /amzn, /ssm.
     *         </p>
     *         </important>
     *         <p>
     *         You can choose to make the data searchable by other users in the account or you can restrict search
     *         access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the
     *         <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is
     *         not searchable is only viewable by users who have access to the OpsItem (as provided by the
     *         <a>GetOpsItem</a> API action).
     *         </p>
     *         <p>
     *         Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request.
     *         Use the <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the
     *         OpsItem. To view AWS CLI example commands that use these keys, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     *         >Creating OpsItems Manually</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public java.util.Map<String, OpsItemDataValue> getOperationalData() {
        return operationalData;
    }

    /**
     * <p>
     * Operational data is custom data that provides useful reference details about the OpsItem. For example, you can
     * specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter
     * operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size
     * of 20 KB.
     * </p>
     * <important>
     * <p>
     * Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.
     * </p>
     * </important>
     * <p>
     * You can choose to make the data searchable by other users in the account or you can restrict search access.
     * Searchable data means that all users with access to the OpsItem Overview page (as provided by the
     * <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is not
     * searchable is only viewable by users who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API
     * action).
     * </p>
     * <p>
     * Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request. Use the
     * <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the OpsItem. To view
     * AWS CLI example commands that use these keys, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     * >Creating OpsItems Manually</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param operationalData
     *        Operational data is custom data that provides useful reference details about the OpsItem. For example, you
     *        can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You
     *        enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a
     *        maximum size of 20 KB.</p> <important>
     *        <p>
     *        Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn,
     *        /ssm.
     *        </p>
     *        </important>
     *        <p>
     *        You can choose to make the data searchable by other users in the account or you can restrict search
     *        access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the
     *        <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is
     *        not searchable is only viewable by users who have access to the OpsItem (as provided by the
     *        <a>GetOpsItem</a> API action).
     *        </p>
     *        <p>
     *        Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request.
     *        Use the <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the
     *        OpsItem. To view AWS CLI example commands that use these keys, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     *        >Creating OpsItems Manually</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public void setOperationalData(java.util.Map<String, OpsItemDataValue> operationalData) {
        this.operationalData = operationalData;
    }

    /**
     * <p>
     * Operational data is custom data that provides useful reference details about the OpsItem. For example, you can
     * specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter
     * operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size
     * of 20 KB.
     * </p>
     * <important>
     * <p>
     * Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.
     * </p>
     * </important>
     * <p>
     * You can choose to make the data searchable by other users in the account or you can restrict search access.
     * Searchable data means that all users with access to the OpsItem Overview page (as provided by the
     * <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is not
     * searchable is only viewable by users who have access to the OpsItem (as provided by the <a>GetOpsItem</a> API
     * action).
     * </p>
     * <p>
     * Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request. Use the
     * <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the OpsItem. To view
     * AWS CLI example commands that use these keys, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     * >Creating OpsItems Manually</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param operationalData
     *        Operational data is custom data that provides useful reference details about the OpsItem. For example, you
     *        can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You
     *        enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a
     *        maximum size of 20 KB.</p> <important>
     *        <p>
     *        Operational data keys <i>can't</i> begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn,
     *        /ssm.
     *        </p>
     *        </important>
     *        <p>
     *        You can choose to make the data searchable by other users in the account or you can restrict search
     *        access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the
     *        <a>DescribeOpsItems</a> API action) can view and search on the specified data. Operational data that is
     *        not searchable is only viewable by users who have access to the OpsItem (as provided by the
     *        <a>GetOpsItem</a> API action).
     *        </p>
     *        <p>
     *        Use the <code>/aws/resources</code> key in OperationalData to specify a related resource in the request.
     *        Use the <code>/aws/automations</code> key in OperationalData to associate an Automation runbook with the
     *        OpsItem. To view AWS CLI example commands that use these keys, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-creating-OpsItems.html#OpsCenter-manually-create-OpsItems"
     *        >Creating OpsItems Manually</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withOperationalData(java.util.Map<String, OpsItemDataValue> operationalData) {
        setOperationalData(operationalData);
        return this;
    }

    /**
     * Add a single OperationalData entry
     *
     * @see CreateOpsItemRequest#withOperationalData
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest addOperationalDataEntry(String key, OpsItemDataValue value) {
        if (null == this.operationalData) {
            this.operationalData = new java.util.HashMap<String, OpsItemDataValue>();
        }
        if (this.operationalData.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.operationalData.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OperationalData.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest clearOperationalDataEntries() {
        this.operationalData = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or
     * changed.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited
     *         or changed.
     */

    public java.util.List<OpsItemNotification> getNotifications() {
        if (notifications == null) {
            notifications = new com.amazonaws.internal.SdkInternalList<OpsItemNotification>();
        }
        return notifications;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or
     * changed.
     * </p>
     * 
     * @param notifications
     *        The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or
     *        changed.
     */

    public void setNotifications(java.util.Collection<OpsItemNotification> notifications) {
        if (notifications == null) {
            this.notifications = null;
            return;
        }

        this.notifications = new com.amazonaws.internal.SdkInternalList<OpsItemNotification>(notifications);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or
     * changed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotifications(java.util.Collection)} or {@link #withNotifications(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param notifications
     *        The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or
     *        changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withNotifications(OpsItemNotification... notifications) {
        if (this.notifications == null) {
            setNotifications(new com.amazonaws.internal.SdkInternalList<OpsItemNotification>(notifications.length));
        }
        for (OpsItemNotification ele : notifications) {
            this.notifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or
     * changed.
     * </p>
     * 
     * @param notifications
     *        The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or
     *        changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withNotifications(java.util.Collection<OpsItemNotification> notifications) {
        setNotifications(notifications);
        return this;
    }

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the system.
     * </p>
     * 
     * @param priority
     *        The importance of this OpsItem in relation to other OpsItems in the system.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the system.
     * </p>
     * 
     * @return The importance of this OpsItem in relation to other OpsItems in the system.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the system.
     * </p>
     * 
     * @param priority
     *        The importance of this OpsItem in relation to other OpsItems in the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can
     * include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
     * </p>
     * 
     * @return One or more OpsItems that share something in common with the current OpsItems. For example, related
     *         OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the
     *         impacted resource.
     */

    public java.util.List<RelatedOpsItem> getRelatedOpsItems() {
        if (relatedOpsItems == null) {
            relatedOpsItems = new com.amazonaws.internal.SdkInternalList<RelatedOpsItem>();
        }
        return relatedOpsItems;
    }

    /**
     * <p>
     * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can
     * include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
     * </p>
     * 
     * @param relatedOpsItems
     *        One or more OpsItems that share something in common with the current OpsItems. For example, related
     *        OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the
     *        impacted resource.
     */

    public void setRelatedOpsItems(java.util.Collection<RelatedOpsItem> relatedOpsItems) {
        if (relatedOpsItems == null) {
            this.relatedOpsItems = null;
            return;
        }

        this.relatedOpsItems = new com.amazonaws.internal.SdkInternalList<RelatedOpsItem>(relatedOpsItems);
    }

    /**
     * <p>
     * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can
     * include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedOpsItems(java.util.Collection)} or {@link #withRelatedOpsItems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param relatedOpsItems
     *        One or more OpsItems that share something in common with the current OpsItems. For example, related
     *        OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the
     *        impacted resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withRelatedOpsItems(RelatedOpsItem... relatedOpsItems) {
        if (this.relatedOpsItems == null) {
            setRelatedOpsItems(new com.amazonaws.internal.SdkInternalList<RelatedOpsItem>(relatedOpsItems.length));
        }
        for (RelatedOpsItem ele : relatedOpsItems) {
            this.relatedOpsItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can
     * include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
     * </p>
     * 
     * @param relatedOpsItems
     *        One or more OpsItems that share something in common with the current OpsItems. For example, related
     *        OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the
     *        impacted resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withRelatedOpsItems(java.util.Collection<RelatedOpsItem> relatedOpsItems) {
        setRelatedOpsItems(relatedOpsItems);
        return this;
    }

    /**
     * <p>
     * The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager.
     * </p>
     * 
     * @param source
     *        The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager.
     * </p>
     * 
     * @return The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager.
     * </p>
     * 
     * @param source
     *        The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted resource.
     * </p>
     * 
     * @param title
     *        A short heading that describes the nature of the OpsItem and the impacted resource.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted resource.
     * </p>
     * 
     * @return A short heading that describes the nature of the OpsItem and the impacted resource.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted resource.
     * </p>
     * 
     * @param title
     *        A short heading that describes the nature of the OpsItem and the impacted resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can restrict access to OpsItems by using an inline IAM
     * policy that specifies tags. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html#OpsCenter-getting-started-user-permissions"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Tags use a key-value pair. For example:
     * </p>
     * <p>
     * <code>Key=Department,Value=Finance</code>
     * </p>
     * <note>
     * <p>
     * To add tags to an existing OpsItem, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * 
     * @return Optional metadata that you assign to a resource. You can restrict access to OpsItems by using an inline
     *         IAM policy that specifies tags. For more information, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html#OpsCenter-getting-started-user-permissions"
     *         >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *         <p>
     *         Tags use a key-value pair. For example:
     *         </p>
     *         <p>
     *         <code>Key=Department,Value=Finance</code>
     *         </p>
     *         <note>
     *         <p>
     *         To add tags to an existing OpsItem, use the <a>AddTagsToResource</a> action.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can restrict access to OpsItems by using an inline IAM
     * policy that specifies tags. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html#OpsCenter-getting-started-user-permissions"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Tags use a key-value pair. For example:
     * </p>
     * <p>
     * <code>Key=Department,Value=Finance</code>
     * </p>
     * <note>
     * <p>
     * To add tags to an existing OpsItem, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can restrict access to OpsItems by using an inline
     *        IAM policy that specifies tags. For more information, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html#OpsCenter-getting-started-user-permissions"
     *        >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *        <p>
     *        Tags use a key-value pair. For example:
     *        </p>
     *        <p>
     *        <code>Key=Department,Value=Finance</code>
     *        </p>
     *        <note>
     *        <p>
     *        To add tags to an existing OpsItem, use the <a>AddTagsToResource</a> action.
     *        </p>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can restrict access to OpsItems by using an inline IAM
     * policy that specifies tags. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html#OpsCenter-getting-started-user-permissions"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Tags use a key-value pair. For example:
     * </p>
     * <p>
     * <code>Key=Department,Value=Finance</code>
     * </p>
     * <note>
     * <p>
     * To add tags to an existing OpsItem, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can restrict access to OpsItems by using an inline
     *        IAM policy that specifies tags. For more information, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html#OpsCenter-getting-started-user-permissions"
     *        >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *        <p>
     *        Tags use a key-value pair. For example:
     *        </p>
     *        <p>
     *        <code>Key=Department,Value=Finance</code>
     *        </p>
     *        <note>
     *        <p>
     *        To add tags to an existing OpsItem, use the <a>AddTagsToResource</a> action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can restrict access to OpsItems by using an inline IAM
     * policy that specifies tags. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html#OpsCenter-getting-started-user-permissions"
     * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Tags use a key-value pair. For example:
     * </p>
     * <p>
     * <code>Key=Department,Value=Finance</code>
     * </p>
     * <note>
     * <p>
     * To add tags to an existing OpsItem, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can restrict access to OpsItems by using an inline
     *        IAM policy that specifies tags. For more information, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html#OpsCenter-getting-started-user-permissions"
     *        >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *        <p>
     *        Tags use a key-value pair. For example:
     *        </p>
     *        <p>
     *        <code>Key=Department,Value=Finance</code>
     *        </p>
     *        <note>
     *        <p>
     *        To add tags to an existing OpsItem, use the <a>AddTagsToResource</a> action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specify a category to assign to an OpsItem.
     * </p>
     * 
     * @param category
     *        Specify a category to assign to an OpsItem.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * Specify a category to assign to an OpsItem.
     * </p>
     * 
     * @return Specify a category to assign to an OpsItem.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * Specify a category to assign to an OpsItem.
     * </p>
     * 
     * @param category
     *        Specify a category to assign to an OpsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * Specify a severity to assign to an OpsItem.
     * </p>
     * 
     * @param severity
     *        Specify a severity to assign to an OpsItem.
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * Specify a severity to assign to an OpsItem.
     * </p>
     * 
     * @return Specify a severity to assign to an OpsItem.
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * Specify a severity to assign to an OpsItem.
     * </p>
     * 
     * @param severity
     *        Specify a severity to assign to an OpsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpsItemRequest withSeverity(String severity) {
        setSeverity(severity);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOperationalData() != null)
            sb.append("OperationalData: ").append(getOperationalData()).append(",");
        if (getNotifications() != null)
            sb.append("Notifications: ").append(getNotifications()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getRelatedOpsItems() != null)
            sb.append("RelatedOpsItems: ").append(getRelatedOpsItems()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOpsItemRequest == false)
            return false;
        CreateOpsItemRequest other = (CreateOpsItemRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOperationalData() == null ^ this.getOperationalData() == null)
            return false;
        if (other.getOperationalData() != null && other.getOperationalData().equals(this.getOperationalData()) == false)
            return false;
        if (other.getNotifications() == null ^ this.getNotifications() == null)
            return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getRelatedOpsItems() == null ^ this.getRelatedOpsItems() == null)
            return false;
        if (other.getRelatedOpsItems() != null && other.getRelatedOpsItems().equals(this.getRelatedOpsItems()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOperationalData() == null) ? 0 : getOperationalData().hashCode());
        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRelatedOpsItems() == null) ? 0 : getRelatedOpsItems().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        return hashCode;
    }

    @Override
    public CreateOpsItemRequest clone() {
        return (CreateOpsItemRequest) super.clone();
    }

}
