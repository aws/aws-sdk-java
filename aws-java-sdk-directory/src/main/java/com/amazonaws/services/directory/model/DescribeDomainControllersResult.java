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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeDomainControllers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainControllersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of the <a>DomainController</a> objects that were retrieved.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DomainController> domainControllers;
    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to <a>DescribeDomainControllers</a> retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of the <a>DomainController</a> objects that were retrieved.
     * </p>
     * 
     * @return List of the <a>DomainController</a> objects that were retrieved.
     */

    public java.util.List<DomainController> getDomainControllers() {
        if (domainControllers == null) {
            domainControllers = new com.amazonaws.internal.SdkInternalList<DomainController>();
        }
        return domainControllers;
    }

    /**
     * <p>
     * List of the <a>DomainController</a> objects that were retrieved.
     * </p>
     * 
     * @param domainControllers
     *        List of the <a>DomainController</a> objects that were retrieved.
     */

    public void setDomainControllers(java.util.Collection<DomainController> domainControllers) {
        if (domainControllers == null) {
            this.domainControllers = null;
            return;
        }

        this.domainControllers = new com.amazonaws.internal.SdkInternalList<DomainController>(domainControllers);
    }

    /**
     * <p>
     * List of the <a>DomainController</a> objects that were retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainControllers(java.util.Collection)} or {@link #withDomainControllers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param domainControllers
     *        List of the <a>DomainController</a> objects that were retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainControllersResult withDomainControllers(DomainController... domainControllers) {
        if (this.domainControllers == null) {
            setDomainControllers(new com.amazonaws.internal.SdkInternalList<DomainController>(domainControllers.length));
        }
        for (DomainController ele : domainControllers) {
            this.domainControllers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the <a>DomainController</a> objects that were retrieved.
     * </p>
     * 
     * @param domainControllers
     *        List of the <a>DomainController</a> objects that were retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainControllersResult withDomainControllers(java.util.Collection<DomainController> domainControllers) {
        setDomainControllers(domainControllers);
        return this;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to <a>DescribeDomainControllers</a> retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a
     *        subsequent call to <a>DescribeDomainControllers</a> retrieve the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to <a>DescribeDomainControllers</a> retrieve the next set of items.
     * </p>
     * 
     * @return If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a
     *         subsequent call to <a>DescribeDomainControllers</a> retrieve the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to <a>DescribeDomainControllers</a> retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a
     *        subsequent call to <a>DescribeDomainControllers</a> retrieve the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainControllersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDomainControllers() != null)
            sb.append("DomainControllers: ").append(getDomainControllers()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDomainControllersResult == false)
            return false;
        DescribeDomainControllersResult other = (DescribeDomainControllersResult) obj;
        if (other.getDomainControllers() == null ^ this.getDomainControllers() == null)
            return false;
        if (other.getDomainControllers() != null && other.getDomainControllers().equals(this.getDomainControllers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainControllers() == null) ? 0 : getDomainControllers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDomainControllersResult clone() {
        try {
            return (DescribeDomainControllersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
