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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/UpdateStateMachine" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStateMachineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine.
     * </p>
     */
    private String stateMachineArn;
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
     * The Amazon Resource Name (ARN) of the IAM role of the state machine.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Use the <code>LoggingConfiguration</code> data type to set CloudWatch Logs options.
     * </p>
     */
    private LoggingConfiguration loggingConfiguration;
    /**
     * <p>
     * Selects whether X-Ray tracing is enabled.
     * </p>
     */
    private TracingConfiguration tracingConfiguration;
    /**
     * <p>
     * Specifies whether the state machine version is published. The default is <code>false</code>. To publish a version
     * after updating the state machine, set <code>publish</code> to <code>true</code>.
     * </p>
     */
    private Boolean publish;
    /**
     * <p>
     * An optional description of the state machine version to publish.
     * </p>
     * <p>
     * You can only specify the <code>versionDescription</code> parameter if you've set <code>publish</code> to
     * <code>true</code>.
     * </p>
     */
    private String versionDescription;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the state machine.
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the state machine.
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineRequest withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
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

    public UpdateStateMachineRequest withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role of the state machine.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role of the state machine.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role of the state machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role of the state machine.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role of the state machine.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role of the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Use the <code>LoggingConfiguration</code> data type to set CloudWatch Logs options.
     * </p>
     * 
     * @param loggingConfiguration
     *        Use the <code>LoggingConfiguration</code> data type to set CloudWatch Logs options.
     */

    public void setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * <p>
     * Use the <code>LoggingConfiguration</code> data type to set CloudWatch Logs options.
     * </p>
     * 
     * @return Use the <code>LoggingConfiguration</code> data type to set CloudWatch Logs options.
     */

    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * <p>
     * Use the <code>LoggingConfiguration</code> data type to set CloudWatch Logs options.
     * </p>
     * 
     * @param loggingConfiguration
     *        Use the <code>LoggingConfiguration</code> data type to set CloudWatch Logs options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineRequest withLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
        return this;
    }

    /**
     * <p>
     * Selects whether X-Ray tracing is enabled.
     * </p>
     * 
     * @param tracingConfiguration
     *        Selects whether X-Ray tracing is enabled.
     */

    public void setTracingConfiguration(TracingConfiguration tracingConfiguration) {
        this.tracingConfiguration = tracingConfiguration;
    }

    /**
     * <p>
     * Selects whether X-Ray tracing is enabled.
     * </p>
     * 
     * @return Selects whether X-Ray tracing is enabled.
     */

    public TracingConfiguration getTracingConfiguration() {
        return this.tracingConfiguration;
    }

    /**
     * <p>
     * Selects whether X-Ray tracing is enabled.
     * </p>
     * 
     * @param tracingConfiguration
     *        Selects whether X-Ray tracing is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineRequest withTracingConfiguration(TracingConfiguration tracingConfiguration) {
        setTracingConfiguration(tracingConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies whether the state machine version is published. The default is <code>false</code>. To publish a version
     * after updating the state machine, set <code>publish</code> to <code>true</code>.
     * </p>
     * 
     * @param publish
     *        Specifies whether the state machine version is published. The default is <code>false</code>. To publish a
     *        version after updating the state machine, set <code>publish</code> to <code>true</code>.
     */

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    /**
     * <p>
     * Specifies whether the state machine version is published. The default is <code>false</code>. To publish a version
     * after updating the state machine, set <code>publish</code> to <code>true</code>.
     * </p>
     * 
     * @return Specifies whether the state machine version is published. The default is <code>false</code>. To publish a
     *         version after updating the state machine, set <code>publish</code> to <code>true</code>.
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     * <p>
     * Specifies whether the state machine version is published. The default is <code>false</code>. To publish a version
     * after updating the state machine, set <code>publish</code> to <code>true</code>.
     * </p>
     * 
     * @param publish
     *        Specifies whether the state machine version is published. The default is <code>false</code>. To publish a
     *        version after updating the state machine, set <code>publish</code> to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineRequest withPublish(Boolean publish) {
        setPublish(publish);
        return this;
    }

    /**
     * <p>
     * Specifies whether the state machine version is published. The default is <code>false</code>. To publish a version
     * after updating the state machine, set <code>publish</code> to <code>true</code>.
     * </p>
     * 
     * @return Specifies whether the state machine version is published. The default is <code>false</code>. To publish a
     *         version after updating the state machine, set <code>publish</code> to <code>true</code>.
     */

    public Boolean isPublish() {
        return this.publish;
    }

    /**
     * <p>
     * An optional description of the state machine version to publish.
     * </p>
     * <p>
     * You can only specify the <code>versionDescription</code> parameter if you've set <code>publish</code> to
     * <code>true</code>.
     * </p>
     * 
     * @param versionDescription
     *        An optional description of the state machine version to publish.</p>
     *        <p>
     *        You can only specify the <code>versionDescription</code> parameter if you've set <code>publish</code> to
     *        <code>true</code>.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * An optional description of the state machine version to publish.
     * </p>
     * <p>
     * You can only specify the <code>versionDescription</code> parameter if you've set <code>publish</code> to
     * <code>true</code>.
     * </p>
     * 
     * @return An optional description of the state machine version to publish.</p>
     *         <p>
     *         You can only specify the <code>versionDescription</code> parameter if you've set <code>publish</code> to
     *         <code>true</code>.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * An optional description of the state machine version to publish.
     * </p>
     * <p>
     * You can only specify the <code>versionDescription</code> parameter if you've set <code>publish</code> to
     * <code>true</code>.
     * </p>
     * 
     * @param versionDescription
     *        An optional description of the state machine version to publish.</p>
     *        <p>
     *        You can only specify the <code>versionDescription</code> parameter if you've set <code>publish</code> to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineRequest withVersionDescription(String versionDescription) {
        setVersionDescription(versionDescription);
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
        if (getDefinition() != null)
            sb.append("Definition: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getLoggingConfiguration() != null)
            sb.append("LoggingConfiguration: ").append(getLoggingConfiguration()).append(",");
        if (getTracingConfiguration() != null)
            sb.append("TracingConfiguration: ").append(getTracingConfiguration()).append(",");
        if (getPublish() != null)
            sb.append("Publish: ").append(getPublish()).append(",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStateMachineRequest == false)
            return false;
        UpdateStateMachineRequest other = (UpdateStateMachineRequest) obj;
        if (other.getStateMachineArn() == null ^ this.getStateMachineArn() == null)
            return false;
        if (other.getStateMachineArn() != null && other.getStateMachineArn().equals(this.getStateMachineArn()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLoggingConfiguration() == null ^ this.getLoggingConfiguration() == null)
            return false;
        if (other.getLoggingConfiguration() != null && other.getLoggingConfiguration().equals(this.getLoggingConfiguration()) == false)
            return false;
        if (other.getTracingConfiguration() == null ^ this.getTracingConfiguration() == null)
            return false;
        if (other.getTracingConfiguration() != null && other.getTracingConfiguration().equals(this.getTracingConfiguration()) == false)
            return false;
        if (other.getPublish() == null ^ this.getPublish() == null)
            return false;
        if (other.getPublish() != null && other.getPublish().equals(this.getPublish()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfiguration() == null) ? 0 : getLoggingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTracingConfiguration() == null) ? 0 : getTracingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPublish() == null) ? 0 : getPublish().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStateMachineRequest clone() {
        return (UpdateStateMachineRequest) super.clone();
    }

}
