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
 * The <code>Id</code> and <code>Name</code> of a <code>SizeConstraintSet</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/SizeConstraintSetSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SizeConstraintSetSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The name of the <code>SizeConstraintSet</code>, if any.
     * </p>
     */
    private String name;

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

    public SizeConstraintSetSummary withSizeConstraintSetId(String sizeConstraintSetId) {
        setSizeConstraintSetId(sizeConstraintSetId);
        return this;
    }

    /**
     * <p>
     * The name of the <code>SizeConstraintSet</code>, if any.
     * </p>
     * 
     * @param name
     *        The name of the <code>SizeConstraintSet</code>, if any.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>SizeConstraintSet</code>, if any.
     * </p>
     * 
     * @return The name of the <code>SizeConstraintSet</code>, if any.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>SizeConstraintSet</code>, if any.
     * </p>
     * 
     * @param name
     *        The name of the <code>SizeConstraintSet</code>, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SizeConstraintSetSummary withName(String name) {
        setName(name);
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
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SizeConstraintSetSummary == false)
            return false;
        SizeConstraintSetSummary other = (SizeConstraintSetSummary) obj;
        if (other.getSizeConstraintSetId() == null ^ this.getSizeConstraintSetId() == null)
            return false;
        if (other.getSizeConstraintSetId() != null && other.getSizeConstraintSetId().equals(this.getSizeConstraintSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSizeConstraintSetId() == null) ? 0 : getSizeConstraintSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public SizeConstraintSetSummary clone() {
        try {
            return (SizeConstraintSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.SizeConstraintSetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
