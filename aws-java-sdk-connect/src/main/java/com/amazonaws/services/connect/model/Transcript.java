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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that defines search criteria and matching logic to search for contacts by matching text with transcripts
 * analyzed by Amazon Connect Contact Lens.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Transcript" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Transcript implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of search criteria based on Contact Lens conversational analytics transcript.
     * </p>
     */
    private java.util.List<TranscriptCriteria> criteria;
    /**
     * <p>
     * The match type combining search criteria using multiple transcript criteria.
     * </p>
     */
    private String matchType;

    /**
     * <p>
     * The list of search criteria based on Contact Lens conversational analytics transcript.
     * </p>
     * 
     * @return The list of search criteria based on Contact Lens conversational analytics transcript.
     */

    public java.util.List<TranscriptCriteria> getCriteria() {
        return criteria;
    }

    /**
     * <p>
     * The list of search criteria based on Contact Lens conversational analytics transcript.
     * </p>
     * 
     * @param criteria
     *        The list of search criteria based on Contact Lens conversational analytics transcript.
     */

    public void setCriteria(java.util.Collection<TranscriptCriteria> criteria) {
        if (criteria == null) {
            this.criteria = null;
            return;
        }

        this.criteria = new java.util.ArrayList<TranscriptCriteria>(criteria);
    }

    /**
     * <p>
     * The list of search criteria based on Contact Lens conversational analytics transcript.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCriteria(java.util.Collection)} or {@link #withCriteria(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param criteria
     *        The list of search criteria based on Contact Lens conversational analytics transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transcript withCriteria(TranscriptCriteria... criteria) {
        if (this.criteria == null) {
            setCriteria(new java.util.ArrayList<TranscriptCriteria>(criteria.length));
        }
        for (TranscriptCriteria ele : criteria) {
            this.criteria.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of search criteria based on Contact Lens conversational analytics transcript.
     * </p>
     * 
     * @param criteria
     *        The list of search criteria based on Contact Lens conversational analytics transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transcript withCriteria(java.util.Collection<TranscriptCriteria> criteria) {
        setCriteria(criteria);
        return this;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple transcript criteria.
     * </p>
     * 
     * @param matchType
     *        The match type combining search criteria using multiple transcript criteria.
     * @see SearchContactsMatchType
     */

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple transcript criteria.
     * </p>
     * 
     * @return The match type combining search criteria using multiple transcript criteria.
     * @see SearchContactsMatchType
     */

    public String getMatchType() {
        return this.matchType;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple transcript criteria.
     * </p>
     * 
     * @param matchType
     *        The match type combining search criteria using multiple transcript criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchContactsMatchType
     */

    public Transcript withMatchType(String matchType) {
        setMatchType(matchType);
        return this;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple transcript criteria.
     * </p>
     * 
     * @param matchType
     *        The match type combining search criteria using multiple transcript criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchContactsMatchType
     */

    public Transcript withMatchType(SearchContactsMatchType matchType) {
        this.matchType = matchType.toString();
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
        if (getCriteria() != null)
            sb.append("Criteria: ").append(getCriteria()).append(",");
        if (getMatchType() != null)
            sb.append("MatchType: ").append(getMatchType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Transcript == false)
            return false;
        Transcript other = (Transcript) obj;
        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
            return false;
        if (other.getMatchType() == null ^ this.getMatchType() == null)
            return false;
        if (other.getMatchType() != null && other.getMatchType().equals(this.getMatchType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
        hashCode = prime * hashCode + ((getMatchType() == null) ? 0 : getMatchType().hashCode());
        return hashCode;
    }

    @Override
    public Transcript clone() {
        try {
            return (Transcript) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.TranscriptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
