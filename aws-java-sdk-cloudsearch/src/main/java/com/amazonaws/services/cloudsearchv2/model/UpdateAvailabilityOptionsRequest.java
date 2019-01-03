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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code><a>UpdateAvailabilityOptions</a></code> operation. Specifies the name of
 * the domain you want to update and the Multi-AZ availability option.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAvailabilityOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String domainName;
    /**
     * <p>
     * You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to true.
     * Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability Zone by setting
     * the Multi-AZ option to <code>false</code>.
     * </p>
     */
    private Boolean multiAZ;

    /**
     * @param domainName
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @param domainName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAvailabilityOptionsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to true.
     * Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability Zone by setting
     * the Multi-AZ option to <code>false</code>.
     * </p>
     * 
     * @param multiAZ
     *        You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to true.
     *        Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability Zone by
     *        setting the Multi-AZ option to <code>false</code>.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to true.
     * Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability Zone by setting
     * the Multi-AZ option to <code>false</code>.
     * </p>
     * 
     * @return You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to
     *         true. Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability
     *         Zone by setting the Multi-AZ option to <code>false</code>.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to true.
     * Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability Zone by setting
     * the Multi-AZ option to <code>false</code>.
     * </p>
     * 
     * @param multiAZ
     *        You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to true.
     *        Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability Zone by
     *        setting the Multi-AZ option to <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAvailabilityOptionsRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to true.
     * Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability Zone by setting
     * the Multi-AZ option to <code>false</code>.
     * </p>
     * 
     * @return You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to
     *         true. Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability
     *         Zone by setting the Multi-AZ option to <code>false</code>.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
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
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAvailabilityOptionsRequest == false)
            return false;
        UpdateAvailabilityOptionsRequest other = (UpdateAvailabilityOptionsRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAvailabilityOptionsRequest clone() {
        return (UpdateAvailabilityOptionsRequest) super.clone();
    }

}
