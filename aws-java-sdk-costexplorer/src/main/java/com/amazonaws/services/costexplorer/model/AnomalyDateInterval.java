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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The time period for an anomaly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/AnomalyDateInterval" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyDateInterval implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first date an anomaly was observed.
     * </p>
     */
    private String startDate;
    /**
     * <p>
     * The last date an anomaly was observed.
     * </p>
     */
    private String endDate;

    /**
     * <p>
     * The first date an anomaly was observed.
     * </p>
     * 
     * @param startDate
     *        The first date an anomaly was observed.
     */

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The first date an anomaly was observed.
     * </p>
     * 
     * @return The first date an anomaly was observed.
     */

    public String getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The first date an anomaly was observed.
     * </p>
     * 
     * @param startDate
     *        The first date an anomaly was observed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDateInterval withStartDate(String startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The last date an anomaly was observed.
     * </p>
     * 
     * @param endDate
     *        The last date an anomaly was observed.
     */

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The last date an anomaly was observed.
     * </p>
     * 
     * @return The last date an anomaly was observed.
     */

    public String getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The last date an anomaly was observed.
     * </p>
     * 
     * @param endDate
     *        The last date an anomaly was observed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDateInterval withEndDate(String endDate) {
        setEndDate(endDate);
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
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyDateInterval == false)
            return false;
        AnomalyDateInterval other = (AnomalyDateInterval) obj;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyDateInterval clone() {
        try {
            return (AnomalyDateInterval) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.AnomalyDateIntervalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
