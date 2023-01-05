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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateKnowledgeBase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKnowledgeBaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The knowledge base.
     * </p>
     */
    private KnowledgeBaseData knowledgeBase;

    /**
     * <p>
     * The knowledge base.
     * </p>
     * 
     * @param knowledgeBase
     *        The knowledge base.
     */

    public void setKnowledgeBase(KnowledgeBaseData knowledgeBase) {
        this.knowledgeBase = knowledgeBase;
    }

    /**
     * <p>
     * The knowledge base.
     * </p>
     * 
     * @return The knowledge base.
     */

    public KnowledgeBaseData getKnowledgeBase() {
        return this.knowledgeBase;
    }

    /**
     * <p>
     * The knowledge base.
     * </p>
     * 
     * @param knowledgeBase
     *        The knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseResult withKnowledgeBase(KnowledgeBaseData knowledgeBase) {
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

        if (obj instanceof CreateKnowledgeBaseResult == false)
            return false;
        CreateKnowledgeBaseResult other = (CreateKnowledgeBaseResult) obj;
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
    public CreateKnowledgeBaseResult clone() {
        try {
            return (CreateKnowledgeBaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
