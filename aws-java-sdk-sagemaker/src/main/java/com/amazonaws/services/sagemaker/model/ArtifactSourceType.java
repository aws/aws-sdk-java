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
 * The ID and ID type of an artifact source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ArtifactSourceType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArtifactSourceType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of ID.
     * </p>
     */
    private String sourceIdType;
    /**
     * <p>
     * The ID.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of ID.
     * </p>
     * 
     * @param sourceIdType
     *        The type of ID.
     * @see ArtifactSourceIdType
     */

    public void setSourceIdType(String sourceIdType) {
        this.sourceIdType = sourceIdType;
    }

    /**
     * <p>
     * The type of ID.
     * </p>
     * 
     * @return The type of ID.
     * @see ArtifactSourceIdType
     */

    public String getSourceIdType() {
        return this.sourceIdType;
    }

    /**
     * <p>
     * The type of ID.
     * </p>
     * 
     * @param sourceIdType
     *        The type of ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactSourceIdType
     */

    public ArtifactSourceType withSourceIdType(String sourceIdType) {
        setSourceIdType(sourceIdType);
        return this;
    }

    /**
     * <p>
     * The type of ID.
     * </p>
     * 
     * @param sourceIdType
     *        The type of ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactSourceIdType
     */

    public ArtifactSourceType withSourceIdType(ArtifactSourceIdType sourceIdType) {
        this.sourceIdType = sourceIdType.toString();
        return this;
    }

    /**
     * <p>
     * The ID.
     * </p>
     * 
     * @param value
     *        The ID.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The ID.
     * </p>
     * 
     * @return The ID.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The ID.
     * </p>
     * 
     * @param value
     *        The ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactSourceType withValue(String value) {
        setValue(value);
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
        if (getSourceIdType() != null)
            sb.append("SourceIdType: ").append(getSourceIdType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArtifactSourceType == false)
            return false;
        ArtifactSourceType other = (ArtifactSourceType) obj;
        if (other.getSourceIdType() == null ^ this.getSourceIdType() == null)
            return false;
        if (other.getSourceIdType() != null && other.getSourceIdType().equals(this.getSourceIdType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceIdType() == null) ? 0 : getSourceIdType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ArtifactSourceType clone() {
        try {
            return (ArtifactSourceType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ArtifactSourceTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
