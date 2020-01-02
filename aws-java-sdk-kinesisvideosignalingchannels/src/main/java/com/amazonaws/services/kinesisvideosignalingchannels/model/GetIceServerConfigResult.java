/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideosignalingchannels.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/GetIceServerConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIceServerConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of ICE server information objects.
     * </p>
     */
    private java.util.List<IceServer> iceServerList;

    /**
     * <p>
     * The list of ICE server information objects.
     * </p>
     * 
     * @return The list of ICE server information objects.
     */

    public java.util.List<IceServer> getIceServerList() {
        return iceServerList;
    }

    /**
     * <p>
     * The list of ICE server information objects.
     * </p>
     * 
     * @param iceServerList
     *        The list of ICE server information objects.
     */

    public void setIceServerList(java.util.Collection<IceServer> iceServerList) {
        if (iceServerList == null) {
            this.iceServerList = null;
            return;
        }

        this.iceServerList = new java.util.ArrayList<IceServer>(iceServerList);
    }

    /**
     * <p>
     * The list of ICE server information objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIceServerList(java.util.Collection)} or {@link #withIceServerList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param iceServerList
     *        The list of ICE server information objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIceServerConfigResult withIceServerList(IceServer... iceServerList) {
        if (this.iceServerList == null) {
            setIceServerList(new java.util.ArrayList<IceServer>(iceServerList.length));
        }
        for (IceServer ele : iceServerList) {
            this.iceServerList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of ICE server information objects.
     * </p>
     * 
     * @param iceServerList
     *        The list of ICE server information objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIceServerConfigResult withIceServerList(java.util.Collection<IceServer> iceServerList) {
        setIceServerList(iceServerList);
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
        if (getIceServerList() != null)
            sb.append("IceServerList: ").append(getIceServerList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIceServerConfigResult == false)
            return false;
        GetIceServerConfigResult other = (GetIceServerConfigResult) obj;
        if (other.getIceServerList() == null ^ this.getIceServerList() == null)
            return false;
        if (other.getIceServerList() != null && other.getIceServerList().equals(this.getIceServerList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIceServerList() == null) ? 0 : getIceServerList().hashCode());
        return hashCode;
    }

    @Override
    public GetIceServerConfigResult clone() {
        try {
            return (GetIceServerConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
