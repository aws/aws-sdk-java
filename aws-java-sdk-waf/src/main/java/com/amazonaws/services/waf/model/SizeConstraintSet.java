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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains <code>SizeConstraint</code> objects, which specify the parts of web requests that you
 * want AWS WAF to inspect the size of. If a <code>SizeConstraintSet</code> contains more than one
 * <code>SizeConstraint</code> object, a request only needs to match one constraint to be considered a match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/SizeConstraintSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SizeConstraintSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for a <code>SizeConstraintSet</code>. You use <code>SizeConstraintSetId</code> to get
     * information about a <code>SizeConstraintSet</code> (see <a>GetSizeConstraintSet</a>), update a
     * <code>SizeConstraintSet</code> (see <a>UpdateSizeConstraintSet</a>), insert a <code>SizeConstraintSet</code> into
     * a <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>SizeConstraintSet</code> from AWS WAF (see <a>DeleteSizeConstraintSet</a>).
     * </p>
     * <p>
     * <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     * <a>ListSizeConstraintSets</a>.
     * </p>
     */
    private String sizeConstraintSetId;
    /**
     * <p>
     * The name, if any, of the <code>SizeConstraintSet</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect the size of.
     * </p>
     */
    private java.util.List<SizeConstraint> sizeConstraints;

    /**
     * <p>
     * A unique identifier for a <code>SizeConstraintSet</code>. You use <code>SizeConstraintSetId</code> to get
     * information about a <code>SizeConstraintSet</code> (see <a>GetSizeConstraintSet</a>), update a
     * <code>SizeConstraintSet</code> (see <a>UpdateSizeConstraintSet</a>), insert a <code>SizeConstraintSet</code> into
     * a <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>SizeConstraintSet</code> from AWS WAF (see <a>DeleteSizeConstraintSet</a>).
     * </p>
     * <p>
     * <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     * <a>ListSizeConstraintSets</a>.
     * </p>
     * 
     * @param sizeConstraintSetId
     *        A unique identifier for a <code>SizeConstraintSet</code>. You use <code>SizeConstraintSetId</code> to get
     *        information about a <code>SizeConstraintSet</code> (see <a>GetSizeConstraintSet</a>), update a
     *        <code>SizeConstraintSet</code> (see <a>UpdateSizeConstraintSet</a>), insert a
     *        <code>SizeConstraintSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     *        <a>UpdateRule</a>), and delete a <code>SizeConstraintSet</code> from AWS WAF (see
     *        <a>DeleteSizeConstraintSet</a>).</p>
     *        <p>
     *        <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     *        <a>ListSizeConstraintSets</a>.
     */

    public void setSizeConstraintSetId(String sizeConstraintSetId) {
        this.sizeConstraintSetId = sizeConstraintSetId;
    }

    /**
     * <p>
     * A unique identifier for a <code>SizeConstraintSet</code>. You use <code>SizeConstraintSetId</code> to get
     * information about a <code>SizeConstraintSet</code> (see <a>GetSizeConstraintSet</a>), update a
     * <code>SizeConstraintSet</code> (see <a>UpdateSizeConstraintSet</a>), insert a <code>SizeConstraintSet</code> into
     * a <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>SizeConstraintSet</code> from AWS WAF (see <a>DeleteSizeConstraintSet</a>).
     * </p>
     * <p>
     * <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     * <a>ListSizeConstraintSets</a>.
     * </p>
     * 
     * @return A unique identifier for a <code>SizeConstraintSet</code>. You use <code>SizeConstraintSetId</code> to get
     *         information about a <code>SizeConstraintSet</code> (see <a>GetSizeConstraintSet</a>), update a
     *         <code>SizeConstraintSet</code> (see <a>UpdateSizeConstraintSet</a>), insert a
     *         <code>SizeConstraintSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     *         <a>UpdateRule</a>), and delete a <code>SizeConstraintSet</code> from AWS WAF (see
     *         <a>DeleteSizeConstraintSet</a>).</p>
     *         <p>
     *         <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     *         <a>ListSizeConstraintSets</a>.
     */

    public String getSizeConstraintSetId() {
        return this.sizeConstraintSetId;
    }

    /**
     * <p>
     * A unique identifier for a <code>SizeConstraintSet</code>. You use <code>SizeConstraintSetId</code> to get
     * information about a <code>SizeConstraintSet</code> (see <a>GetSizeConstraintSet</a>), update a
     * <code>SizeConstraintSet</code> (see <a>UpdateSizeConstraintSet</a>), insert a <code>SizeConstraintSet</code> into
     * a <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     * <code>SizeConstraintSet</code> from AWS WAF (see <a>DeleteSizeConstraintSet</a>).
     * </p>
     * <p>
     * <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     * <a>ListSizeConstraintSets</a>.
     * </p>
     * 
     * @param sizeConstraintSetId
     *        A unique identifier for a <code>SizeConstraintSet</code>. You use <code>SizeConstraintSetId</code> to get
     *        information about a <code>SizeConstraintSet</code> (see <a>GetSizeConstraintSet</a>), update a
     *        <code>SizeConstraintSet</code> (see <a>UpdateSizeConstraintSet</a>), insert a
     *        <code>SizeConstraintSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     *        <a>UpdateRule</a>), and delete a <code>SizeConstraintSet</code> from AWS WAF (see
     *        <a>DeleteSizeConstraintSet</a>).</p>
     *        <p>
     *        <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     *        <a>ListSizeConstraintSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SizeConstraintSet withSizeConstraintSetId(String sizeConstraintSetId) {
        setSizeConstraintSetId(sizeConstraintSetId);
        return this;
    }

    /**
     * <p>
     * The name, if any, of the <code>SizeConstraintSet</code>.
     * </p>
     * 
     * @param name
     *        The name, if any, of the <code>SizeConstraintSet</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name, if any, of the <code>SizeConstraintSet</code>.
     * </p>
     * 
     * @return The name, if any, of the <code>SizeConstraintSet</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name, if any, of the <code>SizeConstraintSet</code>.
     * </p>
     * 
     * @param name
     *        The name, if any, of the <code>SizeConstraintSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SizeConstraintSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect the size of.
     * </p>
     * 
     * @return Specifies the parts of web requests that you want to inspect the size of.
     */

    public java.util.List<SizeConstraint> getSizeConstraints() {
        return sizeConstraints;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect the size of.
     * </p>
     * 
     * @param sizeConstraints
     *        Specifies the parts of web requests that you want to inspect the size of.
     */

    public void setSizeConstraints(java.util.Collection<SizeConstraint> sizeConstraints) {
        if (sizeConstraints == null) {
            this.sizeConstraints = null;
            return;
        }

        this.sizeConstraints = new java.util.ArrayList<SizeConstraint>(sizeConstraints);
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect the size of.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSizeConstraints(java.util.Collection)} or {@link #withSizeConstraints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sizeConstraints
     *        Specifies the parts of web requests that you want to inspect the size of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SizeConstraintSet withSizeConstraints(SizeConstraint... sizeConstraints) {
        if (this.sizeConstraints == null) {
            setSizeConstraints(new java.util.ArrayList<SizeConstraint>(sizeConstraints.length));
        }
        for (SizeConstraint ele : sizeConstraints) {
            this.sizeConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the parts of web requests that you want to inspect the size of.
     * </p>
     * 
     * @param sizeConstraints
     *        Specifies the parts of web requests that you want to inspect the size of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SizeConstraintSet withSizeConstraints(java.util.Collection<SizeConstraint> sizeConstraints) {
        setSizeConstraints(sizeConstraints);
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
        if (getSizeConstraintSetId() != null)
            sb.append("SizeConstraintSetId: ").append(getSizeConstraintSetId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSizeConstraints() != null)
            sb.append("SizeConstraints: ").append(getSizeConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SizeConstraintSet == false)
            return false;
        SizeConstraintSet other = (SizeConstraintSet) obj;
        if (other.getSizeConstraintSetId() == null ^ this.getSizeConstraintSetId() == null)
            return false;
        if (other.getSizeConstraintSetId() != null && other.getSizeConstraintSetId().equals(this.getSizeConstraintSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSizeConstraints() == null ^ this.getSizeConstraints() == null)
            return false;
        if (other.getSizeConstraints() != null && other.getSizeConstraints().equals(this.getSizeConstraints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSizeConstraintSetId() == null) ? 0 : getSizeConstraintSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSizeConstraints() == null) ? 0 : getSizeConstraints().hashCode());
        return hashCode;
    }

    @Override
    public SizeConstraintSet clone() {
        try {
            return (SizeConstraintSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.SizeConstraintSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
