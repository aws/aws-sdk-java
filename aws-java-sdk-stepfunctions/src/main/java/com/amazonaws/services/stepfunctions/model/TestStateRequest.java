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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/TestState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestStateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     * States Language</a> (ASL) definition of the state.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role with the required IAM permissions for the state.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A string that contains the JSON input data for the state.
     * </p>
     */
    private String input;
    /**
     * <p>
     * Determines the values to return when a state is tested. You can specify one of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFO</code>: Shows the final state output. By default, Step Functions sets <code>inspectionLevel</code> to
     * <code>INFO</code> if you don't specify a level.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEBUG</code>: Shows the final state output along with the input and output data processing result.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRACE</code>: Shows the HTTP request and response for an HTTP Task. This level also shows the final state
     * output along with the input and output data processing result.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each of these levels also provide information about the status of the state execution and the next state to
     * transition to.
     * </p>
     */
    private String inspectionLevel;
    /**
     * <p>
     * Specifies whether or not to include secret information in the test result. For HTTP Tasks, a secret includes the
     * data that an EventBridge connection adds to modify the HTTP request headers, query parameters, and body. Step
     * Functions doesn't omit any information included in the state definition or the HTTP response.
     * </p>
     * <p>
     * If you set <code>revealSecrets</code> to <code>true</code>, you must make sure that the IAM user that calls the
     * <code>TestState</code> API has permission for the <code>states:RevealSecrets</code> action. For an example of IAM
     * policy that sets the <code>states:RevealSecrets</code> permission, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/test-state-isolation.html#test-state-permissions">IAM
     * permissions to test a state</a>. Without this permission, Step Functions throws an access denied error.
     * </p>
     * <p>
     * By default, <code>revealSecrets</code> is set to <code>false</code>.
     * </p>
     */
    private Boolean revealSecrets;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     * States Language</a> (ASL) definition of the state.
     * </p>
     * 
     * @param definition
     *        The <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *        States Language</a> (ASL) definition of the state.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     * States Language</a> (ASL) definition of the state.
     * </p>
     * 
     * @return The <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *         States Language</a> (ASL) definition of the state.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     * States Language</a> (ASL) definition of the state.
     * </p>
     * 
     * @param definition
     *        The <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *        States Language</a> (ASL) definition of the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestStateRequest withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role with the required IAM permissions for the state.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the execution role with the required IAM permissions for the state.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role with the required IAM permissions for the state.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the execution role with the required IAM permissions for the state.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution role with the required IAM permissions for the state.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the execution role with the required IAM permissions for the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestStateRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A string that contains the JSON input data for the state.
     * </p>
     * 
     * @param input
     *        A string that contains the JSON input data for the state.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * A string that contains the JSON input data for the state.
     * </p>
     * 
     * @return A string that contains the JSON input data for the state.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * A string that contains the JSON input data for the state.
     * </p>
     * 
     * @param input
     *        A string that contains the JSON input data for the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestStateRequest withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Determines the values to return when a state is tested. You can specify one of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFO</code>: Shows the final state output. By default, Step Functions sets <code>inspectionLevel</code> to
     * <code>INFO</code> if you don't specify a level.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEBUG</code>: Shows the final state output along with the input and output data processing result.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRACE</code>: Shows the HTTP request and response for an HTTP Task. This level also shows the final state
     * output along with the input and output data processing result.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each of these levels also provide information about the status of the state execution and the next state to
     * transition to.
     * </p>
     * 
     * @param inspectionLevel
     *        Determines the values to return when a state is tested. You can specify one of the following types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INFO</code>: Shows the final state output. By default, Step Functions sets
     *        <code>inspectionLevel</code> to <code>INFO</code> if you don't specify a level.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEBUG</code>: Shows the final state output along with the input and output data processing result.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRACE</code>: Shows the HTTP request and response for an HTTP Task. This level also shows the final
     *        state output along with the input and output data processing result.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Each of these levels also provide information about the status of the state execution and the next state
     *        to transition to.
     * @see InspectionLevel
     */

    public void setInspectionLevel(String inspectionLevel) {
        this.inspectionLevel = inspectionLevel;
    }

    /**
     * <p>
     * Determines the values to return when a state is tested. You can specify one of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFO</code>: Shows the final state output. By default, Step Functions sets <code>inspectionLevel</code> to
     * <code>INFO</code> if you don't specify a level.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEBUG</code>: Shows the final state output along with the input and output data processing result.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRACE</code>: Shows the HTTP request and response for an HTTP Task. This level also shows the final state
     * output along with the input and output data processing result.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each of these levels also provide information about the status of the state execution and the next state to
     * transition to.
     * </p>
     * 
     * @return Determines the values to return when a state is tested. You can specify one of the following types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INFO</code>: Shows the final state output. By default, Step Functions sets
     *         <code>inspectionLevel</code> to <code>INFO</code> if you don't specify a level.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEBUG</code>: Shows the final state output along with the input and output data processing result.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRACE</code>: Shows the HTTP request and response for an HTTP Task. This level also shows the final
     *         state output along with the input and output data processing result.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Each of these levels also provide information about the status of the state execution and the next state
     *         to transition to.
     * @see InspectionLevel
     */

    public String getInspectionLevel() {
        return this.inspectionLevel;
    }

    /**
     * <p>
     * Determines the values to return when a state is tested. You can specify one of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFO</code>: Shows the final state output. By default, Step Functions sets <code>inspectionLevel</code> to
     * <code>INFO</code> if you don't specify a level.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEBUG</code>: Shows the final state output along with the input and output data processing result.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRACE</code>: Shows the HTTP request and response for an HTTP Task. This level also shows the final state
     * output along with the input and output data processing result.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each of these levels also provide information about the status of the state execution and the next state to
     * transition to.
     * </p>
     * 
     * @param inspectionLevel
     *        Determines the values to return when a state is tested. You can specify one of the following types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INFO</code>: Shows the final state output. By default, Step Functions sets
     *        <code>inspectionLevel</code> to <code>INFO</code> if you don't specify a level.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEBUG</code>: Shows the final state output along with the input and output data processing result.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRACE</code>: Shows the HTTP request and response for an HTTP Task. This level also shows the final
     *        state output along with the input and output data processing result.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Each of these levels also provide information about the status of the state execution and the next state
     *        to transition to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InspectionLevel
     */

    public TestStateRequest withInspectionLevel(String inspectionLevel) {
        setInspectionLevel(inspectionLevel);
        return this;
    }

    /**
     * <p>
     * Determines the values to return when a state is tested. You can specify one of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INFO</code>: Shows the final state output. By default, Step Functions sets <code>inspectionLevel</code> to
     * <code>INFO</code> if you don't specify a level.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEBUG</code>: Shows the final state output along with the input and output data processing result.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRACE</code>: Shows the HTTP request and response for an HTTP Task. This level also shows the final state
     * output along with the input and output data processing result.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each of these levels also provide information about the status of the state execution and the next state to
     * transition to.
     * </p>
     * 
     * @param inspectionLevel
     *        Determines the values to return when a state is tested. You can specify one of the following types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INFO</code>: Shows the final state output. By default, Step Functions sets
     *        <code>inspectionLevel</code> to <code>INFO</code> if you don't specify a level.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEBUG</code>: Shows the final state output along with the input and output data processing result.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRACE</code>: Shows the HTTP request and response for an HTTP Task. This level also shows the final
     *        state output along with the input and output data processing result.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Each of these levels also provide information about the status of the state execution and the next state
     *        to transition to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InspectionLevel
     */

    public TestStateRequest withInspectionLevel(InspectionLevel inspectionLevel) {
        this.inspectionLevel = inspectionLevel.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether or not to include secret information in the test result. For HTTP Tasks, a secret includes the
     * data that an EventBridge connection adds to modify the HTTP request headers, query parameters, and body. Step
     * Functions doesn't omit any information included in the state definition or the HTTP response.
     * </p>
     * <p>
     * If you set <code>revealSecrets</code> to <code>true</code>, you must make sure that the IAM user that calls the
     * <code>TestState</code> API has permission for the <code>states:RevealSecrets</code> action. For an example of IAM
     * policy that sets the <code>states:RevealSecrets</code> permission, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/test-state-isolation.html#test-state-permissions">IAM
     * permissions to test a state</a>. Without this permission, Step Functions throws an access denied error.
     * </p>
     * <p>
     * By default, <code>revealSecrets</code> is set to <code>false</code>.
     * </p>
     * 
     * @param revealSecrets
     *        Specifies whether or not to include secret information in the test result. For HTTP Tasks, a secret
     *        includes the data that an EventBridge connection adds to modify the HTTP request headers, query
     *        parameters, and body. Step Functions doesn't omit any information included in the state definition or the
     *        HTTP response.</p>
     *        <p>
     *        If you set <code>revealSecrets</code> to <code>true</code>, you must make sure that the IAM user that
     *        calls the <code>TestState</code> API has permission for the <code>states:RevealSecrets</code> action. For
     *        an example of IAM policy that sets the <code>states:RevealSecrets</code> permission, see <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/test-state-isolation.html#test-state-permissions"
     *        >IAM permissions to test a state</a>. Without this permission, Step Functions throws an access denied
     *        error.
     *        </p>
     *        <p>
     *        By default, <code>revealSecrets</code> is set to <code>false</code>.
     */

    public void setRevealSecrets(Boolean revealSecrets) {
        this.revealSecrets = revealSecrets;
    }

    /**
     * <p>
     * Specifies whether or not to include secret information in the test result. For HTTP Tasks, a secret includes the
     * data that an EventBridge connection adds to modify the HTTP request headers, query parameters, and body. Step
     * Functions doesn't omit any information included in the state definition or the HTTP response.
     * </p>
     * <p>
     * If you set <code>revealSecrets</code> to <code>true</code>, you must make sure that the IAM user that calls the
     * <code>TestState</code> API has permission for the <code>states:RevealSecrets</code> action. For an example of IAM
     * policy that sets the <code>states:RevealSecrets</code> permission, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/test-state-isolation.html#test-state-permissions">IAM
     * permissions to test a state</a>. Without this permission, Step Functions throws an access denied error.
     * </p>
     * <p>
     * By default, <code>revealSecrets</code> is set to <code>false</code>.
     * </p>
     * 
     * @return Specifies whether or not to include secret information in the test result. For HTTP Tasks, a secret
     *         includes the data that an EventBridge connection adds to modify the HTTP request headers, query
     *         parameters, and body. Step Functions doesn't omit any information included in the state definition or the
     *         HTTP response.</p>
     *         <p>
     *         If you set <code>revealSecrets</code> to <code>true</code>, you must make sure that the IAM user that
     *         calls the <code>TestState</code> API has permission for the <code>states:RevealSecrets</code> action. For
     *         an example of IAM policy that sets the <code>states:RevealSecrets</code> permission, see <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/test-state-isolation.html#test-state-permissions"
     *         >IAM permissions to test a state</a>. Without this permission, Step Functions throws an access denied
     *         error.
     *         </p>
     *         <p>
     *         By default, <code>revealSecrets</code> is set to <code>false</code>.
     */

    public Boolean getRevealSecrets() {
        return this.revealSecrets;
    }

    /**
     * <p>
     * Specifies whether or not to include secret information in the test result. For HTTP Tasks, a secret includes the
     * data that an EventBridge connection adds to modify the HTTP request headers, query parameters, and body. Step
     * Functions doesn't omit any information included in the state definition or the HTTP response.
     * </p>
     * <p>
     * If you set <code>revealSecrets</code> to <code>true</code>, you must make sure that the IAM user that calls the
     * <code>TestState</code> API has permission for the <code>states:RevealSecrets</code> action. For an example of IAM
     * policy that sets the <code>states:RevealSecrets</code> permission, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/test-state-isolation.html#test-state-permissions">IAM
     * permissions to test a state</a>. Without this permission, Step Functions throws an access denied error.
     * </p>
     * <p>
     * By default, <code>revealSecrets</code> is set to <code>false</code>.
     * </p>
     * 
     * @param revealSecrets
     *        Specifies whether or not to include secret information in the test result. For HTTP Tasks, a secret
     *        includes the data that an EventBridge connection adds to modify the HTTP request headers, query
     *        parameters, and body. Step Functions doesn't omit any information included in the state definition or the
     *        HTTP response.</p>
     *        <p>
     *        If you set <code>revealSecrets</code> to <code>true</code>, you must make sure that the IAM user that
     *        calls the <code>TestState</code> API has permission for the <code>states:RevealSecrets</code> action. For
     *        an example of IAM policy that sets the <code>states:RevealSecrets</code> permission, see <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/test-state-isolation.html#test-state-permissions"
     *        >IAM permissions to test a state</a>. Without this permission, Step Functions throws an access denied
     *        error.
     *        </p>
     *        <p>
     *        By default, <code>revealSecrets</code> is set to <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestStateRequest withRevealSecrets(Boolean revealSecrets) {
        setRevealSecrets(revealSecrets);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not to include secret information in the test result. For HTTP Tasks, a secret includes the
     * data that an EventBridge connection adds to modify the HTTP request headers, query parameters, and body. Step
     * Functions doesn't omit any information included in the state definition or the HTTP response.
     * </p>
     * <p>
     * If you set <code>revealSecrets</code> to <code>true</code>, you must make sure that the IAM user that calls the
     * <code>TestState</code> API has permission for the <code>states:RevealSecrets</code> action. For an example of IAM
     * policy that sets the <code>states:RevealSecrets</code> permission, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/test-state-isolation.html#test-state-permissions">IAM
     * permissions to test a state</a>. Without this permission, Step Functions throws an access denied error.
     * </p>
     * <p>
     * By default, <code>revealSecrets</code> is set to <code>false</code>.
     * </p>
     * 
     * @return Specifies whether or not to include secret information in the test result. For HTTP Tasks, a secret
     *         includes the data that an EventBridge connection adds to modify the HTTP request headers, query
     *         parameters, and body. Step Functions doesn't omit any information included in the state definition or the
     *         HTTP response.</p>
     *         <p>
     *         If you set <code>revealSecrets</code> to <code>true</code>, you must make sure that the IAM user that
     *         calls the <code>TestState</code> API has permission for the <code>states:RevealSecrets</code> action. For
     *         an example of IAM policy that sets the <code>states:RevealSecrets</code> permission, see <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/test-state-isolation.html#test-state-permissions"
     *         >IAM permissions to test a state</a>. Without this permission, Step Functions throws an access denied
     *         error.
     *         </p>
     *         <p>
     *         By default, <code>revealSecrets</code> is set to <code>false</code>.
     */

    public Boolean isRevealSecrets() {
        return this.revealSecrets;
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
        if (getDefinition() != null)
            sb.append("Definition: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append("***Sensitive Data Redacted***").append(",");
        if (getInspectionLevel() != null)
            sb.append("InspectionLevel: ").append(getInspectionLevel()).append(",");
        if (getRevealSecrets() != null)
            sb.append("RevealSecrets: ").append(getRevealSecrets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestStateRequest == false)
            return false;
        TestStateRequest other = (TestStateRequest) obj;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getInspectionLevel() == null ^ this.getInspectionLevel() == null)
            return false;
        if (other.getInspectionLevel() != null && other.getInspectionLevel().equals(this.getInspectionLevel()) == false)
            return false;
        if (other.getRevealSecrets() == null ^ this.getRevealSecrets() == null)
            return false;
        if (other.getRevealSecrets() != null && other.getRevealSecrets().equals(this.getRevealSecrets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getInspectionLevel() == null) ? 0 : getInspectionLevel().hashCode());
        hashCode = prime * hashCode + ((getRevealSecrets() == null) ? 0 : getRevealSecrets().hashCode());
        return hashCode;
    }

    @Override
    public TestStateRequest clone() {
        return (TestStateRequest) super.clone();
    }

}
