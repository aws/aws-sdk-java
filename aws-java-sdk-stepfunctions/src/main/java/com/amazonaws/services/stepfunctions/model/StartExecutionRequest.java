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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StartExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine to execute.
     * </p>
     * <p>
     * The <code>stateMachineArn</code> parameter accepts one of the following inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>An unqualified state machine ARN</b> – Refers to a state machine ARN that isn't qualified with a version or
     * alias ARN. The following is an example of an unqualified state machine ARN.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;</code>
     * </p>
     * <p>
     * Step Functions doesn't associate state machine executions that you start with an unqualified ARN with a version.
     * This is true even if that version uses the same revision that the execution used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A state machine version ARN</b> – Refers to a version ARN, which is a combination of state machine ARN and the
     * version number separated by a colon (:). The following is an example of the ARN for version 10.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;:10</code>
     * </p>
     * <p>
     * Step Functions doesn't associate executions that you start with a version ARN with any aliases that point to that
     * version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A state machine alias ARN</b> – Refers to an alias ARN, which is a combination of state machine ARN and the
     * alias name separated by a colon (:). The following is an example of the ARN for an alias named <code>PROD</code>.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine:PROD&gt;</code>
     * </p>
     * <p>
     * Step Functions associates executions that you start with an alias ARN with that alias and the state machine
     * version used for that execution.
     * </p>
     * </li>
     * </ul>
     */
    private String stateMachineArn;
    /**
     * <p>
     * Optional name of the execution. This name must be unique for your Amazon Web Services account, Region, and state
     * machine for 90 days. For more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions">
     * Limits Related to State Machine Executions</a> in the <i>Step Functions Developer Guide</i>.
     * </p>
     * <p>
     * If you don't provide a name for the execution, Step Functions automatically generates a universally unique
     * identifier (UUID) as the execution name.
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
     * The string that contains the JSON input data for the execution, for example:
     * </p>
     * <p>
     * <code>"input": "{\"first_name\" : \"test\"}"</code>
     * </p>
     * <note>
     * <p>
     * If you don't include any JSON input data, you still must include the two braces, for example:
     * <code>"input": "{}"</code>
     * </p>
     * </note>
     * <p>
     * Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
     * </p>
     */
    private String input;
    /**
     * <p>
     * Passes the X-Ray trace header. The trace header can also be passed in the request payload.
     * </p>
     */
    private String traceHeader;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine to execute.
     * </p>
     * <p>
     * The <code>stateMachineArn</code> parameter accepts one of the following inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>An unqualified state machine ARN</b> – Refers to a state machine ARN that isn't qualified with a version or
     * alias ARN. The following is an example of an unqualified state machine ARN.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;</code>
     * </p>
     * <p>
     * Step Functions doesn't associate state machine executions that you start with an unqualified ARN with a version.
     * This is true even if that version uses the same revision that the execution used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A state machine version ARN</b> – Refers to a version ARN, which is a combination of state machine ARN and the
     * version number separated by a colon (:). The following is an example of the ARN for version 10.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;:10</code>
     * </p>
     * <p>
     * Step Functions doesn't associate executions that you start with a version ARN with any aliases that point to that
     * version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A state machine alias ARN</b> – Refers to an alias ARN, which is a combination of state machine ARN and the
     * alias name separated by a colon (:). The following is an example of the ARN for an alias named <code>PROD</code>.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine:PROD&gt;</code>
     * </p>
     * <p>
     * Step Functions associates executions that you start with an alias ARN with that alias and the state machine
     * version used for that execution.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the state machine to execute.</p>
     *        <p>
     *        The <code>stateMachineArn</code> parameter accepts one of the following inputs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>An unqualified state machine ARN</b> – Refers to a state machine ARN that isn't qualified with a
     *        version or alias ARN. The following is an example of an unqualified state machine ARN.
     *        </p>
     *        <p>
     *        <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;</code>
     *        </p>
     *        <p>
     *        Step Functions doesn't associate state machine executions that you start with an unqualified ARN with a
     *        version. This is true even if that version uses the same revision that the execution used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>A state machine version ARN</b> – Refers to a version ARN, which is a combination of state machine ARN
     *        and the version number separated by a colon (:). The following is an example of the ARN for version 10.
     *        </p>
     *        <p>
     *        <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;:10</code>
     *        </p>
     *        <p>
     *        Step Functions doesn't associate executions that you start with a version ARN with any aliases that point
     *        to that version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>A state machine alias ARN</b> – Refers to an alias ARN, which is a combination of state machine ARN and
     *        the alias name separated by a colon (:). The following is an example of the ARN for an alias named
     *        <code>PROD</code>.
     *        </p>
     *        <p>
     *        <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine:PROD&gt;</code>
     *        </p>
     *        <p>
     *        Step Functions associates executions that you start with an alias ARN with that alias and the state
     *        machine version used for that execution.
     *        </p>
     *        </li>
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine to execute.
     * </p>
     * <p>
     * The <code>stateMachineArn</code> parameter accepts one of the following inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>An unqualified state machine ARN</b> – Refers to a state machine ARN that isn't qualified with a version or
     * alias ARN. The following is an example of an unqualified state machine ARN.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;</code>
     * </p>
     * <p>
     * Step Functions doesn't associate state machine executions that you start with an unqualified ARN with a version.
     * This is true even if that version uses the same revision that the execution used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A state machine version ARN</b> – Refers to a version ARN, which is a combination of state machine ARN and the
     * version number separated by a colon (:). The following is an example of the ARN for version 10.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;:10</code>
     * </p>
     * <p>
     * Step Functions doesn't associate executions that you start with a version ARN with any aliases that point to that
     * version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A state machine alias ARN</b> – Refers to an alias ARN, which is a combination of state machine ARN and the
     * alias name separated by a colon (:). The following is an example of the ARN for an alias named <code>PROD</code>.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine:PROD&gt;</code>
     * </p>
     * <p>
     * Step Functions associates executions that you start with an alias ARN with that alias and the state machine
     * version used for that execution.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the state machine to execute.</p>
     *         <p>
     *         The <code>stateMachineArn</code> parameter accepts one of the following inputs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>An unqualified state machine ARN</b> – Refers to a state machine ARN that isn't qualified with a
     *         version or alias ARN. The following is an example of an unqualified state machine ARN.
     *         </p>
     *         <p>
     *         <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;</code>
     *         </p>
     *         <p>
     *         Step Functions doesn't associate state machine executions that you start with an unqualified ARN with a
     *         version. This is true even if that version uses the same revision that the execution used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>A state machine version ARN</b> – Refers to a version ARN, which is a combination of state machine ARN
     *         and the version number separated by a colon (:). The following is an example of the ARN for version 10.
     *         </p>
     *         <p>
     *         <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;:10</code>
     *         </p>
     *         <p>
     *         Step Functions doesn't associate executions that you start with a version ARN with any aliases that point
     *         to that version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>A state machine alias ARN</b> – Refers to an alias ARN, which is a combination of state machine ARN
     *         and the alias name separated by a colon (:). The following is an example of the ARN for an alias named
     *         <code>PROD</code>.
     *         </p>
     *         <p>
     *         <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine:PROD&gt;</code>
     *         </p>
     *         <p>
     *         Step Functions associates executions that you start with an alias ARN with that alias and the state
     *         machine version used for that execution.
     *         </p>
     *         </li>
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine to execute.
     * </p>
     * <p>
     * The <code>stateMachineArn</code> parameter accepts one of the following inputs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>An unqualified state machine ARN</b> – Refers to a state machine ARN that isn't qualified with a version or
     * alias ARN. The following is an example of an unqualified state machine ARN.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;</code>
     * </p>
     * <p>
     * Step Functions doesn't associate state machine executions that you start with an unqualified ARN with a version.
     * This is true even if that version uses the same revision that the execution used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A state machine version ARN</b> – Refers to a version ARN, which is a combination of state machine ARN and the
     * version number separated by a colon (:). The following is an example of the ARN for version 10.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;:10</code>
     * </p>
     * <p>
     * Step Functions doesn't associate executions that you start with a version ARN with any aliases that point to that
     * version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A state machine alias ARN</b> – Refers to an alias ARN, which is a combination of state machine ARN and the
     * alias name separated by a colon (:). The following is an example of the ARN for an alias named <code>PROD</code>.
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine:PROD&gt;</code>
     * </p>
     * <p>
     * Step Functions associates executions that you start with an alias ARN with that alias and the state machine
     * version used for that execution.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the state machine to execute.</p>
     *        <p>
     *        The <code>stateMachineArn</code> parameter accepts one of the following inputs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>An unqualified state machine ARN</b> – Refers to a state machine ARN that isn't qualified with a
     *        version or alias ARN. The following is an example of an unqualified state machine ARN.
     *        </p>
     *        <p>
     *        <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;</code>
     *        </p>
     *        <p>
     *        Step Functions doesn't associate state machine executions that you start with an unqualified ARN with a
     *        version. This is true even if that version uses the same revision that the execution used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>A state machine version ARN</b> – Refers to a version ARN, which is a combination of state machine ARN
     *        and the version number separated by a colon (:). The following is an example of the ARN for version 10.
     *        </p>
     *        <p>
     *        <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine&gt;:10</code>
     *        </p>
     *        <p>
     *        Step Functions doesn't associate executions that you start with a version ARN with any aliases that point
     *        to that version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>A state machine alias ARN</b> – Refers to an alias ARN, which is a combination of state machine ARN and
     *        the alias name separated by a colon (:). The following is an example of the ARN for an alias named
     *        <code>PROD</code>.
     *        </p>
     *        <p>
     *        <code>arn:&lt;partition&gt;:states:&lt;region&gt;:&lt;account-id&gt;:stateMachine:&lt;myStateMachine:PROD&gt;</code>
     *        </p>
     *        <p>
     *        Step Functions associates executions that you start with an alias ARN with that alias and the state
     *        machine version used for that execution.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExecutionRequest withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
        return this;
    }

    /**
     * <p>
     * Optional name of the execution. This name must be unique for your Amazon Web Services account, Region, and state
     * machine for 90 days. For more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions">
     * Limits Related to State Machine Executions</a> in the <i>Step Functions Developer Guide</i>.
     * </p>
     * <p>
     * If you don't provide a name for the execution, Step Functions automatically generates a universally unique
     * identifier (UUID) as the execution name.
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
     *        Optional name of the execution. This name must be unique for your Amazon Web Services account, Region, and
     *        state machine for 90 days. For more information, see <a href=
     *        "https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions"
     *        > Limits Related to State Machine Executions</a> in the <i>Step Functions Developer Guide</i>.</p>
     *        <p>
     *        If you don't provide a name for the execution, Step Functions automatically generates a universally unique
     *        identifier (UUID) as the execution name.
     *        </p>
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
     * Optional name of the execution. This name must be unique for your Amazon Web Services account, Region, and state
     * machine for 90 days. For more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions">
     * Limits Related to State Machine Executions</a> in the <i>Step Functions Developer Guide</i>.
     * </p>
     * <p>
     * If you don't provide a name for the execution, Step Functions automatically generates a universally unique
     * identifier (UUID) as the execution name.
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
     * @return Optional name of the execution. This name must be unique for your Amazon Web Services account, Region,
     *         and state machine for 90 days. For more information, see <a href=
     *         "https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions"
     *         > Limits Related to State Machine Executions</a> in the <i>Step Functions Developer Guide</i>.</p>
     *         <p>
     *         If you don't provide a name for the execution, Step Functions automatically generates a universally
     *         unique identifier (UUID) as the execution name.
     *         </p>
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
     * Optional name of the execution. This name must be unique for your Amazon Web Services account, Region, and state
     * machine for 90 days. For more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions">
     * Limits Related to State Machine Executions</a> in the <i>Step Functions Developer Guide</i>.
     * </p>
     * <p>
     * If you don't provide a name for the execution, Step Functions automatically generates a universally unique
     * identifier (UUID) as the execution name.
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
     *        Optional name of the execution. This name must be unique for your Amazon Web Services account, Region, and
     *        state machine for 90 days. For more information, see <a href=
     *        "https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions"
     *        > Limits Related to State Machine Executions</a> in the <i>Step Functions Developer Guide</i>.</p>
     *        <p>
     *        If you don't provide a name for the execution, Step Functions automatically generates a universally unique
     *        identifier (UUID) as the execution name.
     *        </p>
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

    public StartExecutionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The string that contains the JSON input data for the execution, for example:
     * </p>
     * <p>
     * <code>"input": "{\"first_name\" : \"test\"}"</code>
     * </p>
     * <note>
     * <p>
     * If you don't include any JSON input data, you still must include the two braces, for example:
     * <code>"input": "{}"</code>
     * </p>
     * </note>
     * <p>
     * Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
     * </p>
     * 
     * @param input
     *        The string that contains the JSON input data for the execution, for example:</p>
     *        <p>
     *        <code>"input": "{\"first_name\" : \"test\"}"</code>
     *        </p>
     *        <note>
     *        <p>
     *        If you don't include any JSON input data, you still must include the two braces, for example:
     *        <code>"input": "{}"</code>
     *        </p>
     *        </note>
     *        <p>
     *        Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The string that contains the JSON input data for the execution, for example:
     * </p>
     * <p>
     * <code>"input": "{\"first_name\" : \"test\"}"</code>
     * </p>
     * <note>
     * <p>
     * If you don't include any JSON input data, you still must include the two braces, for example:
     * <code>"input": "{}"</code>
     * </p>
     * </note>
     * <p>
     * Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
     * </p>
     * 
     * @return The string that contains the JSON input data for the execution, for example:</p>
     *         <p>
     *         <code>"input": "{\"first_name\" : \"test\"}"</code>
     *         </p>
     *         <note>
     *         <p>
     *         If you don't include any JSON input data, you still must include the two braces, for example:
     *         <code>"input": "{}"</code>
     *         </p>
     *         </note>
     *         <p>
     *         Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The string that contains the JSON input data for the execution, for example:
     * </p>
     * <p>
     * <code>"input": "{\"first_name\" : \"test\"}"</code>
     * </p>
     * <note>
     * <p>
     * If you don't include any JSON input data, you still must include the two braces, for example:
     * <code>"input": "{}"</code>
     * </p>
     * </note>
     * <p>
     * Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
     * </p>
     * 
     * @param input
     *        The string that contains the JSON input data for the execution, for example:</p>
     *        <p>
     *        <code>"input": "{\"first_name\" : \"test\"}"</code>
     *        </p>
     *        <note>
     *        <p>
     *        If you don't include any JSON input data, you still must include the two braces, for example:
     *        <code>"input": "{}"</code>
     *        </p>
     *        </note>
     *        <p>
     *        Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExecutionRequest withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Passes the X-Ray trace header. The trace header can also be passed in the request payload.
     * </p>
     * 
     * @param traceHeader
     *        Passes the X-Ray trace header. The trace header can also be passed in the request payload.
     */

    public void setTraceHeader(String traceHeader) {
        this.traceHeader = traceHeader;
    }

    /**
     * <p>
     * Passes the X-Ray trace header. The trace header can also be passed in the request payload.
     * </p>
     * 
     * @return Passes the X-Ray trace header. The trace header can also be passed in the request payload.
     */

    public String getTraceHeader() {
        return this.traceHeader;
    }

    /**
     * <p>
     * Passes the X-Ray trace header. The trace header can also be passed in the request payload.
     * </p>
     * 
     * @param traceHeader
     *        Passes the X-Ray trace header. The trace header can also be passed in the request payload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExecutionRequest withTraceHeader(String traceHeader) {
        setTraceHeader(traceHeader);
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
        if (getStateMachineArn() != null)
            sb.append("StateMachineArn: ").append(getStateMachineArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append("***Sensitive Data Redacted***").append(",");
        if (getTraceHeader() != null)
            sb.append("TraceHeader: ").append(getTraceHeader());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartExecutionRequest == false)
            return false;
        StartExecutionRequest other = (StartExecutionRequest) obj;
        if (other.getStateMachineArn() == null ^ this.getStateMachineArn() == null)
            return false;
        if (other.getStateMachineArn() != null && other.getStateMachineArn().equals(this.getStateMachineArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getTraceHeader() == null ^ this.getTraceHeader() == null)
            return false;
        if (other.getTraceHeader() != null && other.getTraceHeader().equals(this.getTraceHeader()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getTraceHeader() == null) ? 0 : getTraceHeader().hashCode());
        return hashCode;
    }

    @Override
    public StartExecutionRequest clone() {
        return (StartExecutionRequest) super.clone();
    }

}
