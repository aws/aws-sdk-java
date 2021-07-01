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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeFeatureGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFeatureGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <code>FeatureGroup</code>.
     * </p>
     */
    private String featureGroupArn;
    /**
     * <p>
     * he name of the <code>FeatureGroup</code>.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * The name of the <code>Feature</code> used for <code>RecordIdentifier</code>, whose value uniquely identifies a
     * record stored in the feature store.
     * </p>
     */
    private String recordIdentifierFeatureName;
    /**
     * <p>
     * The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>.
     * </p>
     * <p>
     * An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or update
     * of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     * <code>FeatureGroup</code> have a corresponding <code>EventTime</code>.
     * </p>
     */
    private String eventTimeFeatureName;
    /**
     * <p>
     * A list of the <code>Features</code> in the <code>FeatureGroup</code>. Each feature is defined by a
     * <code>FeatureName</code> and <code>FeatureType</code>.
     * </p>
     */
    private java.util.List<FeatureDefinition> featureDefinitions;
    /**
     * <p>
     * A timestamp indicating when SageMaker created the <code>FeatureGroup</code>.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The configuration for the <code>OnlineStore</code>.
     * </p>
     */
    private OnlineStoreConfig onlineStoreConfig;
    /**
     * <p>
     * The configuration of the <code>OfflineStore</code>, inducing the S3 location of the <code>OfflineStore</code>,
     * Amazon Web Services Glue or Amazon Web Services Hive data catalogue configurations, and the security
     * configuration.
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
     * The status of the feature group.
     * </p>
     */
    private String featureGroupStatus;
    /**
     * <p>
     * The status of the <code>OfflineStore</code>. Notifies you if replicating data into the <code>OfflineStore</code>
     * has failed. Returns either: <code>Active</code> or <code>Blocked</code>
     * </p>
     */
    private OfflineStoreStatus offlineStoreStatus;
    /**
     * <p>
     * The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>. This is
     * failure can occur because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>FeatureGroup</code> could not be created in the <code>OfflineStore</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>FeatureGroup</code> could not be deleted from the <code>OfflineStore</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String failureReason;
    /**
     * <p>
     * A free form description of the feature group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>).
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureGroupArn
     *        The Amazon Resource Name (ARN) of the <code>FeatureGroup</code>.
     */

    public void setFeatureGroupArn(String featureGroupArn) {
        this.featureGroupArn = featureGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <code>FeatureGroup</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the <code>FeatureGroup</code>.
     */

    public String getFeatureGroupArn() {
        return this.featureGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureGroupArn
     *        The Amazon Resource Name (ARN) of the <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withFeatureGroupArn(String featureGroupArn) {
        setFeatureGroupArn(featureGroupArn);
        return this;
    }

    /**
     * <p>
     * he name of the <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureGroupName
     *        he name of the <code>FeatureGroup</code>.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * he name of the <code>FeatureGroup</code>.
     * </p>
     * 
     * @return he name of the <code>FeatureGroup</code>.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * he name of the <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureGroupName
     *        he name of the <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the <code>Feature</code> used for <code>RecordIdentifier</code>, whose value uniquely identifies a
     * record stored in the feature store.
     * </p>
     * 
     * @param recordIdentifierFeatureName
     *        The name of the <code>Feature</code> used for <code>RecordIdentifier</code>, whose value uniquely
     *        identifies a record stored in the feature store.
     */

    public void setRecordIdentifierFeatureName(String recordIdentifierFeatureName) {
        this.recordIdentifierFeatureName = recordIdentifierFeatureName;
    }

    /**
     * <p>
     * The name of the <code>Feature</code> used for <code>RecordIdentifier</code>, whose value uniquely identifies a
     * record stored in the feature store.
     * </p>
     * 
     * @return The name of the <code>Feature</code> used for <code>RecordIdentifier</code>, whose value uniquely
     *         identifies a record stored in the feature store.
     */

    public String getRecordIdentifierFeatureName() {
        return this.recordIdentifierFeatureName;
    }

    /**
     * <p>
     * The name of the <code>Feature</code> used for <code>RecordIdentifier</code>, whose value uniquely identifies a
     * record stored in the feature store.
     * </p>
     * 
     * @param recordIdentifierFeatureName
     *        The name of the <code>Feature</code> used for <code>RecordIdentifier</code>, whose value uniquely
     *        identifies a record stored in the feature store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withRecordIdentifierFeatureName(String recordIdentifierFeatureName) {
        setRecordIdentifierFeatureName(recordIdentifierFeatureName);
        return this;
    }

    /**
     * <p>
     * The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>.
     * </p>
     * <p>
     * An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or update
     * of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     * <code>FeatureGroup</code> have a corresponding <code>EventTime</code>.
     * </p>
     * 
     * @param eventTimeFeatureName
     *        The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>
     *        .</p>
     *        <p>
     *        An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or
     *        update of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     *        <code>FeatureGroup</code> have a corresponding <code>EventTime</code>.
     */

    public void setEventTimeFeatureName(String eventTimeFeatureName) {
        this.eventTimeFeatureName = eventTimeFeatureName;
    }

    /**
     * <p>
     * The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>.
     * </p>
     * <p>
     * An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or update
     * of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     * <code>FeatureGroup</code> have a corresponding <code>EventTime</code>.
     * </p>
     * 
     * @return The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>
     *         .</p>
     *         <p>
     *         An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or
     *         update of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     *         <code>FeatureGroup</code> have a corresponding <code>EventTime</code>.
     */

    public String getEventTimeFeatureName() {
        return this.eventTimeFeatureName;
    }

    /**
     * <p>
     * The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>.
     * </p>
     * <p>
     * An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or update
     * of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     * <code>FeatureGroup</code> have a corresponding <code>EventTime</code>.
     * </p>
     * 
     * @param eventTimeFeatureName
     *        The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>
     *        .</p>
     *        <p>
     *        An <code>EventTime</code> is a point in time when a new event occurs that corresponds to the creation or
     *        update of a <code>Record</code> in a <code>FeatureGroup</code>. All <code>Records</code> in the
     *        <code>FeatureGroup</code> have a corresponding <code>EventTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withEventTimeFeatureName(String eventTimeFeatureName) {
        setEventTimeFeatureName(eventTimeFeatureName);
        return this;
    }

    /**
     * <p>
     * A list of the <code>Features</code> in the <code>FeatureGroup</code>. Each feature is defined by a
     * <code>FeatureName</code> and <code>FeatureType</code>.
     * </p>
     * 
     * @return A list of the <code>Features</code> in the <code>FeatureGroup</code>. Each feature is defined by a
     *         <code>FeatureName</code> and <code>FeatureType</code>.
     */

    public java.util.List<FeatureDefinition> getFeatureDefinitions() {
        return featureDefinitions;
    }

    /**
     * <p>
     * A list of the <code>Features</code> in the <code>FeatureGroup</code>. Each feature is defined by a
     * <code>FeatureName</code> and <code>FeatureType</code>.
     * </p>
     * 
     * @param featureDefinitions
     *        A list of the <code>Features</code> in the <code>FeatureGroup</code>. Each feature is defined by a
     *        <code>FeatureName</code> and <code>FeatureType</code>.
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
     * A list of the <code>Features</code> in the <code>FeatureGroup</code>. Each feature is defined by a
     * <code>FeatureName</code> and <code>FeatureType</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureDefinitions(java.util.Collection)} or {@link #withFeatureDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param featureDefinitions
     *        A list of the <code>Features</code> in the <code>FeatureGroup</code>. Each feature is defined by a
     *        <code>FeatureName</code> and <code>FeatureType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withFeatureDefinitions(FeatureDefinition... featureDefinitions) {
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
     * A list of the <code>Features</code> in the <code>FeatureGroup</code>. Each feature is defined by a
     * <code>FeatureName</code> and <code>FeatureType</code>.
     * </p>
     * 
     * @param featureDefinitions
     *        A list of the <code>Features</code> in the <code>FeatureGroup</code>. Each feature is defined by a
     *        <code>FeatureName</code> and <code>FeatureType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withFeatureDefinitions(java.util.Collection<FeatureDefinition> featureDefinitions) {
        setFeatureDefinitions(featureDefinitions);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating when SageMaker created the <code>FeatureGroup</code>.
     * </p>
     * 
     * @param creationTime
     *        A timestamp indicating when SageMaker created the <code>FeatureGroup</code>.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp indicating when SageMaker created the <code>FeatureGroup</code>.
     * </p>
     * 
     * @return A timestamp indicating when SageMaker created the <code>FeatureGroup</code>.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp indicating when SageMaker created the <code>FeatureGroup</code>.
     * </p>
     * 
     * @param creationTime
     *        A timestamp indicating when SageMaker created the <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The configuration for the <code>OnlineStore</code>.
     * </p>
     * 
     * @param onlineStoreConfig
     *        The configuration for the <code>OnlineStore</code>.
     */

    public void setOnlineStoreConfig(OnlineStoreConfig onlineStoreConfig) {
        this.onlineStoreConfig = onlineStoreConfig;
    }

    /**
     * <p>
     * The configuration for the <code>OnlineStore</code>.
     * </p>
     * 
     * @return The configuration for the <code>OnlineStore</code>.
     */

    public OnlineStoreConfig getOnlineStoreConfig() {
        return this.onlineStoreConfig;
    }

    /**
     * <p>
     * The configuration for the <code>OnlineStore</code>.
     * </p>
     * 
     * @param onlineStoreConfig
     *        The configuration for the <code>OnlineStore</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withOnlineStoreConfig(OnlineStoreConfig onlineStoreConfig) {
        setOnlineStoreConfig(onlineStoreConfig);
        return this;
    }

    /**
     * <p>
     * The configuration of the <code>OfflineStore</code>, inducing the S3 location of the <code>OfflineStore</code>,
     * Amazon Web Services Glue or Amazon Web Services Hive data catalogue configurations, and the security
     * configuration.
     * </p>
     * 
     * @param offlineStoreConfig
     *        The configuration of the <code>OfflineStore</code>, inducing the S3 location of the
     *        <code>OfflineStore</code>, Amazon Web Services Glue or Amazon Web Services Hive data catalogue
     *        configurations, and the security configuration.
     */

    public void setOfflineStoreConfig(OfflineStoreConfig offlineStoreConfig) {
        this.offlineStoreConfig = offlineStoreConfig;
    }

    /**
     * <p>
     * The configuration of the <code>OfflineStore</code>, inducing the S3 location of the <code>OfflineStore</code>,
     * Amazon Web Services Glue or Amazon Web Services Hive data catalogue configurations, and the security
     * configuration.
     * </p>
     * 
     * @return The configuration of the <code>OfflineStore</code>, inducing the S3 location of the
     *         <code>OfflineStore</code>, Amazon Web Services Glue or Amazon Web Services Hive data catalogue
     *         configurations, and the security configuration.
     */

    public OfflineStoreConfig getOfflineStoreConfig() {
        return this.offlineStoreConfig;
    }

    /**
     * <p>
     * The configuration of the <code>OfflineStore</code>, inducing the S3 location of the <code>OfflineStore</code>,
     * Amazon Web Services Glue or Amazon Web Services Hive data catalogue configurations, and the security
     * configuration.
     * </p>
     * 
     * @param offlineStoreConfig
     *        The configuration of the <code>OfflineStore</code>, inducing the S3 location of the
     *        <code>OfflineStore</code>, Amazon Web Services Glue or Amazon Web Services Hive data catalogue
     *        configurations, and the security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withOfflineStoreConfig(OfflineStoreConfig offlineStoreConfig) {
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

    public DescribeFeatureGroupResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the feature group.
     * </p>
     * 
     * @param featureGroupStatus
     *        The status of the feature group.
     * @see FeatureGroupStatus
     */

    public void setFeatureGroupStatus(String featureGroupStatus) {
        this.featureGroupStatus = featureGroupStatus;
    }

    /**
     * <p>
     * The status of the feature group.
     * </p>
     * 
     * @return The status of the feature group.
     * @see FeatureGroupStatus
     */

    public String getFeatureGroupStatus() {
        return this.featureGroupStatus;
    }

    /**
     * <p>
     * The status of the feature group.
     * </p>
     * 
     * @param featureGroupStatus
     *        The status of the feature group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureGroupStatus
     */

    public DescribeFeatureGroupResult withFeatureGroupStatus(String featureGroupStatus) {
        setFeatureGroupStatus(featureGroupStatus);
        return this;
    }

    /**
     * <p>
     * The status of the feature group.
     * </p>
     * 
     * @param featureGroupStatus
     *        The status of the feature group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureGroupStatus
     */

    public DescribeFeatureGroupResult withFeatureGroupStatus(FeatureGroupStatus featureGroupStatus) {
        this.featureGroupStatus = featureGroupStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of the <code>OfflineStore</code>. Notifies you if replicating data into the <code>OfflineStore</code>
     * has failed. Returns either: <code>Active</code> or <code>Blocked</code>
     * </p>
     * 
     * @param offlineStoreStatus
     *        The status of the <code>OfflineStore</code>. Notifies you if replicating data into the
     *        <code>OfflineStore</code> has failed. Returns either: <code>Active</code> or <code>Blocked</code>
     */

    public void setOfflineStoreStatus(OfflineStoreStatus offlineStoreStatus) {
        this.offlineStoreStatus = offlineStoreStatus;
    }

    /**
     * <p>
     * The status of the <code>OfflineStore</code>. Notifies you if replicating data into the <code>OfflineStore</code>
     * has failed. Returns either: <code>Active</code> or <code>Blocked</code>
     * </p>
     * 
     * @return The status of the <code>OfflineStore</code>. Notifies you if replicating data into the
     *         <code>OfflineStore</code> has failed. Returns either: <code>Active</code> or <code>Blocked</code>
     */

    public OfflineStoreStatus getOfflineStoreStatus() {
        return this.offlineStoreStatus;
    }

    /**
     * <p>
     * The status of the <code>OfflineStore</code>. Notifies you if replicating data into the <code>OfflineStore</code>
     * has failed. Returns either: <code>Active</code> or <code>Blocked</code>
     * </p>
     * 
     * @param offlineStoreStatus
     *        The status of the <code>OfflineStore</code>. Notifies you if replicating data into the
     *        <code>OfflineStore</code> has failed. Returns either: <code>Active</code> or <code>Blocked</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withOfflineStoreStatus(OfflineStoreStatus offlineStoreStatus) {
        setOfflineStoreStatus(offlineStoreStatus);
        return this;
    }

    /**
     * <p>
     * The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>. This is
     * failure can occur because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>FeatureGroup</code> could not be created in the <code>OfflineStore</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>FeatureGroup</code> could not be deleted from the <code>OfflineStore</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>.
     *        This is failure can occur because:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>FeatureGroup</code> could not be created in the <code>OfflineStore</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>FeatureGroup</code> could not be deleted from the <code>OfflineStore</code>.
     *        </p>
     *        </li>
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>. This is
     * failure can occur because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>FeatureGroup</code> could not be created in the <code>OfflineStore</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>FeatureGroup</code> could not be deleted from the <code>OfflineStore</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>.
     *         This is failure can occur because:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>FeatureGroup</code> could not be created in the <code>OfflineStore</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>FeatureGroup</code> could not be deleted from the <code>OfflineStore</code>.
     *         </p>
     *         </li>
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>. This is
     * failure can occur because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>FeatureGroup</code> could not be created in the <code>OfflineStore</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>FeatureGroup</code> could not be deleted from the <code>OfflineStore</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>.
     *        This is failure can occur because:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>FeatureGroup</code> could not be created in the <code>OfflineStore</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>FeatureGroup</code> could not be deleted from the <code>OfflineStore</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * A free form description of the feature group.
     * </p>
     * 
     * @param description
     *        A free form description of the feature group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A free form description of the feature group.
     * </p>
     * 
     * @return A free form description of the feature group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A free form description of the feature group.
     * </p>
     * 
     * @param description
     *        A free form description of the feature group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>).
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>).
     * </p>
     * 
     * @return A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>).
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination of the list of <code>Features</code> (<code>FeatureDefinitions</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureGroupResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getFeatureGroupArn() != null)
            sb.append("FeatureGroupArn: ").append(getFeatureGroupArn()).append(",");
        if (getFeatureGroupName() != null)
            sb.append("FeatureGroupName: ").append(getFeatureGroupName()).append(",");
        if (getRecordIdentifierFeatureName() != null)
            sb.append("RecordIdentifierFeatureName: ").append(getRecordIdentifierFeatureName()).append(",");
        if (getEventTimeFeatureName() != null)
            sb.append("EventTimeFeatureName: ").append(getEventTimeFeatureName()).append(",");
        if (getFeatureDefinitions() != null)
            sb.append("FeatureDefinitions: ").append(getFeatureDefinitions()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getOnlineStoreConfig() != null)
            sb.append("OnlineStoreConfig: ").append(getOnlineStoreConfig()).append(",");
        if (getOfflineStoreConfig() != null)
            sb.append("OfflineStoreConfig: ").append(getOfflineStoreConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getFeatureGroupStatus() != null)
            sb.append("FeatureGroupStatus: ").append(getFeatureGroupStatus()).append(",");
        if (getOfflineStoreStatus() != null)
            sb.append("OfflineStoreStatus: ").append(getOfflineStoreStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFeatureGroupResult == false)
            return false;
        DescribeFeatureGroupResult other = (DescribeFeatureGroupResult) obj;
        if (other.getFeatureGroupArn() == null ^ this.getFeatureGroupArn() == null)
            return false;
        if (other.getFeatureGroupArn() != null && other.getFeatureGroupArn().equals(this.getFeatureGroupArn()) == false)
            return false;
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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
        if (other.getFeatureGroupStatus() == null ^ this.getFeatureGroupStatus() == null)
            return false;
        if (other.getFeatureGroupStatus() != null && other.getFeatureGroupStatus().equals(this.getFeatureGroupStatus()) == false)
            return false;
        if (other.getOfflineStoreStatus() == null ^ this.getOfflineStoreStatus() == null)
            return false;
        if (other.getOfflineStoreStatus() != null && other.getOfflineStoreStatus().equals(this.getOfflineStoreStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureGroupArn() == null) ? 0 : getFeatureGroupArn().hashCode());
        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        hashCode = prime * hashCode + ((getRecordIdentifierFeatureName() == null) ? 0 : getRecordIdentifierFeatureName().hashCode());
        hashCode = prime * hashCode + ((getEventTimeFeatureName() == null) ? 0 : getEventTimeFeatureName().hashCode());
        hashCode = prime * hashCode + ((getFeatureDefinitions() == null) ? 0 : getFeatureDefinitions().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getOnlineStoreConfig() == null) ? 0 : getOnlineStoreConfig().hashCode());
        hashCode = prime * hashCode + ((getOfflineStoreConfig() == null) ? 0 : getOfflineStoreConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getFeatureGroupStatus() == null) ? 0 : getFeatureGroupStatus().hashCode());
        hashCode = prime * hashCode + ((getOfflineStoreStatus() == null) ? 0 : getOfflineStoreStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFeatureGroupResult clone() {
        try {
            return (DescribeFeatureGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
