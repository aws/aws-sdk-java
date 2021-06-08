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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateForecast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateForecastRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the forecast.
     * </p>
     */
    private String forecastName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     * </p>
     */
    private String predictorArn;
    /**
     * <p>
     * The quantiles at which probabilistic forecasts are generated. <b>You can currently specify up to 5 quantiles per
     * forecast</b>. Accepted values include <code>0.01 to 0.99</code> (increments of .01 only) and <code>mean</code>.
     * The mean forecast is different from the median (0.50) when the distribution is not symmetric (for example, Beta
     * and Negative Binomial). The default value is <code>["0.1", "0.5", "0.9"]</code>.
     * </p>
     */
    private java.util.List<String> forecastTypes;
    /**
     * <p>
     * The optional metadata that you apply to the forecast to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
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
     * A name for the forecast.
     * </p>
     * 
     * @param forecastName
     *        A name for the forecast.
     */

    public void setForecastName(String forecastName) {
        this.forecastName = forecastName;
    }

    /**
     * <p>
     * A name for the forecast.
     * </p>
     * 
     * @return A name for the forecast.
     */

    public String getForecastName() {
        return this.forecastName;
    }

    /**
     * <p>
     * A name for the forecast.
     * </p>
     * 
     * @param forecastName
     *        A name for the forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateForecastRequest withForecastName(String forecastName) {
        setForecastName(forecastName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     * </p>
     * 
     * @param predictorArn
     *        The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     */

    public void setPredictorArn(String predictorArn) {
        this.predictorArn = predictorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     */

    public String getPredictorArn() {
        return this.predictorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     * </p>
     * 
     * @param predictorArn
     *        The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateForecastRequest withPredictorArn(String predictorArn) {
        setPredictorArn(predictorArn);
        return this;
    }

    /**
     * <p>
     * The quantiles at which probabilistic forecasts are generated. <b>You can currently specify up to 5 quantiles per
     * forecast</b>. Accepted values include <code>0.01 to 0.99</code> (increments of .01 only) and <code>mean</code>.
     * The mean forecast is different from the median (0.50) when the distribution is not symmetric (for example, Beta
     * and Negative Binomial). The default value is <code>["0.1", "0.5", "0.9"]</code>.
     * </p>
     * 
     * @return The quantiles at which probabilistic forecasts are generated. <b>You can currently specify up to 5
     *         quantiles per forecast</b>. Accepted values include <code>0.01 to 0.99</code> (increments of .01 only)
     *         and <code>mean</code>. The mean forecast is different from the median (0.50) when the distribution is not
     *         symmetric (for example, Beta and Negative Binomial). The default value is
     *         <code>["0.1", "0.5", "0.9"]</code>.
     */

    public java.util.List<String> getForecastTypes() {
        return forecastTypes;
    }

    /**
     * <p>
     * The quantiles at which probabilistic forecasts are generated. <b>You can currently specify up to 5 quantiles per
     * forecast</b>. Accepted values include <code>0.01 to 0.99</code> (increments of .01 only) and <code>mean</code>.
     * The mean forecast is different from the median (0.50) when the distribution is not symmetric (for example, Beta
     * and Negative Binomial). The default value is <code>["0.1", "0.5", "0.9"]</code>.
     * </p>
     * 
     * @param forecastTypes
     *        The quantiles at which probabilistic forecasts are generated. <b>You can currently specify up to 5
     *        quantiles per forecast</b>. Accepted values include <code>0.01 to 0.99</code> (increments of .01 only) and
     *        <code>mean</code>. The mean forecast is different from the median (0.50) when the distribution is not
     *        symmetric (for example, Beta and Negative Binomial). The default value is
     *        <code>["0.1", "0.5", "0.9"]</code>.
     */

    public void setForecastTypes(java.util.Collection<String> forecastTypes) {
        if (forecastTypes == null) {
            this.forecastTypes = null;
            return;
        }

        this.forecastTypes = new java.util.ArrayList<String>(forecastTypes);
    }

    /**
     * <p>
     * The quantiles at which probabilistic forecasts are generated. <b>You can currently specify up to 5 quantiles per
     * forecast</b>. Accepted values include <code>0.01 to 0.99</code> (increments of .01 only) and <code>mean</code>.
     * The mean forecast is different from the median (0.50) when the distribution is not symmetric (for example, Beta
     * and Negative Binomial). The default value is <code>["0.1", "0.5", "0.9"]</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForecastTypes(java.util.Collection)} or {@link #withForecastTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param forecastTypes
     *        The quantiles at which probabilistic forecasts are generated. <b>You can currently specify up to 5
     *        quantiles per forecast</b>. Accepted values include <code>0.01 to 0.99</code> (increments of .01 only) and
     *        <code>mean</code>. The mean forecast is different from the median (0.50) when the distribution is not
     *        symmetric (for example, Beta and Negative Binomial). The default value is
     *        <code>["0.1", "0.5", "0.9"]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateForecastRequest withForecastTypes(String... forecastTypes) {
        if (this.forecastTypes == null) {
            setForecastTypes(new java.util.ArrayList<String>(forecastTypes.length));
        }
        for (String ele : forecastTypes) {
            this.forecastTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The quantiles at which probabilistic forecasts are generated. <b>You can currently specify up to 5 quantiles per
     * forecast</b>. Accepted values include <code>0.01 to 0.99</code> (increments of .01 only) and <code>mean</code>.
     * The mean forecast is different from the median (0.50) when the distribution is not symmetric (for example, Beta
     * and Negative Binomial). The default value is <code>["0.1", "0.5", "0.9"]</code>.
     * </p>
     * 
     * @param forecastTypes
     *        The quantiles at which probabilistic forecasts are generated. <b>You can currently specify up to 5
     *        quantiles per forecast</b>. Accepted values include <code>0.01 to 0.99</code> (increments of .01 only) and
     *        <code>mean</code>. The mean forecast is different from the median (0.50) when the distribution is not
     *        symmetric (for example, Beta and Negative Binomial). The default value is
     *        <code>["0.1", "0.5", "0.9"]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateForecastRequest withForecastTypes(java.util.Collection<String> forecastTypes) {
        setForecastTypes(forecastTypes);
        return this;
    }

    /**
     * <p>
     * The optional metadata that you apply to the forecast to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
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
     * @return The optional metadata that you apply to the forecast to help you categorize and organize them. Each tag
     *         consists of a key and an optional value, both of which you define.</p>
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
     * The optional metadata that you apply to the forecast to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
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
     *        The optional metadata that you apply to the forecast to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define.</p>
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
     * The optional metadata that you apply to the forecast to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
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
     *        The optional metadata that you apply to the forecast to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define.</p>
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

    public CreateForecastRequest withTags(Tag... tags) {
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
     * The optional metadata that you apply to the forecast to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
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
     *        The optional metadata that you apply to the forecast to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define.</p>
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

    public CreateForecastRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getForecastName() != null)
            sb.append("ForecastName: ").append(getForecastName()).append(",");
        if (getPredictorArn() != null)
            sb.append("PredictorArn: ").append(getPredictorArn()).append(",");
        if (getForecastTypes() != null)
            sb.append("ForecastTypes: ").append(getForecastTypes()).append(",");
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

        if (obj instanceof CreateForecastRequest == false)
            return false;
        CreateForecastRequest other = (CreateForecastRequest) obj;
        if (other.getForecastName() == null ^ this.getForecastName() == null)
            return false;
        if (other.getForecastName() != null && other.getForecastName().equals(this.getForecastName()) == false)
            return false;
        if (other.getPredictorArn() == null ^ this.getPredictorArn() == null)
            return false;
        if (other.getPredictorArn() != null && other.getPredictorArn().equals(this.getPredictorArn()) == false)
            return false;
        if (other.getForecastTypes() == null ^ this.getForecastTypes() == null)
            return false;
        if (other.getForecastTypes() != null && other.getForecastTypes().equals(this.getForecastTypes()) == false)
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

        hashCode = prime * hashCode + ((getForecastName() == null) ? 0 : getForecastName().hashCode());
        hashCode = prime * hashCode + ((getPredictorArn() == null) ? 0 : getPredictorArn().hashCode());
        hashCode = prime * hashCode + ((getForecastTypes() == null) ? 0 : getForecastTypes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateForecastRequest clone() {
        return (CreateForecastRequest) super.clone();
    }

}
