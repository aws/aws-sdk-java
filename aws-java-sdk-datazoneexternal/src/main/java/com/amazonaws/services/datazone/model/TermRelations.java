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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the term relations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/TermRelations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TermRelations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The classifies of the term relations.
     * </p>
     */
    private java.util.List<String> classifies;
    /**
     * <p>
     * The <code>isA</code> property of the term relations.
     * </p>
     */
    private java.util.List<String> isA;

    /**
     * <p>
     * The classifies of the term relations.
     * </p>
     * 
     * @return The classifies of the term relations.
     */

    public java.util.List<String> getClassifies() {
        return classifies;
    }

    /**
     * <p>
     * The classifies of the term relations.
     * </p>
     * 
     * @param classifies
     *        The classifies of the term relations.
     */

    public void setClassifies(java.util.Collection<String> classifies) {
        if (classifies == null) {
            this.classifies = null;
            return;
        }

        this.classifies = new java.util.ArrayList<String>(classifies);
    }

    /**
     * <p>
     * The classifies of the term relations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClassifies(java.util.Collection)} or {@link #withClassifies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param classifies
     *        The classifies of the term relations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TermRelations withClassifies(String... classifies) {
        if (this.classifies == null) {
            setClassifies(new java.util.ArrayList<String>(classifies.length));
        }
        for (String ele : classifies) {
            this.classifies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The classifies of the term relations.
     * </p>
     * 
     * @param classifies
     *        The classifies of the term relations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TermRelations withClassifies(java.util.Collection<String> classifies) {
        setClassifies(classifies);
        return this;
    }

    /**
     * <p>
     * The <code>isA</code> property of the term relations.
     * </p>
     * 
     * @return The <code>isA</code> property of the term relations.
     */

    public java.util.List<String> getIsA() {
        return isA;
    }

    /**
     * <p>
     * The <code>isA</code> property of the term relations.
     * </p>
     * 
     * @param isA
     *        The <code>isA</code> property of the term relations.
     */

    public void setIsA(java.util.Collection<String> isA) {
        if (isA == null) {
            this.isA = null;
            return;
        }

        this.isA = new java.util.ArrayList<String>(isA);
    }

    /**
     * <p>
     * The <code>isA</code> property of the term relations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIsA(java.util.Collection)} or {@link #withIsA(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param isA
     *        The <code>isA</code> property of the term relations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TermRelations withIsA(String... isA) {
        if (this.isA == null) {
            setIsA(new java.util.ArrayList<String>(isA.length));
        }
        for (String ele : isA) {
            this.isA.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>isA</code> property of the term relations.
     * </p>
     * 
     * @param isA
     *        The <code>isA</code> property of the term relations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TermRelations withIsA(java.util.Collection<String> isA) {
        setIsA(isA);
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
        if (getClassifies() != null)
            sb.append("Classifies: ").append(getClassifies()).append(",");
        if (getIsA() != null)
            sb.append("IsA: ").append(getIsA());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TermRelations == false)
            return false;
        TermRelations other = (TermRelations) obj;
        if (other.getClassifies() == null ^ this.getClassifies() == null)
            return false;
        if (other.getClassifies() != null && other.getClassifies().equals(this.getClassifies()) == false)
            return false;
        if (other.getIsA() == null ^ this.getIsA() == null)
            return false;
        if (other.getIsA() != null && other.getIsA().equals(this.getIsA()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClassifies() == null) ? 0 : getClassifies().hashCode());
        hashCode = prime * hashCode + ((getIsA() == null) ? 0 : getIsA().hashCode());
        return hashCode;
    }

    @Override
    public TermRelations clone() {
        try {
            return (TermRelations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.TermRelationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
