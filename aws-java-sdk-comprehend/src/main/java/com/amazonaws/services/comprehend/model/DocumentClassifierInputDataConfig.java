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
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are provided in the first column, and documents
     * are provided in the second. If you use this value, you must provide the <code>S3Uri</code> parameter in your
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file
     * is in JSON lines format. Each line is a complete JSON object that contains a training document and its associated
     * labels.
     * </p>
     * <p>
     * If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * </p>
     */
    private String dataFormat;
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
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
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
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * </p>
     */
    private java.util.List<AugmentedManifestsListItem> augmentedManifests;

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are provided in the first column, and documents
     * are provided in the second. If you use this value, you must provide the <code>S3Uri</code> parameter in your
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file
     * is in JSON lines format. Each line is a complete JSON object that contains a training document and its associated
     * labels.
     * </p>
     * <p>
     * If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * 
     * @param dataFormat
     *        The format of your training data:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are provided in the first column, and
     *        documents are provided in the second. If you use this value, you must provide the <code>S3Uri</code>
     *        parameter in your request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This
     *        file is in JSON lines format. Each line is a complete JSON object that contains a training document and
     *        its associated labels.
     *        </p>
     *        <p>
     *        If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * @see DocumentClassifierDataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are provided in the first column, and documents
     * are provided in the second. If you use this value, you must provide the <code>S3Uri</code> parameter in your
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file
     * is in JSON lines format. Each line is a complete JSON object that contains a training document and its associated
     * labels.
     * </p>
     * <p>
     * If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * 
     * @return The format of your training data:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are provided in the first column, and
     *         documents are provided in the second. If you use this value, you must provide the <code>S3Uri</code>
     *         parameter in your request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth.
     *         This file is in JSON lines format. Each line is a complete JSON object that contains a training document
     *         and its associated labels.
     *         </p>
     *         <p>
     *         If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * @see DocumentClassifierDataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are provided in the first column, and documents
     * are provided in the second. If you use this value, you must provide the <code>S3Uri</code> parameter in your
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file
     * is in JSON lines format. Each line is a complete JSON object that contains a training document and its associated
     * labels.
     * </p>
     * <p>
     * If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * 
     * @param dataFormat
     *        The format of your training data:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are provided in the first column, and
     *        documents are provided in the second. If you use this value, you must provide the <code>S3Uri</code>
     *        parameter in your request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This
     *        file is in JSON lines format. Each line is a complete JSON object that contains a training document and
     *        its associated labels.
     *        </p>
     *        <p>
     *        If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentClassifierDataFormat
     */

    public DocumentClassifierInputDataConfig withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * The format of your training data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are provided in the first column, and documents
     * are provided in the second. If you use this value, you must provide the <code>S3Uri</code> parameter in your
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file
     * is in JSON lines format. Each line is a complete JSON object that contains a training document and its associated
     * labels.
     * </p>
     * <p>
     * If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * </p>
     * 
     * @param dataFormat
     *        The format of your training data:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPREHEND_CSV</code>: A two-column CSV file, where labels are provided in the first column, and
     *        documents are provided in the second. If you use this value, you must provide the <code>S3Uri</code>
     *        parameter in your request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUGMENTED_MANIFEST</code>: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This
     *        file is in JSON lines format. Each line is a complete JSON object that contains a training document and
     *        its associated labels.
     *        </p>
     *        <p>
     *        If you use this value, you must provide the <code>AugmentedManifests</code> parameter in your request.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value, Amazon Comprehend uses <code>COMPREHEND_CSV</code> as the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentClassifierDataFormat
     */

    public DocumentClassifierInputDataConfig withDataFormat(DocumentClassifierDataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
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
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
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
     *        </p>
     *        <p>
     *        This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
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
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
     * </p>
     * 
     * @return The Amazon S3 URI for the input data. The S3 bucket must be in the same region as the API endpoint that
     *         you are calling. The URI can point to a single input file or it can provide the prefix for a collection
     *         of input files.</p>
     *         <p>
     *         For example, if you use the URI <code>S3://bucketName/prefix</code>, if the prefix is a single file,
     *         Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon
     *         Comprehend uses all of them as input.
     *         </p>
     *         <p>
     *         This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
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
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
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
     *        </p>
     *        <p>
     *        This parameter is required if you set <code>DataFormat</code> to <code>COMPREHEND_CSV</code>.
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
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * </p>
     * 
     * @return A list of augmented manifest files that provide training data for your custom model. An augmented
     *         manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
     *         <p>
     *         This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     */

    public java.util.List<AugmentedManifestsListItem> getAugmentedManifests() {
        return augmentedManifests;
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * </p>
     * 
     * @param augmentedManifests
     *        A list of augmented manifest files that provide training data for your custom model. An augmented manifest
     *        file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
     *        <p>
     *        This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     */

    public void setAugmentedManifests(java.util.Collection<AugmentedManifestsListItem> augmentedManifests) {
        if (augmentedManifests == null) {
            this.augmentedManifests = null;
            return;
        }

        this.augmentedManifests = new java.util.ArrayList<AugmentedManifestsListItem>(augmentedManifests);
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAugmentedManifests(java.util.Collection)} or {@link #withAugmentedManifests(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param augmentedManifests
     *        A list of augmented manifest files that provide training data for your custom model. An augmented manifest
     *        file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
     *        <p>
     *        This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierInputDataConfig withAugmentedManifests(AugmentedManifestsListItem... augmentedManifests) {
        if (this.augmentedManifests == null) {
            setAugmentedManifests(new java.util.ArrayList<AugmentedManifestsListItem>(augmentedManifests.length));
        }
        for (AugmentedManifestsListItem ele : augmentedManifests) {
            this.augmentedManifests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * </p>
     * 
     * @param augmentedManifests
     *        A list of augmented manifest files that provide training data for your custom model. An augmented manifest
     *        file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.</p>
     *        <p>
     *        This parameter is required if you set <code>DataFormat</code> to <code>AUGMENTED_MANIFEST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierInputDataConfig withAugmentedManifests(java.util.Collection<AugmentedManifestsListItem> augmentedManifests) {
        setAugmentedManifests(augmentedManifests);
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
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat()).append(",");
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
        if (getLabelDelimiter() != null)
            sb.append("LabelDelimiter: ").append(getLabelDelimiter()).append(",");
        if (getAugmentedManifests() != null)
            sb.append("AugmentedManifests: ").append(getAugmentedManifests());
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
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getLabelDelimiter() == null ^ this.getLabelDelimiter() == null)
            return false;
        if (other.getLabelDelimiter() != null && other.getLabelDelimiter().equals(this.getLabelDelimiter()) == false)
            return false;
        if (other.getAugmentedManifests() == null ^ this.getAugmentedManifests() == null)
            return false;
        if (other.getAugmentedManifests() != null && other.getAugmentedManifests().equals(this.getAugmentedManifests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getLabelDelimiter() == null) ? 0 : getLabelDelimiter().hashCode());
        hashCode = prime * hashCode + ((getAugmentedManifests() == null) ? 0 : getAugmentedManifests().hashCode());
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
