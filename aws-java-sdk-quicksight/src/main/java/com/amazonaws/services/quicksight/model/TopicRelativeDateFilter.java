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
 * A structure that represents a relative date filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicRelativeDateFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicRelativeDateFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     */
    private String timeGranularity;
    /**
     * <p>
     * The function to be used in a relative date filter to determine the range of dates to include in the results.
     * Valid values for this structure are <code>BEFORE</code>, <code>AFTER</code>, and <code>BETWEEN</code>.
     * </p>
     */
    private String relativeDateFilterFunction;
    /**
     * <p>
     * The constant used in a relative date filter.
     * </p>
     */
    private TopicSingularFilterConstant constant;

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @see TopicTimeGranularity
     */

    public void setTimeGranularity(String timeGranularity) {
        this.timeGranularity = timeGranularity;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @return The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @see TopicTimeGranularity
     */

    public String getTimeGranularity() {
        return this.timeGranularity;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicTimeGranularity
     */

    public TopicRelativeDateFilter withTimeGranularity(String timeGranularity) {
        setTimeGranularity(timeGranularity);
        return this;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicTimeGranularity
     */

    public TopicRelativeDateFilter withTimeGranularity(TopicTimeGranularity timeGranularity) {
        this.timeGranularity = timeGranularity.toString();
        return this;
    }

    /**
     * <p>
     * The function to be used in a relative date filter to determine the range of dates to include in the results.
     * Valid values for this structure are <code>BEFORE</code>, <code>AFTER</code>, and <code>BETWEEN</code>.
     * </p>
     * 
     * @param relativeDateFilterFunction
     *        The function to be used in a relative date filter to determine the range of dates to include in the
     *        results. Valid values for this structure are <code>BEFORE</code>, <code>AFTER</code>, and
     *        <code>BETWEEN</code>.
     * @see TopicRelativeDateFilterFunction
     */

    public void setRelativeDateFilterFunction(String relativeDateFilterFunction) {
        this.relativeDateFilterFunction = relativeDateFilterFunction;
    }

    /**
     * <p>
     * The function to be used in a relative date filter to determine the range of dates to include in the results.
     * Valid values for this structure are <code>BEFORE</code>, <code>AFTER</code>, and <code>BETWEEN</code>.
     * </p>
     * 
     * @return The function to be used in a relative date filter to determine the range of dates to include in the
     *         results. Valid values for this structure are <code>BEFORE</code>, <code>AFTER</code>, and
     *         <code>BETWEEN</code>.
     * @see TopicRelativeDateFilterFunction
     */

    public String getRelativeDateFilterFunction() {
        return this.relativeDateFilterFunction;
    }

    /**
     * <p>
     * The function to be used in a relative date filter to determine the range of dates to include in the results.
     * Valid values for this structure are <code>BEFORE</code>, <code>AFTER</code>, and <code>BETWEEN</code>.
     * </p>
     * 
     * @param relativeDateFilterFunction
     *        The function to be used in a relative date filter to determine the range of dates to include in the
     *        results. Valid values for this structure are <code>BEFORE</code>, <code>AFTER</code>, and
     *        <code>BETWEEN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicRelativeDateFilterFunction
     */

    public TopicRelativeDateFilter withRelativeDateFilterFunction(String relativeDateFilterFunction) {
        setRelativeDateFilterFunction(relativeDateFilterFunction);
        return this;
    }

    /**
     * <p>
     * The function to be used in a relative date filter to determine the range of dates to include in the results.
     * Valid values for this structure are <code>BEFORE</code>, <code>AFTER</code>, and <code>BETWEEN</code>.
     * </p>
     * 
     * @param relativeDateFilterFunction
     *        The function to be used in a relative date filter to determine the range of dates to include in the
     *        results. Valid values for this structure are <code>BEFORE</code>, <code>AFTER</code>, and
     *        <code>BETWEEN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicRelativeDateFilterFunction
     */

    public TopicRelativeDateFilter withRelativeDateFilterFunction(TopicRelativeDateFilterFunction relativeDateFilterFunction) {
        this.relativeDateFilterFunction = relativeDateFilterFunction.toString();
        return this;
    }

    /**
     * <p>
     * The constant used in a relative date filter.
     * </p>
     * 
     * @param constant
     *        The constant used in a relative date filter.
     */

    public void setConstant(TopicSingularFilterConstant constant) {
        this.constant = constant;
    }

    /**
     * <p>
     * The constant used in a relative date filter.
     * </p>
     * 
     * @return The constant used in a relative date filter.
     */

    public TopicSingularFilterConstant getConstant() {
        return this.constant;
    }

    /**
     * <p>
     * The constant used in a relative date filter.
     * </p>
     * 
     * @param constant
     *        The constant used in a relative date filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRelativeDateFilter withConstant(TopicSingularFilterConstant constant) {
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
        if (getTimeGranularity() != null)
            sb.append("TimeGranularity: ").append(getTimeGranularity()).append(",");
        if (getRelativeDateFilterFunction() != null)
            sb.append("RelativeDateFilterFunction: ").append(getRelativeDateFilterFunction()).append(",");
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

        if (obj instanceof TopicRelativeDateFilter == false)
            return false;
        TopicRelativeDateFilter other = (TopicRelativeDateFilter) obj;
        if (other.getTimeGranularity() == null ^ this.getTimeGranularity() == null)
            return false;
        if (other.getTimeGranularity() != null && other.getTimeGranularity().equals(this.getTimeGranularity()) == false)
            return false;
        if (other.getRelativeDateFilterFunction() == null ^ this.getRelativeDateFilterFunction() == null)
            return false;
        if (other.getRelativeDateFilterFunction() != null && other.getRelativeDateFilterFunction().equals(this.getRelativeDateFilterFunction()) == false)
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

        hashCode = prime * hashCode + ((getTimeGranularity() == null) ? 0 : getTimeGranularity().hashCode());
        hashCode = prime * hashCode + ((getRelativeDateFilterFunction() == null) ? 0 : getRelativeDateFilterFunction().hashCode());
        hashCode = prime * hashCode + ((getConstant() == null) ? 0 : getConstant().hashCode());
        return hashCode;
    }

    @Override
    public TopicRelativeDateFilter clone() {
        try {
            return (TopicRelativeDateFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicRelativeDateFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
