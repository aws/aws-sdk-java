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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>Suggest</code> request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuggestResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of a <code>SuggestRequest</code>. Contains the resource ID (<code>rid</code>) and how long it took to
     * process the request (<code>timems</code>).
     * </p>
     */
    private SuggestStatus status;
    /**
     * <p>
     * Container for the matching search suggestion information.
     * </p>
     */
    private SuggestModel suggest;

    /**
     * <p>
     * The status of a <code>SuggestRequest</code>. Contains the resource ID (<code>rid</code>) and how long it took to
     * process the request (<code>timems</code>).
     * </p>
     * 
     * @param status
     *        The status of a <code>SuggestRequest</code>. Contains the resource ID (<code>rid</code>) and how long it
     *        took to process the request (<code>timems</code>).
     */

    public void setStatus(SuggestStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a <code>SuggestRequest</code>. Contains the resource ID (<code>rid</code>) and how long it took to
     * process the request (<code>timems</code>).
     * </p>
     * 
     * @return The status of a <code>SuggestRequest</code>. Contains the resource ID (<code>rid</code>) and how long it
     *         took to process the request (<code>timems</code>).
     */

    public SuggestStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a <code>SuggestRequest</code>. Contains the resource ID (<code>rid</code>) and how long it took to
     * process the request (<code>timems</code>).
     * </p>
     * 
     * @param status
     *        The status of a <code>SuggestRequest</code>. Contains the resource ID (<code>rid</code>) and how long it
     *        took to process the request (<code>timems</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestResult withStatus(SuggestStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Container for the matching search suggestion information.
     * </p>
     * 
     * @param suggest
     *        Container for the matching search suggestion information.
     */

    public void setSuggest(SuggestModel suggest) {
        this.suggest = suggest;
    }

    /**
     * <p>
     * Container for the matching search suggestion information.
     * </p>
     * 
     * @return Container for the matching search suggestion information.
     */

    public SuggestModel getSuggest() {
        return this.suggest;
    }

    /**
     * <p>
     * Container for the matching search suggestion information.
     * </p>
     * 
     * @param suggest
     *        Container for the matching search suggestion information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestResult withSuggest(SuggestModel suggest) {
        setSuggest(suggest);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSuggest() != null)
            sb.append("Suggest: ").append(getSuggest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuggestResult == false)
            return false;
        SuggestResult other = (SuggestResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSuggest() == null ^ this.getSuggest() == null)
            return false;
        if (other.getSuggest() != null && other.getSuggest().equals(this.getSuggest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSuggest() == null) ? 0 : getSuggest().hashCode());
        return hashCode;
    }

    @Override
    public SuggestResult clone() {
        try {
            return (SuggestResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
