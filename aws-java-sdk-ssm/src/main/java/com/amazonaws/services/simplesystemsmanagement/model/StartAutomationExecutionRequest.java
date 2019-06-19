/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAutomationExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAutomationExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Automation document to use for this execution.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The version of the Automation document to use for this execution.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * A key-value map of execution parameters, which match the declared parameters in the Automation document.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * User-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and
     * can't be reused.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The execution mode of the automation. Valid modes include the following: Auto and Interactive. The default mode
     * is Auto.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The name of the parameter used as the target resource for the rate-controlled execution. Required if you specify
     * targets.
     * </p>
     */
    private String targetParameterName;
    /**
     * <p>
     * A key-value mapping to target resources. Required if you specify TargetParameterName.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be specified
     * together.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Map<String, java.util.List<String>>> targetMaps;
    /**
     * <p>
     * The maximum number of targets allowed to run this task in parallel. You can specify a number, such as 10, or a
     * percentage, such as 10%. The default value is 10.
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The number of errors that are allowed before the system stops running the automation on additional targets. You
     * can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example
     * 10%. If you specify 3, for example, the system stops running the automation when the fourth error is received. If
     * you specify 0, then the system stops running the automation on additional targets after the first error result is
     * returned. If you run an automation on 50 resources and set max-errors to 10%, then the system stops running the
     * automation on additional targets when the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an automation when max-errors is reached are allowed to complete, but some of
     * these executions may fail as well. If you need to ensure that there won't be more than max-errors failed
     * executions, set max-concurrency to 1 so the executions proceed one at a time.
     * </p>
     */
    private String maxErrors;
    /**
     * <p>
     * A location is a combination of AWS Regions and/or AWS accounts where you want to run the Automation. Use this
     * action to start an Automation in multiple Regions and multiple accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TargetLocation> targetLocations;

    /**
     * <p>
     * The name of the Automation document to use for this execution.
     * </p>
     * 
     * @param documentName
     *        The name of the Automation document to use for this execution.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the Automation document to use for this execution.
     * </p>
     * 
     * @return The name of the Automation document to use for this execution.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The name of the Automation document to use for this execution.
     * </p>
     * 
     * @param documentName
     *        The name of the Automation document to use for this execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The version of the Automation document to use for this execution.
     * </p>
     * 
     * @param documentVersion
     *        The version of the Automation document to use for this execution.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the Automation document to use for this execution.
     * </p>
     * 
     * @return The version of the Automation document to use for this execution.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of the Automation document to use for this execution.
     * </p>
     * 
     * @param documentVersion
     *        The version of the Automation document to use for this execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * A key-value map of execution parameters, which match the declared parameters in the Automation document.
     * </p>
     * 
     * @return A key-value map of execution parameters, which match the declared parameters in the Automation document.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A key-value map of execution parameters, which match the declared parameters in the Automation document.
     * </p>
     * 
     * @param parameters
     *        A key-value map of execution parameters, which match the declared parameters in the Automation document.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A key-value map of execution parameters, which match the declared parameters in the Automation document.
     * </p>
     * 
     * @param parameters
     *        A key-value map of execution parameters, which match the declared parameters in the Automation document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public StartAutomationExecutionRequest addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * User-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and
     * can't be reused.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format,
     *        and can't be reused.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and
     * can't be reused.
     * </p>
     * 
     * @return User-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format,
     *         and can't be reused.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and
     * can't be reused.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format,
     *        and can't be reused.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The execution mode of the automation. Valid modes include the following: Auto and Interactive. The default mode
     * is Auto.
     * </p>
     * 
     * @param mode
     *        The execution mode of the automation. Valid modes include the following: Auto and Interactive. The default
     *        mode is Auto.
     * @see ExecutionMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The execution mode of the automation. Valid modes include the following: Auto and Interactive. The default mode
     * is Auto.
     * </p>
     * 
     * @return The execution mode of the automation. Valid modes include the following: Auto and Interactive. The
     *         default mode is Auto.
     * @see ExecutionMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The execution mode of the automation. Valid modes include the following: Auto and Interactive. The default mode
     * is Auto.
     * </p>
     * 
     * @param mode
     *        The execution mode of the automation. Valid modes include the following: Auto and Interactive. The default
     *        mode is Auto.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionMode
     */

    public StartAutomationExecutionRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The execution mode of the automation. Valid modes include the following: Auto and Interactive. The default mode
     * is Auto.
     * </p>
     * 
     * @param mode
     *        The execution mode of the automation. Valid modes include the following: Auto and Interactive. The default
     *        mode is Auto.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionMode
     */

    public StartAutomationExecutionRequest withMode(ExecutionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The name of the parameter used as the target resource for the rate-controlled execution. Required if you specify
     * targets.
     * </p>
     * 
     * @param targetParameterName
     *        The name of the parameter used as the target resource for the rate-controlled execution. Required if you
     *        specify targets.
     */

    public void setTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
    }

    /**
     * <p>
     * The name of the parameter used as the target resource for the rate-controlled execution. Required if you specify
     * targets.
     * </p>
     * 
     * @return The name of the parameter used as the target resource for the rate-controlled execution. Required if you
     *         specify targets.
     */

    public String getTargetParameterName() {
        return this.targetParameterName;
    }

    /**
     * <p>
     * The name of the parameter used as the target resource for the rate-controlled execution. Required if you specify
     * targets.
     * </p>
     * 
     * @param targetParameterName
     *        The name of the parameter used as the target resource for the rate-controlled execution. Required if you
     *        specify targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withTargetParameterName(String targetParameterName) {
        setTargetParameterName(targetParameterName);
        return this;
    }

    /**
     * <p>
     * A key-value mapping to target resources. Required if you specify TargetParameterName.
     * </p>
     * 
     * @return A key-value mapping to target resources. Required if you specify TargetParameterName.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * A key-value mapping to target resources. Required if you specify TargetParameterName.
     * </p>
     * 
     * @param targets
     *        A key-value mapping to target resources. Required if you specify TargetParameterName.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new com.amazonaws.internal.SdkInternalList<Target>(targets);
    }

    /**
     * <p>
     * A key-value mapping to target resources. Required if you specify TargetParameterName.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        A key-value mapping to target resources. Required if you specify TargetParameterName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new com.amazonaws.internal.SdkInternalList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A key-value mapping to target resources. Required if you specify TargetParameterName.
     * </p>
     * 
     * @param targets
     *        A key-value mapping to target resources. Required if you specify TargetParameterName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be specified
     * together.
     * </p>
     * 
     * @return A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be
     *         specified together.
     */

    public java.util.List<java.util.Map<String, java.util.List<String>>> getTargetMaps() {
        if (targetMaps == null) {
            targetMaps = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, java.util.List<String>>>();
        }
        return targetMaps;
    }

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be specified
     * together.
     * </p>
     * 
     * @param targetMaps
     *        A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be
     *        specified together.
     */

    public void setTargetMaps(java.util.Collection<java.util.Map<String, java.util.List<String>>> targetMaps) {
        if (targetMaps == null) {
            this.targetMaps = null;
            return;
        }

        this.targetMaps = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, java.util.List<String>>>(targetMaps);
    }

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be specified
     * together.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetMaps(java.util.Collection)} or {@link #withTargetMaps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetMaps
     *        A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be
     *        specified together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withTargetMaps(java.util.Map<String, java.util.List<String>>... targetMaps) {
        if (this.targetMaps == null) {
            setTargetMaps(new com.amazonaws.internal.SdkInternalList<java.util.Map<String, java.util.List<String>>>(targetMaps.length));
        }
        for (java.util.Map<String, java.util.List<String>> ele : targetMaps) {
            this.targetMaps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be specified
     * together.
     * </p>
     * 
     * @param targetMaps
     *        A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be
     *        specified together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withTargetMaps(java.util.Collection<java.util.Map<String, java.util.List<String>>> targetMaps) {
        setTargetMaps(targetMaps);
        return this;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run this task in parallel. You can specify a number, such as 10, or a
     * percentage, such as 10%. The default value is 10.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of targets allowed to run this task in parallel. You can specify a number, such as 10,
     *        or a percentage, such as 10%. The default value is 10.
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run this task in parallel. You can specify a number, such as 10, or a
     * percentage, such as 10%. The default value is 10.
     * </p>
     * 
     * @return The maximum number of targets allowed to run this task in parallel. You can specify a number, such as 10,
     *         or a percentage, such as 10%. The default value is 10.
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run this task in parallel. You can specify a number, such as 10, or a
     * percentage, such as 10%. The default value is 10.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of targets allowed to run this task in parallel. You can specify a number, such as 10,
     *        or a percentage, such as 10%. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops running the automation on additional targets. You
     * can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example
     * 10%. If you specify 3, for example, the system stops running the automation when the fourth error is received. If
     * you specify 0, then the system stops running the automation on additional targets after the first error result is
     * returned. If you run an automation on 50 resources and set max-errors to 10%, then the system stops running the
     * automation on additional targets when the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an automation when max-errors is reached are allowed to complete, but some of
     * these executions may fail as well. If you need to ensure that there won't be more than max-errors failed
     * executions, set max-concurrency to 1 so the executions proceed one at a time.
     * </p>
     * 
     * @param maxErrors
     *        The number of errors that are allowed before the system stops running the automation on additional
     *        targets. You can specify either an absolute number of errors, for example 10, or a percentage of the
     *        target set, for example 10%. If you specify 3, for example, the system stops running the automation when
     *        the fourth error is received. If you specify 0, then the system stops running the automation on additional
     *        targets after the first error result is returned. If you run an automation on 50 resources and set
     *        max-errors to 10%, then the system stops running the automation on additional targets when the sixth error
     *        is received.</p>
     *        <p>
     *        Executions that are already running an automation when max-errors is reached are allowed to complete, but
     *        some of these executions may fail as well. If you need to ensure that there won't be more than max-errors
     *        failed executions, set max-concurrency to 1 so the executions proceed one at a time.
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops running the automation on additional targets. You
     * can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example
     * 10%. If you specify 3, for example, the system stops running the automation when the fourth error is received. If
     * you specify 0, then the system stops running the automation on additional targets after the first error result is
     * returned. If you run an automation on 50 resources and set max-errors to 10%, then the system stops running the
     * automation on additional targets when the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an automation when max-errors is reached are allowed to complete, but some of
     * these executions may fail as well. If you need to ensure that there won't be more than max-errors failed
     * executions, set max-concurrency to 1 so the executions proceed one at a time.
     * </p>
     * 
     * @return The number of errors that are allowed before the system stops running the automation on additional
     *         targets. You can specify either an absolute number of errors, for example 10, or a percentage of the
     *         target set, for example 10%. If you specify 3, for example, the system stops running the automation when
     *         the fourth error is received. If you specify 0, then the system stops running the automation on
     *         additional targets after the first error result is returned. If you run an automation on 50 resources and
     *         set max-errors to 10%, then the system stops running the automation on additional targets when the sixth
     *         error is received.</p>
     *         <p>
     *         Executions that are already running an automation when max-errors is reached are allowed to complete, but
     *         some of these executions may fail as well. If you need to ensure that there won't be more than max-errors
     *         failed executions, set max-concurrency to 1 so the executions proceed one at a time.
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops running the automation on additional targets. You
     * can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example
     * 10%. If you specify 3, for example, the system stops running the automation when the fourth error is received. If
     * you specify 0, then the system stops running the automation on additional targets after the first error result is
     * returned. If you run an automation on 50 resources and set max-errors to 10%, then the system stops running the
     * automation on additional targets when the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an automation when max-errors is reached are allowed to complete, but some of
     * these executions may fail as well. If you need to ensure that there won't be more than max-errors failed
     * executions, set max-concurrency to 1 so the executions proceed one at a time.
     * </p>
     * 
     * @param maxErrors
     *        The number of errors that are allowed before the system stops running the automation on additional
     *        targets. You can specify either an absolute number of errors, for example 10, or a percentage of the
     *        target set, for example 10%. If you specify 3, for example, the system stops running the automation when
     *        the fourth error is received. If you specify 0, then the system stops running the automation on additional
     *        targets after the first error result is returned. If you run an automation on 50 resources and set
     *        max-errors to 10%, then the system stops running the automation on additional targets when the sixth error
     *        is received.</p>
     *        <p>
     *        Executions that are already running an automation when max-errors is reached are allowed to complete, but
     *        some of these executions may fail as well. If you need to ensure that there won't be more than max-errors
     *        failed executions, set max-concurrency to 1 so the executions proceed one at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * A location is a combination of AWS Regions and/or AWS accounts where you want to run the Automation. Use this
     * action to start an Automation in multiple Regions and multiple accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return A location is a combination of AWS Regions and/or AWS accounts where you want to run the Automation. Use
     *         this action to start an Automation in multiple Regions and multiple accounts. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *         >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User
     *         Guide</i>.
     */

    public java.util.List<TargetLocation> getTargetLocations() {
        if (targetLocations == null) {
            targetLocations = new com.amazonaws.internal.SdkInternalList<TargetLocation>();
        }
        return targetLocations;
    }

    /**
     * <p>
     * A location is a combination of AWS Regions and/or AWS accounts where you want to run the Automation. Use this
     * action to start an Automation in multiple Regions and multiple accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param targetLocations
     *        A location is a combination of AWS Regions and/or AWS accounts where you want to run the Automation. Use
     *        this action to start an Automation in multiple Regions and multiple accounts. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *        >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     */

    public void setTargetLocations(java.util.Collection<TargetLocation> targetLocations) {
        if (targetLocations == null) {
            this.targetLocations = null;
            return;
        }

        this.targetLocations = new com.amazonaws.internal.SdkInternalList<TargetLocation>(targetLocations);
    }

    /**
     * <p>
     * A location is a combination of AWS Regions and/or AWS accounts where you want to run the Automation. Use this
     * action to start an Automation in multiple Regions and multiple accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetLocations(java.util.Collection)} or {@link #withTargetLocations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetLocations
     *        A location is a combination of AWS Regions and/or AWS accounts where you want to run the Automation. Use
     *        this action to start an Automation in multiple Regions and multiple accounts. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *        >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withTargetLocations(TargetLocation... targetLocations) {
        if (this.targetLocations == null) {
            setTargetLocations(new com.amazonaws.internal.SdkInternalList<TargetLocation>(targetLocations.length));
        }
        for (TargetLocation ele : targetLocations) {
            this.targetLocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A location is a combination of AWS Regions and/or AWS accounts where you want to run the Automation. Use this
     * action to start an Automation in multiple Regions and multiple accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param targetLocations
     *        A location is a combination of AWS Regions and/or AWS accounts where you want to run the Automation. Use
     *        this action to start an Automation in multiple Regions and multiple accounts. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *        >Executing Automations in Multiple AWS Regions and Accounts</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAutomationExecutionRequest withTargetLocations(java.util.Collection<TargetLocation> targetLocations) {
        setTargetLocations(targetLocations);
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
        if (getDocumentName() != null)
            sb.append("DocumentName: ").append(getDocumentName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getTargetParameterName() != null)
            sb.append("TargetParameterName: ").append(getTargetParameterName()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getTargetMaps() != null)
            sb.append("TargetMaps: ").append(getTargetMaps()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: ").append(getMaxErrors()).append(",");
        if (getTargetLocations() != null)
            sb.append("TargetLocations: ").append(getTargetLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAutomationExecutionRequest == false)
            return false;
        StartAutomationExecutionRequest other = (StartAutomationExecutionRequest) obj;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getTargetParameterName() == null ^ this.getTargetParameterName() == null)
            return false;
        if (other.getTargetParameterName() != null && other.getTargetParameterName().equals(this.getTargetParameterName()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTargetMaps() == null ^ this.getTargetMaps() == null)
            return false;
        if (other.getTargetMaps() != null && other.getTargetMaps().equals(this.getTargetMaps()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getTargetLocations() == null ^ this.getTargetLocations() == null)
            return false;
        if (other.getTargetLocations() != null && other.getTargetLocations().equals(this.getTargetLocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getTargetParameterName() == null) ? 0 : getTargetParameterName().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTargetMaps() == null) ? 0 : getTargetMaps().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getTargetLocations() == null) ? 0 : getTargetLocations().hashCode());
        return hashCode;
    }

    @Override
    public StartAutomationExecutionRequest clone() {
        return (StartAutomationExecutionRequest) super.clone();
    }

}
