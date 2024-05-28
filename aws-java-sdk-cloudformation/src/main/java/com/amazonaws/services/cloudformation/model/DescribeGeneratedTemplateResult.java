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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeGeneratedTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGeneratedTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * A list of objects describing the details of the resources in the template generation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceDetail> resources;
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
     * An object describing the progress of the template generation.
     * </p>
     */
    private TemplateProgress progress;
    /**
     * <p>
     * The stack ARN of the base stack if a base stack was provided when generating the template.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     * <code>UpdateReplacePolicy</code>.
     * </p>
     */
    private TemplateConfiguration templateConfiguration;
    /**
     * <p>
     * The number of warnings generated for this template. The warnings are found in the details of each of the
     * resources in the template.
     * </p>
     */
    private Integer totalWarnings;

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

    public DescribeGeneratedTemplateResult withGeneratedTemplateId(String generatedTemplateId) {
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

    public DescribeGeneratedTemplateResult withGeneratedTemplateName(String generatedTemplateName) {
        setGeneratedTemplateName(generatedTemplateName);
        return this;
    }

    /**
     * <p>
     * A list of objects describing the details of the resources in the template generation.
     * </p>
     * 
     * @return A list of objects describing the details of the resources in the template generation.
     */

    public java.util.List<ResourceDetail> getResources() {
        if (resources == null) {
            resources = new com.amazonaws.internal.SdkInternalList<ResourceDetail>();
        }
        return resources;
    }

    /**
     * <p>
     * A list of objects describing the details of the resources in the template generation.
     * </p>
     * 
     * @param resources
     *        A list of objects describing the details of the resources in the template generation.
     */

    public void setResources(java.util.Collection<ResourceDetail> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new com.amazonaws.internal.SdkInternalList<ResourceDetail>(resources);
    }

    /**
     * <p>
     * A list of objects describing the details of the resources in the template generation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        A list of objects describing the details of the resources in the template generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeneratedTemplateResult withResources(ResourceDetail... resources) {
        if (this.resources == null) {
            setResources(new com.amazonaws.internal.SdkInternalList<ResourceDetail>(resources.length));
        }
        for (ResourceDetail ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects describing the details of the resources in the template generation.
     * </p>
     * 
     * @param resources
     *        A list of objects describing the details of the resources in the template generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeneratedTemplateResult withResources(java.util.Collection<ResourceDetail> resources) {
        setResources(resources);
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

    public DescribeGeneratedTemplateResult withStatus(String status) {
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

    public DescribeGeneratedTemplateResult withStatus(GeneratedTemplateStatus status) {
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

    public DescribeGeneratedTemplateResult withStatusReason(String statusReason) {
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

    public DescribeGeneratedTemplateResult withCreationTime(java.util.Date creationTime) {
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

    public DescribeGeneratedTemplateResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * An object describing the progress of the template generation.
     * </p>
     * 
     * @param progress
     *        An object describing the progress of the template generation.
     */

    public void setProgress(TemplateProgress progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * An object describing the progress of the template generation.
     * </p>
     * 
     * @return An object describing the progress of the template generation.
     */

    public TemplateProgress getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * An object describing the progress of the template generation.
     * </p>
     * 
     * @param progress
     *        An object describing the progress of the template generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeneratedTemplateResult withProgress(TemplateProgress progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * The stack ARN of the base stack if a base stack was provided when generating the template.
     * </p>
     * 
     * @param stackId
     *        The stack ARN of the base stack if a base stack was provided when generating the template.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ARN of the base stack if a base stack was provided when generating the template.
     * </p>
     * 
     * @return The stack ARN of the base stack if a base stack was provided when generating the template.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ARN of the base stack if a base stack was provided when generating the template.
     * </p>
     * 
     * @param stackId
     *        The stack ARN of the base stack if a base stack was provided when generating the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeneratedTemplateResult withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     * <code>UpdateReplacePolicy</code>.
     * </p>
     * 
     * @param templateConfiguration
     *        The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     *        <code>UpdateReplacePolicy</code>.
     */

    public void setTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
    }

    /**
     * <p>
     * The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     * <code>UpdateReplacePolicy</code>.
     * </p>
     * 
     * @return The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     *         <code>UpdateReplacePolicy</code>.
     */

    public TemplateConfiguration getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    /**
     * <p>
     * The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     * <code>UpdateReplacePolicy</code>.
     * </p>
     * 
     * @param templateConfiguration
     *        The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     *        <code>UpdateReplacePolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeneratedTemplateResult withTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        setTemplateConfiguration(templateConfiguration);
        return this;
    }

    /**
     * <p>
     * The number of warnings generated for this template. The warnings are found in the details of each of the
     * resources in the template.
     * </p>
     * 
     * @param totalWarnings
     *        The number of warnings generated for this template. The warnings are found in the details of each of the
     *        resources in the template.
     */

    public void setTotalWarnings(Integer totalWarnings) {
        this.totalWarnings = totalWarnings;
    }

    /**
     * <p>
     * The number of warnings generated for this template. The warnings are found in the details of each of the
     * resources in the template.
     * </p>
     * 
     * @return The number of warnings generated for this template. The warnings are found in the details of each of the
     *         resources in the template.
     */

    public Integer getTotalWarnings() {
        return this.totalWarnings;
    }

    /**
     * <p>
     * The number of warnings generated for this template. The warnings are found in the details of each of the
     * resources in the template.
     * </p>
     * 
     * @param totalWarnings
     *        The number of warnings generated for this template. The warnings are found in the details of each of the
     *        resources in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeneratedTemplateResult withTotalWarnings(Integer totalWarnings) {
        setTotalWarnings(totalWarnings);
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
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getTemplateConfiguration() != null)
            sb.append("TemplateConfiguration: ").append(getTemplateConfiguration()).append(",");
        if (getTotalWarnings() != null)
            sb.append("TotalWarnings: ").append(getTotalWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGeneratedTemplateResult == false)
            return false;
        DescribeGeneratedTemplateResult other = (DescribeGeneratedTemplateResult) obj;
        if (other.getGeneratedTemplateId() == null ^ this.getGeneratedTemplateId() == null)
            return false;
        if (other.getGeneratedTemplateId() != null && other.getGeneratedTemplateId().equals(this.getGeneratedTemplateId()) == false)
            return false;
        if (other.getGeneratedTemplateName() == null ^ this.getGeneratedTemplateName() == null)
            return false;
        if (other.getGeneratedTemplateName() != null && other.getGeneratedTemplateName().equals(this.getGeneratedTemplateName()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
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
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getTemplateConfiguration() == null ^ this.getTemplateConfiguration() == null)
            return false;
        if (other.getTemplateConfiguration() != null && other.getTemplateConfiguration().equals(this.getTemplateConfiguration()) == false)
            return false;
        if (other.getTotalWarnings() == null ^ this.getTotalWarnings() == null)
            return false;
        if (other.getTotalWarnings() != null && other.getTotalWarnings().equals(this.getTotalWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeneratedTemplateId() == null) ? 0 : getGeneratedTemplateId().hashCode());
        hashCode = prime * hashCode + ((getGeneratedTemplateName() == null) ? 0 : getGeneratedTemplateName().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTotalWarnings() == null) ? 0 : getTotalWarnings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGeneratedTemplateResult clone() {
        try {
            return (DescribeGeneratedTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
