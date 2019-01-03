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
 * SetLocalConsolePasswordInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/SetLocalConsolePassword"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetLocalConsolePasswordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * The password you want to set for your VM local console.
     * </p>
     */
    private String localConsolePassword;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLocalConsolePasswordRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The password you want to set for your VM local console.
     * </p>
     * 
     * @param localConsolePassword
     *        The password you want to set for your VM local console.
     */

    public void setLocalConsolePassword(String localConsolePassword) {
        this.localConsolePassword = localConsolePassword;
    }

    /**
     * <p>
     * The password you want to set for your VM local console.
     * </p>
     * 
     * @return The password you want to set for your VM local console.
     */

    public String getLocalConsolePassword() {
        return this.localConsolePassword;
    }

    /**
     * <p>
     * The password you want to set for your VM local console.
     * </p>
     * 
     * @param localConsolePassword
     *        The password you want to set for your VM local console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLocalConsolePasswordRequest withLocalConsolePassword(String localConsolePassword) {
        setLocalConsolePassword(localConsolePassword);
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
        if (getLocalConsolePassword() != null)
            sb.append("LocalConsolePassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetLocalConsolePasswordRequest == false)
            return false;
        SetLocalConsolePasswordRequest other = (SetLocalConsolePasswordRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getLocalConsolePassword() == null ^ this.getLocalConsolePassword() == null)
            return false;
        if (other.getLocalConsolePassword() != null && other.getLocalConsolePassword().equals(this.getLocalConsolePassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getLocalConsolePassword() == null) ? 0 : getLocalConsolePassword().hashCode());
        return hashCode;
    }

    @Override
    public SetLocalConsolePasswordRequest clone() {
        return (SetLocalConsolePasswordRequest) super.clone();
    }

}
