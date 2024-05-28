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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateEc2DeepInspectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEc2DeepInspectionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify <code>TRUE</code> to activate Amazon Inspector deep inspection in your account, or <code>FALSE</code> to
     * deactivate. Member accounts in an organization cannot deactivate deep inspection, instead the delegated
     * administrator for the organization can deactivate a member account using <a
     * href="https://docs.aws.amazon.com/inspector/v2/APIReference/API_BatchUpdateMemberEc2DeepInspectionStatus.html"
     * >BatchUpdateMemberEc2DeepInspectionStatus</a>.
     * </p>
     */
    private Boolean activateDeepInspection;
    /**
     * <p>
     * The Amazon Inspector deep inspection custom paths you are adding for your account.
     * </p>
     */
    private java.util.List<String> packagePaths;

    /**
     * <p>
     * Specify <code>TRUE</code> to activate Amazon Inspector deep inspection in your account, or <code>FALSE</code> to
     * deactivate. Member accounts in an organization cannot deactivate deep inspection, instead the delegated
     * administrator for the organization can deactivate a member account using <a
     * href="https://docs.aws.amazon.com/inspector/v2/APIReference/API_BatchUpdateMemberEc2DeepInspectionStatus.html"
     * >BatchUpdateMemberEc2DeepInspectionStatus</a>.
     * </p>
     * 
     * @param activateDeepInspection
     *        Specify <code>TRUE</code> to activate Amazon Inspector deep inspection in your account, or
     *        <code>FALSE</code> to deactivate. Member accounts in an organization cannot deactivate deep inspection,
     *        instead the delegated administrator for the organization can deactivate a member account using <a href=
     *        "https://docs.aws.amazon.com/inspector/v2/APIReference/API_BatchUpdateMemberEc2DeepInspectionStatus.html"
     *        >BatchUpdateMemberEc2DeepInspectionStatus</a>.
     */

    public void setActivateDeepInspection(Boolean activateDeepInspection) {
        this.activateDeepInspection = activateDeepInspection;
    }

    /**
     * <p>
     * Specify <code>TRUE</code> to activate Amazon Inspector deep inspection in your account, or <code>FALSE</code> to
     * deactivate. Member accounts in an organization cannot deactivate deep inspection, instead the delegated
     * administrator for the organization can deactivate a member account using <a
     * href="https://docs.aws.amazon.com/inspector/v2/APIReference/API_BatchUpdateMemberEc2DeepInspectionStatus.html"
     * >BatchUpdateMemberEc2DeepInspectionStatus</a>.
     * </p>
     * 
     * @return Specify <code>TRUE</code> to activate Amazon Inspector deep inspection in your account, or
     *         <code>FALSE</code> to deactivate. Member accounts in an organization cannot deactivate deep inspection,
     *         instead the delegated administrator for the organization can deactivate a member account using <a href=
     *         "https://docs.aws.amazon.com/inspector/v2/APIReference/API_BatchUpdateMemberEc2DeepInspectionStatus.html"
     *         >BatchUpdateMemberEc2DeepInspectionStatus</a>.
     */

    public Boolean getActivateDeepInspection() {
        return this.activateDeepInspection;
    }

    /**
     * <p>
     * Specify <code>TRUE</code> to activate Amazon Inspector deep inspection in your account, or <code>FALSE</code> to
     * deactivate. Member accounts in an organization cannot deactivate deep inspection, instead the delegated
     * administrator for the organization can deactivate a member account using <a
     * href="https://docs.aws.amazon.com/inspector/v2/APIReference/API_BatchUpdateMemberEc2DeepInspectionStatus.html"
     * >BatchUpdateMemberEc2DeepInspectionStatus</a>.
     * </p>
     * 
     * @param activateDeepInspection
     *        Specify <code>TRUE</code> to activate Amazon Inspector deep inspection in your account, or
     *        <code>FALSE</code> to deactivate. Member accounts in an organization cannot deactivate deep inspection,
     *        instead the delegated administrator for the organization can deactivate a member account using <a href=
     *        "https://docs.aws.amazon.com/inspector/v2/APIReference/API_BatchUpdateMemberEc2DeepInspectionStatus.html"
     *        >BatchUpdateMemberEc2DeepInspectionStatus</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEc2DeepInspectionConfigurationRequest withActivateDeepInspection(Boolean activateDeepInspection) {
        setActivateDeepInspection(activateDeepInspection);
        return this;
    }

    /**
     * <p>
     * Specify <code>TRUE</code> to activate Amazon Inspector deep inspection in your account, or <code>FALSE</code> to
     * deactivate. Member accounts in an organization cannot deactivate deep inspection, instead the delegated
     * administrator for the organization can deactivate a member account using <a
     * href="https://docs.aws.amazon.com/inspector/v2/APIReference/API_BatchUpdateMemberEc2DeepInspectionStatus.html"
     * >BatchUpdateMemberEc2DeepInspectionStatus</a>.
     * </p>
     * 
     * @return Specify <code>TRUE</code> to activate Amazon Inspector deep inspection in your account, or
     *         <code>FALSE</code> to deactivate. Member accounts in an organization cannot deactivate deep inspection,
     *         instead the delegated administrator for the organization can deactivate a member account using <a href=
     *         "https://docs.aws.amazon.com/inspector/v2/APIReference/API_BatchUpdateMemberEc2DeepInspectionStatus.html"
     *         >BatchUpdateMemberEc2DeepInspectionStatus</a>.
     */

    public Boolean isActivateDeepInspection() {
        return this.activateDeepInspection;
    }

    /**
     * <p>
     * The Amazon Inspector deep inspection custom paths you are adding for your account.
     * </p>
     * 
     * @return The Amazon Inspector deep inspection custom paths you are adding for your account.
     */

    public java.util.List<String> getPackagePaths() {
        return packagePaths;
    }

    /**
     * <p>
     * The Amazon Inspector deep inspection custom paths you are adding for your account.
     * </p>
     * 
     * @param packagePaths
     *        The Amazon Inspector deep inspection custom paths you are adding for your account.
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
     * The Amazon Inspector deep inspection custom paths you are adding for your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPackagePaths(java.util.Collection)} or {@link #withPackagePaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param packagePaths
     *        The Amazon Inspector deep inspection custom paths you are adding for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEc2DeepInspectionConfigurationRequest withPackagePaths(String... packagePaths) {
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
     * The Amazon Inspector deep inspection custom paths you are adding for your account.
     * </p>
     * 
     * @param packagePaths
     *        The Amazon Inspector deep inspection custom paths you are adding for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEc2DeepInspectionConfigurationRequest withPackagePaths(java.util.Collection<String> packagePaths) {
        setPackagePaths(packagePaths);
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
        if (getActivateDeepInspection() != null)
            sb.append("ActivateDeepInspection: ").append(getActivateDeepInspection()).append(",");
        if (getPackagePaths() != null)
            sb.append("PackagePaths: ").append(getPackagePaths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEc2DeepInspectionConfigurationRequest == false)
            return false;
        UpdateEc2DeepInspectionConfigurationRequest other = (UpdateEc2DeepInspectionConfigurationRequest) obj;
        if (other.getActivateDeepInspection() == null ^ this.getActivateDeepInspection() == null)
            return false;
        if (other.getActivateDeepInspection() != null && other.getActivateDeepInspection().equals(this.getActivateDeepInspection()) == false)
            return false;
        if (other.getPackagePaths() == null ^ this.getPackagePaths() == null)
            return false;
        if (other.getPackagePaths() != null && other.getPackagePaths().equals(this.getPackagePaths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivateDeepInspection() == null) ? 0 : getActivateDeepInspection().hashCode());
        hashCode = prime * hashCode + ((getPackagePaths() == null) ? 0 : getPackagePaths().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEc2DeepInspectionConfigurationRequest clone() {
        return (UpdateEc2DeepInspectionConfigurationRequest) super.clone();
    }

}
