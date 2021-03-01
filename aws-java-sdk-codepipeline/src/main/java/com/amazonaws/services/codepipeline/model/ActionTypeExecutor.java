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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The action engine, or executor, for an action type created for a provider, where the action is to be used by
 * customers of the provider. The action engine is associated with the model used to create and update the action, such
 * as the Lambda integration model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionTypeExecutor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionTypeExecutor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action configuration properties for the action type. These properties are specified in the action definition
     * when the action type is created.
     * </p>
     */
    private ExecutorConfiguration configuration;
    /**
     * <p>
     * The integration model used to create and update the action type, <code>Lambda</code> or <code>JobWorker</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The policy statement that specifies the permissions in the CodePipeline customer’s account that are needed to
     * successfully run an action.
     * </p>
     * <p>
     * To grant permission to another account, specify the account ID as the Principal, a domain-style identifier
     * defined by the service, for example <code>codepipeline.amazonaws.com</code>.
     * </p>
     * <note>
     * <p>
     * The size of the passed JSON policy document cannot exceed 2048 characters.
     * </p>
     * </note>
     */
    private String policyStatementsTemplate;
    /**
     * <p>
     * The timeout in seconds for the job. An action execution can have multiple jobs. This is the timeout for a single
     * job, not the entire action execution.
     * </p>
     */
    private Integer jobTimeout;

    /**
     * <p>
     * The action configuration properties for the action type. These properties are specified in the action definition
     * when the action type is created.
     * </p>
     * 
     * @param configuration
     *        The action configuration properties for the action type. These properties are specified in the action
     *        definition when the action type is created.
     */

    public void setConfiguration(ExecutorConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The action configuration properties for the action type. These properties are specified in the action definition
     * when the action type is created.
     * </p>
     * 
     * @return The action configuration properties for the action type. These properties are specified in the action
     *         definition when the action type is created.
     */

    public ExecutorConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The action configuration properties for the action type. These properties are specified in the action definition
     * when the action type is created.
     * </p>
     * 
     * @param configuration
     *        The action configuration properties for the action type. These properties are specified in the action
     *        definition when the action type is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeExecutor withConfiguration(ExecutorConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The integration model used to create and update the action type, <code>Lambda</code> or <code>JobWorker</code>.
     * </p>
     * 
     * @param type
     *        The integration model used to create and update the action type, <code>Lambda</code> or
     *        <code>JobWorker</code>.
     * @see ExecutorType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The integration model used to create and update the action type, <code>Lambda</code> or <code>JobWorker</code>.
     * </p>
     * 
     * @return The integration model used to create and update the action type, <code>Lambda</code> or
     *         <code>JobWorker</code>.
     * @see ExecutorType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The integration model used to create and update the action type, <code>Lambda</code> or <code>JobWorker</code>.
     * </p>
     * 
     * @param type
     *        The integration model used to create and update the action type, <code>Lambda</code> or
     *        <code>JobWorker</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutorType
     */

    public ActionTypeExecutor withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The integration model used to create and update the action type, <code>Lambda</code> or <code>JobWorker</code>.
     * </p>
     * 
     * @param type
     *        The integration model used to create and update the action type, <code>Lambda</code> or
     *        <code>JobWorker</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutorType
     */

    public ActionTypeExecutor withType(ExecutorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The policy statement that specifies the permissions in the CodePipeline customer’s account that are needed to
     * successfully run an action.
     * </p>
     * <p>
     * To grant permission to another account, specify the account ID as the Principal, a domain-style identifier
     * defined by the service, for example <code>codepipeline.amazonaws.com</code>.
     * </p>
     * <note>
     * <p>
     * The size of the passed JSON policy document cannot exceed 2048 characters.
     * </p>
     * </note>
     * 
     * @param policyStatementsTemplate
     *        The policy statement that specifies the permissions in the CodePipeline customer’s account that are needed
     *        to successfully run an action.</p>
     *        <p>
     *        To grant permission to another account, specify the account ID as the Principal, a domain-style identifier
     *        defined by the service, for example <code>codepipeline.amazonaws.com</code>.
     *        </p>
     *        <note>
     *        <p>
     *        The size of the passed JSON policy document cannot exceed 2048 characters.
     *        </p>
     */

    public void setPolicyStatementsTemplate(String policyStatementsTemplate) {
        this.policyStatementsTemplate = policyStatementsTemplate;
    }

    /**
     * <p>
     * The policy statement that specifies the permissions in the CodePipeline customer’s account that are needed to
     * successfully run an action.
     * </p>
     * <p>
     * To grant permission to another account, specify the account ID as the Principal, a domain-style identifier
     * defined by the service, for example <code>codepipeline.amazonaws.com</code>.
     * </p>
     * <note>
     * <p>
     * The size of the passed JSON policy document cannot exceed 2048 characters.
     * </p>
     * </note>
     * 
     * @return The policy statement that specifies the permissions in the CodePipeline customer’s account that are
     *         needed to successfully run an action.</p>
     *         <p>
     *         To grant permission to another account, specify the account ID as the Principal, a domain-style
     *         identifier defined by the service, for example <code>codepipeline.amazonaws.com</code>.
     *         </p>
     *         <note>
     *         <p>
     *         The size of the passed JSON policy document cannot exceed 2048 characters.
     *         </p>
     */

    public String getPolicyStatementsTemplate() {
        return this.policyStatementsTemplate;
    }

    /**
     * <p>
     * The policy statement that specifies the permissions in the CodePipeline customer’s account that are needed to
     * successfully run an action.
     * </p>
     * <p>
     * To grant permission to another account, specify the account ID as the Principal, a domain-style identifier
     * defined by the service, for example <code>codepipeline.amazonaws.com</code>.
     * </p>
     * <note>
     * <p>
     * The size of the passed JSON policy document cannot exceed 2048 characters.
     * </p>
     * </note>
     * 
     * @param policyStatementsTemplate
     *        The policy statement that specifies the permissions in the CodePipeline customer’s account that are needed
     *        to successfully run an action.</p>
     *        <p>
     *        To grant permission to another account, specify the account ID as the Principal, a domain-style identifier
     *        defined by the service, for example <code>codepipeline.amazonaws.com</code>.
     *        </p>
     *        <note>
     *        <p>
     *        The size of the passed JSON policy document cannot exceed 2048 characters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeExecutor withPolicyStatementsTemplate(String policyStatementsTemplate) {
        setPolicyStatementsTemplate(policyStatementsTemplate);
        return this;
    }

    /**
     * <p>
     * The timeout in seconds for the job. An action execution can have multiple jobs. This is the timeout for a single
     * job, not the entire action execution.
     * </p>
     * 
     * @param jobTimeout
     *        The timeout in seconds for the job. An action execution can have multiple jobs. This is the timeout for a
     *        single job, not the entire action execution.
     */

    public void setJobTimeout(Integer jobTimeout) {
        this.jobTimeout = jobTimeout;
    }

    /**
     * <p>
     * The timeout in seconds for the job. An action execution can have multiple jobs. This is the timeout for a single
     * job, not the entire action execution.
     * </p>
     * 
     * @return The timeout in seconds for the job. An action execution can have multiple jobs. This is the timeout for a
     *         single job, not the entire action execution.
     */

    public Integer getJobTimeout() {
        return this.jobTimeout;
    }

    /**
     * <p>
     * The timeout in seconds for the job. An action execution can have multiple jobs. This is the timeout for a single
     * job, not the entire action execution.
     * </p>
     * 
     * @param jobTimeout
     *        The timeout in seconds for the job. An action execution can have multiple jobs. This is the timeout for a
     *        single job, not the entire action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeExecutor withJobTimeout(Integer jobTimeout) {
        setJobTimeout(jobTimeout);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPolicyStatementsTemplate() != null)
            sb.append("PolicyStatementsTemplate: ").append(getPolicyStatementsTemplate()).append(",");
        if (getJobTimeout() != null)
            sb.append("JobTimeout: ").append(getJobTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionTypeExecutor == false)
            return false;
        ActionTypeExecutor other = (ActionTypeExecutor) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPolicyStatementsTemplate() == null ^ this.getPolicyStatementsTemplate() == null)
            return false;
        if (other.getPolicyStatementsTemplate() != null && other.getPolicyStatementsTemplate().equals(this.getPolicyStatementsTemplate()) == false)
            return false;
        if (other.getJobTimeout() == null ^ this.getJobTimeout() == null)
            return false;
        if (other.getJobTimeout() != null && other.getJobTimeout().equals(this.getJobTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPolicyStatementsTemplate() == null) ? 0 : getPolicyStatementsTemplate().hashCode());
        hashCode = prime * hashCode + ((getJobTimeout() == null) ? 0 : getJobTimeout().hashCode());
        return hashCode;
    }

    @Override
    public ActionTypeExecutor clone() {
        try {
            return (ActionTypeExecutor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionTypeExecutorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
