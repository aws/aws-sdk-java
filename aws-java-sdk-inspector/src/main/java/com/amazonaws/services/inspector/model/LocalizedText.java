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
 * The textual identifier. This data type is used as the request parameter in
 * the <a>LocalizeText</a> action.
 * </p>
 */
public class LocalizedText implements Serializable, Cloneable {

    /**
     * <p>
     * The facility and id properties of the <a>LocalizedTextKey</a> data type.
     * </p>
     */
    private LocalizedTextKey key;
    /**
     * <p>
     * Values for the dynamic elements of the string specified by the textual
     * identifier.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * The facility and id properties of the <a>LocalizedTextKey</a> data type.
     * </p>
     * 
     * @param key
     *        The facility and id properties of the <a>LocalizedTextKey</a> data
     *        type.
     */
    public void setKey(LocalizedTextKey key) {
        this.key = key;
    }

    /**
     * <p>
     * The facility and id properties of the <a>LocalizedTextKey</a> data type.
     * </p>
     * 
     * @return The facility and id properties of the <a>LocalizedTextKey</a>
     *         data type.
     */
    public LocalizedTextKey getKey() {
        return this.key;
    }

    /**
     * <p>
     * The facility and id properties of the <a>LocalizedTextKey</a> data type.
     * </p>
     * 
     * @param key
     *        The facility and id properties of the <a>LocalizedTextKey</a> data
     *        type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LocalizedText withKey(LocalizedTextKey key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Values for the dynamic elements of the string specified by the textual
     * identifier.
     * </p>
     * 
     * @return Values for the dynamic elements of the string specified by the
     *         textual identifier.
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Values for the dynamic elements of the string specified by the textual
     * identifier.
     * </p>
     * 
     * @param parameters
     *        Values for the dynamic elements of the string specified by the
     *        textual identifier.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<Parameter>(parameters);
    }

    /**
     * <p>
     * Values for the dynamic elements of the string specified by the textual
     * identifier.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setParameters(java.util.Collection)} or
     * {@link #withParameters(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param parameters
     *        Values for the dynamic elements of the string specified by the
     *        textual identifier.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LocalizedText withParameters(Parameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<Parameter>(parameters.length));
        }
        for (Parameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Values for the dynamic elements of the string specified by the textual
     * identifier.
     * </p>
     * 
     * @param parameters
     *        Values for the dynamic elements of the string specified by the
     *        textual identifier.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LocalizedText withParameters(
            java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalizedText == false)
            return false;
        LocalizedText other = (LocalizedText) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null
                && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode
                + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public LocalizedText clone() {
        try {
            return (LocalizedText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}