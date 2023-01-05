/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/InferSNOMEDCT" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferSNOMEDCTResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The collection of medical concept entities extracted from the input text and their associated information. For
     * each entity, the response provides the entity text, the entity category, where the entity text begins and ends,
     * and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of
     * the entity are also returned.
     * </p>
     */
    private java.util.List<SNOMEDCTEntity> entities;
    /**
     * <p>
     * If the result of the request is truncated, the pagination token can be used to fetch the next page of entities.
     * </p>
     */
    private String paginationToken;
    /**
     * <p>
     * The version of the model used to analyze the documents, in the format n.n.n You can use this information to track
     * the model used for a particular batch of documents.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The details of the SNOMED-CT revision, including the edition, language, and version date.
     * </p>
     */
    private SNOMEDCTDetails sNOMEDCTDetails;
    /**
     * <p>
     * The number of characters in the input request documentation.
     * </p>
     */
    private Characters characters;

    /**
     * <p>
     * The collection of medical concept entities extracted from the input text and their associated information. For
     * each entity, the response provides the entity text, the entity category, where the entity text begins and ends,
     * and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of
     * the entity are also returned.
     * </p>
     * 
     * @return The collection of medical concept entities extracted from the input text and their associated
     *         information. For each entity, the response provides the entity text, the entity category, where the
     *         entity text begins and ends, and the level of confidence that Comprehend Medical has in the detection and
     *         analysis. Attributes and traits of the entity are also returned.
     */

    public java.util.List<SNOMEDCTEntity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * The collection of medical concept entities extracted from the input text and their associated information. For
     * each entity, the response provides the entity text, the entity category, where the entity text begins and ends,
     * and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of
     * the entity are also returned.
     * </p>
     * 
     * @param entities
     *        The collection of medical concept entities extracted from the input text and their associated information.
     *        For each entity, the response provides the entity text, the entity category, where the entity text begins
     *        and ends, and the level of confidence that Comprehend Medical has in the detection and analysis.
     *        Attributes and traits of the entity are also returned.
     */

    public void setEntities(java.util.Collection<SNOMEDCTEntity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<SNOMEDCTEntity>(entities);
    }

    /**
     * <p>
     * The collection of medical concept entities extracted from the input text and their associated information. For
     * each entity, the response provides the entity text, the entity category, where the entity text begins and ends,
     * and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of
     * the entity are also returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        The collection of medical concept entities extracted from the input text and their associated information.
     *        For each entity, the response provides the entity text, the entity category, where the entity text begins
     *        and ends, and the level of confidence that Comprehend Medical has in the detection and analysis.
     *        Attributes and traits of the entity are also returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferSNOMEDCTResult withEntities(SNOMEDCTEntity... entities) {
        if (this.entities == null) {
            setEntities(new java.util.ArrayList<SNOMEDCTEntity>(entities.length));
        }
        for (SNOMEDCTEntity ele : entities) {
            this.entities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The collection of medical concept entities extracted from the input text and their associated information. For
     * each entity, the response provides the entity text, the entity category, where the entity text begins and ends,
     * and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of
     * the entity are also returned.
     * </p>
     * 
     * @param entities
     *        The collection of medical concept entities extracted from the input text and their associated information.
     *        For each entity, the response provides the entity text, the entity category, where the entity text begins
     *        and ends, and the level of confidence that Comprehend Medical has in the detection and analysis.
     *        Attributes and traits of the entity are also returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferSNOMEDCTResult withEntities(java.util.Collection<SNOMEDCTEntity> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * If the result of the request is truncated, the pagination token can be used to fetch the next page of entities.
     * </p>
     * 
     * @param paginationToken
     *        If the result of the request is truncated, the pagination token can be used to fetch the next page of
     *        entities.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * If the result of the request is truncated, the pagination token can be used to fetch the next page of entities.
     * </p>
     * 
     * @return If the result of the request is truncated, the pagination token can be used to fetch the next page of
     *         entities.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * If the result of the request is truncated, the pagination token can be used to fetch the next page of entities.
     * </p>
     * 
     * @param paginationToken
     *        If the result of the request is truncated, the pagination token can be used to fetch the next page of
     *        entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferSNOMEDCTResult withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
        return this;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents, in the format n.n.n You can use this information to track
     * the model used for a particular batch of documents.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model used to analyze the documents, in the format n.n.n You can use this information
     *        to track the model used for a particular batch of documents.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents, in the format n.n.n You can use this information to track
     * the model used for a particular batch of documents.
     * </p>
     * 
     * @return The version of the model used to analyze the documents, in the format n.n.n You can use this information
     *         to track the model used for a particular batch of documents.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents, in the format n.n.n You can use this information to track
     * the model used for a particular batch of documents.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model used to analyze the documents, in the format n.n.n You can use this information
     *        to track the model used for a particular batch of documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferSNOMEDCTResult withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The details of the SNOMED-CT revision, including the edition, language, and version date.
     * </p>
     * 
     * @param sNOMEDCTDetails
     *        The details of the SNOMED-CT revision, including the edition, language, and version date.
     */

    public void setSNOMEDCTDetails(SNOMEDCTDetails sNOMEDCTDetails) {
        this.sNOMEDCTDetails = sNOMEDCTDetails;
    }

    /**
     * <p>
     * The details of the SNOMED-CT revision, including the edition, language, and version date.
     * </p>
     * 
     * @return The details of the SNOMED-CT revision, including the edition, language, and version date.
     */

    public SNOMEDCTDetails getSNOMEDCTDetails() {
        return this.sNOMEDCTDetails;
    }

    /**
     * <p>
     * The details of the SNOMED-CT revision, including the edition, language, and version date.
     * </p>
     * 
     * @param sNOMEDCTDetails
     *        The details of the SNOMED-CT revision, including the edition, language, and version date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferSNOMEDCTResult withSNOMEDCTDetails(SNOMEDCTDetails sNOMEDCTDetails) {
        setSNOMEDCTDetails(sNOMEDCTDetails);
        return this;
    }

    /**
     * <p>
     * The number of characters in the input request documentation.
     * </p>
     * 
     * @param characters
     *        The number of characters in the input request documentation.
     */

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    /**
     * <p>
     * The number of characters in the input request documentation.
     * </p>
     * 
     * @return The number of characters in the input request documentation.
     */

    public Characters getCharacters() {
        return this.characters;
    }

    /**
     * <p>
     * The number of characters in the input request documentation.
     * </p>
     * 
     * @param characters
     *        The number of characters in the input request documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferSNOMEDCTResult withCharacters(Characters characters) {
        setCharacters(characters);
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
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getSNOMEDCTDetails() != null)
            sb.append("SNOMEDCTDetails: ").append(getSNOMEDCTDetails()).append(",");
        if (getCharacters() != null)
            sb.append("Characters: ").append(getCharacters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferSNOMEDCTResult == false)
            return false;
        InferSNOMEDCTResult other = (InferSNOMEDCTResult) obj;
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
        if (other.getSNOMEDCTDetails() == null ^ this.getSNOMEDCTDetails() == null)
            return false;
        if (other.getSNOMEDCTDetails() != null && other.getSNOMEDCTDetails().equals(this.getSNOMEDCTDetails()) == false)
            return false;
        if (other.getCharacters() == null ^ this.getCharacters() == null)
            return false;
        if (other.getCharacters() != null && other.getCharacters().equals(this.getCharacters()) == false)
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
        hashCode = prime * hashCode + ((getSNOMEDCTDetails() == null) ? 0 : getSNOMEDCTDetails().hashCode());
        hashCode = prime * hashCode + ((getCharacters() == null) ? 0 : getCharacters().hashCode());
        return hashCode;
    }

    @Override
    public InferSNOMEDCTResult clone() {
        try {
            return (InferSNOMEDCTResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
