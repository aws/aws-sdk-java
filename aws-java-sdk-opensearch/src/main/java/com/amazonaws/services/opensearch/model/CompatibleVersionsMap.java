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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompatibleVersionsMap implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current version that the OpenSearch Service domain is running.
     * </p>
     */
    private String sourceVersion;
    /**
     * <p>
     * The possible versions that you can upgrade the domain to.
     * </p>
     */
    private java.util.List<String> targetVersions;

    /**
     * <p>
     * The current version that the OpenSearch Service domain is running.
     * </p>
     * 
     * @param sourceVersion
     *        The current version that the OpenSearch Service domain is running.
     */

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * The current version that the OpenSearch Service domain is running.
     * </p>
     * 
     * @return The current version that the OpenSearch Service domain is running.
     */

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * The current version that the OpenSearch Service domain is running.
     * </p>
     * 
     * @param sourceVersion
     *        The current version that the OpenSearch Service domain is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompatibleVersionsMap withSourceVersion(String sourceVersion) {
        setSourceVersion(sourceVersion);
        return this;
    }

    /**
     * <p>
     * The possible versions that you can upgrade the domain to.
     * </p>
     * 
     * @return The possible versions that you can upgrade the domain to.
     */

    public java.util.List<String> getTargetVersions() {
        return targetVersions;
    }

    /**
     * <p>
     * The possible versions that you can upgrade the domain to.
     * </p>
     * 
     * @param targetVersions
     *        The possible versions that you can upgrade the domain to.
     */

    public void setTargetVersions(java.util.Collection<String> targetVersions) {
        if (targetVersions == null) {
            this.targetVersions = null;
            return;
        }

        this.targetVersions = new java.util.ArrayList<String>(targetVersions);
    }

    /**
     * <p>
     * The possible versions that you can upgrade the domain to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetVersions(java.util.Collection)} or {@link #withTargetVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param targetVersions
     *        The possible versions that you can upgrade the domain to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompatibleVersionsMap withTargetVersions(String... targetVersions) {
        if (this.targetVersions == null) {
            setTargetVersions(new java.util.ArrayList<String>(targetVersions.length));
        }
        for (String ele : targetVersions) {
            this.targetVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The possible versions that you can upgrade the domain to.
     * </p>
     * 
     * @param targetVersions
     *        The possible versions that you can upgrade the domain to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompatibleVersionsMap withTargetVersions(java.util.Collection<String> targetVersions) {
        setTargetVersions(targetVersions);
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
        if (getSourceVersion() != null)
            sb.append("SourceVersion: ").append(getSourceVersion()).append(",");
        if (getTargetVersions() != null)
            sb.append("TargetVersions: ").append(getTargetVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompatibleVersionsMap == false)
            return false;
        CompatibleVersionsMap other = (CompatibleVersionsMap) obj;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        if (other.getTargetVersions() == null ^ this.getTargetVersions() == null)
            return false;
        if (other.getTargetVersions() != null && other.getTargetVersions().equals(this.getTargetVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        hashCode = prime * hashCode + ((getTargetVersions() == null) ? 0 : getTargetVersions().hashCode());
        return hashCode;
    }

    @Override
    public CompatibleVersionsMap clone() {
        try {
            return (CompatibleVersionsMap) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.CompatibleVersionsMapMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
