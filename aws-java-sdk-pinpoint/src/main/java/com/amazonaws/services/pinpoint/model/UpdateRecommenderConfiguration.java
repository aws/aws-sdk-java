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
 * Specifies Amazon Pinpoint configuration settings for retrieving and processing recommendation data from a recommender
 * model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateRecommenderConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRecommenderConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A map of key-value pairs that defines 1-10 custom endpoint or user attributes, depending on the value for the
     * RecommenderUserIdType property. Each of these attributes temporarily stores a recommended item that's retrieved
     * from the recommender model and sent to an AWS Lambda function for additional processing. Each attribute can be
     * used as a message variable in a message template.
     * </p>
     * <p>
     * In the map, the key is the name of a custom attribute and the value is a custom display name for that attribute.
     * The display name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint
     * console. The following restrictions apply to these names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An attribute name must start with a letter or number and it can contain up to 50 characters. The characters can
     * be letters, numbers, underscores (_), or hyphens (-). Attribute names are case sensitive and must be unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * An attribute display name must start with a letter or number and it can contain up to 25 characters. The
     * characters can be letters, numbers, spaces, underscores (_), or hyphens (-).
     * </p>
     * </li>
     * </ul>
     * <p>
     * This object is required if the configuration invokes an AWS Lambda function (LambdaFunctionArn) to process
     * recommendation data. Otherwise, don't include this object in your request.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * A custom description of the configuration for the recommender model. The description can contain up to 128
     * characters.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A custom name of the configuration for the recommender model. The name must start with a letter or number and it
     * can contain up to 128 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens
     * (-).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of Amazon Pinpoint ID to associate with unique user IDs in the recommender model. This value enables the
     * model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon Pinpoint
     * application. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular endpoint in Amazon Pinpoint. The data
     * is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * PINPOINT_USER_ID - Associate each user in the model with a particular user and endpoint in Amazon Pinpoint. The
     * data is correlated based on user IDs in Amazon Pinpoint. If you specify this value, an endpoint definition in
     * Amazon Pinpoint has to specify a both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent to
     * the user's endpoint.
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
     * The Amazon Resource Name (ARN) of the recommender model to retrieve recommendation data from. This value must
     * match the ARN of an Amazon Personalize campaign.
     * </p>
     */
    private String recommendationProviderUri;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function to invoke for additional processing of
     * recommendation data that's retrieved from the recommender model.
     * </p>
     */
    private String recommendationTransformerUri;
    /**
     * <p>
     * A custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores a
     * recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType property. This
     * value is required if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform
     * additional processing of recommendation data.
     * </p>
     * <p>
     * This name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint console. The
     * name can contain up to 25 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens
     * (-). These restrictions don't apply to attribute values.
     * </p>
     */
    private String recommendationsDisplayName;
    /**
     * <p>
     * The number of recommended items to retrieve from the model for each endpoint or user, depending on the value for
     * the RecommenderUserIdType property. This number determines how many recommended attributes are available for use
     * as message variables in message templates. The minimum value is 1. The maximum value is 5. The default value is
     * 5.
     * </p>
     * <p>
     * To use multiple recommended items and custom attributes with message variables, you have to use an AWS Lambda
     * function (LambdaFunctionArn) to perform additional processing of recommendation data.
     * </p>
     */
    private Integer recommendationsPerMessage;

    /**
     * <p>
     * A map of key-value pairs that defines 1-10 custom endpoint or user attributes, depending on the value for the
     * RecommenderUserIdType property. Each of these attributes temporarily stores a recommended item that's retrieved
     * from the recommender model and sent to an AWS Lambda function for additional processing. Each attribute can be
     * used as a message variable in a message template.
     * </p>
     * <p>
     * In the map, the key is the name of a custom attribute and the value is a custom display name for that attribute.
     * The display name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint
     * console. The following restrictions apply to these names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An attribute name must start with a letter or number and it can contain up to 50 characters. The characters can
     * be letters, numbers, underscores (_), or hyphens (-). Attribute names are case sensitive and must be unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * An attribute display name must start with a letter or number and it can contain up to 25 characters. The
     * characters can be letters, numbers, spaces, underscores (_), or hyphens (-).
     * </p>
     * </li>
     * </ul>
     * <p>
     * This object is required if the configuration invokes an AWS Lambda function (LambdaFunctionArn) to process
     * recommendation data. Otherwise, don't include this object in your request.
     * </p>
     * 
     * @return A map of key-value pairs that defines 1-10 custom endpoint or user attributes, depending on the value for
     *         the RecommenderUserIdType property. Each of these attributes temporarily stores a recommended item that's
     *         retrieved from the recommender model and sent to an AWS Lambda function for additional processing. Each
     *         attribute can be used as a message variable in a message template.</p>
     *         <p>
     *         In the map, the key is the name of a custom attribute and the value is a custom display name for that
     *         attribute. The display name appears in the <b>Attribute finder</b> pane of the template editor on the
     *         Amazon Pinpoint console. The following restrictions apply to these names:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An attribute name must start with a letter or number and it can contain up to 50 characters. The
     *         characters can be letters, numbers, underscores (_), or hyphens (-). Attribute names are case sensitive
     *         and must be unique.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An attribute display name must start with a letter or number and it can contain up to 25 characters. The
     *         characters can be letters, numbers, spaces, underscores (_), or hyphens (-).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This object is required if the configuration invokes an AWS Lambda function (LambdaFunctionArn) to
     *         process recommendation data. Otherwise, don't include this object in your request.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A map of key-value pairs that defines 1-10 custom endpoint or user attributes, depending on the value for the
     * RecommenderUserIdType property. Each of these attributes temporarily stores a recommended item that's retrieved
     * from the recommender model and sent to an AWS Lambda function for additional processing. Each attribute can be
     * used as a message variable in a message template.
     * </p>
     * <p>
     * In the map, the key is the name of a custom attribute and the value is a custom display name for that attribute.
     * The display name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint
     * console. The following restrictions apply to these names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An attribute name must start with a letter or number and it can contain up to 50 characters. The characters can
     * be letters, numbers, underscores (_), or hyphens (-). Attribute names are case sensitive and must be unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * An attribute display name must start with a letter or number and it can contain up to 25 characters. The
     * characters can be letters, numbers, spaces, underscores (_), or hyphens (-).
     * </p>
     * </li>
     * </ul>
     * <p>
     * This object is required if the configuration invokes an AWS Lambda function (LambdaFunctionArn) to process
     * recommendation data. Otherwise, don't include this object in your request.
     * </p>
     * 
     * @param attributes
     *        A map of key-value pairs that defines 1-10 custom endpoint or user attributes, depending on the value for
     *        the RecommenderUserIdType property. Each of these attributes temporarily stores a recommended item that's
     *        retrieved from the recommender model and sent to an AWS Lambda function for additional processing. Each
     *        attribute can be used as a message variable in a message template.</p>
     *        <p>
     *        In the map, the key is the name of a custom attribute and the value is a custom display name for that
     *        attribute. The display name appears in the <b>Attribute finder</b> pane of the template editor on the
     *        Amazon Pinpoint console. The following restrictions apply to these names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An attribute name must start with a letter or number and it can contain up to 50 characters. The
     *        characters can be letters, numbers, underscores (_), or hyphens (-). Attribute names are case sensitive
     *        and must be unique.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An attribute display name must start with a letter or number and it can contain up to 25 characters. The
     *        characters can be letters, numbers, spaces, underscores (_), or hyphens (-).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This object is required if the configuration invokes an AWS Lambda function (LambdaFunctionArn) to process
     *        recommendation data. Otherwise, don't include this object in your request.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A map of key-value pairs that defines 1-10 custom endpoint or user attributes, depending on the value for the
     * RecommenderUserIdType property. Each of these attributes temporarily stores a recommended item that's retrieved
     * from the recommender model and sent to an AWS Lambda function for additional processing. Each attribute can be
     * used as a message variable in a message template.
     * </p>
     * <p>
     * In the map, the key is the name of a custom attribute and the value is a custom display name for that attribute.
     * The display name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint
     * console. The following restrictions apply to these names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An attribute name must start with a letter or number and it can contain up to 50 characters. The characters can
     * be letters, numbers, underscores (_), or hyphens (-). Attribute names are case sensitive and must be unique.
     * </p>
     * </li>
     * <li>
     * <p>
     * An attribute display name must start with a letter or number and it can contain up to 25 characters. The
     * characters can be letters, numbers, spaces, underscores (_), or hyphens (-).
     * </p>
     * </li>
     * </ul>
     * <p>
     * This object is required if the configuration invokes an AWS Lambda function (LambdaFunctionArn) to process
     * recommendation data. Otherwise, don't include this object in your request.
     * </p>
     * 
     * @param attributes
     *        A map of key-value pairs that defines 1-10 custom endpoint or user attributes, depending on the value for
     *        the RecommenderUserIdType property. Each of these attributes temporarily stores a recommended item that's
     *        retrieved from the recommender model and sent to an AWS Lambda function for additional processing. Each
     *        attribute can be used as a message variable in a message template.</p>
     *        <p>
     *        In the map, the key is the name of a custom attribute and the value is a custom display name for that
     *        attribute. The display name appears in the <b>Attribute finder</b> pane of the template editor on the
     *        Amazon Pinpoint console. The following restrictions apply to these names:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An attribute name must start with a letter or number and it can contain up to 50 characters. The
     *        characters can be letters, numbers, underscores (_), or hyphens (-). Attribute names are case sensitive
     *        and must be unique.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An attribute display name must start with a letter or number and it can contain up to 25 characters. The
     *        characters can be letters, numbers, spaces, underscores (_), or hyphens (-).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This object is required if the configuration invokes an AWS Lambda function (LambdaFunctionArn) to process
     *        recommendation data. Otherwise, don't include this object in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommenderConfiguration withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see UpdateRecommenderConfiguration#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommenderConfiguration addAttributesEntry(String key, String value) {
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

    public UpdateRecommenderConfiguration clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * A custom description of the configuration for the recommender model. The description can contain up to 128
     * characters.
     * </p>
     * 
     * @param description
     *        A custom description of the configuration for the recommender model. The description can contain up to 128
     *        characters.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description of the configuration for the recommender model. The description can contain up to 128
     * characters.
     * </p>
     * 
     * @return A custom description of the configuration for the recommender model. The description can contain up to
     *         128 characters.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A custom description of the configuration for the recommender model. The description can contain up to 128
     * characters.
     * </p>
     * 
     * @param description
     *        A custom description of the configuration for the recommender model. The description can contain up to 128
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommenderConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A custom name of the configuration for the recommender model. The name must start with a letter or number and it
     * can contain up to 128 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens
     * (-).
     * </p>
     * 
     * @param name
     *        A custom name of the configuration for the recommender model. The name must start with a letter or number
     *        and it can contain up to 128 characters. The characters can be letters, numbers, spaces, underscores (_),
     *        or hyphens (-).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A custom name of the configuration for the recommender model. The name must start with a letter or number and it
     * can contain up to 128 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens
     * (-).
     * </p>
     * 
     * @return A custom name of the configuration for the recommender model. The name must start with a letter or number
     *         and it can contain up to 128 characters. The characters can be letters, numbers, spaces, underscores (_),
     *         or hyphens (-).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A custom name of the configuration for the recommender model. The name must start with a letter or number and it
     * can contain up to 128 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens
     * (-).
     * </p>
     * 
     * @param name
     *        A custom name of the configuration for the recommender model. The name must start with a letter or number
     *        and it can contain up to 128 characters. The characters can be letters, numbers, spaces, underscores (_),
     *        or hyphens (-).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommenderConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Pinpoint ID to associate with unique user IDs in the recommender model. This value enables the
     * model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon Pinpoint
     * application. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular endpoint in Amazon Pinpoint. The data
     * is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * PINPOINT_USER_ID - Associate each user in the model with a particular user and endpoint in Amazon Pinpoint. The
     * data is correlated based on user IDs in Amazon Pinpoint. If you specify this value, an endpoint definition in
     * Amazon Pinpoint has to specify a both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent to
     * the user's endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @param recommendationProviderIdType
     *        The type of Amazon Pinpoint ID to associate with unique user IDs in the recommender model. This value
     *        enables the model to use attribute and event data that’s specific to a particular endpoint or user in an
     *        Amazon Pinpoint application. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular endpoint in Amazon Pinpoint. The
     *        data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PINPOINT_USER_ID - Associate each user in the model with a particular user and endpoint in Amazon
     *        Pinpoint. The data is correlated based on user IDs in Amazon Pinpoint. If you specify this value, an
     *        endpoint definition in Amazon Pinpoint has to specify a both a user ID (UserId) and an endpoint ID.
     *        Otherwise, messages won’t be sent to the user's endpoint.
     *        </p>
     *        </li>
     */

    public void setRecommendationProviderIdType(String recommendationProviderIdType) {
        this.recommendationProviderIdType = recommendationProviderIdType;
    }

    /**
     * <p>
     * The type of Amazon Pinpoint ID to associate with unique user IDs in the recommender model. This value enables the
     * model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon Pinpoint
     * application. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular endpoint in Amazon Pinpoint. The data
     * is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * PINPOINT_USER_ID - Associate each user in the model with a particular user and endpoint in Amazon Pinpoint. The
     * data is correlated based on user IDs in Amazon Pinpoint. If you specify this value, an endpoint definition in
     * Amazon Pinpoint has to specify a both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent to
     * the user's endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of Amazon Pinpoint ID to associate with unique user IDs in the recommender model. This value
     *         enables the model to use attribute and event data that’s specific to a particular endpoint or user in an
     *         Amazon Pinpoint application. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular endpoint in Amazon Pinpoint.
     *         The data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PINPOINT_USER_ID - Associate each user in the model with a particular user and endpoint in Amazon
     *         Pinpoint. The data is correlated based on user IDs in Amazon Pinpoint. If you specify this value, an
     *         endpoint definition in Amazon Pinpoint has to specify a both a user ID (UserId) and an endpoint ID.
     *         Otherwise, messages won’t be sent to the user's endpoint.
     *         </p>
     *         </li>
     */

    public String getRecommendationProviderIdType() {
        return this.recommendationProviderIdType;
    }

    /**
     * <p>
     * The type of Amazon Pinpoint ID to associate with unique user IDs in the recommender model. This value enables the
     * model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon Pinpoint
     * application. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular endpoint in Amazon Pinpoint. The data
     * is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * PINPOINT_USER_ID - Associate each user in the model with a particular user and endpoint in Amazon Pinpoint. The
     * data is correlated based on user IDs in Amazon Pinpoint. If you specify this value, an endpoint definition in
     * Amazon Pinpoint has to specify a both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent to
     * the user's endpoint.
     * </p>
     * </li>
     * </ul>
     * 
     * @param recommendationProviderIdType
     *        The type of Amazon Pinpoint ID to associate with unique user IDs in the recommender model. This value
     *        enables the model to use attribute and event data that’s specific to a particular endpoint or user in an
     *        Amazon Pinpoint application. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular endpoint in Amazon Pinpoint. The
     *        data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PINPOINT_USER_ID - Associate each user in the model with a particular user and endpoint in Amazon
     *        Pinpoint. The data is correlated based on user IDs in Amazon Pinpoint. If you specify this value, an
     *        endpoint definition in Amazon Pinpoint has to specify a both a user ID (UserId) and an endpoint ID.
     *        Otherwise, messages won’t be sent to the user's endpoint.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommenderConfiguration withRecommendationProviderIdType(String recommendationProviderIdType) {
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

    public UpdateRecommenderConfiguration withRecommendationProviderRoleArn(String recommendationProviderRoleArn) {
        setRecommendationProviderRoleArn(recommendationProviderRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender model to retrieve recommendation data from. This value must
     * match the ARN of an Amazon Personalize campaign.
     * </p>
     * 
     * @param recommendationProviderUri
     *        The Amazon Resource Name (ARN) of the recommender model to retrieve recommendation data from. This value
     *        must match the ARN of an Amazon Personalize campaign.
     */

    public void setRecommendationProviderUri(String recommendationProviderUri) {
        this.recommendationProviderUri = recommendationProviderUri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender model to retrieve recommendation data from. This value must
     * match the ARN of an Amazon Personalize campaign.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recommender model to retrieve recommendation data from. This value
     *         must match the ARN of an Amazon Personalize campaign.
     */

    public String getRecommendationProviderUri() {
        return this.recommendationProviderUri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender model to retrieve recommendation data from. This value must
     * match the ARN of an Amazon Personalize campaign.
     * </p>
     * 
     * @param recommendationProviderUri
     *        The Amazon Resource Name (ARN) of the recommender model to retrieve recommendation data from. This value
     *        must match the ARN of an Amazon Personalize campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommenderConfiguration withRecommendationProviderUri(String recommendationProviderUri) {
        setRecommendationProviderUri(recommendationProviderUri);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function to invoke for additional processing of
     * recommendation data that's retrieved from the recommender model.
     * </p>
     * 
     * @param recommendationTransformerUri
     *        The name or Amazon Resource Name (ARN) of the AWS Lambda function to invoke for additional processing of
     *        recommendation data that's retrieved from the recommender model.
     */

    public void setRecommendationTransformerUri(String recommendationTransformerUri) {
        this.recommendationTransformerUri = recommendationTransformerUri;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function to invoke for additional processing of
     * recommendation data that's retrieved from the recommender model.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the AWS Lambda function to invoke for additional processing of
     *         recommendation data that's retrieved from the recommender model.
     */

    public String getRecommendationTransformerUri() {
        return this.recommendationTransformerUri;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function to invoke for additional processing of
     * recommendation data that's retrieved from the recommender model.
     * </p>
     * 
     * @param recommendationTransformerUri
     *        The name or Amazon Resource Name (ARN) of the AWS Lambda function to invoke for additional processing of
     *        recommendation data that's retrieved from the recommender model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommenderConfiguration withRecommendationTransformerUri(String recommendationTransformerUri) {
        setRecommendationTransformerUri(recommendationTransformerUri);
        return this;
    }

    /**
     * <p>
     * A custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores a
     * recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType property. This
     * value is required if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform
     * additional processing of recommendation data.
     * </p>
     * <p>
     * This name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint console. The
     * name can contain up to 25 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens
     * (-). These restrictions don't apply to attribute values.
     * </p>
     * 
     * @param recommendationsDisplayName
     *        A custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily
     *        stores a recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType
     *        property. This value is required if the configuration doesn't invoke an AWS Lambda function
     *        (LambdaFunctionArn) to perform additional processing of recommendation data.</p>
     *        <p>
     *        This name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint
     *        console. The name can contain up to 25 characters. The characters can be letters, numbers, spaces,
     *        underscores (_), or hyphens (-). These restrictions don't apply to attribute values.
     */

    public void setRecommendationsDisplayName(String recommendationsDisplayName) {
        this.recommendationsDisplayName = recommendationsDisplayName;
    }

    /**
     * <p>
     * A custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores a
     * recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType property. This
     * value is required if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform
     * additional processing of recommendation data.
     * </p>
     * <p>
     * This name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint console. The
     * name can contain up to 25 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens
     * (-). These restrictions don't apply to attribute values.
     * </p>
     * 
     * @return A custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily
     *         stores a recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType
     *         property. This value is required if the configuration doesn't invoke an AWS Lambda function
     *         (LambdaFunctionArn) to perform additional processing of recommendation data.</p>
     *         <p>
     *         This name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint
     *         console. The name can contain up to 25 characters. The characters can be letters, numbers, spaces,
     *         underscores (_), or hyphens (-). These restrictions don't apply to attribute values.
     */

    public String getRecommendationsDisplayName() {
        return this.recommendationsDisplayName;
    }

    /**
     * <p>
     * A custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores a
     * recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType property. This
     * value is required if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform
     * additional processing of recommendation data.
     * </p>
     * <p>
     * This name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint console. The
     * name can contain up to 25 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens
     * (-). These restrictions don't apply to attribute values.
     * </p>
     * 
     * @param recommendationsDisplayName
     *        A custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily
     *        stores a recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType
     *        property. This value is required if the configuration doesn't invoke an AWS Lambda function
     *        (LambdaFunctionArn) to perform additional processing of recommendation data.</p>
     *        <p>
     *        This name appears in the <b>Attribute finder</b> pane of the template editor on the Amazon Pinpoint
     *        console. The name can contain up to 25 characters. The characters can be letters, numbers, spaces,
     *        underscores (_), or hyphens (-). These restrictions don't apply to attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommenderConfiguration withRecommendationsDisplayName(String recommendationsDisplayName) {
        setRecommendationsDisplayName(recommendationsDisplayName);
        return this;
    }

    /**
     * <p>
     * The number of recommended items to retrieve from the model for each endpoint or user, depending on the value for
     * the RecommenderUserIdType property. This number determines how many recommended attributes are available for use
     * as message variables in message templates. The minimum value is 1. The maximum value is 5. The default value is
     * 5.
     * </p>
     * <p>
     * To use multiple recommended items and custom attributes with message variables, you have to use an AWS Lambda
     * function (LambdaFunctionArn) to perform additional processing of recommendation data.
     * </p>
     * 
     * @param recommendationsPerMessage
     *        The number of recommended items to retrieve from the model for each endpoint or user, depending on the
     *        value for the RecommenderUserIdType property. This number determines how many recommended attributes are
     *        available for use as message variables in message templates. The minimum value is 1. The maximum value is
     *        5. The default value is 5.</p>
     *        <p>
     *        To use multiple recommended items and custom attributes with message variables, you have to use an AWS
     *        Lambda function (LambdaFunctionArn) to perform additional processing of recommendation data.
     */

    public void setRecommendationsPerMessage(Integer recommendationsPerMessage) {
        this.recommendationsPerMessage = recommendationsPerMessage;
    }

    /**
     * <p>
     * The number of recommended items to retrieve from the model for each endpoint or user, depending on the value for
     * the RecommenderUserIdType property. This number determines how many recommended attributes are available for use
     * as message variables in message templates. The minimum value is 1. The maximum value is 5. The default value is
     * 5.
     * </p>
     * <p>
     * To use multiple recommended items and custom attributes with message variables, you have to use an AWS Lambda
     * function (LambdaFunctionArn) to perform additional processing of recommendation data.
     * </p>
     * 
     * @return The number of recommended items to retrieve from the model for each endpoint or user, depending on the
     *         value for the RecommenderUserIdType property. This number determines how many recommended attributes are
     *         available for use as message variables in message templates. The minimum value is 1. The maximum value is
     *         5. The default value is 5.</p>
     *         <p>
     *         To use multiple recommended items and custom attributes with message variables, you have to use an AWS
     *         Lambda function (LambdaFunctionArn) to perform additional processing of recommendation data.
     */

    public Integer getRecommendationsPerMessage() {
        return this.recommendationsPerMessage;
    }

    /**
     * <p>
     * The number of recommended items to retrieve from the model for each endpoint or user, depending on the value for
     * the RecommenderUserIdType property. This number determines how many recommended attributes are available for use
     * as message variables in message templates. The minimum value is 1. The maximum value is 5. The default value is
     * 5.
     * </p>
     * <p>
     * To use multiple recommended items and custom attributes with message variables, you have to use an AWS Lambda
     * function (LambdaFunctionArn) to perform additional processing of recommendation data.
     * </p>
     * 
     * @param recommendationsPerMessage
     *        The number of recommended items to retrieve from the model for each endpoint or user, depending on the
     *        value for the RecommenderUserIdType property. This number determines how many recommended attributes are
     *        available for use as message variables in message templates. The minimum value is 1. The maximum value is
     *        5. The default value is 5.</p>
     *        <p>
     *        To use multiple recommended items and custom attributes with message variables, you have to use an AWS
     *        Lambda function (LambdaFunctionArn) to perform additional processing of recommendation data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommenderConfiguration withRecommendationsPerMessage(Integer recommendationsPerMessage) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof UpdateRecommenderConfiguration == false)
            return false;
        UpdateRecommenderConfiguration other = (UpdateRecommenderConfiguration) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
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
    public UpdateRecommenderConfiguration clone() {
        try {
            return (UpdateRecommenderConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.UpdateRecommenderConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
