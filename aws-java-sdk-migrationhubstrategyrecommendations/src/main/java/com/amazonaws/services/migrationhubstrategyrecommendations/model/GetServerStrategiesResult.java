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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetServerStrategies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServerStrategiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of strategy recommendations for the server.
     * </p>
     */
    private java.util.List<ServerStrategy> serverStrategies;

    /**
     * <p>
     * A list of strategy recommendations for the server.
     * </p>
     * 
     * @return A list of strategy recommendations for the server.
     */

    public java.util.List<ServerStrategy> getServerStrategies() {
        return serverStrategies;
    }

    /**
     * <p>
     * A list of strategy recommendations for the server.
     * </p>
     * 
     * @param serverStrategies
     *        A list of strategy recommendations for the server.
     */

    public void setServerStrategies(java.util.Collection<ServerStrategy> serverStrategies) {
        if (serverStrategies == null) {
            this.serverStrategies = null;
            return;
        }

        this.serverStrategies = new java.util.ArrayList<ServerStrategy>(serverStrategies);
    }

    /**
     * <p>
     * A list of strategy recommendations for the server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerStrategies(java.util.Collection)} or {@link #withServerStrategies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param serverStrategies
     *        A list of strategy recommendations for the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServerStrategiesResult withServerStrategies(ServerStrategy... serverStrategies) {
        if (this.serverStrategies == null) {
            setServerStrategies(new java.util.ArrayList<ServerStrategy>(serverStrategies.length));
        }
        for (ServerStrategy ele : serverStrategies) {
            this.serverStrategies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strategy recommendations for the server.
     * </p>
     * 
     * @param serverStrategies
     *        A list of strategy recommendations for the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServerStrategiesResult withServerStrategies(java.util.Collection<ServerStrategy> serverStrategies) {
        setServerStrategies(serverStrategies);
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
        if (getServerStrategies() != null)
            sb.append("ServerStrategies: ").append(getServerStrategies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServerStrategiesResult == false)
            return false;
        GetServerStrategiesResult other = (GetServerStrategiesResult) obj;
        if (other.getServerStrategies() == null ^ this.getServerStrategies() == null)
            return false;
        if (other.getServerStrategies() != null && other.getServerStrategies().equals(this.getServerStrategies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerStrategies() == null) ? 0 : getServerStrategies().hashCode());
        return hashCode;
    }

    @Override
    public GetServerStrategiesResult clone() {
        try {
            return (GetServerStrategiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
