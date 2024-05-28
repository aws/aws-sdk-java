/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This contains metadata about a restore testing selection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RestoreTestingSelectionForGet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTestingSelectionForGet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that a restore testing selection was created, in Unix format and Coordinated Universal Time
     * (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 201812:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * This identifies the request and allows failed requests to be retried without the risk of running the operation
     * twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup plan, that plan is
     * returned. This parameter is optional.
     * </p>
     * <p>
     * If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for example:
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * You can include specific ARNs, such as <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you
     * can include a wildcard: <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     */
    private java.util.List<String> protectedResourceArns;
    /**
     * <p>
     * In a resource testing selection, this parameter filters by specific conditions such as <code>StringEquals</code>
     * or <code>StringNotEquals</code>.
     * </p>
     */
    private ProtectedResourceConditions protectedResourceConditions;
    /**
     * <p>
     * The type of Amazon Web Services resource included in a resource testing selection; for example, an Amazon EBS
     * volume or an Amazon RDS database.
     * </p>
     */
    private String protectedResourceType;
    /**
     * <p>
     * You can override certain restore metadata keys by including the parameter <code>RestoreMetadataOverrides</code>
     * in the body of <code>RestoreTestingSelection</code>. Key values are not case sensitive.
     * </p>
     * <p>
     * See the complete list of <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html">restore
     * testing inferred metadata</a>.
     * </p>
     */
    private java.util.Map<String, String> restoreMetadataOverrides;
    /**
     * <p>
     * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan.
     * </p>
     */
    private String restoreTestingPlanName;
    /**
     * <p>
     * This is the unique name of the restore testing selection that belongs to the related restore testing plan.
     * </p>
     */
    private String restoreTestingSelectionName;
    /**
     * <p>
     * This is amount of hours (1 to 168) available to run a validation script on the data. The data will be deleted
     * upon the completion of the validation script or the end of the specified retention period, whichever comes first.
     * </p>
     */
    private Integer validationWindowHours;

    /**
     * <p>
     * The date and time that a restore testing selection was created, in Unix format and Coordinated Universal Time
     * (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 201812:11:30.087 AM.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a restore testing selection was created, in Unix format and Coordinated Universal
     *        Time (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 201812:11:30.087 AM.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that a restore testing selection was created, in Unix format and Coordinated Universal Time
     * (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 201812:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a restore testing selection was created, in Unix format and Coordinated Universal
     *         Time (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value
     *         1516925490.087 represents Friday, January 26, 201812:11:30.087 AM.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that a restore testing selection was created, in Unix format and Coordinated Universal Time
     * (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 201812:11:30.087 AM.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a restore testing selection was created, in Unix format and Coordinated Universal
     *        Time (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 201812:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * This identifies the request and allows failed requests to be retried without the risk of running the operation
     * twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup plan, that plan is
     * returned. This parameter is optional.
     * </p>
     * <p>
     * If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @param creatorRequestId
     *        This identifies the request and allows failed requests to be retried without the risk of running the
     *        operation twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup
     *        plan, that plan is returned. This parameter is optional.</p>
     *        <p>
     *        If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * This identifies the request and allows failed requests to be retried without the risk of running the operation
     * twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup plan, that plan is
     * returned. This parameter is optional.
     * </p>
     * <p>
     * If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @return This identifies the request and allows failed requests to be retried without the risk of running the
     *         operation twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup
     *         plan, that plan is returned. This parameter is optional.</p>
     *         <p>
     *         If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * This identifies the request and allows failed requests to be retried without the risk of running the operation
     * twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup plan, that plan is
     * returned. This parameter is optional.
     * </p>
     * <p>
     * If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @param creatorRequestId
     *        This identifies the request and allows failed requests to be retried without the risk of running the
     *        operation twice. If the request includes a <code>CreatorRequestId</code> that matches an existing backup
     *        plan, that plan is returned. This parameter is optional.</p>
     *        <p>
     *        If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for example:
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for
     *        example:<code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for example:
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for
     *         example:<code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for example:
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for
     *        example:<code>arn:aws:iam::123456789012:role/S3Access</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * You can include specific ARNs, such as <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you
     * can include a wildcard: <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     * 
     * @return You can include specific ARNs, such as <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code>
     *         or you can include a wildcard: <code>ProtectedResourceArns: ["*"]</code>, but not both.
     */

    public java.util.List<String> getProtectedResourceArns() {
        return protectedResourceArns;
    }

    /**
     * <p>
     * You can include specific ARNs, such as <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you
     * can include a wildcard: <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     * 
     * @param protectedResourceArns
     *        You can include specific ARNs, such as <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code>
     *        or you can include a wildcard: <code>ProtectedResourceArns: ["*"]</code>, but not both.
     */

    public void setProtectedResourceArns(java.util.Collection<String> protectedResourceArns) {
        if (protectedResourceArns == null) {
            this.protectedResourceArns = null;
            return;
        }

        this.protectedResourceArns = new java.util.ArrayList<String>(protectedResourceArns);
    }

    /**
     * <p>
     * You can include specific ARNs, such as <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you
     * can include a wildcard: <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtectedResourceArns(java.util.Collection)} or
     * {@link #withProtectedResourceArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param protectedResourceArns
     *        You can include specific ARNs, such as <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code>
     *        or you can include a wildcard: <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet withProtectedResourceArns(String... protectedResourceArns) {
        if (this.protectedResourceArns == null) {
            setProtectedResourceArns(new java.util.ArrayList<String>(protectedResourceArns.length));
        }
        for (String ele : protectedResourceArns) {
            this.protectedResourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can include specific ARNs, such as <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you
     * can include a wildcard: <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     * 
     * @param protectedResourceArns
     *        You can include specific ARNs, such as <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code>
     *        or you can include a wildcard: <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet withProtectedResourceArns(java.util.Collection<String> protectedResourceArns) {
        setProtectedResourceArns(protectedResourceArns);
        return this;
    }

    /**
     * <p>
     * In a resource testing selection, this parameter filters by specific conditions such as <code>StringEquals</code>
     * or <code>StringNotEquals</code>.
     * </p>
     * 
     * @param protectedResourceConditions
     *        In a resource testing selection, this parameter filters by specific conditions such as
     *        <code>StringEquals</code> or <code>StringNotEquals</code>.
     */

    public void setProtectedResourceConditions(ProtectedResourceConditions protectedResourceConditions) {
        this.protectedResourceConditions = protectedResourceConditions;
    }

    /**
     * <p>
     * In a resource testing selection, this parameter filters by specific conditions such as <code>StringEquals</code>
     * or <code>StringNotEquals</code>.
     * </p>
     * 
     * @return In a resource testing selection, this parameter filters by specific conditions such as
     *         <code>StringEquals</code> or <code>StringNotEquals</code>.
     */

    public ProtectedResourceConditions getProtectedResourceConditions() {
        return this.protectedResourceConditions;
    }

    /**
     * <p>
     * In a resource testing selection, this parameter filters by specific conditions such as <code>StringEquals</code>
     * or <code>StringNotEquals</code>.
     * </p>
     * 
     * @param protectedResourceConditions
     *        In a resource testing selection, this parameter filters by specific conditions such as
     *        <code>StringEquals</code> or <code>StringNotEquals</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet withProtectedResourceConditions(ProtectedResourceConditions protectedResourceConditions) {
        setProtectedResourceConditions(protectedResourceConditions);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource included in a resource testing selection; for example, an Amazon EBS
     * volume or an Amazon RDS database.
     * </p>
     * 
     * @param protectedResourceType
     *        The type of Amazon Web Services resource included in a resource testing selection; for example, an Amazon
     *        EBS volume or an Amazon RDS database.
     */

    public void setProtectedResourceType(String protectedResourceType) {
        this.protectedResourceType = protectedResourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource included in a resource testing selection; for example, an Amazon EBS
     * volume or an Amazon RDS database.
     * </p>
     * 
     * @return The type of Amazon Web Services resource included in a resource testing selection; for example, an Amazon
     *         EBS volume or an Amazon RDS database.
     */

    public String getProtectedResourceType() {
        return this.protectedResourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource included in a resource testing selection; for example, an Amazon EBS
     * volume or an Amazon RDS database.
     * </p>
     * 
     * @param protectedResourceType
     *        The type of Amazon Web Services resource included in a resource testing selection; for example, an Amazon
     *        EBS volume or an Amazon RDS database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet withProtectedResourceType(String protectedResourceType) {
        setProtectedResourceType(protectedResourceType);
        return this;
    }

    /**
     * <p>
     * You can override certain restore metadata keys by including the parameter <code>RestoreMetadataOverrides</code>
     * in the body of <code>RestoreTestingSelection</code>. Key values are not case sensitive.
     * </p>
     * <p>
     * See the complete list of <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html">restore
     * testing inferred metadata</a>.
     * </p>
     * 
     * @return You can override certain restore metadata keys by including the parameter
     *         <code>RestoreMetadataOverrides</code> in the body of <code>RestoreTestingSelection</code>. Key values are
     *         not case sensitive.</p>
     *         <p>
     *         See the complete list of <a
     *         href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html"
     *         >restore testing inferred metadata</a>.
     */

    public java.util.Map<String, String> getRestoreMetadataOverrides() {
        return restoreMetadataOverrides;
    }

    /**
     * <p>
     * You can override certain restore metadata keys by including the parameter <code>RestoreMetadataOverrides</code>
     * in the body of <code>RestoreTestingSelection</code>. Key values are not case sensitive.
     * </p>
     * <p>
     * See the complete list of <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html">restore
     * testing inferred metadata</a>.
     * </p>
     * 
     * @param restoreMetadataOverrides
     *        You can override certain restore metadata keys by including the parameter
     *        <code>RestoreMetadataOverrides</code> in the body of <code>RestoreTestingSelection</code>. Key values are
     *        not case sensitive.</p>
     *        <p>
     *        See the complete list of <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html"
     *        >restore testing inferred metadata</a>.
     */

    public void setRestoreMetadataOverrides(java.util.Map<String, String> restoreMetadataOverrides) {
        this.restoreMetadataOverrides = restoreMetadataOverrides;
    }

    /**
     * <p>
     * You can override certain restore metadata keys by including the parameter <code>RestoreMetadataOverrides</code>
     * in the body of <code>RestoreTestingSelection</code>. Key values are not case sensitive.
     * </p>
     * <p>
     * See the complete list of <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html">restore
     * testing inferred metadata</a>.
     * </p>
     * 
     * @param restoreMetadataOverrides
     *        You can override certain restore metadata keys by including the parameter
     *        <code>RestoreMetadataOverrides</code> in the body of <code>RestoreTestingSelection</code>. Key values are
     *        not case sensitive.</p>
     *        <p>
     *        See the complete list of <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html"
     *        >restore testing inferred metadata</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet withRestoreMetadataOverrides(java.util.Map<String, String> restoreMetadataOverrides) {
        setRestoreMetadataOverrides(restoreMetadataOverrides);
        return this;
    }

    /**
     * Add a single RestoreMetadataOverrides entry
     *
     * @see RestoreTestingSelectionForGet#withRestoreMetadataOverrides
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet addRestoreMetadataOverridesEntry(String key, String value) {
        if (null == this.restoreMetadataOverrides) {
            this.restoreMetadataOverrides = new java.util.HashMap<String, String>();
        }
        if (this.restoreMetadataOverrides.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.restoreMetadataOverrides.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RestoreMetadataOverrides.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet clearRestoreMetadataOverridesEntries() {
        this.restoreMetadataOverrides = null;
        return this;
    }

    /**
     * <p>
     * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        The RestoreTestingPlanName is a unique string that is the name of the restore testing plan.
     */

    public void setRestoreTestingPlanName(String restoreTestingPlanName) {
        this.restoreTestingPlanName = restoreTestingPlanName;
    }

    /**
     * <p>
     * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan.
     * </p>
     * 
     * @return The RestoreTestingPlanName is a unique string that is the name of the restore testing plan.
     */

    public String getRestoreTestingPlanName() {
        return this.restoreTestingPlanName;
    }

    /**
     * <p>
     * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        The RestoreTestingPlanName is a unique string that is the name of the restore testing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet withRestoreTestingPlanName(String restoreTestingPlanName) {
        setRestoreTestingPlanName(restoreTestingPlanName);
        return this;
    }

    /**
     * <p>
     * This is the unique name of the restore testing selection that belongs to the related restore testing plan.
     * </p>
     * 
     * @param restoreTestingSelectionName
     *        This is the unique name of the restore testing selection that belongs to the related restore testing plan.
     */

    public void setRestoreTestingSelectionName(String restoreTestingSelectionName) {
        this.restoreTestingSelectionName = restoreTestingSelectionName;
    }

    /**
     * <p>
     * This is the unique name of the restore testing selection that belongs to the related restore testing plan.
     * </p>
     * 
     * @return This is the unique name of the restore testing selection that belongs to the related restore testing
     *         plan.
     */

    public String getRestoreTestingSelectionName() {
        return this.restoreTestingSelectionName;
    }

    /**
     * <p>
     * This is the unique name of the restore testing selection that belongs to the related restore testing plan.
     * </p>
     * 
     * @param restoreTestingSelectionName
     *        This is the unique name of the restore testing selection that belongs to the related restore testing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet withRestoreTestingSelectionName(String restoreTestingSelectionName) {
        setRestoreTestingSelectionName(restoreTestingSelectionName);
        return this;
    }

    /**
     * <p>
     * This is amount of hours (1 to 168) available to run a validation script on the data. The data will be deleted
     * upon the completion of the validation script or the end of the specified retention period, whichever comes first.
     * </p>
     * 
     * @param validationWindowHours
     *        This is amount of hours (1 to 168) available to run a validation script on the data. The data will be
     *        deleted upon the completion of the validation script or the end of the specified retention period,
     *        whichever comes first.
     */

    public void setValidationWindowHours(Integer validationWindowHours) {
        this.validationWindowHours = validationWindowHours;
    }

    /**
     * <p>
     * This is amount of hours (1 to 168) available to run a validation script on the data. The data will be deleted
     * upon the completion of the validation script or the end of the specified retention period, whichever comes first.
     * </p>
     * 
     * @return This is amount of hours (1 to 168) available to run a validation script on the data. The data will be
     *         deleted upon the completion of the validation script or the end of the specified retention period,
     *         whichever comes first.
     */

    public Integer getValidationWindowHours() {
        return this.validationWindowHours;
    }

    /**
     * <p>
     * This is amount of hours (1 to 168) available to run a validation script on the data. The data will be deleted
     * upon the completion of the validation script or the end of the specified retention period, whichever comes first.
     * </p>
     * 
     * @param validationWindowHours
     *        This is amount of hours (1 to 168) available to run a validation script on the data. The data will be
     *        deleted upon the completion of the validation script or the end of the specified retention period,
     *        whichever comes first.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForGet withValidationWindowHours(Integer validationWindowHours) {
        setValidationWindowHours(validationWindowHours);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getProtectedResourceArns() != null)
            sb.append("ProtectedResourceArns: ").append(getProtectedResourceArns()).append(",");
        if (getProtectedResourceConditions() != null)
            sb.append("ProtectedResourceConditions: ").append(getProtectedResourceConditions()).append(",");
        if (getProtectedResourceType() != null)
            sb.append("ProtectedResourceType: ").append(getProtectedResourceType()).append(",");
        if (getRestoreMetadataOverrides() != null)
            sb.append("RestoreMetadataOverrides: ").append("***Sensitive Data Redacted***").append(",");
        if (getRestoreTestingPlanName() != null)
            sb.append("RestoreTestingPlanName: ").append(getRestoreTestingPlanName()).append(",");
        if (getRestoreTestingSelectionName() != null)
            sb.append("RestoreTestingSelectionName: ").append(getRestoreTestingSelectionName()).append(",");
        if (getValidationWindowHours() != null)
            sb.append("ValidationWindowHours: ").append(getValidationWindowHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTestingSelectionForGet == false)
            return false;
        RestoreTestingSelectionForGet other = (RestoreTestingSelectionForGet) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getProtectedResourceArns() == null ^ this.getProtectedResourceArns() == null)
            return false;
        if (other.getProtectedResourceArns() != null && other.getProtectedResourceArns().equals(this.getProtectedResourceArns()) == false)
            return false;
        if (other.getProtectedResourceConditions() == null ^ this.getProtectedResourceConditions() == null)
            return false;
        if (other.getProtectedResourceConditions() != null && other.getProtectedResourceConditions().equals(this.getProtectedResourceConditions()) == false)
            return false;
        if (other.getProtectedResourceType() == null ^ this.getProtectedResourceType() == null)
            return false;
        if (other.getProtectedResourceType() != null && other.getProtectedResourceType().equals(this.getProtectedResourceType()) == false)
            return false;
        if (other.getRestoreMetadataOverrides() == null ^ this.getRestoreMetadataOverrides() == null)
            return false;
        if (other.getRestoreMetadataOverrides() != null && other.getRestoreMetadataOverrides().equals(this.getRestoreMetadataOverrides()) == false)
            return false;
        if (other.getRestoreTestingPlanName() == null ^ this.getRestoreTestingPlanName() == null)
            return false;
        if (other.getRestoreTestingPlanName() != null && other.getRestoreTestingPlanName().equals(this.getRestoreTestingPlanName()) == false)
            return false;
        if (other.getRestoreTestingSelectionName() == null ^ this.getRestoreTestingSelectionName() == null)
            return false;
        if (other.getRestoreTestingSelectionName() != null && other.getRestoreTestingSelectionName().equals(this.getRestoreTestingSelectionName()) == false)
            return false;
        if (other.getValidationWindowHours() == null ^ this.getValidationWindowHours() == null)
            return false;
        if (other.getValidationWindowHours() != null && other.getValidationWindowHours().equals(this.getValidationWindowHours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getProtectedResourceArns() == null) ? 0 : getProtectedResourceArns().hashCode());
        hashCode = prime * hashCode + ((getProtectedResourceConditions() == null) ? 0 : getProtectedResourceConditions().hashCode());
        hashCode = prime * hashCode + ((getProtectedResourceType() == null) ? 0 : getProtectedResourceType().hashCode());
        hashCode = prime * hashCode + ((getRestoreMetadataOverrides() == null) ? 0 : getRestoreMetadataOverrides().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingPlanName() == null) ? 0 : getRestoreTestingPlanName().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingSelectionName() == null) ? 0 : getRestoreTestingSelectionName().hashCode());
        hashCode = prime * hashCode + ((getValidationWindowHours() == null) ? 0 : getValidationWindowHours().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTestingSelectionForGet clone() {
        try {
            return (RestoreTestingSelectionForGet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RestoreTestingSelectionForGetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
