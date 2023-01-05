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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetArchitectureRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArchitectureRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The time that a recovery group was last assessed for recommendations, in UTC ISO-8601 format.
     * </p>
     */
    private java.util.Date lastAuditTimestamp;
    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of the recommendations for the customer's application.
     * </p>
     */
    private java.util.List<Recommendation> recommendations;

    /**
     * <p>
     * The time that a recovery group was last assessed for recommendations, in UTC ISO-8601 format.
     * </p>
     * 
     * @param lastAuditTimestamp
     *        The time that a recovery group was last assessed for recommendations, in UTC ISO-8601 format.
     */

    public void setLastAuditTimestamp(java.util.Date lastAuditTimestamp) {
        this.lastAuditTimestamp = lastAuditTimestamp;
    }

    /**
     * <p>
     * The time that a recovery group was last assessed for recommendations, in UTC ISO-8601 format.
     * </p>
     * 
     * @return The time that a recovery group was last assessed for recommendations, in UTC ISO-8601 format.
     */

    public java.util.Date getLastAuditTimestamp() {
        return this.lastAuditTimestamp;
    }

    /**
     * <p>
     * The time that a recovery group was last assessed for recommendations, in UTC ISO-8601 format.
     * </p>
     * 
     * @param lastAuditTimestamp
     *        The time that a recovery group was last assessed for recommendations, in UTC ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchitectureRecommendationsResult withLastAuditTimestamp(java.util.Date lastAuditTimestamp) {
        setLastAuditTimestamp(lastAuditTimestamp);
        return this;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @return The token that identifies which batch of results you want to see.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchitectureRecommendationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of the recommendations for the customer's application.
     * </p>
     * 
     * @return A list of the recommendations for the customer's application.
     */

    public java.util.List<Recommendation> getRecommendations() {
        return recommendations;
    }

    /**
     * <p>
     * A list of the recommendations for the customer's application.
     * </p>
     * 
     * @param recommendations
     *        A list of the recommendations for the customer's application.
     */

    public void setRecommendations(java.util.Collection<Recommendation> recommendations) {
        if (recommendations == null) {
            this.recommendations = null;
            return;
        }

        this.recommendations = new java.util.ArrayList<Recommendation>(recommendations);
    }

    /**
     * <p>
     * A list of the recommendations for the customer's application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendations(java.util.Collection)} or {@link #withRecommendations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recommendations
     *        A list of the recommendations for the customer's application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchitectureRecommendationsResult withRecommendations(Recommendation... recommendations) {
        if (this.recommendations == null) {
            setRecommendations(new java.util.ArrayList<Recommendation>(recommendations.length));
        }
        for (Recommendation ele : recommendations) {
            this.recommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the recommendations for the customer's application.
     * </p>
     * 
     * @param recommendations
     *        A list of the recommendations for the customer's application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchitectureRecommendationsResult withRecommendations(java.util.Collection<Recommendation> recommendations) {
        setRecommendations(recommendations);
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
        if (getLastAuditTimestamp() != null)
            sb.append("LastAuditTimestamp: ").append(getLastAuditTimestamp()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRecommendations() != null)
            sb.append("Recommendations: ").append(getRecommendations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetArchitectureRecommendationsResult == false)
            return false;
        GetArchitectureRecommendationsResult other = (GetArchitectureRecommendationsResult) obj;
        if (other.getLastAuditTimestamp() == null ^ this.getLastAuditTimestamp() == null)
            return false;
        if (other.getLastAuditTimestamp() != null && other.getLastAuditTimestamp().equals(this.getLastAuditTimestamp()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecommendations() == null ^ this.getRecommendations() == null)
            return false;
        if (other.getRecommendations() != null && other.getRecommendations().equals(this.getRecommendations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastAuditTimestamp() == null) ? 0 : getLastAuditTimestamp().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecommendations() == null) ? 0 : getRecommendations().hashCode());
        return hashCode;
    }

    @Override
    public GetArchitectureRecommendationsResult clone() {
        try {
            return (GetArchitectureRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
