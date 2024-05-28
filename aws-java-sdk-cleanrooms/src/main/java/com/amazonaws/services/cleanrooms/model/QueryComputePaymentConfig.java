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
 * An object representing the collaboration member's payment responsibilities set by the collaboration creator for query
 * compute costs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/QueryComputePaymentConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryComputePaymentConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the collaboration creator has configured the collaboration member to pay for query compute
     * costs (<code>TRUE</code>) or has not configured the collaboration member to pay for query compute costs (
     * <code>FALSE</code>).
     * </p>
     * <p>
     * Exactly one member can be configured to pay for query compute costs. An error is returned if the collaboration
     * creator sets a <code>TRUE</code> value for more than one member in the collaboration.
     * </p>
     * <p>
     * If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then the
     * member who can query is the default payer. An error is returned if the collaboration creator sets a
     * <code>FALSE</code> value for the member who can query.
     * </p>
     */
    private Boolean isResponsible;

    /**
     * <p>
     * Indicates whether the collaboration creator has configured the collaboration member to pay for query compute
     * costs (<code>TRUE</code>) or has not configured the collaboration member to pay for query compute costs (
     * <code>FALSE</code>).
     * </p>
     * <p>
     * Exactly one member can be configured to pay for query compute costs. An error is returned if the collaboration
     * creator sets a <code>TRUE</code> value for more than one member in the collaboration.
     * </p>
     * <p>
     * If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then the
     * member who can query is the default payer. An error is returned if the collaboration creator sets a
     * <code>FALSE</code> value for the member who can query.
     * </p>
     * 
     * @param isResponsible
     *        Indicates whether the collaboration creator has configured the collaboration member to pay for query
     *        compute costs (<code>TRUE</code>) or has not configured the collaboration member to pay for query compute
     *        costs (<code>FALSE</code>).</p>
     *        <p>
     *        Exactly one member can be configured to pay for query compute costs. An error is returned if the
     *        collaboration creator sets a <code>TRUE</code> value for more than one member in the collaboration.
     *        </p>
     *        <p>
     *        If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then
     *        the member who can query is the default payer. An error is returned if the collaboration creator sets a
     *        <code>FALSE</code> value for the member who can query.
     */

    public void setIsResponsible(Boolean isResponsible) {
        this.isResponsible = isResponsible;
    }

    /**
     * <p>
     * Indicates whether the collaboration creator has configured the collaboration member to pay for query compute
     * costs (<code>TRUE</code>) or has not configured the collaboration member to pay for query compute costs (
     * <code>FALSE</code>).
     * </p>
     * <p>
     * Exactly one member can be configured to pay for query compute costs. An error is returned if the collaboration
     * creator sets a <code>TRUE</code> value for more than one member in the collaboration.
     * </p>
     * <p>
     * If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then the
     * member who can query is the default payer. An error is returned if the collaboration creator sets a
     * <code>FALSE</code> value for the member who can query.
     * </p>
     * 
     * @return Indicates whether the collaboration creator has configured the collaboration member to pay for query
     *         compute costs (<code>TRUE</code>) or has not configured the collaboration member to pay for query compute
     *         costs (<code>FALSE</code>).</p>
     *         <p>
     *         Exactly one member can be configured to pay for query compute costs. An error is returned if the
     *         collaboration creator sets a <code>TRUE</code> value for more than one member in the collaboration.
     *         </p>
     *         <p>
     *         If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then
     *         the member who can query is the default payer. An error is returned if the collaboration creator sets a
     *         <code>FALSE</code> value for the member who can query.
     */

    public Boolean getIsResponsible() {
        return this.isResponsible;
    }

    /**
     * <p>
     * Indicates whether the collaboration creator has configured the collaboration member to pay for query compute
     * costs (<code>TRUE</code>) or has not configured the collaboration member to pay for query compute costs (
     * <code>FALSE</code>).
     * </p>
     * <p>
     * Exactly one member can be configured to pay for query compute costs. An error is returned if the collaboration
     * creator sets a <code>TRUE</code> value for more than one member in the collaboration.
     * </p>
     * <p>
     * If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then the
     * member who can query is the default payer. An error is returned if the collaboration creator sets a
     * <code>FALSE</code> value for the member who can query.
     * </p>
     * 
     * @param isResponsible
     *        Indicates whether the collaboration creator has configured the collaboration member to pay for query
     *        compute costs (<code>TRUE</code>) or has not configured the collaboration member to pay for query compute
     *        costs (<code>FALSE</code>).</p>
     *        <p>
     *        Exactly one member can be configured to pay for query compute costs. An error is returned if the
     *        collaboration creator sets a <code>TRUE</code> value for more than one member in the collaboration.
     *        </p>
     *        <p>
     *        If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then
     *        the member who can query is the default payer. An error is returned if the collaboration creator sets a
     *        <code>FALSE</code> value for the member who can query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryComputePaymentConfig withIsResponsible(Boolean isResponsible) {
        setIsResponsible(isResponsible);
        return this;
    }

    /**
     * <p>
     * Indicates whether the collaboration creator has configured the collaboration member to pay for query compute
     * costs (<code>TRUE</code>) or has not configured the collaboration member to pay for query compute costs (
     * <code>FALSE</code>).
     * </p>
     * <p>
     * Exactly one member can be configured to pay for query compute costs. An error is returned if the collaboration
     * creator sets a <code>TRUE</code> value for more than one member in the collaboration.
     * </p>
     * <p>
     * If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then the
     * member who can query is the default payer. An error is returned if the collaboration creator sets a
     * <code>FALSE</code> value for the member who can query.
     * </p>
     * 
     * @return Indicates whether the collaboration creator has configured the collaboration member to pay for query
     *         compute costs (<code>TRUE</code>) or has not configured the collaboration member to pay for query compute
     *         costs (<code>FALSE</code>).</p>
     *         <p>
     *         Exactly one member can be configured to pay for query compute costs. An error is returned if the
     *         collaboration creator sets a <code>TRUE</code> value for more than one member in the collaboration.
     *         </p>
     *         <p>
     *         If the collaboration creator hasn't specified anyone as the member paying for query compute costs, then
     *         the member who can query is the default payer. An error is returned if the collaboration creator sets a
     *         <code>FALSE</code> value for the member who can query.
     */

    public Boolean isResponsible() {
        return this.isResponsible;
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
        if (getIsResponsible() != null)
            sb.append("IsResponsible: ").append(getIsResponsible());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryComputePaymentConfig == false)
            return false;
        QueryComputePaymentConfig other = (QueryComputePaymentConfig) obj;
        if (other.getIsResponsible() == null ^ this.getIsResponsible() == null)
            return false;
        if (other.getIsResponsible() != null && other.getIsResponsible().equals(this.getIsResponsible()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsResponsible() == null) ? 0 : getIsResponsible().hashCode());
        return hashCode;
    }

    @Override
    public QueryComputePaymentConfig clone() {
        try {
            return (QueryComputePaymentConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.QueryComputePaymentConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
