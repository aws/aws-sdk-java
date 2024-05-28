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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata for function package artifacts.
 * </p>
 * <p>
 * Artifacts are the contents of the package descriptor file and the state of the package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/FunctionArtifactMeta" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionArtifactMeta implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lists of function package overrides.
     * </p>
     */
    private java.util.List<ToscaOverride> overrides;

    /**
     * <p>
     * Lists of function package overrides.
     * </p>
     * 
     * @return Lists of function package overrides.
     */

    public java.util.List<ToscaOverride> getOverrides() {
        return overrides;
    }

    /**
     * <p>
     * Lists of function package overrides.
     * </p>
     * 
     * @param overrides
     *        Lists of function package overrides.
     */

    public void setOverrides(java.util.Collection<ToscaOverride> overrides) {
        if (overrides == null) {
            this.overrides = null;
            return;
        }

        this.overrides = new java.util.ArrayList<ToscaOverride>(overrides);
    }

    /**
     * <p>
     * Lists of function package overrides.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOverrides(java.util.Collection)} or {@link #withOverrides(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param overrides
     *        Lists of function package overrides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionArtifactMeta withOverrides(ToscaOverride... overrides) {
        if (this.overrides == null) {
            setOverrides(new java.util.ArrayList<ToscaOverride>(overrides.length));
        }
        for (ToscaOverride ele : overrides) {
            this.overrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists of function package overrides.
     * </p>
     * 
     * @param overrides
     *        Lists of function package overrides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionArtifactMeta withOverrides(java.util.Collection<ToscaOverride> overrides) {
        setOverrides(overrides);
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
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionArtifactMeta == false)
            return false;
        FunctionArtifactMeta other = (FunctionArtifactMeta) obj;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        return hashCode;
    }

    @Override
    public FunctionArtifactMeta clone() {
        try {
            return (FunctionArtifactMeta) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.FunctionArtifactMetaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
