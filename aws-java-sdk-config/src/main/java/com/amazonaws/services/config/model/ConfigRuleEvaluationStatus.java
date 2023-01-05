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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status information for your Config Managed rules and Config Custom Policy rules. The status includes information such
 * as the last time the rule ran, the last time it failed, and the related error for the last failure.
 * </p>
 * <p>
 * This action does not return status information about Config Custom Lambda rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConfigRuleEvaluationStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigRuleEvaluationStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Config rule.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Config rule.
     * </p>
     */
    private String configRuleArn;
    /**
     * <p>
     * The ID of the Config rule.
     * </p>
     */
    private String configRuleId;
    /**
     * <p>
     * The time that Config last successfully invoked the Config rule to evaluate your Amazon Web Services resources.
     * </p>
     */
    private java.util.Date lastSuccessfulInvocationTime;
    /**
     * <p>
     * The time that Config last failed to invoke the Config rule to evaluate your Amazon Web Services resources.
     * </p>
     */
    private java.util.Date lastFailedInvocationTime;
    /**
     * <p>
     * The time that Config last successfully evaluated your Amazon Web Services resources against the rule.
     * </p>
     */
    private java.util.Date lastSuccessfulEvaluationTime;
    /**
     * <p>
     * The time that Config last failed to evaluate your Amazon Web Services resources against the rule.
     * </p>
     */
    private java.util.Date lastFailedEvaluationTime;
    /**
     * <p>
     * The time that you first activated the Config rule.
     * </p>
     */
    private java.util.Date firstActivatedTime;
    /**
     * <p>
     * The time that you last turned off the Config rule.
     * </p>
     */
    private java.util.Date lastDeactivatedTime;
    /**
     * <p>
     * The error code that Config returned when the rule last failed.
     * </p>
     */
    private String lastErrorCode;
    /**
     * <p>
     * The error message that Config returned when the rule last failed.
     * </p>
     */
    private String lastErrorMessage;
    /**
     * <p>
     * Indicates whether Config has evaluated your resources against the rule at least once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> - Config has evaluated your Amazon Web Services resources against the rule at least once.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> - Config has not finished evaluating your Amazon Web Services resources against the rule at
     * least once.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean firstEvaluationStarted;
    /**
     * <p>
     * The status of the last attempted delivery of a debug log for your Config Custom Policy rules. Either
     * <code>Successful</code> or <code>Failed</code>.
     * </p>
     */
    private String lastDebugLogDeliveryStatus;
    /**
     * <p>
     * The reason Config was not able to deliver a debug log. This is for the last failed attempt to retrieve a debug
     * log for your Config Custom Policy rules.
     * </p>
     */
    private String lastDebugLogDeliveryStatusReason;
    /**
     * <p>
     * The time Config last attempted to deliver a debug log for your Config Custom Policy rules.
     * </p>
     */
    private java.util.Date lastDebugLogDeliveryTime;

    /**
     * <p>
     * The name of the Config rule.
     * </p>
     * 
     * @param configRuleName
     *        The name of the Config rule.
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * The name of the Config rule.
     * </p>
     * 
     * @return The name of the Config rule.
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * The name of the Config rule.
     * </p>
     * 
     * @param configRuleName
     *        The name of the Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Config rule.
     * </p>
     * 
     * @param configRuleArn
     *        The Amazon Resource Name (ARN) of the Config rule.
     */

    public void setConfigRuleArn(String configRuleArn) {
        this.configRuleArn = configRuleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Config rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Config rule.
     */

    public String getConfigRuleArn() {
        return this.configRuleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Config rule.
     * </p>
     * 
     * @param configRuleArn
     *        The Amazon Resource Name (ARN) of the Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withConfigRuleArn(String configRuleArn) {
        setConfigRuleArn(configRuleArn);
        return this;
    }

    /**
     * <p>
     * The ID of the Config rule.
     * </p>
     * 
     * @param configRuleId
     *        The ID of the Config rule.
     */

    public void setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
    }

    /**
     * <p>
     * The ID of the Config rule.
     * </p>
     * 
     * @return The ID of the Config rule.
     */

    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * <p>
     * The ID of the Config rule.
     * </p>
     * 
     * @param configRuleId
     *        The ID of the Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withConfigRuleId(String configRuleId) {
        setConfigRuleId(configRuleId);
        return this;
    }

    /**
     * <p>
     * The time that Config last successfully invoked the Config rule to evaluate your Amazon Web Services resources.
     * </p>
     * 
     * @param lastSuccessfulInvocationTime
     *        The time that Config last successfully invoked the Config rule to evaluate your Amazon Web Services
     *        resources.
     */

    public void setLastSuccessfulInvocationTime(java.util.Date lastSuccessfulInvocationTime) {
        this.lastSuccessfulInvocationTime = lastSuccessfulInvocationTime;
    }

    /**
     * <p>
     * The time that Config last successfully invoked the Config rule to evaluate your Amazon Web Services resources.
     * </p>
     * 
     * @return The time that Config last successfully invoked the Config rule to evaluate your Amazon Web Services
     *         resources.
     */

    public java.util.Date getLastSuccessfulInvocationTime() {
        return this.lastSuccessfulInvocationTime;
    }

    /**
     * <p>
     * The time that Config last successfully invoked the Config rule to evaluate your Amazon Web Services resources.
     * </p>
     * 
     * @param lastSuccessfulInvocationTime
     *        The time that Config last successfully invoked the Config rule to evaluate your Amazon Web Services
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastSuccessfulInvocationTime(java.util.Date lastSuccessfulInvocationTime) {
        setLastSuccessfulInvocationTime(lastSuccessfulInvocationTime);
        return this;
    }

    /**
     * <p>
     * The time that Config last failed to invoke the Config rule to evaluate your Amazon Web Services resources.
     * </p>
     * 
     * @param lastFailedInvocationTime
     *        The time that Config last failed to invoke the Config rule to evaluate your Amazon Web Services resources.
     */

    public void setLastFailedInvocationTime(java.util.Date lastFailedInvocationTime) {
        this.lastFailedInvocationTime = lastFailedInvocationTime;
    }

    /**
     * <p>
     * The time that Config last failed to invoke the Config rule to evaluate your Amazon Web Services resources.
     * </p>
     * 
     * @return The time that Config last failed to invoke the Config rule to evaluate your Amazon Web Services
     *         resources.
     */

    public java.util.Date getLastFailedInvocationTime() {
        return this.lastFailedInvocationTime;
    }

    /**
     * <p>
     * The time that Config last failed to invoke the Config rule to evaluate your Amazon Web Services resources.
     * </p>
     * 
     * @param lastFailedInvocationTime
     *        The time that Config last failed to invoke the Config rule to evaluate your Amazon Web Services resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastFailedInvocationTime(java.util.Date lastFailedInvocationTime) {
        setLastFailedInvocationTime(lastFailedInvocationTime);
        return this;
    }

    /**
     * <p>
     * The time that Config last successfully evaluated your Amazon Web Services resources against the rule.
     * </p>
     * 
     * @param lastSuccessfulEvaluationTime
     *        The time that Config last successfully evaluated your Amazon Web Services resources against the rule.
     */

    public void setLastSuccessfulEvaluationTime(java.util.Date lastSuccessfulEvaluationTime) {
        this.lastSuccessfulEvaluationTime = lastSuccessfulEvaluationTime;
    }

    /**
     * <p>
     * The time that Config last successfully evaluated your Amazon Web Services resources against the rule.
     * </p>
     * 
     * @return The time that Config last successfully evaluated your Amazon Web Services resources against the rule.
     */

    public java.util.Date getLastSuccessfulEvaluationTime() {
        return this.lastSuccessfulEvaluationTime;
    }

    /**
     * <p>
     * The time that Config last successfully evaluated your Amazon Web Services resources against the rule.
     * </p>
     * 
     * @param lastSuccessfulEvaluationTime
     *        The time that Config last successfully evaluated your Amazon Web Services resources against the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastSuccessfulEvaluationTime(java.util.Date lastSuccessfulEvaluationTime) {
        setLastSuccessfulEvaluationTime(lastSuccessfulEvaluationTime);
        return this;
    }

    /**
     * <p>
     * The time that Config last failed to evaluate your Amazon Web Services resources against the rule.
     * </p>
     * 
     * @param lastFailedEvaluationTime
     *        The time that Config last failed to evaluate your Amazon Web Services resources against the rule.
     */

    public void setLastFailedEvaluationTime(java.util.Date lastFailedEvaluationTime) {
        this.lastFailedEvaluationTime = lastFailedEvaluationTime;
    }

    /**
     * <p>
     * The time that Config last failed to evaluate your Amazon Web Services resources against the rule.
     * </p>
     * 
     * @return The time that Config last failed to evaluate your Amazon Web Services resources against the rule.
     */

    public java.util.Date getLastFailedEvaluationTime() {
        return this.lastFailedEvaluationTime;
    }

    /**
     * <p>
     * The time that Config last failed to evaluate your Amazon Web Services resources against the rule.
     * </p>
     * 
     * @param lastFailedEvaluationTime
     *        The time that Config last failed to evaluate your Amazon Web Services resources against the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastFailedEvaluationTime(java.util.Date lastFailedEvaluationTime) {
        setLastFailedEvaluationTime(lastFailedEvaluationTime);
        return this;
    }

    /**
     * <p>
     * The time that you first activated the Config rule.
     * </p>
     * 
     * @param firstActivatedTime
     *        The time that you first activated the Config rule.
     */

    public void setFirstActivatedTime(java.util.Date firstActivatedTime) {
        this.firstActivatedTime = firstActivatedTime;
    }

    /**
     * <p>
     * The time that you first activated the Config rule.
     * </p>
     * 
     * @return The time that you first activated the Config rule.
     */

    public java.util.Date getFirstActivatedTime() {
        return this.firstActivatedTime;
    }

    /**
     * <p>
     * The time that you first activated the Config rule.
     * </p>
     * 
     * @param firstActivatedTime
     *        The time that you first activated the Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withFirstActivatedTime(java.util.Date firstActivatedTime) {
        setFirstActivatedTime(firstActivatedTime);
        return this;
    }

    /**
     * <p>
     * The time that you last turned off the Config rule.
     * </p>
     * 
     * @param lastDeactivatedTime
     *        The time that you last turned off the Config rule.
     */

    public void setLastDeactivatedTime(java.util.Date lastDeactivatedTime) {
        this.lastDeactivatedTime = lastDeactivatedTime;
    }

    /**
     * <p>
     * The time that you last turned off the Config rule.
     * </p>
     * 
     * @return The time that you last turned off the Config rule.
     */

    public java.util.Date getLastDeactivatedTime() {
        return this.lastDeactivatedTime;
    }

    /**
     * <p>
     * The time that you last turned off the Config rule.
     * </p>
     * 
     * @param lastDeactivatedTime
     *        The time that you last turned off the Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastDeactivatedTime(java.util.Date lastDeactivatedTime) {
        setLastDeactivatedTime(lastDeactivatedTime);
        return this;
    }

    /**
     * <p>
     * The error code that Config returned when the rule last failed.
     * </p>
     * 
     * @param lastErrorCode
     *        The error code that Config returned when the rule last failed.
     */

    public void setLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
    }

    /**
     * <p>
     * The error code that Config returned when the rule last failed.
     * </p>
     * 
     * @return The error code that Config returned when the rule last failed.
     */

    public String getLastErrorCode() {
        return this.lastErrorCode;
    }

    /**
     * <p>
     * The error code that Config returned when the rule last failed.
     * </p>
     * 
     * @param lastErrorCode
     *        The error code that Config returned when the rule last failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastErrorCode(String lastErrorCode) {
        setLastErrorCode(lastErrorCode);
        return this;
    }

    /**
     * <p>
     * The error message that Config returned when the rule last failed.
     * </p>
     * 
     * @param lastErrorMessage
     *        The error message that Config returned when the rule last failed.
     */

    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    /**
     * <p>
     * The error message that Config returned when the rule last failed.
     * </p>
     * 
     * @return The error message that Config returned when the rule last failed.
     */

    public String getLastErrorMessage() {
        return this.lastErrorMessage;
    }

    /**
     * <p>
     * The error message that Config returned when the rule last failed.
     * </p>
     * 
     * @param lastErrorMessage
     *        The error message that Config returned when the rule last failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastErrorMessage(String lastErrorMessage) {
        setLastErrorMessage(lastErrorMessage);
        return this;
    }

    /**
     * <p>
     * Indicates whether Config has evaluated your resources against the rule at least once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> - Config has evaluated your Amazon Web Services resources against the rule at least once.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> - Config has not finished evaluating your Amazon Web Services resources against the rule at
     * least once.
     * </p>
     * </li>
     * </ul>
     * 
     * @param firstEvaluationStarted
     *        Indicates whether Config has evaluated your resources against the rule at least once.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code> - Config has evaluated your Amazon Web Services resources against the rule at least
     *        once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code> - Config has not finished evaluating your Amazon Web Services resources against the
     *        rule at least once.
     *        </p>
     *        </li>
     */

    public void setFirstEvaluationStarted(Boolean firstEvaluationStarted) {
        this.firstEvaluationStarted = firstEvaluationStarted;
    }

    /**
     * <p>
     * Indicates whether Config has evaluated your resources against the rule at least once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> - Config has evaluated your Amazon Web Services resources against the rule at least once.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> - Config has not finished evaluating your Amazon Web Services resources against the rule at
     * least once.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether Config has evaluated your resources against the rule at least once.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code> - Config has evaluated your Amazon Web Services resources against the rule at least
     *         once.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code> - Config has not finished evaluating your Amazon Web Services resources against the
     *         rule at least once.
     *         </p>
     *         </li>
     */

    public Boolean getFirstEvaluationStarted() {
        return this.firstEvaluationStarted;
    }

    /**
     * <p>
     * Indicates whether Config has evaluated your resources against the rule at least once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> - Config has evaluated your Amazon Web Services resources against the rule at least once.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> - Config has not finished evaluating your Amazon Web Services resources against the rule at
     * least once.
     * </p>
     * </li>
     * </ul>
     * 
     * @param firstEvaluationStarted
     *        Indicates whether Config has evaluated your resources against the rule at least once.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code> - Config has evaluated your Amazon Web Services resources against the rule at least
     *        once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code> - Config has not finished evaluating your Amazon Web Services resources against the
     *        rule at least once.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withFirstEvaluationStarted(Boolean firstEvaluationStarted) {
        setFirstEvaluationStarted(firstEvaluationStarted);
        return this;
    }

    /**
     * <p>
     * Indicates whether Config has evaluated your resources against the rule at least once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> - Config has evaluated your Amazon Web Services resources against the rule at least once.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> - Config has not finished evaluating your Amazon Web Services resources against the rule at
     * least once.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether Config has evaluated your resources against the rule at least once.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code> - Config has evaluated your Amazon Web Services resources against the rule at least
     *         once.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code> - Config has not finished evaluating your Amazon Web Services resources against the
     *         rule at least once.
     *         </p>
     *         </li>
     */

    public Boolean isFirstEvaluationStarted() {
        return this.firstEvaluationStarted;
    }

    /**
     * <p>
     * The status of the last attempted delivery of a debug log for your Config Custom Policy rules. Either
     * <code>Successful</code> or <code>Failed</code>.
     * </p>
     * 
     * @param lastDebugLogDeliveryStatus
     *        The status of the last attempted delivery of a debug log for your Config Custom Policy rules. Either
     *        <code>Successful</code> or <code>Failed</code>.
     */

    public void setLastDebugLogDeliveryStatus(String lastDebugLogDeliveryStatus) {
        this.lastDebugLogDeliveryStatus = lastDebugLogDeliveryStatus;
    }

    /**
     * <p>
     * The status of the last attempted delivery of a debug log for your Config Custom Policy rules. Either
     * <code>Successful</code> or <code>Failed</code>.
     * </p>
     * 
     * @return The status of the last attempted delivery of a debug log for your Config Custom Policy rules. Either
     *         <code>Successful</code> or <code>Failed</code>.
     */

    public String getLastDebugLogDeliveryStatus() {
        return this.lastDebugLogDeliveryStatus;
    }

    /**
     * <p>
     * The status of the last attempted delivery of a debug log for your Config Custom Policy rules. Either
     * <code>Successful</code> or <code>Failed</code>.
     * </p>
     * 
     * @param lastDebugLogDeliveryStatus
     *        The status of the last attempted delivery of a debug log for your Config Custom Policy rules. Either
     *        <code>Successful</code> or <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastDebugLogDeliveryStatus(String lastDebugLogDeliveryStatus) {
        setLastDebugLogDeliveryStatus(lastDebugLogDeliveryStatus);
        return this;
    }

    /**
     * <p>
     * The reason Config was not able to deliver a debug log. This is for the last failed attempt to retrieve a debug
     * log for your Config Custom Policy rules.
     * </p>
     * 
     * @param lastDebugLogDeliveryStatusReason
     *        The reason Config was not able to deliver a debug log. This is for the last failed attempt to retrieve a
     *        debug log for your Config Custom Policy rules.
     */

    public void setLastDebugLogDeliveryStatusReason(String lastDebugLogDeliveryStatusReason) {
        this.lastDebugLogDeliveryStatusReason = lastDebugLogDeliveryStatusReason;
    }

    /**
     * <p>
     * The reason Config was not able to deliver a debug log. This is for the last failed attempt to retrieve a debug
     * log for your Config Custom Policy rules.
     * </p>
     * 
     * @return The reason Config was not able to deliver a debug log. This is for the last failed attempt to retrieve a
     *         debug log for your Config Custom Policy rules.
     */

    public String getLastDebugLogDeliveryStatusReason() {
        return this.lastDebugLogDeliveryStatusReason;
    }

    /**
     * <p>
     * The reason Config was not able to deliver a debug log. This is for the last failed attempt to retrieve a debug
     * log for your Config Custom Policy rules.
     * </p>
     * 
     * @param lastDebugLogDeliveryStatusReason
     *        The reason Config was not able to deliver a debug log. This is for the last failed attempt to retrieve a
     *        debug log for your Config Custom Policy rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastDebugLogDeliveryStatusReason(String lastDebugLogDeliveryStatusReason) {
        setLastDebugLogDeliveryStatusReason(lastDebugLogDeliveryStatusReason);
        return this;
    }

    /**
     * <p>
     * The time Config last attempted to deliver a debug log for your Config Custom Policy rules.
     * </p>
     * 
     * @param lastDebugLogDeliveryTime
     *        The time Config last attempted to deliver a debug log for your Config Custom Policy rules.
     */

    public void setLastDebugLogDeliveryTime(java.util.Date lastDebugLogDeliveryTime) {
        this.lastDebugLogDeliveryTime = lastDebugLogDeliveryTime;
    }

    /**
     * <p>
     * The time Config last attempted to deliver a debug log for your Config Custom Policy rules.
     * </p>
     * 
     * @return The time Config last attempted to deliver a debug log for your Config Custom Policy rules.
     */

    public java.util.Date getLastDebugLogDeliveryTime() {
        return this.lastDebugLogDeliveryTime;
    }

    /**
     * <p>
     * The time Config last attempted to deliver a debug log for your Config Custom Policy rules.
     * </p>
     * 
     * @param lastDebugLogDeliveryTime
     *        The time Config last attempted to deliver a debug log for your Config Custom Policy rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleEvaluationStatus withLastDebugLogDeliveryTime(java.util.Date lastDebugLogDeliveryTime) {
        setLastDebugLogDeliveryTime(lastDebugLogDeliveryTime);
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
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: ").append(getConfigRuleName()).append(",");
        if (getConfigRuleArn() != null)
            sb.append("ConfigRuleArn: ").append(getConfigRuleArn()).append(",");
        if (getConfigRuleId() != null)
            sb.append("ConfigRuleId: ").append(getConfigRuleId()).append(",");
        if (getLastSuccessfulInvocationTime() != null)
            sb.append("LastSuccessfulInvocationTime: ").append(getLastSuccessfulInvocationTime()).append(",");
        if (getLastFailedInvocationTime() != null)
            sb.append("LastFailedInvocationTime: ").append(getLastFailedInvocationTime()).append(",");
        if (getLastSuccessfulEvaluationTime() != null)
            sb.append("LastSuccessfulEvaluationTime: ").append(getLastSuccessfulEvaluationTime()).append(",");
        if (getLastFailedEvaluationTime() != null)
            sb.append("LastFailedEvaluationTime: ").append(getLastFailedEvaluationTime()).append(",");
        if (getFirstActivatedTime() != null)
            sb.append("FirstActivatedTime: ").append(getFirstActivatedTime()).append(",");
        if (getLastDeactivatedTime() != null)
            sb.append("LastDeactivatedTime: ").append(getLastDeactivatedTime()).append(",");
        if (getLastErrorCode() != null)
            sb.append("LastErrorCode: ").append(getLastErrorCode()).append(",");
        if (getLastErrorMessage() != null)
            sb.append("LastErrorMessage: ").append(getLastErrorMessage()).append(",");
        if (getFirstEvaluationStarted() != null)
            sb.append("FirstEvaluationStarted: ").append(getFirstEvaluationStarted()).append(",");
        if (getLastDebugLogDeliveryStatus() != null)
            sb.append("LastDebugLogDeliveryStatus: ").append(getLastDebugLogDeliveryStatus()).append(",");
        if (getLastDebugLogDeliveryStatusReason() != null)
            sb.append("LastDebugLogDeliveryStatusReason: ").append(getLastDebugLogDeliveryStatusReason()).append(",");
        if (getLastDebugLogDeliveryTime() != null)
            sb.append("LastDebugLogDeliveryTime: ").append(getLastDebugLogDeliveryTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigRuleEvaluationStatus == false)
            return false;
        ConfigRuleEvaluationStatus other = (ConfigRuleEvaluationStatus) obj;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getConfigRuleArn() == null ^ this.getConfigRuleArn() == null)
            return false;
        if (other.getConfigRuleArn() != null && other.getConfigRuleArn().equals(this.getConfigRuleArn()) == false)
            return false;
        if (other.getConfigRuleId() == null ^ this.getConfigRuleId() == null)
            return false;
        if (other.getConfigRuleId() != null && other.getConfigRuleId().equals(this.getConfigRuleId()) == false)
            return false;
        if (other.getLastSuccessfulInvocationTime() == null ^ this.getLastSuccessfulInvocationTime() == null)
            return false;
        if (other.getLastSuccessfulInvocationTime() != null && other.getLastSuccessfulInvocationTime().equals(this.getLastSuccessfulInvocationTime()) == false)
            return false;
        if (other.getLastFailedInvocationTime() == null ^ this.getLastFailedInvocationTime() == null)
            return false;
        if (other.getLastFailedInvocationTime() != null && other.getLastFailedInvocationTime().equals(this.getLastFailedInvocationTime()) == false)
            return false;
        if (other.getLastSuccessfulEvaluationTime() == null ^ this.getLastSuccessfulEvaluationTime() == null)
            return false;
        if (other.getLastSuccessfulEvaluationTime() != null && other.getLastSuccessfulEvaluationTime().equals(this.getLastSuccessfulEvaluationTime()) == false)
            return false;
        if (other.getLastFailedEvaluationTime() == null ^ this.getLastFailedEvaluationTime() == null)
            return false;
        if (other.getLastFailedEvaluationTime() != null && other.getLastFailedEvaluationTime().equals(this.getLastFailedEvaluationTime()) == false)
            return false;
        if (other.getFirstActivatedTime() == null ^ this.getFirstActivatedTime() == null)
            return false;
        if (other.getFirstActivatedTime() != null && other.getFirstActivatedTime().equals(this.getFirstActivatedTime()) == false)
            return false;
        if (other.getLastDeactivatedTime() == null ^ this.getLastDeactivatedTime() == null)
            return false;
        if (other.getLastDeactivatedTime() != null && other.getLastDeactivatedTime().equals(this.getLastDeactivatedTime()) == false)
            return false;
        if (other.getLastErrorCode() == null ^ this.getLastErrorCode() == null)
            return false;
        if (other.getLastErrorCode() != null && other.getLastErrorCode().equals(this.getLastErrorCode()) == false)
            return false;
        if (other.getLastErrorMessage() == null ^ this.getLastErrorMessage() == null)
            return false;
        if (other.getLastErrorMessage() != null && other.getLastErrorMessage().equals(this.getLastErrorMessage()) == false)
            return false;
        if (other.getFirstEvaluationStarted() == null ^ this.getFirstEvaluationStarted() == null)
            return false;
        if (other.getFirstEvaluationStarted() != null && other.getFirstEvaluationStarted().equals(this.getFirstEvaluationStarted()) == false)
            return false;
        if (other.getLastDebugLogDeliveryStatus() == null ^ this.getLastDebugLogDeliveryStatus() == null)
            return false;
        if (other.getLastDebugLogDeliveryStatus() != null && other.getLastDebugLogDeliveryStatus().equals(this.getLastDebugLogDeliveryStatus()) == false)
            return false;
        if (other.getLastDebugLogDeliveryStatusReason() == null ^ this.getLastDebugLogDeliveryStatusReason() == null)
            return false;
        if (other.getLastDebugLogDeliveryStatusReason() != null
                && other.getLastDebugLogDeliveryStatusReason().equals(this.getLastDebugLogDeliveryStatusReason()) == false)
            return false;
        if (other.getLastDebugLogDeliveryTime() == null ^ this.getLastDebugLogDeliveryTime() == null)
            return false;
        if (other.getLastDebugLogDeliveryTime() != null && other.getLastDebugLogDeliveryTime().equals(this.getLastDebugLogDeliveryTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getConfigRuleArn() == null) ? 0 : getConfigRuleArn().hashCode());
        hashCode = prime * hashCode + ((getConfigRuleId() == null) ? 0 : getConfigRuleId().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulInvocationTime() == null) ? 0 : getLastSuccessfulInvocationTime().hashCode());
        hashCode = prime * hashCode + ((getLastFailedInvocationTime() == null) ? 0 : getLastFailedInvocationTime().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulEvaluationTime() == null) ? 0 : getLastSuccessfulEvaluationTime().hashCode());
        hashCode = prime * hashCode + ((getLastFailedEvaluationTime() == null) ? 0 : getLastFailedEvaluationTime().hashCode());
        hashCode = prime * hashCode + ((getFirstActivatedTime() == null) ? 0 : getFirstActivatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastDeactivatedTime() == null) ? 0 : getLastDeactivatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastErrorCode() == null) ? 0 : getLastErrorCode().hashCode());
        hashCode = prime * hashCode + ((getLastErrorMessage() == null) ? 0 : getLastErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getFirstEvaluationStarted() == null) ? 0 : getFirstEvaluationStarted().hashCode());
        hashCode = prime * hashCode + ((getLastDebugLogDeliveryStatus() == null) ? 0 : getLastDebugLogDeliveryStatus().hashCode());
        hashCode = prime * hashCode + ((getLastDebugLogDeliveryStatusReason() == null) ? 0 : getLastDebugLogDeliveryStatusReason().hashCode());
        hashCode = prime * hashCode + ((getLastDebugLogDeliveryTime() == null) ? 0 : getLastDebugLogDeliveryTime().hashCode());
        return hashCode;
    }

    @Override
    public ConfigRuleEvaluationStatus clone() {
        try {
            return (ConfigRuleEvaluationStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConfigRuleEvaluationStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
