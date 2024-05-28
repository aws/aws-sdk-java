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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateTransformer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTransformerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the system-assigned unique identifier for the transformer.
     * </p>
     */
    private String transformerId;
    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     * partnership, profile, or transformer.
     * </p>
     */
    private String transformerArn;
    /**
     * <p>
     * Returns the name of the transformer.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Returns that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     */
    private String fileFormat;
    /**
     * <p>
     * Returns the mapping template for the transformer. This template is used to map the parsed EDI file using JSONata
     * or XSLT.
     * </p>
     */
    private String mappingTemplate;
    /**
     * <p>
     * Returns the state of the newly created transformer. The transformer can be either <code>active</code> or
     * <code>inactive</code>. For the transformer to be used in a capability, its status must <code>active</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     */
    private EdiType ediType;
    /**
     * <p>
     * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     * </p>
     */
    private String sampleDocument;
    /**
     * <p>
     * Returns a timestamp for creation date and time of the transformer.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Returns a timestamp for last time the transformer was modified.
     * </p>
     */
    private java.util.Date modifiedAt;

    /**
     * <p>
     * Returns the system-assigned unique identifier for the transformer.
     * </p>
     * 
     * @param transformerId
     *        Returns the system-assigned unique identifier for the transformer.
     */

    public void setTransformerId(String transformerId) {
        this.transformerId = transformerId;
    }

    /**
     * <p>
     * Returns the system-assigned unique identifier for the transformer.
     * </p>
     * 
     * @return Returns the system-assigned unique identifier for the transformer.
     */

    public String getTransformerId() {
        return this.transformerId;
    }

    /**
     * <p>
     * Returns the system-assigned unique identifier for the transformer.
     * </p>
     * 
     * @param transformerId
     *        Returns the system-assigned unique identifier for the transformer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerResult withTransformerId(String transformerId) {
        setTransformerId(transformerId);
        return this;
    }

    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     * partnership, profile, or transformer.
     * </p>
     * 
     * @param transformerArn
     *        Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     *        partnership, profile, or transformer.
     */

    public void setTransformerArn(String transformerArn) {
        this.transformerArn = transformerArn;
    }

    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     * partnership, profile, or transformer.
     * </p>
     * 
     * @return Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     *         partnership, profile, or transformer.
     */

    public String getTransformerArn() {
        return this.transformerArn;
    }

    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     * partnership, profile, or transformer.
     * </p>
     * 
     * @param transformerArn
     *        Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     *        partnership, profile, or transformer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerResult withTransformerArn(String transformerArn) {
        setTransformerArn(transformerArn);
        return this;
    }

    /**
     * <p>
     * Returns the name of the transformer.
     * </p>
     * 
     * @param name
     *        Returns the name of the transformer.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Returns the name of the transformer.
     * </p>
     * 
     * @return Returns the name of the transformer.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Returns the name of the transformer.
     * </p>
     * 
     * @param name
     *        Returns the name of the transformer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Returns that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     * 
     * @param fileFormat
     *        Returns that the currently supported file formats for EDI transformations are <code>JSON</code> and
     *        <code>XML</code>.
     * @see FileFormat
     */

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>
     * Returns that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     * 
     * @return Returns that the currently supported file formats for EDI transformations are <code>JSON</code> and
     *         <code>XML</code>.
     * @see FileFormat
     */

    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * <p>
     * Returns that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     * 
     * @param fileFormat
     *        Returns that the currently supported file formats for EDI transformations are <code>JSON</code> and
     *        <code>XML</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileFormat
     */

    public UpdateTransformerResult withFileFormat(String fileFormat) {
        setFileFormat(fileFormat);
        return this;
    }

    /**
     * <p>
     * Returns that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     * 
     * @param fileFormat
     *        Returns that the currently supported file formats for EDI transformations are <code>JSON</code> and
     *        <code>XML</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileFormat
     */

    public UpdateTransformerResult withFileFormat(FileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
        return this;
    }

    /**
     * <p>
     * Returns the mapping template for the transformer. This template is used to map the parsed EDI file using JSONata
     * or XSLT.
     * </p>
     * 
     * @param mappingTemplate
     *        Returns the mapping template for the transformer. This template is used to map the parsed EDI file using
     *        JSONata or XSLT.
     */

    public void setMappingTemplate(String mappingTemplate) {
        this.mappingTemplate = mappingTemplate;
    }

    /**
     * <p>
     * Returns the mapping template for the transformer. This template is used to map the parsed EDI file using JSONata
     * or XSLT.
     * </p>
     * 
     * @return Returns the mapping template for the transformer. This template is used to map the parsed EDI file using
     *         JSONata or XSLT.
     */

    public String getMappingTemplate() {
        return this.mappingTemplate;
    }

    /**
     * <p>
     * Returns the mapping template for the transformer. This template is used to map the parsed EDI file using JSONata
     * or XSLT.
     * </p>
     * 
     * @param mappingTemplate
     *        Returns the mapping template for the transformer. This template is used to map the parsed EDI file using
     *        JSONata or XSLT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerResult withMappingTemplate(String mappingTemplate) {
        setMappingTemplate(mappingTemplate);
        return this;
    }

    /**
     * <p>
     * Returns the state of the newly created transformer. The transformer can be either <code>active</code> or
     * <code>inactive</code>. For the transformer to be used in a capability, its status must <code>active</code>.
     * </p>
     * 
     * @param status
     *        Returns the state of the newly created transformer. The transformer can be either <code>active</code> or
     *        <code>inactive</code>. For the transformer to be used in a capability, its status must <code>active</code>
     *        .
     * @see TransformerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Returns the state of the newly created transformer. The transformer can be either <code>active</code> or
     * <code>inactive</code>. For the transformer to be used in a capability, its status must <code>active</code>.
     * </p>
     * 
     * @return Returns the state of the newly created transformer. The transformer can be either <code>active</code> or
     *         <code>inactive</code>. For the transformer to be used in a capability, its status must
     *         <code>active</code>.
     * @see TransformerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Returns the state of the newly created transformer. The transformer can be either <code>active</code> or
     * <code>inactive</code>. For the transformer to be used in a capability, its status must <code>active</code>.
     * </p>
     * 
     * @param status
     *        Returns the state of the newly created transformer. The transformer can be either <code>active</code> or
     *        <code>inactive</code>. For the transformer to be used in a capability, its status must <code>active</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformerStatus
     */

    public UpdateTransformerResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Returns the state of the newly created transformer. The transformer can be either <code>active</code> or
     * <code>inactive</code>. For the transformer to be used in a capability, its status must <code>active</code>.
     * </p>
     * 
     * @param status
     *        Returns the state of the newly created transformer. The transformer can be either <code>active</code> or
     *        <code>inactive</code>. For the transformer to be used in a capability, its status must <code>active</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformerStatus
     */

    public UpdateTransformerResult withStatus(TransformerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     * 
     * @param ediType
     *        Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     *        supported. X12 is a set of standards and corresponding messages that define specific business documents.
     */

    public void setEdiType(EdiType ediType) {
        this.ediType = ediType;
    }

    /**
     * <p>
     * Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     * 
     * @return Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     *         supported. X12 is a set of standards and corresponding messages that define specific business documents.
     */

    public EdiType getEdiType() {
        return this.ediType;
    }

    /**
     * <p>
     * Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     * 
     * @param ediType
     *        Returns the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     *        supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerResult withEdiType(EdiType ediType) {
        setEdiType(ediType);
        return this;
    }

    /**
     * <p>
     * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     * </p>
     * 
     * @param sampleDocument
     *        Returns a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     */

    public void setSampleDocument(String sampleDocument) {
        this.sampleDocument = sampleDocument;
    }

    /**
     * <p>
     * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     * </p>
     * 
     * @return Returns a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     */

    public String getSampleDocument() {
        return this.sampleDocument;
    }

    /**
     * <p>
     * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     * </p>
     * 
     * @param sampleDocument
     *        Returns a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerResult withSampleDocument(String sampleDocument) {
        setSampleDocument(sampleDocument);
        return this;
    }

    /**
     * <p>
     * Returns a timestamp for creation date and time of the transformer.
     * </p>
     * 
     * @param createdAt
     *        Returns a timestamp for creation date and time of the transformer.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Returns a timestamp for creation date and time of the transformer.
     * </p>
     * 
     * @return Returns a timestamp for creation date and time of the transformer.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Returns a timestamp for creation date and time of the transformer.
     * </p>
     * 
     * @param createdAt
     *        Returns a timestamp for creation date and time of the transformer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Returns a timestamp for last time the transformer was modified.
     * </p>
     * 
     * @param modifiedAt
     *        Returns a timestamp for last time the transformer was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * Returns a timestamp for last time the transformer was modified.
     * </p>
     * 
     * @return Returns a timestamp for last time the transformer was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * Returns a timestamp for last time the transformer was modified.
     * </p>
     * 
     * @param modifiedAt
     *        Returns a timestamp for last time the transformer was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerResult withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
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
        if (getTransformerId() != null)
            sb.append("TransformerId: ").append(getTransformerId()).append(",");
        if (getTransformerArn() != null)
            sb.append("TransformerArn: ").append(getTransformerArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFileFormat() != null)
            sb.append("FileFormat: ").append(getFileFormat()).append(",");
        if (getMappingTemplate() != null)
            sb.append("MappingTemplate: ").append(getMappingTemplate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEdiType() != null)
            sb.append("EdiType: ").append(getEdiType()).append(",");
        if (getSampleDocument() != null)
            sb.append("SampleDocument: ").append(getSampleDocument()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTransformerResult == false)
            return false;
        UpdateTransformerResult other = (UpdateTransformerResult) obj;
        if (other.getTransformerId() == null ^ this.getTransformerId() == null)
            return false;
        if (other.getTransformerId() != null && other.getTransformerId().equals(this.getTransformerId()) == false)
            return false;
        if (other.getTransformerArn() == null ^ this.getTransformerArn() == null)
            return false;
        if (other.getTransformerArn() != null && other.getTransformerArn().equals(this.getTransformerArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFileFormat() == null ^ this.getFileFormat() == null)
            return false;
        if (other.getFileFormat() != null && other.getFileFormat().equals(this.getFileFormat()) == false)
            return false;
        if (other.getMappingTemplate() == null ^ this.getMappingTemplate() == null)
            return false;
        if (other.getMappingTemplate() != null && other.getMappingTemplate().equals(this.getMappingTemplate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEdiType() == null ^ this.getEdiType() == null)
            return false;
        if (other.getEdiType() != null && other.getEdiType().equals(this.getEdiType()) == false)
            return false;
        if (other.getSampleDocument() == null ^ this.getSampleDocument() == null)
            return false;
        if (other.getSampleDocument() != null && other.getSampleDocument().equals(this.getSampleDocument()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformerId() == null) ? 0 : getTransformerId().hashCode());
        hashCode = prime * hashCode + ((getTransformerArn() == null) ? 0 : getTransformerArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        hashCode = prime * hashCode + ((getMappingTemplate() == null) ? 0 : getMappingTemplate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEdiType() == null) ? 0 : getEdiType().hashCode());
        hashCode = prime * hashCode + ((getSampleDocument() == null) ? 0 : getSampleDocument().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTransformerResult clone() {
        try {
            return (UpdateTransformerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
