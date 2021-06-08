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
 * A structure describing the source of a context.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ContextSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContextSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URI of the source.
     * </p>
     */
    private String sourceUri;
    /**
     * <p>
     * The type of the source.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The ID of the source.
     * </p>
     */
    private String sourceId;

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

    public ContextSource withSourceUri(String sourceUri) {
        setSourceUri(sourceUri);
        return this;
    }

    /**
     * <p>
     * The type of the source.
     * </p>
     * 
     * @param sourceType
     *        The type of the source.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of the source.
     * </p>
     * 
     * @return The type of the source.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The type of the source.
     * </p>
     * 
     * @param sourceType
     *        The type of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextSource withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The ID of the source.
     * </p>
     * 
     * @param sourceId
     *        The ID of the source.
     */

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The ID of the source.
     * </p>
     * 
     * @return The ID of the source.
     */

    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * <p>
     * The ID of the source.
     * </p>
     * 
     * @param sourceId
     *        The ID of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextSource withSourceId(String sourceId) {
        setSourceId(sourceId);
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
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getSourceId() != null)
            sb.append("SourceId: ").append(getSourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContextSource == false)
            return false;
        ContextSource other = (ContextSource) obj;
        if (other.getSourceUri() == null ^ this.getSourceUri() == null)
            return false;
        if (other.getSourceUri() != null && other.getSourceUri().equals(this.getSourceUri()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceUri() == null) ? 0 : getSourceUri().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        return hashCode;
    }

    @Override
    public ContextSource clone() {
        try {
            return (ContextSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ContextSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
