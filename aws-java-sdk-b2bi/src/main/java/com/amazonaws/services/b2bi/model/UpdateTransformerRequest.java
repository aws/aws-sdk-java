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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateTransformer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTransformerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the system-assigned unique identifier for the transformer.
     * </p>
     */
    private String transformerId;
    /**
     * <p>
     * Specify a new name for the transformer, if you want to update it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     */
    private String fileFormat;
    /**
     * <p>
     * Specifies the mapping template for the transformer. This template is used to map the parsed EDI file using
     * JSONata or XSLT.
     * </p>
     */
    private String mappingTemplate;
    /**
     * <p>
     * Specifies the transformer's status. You can update the state of the transformer, from <code>active</code> to
     * <code>inactive</code>, or <code>inactive</code> to <code>active</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     */
    private EdiType ediType;
    /**
     * <p>
     * Specifies a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     * </p>
     */
    private String sampleDocument;

    /**
     * <p>
     * Specifies the system-assigned unique identifier for the transformer.
     * </p>
     * 
     * @param transformerId
     *        Specifies the system-assigned unique identifier for the transformer.
     */

    public void setTransformerId(String transformerId) {
        this.transformerId = transformerId;
    }

    /**
     * <p>
     * Specifies the system-assigned unique identifier for the transformer.
     * </p>
     * 
     * @return Specifies the system-assigned unique identifier for the transformer.
     */

    public String getTransformerId() {
        return this.transformerId;
    }

    /**
     * <p>
     * Specifies the system-assigned unique identifier for the transformer.
     * </p>
     * 
     * @param transformerId
     *        Specifies the system-assigned unique identifier for the transformer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerRequest withTransformerId(String transformerId) {
        setTransformerId(transformerId);
        return this;
    }

    /**
     * <p>
     * Specify a new name for the transformer, if you want to update it.
     * </p>
     * 
     * @param name
     *        Specify a new name for the transformer, if you want to update it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specify a new name for the transformer, if you want to update it.
     * </p>
     * 
     * @return Specify a new name for the transformer, if you want to update it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specify a new name for the transformer, if you want to update it.
     * </p>
     * 
     * @param name
     *        Specify a new name for the transformer, if you want to update it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     * 
     * @param fileFormat
     *        Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     *        <code>XML</code>.
     * @see FileFormat
     */

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>
     * Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     * 
     * @return Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     *         <code>XML</code>.
     * @see FileFormat
     */

    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * <p>
     * Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     * 
     * @param fileFormat
     *        Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     *        <code>XML</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileFormat
     */

    public UpdateTransformerRequest withFileFormat(String fileFormat) {
        setFileFormat(fileFormat);
        return this;
    }

    /**
     * <p>
     * Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     * 
     * @param fileFormat
     *        Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     *        <code>XML</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileFormat
     */

    public UpdateTransformerRequest withFileFormat(FileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the mapping template for the transformer. This template is used to map the parsed EDI file using
     * JSONata or XSLT.
     * </p>
     * 
     * @param mappingTemplate
     *        Specifies the mapping template for the transformer. This template is used to map the parsed EDI file using
     *        JSONata or XSLT.
     */

    public void setMappingTemplate(String mappingTemplate) {
        this.mappingTemplate = mappingTemplate;
    }

    /**
     * <p>
     * Specifies the mapping template for the transformer. This template is used to map the parsed EDI file using
     * JSONata or XSLT.
     * </p>
     * 
     * @return Specifies the mapping template for the transformer. This template is used to map the parsed EDI file
     *         using JSONata or XSLT.
     */

    public String getMappingTemplate() {
        return this.mappingTemplate;
    }

    /**
     * <p>
     * Specifies the mapping template for the transformer. This template is used to map the parsed EDI file using
     * JSONata or XSLT.
     * </p>
     * 
     * @param mappingTemplate
     *        Specifies the mapping template for the transformer. This template is used to map the parsed EDI file using
     *        JSONata or XSLT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerRequest withMappingTemplate(String mappingTemplate) {
        setMappingTemplate(mappingTemplate);
        return this;
    }

    /**
     * <p>
     * Specifies the transformer's status. You can update the state of the transformer, from <code>active</code> to
     * <code>inactive</code>, or <code>inactive</code> to <code>active</code>.
     * </p>
     * 
     * @param status
     *        Specifies the transformer's status. You can update the state of the transformer, from <code>active</code>
     *        to <code>inactive</code>, or <code>inactive</code> to <code>active</code>.
     * @see TransformerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the transformer's status. You can update the state of the transformer, from <code>active</code> to
     * <code>inactive</code>, or <code>inactive</code> to <code>active</code>.
     * </p>
     * 
     * @return Specifies the transformer's status. You can update the state of the transformer, from <code>active</code>
     *         to <code>inactive</code>, or <code>inactive</code> to <code>active</code>.
     * @see TransformerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the transformer's status. You can update the state of the transformer, from <code>active</code> to
     * <code>inactive</code>, or <code>inactive</code> to <code>active</code>.
     * </p>
     * 
     * @param status
     *        Specifies the transformer's status. You can update the state of the transformer, from <code>active</code>
     *        to <code>inactive</code>, or <code>inactive</code> to <code>active</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformerStatus
     */

    public UpdateTransformerRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the transformer's status. You can update the state of the transformer, from <code>active</code> to
     * <code>inactive</code>, or <code>inactive</code> to <code>active</code>.
     * </p>
     * 
     * @param status
     *        Specifies the transformer's status. You can update the state of the transformer, from <code>active</code>
     *        to <code>inactive</code>, or <code>inactive</code> to <code>active</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformerStatus
     */

    public UpdateTransformerRequest withStatus(TransformerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     * 
     * @param ediType
     *        Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     *        supported. X12 is a set of standards and corresponding messages that define specific business documents.
     */

    public void setEdiType(EdiType ediType) {
        this.ediType = ediType;
    }

    /**
     * <p>
     * Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     * 
     * @return Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     *         supported. X12 is a set of standards and corresponding messages that define specific business documents.
     */

    public EdiType getEdiType() {
        return this.ediType;
    }

    /**
     * <p>
     * Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     * 
     * @param ediType
     *        Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     *        supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerRequest withEdiType(EdiType ediType) {
        setEdiType(ediType);
        return this;
    }

    /**
     * <p>
     * Specifies a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     * </p>
     * 
     * @param sampleDocument
     *        Specifies a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     */

    public void setSampleDocument(String sampleDocument) {
        this.sampleDocument = sampleDocument;
    }

    /**
     * <p>
     * Specifies a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     * </p>
     * 
     * @return Specifies a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     */

    public String getSampleDocument() {
        return this.sampleDocument;
    }

    /**
     * <p>
     * Specifies a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     * </p>
     * 
     * @param sampleDocument
     *        Specifies a sample EDI document that is used by a transformer as a guide for processing the EDI data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTransformerRequest withSampleDocument(String sampleDocument) {
        setSampleDocument(sampleDocument);
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
            sb.append("SampleDocument: ").append(getSampleDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTransformerRequest == false)
            return false;
        UpdateTransformerRequest other = (UpdateTransformerRequest) obj;
        if (other.getTransformerId() == null ^ this.getTransformerId() == null)
            return false;
        if (other.getTransformerId() != null && other.getTransformerId().equals(this.getTransformerId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformerId() == null) ? 0 : getTransformerId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        hashCode = prime * hashCode + ((getMappingTemplate() == null) ? 0 : getMappingTemplate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEdiType() == null) ? 0 : getEdiType().hashCode());
        hashCode = prime * hashCode + ((getSampleDocument() == null) ? 0 : getSampleDocument().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTransformerRequest clone() {
        return (UpdateTransformerRequest) super.clone();
    }

}
