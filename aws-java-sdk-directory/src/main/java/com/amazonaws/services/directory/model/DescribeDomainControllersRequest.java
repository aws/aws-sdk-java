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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeDomainControllers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainControllersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the directory for which to retrieve the domain controller information.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * A list of identifiers for the domain controllers whose information will be provided.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> domainControllerIds;
    /**
     * <p>
     * The <i>DescribeDomainControllers.NextToken</i> value from a previous call to <a>DescribeDomainControllers</a>.
     * Pass null if this is the first call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * Identifier of the directory for which to retrieve the domain controller information.
     * </p>
     * 
     * @param directoryId
     *        Identifier of the directory for which to retrieve the domain controller information.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Identifier of the directory for which to retrieve the domain controller information.
     * </p>
     * 
     * @return Identifier of the directory for which to retrieve the domain controller information.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Identifier of the directory for which to retrieve the domain controller information.
     * </p>
     * 
     * @param directoryId
     *        Identifier of the directory for which to retrieve the domain controller information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainControllersRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * A list of identifiers for the domain controllers whose information will be provided.
     * </p>
     * 
     * @return A list of identifiers for the domain controllers whose information will be provided.
     */

    public java.util.List<String> getDomainControllerIds() {
        if (domainControllerIds == null) {
            domainControllerIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return domainControllerIds;
    }

    /**
     * <p>
     * A list of identifiers for the domain controllers whose information will be provided.
     * </p>
     * 
     * @param domainControllerIds
     *        A list of identifiers for the domain controllers whose information will be provided.
     */

    public void setDomainControllerIds(java.util.Collection<String> domainControllerIds) {
        if (domainControllerIds == null) {
            this.domainControllerIds = null;
            return;
        }

        this.domainControllerIds = new com.amazonaws.internal.SdkInternalList<String>(domainControllerIds);
    }

    /**
     * <p>
     * A list of identifiers for the domain controllers whose information will be provided.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainControllerIds(java.util.Collection)} or {@link #withDomainControllerIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param domainControllerIds
     *        A list of identifiers for the domain controllers whose information will be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainControllersRequest withDomainControllerIds(String... domainControllerIds) {
        if (this.domainControllerIds == null) {
            setDomainControllerIds(new com.amazonaws.internal.SdkInternalList<String>(domainControllerIds.length));
        }
        for (String ele : domainControllerIds) {
            this.domainControllerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identifiers for the domain controllers whose information will be provided.
     * </p>
     * 
     * @param domainControllerIds
     *        A list of identifiers for the domain controllers whose information will be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainControllersRequest withDomainControllerIds(java.util.Collection<String> domainControllerIds) {
        setDomainControllerIds(domainControllerIds);
        return this;
    }

    /**
     * <p>
     * The <i>DescribeDomainControllers.NextToken</i> value from a previous call to <a>DescribeDomainControllers</a>.
     * Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <i>DescribeDomainControllers.NextToken</i> value from a previous call to
     *        <a>DescribeDomainControllers</a>. Pass null if this is the first call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <i>DescribeDomainControllers.NextToken</i> value from a previous call to <a>DescribeDomainControllers</a>.
     * Pass null if this is the first call.
     * </p>
     * 
     * @return The <i>DescribeDomainControllers.NextToken</i> value from a previous call to
     *         <a>DescribeDomainControllers</a>. Pass null if this is the first call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <i>DescribeDomainControllers.NextToken</i> value from a previous call to <a>DescribeDomainControllers</a>.
     * Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <i>DescribeDomainControllers.NextToken</i> value from a previous call to
     *        <a>DescribeDomainControllers</a>. Pass null if this is the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainControllersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @return The maximum number of items to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainControllersRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getDomainControllerIds() != null)
            sb.append("DomainControllerIds: ").append(getDomainControllerIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDomainControllersRequest == false)
            return false;
        DescribeDomainControllersRequest other = (DescribeDomainControllersRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getDomainControllerIds() == null ^ this.getDomainControllerIds() == null)
            return false;
        if (other.getDomainControllerIds() != null && other.getDomainControllerIds().equals(this.getDomainControllerIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getDomainControllerIds() == null) ? 0 : getDomainControllerIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDomainControllersRequest clone() {
        return (DescribeDomainControllersRequest) super.clone();
    }

}
