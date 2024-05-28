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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Active Directory compatible certificate template. Connectors issue certificates against these templates based on
 * the requestor's Active Directory group membership.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/TemplateSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     */
    private String connectorArn;
    /**
     * <p>
     * The date and time that the template was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     */
    private TemplateDefinition definition;
    /**
     * <p>
     * Name of the template. The template name must be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Object identifier of a template.
     * </p>
     */
    private String objectIdentifier;
    /**
     * <p>
     * The template schema version. Template schema versions can be v2, v3, or v4. The template configuration options
     * change based on the template schema version.
     * </p>
     */
    private Integer policySchema;
    /**
     * <p>
     * The revision version of the template. Template updates will increment the minor revision. Re-enrolling all
     * certificate holders will increment the major revision.
     * </p>
     */
    private TemplateRevision revision;
    /**
     * <p>
     * Status of the template. Status can be creating, active, deleting, or failed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time that the template was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     *        >CreateTemplate</a>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a
     *         href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     *         >CreateTemplate</a>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     * >CreateTemplate</a>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplate.html"
     *        >CreateTemplate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     *        >CreateConnector</a>.
     */

    public void setConnectorArn(String connectorArn) {
        this.connectorArn = connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a
     *         href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     *         >CreateConnector</a>.
     */

    public String getConnectorArn() {
        return this.connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     * >CreateConnector</a>.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html"
     *        >CreateConnector</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withConnectorArn(String connectorArn) {
        setConnectorArn(connectorArn);
        return this;
    }

    /**
     * <p>
     * The date and time that the template was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the template was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the template was created.
     * </p>
     * 
     * @return The date and time that the template was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the template was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @param definition
     *        Template configuration to define the information included in certificates. Define certificate validity and
     *        renewal periods, certificate request handling and enrollment options, key usage extensions, application
     *        policies, and cryptography settings.
     */

    public void setDefinition(TemplateDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @return Template configuration to define the information included in certificates. Define certificate validity
     *         and renewal periods, certificate request handling and enrollment options, key usage extensions,
     *         application policies, and cryptography settings.
     */

    public TemplateDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @param definition
     *        Template configuration to define the information included in certificates. Define certificate validity and
     *        renewal periods, certificate request handling and enrollment options, key usage extensions, application
     *        policies, and cryptography settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withDefinition(TemplateDefinition definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * Name of the template. The template name must be unique.
     * </p>
     * 
     * @param name
     *        Name of the template. The template name must be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the template. The template name must be unique.
     * </p>
     * 
     * @return Name of the template. The template name must be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the template. The template name must be unique.
     * </p>
     * 
     * @param name
     *        Name of the template. The template name must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Object identifier of a template.
     * </p>
     * 
     * @param objectIdentifier
     *        Object identifier of a template.
     */

    public void setObjectIdentifier(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    /**
     * <p>
     * Object identifier of a template.
     * </p>
     * 
     * @return Object identifier of a template.
     */

    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * <p>
     * Object identifier of a template.
     * </p>
     * 
     * @param objectIdentifier
     *        Object identifier of a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withObjectIdentifier(String objectIdentifier) {
        setObjectIdentifier(objectIdentifier);
        return this;
    }

    /**
     * <p>
     * The template schema version. Template schema versions can be v2, v3, or v4. The template configuration options
     * change based on the template schema version.
     * </p>
     * 
     * @param policySchema
     *        The template schema version. Template schema versions can be v2, v3, or v4. The template configuration
     *        options change based on the template schema version.
     */

    public void setPolicySchema(Integer policySchema) {
        this.policySchema = policySchema;
    }

    /**
     * <p>
     * The template schema version. Template schema versions can be v2, v3, or v4. The template configuration options
     * change based on the template schema version.
     * </p>
     * 
     * @return The template schema version. Template schema versions can be v2, v3, or v4. The template configuration
     *         options change based on the template schema version.
     */

    public Integer getPolicySchema() {
        return this.policySchema;
    }

    /**
     * <p>
     * The template schema version. Template schema versions can be v2, v3, or v4. The template configuration options
     * change based on the template schema version.
     * </p>
     * 
     * @param policySchema
     *        The template schema version. Template schema versions can be v2, v3, or v4. The template configuration
     *        options change based on the template schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withPolicySchema(Integer policySchema) {
        setPolicySchema(policySchema);
        return this;
    }

    /**
     * <p>
     * The revision version of the template. Template updates will increment the minor revision. Re-enrolling all
     * certificate holders will increment the major revision.
     * </p>
     * 
     * @param revision
     *        The revision version of the template. Template updates will increment the minor revision. Re-enrolling all
     *        certificate holders will increment the major revision.
     */

    public void setRevision(TemplateRevision revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision version of the template. Template updates will increment the minor revision. Re-enrolling all
     * certificate holders will increment the major revision.
     * </p>
     * 
     * @return The revision version of the template. Template updates will increment the minor revision. Re-enrolling
     *         all certificate holders will increment the major revision.
     */

    public TemplateRevision getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision version of the template. Template updates will increment the minor revision. Re-enrolling all
     * certificate holders will increment the major revision.
     * </p>
     * 
     * @param revision
     *        The revision version of the template. Template updates will increment the minor revision. Re-enrolling all
     *        certificate holders will increment the major revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withRevision(TemplateRevision revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * Status of the template. Status can be creating, active, deleting, or failed.
     * </p>
     * 
     * @param status
     *        Status of the template. Status can be creating, active, deleting, or failed.
     * @see TemplateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the template. Status can be creating, active, deleting, or failed.
     * </p>
     * 
     * @return Status of the template. Status can be creating, active, deleting, or failed.
     * @see TemplateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the template. Status can be creating, active, deleting, or failed.
     * </p>
     * 
     * @param status
     *        Status of the template. Status can be creating, active, deleting, or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStatus
     */

    public TemplateSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the template. Status can be creating, active, deleting, or failed.
     * </p>
     * 
     * @param status
     *        Status of the template. Status can be creating, active, deleting, or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStatus
     */

    public TemplateSummary withStatus(TemplateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the template was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the template was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the template was updated.
     * </p>
     * 
     * @return The date and time that the template was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time that the template was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the template was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getConnectorArn() != null)
            sb.append("ConnectorArn: ").append(getConnectorArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getObjectIdentifier() != null)
            sb.append("ObjectIdentifier: ").append(getObjectIdentifier()).append(",");
        if (getPolicySchema() != null)
            sb.append("PolicySchema: ").append(getPolicySchema()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConnectorArn() == null ^ this.getConnectorArn() == null)
            return false;
        if (other.getConnectorArn() != null && other.getConnectorArn().equals(this.getConnectorArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getObjectIdentifier() == null ^ this.getObjectIdentifier() == null)
            return false;
        if (other.getObjectIdentifier() != null && other.getObjectIdentifier().equals(this.getObjectIdentifier()) == false)
            return false;
        if (other.getPolicySchema() == null ^ this.getPolicySchema() == null)
            return false;
        if (other.getPolicySchema() != null && other.getPolicySchema().equals(this.getPolicySchema()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConnectorArn() == null) ? 0 : getConnectorArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getObjectIdentifier() == null) ? 0 : getObjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPolicySchema() == null) ? 0 : getPolicySchema().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.TemplateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
