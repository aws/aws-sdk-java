/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An autocomplete suggestion that matches the query string specified in a <code>SuggestRequest</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuggestionMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The string that matches the query string specified in the <code>SuggestRequest</code>.
     * </p>
     */
    private String suggestion;
    /**
     * <p>
     * The relevance score of a suggested match.
     * </p>
     */
    private Long score;
    /**
     * <p>
     * The document ID of the suggested document.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The string that matches the query string specified in the <code>SuggestRequest</code>.
     * </p>
     * 
     * @param suggestion
     *        The string that matches the query string specified in the <code>SuggestRequest</code>.
     */

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    /**
     * <p>
     * The string that matches the query string specified in the <code>SuggestRequest</code>.
     * </p>
     * 
     * @return The string that matches the query string specified in the <code>SuggestRequest</code>.
     */

    public String getSuggestion() {
        return this.suggestion;
    }

    /**
     * <p>
     * The string that matches the query string specified in the <code>SuggestRequest</code>.
     * </p>
     * 
     * @param suggestion
     *        The string that matches the query string specified in the <code>SuggestRequest</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestionMatch withSuggestion(String suggestion) {
        setSuggestion(suggestion);
        return this;
    }

    /**
     * <p>
     * The relevance score of a suggested match.
     * </p>
     * 
     * @param score
     *        The relevance score of a suggested match.
     */

    public void setScore(Long score) {
        this.score = score;
    }

    /**
     * <p>
     * The relevance score of a suggested match.
     * </p>
     * 
     * @return The relevance score of a suggested match.
     */

    public Long getScore() {
        return this.score;
    }

    /**
     * <p>
     * The relevance score of a suggested match.
     * </p>
     * 
     * @param score
     *        The relevance score of a suggested match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestionMatch withScore(Long score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * The document ID of the suggested document.
     * </p>
     * 
     * @param id
     *        The document ID of the suggested document.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The document ID of the suggested document.
     * </p>
     * 
     * @return The document ID of the suggested document.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The document ID of the suggested document.
     * </p>
     * 
     * @param id
     *        The document ID of the suggested document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestionMatch withId(String id) {
        setId(id);
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
        if (getSuggestion() != null)
            sb.append("Suggestion: ").append(getSuggestion()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuggestionMatch == false)
            return false;
        SuggestionMatch other = (SuggestionMatch) obj;
        if (other.getSuggestion() == null ^ this.getSuggestion() == null)
            return false;
        if (other.getSuggestion() != null && other.getSuggestion().equals(this.getSuggestion()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuggestion() == null) ? 0 : getSuggestion().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public SuggestionMatch clone() {
        try {
            return (SuggestionMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudsearchdomain.model.transform.SuggestionMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
