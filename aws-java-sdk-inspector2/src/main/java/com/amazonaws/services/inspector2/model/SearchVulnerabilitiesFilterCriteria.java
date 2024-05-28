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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on the criteria used to define the filter for a vulnerability search.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/SearchVulnerabilitiesFilterCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchVulnerabilitiesFilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IDs for specific vulnerabilities.
     * </p>
     */
    private java.util.List<String> vulnerabilityIds;

    /**
     * <p>
     * The IDs for specific vulnerabilities.
     * </p>
     * 
     * @return The IDs for specific vulnerabilities.
     */

    public java.util.List<String> getVulnerabilityIds() {
        return vulnerabilityIds;
    }

    /**
     * <p>
     * The IDs for specific vulnerabilities.
     * </p>
     * 
     * @param vulnerabilityIds
     *        The IDs for specific vulnerabilities.
     */

    public void setVulnerabilityIds(java.util.Collection<String> vulnerabilityIds) {
        if (vulnerabilityIds == null) {
            this.vulnerabilityIds = null;
            return;
        }

        this.vulnerabilityIds = new java.util.ArrayList<String>(vulnerabilityIds);
    }

    /**
     * <p>
     * The IDs for specific vulnerabilities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVulnerabilityIds(java.util.Collection)} or {@link #withVulnerabilityIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param vulnerabilityIds
     *        The IDs for specific vulnerabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchVulnerabilitiesFilterCriteria withVulnerabilityIds(String... vulnerabilityIds) {
        if (this.vulnerabilityIds == null) {
            setVulnerabilityIds(new java.util.ArrayList<String>(vulnerabilityIds.length));
        }
        for (String ele : vulnerabilityIds) {
            this.vulnerabilityIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs for specific vulnerabilities.
     * </p>
     * 
     * @param vulnerabilityIds
     *        The IDs for specific vulnerabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchVulnerabilitiesFilterCriteria withVulnerabilityIds(java.util.Collection<String> vulnerabilityIds) {
        setVulnerabilityIds(vulnerabilityIds);
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
        if (getVulnerabilityIds() != null)
            sb.append("VulnerabilityIds: ").append(getVulnerabilityIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchVulnerabilitiesFilterCriteria == false)
            return false;
        SearchVulnerabilitiesFilterCriteria other = (SearchVulnerabilitiesFilterCriteria) obj;
        if (other.getVulnerabilityIds() == null ^ this.getVulnerabilityIds() == null)
            return false;
        if (other.getVulnerabilityIds() != null && other.getVulnerabilityIds().equals(this.getVulnerabilityIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVulnerabilityIds() == null) ? 0 : getVulnerabilityIds().hashCode());
        return hashCode;
    }

    @Override
    public SearchVulnerabilitiesFilterCriteria clone() {
        try {
            return (SearchVulnerabilitiesFilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.SearchVulnerabilitiesFilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
