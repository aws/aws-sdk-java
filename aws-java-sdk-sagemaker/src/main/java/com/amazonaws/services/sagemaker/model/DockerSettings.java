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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of settings that configure the domain's Docker interaction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DockerSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DockerSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the domain can access Docker.
     * </p>
     */
    private String enableDockerAccess;
    /**
     * <p>
     * The list of Amazon Web Services accounts that are trusted when the domain is created in VPC-only mode.
     * </p>
     */
    private java.util.List<String> vpcOnlyTrustedAccounts;

    /**
     * <p>
     * Indicates whether the domain can access Docker.
     * </p>
     * 
     * @param enableDockerAccess
     *        Indicates whether the domain can access Docker.
     * @see FeatureStatus
     */

    public void setEnableDockerAccess(String enableDockerAccess) {
        this.enableDockerAccess = enableDockerAccess;
    }

    /**
     * <p>
     * Indicates whether the domain can access Docker.
     * </p>
     * 
     * @return Indicates whether the domain can access Docker.
     * @see FeatureStatus
     */

    public String getEnableDockerAccess() {
        return this.enableDockerAccess;
    }

    /**
     * <p>
     * Indicates whether the domain can access Docker.
     * </p>
     * 
     * @param enableDockerAccess
     *        Indicates whether the domain can access Docker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public DockerSettings withEnableDockerAccess(String enableDockerAccess) {
        setEnableDockerAccess(enableDockerAccess);
        return this;
    }

    /**
     * <p>
     * Indicates whether the domain can access Docker.
     * </p>
     * 
     * @param enableDockerAccess
     *        Indicates whether the domain can access Docker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public DockerSettings withEnableDockerAccess(FeatureStatus enableDockerAccess) {
        this.enableDockerAccess = enableDockerAccess.toString();
        return this;
    }

    /**
     * <p>
     * The list of Amazon Web Services accounts that are trusted when the domain is created in VPC-only mode.
     * </p>
     * 
     * @return The list of Amazon Web Services accounts that are trusted when the domain is created in VPC-only mode.
     */

    public java.util.List<String> getVpcOnlyTrustedAccounts() {
        return vpcOnlyTrustedAccounts;
    }

    /**
     * <p>
     * The list of Amazon Web Services accounts that are trusted when the domain is created in VPC-only mode.
     * </p>
     * 
     * @param vpcOnlyTrustedAccounts
     *        The list of Amazon Web Services accounts that are trusted when the domain is created in VPC-only mode.
     */

    public void setVpcOnlyTrustedAccounts(java.util.Collection<String> vpcOnlyTrustedAccounts) {
        if (vpcOnlyTrustedAccounts == null) {
            this.vpcOnlyTrustedAccounts = null;
            return;
        }

        this.vpcOnlyTrustedAccounts = new java.util.ArrayList<String>(vpcOnlyTrustedAccounts);
    }

    /**
     * <p>
     * The list of Amazon Web Services accounts that are trusted when the domain is created in VPC-only mode.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcOnlyTrustedAccounts(java.util.Collection)} or
     * {@link #withVpcOnlyTrustedAccounts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vpcOnlyTrustedAccounts
     *        The list of Amazon Web Services accounts that are trusted when the domain is created in VPC-only mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DockerSettings withVpcOnlyTrustedAccounts(String... vpcOnlyTrustedAccounts) {
        if (this.vpcOnlyTrustedAccounts == null) {
            setVpcOnlyTrustedAccounts(new java.util.ArrayList<String>(vpcOnlyTrustedAccounts.length));
        }
        for (String ele : vpcOnlyTrustedAccounts) {
            this.vpcOnlyTrustedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Amazon Web Services accounts that are trusted when the domain is created in VPC-only mode.
     * </p>
     * 
     * @param vpcOnlyTrustedAccounts
     *        The list of Amazon Web Services accounts that are trusted when the domain is created in VPC-only mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DockerSettings withVpcOnlyTrustedAccounts(java.util.Collection<String> vpcOnlyTrustedAccounts) {
        setVpcOnlyTrustedAccounts(vpcOnlyTrustedAccounts);
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
        if (getEnableDockerAccess() != null)
            sb.append("EnableDockerAccess: ").append(getEnableDockerAccess()).append(",");
        if (getVpcOnlyTrustedAccounts() != null)
            sb.append("VpcOnlyTrustedAccounts: ").append(getVpcOnlyTrustedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DockerSettings == false)
            return false;
        DockerSettings other = (DockerSettings) obj;
        if (other.getEnableDockerAccess() == null ^ this.getEnableDockerAccess() == null)
            return false;
        if (other.getEnableDockerAccess() != null && other.getEnableDockerAccess().equals(this.getEnableDockerAccess()) == false)
            return false;
        if (other.getVpcOnlyTrustedAccounts() == null ^ this.getVpcOnlyTrustedAccounts() == null)
            return false;
        if (other.getVpcOnlyTrustedAccounts() != null && other.getVpcOnlyTrustedAccounts().equals(this.getVpcOnlyTrustedAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableDockerAccess() == null) ? 0 : getEnableDockerAccess().hashCode());
        hashCode = prime * hashCode + ((getVpcOnlyTrustedAccounts() == null) ? 0 : getVpcOnlyTrustedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public DockerSettings clone() {
        try {
            return (DockerSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DockerSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
