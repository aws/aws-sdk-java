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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentAccountConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentAccountConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM service role in the environment account. Proton uses this role to
     * provision infrastructure resources using CodeBuild-based provisioning in the associated environment account.
     * </p>
     */
    private String codebuildRoleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined
     * components in the associated environment account. It determines the scope of infrastructure that a component can
     * provision in the account.
     * </p>
     * <p>
     * The environment account connection must have a <code>componentRoleArn</code> to allow directly defined components
     * to be associated with any environments running in the account.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     */
    private String componentRoleArn;
    /**
     * <p>
     * The ID of the environment account connection to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that's associated with the environment account connection
     * to update.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM service role in the environment account. Proton uses this role to
     * provision infrastructure resources using CodeBuild-based provisioning in the associated environment account.
     * </p>
     * 
     * @param codebuildRoleArn
     *        The Amazon Resource Name (ARN) of an IAM service role in the environment account. Proton uses this role to
     *        provision infrastructure resources using CodeBuild-based provisioning in the associated environment
     *        account.
     */

    public void setCodebuildRoleArn(String codebuildRoleArn) {
        this.codebuildRoleArn = codebuildRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM service role in the environment account. Proton uses this role to
     * provision infrastructure resources using CodeBuild-based provisioning in the associated environment account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM service role in the environment account. Proton uses this role
     *         to provision infrastructure resources using CodeBuild-based provisioning in the associated environment
     *         account.
     */

    public String getCodebuildRoleArn() {
        return this.codebuildRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM service role in the environment account. Proton uses this role to
     * provision infrastructure resources using CodeBuild-based provisioning in the associated environment account.
     * </p>
     * 
     * @param codebuildRoleArn
     *        The Amazon Resource Name (ARN) of an IAM service role in the environment account. Proton uses this role to
     *        provision infrastructure resources using CodeBuild-based provisioning in the associated environment
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentAccountConnectionRequest withCodebuildRoleArn(String codebuildRoleArn) {
        setCodebuildRoleArn(codebuildRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined
     * components in the associated environment account. It determines the scope of infrastructure that a component can
     * provision in the account.
     * </p>
     * <p>
     * The environment account connection must have a <code>componentRoleArn</code> to allow directly defined components
     * to be associated with any environments running in the account.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param componentRoleArn
     *        The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined
     *        components in the associated environment account. It determines the scope of infrastructure that a
     *        component can provision in the account.</p>
     *        <p>
     *        The environment account connection must have a <code>componentRoleArn</code> to allow directly defined
     *        components to be associated with any environments running in the account.
     *        </p>
     *        <p>
     *        For more information about components, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     *        <i>Proton User Guide</i>.
     */

    public void setComponentRoleArn(String componentRoleArn) {
        this.componentRoleArn = componentRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined
     * components in the associated environment account. It determines the scope of infrastructure that a component can
     * provision in the account.
     * </p>
     * <p>
     * The environment account connection must have a <code>componentRoleArn</code> to allow directly defined components
     * to be associated with any environments running in the account.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly
     *         defined components in the associated environment account. It determines the scope of infrastructure that
     *         a component can provision in the account.</p>
     *         <p>
     *         The environment account connection must have a <code>componentRoleArn</code> to allow directly defined
     *         components to be associated with any environments running in the account.
     *         </p>
     *         <p>
     *         For more information about components, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in
     *         the <i>Proton User Guide</i>.
     */

    public String getComponentRoleArn() {
        return this.componentRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined
     * components in the associated environment account. It determines the scope of infrastructure that a component can
     * provision in the account.
     * </p>
     * <p>
     * The environment account connection must have a <code>componentRoleArn</code> to allow directly defined components
     * to be associated with any environments running in the account.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param componentRoleArn
     *        The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined
     *        components in the associated environment account. It determines the scope of infrastructure that a
     *        component can provision in the account.</p>
     *        <p>
     *        The environment account connection must have a <code>componentRoleArn</code> to allow directly defined
     *        components to be associated with any environments running in the account.
     *        </p>
     *        <p>
     *        For more information about components, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     *        <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentAccountConnectionRequest withComponentRoleArn(String componentRoleArn) {
        setComponentRoleArn(componentRoleArn);
        return this;
    }

    /**
     * <p>
     * The ID of the environment account connection to update.
     * </p>
     * 
     * @param id
     *        The ID of the environment account connection to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the environment account connection to update.
     * </p>
     * 
     * @return The ID of the environment account connection to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the environment account connection to update.
     * </p>
     * 
     * @param id
     *        The ID of the environment account connection to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentAccountConnectionRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that's associated with the environment account connection
     * to update.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM service role that's associated with the environment account
     *        connection to update.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that's associated with the environment account connection
     * to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM service role that's associated with the environment account
     *         connection to update.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that's associated with the environment account connection
     * to update.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM service role that's associated with the environment account
     *        connection to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentAccountConnectionRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getCodebuildRoleArn() != null)
            sb.append("CodebuildRoleArn: ").append(getCodebuildRoleArn()).append(",");
        if (getComponentRoleArn() != null)
            sb.append("ComponentRoleArn: ").append(getComponentRoleArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentAccountConnectionRequest == false)
            return false;
        UpdateEnvironmentAccountConnectionRequest other = (UpdateEnvironmentAccountConnectionRequest) obj;
        if (other.getCodebuildRoleArn() == null ^ this.getCodebuildRoleArn() == null)
            return false;
        if (other.getCodebuildRoleArn() != null && other.getCodebuildRoleArn().equals(this.getCodebuildRoleArn()) == false)
            return false;
        if (other.getComponentRoleArn() == null ^ this.getComponentRoleArn() == null)
            return false;
        if (other.getComponentRoleArn() != null && other.getComponentRoleArn().equals(this.getComponentRoleArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodebuildRoleArn() == null) ? 0 : getCodebuildRoleArn().hashCode());
        hashCode = prime * hashCode + ((getComponentRoleArn() == null) ? 0 : getComponentRoleArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentAccountConnectionRequest clone() {
        return (UpdateEnvironmentAccountConnectionRequest) super.clone();
    }

}
