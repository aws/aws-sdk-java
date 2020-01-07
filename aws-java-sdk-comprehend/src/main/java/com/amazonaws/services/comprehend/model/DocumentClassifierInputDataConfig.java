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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The input properties for training a document classifier.
 * </p>
 * <p>
 * For more information on how the input file is formatted, see <a>how-document-classification-training-data</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DocumentClassifierInputDataConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentClassifierInputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 URI for the input data. The S3 bucket must be in the same region as the API endpoint that you are
     * calling. The URI can point to a single input file or it can provide the prefix for a collection of input files.
     * </p>
     * <p>
     * For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a single file, Amazon
     * Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend uses all of
     * them as input.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * Indicates the delimiter used to separate each label for training a multi-label classifier. The default delimiter
     * between labels is a pipe (|). You can use a different character as a delimiter (if it's an allowed character) by
     * specifying it under Delimiter for labels. If the training documents use a delimiter other than the default or the
     * delimiter you specify, the labels on that line will be combined to make a single unique label, such as
     * LABELLABELLABEL.
     * </p>
     */
    private String labelDelimiter;

    /**
     * <p>
     * The Amazon S3 URI for the input data. The S3 bucket must be in the same region as the API endpoint that you are
     * calling. The URI can point to a single input file or it can provide the prefix for a collection of input files.
     * </p>
     * <p>
     * For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a single file, Amazon
     * Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend uses all of
     * them as input.
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 URI for the input data. The S3 bucket must be in the same region as the API endpoint that
     *        you are calling. The URI can point to a single input file or it can provide the prefix for a collection of
     *        input files.</p>
     *        <p>
     *        For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a single file,
     *        Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend
     *        uses all of them as input.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 URI for the input data. The S3 bucket must be in the same region as the API endpoint that you are
     * calling. The URI can point to a single input file or it can provide the prefix for a collection of input files.
     * </p>
     * <p>
     * For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a single file, Amazon
     * Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend uses all of
     * them as input.
     * </p>
     * 
     * @return The Amazon S3 URI for the input data. The S3 bucket must be in the same region as the API endpoint that
     *         you are calling. The URI can point to a single input file or it can provide the prefix for a collection
     *         of input files.</p>
     *         <p>
     *         For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a single file,
     *         Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon
     *         Comprehend uses all of them as input.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 URI for the input data. The S3 bucket must be in the same region as the API endpoint that you are
     * calling. The URI can point to a single input file or it can provide the prefix for a collection of input files.
     * </p>
     * <p>
     * For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a single file, Amazon
     * Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend uses all of
     * them as input.
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 URI for the input data. The S3 bucket must be in the same region as the API endpoint that
     *        you are calling. The URI can point to a single input file or it can provide the prefix for a collection of
     *        input files.</p>
     *        <p>
     *        For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a single file,
     *        Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend
     *        uses all of them as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierInputDataConfig withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * Indicates the delimiter used to separate each label for training a multi-label classifier. The default delimiter
     * between labels is a pipe (|). You can use a different character as a delimiter (if it's an allowed character) by
     * specifying it under Delimiter for labels. If the training documents use a delimiter other than the default or the
     * delimiter you specify, the labels on that line will be combined to make a single unique label, such as
     * LABELLABELLABEL.
     * </p>
     * 
     * @param labelDelimiter
     *        Indicates the delimiter used to separate each label for training a multi-label classifier. The default
     *        delimiter between labels is a pipe (|). You can use a different character as a delimiter (if it's an
     *        allowed character) by specifying it under Delimiter for labels. If the training documents use a delimiter
     *        other than the default or the delimiter you specify, the labels on that line will be combined to make a
     *        single unique label, such as LABELLABELLABEL.
     */

    public void setLabelDelimiter(String labelDelimiter) {
        this.labelDelimiter = labelDelimiter;
    }

    /**
     * <p>
     * Indicates the delimiter used to separate each label for training a multi-label classifier. The default delimiter
     * between labels is a pipe (|). You can use a different character as a delimiter (if it's an allowed character) by
     * specifying it under Delimiter for labels. If the training documents use a delimiter other than the default or the
     * delimiter you specify, the labels on that line will be combined to make a single unique label, such as
     * LABELLABELLABEL.
     * </p>
     * 
     * @return Indicates the delimiter used to separate each label for training a multi-label classifier. The default
     *         delimiter between labels is a pipe (|). You can use a different character as a delimiter (if it's an
     *         allowed character) by specifying it under Delimiter for labels. If the training documents use a delimiter
     *         other than the default or the delimiter you specify, the labels on that line will be combined to make a
     *         single unique label, such as LABELLABELLABEL.
     */

    public String getLabelDelimiter() {
        return this.labelDelimiter;
    }

    /**
     * <p>
     * Indicates the delimiter used to separate each label for training a multi-label classifier. The default delimiter
     * between labels is a pipe (|). You can use a different character as a delimiter (if it's an allowed character) by
     * specifying it under Delimiter for labels. If the training documents use a delimiter other than the default or the
     * delimiter you specify, the labels on that line will be combined to make a single unique label, such as
     * LABELLABELLABEL.
     * </p>
     * 
     * @param labelDelimiter
     *        Indicates the delimiter used to separate each label for training a multi-label classifier. The default
     *        delimiter between labels is a pipe (|). You can use a different character as a delimiter (if it's an
     *        allowed character) by specifying it under Delimiter for labels. If the training documents use a delimiter
     *        other than the default or the delimiter you specify, the labels on that line will be combined to make a
     *        single unique label, such as LABELLABELLABEL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierInputDataConfig withLabelDelimiter(String labelDelimiter) {
        setLabelDelimiter(labelDelimiter);
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
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
        if (getLabelDelimiter() != null)
            sb.append("LabelDelimiter: ").append(getLabelDelimiter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentClassifierInputDataConfig == false)
            return false;
        DocumentClassifierInputDataConfig other = (DocumentClassifierInputDataConfig) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getLabelDelimiter() == null ^ this.getLabelDelimiter() == null)
            return false;
        if (other.getLabelDelimiter() != null && other.getLabelDelimiter().equals(this.getLabelDelimiter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getLabelDelimiter() == null) ? 0 : getLabelDelimiter().hashCode());
        return hashCode;
    }

    @Override
    public DocumentClassifierInputDataConfig clone() {
        try {
            return (DocumentClassifierInputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DocumentClassifierInputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
