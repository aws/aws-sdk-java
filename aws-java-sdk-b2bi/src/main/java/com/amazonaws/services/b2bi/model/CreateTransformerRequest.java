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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateTransformer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransformerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the transformer, used to identify it.
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
     * Reserved for future use.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the name of the transformer, used to identify it.
     * </p>
     * 
     * @param name
     *        Specifies the name of the transformer, used to identify it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the transformer, used to identify it.
     * </p>
     * 
     * @return Specifies the name of the transformer, used to identify it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the transformer, used to identify it.
     * </p>
     * 
     * @param name
     *        Specifies the name of the transformer, used to identify it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformerRequest withName(String name) {
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

    public CreateTransformerRequest withFileFormat(String fileFormat) {
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

    public CreateTransformerRequest withFileFormat(FileFormat fileFormat) {
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

    public CreateTransformerRequest withMappingTemplate(String mappingTemplate) {
        setMappingTemplate(mappingTemplate);
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

    public CreateTransformerRequest withEdiType(EdiType ediType) {
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

    public CreateTransformerRequest withSampleDocument(String sampleDocument) {
        setSampleDocument(sampleDocument);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param clientToken
     *        Reserved for future use.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param clientToken
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformerRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     * 
     * @return Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by
     *         type. You can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type.
     *        You can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type.
     *        You can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformerRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type.
     *        You can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformerRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFileFormat() != null)
            sb.append("FileFormat: ").append(getFileFormat()).append(",");
        if (getMappingTemplate() != null)
            sb.append("MappingTemplate: ").append(getMappingTemplate()).append(",");
        if (getEdiType() != null)
            sb.append("EdiType: ").append(getEdiType()).append(",");
        if (getSampleDocument() != null)
            sb.append("SampleDocument: ").append(getSampleDocument()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CreateTransformerRequest == false)
            return false;
        CreateTransformerRequest other = (CreateTransformerRequest) obj;
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
        if (other.getEdiType() == null ^ this.getEdiType() == null)
            return false;
        if (other.getEdiType() != null && other.getEdiType().equals(this.getEdiType()) == false)
            return false;
        if (other.getSampleDocument() == null ^ this.getSampleDocument() == null)
            return false;
        if (other.getSampleDocument() != null && other.getSampleDocument().equals(this.getSampleDocument()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        hashCode = prime * hashCode + ((getMappingTemplate() == null) ? 0 : getMappingTemplate().hashCode());
        hashCode = prime * hashCode + ((getEdiType() == null) ? 0 : getEdiType().hashCode());
        hashCode = prime * hashCode + ((getSampleDocument() == null) ? 0 : getSampleDocument().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransformerRequest clone() {
        return (CreateTransformerRequest) super.clone();
    }

}
