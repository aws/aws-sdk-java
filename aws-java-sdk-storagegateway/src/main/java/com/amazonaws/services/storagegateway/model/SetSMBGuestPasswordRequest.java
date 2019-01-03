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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * SetSMBGuestPasswordInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/SetSMBGuestPassword" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetSMBGuestPasswordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
     * </p>
     */
    private String gatewayARN;
    /**
     * <p>
     * The password that you want to set for your SMB Server.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSMBGuestPasswordRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The password that you want to set for your SMB Server.
     * </p>
     * 
     * @param password
     *        The password that you want to set for your SMB Server.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password that you want to set for your SMB Server.
     * </p>
     * 
     * @return The password that you want to set for your SMB Server.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password that you want to set for your SMB Server.
     * </p>
     * 
     * @param password
     *        The password that you want to set for your SMB Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSMBGuestPasswordRequest withPassword(String password) {
        setPassword(password);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetSMBGuestPasswordRequest == false)
            return false;
        SetSMBGuestPasswordRequest other = (SetSMBGuestPasswordRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public SetSMBGuestPasswordRequest clone() {
        return (SetSMBGuestPasswordRequest) super.clone();
    }

}
