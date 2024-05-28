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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of findings metrics in an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/AccountFindingsMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountFindingsMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of closed findings of each severity in an account on the specified date.
     * </p>
     */
    private FindingMetricsValuePerSeverity closedFindings;
    /**
     * <p>
     * The date from which the finding metrics were retrieved.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * The average time it takes to close findings of each severity in days.
     * </p>
     */
    private FindingMetricsValuePerSeverity meanTimeToClose;
    /**
     * <p>
     * The number of new findings of each severity in account on the specified date.
     * </p>
     */
    private FindingMetricsValuePerSeverity newFindings;
    /**
     * <p>
     * The number of open findings of each severity in an account as of the specified date.
     * </p>
     */
    private FindingMetricsValuePerSeverity openFindings;

    /**
     * <p>
     * The number of closed findings of each severity in an account on the specified date.
     * </p>
     * 
     * @param closedFindings
     *        The number of closed findings of each severity in an account on the specified date.
     */

    public void setClosedFindings(FindingMetricsValuePerSeverity closedFindings) {
        this.closedFindings = closedFindings;
    }

    /**
     * <p>
     * The number of closed findings of each severity in an account on the specified date.
     * </p>
     * 
     * @return The number of closed findings of each severity in an account on the specified date.
     */

    public FindingMetricsValuePerSeverity getClosedFindings() {
        return this.closedFindings;
    }

    /**
     * <p>
     * The number of closed findings of each severity in an account on the specified date.
     * </p>
     * 
     * @param closedFindings
     *        The number of closed findings of each severity in an account on the specified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountFindingsMetric withClosedFindings(FindingMetricsValuePerSeverity closedFindings) {
        setClosedFindings(closedFindings);
        return this;
    }

    /**
     * <p>
     * The date from which the finding metrics were retrieved.
     * </p>
     * 
     * @param date
     *        The date from which the finding metrics were retrieved.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * The date from which the finding metrics were retrieved.
     * </p>
     * 
     * @return The date from which the finding metrics were retrieved.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date from which the finding metrics were retrieved.
     * </p>
     * 
     * @param date
     *        The date from which the finding metrics were retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountFindingsMetric withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * The average time it takes to close findings of each severity in days.
     * </p>
     * 
     * @param meanTimeToClose
     *        The average time it takes to close findings of each severity in days.
     */

    public void setMeanTimeToClose(FindingMetricsValuePerSeverity meanTimeToClose) {
        this.meanTimeToClose = meanTimeToClose;
    }

    /**
     * <p>
     * The average time it takes to close findings of each severity in days.
     * </p>
     * 
     * @return The average time it takes to close findings of each severity in days.
     */

    public FindingMetricsValuePerSeverity getMeanTimeToClose() {
        return this.meanTimeToClose;
    }

    /**
     * <p>
     * The average time it takes to close findings of each severity in days.
     * </p>
     * 
     * @param meanTimeToClose
     *        The average time it takes to close findings of each severity in days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountFindingsMetric withMeanTimeToClose(FindingMetricsValuePerSeverity meanTimeToClose) {
        setMeanTimeToClose(meanTimeToClose);
        return this;
    }

    /**
     * <p>
     * The number of new findings of each severity in account on the specified date.
     * </p>
     * 
     * @param newFindings
     *        The number of new findings of each severity in account on the specified date.
     */

    public void setNewFindings(FindingMetricsValuePerSeverity newFindings) {
        this.newFindings = newFindings;
    }

    /**
     * <p>
     * The number of new findings of each severity in account on the specified date.
     * </p>
     * 
     * @return The number of new findings of each severity in account on the specified date.
     */

    public FindingMetricsValuePerSeverity getNewFindings() {
        return this.newFindings;
    }

    /**
     * <p>
     * The number of new findings of each severity in account on the specified date.
     * </p>
     * 
     * @param newFindings
     *        The number of new findings of each severity in account on the specified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountFindingsMetric withNewFindings(FindingMetricsValuePerSeverity newFindings) {
        setNewFindings(newFindings);
        return this;
    }

    /**
     * <p>
     * The number of open findings of each severity in an account as of the specified date.
     * </p>
     * 
     * @param openFindings
     *        The number of open findings of each severity in an account as of the specified date.
     */

    public void setOpenFindings(FindingMetricsValuePerSeverity openFindings) {
        this.openFindings = openFindings;
    }

    /**
     * <p>
     * The number of open findings of each severity in an account as of the specified date.
     * </p>
     * 
     * @return The number of open findings of each severity in an account as of the specified date.
     */

    public FindingMetricsValuePerSeverity getOpenFindings() {
        return this.openFindings;
    }

    /**
     * <p>
     * The number of open findings of each severity in an account as of the specified date.
     * </p>
     * 
     * @param openFindings
     *        The number of open findings of each severity in an account as of the specified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountFindingsMetric withOpenFindings(FindingMetricsValuePerSeverity openFindings) {
        setOpenFindings(openFindings);
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
        if (getClosedFindings() != null)
            sb.append("ClosedFindings: ").append(getClosedFindings()).append(",");
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
        if (getMeanTimeToClose() != null)
            sb.append("MeanTimeToClose: ").append(getMeanTimeToClose()).append(",");
        if (getNewFindings() != null)
            sb.append("NewFindings: ").append(getNewFindings()).append(",");
        if (getOpenFindings() != null)
            sb.append("OpenFindings: ").append(getOpenFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountFindingsMetric == false)
            return false;
        AccountFindingsMetric other = (AccountFindingsMetric) obj;
        if (other.getClosedFindings() == null ^ this.getClosedFindings() == null)
            return false;
        if (other.getClosedFindings() != null && other.getClosedFindings().equals(this.getClosedFindings()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getMeanTimeToClose() == null ^ this.getMeanTimeToClose() == null)
            return false;
        if (other.getMeanTimeToClose() != null && other.getMeanTimeToClose().equals(this.getMeanTimeToClose()) == false)
            return false;
        if (other.getNewFindings() == null ^ this.getNewFindings() == null)
            return false;
        if (other.getNewFindings() != null && other.getNewFindings().equals(this.getNewFindings()) == false)
            return false;
        if (other.getOpenFindings() == null ^ this.getOpenFindings() == null)
            return false;
        if (other.getOpenFindings() != null && other.getOpenFindings().equals(this.getOpenFindings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClosedFindings() == null) ? 0 : getClosedFindings().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getMeanTimeToClose() == null) ? 0 : getMeanTimeToClose().hashCode());
        hashCode = prime * hashCode + ((getNewFindings() == null) ? 0 : getNewFindings().hashCode());
        hashCode = prime * hashCode + ((getOpenFindings() == null) ? 0 : getOpenFindings().hashCode());
        return hashCode;
    }

    @Override
    public AccountFindingsMetric clone() {
        try {
            return (AccountFindingsMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurusecurity.model.transform.AccountFindingsMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
