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
 * The matched category rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RealTimeContactAnalysisSegmentCategories"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeContactAnalysisSegmentCategories implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Map between the name of the matched rule and RealTimeContactAnalysisCategoryDetails.
     * </p>
     */
    private java.util.Map<String, RealTimeContactAnalysisCategoryDetails> matchedDetails;

    /**
     * <p>
     * Map between the name of the matched rule and RealTimeContactAnalysisCategoryDetails.
     * </p>
     * 
     * @return Map between the name of the matched rule and RealTimeContactAnalysisCategoryDetails.
     */

    public java.util.Map<String, RealTimeContactAnalysisCategoryDetails> getMatchedDetails() {
        return matchedDetails;
    }

    /**
     * <p>
     * Map between the name of the matched rule and RealTimeContactAnalysisCategoryDetails.
     * </p>
     * 
     * @param matchedDetails
     *        Map between the name of the matched rule and RealTimeContactAnalysisCategoryDetails.
     */

    public void setMatchedDetails(java.util.Map<String, RealTimeContactAnalysisCategoryDetails> matchedDetails) {
        this.matchedDetails = matchedDetails;
    }

    /**
     * <p>
     * Map between the name of the matched rule and RealTimeContactAnalysisCategoryDetails.
     * </p>
     * 
     * @param matchedDetails
     *        Map between the name of the matched rule and RealTimeContactAnalysisCategoryDetails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentCategories withMatchedDetails(java.util.Map<String, RealTimeContactAnalysisCategoryDetails> matchedDetails) {
        setMatchedDetails(matchedDetails);
        return this;
    }

    /**
     * Add a single MatchedDetails entry
     *
     * @see RealTimeContactAnalysisSegmentCategories#withMatchedDetails
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentCategories addMatchedDetailsEntry(String key, RealTimeContactAnalysisCategoryDetails value) {
        if (null == this.matchedDetails) {
            this.matchedDetails = new java.util.HashMap<String, RealTimeContactAnalysisCategoryDetails>();
        }
        if (this.matchedDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.matchedDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MatchedDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentCategories clearMatchedDetailsEntries() {
        this.matchedDetails = null;
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
        if (getMatchedDetails() != null)
            sb.append("MatchedDetails: ").append(getMatchedDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisSegmentCategories == false)
            return false;
        RealTimeContactAnalysisSegmentCategories other = (RealTimeContactAnalysisSegmentCategories) obj;
        if (other.getMatchedDetails() == null ^ this.getMatchedDetails() == null)
            return false;
        if (other.getMatchedDetails() != null && other.getMatchedDetails().equals(this.getMatchedDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchedDetails() == null) ? 0 : getMatchedDetails().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeContactAnalysisSegmentCategories clone() {
        try {
            return (RealTimeContactAnalysisSegmentCategories) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RealTimeContactAnalysisSegmentCategoriesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
