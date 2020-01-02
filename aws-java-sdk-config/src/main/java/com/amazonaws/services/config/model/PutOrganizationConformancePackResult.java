/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutOrganizationConformancePack"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutOrganizationConformancePackResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * ARN of the organization conformance pack.
     * </p>
     */
    private String organizationConformancePackArn;

    /**
     * <p>
     * ARN of the organization conformance pack.
     * </p>
     * 
     * @param organizationConformancePackArn
     *        ARN of the organization conformance pack.
     */

    public void setOrganizationConformancePackArn(String organizationConformancePackArn) {
        this.organizationConformancePackArn = organizationConformancePackArn;
    }

    /**
     * <p>
     * ARN of the organization conformance pack.
     * </p>
     * 
     * @return ARN of the organization conformance pack.
     */

    public String getOrganizationConformancePackArn() {
        return this.organizationConformancePackArn;
    }

    /**
     * <p>
     * ARN of the organization conformance pack.
     * </p>
     * 
     * @param organizationConformancePackArn
     *        ARN of the organization conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOrganizationConformancePackResult withOrganizationConformancePackArn(String organizationConformancePackArn) {
        setOrganizationConformancePackArn(organizationConformancePackArn);
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
        if (getOrganizationConformancePackArn() != null)
            sb.append("OrganizationConformancePackArn: ").append(getOrganizationConformancePackArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutOrganizationConformancePackResult == false)
            return false;
        PutOrganizationConformancePackResult other = (PutOrganizationConformancePackResult) obj;
        if (other.getOrganizationConformancePackArn() == null ^ this.getOrganizationConformancePackArn() == null)
            return false;
        if (other.getOrganizationConformancePackArn() != null
                && other.getOrganizationConformancePackArn().equals(this.getOrganizationConformancePackArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationConformancePackArn() == null) ? 0 : getOrganizationConformancePackArn().hashCode());
        return hashCode;
    }

    @Override
    public PutOrganizationConformancePackResult clone() {
        try {
            return (PutOrganizationConformancePackResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
