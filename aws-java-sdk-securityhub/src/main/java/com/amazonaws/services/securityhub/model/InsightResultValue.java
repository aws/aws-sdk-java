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
 * The insight result values returned by the GetInsightResults operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InsightResultValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightResultValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the attribute by which the findings are grouped for the insight's whose results are returned by the
     * GetInsightResults operation.
     * </p>
     */
    private String groupByAttributeValue;
    /**
     * <p>
     * The number of findings returned for each GroupByAttributeValue.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The value of the attribute by which the findings are grouped for the insight's whose results are returned by the
     * GetInsightResults operation.
     * </p>
     * 
     * @param groupByAttributeValue
     *        The value of the attribute by which the findings are grouped for the insight's whose results are returned
     *        by the GetInsightResults operation.
     */

    public void setGroupByAttributeValue(String groupByAttributeValue) {
        this.groupByAttributeValue = groupByAttributeValue;
    }

    /**
     * <p>
     * The value of the attribute by which the findings are grouped for the insight's whose results are returned by the
     * GetInsightResults operation.
     * </p>
     * 
     * @return The value of the attribute by which the findings are grouped for the insight's whose results are returned
     *         by the GetInsightResults operation.
     */

    public String getGroupByAttributeValue() {
        return this.groupByAttributeValue;
    }

    /**
     * <p>
     * The value of the attribute by which the findings are grouped for the insight's whose results are returned by the
     * GetInsightResults operation.
     * </p>
     * 
     * @param groupByAttributeValue
     *        The value of the attribute by which the findings are grouped for the insight's whose results are returned
     *        by the GetInsightResults operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightResultValue withGroupByAttributeValue(String groupByAttributeValue) {
        setGroupByAttributeValue(groupByAttributeValue);
        return this;
    }

    /**
     * <p>
     * The number of findings returned for each GroupByAttributeValue.
     * </p>
     * 
     * @param count
     *        The number of findings returned for each GroupByAttributeValue.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of findings returned for each GroupByAttributeValue.
     * </p>
     * 
     * @return The number of findings returned for each GroupByAttributeValue.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of findings returned for each GroupByAttributeValue.
     * </p>
     * 
     * @param count
     *        The number of findings returned for each GroupByAttributeValue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightResultValue withCount(Integer count) {
        setCount(count);
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
        if (getGroupByAttributeValue() != null)
            sb.append("GroupByAttributeValue: ").append(getGroupByAttributeValue()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightResultValue == false)
            return false;
        InsightResultValue other = (InsightResultValue) obj;
        if (other.getGroupByAttributeValue() == null ^ this.getGroupByAttributeValue() == null)
            return false;
        if (other.getGroupByAttributeValue() != null && other.getGroupByAttributeValue().equals(this.getGroupByAttributeValue()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupByAttributeValue() == null) ? 0 : getGroupByAttributeValue().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public InsightResultValue clone() {
        try {
            return (InsightResultValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.InsightResultValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
