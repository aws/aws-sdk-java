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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreatePublicDnsNamespace"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePublicDnsNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that you want to assign to this namespace.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code> requests
     * to be retried without the risk of executing the operation twice. <code>CreatorRequestId</code> can be any unique
     * string, for example, a date/time stamp.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * A description for the namespace.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name that you want to assign to this namespace.
     * </p>
     * 
     * @param name
     *        The name that you want to assign to this namespace.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you want to assign to this namespace.
     * </p>
     * 
     * @return The name that you want to assign to this namespace.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you want to assign to this namespace.
     * </p>
     * 
     * @param name
     *        The name that you want to assign to this namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicDnsNamespaceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code> requests
     * to be retried without the risk of executing the operation twice. <code>CreatorRequestId</code> can be any unique
     * string, for example, a date/time stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code>
     *        requests to be retried without the risk of executing the operation twice. <code>CreatorRequestId</code>
     *        can be any unique string, for example, a date/time stamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code> requests
     * to be retried without the risk of executing the operation twice. <code>CreatorRequestId</code> can be any unique
     * string, for example, a date/time stamp.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code>
     *         requests to be retried without the risk of executing the operation twice. <code>CreatorRequestId</code>
     *         can be any unique string, for example, a date/time stamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code> requests
     * to be retried without the risk of executing the operation twice. <code>CreatorRequestId</code> can be any unique
     * string, for example, a date/time stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed <code>CreatePublicDnsNamespace</code>
     *        requests to be retried without the risk of executing the operation twice. <code>CreatorRequestId</code>
     *        can be any unique string, for example, a date/time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicDnsNamespaceRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * 
     * @param description
     *        A description for the namespace.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * 
     * @return A description for the namespace.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * 
     * @param description
     *        A description for the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicDnsNamespaceRequest withDescription(String description) {
        setDescription(description);
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
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePublicDnsNamespaceRequest == false)
            return false;
        CreatePublicDnsNamespaceRequest other = (CreatePublicDnsNamespaceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreatePublicDnsNamespaceRequest clone() {
        return (CreatePublicDnsNamespaceRequest) super.clone();
    }

}
