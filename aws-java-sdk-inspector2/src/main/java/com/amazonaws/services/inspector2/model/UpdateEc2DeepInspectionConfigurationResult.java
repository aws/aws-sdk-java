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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateEc2DeepInspectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEc2DeepInspectionConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An error message explaining why new Amazon Inspector deep inspection custom paths could not be added.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The current Amazon Inspector deep inspection custom paths for the organization.
     * </p>
     */
    private java.util.List<String> orgPackagePaths;
    /**
     * <p>
     * The current Amazon Inspector deep inspection custom paths for your account.
     * </p>
     */
    private java.util.List<String> packagePaths;
    /**
     * <p>
     * The status of Amazon Inspector deep inspection in your account.
     * </p>
     */
    private String status;

    /**
     * <p>
     * An error message explaining why new Amazon Inspector deep inspection custom paths could not be added.
     * </p>
     * 
     * @param errorMessage
     *        An error message explaining why new Amazon Inspector deep inspection custom paths could not be added.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message explaining why new Amazon Inspector deep inspection custom paths could not be added.
     * </p>
     * 
     * @return An error message explaining why new Amazon Inspector deep inspection custom paths could not be added.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message explaining why new Amazon Inspector deep inspection custom paths could not be added.
     * </p>
     * 
     * @param errorMessage
     *        An error message explaining why new Amazon Inspector deep inspection custom paths could not be added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEc2DeepInspectionConfigurationResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The current Amazon Inspector deep inspection custom paths for the organization.
     * </p>
     * 
     * @return The current Amazon Inspector deep inspection custom paths for the organization.
     */

    public java.util.List<String> getOrgPackagePaths() {
        return orgPackagePaths;
    }

    /**
     * <p>
     * The current Amazon Inspector deep inspection custom paths for the organization.
     * </p>
     * 
     * @param orgPackagePaths
     *        The current Amazon Inspector deep inspection custom paths for the organization.
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
     * The current Amazon Inspector deep inspection custom paths for the organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrgPackagePaths(java.util.Collection)} or {@link #withOrgPackagePaths(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param orgPackagePaths
     *        The current Amazon Inspector deep inspection custom paths for the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEc2DeepInspectionConfigurationResult withOrgPackagePaths(String... orgPackagePaths) {
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
     * The current Amazon Inspector deep inspection custom paths for the organization.
     * </p>
     * 
     * @param orgPackagePaths
     *        The current Amazon Inspector deep inspection custom paths for the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEc2DeepInspectionConfigurationResult withOrgPackagePaths(java.util.Collection<String> orgPackagePaths) {
        setOrgPackagePaths(orgPackagePaths);
        return this;
    }

    /**
     * <p>
     * The current Amazon Inspector deep inspection custom paths for your account.
     * </p>
     * 
     * @return The current Amazon Inspector deep inspection custom paths for your account.
     */

    public java.util.List<String> getPackagePaths() {
        return packagePaths;
    }

    /**
     * <p>
     * The current Amazon Inspector deep inspection custom paths for your account.
     * </p>
     * 
     * @param packagePaths
     *        The current Amazon Inspector deep inspection custom paths for your account.
     */

    public void setPackagePaths(java.util.Collection<String> packagePaths) {
        if (packagePaths == null) {
            this.packagePaths = null;
            return;
        }

        this.packagePaths = new java.util.ArrayList<String>(packagePaths);
    }

    /**
     * <p>
     * The current Amazon Inspector deep inspection custom paths for your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPackagePaths(java.util.Collection)} or {@link #withPackagePaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param packagePaths
     *        The current Amazon Inspector deep inspection custom paths for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEc2DeepInspectionConfigurationResult withPackagePaths(String... packagePaths) {
        if (this.packagePaths == null) {
            setPackagePaths(new java.util.ArrayList<String>(packagePaths.length));
        }
        for (String ele : packagePaths) {
            this.packagePaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current Amazon Inspector deep inspection custom paths for your account.
     * </p>
     * 
     * @param packagePaths
     *        The current Amazon Inspector deep inspection custom paths for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEc2DeepInspectionConfigurationResult withPackagePaths(java.util.Collection<String> packagePaths) {
        setPackagePaths(packagePaths);
        return this;
    }

    /**
     * <p>
     * The status of Amazon Inspector deep inspection in your account.
     * </p>
     * 
     * @param status
     *        The status of Amazon Inspector deep inspection in your account.
     * @see Ec2DeepInspectionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of Amazon Inspector deep inspection in your account.
     * </p>
     * 
     * @return The status of Amazon Inspector deep inspection in your account.
     * @see Ec2DeepInspectionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of Amazon Inspector deep inspection in your account.
     * </p>
     * 
     * @param status
     *        The status of Amazon Inspector deep inspection in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2DeepInspectionStatus
     */

    public UpdateEc2DeepInspectionConfigurationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of Amazon Inspector deep inspection in your account.
     * </p>
     * 
     * @param status
     *        The status of Amazon Inspector deep inspection in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2DeepInspectionStatus
     */

    public UpdateEc2DeepInspectionConfigurationResult withStatus(Ec2DeepInspectionStatus status) {
        this.status = status.toString();
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
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getOrgPackagePaths() != null)
            sb.append("OrgPackagePaths: ").append(getOrgPackagePaths()).append(",");
        if (getPackagePaths() != null)
            sb.append("PackagePaths: ").append(getPackagePaths()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEc2DeepInspectionConfigurationResult == false)
            return false;
        UpdateEc2DeepInspectionConfigurationResult other = (UpdateEc2DeepInspectionConfigurationResult) obj;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getOrgPackagePaths() == null ^ this.getOrgPackagePaths() == null)
            return false;
        if (other.getOrgPackagePaths() != null && other.getOrgPackagePaths().equals(this.getOrgPackagePaths()) == false)
            return false;
        if (other.getPackagePaths() == null ^ this.getPackagePaths() == null)
            return false;
        if (other.getPackagePaths() != null && other.getPackagePaths().equals(this.getPackagePaths()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getOrgPackagePaths() == null) ? 0 : getOrgPackagePaths().hashCode());
        hashCode = prime * hashCode + ((getPackagePaths() == null) ? 0 : getPackagePaths().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEc2DeepInspectionConfigurationResult clone() {
        try {
            return (UpdateEc2DeepInspectionConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
