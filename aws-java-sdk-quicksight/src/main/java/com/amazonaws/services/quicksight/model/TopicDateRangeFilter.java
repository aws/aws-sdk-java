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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter used to restrict data based on a range of dates or times.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicDateRangeFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicDateRangeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean value that indicates whether the date range filter should include the boundary values. If set to true,
     * the filter includes the start and end dates. If set to false, the filter excludes them.
     * </p>
     */
    private Boolean inclusive;
    /**
     * <p>
     * The constant used in a date range filter.
     * </p>
     */
    private TopicRangeFilterConstant constant;

    /**
     * <p>
     * A Boolean value that indicates whether the date range filter should include the boundary values. If set to true,
     * the filter includes the start and end dates. If set to false, the filter excludes them.
     * </p>
     * 
     * @param inclusive
     *        A Boolean value that indicates whether the date range filter should include the boundary values. If set to
     *        true, the filter includes the start and end dates. If set to false, the filter excludes them.
     */

    public void setInclusive(Boolean inclusive) {
        this.inclusive = inclusive;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the date range filter should include the boundary values. If set to true,
     * the filter includes the start and end dates. If set to false, the filter excludes them.
     * </p>
     * 
     * @return A Boolean value that indicates whether the date range filter should include the boundary values. If set
     *         to true, the filter includes the start and end dates. If set to false, the filter excludes them.
     */

    public Boolean getInclusive() {
        return this.inclusive;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the date range filter should include the boundary values. If set to true,
     * the filter includes the start and end dates. If set to false, the filter excludes them.
     * </p>
     * 
     * @param inclusive
     *        A Boolean value that indicates whether the date range filter should include the boundary values. If set to
     *        true, the filter includes the start and end dates. If set to false, the filter excludes them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicDateRangeFilter withInclusive(Boolean inclusive) {
        setInclusive(inclusive);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the date range filter should include the boundary values. If set to true,
     * the filter includes the start and end dates. If set to false, the filter excludes them.
     * </p>
     * 
     * @return A Boolean value that indicates whether the date range filter should include the boundary values. If set
     *         to true, the filter includes the start and end dates. If set to false, the filter excludes them.
     */

    public Boolean isInclusive() {
        return this.inclusive;
    }

    /**
     * <p>
     * The constant used in a date range filter.
     * </p>
     * 
     * @param constant
     *        The constant used in a date range filter.
     */

    public void setConstant(TopicRangeFilterConstant constant) {
        this.constant = constant;
    }

    /**
     * <p>
     * The constant used in a date range filter.
     * </p>
     * 
     * @return The constant used in a date range filter.
     */

    public TopicRangeFilterConstant getConstant() {
        return this.constant;
    }

    /**
     * <p>
     * The constant used in a date range filter.
     * </p>
     * 
     * @param constant
     *        The constant used in a date range filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicDateRangeFilter withConstant(TopicRangeFilterConstant constant) {
        setConstant(constant);
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
        if (getInclusive() != null)
            sb.append("Inclusive: ").append(getInclusive()).append(",");
        if (getConstant() != null)
            sb.append("Constant: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicDateRangeFilter == false)
            return false;
        TopicDateRangeFilter other = (TopicDateRangeFilter) obj;
        if (other.getInclusive() == null ^ this.getInclusive() == null)
            return false;
        if (other.getInclusive() != null && other.getInclusive().equals(this.getInclusive()) == false)
            return false;
        if (other.getConstant() == null ^ this.getConstant() == null)
            return false;
        if (other.getConstant() != null && other.getConstant().equals(this.getConstant()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInclusive() == null) ? 0 : getInclusive().hashCode());
        hashCode = prime * hashCode + ((getConstant() == null) ? 0 : getConstant().hashCode());
        return hashCode;
    }

    @Override
    public TopicDateRangeFilter clone() {
        try {
            return (TopicDateRangeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicDateRangeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
