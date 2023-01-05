/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfForecastExport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWhatIfForecastExportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the what-if forecast to export.
     * </p>
     */
    private String whatIfForecastExportName;
    /**
     * <p>
     * The list of what-if forecast Amazon Resource Names (ARNs) to export.
     * </p>
     */
    private java.util.List<String> whatIfForecastArns;
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
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the what if forecast.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The format of the exported data, CSV or PARQUET.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The name of the what-if forecast to export.
     * </p>
     * 
     * @param whatIfForecastExportName
     *        The name of the what-if forecast to export.
     */

    public void setWhatIfForecastExportName(String whatIfForecastExportName) {
        this.whatIfForecastExportName = whatIfForecastExportName;
    }

    /**
     * <p>
     * The name of the what-if forecast to export.
     * </p>
     * 
     * @return The name of the what-if forecast to export.
     */

    public String getWhatIfForecastExportName() {
        return this.whatIfForecastExportName;
    }

    /**
     * <p>
     * The name of the what-if forecast to export.
     * </p>
     * 
     * @param whatIfForecastExportName
     *        The name of the what-if forecast to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfForecastExportRequest withWhatIfForecastExportName(String whatIfForecastExportName) {
        setWhatIfForecastExportName(whatIfForecastExportName);
        return this;
    }

    /**
     * <p>
     * The list of what-if forecast Amazon Resource Names (ARNs) to export.
     * </p>
     * 
     * @return The list of what-if forecast Amazon Resource Names (ARNs) to export.
     */

    public java.util.List<String> getWhatIfForecastArns() {
        return whatIfForecastArns;
    }

    /**
     * <p>
     * The list of what-if forecast Amazon Resource Names (ARNs) to export.
     * </p>
     * 
     * @param whatIfForecastArns
     *        The list of what-if forecast Amazon Resource Names (ARNs) to export.
     */

    public void setWhatIfForecastArns(java.util.Collection<String> whatIfForecastArns) {
        if (whatIfForecastArns == null) {
            this.whatIfForecastArns = null;
            return;
        }

        this.whatIfForecastArns = new java.util.ArrayList<String>(whatIfForecastArns);
    }

    /**
     * <p>
     * The list of what-if forecast Amazon Resource Names (ARNs) to export.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWhatIfForecastArns(java.util.Collection)} or {@link #withWhatIfForecastArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param whatIfForecastArns
     *        The list of what-if forecast Amazon Resource Names (ARNs) to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfForecastExportRequest withWhatIfForecastArns(String... whatIfForecastArns) {
        if (this.whatIfForecastArns == null) {
            setWhatIfForecastArns(new java.util.ArrayList<String>(whatIfForecastArns.length));
        }
        for (String ele : whatIfForecastArns) {
            this.whatIfForecastArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of what-if forecast Amazon Resource Names (ARNs) to export.
     * </p>
     * 
     * @param whatIfForecastArns
     *        The list of what-if forecast Amazon Resource Names (ARNs) to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfForecastExportRequest withWhatIfForecastArns(java.util.Collection<String> whatIfForecastArns) {
        setWhatIfForecastArns(whatIfForecastArns);
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

    public CreateWhatIfForecastExportRequest withDestination(DataDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the what if forecast.
     * </p>
     * 
     * @return A list of <a
     *         href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to apply
     *         to the what if forecast.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the what if forecast.
     * </p>
     * 
     * @param tags
     *        A list of <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to apply to
     *        the what if forecast.
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
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the what if forecast.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to apply to
     *        the what if forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfForecastExportRequest withTags(Tag... tags) {
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
     * A list of <a href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to
     * apply to the what if forecast.
     * </p>
     * 
     * @param tags
     *        A list of <a
     *        href="https://docs.aws.amazon.com/forecast/latest/dg/tagging-forecast-resources.html">tags</a> to apply to
     *        the what if forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfForecastExportRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The format of the exported data, CSV or PARQUET.
     * </p>
     * 
     * @param format
     *        The format of the exported data, CSV or PARQUET.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the exported data, CSV or PARQUET.
     * </p>
     * 
     * @return The format of the exported data, CSV or PARQUET.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the exported data, CSV or PARQUET.
     * </p>
     * 
     * @param format
     *        The format of the exported data, CSV or PARQUET.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWhatIfForecastExportRequest withFormat(String format) {
        setFormat(format);
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
        if (getWhatIfForecastExportName() != null)
            sb.append("WhatIfForecastExportName: ").append(getWhatIfForecastExportName()).append(",");
        if (getWhatIfForecastArns() != null)
            sb.append("WhatIfForecastArns: ").append(getWhatIfForecastArns()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWhatIfForecastExportRequest == false)
            return false;
        CreateWhatIfForecastExportRequest other = (CreateWhatIfForecastExportRequest) obj;
        if (other.getWhatIfForecastExportName() == null ^ this.getWhatIfForecastExportName() == null)
            return false;
        if (other.getWhatIfForecastExportName() != null && other.getWhatIfForecastExportName().equals(this.getWhatIfForecastExportName()) == false)
            return false;
        if (other.getWhatIfForecastArns() == null ^ this.getWhatIfForecastArns() == null)
            return false;
        if (other.getWhatIfForecastArns() != null && other.getWhatIfForecastArns().equals(this.getWhatIfForecastArns()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWhatIfForecastExportName() == null) ? 0 : getWhatIfForecastExportName().hashCode());
        hashCode = prime * hashCode + ((getWhatIfForecastArns() == null) ? 0 : getWhatIfForecastArns().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public CreateWhatIfForecastExportRequest clone() {
        return (CreateWhatIfForecastExportRequest) super.clone();
    }

}
