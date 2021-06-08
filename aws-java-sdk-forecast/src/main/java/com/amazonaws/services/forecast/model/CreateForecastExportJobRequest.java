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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateForecastExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateForecastExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the forecast export job.
     * </p>
     */
    private String forecastExportJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast that you want to export.
     * </p>
     */
    private String forecastArn;
    /**
     * <p>
     * The location where you want to save the forecast and an AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the location. The forecast must be exported to an Amazon S3 bucket.
     * </p>
     * <p>
     * If encryption is used, <code>Destination</code> must include an AWS Key Management Service (KMS) key. The IAM
     * role must allow Amazon Forecast permission to access the key.
     * </p>
     */
    private DataDestination destination;
    /**
     * <p>
     * The optional metadata that you apply to the forecast export job to help you categorize and organize them. Each
     * tag consists of a key and an optional value, both of which you define.
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
     * The name for the forecast export job.
     * </p>
     * 
     * @param forecastExportJobName
     *        The name for the forecast export job.
     */

    public void setForecastExportJobName(String forecastExportJobName) {
        this.forecastExportJobName = forecastExportJobName;
    }

    /**
     * <p>
     * The name for the forecast export job.
     * </p>
     * 
     * @return The name for the forecast export job.
     */

    public String getForecastExportJobName() {
        return this.forecastExportJobName;
    }

    /**
     * <p>
     * The name for the forecast export job.
     * </p>
     * 
     * @param forecastExportJobName
     *        The name for the forecast export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateForecastExportJobRequest withForecastExportJobName(String forecastExportJobName) {
        setForecastExportJobName(forecastExportJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast that you want to export.
     * </p>
     * 
     * @param forecastArn
     *        The Amazon Resource Name (ARN) of the forecast that you want to export.
     */

    public void setForecastArn(String forecastArn) {
        this.forecastArn = forecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast that you want to export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the forecast that you want to export.
     */

    public String getForecastArn() {
        return this.forecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast that you want to export.
     * </p>
     * 
     * @param forecastArn
     *        The Amazon Resource Name (ARN) of the forecast that you want to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateForecastExportJobRequest withForecastArn(String forecastArn) {
        setForecastArn(forecastArn);
        return this;
    }

    /**
     * <p>
     * The location where you want to save the forecast and an AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the location. The forecast must be exported to an Amazon S3 bucket.
     * </p>
     * <p>
     * If encryption is used, <code>Destination</code> must include an AWS Key Management Service (KMS) key. The IAM
     * role must allow Amazon Forecast permission to access the key.
     * </p>
     * 
     * @param destination
     *        The location where you want to save the forecast and an AWS Identity and Access Management (IAM) role that
     *        Amazon Forecast can assume to access the location. The forecast must be exported to an Amazon S3
     *        bucket.</p>
     *        <p>
     *        If encryption is used, <code>Destination</code> must include an AWS Key Management Service (KMS) key. The
     *        IAM role must allow Amazon Forecast permission to access the key.
     */

    public void setDestination(DataDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The location where you want to save the forecast and an AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the location. The forecast must be exported to an Amazon S3 bucket.
     * </p>
     * <p>
     * If encryption is used, <code>Destination</code> must include an AWS Key Management Service (KMS) key. The IAM
     * role must allow Amazon Forecast permission to access the key.
     * </p>
     * 
     * @return The location where you want to save the forecast and an AWS Identity and Access Management (IAM) role
     *         that Amazon Forecast can assume to access the location. The forecast must be exported to an Amazon S3
     *         bucket.</p>
     *         <p>
     *         If encryption is used, <code>Destination</code> must include an AWS Key Management Service (KMS) key. The
     *         IAM role must allow Amazon Forecast permission to access the key.
     */

    public DataDestination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The location where you want to save the forecast and an AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the location. The forecast must be exported to an Amazon S3 bucket.
     * </p>
     * <p>
     * If encryption is used, <code>Destination</code> must include an AWS Key Management Service (KMS) key. The IAM
     * role must allow Amazon Forecast permission to access the key.
     * </p>
     * 
     * @param destination
     *        The location where you want to save the forecast and an AWS Identity and Access Management (IAM) role that
     *        Amazon Forecast can assume to access the location. The forecast must be exported to an Amazon S3
     *        bucket.</p>
     *        <p>
     *        If encryption is used, <code>Destination</code> must include an AWS Key Management Service (KMS) key. The
     *        IAM role must allow Amazon Forecast permission to access the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateForecastExportJobRequest withDestination(DataDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The optional metadata that you apply to the forecast export job to help you categorize and organize them. Each
     * tag consists of a key and an optional value, both of which you define.
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
     * @return The optional metadata that you apply to the forecast export job to help you categorize and organize them.
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
     * The optional metadata that you apply to the forecast export job to help you categorize and organize them. Each
     * tag consists of a key and an optional value, both of which you define.
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
     *        The optional metadata that you apply to the forecast export job to help you categorize and organize them.
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
     * The optional metadata that you apply to the forecast export job to help you categorize and organize them. Each
     * tag consists of a key and an optional value, both of which you define.
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
     *        The optional metadata that you apply to the forecast export job to help you categorize and organize them.
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

    public CreateForecastExportJobRequest withTags(Tag... tags) {
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
     * The optional metadata that you apply to the forecast export job to help you categorize and organize them. Each
     * tag consists of a key and an optional value, both of which you define.
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
     *        The optional metadata that you apply to the forecast export job to help you categorize and organize them.
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

    public CreateForecastExportJobRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getForecastExportJobName() != null)
            sb.append("ForecastExportJobName: ").append(getForecastExportJobName()).append(",");
        if (getForecastArn() != null)
            sb.append("ForecastArn: ").append(getForecastArn()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
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

        if (obj instanceof CreateForecastExportJobRequest == false)
            return false;
        CreateForecastExportJobRequest other = (CreateForecastExportJobRequest) obj;
        if (other.getForecastExportJobName() == null ^ this.getForecastExportJobName() == null)
            return false;
        if (other.getForecastExportJobName() != null && other.getForecastExportJobName().equals(this.getForecastExportJobName()) == false)
            return false;
        if (other.getForecastArn() == null ^ this.getForecastArn() == null)
            return false;
        if (other.getForecastArn() != null && other.getForecastArn().equals(this.getForecastArn()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
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

        hashCode = prime * hashCode + ((getForecastExportJobName() == null) ? 0 : getForecastExportJobName().hashCode());
        hashCode = prime * hashCode + ((getForecastArn() == null) ? 0 : getForecastArn().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateForecastExportJobRequest clone() {
        return (CreateForecastExportJobRequest) super.clone();
    }

}
