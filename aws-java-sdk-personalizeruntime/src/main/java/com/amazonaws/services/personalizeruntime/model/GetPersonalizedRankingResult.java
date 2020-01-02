/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalizeruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/GetPersonalizedRanking"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPersonalizedRankingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of items in order of most likely interest to the user. The maximum is 500.
     * </p>
     */
    private java.util.List<PredictedItem> personalizedRanking;

    /**
     * <p>
     * A list of items in order of most likely interest to the user. The maximum is 500.
     * </p>
     * 
     * @return A list of items in order of most likely interest to the user. The maximum is 500.
     */

    public java.util.List<PredictedItem> getPersonalizedRanking() {
        return personalizedRanking;
    }

    /**
     * <p>
     * A list of items in order of most likely interest to the user. The maximum is 500.
     * </p>
     * 
     * @param personalizedRanking
     *        A list of items in order of most likely interest to the user. The maximum is 500.
     */

    public void setPersonalizedRanking(java.util.Collection<PredictedItem> personalizedRanking) {
        if (personalizedRanking == null) {
            this.personalizedRanking = null;
            return;
        }

        this.personalizedRanking = new java.util.ArrayList<PredictedItem>(personalizedRanking);
    }

    /**
     * <p>
     * A list of items in order of most likely interest to the user. The maximum is 500.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPersonalizedRanking(java.util.Collection)} or {@link #withPersonalizedRanking(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param personalizedRanking
     *        A list of items in order of most likely interest to the user. The maximum is 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonalizedRankingResult withPersonalizedRanking(PredictedItem... personalizedRanking) {
        if (this.personalizedRanking == null) {
            setPersonalizedRanking(new java.util.ArrayList<PredictedItem>(personalizedRanking.length));
        }
        for (PredictedItem ele : personalizedRanking) {
            this.personalizedRanking.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of items in order of most likely interest to the user. The maximum is 500.
     * </p>
     * 
     * @param personalizedRanking
     *        A list of items in order of most likely interest to the user. The maximum is 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonalizedRankingResult withPersonalizedRanking(java.util.Collection<PredictedItem> personalizedRanking) {
        setPersonalizedRanking(personalizedRanking);
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
        if (getPersonalizedRanking() != null)
            sb.append("PersonalizedRanking: ").append(getPersonalizedRanking());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPersonalizedRankingResult == false)
            return false;
        GetPersonalizedRankingResult other = (GetPersonalizedRankingResult) obj;
        if (other.getPersonalizedRanking() == null ^ this.getPersonalizedRanking() == null)
            return false;
        if (other.getPersonalizedRanking() != null && other.getPersonalizedRanking().equals(this.getPersonalizedRanking()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPersonalizedRanking() == null) ? 0 : getPersonalizedRanking().hashCode());
        return hashCode;
    }

    @Override
    public GetPersonalizedRankingResult clone() {
        try {
            return (GetPersonalizedRankingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
