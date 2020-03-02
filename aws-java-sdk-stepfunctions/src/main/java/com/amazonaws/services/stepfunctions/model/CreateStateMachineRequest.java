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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CreateStateMachine" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStateMachineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Determines whether a Standard or Express state machine is created. The default is <code>STANDARD</code>. You
     * cannot update the <code>type</code> of a state machine once it has been created.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Defines what execution history events are logged and where they are logged.
     * </p>
     * <note>
     * <p>
     * By default, the <code>level</code> is set to <code>OFF</code>. For more information see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html">Log Levels</a> in the AWS
     * Step Functions User Guide.
     * </p>
     * </note>
     */
    private LoggingConfiguration loggingConfiguration;
    /**
     * <p>
     * Tags to be added when creating a state machine.
     * </p>
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>, and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html">Controlling Access Using IAM
     * Tags</a>.
     * </p>
     * <p>
     * Tags may only contain Unicode letters, digits, white space, or these symbols: <code>_ . : / = + - @</code>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     * 
     * @param name
     *        The name of the state machine. </p>
     *        <p>
     *        A name must <i>not</i> contain:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        white space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        brackets <code>&lt; &gt; { } [ ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        wildcard characters <code>? *</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     * 
     * @return The name of the state machine. </p>
     *         <p>
     *         A name must <i>not</i> contain:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         white space
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         brackets <code>&lt; &gt; { } [ ]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         wildcard characters <code>? *</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     * 
     * @param name
     *        The name of the state machine. </p>
     *        <p>
     *        A name must <i>not</i> contain:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        white space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        brackets <code>&lt; &gt; { } [ ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        wildcard characters <code>? *</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine. See <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *        States Language</a>.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     * 
     * @return The Amazon States Language definition of the state machine. See <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *         States Language</a>.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine. See <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *        States Language</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineRequest withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine. See <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *        States Language</a>.
     */
    public void setDefinition(com.amazonaws.services.stepfunctions.builder.StateMachine definition) {
        setDefinition(new com.amazonaws.services.stepfunctions.builder.StateMachineAdapter().adapt(definition));
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine. See <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *        States Language</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public CreateStateMachineRequest withDefinition(com.amazonaws.services.stepfunctions.builder.StateMachine definition) {
        setDefinition(new com.amazonaws.services.stepfunctions.builder.StateMachineAdapter().adapt(definition));
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Determines whether a Standard or Express state machine is created. The default is <code>STANDARD</code>. You
     * cannot update the <code>type</code> of a state machine once it has been created.
     * </p>
     * 
     * @param type
     *        Determines whether a Standard or Express state machine is created. The default is <code>STANDARD</code>.
     *        You cannot update the <code>type</code> of a state machine once it has been created.
     * @see StateMachineType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Determines whether a Standard or Express state machine is created. The default is <code>STANDARD</code>. You
     * cannot update the <code>type</code> of a state machine once it has been created.
     * </p>
     * 
     * @return Determines whether a Standard or Express state machine is created. The default is <code>STANDARD</code>.
     *         You cannot update the <code>type</code> of a state machine once it has been created.
     * @see StateMachineType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Determines whether a Standard or Express state machine is created. The default is <code>STANDARD</code>. You
     * cannot update the <code>type</code> of a state machine once it has been created.
     * </p>
     * 
     * @param type
     *        Determines whether a Standard or Express state machine is created. The default is <code>STANDARD</code>.
     *        You cannot update the <code>type</code> of a state machine once it has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateMachineType
     */

    public CreateStateMachineRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Determines whether a Standard or Express state machine is created. The default is <code>STANDARD</code>. You
     * cannot update the <code>type</code> of a state machine once it has been created.
     * </p>
     * 
     * @param type
     *        Determines whether a Standard or Express state machine is created. The default is <code>STANDARD</code>.
     *        You cannot update the <code>type</code> of a state machine once it has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateMachineType
     */

    public CreateStateMachineRequest withType(StateMachineType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Defines what execution history events are logged and where they are logged.
     * </p>
     * <note>
     * <p>
     * By default, the <code>level</code> is set to <code>OFF</code>. For more information see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html">Log Levels</a> in the AWS
     * Step Functions User Guide.
     * </p>
     * </note>
     * 
     * @param loggingConfiguration
     *        Defines what execution history events are logged and where they are logged.</p> <note>
     *        <p>
     *        By default, the <code>level</code> is set to <code>OFF</code>. For more information see <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html">Log Levels</a> in
     *        the AWS Step Functions User Guide.
     *        </p>
     */

    public void setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * <p>
     * Defines what execution history events are logged and where they are logged.
     * </p>
     * <note>
     * <p>
     * By default, the <code>level</code> is set to <code>OFF</code>. For more information see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html">Log Levels</a> in the AWS
     * Step Functions User Guide.
     * </p>
     * </note>
     * 
     * @return Defines what execution history events are logged and where they are logged.</p> <note>
     *         <p>
     *         By default, the <code>level</code> is set to <code>OFF</code>. For more information see <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html">Log Levels</a> in
     *         the AWS Step Functions User Guide.
     *         </p>
     */

    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * <p>
     * Defines what execution history events are logged and where they are logged.
     * </p>
     * <note>
     * <p>
     * By default, the <code>level</code> is set to <code>OFF</code>. For more information see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html">Log Levels</a> in the AWS
     * Step Functions User Guide.
     * </p>
     * </note>
     * 
     * @param loggingConfiguration
     *        Defines what execution history events are logged and where they are logged.</p> <note>
     *        <p>
     *        By default, the <code>level</code> is set to <code>OFF</code>. For more information see <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html">Log Levels</a> in
     *        the AWS Step Functions User Guide.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineRequest withLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
        return this;
    }

    /**
     * <p>
     * Tags to be added when creating a state machine.
     * </p>
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>, and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html">Controlling Access Using IAM
     * Tags</a>.
     * </p>
     * <p>
     * Tags may only contain Unicode letters, digits, white space, or these symbols: <code>_ . : / = + - @</code>.
     * </p>
     * 
     * @return Tags to be added when creating a state machine.</p>
     *         <p>
     *         An array of key-value pairs. For more information, see <a
     *         href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost
     *         Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>, and <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html">Controlling Access Using IAM
     *         Tags</a>.
     *         </p>
     *         <p>
     *         Tags may only contain Unicode letters, digits, white space, or these symbols:
     *         <code>_ . : / = + - @</code>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to be added when creating a state machine.
     * </p>
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>, and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html">Controlling Access Using IAM
     * Tags</a>.
     * </p>
     * <p>
     * Tags may only contain Unicode letters, digits, white space, or these symbols: <code>_ . : / = + - @</code>.
     * </p>
     * 
     * @param tags
     *        Tags to be added when creating a state machine.</p>
     *        <p>
     *        An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost
     *        Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>, and <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html">Controlling Access Using IAM
     *        Tags</a>.
     *        </p>
     *        <p>
     *        Tags may only contain Unicode letters, digits, white space, or these symbols: <code>_ . : / = + - @</code>.
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
     * Tags to be added when creating a state machine.
     * </p>
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>, and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html">Controlling Access Using IAM
     * Tags</a>.
     * </p>
     * <p>
     * Tags may only contain Unicode letters, digits, white space, or these symbols: <code>_ . : / = + - @</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to be added when creating a state machine.</p>
     *        <p>
     *        An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost
     *        Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>, and <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html">Controlling Access Using IAM
     *        Tags</a>.
     *        </p>
     *        <p>
     *        Tags may only contain Unicode letters, digits, white space, or these symbols: <code>_ . : / = + - @</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineRequest withTags(Tag... tags) {
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
     * Tags to be added when creating a state machine.
     * </p>
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>, and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html">Controlling Access Using IAM
     * Tags</a>.
     * </p>
     * <p>
     * Tags may only contain Unicode letters, digits, white space, or these symbols: <code>_ . : / = + - @</code>.
     * </p>
     * 
     * @param tags
     *        Tags to be added when creating a state machine.</p>
     *        <p>
     *        An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost
     *        Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>, and <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html">Controlling Access Using IAM
     *        Tags</a>.
     *        </p>
     *        <p>
     *        Tags may only contain Unicode letters, digits, white space, or these symbols: <code>_ . : / = + - @</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLoggingConfiguration() != null)
            sb.append("LoggingConfiguration: ").append(getLoggingConfiguration()).append(",");
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

        if (obj instanceof CreateStateMachineRequest == false)
            return false;
        CreateStateMachineRequest other = (CreateStateMachineRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLoggingConfiguration() == null ^ this.getLoggingConfiguration() == null)
            return false;
        if (other.getLoggingConfiguration() != null && other.getLoggingConfiguration().equals(this.getLoggingConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfiguration() == null) ? 0 : getLoggingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateStateMachineRequest clone() {
        return (CreateStateMachineRequest) super.clone();
    }

}
