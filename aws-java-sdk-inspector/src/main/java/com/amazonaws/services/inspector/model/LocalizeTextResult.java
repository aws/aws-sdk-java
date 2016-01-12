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
 * 
 */
public class LocalizeTextResult implements Serializable, Cloneable {

    /**
     * <p>
     * Confirmation details of the action performed.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The resulting list of user-readable texts.
     * </p>
     */
    private java.util.List<String> results;

    /**
     * <p>
     * Confirmation details of the action performed.
     * </p>
     * 
     * @param message
     *        Confirmation details of the action performed.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Confirmation details of the action performed.
     * </p>
     * 
     * @return Confirmation details of the action performed.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Confirmation details of the action performed.
     * </p>
     * 
     * @param message
     *        Confirmation details of the action performed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LocalizeTextResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The resulting list of user-readable texts.
     * </p>
     * 
     * @return The resulting list of user-readable texts.
     */
    public java.util.List<String> getResults() {
        return results;
    }

    /**
     * <p>
     * The resulting list of user-readable texts.
     * </p>
     * 
     * @param results
     *        The resulting list of user-readable texts.
     */
    public void setResults(java.util.Collection<String> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<String>(results);
    }

    /**
     * <p>
     * The resulting list of user-readable texts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResults(java.util.Collection)} or
     * {@link #withResults(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param results
     *        The resulting list of user-readable texts.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LocalizeTextResult withResults(String... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<String>(results.length));
        }
        for (String ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resulting list of user-readable texts.
     * </p>
     * 
     * @param results
     *        The resulting list of user-readable texts.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LocalizeTextResult withResults(java.util.Collection<String> results) {
        setResults(results);
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
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getResults() != null)
            sb.append("Results: " + getResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalizeTextResult == false)
            return false;
        LocalizeTextResult other = (LocalizeTextResult) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null
                && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null
                && other.getResults().equals(this.getResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getResults() == null) ? 0 : getResults().hashCode());
        return hashCode;
    }

    @Override
    public LocalizeTextResult clone() {
        try {
            return (LocalizeTextResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}