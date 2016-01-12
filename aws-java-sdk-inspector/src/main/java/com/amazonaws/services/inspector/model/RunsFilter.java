/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used as the request parameter in the <a>ListRuns</a>
 * action.
 * </p>
 */
public class RunsFilter implements Serializable, Cloneable {

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>runName</b> property of the <a>Run</a> data type.
     * </p>
     */
    private java.util.List<String> runNamePatterns;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>runState</b>
     * property of the <a>Run</a> data type.
     * </p>
     */
    private java.util.List<String> runStates;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must match a list of values of the <b>rulesPackages</b> property
     * of the <a>Run</a> data type.
     * </p>
     */
    private java.util.List<String> rulesPackages;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>creationTime</b> property of the <a>Run</a>
     * data type.
     * </p>
     */
    private TimestampRange creationTime;
    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>completionTime</b> property of the
     * <a>Run</a> data type.
     * </p>
     */
    private TimestampRange completionTime;

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>runName</b> property of the <a>Run</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, an explicit value or a string
     *         containing a wildcard specified for this data type property must
     *         match the value of the <b>runName</b> property of the <a>Run</a>
     *         data type.
     */
    public java.util.List<String> getRunNamePatterns() {
        return runNamePatterns;
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>runName</b> property of the <a>Run</a> data type.
     * </p>
     * 
     * @param runNamePatterns
     *        For a record to match a filter, an explicit value or a string
     *        containing a wildcard specified for this data type property must
     *        match the value of the <b>runName</b> property of the <a>Run</a>
     *        data type.
     */
    public void setRunNamePatterns(java.util.Collection<String> runNamePatterns) {
        if (runNamePatterns == null) {
            this.runNamePatterns = null;
            return;
        }

        this.runNamePatterns = new java.util.ArrayList<String>(runNamePatterns);
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>runName</b> property of the <a>Run</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRunNamePatterns(java.util.Collection)} or
     * {@link #withRunNamePatterns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param runNamePatterns
     *        For a record to match a filter, an explicit value or a string
     *        containing a wildcard specified for this data type property must
     *        match the value of the <b>runName</b> property of the <a>Run</a>
     *        data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RunsFilter withRunNamePatterns(String... runNamePatterns) {
        if (this.runNamePatterns == null) {
            setRunNamePatterns(new java.util.ArrayList<String>(
                    runNamePatterns.length));
        }
        for (String ele : runNamePatterns) {
            this.runNamePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>runName</b> property of the <a>Run</a> data type.
     * </p>
     * 
     * @param runNamePatterns
     *        For a record to match a filter, an explicit value or a string
     *        containing a wildcard specified for this data type property must
     *        match the value of the <b>runName</b> property of the <a>Run</a>
     *        data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RunsFilter withRunNamePatterns(
            java.util.Collection<String> runNamePatterns) {
        setRunNamePatterns(runNamePatterns);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>runState</b>
     * property of the <a>Run</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must be the exact match of the value of the
     *         <b>runState</b> property of the <a>Run</a> data type.
     */
    public java.util.List<String> getRunStates() {
        return runStates;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>runState</b>
     * property of the <a>Run</a> data type.
     * </p>
     * 
     * @param runStates
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>runState</b> property of the <a>Run</a> data type.
     */
    public void setRunStates(java.util.Collection<String> runStates) {
        if (runStates == null) {
            this.runStates = null;
            return;
        }

        this.runStates = new java.util.ArrayList<String>(runStates);
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>runState</b>
     * property of the <a>Run</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRunStates(java.util.Collection)} or
     * {@link #withRunStates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param runStates
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>runState</b> property of the <a>Run</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RunsFilter withRunStates(String... runStates) {
        if (this.runStates == null) {
            setRunStates(new java.util.ArrayList<String>(runStates.length));
        }
        for (String ele : runStates) {
            this.runStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>runState</b>
     * property of the <a>Run</a> data type.
     * </p>
     * 
     * @param runStates
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>runState</b> property of the <a>Run</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RunsFilter withRunStates(java.util.Collection<String> runStates) {
        setRunStates(runStates);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must match a list of values of the <b>rulesPackages</b> property
     * of the <a>Run</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must match a list of values of the
     *         <b>rulesPackages</b> property of the <a>Run</a> data type.
     */
    public java.util.List<String> getRulesPackages() {
        return rulesPackages;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must match a list of values of the <b>rulesPackages</b> property
     * of the <a>Run</a> data type.
     * </p>
     * 
     * @param rulesPackages
     *        For a record to match a filter, the value specified for this data
     *        type property must match a list of values of the
     *        <b>rulesPackages</b> property of the <a>Run</a> data type.
     */
    public void setRulesPackages(java.util.Collection<String> rulesPackages) {
        if (rulesPackages == null) {
            this.rulesPackages = null;
            return;
        }

        this.rulesPackages = new java.util.ArrayList<String>(rulesPackages);
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must match a list of values of the <b>rulesPackages</b> property
     * of the <a>Run</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRulesPackages(java.util.Collection)} or
     * {@link #withRulesPackages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param rulesPackages
     *        For a record to match a filter, the value specified for this data
     *        type property must match a list of values of the
     *        <b>rulesPackages</b> property of the <a>Run</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RunsFilter withRulesPackages(String... rulesPackages) {
        if (this.rulesPackages == null) {
            setRulesPackages(new java.util.ArrayList<String>(
                    rulesPackages.length));
        }
        for (String ele : rulesPackages) {
            this.rulesPackages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must match a list of values of the <b>rulesPackages</b> property
     * of the <a>Run</a> data type.
     * </p>
     * 
     * @param rulesPackages
     *        For a record to match a filter, the value specified for this data
     *        type property must match a list of values of the
     *        <b>rulesPackages</b> property of the <a>Run</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RunsFilter withRulesPackages(
            java.util.Collection<String> rulesPackages) {
        setRulesPackages(rulesPackages);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>creationTime</b> property of the <a>Run</a>
     * data type.
     * </p>
     * 
     * @param creationTime
     *        For a record to match a filter, the value specified for this data
     *        type property must inclusively match any value between the
     *        specified minimum and maximum values of the <b>creationTime</b>
     *        property of the <a>Run</a> data type.
     */
    public void setCreationTime(TimestampRange creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>creationTime</b> property of the <a>Run</a>
     * data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must inclusively match any value between the
     *         specified minimum and maximum values of the <b>creationTime</b>
     *         property of the <a>Run</a> data type.
     */
    public TimestampRange getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>creationTime</b> property of the <a>Run</a>
     * data type.
     * </p>
     * 
     * @param creationTime
     *        For a record to match a filter, the value specified for this data
     *        type property must inclusively match any value between the
     *        specified minimum and maximum values of the <b>creationTime</b>
     *        property of the <a>Run</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RunsFilter withCreationTime(TimestampRange creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>completionTime</b> property of the
     * <a>Run</a> data type.
     * </p>
     * 
     * @param completionTime
     *        For a record to match a filter, the value specified for this data
     *        type property must inclusively match any value between the
     *        specified minimum and maximum values of the <b>completionTime</b>
     *        property of the <a>Run</a> data type.
     */
    public void setCompletionTime(TimestampRange completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>completionTime</b> property of the
     * <a>Run</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must inclusively match any value between the
     *         specified minimum and maximum values of the <b>completionTime</b>
     *         property of the <a>Run</a> data type.
     */
    public TimestampRange getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must inclusively match any value between the specified minimum
     * and maximum values of the <b>completionTime</b> property of the
     * <a>Run</a> data type.
     * </p>
     * 
     * @param completionTime
     *        For a record to match a filter, the value specified for this data
     *        type property must inclusively match any value between the
     *        specified minimum and maximum values of the <b>completionTime</b>
     *        property of the <a>Run</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RunsFilter withCompletionTime(TimestampRange completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRunNamePatterns() != null)
            sb.append("RunNamePatterns: " + getRunNamePatterns() + ",");
        if (getRunStates() != null)
            sb.append("RunStates: " + getRunStates() + ",");
        if (getRulesPackages() != null)
            sb.append("RulesPackages: " + getRulesPackages() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: " + getCompletionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunsFilter == false)
            return false;
        RunsFilter other = (RunsFilter) obj;
        if (other.getRunNamePatterns() == null
                ^ this.getRunNamePatterns() == null)
            return false;
        if (other.getRunNamePatterns() != null
                && other.getRunNamePatterns().equals(this.getRunNamePatterns()) == false)
            return false;
        if (other.getRunStates() == null ^ this.getRunStates() == null)
            return false;
        if (other.getRunStates() != null
                && other.getRunStates().equals(this.getRunStates()) == false)
            return false;
        if (other.getRulesPackages() == null ^ this.getRulesPackages() == null)
            return false;
        if (other.getRulesPackages() != null
                && other.getRulesPackages().equals(this.getRulesPackages()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null
                ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null
                && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRunNamePatterns() == null) ? 0 : getRunNamePatterns()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRunStates() == null) ? 0 : getRunStates().hashCode());
        hashCode = prime
                * hashCode
                + ((getRulesPackages() == null) ? 0 : getRulesPackages()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCompletionTime() == null) ? 0 : getCompletionTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public RunsFilter clone() {
        try {
            return (RunsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}