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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/InferICD10CM" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferICD10CMResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful, the
     * service sends back an HTTP 200 response, as well as the entities detected.
     * </p>
     */
    private java.util.List<ICD10CMEntity> entities;
    /**
     * <p>
     * If the result of the previous request to <code>InferICD10CM</code> was truncated, include the
     * <code>PaginationToken</code> to fetch the next page of medical condition entities.
     * </p>
     */
    private String paginationToken;
    /**
     * <p>
     * The version of the model used to analyze the documents, in the format <i>n</i>.<i>n</i>.<i>n</i> You can use this
     * information to track the model used for a particular batch of documents.
     * </p>
     */
    private String modelVersion;

    /**
     * <p>
     * The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful, the
     * service sends back an HTTP 200 response, as well as the entities detected.
     * </p>
     * 
     * @return The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful,
     *         the service sends back an HTTP 200 response, as well as the entities detected.
     */

    public java.util.List<ICD10CMEntity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful, the
     * service sends back an HTTP 200 response, as well as the entities detected.
     * </p>
     * 
     * @param entities
     *        The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful, the
     *        service sends back an HTTP 200 response, as well as the entities detected.
     */

    public void setEntities(java.util.Collection<ICD10CMEntity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<ICD10CMEntity>(entities);
    }

    /**
     * <p>
     * The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful, the
     * service sends back an HTTP 200 response, as well as the entities detected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful, the
     *        service sends back an HTTP 200 response, as well as the entities detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferICD10CMResult withEntities(ICD10CMEntity... entities) {
        if (this.entities == null) {
            setEntities(new java.util.ArrayList<ICD10CMEntity>(entities.length));
        }
        for (ICD10CMEntity ele : entities) {
            this.entities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful, the
     * service sends back an HTTP 200 response, as well as the entities detected.
     * </p>
     * 
     * @param entities
     *        The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful, the
     *        service sends back an HTTP 200 response, as well as the entities detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferICD10CMResult withEntities(java.util.Collection<ICD10CMEntity> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * If the result of the previous request to <code>InferICD10CM</code> was truncated, include the
     * <code>PaginationToken</code> to fetch the next page of medical condition entities.
     * </p>
     * 
     * @param paginationToken
     *        If the result of the previous request to <code>InferICD10CM</code> was truncated, include the
     *        <code>PaginationToken</code> to fetch the next page of medical condition entities.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>InferICD10CM</code> was truncated, include the
     * <code>PaginationToken</code> to fetch the next page of medical condition entities.
     * </p>
     * 
     * @return If the result of the previous request to <code>InferICD10CM</code> was truncated, include the
     *         <code>PaginationToken</code> to fetch the next page of medical condition entities.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * If the result of the previous request to <code>InferICD10CM</code> was truncated, include the
     * <code>PaginationToken</code> to fetch the next page of medical condition entities.
     * </p>
     * 
     * @param paginationToken
     *        If the result of the previous request to <code>InferICD10CM</code> was truncated, include the
     *        <code>PaginationToken</code> to fetch the next page of medical condition entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferICD10CMResult withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
        return this;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents, in the format <i>n</i>.<i>n</i>.<i>n</i> You can use this
     * information to track the model used for a particular batch of documents.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model used to analyze the documents, in the format <i>n</i>.<i>n</i>.<i>n</i> You can
     *        use this information to track the model used for a particular batch of documents.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents, in the format <i>n</i>.<i>n</i>.<i>n</i> You can use this
     * information to track the model used for a particular batch of documents.
     * </p>
     * 
     * @return The version of the model used to analyze the documents, in the format <i>n</i>.<i>n</i>.<i>n</i> You can
     *         use this information to track the model used for a particular batch of documents.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents, in the format <i>n</i>.<i>n</i>.<i>n</i> You can use this
     * information to track the model used for a particular batch of documents.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model used to analyze the documents, in the format <i>n</i>.<i>n</i>.<i>n</i> You can
     *        use this information to track the model used for a particular batch of documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferICD10CMResult withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
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
        if (getEntities() != null)
            sb.append("Entities: ").append(getEntities()).append(",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferICD10CMResult == false)
            return false;
        InferICD10CMResult other = (InferICD10CMResult) obj;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public InferICD10CMResult clone() {
        try {
            return (InferICD10CMResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
