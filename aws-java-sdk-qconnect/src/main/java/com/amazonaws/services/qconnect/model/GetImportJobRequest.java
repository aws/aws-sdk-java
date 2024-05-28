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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/GetImportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the import job to retrieve.
     * </p>
     */
    private String importJobId;
    /**
     * <p>
     * The identifier of the knowledge base that the import job belongs to.
     * </p>
     */
    private String knowledgeBaseId;

    /**
     * <p>
     * The identifier of the import job to retrieve.
     * </p>
     * 
     * @param importJobId
     *        The identifier of the import job to retrieve.
     */

    public void setImportJobId(String importJobId) {
        this.importJobId = importJobId;
    }

    /**
     * <p>
     * The identifier of the import job to retrieve.
     * </p>
     * 
     * @return The identifier of the import job to retrieve.
     */

    public String getImportJobId() {
        return this.importJobId;
    }

    /**
     * <p>
     * The identifier of the import job to retrieve.
     * </p>
     * 
     * @param importJobId
     *        The identifier of the import job to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportJobRequest withImportJobId(String importJobId) {
        setImportJobId(importJobId);
        return this;
    }

    /**
     * <p>
     * The identifier of the knowledge base that the import job belongs to.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base that the import job belongs to.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base that the import job belongs to.
     * </p>
     * 
     * @return The identifier of the knowledge base that the import job belongs to.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base that the import job belongs to.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base that the import job belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportJobRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
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
        if (getImportJobId() != null)
            sb.append("ImportJobId: ").append(getImportJobId()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImportJobRequest == false)
            return false;
        GetImportJobRequest other = (GetImportJobRequest) obj;
        if (other.getImportJobId() == null ^ this.getImportJobId() == null)
            return false;
        if (other.getImportJobId() != null && other.getImportJobId().equals(this.getImportJobId()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportJobId() == null) ? 0 : getImportJobId().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        return hashCode;
    }

    @Override
    public GetImportJobRequest clone() {
        return (GetImportJobRequest) super.clone();
    }

}
