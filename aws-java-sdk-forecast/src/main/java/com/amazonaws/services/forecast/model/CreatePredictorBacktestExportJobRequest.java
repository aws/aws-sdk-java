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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreatePredictorBacktestExportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePredictorBacktestExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the backtest export job.
     * </p>
     */
    private String predictorBacktestExportJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor that you want to export.
     * </p>
     */
    private String predictorArn;

    private DataDestination destination;
    /**
     * <p>
     * Optional metadata to help you categorize and organize your backtests. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the backtest export job.
     * </p>
     * 
     * @param predictorBacktestExportJobName
     *        The name for the backtest export job.
     */

    public void setPredictorBacktestExportJobName(String predictorBacktestExportJobName) {
        this.predictorBacktestExportJobName = predictorBacktestExportJobName;
    }

    /**
     * <p>
     * The name for the backtest export job.
     * </p>
     * 
     * @return The name for the backtest export job.
     */

    public String getPredictorBacktestExportJobName() {
        return this.predictorBacktestExportJobName;
    }

    /**
     * <p>
     * The name for the backtest export job.
     * </p>
     * 
     * @param predictorBacktestExportJobName
     *        The name for the backtest export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorBacktestExportJobRequest withPredictorBacktestExportJobName(String predictorBacktestExportJobName) {
        setPredictorBacktestExportJobName(predictorBacktestExportJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor that you want to export.
     * </p>
     * 
     * @param predictorArn
     *        The Amazon Resource Name (ARN) of the predictor that you want to export.
     */

    public void setPredictorArn(String predictorArn) {
        this.predictorArn = predictorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor that you want to export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the predictor that you want to export.
     */

    public String getPredictorArn() {
        return this.predictorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor that you want to export.
     * </p>
     * 
     * @param predictorArn
     *        The Amazon Resource Name (ARN) of the predictor that you want to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorBacktestExportJobRequest withPredictorArn(String predictorArn) {
        setPredictorArn(predictorArn);
        return this;
    }

    /**
     * @param destination
     */

    public void setDestination(DataDestination destination) {
        this.destination = destination;
    }

    /**
     * @return
     */

    public DataDestination getDestination() {
        return this.destination;
    }

    /**
     * @param destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorBacktestExportJobRequest withDestination(DataDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Optional metadata to help you categorize and organize your backtests. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Optional metadata to help you categorize and organize your backtests. Each tag consists of a key and an
     *         optional value, both of which you define. Tag keys and values are case sensitive.</p>
     *         <p>
     *         The following restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique and each tag key must have one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource: 50.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length: 128 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length: 256 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your
     *         tagging schema is used across other services and resources, the character restrictions of those services
     *         also apply.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>.
     *         Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not,
     *         Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the
     *         key prefix of <code>aws</code> do not count against your tags per resource limit. You cannot edit or
     *         delete tag keys with this prefix.
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata to help you categorize and organize your backtests. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Optional metadata to help you categorize and organize your backtests. Each tag consists of a key and an
     *        optional value, both of which you define. Tag keys and values are case sensitive.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique and each tag key must have one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource: 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your
     *        tagging schema is used across other services and resources, the character restrictions of those services
     *        also apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>.
     *        Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not,
     *        Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key
     *        prefix of <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete
     *        tag keys with this prefix.
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
     * Optional metadata to help you categorize and organize your backtests. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
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
     *        Optional metadata to help you categorize and organize your backtests. Each tag consists of a key and an
     *        optional value, both of which you define. Tag keys and values are case sensitive.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique and each tag key must have one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource: 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your
     *        tagging schema is used across other services and resources, the character restrictions of those services
     *        also apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>.
     *        Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not,
     *        Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key
     *        prefix of <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete
     *        tag keys with this prefix.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorBacktestExportJobRequest withTags(Tag... tags) {
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
     * Optional metadata to help you categorize and organize your backtests. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Optional metadata to help you categorize and organize your backtests. Each tag consists of a key and an
     *        optional value, both of which you define. Tag keys and values are case sensitive.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique and each tag key must have one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource: 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your
     *        tagging schema is used across other services and resources, the character restrictions of those services
     *        also apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>.
     *        Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not,
     *        Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key
     *        prefix of <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete
     *        tag keys with this prefix.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePredictorBacktestExportJobRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPredictorBacktestExportJobName() != null)
            sb.append("PredictorBacktestExportJobName: ").append(getPredictorBacktestExportJobName()).append(",");
        if (getPredictorArn() != null)
            sb.append("PredictorArn: ").append(getPredictorArn()).append(",");
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

        if (obj instanceof CreatePredictorBacktestExportJobRequest == false)
            return false;
        CreatePredictorBacktestExportJobRequest other = (CreatePredictorBacktestExportJobRequest) obj;
        if (other.getPredictorBacktestExportJobName() == null ^ this.getPredictorBacktestExportJobName() == null)
            return false;
        if (other.getPredictorBacktestExportJobName() != null
                && other.getPredictorBacktestExportJobName().equals(this.getPredictorBacktestExportJobName()) == false)
            return false;
        if (other.getPredictorArn() == null ^ this.getPredictorArn() == null)
            return false;
        if (other.getPredictorArn() != null && other.getPredictorArn().equals(this.getPredictorArn()) == false)
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

        hashCode = prime * hashCode + ((getPredictorBacktestExportJobName() == null) ? 0 : getPredictorBacktestExportJobName().hashCode());
        hashCode = prime * hashCode + ((getPredictorArn() == null) ? 0 : getPredictorArn().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePredictorBacktestExportJobRequest clone() {
        return (CreatePredictorBacktestExportJobRequest) super.clone();
    }

}
