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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A relation within an analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/AnalysisSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisSchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tables referenced in the analysis schema.
     * </p>
     */
    private java.util.List<String> referencedTables;

    /**
     * <p>
     * The tables referenced in the analysis schema.
     * </p>
     * 
     * @return The tables referenced in the analysis schema.
     */

    public java.util.List<String> getReferencedTables() {
        return referencedTables;
    }

    /**
     * <p>
     * The tables referenced in the analysis schema.
     * </p>
     * 
     * @param referencedTables
     *        The tables referenced in the analysis schema.
     */

    public void setReferencedTables(java.util.Collection<String> referencedTables) {
        if (referencedTables == null) {
            this.referencedTables = null;
            return;
        }

        this.referencedTables = new java.util.ArrayList<String>(referencedTables);
    }

    /**
     * <p>
     * The tables referenced in the analysis schema.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferencedTables(java.util.Collection)} or {@link #withReferencedTables(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param referencedTables
     *        The tables referenced in the analysis schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSchema withReferencedTables(String... referencedTables) {
        if (this.referencedTables == null) {
            setReferencedTables(new java.util.ArrayList<String>(referencedTables.length));
        }
        for (String ele : referencedTables) {
            this.referencedTables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tables referenced in the analysis schema.
     * </p>
     * 
     * @param referencedTables
     *        The tables referenced in the analysis schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSchema withReferencedTables(java.util.Collection<String> referencedTables) {
        setReferencedTables(referencedTables);
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
        if (getReferencedTables() != null)
            sb.append("ReferencedTables: ").append(getReferencedTables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisSchema == false)
            return false;
        AnalysisSchema other = (AnalysisSchema) obj;
        if (other.getReferencedTables() == null ^ this.getReferencedTables() == null)
            return false;
        if (other.getReferencedTables() != null && other.getReferencedTables().equals(this.getReferencedTables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReferencedTables() == null) ? 0 : getReferencedTables().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisSchema clone() {
        try {
            return (AnalysisSchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.AnalysisSchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
