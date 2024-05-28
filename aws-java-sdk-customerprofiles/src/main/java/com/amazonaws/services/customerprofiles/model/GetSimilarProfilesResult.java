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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetSimilarProfiles"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSimilarProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Set of <code>profileId</code>s that belong to the same matching group.
     * </p>
     */
    private java.util.List<String> profileIds;
    /**
     * <p>
     * The string <code>matchId</code> that the similar profiles belong to.
     * </p>
     */
    private String matchId;
    /**
     * <p>
     * Specify the type of matching to get similar profiles for.
     * </p>
     */
    private String matchType;
    /**
     * <p>
     * The integer rule level that the profiles matched on.
     * </p>
     */
    private Integer ruleLevel;
    /**
     * <p>
     * It only has value when the <code>MatchType</code> is <code>ML_BASED_MATCHING</code>.A number between 0 and 1,
     * where a higher score means higher similarity. Examining match confidence scores lets you distinguish between
     * groups of similar records in which the system is highly confident (which you may decide to merge), groups of
     * similar records about which the system is uncertain (which you may decide to have reviewed by a human), and
     * groups of similar records that the system deems to be unlikely (which you may decide to reject). Given confidence
     * scores vary as per the data input, it should not be used as an absolute measure of matching quality.
     * </p>
     */
    private Double confidenceScore;
    /**
     * <p>
     * The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Set of <code>profileId</code>s that belong to the same matching group.
     * </p>
     * 
     * @return Set of <code>profileId</code>s that belong to the same matching group.
     */

    public java.util.List<String> getProfileIds() {
        return profileIds;
    }

    /**
     * <p>
     * Set of <code>profileId</code>s that belong to the same matching group.
     * </p>
     * 
     * @param profileIds
     *        Set of <code>profileId</code>s that belong to the same matching group.
     */

    public void setProfileIds(java.util.Collection<String> profileIds) {
        if (profileIds == null) {
            this.profileIds = null;
            return;
        }

        this.profileIds = new java.util.ArrayList<String>(profileIds);
    }

    /**
     * <p>
     * Set of <code>profileId</code>s that belong to the same matching group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileIds(java.util.Collection)} or {@link #withProfileIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param profileIds
     *        Set of <code>profileId</code>s that belong to the same matching group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSimilarProfilesResult withProfileIds(String... profileIds) {
        if (this.profileIds == null) {
            setProfileIds(new java.util.ArrayList<String>(profileIds.length));
        }
        for (String ele : profileIds) {
            this.profileIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Set of <code>profileId</code>s that belong to the same matching group.
     * </p>
     * 
     * @param profileIds
     *        Set of <code>profileId</code>s that belong to the same matching group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSimilarProfilesResult withProfileIds(java.util.Collection<String> profileIds) {
        setProfileIds(profileIds);
        return this;
    }

    /**
     * <p>
     * The string <code>matchId</code> that the similar profiles belong to.
     * </p>
     * 
     * @param matchId
     *        The string <code>matchId</code> that the similar profiles belong to.
     */

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    /**
     * <p>
     * The string <code>matchId</code> that the similar profiles belong to.
     * </p>
     * 
     * @return The string <code>matchId</code> that the similar profiles belong to.
     */

    public String getMatchId() {
        return this.matchId;
    }

    /**
     * <p>
     * The string <code>matchId</code> that the similar profiles belong to.
     * </p>
     * 
     * @param matchId
     *        The string <code>matchId</code> that the similar profiles belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSimilarProfilesResult withMatchId(String matchId) {
        setMatchId(matchId);
        return this;
    }

    /**
     * <p>
     * Specify the type of matching to get similar profiles for.
     * </p>
     * 
     * @param matchType
     *        Specify the type of matching to get similar profiles for.
     * @see MatchType
     */

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * <p>
     * Specify the type of matching to get similar profiles for.
     * </p>
     * 
     * @return Specify the type of matching to get similar profiles for.
     * @see MatchType
     */

    public String getMatchType() {
        return this.matchType;
    }

    /**
     * <p>
     * Specify the type of matching to get similar profiles for.
     * </p>
     * 
     * @param matchType
     *        Specify the type of matching to get similar profiles for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MatchType
     */

    public GetSimilarProfilesResult withMatchType(String matchType) {
        setMatchType(matchType);
        return this;
    }

    /**
     * <p>
     * Specify the type of matching to get similar profiles for.
     * </p>
     * 
     * @param matchType
     *        Specify the type of matching to get similar profiles for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MatchType
     */

    public GetSimilarProfilesResult withMatchType(MatchType matchType) {
        this.matchType = matchType.toString();
        return this;
    }

    /**
     * <p>
     * The integer rule level that the profiles matched on.
     * </p>
     * 
     * @param ruleLevel
     *        The integer rule level that the profiles matched on.
     */

    public void setRuleLevel(Integer ruleLevel) {
        this.ruleLevel = ruleLevel;
    }

    /**
     * <p>
     * The integer rule level that the profiles matched on.
     * </p>
     * 
     * @return The integer rule level that the profiles matched on.
     */

    public Integer getRuleLevel() {
        return this.ruleLevel;
    }

    /**
     * <p>
     * The integer rule level that the profiles matched on.
     * </p>
     * 
     * @param ruleLevel
     *        The integer rule level that the profiles matched on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSimilarProfilesResult withRuleLevel(Integer ruleLevel) {
        setRuleLevel(ruleLevel);
        return this;
    }

    /**
     * <p>
     * It only has value when the <code>MatchType</code> is <code>ML_BASED_MATCHING</code>.A number between 0 and 1,
     * where a higher score means higher similarity. Examining match confidence scores lets you distinguish between
     * groups of similar records in which the system is highly confident (which you may decide to merge), groups of
     * similar records about which the system is uncertain (which you may decide to have reviewed by a human), and
     * groups of similar records that the system deems to be unlikely (which you may decide to reject). Given confidence
     * scores vary as per the data input, it should not be used as an absolute measure of matching quality.
     * </p>
     * 
     * @param confidenceScore
     *        It only has value when the <code>MatchType</code> is <code>ML_BASED_MATCHING</code>.A number between 0 and
     *        1, where a higher score means higher similarity. Examining match confidence scores lets you distinguish
     *        between groups of similar records in which the system is highly confident (which you may decide to merge),
     *        groups of similar records about which the system is uncertain (which you may decide to have reviewed by a
     *        human), and groups of similar records that the system deems to be unlikely (which you may decide to
     *        reject). Given confidence scores vary as per the data input, it should not be used as an absolute measure
     *        of matching quality.
     */

    public void setConfidenceScore(Double confidenceScore) {
        this.confidenceScore = confidenceScore;
    }

    /**
     * <p>
     * It only has value when the <code>MatchType</code> is <code>ML_BASED_MATCHING</code>.A number between 0 and 1,
     * where a higher score means higher similarity. Examining match confidence scores lets you distinguish between
     * groups of similar records in which the system is highly confident (which you may decide to merge), groups of
     * similar records about which the system is uncertain (which you may decide to have reviewed by a human), and
     * groups of similar records that the system deems to be unlikely (which you may decide to reject). Given confidence
     * scores vary as per the data input, it should not be used as an absolute measure of matching quality.
     * </p>
     * 
     * @return It only has value when the <code>MatchType</code> is <code>ML_BASED_MATCHING</code>.A number between 0
     *         and 1, where a higher score means higher similarity. Examining match confidence scores lets you
     *         distinguish between groups of similar records in which the system is highly confident (which you may
     *         decide to merge), groups of similar records about which the system is uncertain (which you may decide to
     *         have reviewed by a human), and groups of similar records that the system deems to be unlikely (which you
     *         may decide to reject). Given confidence scores vary as per the data input, it should not be used as an
     *         absolute measure of matching quality.
     */

    public Double getConfidenceScore() {
        return this.confidenceScore;
    }

    /**
     * <p>
     * It only has value when the <code>MatchType</code> is <code>ML_BASED_MATCHING</code>.A number between 0 and 1,
     * where a higher score means higher similarity. Examining match confidence scores lets you distinguish between
     * groups of similar records in which the system is highly confident (which you may decide to merge), groups of
     * similar records about which the system is uncertain (which you may decide to have reviewed by a human), and
     * groups of similar records that the system deems to be unlikely (which you may decide to reject). Given confidence
     * scores vary as per the data input, it should not be used as an absolute measure of matching quality.
     * </p>
     * 
     * @param confidenceScore
     *        It only has value when the <code>MatchType</code> is <code>ML_BASED_MATCHING</code>.A number between 0 and
     *        1, where a higher score means higher similarity. Examining match confidence scores lets you distinguish
     *        between groups of similar records in which the system is highly confident (which you may decide to merge),
     *        groups of similar records about which the system is uncertain (which you may decide to have reviewed by a
     *        human), and groups of similar records that the system deems to be unlikely (which you may decide to
     *        reject). Given confidence scores vary as per the data input, it should not be used as an absolute measure
     *        of matching quality.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSimilarProfilesResult withConfidenceScore(Double confidenceScore) {
        setConfidenceScore(confidenceScore);
        return this;
    }

    /**
     * <p>
     * The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     * </p>
     * 
     * @return The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous <code>GetSimilarProfiles</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSimilarProfilesResult withNextToken(String nextToken) {
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
        if (getProfileIds() != null)
            sb.append("ProfileIds: ").append(getProfileIds()).append(",");
        if (getMatchId() != null)
            sb.append("MatchId: ").append(getMatchId()).append(",");
        if (getMatchType() != null)
            sb.append("MatchType: ").append(getMatchType()).append(",");
        if (getRuleLevel() != null)
            sb.append("RuleLevel: ").append(getRuleLevel()).append(",");
        if (getConfidenceScore() != null)
            sb.append("ConfidenceScore: ").append(getConfidenceScore()).append(",");
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

        if (obj instanceof GetSimilarProfilesResult == false)
            return false;
        GetSimilarProfilesResult other = (GetSimilarProfilesResult) obj;
        if (other.getProfileIds() == null ^ this.getProfileIds() == null)
            return false;
        if (other.getProfileIds() != null && other.getProfileIds().equals(this.getProfileIds()) == false)
            return false;
        if (other.getMatchId() == null ^ this.getMatchId() == null)
            return false;
        if (other.getMatchId() != null && other.getMatchId().equals(this.getMatchId()) == false)
            return false;
        if (other.getMatchType() == null ^ this.getMatchType() == null)
            return false;
        if (other.getMatchType() != null && other.getMatchType().equals(this.getMatchType()) == false)
            return false;
        if (other.getRuleLevel() == null ^ this.getRuleLevel() == null)
            return false;
        if (other.getRuleLevel() != null && other.getRuleLevel().equals(this.getRuleLevel()) == false)
            return false;
        if (other.getConfidenceScore() == null ^ this.getConfidenceScore() == null)
            return false;
        if (other.getConfidenceScore() != null && other.getConfidenceScore().equals(this.getConfidenceScore()) == false)
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

        hashCode = prime * hashCode + ((getProfileIds() == null) ? 0 : getProfileIds().hashCode());
        hashCode = prime * hashCode + ((getMatchId() == null) ? 0 : getMatchId().hashCode());
        hashCode = prime * hashCode + ((getMatchType() == null) ? 0 : getMatchType().hashCode());
        hashCode = prime * hashCode + ((getRuleLevel() == null) ? 0 : getRuleLevel().hashCode());
        hashCode = prime * hashCode + ((getConfidenceScore() == null) ? 0 : getConfidenceScore().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSimilarProfilesResult clone() {
        try {
            return (GetSimilarProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
