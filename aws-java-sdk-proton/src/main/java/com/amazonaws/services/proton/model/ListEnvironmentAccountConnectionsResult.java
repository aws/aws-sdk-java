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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentAccountConnections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentAccountConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of environment account connections with details that's returned by AWS Proton.
     * </p>
     */
    private java.util.List<EnvironmentAccountConnectionSummary> environmentAccountConnections;
    /**
     * <p>
     * A token to indicate the location of the next environment account connection in the array of environment account
     * connections, after the current requested list of environment account connections.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of environment account connections with details that's returned by AWS Proton.
     * </p>
     * 
     * @return An array of environment account connections with details that's returned by AWS Proton.
     */

    public java.util.List<EnvironmentAccountConnectionSummary> getEnvironmentAccountConnections() {
        return environmentAccountConnections;
    }

    /**
     * <p>
     * An array of environment account connections with details that's returned by AWS Proton.
     * </p>
     * 
     * @param environmentAccountConnections
     *        An array of environment account connections with details that's returned by AWS Proton.
     */

    public void setEnvironmentAccountConnections(java.util.Collection<EnvironmentAccountConnectionSummary> environmentAccountConnections) {
        if (environmentAccountConnections == null) {
            this.environmentAccountConnections = null;
            return;
        }

        this.environmentAccountConnections = new java.util.ArrayList<EnvironmentAccountConnectionSummary>(environmentAccountConnections);
    }

    /**
     * <p>
     * An array of environment account connections with details that's returned by AWS Proton.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentAccountConnections(java.util.Collection)} or
     * {@link #withEnvironmentAccountConnections(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param environmentAccountConnections
     *        An array of environment account connections with details that's returned by AWS Proton.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentAccountConnectionsResult withEnvironmentAccountConnections(EnvironmentAccountConnectionSummary... environmentAccountConnections) {
        if (this.environmentAccountConnections == null) {
            setEnvironmentAccountConnections(new java.util.ArrayList<EnvironmentAccountConnectionSummary>(environmentAccountConnections.length));
        }
        for (EnvironmentAccountConnectionSummary ele : environmentAccountConnections) {
            this.environmentAccountConnections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of environment account connections with details that's returned by AWS Proton.
     * </p>
     * 
     * @param environmentAccountConnections
     *        An array of environment account connections with details that's returned by AWS Proton.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentAccountConnectionsResult withEnvironmentAccountConnections(
            java.util.Collection<EnvironmentAccountConnectionSummary> environmentAccountConnections) {
        setEnvironmentAccountConnections(environmentAccountConnections);
        return this;
    }

    /**
     * <p>
     * A token to indicate the location of the next environment account connection in the array of environment account
     * connections, after the current requested list of environment account connections.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next environment account connection in the array of environment
     *        account connections, after the current requested list of environment account connections.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next environment account connection in the array of environment account
     * connections, after the current requested list of environment account connections.
     * </p>
     * 
     * @return A token to indicate the location of the next environment account connection in the array of environment
     *         account connections, after the current requested list of environment account connections.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next environment account connection in the array of environment account
     * connections, after the current requested list of environment account connections.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next environment account connection in the array of environment
     *        account connections, after the current requested list of environment account connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentAccountConnectionsResult withNextToken(String nextToken) {
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
        if (getEnvironmentAccountConnections() != null)
            sb.append("EnvironmentAccountConnections: ").append(getEnvironmentAccountConnections()).append(",");
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

        if (obj instanceof ListEnvironmentAccountConnectionsResult == false)
            return false;
        ListEnvironmentAccountConnectionsResult other = (ListEnvironmentAccountConnectionsResult) obj;
        if (other.getEnvironmentAccountConnections() == null ^ this.getEnvironmentAccountConnections() == null)
            return false;
        if (other.getEnvironmentAccountConnections() != null
                && other.getEnvironmentAccountConnections().equals(this.getEnvironmentAccountConnections()) == false)
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

        hashCode = prime * hashCode + ((getEnvironmentAccountConnections() == null) ? 0 : getEnvironmentAccountConnections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentAccountConnectionsResult clone() {
        try {
            return (ListEnvironmentAccountConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
