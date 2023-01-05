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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateDomainName" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainNameRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain name.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A description of the <code>DomainName</code>.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @param domainName
     *        The domain name.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @return The domain name.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @param domainName
     *        The domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A description of the <code>DomainName</code>.
     * </p>
     * 
     * @param description
     *        A description of the <code>DomainName</code>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the <code>DomainName</code>.
     * </p>
     * 
     * @return A description of the <code>DomainName</code>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the <code>DomainName</code>.
     * </p>
     * 
     * @param description
     *        A description of the <code>DomainName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameRequest withDescription(String description) {
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
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

        if (obj instanceof UpdateDomainNameRequest == false)
            return false;
        UpdateDomainNameRequest other = (UpdateDomainNameRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
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

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainNameRequest clone() {
        return (UpdateDomainNameRequest) super.clone();
    }

}
