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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreatePartnerEventSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePartnerEventSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the partner event source. This name must be unique and must be in the format
     * <code> <i>partner_name</i>/<i>event_namespace</i>/<i>event_name</i> </code>. The AWS account that wants to use
     * this partner event source must create a partner event bus with a name that matches the name of the partner event
     * source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The AWS account ID of the customer who is permitted to create a matching partner event bus for this partner event
     * source.
     * </p>
     */
    private String account;

    /**
     * <p>
     * The name of the partner event source. This name must be unique and must be in the format
     * <code> <i>partner_name</i>/<i>event_namespace</i>/<i>event_name</i> </code>. The AWS account that wants to use
     * this partner event source must create a partner event bus with a name that matches the name of the partner event
     * source.
     * </p>
     * 
     * @param name
     *        The name of the partner event source. This name must be unique and must be in the format
     *        <code> <i>partner_name</i>/<i>event_namespace</i>/<i>event_name</i> </code>. The AWS account that wants to
     *        use this partner event source must create a partner event bus with a name that matches the name of the
     *        partner event source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the partner event source. This name must be unique and must be in the format
     * <code> <i>partner_name</i>/<i>event_namespace</i>/<i>event_name</i> </code>. The AWS account that wants to use
     * this partner event source must create a partner event bus with a name that matches the name of the partner event
     * source.
     * </p>
     * 
     * @return The name of the partner event source. This name must be unique and must be in the format
     *         <code> <i>partner_name</i>/<i>event_namespace</i>/<i>event_name</i> </code>. The AWS account that wants
     *         to use this partner event source must create a partner event bus with a name that matches the name of the
     *         partner event source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the partner event source. This name must be unique and must be in the format
     * <code> <i>partner_name</i>/<i>event_namespace</i>/<i>event_name</i> </code>. The AWS account that wants to use
     * this partner event source must create a partner event bus with a name that matches the name of the partner event
     * source.
     * </p>
     * 
     * @param name
     *        The name of the partner event source. This name must be unique and must be in the format
     *        <code> <i>partner_name</i>/<i>event_namespace</i>/<i>event_name</i> </code>. The AWS account that wants to
     *        use this partner event source must create a partner event bus with a name that matches the name of the
     *        partner event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePartnerEventSourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the customer who is permitted to create a matching partner event bus for this partner event
     * source.
     * </p>
     * 
     * @param account
     *        The AWS account ID of the customer who is permitted to create a matching partner event bus for this
     *        partner event source.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The AWS account ID of the customer who is permitted to create a matching partner event bus for this partner event
     * source.
     * </p>
     * 
     * @return The AWS account ID of the customer who is permitted to create a matching partner event bus for this
     *         partner event source.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The AWS account ID of the customer who is permitted to create a matching partner event bus for this partner event
     * source.
     * </p>
     * 
     * @param account
     *        The AWS account ID of the customer who is permitted to create a matching partner event bus for this
     *        partner event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePartnerEventSourceRequest withAccount(String account) {
        setAccount(account);
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
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePartnerEventSourceRequest == false)
            return false;
        CreatePartnerEventSourceRequest other = (CreatePartnerEventSourceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        return hashCode;
    }

    @Override
    public CreatePartnerEventSourceRequest clone() {
        return (CreatePartnerEventSourceRequest) super.clone();
    }

}
