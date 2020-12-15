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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartChangeRequestExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartChangeRequestExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time specified in the change request to run the Automation runbooks.
     * </p>
     * <note>
     * <p>
     * The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change
     * request have been received.
     * </p>
     * </note>
     */
    private java.util.Date scheduledTime;
    /**
     * <p>
     * The name of the change template document to run during the runbook workflow.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The version of the change template document to run during the runbook workflow.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * A key-value map of parameters that match the declared parameters in the change template document.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The name of the change request associated with the runbook workflow to be run.
     * </p>
     */
    private String changeRequestName;
    /**
     * <p>
     * The user-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and
     * can't be reused.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Information about the Automation runbooks (Automation documents) that are run during the runbook workflow.
     * </p>
     * <note>
     * <p>
     * The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change
     * request have been received.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Runbook> runbooks;
    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a maximum of five tags for a change request.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For
     * example, you might want to tag a change request to identify an environment or target AWS Region. In this case,
     * you could specify the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Region,Value=us-east-2</code>
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The date and time specified in the change request to run the Automation runbooks.
     * </p>
     * <note>
     * <p>
     * The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change
     * request have been received.
     * </p>
     * </note>
     * 
     * @param scheduledTime
     *        The date and time specified in the change request to run the Automation runbooks.</p> <note>
     *        <p>
     *        The Automation runbooks specified for the runbook workflow can't run until all required approvals for the
     *        change request have been received.
     *        </p>
     */

    public void setScheduledTime(java.util.Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    /**
     * <p>
     * The date and time specified in the change request to run the Automation runbooks.
     * </p>
     * <note>
     * <p>
     * The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change
     * request have been received.
     * </p>
     * </note>
     * 
     * @return The date and time specified in the change request to run the Automation runbooks.</p> <note>
     *         <p>
     *         The Automation runbooks specified for the runbook workflow can't run until all required approvals for the
     *         change request have been received.
     *         </p>
     */

    public java.util.Date getScheduledTime() {
        return this.scheduledTime;
    }

    /**
     * <p>
     * The date and time specified in the change request to run the Automation runbooks.
     * </p>
     * <note>
     * <p>
     * The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change
     * request have been received.
     * </p>
     * </note>
     * 
     * @param scheduledTime
     *        The date and time specified in the change request to run the Automation runbooks.</p> <note>
     *        <p>
     *        The Automation runbooks specified for the runbook workflow can't run until all required approvals for the
     *        change request have been received.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeRequestExecutionRequest withScheduledTime(java.util.Date scheduledTime) {
        setScheduledTime(scheduledTime);
        return this;
    }

    /**
     * <p>
     * The name of the change template document to run during the runbook workflow.
     * </p>
     * 
     * @param documentName
     *        The name of the change template document to run during the runbook workflow.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the change template document to run during the runbook workflow.
     * </p>
     * 
     * @return The name of the change template document to run during the runbook workflow.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The name of the change template document to run during the runbook workflow.
     * </p>
     * 
     * @param documentName
     *        The name of the change template document to run during the runbook workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeRequestExecutionRequest withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The version of the change template document to run during the runbook workflow.
     * </p>
     * 
     * @param documentVersion
     *        The version of the change template document to run during the runbook workflow.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the change template document to run during the runbook workflow.
     * </p>
     * 
     * @return The version of the change template document to run during the runbook workflow.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of the change template document to run during the runbook workflow.
     * </p>
     * 
     * @param documentVersion
     *        The version of the change template document to run during the runbook workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeRequestExecutionRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * A key-value map of parameters that match the declared parameters in the change template document.
     * </p>
     * 
     * @return A key-value map of parameters that match the declared parameters in the change template document.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A key-value map of parameters that match the declared parameters in the change template document.
     * </p>
     * 
     * @param parameters
     *        A key-value map of parameters that match the declared parameters in the change template document.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A key-value map of parameters that match the declared parameters in the change template document.
     * </p>
     * 
     * @param parameters
     *        A key-value map of parameters that match the declared parameters in the change template document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeRequestExecutionRequest withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see StartChangeRequestExecutionRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeRequestExecutionRequest addParametersEntry(String key, java.util.List<String> value) {
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

    public StartChangeRequestExecutionRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The name of the change request associated with the runbook workflow to be run.
     * </p>
     * 
     * @param changeRequestName
     *        The name of the change request associated with the runbook workflow to be run.
     */

    public void setChangeRequestName(String changeRequestName) {
        this.changeRequestName = changeRequestName;
    }

    /**
     * <p>
     * The name of the change request associated with the runbook workflow to be run.
     * </p>
     * 
     * @return The name of the change request associated with the runbook workflow to be run.
     */

    public String getChangeRequestName() {
        return this.changeRequestName;
    }

    /**
     * <p>
     * The name of the change request associated with the runbook workflow to be run.
     * </p>
     * 
     * @param changeRequestName
     *        The name of the change request associated with the runbook workflow to be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeRequestExecutionRequest withChangeRequestName(String changeRequestName) {
        setChangeRequestName(changeRequestName);
        return this;
    }

    /**
     * <p>
     * The user-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and
     * can't be reused.
     * </p>
     * 
     * @param clientToken
     *        The user-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID
     *        format, and can't be reused.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The user-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and
     * can't be reused.
     * </p>
     * 
     * @return The user-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID
     *         format, and can't be reused.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The user-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and
     * can't be reused.
     * </p>
     * 
     * @param clientToken
     *        The user-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID
     *        format, and can't be reused.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeRequestExecutionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Information about the Automation runbooks (Automation documents) that are run during the runbook workflow.
     * </p>
     * <note>
     * <p>
     * The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change
     * request have been received.
     * </p>
     * </note>
     * 
     * @return Information about the Automation runbooks (Automation documents) that are run during the runbook
     *         workflow.</p> <note>
     *         <p>
     *         The Automation runbooks specified for the runbook workflow can't run until all required approvals for the
     *         change request have been received.
     *         </p>
     */

    public java.util.List<Runbook> getRunbooks() {
        if (runbooks == null) {
            runbooks = new com.amazonaws.internal.SdkInternalList<Runbook>();
        }
        return runbooks;
    }

    /**
     * <p>
     * Information about the Automation runbooks (Automation documents) that are run during the runbook workflow.
     * </p>
     * <note>
     * <p>
     * The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change
     * request have been received.
     * </p>
     * </note>
     * 
     * @param runbooks
     *        Information about the Automation runbooks (Automation documents) that are run during the runbook
     *        workflow.</p> <note>
     *        <p>
     *        The Automation runbooks specified for the runbook workflow can't run until all required approvals for the
     *        change request have been received.
     *        </p>
     */

    public void setRunbooks(java.util.Collection<Runbook> runbooks) {
        if (runbooks == null) {
            this.runbooks = null;
            return;
        }

        this.runbooks = new com.amazonaws.internal.SdkInternalList<Runbook>(runbooks);
    }

    /**
     * <p>
     * Information about the Automation runbooks (Automation documents) that are run during the runbook workflow.
     * </p>
     * <note>
     * <p>
     * The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change
     * request have been received.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRunbooks(java.util.Collection)} or {@link #withRunbooks(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param runbooks
     *        Information about the Automation runbooks (Automation documents) that are run during the runbook
     *        workflow.</p> <note>
     *        <p>
     *        The Automation runbooks specified for the runbook workflow can't run until all required approvals for the
     *        change request have been received.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeRequestExecutionRequest withRunbooks(Runbook... runbooks) {
        if (this.runbooks == null) {
            setRunbooks(new com.amazonaws.internal.SdkInternalList<Runbook>(runbooks.length));
        }
        for (Runbook ele : runbooks) {
            this.runbooks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Automation runbooks (Automation documents) that are run during the runbook workflow.
     * </p>
     * <note>
     * <p>
     * The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change
     * request have been received.
     * </p>
     * </note>
     * 
     * @param runbooks
     *        Information about the Automation runbooks (Automation documents) that are run during the runbook
     *        workflow.</p> <note>
     *        <p>
     *        The Automation runbooks specified for the runbook workflow can't run until all required approvals for the
     *        change request have been received.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeRequestExecutionRequest withRunbooks(java.util.Collection<Runbook> runbooks) {
        setRunbooks(runbooks);
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a maximum of five tags for a change request.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For
     * example, you might want to tag a change request to identify an environment or target AWS Region. In this case,
     * you could specify the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Region,Value=us-east-2</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Optional metadata that you assign to a resource. You can specify a maximum of five tags for a change
     *         request. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     *         environment. For example, you might want to tag a change request to identify an environment or target AWS
     *         Region. In this case, you could specify the following key-value pairs:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key=Environment,Value=Production</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=Region,Value=us-east-2</code>
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a maximum of five tags for a change request.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For
     * example, you might want to tag a change request to identify an environment or target AWS Region. In this case,
     * you could specify the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Region,Value=us-east-2</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can specify a maximum of five tags for a change
     *        request. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     *        environment. For example, you might want to tag a change request to identify an environment or target AWS
     *        Region. In this case, you could specify the following key-value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=Environment,Value=Production</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=Region,Value=us-east-2</code>
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a maximum of five tags for a change request.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For
     * example, you might want to tag a change request to identify an environment or target AWS Region. In this case,
     * you could specify the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Region,Value=us-east-2</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can specify a maximum of five tags for a change
     *        request. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     *        environment. For example, you might want to tag a change request to identify an environment or target AWS
     *        Region. In this case, you could specify the following key-value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=Environment,Value=Production</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=Region,Value=us-east-2</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeRequestExecutionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a maximum of five tags for a change request.
     * Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For
     * example, you might want to tag a change request to identify an environment or target AWS Region. In this case,
     * you could specify the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Region,Value=us-east-2</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. You can specify a maximum of five tags for a change
     *        request. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or
     *        environment. For example, you might want to tag a change request to identify an environment or target AWS
     *        Region. In this case, you could specify the following key-value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=Environment,Value=Production</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=Region,Value=us-east-2</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeRequestExecutionRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getScheduledTime() != null)
            sb.append("ScheduledTime: ").append(getScheduledTime()).append(",");
        if (getDocumentName() != null)
            sb.append("DocumentName: ").append(getDocumentName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getChangeRequestName() != null)
            sb.append("ChangeRequestName: ").append(getChangeRequestName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getRunbooks() != null)
            sb.append("Runbooks: ").append(getRunbooks()).append(",");
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

        if (obj instanceof StartChangeRequestExecutionRequest == false)
            return false;
        StartChangeRequestExecutionRequest other = (StartChangeRequestExecutionRequest) obj;
        if (other.getScheduledTime() == null ^ this.getScheduledTime() == null)
            return false;
        if (other.getScheduledTime() != null && other.getScheduledTime().equals(this.getScheduledTime()) == false)
            return false;
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
        if (other.getChangeRequestName() == null ^ this.getChangeRequestName() == null)
            return false;
        if (other.getChangeRequestName() != null && other.getChangeRequestName().equals(this.getChangeRequestName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getRunbooks() == null ^ this.getRunbooks() == null)
            return false;
        if (other.getRunbooks() != null && other.getRunbooks().equals(this.getRunbooks()) == false)
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

        hashCode = prime * hashCode + ((getScheduledTime() == null) ? 0 : getScheduledTime().hashCode());
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getChangeRequestName() == null) ? 0 : getChangeRequestName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getRunbooks() == null) ? 0 : getRunbooks().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartChangeRequestExecutionRequest clone() {
        return (StartChangeRequestExecutionRequest) super.clone();
    }

}
