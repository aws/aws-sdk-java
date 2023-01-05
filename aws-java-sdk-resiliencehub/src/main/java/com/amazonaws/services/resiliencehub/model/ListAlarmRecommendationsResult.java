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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAlarmRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAlarmRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The alarm recommendations for an AWS Resilience Hub application, returned as an object. This object includes
     * application component names, descriptions, information about whether a recommendation has already been
     * implemented or not, prerequisites, and more.
     * </p>
     */
    private java.util.List<AlarmRecommendation> alarmRecommendations;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The alarm recommendations for an AWS Resilience Hub application, returned as an object. This object includes
     * application component names, descriptions, information about whether a recommendation has already been
     * implemented or not, prerequisites, and more.
     * </p>
     * 
     * @return The alarm recommendations for an AWS Resilience Hub application, returned as an object. This object
     *         includes application component names, descriptions, information about whether a recommendation has
     *         already been implemented or not, prerequisites, and more.
     */

    public java.util.List<AlarmRecommendation> getAlarmRecommendations() {
        return alarmRecommendations;
    }

    /**
     * <p>
     * The alarm recommendations for an AWS Resilience Hub application, returned as an object. This object includes
     * application component names, descriptions, information about whether a recommendation has already been
     * implemented or not, prerequisites, and more.
     * </p>
     * 
     * @param alarmRecommendations
     *        The alarm recommendations for an AWS Resilience Hub application, returned as an object. This object
     *        includes application component names, descriptions, information about whether a recommendation has already
     *        been implemented or not, prerequisites, and more.
     */

    public void setAlarmRecommendations(java.util.Collection<AlarmRecommendation> alarmRecommendations) {
        if (alarmRecommendations == null) {
            this.alarmRecommendations = null;
            return;
        }

        this.alarmRecommendations = new java.util.ArrayList<AlarmRecommendation>(alarmRecommendations);
    }

    /**
     * <p>
     * The alarm recommendations for an AWS Resilience Hub application, returned as an object. This object includes
     * application component names, descriptions, information about whether a recommendation has already been
     * implemented or not, prerequisites, and more.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmRecommendations(java.util.Collection)} or {@link #withAlarmRecommendations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param alarmRecommendations
     *        The alarm recommendations for an AWS Resilience Hub application, returned as an object. This object
     *        includes application component names, descriptions, information about whether a recommendation has already
     *        been implemented or not, prerequisites, and more.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlarmRecommendationsResult withAlarmRecommendations(AlarmRecommendation... alarmRecommendations) {
        if (this.alarmRecommendations == null) {
            setAlarmRecommendations(new java.util.ArrayList<AlarmRecommendation>(alarmRecommendations.length));
        }
        for (AlarmRecommendation ele : alarmRecommendations) {
            this.alarmRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The alarm recommendations for an AWS Resilience Hub application, returned as an object. This object includes
     * application component names, descriptions, information about whether a recommendation has already been
     * implemented or not, prerequisites, and more.
     * </p>
     * 
     * @param alarmRecommendations
     *        The alarm recommendations for an AWS Resilience Hub application, returned as an object. This object
     *        includes application component names, descriptions, information about whether a recommendation has already
     *        been implemented or not, prerequisites, and more.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlarmRecommendationsResult withAlarmRecommendations(java.util.Collection<AlarmRecommendation> alarmRecommendations) {
        setAlarmRecommendations(alarmRecommendations);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlarmRecommendationsResult withNextToken(String nextToken) {
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
        if (getAlarmRecommendations() != null)
            sb.append("AlarmRecommendations: ").append(getAlarmRecommendations()).append(",");
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

        if (obj instanceof ListAlarmRecommendationsResult == false)
            return false;
        ListAlarmRecommendationsResult other = (ListAlarmRecommendationsResult) obj;
        if (other.getAlarmRecommendations() == null ^ this.getAlarmRecommendations() == null)
            return false;
        if (other.getAlarmRecommendations() != null && other.getAlarmRecommendations().equals(this.getAlarmRecommendations()) == false)
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

        hashCode = prime * hashCode + ((getAlarmRecommendations() == null) ? 0 : getAlarmRecommendations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAlarmRecommendationsResult clone() {
        try {
            return (ListAlarmRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
