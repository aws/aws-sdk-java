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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the feature flags that you can specify for a code generation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CodegenFeatureFlags"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodegenFeatureFlags implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifes whether a code generation job supports data relationships.
     * </p>
     */
    private Boolean isRelationshipSupported;
    /**
     * <p>
     * Specifies whether a code generation job supports non models.
     * </p>
     */
    private Boolean isNonModelSupported;

    /**
     * <p>
     * Specifes whether a code generation job supports data relationships.
     * </p>
     * 
     * @param isRelationshipSupported
     *        Specifes whether a code generation job supports data relationships.
     */

    public void setIsRelationshipSupported(Boolean isRelationshipSupported) {
        this.isRelationshipSupported = isRelationshipSupported;
    }

    /**
     * <p>
     * Specifes whether a code generation job supports data relationships.
     * </p>
     * 
     * @return Specifes whether a code generation job supports data relationships.
     */

    public Boolean getIsRelationshipSupported() {
        return this.isRelationshipSupported;
    }

    /**
     * <p>
     * Specifes whether a code generation job supports data relationships.
     * </p>
     * 
     * @param isRelationshipSupported
     *        Specifes whether a code generation job supports data relationships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenFeatureFlags withIsRelationshipSupported(Boolean isRelationshipSupported) {
        setIsRelationshipSupported(isRelationshipSupported);
        return this;
    }

    /**
     * <p>
     * Specifes whether a code generation job supports data relationships.
     * </p>
     * 
     * @return Specifes whether a code generation job supports data relationships.
     */

    public Boolean isRelationshipSupported() {
        return this.isRelationshipSupported;
    }

    /**
     * <p>
     * Specifies whether a code generation job supports non models.
     * </p>
     * 
     * @param isNonModelSupported
     *        Specifies whether a code generation job supports non models.
     */

    public void setIsNonModelSupported(Boolean isNonModelSupported) {
        this.isNonModelSupported = isNonModelSupported;
    }

    /**
     * <p>
     * Specifies whether a code generation job supports non models.
     * </p>
     * 
     * @return Specifies whether a code generation job supports non models.
     */

    public Boolean getIsNonModelSupported() {
        return this.isNonModelSupported;
    }

    /**
     * <p>
     * Specifies whether a code generation job supports non models.
     * </p>
     * 
     * @param isNonModelSupported
     *        Specifies whether a code generation job supports non models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenFeatureFlags withIsNonModelSupported(Boolean isNonModelSupported) {
        setIsNonModelSupported(isNonModelSupported);
        return this;
    }

    /**
     * <p>
     * Specifies whether a code generation job supports non models.
     * </p>
     * 
     * @return Specifies whether a code generation job supports non models.
     */

    public Boolean isNonModelSupported() {
        return this.isNonModelSupported;
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
        if (getIsRelationshipSupported() != null)
            sb.append("IsRelationshipSupported: ").append(getIsRelationshipSupported()).append(",");
        if (getIsNonModelSupported() != null)
            sb.append("IsNonModelSupported: ").append(getIsNonModelSupported());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodegenFeatureFlags == false)
            return false;
        CodegenFeatureFlags other = (CodegenFeatureFlags) obj;
        if (other.getIsRelationshipSupported() == null ^ this.getIsRelationshipSupported() == null)
            return false;
        if (other.getIsRelationshipSupported() != null && other.getIsRelationshipSupported().equals(this.getIsRelationshipSupported()) == false)
            return false;
        if (other.getIsNonModelSupported() == null ^ this.getIsNonModelSupported() == null)
            return false;
        if (other.getIsNonModelSupported() != null && other.getIsNonModelSupported().equals(this.getIsNonModelSupported()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsRelationshipSupported() == null) ? 0 : getIsRelationshipSupported().hashCode());
        hashCode = prime * hashCode + ((getIsNonModelSupported() == null) ? 0 : getIsNonModelSupported().hashCode());
        return hashCode;
    }

    @Override
    public CodegenFeatureFlags clone() {
        try {
            return (CodegenFeatureFlags) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.CodegenFeatureFlagsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
