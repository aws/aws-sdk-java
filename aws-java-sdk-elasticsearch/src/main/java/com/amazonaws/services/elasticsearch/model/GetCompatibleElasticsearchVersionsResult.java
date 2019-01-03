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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for response returned by <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCompatibleElasticsearchVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A map of compatible Elasticsearch versions returned as part of the
     * <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
     * </p>
     */
    private java.util.List<CompatibleVersionsMap> compatibleElasticsearchVersions;

    /**
     * <p>
     * A map of compatible Elasticsearch versions returned as part of the
     * <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
     * </p>
     * 
     * @return A map of compatible Elasticsearch versions returned as part of the
     *         <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
     */

    public java.util.List<CompatibleVersionsMap> getCompatibleElasticsearchVersions() {
        return compatibleElasticsearchVersions;
    }

    /**
     * <p>
     * A map of compatible Elasticsearch versions returned as part of the
     * <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
     * </p>
     * 
     * @param compatibleElasticsearchVersions
     *        A map of compatible Elasticsearch versions returned as part of the
     *        <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
     */

    public void setCompatibleElasticsearchVersions(java.util.Collection<CompatibleVersionsMap> compatibleElasticsearchVersions) {
        if (compatibleElasticsearchVersions == null) {
            this.compatibleElasticsearchVersions = null;
            return;
        }

        this.compatibleElasticsearchVersions = new java.util.ArrayList<CompatibleVersionsMap>(compatibleElasticsearchVersions);
    }

    /**
     * <p>
     * A map of compatible Elasticsearch versions returned as part of the
     * <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompatibleElasticsearchVersions(java.util.Collection)} or
     * {@link #withCompatibleElasticsearchVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param compatibleElasticsearchVersions
     *        A map of compatible Elasticsearch versions returned as part of the
     *        <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCompatibleElasticsearchVersionsResult withCompatibleElasticsearchVersions(CompatibleVersionsMap... compatibleElasticsearchVersions) {
        if (this.compatibleElasticsearchVersions == null) {
            setCompatibleElasticsearchVersions(new java.util.ArrayList<CompatibleVersionsMap>(compatibleElasticsearchVersions.length));
        }
        for (CompatibleVersionsMap ele : compatibleElasticsearchVersions) {
            this.compatibleElasticsearchVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A map of compatible Elasticsearch versions returned as part of the
     * <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
     * </p>
     * 
     * @param compatibleElasticsearchVersions
     *        A map of compatible Elasticsearch versions returned as part of the
     *        <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCompatibleElasticsearchVersionsResult withCompatibleElasticsearchVersions(
            java.util.Collection<CompatibleVersionsMap> compatibleElasticsearchVersions) {
        setCompatibleElasticsearchVersions(compatibleElasticsearchVersions);
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
        if (getCompatibleElasticsearchVersions() != null)
            sb.append("CompatibleElasticsearchVersions: ").append(getCompatibleElasticsearchVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCompatibleElasticsearchVersionsResult == false)
            return false;
        GetCompatibleElasticsearchVersionsResult other = (GetCompatibleElasticsearchVersionsResult) obj;
        if (other.getCompatibleElasticsearchVersions() == null ^ this.getCompatibleElasticsearchVersions() == null)
            return false;
        if (other.getCompatibleElasticsearchVersions() != null
                && other.getCompatibleElasticsearchVersions().equals(this.getCompatibleElasticsearchVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompatibleElasticsearchVersions() == null) ? 0 : getCompatibleElasticsearchVersions().hashCode());
        return hashCode;
    }

    @Override
    public GetCompatibleElasticsearchVersionsResult clone() {
        try {
            return (GetCompatibleElasticsearchVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
