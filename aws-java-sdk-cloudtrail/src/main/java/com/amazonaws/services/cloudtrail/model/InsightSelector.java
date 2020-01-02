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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A JSON string that contains a list of insight types that are logged on a trail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/InsightSelector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of insights to log on a trail. In this release, only <code>ApiCallRateInsight</code> is supported as an
     * insight type.
     * </p>
     */
    private String insightType;

    /**
     * <p>
     * The type of insights to log on a trail. In this release, only <code>ApiCallRateInsight</code> is supported as an
     * insight type.
     * </p>
     * 
     * @param insightType
     *        The type of insights to log on a trail. In this release, only <code>ApiCallRateInsight</code> is supported
     *        as an insight type.
     * @see InsightType
     */

    public void setInsightType(String insightType) {
        this.insightType = insightType;
    }

    /**
     * <p>
     * The type of insights to log on a trail. In this release, only <code>ApiCallRateInsight</code> is supported as an
     * insight type.
     * </p>
     * 
     * @return The type of insights to log on a trail. In this release, only <code>ApiCallRateInsight</code> is
     *         supported as an insight type.
     * @see InsightType
     */

    public String getInsightType() {
        return this.insightType;
    }

    /**
     * <p>
     * The type of insights to log on a trail. In this release, only <code>ApiCallRateInsight</code> is supported as an
     * insight type.
     * </p>
     * 
     * @param insightType
     *        The type of insights to log on a trail. In this release, only <code>ApiCallRateInsight</code> is supported
     *        as an insight type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightType
     */

    public InsightSelector withInsightType(String insightType) {
        setInsightType(insightType);
        return this;
    }

    /**
     * <p>
     * The type of insights to log on a trail. In this release, only <code>ApiCallRateInsight</code> is supported as an
     * insight type.
     * </p>
     * 
     * @param insightType
     *        The type of insights to log on a trail. In this release, only <code>ApiCallRateInsight</code> is supported
     *        as an insight type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightType
     */

    public InsightSelector withInsightType(InsightType insightType) {
        this.insightType = insightType.toString();
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
        if (getInsightType() != null)
            sb.append("InsightType: ").append(getInsightType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightSelector == false)
            return false;
        InsightSelector other = (InsightSelector) obj;
        if (other.getInsightType() == null ^ this.getInsightType() == null)
            return false;
        if (other.getInsightType() != null && other.getInsightType().equals(this.getInsightType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightType() == null) ? 0 : getInsightType().hashCode());
        return hashCode;
    }

    @Override
    public InsightSelector clone() {
        try {
            return (InsightSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.InsightSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
