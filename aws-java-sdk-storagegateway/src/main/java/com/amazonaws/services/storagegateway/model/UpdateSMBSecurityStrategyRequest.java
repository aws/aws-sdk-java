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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateSMBSecurityStrategy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSMBSecurityStrategyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * Specifies the type of security strategy.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This
     * option is recommended when you want to maximize compatibility across different clients in your environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that
     * have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or
     * newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have
     * encryption enabled. This option is highly recommended for environments that handle sensitive data. This option
     * works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * </p>
     */
    private String sMBSecurityStrategy;

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

    public UpdateSMBSecurityStrategyRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * Specifies the type of security strategy.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This
     * option is recommended when you want to maximize compatibility across different clients in your environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that
     * have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or
     * newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have
     * encryption enabled. This option is highly recommended for environments that handle sensitive data. This option
     * works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * </p>
     * 
     * @param sMBSecurityStrategy
     *        Specifies the type of security strategy.</p>
     *        <p>
     *        ClientSpecified: if you use this option, requests are established based on what is negotiated by the
     *        client. This option is recommended when you want to maximize compatibility across different clients in
     *        your environment.
     *        </p>
     *        <p>
     *        MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients
     *        that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server
     *        2008 or newer.
     *        </p>
     *        <p>
     *        MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that
     *        have encryption enabled. This option is highly recommended for environments that handle sensitive data.
     *        This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * @see SMBSecurityStrategy
     */

    public void setSMBSecurityStrategy(String sMBSecurityStrategy) {
        this.sMBSecurityStrategy = sMBSecurityStrategy;
    }

    /**
     * <p>
     * Specifies the type of security strategy.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This
     * option is recommended when you want to maximize compatibility across different clients in your environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that
     * have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or
     * newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have
     * encryption enabled. This option is highly recommended for environments that handle sensitive data. This option
     * works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * </p>
     * 
     * @return Specifies the type of security strategy.</p>
     *         <p>
     *         ClientSpecified: if you use this option, requests are established based on what is negotiated by the
     *         client. This option is recommended when you want to maximize compatibility across different clients in
     *         your environment.
     *         </p>
     *         <p>
     *         MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3
     *         clients that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows
     *         Server 2008 or newer.
     *         </p>
     *         <p>
     *         MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that
     *         have encryption enabled. This option is highly recommended for environments that handle sensitive data.
     *         This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * @see SMBSecurityStrategy
     */

    public String getSMBSecurityStrategy() {
        return this.sMBSecurityStrategy;
    }

    /**
     * <p>
     * Specifies the type of security strategy.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This
     * option is recommended when you want to maximize compatibility across different clients in your environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that
     * have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or
     * newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have
     * encryption enabled. This option is highly recommended for environments that handle sensitive data. This option
     * works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * </p>
     * 
     * @param sMBSecurityStrategy
     *        Specifies the type of security strategy.</p>
     *        <p>
     *        ClientSpecified: if you use this option, requests are established based on what is negotiated by the
     *        client. This option is recommended when you want to maximize compatibility across different clients in
     *        your environment.
     *        </p>
     *        <p>
     *        MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients
     *        that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server
     *        2008 or newer.
     *        </p>
     *        <p>
     *        MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that
     *        have encryption enabled. This option is highly recommended for environments that handle sensitive data.
     *        This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SMBSecurityStrategy
     */

    public UpdateSMBSecurityStrategyRequest withSMBSecurityStrategy(String sMBSecurityStrategy) {
        setSMBSecurityStrategy(sMBSecurityStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies the type of security strategy.
     * </p>
     * <p>
     * ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This
     * option is recommended when you want to maximize compatibility across different clients in your environment.
     * </p>
     * <p>
     * MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that
     * have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or
     * newer.
     * </p>
     * <p>
     * MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have
     * encryption enabled. This option is highly recommended for environments that handle sensitive data. This option
     * works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * </p>
     * 
     * @param sMBSecurityStrategy
     *        Specifies the type of security strategy.</p>
     *        <p>
     *        ClientSpecified: if you use this option, requests are established based on what is negotiated by the
     *        client. This option is recommended when you want to maximize compatibility across different clients in
     *        your environment.
     *        </p>
     *        <p>
     *        MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients
     *        that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server
     *        2008 or newer.
     *        </p>
     *        <p>
     *        MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that
     *        have encryption enabled. This option is highly recommended for environments that handle sensitive data.
     *        This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SMBSecurityStrategy
     */

    public UpdateSMBSecurityStrategyRequest withSMBSecurityStrategy(SMBSecurityStrategy sMBSecurityStrategy) {
        this.sMBSecurityStrategy = sMBSecurityStrategy.toString();
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
        if (getSMBSecurityStrategy() != null)
            sb.append("SMBSecurityStrategy: ").append(getSMBSecurityStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSMBSecurityStrategyRequest == false)
            return false;
        UpdateSMBSecurityStrategyRequest other = (UpdateSMBSecurityStrategyRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getSMBSecurityStrategy() == null ^ this.getSMBSecurityStrategy() == null)
            return false;
        if (other.getSMBSecurityStrategy() != null && other.getSMBSecurityStrategy().equals(this.getSMBSecurityStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getSMBSecurityStrategy() == null) ? 0 : getSMBSecurityStrategy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSMBSecurityStrategyRequest clone() {
        return (UpdateSMBSecurityStrategyRequest) super.clone();
    }

}
