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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about Amazon Pinpoint configuration settings for retrieving and processing data from a
 * recommender model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/RecommenderConfigurationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommenderConfigurationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A map that defines 1-10 custom endpoint or user attributes, depending on the value for the RecommenderUserIdType
     * property. Each of these attributes temporarily stores a recommended item that's retrieved from the recommender
     * model and sent to an AWS Lambda function for additional processing. Each attribute can be used as a message
     * variable in a message template.
     * </p>
     * <p>
     * This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform
     * additional processing of recommendation data.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * The date, in extended ISO 8601 format, when the configuration was created for the recommender model.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The custom description of the configuration for the recommender model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier for the recommender model configuration.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date, in extended ISO 8601 format, when the configuration for the recommender model was last modified.
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * The custom name of the configuration for the recommender model.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of Amazon Pinpoint ID that's associated with unique user IDs in the recommender model. This value
     * enables the model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon
     * Pinpoint application. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PINPOINT_ENDPOINT_ID - Each user in the model is associated with a particular endpoint in Amazon Pinpoint. The
     * data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * PINPOINT_USER_ID - Each user in the model is associated with a particular user and endpoint in Amazon Pinpoint.
     * The data is correlated based on user IDs in Amazon Pinpoint. If this value is specified, an endpoint definition
     * in Amazon Pinpoint has to specify both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent
     * to the user's endpoint.
     * </p>
     * </li>
     * </ul>
     */
    private String recommendationProviderIdType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to retrieve recommendation data from the recommender model.
     * </p>
     */
    private String recommendationProviderRoleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender model that Amazon Pinpoint retrieves the recommendation data
     * from. This value is the ARN of an Amazon Personalize campaign.
     * </p>
     */
    private String recommendationProviderUri;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to perform
     * additional processing of recommendation data that it retrieves from the recommender model.
     * </p>
     */
    private String recommendationTransformerUri;
    /**
     * <p>
     * The custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores
     * a recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType property. This
     * name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint console.
     * </p>
     * <p>
     * This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform
     * additional processing of recommendation data.
     * </p>
     */
    private String recommendationsDisplayName;
    /**
     * <p>
     * The number of recommended items that are retrieved from the model for each endpoint or user, depending on the
     * value for the RecommenderUserIdType property. This number determines how many recommended attributes are
     * available for use as message variables in message templates.
     * </p>
     */
    private Integer recommendationsPerMessage;

    /**
     * <p>
     * A map that defines 1-10 custom endpoint or user attributes, depending on the value for the RecommenderUserIdType
     * property. Each of these attributes temporarily stores a recommended item that's retrieved from the recommender
     * model and sent to an AWS Lambda function for additional processing. Each attribute can be used as a message
     * variable in a message template.
     * </p>
     * <p>
     * This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform
     * additional processing of recommendation data.
     * </p>
     * 
     * @return A map that defines 1-10 custom endpoint or user attributes, depending on the value for the
     *         RecommenderUserIdType property. Each of these attributes temporarily stores a recommended item that's
     *         retrieved from the recommender model and sent to an AWS Lambda function for additional processing. Each
     *         attribute can be used as a message variable in a message template.</p>
     *         <p>
     *         This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to
     *         perform additional processing of recommendation data.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A map that defines 1-10 custom endpoint or user attributes, depending on the value for the RecommenderUserIdType
     * property. Each of these attributes temporarily stores a recommended item that's retrieved from the recommender
     * model and sent to an AWS Lambda function for additional processing. Each attribute can be used as a message
     * variable in a message template.
     * </p>
     * <p>
     * This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform
     * additional processing of recommendation data.
     * </p>
     * 
     * @param attributes
     *        A map that defines 1-10 custom endpoint or user attributes, depending on the value for the
     *        RecommenderUserIdType property. Each of these attributes temporarily stores a recommended item that's
     *        retrieved from the recommender model and sent to an AWS Lambda function for additional processing. Each
     *        attribute can be used as a message variable in a message template.</p>
     *        <p>
     *        This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to
     *        perform additional processing of recommendation data.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A map that defines 1-10 custom endpoint or user attributes, depending on the value for the RecommenderUserIdType
     * property. Each of these attributes temporarily stores a recommended item that's retrieved from the recommender
     * model and sent to an AWS Lambda function for additional processing. Each attribute can be used as a message
     * variable in a message template.
     * </p>
     * <p>
     * This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform
     * additional processing of recommendation data.
     * </p>
     * 
     * @param attributes
     *        A map that defines 1-10 custom endpoint or user attributes, depending on the value for the
     *        RecommenderUserIdType property. Each of these attributes temporarily stores a recommended item that's
     *        retrieved from the recommender model and sent to an AWS Lambda function for additional processing. Each
     *        attribute can be used as a message variable in a message template.</p>
     *        <p>
     *        This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to
     *        perform additional processing of recommendation data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see RecommenderConfigurationResponse#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The date, in extended ISO 8601 format, when the configuration was created for the recommender model.
     * </p>
     * 
     * @param creationDate
     *        The date, in extended ISO 8601 format, when the configuration was created for the recommender model.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date, in extended ISO 8601 format, when the configuration was created for the recommender model.
     * </p>
     * 
     * @return The date, in extended ISO 8601 format, when the configuration was created for the recommender model.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date, in extended ISO 8601 format, when the configuration was created for the recommender model.
     * </p>
     * 
     * @param creationDate
     *        The date, in extended ISO 8601 format, when the configuration was created for the recommender model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The custom description of the configuration for the recommender model.
     * </p>
     * 
     * @param description
     *        The custom description of the configuration for the recommender model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the configuration for the recommender model.
     * </p>
     * 
     * @return The custom description of the configuration for the recommender model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The custom description of the configuration for the recommender model.
     * </p>
     * 
     * @param description
     *        The custom description of the configuration for the recommender model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the recommender model configuration.
     * </p>
     * 
     * @param id
     *        The unique identifier for the recommender model configuration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the recommender model configuration.
     * </p>
     * 
     * @return The unique identifier for the recommender model configuration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the recommender model configuration.
     * </p>
     * 
     * @param id
     *        The unique identifier for the recommender model configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date, in extended ISO 8601 format, when the configuration for the recommender model was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date, in extended ISO 8601 format, when the configuration for the recommender model was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date, in extended ISO 8601 format, when the configuration for the recommender model was last modified.
     * </p>
     * 
     * @return The date, in extended ISO 8601 format, when the configuration for the recommender model was last
     *         modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date, in extended ISO 8601 format, when the configuration for the recommender model was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date, in extended ISO 8601 format, when the configuration for the recommender model was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The custom name of the configuration for the recommender model.
     * </p>
     * 
     * @param name
     *        The custom name of the configuration for the recommender model.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the configuration for the recommender model.
     * </p>
     * 
     * @return The custom name of the configuration for the recommender model.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The custom name of the configuration for the recommender model.
     * </p>
     * 
     * @param name
     *        The custom name of the configuration for the recommender model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Pinpoint ID that's associated with unique user IDs in the recommender model. This value
     * enables the model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon
     * Pinpoint application. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PINPOINT_ENDPOINT_ID - Each user in the model is associated with a particular endpoint in Amazon Pinpoint. The
     * data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * PINPOINT_USER_ID - Each user in the model is associated with a particular user and endpoint in Amazon Pinpoint.
     * The data is correlated based on user IDs in Amazon Pinpoint. If this value is specified, an endpoint definition
     * in Amazon Pinpoint has to specify both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent
     * to the user's endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @param recommendationProviderIdType
     *        The type of Amazon Pinpoint ID that's associated with unique user IDs in the recommender model. This value
     *        enables the model to use attribute and event data that’s specific to a particular endpoint or user in an
     *        Amazon Pinpoint application. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PINPOINT_ENDPOINT_ID - Each user in the model is associated with a particular endpoint in Amazon Pinpoint.
     *        The data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PINPOINT_USER_ID - Each user in the model is associated with a particular user and endpoint in Amazon
     *        Pinpoint. The data is correlated based on user IDs in Amazon Pinpoint. If this value is specified, an
     *        endpoint definition in Amazon Pinpoint has to specify both a user ID (UserId) and an endpoint ID.
     *        Otherwise, messages won’t be sent to the user's endpoint.
     *        </p>
     *        </li>
     */

    public void setRecommendationProviderIdType(String recommendationProviderIdType) {
        this.recommendationProviderIdType = recommendationProviderIdType;
    }

    /**
     * <p>
     * The type of Amazon Pinpoint ID that's associated with unique user IDs in the recommender model. This value
     * enables the model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon
     * Pinpoint application. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PINPOINT_ENDPOINT_ID - Each user in the model is associated with a particular endpoint in Amazon Pinpoint. The
     * data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * PINPOINT_USER_ID - Each user in the model is associated with a particular user and endpoint in Amazon Pinpoint.
     * The data is correlated based on user IDs in Amazon Pinpoint. If this value is specified, an endpoint definition
     * in Amazon Pinpoint has to specify both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent
     * to the user's endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of Amazon Pinpoint ID that's associated with unique user IDs in the recommender model. This
     *         value enables the model to use attribute and event data that’s specific to a particular endpoint or user
     *         in an Amazon Pinpoint application. Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PINPOINT_ENDPOINT_ID - Each user in the model is associated with a particular endpoint in Amazon
     *         Pinpoint. The data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PINPOINT_USER_ID - Each user in the model is associated with a particular user and endpoint in Amazon
     *         Pinpoint. The data is correlated based on user IDs in Amazon Pinpoint. If this value is specified, an
     *         endpoint definition in Amazon Pinpoint has to specify both a user ID (UserId) and an endpoint ID.
     *         Otherwise, messages won’t be sent to the user's endpoint.
     *         </p>
     *         </li>
     */

    public String getRecommendationProviderIdType() {
        return this.recommendationProviderIdType;
    }

    /**
     * <p>
     * The type of Amazon Pinpoint ID that's associated with unique user IDs in the recommender model. This value
     * enables the model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon
     * Pinpoint application. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PINPOINT_ENDPOINT_ID - Each user in the model is associated with a particular endpoint in Amazon Pinpoint. The
     * data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * PINPOINT_USER_ID - Each user in the model is associated with a particular user and endpoint in Amazon Pinpoint.
     * The data is correlated based on user IDs in Amazon Pinpoint. If this value is specified, an endpoint definition
     * in Amazon Pinpoint has to specify both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent
     * to the user's endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @param recommendationProviderIdType
     *        The type of Amazon Pinpoint ID that's associated with unique user IDs in the recommender model. This value
     *        enables the model to use attribute and event data that’s specific to a particular endpoint or user in an
     *        Amazon Pinpoint application. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PINPOINT_ENDPOINT_ID - Each user in the model is associated with a particular endpoint in Amazon Pinpoint.
     *        The data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PINPOINT_USER_ID - Each user in the model is associated with a particular user and endpoint in Amazon
     *        Pinpoint. The data is correlated based on user IDs in Amazon Pinpoint. If this value is specified, an
     *        endpoint definition in Amazon Pinpoint has to specify both a user ID (UserId) and an endpoint ID.
     *        Otherwise, messages won’t be sent to the user's endpoint.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse withRecommendationProviderIdType(String recommendationProviderIdType) {
        setRecommendationProviderIdType(recommendationProviderIdType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to retrieve recommendation data from the recommender model.
     * </p>
     * 
     * @param recommendationProviderRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon
     *        Pinpoint to retrieve recommendation data from the recommender model.
     */

    public void setRecommendationProviderRoleArn(String recommendationProviderRoleArn) {
        this.recommendationProviderRoleArn = recommendationProviderRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to retrieve recommendation data from the recommender model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes
     *         Amazon Pinpoint to retrieve recommendation data from the recommender model.
     */

    public String getRecommendationProviderRoleArn() {
        return this.recommendationProviderRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon
     * Pinpoint to retrieve recommendation data from the recommender model.
     * </p>
     * 
     * @param recommendationProviderRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon
     *        Pinpoint to retrieve recommendation data from the recommender model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse withRecommendationProviderRoleArn(String recommendationProviderRoleArn) {
        setRecommendationProviderRoleArn(recommendationProviderRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender model that Amazon Pinpoint retrieves the recommendation data
     * from. This value is the ARN of an Amazon Personalize campaign.
     * </p>
     * 
     * @param recommendationProviderUri
     *        The Amazon Resource Name (ARN) of the recommender model that Amazon Pinpoint retrieves the recommendation
     *        data from. This value is the ARN of an Amazon Personalize campaign.
     */

    public void setRecommendationProviderUri(String recommendationProviderUri) {
        this.recommendationProviderUri = recommendationProviderUri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender model that Amazon Pinpoint retrieves the recommendation data
     * from. This value is the ARN of an Amazon Personalize campaign.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recommender model that Amazon Pinpoint retrieves the recommendation
     *         data from. This value is the ARN of an Amazon Personalize campaign.
     */

    public String getRecommendationProviderUri() {
        return this.recommendationProviderUri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender model that Amazon Pinpoint retrieves the recommendation data
     * from. This value is the ARN of an Amazon Personalize campaign.
     * </p>
     * 
     * @param recommendationProviderUri
     *        The Amazon Resource Name (ARN) of the recommender model that Amazon Pinpoint retrieves the recommendation
     *        data from. This value is the ARN of an Amazon Personalize campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse withRecommendationProviderUri(String recommendationProviderUri) {
        setRecommendationProviderUri(recommendationProviderUri);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to perform
     * additional processing of recommendation data that it retrieves from the recommender model.
     * </p>
     * 
     * @param recommendationTransformerUri
     *        The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to perform
     *        additional processing of recommendation data that it retrieves from the recommender model.
     */

    public void setRecommendationTransformerUri(String recommendationTransformerUri) {
        this.recommendationTransformerUri = recommendationTransformerUri;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to perform
     * additional processing of recommendation data that it retrieves from the recommender model.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to perform
     *         additional processing of recommendation data that it retrieves from the recommender model.
     */

    public String getRecommendationTransformerUri() {
        return this.recommendationTransformerUri;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to perform
     * additional processing of recommendation data that it retrieves from the recommender model.
     * </p>
     * 
     * @param recommendationTransformerUri
     *        The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to perform
     *        additional processing of recommendation data that it retrieves from the recommender model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse withRecommendationTransformerUri(String recommendationTransformerUri) {
        setRecommendationTransformerUri(recommendationTransformerUri);
        return this;
    }

    /**
     * <p>
     * The custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores
     * a recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType property. This
     * name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint console.
     * </p>
     * <p>
     * This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform
     * additional processing of recommendation data.
     * </p>
     * 
     * @param recommendationsDisplayName
     *        The custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily
     *        stores a recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType
     *        property. This name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon
     *        Pinpoint console.</p>
     *        <p>
     *        This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to
     *        perform additional processing of recommendation data.
     */

    public void setRecommendationsDisplayName(String recommendationsDisplayName) {
        this.recommendationsDisplayName = recommendationsDisplayName;
    }

    /**
     * <p>
     * The custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores
     * a recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType property. This
     * name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint console.
     * </p>
     * <p>
     * This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform
     * additional processing of recommendation data.
     * </p>
     * 
     * @return The custom display name for the standard endpoint or user attribute (RecommendationItems) that
     *         temporarily stores a recommended item for each endpoint or user, depending on the value for the
     *         RecommenderUserIdType property. This name appears in the <b>Attribute finder</b> pane of the template
     *         editor on the Amazon Pinpoint console.</p>
     *         <p>
     *         This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to
     *         perform additional processing of recommendation data.
     */

    public String getRecommendationsDisplayName() {
        return this.recommendationsDisplayName;
    }

    /**
     * <p>
     * The custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores
     * a recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType property. This
     * name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint console.
     * </p>
     * <p>
     * This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform
     * additional processing of recommendation data.
     * </p>
     * 
     * @param recommendationsDisplayName
     *        The custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily
     *        stores a recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType
     *        property. This name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon
     *        Pinpoint console.</p>
     *        <p>
     *        This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to
     *        perform additional processing of recommendation data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse withRecommendationsDisplayName(String recommendationsDisplayName) {
        setRecommendationsDisplayName(recommendationsDisplayName);
        return this;
    }

    /**
     * <p>
     * The number of recommended items that are retrieved from the model for each endpoint or user, depending on the
     * value for the RecommenderUserIdType property. This number determines how many recommended attributes are
     * available for use as message variables in message templates.
     * </p>
     * 
     * @param recommendationsPerMessage
     *        The number of recommended items that are retrieved from the model for each endpoint or user, depending on
     *        the value for the RecommenderUserIdType property. This number determines how many recommended attributes
     *        are available for use as message variables in message templates.
     */

    public void setRecommendationsPerMessage(Integer recommendationsPerMessage) {
        this.recommendationsPerMessage = recommendationsPerMessage;
    }

    /**
     * <p>
     * The number of recommended items that are retrieved from the model for each endpoint or user, depending on the
     * value for the RecommenderUserIdType property. This number determines how many recommended attributes are
     * available for use as message variables in message templates.
     * </p>
     * 
     * @return The number of recommended items that are retrieved from the model for each endpoint or user, depending on
     *         the value for the RecommenderUserIdType property. This number determines how many recommended attributes
     *         are available for use as message variables in message templates.
     */

    public Integer getRecommendationsPerMessage() {
        return this.recommendationsPerMessage;
    }

    /**
     * <p>
     * The number of recommended items that are retrieved from the model for each endpoint or user, depending on the
     * value for the RecommenderUserIdType property. This number determines how many recommended attributes are
     * available for use as message variables in message templates.
     * </p>
     * 
     * @param recommendationsPerMessage
     *        The number of recommended items that are retrieved from the model for each endpoint or user, depending on
     *        the value for the RecommenderUserIdType property. This number determines how many recommended attributes
     *        are available for use as message variables in message templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfigurationResponse withRecommendationsPerMessage(Integer recommendationsPerMessage) {
        setRecommendationsPerMessage(recommendationsPerMessage);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRecommendationProviderIdType() != null)
            sb.append("RecommendationProviderIdType: ").append(getRecommendationProviderIdType()).append(",");
        if (getRecommendationProviderRoleArn() != null)
            sb.append("RecommendationProviderRoleArn: ").append(getRecommendationProviderRoleArn()).append(",");
        if (getRecommendationProviderUri() != null)
            sb.append("RecommendationProviderUri: ").append(getRecommendationProviderUri()).append(",");
        if (getRecommendationTransformerUri() != null)
            sb.append("RecommendationTransformerUri: ").append(getRecommendationTransformerUri()).append(",");
        if (getRecommendationsDisplayName() != null)
            sb.append("RecommendationsDisplayName: ").append(getRecommendationsDisplayName()).append(",");
        if (getRecommendationsPerMessage() != null)
            sb.append("RecommendationsPerMessage: ").append(getRecommendationsPerMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommenderConfigurationResponse == false)
            return false;
        RecommenderConfigurationResponse other = (RecommenderConfigurationResponse) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecommendationProviderIdType() == null ^ this.getRecommendationProviderIdType() == null)
            return false;
        if (other.getRecommendationProviderIdType() != null && other.getRecommendationProviderIdType().equals(this.getRecommendationProviderIdType()) == false)
            return false;
        if (other.getRecommendationProviderRoleArn() == null ^ this.getRecommendationProviderRoleArn() == null)
            return false;
        if (other.getRecommendationProviderRoleArn() != null
                && other.getRecommendationProviderRoleArn().equals(this.getRecommendationProviderRoleArn()) == false)
            return false;
        if (other.getRecommendationProviderUri() == null ^ this.getRecommendationProviderUri() == null)
            return false;
        if (other.getRecommendationProviderUri() != null && other.getRecommendationProviderUri().equals(this.getRecommendationProviderUri()) == false)
            return false;
        if (other.getRecommendationTransformerUri() == null ^ this.getRecommendationTransformerUri() == null)
            return false;
        if (other.getRecommendationTransformerUri() != null && other.getRecommendationTransformerUri().equals(this.getRecommendationTransformerUri()) == false)
            return false;
        if (other.getRecommendationsDisplayName() == null ^ this.getRecommendationsDisplayName() == null)
            return false;
        if (other.getRecommendationsDisplayName() != null && other.getRecommendationsDisplayName().equals(this.getRecommendationsDisplayName()) == false)
            return false;
        if (other.getRecommendationsPerMessage() == null ^ this.getRecommendationsPerMessage() == null)
            return false;
        if (other.getRecommendationsPerMessage() != null && other.getRecommendationsPerMessage().equals(this.getRecommendationsPerMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecommendationProviderIdType() == null) ? 0 : getRecommendationProviderIdType().hashCode());
        hashCode = prime * hashCode + ((getRecommendationProviderRoleArn() == null) ? 0 : getRecommendationProviderRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRecommendationProviderUri() == null) ? 0 : getRecommendationProviderUri().hashCode());
        hashCode = prime * hashCode + ((getRecommendationTransformerUri() == null) ? 0 : getRecommendationTransformerUri().hashCode());
        hashCode = prime * hashCode + ((getRecommendationsDisplayName() == null) ? 0 : getRecommendationsDisplayName().hashCode());
        hashCode = prime * hashCode + ((getRecommendationsPerMessage() == null) ? 0 : getRecommendationsPerMessage().hashCode());
        return hashCode;
    }

    @Override
    public RecommenderConfigurationResponse clone() {
        try {
            return (RecommenderConfigurationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.RecommenderConfigurationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
