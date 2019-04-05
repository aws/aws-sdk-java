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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStaticIpsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs containing information about your get static IPs request.
     * </p>
     */
    private java.util.List<StaticIp> staticIps;
    /**
     * <p>
     * A token used for advancing to the next page of results from your get static IPs request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of key-value pairs containing information about your get static IPs request.
     * </p>
     * 
     * @return An array of key-value pairs containing information about your get static IPs request.
     */

    public java.util.List<StaticIp> getStaticIps() {
        return staticIps;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your get static IPs request.
     * </p>
     * 
     * @param staticIps
     *        An array of key-value pairs containing information about your get static IPs request.
     */

    public void setStaticIps(java.util.Collection<StaticIp> staticIps) {
        if (staticIps == null) {
            this.staticIps = null;
            return;
        }

        this.staticIps = new java.util.ArrayList<StaticIp>(staticIps);
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your get static IPs request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStaticIps(java.util.Collection)} or {@link #withStaticIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param staticIps
     *        An array of key-value pairs containing information about your get static IPs request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStaticIpsResult withStaticIps(StaticIp... staticIps) {
        if (this.staticIps == null) {
            setStaticIps(new java.util.ArrayList<StaticIp>(staticIps.length));
        }
        for (StaticIp ele : staticIps) {
            this.staticIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your get static IPs request.
     * </p>
     * 
     * @param staticIps
     *        An array of key-value pairs containing information about your get static IPs request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStaticIpsResult withStaticIps(java.util.Collection<StaticIp> staticIps) {
        setStaticIps(staticIps);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get static IPs request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get static IPs request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get static IPs request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get static IPs request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get static IPs request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get static IPs request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStaticIpsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getStaticIps() != null)
            sb.append("StaticIps: ").append(getStaticIps()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStaticIpsResult == false)
            return false;
        GetStaticIpsResult other = (GetStaticIpsResult) obj;
        if (other.getStaticIps() == null ^ this.getStaticIps() == null)
            return false;
        if (other.getStaticIps() != null && other.getStaticIps().equals(this.getStaticIps()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStaticIps() == null) ? 0 : getStaticIps().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetStaticIpsResult clone() {
        try {
            return (GetStaticIpsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
