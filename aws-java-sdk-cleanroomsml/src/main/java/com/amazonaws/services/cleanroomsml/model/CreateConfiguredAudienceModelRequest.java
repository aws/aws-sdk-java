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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateConfiguredAudienceModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfiguredAudienceModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model to use for the configured audience model.
     * </p>
     */
    private String audienceModelArn;
    /**
     * <p>
     * Configure the list of output sizes of audiences that can be created using this configured audience model. A
     * request to <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an
     * <code>audienceSize</code> selected from this list. You can use the <code>ABSOLUTE</code> <a>AudienceSize</a> to
     * configure out audience sizes using the count of identifiers in the output. You can use the
     * <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     * </p>
     */
    private AudienceSizeConfig audienceSizeConfig;
    /**
     * <p>
     * Configure how the service tags audience generation jobs created using this configured audience model. If you
     * specify <code>NONE</code>, the tags from the <a>StartAudienceGenerationJob</a> request determine the tags of the
     * audience generation job. If you specify <code>FROM_PARENT_RESOURCE</code>, the audience generation job inherits
     * the tags from the configured audience model, by default. Tags in the <a>StartAudienceGenerationJob</a> will
     * override the default.
     * </p>
     * <p>
     * When the client is in a different account than the configured audience model, the tags from the client are never
     * applied to a resource in the caller's account.
     * </p>
     */
    private String childResourceTagOnCreatePolicy;
    /**
     * <p>
     * The description of the configured audience model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The minimum number of users from the seed audience that must match with users in the training data of the
     * audience model. The default value is 500.
     * </p>
     */
    private Integer minMatchingSeedSize;
    /**
     * <p>
     * The name of the configured audience model.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Configure the Amazon S3 location and IAM Role for audiences created using this configured audience model. Each
     * audience will have a unique location. The IAM Role must have <code>s3:PutObject</code> permission on the
     * destination Amazon S3 location. If the destination is protected with Amazon S3 KMS-SSE, then the Role must also
     * have the required KMS permissions.
     * </p>
     */
    private ConfiguredAudienceModelOutputConfig outputConfig;
    /**
     * <p>
     * Whether audience metrics are shared.
     * </p>
     */
    private java.util.List<String> sharedAudienceMetrics;
    /**
     * <p>
     * The optional metadata that you apply to the resource to help you categorize and organize them. Each tag consists
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
     * Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for
     * AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws
     * as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag and will count against the
     * limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model to use for the configured audience model.
     * </p>
     * 
     * @param audienceModelArn
     *        The Amazon Resource Name (ARN) of the audience model to use for the configured audience model.
     */

    public void setAudienceModelArn(String audienceModelArn) {
        this.audienceModelArn = audienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model to use for the configured audience model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the audience model to use for the configured audience model.
     */

    public String getAudienceModelArn() {
        return this.audienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model to use for the configured audience model.
     * </p>
     * 
     * @param audienceModelArn
     *        The Amazon Resource Name (ARN) of the audience model to use for the configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelRequest withAudienceModelArn(String audienceModelArn) {
        setAudienceModelArn(audienceModelArn);
        return this;
    }

    /**
     * <p>
     * Configure the list of output sizes of audiences that can be created using this configured audience model. A
     * request to <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an
     * <code>audienceSize</code> selected from this list. You can use the <code>ABSOLUTE</code> <a>AudienceSize</a> to
     * configure out audience sizes using the count of identifiers in the output. You can use the
     * <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     * </p>
     * 
     * @param audienceSizeConfig
     *        Configure the list of output sizes of audiences that can be created using this configured audience model.
     *        A request to <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an
     *        <code>audienceSize</code> selected from this list. You can use the <code>ABSOLUTE</code>
     *        <a>AudienceSize</a> to configure out audience sizes using the count of identifiers in the output. You can
     *        use the <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     */

    public void setAudienceSizeConfig(AudienceSizeConfig audienceSizeConfig) {
        this.audienceSizeConfig = audienceSizeConfig;
    }

    /**
     * <p>
     * Configure the list of output sizes of audiences that can be created using this configured audience model. A
     * request to <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an
     * <code>audienceSize</code> selected from this list. You can use the <code>ABSOLUTE</code> <a>AudienceSize</a> to
     * configure out audience sizes using the count of identifiers in the output. You can use the
     * <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     * </p>
     * 
     * @return Configure the list of output sizes of audiences that can be created using this configured audience model.
     *         A request to <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an
     *         <code>audienceSize</code> selected from this list. You can use the <code>ABSOLUTE</code>
     *         <a>AudienceSize</a> to configure out audience sizes using the count of identifiers in the output. You can
     *         use the <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     */

    public AudienceSizeConfig getAudienceSizeConfig() {
        return this.audienceSizeConfig;
    }

    /**
     * <p>
     * Configure the list of output sizes of audiences that can be created using this configured audience model. A
     * request to <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an
     * <code>audienceSize</code> selected from this list. You can use the <code>ABSOLUTE</code> <a>AudienceSize</a> to
     * configure out audience sizes using the count of identifiers in the output. You can use the
     * <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     * </p>
     * 
     * @param audienceSizeConfig
     *        Configure the list of output sizes of audiences that can be created using this configured audience model.
     *        A request to <a>StartAudienceGenerationJob</a> that uses this configured audience model must have an
     *        <code>audienceSize</code> selected from this list. You can use the <code>ABSOLUTE</code>
     *        <a>AudienceSize</a> to configure out audience sizes using the count of identifiers in the output. You can
     *        use the <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelRequest withAudienceSizeConfig(AudienceSizeConfig audienceSizeConfig) {
        setAudienceSizeConfig(audienceSizeConfig);
        return this;
    }

    /**
     * <p>
     * Configure how the service tags audience generation jobs created using this configured audience model. If you
     * specify <code>NONE</code>, the tags from the <a>StartAudienceGenerationJob</a> request determine the tags of the
     * audience generation job. If you specify <code>FROM_PARENT_RESOURCE</code>, the audience generation job inherits
     * the tags from the configured audience model, by default. Tags in the <a>StartAudienceGenerationJob</a> will
     * override the default.
     * </p>
     * <p>
     * When the client is in a different account than the configured audience model, the tags from the client are never
     * applied to a resource in the caller's account.
     * </p>
     * 
     * @param childResourceTagOnCreatePolicy
     *        Configure how the service tags audience generation jobs created using this configured audience model. If
     *        you specify <code>NONE</code>, the tags from the <a>StartAudienceGenerationJob</a> request determine the
     *        tags of the audience generation job. If you specify <code>FROM_PARENT_RESOURCE</code>, the audience
     *        generation job inherits the tags from the configured audience model, by default. Tags in the
     *        <a>StartAudienceGenerationJob</a> will override the default.</p>
     *        <p>
     *        When the client is in a different account than the configured audience model, the tags from the client are
     *        never applied to a resource in the caller's account.
     * @see TagOnCreatePolicy
     */

    public void setChildResourceTagOnCreatePolicy(String childResourceTagOnCreatePolicy) {
        this.childResourceTagOnCreatePolicy = childResourceTagOnCreatePolicy;
    }

    /**
     * <p>
     * Configure how the service tags audience generation jobs created using this configured audience model. If you
     * specify <code>NONE</code>, the tags from the <a>StartAudienceGenerationJob</a> request determine the tags of the
     * audience generation job. If you specify <code>FROM_PARENT_RESOURCE</code>, the audience generation job inherits
     * the tags from the configured audience model, by default. Tags in the <a>StartAudienceGenerationJob</a> will
     * override the default.
     * </p>
     * <p>
     * When the client is in a different account than the configured audience model, the tags from the client are never
     * applied to a resource in the caller's account.
     * </p>
     * 
     * @return Configure how the service tags audience generation jobs created using this configured audience model. If
     *         you specify <code>NONE</code>, the tags from the <a>StartAudienceGenerationJob</a> request determine the
     *         tags of the audience generation job. If you specify <code>FROM_PARENT_RESOURCE</code>, the audience
     *         generation job inherits the tags from the configured audience model, by default. Tags in the
     *         <a>StartAudienceGenerationJob</a> will override the default.</p>
     *         <p>
     *         When the client is in a different account than the configured audience model, the tags from the client
     *         are never applied to a resource in the caller's account.
     * @see TagOnCreatePolicy
     */

    public String getChildResourceTagOnCreatePolicy() {
        return this.childResourceTagOnCreatePolicy;
    }

    /**
     * <p>
     * Configure how the service tags audience generation jobs created using this configured audience model. If you
     * specify <code>NONE</code>, the tags from the <a>StartAudienceGenerationJob</a> request determine the tags of the
     * audience generation job. If you specify <code>FROM_PARENT_RESOURCE</code>, the audience generation job inherits
     * the tags from the configured audience model, by default. Tags in the <a>StartAudienceGenerationJob</a> will
     * override the default.
     * </p>
     * <p>
     * When the client is in a different account than the configured audience model, the tags from the client are never
     * applied to a resource in the caller's account.
     * </p>
     * 
     * @param childResourceTagOnCreatePolicy
     *        Configure how the service tags audience generation jobs created using this configured audience model. If
     *        you specify <code>NONE</code>, the tags from the <a>StartAudienceGenerationJob</a> request determine the
     *        tags of the audience generation job. If you specify <code>FROM_PARENT_RESOURCE</code>, the audience
     *        generation job inherits the tags from the configured audience model, by default. Tags in the
     *        <a>StartAudienceGenerationJob</a> will override the default.</p>
     *        <p>
     *        When the client is in a different account than the configured audience model, the tags from the client are
     *        never applied to a resource in the caller's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TagOnCreatePolicy
     */

    public CreateConfiguredAudienceModelRequest withChildResourceTagOnCreatePolicy(String childResourceTagOnCreatePolicy) {
        setChildResourceTagOnCreatePolicy(childResourceTagOnCreatePolicy);
        return this;
    }

    /**
     * <p>
     * Configure how the service tags audience generation jobs created using this configured audience model. If you
     * specify <code>NONE</code>, the tags from the <a>StartAudienceGenerationJob</a> request determine the tags of the
     * audience generation job. If you specify <code>FROM_PARENT_RESOURCE</code>, the audience generation job inherits
     * the tags from the configured audience model, by default. Tags in the <a>StartAudienceGenerationJob</a> will
     * override the default.
     * </p>
     * <p>
     * When the client is in a different account than the configured audience model, the tags from the client are never
     * applied to a resource in the caller's account.
     * </p>
     * 
     * @param childResourceTagOnCreatePolicy
     *        Configure how the service tags audience generation jobs created using this configured audience model. If
     *        you specify <code>NONE</code>, the tags from the <a>StartAudienceGenerationJob</a> request determine the
     *        tags of the audience generation job. If you specify <code>FROM_PARENT_RESOURCE</code>, the audience
     *        generation job inherits the tags from the configured audience model, by default. Tags in the
     *        <a>StartAudienceGenerationJob</a> will override the default.</p>
     *        <p>
     *        When the client is in a different account than the configured audience model, the tags from the client are
     *        never applied to a resource in the caller's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TagOnCreatePolicy
     */

    public CreateConfiguredAudienceModelRequest withChildResourceTagOnCreatePolicy(TagOnCreatePolicy childResourceTagOnCreatePolicy) {
        this.childResourceTagOnCreatePolicy = childResourceTagOnCreatePolicy.toString();
        return this;
    }

    /**
     * <p>
     * The description of the configured audience model.
     * </p>
     * 
     * @param description
     *        The description of the configured audience model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the configured audience model.
     * </p>
     * 
     * @return The description of the configured audience model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the configured audience model.
     * </p>
     * 
     * @param description
     *        The description of the configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The minimum number of users from the seed audience that must match with users in the training data of the
     * audience model. The default value is 500.
     * </p>
     * 
     * @param minMatchingSeedSize
     *        The minimum number of users from the seed audience that must match with users in the training data of the
     *        audience model. The default value is 500.
     */

    public void setMinMatchingSeedSize(Integer minMatchingSeedSize) {
        this.minMatchingSeedSize = minMatchingSeedSize;
    }

    /**
     * <p>
     * The minimum number of users from the seed audience that must match with users in the training data of the
     * audience model. The default value is 500.
     * </p>
     * 
     * @return The minimum number of users from the seed audience that must match with users in the training data of the
     *         audience model. The default value is 500.
     */

    public Integer getMinMatchingSeedSize() {
        return this.minMatchingSeedSize;
    }

    /**
     * <p>
     * The minimum number of users from the seed audience that must match with users in the training data of the
     * audience model. The default value is 500.
     * </p>
     * 
     * @param minMatchingSeedSize
     *        The minimum number of users from the seed audience that must match with users in the training data of the
     *        audience model. The default value is 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelRequest withMinMatchingSeedSize(Integer minMatchingSeedSize) {
        setMinMatchingSeedSize(minMatchingSeedSize);
        return this;
    }

    /**
     * <p>
     * The name of the configured audience model.
     * </p>
     * 
     * @param name
     *        The name of the configured audience model.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configured audience model.
     * </p>
     * 
     * @return The name of the configured audience model.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configured audience model.
     * </p>
     * 
     * @param name
     *        The name of the configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Configure the Amazon S3 location and IAM Role for audiences created using this configured audience model. Each
     * audience will have a unique location. The IAM Role must have <code>s3:PutObject</code> permission on the
     * destination Amazon S3 location. If the destination is protected with Amazon S3 KMS-SSE, then the Role must also
     * have the required KMS permissions.
     * </p>
     * 
     * @param outputConfig
     *        Configure the Amazon S3 location and IAM Role for audiences created using this configured audience model.
     *        Each audience will have a unique location. The IAM Role must have <code>s3:PutObject</code> permission on
     *        the destination Amazon S3 location. If the destination is protected with Amazon S3 KMS-SSE, then the Role
     *        must also have the required KMS permissions.
     */

    public void setOutputConfig(ConfiguredAudienceModelOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Configure the Amazon S3 location and IAM Role for audiences created using this configured audience model. Each
     * audience will have a unique location. The IAM Role must have <code>s3:PutObject</code> permission on the
     * destination Amazon S3 location. If the destination is protected with Amazon S3 KMS-SSE, then the Role must also
     * have the required KMS permissions.
     * </p>
     * 
     * @return Configure the Amazon S3 location and IAM Role for audiences created using this configured audience model.
     *         Each audience will have a unique location. The IAM Role must have <code>s3:PutObject</code> permission on
     *         the destination Amazon S3 location. If the destination is protected with Amazon S3 KMS-SSE, then the Role
     *         must also have the required KMS permissions.
     */

    public ConfiguredAudienceModelOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * Configure the Amazon S3 location and IAM Role for audiences created using this configured audience model. Each
     * audience will have a unique location. The IAM Role must have <code>s3:PutObject</code> permission on the
     * destination Amazon S3 location. If the destination is protected with Amazon S3 KMS-SSE, then the Role must also
     * have the required KMS permissions.
     * </p>
     * 
     * @param outputConfig
     *        Configure the Amazon S3 location and IAM Role for audiences created using this configured audience model.
     *        Each audience will have a unique location. The IAM Role must have <code>s3:PutObject</code> permission on
     *        the destination Amazon S3 location. If the destination is protected with Amazon S3 KMS-SSE, then the Role
     *        must also have the required KMS permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelRequest withOutputConfig(ConfiguredAudienceModelOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * Whether audience metrics are shared.
     * </p>
     * 
     * @return Whether audience metrics are shared.
     * @see SharedAudienceMetrics
     */

    public java.util.List<String> getSharedAudienceMetrics() {
        return sharedAudienceMetrics;
    }

    /**
     * <p>
     * Whether audience metrics are shared.
     * </p>
     * 
     * @param sharedAudienceMetrics
     *        Whether audience metrics are shared.
     * @see SharedAudienceMetrics
     */

    public void setSharedAudienceMetrics(java.util.Collection<String> sharedAudienceMetrics) {
        if (sharedAudienceMetrics == null) {
            this.sharedAudienceMetrics = null;
            return;
        }

        this.sharedAudienceMetrics = new java.util.ArrayList<String>(sharedAudienceMetrics);
    }

    /**
     * <p>
     * Whether audience metrics are shared.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSharedAudienceMetrics(java.util.Collection)} or
     * {@link #withSharedAudienceMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sharedAudienceMetrics
     *        Whether audience metrics are shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharedAudienceMetrics
     */

    public CreateConfiguredAudienceModelRequest withSharedAudienceMetrics(String... sharedAudienceMetrics) {
        if (this.sharedAudienceMetrics == null) {
            setSharedAudienceMetrics(new java.util.ArrayList<String>(sharedAudienceMetrics.length));
        }
        for (String ele : sharedAudienceMetrics) {
            this.sharedAudienceMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Whether audience metrics are shared.
     * </p>
     * 
     * @param sharedAudienceMetrics
     *        Whether audience metrics are shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharedAudienceMetrics
     */

    public CreateConfiguredAudienceModelRequest withSharedAudienceMetrics(java.util.Collection<String> sharedAudienceMetrics) {
        setSharedAudienceMetrics(sharedAudienceMetrics);
        return this;
    }

    /**
     * <p>
     * Whether audience metrics are shared.
     * </p>
     * 
     * @param sharedAudienceMetrics
     *        Whether audience metrics are shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharedAudienceMetrics
     */

    public CreateConfiguredAudienceModelRequest withSharedAudienceMetrics(SharedAudienceMetrics... sharedAudienceMetrics) {
        java.util.ArrayList<String> sharedAudienceMetricsCopy = new java.util.ArrayList<String>(sharedAudienceMetrics.length);
        for (SharedAudienceMetrics value : sharedAudienceMetrics) {
            sharedAudienceMetricsCopy.add(value.toString());
        }
        if (getSharedAudienceMetrics() == null) {
            setSharedAudienceMetrics(sharedAudienceMetricsCopy);
        } else {
            getSharedAudienceMetrics().addAll(sharedAudienceMetricsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The optional metadata that you apply to the resource to help you categorize and organize them. Each tag consists
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
     * Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for
     * AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws
     * as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag and will count against the
     * limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The optional metadata that you apply to the resource to help you categorize and organize them. Each tag
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
     *         Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is
     *         reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix.
     *         If a tag value has aws as its prefix but the key does not, then Clean Rooms ML considers it to be a user
     *         tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count
     *         against your tags per resource limit.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The optional metadata that you apply to the resource to help you categorize and organize them. Each tag consists
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
     * Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for
     * AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws
     * as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag and will count against the
     * limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The optional metadata that you apply to the resource to help you categorize and organize them. Each tag
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
     *        Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is
     *        reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If
     *        a tag value has aws as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag
     *        and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against
     *        your tags per resource limit.
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The optional metadata that you apply to the resource to help you categorize and organize them. Each tag consists
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
     * Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for
     * AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws
     * as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag and will count against the
     * limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The optional metadata that you apply to the resource to help you categorize and organize them. Each tag
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
     *        Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is
     *        reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If
     *        a tag value has aws as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag
     *        and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against
     *        your tags per resource limit.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateConfiguredAudienceModelRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAudienceModelArn() != null)
            sb.append("AudienceModelArn: ").append(getAudienceModelArn()).append(",");
        if (getAudienceSizeConfig() != null)
            sb.append("AudienceSizeConfig: ").append(getAudienceSizeConfig()).append(",");
        if (getChildResourceTagOnCreatePolicy() != null)
            sb.append("ChildResourceTagOnCreatePolicy: ").append(getChildResourceTagOnCreatePolicy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMinMatchingSeedSize() != null)
            sb.append("MinMatchingSeedSize: ").append(getMinMatchingSeedSize()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getSharedAudienceMetrics() != null)
            sb.append("SharedAudienceMetrics: ").append(getSharedAudienceMetrics()).append(",");
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

        if (obj instanceof CreateConfiguredAudienceModelRequest == false)
            return false;
        CreateConfiguredAudienceModelRequest other = (CreateConfiguredAudienceModelRequest) obj;
        if (other.getAudienceModelArn() == null ^ this.getAudienceModelArn() == null)
            return false;
        if (other.getAudienceModelArn() != null && other.getAudienceModelArn().equals(this.getAudienceModelArn()) == false)
            return false;
        if (other.getAudienceSizeConfig() == null ^ this.getAudienceSizeConfig() == null)
            return false;
        if (other.getAudienceSizeConfig() != null && other.getAudienceSizeConfig().equals(this.getAudienceSizeConfig()) == false)
            return false;
        if (other.getChildResourceTagOnCreatePolicy() == null ^ this.getChildResourceTagOnCreatePolicy() == null)
            return false;
        if (other.getChildResourceTagOnCreatePolicy() != null
                && other.getChildResourceTagOnCreatePolicy().equals(this.getChildResourceTagOnCreatePolicy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMinMatchingSeedSize() == null ^ this.getMinMatchingSeedSize() == null)
            return false;
        if (other.getMinMatchingSeedSize() != null && other.getMinMatchingSeedSize().equals(this.getMinMatchingSeedSize()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getSharedAudienceMetrics() == null ^ this.getSharedAudienceMetrics() == null)
            return false;
        if (other.getSharedAudienceMetrics() != null && other.getSharedAudienceMetrics().equals(this.getSharedAudienceMetrics()) == false)
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

        hashCode = prime * hashCode + ((getAudienceModelArn() == null) ? 0 : getAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getAudienceSizeConfig() == null) ? 0 : getAudienceSizeConfig().hashCode());
        hashCode = prime * hashCode + ((getChildResourceTagOnCreatePolicy() == null) ? 0 : getChildResourceTagOnCreatePolicy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMinMatchingSeedSize() == null) ? 0 : getMinMatchingSeedSize().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getSharedAudienceMetrics() == null) ? 0 : getSharedAudienceMetrics().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfiguredAudienceModelRequest clone() {
        return (CreateConfiguredAudienceModelRequest) super.clone();
    }

}
