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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateExplainability" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExplainabilityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name for the Explainability.
     * </p>
     */
    private String explainabilityName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The configuration settings that define the granularity of time series and time points for the Explainability.
     * </p>
     */
    private ExplainabilityConfig explainabilityConfig;

    private DataSource dataSource;

    private Schema schema;
    /**
     * <p>
     * Create an Explainability visualization that is viewable within the AWS console.
     * </p>
     */
    private Boolean enableVisualization;
    /**
     * <p>
     * If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the first point for the
     * Explainability.
     * </p>
     * <p>
     * Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     * </p>
     */
    private String startDateTime;
    /**
     * <p>
     * If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the last time point for the
     * Explainability.
     * </p>
     * <p>
     * Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     * </p>
     */
    private String endDateTime;
    /**
     * <p>
     * Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an optional
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
     * A unique name for the Explainability.
     * </p>
     * 
     * @param explainabilityName
     *        A unique name for the Explainability.
     */

    public void setExplainabilityName(String explainabilityName) {
        this.explainabilityName = explainabilityName;
    }

    /**
     * <p>
     * A unique name for the Explainability.
     * </p>
     * 
     * @return A unique name for the Explainability.
     */

    public String getExplainabilityName() {
        return this.explainabilityName;
    }

    /**
     * <p>
     * A unique name for the Explainability.
     * </p>
     * 
     * @param explainabilityName
     *        A unique name for the Explainability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityRequest withExplainabilityName(String explainabilityName) {
        setExplainabilityName(explainabilityName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The configuration settings that define the granularity of time series and time points for the Explainability.
     * </p>
     * 
     * @param explainabilityConfig
     *        The configuration settings that define the granularity of time series and time points for the
     *        Explainability.
     */

    public void setExplainabilityConfig(ExplainabilityConfig explainabilityConfig) {
        this.explainabilityConfig = explainabilityConfig;
    }

    /**
     * <p>
     * The configuration settings that define the granularity of time series and time points for the Explainability.
     * </p>
     * 
     * @return The configuration settings that define the granularity of time series and time points for the
     *         Explainability.
     */

    public ExplainabilityConfig getExplainabilityConfig() {
        return this.explainabilityConfig;
    }

    /**
     * <p>
     * The configuration settings that define the granularity of time series and time points for the Explainability.
     * </p>
     * 
     * @param explainabilityConfig
     *        The configuration settings that define the granularity of time series and time points for the
     *        Explainability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityRequest withExplainabilityConfig(ExplainabilityConfig explainabilityConfig) {
        setExplainabilityConfig(explainabilityConfig);
        return this;
    }

    /**
     * @param dataSource
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * @return
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * @param dataSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityRequest withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * @param schema
     */

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    /**
     * @return
     */

    public Schema getSchema() {
        return this.schema;
    }

    /**
     * @param schema
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityRequest withSchema(Schema schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * Create an Explainability visualization that is viewable within the AWS console.
     * </p>
     * 
     * @param enableVisualization
     *        Create an Explainability visualization that is viewable within the AWS console.
     */

    public void setEnableVisualization(Boolean enableVisualization) {
        this.enableVisualization = enableVisualization;
    }

    /**
     * <p>
     * Create an Explainability visualization that is viewable within the AWS console.
     * </p>
     * 
     * @return Create an Explainability visualization that is viewable within the AWS console.
     */

    public Boolean getEnableVisualization() {
        return this.enableVisualization;
    }

    /**
     * <p>
     * Create an Explainability visualization that is viewable within the AWS console.
     * </p>
     * 
     * @param enableVisualization
     *        Create an Explainability visualization that is viewable within the AWS console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityRequest withEnableVisualization(Boolean enableVisualization) {
        setEnableVisualization(enableVisualization);
        return this;
    }

    /**
     * <p>
     * Create an Explainability visualization that is viewable within the AWS console.
     * </p>
     * 
     * @return Create an Explainability visualization that is viewable within the AWS console.
     */

    public Boolean isEnableVisualization() {
        return this.enableVisualization;
    }

    /**
     * <p>
     * If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the first point for the
     * Explainability.
     * </p>
     * <p>
     * Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     * </p>
     * 
     * @param startDateTime
     *        If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the first point for the
     *        Explainability.</p>
     *        <p>
     *        Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     */

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the first point for the
     * Explainability.
     * </p>
     * <p>
     * Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     * </p>
     * 
     * @return If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the first point for the
     *         Explainability.</p>
     *         <p>
     *         Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     */

    public String getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the first point for the
     * Explainability.
     * </p>
     * <p>
     * Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     * </p>
     * 
     * @param startDateTime
     *        If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the first point for the
     *        Explainability.</p>
     *        <p>
     *        Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityRequest withStartDateTime(String startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the last time point for the
     * Explainability.
     * </p>
     * <p>
     * Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     * </p>
     * 
     * @param endDateTime
     *        If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the last time point for the
     *        Explainability.</p>
     *        <p>
     *        Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     */

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the last time point for the
     * Explainability.
     * </p>
     * <p>
     * Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     * </p>
     * 
     * @return If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the last time point for the
     *         Explainability.</p>
     *         <p>
     *         Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     */

    public String getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the last time point for the
     * Explainability.
     * </p>
     * <p>
     * Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     * </p>
     * 
     * @param endDateTime
     *        If <code>TimePointGranularity</code> is set to <code>SPECIFIC</code>, define the last time point for the
     *        Explainability.</p>
     *        <p>
     *        Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityRequest withEndDateTime(String endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * <p>
     * Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an optional
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
     * @return Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an
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
     * Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an optional
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
     *        Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an
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
     * Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an optional
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
     *        Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an
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

    public CreateExplainabilityRequest withTags(Tag... tags) {
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
     * Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an optional
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
     *        Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an
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

    public CreateExplainabilityRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getExplainabilityName() != null)
            sb.append("ExplainabilityName: ").append(getExplainabilityName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getExplainabilityConfig() != null)
            sb.append("ExplainabilityConfig: ").append(getExplainabilityConfig()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getEnableVisualization() != null)
            sb.append("EnableVisualization: ").append(getEnableVisualization()).append(",");
        if (getStartDateTime() != null)
            sb.append("StartDateTime: ").append(getStartDateTime()).append(",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: ").append(getEndDateTime()).append(",");
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

        if (obj instanceof CreateExplainabilityRequest == false)
            return false;
        CreateExplainabilityRequest other = (CreateExplainabilityRequest) obj;
        if (other.getExplainabilityName() == null ^ this.getExplainabilityName() == null)
            return false;
        if (other.getExplainabilityName() != null && other.getExplainabilityName().equals(this.getExplainabilityName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getExplainabilityConfig() == null ^ this.getExplainabilityConfig() == null)
            return false;
        if (other.getExplainabilityConfig() != null && other.getExplainabilityConfig().equals(this.getExplainabilityConfig()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getEnableVisualization() == null ^ this.getEnableVisualization() == null)
            return false;
        if (other.getEnableVisualization() != null && other.getEnableVisualization().equals(this.getEnableVisualization()) == false)
            return false;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
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

        hashCode = prime * hashCode + ((getExplainabilityName() == null) ? 0 : getExplainabilityName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getExplainabilityConfig() == null) ? 0 : getExplainabilityConfig().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getEnableVisualization() == null) ? 0 : getEnableVisualization().hashCode());
        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateExplainabilityRequest clone() {
        return (CreateExplainabilityRequest) super.clone();
    }

}
