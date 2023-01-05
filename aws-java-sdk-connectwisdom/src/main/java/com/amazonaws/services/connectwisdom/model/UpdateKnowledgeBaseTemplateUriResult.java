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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateKnowledgeBaseTemplateUri"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKnowledgeBaseTemplateUriResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The knowledge base to update.
     * </p>
     */
    private KnowledgeBaseData knowledgeBase;

    /**
     * <p>
     * The knowledge base to update.
     * </p>
     * 
     * @param knowledgeBase
     *        The knowledge base to update.
     */

    public void setKnowledgeBase(KnowledgeBaseData knowledgeBase) {
        this.knowledgeBase = knowledgeBase;
    }

    /**
     * <p>
     * The knowledge base to update.
     * </p>
     * 
     * @return The knowledge base to update.
     */

    public KnowledgeBaseData getKnowledgeBase() {
        return this.knowledgeBase;
    }

    /**
     * <p>
     * The knowledge base to update.
     * </p>
     * 
     * @param knowledgeBase
     *        The knowledge base to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKnowledgeBaseTemplateUriResult withKnowledgeBase(KnowledgeBaseData knowledgeBase) {
        setKnowledgeBase(knowledgeBase);
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
        if (getKnowledgeBase() != null)
            sb.append("KnowledgeBase: ").append(getKnowledgeBase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKnowledgeBaseTemplateUriResult == false)
            return false;
        UpdateKnowledgeBaseTemplateUriResult other = (UpdateKnowledgeBaseTemplateUriResult) obj;
        if (other.getKnowledgeBase() == null ^ this.getKnowledgeBase() == null)
            return false;
        if (other.getKnowledgeBase() != null && other.getKnowledgeBase().equals(this.getKnowledgeBase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKnowledgeBase() == null) ? 0 : getKnowledgeBase().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKnowledgeBaseTemplateUriResult clone() {
        try {
            return (UpdateKnowledgeBaseTemplateUriResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
