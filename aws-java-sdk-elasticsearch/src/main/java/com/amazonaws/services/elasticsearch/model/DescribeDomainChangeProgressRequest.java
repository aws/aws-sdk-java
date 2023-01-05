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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code>DescribeDomainChangeProgress</code> operation. Specifies the domain name
 * and optional change specific identity for which you want progress information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainChangeProgressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain you want to get the progress information about.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The specific change ID for which you want to get progress information. This is an optional parameter. If omitted,
     * the service returns information about the most recent configuration change.
     * </p>
     */
    private String changeId;

    /**
     * <p>
     * The domain you want to get the progress information about.
     * </p>
     * 
     * @param domainName
     *        The domain you want to get the progress information about.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain you want to get the progress information about.
     * </p>
     * 
     * @return The domain you want to get the progress information about.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain you want to get the progress information about.
     * </p>
     * 
     * @param domainName
     *        The domain you want to get the progress information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainChangeProgressRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The specific change ID for which you want to get progress information. This is an optional parameter. If omitted,
     * the service returns information about the most recent configuration change.
     * </p>
     * 
     * @param changeId
     *        The specific change ID for which you want to get progress information. This is an optional parameter. If
     *        omitted, the service returns information about the most recent configuration change.
     */

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    /**
     * <p>
     * The specific change ID for which you want to get progress information. This is an optional parameter. If omitted,
     * the service returns information about the most recent configuration change.
     * </p>
     * 
     * @return The specific change ID for which you want to get progress information. This is an optional parameter. If
     *         omitted, the service returns information about the most recent configuration change.
     */

    public String getChangeId() {
        return this.changeId;
    }

    /**
     * <p>
     * The specific change ID for which you want to get progress information. This is an optional parameter. If omitted,
     * the service returns information about the most recent configuration change.
     * </p>
     * 
     * @param changeId
     *        The specific change ID for which you want to get progress information. This is an optional parameter. If
     *        omitted, the service returns information about the most recent configuration change.
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
