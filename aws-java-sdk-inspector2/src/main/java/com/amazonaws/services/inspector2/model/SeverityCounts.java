/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains the counts of aggregated finding per severity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/SeverityCounts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SeverityCounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total count of findings from all severities.
     * </p>
     */
    private Long all;
    /**
     * <p>
     * The total count of critical severity findings.
     * </p>
     */
    private Long critical;
    /**
     * <p>
     * The total count of high severity findings.
     * </p>
     */
    private Long high;
    /**
     * <p>
     * The total count of medium severity findings.
     * </p>
     */
    private Long medium;

    /**
     * <p>
     * The total count of findings from all severities.
     * </p>
     * 
     * @param all
     *        The total count of findings from all severities.
     */

    public void setAll(Long all) {
        this.all = all;
    }

    /**
     * <p>
     * The total count of findings from all severities.
     * </p>
     * 
     * @return The total count of findings from all severities.
     */

    public Long getAll() {
        return this.all;
    }

    /**
     * <p>
     * The total count of findings from all severities.
     * </p>
     * 
     * @param all
     *        The total count of findings from all severities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeverityCounts withAll(Long all) {
        setAll(all);
        return this;
    }

    /**
     * <p>
     * The total count of critical severity findings.
     * </p>
     * 
     * @param critical
     *        The total count of critical severity findings.
     */

    public void setCritical(Long critical) {
        this.critical = critical;
    }

    /**
     * <p>
     * The total count of critical severity findings.
     * </p>
     * 
     * @return The total count of critical severity findings.
     */

    public Long getCritical() {
        return this.critical;
    }

    /**
     * <p>
     * The total count of critical severity findings.
     * </p>
     * 
     * @param critical
     *        The total count of critical severity findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeverityCounts withCritical(Long critical) {
        setCritical(critical);
        return this;
    }

    /**
     * <p>
     * The total count of high severity findings.
     * </p>
     * 
     * @param high
     *        The total count of high severity findings.
     */

    public void setHigh(Long high) {
        this.high = high;
    }

    /**
     * <p>
     * The total count of high severity findings.
     * </p>
     * 
     * @return The total count of high severity findings.
     */

    public Long getHigh() {
        return this.high;
    }

    /**
     * <p>
     * The total count of high severity findings.
     * </p>
     * 
     * @param high
     *        The total count of high severity findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeverityCounts withHigh(Long high) {
        setHigh(high);
        return this;
    }

    /**
     * <p>
     * The total count of medium severity findings.
     * </p>
     * 
     * @param medium
     *        The total count of medium severity findings.
     */

    public void setMedium(Long medium) {
        this.medium = medium;
    }

    /**
     * <p>
     * The total count of medium severity findings.
     * </p>
     * 
     * @return The total count of medium severity findings.
     */

    public Long getMedium() {
        return this.medium;
    }

    /**
     * <p>
     * The total count of medium severity findings.
     * </p>
     * 
     * @param medium
     *        The total count of medium severity findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeverityCounts withMedium(Long medium) {
        setMedium(medium);
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
        if (getAll() != null)
            sb.append("All: ").append(getAll()).append(",");
        if (getCritical() != null)
            sb.append("Critical: ").append(getCritical()).append(",");
        if (getHigh() != null)
            sb.append("High: ").append(getHigh()).append(",");
        if (getMedium() != null)
            sb.append("Medium: ").append(getMedium());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SeverityCounts == false)
            return false;
        SeverityCounts other = (SeverityCounts) obj;
        if (other.getAll() == null ^ this.getAll() == null)
            return false;
        if (other.getAll() != null && other.getAll().equals(this.getAll()) == false)
            return false;
        if (other.getCritical() == null ^ this.getCritical() == null)
            return false;
        if (other.getCritical() != null && other.getCritical().equals(this.getCritical()) == false)
            return false;
        if (other.getHigh() == null ^ this.getHigh() == null)
            return false;
        if (other.getHigh() != null && other.getHigh().equals(this.getHigh()) == false)
            return false;
        if (other.getMedium() == null ^ this.getMedium() == null)
            return false;
        if (other.getMedium() != null && other.getMedium().equals(this.getMedium()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAll() == null) ? 0 : getAll().hashCode());
        hashCode = prime * hashCode + ((getCritical() == null) ? 0 : getCritical().hashCode());
        hashCode = prime * hashCode + ((getHigh() == null) ? 0 : getHigh().hashCode());
        hashCode = prime * hashCode + ((getMedium() == null) ? 0 : getMedium().hashCode());
        return hashCode;
    }

    @Override
    public SeverityCounts clone() {
        try {
            return (SeverityCounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.SeverityCountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
