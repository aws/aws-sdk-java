/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A valid JSON string.
     * </p>
     */
    private String content;
    /**
     * <p>
     * A name for the Systems Manager document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of document to create. Valid document types include: Policy, Automation, and Command.
     * </p>
     */
    private String documentType;

    /**
     * <p>
     * A valid JSON string.
     * </p>
     * 
     * @param content
     *        A valid JSON string.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * A valid JSON string.
     * </p>
     * 
     * @return A valid JSON string.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * A valid JSON string.
     * </p>
     * 
     * @param content
     *        A valid JSON string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * A name for the Systems Manager document.
     * </p>
     * 
     * @param name
     *        A name for the Systems Manager document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the Systems Manager document.
     * </p>
     * 
     * @return A name for the Systems Manager document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the Systems Manager document.
     * </p>
     * 
     * @param name
     *        A name for the Systems Manager document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of document to create. Valid document types include: Policy, Automation, and Command.
     * </p>
     * 
     * @param documentType
     *        The type of document to create. Valid document types include: Policy, Automation, and Command.
     * @see DocumentType
     */

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p>
     * The type of document to create. Valid document types include: Policy, Automation, and Command.
     * </p>
     * 
     * @return The type of document to create. Valid document types include: Policy, Automation, and Command.
     * @see DocumentType
     */

    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * <p>
     * The type of document to create. Valid document types include: Policy, Automation, and Command.
     * </p>
     * 
     * @param documentType
     *        The type of document to create. Valid document types include: Policy, Automation, and Command.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentType
     */

    public CreateDocumentRequest withDocumentType(String documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p>
     * The type of document to create. Valid document types include: Policy, Automation, and Command.
     * </p>
     * 
     * @param documentType
     *        The type of document to create. Valid document types include: Policy, Automation, and Command.
     * @see DocumentType
     */

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
    }

    /**
     * <p>
     * The type of document to create. Valid document types include: Policy, Automation, and Command.
     * </p>
     * 
     * @param documentType
     *        The type of document to create. Valid document types include: Policy, Automation, and Command.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentType
     */

    public CreateDocumentRequest withDocumentType(DocumentType documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDocumentType() != null)
            sb.append("DocumentType: ").append(getDocumentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDocumentRequest == false)
            return false;
        CreateDocumentRequest other = (CreateDocumentRequest) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        return hashCode;
    }

    @Override
    public CreateDocumentRequest clone() {
        return (CreateDocumentRequest) super.clone();
    }

}
