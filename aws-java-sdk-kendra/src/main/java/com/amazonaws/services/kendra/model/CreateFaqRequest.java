/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateFaq" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFaqRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The name that should be associated with the FAQ.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the FAQ.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The S3 location of the FAQ input data.
     * </p>
     */
    private S3Path s3Path;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     * Kendra</a>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A list of key-value pairs that identify the FAQ. You can use the tags to identify and organize your resources and
     * to control access to resources.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The format of the input file. You can choose between a basic CSV format, a CSV format that includes customs
     * attributes in a header, and a JSON format that includes custom attributes.
     * </p>
     * <p>
     * The format must match the format of the file stored in the S3 bucket identified in the <code>S3Path</code>
     * parameter.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding
     * questions and answers</a>.
     * </p>
     */
    private String fileFormat;
    /**
     * <p>
     * A token that you provide to identify the request to create a FAQ. Multiple calls to the
     * <code>CreateFaqRequest</code> operation with the same client token will create only one FAQ.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the FAQ.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * 
     * @return The identifier of the index that contains the FAQ.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The name that should be associated with the FAQ.
     * </p>
     * 
     * @param name
     *        The name that should be associated with the FAQ.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that should be associated with the FAQ.
     * </p>
     * 
     * @return The name that should be associated with the FAQ.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that should be associated with the FAQ.
     * </p>
     * 
     * @param name
     *        The name that should be associated with the FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the FAQ.
     * </p>
     * 
     * @param description
     *        A description of the FAQ.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the FAQ.
     * </p>
     * 
     * @return A description of the FAQ.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the FAQ.
     * </p>
     * 
     * @param description
     *        A description of the FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The S3 location of the FAQ input data.
     * </p>
     * 
     * @param s3Path
     *        The S3 location of the FAQ input data.
     */

    public void setS3Path(S3Path s3Path) {
        this.s3Path = s3Path;
    }

    /**
     * <p>
     * The S3 location of the FAQ input data.
     * </p>
     * 
     * @return The S3 location of the FAQ input data.
     */

    public S3Path getS3Path() {
        return this.s3Path;
    }

    /**
     * <p>
     * The S3 location of the FAQ input data.
     * </p>
     * 
     * @param s3Path
     *        The S3 location of the FAQ input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withS3Path(S3Path s3Path) {
        setS3Path(s3Path);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs.
     *        For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles
     *        for Amazon Kendra</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs.
     *         For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles
     *         for Amazon Kendra</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs.
     *        For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles
     *        for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the FAQ. You can use the tags to identify and organize your resources and
     * to control access to resources.
     * </p>
     * 
     * @return A list of key-value pairs that identify the FAQ. You can use the tags to identify and organize your
     *         resources and to control access to resources.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the FAQ. You can use the tags to identify and organize your resources and
     * to control access to resources.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify the FAQ. You can use the tags to identify and organize your
     *        resources and to control access to resources.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs that identify the FAQ. You can use the tags to identify and organize your resources and
     * to control access to resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify the FAQ. You can use the tags to identify and organize your
     *        resources and to control access to resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the FAQ. You can use the tags to identify and organize your resources and
     * to control access to resources.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify the FAQ. You can use the tags to identify and organize your
     *        resources and to control access to resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The format of the input file. You can choose between a basic CSV format, a CSV format that includes customs
     * attributes in a header, and a JSON format that includes custom attributes.
     * </p>
     * <p>
     * The format must match the format of the file stored in the S3 bucket identified in the <code>S3Path</code>
     * parameter.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding
     * questions and answers</a>.
     * </p>
     * 
     * @param fileFormat
     *        The format of the input file. You can choose between a basic CSV format, a CSV format that includes
     *        customs attributes in a header, and a JSON format that includes custom attributes.</p>
     *        <p>
     *        The format must match the format of the file stored in the S3 bucket identified in the <code>S3Path</code>
     *        parameter.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding questions and answers</a>.
     * @see FaqFileFormat
     */

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>
     * The format of the input file. You can choose between a basic CSV format, a CSV format that includes customs
     * attributes in a header, and a JSON format that includes custom attributes.
     * </p>
     * <p>
     * The format must match the format of the file stored in the S3 bucket identified in the <code>S3Path</code>
     * parameter.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding
     * questions and answers</a>.
     * </p>
     * 
     * @return The format of the input file. You can choose between a basic CSV format, a CSV format that includes
     *         customs attributes in a header, and a JSON format that includes custom attributes.</p>
     *         <p>
     *         The format must match the format of the file stored in the S3 bucket identified in the
     *         <code>S3Path</code> parameter.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding questions and
     *         answers</a>.
     * @see FaqFileFormat
     */

    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * <p>
     * The format of the input file. You can choose between a basic CSV format, a CSV format that includes customs
     * attributes in a header, and a JSON format that includes custom attributes.
     * </p>
     * <p>
     * The format must match the format of the file stored in the S3 bucket identified in the <code>S3Path</code>
     * parameter.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding
     * questions and answers</a>.
     * </p>
     * 
     * @param fileFormat
     *        The format of the input file. You can choose between a basic CSV format, a CSV format that includes
     *        customs attributes in a header, and a JSON format that includes custom attributes.</p>
     *        <p>
     *        The format must match the format of the file stored in the S3 bucket identified in the <code>S3Path</code>
     *        parameter.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding questions and answers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FaqFileFormat
     */

    public CreateFaqRequest withFileFormat(String fileFormat) {
        setFileFormat(fileFormat);
        return this;
    }

    /**
     * <p>
     * The format of the input file. You can choose between a basic CSV format, a CSV format that includes customs
     * attributes in a header, and a JSON format that includes custom attributes.
     * </p>
     * <p>
     * The format must match the format of the file stored in the S3 bucket identified in the <code>S3Path</code>
     * parameter.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding
     * questions and answers</a>.
     * </p>
     * 
     * @param fileFormat
     *        The format of the input file. You can choose between a basic CSV format, a CSV format that includes
     *        customs attributes in a header, and a JSON format that includes custom attributes.</p>
     *        <p>
     *        The format must match the format of the file stored in the S3 bucket identified in the <code>S3Path</code>
     *        parameter.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html">Adding questions and answers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FaqFileFormat
     */

    public CreateFaqRequest withFileFormat(FaqFileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a FAQ. Multiple calls to the
     * <code>CreateFaqRequest</code> operation with the same client token will create only one FAQ.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create a FAQ. Multiple calls to the
     *        <code>CreateFaqRequest</code> operation with the same client token will create only one FAQ.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a FAQ. Multiple calls to the
     * <code>CreateFaqRequest</code> operation with the same client token will create only one FAQ.
     * </p>
     * 
     * @return A token that you provide to identify the request to create a FAQ. Multiple calls to the
     *         <code>CreateFaqRequest</code> operation with the same client token will create only one FAQ.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a FAQ. Multiple calls to the
     * <code>CreateFaqRequest</code> operation with the same client token will create only one FAQ.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create a FAQ. Multiple calls to the
     *        <code>CreateFaqRequest</code> operation with the same client token will create only one FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getS3Path() != null)
            sb.append("S3Path: ").append(getS3Path()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getFileFormat() != null)
            sb.append("FileFormat: ").append(getFileFormat()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFaqRequest == false)
            return false;
        CreateFaqRequest other = (CreateFaqRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getS3Path() == null ^ this.getS3Path() == null)
            return false;
        if (other.getS3Path() != null && other.getS3Path().equals(this.getS3Path()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getFileFormat() == null ^ this.getFileFormat() == null)
            return false;
        if (other.getFileFormat() != null && other.getFileFormat().equals(this.getFileFormat()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getS3Path() == null) ? 0 : getS3Path().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateFaqRequest clone() {
        return (CreateFaqRequest) super.clone();
    }

}
