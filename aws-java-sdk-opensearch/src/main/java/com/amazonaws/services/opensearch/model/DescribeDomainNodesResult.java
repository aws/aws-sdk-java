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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>DescribeDomainNodes</code> request. Contains information about the nodes on the requested
 * domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainNodesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains nodes information list <code>DomainNodesStatusList</code> with details about the all nodes on the
     * requested domain.
     * </p>
     */
    private java.util.List<DomainNodesStatus> domainNodesStatusList;

    /**
     * <p>
     * Contains nodes information list <code>DomainNodesStatusList</code> with details about the all nodes on the
     * requested domain.
     * </p>
     * 
     * @return Contains nodes information list <code>DomainNodesStatusList</code> with details about the all nodes on
     *         the requested domain.
     */

    public java.util.List<DomainNodesStatus> getDomainNodesStatusList() {
        return domainNodesStatusList;
    }

    /**
     * <p>
     * Contains nodes information list <code>DomainNodesStatusList</code> with details about the all nodes on the
     * requested domain.
     * </p>
     * 
     * @param domainNodesStatusList
     *        Contains nodes information list <code>DomainNodesStatusList</code> with details about the all nodes on the
     *        requested domain.
     */

    public void setDomainNodesStatusList(java.util.Collection<DomainNodesStatus> domainNodesStatusList) {
        if (domainNodesStatusList == null) {
            this.domainNodesStatusList = null;
            return;
        }

        this.domainNodesStatusList = new java.util.ArrayList<DomainNodesStatus>(domainNodesStatusList);
    }

    /**
     * <p>
     * Contains nodes information list <code>DomainNodesStatusList</code> with details about the all nodes on the
     * requested domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainNodesStatusList(java.util.Collection)} or
     * {@link #withDomainNodesStatusList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainNodesStatusList
     *        Contains nodes information list <code>DomainNodesStatusList</code> with details about the all nodes on the
     *        requested domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainNodesResult withDomainNodesStatusList(DomainNodesStatus... domainNodesStatusList) {
        if (this.domainNodesStatusList == null) {
            setDomainNodesStatusList(new java.util.ArrayList<DomainNodesStatus>(domainNodesStatusList.length));
        }
        for (DomainNodesStatus ele : domainNodesStatusList) {
            this.domainNodesStatusList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains nodes information list <code>DomainNodesStatusList</code> with details about the all nodes on the
     * requested domain.
     * </p>
     * 
     * @param domainNodesStatusList
     *        Contains nodes information list <code>DomainNodesStatusList</code> with details about the all nodes on the
     *        requested domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainNodesResult withDomainNodesStatusList(java.util.Collection<DomainNodesStatus> domainNodesStatusList) {
        setDomainNodesStatusList(domainNodesStatusList);
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
        if (getDomainNodesStatusList() != null)
            sb.append("DomainNodesStatusList: ").append(getDomainNodesStatusList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDomainNodesResult == false)
            return false;
        DescribeDomainNodesResult other = (DescribeDomainNodesResult) obj;
        if (other.getDomainNodesStatusList() == null ^ this.getDomainNodesStatusList() == null)
            return false;
        if (other.getDomainNodesStatusList() != null && other.getDomainNodesStatusList().equals(this.getDomainNodesStatusList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainNodesStatusList() == null) ? 0 : getDomainNodesStatusList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDomainNodesResult clone() {
        try {
            return (DescribeDomainNodesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
