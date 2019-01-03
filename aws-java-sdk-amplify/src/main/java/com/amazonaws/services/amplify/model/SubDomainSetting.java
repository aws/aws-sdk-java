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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Setting for the Subdomain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/SubDomainSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubDomainSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Prefix setting for the Subdomain.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * Branch name setting for the Subdomain.
     * </p>
     */
    private String branchName;

    /**
     * <p>
     * Prefix setting for the Subdomain.
     * </p>
     * 
     * @param prefix
     *        Prefix setting for the Subdomain.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Prefix setting for the Subdomain.
     * </p>
     * 
     * @return Prefix setting for the Subdomain.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * Prefix setting for the Subdomain.
     * </p>
     * 
     * @param prefix
     *        Prefix setting for the Subdomain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubDomainSetting withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * Branch name setting for the Subdomain.
     * </p>
     * 
     * @param branchName
     *        Branch name setting for the Subdomain.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * Branch name setting for the Subdomain.
     * </p>
     * 
     * @return Branch name setting for the Subdomain.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * Branch name setting for the Subdomain.
     * </p>
     * 
     * @param branchName
     *        Branch name setting for the Subdomain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubDomainSetting withBranchName(String branchName) {
        setBranchName(branchName);
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
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubDomainSetting == false)
            return false;
        SubDomainSetting other = (SubDomainSetting) obj;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        return hashCode;
    }

    @Override
    public SubDomainSetting clone() {
        try {
            return (SubDomainSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.SubDomainSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
