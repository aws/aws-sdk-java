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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSpotPlacementScoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Spot placement score for the top 10 Regions or Availability Zones, scored on a scale from 1 to 10. Each
     * score&#x2028; reflects how likely it is that each Region or Availability Zone will succeed at fulfilling the
     * specified target capacity&#x2028; <i>at the time of the Spot placement score request</i>. A score of
     * <code>10</code> means that your Spot capacity request is highly likely to succeed in that Region or Availability
     * Zone.
     * </p>
     * <p>
     * If you request a Spot placement score for Regions, a high score assumes that your fleet request will be
     * configured to use all Availability Zones and the <code>capacity-optimized</code> allocation strategy. If you
     * request a Spot placement score for Availability Zones, a high score assumes that your fleet request will be
     * configured to use a single Availability Zone and the <code>capacity-optimized</code> allocation strategy.
     * </p>
     * <p>
     * Different&#x2028; Regions or Availability Zones might return the same score.
     * </p>
     * <note>
     * <p>
     * The Spot placement score serves as a recommendation only. No score guarantees that your Spot request will be
     * fully or partially fulfilled.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<SpotPlacementScore> spotPlacementScores;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Spot placement score for the top 10 Regions or Availability Zones, scored on a scale from 1 to 10. Each
     * score&#x2028; reflects how likely it is that each Region or Availability Zone will succeed at fulfilling the
     * specified target capacity&#x2028; <i>at the time of the Spot placement score request</i>. A score of
     * <code>10</code> means that your Spot capacity request is highly likely to succeed in that Region or Availability
     * Zone.
     * </p>
     * <p>
     * If you request a Spot placement score for Regions, a high score assumes that your fleet request will be
     * configured to use all Availability Zones and the <code>capacity-optimized</code> allocation strategy. If you
     * request a Spot placement score for Availability Zones, a high score assumes that your fleet request will be
     * configured to use a single Availability Zone and the <code>capacity-optimized</code> allocation strategy.
     * </p>
     * <p>
     * Different&#x2028; Regions or Availability Zones might return the same score.
     * </p>
     * <note>
     * <p>
     * The Spot placement score serves as a recommendation only. No score guarantees that your Spot request will be
     * fully or partially fulfilled.
     * </p>
     * </note>
     * 
     * @return The Spot placement score for the top 10 Regions or Availability Zones, scored on a scale from 1 to 10.
     *         Each score&#x2028; reflects how likely it is that each Region or Availability Zone will succeed at
     *         fulfilling the specified target capacity&#x2028; <i>at the time of the Spot placement score request</i>.
     *         A score of <code>10</code> means that your Spot capacity request is highly likely to succeed in that
     *         Region or Availability Zone. </p>
     *         <p>
     *         If you request a Spot placement score for Regions, a high score assumes that your fleet request will be
     *         configured to use all Availability Zones and the <code>capacity-optimized</code> allocation strategy. If
     *         you request a Spot placement score for Availability Zones, a high score assumes that your fleet request
     *         will be configured to use a single Availability Zone and the <code>capacity-optimized</code> allocation
     *         strategy.
     *         </p>
     *         <p>
     *         Different&#x2028; Regions or Availability Zones might return the same score.
     *         </p>
     *         <note>
     *         <p>
     *         The Spot placement score serves as a recommendation only. No score guarantees that your Spot request will
     *         be fully or partially fulfilled.
     *         </p>
     */

    public java.util.List<SpotPlacementScore> getSpotPlacementScores() {
        if (spotPlacementScores == null) {
            spotPlacementScores = new com.amazonaws.internal.SdkInternalList<SpotPlacementScore>();
        }
        return spotPlacementScores;
    }

    /**
     * <p>
     * The Spot placement score for the top 10 Regions or Availability Zones, scored on a scale from 1 to 10. Each
     * score&#x2028; reflects how likely it is that each Region or Availability Zone will succeed at fulfilling the
     * specified target capacity&#x2028; <i>at the time of the Spot placement score request</i>. A score of
     * <code>10</code> means that your Spot capacity request is highly likely to succeed in that Region or Availability
     * Zone.
     * </p>
     * <p>
     * If you request a Spot placement score for Regions, a high score assumes that your fleet request will be
     * configured to use all Availability Zones and the <code>capacity-optimized</code> allocation strategy. If you
     * request a Spot placement score for Availability Zones, a high score assumes that your fleet request will be
     * configured to use a single Availability Zone and the <code>capacity-optimized</code> allocation strategy.
     * </p>
     * <p>
     * Different&#x2028; Regions or Availability Zones might return the same score.
     * </p>
     * <note>
     * <p>
     * The Spot placement score serves as a recommendation only. No score guarantees that your Spot request will be
     * fully or partially fulfilled.
     * </p>
     * </note>
     * 
     * @param spotPlacementScores
     *        The Spot placement score for the top 10 Regions or Availability Zones, scored on a scale from 1 to 10.
     *        Each score&#x2028; reflects how likely it is that each Region or Availability Zone will succeed at
     *        fulfilling the specified target capacity&#x2028; <i>at the time of the Spot placement score request</i>. A
     *        score of <code>10</code> means that your Spot capacity request is highly likely to succeed in that Region
     *        or Availability Zone. </p>
     *        <p>
     *        If you request a Spot placement score for Regions, a high score assumes that your fleet request will be
     *        configured to use all Availability Zones and the <code>capacity-optimized</code> allocation strategy. If
     *        you request a Spot placement score for Availability Zones, a high score assumes that your fleet request
     *        will be configured to use a single Availability Zone and the <code>capacity-optimized</code> allocation
     *        strategy.
     *        </p>
     *        <p>
     *        Different&#x2028; Regions or Availability Zones might return the same score.
     *        </p>
     *        <note>
     *        <p>
     *        The Spot placement score serves as a recommendation only. No score guarantees that your Spot request will
     *        be fully or partially fulfilled.
     *        </p>
     */

    public void setSpotPlacementScores(java.util.Collection<SpotPlacementScore> spotPlacementScores) {
        if (spotPlacementScores == null) {
            this.spotPlacementScores = null;
            return;
        }

        this.spotPlacementScores = new com.amazonaws.internal.SdkInternalList<SpotPlacementScore>(spotPlacementScores);
    }

    /**
     * <p>
     * The Spot placement score for the top 10 Regions or Availability Zones, scored on a scale from 1 to 10. Each
     * score&#x2028; reflects how likely it is that each Region or Availability Zone will succeed at fulfilling the
     * specified target capacity&#x2028; <i>at the time of the Spot placement score request</i>. A score of
     * <code>10</code> means that your Spot capacity request is highly likely to succeed in that Region or Availability
     * Zone.
     * </p>
     * <p>
     * If you request a Spot placement score for Regions, a high score assumes that your fleet request will be
     * configured to use all Availability Zones and the <code>capacity-optimized</code> allocation strategy. If you
     * request a Spot placement score for Availability Zones, a high score assumes that your fleet request will be
     * configured to use a single Availability Zone and the <code>capacity-optimized</code> allocation strategy.
     * </p>
     * <p>
     * Different&#x2028; Regions or Availability Zones might return the same score.
     * </p>
     * <note>
     * <p>
     * The Spot placement score serves as a recommendation only. No score guarantees that your Spot request will be
     * fully or partially fulfilled.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpotPlacementScores(java.util.Collection)} or {@link #withSpotPlacementScores(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param spotPlacementScores
     *        The Spot placement score for the top 10 Regions or Availability Zones, scored on a scale from 1 to 10.
     *        Each score&#x2028; reflects how likely it is that each Region or Availability Zone will succeed at
     *        fulfilling the specified target capacity&#x2028; <i>at the time of the Spot placement score request</i>. A
     *        score of <code>10</code> means that your Spot capacity request is highly likely to succeed in that Region
     *        or Availability Zone. </p>
     *        <p>
     *        If you request a Spot placement score for Regions, a high score assumes that your fleet request will be
     *        configured to use all Availability Zones and the <code>capacity-optimized</code> allocation strategy. If
     *        you request a Spot placement score for Availability Zones, a high score assumes that your fleet request
     *        will be configured to use a single Availability Zone and the <code>capacity-optimized</code> allocation
     *        strategy.
     *        </p>
     *        <p>
     *        Different&#x2028; Regions or Availability Zones might return the same score.
     *        </p>
     *        <note>
     *        <p>
     *        The Spot placement score serves as a recommendation only. No score guarantees that your Spot request will
     *        be fully or partially fulfilled.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSpotPlacementScoresResult withSpotPlacementScores(SpotPlacementScore... spotPlacementScores) {
        if (this.spotPlacementScores == null) {
            setSpotPlacementScores(new com.amazonaws.internal.SdkInternalList<SpotPlacementScore>(spotPlacementScores.length));
        }
        for (SpotPlacementScore ele : spotPlacementScores) {
            this.spotPlacementScores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Spot placement score for the top 10 Regions or Availability Zones, scored on a scale from 1 to 10. Each
     * score&#x2028; reflects how likely it is that each Region or Availability Zone will succeed at fulfilling the
     * specified target capacity&#x2028; <i>at the time of the Spot placement score request</i>. A score of
     * <code>10</code> means that your Spot capacity request is highly likely to succeed in that Region or Availability
     * Zone.
     * </p>
     * <p>
     * If you request a Spot placement score for Regions, a high score assumes that your fleet request will be
     * configured to use all Availability Zones and the <code>capacity-optimized</code> allocation strategy. If you
     * request a Spot placement score for Availability Zones, a high score assumes that your fleet request will be
     * configured to use a single Availability Zone and the <code>capacity-optimized</code> allocation strategy.
     * </p>
     * <p>
     * Different&#x2028; Regions or Availability Zones might return the same score.
     * </p>
     * <note>
     * <p>
     * The Spot placement score serves as a recommendation only. No score guarantees that your Spot request will be
     * fully or partially fulfilled.
     * </p>
     * </note>
     * 
     * @param spotPlacementScores
     *        The Spot placement score for the top 10 Regions or Availability Zones, scored on a scale from 1 to 10.
     *        Each score&#x2028; reflects how likely it is that each Region or Availability Zone will succeed at
     *        fulfilling the specified target capacity&#x2028; <i>at the time of the Spot placement score request</i>. A
     *        score of <code>10</code> means that your Spot capacity request is highly likely to succeed in that Region
     *        or Availability Zone. </p>
     *        <p>
     *        If you request a Spot placement score for Regions, a high score assumes that your fleet request will be
     *        configured to use all Availability Zones and the <code>capacity-optimized</code> allocation strategy. If
     *        you request a Spot placement score for Availability Zones, a high score assumes that your fleet request
     *        will be configured to use a single Availability Zone and the <code>capacity-optimized</code> allocation
     *        strategy.
     *        </p>
     *        <p>
     *        Different&#x2028; Regions or Availability Zones might return the same score.
     *        </p>
     *        <note>
     *        <p>
     *        The Spot placement score serves as a recommendation only. No score guarantees that your Spot request will
     *        be fully or partially fulfilled.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSpotPlacementScoresResult withSpotPlacementScores(java.util.Collection<SpotPlacementScore> spotPlacementScores) {
        setSpotPlacementScores(spotPlacementScores);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSpotPlacementScoresResult withNextToken(String nextToken) {
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
        if (getSpotPlacementScores() != null)
            sb.append("SpotPlacementScores: ").append(getSpotPlacementScores()).append(",");
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

        if (obj instanceof GetSpotPlacementScoresResult == false)
            return false;
        GetSpotPlacementScoresResult other = (GetSpotPlacementScoresResult) obj;
        if (other.getSpotPlacementScores() == null ^ this.getSpotPlacementScores() == null)
            return false;
        if (other.getSpotPlacementScores() != null && other.getSpotPlacementScores().equals(this.getSpotPlacementScores()) == false)
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

        hashCode = prime * hashCode + ((getSpotPlacementScores() == null) ? 0 : getSpotPlacementScores().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSpotPlacementScoresResult clone() {
        try {
            return (GetSpotPlacementScoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
