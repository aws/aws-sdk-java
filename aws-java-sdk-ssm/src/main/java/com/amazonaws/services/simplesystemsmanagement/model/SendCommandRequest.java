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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SendCommand" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendCommandRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The instance IDs where the command should run. You can specify a maximum of 50 IDs. If you prefer not to list
     * individual instance IDs, you can instead send commands to a fleet of instances using the Targets parameter, which
     * accepts EC2 tags. For more information about how to use targets, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending Commands
     * to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a Key,Value combination that you specify.
     * Targets is required if you don't provide one or more instance IDs in the call. For more information about how to
     * use targets, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending Commands
     * to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * Required. The name of the Systems Manager document to run. This can be a public document or a custom document.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number.
     * If you run commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you
     * specify a version number, then you don't need to use the backslash. For example:
     * </p>
     * <p>
     * --document-version "\$DEFAULT"
     * </p>
     * <p>
     * --document-version "\$LATEST"
     * </p>
     * <p>
     * --document-version "3"
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     */
    private String documentHash;
    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     */
    private String documentHashType;
    /**
     * <p>
     * If this time is reached and the command has not already started running, it will not run.
     * </p>
     */
    private Integer timeoutSeconds;
    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The required and optional parameters specified in the document being run.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     * automatically determines the Amazon S3 bucket region.
     * </p>
     */
    private String outputS3Region;
    /**
     * <p>
     * The name of the S3 bucket where command execution responses should be stored.
     * </p>
     */
    private String outputS3BucketName;
    /**
     * <p>
     * The directory structure within the S3 bucket where the responses should be stored.
     * </p>
     */
    private String outputS3KeyPrefix;
    /**
     * <p>
     * (Optional) The maximum number of instances that are allowed to run the command at the same time. You can specify
     * a number such as 10 or a percentage such as 10%. The default value is 50. For more information about how to use
     * MaxConcurrency, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     * >Using Concurrency Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the
     * value of MaxErrors, the systems stops sending the command to additional targets. You can specify a number like 10
     * or a percentage like 10%. The default value is 0. For more information about how to use MaxErrors, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     * >Using Error Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private String maxErrors;
    /**
     * <p>
     * The IAM role that Systems Manager uses to send notifications.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * Configurations for sending notifications.
     * </p>
     */
    private NotificationConfig notificationConfig;
    /**
     * <p>
     * Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs.
     * </p>
     */
    private CloudWatchOutputConfig cloudWatchOutputConfig;

    /**
     * <p>
     * The instance IDs where the command should run. You can specify a maximum of 50 IDs. If you prefer not to list
     * individual instance IDs, you can instead send commands to a fleet of instances using the Targets parameter, which
     * accepts EC2 tags. For more information about how to use targets, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending Commands
     * to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return The instance IDs where the command should run. You can specify a maximum of 50 IDs. If you prefer not to
     *         list individual instance IDs, you can instead send commands to a fleet of instances using the Targets
     *         parameter, which accepts EC2 tags. For more information about how to use targets, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending
     *         Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * The instance IDs where the command should run. You can specify a maximum of 50 IDs. If you prefer not to list
     * individual instance IDs, you can instead send commands to a fleet of instances using the Targets parameter, which
     * accepts EC2 tags. For more information about how to use targets, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending Commands
     * to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs where the command should run. You can specify a maximum of 50 IDs. If you prefer not to
     *        list individual instance IDs, you can instead send commands to a fleet of instances using the Targets
     *        parameter, which accepts EC2 tags. For more information about how to use targets, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending
     *        Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * The instance IDs where the command should run. You can specify a maximum of 50 IDs. If you prefer not to list
     * individual instance IDs, you can instead send commands to a fleet of instances using the Targets parameter, which
     * accepts EC2 tags. For more information about how to use targets, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending Commands
     * to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs where the command should run. You can specify a maximum of 50 IDs. If you prefer not to
     *        list individual instance IDs, you can instead send commands to a fleet of instances using the Targets
     *        parameter, which accepts EC2 tags. For more information about how to use targets, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending
     *        Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance IDs where the command should run. You can specify a maximum of 50 IDs. If you prefer not to list
     * individual instance IDs, you can instead send commands to a fleet of instances using the Targets parameter, which
     * accepts EC2 tags. For more information about how to use targets, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending Commands
     * to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs where the command should run. You can specify a maximum of 50 IDs. If you prefer not to
     *        list individual instance IDs, you can instead send commands to a fleet of instances using the Targets
     *        parameter, which accepts EC2 tags. For more information about how to use targets, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending
     *        Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a Key,Value combination that you specify.
     * Targets is required if you don't provide one or more instance IDs in the call. For more information about how to
     * use targets, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending Commands
     * to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return (Optional) An array of search criteria that targets instances using a Key,Value combination that you
     *         specify. Targets is required if you don't provide one or more instance IDs in the call. For more
     *         information about how to use targets, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending
     *         Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a Key,Value combination that you specify.
     * Targets is required if you don't provide one or more instance IDs in the call. For more information about how to
     * use targets, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending Commands
     * to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param targets
     *        (Optional) An array of search criteria that targets instances using a Key,Value combination that you
     *        specify. Targets is required if you don't provide one or more instance IDs in the call. For more
     *        information about how to use targets, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending
     *        Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new com.amazonaws.internal.SdkInternalList<Target>(targets);
    }

    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a Key,Value combination that you specify.
     * Targets is required if you don't provide one or more instance IDs in the call. For more information about how to
     * use targets, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending Commands
     * to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        (Optional) An array of search criteria that targets instances using a Key,Value combination that you
     *        specify. Targets is required if you don't provide one or more instance IDs in the call. For more
     *        information about how to use targets, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending
     *        Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new com.amazonaws.internal.SdkInternalList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a Key,Value combination that you specify.
     * Targets is required if you don't provide one or more instance IDs in the call. For more information about how to
     * use targets, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending Commands
     * to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param targets
     *        (Optional) An array of search criteria that targets instances using a Key,Value combination that you
     *        specify. Targets is required if you don't provide one or more instance IDs in the call. For more
     *        information about how to use targets, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html">Sending
     *        Commands to a Fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * Required. The name of the Systems Manager document to run. This can be a public document or a custom document.
     * </p>
     * 
     * @param documentName
     *        Required. The name of the Systems Manager document to run. This can be a public document or a custom
     *        document.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * Required. The name of the Systems Manager document to run. This can be a public document or a custom document.
     * </p>
     * 
     * @return Required. The name of the Systems Manager document to run. This can be a public document or a custom
     *         document.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * Required. The name of the Systems Manager document to run. This can be a public document or a custom document.
     * </p>
     * 
     * @param documentName
     *        Required. The name of the Systems Manager document to run. This can be a public document or a custom
     *        document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number.
     * If you run commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you
     * specify a version number, then you don't need to use the backslash. For example:
     * </p>
     * <p>
     * --document-version "\$DEFAULT"
     * </p>
     * <p>
     * --document-version "\$LATEST"
     * </p>
     * <p>
     * --document-version "3"
     * </p>
     * 
     * @param documentVersion
     *        The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version
     *        number. If you run commands by using the AWS CLI, then you must escape the first two options by using a
     *        backslash. If you specify a version number, then you don't need to use the backslash. For example:</p>
     *        <p>
     *        --document-version "\$DEFAULT"
     *        </p>
     *        <p>
     *        --document-version "\$LATEST"
     *        </p>
     *        <p>
     *        --document-version "3"
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number.
     * If you run commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you
     * specify a version number, then you don't need to use the backslash. For example:
     * </p>
     * <p>
     * --document-version "\$DEFAULT"
     * </p>
     * <p>
     * --document-version "\$LATEST"
     * </p>
     * <p>
     * --document-version "3"
     * </p>
     * 
     * @return The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version
     *         number. If you run commands by using the AWS CLI, then you must escape the first two options by using a
     *         backslash. If you specify a version number, then you don't need to use the backslash. For example:</p>
     *         <p>
     *         --document-version "\$DEFAULT"
     *         </p>
     *         <p>
     *         --document-version "\$LATEST"
     *         </p>
     *         <p>
     *         --document-version "3"
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number.
     * If you run commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you
     * specify a version number, then you don't need to use the backslash. For example:
     * </p>
     * <p>
     * --document-version "\$DEFAULT"
     * </p>
     * <p>
     * --document-version "\$LATEST"
     * </p>
     * <p>
     * --document-version "3"
     * </p>
     * 
     * @param documentVersion
     *        The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version
     *        number. If you run commands by using the AWS CLI, then you must escape the first two options by using a
     *        backslash. If you specify a version number, then you don't need to use the backslash. For example:</p>
     *        <p>
     *        --document-version "\$DEFAULT"
     *        </p>
     *        <p>
     *        --document-version "\$LATEST"
     *        </p>
     *        <p>
     *        --document-version "3"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param documentHash
     *        The Sha256 or Sha1 hash created by the system when the document was created. </p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     */

    public void setDocumentHash(String documentHash) {
        this.documentHash = documentHash;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @return The Sha256 or Sha1 hash created by the system when the document was created. </p> <note>
     *         <p>
     *         Sha1 hashes have been deprecated.
     *         </p>
     */

    public String getDocumentHash() {
        return this.documentHash;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param documentHash
     *        The Sha256 or Sha1 hash created by the system when the document was created. </p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withDocumentHash(String documentHash) {
        setDocumentHash(documentHash);
        return this;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param documentHashType
     *        Sha256 or Sha1.</p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @see DocumentHashType
     */

    public void setDocumentHashType(String documentHashType) {
        this.documentHashType = documentHashType;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @return Sha256 or Sha1.</p> <note>
     *         <p>
     *         Sha1 hashes have been deprecated.
     *         </p>
     * @see DocumentHashType
     */

    public String getDocumentHashType() {
        return this.documentHashType;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param documentHashType
     *        Sha256 or Sha1.</p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentHashType
     */

    public SendCommandRequest withDocumentHashType(String documentHashType) {
        setDocumentHashType(documentHashType);
        return this;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param documentHashType
     *        Sha256 or Sha1.</p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @see DocumentHashType
     */

    public void setDocumentHashType(DocumentHashType documentHashType) {
        withDocumentHashType(documentHashType);
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param documentHashType
     *        Sha256 or Sha1.</p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentHashType
     */

    public SendCommandRequest withDocumentHashType(DocumentHashType documentHashType) {
        this.documentHashType = documentHashType.toString();
        return this;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running, it will not run.
     * </p>
     * 
     * @param timeoutSeconds
     *        If this time is reached and the command has not already started running, it will not run.
     */

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running, it will not run.
     * </p>
     * 
     * @return If this time is reached and the command has not already started running, it will not run.
     */

    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running, it will not run.
     * </p>
     * 
     * @param timeoutSeconds
     *        If this time is reached and the command has not already started running, it will not run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withTimeoutSeconds(Integer timeoutSeconds) {
        setTimeoutSeconds(timeoutSeconds);
        return this;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     * 
     * @param comment
     *        User-specified information about the command, such as a brief description of what the command should do.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     * 
     * @return User-specified information about the command, such as a brief description of what the command should do.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     * 
     * @param comment
     *        User-specified information about the command, such as a brief description of what the command should do.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The required and optional parameters specified in the document being run.
     * </p>
     * 
     * @return The required and optional parameters specified in the document being run.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The required and optional parameters specified in the document being run.
     * </p>
     * 
     * @param parameters
     *        The required and optional parameters specified in the document being run.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The required and optional parameters specified in the document being run.
     * </p>
     * 
     * @param parameters
     *        The required and optional parameters specified in the document being run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public SendCommandRequest addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     * automatically determines the Amazon S3 bucket region.
     * </p>
     * 
     * @param outputS3Region
     *        (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     *        automatically determines the Amazon S3 bucket region.
     */

    public void setOutputS3Region(String outputS3Region) {
        this.outputS3Region = outputS3Region;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     * automatically determines the Amazon S3 bucket region.
     * </p>
     * 
     * @return (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     *         automatically determines the Amazon S3 bucket region.
     */

    public String getOutputS3Region() {
        return this.outputS3Region;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     * automatically determines the Amazon S3 bucket region.
     * </p>
     * 
     * @param outputS3Region
     *        (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager
     *        automatically determines the Amazon S3 bucket region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withOutputS3Region(String outputS3Region) {
        setOutputS3Region(outputS3Region);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket where command execution responses should be stored.
     * </p>
     * 
     * @param outputS3BucketName
     *        The name of the S3 bucket where command execution responses should be stored.
     */

    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where command execution responses should be stored.
     * </p>
     * 
     * @return The name of the S3 bucket where command execution responses should be stored.
     */

    public String getOutputS3BucketName() {
        return this.outputS3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where command execution responses should be stored.
     * </p>
     * 
     * @param outputS3BucketName
     *        The name of the S3 bucket where command execution responses should be stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withOutputS3BucketName(String outputS3BucketName) {
        setOutputS3BucketName(outputS3BucketName);
        return this;
    }

    /**
     * <p>
     * The directory structure within the S3 bucket where the responses should be stored.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The directory structure within the S3 bucket where the responses should be stored.
     */

    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The directory structure within the S3 bucket where the responses should be stored.
     * </p>
     * 
     * @return The directory structure within the S3 bucket where the responses should be stored.
     */

    public String getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix;
    }

    /**
     * <p>
     * The directory structure within the S3 bucket where the responses should be stored.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The directory structure within the S3 bucket where the responses should be stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        setOutputS3KeyPrefix(outputS3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of instances that are allowed to run the command at the same time. You can specify
     * a number such as 10 or a percentage such as 10%. The default value is 50. For more information about how to use
     * MaxConcurrency, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     * >Using Concurrency Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param maxConcurrency
     *        (Optional) The maximum number of instances that are allowed to run the command at the same time. You can
     *        specify a number such as 10 or a percentage such as 10%. The default value is 50. For more information
     *        about how to use MaxConcurrency, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     *        >Using Concurrency Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * (Optional) The maximum number of instances that are allowed to run the command at the same time. You can specify
     * a number such as 10 or a percentage such as 10%. The default value is 50. For more information about how to use
     * MaxConcurrency, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     * >Using Concurrency Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return (Optional) The maximum number of instances that are allowed to run the command at the same time. You can
     *         specify a number such as 10 or a percentage such as 10%. The default value is 50. For more information
     *         about how to use MaxConcurrency, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     *         >Using Concurrency Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * (Optional) The maximum number of instances that are allowed to run the command at the same time. You can specify
     * a number such as 10 or a percentage such as 10%. The default value is 50. For more information about how to use
     * MaxConcurrency, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     * >Using Concurrency Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param maxConcurrency
     *        (Optional) The maximum number of instances that are allowed to run the command at the same time. You can
     *        specify a number such as 10 or a percentage such as 10%. The default value is 50. For more information
     *        about how to use MaxConcurrency, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     *        >Using Concurrency Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the
     * value of MaxErrors, the systems stops sending the command to additional targets. You can specify a number like 10
     * or a percentage like 10%. The default value is 0. For more information about how to use MaxErrors, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     * >Using Error Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param maxErrors
     *        The maximum number of errors allowed without the command failing. When the command fails one more time
     *        beyond the value of MaxErrors, the systems stops sending the command to additional targets. You can
     *        specify a number like 10 or a percentage like 10%. The default value is 0. For more information about how
     *        to use MaxErrors, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     *        >Using Error Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the
     * value of MaxErrors, the systems stops sending the command to additional targets. You can specify a number like 10
     * or a percentage like 10%. The default value is 0. For more information about how to use MaxErrors, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     * >Using Error Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return The maximum number of errors allowed without the command failing. When the command fails one more time
     *         beyond the value of MaxErrors, the systems stops sending the command to additional targets. You can
     *         specify a number like 10 or a percentage like 10%. The default value is 0. For more information about how
     *         to use MaxErrors, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     *         >Using Error Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the
     * value of MaxErrors, the systems stops sending the command to additional targets. You can specify a number like 10
     * or a percentage like 10%. The default value is 0. For more information about how to use MaxErrors, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     * >Using Error Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param maxErrors
     *        The maximum number of errors allowed without the command failing. When the command fails one more time
     *        beyond the value of MaxErrors, the systems stops sending the command to additional targets. You can
     *        specify a number like 10 or a percentage like 10%. The default value is 0. For more information about how
     *        to use MaxErrors, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     *        >Using Error Controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * The IAM role that Systems Manager uses to send notifications.
     * </p>
     * 
     * @param serviceRoleArn
     *        The IAM role that Systems Manager uses to send notifications.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The IAM role that Systems Manager uses to send notifications.
     * </p>
     * 
     * @return The IAM role that Systems Manager uses to send notifications.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The IAM role that Systems Manager uses to send notifications.
     * </p>
     * 
     * @param serviceRoleArn
     *        The IAM role that Systems Manager uses to send notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * Configurations for sending notifications.
     * </p>
     * 
     * @param notificationConfig
     *        Configurations for sending notifications.
     */

    public void setNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications.
     * </p>
     * 
     * @return Configurations for sending notifications.
     */

    public NotificationConfig getNotificationConfig() {
        return this.notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications.
     * </p>
     * 
     * @param notificationConfig
     *        Configurations for sending notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withNotificationConfig(NotificationConfig notificationConfig) {
        setNotificationConfig(notificationConfig);
        return this;
    }

    /**
     * <p>
     * Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchOutputConfig
     *        Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs.
     */

    public void setCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
        this.cloudWatchOutputConfig = cloudWatchOutputConfig;
    }

    /**
     * <p>
     * Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs.
     */

    public CloudWatchOutputConfig getCloudWatchOutputConfig() {
        return this.cloudWatchOutputConfig;
    }

    /**
     * <p>
     * Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchOutputConfig
     *        Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendCommandRequest withCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
        setCloudWatchOutputConfig(cloudWatchOutputConfig);
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getDocumentName() != null)
            sb.append("DocumentName: ").append(getDocumentName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getDocumentHash() != null)
            sb.append("DocumentHash: ").append(getDocumentHash()).append(",");
        if (getDocumentHashType() != null)
            sb.append("DocumentHashType: ").append(getDocumentHashType()).append(",");
        if (getTimeoutSeconds() != null)
            sb.append("TimeoutSeconds: ").append(getTimeoutSeconds()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getOutputS3Region() != null)
            sb.append("OutputS3Region: ").append(getOutputS3Region()).append(",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: ").append(getOutputS3BucketName()).append(",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: ").append(getOutputS3KeyPrefix()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: ").append(getMaxErrors()).append(",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getNotificationConfig() != null)
            sb.append("NotificationConfig: ").append(getNotificationConfig()).append(",");
        if (getCloudWatchOutputConfig() != null)
            sb.append("CloudWatchOutputConfig: ").append(getCloudWatchOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendCommandRequest == false)
            return false;
        SendCommandRequest other = (SendCommandRequest) obj;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getDocumentHash() == null ^ this.getDocumentHash() == null)
            return false;
        if (other.getDocumentHash() != null && other.getDocumentHash().equals(this.getDocumentHash()) == false)
            return false;
        if (other.getDocumentHashType() == null ^ this.getDocumentHashType() == null)
            return false;
        if (other.getDocumentHashType() != null && other.getDocumentHashType().equals(this.getDocumentHashType()) == false)
            return false;
        if (other.getTimeoutSeconds() == null ^ this.getTimeoutSeconds() == null)
            return false;
        if (other.getTimeoutSeconds() != null && other.getTimeoutSeconds().equals(this.getTimeoutSeconds()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getOutputS3Region() == null ^ this.getOutputS3Region() == null)
            return false;
        if (other.getOutputS3Region() != null && other.getOutputS3Region().equals(this.getOutputS3Region()) == false)
            return false;
        if (other.getOutputS3BucketName() == null ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null && other.getOutputS3BucketName().equals(this.getOutputS3BucketName()) == false)
            return false;
        if (other.getOutputS3KeyPrefix() == null ^ this.getOutputS3KeyPrefix() == null)
            return false;
        if (other.getOutputS3KeyPrefix() != null && other.getOutputS3KeyPrefix().equals(this.getOutputS3KeyPrefix()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getNotificationConfig() == null ^ this.getNotificationConfig() == null)
            return false;
        if (other.getNotificationConfig() != null && other.getNotificationConfig().equals(this.getNotificationConfig()) == false)
            return false;
        if (other.getCloudWatchOutputConfig() == null ^ this.getCloudWatchOutputConfig() == null)
            return false;
        if (other.getCloudWatchOutputConfig() != null && other.getCloudWatchOutputConfig().equals(this.getCloudWatchOutputConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getDocumentHash() == null) ? 0 : getDocumentHash().hashCode());
        hashCode = prime * hashCode + ((getDocumentHashType() == null) ? 0 : getDocumentHashType().hashCode());
        hashCode = prime * hashCode + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Region() == null) ? 0 : getOutputS3Region().hashCode());
        hashCode = prime * hashCode + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfig() == null) ? 0 : getNotificationConfig().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchOutputConfig() == null) ? 0 : getCloudWatchOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public SendCommandRequest clone() {
        return (SendCommandRequest) super.clone();
    }

}
