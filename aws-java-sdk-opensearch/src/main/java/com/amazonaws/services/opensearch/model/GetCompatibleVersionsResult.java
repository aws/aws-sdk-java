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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for the response returned by the <code>GetCompatibleVersions</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCompatibleVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     * </p>
     */
    private java.util.List<CompatibleVersionsMap> compatibleVersions;

    /**
     * <p>
     * A map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     * </p>
     * 
     * @return A map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     */

    public java.util.List<CompatibleVersionsMap> getCompatibleVersions() {
        return compatibleVersions;
    }

    /**
     * <p>
     * A map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     * </p>
     * 
     * @param compatibleVersions
     *        A map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     */

    public void setCompatibleVersions(java.util.Collection<CompatibleVersionsMap> compatibleVersions) {
        if (compatibleVersions == null) {
            this.compatibleVersions = null;
            return;
        }

        this.compatibleVersions = new java.util.ArrayList<CompatibleVersionsMap>(compatibleVersions);
    }

    /**
     * <p>
     * A map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompatibleVersions(java.util.Collection)} or {@link #withCompatibleVersions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param compatibleVersions
     *        A map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCompatibleVersionsResult withCompatibleVersions(CompatibleVersionsMap... compatibleVersions) {
        if (this.compatibleVersions == null) {
            setCompatibleVersions(new java.util.ArrayList<CompatibleVersionsMap>(compatibleVersions.length));
        }
        for (CompatibleVersionsMap ele : compatibleVersions) {
            this.compatibleVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     * </p>
     * 
     * @param compatibleVersions
     *        A map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCompatibleVersionsResult withCompatibleVersions(java.util.Collection<CompatibleVersionsMap> compatibleVersions) {
        setCompatibleVersions(compatibleVersions);
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
        if (getCompatibleVersions() != null)
            sb.append("CompatibleVersions: ").append(getCompatibleVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCompatibleVersionsResult == false)
            return false;
        GetCompatibleVersionsResult other = (GetCompatibleVersionsResult) obj;
        if (other.getCompatibleVersions() == null ^ this.getCompatibleVersions() == null)
            return false;
        if (other.getCompatibleVersions() != null && other.getCompatibleVersions().equals(this.getCompatibleVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompatibleVersions() == null) ? 0 : getCompatibleVersions().hashCode());
        return hashCode;
    }

    @Override
    public GetCompatibleVersionsResult clone() {
        try {
            return (GetCompatibleVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
