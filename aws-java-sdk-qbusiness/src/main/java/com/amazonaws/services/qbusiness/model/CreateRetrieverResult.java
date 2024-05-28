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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateRetriever" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRetrieverResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the retriever you are using.
     * </p>
     */
    private String retrieverId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role associated with a retriever.
     * </p>
     */
    private String retrieverArn;

    /**
     * <p>
     * The identifier of the retriever you are using.
     * </p>
     * 
     * @param retrieverId
     *        The identifier of the retriever you are using.
     */

    public void setRetrieverId(String retrieverId) {
        this.retrieverId = retrieverId;
    }

    /**
     * <p>
     * The identifier of the retriever you are using.
     * </p>
     * 
     * @return The identifier of the retriever you are using.
     */

    public String getRetrieverId() {
        return this.retrieverId;
    }

    /**
     * <p>
     * The identifier of the retriever you are using.
     * </p>
     * 
     * @param retrieverId
     *        The identifier of the retriever you are using.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRetrieverResult withRetrieverId(String retrieverId) {
        setRetrieverId(retrieverId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role associated with a retriever.
     * </p>
     * 
     * @param retrieverArn
     *        The Amazon Resource Name (ARN) of an IAM role associated with a retriever.
     */

    public void setRetrieverArn(String retrieverArn) {
        this.retrieverArn = retrieverArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role associated with a retriever.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role associated with a retriever.
     */

    public String getRetrieverArn() {
        return this.retrieverArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role associated with a retriever.
     * </p>
     * 
     * @param retrieverArn
     *        The Amazon Resource Name (ARN) of an IAM role associated with a retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRetrieverResult withRetrieverArn(String retrieverArn) {
        setRetrieverArn(retrieverArn);
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
        if (getRetrieverId() != null)
            sb.append("RetrieverId: ").append(getRetrieverId()).append(",");
        if (getRetrieverArn() != null)
            sb.append("RetrieverArn: ").append(getRetrieverArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRetrieverResult == false)
            return false;
        CreateRetrieverResult other = (CreateRetrieverResult) obj;
        if (other.getRetrieverId() == null ^ this.getRetrieverId() == null)
            return false;
        if (other.getRetrieverId() != null && other.getRetrieverId().equals(this.getRetrieverId()) == false)
            return false;
        if (other.getRetrieverArn() == null ^ this.getRetrieverArn() == null)
            return false;
        if (other.getRetrieverArn() != null && other.getRetrieverArn().equals(this.getRetrieverArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetrieverId() == null) ? 0 : getRetrieverId().hashCode());
        hashCode = prime * hashCode + ((getRetrieverArn() == null) ? 0 : getRetrieverArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateRetrieverResult clone() {
        try {
            return (CreateRetrieverResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
