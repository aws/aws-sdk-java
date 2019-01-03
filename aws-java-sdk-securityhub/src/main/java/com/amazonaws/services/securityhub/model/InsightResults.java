/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The insight results returned by the GetInsightResults operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InsightResults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightResults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the insight whose results are returned by the GetInsightResults operation.
     * </p>
     */
    private String insightArn;
    /**
     * <p>
     * The attribute by which the findings are grouped for the insight's whose results are returned by the
     * GetInsightResults operation.
     * </p>
     */
    private String groupByAttribute;
    /**
     * <p>
     * The list of insight result values returned by the GetInsightResults operation.
     * </p>
     */
    private java.util.List<InsightResultValue> resultValues;

    /**
     * <p>
     * The ARN of the insight whose results are returned by the GetInsightResults operation.
     * </p>
     * 
     * @param insightArn
     *        The ARN of the insight whose results are returned by the GetInsightResults operation.
     */

    public void setInsightArn(String insightArn) {
        this.insightArn = insightArn;
    }

    /**
     * <p>
     * The ARN of the insight whose results are returned by the GetInsightResults operation.
     * </p>
     * 
     * @return The ARN of the insight whose results are returned by the GetInsightResults operation.
     */

    public String getInsightArn() {
        return this.insightArn;
    }

    /**
     * <p>
     * The ARN of the insight whose results are returned by the GetInsightResults operation.
     * </p>
     * 
     * @param insightArn
     *        The ARN of the insight whose results are returned by the GetInsightResults operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightResults withInsightArn(String insightArn) {
        setInsightArn(insightArn);
        return this;
    }

    /**
     * <p>
     * The attribute by which the findings are grouped for the insight's whose results are returned by the
     * GetInsightResults operation.
     * </p>
     * 
     * @param groupByAttribute
     *        The attribute by which the findings are grouped for the insight's whose results are returned by the
     *        GetInsightResults operation.
     */

    public void setGroupByAttribute(String groupByAttribute) {
        this.groupByAttribute = groupByAttribute;
    }

    /**
     * <p>
     * The attribute by which the findings are grouped for the insight's whose results are returned by the
     * GetInsightResults operation.
     * </p>
     * 
     * @return The attribute by which the findings are grouped for the insight's whose results are returned by the
     *         GetInsightResults operation.
     */

    public String getGroupByAttribute() {
        return this.groupByAttribute;
    }

    /**
     * <p>
     * The attribute by which the findings are grouped for the insight's whose results are returned by the
     * GetInsightResults operation.
     * </p>
     * 
     * @param groupByAttribute
     *        The attribute by which the findings are grouped for the insight's whose results are returned by the
     *        GetInsightResults operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightResults withGroupByAttribute(String groupByAttribute) {
        setGroupByAttribute(groupByAttribute);
        return this;
    }

    /**
     * <p>
     * The list of insight result values returned by the GetInsightResults operation.
     * </p>
     * 
     * @return The list of insight result values returned by the GetInsightResults operation.
     */

    public java.util.List<InsightResultValue> getResultValues() {
        return resultValues;
    }

    /**
     * <p>
     * The list of insight result values returned by the GetInsightResults operation.
     * </p>
     * 
     * @param resultValues
     *        The list of insight result values returned by the GetInsightResults operation.
     */

    public void setResultValues(java.util.Collection<InsightResultValue> resultValues) {
        if (resultValues == null) {
            this.resultValues = null;
            return;
        }

        this.resultValues = new java.util.ArrayList<InsightResultValue>(resultValues);
    }

    /**
     * <p>
     * The list of insight result values returned by the GetInsightResults operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultValues(java.util.Collection)} or {@link #withResultValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resultValues
     *        The list of insight result values returned by the GetInsightResults operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightResults withResultValues(InsightResultValue... resultValues) {
        if (this.resultValues == null) {
            setResultValues(new java.util.ArrayList<InsightResultValue>(resultValues.length));
        }
        for (InsightResultValue ele : resultValues) {
            this.resultValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of insight result values returned by the GetInsightResults operation.
     * </p>
     * 
     * @param resultValues
     *        The list of insight result values returned by the GetInsightResults operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightResults withResultValues(java.util.Collection<InsightResultValue> resultValues) {
        setResultValues(resultValues);
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
        if (getInsightArn() != null)
            sb.append("InsightArn: ").append(getInsightArn()).append(",");
        if (getGroupByAttribute() != null)
            sb.append("GroupByAttribute: ").append(getGroupByAttribute()).append(",");
        if (getResultValues() != null)
            sb.append("ResultValues: ").append(getResultValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightResults == false)
            return false;
        InsightResults other = (InsightResults) obj;
        if (other.getInsightArn() == null ^ this.getInsightArn() == null)
            return false;
        if (other.getInsightArn() != null && other.getInsightArn().equals(this.getInsightArn()) == false)
            return false;
        if (other.getGroupByAttribute() == null ^ this.getGroupByAttribute() == null)
            return false;
        if (other.getGroupByAttribute() != null && other.getGroupByAttribute().equals(this.getGroupByAttribute()) == false)
            return false;
        if (other.getResultValues() == null ^ this.getResultValues() == null)
            return false;
        if (other.getResultValues() != null && other.getResultValues().equals(this.getResultValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightArn() == null) ? 0 : getInsightArn().hashCode());
        hashCode = prime * hashCode + ((getGroupByAttribute() == null) ? 0 : getGroupByAttribute().hashCode());
        hashCode = prime * hashCode + ((getResultValues() == null) ? 0 : getResultValues().hashCode());
        return hashCode;
    }

    @Override
    public InsightResults clone() {
        try {
            return (InsightResults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.InsightResultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
