/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure describing the source of an artifact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ArtifactSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArtifactSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URI of the source.
     * </p>
     */
    private String sourceUri;
    /**
     * <p>
     * A list of source types.
     * </p>
     */
    private java.util.List<ArtifactSourceType> sourceTypes;

    /**
     * <p>
     * The URI of the source.
     * </p>
     * 
     * @param sourceUri
     *        The URI of the source.
     */

    public void setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
    }

    /**
     * <p>
     * The URI of the source.
     * </p>
     * 
     * @return The URI of the source.
     */

    public String getSourceUri() {
        return this.sourceUri;
    }

    /**
     * <p>
     * The URI of the source.
     * </p>
     * 
     * @param sourceUri
     *        The URI of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactSource withSourceUri(String sourceUri) {
        setSourceUri(sourceUri);
        return this;
    }

    /**
     * <p>
     * A list of source types.
     * </p>
     * 
     * @return A list of source types.
     */

    public java.util.List<ArtifactSourceType> getSourceTypes() {
        return sourceTypes;
    }

    /**
     * <p>
     * A list of source types.
     * </p>
     * 
     * @param sourceTypes
     *        A list of source types.
     */

    public void setSourceTypes(java.util.Collection<ArtifactSourceType> sourceTypes) {
        if (sourceTypes == null) {
            this.sourceTypes = null;
            return;
        }

        this.sourceTypes = new java.util.ArrayList<ArtifactSourceType>(sourceTypes);
    }

    /**
     * <p>
     * A list of source types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceTypes(java.util.Collection)} or {@link #withSourceTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourceTypes
     *        A list of source types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactSource withSourceTypes(ArtifactSourceType... sourceTypes) {
        if (this.sourceTypes == null) {
            setSourceTypes(new java.util.ArrayList<ArtifactSourceType>(sourceTypes.length));
        }
        for (ArtifactSourceType ele : sourceTypes) {
            this.sourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of source types.
     * </p>
     * 
     * @param sourceTypes
     *        A list of source types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactSource withSourceTypes(java.util.Collection<ArtifactSourceType> sourceTypes) {
        setSourceTypes(sourceTypes);
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
        if (getSourceUri() != null)
            sb.append("SourceUri: ").append(getSourceUri()).append(",");
        if (getSourceTypes() != null)
            sb.append("SourceTypes: ").append(getSourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArtifactSource == false)
            return false;
        ArtifactSource other = (ArtifactSource) obj;
        if (other.getSourceUri() == null ^ this.getSourceUri() == null)
            return false;
        if (other.getSourceUri() != null && other.getSourceUri().equals(this.getSourceUri()) == false)
            return false;
        if (other.getSourceTypes() == null ^ this.getSourceTypes() == null)
            return false;
        if (other.getSourceTypes() != null && other.getSourceTypes().equals(this.getSourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceUri() == null) ? 0 : getSourceUri().hashCode());
        hashCode = prime * hashCode + ((getSourceTypes() == null) ? 0 : getSourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public ArtifactSource clone() {
        try {
            return (ArtifactSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ArtifactSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
