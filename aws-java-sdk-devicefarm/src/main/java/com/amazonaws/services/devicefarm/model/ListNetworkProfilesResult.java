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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListNetworkProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNetworkProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the available network profiles.
     * </p>
     */
    private java.util.List<NetworkProfile> networkProfiles;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the available network profiles.
     * </p>
     * 
     * @return A list of the available network profiles.
     */

    public java.util.List<NetworkProfile> getNetworkProfiles() {
        return networkProfiles;
    }

    /**
     * <p>
     * A list of the available network profiles.
     * </p>
     * 
     * @param networkProfiles
     *        A list of the available network profiles.
     */

    public void setNetworkProfiles(java.util.Collection<NetworkProfile> networkProfiles) {
        if (networkProfiles == null) {
            this.networkProfiles = null;
            return;
        }

        this.networkProfiles = new java.util.ArrayList<NetworkProfile>(networkProfiles);
    }

    /**
     * <p>
     * A list of the available network profiles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkProfiles(java.util.Collection)} or {@link #withNetworkProfiles(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param networkProfiles
     *        A list of the available network profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkProfilesResult withNetworkProfiles(NetworkProfile... networkProfiles) {
        if (this.networkProfiles == null) {
            setNetworkProfiles(new java.util.ArrayList<NetworkProfile>(networkProfiles.length));
        }
        for (NetworkProfile ele : networkProfiles) {
            this.networkProfiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the available network profiles.
     * </p>
     * 
     * @param networkProfiles
     *        A list of the available network profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkProfilesResult withNetworkProfiles(java.util.Collection<NetworkProfile> networkProfiles) {
        setNetworkProfiles(networkProfiles);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkProfilesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNetworkProfiles() != null)
            sb.append("NetworkProfiles: ").append(getNetworkProfiles()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNetworkProfilesResult == false)
            return false;
        ListNetworkProfilesResult other = (ListNetworkProfilesResult) obj;
        if (other.getNetworkProfiles() == null ^ this.getNetworkProfiles() == null)
            return false;
        if (other.getNetworkProfiles() != null && other.getNetworkProfiles().equals(this.getNetworkProfiles()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkProfiles() == null) ? 0 : getNetworkProfiles().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListNetworkProfilesResult clone() {
        try {
            return (ListNetworkProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
