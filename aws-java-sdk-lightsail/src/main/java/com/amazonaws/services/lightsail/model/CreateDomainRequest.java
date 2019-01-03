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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain name to manage (e.g., <code>example.com</code>).
     * </p>
     * <note>
     * <p>
     * You cannot register a new domain name using Lightsail. You must register a domain name using Amazon Route 53 or
     * another domain name registrar. If you have already registered your domain, you can enter its name in this
     * parameter to manage the DNS records for that domain.
     * </p>
     * </note>
     */
    private String domainName;
    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The domain name to manage (e.g., <code>example.com</code>).
     * </p>
     * <note>
     * <p>
     * You cannot register a new domain name using Lightsail. You must register a domain name using Amazon Route 53 or
     * another domain name registrar. If you have already registered your domain, you can enter its name in this
     * parameter to manage the DNS records for that domain.
     * </p>
     * </note>
     * 
     * @param domainName
     *        The domain name to manage (e.g., <code>example.com</code>).</p> <note>
     *        <p>
     *        You cannot register a new domain name using Lightsail. You must register a domain name using Amazon Route
     *        53 or another domain name registrar. If you have already registered your domain, you can enter its name in
     *        this parameter to manage the DNS records for that domain.
     *        </p>
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name to manage (e.g., <code>example.com</code>).
     * </p>
     * <note>
     * <p>
     * You cannot register a new domain name using Lightsail. You must register a domain name using Amazon Route 53 or
     * another domain name registrar. If you have already registered your domain, you can enter its name in this
     * parameter to manage the DNS records for that domain.
     * </p>
     * </note>
     * 
     * @return The domain name to manage (e.g., <code>example.com</code>).</p> <note>
     *         <p>
     *         You cannot register a new domain name using Lightsail. You must register a domain name using Amazon Route
     *         53 or another domain name registrar. If you have already registered your domain, you can enter its name
     *         in this parameter to manage the DNS records for that domain.
     *         </p>
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name to manage (e.g., <code>example.com</code>).
     * </p>
     * <note>
     * <p>
     * You cannot register a new domain name using Lightsail. You must register a domain name using Amazon Route 53 or
     * another domain name registrar. If you have already registered your domain, you can enter its name in this
     * parameter to manage the DNS records for that domain.
     * </p>
     * </note>
     * 
     * @param domainName
     *        The domain name to manage (e.g., <code>example.com</code>).</p> <note>
     *        <p>
     *        You cannot register a new domain name using Lightsail. You must register a domain name using Amazon Route
     *        53 or another domain name registrar. If you have already registered your domain, you can enter its name in
     *        this parameter to manage the DNS records for that domain.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @return The tag keys and optional values to add to the resource during create.</p>
     *         <p>
     *         To tag a resource after it has been created, see the <code>tag resource</code> operation.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainRequest == false)
            return false;
        CreateDomainRequest other = (CreateDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainRequest clone() {
        return (CreateDomainRequest) super.clone();
    }

}
