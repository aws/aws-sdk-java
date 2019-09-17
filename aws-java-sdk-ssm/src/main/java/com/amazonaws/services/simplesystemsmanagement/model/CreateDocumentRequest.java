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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A valid JSON or YAML string.
     * </p>
     */
    private String content;
    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a document.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AttachmentsSource> attachments;
    /**
     * <p>
     * A name for the Systems Manager document.
     * </p>
     * <important>
     * <p>
     * Do not use the following to begin the names of documents you create. They are reserved by AWS for use as document
     * prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amzn</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     */
    private String name;
    /**
     * <p>
     * An optional field specifying the version of the artifact you are creating with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The type of document to create. Valid document types include: <code>Command</code>, <code>Policy</code>,
     * <code>Automation</code>, <code>Session</code>, and <code>Package</code>.
     * </p>
     */
    private String documentType;
    /**
     * <p>
     * Specify the document format for the request. The document format can be either JSON or YAML. JSON is the default
     * format.
     * </p>
     */
    private String documentFormat;
    /**
     * <p>
     * Specify a target type to define the kinds of resources the document can run on. For example, to run a document on
     * EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of '/' the document can
     * run on all types of resources. If you don't specify a value, the document can't run on any resources. For a list
     * of valid resource types, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag an SSM document to identify the types of
     * targets or the environment where it will run. In this case, you could specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing SSM document, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * A valid JSON or YAML string.
     * </p>
     * 
     * @param content
     *        A valid JSON or YAML string.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * A valid JSON or YAML string.
     * </p>
     * 
     * @return A valid JSON or YAML string.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * A valid JSON or YAML string.
     * </p>
     * 
     * @param content
     *        A valid JSON or YAML string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a document.
     * </p>
     * 
     * @return A list of key and value pairs that describe attachments to a version of a document.
     */

    public java.util.List<AttachmentsSource> getAttachments() {
        if (attachments == null) {
            attachments = new com.amazonaws.internal.SdkInternalList<AttachmentsSource>();
        }
        return attachments;
    }

    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a document.
     * </p>
     * 
     * @param attachments
     *        A list of key and value pairs that describe attachments to a version of a document.
     */

    public void setAttachments(java.util.Collection<AttachmentsSource> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new com.amazonaws.internal.SdkInternalList<AttachmentsSource>(attachments);
    }

    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        A list of key and value pairs that describe attachments to a version of a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentRequest withAttachments(AttachmentsSource... attachments) {
        if (this.attachments == null) {
            setAttachments(new com.amazonaws.internal.SdkInternalList<AttachmentsSource>(attachments.length));
        }
        for (AttachmentsSource ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a document.
     * </p>
     * 
     * @param attachments
     *        A list of key and value pairs that describe attachments to a version of a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentRequest withAttachments(java.util.Collection<AttachmentsSource> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * A name for the Systems Manager document.
     * </p>
     * <important>
     * <p>
     * Do not use the following to begin the names of documents you create. They are reserved by AWS for use as document
     * prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amzn</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param name
     *        A name for the Systems Manager document.</p> <important>
     *        <p>
     *        Do not use the following to begin the names of documents you create. They are reserved by AWS for use as
     *        document prefixes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aws</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>amazon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>amzn</code>
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the Systems Manager document.
     * </p>
     * <important>
     * <p>
     * Do not use the following to begin the names of documents you create. They are reserved by AWS for use as document
     * prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amzn</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @return A name for the Systems Manager document.</p> <important>
     *         <p>
     *         Do not use the following to begin the names of documents you create. They are reserved by AWS for use as
     *         document prefixes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>aws</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>amazon</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>amzn</code>
     *         </p>
     *         </li>
     *         </ul>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the Systems Manager document.
     * </p>
     * <important>
     * <p>
     * Do not use the following to begin the names of documents you create. They are reserved by AWS for use as document
     * prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>amzn</code>
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param name
     *        A name for the Systems Manager document.</p> <important>
     *        <p>
     *        Do not use the following to begin the names of documents you create. They are reserved by AWS for use as
     *        document prefixes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aws</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>amazon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>amzn</code>
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact you are creating with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * </p>
     * 
     * @param versionName
     *        An optional field specifying the version of the artifact you are creating with the document. For example,
     *        "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact you are creating with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * </p>
     * 
     * @return An optional field specifying the version of the artifact you are creating with the document. For example,
     *         "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact you are creating with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * </p>
     * 
     * @param versionName
     *        An optional field specifying the version of the artifact you are creating with the document. For example,
     *        "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentRequest withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The type of document to create. Valid document types include: <code>Command</code>, <code>Policy</code>,
     * <code>Automation</code>, <code>Session</code>, and <code>Package</code>.
     * </p>
     * 
     * @param documentType
     *        The type of document to create. Valid document types include: <code>Command</code>, <code>Policy</code>,
     *        <code>Automation</code>, <code>Session</code>, and <code>Package</code>.
     * @see DocumentType
     */

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p>
     * The type of document to create. Valid document types include: <code>Command</code>, <code>Policy</code>,
     * <code>Automation</code>, <code>Session</code>, and <code>Package</code>.
     * </p>
     * 
     * @return The type of document to create. Valid document types include: <code>Command</code>, <code>Policy</code>,
     *         <code>Automation</code>, <code>Session</code>, and <code>Package</code>.
     * @see DocumentType
     */

    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * <p>
     * The type of document to create. Valid document types include: <code>Command</code>, <code>Policy</code>,
     * <code>Automation</code>, <code>Session</code>, and <code>Package</code>.
     * </p>
     * 
     * @param documentType
     *        The type of document to create. Valid document types include: <code>Command</code>, <code>Policy</code>,
     *        <code>Automation</code>, <code>Session</code>, and <code>Package</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentType
     */

    public CreateDocumentRequest withDocumentType(String documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p>
     * The type of document to create. Valid document types include: <code>Command</code>, <code>Policy</code>,
     * <code>Automation</code>, <code>Session</code>, and <code>Package</code>.
     * </p>
     * 
     * @param documentType
     *        The type of document to create. Valid document types include: <code>Command</code>, <code>Policy</code>,
     *        <code>Automation</code>, <code>Session</code>, and <code>Package</code>.
     * @see DocumentType
     */

    public void setDocumentType(DocumentType documentType) {
        withDocumentType(documentType);
    }

    /**
     * <p>
     * The type of document to create. Valid document types include: <code>Command</code>, <code>Policy</code>,
     * <code>Automation</code>, <code>Session</code>, and <code>Package</code>.
     * </p>
     * 
     * @param documentType
     *        The type of document to create. Valid document types include: <code>Command</code>, <code>Policy</code>,
     *        <code>Automation</code>, <code>Session</code>, and <code>Package</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentType
     */

    public CreateDocumentRequest withDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
        return this;
    }

    /**
     * <p>
     * Specify the document format for the request. The document format can be either JSON or YAML. JSON is the default
     * format.
     * </p>
     * 
     * @param documentFormat
     *        Specify the document format for the request. The document format can be either JSON or YAML. JSON is the
     *        default format.
     * @see DocumentFormat
     */

    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
    }

    /**
     * <p>
     * Specify the document format for the request. The document format can be either JSON or YAML. JSON is the default
     * format.
     * </p>
     * 
     * @return Specify the document format for the request. The document format can be either JSON or YAML. JSON is the
     *         default format.
     * @see DocumentFormat
     */

    public String getDocumentFormat() {
        return this.documentFormat;
    }

    /**
     * <p>
     * Specify the document format for the request. The document format can be either JSON or YAML. JSON is the default
     * format.
     * </p>
     * 
     * @param documentFormat
     *        Specify the document format for the request. The document format can be either JSON or YAML. JSON is the
     *        default format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentFormat
     */

    public CreateDocumentRequest withDocumentFormat(String documentFormat) {
        setDocumentFormat(documentFormat);
        return this;
    }

    /**
     * <p>
     * Specify the document format for the request. The document format can be either JSON or YAML. JSON is the default
     * format.
     * </p>
     * 
     * @param documentFormat
     *        Specify the document format for the request. The document format can be either JSON or YAML. JSON is the
     *        default format.
     * @see DocumentFormat
     */

    public void setDocumentFormat(DocumentFormat documentFormat) {
        withDocumentFormat(documentFormat);
    }

    /**
     * <p>
     * Specify the document format for the request. The document format can be either JSON or YAML. JSON is the default
     * format.
     * </p>
     * 
     * @param documentFormat
     *        Specify the document format for the request. The document format can be either JSON or YAML. JSON is the
     *        default format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentFormat
     */

    public CreateDocumentRequest withDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
        return this;
    }

    /**
     * <p>
     * Specify a target type to define the kinds of resources the document can run on. For example, to run a document on
     * EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of '/' the document can
     * run on all types of resources. If you don't specify a value, the document can't run on any resources. For a list
     * of valid resource types, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param targetType
     *        Specify a target type to define the kinds of resources the document can run on. For example, to run a
     *        document on EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of '/'
     *        the document can run on all types of resources. If you don't specify a value, the document can't run on
     *        any resources. For a list of valid resource types, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        >AWS Resource Types Reference</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * Specify a target type to define the kinds of resources the document can run on. For example, to run a document on
     * EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of '/' the document can
     * run on all types of resources. If you don't specify a value, the document can't run on any resources. For a list
     * of valid resource types, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @return Specify a target type to define the kinds of resources the document can run on. For example, to run a
     *         document on EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of
     *         '/' the document can run on all types of resources. If you don't specify a value, the document can't run
     *         on any resources. For a list of valid resource types, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     *         Resource Types Reference</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * Specify a target type to define the kinds of resources the document can run on. For example, to run a document on
     * EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of '/' the document can
     * run on all types of resources. If you don't specify a value, the document can't run on any resources. For a list
     * of valid resource types, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param targetType
     *        Specify a target type to define the kinds of resources the document can run on. For example, to run a
     *        document on EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of '/'
     *        the document can run on all types of resources. If you don't specify a value, the document can't run on
     *        any resources. For a list of valid resource types, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        >AWS Resource Types Reference</a> in the <i>AWS CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentRequest withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag an SSM document to identify the types of
     * targets or the environment where it will run. In this case, you could specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing SSM document, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * 
     * @return Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different
     *         ways, such as by purpose, owner, or environment. For example, you might want to tag an SSM document to
     *         identify the types of targets or the environment where it will run. In this case, you could specify the
     *         following key name/value pairs:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key=OS,Value=Windows</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=Environment,Value=Production</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         To add tags to an existing SSM document, use the <a>AddTagsToResource</a> action.
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
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag an SSM document to identify the types of
     * targets or the environment where it will run. In this case, you could specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing SSM document, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different
     *        ways, such as by purpose, owner, or environment. For example, you might want to tag an SSM document to
     *        identify the types of targets or the environment where it will run. In this case, you could specify the
     *        following key name/value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=OS,Value=Windows</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=Environment,Value=Production</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        To add tags to an existing SSM document, use the <a>AddTagsToResource</a> action.
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
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag an SSM document to identify the types of
     * targets or the environment where it will run. In this case, you could specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing SSM document, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different
     *        ways, such as by purpose, owner, or environment. For example, you might want to tag an SSM document to
     *        identify the types of targets or the environment where it will run. In this case, you could specify the
     *        following key name/value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=OS,Value=Windows</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=Environment,Value=Production</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        To add tags to an existing SSM document, use the <a>AddTagsToResource</a> action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentRequest withTags(Tag... tags) {
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
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag an SSM document to identify the types of
     * targets or the environment where it will run. In this case, you could specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing SSM document, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different
     *        ways, such as by purpose, owner, or environment. For example, you might want to tag an SSM document to
     *        identify the types of targets or the environment where it will run. In this case, you could specify the
     *        following key name/value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=OS,Value=Windows</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=Environment,Value=Production</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        To add tags to an existing SSM document, use the <a>AddTagsToResource</a> action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getDocumentType() != null)
            sb.append("DocumentType: ").append(getDocumentType()).append(",");
        if (getDocumentFormat() != null)
            sb.append("DocumentFormat: ").append(getDocumentFormat()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDocumentRequest == false)
            return false;
        CreateDocumentRequest other = (CreateDocumentRequest) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        if (other.getDocumentFormat() == null ^ this.getDocumentFormat() == null)
            return false;
        if (other.getDocumentFormat() != null && other.getDocumentFormat().equals(this.getDocumentFormat()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        hashCode = prime * hashCode + ((getDocumentFormat() == null) ? 0 : getDocumentFormat().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDocumentRequest clone() {
        return (CreateDocumentRequest) super.clone();
    }

}
