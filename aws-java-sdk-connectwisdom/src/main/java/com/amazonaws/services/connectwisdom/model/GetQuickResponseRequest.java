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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetQuickResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQuickResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The identifier of the quick response.
     * </p>
     */
    private String quickResponseId;

    /**
     * <p>
     * The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base.
     * </p>
     * 
     * @return The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. This should be a QUICK_RESPONSES type knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuickResponseRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The identifier of the quick response.
     * </p>
     * 
     * @param quickResponseId
     *        The identifier of the quick response.
     */

    public void setQuickResponseId(String quickResponseId) {
        this.quickResponseId = quickResponseId;
    }

    /**
     * <p>
     * The identifier of the quick response.
     * </p>
     * 
     * @return The identifier of the quick response.
     */

    public String getQuickResponseId() {
        return this.quickResponseId;
    }

    /**
     * <p>
     * The identifier of the quick response.
     * </p>
     * 
     * @param quickResponseId
     *        The identifier of the quick response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuickResponseRequest withQuickResponseId(String quickResponseId) {
        setQuickResponseId(quickResponseId);
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
        if (getQuickResponseId() != null)
            sb.append("QuickResponseId: ").append(getQuickResponseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQuickResponseRequest == false)
            return false;
        GetQuickResponseRequest other = (GetQuickResponseRequest) obj;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getQuickResponseId() == null ^ this.getQuickResponseId() == null)
            return false;
        if (other.getQuickResponseId() != null && other.getQuickResponseId().equals(this.getQuickResponseId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getQuickResponseId() == null) ? 0 : getQuickResponseId().hashCode());
        return hashCode;
    }

    @Override
    public GetQuickResponseRequest clone() {
        return (GetQuickResponseRequest) super.clone();
    }

}
