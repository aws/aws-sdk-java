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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectPeerAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConnectPeerAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Displays a list of Connect peer associations.
     * </p>
     */
    private java.util.List<ConnectPeerAssociation> connectPeerAssociations;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Displays a list of Connect peer associations.
     * </p>
     * 
     * @return Displays a list of Connect peer associations.
     */

    public java.util.List<ConnectPeerAssociation> getConnectPeerAssociations() {
        return connectPeerAssociations;
    }

    /**
     * <p>
     * Displays a list of Connect peer associations.
     * </p>
     * 
     * @param connectPeerAssociations
     *        Displays a list of Connect peer associations.
     */

    public void setConnectPeerAssociations(java.util.Collection<ConnectPeerAssociation> connectPeerAssociations) {
        if (connectPeerAssociations == null) {
            this.connectPeerAssociations = null;
            return;
        }

        this.connectPeerAssociations = new java.util.ArrayList<ConnectPeerAssociation>(connectPeerAssociations);
    }

    /**
     * <p>
     * Displays a list of Connect peer associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectPeerAssociations(java.util.Collection)} or
     * {@link #withConnectPeerAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param connectPeerAssociations
     *        Displays a list of Connect peer associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectPeerAssociationsResult withConnectPeerAssociations(ConnectPeerAssociation... connectPeerAssociations) {
        if (this.connectPeerAssociations == null) {
            setConnectPeerAssociations(new java.util.ArrayList<ConnectPeerAssociation>(connectPeerAssociations.length));
        }
        for (ConnectPeerAssociation ele : connectPeerAssociations) {
            this.connectPeerAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Displays a list of Connect peer associations.
     * </p>
     * 
     * @param connectPeerAssociations
     *        Displays a list of Connect peer associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectPeerAssociationsResult withConnectPeerAssociations(java.util.Collection<ConnectPeerAssociation> connectPeerAssociations) {
        setConnectPeerAssociations(connectPeerAssociations);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectPeerAssociationsResult withNextToken(String nextToken) {
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
        if (getConnectPeerAssociations() != null)
            sb.append("ConnectPeerAssociations: ").append(getConnectPeerAssociations()).append(",");
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

        if (obj instanceof GetConnectPeerAssociationsResult == false)
            return false;
        GetConnectPeerAssociationsResult other = (GetConnectPeerAssociationsResult) obj;
        if (other.getConnectPeerAssociations() == null ^ this.getConnectPeerAssociations() == null)
            return false;
        if (other.getConnectPeerAssociations() != null && other.getConnectPeerAssociations().equals(this.getConnectPeerAssociations()) == false)
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

        hashCode = prime * hashCode + ((getConnectPeerAssociations() == null) ? 0 : getConnectPeerAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetConnectPeerAssociationsResult clone() {
        try {
            return (GetConnectPeerAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
