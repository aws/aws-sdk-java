/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for a match predicate. A predicate might look for characteristics such as specific IP addresses, geographic
 * locations, or sizes.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafRegionalRateBasedRuleMatchPredicate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafRegionalRateBasedRuleMatchPredicate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the predicate.
     * </p>
     */
    private String dataId;
    /**
     * <p>
     * If set to <code>true</code>, then the rule actions are performed on requests that match the predicate settings.
     * </p>
     * <p>
     * If set to <code>false</code>, then the rule actions are performed on all requests except those that match the
     * predicate settings.
     * </p>
     */
    private Boolean negated;
    /**
     * <p>
     * The type of predicate. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ByteMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GeoMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IPMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RegexMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SqlInjectionMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XssMatch</code>
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The unique identifier for the predicate.
     * </p>
     * 
     * @param dataId
     *        The unique identifier for the predicate.
     */

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    /**
     * <p>
     * The unique identifier for the predicate.
     * </p>
     * 
     * @return The unique identifier for the predicate.
     */

    public String getDataId() {
        return this.dataId;
    }

    /**
     * <p>
     * The unique identifier for the predicate.
     * </p>
     * 
     * @param dataId
     *        The unique identifier for the predicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalRateBasedRuleMatchPredicate withDataId(String dataId) {
        setDataId(dataId);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, then the rule actions are performed on requests that match the predicate settings.
     * </p>
     * <p>
     * If set to <code>false</code>, then the rule actions are performed on all requests except those that match the
     * predicate settings.
     * </p>
     * 
     * @param negated
     *        If set to <code>true</code>, then the rule actions are performed on requests that match the predicate
     *        settings.</p>
     *        <p>
     *        If set to <code>false</code>, then the rule actions are performed on all requests except those that match
     *        the predicate settings.
     */

    public void setNegated(Boolean negated) {
        this.negated = negated;
    }

    /**
     * <p>
     * If set to <code>true</code>, then the rule actions are performed on requests that match the predicate settings.
     * </p>
     * <p>
     * If set to <code>false</code>, then the rule actions are performed on all requests except those that match the
     * predicate settings.
     * </p>
     * 
     * @return If set to <code>true</code>, then the rule actions are performed on requests that match the predicate
     *         settings.</p>
     *         <p>
     *         If set to <code>false</code>, then the rule actions are performed on all requests except those that match
     *         the predicate settings.
     */

    public Boolean getNegated() {
        return this.negated;
    }

    /**
     * <p>
     * If set to <code>true</code>, then the rule actions are performed on requests that match the predicate settings.
     * </p>
     * <p>
     * If set to <code>false</code>, then the rule actions are performed on all requests except those that match the
     * predicate settings.
     * </p>
     * 
     * @param negated
     *        If set to <code>true</code>, then the rule actions are performed on requests that match the predicate
     *        settings.</p>
     *        <p>
     *        If set to <code>false</code>, then the rule actions are performed on all requests except those that match
     *        the predicate settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalRateBasedRuleMatchPredicate withNegated(Boolean negated) {
        setNegated(negated);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, then the rule actions are performed on requests that match the predicate settings.
     * </p>
     * <p>
     * If set to <code>false</code>, then the rule actions are performed on all requests except those that match the
     * predicate settings.
     * </p>
     * 
     * @return If set to <code>true</code>, then the rule actions are performed on requests that match the predicate
     *         settings.</p>
     *         <p>
     *         If set to <code>false</code>, then the rule actions are performed on all requests except those that match
     *         the predicate settings.
     */

    public Boolean isNegated() {
        return this.negated;
    }

    /**
     * <p>
     * The type of predicate. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ByteMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GeoMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IPMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RegexMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SqlInjectionMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XssMatch</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of predicate. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ByteMatch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GeoMatch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IPMatch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RegexMatch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SizeConstraint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SqlInjectionMatch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XssMatch</code>
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of predicate. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ByteMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GeoMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IPMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RegexMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SqlInjectionMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XssMatch</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of predicate. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ByteMatch</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GeoMatch</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IPMatch</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RegexMatch</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SizeConstraint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SqlInjectionMatch</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XssMatch</code>
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of predicate. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ByteMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GeoMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IPMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RegexMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeConstraint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SqlInjectionMatch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XssMatch</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of predicate. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ByteMatch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GeoMatch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IPMatch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RegexMatch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SizeConstraint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SqlInjectionMatch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XssMatch</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRegionalRateBasedRuleMatchPredicate withType(String type) {
        setType(type);
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
        if (getDataId() != null)
            sb.append("DataId: ").append(getDataId()).append(",");
        if (getNegated() != null)
            sb.append("Negated: ").append(getNegated()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafRegionalRateBasedRuleMatchPredicate == false)
            return false;
        AwsWafRegionalRateBasedRuleMatchPredicate other = (AwsWafRegionalRateBasedRuleMatchPredicate) obj;
        if (other.getDataId() == null ^ this.getDataId() == null)
            return false;
        if (other.getDataId() != null && other.getDataId().equals(this.getDataId()) == false)
            return false;
        if (other.getNegated() == null ^ this.getNegated() == null)
            return false;
        if (other.getNegated() != null && other.getNegated().equals(this.getNegated()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataId() == null) ? 0 : getDataId().hashCode());
        hashCode = prime * hashCode + ((getNegated() == null) ? 0 : getNegated().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafRegionalRateBasedRuleMatchPredicate clone() {
        try {
            return (AwsWafRegionalRateBasedRuleMatchPredicate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafRegionalRateBasedRuleMatchPredicateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
