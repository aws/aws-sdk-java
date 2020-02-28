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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Operations engineers and IT professionals use OpsCenter to view, investigate, and remediate operational issues
 * impacting the performance and health of their AWS resources. For more information, see <a
 * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">AWS Systems Manager OpsCenter</a>
 * in the <i>AWS Systems Manager User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/OpsItem" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the AWS account that created the OpsItem.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The date and time the OpsItem was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The OpsItem description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the AWS account that last updated the OpsItem.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The date and time the OpsItem was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;
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
     * One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can
     * include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RelatedOpsItem> relatedOpsItems;
    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html"
     * >Editing OpsItem Details</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     */
    private String opsItemId;
    /**
     * <p>
     * The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.
     * </p>
     */
    private String version;
    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted resource.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager. The impacted resource is a subset of
     * source.
     * </p>
     */
    private String source;
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
     * An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The severity of the OpsItem. Severity options range from 1 to 4.
     * </p>
     */
    private String severity;

    /**
     * <p>
     * The ARN of the AWS account that created the OpsItem.
     * </p>
     * 
     * @param createdBy
     *        The ARN of the AWS account that created the OpsItem.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The ARN of the AWS account that created the OpsItem.
     * </p>
     * 
     * @return The ARN of the AWS account that created the OpsItem.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The ARN of the AWS account that created the OpsItem.
     * </p>
     * 
     * @param createdBy
     *        The ARN of the AWS account that created the OpsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time the OpsItem was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the OpsItem was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the OpsItem was created.
     * </p>
     * 
     * @return The date and time the OpsItem was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time the OpsItem was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the OpsItem was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The OpsItem description.
     * </p>
     * 
     * @param description
     *        The OpsItem description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The OpsItem description.
     * </p>
     * 
     * @return The OpsItem description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The OpsItem description.
     * </p>
     * 
     * @param description
     *        The OpsItem description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS account that last updated the OpsItem.
     * </p>
     * 
     * @param lastModifiedBy
     *        The ARN of the AWS account that last updated the OpsItem.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The ARN of the AWS account that last updated the OpsItem.
     * </p>
     * 
     * @return The ARN of the AWS account that last updated the OpsItem.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The ARN of the AWS account that last updated the OpsItem.
     * </p>
     * 
     * @param lastModifiedBy
     *        The ARN of the AWS account that last updated the OpsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The date and time the OpsItem was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the OpsItem was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the OpsItem was last updated.
     * </p>
     * 
     * @return The date and time the OpsItem was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the OpsItem was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the OpsItem was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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

    public OpsItem withNotifications(OpsItemNotification... notifications) {
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

    public OpsItem withNotifications(java.util.Collection<OpsItemNotification> notifications) {
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

    public OpsItem withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can
     * include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
     * </p>
     * 
     * @return One or more OpsItems that share something in common with the current OpsItem. For example, related
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
     * One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can
     * include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
     * </p>
     * 
     * @param relatedOpsItems
     *        One or more OpsItems that share something in common with the current OpsItem. For example, related
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
     * One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can
     * include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedOpsItems(java.util.Collection)} or {@link #withRelatedOpsItems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param relatedOpsItems
     *        One or more OpsItems that share something in common with the current OpsItem. For example, related
     *        OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the
     *        impacted resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem withRelatedOpsItems(RelatedOpsItem... relatedOpsItems) {
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
     * One or more OpsItems that share something in common with the current OpsItem. For example, related OpsItems can
     * include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
     * </p>
     * 
     * @param relatedOpsItems
     *        One or more OpsItems that share something in common with the current OpsItem. For example, related
     *        OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the
     *        impacted resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem withRelatedOpsItems(java.util.Collection<RelatedOpsItem> relatedOpsItems) {
        setRelatedOpsItems(relatedOpsItems);
        return this;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html"
     * >Editing OpsItem Details</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param status
     *        The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html"
     *        >Editing OpsItem Details</a> in the <i>AWS Systems Manager User Guide</i>.
     * @see OpsItemStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html"
     * >Editing OpsItem Details</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html"
     *         >Editing OpsItem Details</a> in the <i>AWS Systems Manager User Guide</i>.
     * @see OpsItemStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html"
     * >Editing OpsItem Details</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param status
     *        The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html"
     *        >Editing OpsItem Details</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpsItemStatus
     */

    public OpsItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html"
     * >Editing OpsItem Details</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param status
     *        The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-working-with-OpsItems-editing-details.html"
     *        >Editing OpsItem Details</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpsItemStatus
     */

    public OpsItem withStatus(OpsItemStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem.
     */

    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * 
     * @return The ID of the OpsItem.
     */

    public String getOpsItemId() {
        return this.opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem withOpsItemId(String opsItemId) {
        setOpsItemId(opsItemId);
        return this;
    }

    /**
     * <p>
     * The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.
     * </p>
     * 
     * @param version
     *        The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.
     * </p>
     * 
     * @return The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.
     * </p>
     * 
     * @param version
     *        The version of this OpsItem. Each time the OpsItem is edited the version number increments by one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem withVersion(String version) {
        setVersion(version);
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

    public OpsItem withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager. The impacted resource is a subset of
     * source.
     * </p>
     * 
     * @param source
     *        The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager. The impacted resource is a subset of
     *        source.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager. The impacted resource is a subset of
     * source.
     * </p>
     * 
     * @return The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager. The impacted resource is a subset
     *         of source.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager. The impacted resource is a subset of
     * source.
     * </p>
     * 
     * @param source
     *        The origin of the OpsItem, such as Amazon EC2 or AWS Systems Manager. The impacted resource is a subset of
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem withSource(String source) {
        setSource(source);
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

    public OpsItem withOperationalData(java.util.Map<String, OpsItemDataValue> operationalData) {
        setOperationalData(operationalData);
        return this;
    }

    /**
     * Add a single OperationalData entry
     *
     * @see OpsItem#withOperationalData
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem addOperationalDataEntry(String key, OpsItemDataValue value) {
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

    public OpsItem clearOperationalDataEntries() {
        this.operationalData = null;
        return this;
    }

    /**
     * <p>
     * An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.
     * </p>
     * 
     * @param category
     *        An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.
     * </p>
     * 
     * @return An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.
     * </p>
     * 
     * @param category
     *        An OpsItem category. Category options include: Availability, Cost, Performance, Recovery, Security.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The severity of the OpsItem. Severity options range from 1 to 4.
     * </p>
     * 
     * @param severity
     *        The severity of the OpsItem. Severity options range from 1 to 4.
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the OpsItem. Severity options range from 1 to 4.
     * </p>
     * 
     * @return The severity of the OpsItem. Severity options range from 1 to 4.
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the OpsItem. Severity options range from 1 to 4.
     * </p>
     * 
     * @param severity
     *        The severity of the OpsItem. Severity options range from 1 to 4.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItem withSeverity(String severity) {
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
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getNotifications() != null)
            sb.append("Notifications: ").append(getNotifications()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getRelatedOpsItems() != null)
            sb.append("RelatedOpsItems: ").append(getRelatedOpsItems()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOpsItemId() != null)
            sb.append("OpsItemId: ").append(getOpsItemId()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getOperationalData() != null)
            sb.append("OperationalData: ").append(getOperationalData()).append(",");
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

        if (obj instanceof OpsItem == false)
            return false;
        OpsItem other = (OpsItem) obj;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null)
            return false;
        if (other.getOpsItemId() != null && other.getOpsItemId().equals(this.getOpsItemId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getOperationalData() == null ^ this.getOperationalData() == null)
            return false;
        if (other.getOperationalData() != null && other.getOperationalData().equals(this.getOperationalData()) == false)
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

        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRelatedOpsItems() == null) ? 0 : getRelatedOpsItems().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getOperationalData() == null) ? 0 : getOperationalData().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        return hashCode;
    }

    @Override
    public OpsItem clone() {
        try {
            return (OpsItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.OpsItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
