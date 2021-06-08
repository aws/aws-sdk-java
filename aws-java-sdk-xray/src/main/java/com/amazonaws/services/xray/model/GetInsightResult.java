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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsight" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summary information of an insight.
     * </p>
     */
    private Insight insight;

    /**
     * <p>
     * The summary information of an insight.
     * </p>
     * 
     * @param insight
     *        The summary information of an insight.
     */

    public void setInsight(Insight insight) {
        this.insight = insight;
    }

    /**
     * <p>
     * The summary information of an insight.
     * </p>
     * 
     * @return The summary information of an insight.
     */

    public Insight getInsight() {
        return this.insight;
    }

    /**
     * <p>
     * The summary information of an insight.
     * </p>
     * 
     * @param insight
     *        The summary information of an insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightResult withInsight(Insight insight) {
        setInsight(insight);
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
        if (getInsight() != null)
            sb.append("Insight: ").append(getInsight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInsightResult == false)
            return false;
        GetInsightResult other = (GetInsightResult) obj;
        if (other.getInsight() == null ^ this.getInsight() == null)
            return false;
        if (other.getInsight() != null && other.getInsight().equals(this.getInsight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsight() == null) ? 0 : getInsight().hashCode());
        return hashCode;
    }

    @Override
    public GetInsightResult clone() {
        try {
            return (GetInsightResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
