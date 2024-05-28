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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon S3 logging configuration settings for the pipe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/S3LogDestinationParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3LogDestinationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket to which EventBridge delivers the log records for the pipe.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * Specifies the Amazon Web Services account that owns the Amazon S3 bucket to which EventBridge delivers the log
     * records for the pipe.
     * </p>
     */
    private String bucketOwner;
    /**
     * <p>
     * How EventBridge should format the log records.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>json</code>: JSON
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>plain</code>: Plain text
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>w3c</code>: <a href="https://www.w3.org/TR/WD-logfile">W3C extended logging file format</a>
     * </p>
     * </li>
     * </ul>
     */
    private String outputFormat;
    /**
     * <p>
     * Specifies any prefix text with which to begin Amazon S3 log object names.
     * </p>
     * <p>
     * You can use prefixes to organize the data that you store in Amazon S3 buckets. A prefix is a string of characters
     * at the beginning of the object key name. A prefix can be any length, subject to the maximum length of the object
     * key name (1,024 bytes). For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     * prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket to which EventBridge delivers the log records for the pipe.
     * </p>
     * 
     * @param bucketName
     *        Specifies the name of the Amazon S3 bucket to which EventBridge delivers the log records for the pipe.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket to which EventBridge delivers the log records for the pipe.
     * </p>
     * 
     * @return Specifies the name of the Amazon S3 bucket to which EventBridge delivers the log records for the pipe.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket to which EventBridge delivers the log records for the pipe.
     * </p>
     * 
     * @param bucketName
     *        Specifies the name of the Amazon S3 bucket to which EventBridge delivers the log records for the pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3LogDestinationParameters withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services account that owns the Amazon S3 bucket to which EventBridge delivers the log
     * records for the pipe.
     * </p>
     * 
     * @param bucketOwner
     *        Specifies the Amazon Web Services account that owns the Amazon S3 bucket to which EventBridge delivers the
     *        log records for the pipe.
     */

    public void setBucketOwner(String bucketOwner) {
        this.bucketOwner = bucketOwner;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services account that owns the Amazon S3 bucket to which EventBridge delivers the log
     * records for the pipe.
     * </p>
     * 
     * @return Specifies the Amazon Web Services account that owns the Amazon S3 bucket to which EventBridge delivers
     *         the log records for the pipe.
     */

    public String getBucketOwner() {
        return this.bucketOwner;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services account that owns the Amazon S3 bucket to which EventBridge delivers the log
     * records for the pipe.
     * </p>
     * 
     * @param bucketOwner
     *        Specifies the Amazon Web Services account that owns the Amazon S3 bucket to which EventBridge delivers the
     *        log records for the pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3LogDestinationParameters withBucketOwner(String bucketOwner) {
        setBucketOwner(bucketOwner);
        return this;
    }

    /**
     * <p>
     * How EventBridge should format the log records.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>json</code>: JSON
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>plain</code>: Plain text
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>w3c</code>: <a href="https://www.w3.org/TR/WD-logfile">W3C extended logging file format</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param outputFormat
     *        How EventBridge should format the log records.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>json</code>: JSON
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>plain</code>: Plain text
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>w3c</code>: <a href="https://www.w3.org/TR/WD-logfile">W3C extended logging file format</a>
     *        </p>
     *        </li>
     * @see S3OutputFormat
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * How EventBridge should format the log records.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>json</code>: JSON
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>plain</code>: Plain text
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>w3c</code>: <a href="https://www.w3.org/TR/WD-logfile">W3C extended logging file format</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return How EventBridge should format the log records.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>json</code>: JSON
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>plain</code>: Plain text
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>w3c</code>: <a href="https://www.w3.org/TR/WD-logfile">W3C extended logging file format</a>
     *         </p>
     *         </li>
     * @see S3OutputFormat
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * <p>
     * How EventBridge should format the log records.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>json</code>: JSON
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>plain</code>: Plain text
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>w3c</code>: <a href="https://www.w3.org/TR/WD-logfile">W3C extended logging file format</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param outputFormat
     *        How EventBridge should format the log records.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>json</code>: JSON
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>plain</code>: Plain text
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>w3c</code>: <a href="https://www.w3.org/TR/WD-logfile">W3C extended logging file format</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3OutputFormat
     */

    public S3LogDestinationParameters withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
        return this;
    }

    /**
     * <p>
     * How EventBridge should format the log records.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>json</code>: JSON
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>plain</code>: Plain text
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>w3c</code>: <a href="https://www.w3.org/TR/WD-logfile">W3C extended logging file format</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param outputFormat
     *        How EventBridge should format the log records.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>json</code>: JSON
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>plain</code>: Plain text
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>w3c</code>: <a href="https://www.w3.org/TR/WD-logfile">W3C extended logging file format</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3OutputFormat
     */

    public S3LogDestinationParameters withOutputFormat(S3OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
        return this;
    }

    /**
     * <p>
     * Specifies any prefix text with which to begin Amazon S3 log object names.
     * </p>
     * <p>
     * You can use prefixes to organize the data that you store in Amazon S3 buckets. A prefix is a string of characters
     * at the beginning of the object key name. A prefix can be any length, subject to the maximum length of the object
     * key name (1,024 bytes). For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     * prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @param prefix
     *        Specifies any prefix text with which to begin Amazon S3 log object names.</p>
     *        <p>
     *        You can use prefixes to organize the data that you store in Amazon S3 buckets. A prefix is a string of
     *        characters at the beginning of the object key name. A prefix can be any length, subject to the maximum
     *        length of the object key name (1,024 bytes). For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     *        prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Specifies any prefix text with which to begin Amazon S3 log object names.
     * </p>
     * <p>
     * You can use prefixes to organize the data that you store in Amazon S3 buckets. A prefix is a string of characters
     * at the beginning of the object key name. A prefix can be any length, subject to the maximum length of the object
     * key name (1,024 bytes). For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     * prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @return Specifies any prefix text with which to begin Amazon S3 log object names.</p>
     *         <p>
     *         You can use prefixes to organize the data that you store in Amazon S3 buckets. A prefix is a string of
     *         characters at the beginning of the object key name. A prefix can be any length, subject to the maximum
     *         length of the object key name (1,024 bytes). For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     *         prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * Specifies any prefix text with which to begin Amazon S3 log object names.
     * </p>
     * <p>
     * You can use prefixes to organize the data that you store in Amazon S3 buckets. A prefix is a string of characters
     * at the beginning of the object key name. A prefix can be any length, subject to the maximum length of the object
     * key name (1,024 bytes). For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     * prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * 
     * @param prefix
     *        Specifies any prefix text with which to begin Amazon S3 log object names.</p>
     *        <p>
     *        You can use prefixes to organize the data that you store in Amazon S3 buckets. A prefix is a string of
     *        characters at the beginning of the object key name. A prefix can be any length, subject to the maximum
     *        length of the object key name (1,024 bytes). For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     *        prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3LogDestinationParameters withPrefix(String prefix) {
        setPrefix(prefix);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getBucketOwner() != null)
            sb.append("BucketOwner: ").append(getBucketOwner()).append(",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: ").append(getOutputFormat()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3LogDestinationParameters == false)
            return false;
        S3LogDestinationParameters other = (S3LogDestinationParameters) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getBucketOwner() == null ^ this.getBucketOwner() == null)
            return false;
        if (other.getBucketOwner() != null && other.getBucketOwner().equals(this.getBucketOwner()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getBucketOwner() == null) ? 0 : getBucketOwner().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public S3LogDestinationParameters clone() {
        try {
            return (S3LogDestinationParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.S3LogDestinationParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
