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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateFeatureGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFeatureGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the <code>FeatureGroup</code>. The name must be unique within an AWS Region in an AWS account. The
     * name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must start and end with an alphanumeric character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can only contain alphanumeric character and hyphens. Spaces are not allowed.
     * </p>
     * </li>
     * </ul>
     */
    private String featureGroupName;
    /**
     * <p>
     * The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     * <code>FeatureStore</code>. Only the latest record per identifier value will be stored in the
     * <code>OnlineStore</code>. <code>RecordIdentifierFeatureName</code> must be one of feature definitions' names.
     * </p>
     * <p>
     * You use the <code>RecordIdentifierFeatureName</code> to access data in a <code>FeatureStore</code>.
     * </p>
     * <p>
     * This name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must start and end with an alphanumeric character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can only contains alphanumeric characters, hyphens, underscores. Spaces are not allowed.
     * </p>
     * </li>
     * </ul>
     */
    private String recordIdentifierFeatureName;
    /**
     * <p>
     * The name of the feature that stores the <code>EventTime</code> of a <code>Record</code> in a
     * <code>FeatureGroup</code>.
     * </p>
     * <p>
     * An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or update
     * of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     * <code>FeatureGroup</code> must have a corresponding <code>EventTime</code>.
     * </p>
     * <p>
     * An <code>EventTime</code> can be a <code>String</code> or <code>Fractional</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fractional</code>: <code>EventTime</code> feature values must be a Unix timestamp in seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>String</code>: <code>EventTime</code> feature values must be an ISO-8601 string in the format. The
     * following formats are supported <code>yyyy-MM-dd'T'HH:mm:ssZ</code> and <code>yyyy-MM-dd'T'HH:mm:ss.SSSZ</code>
     * where <code>yyyy</code>, <code>MM</code>, and <code>dd</code> represent the year, month, and day respectively and
     * <code>HH</code>, <code>mm</code>, <code>ss</code>, and if applicable, <code>SSS</code> represent the hour, month,
     * second and milliseconds respsectively. <code>'T'</code> and <code>Z</code> are constants.
     * </p>
     * </li>
     * </ul>
     */
    private String eventTimeFeatureName;
    /**
     * <p>
     * A list of <code>Feature</code> names and types. <code>Name</code> and <code>Type</code> is compulsory per
     * <code>Feature</code>.
     * </p>
     * <p>
     * Valid feature <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and
     * <code>String</code>.
     * </p>
     * <p>
     * <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>,
     * <code>api_invocation_time</code>
     * </p>
     * <p>
     * You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * </p>
     */
    private java.util.List<FeatureDefinition> featureDefinitions;
    /**
     * <p>
     * You can turn the <code>OnlineStore</code> on or off by specifying <code>True</code> for the
     * <code>EnableOnlineStore</code> flag in <code>OnlineStoreConfig</code>; the default value is <code>False</code>.
     * </p>
     * <p>
     * You can also include an AWS KMS key ID (<code>KMSKeyId</code>) for at-rest encryption of the
     * <code>OnlineStore</code>.
     * </p>
     */
    private OnlineStoreConfig onlineStoreConfig;
    /**
     * <p>
     * Use this to configure an <code>OfflineFeatureStore</code>. This parameter allows you to specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) location of an <code>OfflineStore</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A configuration for an AWS Glue or AWS Hive data cataolgue.
     * </p>
     * </li>
     * <li>
     * <p>
     * An KMS encryption key to encrypt the Amazon S3 location used for <code>OfflineStore</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn more about this parameter, see <a>OfflineStoreConfig</a>.
     * </p>
     */
    private OfflineStoreConfig offlineStoreConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the <code>OfflineStore</code>
     * if an <code>OfflineStoreConfig</code> is provided.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A free-form description of a <code>FeatureGroup</code>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Tags used to identify <code>Features</code> in each <code>FeatureGroup</code>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the <code>FeatureGroup</code>. The name must be unique within an AWS Region in an AWS account. The
     * name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must start and end with an alphanumeric character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can only contain alphanumeric character and hyphens. Spaces are not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureGroupName
     *        The name of the <code>FeatureGroup</code>. The name must be unique within an AWS Region in an AWS account.
     *        The name:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must start and end with an alphanumeric character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can only contain alphanumeric character and hyphens. Spaces are not allowed.
     *        </p>
     *        </li>
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of the <code>FeatureGroup</code>. The name must be unique within an AWS Region in an AWS account. The
     * name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must start and end with an alphanumeric character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can only contain alphanumeric character and hyphens. Spaces are not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the <code>FeatureGroup</code>. The name must be unique within an AWS Region in an AWS
     *         account. The name:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must start and end with an alphanumeric character.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can only contain alphanumeric character and hyphens. Spaces are not allowed.
     *         </p>
     *         </li>
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of the <code>FeatureGroup</code>. The name must be unique within an AWS Region in an AWS account. The
     * name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must start and end with an alphanumeric character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can only contain alphanumeric character and hyphens. Spaces are not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureGroupName
     *        The name of the <code>FeatureGroup</code>. The name must be unique within an AWS Region in an AWS account.
     *        The name:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must start and end with an alphanumeric character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can only contain alphanumeric character and hyphens. Spaces are not allowed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureGroupRequest withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     * <code>FeatureStore</code>. Only the latest record per identifier value will be stored in the
     * <code>OnlineStore</code>. <code>RecordIdentifierFeatureName</code> must be one of feature definitions' names.
     * </p>
     * <p>
     * You use the <code>RecordIdentifierFeatureName</code> to access data in a <code>FeatureStore</code>.
     * </p>
     * <p>
     * This name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must start and end with an alphanumeric character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can only contains alphanumeric characters, hyphens, underscores. Spaces are not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param recordIdentifierFeatureName
     *        The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     *        <code>FeatureStore</code>. Only the latest record per identifier value will be stored in the
     *        <code>OnlineStore</code>. <code>RecordIdentifierFeatureName</code> must be one of feature definitions'
     *        names.</p>
     *        <p>
     *        You use the <code>RecordIdentifierFeatureName</code> to access data in a <code>FeatureStore</code>.
     *        </p>
     *        <p>
     *        This name:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must start and end with an alphanumeric character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can only contains alphanumeric characters, hyphens, underscores. Spaces are not allowed.
     *        </p>
     *        </li>
     */

    public void setRecordIdentifierFeatureName(String recordIdentifierFeatureName) {
        this.recordIdentifierFeatureName = recordIdentifierFeatureName;
    }

    /**
     * <p>
     * The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     * <code>FeatureStore</code>. Only the latest record per identifier value will be stored in the
     * <code>OnlineStore</code>. <code>RecordIdentifierFeatureName</code> must be one of feature definitions' names.
     * </p>
     * <p>
     * You use the <code>RecordIdentifierFeatureName</code> to access data in a <code>FeatureStore</code>.
     * </p>
     * <p>
     * This name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must start and end with an alphanumeric character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can only contains alphanumeric characters, hyphens, underscores. Spaces are not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     *         <code>FeatureStore</code>. Only the latest record per identifier value will be stored in the
     *         <code>OnlineStore</code>. <code>RecordIdentifierFeatureName</code> must be one of feature definitions'
     *         names.</p>
     *         <p>
     *         You use the <code>RecordIdentifierFeatureName</code> to access data in a <code>FeatureStore</code>.
     *         </p>
     *         <p>
     *         This name:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must start and end with an alphanumeric character.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can only contains alphanumeric characters, hyphens, underscores. Spaces are not allowed.
     *         </p>
     *         </li>
     */

    public String getRecordIdentifierFeatureName() {
        return this.recordIdentifierFeatureName;
    }

    /**
     * <p>
     * The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     * <code>FeatureStore</code>. Only the latest record per identifier value will be stored in the
     * <code>OnlineStore</code>. <code>RecordIdentifierFeatureName</code> must be one of feature definitions' names.
     * </p>
     * <p>
     * You use the <code>RecordIdentifierFeatureName</code> to access data in a <code>FeatureStore</code>.
     * </p>
     * <p>
     * This name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must start and end with an alphanumeric character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can only contains alphanumeric characters, hyphens, underscores. Spaces are not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param recordIdentifierFeatureName
     *        The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     *        <code>FeatureStore</code>. Only the latest record per identifier value will be stored in the
     *        <code>OnlineStore</code>. <code>RecordIdentifierFeatureName</code> must be one of feature definitions'
     *        names.</p>
     *        <p>
     *        You use the <code>RecordIdentifierFeatureName</code> to access data in a <code>FeatureStore</code>.
     *        </p>
     *        <p>
     *        This name:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must start and end with an alphanumeric character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can only contains alphanumeric characters, hyphens, underscores. Spaces are not allowed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureGroupRequest withRecordIdentifierFeatureName(String recordIdentifierFeatureName) {
        setRecordIdentifierFeatureName(recordIdentifierFeatureName);
        return this;
    }

    /**
     * <p>
     * The name of the feature that stores the <code>EventTime</code> of a <code>Record</code> in a
     * <code>FeatureGroup</code>.
     * </p>
     * <p>
     * An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or update
     * of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     * <code>FeatureGroup</code> must have a corresponding <code>EventTime</code>.
     * </p>
     * <p>
     * An <code>EventTime</code> can be a <code>String</code> or <code>Fractional</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fractional</code>: <code>EventTime</code> feature values must be a Unix timestamp in seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>String</code>: <code>EventTime</code> feature values must be an ISO-8601 string in the format. The
     * following formats are supported <code>yyyy-MM-dd'T'HH:mm:ssZ</code> and <code>yyyy-MM-dd'T'HH:mm:ss.SSSZ</code>
     * where <code>yyyy</code>, <code>MM</code>, and <code>dd</code> represent the year, month, and day respectively and
     * <code>HH</code>, <code>mm</code>, <code>ss</code>, and if applicable, <code>SSS</code> represent the hour, month,
     * second and milliseconds respsectively. <code>'T'</code> and <code>Z</code> are constants.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventTimeFeatureName
     *        The name of the feature that stores the <code>EventTime</code> of a <code>Record</code> in a
     *        <code>FeatureGroup</code>.</p>
     *        <p>
     *        An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or
     *        update of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     *        <code>FeatureGroup</code> must have a corresponding <code>EventTime</code>.
     *        </p>
     *        <p>
     *        An <code>EventTime</code> can be a <code>String</code> or <code>Fractional</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Fractional</code>: <code>EventTime</code> feature values must be a Unix timestamp in seconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>String</code>: <code>EventTime</code> feature values must be an ISO-8601 string in the format. The
     *        following formats are supported <code>yyyy-MM-dd'T'HH:mm:ssZ</code> and
     *        <code>yyyy-MM-dd'T'HH:mm:ss.SSSZ</code> where <code>yyyy</code>, <code>MM</code>, and <code>dd</code>
     *        represent the year, month, and day respectively and <code>HH</code>, <code>mm</code>, <code>ss</code>, and
     *        if applicable, <code>SSS</code> represent the hour, month, second and milliseconds respsectively.
     *        <code>'T'</code> and <code>Z</code> are constants.
     *        </p>
     *        </li>
     */

    public void setEventTimeFeatureName(String eventTimeFeatureName) {
        this.eventTimeFeatureName = eventTimeFeatureName;
    }

    /**
     * <p>
     * The name of the feature that stores the <code>EventTime</code> of a <code>Record</code> in a
     * <code>FeatureGroup</code>.
     * </p>
     * <p>
     * An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or update
     * of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     * <code>FeatureGroup</code> must have a corresponding <code>EventTime</code>.
     * </p>
     * <p>
     * An <code>EventTime</code> can be a <code>String</code> or <code>Fractional</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fractional</code>: <code>EventTime</code> feature values must be a Unix timestamp in seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>String</code>: <code>EventTime</code> feature values must be an ISO-8601 string in the format. The
     * following formats are supported <code>yyyy-MM-dd'T'HH:mm:ssZ</code> and <code>yyyy-MM-dd'T'HH:mm:ss.SSSZ</code>
     * where <code>yyyy</code>, <code>MM</code>, and <code>dd</code> represent the year, month, and day respectively and
     * <code>HH</code>, <code>mm</code>, <code>ss</code>, and if applicable, <code>SSS</code> represent the hour, month,
     * second and milliseconds respsectively. <code>'T'</code> and <code>Z</code> are constants.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the feature that stores the <code>EventTime</code> of a <code>Record</code> in a
     *         <code>FeatureGroup</code>.</p>
     *         <p>
     *         An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or
     *         update of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     *         <code>FeatureGroup</code> must have a corresponding <code>EventTime</code>.
     *         </p>
     *         <p>
     *         An <code>EventTime</code> can be a <code>String</code> or <code>Fractional</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Fractional</code>: <code>EventTime</code> feature values must be a Unix timestamp in seconds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>String</code>: <code>EventTime</code> feature values must be an ISO-8601 string in the format. The
     *         following formats are supported <code>yyyy-MM-dd'T'HH:mm:ssZ</code> and
     *         <code>yyyy-MM-dd'T'HH:mm:ss.SSSZ</code> where <code>yyyy</code>, <code>MM</code>, and <code>dd</code>
     *         represent the year, month, and day respectively and <code>HH</code>, <code>mm</code>, <code>ss</code>,
     *         and if applicable, <code>SSS</code> represent the hour, month, second and milliseconds respsectively.
     *         <code>'T'</code> and <code>Z</code> are constants.
     *         </p>
     *         </li>
     */

    public String getEventTimeFeatureName() {
        return this.eventTimeFeatureName;
    }

    /**
     * <p>
     * The name of the feature that stores the <code>EventTime</code> of a <code>Record</code> in a
     * <code>FeatureGroup</code>.
     * </p>
     * <p>
     * An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or update
     * of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     * <code>FeatureGroup</code> must have a corresponding <code>EventTime</code>.
     * </p>
     * <p>
     * An <code>EventTime</code> can be a <code>String</code> or <code>Fractional</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Fractional</code>: <code>EventTime</code> feature values must be a Unix timestamp in seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>String</code>: <code>EventTime</code> feature values must be an ISO-8601 string in the format. The
     * following formats are supported <code>yyyy-MM-dd'T'HH:mm:ssZ</code> and <code>yyyy-MM-dd'T'HH:mm:ss.SSSZ</code>
     * where <code>yyyy</code>, <code>MM</code>, and <code>dd</code> represent the year, month, and day respectively and
     * <code>HH</code>, <code>mm</code>, <code>ss</code>, and if applicable, <code>SSS</code> represent the hour, month,
     * second and milliseconds respsectively. <code>'T'</code> and <code>Z</code> are constants.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventTimeFeatureName
     *        The name of the feature that stores the <code>EventTime</code> of a <code>Record</code> in a
     *        <code>FeatureGroup</code>.</p>
     *        <p>
     *        An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or
     *        update of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     *        <code>FeatureGroup</code> must have a corresponding <code>EventTime</code>.
     *        </p>
     *        <p>
     *        An <code>EventTime</code> can be a <code>String</code> or <code>Fractional</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Fractional</code>: <code>EventTime</code> feature values must be a Unix timestamp in seconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>String</code>: <code>EventTime</code> feature values must be an ISO-8601 string in the format. The
     *        following formats are supported <code>yyyy-MM-dd'T'HH:mm:ssZ</code> and
     *        <code>yyyy-MM-dd'T'HH:mm:ss.SSSZ</code> where <code>yyyy</code>, <code>MM</code>, and <code>dd</code>
     *        represent the year, month, and day respectively and <code>HH</code>, <code>mm</code>, <code>ss</code>, and
     *        if applicable, <code>SSS</code> represent the hour, month, second and milliseconds respsectively.
     *        <code>'T'</code> and <code>Z</code> are constants.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureGroupRequest withEventTimeFeatureName(String eventTimeFeatureName) {
        setEventTimeFeatureName(eventTimeFeatureName);
        return this;
    }

    /**
     * <p>
     * A list of <code>Feature</code> names and types. <code>Name</code> and <code>Type</code> is compulsory per
     * <code>Feature</code>.
     * </p>
     * <p>
     * Valid feature <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and
     * <code>String</code>.
     * </p>
     * <p>
     * <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>,
     * <code>api_invocation_time</code>
     * </p>
     * <p>
     * You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * </p>
     * 
     * @return A list of <code>Feature</code> names and types. <code>Name</code> and <code>Type</code> is compulsory per
     *         <code>Feature</code>. </p>
     *         <p>
     *         Valid feature <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and
     *         <code>String</code>.
     *         </p>
     *         <p>
     *         <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>,
     *         <code>write_time</code>, <code>api_invocation_time</code>
     *         </p>
     *         <p>
     *         You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     */

    public java.util.List<FeatureDefinition> getFeatureDefinitions() {
        return featureDefinitions;
    }

    /**
     * <p>
     * A list of <code>Feature</code> names and types. <code>Name</code> and <code>Type</code> is compulsory per
     * <code>Feature</code>.
     * </p>
     * <p>
     * Valid feature <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and
     * <code>String</code>.
     * </p>
     * <p>
     * <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>,
     * <code>api_invocation_time</code>
     * </p>
     * <p>
     * You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureDefinitions
     *        A list of <code>Feature</code> names and types. <code>Name</code> and <code>Type</code> is compulsory per
     *        <code>Feature</code>. </p>
     *        <p>
     *        Valid feature <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and
     *        <code>String</code>.
     *        </p>
     *        <p>
     *        <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>
     *        </p>
     *        <p>
     *        You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     */

    public void setFeatureDefinitions(java.util.Collection<FeatureDefinition> featureDefinitions) {
        if (featureDefinitions == null) {
            this.featureDefinitions = null;
            return;
        }

        this.featureDefinitions = new java.util.ArrayList<FeatureDefinition>(featureDefinitions);
    }

    /**
     * <p>
     * A list of <code>Feature</code> names and types. <code>Name</code> and <code>Type</code> is compulsory per
     * <code>Feature</code>.
     * </p>
     * <p>
     * Valid feature <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and
     * <code>String</code>.
     * </p>
     * <p>
     * <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>,
     * <code>api_invocation_time</code>
     * </p>
     * <p>
     * You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureDefinitions(java.util.Collection)} or {@link #withFeatureDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param featureDefinitions
     *        A list of <code>Feature</code> names and types. <code>Name</code> and <code>Type</code> is compulsory per
     *        <code>Feature</code>. </p>
     *        <p>
     *        Valid feature <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and
     *        <code>String</code>.
     *        </p>
     *        <p>
     *        <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>
     *        </p>
     *        <p>
     *        You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureGroupRequest withFeatureDefinitions(FeatureDefinition... featureDefinitions) {
        if (this.featureDefinitions == null) {
            setFeatureDefinitions(new java.util.ArrayList<FeatureDefinition>(featureDefinitions.length));
        }
        for (FeatureDefinition ele : featureDefinitions) {
            this.featureDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Feature</code> names and types. <code>Name</code> and <code>Type</code> is compulsory per
     * <code>Feature</code>.
     * </p>
     * <p>
     * Valid feature <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and
     * <code>String</code>.
     * </p>
     * <p>
     * <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>,
     * <code>api_invocation_time</code>
     * </p>
     * <p>
     * You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureDefinitions
     *        A list of <code>Feature</code> names and types. <code>Name</code> and <code>Type</code> is compulsory per
     *        <code>Feature</code>. </p>
     *        <p>
     *        Valid feature <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and
     *        <code>String</code>.
     *        </p>
     *        <p>
     *        <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>
     *        </p>
     *        <p>
     *        You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureGroupRequest withFeatureDefinitions(java.util.Collection<FeatureDefinition> featureDefinitions) {
        setFeatureDefinitions(featureDefinitions);
        return this;
    }

    /**
     * <p>
     * You can turn the <code>OnlineStore</code> on or off by specifying <code>True</code> for the
     * <code>EnableOnlineStore</code> flag in <code>OnlineStoreConfig</code>; the default value is <code>False</code>.
     * </p>
     * <p>
     * You can also include an AWS KMS key ID (<code>KMSKeyId</code>) for at-rest encryption of the
     * <code>OnlineStore</code>.
     * </p>
     * 
     * @param onlineStoreConfig
     *        You can turn the <code>OnlineStore</code> on or off by specifying <code>True</code> for the
     *        <code>EnableOnlineStore</code> flag in <code>OnlineStoreConfig</code>; the default value is
     *        <code>False</code>.</p>
     *        <p>
     *        You can also include an AWS KMS key ID (<code>KMSKeyId</code>) for at-rest encryption of the
     *        <code>OnlineStore</code>.
     */

    public void setOnlineStoreConfig(OnlineStoreConfig onlineStoreConfig) {
        this.onlineStoreConfig = onlineStoreConfig;
    }

    /**
     * <p>
     * You can turn the <code>OnlineStore</code> on or off by specifying <code>True</code> for the
     * <code>EnableOnlineStore</code> flag in <code>OnlineStoreConfig</code>; the default value is <code>False</code>.
     * </p>
     * <p>
     * You can also include an AWS KMS key ID (<code>KMSKeyId</code>) for at-rest encryption of the
     * <code>OnlineStore</code>.
     * </p>
     * 
     * @return You can turn the <code>OnlineStore</code> on or off by specifying <code>True</code> for the
     *         <code>EnableOnlineStore</code> flag in <code>OnlineStoreConfig</code>; the default value is
     *         <code>False</code>.</p>
     *         <p>
     *         You can also include an AWS KMS key ID (<code>KMSKeyId</code>) for at-rest encryption of the
     *         <code>OnlineStore</code>.
     */

    public OnlineStoreConfig getOnlineStoreConfig() {
        return this.onlineStoreConfig;
    }

    /**
     * <p>
     * You can turn the <code>OnlineStore</code> on or off by specifying <code>True</code> for the
     * <code>EnableOnlineStore</code> flag in <code>OnlineStoreConfig</code>; the default value is <code>False</code>.
     * </p>
     * <p>
     * You can also include an AWS KMS key ID (<code>KMSKeyId</code>) for at-rest encryption of the
     * <code>OnlineStore</code>.
     * </p>
     * 
     * @param onlineStoreConfig
     *        You can turn the <code>OnlineStore</code> on or off by specifying <code>True</code> for the
     *        <code>EnableOnlineStore</code> flag in <code>OnlineStoreConfig</code>; the default value is
     *        <code>False</code>.</p>
     *        <p>
     *        You can also include an AWS KMS key ID (<code>KMSKeyId</code>) for at-rest encryption of the
     *        <code>OnlineStore</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureGroupRequest withOnlineStoreConfig(OnlineStoreConfig onlineStoreConfig) {
        setOnlineStoreConfig(onlineStoreConfig);
        return this;
    }

    /**
     * <p>
     * Use this to configure an <code>OfflineFeatureStore</code>. This parameter allows you to specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) location of an <code>OfflineStore</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A configuration for an AWS Glue or AWS Hive data cataolgue.
     * </p>
     * </li>
     * <li>
     * <p>
     * An KMS encryption key to encrypt the Amazon S3 location used for <code>OfflineStore</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn more about this parameter, see <a>OfflineStoreConfig</a>.
     * </p>
     * 
     * @param offlineStoreConfig
     *        Use this to configure an <code>OfflineFeatureStore</code>. This parameter allows you to specify:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The Amazon Simple Storage Service (Amazon S3) location of an <code>OfflineStore</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A configuration for an AWS Glue or AWS Hive data cataolgue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An KMS encryption key to encrypt the Amazon S3 location used for <code>OfflineStore</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn more about this parameter, see <a>OfflineStoreConfig</a>.
     */

    public void setOfflineStoreConfig(OfflineStoreConfig offlineStoreConfig) {
        this.offlineStoreConfig = offlineStoreConfig;
    }

    /**
     * <p>
     * Use this to configure an <code>OfflineFeatureStore</code>. This parameter allows you to specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) location of an <code>OfflineStore</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A configuration for an AWS Glue or AWS Hive data cataolgue.
     * </p>
     * </li>
     * <li>
     * <p>
     * An KMS encryption key to encrypt the Amazon S3 location used for <code>OfflineStore</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn more about this parameter, see <a>OfflineStoreConfig</a>.
     * </p>
     * 
     * @return Use this to configure an <code>OfflineFeatureStore</code>. This parameter allows you to specify:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The Amazon Simple Storage Service (Amazon S3) location of an <code>OfflineStore</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A configuration for an AWS Glue or AWS Hive data cataolgue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An KMS encryption key to encrypt the Amazon S3 location used for <code>OfflineStore</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To learn more about this parameter, see <a>OfflineStoreConfig</a>.
     */

    public OfflineStoreConfig getOfflineStoreConfig() {
        return this.offlineStoreConfig;
    }

    /**
     * <p>
     * Use this to configure an <code>OfflineFeatureStore</code>. This parameter allows you to specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) location of an <code>OfflineStore</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A configuration for an AWS Glue or AWS Hive data cataolgue.
     * </p>
     * </li>
     * <li>
     * <p>
     * An KMS encryption key to encrypt the Amazon S3 location used for <code>OfflineStore</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn more about this parameter, see <a>OfflineStoreConfig</a>.
     * </p>
     * 
     * @param offlineStoreConfig
     *        Use this to configure an <code>OfflineFeatureStore</code>. This parameter allows you to specify:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The Amazon Simple Storage Service (Amazon S3) location of an <code>OfflineStore</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A configuration for an AWS Glue or AWS Hive data cataolgue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An KMS encryption key to encrypt the Amazon S3 location used for <code>OfflineStore</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn more about this parameter, see <a>OfflineStoreConfig</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureGroupRequest withOfflineStoreConfig(OfflineStoreConfig offlineStoreConfig) {
        setOfflineStoreConfig(offlineStoreConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the <code>OfflineStore</code>
     * if an <code>OfflineStoreConfig</code> is provided.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the
     *        <code>OfflineStore</code> if an <code>OfflineStoreConfig</code> is provided.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the <code>OfflineStore</code>
     * if an <code>OfflineStoreConfig</code> is provided.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the
     *         <code>OfflineStore</code> if an <code>OfflineStoreConfig</code> is provided.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the <code>OfflineStore</code>
     * if an <code>OfflineStoreConfig</code> is provided.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the
     *        <code>OfflineStore</code> if an <code>OfflineStoreConfig</code> is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureGroupRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A free-form description of a <code>FeatureGroup</code>.
     * </p>
     * 
     * @param description
     *        A free-form description of a <code>FeatureGroup</code>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A free-form description of a <code>FeatureGroup</code>.
     * </p>
     * 
     * @return A free-form description of a <code>FeatureGroup</code>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A free-form description of a <code>FeatureGroup</code>.
     * </p>
     * 
     * @param description
     *        A free-form description of a <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Tags used to identify <code>Features</code> in each <code>FeatureGroup</code>.
     * </p>
     * 
     * @return Tags used to identify <code>Features</code> in each <code>FeatureGroup</code>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags used to identify <code>Features</code> in each <code>FeatureGroup</code>.
     * </p>
     * 
     * @param tags
     *        Tags used to identify <code>Features</code> in each <code>FeatureGroup</code>.
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
     * Tags used to identify <code>Features</code> in each <code>FeatureGroup</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags used to identify <code>Features</code> in each <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureGroupRequest withTags(Tag... tags) {
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
     * Tags used to identify <code>Features</code> in each <code>FeatureGroup</code>.
     * </p>
     * 
     * @param tags
     *        Tags used to identify <code>Features</code> in each <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeatureGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getFeatureGroupName() != null)
            sb.append("FeatureGroupName: ").append(getFeatureGroupName()).append(",");
        if (getRecordIdentifierFeatureName() != null)
            sb.append("RecordIdentifierFeatureName: ").append(getRecordIdentifierFeatureName()).append(",");
        if (getEventTimeFeatureName() != null)
            sb.append("EventTimeFeatureName: ").append(getEventTimeFeatureName()).append(",");
        if (getFeatureDefinitions() != null)
            sb.append("FeatureDefinitions: ").append(getFeatureDefinitions()).append(",");
        if (getOnlineStoreConfig() != null)
            sb.append("OnlineStoreConfig: ").append(getOnlineStoreConfig()).append(",");
        if (getOfflineStoreConfig() != null)
            sb.append("OfflineStoreConfig: ").append(getOfflineStoreConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateFeatureGroupRequest == false)
            return false;
        CreateFeatureGroupRequest other = (CreateFeatureGroupRequest) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        if (other.getRecordIdentifierFeatureName() == null ^ this.getRecordIdentifierFeatureName() == null)
            return false;
        if (other.getRecordIdentifierFeatureName() != null && other.getRecordIdentifierFeatureName().equals(this.getRecordIdentifierFeatureName()) == false)
            return false;
        if (other.getEventTimeFeatureName() == null ^ this.getEventTimeFeatureName() == null)
            return false;
        if (other.getEventTimeFeatureName() != null && other.getEventTimeFeatureName().equals(this.getEventTimeFeatureName()) == false)
            return false;
        if (other.getFeatureDefinitions() == null ^ this.getFeatureDefinitions() == null)
            return false;
        if (other.getFeatureDefinitions() != null && other.getFeatureDefinitions().equals(this.getFeatureDefinitions()) == false)
            return false;
        if (other.getOnlineStoreConfig() == null ^ this.getOnlineStoreConfig() == null)
            return false;
        if (other.getOnlineStoreConfig() != null && other.getOnlineStoreConfig().equals(this.getOnlineStoreConfig()) == false)
            return false;
        if (other.getOfflineStoreConfig() == null ^ this.getOfflineStoreConfig() == null)
            return false;
        if (other.getOfflineStoreConfig() != null && other.getOfflineStoreConfig().equals(this.getOfflineStoreConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        hashCode = prime * hashCode + ((getRecordIdentifierFeatureName() == null) ? 0 : getRecordIdentifierFeatureName().hashCode());
        hashCode = prime * hashCode + ((getEventTimeFeatureName() == null) ? 0 : getEventTimeFeatureName().hashCode());
        hashCode = prime * hashCode + ((getFeatureDefinitions() == null) ? 0 : getFeatureDefinitions().hashCode());
        hashCode = prime * hashCode + ((getOnlineStoreConfig() == null) ? 0 : getOnlineStoreConfig().hashCode());
        hashCode = prime * hashCode + ((getOfflineStoreConfig() == null) ? 0 : getOfflineStoreConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFeatureGroupRequest clone() {
        return (CreateFeatureGroupRequest) super.clone();
    }

}
