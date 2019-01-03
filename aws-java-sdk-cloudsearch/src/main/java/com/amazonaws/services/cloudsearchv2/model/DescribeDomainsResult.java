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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>DescribeDomains</code> request. Contains the status of the domains specified in the request or
 * all domains owned by the account.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<DomainStatus> domainStatusList;

    /**
     * @return
     */

    public java.util.List<DomainStatus> getDomainStatusList() {
        if (domainStatusList == null) {
            domainStatusList = new com.amazonaws.internal.SdkInternalList<DomainStatus>();
        }
        return domainStatusList;
    }

    /**
     * @param domainStatusList
     */

    public void setDomainStatusList(java.util.Collection<DomainStatus> domainStatusList) {
        if (domainStatusList == null) {
            this.domainStatusList = null;
            return;
        }

        this.domainStatusList = new com.amazonaws.internal.SdkInternalList<DomainStatus>(domainStatusList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainStatusList(java.util.Collection)} or {@link #withDomainStatusList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param domainStatusList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainsResult withDomainStatusList(DomainStatus... domainStatusList) {
        if (this.domainStatusList == null) {
            setDomainStatusList(new com.amazonaws.internal.SdkInternalList<DomainStatus>(domainStatusList.length));
        }
        for (DomainStatus ele : domainStatusList) {
            this.domainStatusList.add(ele);
        }
        return this;
    }

    /**
     * @param domainStatusList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainsResult withDomainStatusList(java.util.Collection<DomainStatus> domainStatusList) {
        setDomainStatusList(domainStatusList);
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
        if (getDomainStatusList() != null)
            sb.append("DomainStatusList: ").append(getDomainStatusList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDomainsResult == false)
            return false;
        DescribeDomainsResult other = (DescribeDomainsResult) obj;
        if (other.getDomainStatusList() == null ^ this.getDomainStatusList() == null)
            return false;
        if (other.getDomainStatusList() != null && other.getDomainStatusList().equals(this.getDomainStatusList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainStatusList() == null) ? 0 : getDomainStatusList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDomainsResult clone() {
        try {
            return (DescribeDomainsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
