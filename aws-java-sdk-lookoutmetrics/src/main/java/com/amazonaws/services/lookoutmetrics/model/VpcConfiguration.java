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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configuration information about the Amazon Virtual Private Cloud (VPC).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/VpcConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of strings containing the Amazon VPC subnet IDs (e.g., <code>subnet-0bb1c79de3EXAMPLE</code>.
     * </p>
     */
    private java.util.List<String> subnetIdList;
    /**
     * <p>
     * An array of strings containing the list of security groups.
     * </p>
     */
    private java.util.List<String> securityGroupIdList;

    /**
     * <p>
     * An array of strings containing the Amazon VPC subnet IDs (e.g., <code>subnet-0bb1c79de3EXAMPLE</code>.
     * </p>
     * 
     * @return An array of strings containing the Amazon VPC subnet IDs (e.g., <code>subnet-0bb1c79de3EXAMPLE</code>.
     */

    public java.util.List<String> getSubnetIdList() {
        return subnetIdList;
    }

    /**
     * <p>
     * An array of strings containing the Amazon VPC subnet IDs (e.g., <code>subnet-0bb1c79de3EXAMPLE</code>.
     * </p>
     * 
     * @param subnetIdList
     *        An array of strings containing the Amazon VPC subnet IDs (e.g., <code>subnet-0bb1c79de3EXAMPLE</code>.
     */

    public void setSubnetIdList(java.util.Collection<String> subnetIdList) {
        if (subnetIdList == null) {
            this.subnetIdList = null;
            return;
        }

        this.subnetIdList = new java.util.ArrayList<String>(subnetIdList);
    }

    /**
     * <p>
     * An array of strings containing the Amazon VPC subnet IDs (e.g., <code>subnet-0bb1c79de3EXAMPLE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIdList(java.util.Collection)} or {@link #withSubnetIdList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIdList
     *        An array of strings containing the Amazon VPC subnet IDs (e.g., <code>subnet-0bb1c79de3EXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSubnetIdList(String... subnetIdList) {
        if (this.subnetIdList == null) {
            setSubnetIdList(new java.util.ArrayList<String>(subnetIdList.length));
        }
        for (String ele : subnetIdList) {
            this.subnetIdList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings containing the Amazon VPC subnet IDs (e.g., <code>subnet-0bb1c79de3EXAMPLE</code>.
     * </p>
     * 
     * @param subnetIdList
     *        An array of strings containing the Amazon VPC subnet IDs (e.g., <code>subnet-0bb1c79de3EXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSubnetIdList(java.util.Collection<String> subnetIdList) {
        setSubnetIdList(subnetIdList);
        return this;
    }

    /**
     * <p>
     * An array of strings containing the list of security groups.
     * </p>
     * 
     * @return An array of strings containing the list of security groups.
     */

    public java.util.List<String> getSecurityGroupIdList() {
        return securityGroupIdList;
    }

    /**
     * <p>
     * An array of strings containing the list of security groups.
     * </p>
     * 
     * @param securityGroupIdList
     *        An array of strings containing the list of security groups.
     */

    public void setSecurityGroupIdList(java.util.Collection<String> securityGroupIdList) {
        if (securityGroupIdList == null) {
            this.securityGroupIdList = null;
            return;
        }

        this.securityGroupIdList = new java.util.ArrayList<String>(securityGroupIdList);
    }

    /**
     * <p>
     * An array of strings containing the list of security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIdList(java.util.Collection)} or {@link #withSecurityGroupIdList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param securityGroupIdList
     *        An array of strings containing the list of security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSecurityGroupIdList(String... securityGroupIdList) {
        if (this.securityGroupIdList == null) {
            setSecurityGroupIdList(new java.util.ArrayList<String>(securityGroupIdList.length));
        }
        for (String ele : securityGroupIdList) {
            this.securityGroupIdList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings containing the list of security groups.
     * </p>
     * 
     * @param securityGroupIdList
     *        An array of strings containing the list of security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConfiguration withSecurityGroupIdList(java.util.Collection<String> securityGroupIdList) {
        setSecurityGroupIdList(securityGroupIdList);
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
        if (getSubnetIdList() != null)
            sb.append("SubnetIdList: ").append(getSubnetIdList()).append(",");
        if (getSecurityGroupIdList() != null)
            sb.append("SecurityGroupIdList: ").append(getSecurityGroupIdList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConfiguration == false)
            return false;
        VpcConfiguration other = (VpcConfiguration) obj;
        if (other.getSubnetIdList() == null ^ this.getSubnetIdList() == null)
            return false;
        if (other.getSubnetIdList() != null && other.getSubnetIdList().equals(this.getSubnetIdList()) == false)
            return false;
        if (other.getSecurityGroupIdList() == null ^ this.getSecurityGroupIdList() == null)
            return false;
        if (other.getSecurityGroupIdList() != null && other.getSecurityGroupIdList().equals(this.getSecurityGroupIdList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIdList() == null) ? 0 : getSubnetIdList().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIdList() == null) ? 0 : getSecurityGroupIdList().hashCode());
        return hashCode;
    }

    @Override
    public VpcConfiguration clone() {
        try {
            return (VpcConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.VpcConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
