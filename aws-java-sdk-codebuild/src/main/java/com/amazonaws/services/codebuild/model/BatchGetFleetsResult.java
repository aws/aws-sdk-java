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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetFleets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetFleetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the requested compute fleets.
     * </p>
     */
    private java.util.List<Fleet> fleets;
    /**
     * <p>
     * The names of compute fleets for which information could not be found.
     * </p>
     */
    private java.util.List<String> fleetsNotFound;

    /**
     * <p>
     * Information about the requested compute fleets.
     * </p>
     * 
     * @return Information about the requested compute fleets.
     */

    public java.util.List<Fleet> getFleets() {
        return fleets;
    }

    /**
     * <p>
     * Information about the requested compute fleets.
     * </p>
     * 
     * @param fleets
     *        Information about the requested compute fleets.
     */

    public void setFleets(java.util.Collection<Fleet> fleets) {
        if (fleets == null) {
            this.fleets = null;
            return;
        }

        this.fleets = new java.util.ArrayList<Fleet>(fleets);
    }

    /**
     * <p>
     * Information about the requested compute fleets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleets(java.util.Collection)} or {@link #withFleets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fleets
     *        Information about the requested compute fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFleetsResult withFleets(Fleet... fleets) {
        if (this.fleets == null) {
            setFleets(new java.util.ArrayList<Fleet>(fleets.length));
        }
        for (Fleet ele : fleets) {
            this.fleets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the requested compute fleets.
     * </p>
     * 
     * @param fleets
     *        Information about the requested compute fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFleetsResult withFleets(java.util.Collection<Fleet> fleets) {
        setFleets(fleets);
        return this;
    }

    /**
     * <p>
     * The names of compute fleets for which information could not be found.
     * </p>
     * 
     * @return The names of compute fleets for which information could not be found.
     */

    public java.util.List<String> getFleetsNotFound() {
        return fleetsNotFound;
    }

    /**
     * <p>
     * The names of compute fleets for which information could not be found.
     * </p>
     * 
     * @param fleetsNotFound
     *        The names of compute fleets for which information could not be found.
     */

    public void setFleetsNotFound(java.util.Collection<String> fleetsNotFound) {
        if (fleetsNotFound == null) {
            this.fleetsNotFound = null;
            return;
        }

        this.fleetsNotFound = new java.util.ArrayList<String>(fleetsNotFound);
    }

    /**
     * <p>
     * The names of compute fleets for which information could not be found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetsNotFound(java.util.Collection)} or {@link #withFleetsNotFound(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fleetsNotFound
     *        The names of compute fleets for which information could not be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFleetsResult withFleetsNotFound(String... fleetsNotFound) {
        if (this.fleetsNotFound == null) {
            setFleetsNotFound(new java.util.ArrayList<String>(fleetsNotFound.length));
        }
        for (String ele : fleetsNotFound) {
            this.fleetsNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of compute fleets for which information could not be found.
     * </p>
     * 
     * @param fleetsNotFound
     *        The names of compute fleets for which information could not be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFleetsResult withFleetsNotFound(java.util.Collection<String> fleetsNotFound) {
        setFleetsNotFound(fleetsNotFound);
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
        if (getFleets() != null)
            sb.append("Fleets: ").append(getFleets()).append(",");
        if (getFleetsNotFound() != null)
            sb.append("FleetsNotFound: ").append(getFleetsNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetFleetsResult == false)
            return false;
        BatchGetFleetsResult other = (BatchGetFleetsResult) obj;
        if (other.getFleets() == null ^ this.getFleets() == null)
            return false;
        if (other.getFleets() != null && other.getFleets().equals(this.getFleets()) == false)
            return false;
        if (other.getFleetsNotFound() == null ^ this.getFleetsNotFound() == null)
            return false;
        if (other.getFleetsNotFound() != null && other.getFleetsNotFound().equals(this.getFleetsNotFound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleets() == null) ? 0 : getFleets().hashCode());
        hashCode = prime * hashCode + ((getFleetsNotFound() == null) ? 0 : getFleetsNotFound().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetFleetsResult clone() {
        try {
            return (BatchGetFleetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
