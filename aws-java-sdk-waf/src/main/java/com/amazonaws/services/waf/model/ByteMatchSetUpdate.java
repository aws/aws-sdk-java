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
 * In an <a>UpdateByteMatchSet</a> request, <code>ByteMatchSetUpdate</code> specifies whether to insert or delete a
 * <a>ByteMatchTuple</a> and includes the settings for the <code>ByteMatchTuple</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ByteMatchSetUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ByteMatchSetUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether to insert or delete a <a>ByteMatchTuple</a>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Information about the part of a web request that you want AWS WAF to inspect and the value that you want AWS WAF
     * to search for. If you specify <code>DELETE</code> for the value of <code>Action</code>, the
     * <code>ByteMatchTuple</code> values must exactly match the values in the <code>ByteMatchTuple</code> that you want
     * to delete from the <code>ByteMatchSet</code>.
     * </p>
     */
    private ByteMatchTuple byteMatchTuple;

    /**
     * <p>
     * Specifies whether to insert or delete a <a>ByteMatchTuple</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a <a>ByteMatchTuple</a>.
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <a>ByteMatchTuple</a>.
     * </p>
     * 
     * @return Specifies whether to insert or delete a <a>ByteMatchTuple</a>.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <a>ByteMatchTuple</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a <a>ByteMatchTuple</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public ByteMatchSetUpdate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <a>ByteMatchTuple</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a <a>ByteMatchTuple</a>.
     * @see ChangeAction
     */

    public void setAction(ChangeAction action) {
        withAction(action);
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <a>ByteMatchTuple</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a <a>ByteMatchTuple</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public ByteMatchSetUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Information about the part of a web request that you want AWS WAF to inspect and the value that you want AWS WAF
     * to search for. If you specify <code>DELETE</code> for the value of <code>Action</code>, the
     * <code>ByteMatchTuple</code> values must exactly match the values in the <code>ByteMatchTuple</code> that you want
     * to delete from the <code>ByteMatchSet</code>.
     * </p>
     * 
     * @param byteMatchTuple
     *        Information about the part of a web request that you want AWS WAF to inspect and the value that you want
     *        AWS WAF to search for. If you specify <code>DELETE</code> for the value of <code>Action</code>, the
     *        <code>ByteMatchTuple</code> values must exactly match the values in the <code>ByteMatchTuple</code> that
     *        you want to delete from the <code>ByteMatchSet</code>.
     */

    public void setByteMatchTuple(ByteMatchTuple byteMatchTuple) {
        this.byteMatchTuple = byteMatchTuple;
    }

    /**
     * <p>
     * Information about the part of a web request that you want AWS WAF to inspect and the value that you want AWS WAF
     * to search for. If you specify <code>DELETE</code> for the value of <code>Action</code>, the
     * <code>ByteMatchTuple</code> values must exactly match the values in the <code>ByteMatchTuple</code> that you want
     * to delete from the <code>ByteMatchSet</code>.
     * </p>
     * 
     * @return Information about the part of a web request that you want AWS WAF to inspect and the value that you want
     *         AWS WAF to search for. If you specify <code>DELETE</code> for the value of <code>Action</code>, the
     *         <code>ByteMatchTuple</code> values must exactly match the values in the <code>ByteMatchTuple</code> that
     *         you want to delete from the <code>ByteMatchSet</code>.
     */

    public ByteMatchTuple getByteMatchTuple() {
        return this.byteMatchTuple;
    }

    /**
     * <p>
     * Information about the part of a web request that you want AWS WAF to inspect and the value that you want AWS WAF
     * to search for. If you specify <code>DELETE</code> for the value of <code>Action</code>, the
     * <code>ByteMatchTuple</code> values must exactly match the values in the <code>ByteMatchTuple</code> that you want
     * to delete from the <code>ByteMatchSet</code>.
     * </p>
     * 
     * @param byteMatchTuple
     *        Information about the part of a web request that you want AWS WAF to inspect and the value that you want
     *        AWS WAF to search for. If you specify <code>DELETE</code> for the value of <code>Action</code>, the
     *        <code>ByteMatchTuple</code> values must exactly match the values in the <code>ByteMatchTuple</code> that
     *        you want to delete from the <code>ByteMatchSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteMatchSetUpdate withByteMatchTuple(ByteMatchTuple byteMatchTuple) {
        setByteMatchTuple(byteMatchTuple);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getByteMatchTuple() != null)
            sb.append("ByteMatchTuple: ").append(getByteMatchTuple());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ByteMatchSetUpdate == false)
            return false;
        ByteMatchSetUpdate other = (ByteMatchSetUpdate) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getByteMatchTuple() == null ^ this.getByteMatchTuple() == null)
            return false;
        if (other.getByteMatchTuple() != null && other.getByteMatchTuple().equals(this.getByteMatchTuple()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getByteMatchTuple() == null) ? 0 : getByteMatchTuple().hashCode());
        return hashCode;
    }

    @Override
    public ByteMatchSetUpdate clone() {
        try {
            return (ByteMatchSetUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.ByteMatchSetUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
