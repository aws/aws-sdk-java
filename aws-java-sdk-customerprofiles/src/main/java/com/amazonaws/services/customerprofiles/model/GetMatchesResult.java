/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetMatches" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMatchesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The timestamp this version of Match Result generated.
     * </p>
     */
    private java.util.Date matchGenerationDate;
    /**
     * <p>
     * The number of potential matches found.
     * </p>
     */
    private Integer potentialMatches;
    /**
     * <p>
     * The list of matched profiles for this instance.
     * </p>
     */
    private java.util.List<MatchItem> matches;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The timestamp this version of Match Result generated.
     * </p>
     * 
     * @param matchGenerationDate
     *        The timestamp this version of Match Result generated.
     */

    public void setMatchGenerationDate(java.util.Date matchGenerationDate) {
        this.matchGenerationDate = matchGenerationDate;
    }

    /**
     * <p>
     * The timestamp this version of Match Result generated.
     * </p>
     * 
     * @return The timestamp this version of Match Result generated.
     */

    public java.util.Date getMatchGenerationDate() {
        return this.matchGenerationDate;
    }

    /**
     * <p>
     * The timestamp this version of Match Result generated.
     * </p>
     * 
     * @param matchGenerationDate
     *        The timestamp this version of Match Result generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchesResult withMatchGenerationDate(java.util.Date matchGenerationDate) {
        setMatchGenerationDate(matchGenerationDate);
        return this;
    }

    /**
     * <p>
     * The number of potential matches found.
     * </p>
     * 
     * @param potentialMatches
     *        The number of potential matches found.
     */

    public void setPotentialMatches(Integer potentialMatches) {
        this.potentialMatches = potentialMatches;
    }

    /**
     * <p>
     * The number of potential matches found.
     * </p>
     * 
     * @return The number of potential matches found.
     */

    public Integer getPotentialMatches() {
        return this.potentialMatches;
    }

    /**
     * <p>
     * The number of potential matches found.
     * </p>
     * 
     * @param potentialMatches
     *        The number of potential matches found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchesResult withPotentialMatches(Integer potentialMatches) {
        setPotentialMatches(potentialMatches);
        return this;
    }

    /**
     * <p>
     * The list of matched profiles for this instance.
     * </p>
     * 
     * @return The list of matched profiles for this instance.
     */

    public java.util.List<MatchItem> getMatches() {
        return matches;
    }

    /**
     * <p>
     * The list of matched profiles for this instance.
     * </p>
     * 
     * @param matches
     *        The list of matched profiles for this instance.
     */

    public void setMatches(java.util.Collection<MatchItem> matches) {
        if (matches == null) {
            this.matches = null;
            return;
        }

        this.matches = new java.util.ArrayList<MatchItem>(matches);
    }

    /**
     * <p>
     * The list of matched profiles for this instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatches(java.util.Collection)} or {@link #withMatches(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param matches
     *        The list of matched profiles for this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchesResult withMatches(MatchItem... matches) {
        if (this.matches == null) {
            setMatches(new java.util.ArrayList<MatchItem>(matches.length));
        }
        for (MatchItem ele : matches) {
            this.matches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of matched profiles for this instance.
     * </p>
     * 
     * @param matches
     *        The list of matched profiles for this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchesResult withMatches(java.util.Collection<MatchItem> matches) {
        setMatches(matches);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMatchGenerationDate() != null)
            sb.append("MatchGenerationDate: ").append(getMatchGenerationDate()).append(",");
        if (getPotentialMatches() != null)
            sb.append("PotentialMatches: ").append(getPotentialMatches()).append(",");
        if (getMatches() != null)
            sb.append("Matches: ").append(getMatches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMatchesResult == false)
            return false;
        GetMatchesResult other = (GetMatchesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMatchGenerationDate() == null ^ this.getMatchGenerationDate() == null)
            return false;
        if (other.getMatchGenerationDate() != null && other.getMatchGenerationDate().equals(this.getMatchGenerationDate()) == false)
            return false;
        if (other.getPotentialMatches() == null ^ this.getPotentialMatches() == null)
            return false;
        if (other.getPotentialMatches() != null && other.getPotentialMatches().equals(this.getPotentialMatches()) == false)
            return false;
        if (other.getMatches() == null ^ this.getMatches() == null)
            return false;
        if (other.getMatches() != null && other.getMatches().equals(this.getMatches()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMatchGenerationDate() == null) ? 0 : getMatchGenerationDate().hashCode());
        hashCode = prime * hashCode + ((getPotentialMatches() == null) ? 0 : getPotentialMatches().hashCode());
        hashCode = prime * hashCode + ((getMatches() == null) ? 0 : getMatches().hashCode());
        return hashCode;
    }

    @Override
    public GetMatchesResult clone() {
        try {
            return (GetMatchesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
