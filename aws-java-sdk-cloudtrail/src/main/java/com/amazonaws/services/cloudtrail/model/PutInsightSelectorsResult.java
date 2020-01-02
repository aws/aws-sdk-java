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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutInsightSelectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutInsightSelectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a trail for which you want to change or add Insights selectors.
     * </p>
     */
    private String trailARN;
    /**
     * <p>
     * A JSON string that contains the insight types you want to log on a trail. In this release, only
     * <code>ApiCallRateInsight</code> is supported as an insight type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InsightSelector> insightSelectors;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a trail for which you want to change or add Insights selectors.
     * </p>
     * 
     * @param trailARN
     *        The Amazon Resource Name (ARN) of a trail for which you want to change or add Insights selectors.
     */

    public void setTrailARN(String trailARN) {
        this.trailARN = trailARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a trail for which you want to change or add Insights selectors.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a trail for which you want to change or add Insights selectors.
     */

    public String getTrailARN() {
        return this.trailARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a trail for which you want to change or add Insights selectors.
     * </p>
     * 
     * @param trailARN
     *        The Amazon Resource Name (ARN) of a trail for which you want to change or add Insights selectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightSelectorsResult withTrailARN(String trailARN) {
        setTrailARN(trailARN);
        return this;
    }

    /**
     * <p>
     * A JSON string that contains the insight types you want to log on a trail. In this release, only
     * <code>ApiCallRateInsight</code> is supported as an insight type.
     * </p>
     * 
     * @return A JSON string that contains the insight types you want to log on a trail. In this release, only
     *         <code>ApiCallRateInsight</code> is supported as an insight type.
     */

    public java.util.List<InsightSelector> getInsightSelectors() {
        if (insightSelectors == null) {
            insightSelectors = new com.amazonaws.internal.SdkInternalList<InsightSelector>();
        }
        return insightSelectors;
    }

    /**
     * <p>
     * A JSON string that contains the insight types you want to log on a trail. In this release, only
     * <code>ApiCallRateInsight</code> is supported as an insight type.
     * </p>
     * 
     * @param insightSelectors
     *        A JSON string that contains the insight types you want to log on a trail. In this release, only
     *        <code>ApiCallRateInsight</code> is supported as an insight type.
     */

    public void setInsightSelectors(java.util.Collection<InsightSelector> insightSelectors) {
        if (insightSelectors == null) {
            this.insightSelectors = null;
            return;
        }

        this.insightSelectors = new com.amazonaws.internal.SdkInternalList<InsightSelector>(insightSelectors);
    }

    /**
     * <p>
     * A JSON string that contains the insight types you want to log on a trail. In this release, only
     * <code>ApiCallRateInsight</code> is supported as an insight type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsightSelectors(java.util.Collection)} or {@link #withInsightSelectors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param insightSelectors
     *        A JSON string that contains the insight types you want to log on a trail. In this release, only
     *        <code>ApiCallRateInsight</code> is supported as an insight type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightSelectorsResult withInsightSelectors(InsightSelector... insightSelectors) {
        if (this.insightSelectors == null) {
            setInsightSelectors(new com.amazonaws.internal.SdkInternalList<InsightSelector>(insightSelectors.length));
        }
        for (InsightSelector ele : insightSelectors) {
            this.insightSelectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON string that contains the insight types you want to log on a trail. In this release, only
     * <code>ApiCallRateInsight</code> is supported as an insight type.
     * </p>
     * 
     * @param insightSelectors
     *        A JSON string that contains the insight types you want to log on a trail. In this release, only
     *        <code>ApiCallRateInsight</code> is supported as an insight type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInsightSelectorsResult withInsightSelectors(java.util.Collection<InsightSelector> insightSelectors) {
        setInsightSelectors(insightSelectors);
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
        if (getTrailARN() != null)
            sb.append("TrailARN: ").append(getTrailARN()).append(",");
        if (getInsightSelectors() != null)
            sb.append("InsightSelectors: ").append(getInsightSelectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutInsightSelectorsResult == false)
            return false;
        PutInsightSelectorsResult other = (PutInsightSelectorsResult) obj;
        if (other.getTrailARN() == null ^ this.getTrailARN() == null)
            return false;
        if (other.getTrailARN() != null && other.getTrailARN().equals(this.getTrailARN()) == false)
            return false;
        if (other.getInsightSelectors() == null ^ this.getInsightSelectors() == null)
            return false;
        if (other.getInsightSelectors() != null && other.getInsightSelectors().equals(this.getInsightSelectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrailARN() == null) ? 0 : getTrailARN().hashCode());
        hashCode = prime * hashCode + ((getInsightSelectors() == null) ? 0 : getInsightSelectors().hashCode());
        return hashCode;
    }

    @Override
    public PutInsightSelectorsResult clone() {
        try {
            return (PutInsightSelectorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
