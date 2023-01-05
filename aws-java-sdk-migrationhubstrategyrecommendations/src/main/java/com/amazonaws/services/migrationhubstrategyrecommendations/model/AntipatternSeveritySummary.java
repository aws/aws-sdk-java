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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the summary of anti-patterns and their severity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/AntipatternSeveritySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AntipatternSeveritySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the count of anti-patterns.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * Contains the severity of anti-patterns.
     * </p>
     */
    private String severity;

    /**
     * <p>
     * Contains the count of anti-patterns.
     * </p>
     * 
     * @param count
     *        Contains the count of anti-patterns.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * Contains the count of anti-patterns.
     * </p>
     * 
     * @return Contains the count of anti-patterns.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * Contains the count of anti-patterns.
     * </p>
     * 
     * @param count
     *        Contains the count of anti-patterns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AntipatternSeveritySummary withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * Contains the severity of anti-patterns.
     * </p>
     * 
     * @param severity
     *        Contains the severity of anti-patterns.
     * @see Severity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * Contains the severity of anti-patterns.
     * </p>
     * 
     * @return Contains the severity of anti-patterns.
     * @see Severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * Contains the severity of anti-patterns.
     * </p>
     * 
     * @param severity
     *        Contains the severity of anti-patterns.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public AntipatternSeveritySummary withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * Contains the severity of anti-patterns.
     * </p>
     * 
     * @param severity
     *        Contains the severity of anti-patterns.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public AntipatternSeveritySummary withSeverity(Severity severity) {
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
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

        if (obj instanceof AntipatternSeveritySummary == false)
            return false;
        AntipatternSeveritySummary other = (AntipatternSeveritySummary) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
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

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        return hashCode;
    }

    @Override
    public AntipatternSeveritySummary clone() {
        try {
            return (AntipatternSeveritySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.AntipatternSeveritySummaryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
