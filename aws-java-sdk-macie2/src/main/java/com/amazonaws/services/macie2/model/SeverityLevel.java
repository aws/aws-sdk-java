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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a severity level for findings that a custom data identifier produces. A severity level determines which
 * severity is assigned to the findings, based on the number of occurrences of text that matches the custom data
 * identifier's detection criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SeverityLevel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SeverityLevel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of occurrences of text that must match the custom data identifier's detection criteria in
     * order to produce a finding with the specified severity (severity).
     * </p>
     */
    private Long occurrencesThreshold;
    /**
     * <p>
     * The severity to assign to a finding: if the number of occurrences is greater than or equal to the specified
     * threshold (occurrencesThreshold); and, if applicable, the number of occurrences is less than the threshold for
     * the next consecutive severity level for the custom data identifier, moving from LOW to HIGH.
     * </p>
     */
    private String severity;

    /**
     * <p>
     * The minimum number of occurrences of text that must match the custom data identifier's detection criteria in
     * order to produce a finding with the specified severity (severity).
     * </p>
     * 
     * @param occurrencesThreshold
     *        The minimum number of occurrences of text that must match the custom data identifier's detection criteria
     *        in order to produce a finding with the specified severity (severity).
     */

    public void setOccurrencesThreshold(Long occurrencesThreshold) {
        this.occurrencesThreshold = occurrencesThreshold;
    }

    /**
     * <p>
     * The minimum number of occurrences of text that must match the custom data identifier's detection criteria in
     * order to produce a finding with the specified severity (severity).
     * </p>
     * 
     * @return The minimum number of occurrences of text that must match the custom data identifier's detection criteria
     *         in order to produce a finding with the specified severity (severity).
     */

    public Long getOccurrencesThreshold() {
        return this.occurrencesThreshold;
    }

    /**
     * <p>
     * The minimum number of occurrences of text that must match the custom data identifier's detection criteria in
     * order to produce a finding with the specified severity (severity).
     * </p>
     * 
     * @param occurrencesThreshold
     *        The minimum number of occurrences of text that must match the custom data identifier's detection criteria
     *        in order to produce a finding with the specified severity (severity).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeverityLevel withOccurrencesThreshold(Long occurrencesThreshold) {
        setOccurrencesThreshold(occurrencesThreshold);
        return this;
    }

    /**
     * <p>
     * The severity to assign to a finding: if the number of occurrences is greater than or equal to the specified
     * threshold (occurrencesThreshold); and, if applicable, the number of occurrences is less than the threshold for
     * the next consecutive severity level for the custom data identifier, moving from LOW to HIGH.
     * </p>
     * 
     * @param severity
     *        The severity to assign to a finding: if the number of occurrences is greater than or equal to the
     *        specified threshold (occurrencesThreshold); and, if applicable, the number of occurrences is less than the
     *        threshold for the next consecutive severity level for the custom data identifier, moving from LOW to HIGH.
     * @see DataIdentifierSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity to assign to a finding: if the number of occurrences is greater than or equal to the specified
     * threshold (occurrencesThreshold); and, if applicable, the number of occurrences is less than the threshold for
     * the next consecutive severity level for the custom data identifier, moving from LOW to HIGH.
     * </p>
     * 
     * @return The severity to assign to a finding: if the number of occurrences is greater than or equal to the
     *         specified threshold (occurrencesThreshold); and, if applicable, the number of occurrences is less than
     *         the threshold for the next consecutive severity level for the custom data identifier, moving from LOW to
     *         HIGH.
     * @see DataIdentifierSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity to assign to a finding: if the number of occurrences is greater than or equal to the specified
     * threshold (occurrencesThreshold); and, if applicable, the number of occurrences is less than the threshold for
     * the next consecutive severity level for the custom data identifier, moving from LOW to HIGH.
     * </p>
     * 
     * @param severity
     *        The severity to assign to a finding: if the number of occurrences is greater than or equal to the
     *        specified threshold (occurrencesThreshold); and, if applicable, the number of occurrences is less than the
     *        threshold for the next consecutive severity level for the custom data identifier, moving from LOW to HIGH.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataIdentifierSeverity
     */

    public SeverityLevel withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity to assign to a finding: if the number of occurrences is greater than or equal to the specified
     * threshold (occurrencesThreshold); and, if applicable, the number of occurrences is less than the threshold for
     * the next consecutive severity level for the custom data identifier, moving from LOW to HIGH.
     * </p>
     * 
     * @param severity
     *        The severity to assign to a finding: if the number of occurrences is greater than or equal to the
     *        specified threshold (occurrencesThreshold); and, if applicable, the number of occurrences is less than the
     *        threshold for the next consecutive severity level for the custom data identifier, moving from LOW to HIGH.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataIdentifierSeverity
     */

    public SeverityLevel withSeverity(DataIdentifierSeverity severity) {
        this.severity = severity.toString();
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
        if (getOccurrencesThreshold() != null)
            sb.append("OccurrencesThreshold: ").append(getOccurrencesThreshold()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SeverityLevel == false)
            return false;
        SeverityLevel other = (SeverityLevel) obj;
        if (other.getOccurrencesThreshold() == null ^ this.getOccurrencesThreshold() == null)
            return false;
        if (other.getOccurrencesThreshold() != null && other.getOccurrencesThreshold().equals(this.getOccurrencesThreshold()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOccurrencesThreshold() == null) ? 0 : getOccurrencesThreshold().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        return hashCode;
    }

    @Override
    public SeverityLevel clone() {
        try {
            return (SeverityLevel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SeverityLevelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
