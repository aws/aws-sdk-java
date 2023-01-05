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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information for sorting a list of domains.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/SortCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SortCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Field to be used for sorting the list of domains. It can be either the name or the expiration for a domain. Note
     * that if <code>filterCondition</code> is used in the same <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains__ListDomains.html">ListDomains</a>
     * call, the field used for sorting has to be the same as the field used for filtering.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The sort order for a list of domains. Either ascending (ASC) or descending (DES).
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * Field to be used for sorting the list of domains. It can be either the name or the expiration for a domain. Note
     * that if <code>filterCondition</code> is used in the same <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains__ListDomains.html">ListDomains</a>
     * call, the field used for sorting has to be the same as the field used for filtering.
     * </p>
     * 
     * @param name
     *        Field to be used for sorting the list of domains. It can be either the name or the expiration for a
     *        domain. Note that if <code>filterCondition</code> is used in the same <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains__ListDomains.html"
     *        >ListDomains</a> call, the field used for sorting has to be the same as the field used for filtering.
     * @see ListDomainsAttributeName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Field to be used for sorting the list of domains. It can be either the name or the expiration for a domain. Note
     * that if <code>filterCondition</code> is used in the same <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains__ListDomains.html">ListDomains</a>
     * call, the field used for sorting has to be the same as the field used for filtering.
     * </p>
     * 
     * @return Field to be used for sorting the list of domains. It can be either the name or the expiration for a
     *         domain. Note that if <code>filterCondition</code> is used in the same <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains__ListDomains.html"
     *         >ListDomains</a> call, the field used for sorting has to be the same as the field used for filtering.
     * @see ListDomainsAttributeName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Field to be used for sorting the list of domains. It can be either the name or the expiration for a domain. Note
     * that if <code>filterCondition</code> is used in the same <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains__ListDomains.html">ListDomains</a>
     * call, the field used for sorting has to be the same as the field used for filtering.
     * </p>
     * 
     * @param name
     *        Field to be used for sorting the list of domains. It can be either the name or the expiration for a
     *        domain. Note that if <code>filterCondition</code> is used in the same <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains__ListDomains.html"
     *        >ListDomains</a> call, the field used for sorting has to be the same as the field used for filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListDomainsAttributeName
     */

    public SortCondition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Field to be used for sorting the list of domains. It can be either the name or the expiration for a domain. Note
     * that if <code>filterCondition</code> is used in the same <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains__ListDomains.html">ListDomains</a>
     * call, the field used for sorting has to be the same as the field used for filtering.
     * </p>
     * 
     * @param name
     *        Field to be used for sorting the list of domains. It can be either the name or the expiration for a
     *        domain. Note that if <code>filterCondition</code> is used in the same <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains__ListDomains.html"
     *        >ListDomains</a> call, the field used for sorting has to be the same as the field used for filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListDomainsAttributeName
     */

    public SortCondition withName(ListDomainsAttributeName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for a list of domains. Either ascending (ASC) or descending (DES).
     * </p>
     * 
     * @param sortOrder
     *        The sort order for a list of domains. Either ascending (ASC) or descending (DES).
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for a list of domains. Either ascending (ASC) or descending (DES).
     * </p>
     * 
     * @return The sort order for a list of domains. Either ascending (ASC) or descending (DES).
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order for a list of domains. Either ascending (ASC) or descending (DES).
     * </p>
     * 
     * @param sortOrder
     *        The sort order for a list of domains. Either ascending (ASC) or descending (DES).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SortCondition withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order for a list of domains. Either ascending (ASC) or descending (DES).
     * </p>
     * 
     * @param sortOrder
     *        The sort order for a list of domains. Either ascending (ASC) or descending (DES).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SortCondition withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SortCondition == false)
            return false;
        SortCondition other = (SortCondition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public SortCondition clone() {
        try {
            return (SortCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.SortConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
