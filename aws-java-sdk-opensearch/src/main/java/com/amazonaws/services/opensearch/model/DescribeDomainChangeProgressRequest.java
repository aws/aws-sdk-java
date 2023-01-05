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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code>DescribeDomainChangeProgress</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainChangeProgressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain to get progress information for.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The specific change ID for which you want to get progress information. If omitted, the request returns
     * information about the most recent configuration change.
     * </p>
     */
    private String changeId;

    /**
     * <p>
     * The name of the domain to get progress information for.
     * </p>
     * 
     * @param domainName
     *        The name of the domain to get progress information for.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain to get progress information for.
     * </p>
     * 
     * @return The name of the domain to get progress information for.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain to get progress information for.
     * </p>
     * 
     * @param domainName
     *        The name of the domain to get progress information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainChangeProgressRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The specific change ID for which you want to get progress information. If omitted, the request returns
     * information about the most recent configuration change.
     * </p>
     * 
     * @param changeId
     *        The specific change ID for which you want to get progress information. If omitted, the request returns
     *        information about the most recent configuration change.
     */

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    /**
     * <p>
     * The specific change ID for which you want to get progress information. If omitted, the request returns
     * information about the most recent configuration change.
     * </p>
     * 
     * @return The specific change ID for which you want to get progress information. If omitted, the request returns
     *         information about the most recent configuration change.
     */

    public String getChangeId() {
        return this.changeId;
    }

    /**
     * <p>
     * The specific change ID for which you want to get progress information. If omitted, the request returns
     * information about the most recent configuration change.
     * </p>
     * 
     * @param changeId
     *        The specific change ID for which you want to get progress information. If omitted, the request returns
     *        information about the most recent configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainChangeProgressRequest withChangeId(String changeId) {
        setChangeId(changeId);
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
        if (getChangeId() != null)
            sb.append("ChangeId: ").append(getChangeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDomainChangeProgressRequest == false)
            return false;
        DescribeDomainChangeProgressRequest other = (DescribeDomainChangeProgressRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getChangeId() == null ^ this.getChangeId() == null)
            return false;
        if (other.getChangeId() != null && other.getChangeId().equals(this.getChangeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getChangeId() == null) ? 0 : getChangeId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDomainChangeProgressRequest clone() {
        return (DescribeDomainChangeProgressRequest) super.clone();
    }

}
