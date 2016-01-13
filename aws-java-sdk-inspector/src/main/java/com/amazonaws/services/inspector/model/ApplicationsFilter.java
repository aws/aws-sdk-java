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
 * This data type is used as the request parameter in the
 * <a>ListApplications</a> action.
 * </p>
 */
public class ApplicationsFilter implements Serializable, Cloneable {

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>applicationName</b> property of the <a>Application</a> data type.
     * </p>
     */
    private java.util.List<String> applicationNamePatterns;

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>applicationName</b> property of the <a>Application</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, an explicit value or a string
     *         containing a wildcard specified for this data type property must
     *         match the value of the <b>applicationName</b> property of the
     *         <a>Application</a> data type.
     */
    public java.util.List<String> getApplicationNamePatterns() {
        return applicationNamePatterns;
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>applicationName</b> property of the <a>Application</a> data type.
     * </p>
     * 
     * @param applicationNamePatterns
     *        For a record to match a filter, an explicit value or a string
     *        containing a wildcard specified for this data type property must
     *        match the value of the <b>applicationName</b> property of the
     *        <a>Application</a> data type.
     */
    public void setApplicationNamePatterns(
            java.util.Collection<String> applicationNamePatterns) {
        if (applicationNamePatterns == null) {
            this.applicationNamePatterns = null;
            return;
        }

        this.applicationNamePatterns = new java.util.ArrayList<String>(
                applicationNamePatterns);
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>applicationName</b> property of the <a>Application</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setApplicationNamePatterns(java.util.Collection)} or
     * {@link #withApplicationNamePatterns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applicationNamePatterns
     *        For a record to match a filter, an explicit value or a string
     *        containing a wildcard specified for this data type property must
     *        match the value of the <b>applicationName</b> property of the
     *        <a>Application</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ApplicationsFilter withApplicationNamePatterns(
            String... applicationNamePatterns) {
        if (this.applicationNamePatterns == null) {
            setApplicationNamePatterns(new java.util.ArrayList<String>(
                    applicationNamePatterns.length));
        }
        for (String ele : applicationNamePatterns) {
            this.applicationNamePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>applicationName</b> property of the <a>Application</a> data type.
     * </p>
     * 
     * @param applicationNamePatterns
     *        For a record to match a filter, an explicit value or a string
     *        containing a wildcard specified for this data type property must
     *        match the value of the <b>applicationName</b> property of the
     *        <a>Application</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ApplicationsFilter withApplicationNamePatterns(
            java.util.Collection<String> applicationNamePatterns) {
        setApplicationNamePatterns(applicationNamePatterns);
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
        if (getApplicationNamePatterns() != null)
            sb.append("ApplicationNamePatterns: "
                    + getApplicationNamePatterns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationsFilter == false)
            return false;
        ApplicationsFilter other = (ApplicationsFilter) obj;
        if (other.getApplicationNamePatterns() == null
                ^ this.getApplicationNamePatterns() == null)
            return false;
        if (other.getApplicationNamePatterns() != null
                && other.getApplicationNamePatterns().equals(
                        this.getApplicationNamePatterns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplicationNamePatterns() == null) ? 0
                        : getApplicationNamePatterns().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationsFilter clone() {
        try {
            return (ApplicationsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}