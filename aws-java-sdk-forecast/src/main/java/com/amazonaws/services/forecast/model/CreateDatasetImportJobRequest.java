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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDatasetImportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the dataset import job. We recommend including the current timestamp in the name, for example,
     * <code>20190721DatasetImport</code>. This can help you avoid getting a <code>ResourceAlreadyExistsException</code>
     * exception.
     * </p>
     */
    private String datasetImportJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Forecast dataset that you want to import data to.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the data. The training data must be stored in an Amazon S3 bucket.
     * </p>
     * <p>
     * If encryption is used, <code>DataSource</code> must include an AWS Key Management Service (KMS) key and the IAM
     * role must allow Amazon Forecast permission to access the key. The KMS key and IAM role must match those specified
     * in the <code>EncryptionConfig</code> parameter of the <a>CreateDataset</a> operation.
     * </p>
     */
    private DataSource dataSource;
    /**
     * <p>
     * The format of timestamps in the dataset. The format that you specify depends on the <code>DataFrequency</code>
     * specified when the dataset was created. The following formats are supported
     * </p>
     * <ul>
     * <li>
     * <p>
     * "yyyy-MM-dd"
     * </p>
     * <p>
     * For the following data frequencies: Y, M, W, and D
     * </p>
     * </li>
     * <li>
     * <p>
     * "yyyy-MM-dd HH:mm:ss"
     * </p>
     * <p>
     * For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the format isn't specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".
     * </p>
     */
    private String timestampFormat;
    /**
     * <p>
     * The optional metadata that you apply to the dataset import job to help you categorize and organize them. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the dataset import job. We recommend including the current timestamp in the name, for example,
     * <code>20190721DatasetImport</code>. This can help you avoid getting a <code>ResourceAlreadyExistsException</code>
     * exception.
     * </p>
     * 
     * @param datasetImportJobName
     *        The name for the dataset import job. We recommend including the current timestamp in the name, for
     *        example, <code>20190721DatasetImport</code>. This can help you avoid getting a
     *        <code>ResourceAlreadyExistsException</code> exception.
     */

    public void setDatasetImportJobName(String datasetImportJobName) {
        this.datasetImportJobName = datasetImportJobName;
    }

    /**
     * <p>
     * The name for the dataset import job. We recommend including the current timestamp in the name, for example,
     * <code>20190721DatasetImport</code>. This can help you avoid getting a <code>ResourceAlreadyExistsException</code>
     * exception.
     * </p>
     * 
     * @return The name for the dataset import job. We recommend including the current timestamp in the name, for
     *         example, <code>20190721DatasetImport</code>. This can help you avoid getting a
     *         <code>ResourceAlreadyExistsException</code> exception.
     */

    public String getDatasetImportJobName() {
        return this.datasetImportJobName;
    }

    /**
     * <p>
     * The name for the dataset import job. We recommend including the current timestamp in the name, for example,
     * <code>20190721DatasetImport</code>. This can help you avoid getting a <code>ResourceAlreadyExistsException</code>
     * exception.
     * </p>
     * 
     * @param datasetImportJobName
     *        The name for the dataset import job. We recommend including the current timestamp in the name, for
     *        example, <code>20190721DatasetImport</code>. This can help you avoid getting a
     *        <code>ResourceAlreadyExistsException</code> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetImportJobRequest withDatasetImportJobName(String datasetImportJobName) {
        setDatasetImportJobName(datasetImportJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Forecast dataset that you want to import data to.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the Amazon Forecast dataset that you want to import data to.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Forecast dataset that you want to import data to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Forecast dataset that you want to import data to.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Forecast dataset that you want to import data to.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the Amazon Forecast dataset that you want to import data to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetImportJobRequest withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the data. The training data must be stored in an Amazon S3 bucket.
     * </p>
     * <p>
     * If encryption is used, <code>DataSource</code> must include an AWS Key Management Service (KMS) key and the IAM
     * role must allow Amazon Forecast permission to access the key. The KMS key and IAM role must match those specified
     * in the <code>EncryptionConfig</code> parameter of the <a>CreateDataset</a> operation.
     * </p>
     * 
     * @param dataSource
     *        The location of the training data to import and an AWS Identity and Access Management (IAM) role that
     *        Amazon Forecast can assume to access the data. The training data must be stored in an Amazon S3
     *        bucket.</p>
     *        <p>
     *        If encryption is used, <code>DataSource</code> must include an AWS Key Management Service (KMS) key and
     *        the IAM role must allow Amazon Forecast permission to access the key. The KMS key and IAM role must match
     *        those specified in the <code>EncryptionConfig</code> parameter of the <a>CreateDataset</a> operation.
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the data. The training data must be stored in an Amazon S3 bucket.
     * </p>
     * <p>
     * If encryption is used, <code>DataSource</code> must include an AWS Key Management Service (KMS) key and the IAM
     * role must allow Amazon Forecast permission to access the key. The KMS key and IAM role must match those specified
     * in the <code>EncryptionConfig</code> parameter of the <a>CreateDataset</a> operation.
     * </p>
     * 
     * @return The location of the training data to import and an AWS Identity and Access Management (IAM) role that
     *         Amazon Forecast can assume to access the data. The training data must be stored in an Amazon S3
     *         bucket.</p>
     *         <p>
     *         If encryption is used, <code>DataSource</code> must include an AWS Key Management Service (KMS) key and
     *         the IAM role must allow Amazon Forecast permission to access the key. The KMS key and IAM role must match
     *         those specified in the <code>EncryptionConfig</code> parameter of the <a>CreateDataset</a> operation.
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the data. The training data must be stored in an Amazon S3 bucket.
     * </p>
     * <p>
     * If encryption is used, <code>DataSource</code> must include an AWS Key Management Service (KMS) key and the IAM
     * role must allow Amazon Forecast permission to access the key. The KMS key and IAM role must match those specified
     * in the <code>EncryptionConfig</code> parameter of the <a>CreateDataset</a> operation.
     * </p>
     * 
     * @param dataSource
     *        The location of the training data to import and an AWS Identity and Access Management (IAM) role that
     *        Amazon Forecast can assume to access the data. The training data must be stored in an Amazon S3
     *        bucket.</p>
     *        <p>
     *        If encryption is used, <code>DataSource</code> must include an AWS Key Management Service (KMS) key and
     *        the IAM role must allow Amazon Forecast permission to access the key. The KMS key and IAM role must match
     *        those specified in the <code>EncryptionConfig</code> parameter of the <a>CreateDataset</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetImportJobRequest withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The format of timestamps in the dataset. The format that you specify depends on the <code>DataFrequency</code>
     * specified when the dataset was created. The following formats are supported
     * </p>
     * <ul>
     * <li>
     * <p>
     * "yyyy-MM-dd"
     * </p>
     * <p>
     * For the following data frequencies: Y, M, W, and D
     * </p>
     * </li>
     * <li>
     * <p>
     * "yyyy-MM-dd HH:mm:ss"
     * </p>
     * <p>
     * For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the format isn't specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".
     * </p>
     * 
     * @param timestampFormat
     *        The format of timestamps in the dataset. The format that you specify depends on the
     *        <code>DataFrequency</code> specified when the dataset was created. The following formats are supported</p>
     *        <ul>
     *        <li>
     *        <p>
     *        "yyyy-MM-dd"
     *        </p>
     *        <p>
     *        For the following data frequencies: Y, M, W, and D
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "yyyy-MM-dd HH:mm:ss"
     *        </p>
     *        <p>
     *        For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the format isn't specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".
     */

    public void setTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
    }

    /**
     * <p>
     * The format of timestamps in the dataset. The format that you specify depends on the <code>DataFrequency</code>
     * specified when the dataset was created. The following formats are supported
     * </p>
     * <ul>
     * <li>
     * <p>
     * "yyyy-MM-dd"
     * </p>
     * <p>
     * For the following data frequencies: Y, M, W, and D
     * </p>
     * </li>
     * <li>
     * <p>
     * "yyyy-MM-dd HH:mm:ss"
     * </p>
     * <p>
     * For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the format isn't specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".
     * </p>
     * 
     * @return The format of timestamps in the dataset. The format that you specify depends on the
     *         <code>DataFrequency</code> specified when the dataset was created. The following formats are
     *         supported</p>
     *         <ul>
     *         <li>
     *         <p>
     *         "yyyy-MM-dd"
     *         </p>
     *         <p>
     *         For the following data frequencies: Y, M, W, and D
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "yyyy-MM-dd HH:mm:ss"
     *         </p>
     *         <p>
     *         For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the format isn't specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".
     */

    public String getTimestampFormat() {
        return this.timestampFormat;
    }

    /**
     * <p>
     * The format of timestamps in the dataset. The format that you specify depends on the <code>DataFrequency</code>
     * specified when the dataset was created. The following formats are supported
     * </p>
     * <ul>
     * <li>
     * <p>
     * "yyyy-MM-dd"
     * </p>
     * <p>
     * For the following data frequencies: Y, M, W, and D
     * </p>
     * </li>
     * <li>
     * <p>
     * "yyyy-MM-dd HH:mm:ss"
     * </p>
     * <p>
     * For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the format isn't specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".
     * </p>
     * 
     * @param timestampFormat
     *        The format of timestamps in the dataset. The format that you specify depends on the
     *        <code>DataFrequency</code> specified when the dataset was created. The following formats are supported</p>
     *        <ul>
     *        <li>
     *        <p>
     *        "yyyy-MM-dd"
     *        </p>
     *        <p>
     *        For the following data frequencies: Y, M, W, and D
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "yyyy-MM-dd HH:mm:ss"
     *        </p>
     *        <p>
     *        For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the format isn't specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetImportJobRequest withTimestampFormat(String timestampFormat) {
        setTimestampFormat(timestampFormat);
        return this;
    }

    /**
     * <p>
     * The optional metadata that you apply to the dataset import job to help you categorize and organize them. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The optional metadata that you apply to the dataset import job to help you categorize and organize them.
     *         Each tag consists of a key and an optional value, both of which you define.</p>
     *         <p>
     *         The following basic restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource - 50.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique, and each tag key can have only one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length - 128 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length - 256 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your tagging schema is used across multiple services and resources, remember that other services may
     *         have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *         representable in UTF-8, and the following characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a
     *         prefix for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix.
     *         Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then
     *         Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the
     *         key prefix of <code>aws</code> do not count against your tags per resource limit.
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The optional metadata that you apply to the dataset import job to help you categorize and organize them. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The optional metadata that you apply to the dataset import job to help you categorize and organize them.
     *        Each tag consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can
     *        have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast
     *        considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix
     *        of <code>aws</code> do not count against your tags per resource limit.
     *        </p>
     *        </li>
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
     * The optional metadata that you apply to the dataset import job to help you categorize and organize them. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The optional metadata that you apply to the dataset import job to help you categorize and organize them.
     *        Each tag consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can
     *        have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast
     *        considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix
     *        of <code>aws</code> do not count against your tags per resource limit.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetImportJobRequest withTags(Tag... tags) {
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
     * The optional metadata that you apply to the dataset import job to help you categorize and organize them. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this
     * prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be
     * a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not
     * count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The optional metadata that you apply to the dataset import job to help you categorize and organize them.
     *        Each tag consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can
     *        have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast
     *        considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix
     *        of <code>aws</code> do not count against your tags per resource limit.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetImportJobRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDatasetImportJobName() != null)
            sb.append("DatasetImportJobName: ").append(getDatasetImportJobName()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getTimestampFormat() != null)
            sb.append("TimestampFormat: ").append(getTimestampFormat()).append(",");
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

        if (obj instanceof CreateDatasetImportJobRequest == false)
            return false;
        CreateDatasetImportJobRequest other = (CreateDatasetImportJobRequest) obj;
        if (other.getDatasetImportJobName() == null ^ this.getDatasetImportJobName() == null)
            return false;
        if (other.getDatasetImportJobName() != null && other.getDatasetImportJobName().equals(this.getDatasetImportJobName()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getTimestampFormat() == null ^ this.getTimestampFormat() == null)
            return false;
        if (other.getTimestampFormat() != null && other.getTimestampFormat().equals(this.getTimestampFormat()) == false)
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

        hashCode = prime * hashCode + ((getDatasetImportJobName() == null) ? 0 : getDatasetImportJobName().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getTimestampFormat() == null) ? 0 : getTimestampFormat().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetImportJobRequest clone() {
        return (CreateDatasetImportJobRequest) super.clone();
    }

}
