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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the scope of a recommendation preference.
 * </p>
 * <p>
 * Recommendation preferences can be created at the organization level (for management accounts of an organization
 * only), account level, and resource level. For more information, see <a
 * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
 * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
 * </p>
 * <note>
 * <p>
 * You cannot create recommendation preferences for Auto Scaling groups at the organization and account levels. You can
 * create recommendation preferences for Auto Scaling groups only at the resource level by specifying a scope name of
 * <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon Resource Name (ARN). This will configure
 * the preference for all instances that are part of the specified Auto Scaling group. You also cannot create
 * recommendation preferences at the resource level for instances that are part of an Auto Scaling group. You can create
 * recommendation preferences at the resource level only for standalone instances.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/Scope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scope implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the scope.
     * </p>
     * <p>
     * The following scopes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Organization</code> - Specifies that the recommendation preference applies at the organization level, for
     * all member accounts of an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountId</code> - Specifies that the recommendation preference applies at the account level, for all
     * resources of a given resource type in an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceArn</code> - Specifies that the recommendation preference applies at the individual resource level.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The value of the scope.
     * </p>
     * <p>
     * If you specified the <code>name</code> of the scope as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Organization</code> - The <code>value</code> must be <code>ALL_ACCOUNTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountId</code> - The <code>value</code> must be a 12-digit Amazon Web Services account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceArn</code> - The <code>value</code> must be the Amazon Resource Name (ARN) of an EC2 instance or an
     * Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only EC2 instance and Auto Scaling group ARNs are currently supported.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the scope.
     * </p>
     * <p>
     * The following scopes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Organization</code> - Specifies that the recommendation preference applies at the organization level, for
     * all member accounts of an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountId</code> - Specifies that the recommendation preference applies at the account level, for all
     * resources of a given resource type in an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceArn</code> - Specifies that the recommendation preference applies at the individual resource level.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the scope.</p>
     *        <p>
     *        The following scopes are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Organization</code> - Specifies that the recommendation preference applies at the organization
     *        level, for all member accounts of an organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountId</code> - Specifies that the recommendation preference applies at the account level, for
     *        all resources of a given resource type in an account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceArn</code> - Specifies that the recommendation preference applies at the individual resource
     *        level.
     *        </p>
     *        </li>
     * @see ScopeName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the scope.
     * </p>
     * <p>
     * The following scopes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Organization</code> - Specifies that the recommendation preference applies at the organization level, for
     * all member accounts of an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountId</code> - Specifies that the recommendation preference applies at the account level, for all
     * resources of a given resource type in an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceArn</code> - Specifies that the recommendation preference applies at the individual resource level.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the scope.</p>
     *         <p>
     *         The following scopes are possible:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Organization</code> - Specifies that the recommendation preference applies at the organization
     *         level, for all member accounts of an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AccountId</code> - Specifies that the recommendation preference applies at the account level, for
     *         all resources of a given resource type in an account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceArn</code> - Specifies that the recommendation preference applies at the individual
     *         resource level.
     *         </p>
     *         </li>
     * @see ScopeName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the scope.
     * </p>
     * <p>
     * The following scopes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Organization</code> - Specifies that the recommendation preference applies at the organization level, for
     * all member accounts of an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountId</code> - Specifies that the recommendation preference applies at the account level, for all
     * resources of a given resource type in an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceArn</code> - Specifies that the recommendation preference applies at the individual resource level.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the scope.</p>
     *        <p>
     *        The following scopes are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Organization</code> - Specifies that the recommendation preference applies at the organization
     *        level, for all member accounts of an organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountId</code> - Specifies that the recommendation preference applies at the account level, for
     *        all resources of a given resource type in an account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceArn</code> - Specifies that the recommendation preference applies at the individual resource
     *        level.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScopeName
     */

    public Scope withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the scope.
     * </p>
     * <p>
     * The following scopes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Organization</code> - Specifies that the recommendation preference applies at the organization level, for
     * all member accounts of an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountId</code> - Specifies that the recommendation preference applies at the account level, for all
     * resources of a given resource type in an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceArn</code> - Specifies that the recommendation preference applies at the individual resource level.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the scope.</p>
     *        <p>
     *        The following scopes are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Organization</code> - Specifies that the recommendation preference applies at the organization
     *        level, for all member accounts of an organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountId</code> - Specifies that the recommendation preference applies at the account level, for
     *        all resources of a given resource type in an account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceArn</code> - Specifies that the recommendation preference applies at the individual resource
     *        level.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScopeName
     */

    public Scope withName(ScopeName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the scope.
     * </p>
     * <p>
     * If you specified the <code>name</code> of the scope as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Organization</code> - The <code>value</code> must be <code>ALL_ACCOUNTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountId</code> - The <code>value</code> must be a 12-digit Amazon Web Services account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceArn</code> - The <code>value</code> must be the Amazon Resource Name (ARN) of an EC2 instance or an
     * Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only EC2 instance and Auto Scaling group ARNs are currently supported.
     * </p>
     * 
     * @param value
     *        The value of the scope.</p>
     *        <p>
     *        If you specified the <code>name</code> of the scope as:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Organization</code> - The <code>value</code> must be <code>ALL_ACCOUNTS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountId</code> - The <code>value</code> must be a 12-digit Amazon Web Services account ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceArn</code> - The <code>value</code> must be the Amazon Resource Name (ARN) of an EC2
     *        instance or an Auto Scaling group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Only EC2 instance and Auto Scaling group ARNs are currently supported.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the scope.
     * </p>
     * <p>
     * If you specified the <code>name</code> of the scope as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Organization</code> - The <code>value</code> must be <code>ALL_ACCOUNTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountId</code> - The <code>value</code> must be a 12-digit Amazon Web Services account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceArn</code> - The <code>value</code> must be the Amazon Resource Name (ARN) of an EC2 instance or an
     * Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only EC2 instance and Auto Scaling group ARNs are currently supported.
     * </p>
     * 
     * @return The value of the scope.</p>
     *         <p>
     *         If you specified the <code>name</code> of the scope as:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Organization</code> - The <code>value</code> must be <code>ALL_ACCOUNTS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AccountId</code> - The <code>value</code> must be a 12-digit Amazon Web Services account ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceArn</code> - The <code>value</code> must be the Amazon Resource Name (ARN) of an EC2
     *         instance or an Auto Scaling group.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Only EC2 instance and Auto Scaling group ARNs are currently supported.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the scope.
     * </p>
     * <p>
     * If you specified the <code>name</code> of the scope as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Organization</code> - The <code>value</code> must be <code>ALL_ACCOUNTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountId</code> - The <code>value</code> must be a 12-digit Amazon Web Services account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceArn</code> - The <code>value</code> must be the Amazon Resource Name (ARN) of an EC2 instance or an
     * Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only EC2 instance and Auto Scaling group ARNs are currently supported.
     * </p>
     * 
     * @param value
     *        The value of the scope.</p>
     *        <p>
     *        If you specified the <code>name</code> of the scope as:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Organization</code> - The <code>value</code> must be <code>ALL_ACCOUNTS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountId</code> - The <code>value</code> must be a 12-digit Amazon Web Services account ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceArn</code> - The <code>value</code> must be the Amazon Resource Name (ARN) of an EC2
     *        instance or an Auto Scaling group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Only EC2 instance and Auto Scaling group ARNs are currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scope withValue(String value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scope == false)
            return false;
        Scope other = (Scope) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Scope clone() {
        try {
            return (Scope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ScopeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
