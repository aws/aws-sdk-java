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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetBaiduChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBaiduChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private BaiduChannelResponse baiduChannelResponse;

    /**
     * @param baiduChannelResponse
     */

    public void setBaiduChannelResponse(BaiduChannelResponse baiduChannelResponse) {
        this.baiduChannelResponse = baiduChannelResponse;
    }

    /**
     * @return
     */

    public BaiduChannelResponse getBaiduChannelResponse() {
        return this.baiduChannelResponse;
    }

    /**
     * @param baiduChannelResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBaiduChannelResult withBaiduChannelResponse(BaiduChannelResponse baiduChannelResponse) {
        setBaiduChannelResponse(baiduChannelResponse);
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
        if (getBaiduChannelResponse() != null)
            sb.append("BaiduChannelResponse: ").append(getBaiduChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBaiduChannelResult == false)
            return false;
        GetBaiduChannelResult other = (GetBaiduChannelResult) obj;
        if (other.getBaiduChannelResponse() == null ^ this.getBaiduChannelResponse() == null)
            return false;
        if (other.getBaiduChannelResponse() != null && other.getBaiduChannelResponse().equals(this.getBaiduChannelResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaiduChannelResponse() == null) ? 0 : getBaiduChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public GetBaiduChannelResult clone() {
        try {
            return (GetBaiduChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
