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
 * Returned by <a>ListByteMatchSets</a>. Each <code>ByteMatchSetSummary</code> object includes the <code>Name</code> and
 * <code>ByteMatchSetId</code> for one <a>ByteMatchSet</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ByteMatchSetSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ByteMatchSetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to get
     * information about a <code>ByteMatchSet</code>, update a <code>ByteMatchSet</code>, remove a
     * <code>ByteMatchSet</code> from a <code>Rule</code>, and delete a <code>ByteMatchSet</code> from AWS WAF.
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
     * The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to get
     * information about a <code>ByteMatchSet</code>, update a <code>ByteMatchSet</code>, remove a
     * <code>ByteMatchSet</code> from a <code>Rule</code>, and delete a <code>ByteMatchSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     * 
     * @param byteMatchSetId
     *        The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to
     *        get information about a <code>ByteMatchSet</code>, update a <code>ByteMatchSet</code>, remove a
     *        <code>ByteMatchSet</code> from a <code>Rule</code>, and delete a <code>ByteMatchSet</code> from AWS
     *        WAF.</p>
     *        <p>
     *        <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     */

    public void setByteMatchSetId(String byteMatchSetId) {
        this.byteMatchSetId = byteMatchSetId;
    }

    /**
     * <p>
     * The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to get
     * information about a <code>ByteMatchSet</code>, update a <code>ByteMatchSet</code>, remove a
     * <code>ByteMatchSet</code> from a <code>Rule</code>, and delete a <code>ByteMatchSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     * 
     * @return The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to
     *         get information about a <code>ByteMatchSet</code>, update a <code>ByteMatchSet</code>, remove a
     *         <code>ByteMatchSet</code> from a <code>Rule</code>, and delete a <code>ByteMatchSet</code> from AWS
     *         WAF.</p>
     *         <p>
     *         <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     */

    public String getByteMatchSetId() {
        return this.byteMatchSetId;
    }

    /**
     * <p>
     * The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to get
     * information about a <code>ByteMatchSet</code>, update a <code>ByteMatchSet</code>, remove a
     * <code>ByteMatchSet</code> from a <code>Rule</code>, and delete a <code>ByteMatchSet</code> from AWS WAF.
     * </p>
     * <p>
     * <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * </p>
     * 
     * @param byteMatchSetId
     *        The <code>ByteMatchSetId</code> for a <code>ByteMatchSet</code>. You use <code>ByteMatchSetId</code> to
     *        get information about a <code>ByteMatchSet</code>, update a <code>ByteMatchSet</code>, remove a
     *        <code>ByteMatchSet</code> from a <code>Rule</code>, and delete a <code>ByteMatchSet</code> from AWS
     *        WAF.</p>
     *        <p>
     *        <code>ByteMatchSetId</code> is returned by <a>CreateByteMatchSet</a> and by <a>ListByteMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteMatchSetSummary withByteMatchSetId(String byteMatchSetId) {
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

    public ByteMatchSetSummary withName(String name) {
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
        if (getByteMatchSetId() != null)
            sb.append("ByteMatchSetId: ").append(getByteMatchSetId()).append(",");
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

        if (obj instanceof ByteMatchSetSummary == false)
            return false;
        ByteMatchSetSummary other = (ByteMatchSetSummary) obj;
        if (other.getByteMatchSetId() == null ^ this.getByteMatchSetId() == null)
            return false;
        if (other.getByteMatchSetId() != null && other.getByteMatchSetId().equals(this.getByteMatchSetId()) == false)
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

        hashCode = prime * hashCode + ((getByteMatchSetId() == null) ? 0 : getByteMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ByteMatchSetSummary clone() {
        try {
            return (ByteMatchSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.ByteMatchSetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
