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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteKnowledgeBase" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteKnowledgeBaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the knowledge base that was deleted.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The status of the knowledge base and whether it has been successfully deleted.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique identifier of the knowledge base that was deleted.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base that was deleted.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base that was deleted.
     * </p>
     * 
     * @return The unique identifier of the knowledge base that was deleted.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base that was deleted.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKnowledgeBaseResult withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The status of the knowledge base and whether it has been successfully deleted.
     * </p>
     * 
     * @param status
     *        The status of the knowledge base and whether it has been successfully deleted.
     * @see KnowledgeBaseStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the knowledge base and whether it has been successfully deleted.
     * </p>
     * 
     * @return The status of the knowledge base and whether it has been successfully deleted.
     * @see KnowledgeBaseStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the knowledge base and whether it has been successfully deleted.
     * </p>
     * 
     * @param status
     *        The status of the knowledge base and whether it has been successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseStatus
     */

    public DeleteKnowledgeBaseResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the knowledge base and whether it has been successfully deleted.
     * </p>
     * 
     * @param status
     *        The status of the knowledge base and whether it has been successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseStatus
     */

    public DeleteKnowledgeBaseResult withStatus(KnowledgeBaseStatus status) {
        this.status = status.toString();
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
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteKnowledgeBaseResult == false)
            return false;
        DeleteKnowledgeBaseResult other = (DeleteKnowledgeBaseResult) obj;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteKnowledgeBaseResult clone() {
        try {
            return (DeleteKnowledgeBaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
