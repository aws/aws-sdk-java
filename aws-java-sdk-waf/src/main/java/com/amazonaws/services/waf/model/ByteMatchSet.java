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
 * In a <a>GetByteMatchSet</a> request, <code>ByteMatchSet</code> is a complex type that contains the
 * <code>ByteMatchSetId</code> and <code>Name</code> of a <code>ByteMatchSet</code>, and the values that you specified
 * when you updated the <code>ByteMatchSet</code>.
 * </p>
 * <p>
 * A complex type that contains <code>ByteMatchTuple</code> objects, which specify the parts of web requests that you
 * want AWS WAF to inspect and the values that you want AWS WAF to search for. If a <code>ByteMatchSet</code> contains
 * more than one <code>ByteMatchTuple</code> object, a request needs to match the settings in only one
 * <code>ByteMatchTuple</code> to be considered a match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ByteMatchSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ByteMatchSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to get
     * information about a <code>ByteMatchSet</code> (see <a>GetByteMatchSet</a>), update a <code>ByteMatchSet</code>
     * (see <a>UpdateByteMatchSet</a>), insert a <code>ByteMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>ByteMatchSet</code> from AWS WAF (see
     * <a>DeleteByteMatchSet</a>).
     * </p>
     * <p>
     * <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     */
    private String byteMatchSetId;
    /**
     * <p>
     * A friendly name or description of the <a>ByteMatchSet</a>. You can't change <code>Name</code> after you create a
     * <code>ByteMatchSet</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search
     * for in web requests, the location in requests that you want AWS WAF to search, and other settings.
     * </p>
     */
    private java.util.List<ByteMatchTuple> byteMatchTuples;

    /**
     * <p>
     * The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to get
     * information about a <code>ByteMatchSet</code> (see <a>GetByteMatchSet</a>), update a <code>ByteMatchSet</code>
     * (see <a>UpdateByteMatchSet</a>), insert a <code>ByteMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>ByteMatchSet</code> from AWS WAF (see
     * <a>DeleteByteMatchSet</a>).
     * </p>
     * <p>
     * <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     * 
     * @param byteMatchSetId
     *        The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to
     *        get information about a <code>ByteMatchSet</code> (see <a>GetByteMatchSet</a>), update a
     *        <code>ByteMatchSet</code> (see <a>UpdateByteMatchSet</a>), insert a <code>ByteMatchSet</code> into a
     *        <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     *        <code>ByteMatchSet</code> from AWS WAF (see <a>DeleteByteMatchSet</a>).</p>
     *        <p>
     *        <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     */

    public void setByteMatchSetId(String byteMatchSetId) {
        this.byteMatchSetId = byteMatchSetId;
    }

    /**
     * <p>
     * The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to get
     * information about a <code>ByteMatchSet</code> (see <a>GetByteMatchSet</a>), update a <code>ByteMatchSet</code>
     * (see <a>UpdateByteMatchSet</a>), insert a <code>ByteMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>ByteMatchSet</code> from AWS WAF (see
     * <a>DeleteByteMatchSet</a>).
     * </p>
     * <p>
     * <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     * 
     * @return The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to
     *         get information about a <code>ByteMatchSet</code> (see <a>GetByteMatchSet</a>), update a
     *         <code>ByteMatchSet</code> (see <a>UpdateByteMatchSet</a>), insert a <code>ByteMatchSet</code> into a
     *         <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     *         <code>ByteMatchSet</code> from AWS WAF (see <a>DeleteByteMatchSet</a>).</p>
     *         <p>
     *         <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     */

    public String getByteMatchSetId() {
        return this.byteMatchSetId;
    }

    /**
     * <p>
     * The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to get
     * information about a <code>ByteMatchSet</code> (see <a>GetByteMatchSet</a>), update a <code>ByteMatchSet</code>
     * (see <a>UpdateByteMatchSet</a>), insert a <code>ByteMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>ByteMatchSet</code> from AWS WAF (see
     * <a>DeleteByteMatchSet</a>).
     * </p>
     * <p>
     * <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     * 
     * @param byteMatchSetId
     *        The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to
     *        get information about a <code>ByteMatchSet</code> (see <a>GetByteMatchSet</a>), update a
     *        <code>ByteMatchSet</code> (see <a>UpdateByteMatchSet</a>), insert a <code>ByteMatchSet</code> into a
     *        <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a
     *        <code>ByteMatchSet</code> from AWS WAF (see <a>DeleteByteMatchSet</a>).</p>
     *        <p>
     *        <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteMatchSet withByteMatchSetId(String byteMatchSetId) {
        setByteMatchSetId(byteMatchSetId);
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>ByteMatchSet</a>. You can't change <code>Name</code> after you create a
     * <code>ByteMatchSet</code>.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>ByteMatchSet</a>. You can't change <code>Name</code> after you
     *        create a <code>ByteMatchSet</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>ByteMatchSet</a>. You can't change <code>Name</code> after you create a
     * <code>ByteMatchSet</code>.
     * </p>
     * 
     * @return A friendly name or description of the <a>ByteMatchSet</a>. You can't change <code>Name</code> after you
     *         create a <code>ByteMatchSet</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>ByteMatchSet</a>. You can't change <code>Name</code> after you create a
     * <code>ByteMatchSet</code>.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>ByteMatchSet</a>. You can't change <code>Name</code> after you
     *        create a <code>ByteMatchSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteMatchSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search
     * for in web requests, the location in requests that you want AWS WAF to search, and other settings.
     * </p>
     * 
     * @return Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to
     *         search for in web requests, the location in requests that you want AWS WAF to search, and other settings.
     */

    public java.util.List<ByteMatchTuple> getByteMatchTuples() {
        return byteMatchTuples;
    }

    /**
     * <p>
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search
     * for in web requests, the location in requests that you want AWS WAF to search, and other settings.
     * </p>
     * 
     * @param byteMatchTuples
     *        Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to
     *        search for in web requests, the location in requests that you want AWS WAF to search, and other settings.
     */

    public void setByteMatchTuples(java.util.Collection<ByteMatchTuple> byteMatchTuples) {
        if (byteMatchTuples == null) {
            this.byteMatchTuples = null;
            return;
        }

        this.byteMatchTuples = new java.util.ArrayList<ByteMatchTuple>(byteMatchTuples);
    }

    /**
     * <p>
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search
     * for in web requests, the location in requests that you want AWS WAF to search, and other settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setByteMatchTuples(java.util.Collection)} or {@link #withByteMatchTuples(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param byteMatchTuples
     *        Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to
     *        search for in web requests, the location in requests that you want AWS WAF to search, and other settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteMatchSet withByteMatchTuples(ByteMatchTuple... byteMatchTuples) {
        if (this.byteMatchTuples == null) {
            setByteMatchTuples(new java.util.ArrayList<ByteMatchTuple>(byteMatchTuples.length));
        }
        for (ByteMatchTuple ele : byteMatchTuples) {
            this.byteMatchTuples.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search
     * for in web requests, the location in requests that you want AWS WAF to search, and other settings.
     * </p>
     * 
     * @param byteMatchTuples
     *        Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to
     *        search for in web requests, the location in requests that you want AWS WAF to search, and other settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteMatchSet withByteMatchTuples(java.util.Collection<ByteMatchTuple> byteMatchTuples) {
        setByteMatchTuples(byteMatchTuples);
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
        if (getByteMatchSetId() != null)
            sb.append("ByteMatchSetId: ").append(getByteMatchSetId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getByteMatchTuples() != null)
            sb.append("ByteMatchTuples: ").append(getByteMatchTuples());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ByteMatchSet == false)
            return false;
        ByteMatchSet other = (ByteMatchSet) obj;
        if (other.getByteMatchSetId() == null ^ this.getByteMatchSetId() == null)
            return false;
        if (other.getByteMatchSetId() != null && other.getByteMatchSetId().equals(this.getByteMatchSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getByteMatchTuples() == null ^ this.getByteMatchTuples() == null)
            return false;
        if (other.getByteMatchTuples() != null && other.getByteMatchTuples().equals(this.getByteMatchTuples()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getByteMatchSetId() == null) ? 0 : getByteMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getByteMatchTuples() == null) ? 0 : getByteMatchTuples().hashCode());
        return hashCode;
    }

    @Override
    public ByteMatchSet clone() {
        try {
            return (ByteMatchSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.ByteMatchSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
