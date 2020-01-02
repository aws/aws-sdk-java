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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the index to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A new IAM role that gives Amazon Kendra permission to access your Amazon CloudWatch logs.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A new description for the index.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The document metadata to update.
     * </p>
     */
    private java.util.List<DocumentMetadataConfiguration> documentMetadataConfigurationUpdates;

    /**
     * <p>
     * The identifier of the index to update.
     * </p>
     * 
     * @param id
     *        The identifier of the index to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the index to update.
     * </p>
     * 
     * @return The identifier of the index to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the index to update.
     * </p>
     * 
     * @param id
     *        The identifier of the index to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the index to update.
     * </p>
     * 
     * @param name
     *        The name of the index to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the index to update.
     * </p>
     * 
     * @return The name of the index to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the index to update.
     * </p>
     * 
     * @param name
     *        The name of the index to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A new IAM role that gives Amazon Kendra permission to access your Amazon CloudWatch logs.
     * </p>
     * 
     * @param roleArn
     *        A new IAM role that gives Amazon Kendra permission to access your Amazon CloudWatch logs.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * A new IAM role that gives Amazon Kendra permission to access your Amazon CloudWatch logs.
     * </p>
     * 
     * @return A new IAM role that gives Amazon Kendra permission to access your Amazon CloudWatch logs.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * A new IAM role that gives Amazon Kendra permission to access your Amazon CloudWatch logs.
     * </p>
     * 
     * @param roleArn
     *        A new IAM role that gives Amazon Kendra permission to access your Amazon CloudWatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A new description for the index.
     * </p>
     * 
     * @param description
     *        A new description for the index.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the index.
     * </p>
     * 
     * @return A new description for the index.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description for the index.
     * </p>
     * 
     * @param description
     *        A new description for the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The document metadata to update.
     * </p>
     * 
     * @return The document metadata to update.
     */

    public java.util.List<DocumentMetadataConfiguration> getDocumentMetadataConfigurationUpdates() {
        return documentMetadataConfigurationUpdates;
    }

    /**
     * <p>
     * The document metadata to update.
     * </p>
     * 
     * @param documentMetadataConfigurationUpdates
     *        The document metadata to update.
     */

    public void setDocumentMetadataConfigurationUpdates(java.util.Collection<DocumentMetadataConfiguration> documentMetadataConfigurationUpdates) {
        if (documentMetadataConfigurationUpdates == null) {
            this.documentMetadataConfigurationUpdates = null;
            return;
        }

        this.documentMetadataConfigurationUpdates = new java.util.ArrayList<DocumentMetadataConfiguration>(documentMetadataConfigurationUpdates);
    }

    /**
     * <p>
     * The document metadata to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentMetadataConfigurationUpdates(java.util.Collection)} or
     * {@link #withDocumentMetadataConfigurationUpdates(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param documentMetadataConfigurationUpdates
     *        The document metadata to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withDocumentMetadataConfigurationUpdates(DocumentMetadataConfiguration... documentMetadataConfigurationUpdates) {
        if (this.documentMetadataConfigurationUpdates == null) {
            setDocumentMetadataConfigurationUpdates(new java.util.ArrayList<DocumentMetadataConfiguration>(documentMetadataConfigurationUpdates.length));
        }
        for (DocumentMetadataConfiguration ele : documentMetadataConfigurationUpdates) {
            this.documentMetadataConfigurationUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The document metadata to update.
     * </p>
     * 
     * @param documentMetadataConfigurationUpdates
     *        The document metadata to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withDocumentMetadataConfigurationUpdates(java.util.Collection<DocumentMetadataConfiguration> documentMetadataConfigurationUpdates) {
        setDocumentMetadataConfigurationUpdates(documentMetadataConfigurationUpdates);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDocumentMetadataConfigurationUpdates() != null)
            sb.append("DocumentMetadataConfigurationUpdates: ").append(getDocumentMetadataConfigurationUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIndexRequest == false)
            return false;
        UpdateIndexRequest other = (UpdateIndexRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDocumentMetadataConfigurationUpdates() == null ^ this.getDocumentMetadataConfigurationUpdates() == null)
            return false;
        if (other.getDocumentMetadataConfigurationUpdates() != null
                && other.getDocumentMetadataConfigurationUpdates().equals(this.getDocumentMetadataConfigurationUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDocumentMetadataConfigurationUpdates() == null) ? 0 : getDocumentMetadataConfigurationUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIndexRequest clone() {
        return (UpdateIndexRequest) super.clone();
    }

}
