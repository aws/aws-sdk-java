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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines column statistics supported for Boolean data columns.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BooleanColumnStatisticsData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BooleanColumnStatisticsData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of true values in the column.
     * </p>
     */
    private Long numberOfTrues;
    /**
     * <p>
     * The number of false values in the column.
     * </p>
     */
    private Long numberOfFalses;
    /**
     * <p>
     * The number of null values in the column.
     * </p>
     */
    private Long numberOfNulls;

    /**
     * <p>
     * The number of true values in the column.
     * </p>
     * 
     * @param numberOfTrues
     *        The number of true values in the column.
     */

    public void setNumberOfTrues(Long numberOfTrues) {
        this.numberOfTrues = numberOfTrues;
    }

    /**
     * <p>
     * The number of true values in the column.
     * </p>
     * 
     * @return The number of true values in the column.
     */

    public Long getNumberOfTrues() {
        return this.numberOfTrues;
    }

    /**
     * <p>
     * The number of true values in the column.
     * </p>
     * 
     * @param numberOfTrues
     *        The number of true values in the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BooleanColumnStatisticsData withNumberOfTrues(Long numberOfTrues) {
        setNumberOfTrues(numberOfTrues);
        return this;
    }

    /**
     * <p>
     * The number of false values in the column.
     * </p>
     * 
     * @param numberOfFalses
     *        The number of false values in the column.
     */

    public void setNumberOfFalses(Long numberOfFalses) {
        this.numberOfFalses = numberOfFalses;
    }

    /**
     * <p>
     * The number of false values in the column.
     * </p>
     * 
     * @return The number of false values in the column.
     */

    public Long getNumberOfFalses() {
        return this.numberOfFalses;
    }

    /**
     * <p>
     * The number of false values in the column.
     * </p>
     * 
     * @param numberOfFalses
     *        The number of false values in the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BooleanColumnStatisticsData withNumberOfFalses(Long numberOfFalses) {
        setNumberOfFalses(numberOfFalses);
        return this;
    }

    /**
     * <p>
     * The number of null values in the column.
     * </p>
     * 
     * @param numberOfNulls
     *        The number of null values in the column.
     */

    public void setNumberOfNulls(Long numberOfNulls) {
        this.numberOfNulls = numberOfNulls;
    }

    /**
     * <p>
     * The number of null values in the column.
     * </p>
     * 
     * @return The number of null values in the column.
     */

    public Long getNumberOfNulls() {
        return this.numberOfNulls;
    }

    /**
     * <p>
     * The number of null values in the column.
     * </p>
     * 
     * @param numberOfNulls
     *        The number of null values in the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BooleanColumnStatisticsData withNumberOfNulls(Long numberOfNulls) {
        setNumberOfNulls(numberOfNulls);
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
        if (getNumberOfTrues() != null)
            sb.append("NumberOfTrues: ").append(getNumberOfTrues()).append(",");
        if (getNumberOfFalses() != null)
            sb.append("NumberOfFalses: ").append(getNumberOfFalses()).append(",");
        if (getNumberOfNulls() != null)
            sb.append("NumberOfNulls: ").append(getNumberOfNulls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BooleanColumnStatisticsData == false)
            return false;
        BooleanColumnStatisticsData other = (BooleanColumnStatisticsData) obj;
        if (other.getNumberOfTrues() == null ^ this.getNumberOfTrues() == null)
            return false;
        if (other.getNumberOfTrues() != null && other.getNumberOfTrues().equals(this.getNumberOfTrues()) == false)
            return false;
        if (other.getNumberOfFalses() == null ^ this.getNumberOfFalses() == null)
            return false;
        if (other.getNumberOfFalses() != null && other.getNumberOfFalses().equals(this.getNumberOfFalses()) == false)
            return false;
        if (other.getNumberOfNulls() == null ^ this.getNumberOfNulls() == null)
            return false;
        if (other.getNumberOfNulls() != null && other.getNumberOfNulls().equals(this.getNumberOfNulls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfTrues() == null) ? 0 : getNumberOfTrues().hashCode());
        hashCode = prime * hashCode + ((getNumberOfFalses() == null) ? 0 : getNumberOfFalses().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNulls() == null) ? 0 : getNumberOfNulls().hashCode());
        return hashCode;
    }

    @Override
    public BooleanColumnStatisticsData clone() {
        try {
            return (BooleanColumnStatisticsData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.BooleanColumnStatisticsDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
