/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

/**
 * <p>
 * Contains details of a domain.
 * </p>
 */
public class DomainDetail extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private DomainInfo domainInfo;

    private DomainConfiguration configuration;

    /**
     * @param domainInfo
     */

    public void setDomainInfo(DomainInfo domainInfo) {
        this.domainInfo = domainInfo;
    }

    /**
     * @return
     */

    public DomainInfo getDomainInfo() {
        return this.domainInfo;
    }

    /**
     * @param domainInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDetail withDomainInfo(DomainInfo domainInfo) {
        setDomainInfo(domainInfo);
        return this;
    }

    /**
     * @param configuration
     */

    public void setConfiguration(DomainConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * @return
     */

    public DomainConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * @param configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDetail withConfiguration(DomainConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainInfo() != null)
            sb.append("DomainInfo: " + getDomainInfo() + ",");
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainDetail == false)
            return false;
        DomainDetail other = (DomainDetail) obj;
        if (other.getDomainInfo() == null ^ this.getDomainInfo() == null)
            return false;
        if (other.getDomainInfo() != null && other.getDomainInfo().equals(this.getDomainInfo()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainInfo() == null) ? 0 : getDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DomainDetail clone() {
        try {
            return (DomainDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
