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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceModels" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAudienceModelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The audience models that match the request.
     * </p>
     */
    private java.util.List<AudienceModelSummary> audienceModels;
    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The audience models that match the request.
     * </p>
     * 
     * @return The audience models that match the request.
     */

    public java.util.List<AudienceModelSummary> getAudienceModels() {
        return audienceModels;
    }

    /**
     * <p>
     * The audience models that match the request.
     * </p>
     * 
     * @param audienceModels
     *        The audience models that match the request.
     */

    public void setAudienceModels(java.util.Collection<AudienceModelSummary> audienceModels) {
        if (audienceModels == null) {
            this.audienceModels = null;
            return;
        }

        this.audienceModels = new java.util.ArrayList<AudienceModelSummary>(audienceModels);
    }

    /**
     * <p>
     * The audience models that match the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudienceModels(java.util.Collection)} or {@link #withAudienceModels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param audienceModels
     *        The audience models that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAudienceModelsResult withAudienceModels(AudienceModelSummary... audienceModels) {
        if (this.audienceModels == null) {
            setAudienceModels(new java.util.ArrayList<AudienceModelSummary>(audienceModels.length));
        }
        for (AudienceModelSummary ele : audienceModels) {
            this.audienceModels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The audience models that match the request.
     * </p>
     * 
     * @param audienceModels
     *        The audience models that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAudienceModelsResult withAudienceModels(java.util.Collection<AudienceModelSummary> audienceModels) {
        setAudienceModels(audienceModels);
        return this;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @return The token value retrieved from a previous call to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAudienceModelsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAudienceModels() != null)
            sb.append("AudienceModels: ").append(getAudienceModels()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAudienceModelsResult == false)
            return false;
        ListAudienceModelsResult other = (ListAudienceModelsResult) obj;
        if (other.getAudienceModels() == null ^ this.getAudienceModels() == null)
            return false;
        if (other.getAudienceModels() != null && other.getAudienceModels().equals(this.getAudienceModels()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudienceModels() == null) ? 0 : getAudienceModels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAudienceModelsResult clone() {
        try {
            return (ListAudienceModelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
