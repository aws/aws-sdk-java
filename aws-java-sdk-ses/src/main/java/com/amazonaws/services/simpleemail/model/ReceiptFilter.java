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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A receipt IP address filter enables you to specify whether to accept or reject mail originating from an IP address or
 * range of IP addresses.
 * </p>
 * <p>
 * For information about setting up IP address filters, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ReceiptFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReceiptFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IP address filter. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * A structure that provides the IP addresses to block or allow, and whether to block or allow incoming mail from
     * them.
     * </p>
     */
    private ReceiptIpFilter ipFilter;

    /**
     * <p>
     * The name of the IP address filter. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the IP address filter. The name must:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start and end with a letter or number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Contain less than 64 characters.
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the IP address filter. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the IP address filter. The name must:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start and end with a letter or number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Contain less than 64 characters.
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the IP address filter. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the IP address filter. The name must:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start and end with a letter or number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Contain less than 64 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A structure that provides the IP addresses to block or allow, and whether to block or allow incoming mail from
     * them.
     * </p>
     * 
     * @param ipFilter
     *        A structure that provides the IP addresses to block or allow, and whether to block or allow incoming mail
     *        from them.
     */

    public void setIpFilter(ReceiptIpFilter ipFilter) {
        this.ipFilter = ipFilter;
    }

    /**
     * <p>
     * A structure that provides the IP addresses to block or allow, and whether to block or allow incoming mail from
     * them.
     * </p>
     * 
     * @return A structure that provides the IP addresses to block or allow, and whether to block or allow incoming mail
     *         from them.
     */

    public ReceiptIpFilter getIpFilter() {
        return this.ipFilter;
    }

    /**
     * <p>
     * A structure that provides the IP addresses to block or allow, and whether to block or allow incoming mail from
     * them.
     * </p>
     * 
     * @param ipFilter
     *        A structure that provides the IP addresses to block or allow, and whether to block or allow incoming mail
     *        from them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiptFilter withIpFilter(ReceiptIpFilter ipFilter) {
        setIpFilter(ipFilter);
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
        if (getIpFilter() != null)
            sb.append("IpFilter: ").append(getIpFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReceiptFilter == false)
            return false;
        ReceiptFilter other = (ReceiptFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIpFilter() == null ^ this.getIpFilter() == null)
            return false;
        if (other.getIpFilter() != null && other.getIpFilter().equals(this.getIpFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIpFilter() == null) ? 0 : getIpFilter().hashCode());
        return hashCode;
    }

    @Override
    public ReceiptFilter clone() {
        try {
            return (ReceiptFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
