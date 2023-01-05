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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetwork" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNetworkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     */
    private String networkArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network.
     */

    public void setNetworkArn(String networkArn) {
        this.networkArn = networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network.
     */

    public String getNetworkArn() {
        return this.networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRequest withNetworkArn(String networkArn) {
        setNetworkArn(networkArn);
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
        if (getNetworkArn() != null)
            sb.append("NetworkArn: ").append(getNetworkArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetNetworkRequest == false)
            return false;
        GetNetworkRequest other = (GetNetworkRequest) obj;
        if (other.getNetworkArn() == null ^ this.getNetworkArn() == null)
            return false;
        if (other.getNetworkArn() != null && other.getNetworkArn().equals(this.getNetworkArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkArn() == null) ? 0 : getNetworkArn().hashCode());
        return hashCode;
    }

    @Override
    public GetNetworkRequest clone() {
        return (GetNetworkRequest) super.clone();
    }

}
