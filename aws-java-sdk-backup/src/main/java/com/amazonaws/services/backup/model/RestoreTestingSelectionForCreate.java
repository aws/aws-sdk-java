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
 * This contains metadata about a specific restore testing selection.
 * </p>
 * <p>
 * ProtectedResourceType is required, such as Amazon EBS or Amazon EC2.
 * </p>
 * <p>
 * This consists of <code>RestoreTestingSelectionName</code>, <code>ProtectedResourceType</code>, and one of the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ProtectedResourceArns</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ProtectedResourceConditions</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Each protected resource type can have one single value.
 * </p>
 * <p>
 * A restore testing selection can include a wildcard value ("*") for <code>ProtectedResourceArns</code> along with
 * <code>ProtectedResourceConditions</code>. Alternatively, you can include up to 30 specific protected resource ARNs in
 * <code>ProtectedResourceArns</code>.
 * </p>
 * <p>
 * <code>ProtectedResourceConditions</code> examples include as <code>StringEquals</code> and
 * <code>StringNotEquals</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RestoreTestingSelectionForCreate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTestingSelectionForCreate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for example:
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * Each protected resource can be filtered by its specific ARNs, such as
     * <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or by a wildcard:
     * <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     */
    private java.util.List<String> protectedResourceArns;
    /**
     * <p>
     * If you have included the wildcard in ProtectedResourceArns, you can include resource conditions, such as
     * <code>ProtectedResourceConditions: { StringEquals: [{ key: "XXXX", value: "YYYY" }]</code>.
     * </p>
     */
    private ProtectedResourceConditions protectedResourceConditions;
    /**
     * <p>
     * The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon EBS
     * volume or an Amazon RDS database.
     * </p>
     * <p>
     * Supported resource types accepted include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Aurora</code> for Amazon Aurora
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DocumentDB</code> for Amazon DocumentDB (with MongoDB compatibility)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DynamoDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2</code> for Amazon Elastic Compute Cloud
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FSx</code> for Amazon FSx
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Neptune</code> for Amazon Neptune
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code> for Amazon S3
     * </p>
     * </li>
     * </ul>
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
     * The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for example:
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for
     *        example: <code>arn:aws:iam::123456789012:role/S3Access</code>.
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
     *         example: <code>arn:aws:iam::123456789012:role/S3Access</code>.
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
     *        example: <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForCreate withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * Each protected resource can be filtered by its specific ARNs, such as
     * <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or by a wildcard:
     * <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     * 
     * @return Each protected resource can be filtered by its specific ARNs, such as
     *         <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or by a wildcard:
     *         <code>ProtectedResourceArns: ["*"]</code>, but not both.
     */

    public java.util.List<String> getProtectedResourceArns() {
        return protectedResourceArns;
    }

    /**
     * <p>
     * Each protected resource can be filtered by its specific ARNs, such as
     * <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or by a wildcard:
     * <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     * 
     * @param protectedResourceArns
     *        Each protected resource can be filtered by its specific ARNs, such as
     *        <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or by a wildcard:
     *        <code>ProtectedResourceArns: ["*"]</code>, but not both.
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
     * Each protected resource can be filtered by its specific ARNs, such as
     * <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or by a wildcard:
     * <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtectedResourceArns(java.util.Collection)} or
     * {@link #withProtectedResourceArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param protectedResourceArns
     *        Each protected resource can be filtered by its specific ARNs, such as
     *        <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or by a wildcard:
     *        <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForCreate withProtectedResourceArns(String... protectedResourceArns) {
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
     * Each protected resource can be filtered by its specific ARNs, such as
     * <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or by a wildcard:
     * <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     * 
     * @param protectedResourceArns
     *        Each protected resource can be filtered by its specific ARNs, such as
     *        <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or by a wildcard:
     *        <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForCreate withProtectedResourceArns(java.util.Collection<String> protectedResourceArns) {
        setProtectedResourceArns(protectedResourceArns);
        return this;
    }

    /**
     * <p>
     * If you have included the wildcard in ProtectedResourceArns, you can include resource conditions, such as
     * <code>ProtectedResourceConditions: { StringEquals: [{ key: "XXXX", value: "YYYY" }]</code>.
     * </p>
     * 
     * @param protectedResourceConditions
     *        If you have included the wildcard in ProtectedResourceArns, you can include resource conditions, such as
     *        <code>ProtectedResourceConditions: { StringEquals: [{ key: "XXXX", value: "YYYY" }]</code>.
     */

    public void setProtectedResourceConditions(ProtectedResourceConditions protectedResourceConditions) {
        this.protectedResourceConditions = protectedResourceConditions;
    }

    /**
     * <p>
     * If you have included the wildcard in ProtectedResourceArns, you can include resource conditions, such as
     * <code>ProtectedResourceConditions: { StringEquals: [{ key: "XXXX", value: "YYYY" }]</code>.
     * </p>
     * 
     * @return If you have included the wildcard in ProtectedResourceArns, you can include resource conditions, such as
     *         <code>ProtectedResourceConditions: { StringEquals: [{ key: "XXXX", value: "YYYY" }]</code>.
     */

    public ProtectedResourceConditions getProtectedResourceConditions() {
        return this.protectedResourceConditions;
    }

    /**
     * <p>
     * If you have included the wildcard in ProtectedResourceArns, you can include resource conditions, such as
     * <code>ProtectedResourceConditions: { StringEquals: [{ key: "XXXX", value: "YYYY" }]</code>.
     * </p>
     * 
     * @param protectedResourceConditions
     *        If you have included the wildcard in ProtectedResourceArns, you can include resource conditions, such as
     *        <code>ProtectedResourceConditions: { StringEquals: [{ key: "XXXX", value: "YYYY" }]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForCreate withProtectedResourceConditions(ProtectedResourceConditions protectedResourceConditions) {
        setProtectedResourceConditions(protectedResourceConditions);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon EBS
     * volume or an Amazon RDS database.
     * </p>
     * <p>
     * Supported resource types accepted include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Aurora</code> for Amazon Aurora
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DocumentDB</code> for Amazon DocumentDB (with MongoDB compatibility)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DynamoDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2</code> for Amazon Elastic Compute Cloud
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FSx</code> for Amazon FSx
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Neptune</code> for Amazon Neptune
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code> for Amazon S3
     * </p>
     * </li>
     * </ul>
     * 
     * @param protectedResourceType
     *        The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon
     *        EBS volume or an Amazon RDS database.</p>
     *        <p>
     *        Supported resource types accepted include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Aurora</code> for Amazon Aurora
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DocumentDB</code> for Amazon DocumentDB (with MongoDB compatibility)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DynamoDB</code> for Amazon DynamoDB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS</code> for Amazon Elastic Block Store
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EC2</code> for Amazon Elastic Compute Cloud
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EFS</code> for Amazon Elastic File System
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FSx</code> for Amazon FSx
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Neptune</code> for Amazon Neptune
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RDS</code> for Amazon Relational Database Service
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code> for Amazon S3
     *        </p>
     *        </li>
     */

    public void setProtectedResourceType(String protectedResourceType) {
        this.protectedResourceType = protectedResourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon EBS
     * volume or an Amazon RDS database.
     * </p>
     * <p>
     * Supported resource types accepted include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Aurora</code> for Amazon Aurora
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DocumentDB</code> for Amazon DocumentDB (with MongoDB compatibility)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DynamoDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2</code> for Amazon Elastic Compute Cloud
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FSx</code> for Amazon FSx
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Neptune</code> for Amazon Neptune
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code> for Amazon S3
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon
     *         EBS volume or an Amazon RDS database.</p>
     *         <p>
     *         Supported resource types accepted include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Aurora</code> for Amazon Aurora
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DocumentDB</code> for Amazon DocumentDB (with MongoDB compatibility)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DynamoDB</code> for Amazon DynamoDB
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EBS</code> for Amazon Elastic Block Store
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EC2</code> for Amazon Elastic Compute Cloud
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EFS</code> for Amazon Elastic File System
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FSx</code> for Amazon FSx
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Neptune</code> for Amazon Neptune
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RDS</code> for Amazon Relational Database Service
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code> for Amazon S3
     *         </p>
     *         </li>
     */

    public String getProtectedResourceType() {
        return this.protectedResourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon EBS
     * volume or an Amazon RDS database.
     * </p>
     * <p>
     * Supported resource types accepted include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Aurora</code> for Amazon Aurora
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DocumentDB</code> for Amazon DocumentDB (with MongoDB compatibility)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DynamoDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2</code> for Amazon Elastic Compute Cloud
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FSx</code> for Amazon FSx
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Neptune</code> for Amazon Neptune
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code> for Amazon S3
     * </p>
     * </li>
     * </ul>
     * 
     * @param protectedResourceType
     *        The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon
     *        EBS volume or an Amazon RDS database.</p>
     *        <p>
     *        Supported resource types accepted include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Aurora</code> for Amazon Aurora
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DocumentDB</code> for Amazon DocumentDB (with MongoDB compatibility)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DynamoDB</code> for Amazon DynamoDB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS</code> for Amazon Elastic Block Store
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EC2</code> for Amazon Elastic Compute Cloud
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EFS</code> for Amazon Elastic File System
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FSx</code> for Amazon FSx
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Neptune</code> for Amazon Neptune
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RDS</code> for Amazon Relational Database Service
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code> for Amazon S3
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForCreate withProtectedResourceType(String protectedResourceType) {
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

    public RestoreTestingSelectionForCreate withRestoreMetadataOverrides(java.util.Map<String, String> restoreMetadataOverrides) {
        setRestoreMetadataOverrides(restoreMetadataOverrides);
        return this;
    }

    /**
     * Add a single RestoreMetadataOverrides entry
     *
     * @see RestoreTestingSelectionForCreate#withRestoreMetadataOverrides
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForCreate addRestoreMetadataOverridesEntry(String key, String value) {
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

    public RestoreTestingSelectionForCreate clearRestoreMetadataOverridesEntries() {
        this.restoreMetadataOverrides = null;
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

    public RestoreTestingSelectionForCreate withRestoreTestingSelectionName(String restoreTestingSelectionName) {
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

    public RestoreTestingSelectionForCreate withValidationWindowHours(Integer validationWindowHours) {
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

        if (obj instanceof RestoreTestingSelectionForCreate == false)
            return false;
        RestoreTestingSelectionForCreate other = (RestoreTestingSelectionForCreate) obj;
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

        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getProtectedResourceArns() == null) ? 0 : getProtectedResourceArns().hashCode());
        hashCode = prime * hashCode + ((getProtectedResourceConditions() == null) ? 0 : getProtectedResourceConditions().hashCode());
        hashCode = prime * hashCode + ((getProtectedResourceType() == null) ? 0 : getProtectedResourceType().hashCode());
        hashCode = prime * hashCode + ((getRestoreMetadataOverrides() == null) ? 0 : getRestoreMetadataOverrides().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingSelectionName() == null) ? 0 : getRestoreTestingSelectionName().hashCode());
        hashCode = prime * hashCode + ((getValidationWindowHours() == null) ? 0 : getValidationWindowHours().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTestingSelectionForCreate clone() {
        try {
            return (RestoreTestingSelectionForCreate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RestoreTestingSelectionForCreateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
