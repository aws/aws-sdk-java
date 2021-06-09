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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The service detail data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/Service" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Service implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the code repository branch that holds the code that's deployed in AWS Proton.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * The time when the service was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A description of a service.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time when the service was last modified.
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * The name of the service.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The service pipeline detail data.
     * </p>
     */
    private ServicePipeline pipeline;
    /**
     * <p>
     * The ARN of the repository connection. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#setting-up-vcontrol">Set
     * up a repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1">Getting
     * started</a> in the <i>AWS Proton User Guide</i>.
     * </p>
     */
    private String repositoryConnectionArn;
    /**
     * <p>
     * The ID of the code repository.
     * </p>
     */
    private String repositoryId;
    /**
     * <p>
     * The formatted specification that defines the service.
     * </p>
     */
    private String spec;
    /**
     * <p>
     * The status of the service.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A service status message.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The name of the service template.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the code repository branch that holds the code that's deployed in AWS Proton.
     * </p>
     * 
     * @param branchName
     *        The name of the code repository branch that holds the code that's deployed in AWS Proton.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the code repository branch that holds the code that's deployed in AWS Proton.
     * </p>
     * 
     * @return The name of the code repository branch that holds the code that's deployed in AWS Proton.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name of the code repository branch that holds the code that's deployed in AWS Proton.
     * </p>
     * 
     * @param branchName
     *        The name of the code repository branch that holds the code that's deployed in AWS Proton.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * The time when the service was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the service was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the service was created.
     * </p>
     * 
     * @return The time when the service was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the service was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the service was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A description of a service.
     * </p>
     * 
     * @param description
     *        A description of a service.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of a service.
     * </p>
     * 
     * @return A description of a service.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of a service.
     * </p>
     * 
     * @param description
     *        A description of a service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time when the service was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The time when the service was last modified.
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * The time when the service was last modified.
     * </p>
     * 
     * @return The time when the service was last modified.
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * The time when the service was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The time when the service was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param name
     *        The name of the service.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @return The name of the service.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param name
     *        The name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The service pipeline detail data.
     * </p>
     * 
     * @param pipeline
     *        The service pipeline detail data.
     */

    public void setPipeline(ServicePipeline pipeline) {
        this.pipeline = pipeline;
    }

    /**
     * <p>
     * The service pipeline detail data.
     * </p>
     * 
     * @return The service pipeline detail data.
     */

    public ServicePipeline getPipeline() {
        return this.pipeline;
    }

    /**
     * <p>
     * The service pipeline detail data.
     * </p>
     * 
     * @param pipeline
     *        The service pipeline detail data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withPipeline(ServicePipeline pipeline) {
        setPipeline(pipeline);
        return this;
    }

    /**
     * <p>
     * The ARN of the repository connection. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#setting-up-vcontrol">Set
     * up a repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1">Getting
     * started</a> in the <i>AWS Proton User Guide</i>.
     * </p>
     * 
     * @param repositoryConnectionArn
     *        The ARN of the repository connection. For more information, see <a href=
     *        "https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#setting-up-vcontrol">Set
     *        up a repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1"
     *        >Getting started</a> in the <i>AWS Proton User Guide</i>.
     */

    public void setRepositoryConnectionArn(String repositoryConnectionArn) {
        this.repositoryConnectionArn = repositoryConnectionArn;
    }

    /**
     * <p>
     * The ARN of the repository connection. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#setting-up-vcontrol">Set
     * up a repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1">Getting
     * started</a> in the <i>AWS Proton User Guide</i>.
     * </p>
     * 
     * @return The ARN of the repository connection. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#setting-up-vcontrol"
     *         >Set up a repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a href=
     *         "https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1"
     *         >Getting started</a> in the <i>AWS Proton User Guide</i>.
     */

    public String getRepositoryConnectionArn() {
        return this.repositoryConnectionArn;
    }

    /**
     * <p>
     * The ARN of the repository connection. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#setting-up-vcontrol">Set
     * up a repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1">Getting
     * started</a> in the <i>AWS Proton User Guide</i>.
     * </p>
     * 
     * @param repositoryConnectionArn
     *        The ARN of the repository connection. For more information, see <a href=
     *        "https://docs.aws.amazon.com/proton/latest/adminguide/setting-up-for-service.html#setting-up-vcontrol">Set
     *        up a repository connection</a> in the <i>AWS Proton Administration Guide</i> and <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ug-getting-started.html#getting-started-step1"
     *        >Getting started</a> in the <i>AWS Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withRepositoryConnectionArn(String repositoryConnectionArn) {
        setRepositoryConnectionArn(repositoryConnectionArn);
        return this;
    }

    /**
     * <p>
     * The ID of the code repository.
     * </p>
     * 
     * @param repositoryId
     *        The ID of the code repository.
     */

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * <p>
     * The ID of the code repository.
     * </p>
     * 
     * @return The ID of the code repository.
     */

    public String getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * <p>
     * The ID of the code repository.
     * </p>
     * 
     * @param repositoryId
     *        The ID of the code repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withRepositoryId(String repositoryId) {
        setRepositoryId(repositoryId);
        return this;
    }

    /**
     * <p>
     * The formatted specification that defines the service.
     * </p>
     * 
     * @param spec
     *        The formatted specification that defines the service.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The formatted specification that defines the service.
     * </p>
     * 
     * @return The formatted specification that defines the service.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The formatted specification that defines the service.
     * </p>
     * 
     * @param spec
     *        The formatted specification that defines the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withSpec(String spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The status of the service.
     * </p>
     * 
     * @param status
     *        The status of the service.
     * @see ServiceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service.
     * </p>
     * 
     * @return The status of the service.
     * @see ServiceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the service.
     * </p>
     * 
     * @param status
     *        The status of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceStatus
     */

    public Service withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the service.
     * </p>
     * 
     * @param status
     *        The status of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceStatus
     */

    public Service withStatus(ServiceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A service status message.
     * </p>
     * 
     * @param statusMessage
     *        A service status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A service status message.
     * </p>
     * 
     * @return A service status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A service status message.
     * </p>
     * 
     * @param statusMessage
     *        A service status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The name of the service template.
     * </p>
     * 
     * @param templateName
     *        The name of the service template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the service template.
     * </p>
     * 
     * @return The name of the service template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the service template.
     * </p>
     * 
     * @param templateName
     *        The name of the service template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withTemplateName(String templateName) {
        setTemplateName(templateName);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPipeline() != null)
            sb.append("Pipeline: ").append(getPipeline()).append(",");
        if (getRepositoryConnectionArn() != null)
            sb.append("RepositoryConnectionArn: ").append(getRepositoryConnectionArn()).append(",");
        if (getRepositoryId() != null)
            sb.append("RepositoryId: ").append(getRepositoryId()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Service == false)
            return false;
        Service other = (Service) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPipeline() == null ^ this.getPipeline() == null)
            return false;
        if (other.getPipeline() != null && other.getPipeline().equals(this.getPipeline()) == false)
            return false;
        if (other.getRepositoryConnectionArn() == null ^ this.getRepositoryConnectionArn() == null)
            return false;
        if (other.getRepositoryConnectionArn() != null && other.getRepositoryConnectionArn().equals(this.getRepositoryConnectionArn()) == false)
            return false;
        if (other.getRepositoryId() == null ^ this.getRepositoryId() == null)
            return false;
        if (other.getRepositoryId() != null && other.getRepositoryId().equals(this.getRepositoryId()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPipeline() == null) ? 0 : getPipeline().hashCode());
        hashCode = prime * hashCode + ((getRepositoryConnectionArn() == null) ? 0 : getRepositoryConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getRepositoryId() == null) ? 0 : getRepositoryId().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public Service clone() {
        try {
            return (Service) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
