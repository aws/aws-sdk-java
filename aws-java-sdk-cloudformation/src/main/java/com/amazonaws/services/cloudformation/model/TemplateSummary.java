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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The summary of a generated template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TemplateSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the generated template. The format is
     * <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     * <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     * .
     * </p>
     */
    private String generatedTemplateId;
    /**
     * <p>
     * The name of the generated template.
     * </p>
     */
    private String generatedTemplateName;
    /**
     * <p>
     * The status of the template generation. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatePending</code> - the creation of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateInProgress</code> - the creation of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletePending</code> - the deletion of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code> - the deletion of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdatePending</code> - the update of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - the update of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - the template operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Complete</code> - the template operation is complete.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The reason for the current template generation status. This will provide more details if a failure happened.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The time the generated template was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the generated template was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The number of resources in the generated template. This is a total of resources in pending, in-progress,
     * completed, and failed states.
     * </p>
     */
    private Integer numberOfResources;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the generated template. The format is
     * <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     * <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     * .
     * </p>
     * 
     * @param generatedTemplateId
     *        The Amazon Resource Name (ARN) of the generated template. The format is
     *        <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     *        <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     *        .
     */

    public void setGeneratedTemplateId(String generatedTemplateId) {
        this.generatedTemplateId = generatedTemplateId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the generated template. The format is
     * <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     * <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     * .
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the generated template. The format is
     *         <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     *         <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     *         .
     */

    public String getGeneratedTemplateId() {
        return this.generatedTemplateId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the generated template. The format is
     * <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     * <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     * .
     * </p>
     * 
     * @param generatedTemplateId
     *        The Amazon Resource Name (ARN) of the generated template. The format is
     *        <code>arn:${Partition}:cloudformation:${Region}:${Account}:generatedtemplate/${Id}</code>. For example,
     *        <code>arn:aws:cloudformation:<i>us-east-1</i>:<i>123456789012</i>:generatedtemplate/<i>2e8465c1-9a80-43ea-a3a3-4f2d692fe6dc</i> </code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withGeneratedTemplateId(String generatedTemplateId) {
        setGeneratedTemplateId(generatedTemplateId);
        return this;
    }

    /**
     * <p>
     * The name of the generated template.
     * </p>
     * 
     * @param generatedTemplateName
     *        The name of the generated template.
     */

    public void setGeneratedTemplateName(String generatedTemplateName) {
        this.generatedTemplateName = generatedTemplateName;
    }

    /**
     * <p>
     * The name of the generated template.
     * </p>
     * 
     * @return The name of the generated template.
     */

    public String getGeneratedTemplateName() {
        return this.generatedTemplateName;
    }

    /**
     * <p>
     * The name of the generated template.
     * </p>
     * 
     * @param generatedTemplateName
     *        The name of the generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withGeneratedTemplateName(String generatedTemplateName) {
        setGeneratedTemplateName(generatedTemplateName);
        return this;
    }

    /**
     * <p>
     * The status of the template generation. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatePending</code> - the creation of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateInProgress</code> - the creation of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletePending</code> - the deletion of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code> - the deletion of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdatePending</code> - the update of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - the update of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - the template operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Complete</code> - the template operation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the template generation. Supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreatePending</code> - the creation of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreateInProgress</code> - the creation of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeletePending</code> - the deletion of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteInProgress</code> - the deletion of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdatePending</code> - the update of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdateInProgress</code> - the update of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - the template operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Complete</code> - the template operation is complete.
     *        </p>
     *        </li>
     * @see GeneratedTemplateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the template generation. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatePending</code> - the creation of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateInProgress</code> - the creation of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletePending</code> - the deletion of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code> - the deletion of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdatePending</code> - the update of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - the update of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - the template operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Complete</code> - the template operation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the template generation. Supported values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CreatePending</code> - the creation of the template is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreateInProgress</code> - the creation of the template is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DeletePending</code> - the deletion of the template is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DeleteInProgress</code> - the deletion of the template is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UpdatePending</code> - the update of the template is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UpdateInProgress</code> - the update of the template is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - the template operation failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Complete</code> - the template operation is complete.
     *         </p>
     *         </li>
     * @see GeneratedTemplateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the template generation. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatePending</code> - the creation of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateInProgress</code> - the creation of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletePending</code> - the deletion of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code> - the deletion of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdatePending</code> - the update of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - the update of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - the template operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Complete</code> - the template operation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the template generation. Supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreatePending</code> - the creation of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreateInProgress</code> - the creation of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeletePending</code> - the deletion of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteInProgress</code> - the deletion of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdatePending</code> - the update of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdateInProgress</code> - the update of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - the template operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Complete</code> - the template operation is complete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedTemplateStatus
     */

    public TemplateSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the template generation. Supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreatePending</code> - the creation of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateInProgress</code> - the creation of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletePending</code> - the deletion of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteInProgress</code> - the deletion of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdatePending</code> - the update of the template is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - the update of the template is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - the template operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Complete</code> - the template operation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the template generation. Supported values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CreatePending</code> - the creation of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreateInProgress</code> - the creation of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeletePending</code> - the deletion of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeleteInProgress</code> - the deletion of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdatePending</code> - the update of the template is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdateInProgress</code> - the update of the template is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - the template operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Complete</code> - the template operation is complete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedTemplateStatus
     */

    public TemplateSummary withStatus(GeneratedTemplateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the current template generation status. This will provide more details if a failure happened.
     * </p>
     * 
     * @param statusReason
     *        The reason for the current template generation status. This will provide more details if a failure
     *        happened.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the current template generation status. This will provide more details if a failure happened.
     * </p>
     * 
     * @return The reason for the current template generation status. This will provide more details if a failure
     *         happened.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the current template generation status. This will provide more details if a failure happened.
     * </p>
     * 
     * @param statusReason
     *        The reason for the current template generation status. This will provide more details if a failure
     *        happened.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The time the generated template was created.
     * </p>
     * 
     * @param creationTime
     *        The time the generated template was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the generated template was created.
     * </p>
     * 
     * @return The time the generated template was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the generated template was created.
     * </p>
     * 
     * @param creationTime
     *        The time the generated template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the generated template was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time the generated template was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time the generated template was last updated.
     * </p>
     * 
     * @return The time the generated template was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time the generated template was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time the generated template was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The number of resources in the generated template. This is a total of resources in pending, in-progress,
     * completed, and failed states.
     * </p>
     * 
     * @param numberOfResources
     *        The number of resources in the generated template. This is a total of resources in pending, in-progress,
     *        completed, and failed states.
     */

    public void setNumberOfResources(Integer numberOfResources) {
        this.numberOfResources = numberOfResources;
    }

    /**
     * <p>
     * The number of resources in the generated template. This is a total of resources in pending, in-progress,
     * completed, and failed states.
     * </p>
     * 
     * @return The number of resources in the generated template. This is a total of resources in pending, in-progress,
     *         completed, and failed states.
     */

    public Integer getNumberOfResources() {
        return this.numberOfResources;
    }

    /**
     * <p>
     * The number of resources in the generated template. This is a total of resources in pending, in-progress,
     * completed, and failed states.
     * </p>
     * 
     * @param numberOfResources
     *        The number of resources in the generated template. This is a total of resources in pending, in-progress,
     *        completed, and failed states.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withNumberOfResources(Integer numberOfResources) {
        setNumberOfResources(numberOfResources);
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
        if (getGeneratedTemplateId() != null)
            sb.append("GeneratedTemplateId: ").append(getGeneratedTemplateId()).append(",");
        if (getGeneratedTemplateName() != null)
            sb.append("GeneratedTemplateName: ").append(getGeneratedTemplateName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getNumberOfResources() != null)
            sb.append("NumberOfResources: ").append(getNumberOfResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateSummary == false)
            return false;
        TemplateSummary other = (TemplateSummary) obj;
        if (other.getGeneratedTemplateId() == null ^ this.getGeneratedTemplateId() == null)
            return false;
        if (other.getGeneratedTemplateId() != null && other.getGeneratedTemplateId().equals(this.getGeneratedTemplateId()) == false)
            return false;
        if (other.getGeneratedTemplateName() == null ^ this.getGeneratedTemplateName() == null)
            return false;
        if (other.getGeneratedTemplateName() != null && other.getGeneratedTemplateName().equals(this.getGeneratedTemplateName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getNumberOfResources() == null ^ this.getNumberOfResources() == null)
            return false;
        if (other.getNumberOfResources() != null && other.getNumberOfResources().equals(this.getNumberOfResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeneratedTemplateId() == null) ? 0 : getGeneratedTemplateId().hashCode());
        hashCode = prime * hashCode + ((getGeneratedTemplateName() == null) ? 0 : getGeneratedTemplateName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getNumberOfResources() == null) ? 0 : getNumberOfResources().hashCode());
        return hashCode;
    }

    @Override
    public TemplateSummary clone() {
        try {
            return (TemplateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
