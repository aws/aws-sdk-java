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
 * Specifies the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
 * <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, and <a>SizeConstraintSet</a> objects that you want to add to a
 * <code>Rule</code> and, for each object, indicates whether you want to negate the settings, for example, requests that
 * do NOT originate from the IP address 192.0.2.44.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/Predicate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Predicate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set <code>Negated</code> to <code>False</code> if you want AWS WAF to allow, block, or count requests based on
     * the settings in the specified <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     * <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code>
     * includes the IP address <code>192.0.2.44</code>, AWS WAF will allow or block requests based on that IP address.
     * </p>
     * <p>
     * Set <code>Negated</code> to <code>True</code> if you want AWS WAF to allow or block a request based on the
     * negation of the settings in the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if an
     * <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or count requests
     * based on all IP addresses <i>except</i> <code>192.0.2.44</code>.
     * </p>
     */
    private Boolean negated;
    /**
     * <p>
     * The type of predicate in a <code>Rule</code>, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A unique identifier for a predicate in a <code>Rule</code>, such as <code>ByteMatchSetId</code> or
     * <code>IPSetId</code>. The ID is returned by the corresponding <code>Create</code> or <code>List</code> command.
     * </p>
     */
    private String dataId;

    /**
     * <p>
     * Set <code>Negated</code> to <code>False</code> if you want AWS WAF to allow, block, or count requests based on
     * the settings in the specified <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     * <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code>
     * includes the IP address <code>192.0.2.44</code>, AWS WAF will allow or block requests based on that IP address.
     * </p>
     * <p>
     * Set <code>Negated</code> to <code>True</code> if you want AWS WAF to allow or block a request based on the
     * negation of the settings in the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if an
     * <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or count requests
     * based on all IP addresses <i>except</i> <code>192.0.2.44</code>.
     * </p>
     * 
     * @param negated
     *        Set <code>Negated</code> to <code>False</code> if you want AWS WAF to allow, block, or count requests
     *        based on the settings in the specified <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     *        <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if
     *        an <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow or block
     *        requests based on that IP address.</p>
     *        <p>
     *        Set <code>Negated</code> to <code>True</code> if you want AWS WAF to allow or block a request based on the
     *        negation of the settings in the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     *        <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if
     *        an <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or count
     *        requests based on all IP addresses <i>except</i> <code>192.0.2.44</code>.
     */

    public void setNegated(Boolean negated) {
        this.negated = negated;
    }

    /**
     * <p>
     * Set <code>Negated</code> to <code>False</code> if you want AWS WAF to allow, block, or count requests based on
     * the settings in the specified <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     * <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code>
     * includes the IP address <code>192.0.2.44</code>, AWS WAF will allow or block requests based on that IP address.
     * </p>
     * <p>
     * Set <code>Negated</code> to <code>True</code> if you want AWS WAF to allow or block a request based on the
     * negation of the settings in the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if an
     * <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or count requests
     * based on all IP addresses <i>except</i> <code>192.0.2.44</code>.
     * </p>
     * 
     * @return Set <code>Negated</code> to <code>False</code> if you want AWS WAF to allow, block, or count requests
     *         based on the settings in the specified <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     *         <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example,
     *         if an <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow or block
     *         requests based on that IP address.</p>
     *         <p>
     *         Set <code>Negated</code> to <code>True</code> if you want AWS WAF to allow or block a request based on
     *         the negation of the settings in the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     *         <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example,
     *         if an <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or
     *         count requests based on all IP addresses <i>except</i> <code>192.0.2.44</code>.
     */

    public Boolean getNegated() {
        return this.negated;
    }

    /**
     * <p>
     * Set <code>Negated</code> to <code>False</code> if you want AWS WAF to allow, block, or count requests based on
     * the settings in the specified <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     * <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code>
     * includes the IP address <code>192.0.2.44</code>, AWS WAF will allow or block requests based on that IP address.
     * </p>
     * <p>
     * Set <code>Negated</code> to <code>True</code> if you want AWS WAF to allow or block a request based on the
     * negation of the settings in the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if an
     * <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or count requests
     * based on all IP addresses <i>except</i> <code>192.0.2.44</code>.
     * </p>
     * 
     * @param negated
     *        Set <code>Negated</code> to <code>False</code> if you want AWS WAF to allow, block, or count requests
     *        based on the settings in the specified <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     *        <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if
     *        an <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow or block
     *        requests based on that IP address.</p>
     *        <p>
     *        Set <code>Negated</code> to <code>True</code> if you want AWS WAF to allow or block a request based on the
     *        negation of the settings in the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     *        <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if
     *        an <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or count
     *        requests based on all IP addresses <i>except</i> <code>192.0.2.44</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predicate withNegated(Boolean negated) {
        setNegated(negated);
        return this;
    }

    /**
     * <p>
     * Set <code>Negated</code> to <code>False</code> if you want AWS WAF to allow, block, or count requests based on
     * the settings in the specified <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>, <a>XssMatchSet</a>,
     * <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if an <code>IPSet</code>
     * includes the IP address <code>192.0.2.44</code>, AWS WAF will allow or block requests based on that IP address.
     * </p>
     * <p>
     * Set <code>Negated</code> to <code>True</code> if you want AWS WAF to allow or block a request based on the
     * negation of the settings in the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     * <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example, if an
     * <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or count requests
     * based on all IP addresses <i>except</i> <code>192.0.2.44</code>.
     * </p>
     * 
     * @return Set <code>Negated</code> to <code>False</code> if you want AWS WAF to allow, block, or count requests
     *         based on the settings in the specified <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     *         <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example,
     *         if an <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow or block
     *         requests based on that IP address.</p>
     *         <p>
     *         Set <code>Negated</code> to <code>True</code> if you want AWS WAF to allow or block a request based on
     *         the negation of the settings in the <a>ByteMatchSet</a>, <a>IPSet</a>, <a>SqlInjectionMatchSet</a>,
     *         <a>XssMatchSet</a>, <a>RegexMatchSet</a>, <a>GeoMatchSet</a>, or <a>SizeConstraintSet</a>. For example,
     *         if an <code>IPSet</code> includes the IP address <code>192.0.2.44</code>, AWS WAF will allow, block, or
     *         count requests based on all IP addresses <i>except</i> <code>192.0.2.44</code>.
     */

    public Boolean isNegated() {
        return this.negated;
    }

    /**
     * <p>
     * The type of predicate in a <code>Rule</code>, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * 
     * @param type
     *        The type of predicate in a <code>Rule</code>, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * @see PredicateType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of predicate in a <code>Rule</code>, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * 
     * @return The type of predicate in a <code>Rule</code>, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * @see PredicateType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of predicate in a <code>Rule</code>, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * 
     * @param type
     *        The type of predicate in a <code>Rule</code>, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PredicateType
     */

    public Predicate withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of predicate in a <code>Rule</code>, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * 
     * @param type
     *        The type of predicate in a <code>Rule</code>, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * @see PredicateType
     */

    public void setType(PredicateType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of predicate in a <code>Rule</code>, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * 
     * @param type
     *        The type of predicate in a <code>Rule</code>, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PredicateType
     */

    public Predicate withType(PredicateType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for a predicate in a <code>Rule</code>, such as <code>ByteMatchSetId</code> or
     * <code>IPSetId</code>. The ID is returned by the corresponding <code>Create</code> or <code>List</code> command.
     * </p>
     * 
     * @param dataId
     *        A unique identifier for a predicate in a <code>Rule</code>, such as <code>ByteMatchSetId</code> or
     *        <code>IPSetId</code>. The ID is returned by the corresponding <code>Create</code> or <code>List</code>
     *        command.
     */

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    /**
     * <p>
     * A unique identifier for a predicate in a <code>Rule</code>, such as <code>ByteMatchSetId</code> or
     * <code>IPSetId</code>. The ID is returned by the corresponding <code>Create</code> or <code>List</code> command.
     * </p>
     * 
     * @return A unique identifier for a predicate in a <code>Rule</code>, such as <code>ByteMatchSetId</code> or
     *         <code>IPSetId</code>. The ID is returned by the corresponding <code>Create</code> or <code>List</code>
     *         command.
     */

    public String getDataId() {
        return this.dataId;
    }

    /**
     * <p>
     * A unique identifier for a predicate in a <code>Rule</code>, such as <code>ByteMatchSetId</code> or
     * <code>IPSetId</code>. The ID is returned by the corresponding <code>Create</code> or <code>List</code> command.
     * </p>
     * 
     * @param dataId
     *        A unique identifier for a predicate in a <code>Rule</code>, such as <code>ByteMatchSetId</code> or
     *        <code>IPSetId</code>. The ID is returned by the corresponding <code>Create</code> or <code>List</code>
     *        command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predicate withDataId(String dataId) {
        setDataId(dataId);
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
        if (getNegated() != null)
            sb.append("Negated: ").append(getNegated()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDataId() != null)
            sb.append("DataId: ").append(getDataId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Predicate == false)
            return false;
        Predicate other = (Predicate) obj;
        if (other.getNegated() == null ^ this.getNegated() == null)
            return false;
        if (other.getNegated() != null && other.getNegated().equals(this.getNegated()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDataId() == null ^ this.getDataId() == null)
            return false;
        if (other.getDataId() != null && other.getDataId().equals(this.getDataId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNegated() == null) ? 0 : getNegated().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDataId() == null) ? 0 : getDataId().hashCode());
        return hashCode;
    }

    @Override
    public Predicate clone() {
        try {
            return (Predicate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.PredicateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
