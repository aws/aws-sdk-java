/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that defines the log patterns that belongs to a <code>LogPatternSet</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/LogPattern" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogPattern implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the log pattern. A log pattern name can contains at many as 30 characters, and it cannot be empty.
     * The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
     * </p>
     */
    private String patternSetName;
    /**
     * <p>
     * The name of the log pattern. A log pattern name can contains at many as 50 characters, and it cannot be empty.
     * The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
     * </p>
     */
    private String patternName;
    /**
     * <p>
     * A regular expression that defines the log pattern. A log pattern can contains at many as 50 characters, and it
     * cannot be empty.
     * </p>
     */
    private String pattern;
    /**
     * <p>
     * Rank of the log pattern.
     * </p>
     */
    private Integer rank;

    /**
     * <p>
     * The name of the log pattern. A log pattern name can contains at many as 30 characters, and it cannot be empty.
     * The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
     * </p>
     * 
     * @param patternSetName
     *        The name of the log pattern. A log pattern name can contains at many as 30 characters, and it cannot be
     *        empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash,
     *        underscore.
     */

    public void setPatternSetName(String patternSetName) {
        this.patternSetName = patternSetName;
    }

    /**
     * <p>
     * The name of the log pattern. A log pattern name can contains at many as 30 characters, and it cannot be empty.
     * The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
     * </p>
     * 
     * @return The name of the log pattern. A log pattern name can contains at many as 30 characters, and it cannot be
     *         empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash,
     *         underscore.
     */

    public String getPatternSetName() {
        return this.patternSetName;
    }

    /**
     * <p>
     * The name of the log pattern. A log pattern name can contains at many as 30 characters, and it cannot be empty.
     * The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
     * </p>
     * 
     * @param patternSetName
     *        The name of the log pattern. A log pattern name can contains at many as 30 characters, and it cannot be
     *        empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash,
     *        underscore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogPattern withPatternSetName(String patternSetName) {
        setPatternSetName(patternSetName);
        return this;
    }

    /**
     * <p>
     * The name of the log pattern. A log pattern name can contains at many as 50 characters, and it cannot be empty.
     * The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
     * </p>
     * 
     * @param patternName
     *        The name of the log pattern. A log pattern name can contains at many as 50 characters, and it cannot be
     *        empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash,
     *        underscore.
     */

    public void setPatternName(String patternName) {
        this.patternName = patternName;
    }

    /**
     * <p>
     * The name of the log pattern. A log pattern name can contains at many as 50 characters, and it cannot be empty.
     * The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
     * </p>
     * 
     * @return The name of the log pattern. A log pattern name can contains at many as 50 characters, and it cannot be
     *         empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash,
     *         underscore.
     */

    public String getPatternName() {
        return this.patternName;
    }

    /**
     * <p>
     * The name of the log pattern. A log pattern name can contains at many as 50 characters, and it cannot be empty.
     * The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
     * </p>
     * 
     * @param patternName
     *        The name of the log pattern. A log pattern name can contains at many as 50 characters, and it cannot be
     *        empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash,
     *        underscore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogPattern withPatternName(String patternName) {
        setPatternName(patternName);
        return this;
    }

    /**
     * <p>
     * A regular expression that defines the log pattern. A log pattern can contains at many as 50 characters, and it
     * cannot be empty.
     * </p>
     * 
     * @param pattern
     *        A regular expression that defines the log pattern. A log pattern can contains at many as 50 characters,
     *        and it cannot be empty.
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * A regular expression that defines the log pattern. A log pattern can contains at many as 50 characters, and it
     * cannot be empty.
     * </p>
     * 
     * @return A regular expression that defines the log pattern. A log pattern can contains at many as 50 characters,
     *         and it cannot be empty.
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * A regular expression that defines the log pattern. A log pattern can contains at many as 50 characters, and it
     * cannot be empty.
     * </p>
     * 
     * @param pattern
     *        A regular expression that defines the log pattern. A log pattern can contains at many as 50 characters,
     *        and it cannot be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogPattern withPattern(String pattern) {
        setPattern(pattern);
        return this;
    }

    /**
     * <p>
     * Rank of the log pattern.
     * </p>
     * 
     * @param rank
     *        Rank of the log pattern.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * Rank of the log pattern.
     * </p>
     * 
     * @return Rank of the log pattern.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * <p>
     * Rank of the log pattern.
     * </p>
     * 
     * @param rank
     *        Rank of the log pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogPattern withRank(Integer rank) {
        setRank(rank);
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
        if (getPatternSetName() != null)
            sb.append("PatternSetName: ").append(getPatternSetName()).append(",");
        if (getPatternName() != null)
            sb.append("PatternName: ").append(getPatternName()).append(",");
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
        if (getRank() != null)
            sb.append("Rank: ").append(getRank());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogPattern == false)
            return false;
        LogPattern other = (LogPattern) obj;
        if (other.getPatternSetName() == null ^ this.getPatternSetName() == null)
            return false;
        if (other.getPatternSetName() != null && other.getPatternSetName().equals(this.getPatternSetName()) == false)
            return false;
        if (other.getPatternName() == null ^ this.getPatternName() == null)
            return false;
        if (other.getPatternName() != null && other.getPatternName().equals(this.getPatternName()) == false)
            return false;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatternSetName() == null) ? 0 : getPatternSetName().hashCode());
        hashCode = prime * hashCode + ((getPatternName() == null) ? 0 : getPatternName().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        return hashCode;
    }

    @Override
    public LogPattern clone() {
        try {
            return (LogPattern) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationinsights.model.transform.LogPatternMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
