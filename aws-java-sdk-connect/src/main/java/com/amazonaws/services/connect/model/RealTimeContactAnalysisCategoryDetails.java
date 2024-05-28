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
 * Provides information about the category rule that was matched.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RealTimeContactAnalysisCategoryDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeContactAnalysisCategoryDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of PointOfInterest - objects describing a single match of a rule.
     * </p>
     */
    private java.util.List<RealTimeContactAnalysisPointOfInterest> pointsOfInterest;

    /**
     * <p>
     * List of PointOfInterest - objects describing a single match of a rule.
     * </p>
     * 
     * @return List of PointOfInterest - objects describing a single match of a rule.
     */

    public java.util.List<RealTimeContactAnalysisPointOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }

    /**
     * <p>
     * List of PointOfInterest - objects describing a single match of a rule.
     * </p>
     * 
     * @param pointsOfInterest
     *        List of PointOfInterest - objects describing a single match of a rule.
     */

    public void setPointsOfInterest(java.util.Collection<RealTimeContactAnalysisPointOfInterest> pointsOfInterest) {
        if (pointsOfInterest == null) {
            this.pointsOfInterest = null;
            return;
        }

        this.pointsOfInterest = new java.util.ArrayList<RealTimeContactAnalysisPointOfInterest>(pointsOfInterest);
    }

    /**
     * <p>
     * List of PointOfInterest - objects describing a single match of a rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPointsOfInterest(java.util.Collection)} or {@link #withPointsOfInterest(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pointsOfInterest
     *        List of PointOfInterest - objects describing a single match of a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisCategoryDetails withPointsOfInterest(RealTimeContactAnalysisPointOfInterest... pointsOfInterest) {
        if (this.pointsOfInterest == null) {
            setPointsOfInterest(new java.util.ArrayList<RealTimeContactAnalysisPointOfInterest>(pointsOfInterest.length));
        }
        for (RealTimeContactAnalysisPointOfInterest ele : pointsOfInterest) {
            this.pointsOfInterest.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of PointOfInterest - objects describing a single match of a rule.
     * </p>
     * 
     * @param pointsOfInterest
     *        List of PointOfInterest - objects describing a single match of a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisCategoryDetails withPointsOfInterest(java.util.Collection<RealTimeContactAnalysisPointOfInterest> pointsOfInterest) {
        setPointsOfInterest(pointsOfInterest);
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
        if (getPointsOfInterest() != null)
            sb.append("PointsOfInterest: ").append(getPointsOfInterest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisCategoryDetails == false)
            return false;
        RealTimeContactAnalysisCategoryDetails other = (RealTimeContactAnalysisCategoryDetails) obj;
        if (other.getPointsOfInterest() == null ^ this.getPointsOfInterest() == null)
            return false;
        if (other.getPointsOfInterest() != null && other.getPointsOfInterest().equals(this.getPointsOfInterest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPointsOfInterest() == null) ? 0 : getPointsOfInterest().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeContactAnalysisCategoryDetails clone() {
        try {
            return (RealTimeContactAnalysisCategoryDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RealTimeContactAnalysisCategoryDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
