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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateLogLevelsByResourceTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLogLevelsByResourceTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String defaultLogLevel;

    private java.util.List<WirelessDeviceLogOption> wirelessDeviceLogOptions;

    private java.util.List<WirelessGatewayLogOption> wirelessGatewayLogOptions;

    /**
     * @param defaultLogLevel
     * @see LogLevel
     */

    public void setDefaultLogLevel(String defaultLogLevel) {
        this.defaultLogLevel = defaultLogLevel;
    }

    /**
     * @return
     * @see LogLevel
     */

    public String getDefaultLogLevel() {
        return this.defaultLogLevel;
    }

    /**
     * @param defaultLogLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public UpdateLogLevelsByResourceTypesRequest withDefaultLogLevel(String defaultLogLevel) {
        setDefaultLogLevel(defaultLogLevel);
        return this;
    }

    /**
     * @param defaultLogLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public UpdateLogLevelsByResourceTypesRequest withDefaultLogLevel(LogLevel defaultLogLevel) {
        this.defaultLogLevel = defaultLogLevel.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<WirelessDeviceLogOption> getWirelessDeviceLogOptions() {
        return wirelessDeviceLogOptions;
    }

    /**
     * @param wirelessDeviceLogOptions
     */

    public void setWirelessDeviceLogOptions(java.util.Collection<WirelessDeviceLogOption> wirelessDeviceLogOptions) {
        if (wirelessDeviceLogOptions == null) {
            this.wirelessDeviceLogOptions = null;
            return;
        }

        this.wirelessDeviceLogOptions = new java.util.ArrayList<WirelessDeviceLogOption>(wirelessDeviceLogOptions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWirelessDeviceLogOptions(java.util.Collection)} or
     * {@link #withWirelessDeviceLogOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param wirelessDeviceLogOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLogLevelsByResourceTypesRequest withWirelessDeviceLogOptions(WirelessDeviceLogOption... wirelessDeviceLogOptions) {
        if (this.wirelessDeviceLogOptions == null) {
            setWirelessDeviceLogOptions(new java.util.ArrayList<WirelessDeviceLogOption>(wirelessDeviceLogOptions.length));
        }
        for (WirelessDeviceLogOption ele : wirelessDeviceLogOptions) {
            this.wirelessDeviceLogOptions.add(ele);
        }
        return this;
    }

    /**
     * @param wirelessDeviceLogOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLogLevelsByResourceTypesRequest withWirelessDeviceLogOptions(java.util.Collection<WirelessDeviceLogOption> wirelessDeviceLogOptions) {
        setWirelessDeviceLogOptions(wirelessDeviceLogOptions);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<WirelessGatewayLogOption> getWirelessGatewayLogOptions() {
        return wirelessGatewayLogOptions;
    }

    /**
     * @param wirelessGatewayLogOptions
     */

    public void setWirelessGatewayLogOptions(java.util.Collection<WirelessGatewayLogOption> wirelessGatewayLogOptions) {
        if (wirelessGatewayLogOptions == null) {
            this.wirelessGatewayLogOptions = null;
            return;
        }

        this.wirelessGatewayLogOptions = new java.util.ArrayList<WirelessGatewayLogOption>(wirelessGatewayLogOptions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWirelessGatewayLogOptions(java.util.Collection)} or
     * {@link #withWirelessGatewayLogOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param wirelessGatewayLogOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLogLevelsByResourceTypesRequest withWirelessGatewayLogOptions(WirelessGatewayLogOption... wirelessGatewayLogOptions) {
        if (this.wirelessGatewayLogOptions == null) {
            setWirelessGatewayLogOptions(new java.util.ArrayList<WirelessGatewayLogOption>(wirelessGatewayLogOptions.length));
        }
        for (WirelessGatewayLogOption ele : wirelessGatewayLogOptions) {
            this.wirelessGatewayLogOptions.add(ele);
        }
        return this;
    }

    /**
     * @param wirelessGatewayLogOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLogLevelsByResourceTypesRequest withWirelessGatewayLogOptions(java.util.Collection<WirelessGatewayLogOption> wirelessGatewayLogOptions) {
        setWirelessGatewayLogOptions(wirelessGatewayLogOptions);
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
        if (getDefaultLogLevel() != null)
            sb.append("DefaultLogLevel: ").append(getDefaultLogLevel()).append(",");
        if (getWirelessDeviceLogOptions() != null)
            sb.append("WirelessDeviceLogOptions: ").append(getWirelessDeviceLogOptions()).append(",");
        if (getWirelessGatewayLogOptions() != null)
            sb.append("WirelessGatewayLogOptions: ").append(getWirelessGatewayLogOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLogLevelsByResourceTypesRequest == false)
            return false;
        UpdateLogLevelsByResourceTypesRequest other = (UpdateLogLevelsByResourceTypesRequest) obj;
        if (other.getDefaultLogLevel() == null ^ this.getDefaultLogLevel() == null)
            return false;
        if (other.getDefaultLogLevel() != null && other.getDefaultLogLevel().equals(this.getDefaultLogLevel()) == false)
            return false;
        if (other.getWirelessDeviceLogOptions() == null ^ this.getWirelessDeviceLogOptions() == null)
            return false;
        if (other.getWirelessDeviceLogOptions() != null && other.getWirelessDeviceLogOptions().equals(this.getWirelessDeviceLogOptions()) == false)
            return false;
        if (other.getWirelessGatewayLogOptions() == null ^ this.getWirelessGatewayLogOptions() == null)
            return false;
        if (other.getWirelessGatewayLogOptions() != null && other.getWirelessGatewayLogOptions().equals(this.getWirelessGatewayLogOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultLogLevel() == null) ? 0 : getDefaultLogLevel().hashCode());
        hashCode = prime * hashCode + ((getWirelessDeviceLogOptions() == null) ? 0 : getWirelessDeviceLogOptions().hashCode());
        hashCode = prime * hashCode + ((getWirelessGatewayLogOptions() == null) ? 0 : getWirelessGatewayLogOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLogLevelsByResourceTypesRequest clone() {
        return (UpdateLogLevelsByResourceTypesRequest) super.clone();
    }

}
