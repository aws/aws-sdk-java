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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetNetworkSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNetworkSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the network settings.
     * </p>
     */
    private String networkSettingsArn;

    /**
     * <p>
     * The ARN of the network settings.
     * </p>
     * 
     * @param networkSettingsArn
     *        The ARN of the network settings.
     */

    public void setNetworkSettingsArn(String networkSettingsArn) {
        this.networkSettingsArn = networkSettingsArn;
    }

    /**
     * <p>
     * The ARN of the network settings.
     * </p>
     * 
     * @return The ARN of the network settings.
     */

    public String getNetworkSettingsArn() {
        return this.networkSettingsArn;
    }

    /**
     * <p>
     * The ARN of the network settings.
     * </p>
     * 
     * @param networkSettingsArn
     *        The ARN of the network settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkSettingsRequest withNetworkSettingsArn(String networkSettingsArn) {
        setNetworkSettingsArn(networkSettingsArn);
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
        if (getNetworkSettingsArn() != null)
            sb.append("NetworkSettingsArn: ").append(getNetworkSettingsArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetNetworkSettingsRequest == false)
            return false;
        GetNetworkSettingsRequest other = (GetNetworkSettingsRequest) obj;
        if (other.getNetworkSettingsArn() == null ^ this.getNetworkSettingsArn() == null)
            return false;
        if (other.getNetworkSettingsArn() != null && other.getNetworkSettingsArn().equals(this.getNetworkSettingsArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkSettingsArn() == null) ? 0 : getNetworkSettingsArn().hashCode());
        return hashCode;
    }

    @Override
    public GetNetworkSettingsRequest clone() {
        return (GetNetworkSettingsRequest) super.clone();
    }

}
