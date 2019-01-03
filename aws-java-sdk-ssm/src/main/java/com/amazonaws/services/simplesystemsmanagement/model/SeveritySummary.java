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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The number of managed instances found for each patch severity level defined in the request filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SeveritySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SeveritySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of critical. Critical severity is
     * determined by the organization that published the compliance items.
     * </p>
     */
    private Integer criticalCount;
    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of high. High severity is determined
     * by the organization that published the compliance items.
     * </p>
     */
    private Integer highCount;
    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of medium. Medium severity is
     * determined by the organization that published the compliance items.
     * </p>
     */
    private Integer mediumCount;
    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of low. Low severity is determined
     * by the organization that published the compliance items.
     * </p>
     */
    private Integer lowCount;
    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of informational. Informational
     * severity is determined by the organization that published the compliance items.
     * </p>
     */
    private Integer informationalCount;
    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of unspecified. Unspecified severity
     * is determined by the organization that published the compliance items.
     * </p>
     */
    private Integer unspecifiedCount;

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of critical. Critical severity is
     * determined by the organization that published the compliance items.
     * </p>
     * 
     * @param criticalCount
     *        The total number of resources or compliance items that have a severity level of critical. Critical
     *        severity is determined by the organization that published the compliance items.
     */

    public void setCriticalCount(Integer criticalCount) {
        this.criticalCount = criticalCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of critical. Critical severity is
     * determined by the organization that published the compliance items.
     * </p>
     * 
     * @return The total number of resources or compliance items that have a severity level of critical. Critical
     *         severity is determined by the organization that published the compliance items.
     */

    public Integer getCriticalCount() {
        return this.criticalCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of critical. Critical severity is
     * determined by the organization that published the compliance items.
     * </p>
     * 
     * @param criticalCount
     *        The total number of resources or compliance items that have a severity level of critical. Critical
     *        severity is determined by the organization that published the compliance items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeveritySummary withCriticalCount(Integer criticalCount) {
        setCriticalCount(criticalCount);
        return this;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of high. High severity is determined
     * by the organization that published the compliance items.
     * </p>
     * 
     * @param highCount
     *        The total number of resources or compliance items that have a severity level of high. High severity is
     *        determined by the organization that published the compliance items.
     */

    public void setHighCount(Integer highCount) {
        this.highCount = highCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of high. High severity is determined
     * by the organization that published the compliance items.
     * </p>
     * 
     * @return The total number of resources or compliance items that have a severity level of high. High severity is
     *         determined by the organization that published the compliance items.
     */

    public Integer getHighCount() {
        return this.highCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of high. High severity is determined
     * by the organization that published the compliance items.
     * </p>
     * 
     * @param highCount
     *        The total number of resources or compliance items that have a severity level of high. High severity is
     *        determined by the organization that published the compliance items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeveritySummary withHighCount(Integer highCount) {
        setHighCount(highCount);
        return this;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of medium. Medium severity is
     * determined by the organization that published the compliance items.
     * </p>
     * 
     * @param mediumCount
     *        The total number of resources or compliance items that have a severity level of medium. Medium severity is
     *        determined by the organization that published the compliance items.
     */

    public void setMediumCount(Integer mediumCount) {
        this.mediumCount = mediumCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of medium. Medium severity is
     * determined by the organization that published the compliance items.
     * </p>
     * 
     * @return The total number of resources or compliance items that have a severity level of medium. Medium severity
     *         is determined by the organization that published the compliance items.
     */

    public Integer getMediumCount() {
        return this.mediumCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of medium. Medium severity is
     * determined by the organization that published the compliance items.
     * </p>
     * 
     * @param mediumCount
     *        The total number of resources or compliance items that have a severity level of medium. Medium severity is
     *        determined by the organization that published the compliance items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeveritySummary withMediumCount(Integer mediumCount) {
        setMediumCount(mediumCount);
        return this;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of low. Low severity is determined
     * by the organization that published the compliance items.
     * </p>
     * 
     * @param lowCount
     *        The total number of resources or compliance items that have a severity level of low. Low severity is
     *        determined by the organization that published the compliance items.
     */

    public void setLowCount(Integer lowCount) {
        this.lowCount = lowCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of low. Low severity is determined
     * by the organization that published the compliance items.
     * </p>
     * 
     * @return The total number of resources or compliance items that have a severity level of low. Low severity is
     *         determined by the organization that published the compliance items.
     */

    public Integer getLowCount() {
        return this.lowCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of low. Low severity is determined
     * by the organization that published the compliance items.
     * </p>
     * 
     * @param lowCount
     *        The total number of resources or compliance items that have a severity level of low. Low severity is
     *        determined by the organization that published the compliance items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeveritySummary withLowCount(Integer lowCount) {
        setLowCount(lowCount);
        return this;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of informational. Informational
     * severity is determined by the organization that published the compliance items.
     * </p>
     * 
     * @param informationalCount
     *        The total number of resources or compliance items that have a severity level of informational.
     *        Informational severity is determined by the organization that published the compliance items.
     */

    public void setInformationalCount(Integer informationalCount) {
        this.informationalCount = informationalCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of informational. Informational
     * severity is determined by the organization that published the compliance items.
     * </p>
     * 
     * @return The total number of resources or compliance items that have a severity level of informational.
     *         Informational severity is determined by the organization that published the compliance items.
     */

    public Integer getInformationalCount() {
        return this.informationalCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of informational. Informational
     * severity is determined by the organization that published the compliance items.
     * </p>
     * 
     * @param informationalCount
     *        The total number of resources or compliance items that have a severity level of informational.
     *        Informational severity is determined by the organization that published the compliance items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeveritySummary withInformationalCount(Integer informationalCount) {
        setInformationalCount(informationalCount);
        return this;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of unspecified. Unspecified severity
     * is determined by the organization that published the compliance items.
     * </p>
     * 
     * @param unspecifiedCount
     *        The total number of resources or compliance items that have a severity level of unspecified. Unspecified
     *        severity is determined by the organization that published the compliance items.
     */

    public void setUnspecifiedCount(Integer unspecifiedCount) {
        this.unspecifiedCount = unspecifiedCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of unspecified. Unspecified severity
     * is determined by the organization that published the compliance items.
     * </p>
     * 
     * @return The total number of resources or compliance items that have a severity level of unspecified. Unspecified
     *         severity is determined by the organization that published the compliance items.
     */

    public Integer getUnspecifiedCount() {
        return this.unspecifiedCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity level of unspecified. Unspecified severity
     * is determined by the organization that published the compliance items.
     * </p>
     * 
     * @param unspecifiedCount
     *        The total number of resources or compliance items that have a severity level of unspecified. Unspecified
     *        severity is determined by the organization that published the compliance items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeveritySummary withUnspecifiedCount(Integer unspecifiedCount) {
        setUnspecifiedCount(unspecifiedCount);
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
        if (getCriticalCount() != null)
            sb.append("CriticalCount: ").append(getCriticalCount()).append(",");
        if (getHighCount() != null)
            sb.append("HighCount: ").append(getHighCount()).append(",");
        if (getMediumCount() != null)
            sb.append("MediumCount: ").append(getMediumCount()).append(",");
        if (getLowCount() != null)
            sb.append("LowCount: ").append(getLowCount()).append(",");
        if (getInformationalCount() != null)
            sb.append("InformationalCount: ").append(getInformationalCount()).append(",");
        if (getUnspecifiedCount() != null)
            sb.append("UnspecifiedCount: ").append(getUnspecifiedCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SeveritySummary == false)
            return false;
        SeveritySummary other = (SeveritySummary) obj;
        if (other.getCriticalCount() == null ^ this.getCriticalCount() == null)
            return false;
        if (other.getCriticalCount() != null && other.getCriticalCount().equals(this.getCriticalCount()) == false)
            return false;
        if (other.getHighCount() == null ^ this.getHighCount() == null)
            return false;
        if (other.getHighCount() != null && other.getHighCount().equals(this.getHighCount()) == false)
            return false;
        if (other.getMediumCount() == null ^ this.getMediumCount() == null)
            return false;
        if (other.getMediumCount() != null && other.getMediumCount().equals(this.getMediumCount()) == false)
            return false;
        if (other.getLowCount() == null ^ this.getLowCount() == null)
            return false;
        if (other.getLowCount() != null && other.getLowCount().equals(this.getLowCount()) == false)
            return false;
        if (other.getInformationalCount() == null ^ this.getInformationalCount() == null)
            return false;
        if (other.getInformationalCount() != null && other.getInformationalCount().equals(this.getInformationalCount()) == false)
            return false;
        if (other.getUnspecifiedCount() == null ^ this.getUnspecifiedCount() == null)
            return false;
        if (other.getUnspecifiedCount() != null && other.getUnspecifiedCount().equals(this.getUnspecifiedCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriticalCount() == null) ? 0 : getCriticalCount().hashCode());
        hashCode = prime * hashCode + ((getHighCount() == null) ? 0 : getHighCount().hashCode());
        hashCode = prime * hashCode + ((getMediumCount() == null) ? 0 : getMediumCount().hashCode());
        hashCode = prime * hashCode + ((getLowCount() == null) ? 0 : getLowCount().hashCode());
        hashCode = prime * hashCode + ((getInformationalCount() == null) ? 0 : getInformationalCount().hashCode());
        hashCode = prime * hashCode + ((getUnspecifiedCount() == null) ? 0 : getUnspecifiedCount().hashCode());
        return hashCode;
    }

    @Override
    public SeveritySummary clone() {
        try {
            return (SeveritySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.SeveritySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
