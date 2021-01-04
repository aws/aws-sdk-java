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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon SageMaker Feature Store stores features in a collection called Feature Group. A Feature Group can be
 * visualized as a table which has rows, with a unique identifier for each row where each column in the table is a
 * feature. In principle, a Feature Group is composed of features and values per features.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/FeatureGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeatureGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a <code>FeatureGroup</code>.
     * </p>
     */
    private String featureGroupArn;
    /**
     * <p>
     * The name of the <code>FeatureGroup</code>.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     * <code>FeatureGroup</code> <code>FeatureDefinitions</code>.
     * </p>
     */
    private String recordIdentifierFeatureName;
    /**
     * <p>
     * The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>.
     * </p>
     * <p>
     * A <code>EventTime</code> is point in time when a new event occurs that corresponds to the creation or update of a
     * <code>Record</code> in <code>FeatureGroup</code>. All <code>Records</code> in the <code>FeatureGroup</code> must
     * have a corresponding <code>EventTime</code>.
     * </p>
     */
    private String eventTimeFeatureName;
    /**
     * <p>
     * A list of <code>Feature</code>s. Each <code>Feature</code> must include a <code>FeatureName</code> and a
     * <code>FeatureType</code>.
     * </p>
     * <p>
     * Valid <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and <code>String</code>.
     * </p>
     * <p>
     * <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>,
     * <code>api_invocation_time</code>.
     * </p>
     * <p>
     * You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * </p>
     */
    private java.util.List<FeatureDefinition> featureDefinitions;
    /**
     * <p>
     * The time a <code>FeatureGroup</code> was created.
     * </p>
     */
    private java.util.Date creationTime;

    private OnlineStoreConfig onlineStoreConfig;

    private OfflineStoreConfig offlineStoreConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A <code>FeatureGroup</code> status.
     * </p>
     */
    private String featureGroupStatus;

    private OfflineStoreStatus offlineStoreStatus;
    /**
     * <p>
     * The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>. This is
     * failure may be due to a failure to create a <code>FeatureGroup</code> in or delete a <code>FeatureGroup</code>
     * from the <code>OfflineStore</code>.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * A free form description of a <code>FeatureGroup</code>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Tags used to define a <code>FeatureGroup</code>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureGroupArn
     *        The Amazon Resource Name (ARN) of a <code>FeatureGroup</code>.
     */

    public void setFeatureGroupArn(String featureGroupArn) {
        this.featureGroupArn = featureGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a <code>FeatureGroup</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a <code>FeatureGroup</code>.
     */

    public String getFeatureGroupArn() {
        return this.featureGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureGroupArn
     *        The Amazon Resource Name (ARN) of a <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withFeatureGroupArn(String featureGroupArn) {
        setFeatureGroupArn(featureGroupArn);
        return this;
    }

    /**
     * <p>
     * The name of the <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the <code>FeatureGroup</code>.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of the <code>FeatureGroup</code>.
     * </p>
     * 
     * @return The name of the <code>FeatureGroup</code>.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of the <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     * <code>FeatureGroup</code> <code>FeatureDefinitions</code>.
     * </p>
     * 
     * @param recordIdentifierFeatureName
     *        The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     *        <code>FeatureGroup</code> <code>FeatureDefinitions</code>.
     */

    public void setRecordIdentifierFeatureName(String recordIdentifierFeatureName) {
        this.recordIdentifierFeatureName = recordIdentifierFeatureName;
    }

    /**
     * <p>
     * The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     * <code>FeatureGroup</code> <code>FeatureDefinitions</code>.
     * </p>
     * 
     * @return The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     *         <code>FeatureGroup</code> <code>FeatureDefinitions</code>.
     */

    public String getRecordIdentifierFeatureName() {
        return this.recordIdentifierFeatureName;
    }

    /**
     * <p>
     * The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     * <code>FeatureGroup</code> <code>FeatureDefinitions</code>.
     * </p>
     * 
     * @param recordIdentifierFeatureName
     *        The name of the <code>Feature</code> whose value uniquely identifies a <code>Record</code> defined in the
     *        <code>FeatureGroup</code> <code>FeatureDefinitions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withRecordIdentifierFeatureName(String recordIdentifierFeatureName) {
        setRecordIdentifierFeatureName(recordIdentifierFeatureName);
        return this;
    }

    /**
     * <p>
     * The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>.
     * </p>
     * <p>
     * A <code>EventTime</code> is point in time when a new event occurs that corresponds to the creation or update of a
     * <code>Record</code> in <code>FeatureGroup</code>. All <code>Records</code> in the <code>FeatureGroup</code> must
     * have a corresponding <code>EventTime</code>.
     * </p>
     * 
     * @param eventTimeFeatureName
     *        The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>
     *        .</p>
     *        <p>
     *        A <code>EventTime</code> is point in time when a new event occurs that corresponds to the creation or
     *        update of a <code>Record</code> in <code>FeatureGroup</code>. All <code>Records</code> in the
     *        <code>FeatureGroup</code> must have a corresponding <code>EventTime</code>.
     */

    public void setEventTimeFeatureName(String eventTimeFeatureName) {
        this.eventTimeFeatureName = eventTimeFeatureName;
    }

    /**
     * <p>
     * The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>.
     * </p>
     * <p>
     * A <code>EventTime</code> is point in time when a new event occurs that corresponds to the creation or update of a
     * <code>Record</code> in <code>FeatureGroup</code>. All <code>Records</code> in the <code>FeatureGroup</code> must
     * have a corresponding <code>EventTime</code>.
     * </p>
     * 
     * @return The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>
     *         .</p>
     *         <p>
     *         A <code>EventTime</code> is point in time when a new event occurs that corresponds to the creation or
     *         update of a <code>Record</code> in <code>FeatureGroup</code>. All <code>Records</code> in the
     *         <code>FeatureGroup</code> must have a corresponding <code>EventTime</code>.
     */

    public String getEventTimeFeatureName() {
        return this.eventTimeFeatureName;
    }

    /**
     * <p>
     * The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>.
     * </p>
     * <p>
     * A <code>EventTime</code> is point in time when a new event occurs that corresponds to the creation or update of a
     * <code>Record</code> in <code>FeatureGroup</code>. All <code>Records</code> in the <code>FeatureGroup</code> must
     * have a corresponding <code>EventTime</code>.
     * </p>
     * 
     * @param eventTimeFeatureName
     *        The name of the feature that stores the <code>EventTime</code> of a Record in a <code>FeatureGroup</code>
     *        .</p>
     *        <p>
     *        A <code>EventTime</code> is point in time when a new event occurs that corresponds to the creation or
     *        update of a <code>Record</code> in <code>FeatureGroup</code>. All <code>Records</code> in the
     *        <code>FeatureGroup</code> must have a corresponding <code>EventTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withEventTimeFeatureName(String eventTimeFeatureName) {
        setEventTimeFeatureName(eventTimeFeatureName);
        return this;
    }

    /**
     * <p>
     * A list of <code>Feature</code>s. Each <code>Feature</code> must include a <code>FeatureName</code> and a
     * <code>FeatureType</code>.
     * </p>
     * <p>
     * Valid <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and <code>String</code>.
     * </p>
     * <p>
     * <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>,
     * <code>api_invocation_time</code>.
     * </p>
     * <p>
     * You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * </p>
     * 
     * @return A list of <code>Feature</code>s. Each <code>Feature</code> must include a <code>FeatureName</code> and a
     *         <code>FeatureType</code>. </p>
     *         <p>
     *         Valid <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and
     *         <code>String</code>.
     *         </p>
     *         <p>
     *         <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>,
     *         <code>write_time</code>, <code>api_invocation_time</code>.
     *         </p>
     *         <p>
     *         You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     */

    public java.util.List<FeatureDefinition> getFeatureDefinitions() {
        return featureDefinitions;
    }

    /**
     * <p>
     * A list of <code>Feature</code>s. Each <code>Feature</code> must include a <code>FeatureName</code> and a
     * <code>FeatureType</code>.
     * </p>
     * <p>
     * Valid <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and <code>String</code>.
     * </p>
     * <p>
     * <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>,
     * <code>api_invocation_time</code>.
     * </p>
     * <p>
     * You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureDefinitions
     *        A list of <code>Feature</code>s. Each <code>Feature</code> must include a <code>FeatureName</code> and a
     *        <code>FeatureType</code>. </p>
     *        <p>
     *        Valid <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and <code>String</code>
     *        .
     *        </p>
     *        <p>
     *        <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
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
     * A list of <code>Feature</code>s. Each <code>Feature</code> must include a <code>FeatureName</code> and a
     * <code>FeatureType</code>.
     * </p>
     * <p>
     * Valid <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and <code>String</code>.
     * </p>
     * <p>
     * <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>,
     * <code>api_invocation_time</code>.
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
     *        A list of <code>Feature</code>s. Each <code>Feature</code> must include a <code>FeatureName</code> and a
     *        <code>FeatureType</code>. </p>
     *        <p>
     *        Valid <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and <code>String</code>
     *        .
     *        </p>
     *        <p>
     *        <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     *        </p>
     *        <p>
     *        You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withFeatureDefinitions(FeatureDefinition... featureDefinitions) {
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
     * A list of <code>Feature</code>s. Each <code>Feature</code> must include a <code>FeatureName</code> and a
     * <code>FeatureType</code>.
     * </p>
     * <p>
     * Valid <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and <code>String</code>.
     * </p>
     * <p>
     * <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>,
     * <code>api_invocation_time</code>.
     * </p>
     * <p>
     * You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * </p>
     * 
     * @param featureDefinitions
     *        A list of <code>Feature</code>s. Each <code>Feature</code> must include a <code>FeatureName</code> and a
     *        <code>FeatureType</code>. </p>
     *        <p>
     *        Valid <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and <code>String</code>
     *        .
     *        </p>
     *        <p>
     *        <code>FeatureName</code>s cannot be any of the following: <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     *        </p>
     *        <p>
     *        You can create up to 2,500 <code>FeatureDefinition</code>s per <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withFeatureDefinitions(java.util.Collection<FeatureDefinition> featureDefinitions) {
        setFeatureDefinitions(featureDefinitions);
        return this;
    }

    /**
     * <p>
     * The time a <code>FeatureGroup</code> was created.
     * </p>
     * 
     * @param creationTime
     *        The time a <code>FeatureGroup</code> was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time a <code>FeatureGroup</code> was created.
     * </p>
     * 
     * @return The time a <code>FeatureGroup</code> was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time a <code>FeatureGroup</code> was created.
     * </p>
     * 
     * @param creationTime
     *        The time a <code>FeatureGroup</code> was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param onlineStoreConfig
     */

    public void setOnlineStoreConfig(OnlineStoreConfig onlineStoreConfig) {
        this.onlineStoreConfig = onlineStoreConfig;
    }

    /**
     * @return
     */

    public OnlineStoreConfig getOnlineStoreConfig() {
        return this.onlineStoreConfig;
    }

    /**
     * @param onlineStoreConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withOnlineStoreConfig(OnlineStoreConfig onlineStoreConfig) {
        setOnlineStoreConfig(onlineStoreConfig);
        return this;
    }

    /**
     * @param offlineStoreConfig
     */

    public void setOfflineStoreConfig(OfflineStoreConfig offlineStoreConfig) {
        this.offlineStoreConfig = offlineStoreConfig;
    }

    /**
     * @return
     */

    public OfflineStoreConfig getOfflineStoreConfig() {
        return this.offlineStoreConfig;
    }

    /**
     * @param offlineStoreConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withOfflineStoreConfig(OfflineStoreConfig offlineStoreConfig) {
        setOfflineStoreConfig(offlineStoreConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM execution role used to create the feature group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A <code>FeatureGroup</code> status.
     * </p>
     * 
     * @param featureGroupStatus
     *        A <code>FeatureGroup</code> status.
     * @see FeatureGroupStatus
     */

    public void setFeatureGroupStatus(String featureGroupStatus) {
        this.featureGroupStatus = featureGroupStatus;
    }

    /**
     * <p>
     * A <code>FeatureGroup</code> status.
     * </p>
     * 
     * @return A <code>FeatureGroup</code> status.
     * @see FeatureGroupStatus
     */

    public String getFeatureGroupStatus() {
        return this.featureGroupStatus;
    }

    /**
     * <p>
     * A <code>FeatureGroup</code> status.
     * </p>
     * 
     * @param featureGroupStatus
     *        A <code>FeatureGroup</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureGroupStatus
     */

    public FeatureGroup withFeatureGroupStatus(String featureGroupStatus) {
        setFeatureGroupStatus(featureGroupStatus);
        return this;
    }

    /**
     * <p>
     * A <code>FeatureGroup</code> status.
     * </p>
     * 
     * @param featureGroupStatus
     *        A <code>FeatureGroup</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureGroupStatus
     */

    public FeatureGroup withFeatureGroupStatus(FeatureGroupStatus featureGroupStatus) {
        this.featureGroupStatus = featureGroupStatus.toString();
        return this;
    }

    /**
     * @param offlineStoreStatus
     */

    public void setOfflineStoreStatus(OfflineStoreStatus offlineStoreStatus) {
        this.offlineStoreStatus = offlineStoreStatus;
    }

    /**
     * @return
     */

    public OfflineStoreStatus getOfflineStoreStatus() {
        return this.offlineStoreStatus;
    }

    /**
     * @param offlineStoreStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withOfflineStoreStatus(OfflineStoreStatus offlineStoreStatus) {
        setOfflineStoreStatus(offlineStoreStatus);
        return this;
    }

    /**
     * <p>
     * The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>. This is
     * failure may be due to a failure to create a <code>FeatureGroup</code> in or delete a <code>FeatureGroup</code>
     * from the <code>OfflineStore</code>.
     * </p>
     * 
     * @param failureReason
     *        The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>.
     *        This is failure may be due to a failure to create a <code>FeatureGroup</code> in or delete a
     *        <code>FeatureGroup</code> from the <code>OfflineStore</code>.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>. This is
     * failure may be due to a failure to create a <code>FeatureGroup</code> in or delete a <code>FeatureGroup</code>
     * from the <code>OfflineStore</code>.
     * </p>
     * 
     * @return The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>.
     *         This is failure may be due to a failure to create a <code>FeatureGroup</code> in or delete a
     *         <code>FeatureGroup</code> from the <code>OfflineStore</code>.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>. This is
     * failure may be due to a failure to create a <code>FeatureGroup</code> in or delete a <code>FeatureGroup</code>
     * from the <code>OfflineStore</code>.
     * </p>
     * 
     * @param failureReason
     *        The reason that the <code>FeatureGroup</code> failed to be replicated in the <code>OfflineStore</code>.
     *        This is failure may be due to a failure to create a <code>FeatureGroup</code> in or delete a
     *        <code>FeatureGroup</code> from the <code>OfflineStore</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * A free form description of a <code>FeatureGroup</code>.
     * </p>
     * 
     * @param description
     *        A free form description of a <code>FeatureGroup</code>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A free form description of a <code>FeatureGroup</code>.
     * </p>
     * 
     * @return A free form description of a <code>FeatureGroup</code>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A free form description of a <code>FeatureGroup</code>.
     * </p>
     * 
     * @param description
     *        A free form description of a <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Tags used to define a <code>FeatureGroup</code>.
     * </p>
     * 
     * @return Tags used to define a <code>FeatureGroup</code>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags used to define a <code>FeatureGroup</code>.
     * </p>
     * 
     * @param tags
     *        Tags used to define a <code>FeatureGroup</code>.
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
     * Tags used to define a <code>FeatureGroup</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags used to define a <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withTags(Tag... tags) {
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
     * Tags used to define a <code>FeatureGroup</code>.
     * </p>
     * 
     * @param tags
     *        Tags used to define a <code>FeatureGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureGroup withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof FeatureGroup == false)
            return false;
        FeatureGroup other = (FeatureGroup) obj;
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public FeatureGroup clone() {
        try {
            return (FeatureGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.FeatureGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
