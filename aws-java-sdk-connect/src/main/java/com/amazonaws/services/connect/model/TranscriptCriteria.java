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
 * A structure that defines search criteria base on words or phrases, participants in the Contact Lens conversational
 * analytics transcript.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TranscriptCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranscriptCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The participant role in a transcript
     * </p>
     */
    private String participantRole;
    /**
     * <p>
     * The words or phrases used to search within a transcript.
     * </p>
     */
    private java.util.List<String> searchText;
    /**
     * <p>
     * The match type combining search criteria using multiple search texts in a transcript criteria.
     * </p>
     */
    private String matchType;

    /**
     * <p>
     * The participant role in a transcript
     * </p>
     * 
     * @param participantRole
     *        The participant role in a transcript
     * @see ParticipantRole
     */

    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * The participant role in a transcript
     * </p>
     * 
     * @return The participant role in a transcript
     * @see ParticipantRole
     */

    public String getParticipantRole() {
        return this.participantRole;
    }

    /**
     * <p>
     * The participant role in a transcript
     * </p>
     * 
     * @param participantRole
     *        The participant role in a transcript
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public TranscriptCriteria withParticipantRole(String participantRole) {
        setParticipantRole(participantRole);
        return this;
    }

    /**
     * <p>
     * The participant role in a transcript
     * </p>
     * 
     * @param participantRole
     *        The participant role in a transcript
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public TranscriptCriteria withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * The words or phrases used to search within a transcript.
     * </p>
     * 
     * @return The words or phrases used to search within a transcript.
     */

    public java.util.List<String> getSearchText() {
        return searchText;
    }

    /**
     * <p>
     * The words or phrases used to search within a transcript.
     * </p>
     * 
     * @param searchText
     *        The words or phrases used to search within a transcript.
     */

    public void setSearchText(java.util.Collection<String> searchText) {
        if (searchText == null) {
            this.searchText = null;
            return;
        }

        this.searchText = new java.util.ArrayList<String>(searchText);
    }

    /**
     * <p>
     * The words or phrases used to search within a transcript.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSearchText(java.util.Collection)} or {@link #withSearchText(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param searchText
     *        The words or phrases used to search within a transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptCriteria withSearchText(String... searchText) {
        if (this.searchText == null) {
            setSearchText(new java.util.ArrayList<String>(searchText.length));
        }
        for (String ele : searchText) {
            this.searchText.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The words or phrases used to search within a transcript.
     * </p>
     * 
     * @param searchText
     *        The words or phrases used to search within a transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptCriteria withSearchText(java.util.Collection<String> searchText) {
        setSearchText(searchText);
        return this;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple search texts in a transcript criteria.
     * </p>
     * 
     * @param matchType
     *        The match type combining search criteria using multiple search texts in a transcript criteria.
     * @see SearchContactsMatchType
     */

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple search texts in a transcript criteria.
     * </p>
     * 
     * @return The match type combining search criteria using multiple search texts in a transcript criteria.
     * @see SearchContactsMatchType
     */

    public String getMatchType() {
        return this.matchType;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple search texts in a transcript criteria.
     * </p>
     * 
     * @param matchType
     *        The match type combining search criteria using multiple search texts in a transcript criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchContactsMatchType
     */

    public TranscriptCriteria withMatchType(String matchType) {
        setMatchType(matchType);
        return this;
    }

    /**
     * <p>
     * The match type combining search criteria using multiple search texts in a transcript criteria.
     * </p>
     * 
     * @param matchType
     *        The match type combining search criteria using multiple search texts in a transcript criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchContactsMatchType
     */

    public TranscriptCriteria withMatchType(SearchContactsMatchType matchType) {
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
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: ").append(getParticipantRole()).append(",");
        if (getSearchText() != null)
            sb.append("SearchText: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof TranscriptCriteria == false)
            return false;
        TranscriptCriteria other = (TranscriptCriteria) obj;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getSearchText() == null ^ this.getSearchText() == null)
            return false;
        if (other.getSearchText() != null && other.getSearchText().equals(this.getSearchText()) == false)
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

        hashCode = prime * hashCode + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode + ((getSearchText() == null) ? 0 : getSearchText().hashCode());
        hashCode = prime * hashCode + ((getMatchType() == null) ? 0 : getMatchType().hashCode());
        return hashCode;
    }

    @Override
    public TranscriptCriteria clone() {
        try {
            return (TranscriptCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.TranscriptCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
