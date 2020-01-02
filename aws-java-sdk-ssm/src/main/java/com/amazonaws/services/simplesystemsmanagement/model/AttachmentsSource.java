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
 * Identifying information about a document attachment, including the file name and a key-value pair that identifies the
 * location of an attachment to a document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AttachmentsSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachmentsSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key of a key-value pair that identifies the location of an attachment to a document.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value of a key-value pair that identifies the location of an attachment to a document. The format for
     * <b>Value</b> depends on the type of key you specify.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:
     * </p>
     * <p>
     * <code>"Values": [ "s3://my-bucket/my-folder" ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:
     * </p>
     * <p>
     * <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your
     * account, a version number of that document, and a file attached to that document version that you want to reuse.
     * For example:
     * </p>
     * <p>
     * <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code>
     * </p>
     * <p>
     * However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified
     * instead of the document name only. For example:
     * </p>
     * <p>
     * <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code>
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;
    /**
     * <p>
     * The name of the document attachment file.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The key of a key-value pair that identifies the location of an attachment to a document.
     * </p>
     * 
     * @param key
     *        The key of a key-value pair that identifies the location of an attachment to a document.
     * @see AttachmentsSourceKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of a key-value pair that identifies the location of an attachment to a document.
     * </p>
     * 
     * @return The key of a key-value pair that identifies the location of an attachment to a document.
     * @see AttachmentsSourceKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of a key-value pair that identifies the location of an attachment to a document.
     * </p>
     * 
     * @param key
     *        The key of a key-value pair that identifies the location of an attachment to a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentsSourceKey
     */

    public AttachmentsSource withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The key of a key-value pair that identifies the location of an attachment to a document.
     * </p>
     * 
     * @param key
     *        The key of a key-value pair that identifies the location of an attachment to a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentsSourceKey
     */

    public AttachmentsSource withKey(AttachmentsSourceKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The value of a key-value pair that identifies the location of an attachment to a document. The format for
     * <b>Value</b> depends on the type of key you specify.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:
     * </p>
     * <p>
     * <code>"Values": [ "s3://my-bucket/my-folder" ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:
     * </p>
     * <p>
     * <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your
     * account, a version number of that document, and a file attached to that document version that you want to reuse.
     * For example:
     * </p>
     * <p>
     * <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code>
     * </p>
     * <p>
     * However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified
     * instead of the document name only. For example:
     * </p>
     * <p>
     * <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The value of a key-value pair that identifies the location of an attachment to a document. The format for
     *         <b>Value</b> depends on the type of key you specify.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:
     *         </p>
     *         <p>
     *         <code>"Values": [ "s3://my-bucket/my-folder" ]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:
     *         </p>
     *         <p>
     *         <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in
     *         your account, a version number of that document, and a file attached to that document version that you
     *         want to reuse. For example:
     *         </p>
     *         <p>
     *         <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code>
     *         </p>
     *         <p>
     *         However, if the SSM document is shared with you from another account, the full SSM document ARN must be
     *         specified instead of the document name only. For example:
     *         </p>
     *         <p>
     *         <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code>
     *         </p>
     *         </li>
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The value of a key-value pair that identifies the location of an attachment to a document. The format for
     * <b>Value</b> depends on the type of key you specify.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:
     * </p>
     * <p>
     * <code>"Values": [ "s3://my-bucket/my-folder" ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:
     * </p>
     * <p>
     * <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your
     * account, a version number of that document, and a file attached to that document version that you want to reuse.
     * For example:
     * </p>
     * <p>
     * <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code>
     * </p>
     * <p>
     * However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified
     * instead of the document name only. For example:
     * </p>
     * <p>
     * <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        The value of a key-value pair that identifies the location of an attachment to a document. The format for
     *        <b>Value</b> depends on the type of key you specify.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:
     *        </p>
     *        <p>
     *        <code>"Values": [ "s3://my-bucket/my-folder" ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:
     *        </p>
     *        <p>
     *        <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in
     *        your account, a version number of that document, and a file attached to that document version that you
     *        want to reuse. For example:
     *        </p>
     *        <p>
     *        <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code>
     *        </p>
     *        <p>
     *        However, if the SSM document is shared with you from another account, the full SSM document ARN must be
     *        specified instead of the document name only. For example:
     *        </p>
     *        <p>
     *        <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code>
     *        </p>
     *        </li>
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * The value of a key-value pair that identifies the location of an attachment to a document. The format for
     * <b>Value</b> depends on the type of key you specify.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:
     * </p>
     * <p>
     * <code>"Values": [ "s3://my-bucket/my-folder" ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:
     * </p>
     * <p>
     * <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your
     * account, a version number of that document, and a file attached to that document version that you want to reuse.
     * For example:
     * </p>
     * <p>
     * <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code>
     * </p>
     * <p>
     * However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified
     * instead of the document name only. For example:
     * </p>
     * <p>
     * <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value of a key-value pair that identifies the location of an attachment to a document. The format for
     *        <b>Value</b> depends on the type of key you specify.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:
     *        </p>
     *        <p>
     *        <code>"Values": [ "s3://my-bucket/my-folder" ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:
     *        </p>
     *        <p>
     *        <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in
     *        your account, a version number of that document, and a file attached to that document version that you
     *        want to reuse. For example:
     *        </p>
     *        <p>
     *        <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code>
     *        </p>
     *        <p>
     *        However, if the SSM document is shared with you from another account, the full SSM document ARN must be
     *        specified instead of the document name only. For example:
     *        </p>
     *        <p>
     *        <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentsSource withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value of a key-value pair that identifies the location of an attachment to a document. The format for
     * <b>Value</b> depends on the type of key you specify.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:
     * </p>
     * <p>
     * <code>"Values": [ "s3://my-bucket/my-folder" ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:
     * </p>
     * <p>
     * <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in your
     * account, a version number of that document, and a file attached to that document version that you want to reuse.
     * For example:
     * </p>
     * <p>
     * <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code>
     * </p>
     * <p>
     * However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified
     * instead of the document name only. For example:
     * </p>
     * <p>
     * <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        The value of a key-value pair that identifies the location of an attachment to a document. The format for
     *        <b>Value</b> depends on the type of key you specify.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the key <i>SourceUrl</i>, the value is an S3 bucket location. For example:
     *        </p>
     *        <p>
     *        <code>"Values": [ "s3://my-bucket/my-folder" ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the key <i>S3FileUrl</i>, the value is a file in an S3 bucket. For example:
     *        </p>
     *        <p>
     *        <code>"Values": [ "s3://my-bucket/my-folder/my-file.py" ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the key <i>AttachmentReference</i>, the value is constructed from the name of another SSM document in
     *        your account, a version number of that document, and a file attached to that document version that you
     *        want to reuse. For example:
     *        </p>
     *        <p>
     *        <code>"Values": [ "MyOtherDocument/3/my-other-file.py" ]</code>
     *        </p>
     *        <p>
     *        However, if the SSM document is shared with you from another account, the full SSM document ARN must be
     *        specified instead of the document name only. For example:
     *        </p>
     *        <p>
     *        <code>"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentsSource withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The name of the document attachment file.
     * </p>
     * 
     * @param name
     *        The name of the document attachment file.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the document attachment file.
     * </p>
     * 
     * @return The name of the document attachment file.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the document attachment file.
     * </p>
     * 
     * @param name
     *        The name of the document attachment file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentsSource withName(String name) {
        setName(name);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachmentsSource == false)
            return false;
        AttachmentsSource other = (AttachmentsSource) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public AttachmentsSource clone() {
        try {
            return (AttachmentsSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AttachmentsSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
