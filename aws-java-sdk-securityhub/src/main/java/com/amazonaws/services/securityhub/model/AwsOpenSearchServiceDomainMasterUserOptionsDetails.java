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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies information about the master user of the domain.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsOpenSearchServiceDomainMasterUserOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsOpenSearchServiceDomainMasterUserOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the master user.
     * </p>
     */
    private String masterUserArn;
    /**
     * <p>
     * The username for the master user.
     * </p>
     */
    private String masterUserName;
    /**
     * <p>
     * The password for the master user.
     * </p>
     */
    private String masterUserPassword;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the master user.
     * </p>
     * 
     * @param masterUserArn
     *        The Amazon Resource Name (ARN) for the master user.
     */

    public void setMasterUserArn(String masterUserArn) {
        this.masterUserArn = masterUserArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the master user.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the master user.
     */

    public String getMasterUserArn() {
        return this.masterUserArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the master user.
     * </p>
     * 
     * @param masterUserArn
     *        The Amazon Resource Name (ARN) for the master user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainMasterUserOptionsDetails withMasterUserArn(String masterUserArn) {
        setMasterUserArn(masterUserArn);
        return this;
    }

    /**
     * <p>
     * The username for the master user.
     * </p>
     * 
     * @param masterUserName
     *        The username for the master user.
     */

    public void setMasterUserName(String masterUserName) {
        this.masterUserName = masterUserName;
    }

    /**
     * <p>
     * The username for the master user.
     * </p>
     * 
     * @return The username for the master user.
     */

    public String getMasterUserName() {
        return this.masterUserName;
    }

    /**
     * <p>
     * The username for the master user.
     * </p>
     * 
     * @param masterUserName
     *        The username for the master user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainMasterUserOptionsDetails withMasterUserName(String masterUserName) {
        setMasterUserName(masterUserName);
        return this;
    }

    /**
     * <p>
     * The password for the master user.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master user.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user.
     * </p>
     * 
     * @return The password for the master user.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainMasterUserOptionsDetails withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
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
        if (getMasterUserArn() != null)
            sb.append("MasterUserArn: ").append(getMasterUserArn()).append(",");
        if (getMasterUserName() != null)
            sb.append("MasterUserName: ").append(getMasterUserName()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsOpenSearchServiceDomainMasterUserOptionsDetails == false)
            return false;
        AwsOpenSearchServiceDomainMasterUserOptionsDetails other = (AwsOpenSearchServiceDomainMasterUserOptionsDetails) obj;
        if (other.getMasterUserArn() == null ^ this.getMasterUserArn() == null)
            return false;
        if (other.getMasterUserArn() != null && other.getMasterUserArn().equals(this.getMasterUserArn()) == false)
            return false;
        if (other.getMasterUserName() == null ^ this.getMasterUserName() == null)
            return false;
        if (other.getMasterUserName() != null && other.getMasterUserName().equals(this.getMasterUserName()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMasterUserArn() == null) ? 0 : getMasterUserArn().hashCode());
        hashCode = prime * hashCode + ((getMasterUserName() == null) ? 0 : getMasterUserName().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        return hashCode;
    }

    @Override
    public AwsOpenSearchServiceDomainMasterUserOptionsDetails clone() {
        try {
            return (AwsOpenSearchServiceDomainMasterUserOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsOpenSearchServiceDomainMasterUserOptionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
