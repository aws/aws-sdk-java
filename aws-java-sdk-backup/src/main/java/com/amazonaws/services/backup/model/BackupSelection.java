/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to specify a set of resources to a backup plan.
 * </p>
 * <p>
 * Specifying your desired <code>Conditions</code>, <code>ListOfTags</code>, <code>NotResources</code>, and/or
 * <code>Resources</code> is recommended. If none of these are specified, Backup will attempt to select all supported
 * and opted-in storage resources, which could have unintended cost implications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/BackupSelection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupSelection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display name of a resource selection document. Must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     */
    private String selectionName;
    /**
     * <p>
     * The ARN of the IAM role that Backup uses to authenticate when backing up the target resource; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) to assign to a backup plan. The maximum number of ARNs is 500 without
     * wildcards, or 30 ARNs with wildcards.
     * </p>
     * <p>
     * If you need to assign many resources to a backup plan, consider a different resource selection strategy, such as
     * assigning all resources of a resource type or refining your resource selection using tags.
     * </p>
     */
    private java.util.List<String> resources;
    /**
     * <p>
     * A list of conditions that you define to assign resources to your backup plans using tags. For example,
     * <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>.
     * Condition operators are case sensitive.
     * </p>
     * <p>
     * <code>ListOfTags</code> differs from <code>Conditions</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify more than one condition, you assign all resources that match AT LEAST ONE condition (using OR
     * logic).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ListOfTags</code> only supports <code>StringEquals</code>. <code>Conditions</code> supports
     * <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>, and <code>StringNotLike</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Condition> listOfTags;
    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) to exclude from a backup plan. The maximum number of ARNs is 500 without
     * wildcards, or 30 ARNs with wildcards.
     * </p>
     * <p>
     * If you need to exclude many resources from a backup plan, consider a different resource selection strategy, such
     * as assigning only one or a few resource types or refining your resource selection using tags.
     * </p>
     */
    private java.util.List<String> notResources;
    /**
     * <p>
     * A list of conditions that you define to assign resources to your backup plans using tags. For example,
     * <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>.
     * Condition operators are case sensitive.
     * </p>
     * <p>
     * <code>Conditions</code> differs from <code>ListOfTags</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify more than one condition, you only assign the resources that match ALL conditions (using AND
     * logic).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Conditions</code> supports <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>
     * , and <code>StringNotLike</code>. <code>ListOfTags</code> only supports <code>StringEquals</code>.
     * </p>
     * </li>
     * </ul>
     */
    private Conditions conditions;

    /**
     * <p>
     * The display name of a resource selection document. Must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @param selectionName
     *        The display name of a resource selection document. Must contain 1 to 50 alphanumeric or '-_.' characters.
     */

    public void setSelectionName(String selectionName) {
        this.selectionName = selectionName;
    }

    /**
     * <p>
     * The display name of a resource selection document. Must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @return The display name of a resource selection document. Must contain 1 to 50 alphanumeric or '-_.' characters.
     */

    public String getSelectionName() {
        return this.selectionName;
    }

    /**
     * <p>
     * The display name of a resource selection document. Must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @param selectionName
     *        The display name of a resource selection document. Must contain 1 to 50 alphanumeric or '-_.' characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withSelectionName(String selectionName) {
        setSelectionName(selectionName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that Backup uses to authenticate when backing up the target resource; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role that Backup uses to authenticate when backing up the target resource; for example,
     *        <code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that Backup uses to authenticate when backing up the target resource; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @return The ARN of the IAM role that Backup uses to authenticate when backing up the target resource; for
     *         example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that Backup uses to authenticate when backing up the target resource; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role that Backup uses to authenticate when backing up the target resource; for example,
     *        <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) to assign to a backup plan. The maximum number of ARNs is 500 without
     * wildcards, or 30 ARNs with wildcards.
     * </p>
     * <p>
     * If you need to assign many resources to a backup plan, consider a different resource selection strategy, such as
     * assigning all resources of a resource type or refining your resource selection using tags.
     * </p>
     * 
     * @return A list of Amazon Resource Names (ARNs) to assign to a backup plan. The maximum number of ARNs is 500
     *         without wildcards, or 30 ARNs with wildcards.</p>
     *         <p>
     *         If you need to assign many resources to a backup plan, consider a different resource selection strategy,
     *         such as assigning all resources of a resource type or refining your resource selection using tags.
     */

    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) to assign to a backup plan. The maximum number of ARNs is 500 without
     * wildcards, or 30 ARNs with wildcards.
     * </p>
     * <p>
     * If you need to assign many resources to a backup plan, consider a different resource selection strategy, such as
     * assigning all resources of a resource type or refining your resource selection using tags.
     * </p>
     * 
     * @param resources
     *        A list of Amazon Resource Names (ARNs) to assign to a backup plan. The maximum number of ARNs is 500
     *        without wildcards, or 30 ARNs with wildcards.</p>
     *        <p>
     *        If you need to assign many resources to a backup plan, consider a different resource selection strategy,
     *        such as assigning all resources of a resource type or refining your resource selection using tags.
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) to assign to a backup plan. The maximum number of ARNs is 500 without
     * wildcards, or 30 ARNs with wildcards.
     * </p>
     * <p>
     * If you need to assign many resources to a backup plan, consider a different resource selection strategy, such as
     * assigning all resources of a resource type or refining your resource selection using tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        A list of Amazon Resource Names (ARNs) to assign to a backup plan. The maximum number of ARNs is 500
     *        without wildcards, or 30 ARNs with wildcards.</p>
     *        <p>
     *        If you need to assign many resources to a backup plan, consider a different resource selection strategy,
     *        such as assigning all resources of a resource type or refining your resource selection using tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withResources(String... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) to assign to a backup plan. The maximum number of ARNs is 500 without
     * wildcards, or 30 ARNs with wildcards.
     * </p>
     * <p>
     * If you need to assign many resources to a backup plan, consider a different resource selection strategy, such as
     * assigning all resources of a resource type or refining your resource selection using tags.
     * </p>
     * 
     * @param resources
     *        A list of Amazon Resource Names (ARNs) to assign to a backup plan. The maximum number of ARNs is 500
     *        without wildcards, or 30 ARNs with wildcards.</p>
     *        <p>
     *        If you need to assign many resources to a backup plan, consider a different resource selection strategy,
     *        such as assigning all resources of a resource type or refining your resource selection using tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * A list of conditions that you define to assign resources to your backup plans using tags. For example,
     * <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>.
     * Condition operators are case sensitive.
     * </p>
     * <p>
     * <code>ListOfTags</code> differs from <code>Conditions</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify more than one condition, you assign all resources that match AT LEAST ONE condition (using OR
     * logic).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ListOfTags</code> only supports <code>StringEquals</code>. <code>Conditions</code> supports
     * <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>, and <code>StringNotLike</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of conditions that you define to assign resources to your backup plans using tags. For example,
     *         <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>
     *         . Condition operators are case sensitive.</p>
     *         <p>
     *         <code>ListOfTags</code> differs from <code>Conditions</code> as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         When you specify more than one condition, you assign all resources that match AT LEAST ONE condition
     *         (using OR logic).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ListOfTags</code> only supports <code>StringEquals</code>. <code>Conditions</code> supports
     *         <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>, and
     *         <code>StringNotLike</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<Condition> getListOfTags() {
        return listOfTags;
    }

    /**
     * <p>
     * A list of conditions that you define to assign resources to your backup plans using tags. For example,
     * <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>.
     * Condition operators are case sensitive.
     * </p>
     * <p>
     * <code>ListOfTags</code> differs from <code>Conditions</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify more than one condition, you assign all resources that match AT LEAST ONE condition (using OR
     * logic).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ListOfTags</code> only supports <code>StringEquals</code>. <code>Conditions</code> supports
     * <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>, and <code>StringNotLike</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listOfTags
     *        A list of conditions that you define to assign resources to your backup plans using tags. For example,
     *        <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>
     *        . Condition operators are case sensitive.</p>
     *        <p>
     *        <code>ListOfTags</code> differs from <code>Conditions</code> as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When you specify more than one condition, you assign all resources that match AT LEAST ONE condition
     *        (using OR logic).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ListOfTags</code> only supports <code>StringEquals</code>. <code>Conditions</code> supports
     *        <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>, and
     *        <code>StringNotLike</code>.
     *        </p>
     *        </li>
     */

    public void setListOfTags(java.util.Collection<Condition> listOfTags) {
        if (listOfTags == null) {
            this.listOfTags = null;
            return;
        }

        this.listOfTags = new java.util.ArrayList<Condition>(listOfTags);
    }

    /**
     * <p>
     * A list of conditions that you define to assign resources to your backup plans using tags. For example,
     * <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>.
     * Condition operators are case sensitive.
     * </p>
     * <p>
     * <code>ListOfTags</code> differs from <code>Conditions</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify more than one condition, you assign all resources that match AT LEAST ONE condition (using OR
     * logic).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ListOfTags</code> only supports <code>StringEquals</code>. <code>Conditions</code> supports
     * <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>, and <code>StringNotLike</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListOfTags(java.util.Collection)} or {@link #withListOfTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listOfTags
     *        A list of conditions that you define to assign resources to your backup plans using tags. For example,
     *        <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>
     *        . Condition operators are case sensitive.</p>
     *        <p>
     *        <code>ListOfTags</code> differs from <code>Conditions</code> as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When you specify more than one condition, you assign all resources that match AT LEAST ONE condition
     *        (using OR logic).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ListOfTags</code> only supports <code>StringEquals</code>. <code>Conditions</code> supports
     *        <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>, and
     *        <code>StringNotLike</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withListOfTags(Condition... listOfTags) {
        if (this.listOfTags == null) {
            setListOfTags(new java.util.ArrayList<Condition>(listOfTags.length));
        }
        for (Condition ele : listOfTags) {
            this.listOfTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions that you define to assign resources to your backup plans using tags. For example,
     * <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>.
     * Condition operators are case sensitive.
     * </p>
     * <p>
     * <code>ListOfTags</code> differs from <code>Conditions</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify more than one condition, you assign all resources that match AT LEAST ONE condition (using OR
     * logic).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ListOfTags</code> only supports <code>StringEquals</code>. <code>Conditions</code> supports
     * <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>, and <code>StringNotLike</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listOfTags
     *        A list of conditions that you define to assign resources to your backup plans using tags. For example,
     *        <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>
     *        . Condition operators are case sensitive.</p>
     *        <p>
     *        <code>ListOfTags</code> differs from <code>Conditions</code> as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When you specify more than one condition, you assign all resources that match AT LEAST ONE condition
     *        (using OR logic).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ListOfTags</code> only supports <code>StringEquals</code>. <code>Conditions</code> supports
     *        <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>, and
     *        <code>StringNotLike</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withListOfTags(java.util.Collection<Condition> listOfTags) {
        setListOfTags(listOfTags);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) to exclude from a backup plan. The maximum number of ARNs is 500 without
     * wildcards, or 30 ARNs with wildcards.
     * </p>
     * <p>
     * If you need to exclude many resources from a backup plan, consider a different resource selection strategy, such
     * as assigning only one or a few resource types or refining your resource selection using tags.
     * </p>
     * 
     * @return A list of Amazon Resource Names (ARNs) to exclude from a backup plan. The maximum number of ARNs is 500
     *         without wildcards, or 30 ARNs with wildcards.</p>
     *         <p>
     *         If you need to exclude many resources from a backup plan, consider a different resource selection
     *         strategy, such as assigning only one or a few resource types or refining your resource selection using
     *         tags.
     */

    public java.util.List<String> getNotResources() {
        return notResources;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) to exclude from a backup plan. The maximum number of ARNs is 500 without
     * wildcards, or 30 ARNs with wildcards.
     * </p>
     * <p>
     * If you need to exclude many resources from a backup plan, consider a different resource selection strategy, such
     * as assigning only one or a few resource types or refining your resource selection using tags.
     * </p>
     * 
     * @param notResources
     *        A list of Amazon Resource Names (ARNs) to exclude from a backup plan. The maximum number of ARNs is 500
     *        without wildcards, or 30 ARNs with wildcards.</p>
     *        <p>
     *        If you need to exclude many resources from a backup plan, consider a different resource selection
     *        strategy, such as assigning only one or a few resource types or refining your resource selection using
     *        tags.
     */

    public void setNotResources(java.util.Collection<String> notResources) {
        if (notResources == null) {
            this.notResources = null;
            return;
        }

        this.notResources = new java.util.ArrayList<String>(notResources);
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) to exclude from a backup plan. The maximum number of ARNs is 500 without
     * wildcards, or 30 ARNs with wildcards.
     * </p>
     * <p>
     * If you need to exclude many resources from a backup plan, consider a different resource selection strategy, such
     * as assigning only one or a few resource types or refining your resource selection using tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotResources(java.util.Collection)} or {@link #withNotResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param notResources
     *        A list of Amazon Resource Names (ARNs) to exclude from a backup plan. The maximum number of ARNs is 500
     *        without wildcards, or 30 ARNs with wildcards.</p>
     *        <p>
     *        If you need to exclude many resources from a backup plan, consider a different resource selection
     *        strategy, such as assigning only one or a few resource types or refining your resource selection using
     *        tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withNotResources(String... notResources) {
        if (this.notResources == null) {
            setNotResources(new java.util.ArrayList<String>(notResources.length));
        }
        for (String ele : notResources) {
            this.notResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) to exclude from a backup plan. The maximum number of ARNs is 500 without
     * wildcards, or 30 ARNs with wildcards.
     * </p>
     * <p>
     * If you need to exclude many resources from a backup plan, consider a different resource selection strategy, such
     * as assigning only one or a few resource types or refining your resource selection using tags.
     * </p>
     * 
     * @param notResources
     *        A list of Amazon Resource Names (ARNs) to exclude from a backup plan. The maximum number of ARNs is 500
     *        without wildcards, or 30 ARNs with wildcards.</p>
     *        <p>
     *        If you need to exclude many resources from a backup plan, consider a different resource selection
     *        strategy, such as assigning only one or a few resource types or refining your resource selection using
     *        tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withNotResources(java.util.Collection<String> notResources) {
        setNotResources(notResources);
        return this;
    }

    /**
     * <p>
     * A list of conditions that you define to assign resources to your backup plans using tags. For example,
     * <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>.
     * Condition operators are case sensitive.
     * </p>
     * <p>
     * <code>Conditions</code> differs from <code>ListOfTags</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify more than one condition, you only assign the resources that match ALL conditions (using AND
     * logic).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Conditions</code> supports <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>
     * , and <code>StringNotLike</code>. <code>ListOfTags</code> only supports <code>StringEquals</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conditions
     *        A list of conditions that you define to assign resources to your backup plans using tags. For example,
     *        <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>
     *        . Condition operators are case sensitive.</p>
     *        <p>
     *        <code>Conditions</code> differs from <code>ListOfTags</code> as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When you specify more than one condition, you only assign the resources that match ALL conditions (using
     *        AND logic).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Conditions</code> supports <code>StringEquals</code>, <code>StringLike</code>,
     *        <code>StringNotEquals</code>, and <code>StringNotLike</code>. <code>ListOfTags</code> only supports
     *        <code>StringEquals</code>.
     *        </p>
     *        </li>
     */

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    /**
     * <p>
     * A list of conditions that you define to assign resources to your backup plans using tags. For example,
     * <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>.
     * Condition operators are case sensitive.
     * </p>
     * <p>
     * <code>Conditions</code> differs from <code>ListOfTags</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify more than one condition, you only assign the resources that match ALL conditions (using AND
     * logic).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Conditions</code> supports <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>
     * , and <code>StringNotLike</code>. <code>ListOfTags</code> only supports <code>StringEquals</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of conditions that you define to assign resources to your backup plans using tags. For example,
     *         <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>
     *         . Condition operators are case sensitive.</p>
     *         <p>
     *         <code>Conditions</code> differs from <code>ListOfTags</code> as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         When you specify more than one condition, you only assign the resources that match ALL conditions (using
     *         AND logic).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Conditions</code> supports <code>StringEquals</code>, <code>StringLike</code>,
     *         <code>StringNotEquals</code>, and <code>StringNotLike</code>. <code>ListOfTags</code> only supports
     *         <code>StringEquals</code>.
     *         </p>
     *         </li>
     */

    public Conditions getConditions() {
        return this.conditions;
    }

    /**
     * <p>
     * A list of conditions that you define to assign resources to your backup plans using tags. For example,
     * <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>.
     * Condition operators are case sensitive.
     * </p>
     * <p>
     * <code>Conditions</code> differs from <code>ListOfTags</code> as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you specify more than one condition, you only assign the resources that match ALL conditions (using AND
     * logic).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Conditions</code> supports <code>StringEquals</code>, <code>StringLike</code>, <code>StringNotEquals</code>
     * , and <code>StringNotLike</code>. <code>ListOfTags</code> only supports <code>StringEquals</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conditions
     *        A list of conditions that you define to assign resources to your backup plans using tags. For example,
     *        <code>"StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },</code>
     *        . Condition operators are case sensitive.</p>
     *        <p>
     *        <code>Conditions</code> differs from <code>ListOfTags</code> as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When you specify more than one condition, you only assign the resources that match ALL conditions (using
     *        AND logic).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Conditions</code> supports <code>StringEquals</code>, <code>StringLike</code>,
     *        <code>StringNotEquals</code>, and <code>StringNotLike</code>. <code>ListOfTags</code> only supports
     *        <code>StringEquals</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withConditions(Conditions conditions) {
        setConditions(conditions);
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
        if (getSelectionName() != null)
            sb.append("SelectionName: ").append(getSelectionName()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getListOfTags() != null)
            sb.append("ListOfTags: ").append(getListOfTags()).append(",");
        if (getNotResources() != null)
            sb.append("NotResources: ").append(getNotResources()).append(",");
        if (getConditions() != null)
            sb.append("Conditions: ").append(getConditions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupSelection == false)
            return false;
        BackupSelection other = (BackupSelection) obj;
        if (other.getSelectionName() == null ^ this.getSelectionName() == null)
            return false;
        if (other.getSelectionName() != null && other.getSelectionName().equals(this.getSelectionName()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getListOfTags() == null ^ this.getListOfTags() == null)
            return false;
        if (other.getListOfTags() != null && other.getListOfTags().equals(this.getListOfTags()) == false)
            return false;
        if (other.getNotResources() == null ^ this.getNotResources() == null)
            return false;
        if (other.getNotResources() != null && other.getNotResources().equals(this.getNotResources()) == false)
            return false;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null && other.getConditions().equals(this.getConditions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectionName() == null) ? 0 : getSelectionName().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getListOfTags() == null) ? 0 : getListOfTags().hashCode());
        hashCode = prime * hashCode + ((getNotResources() == null) ? 0 : getNotResources().hashCode());
        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        return hashCode;
    }

    @Override
    public BackupSelection clone() {
        try {
            return (BackupSelection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.BackupSelectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
