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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateOrgEc2DeepInspectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOrgEc2DeepInspectionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Inspector deep inspection custom paths you are adding for your organization.
     * </p>
     */
    private java.util.List<String> orgPackagePaths;

    /**
     * <p>
     * The Amazon Inspector deep inspection custom paths you are adding for your organization.
     * </p>
     * 
     * @return The Amazon Inspector deep inspection custom paths you are adding for your organization.
     */

    public java.util.List<String> getOrgPackagePaths() {
        return orgPackagePaths;
    }

    /**
     * <p>
     * The Amazon Inspector deep inspection custom paths you are adding for your organization.
     * </p>
     * 
     * @param orgPackagePaths
     *        The Amazon Inspector deep inspection custom paths you are adding for your organization.
     */

    public void setOrgPackagePaths(java.util.Collection<String> orgPackagePaths) {
        if (orgPackagePaths == null) {
            this.orgPackagePaths = null;
            return;
        }

        this.orgPackagePaths = new java.util.ArrayList<String>(orgPackagePaths);
    }

    /**
     * <p>
     * The Amazon Inspector deep inspection custom paths you are adding for your organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrgPackagePaths(java.util.Collection)} or {@link #withOrgPackagePaths(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param orgPackagePaths
     *        The Amazon Inspector deep inspection custom paths you are adding for your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrgEc2DeepInspectionConfigurationRequest withOrgPackagePaths(String... orgPackagePaths) {
        if (this.orgPackagePaths == null) {
            setOrgPackagePaths(new java.util.ArrayList<String>(orgPackagePaths.length));
        }
        for (String ele : orgPackagePaths) {
            this.orgPackagePaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Inspector deep inspection custom paths you are adding for your organization.
     * </p>
     * 
     * @param orgPackagePaths
     *        The Amazon Inspector deep inspection custom paths you are adding for your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrgEc2DeepInspectionConfigurationRequest withOrgPackagePaths(java.util.Collection<String> orgPackagePaths) {
        setOrgPackagePaths(orgPackagePaths);
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
        if (getOrgPackagePaths() != null)
            sb.append("OrgPackagePaths: ").append(getOrgPackagePaths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOrgEc2DeepInspectionConfigurationRequest == false)
            return false;
        UpdateOrgEc2DeepInspectionConfigurationRequest other = (UpdateOrgEc2DeepInspectionConfigurationRequest) obj;
        if (other.getOrgPackagePaths() == null ^ this.getOrgPackagePaths() == null)
            return false;
        if (other.getOrgPackagePaths() != null && other.getOrgPackagePaths().equals(this.getOrgPackagePaths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrgPackagePaths() == null) ? 0 : getOrgPackagePaths().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOrgEc2DeepInspectionConfigurationRequest clone() {
        return (UpdateOrgEc2DeepInspectionConfigurationRequest) super.clone();
    }

}
