/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the <code><a>DescribeDomainEndpointOptions</a></code> operation. Specify the name of
 * the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed
 * option to <code>true</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainEndpointOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string that represents the name of a domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Whether to retrieve the latest configuration (which might be in a Processing state) or the current, active
     * configuration. Defaults to <code>false</code>.
     * </p>
     */
    private Boolean deployed;

    /**
     * <p>
     * A string that represents the name of a domain.
     * </p>
     * 
     * @param domainName
     *        A string that represents the name of a domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * A string that represents the name of a domain.
     * </p>
     * 
     * @return A string that represents the name of a domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * A string that represents the name of a domain.
     * </p>
     * 
     * @param domainName
     *        A string that represents the name of a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainEndpointOptionsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Whether to retrieve the latest configuration (which might be in a Processing state) or the current, active
     * configuration. Defaults to <code>false</code>.
     * </p>
     * 
     * @param deployed
     *        Whether to retrieve the latest configuration (which might be in a Processing state) or the current, active
     *        configuration. Defaults to <code>false</code>.
     */

    public void setDeployed(Boolean deployed) {
        this.deployed = deployed;
    }

    /**
     * <p>
     * Whether to retrieve the latest configuration (which might be in a Processing state) or the current, active
     * configuration. Defaults to <code>false</code>.
     * </p>
     * 
     * @return Whether to retrieve the latest configuration (which might be in a Processing state) or the current,
     *         active configuration. Defaults to <code>false</code>.
     */

    public Boolean getDeployed() {
        return this.deployed;
    }

    /**
     * <p>
     * Whether to retrieve the latest configuration (which might be in a Processing state) or the current, active
     * configuration. Defaults to <code>false</code>.
     * </p>
     * 
     * @param deployed
     *        Whether to retrieve the latest configuration (which might be in a Processing state) or the current, active
     *        configuration. Defaults to <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainEndpointOptionsRequest withDeployed(Boolean deployed) {
        setDeployed(deployed);
        return this;
    }

    /**
     * <p>
     * Whether to retrieve the latest configuration (which might be in a Processing state) or the current, active
     * configuration. Defaults to <code>false</code>.
     * </p>
     * 
     * @return Whether to retrieve the latest configuration (which might be in a Processing state) or the current,
     *         active configuration. Defaults to <code>false</code>.
     */

    public Boolean isDeployed() {
        return this.deployed;
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
        if (getDeployed() != null)
            sb.append("Deployed: ").append(getDeployed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDomainEndpointOptionsRequest == false)
            return false;
        DescribeDomainEndpointOptionsRequest other = (DescribeDomainEndpointOptionsRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDeployed() == null ^ this.getDeployed() == null)
            return false;
        if (other.getDeployed() != null && other.getDeployed().equals(this.getDeployed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDeployed() == null) ? 0 : getDeployed().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDomainEndpointOptionsRequest clone() {
        return (DescribeDomainEndpointOptionsRequest) super.clone();
    }

}
