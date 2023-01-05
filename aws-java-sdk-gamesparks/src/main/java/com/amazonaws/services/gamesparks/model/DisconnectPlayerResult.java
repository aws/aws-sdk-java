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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DisconnectPlayer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisconnectPlayerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of the connection ids that could not be disconnected.
     * </p>
     */
    private java.util.List<String> disconnectFailures;
    /**
     * <p>
     * The list of the connection ids that were disconnected.
     * </p>
     */
    private java.util.List<String> disconnectSuccesses;

    /**
     * <p>
     * The list of the connection ids that could not be disconnected.
     * </p>
     * 
     * @return The list of the connection ids that could not be disconnected.
     */

    public java.util.List<String> getDisconnectFailures() {
        return disconnectFailures;
    }

    /**
     * <p>
     * The list of the connection ids that could not be disconnected.
     * </p>
     * 
     * @param disconnectFailures
     *        The list of the connection ids that could not be disconnected.
     */

    public void setDisconnectFailures(java.util.Collection<String> disconnectFailures) {
        if (disconnectFailures == null) {
            this.disconnectFailures = null;
            return;
        }

        this.disconnectFailures = new java.util.ArrayList<String>(disconnectFailures);
    }

    /**
     * <p>
     * The list of the connection ids that could not be disconnected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisconnectFailures(java.util.Collection)} or {@link #withDisconnectFailures(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param disconnectFailures
     *        The list of the connection ids that could not be disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisconnectPlayerResult withDisconnectFailures(String... disconnectFailures) {
        if (this.disconnectFailures == null) {
            setDisconnectFailures(new java.util.ArrayList<String>(disconnectFailures.length));
        }
        for (String ele : disconnectFailures) {
            this.disconnectFailures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the connection ids that could not be disconnected.
     * </p>
     * 
     * @param disconnectFailures
     *        The list of the connection ids that could not be disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisconnectPlayerResult withDisconnectFailures(java.util.Collection<String> disconnectFailures) {
        setDisconnectFailures(disconnectFailures);
        return this;
    }

    /**
     * <p>
     * The list of the connection ids that were disconnected.
     * </p>
     * 
     * @return The list of the connection ids that were disconnected.
     */

    public java.util.List<String> getDisconnectSuccesses() {
        return disconnectSuccesses;
    }

    /**
     * <p>
     * The list of the connection ids that were disconnected.
     * </p>
     * 
     * @param disconnectSuccesses
     *        The list of the connection ids that were disconnected.
     */

    public void setDisconnectSuccesses(java.util.Collection<String> disconnectSuccesses) {
        if (disconnectSuccesses == null) {
            this.disconnectSuccesses = null;
            return;
        }

        this.disconnectSuccesses = new java.util.ArrayList<String>(disconnectSuccesses);
    }

    /**
     * <p>
     * The list of the connection ids that were disconnected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisconnectSuccesses(java.util.Collection)} or {@link #withDisconnectSuccesses(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param disconnectSuccesses
     *        The list of the connection ids that were disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisconnectPlayerResult withDisconnectSuccesses(String... disconnectSuccesses) {
        if (this.disconnectSuccesses == null) {
            setDisconnectSuccesses(new java.util.ArrayList<String>(disconnectSuccesses.length));
        }
        for (String ele : disconnectSuccesses) {
            this.disconnectSuccesses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the connection ids that were disconnected.
     * </p>
     * 
     * @param disconnectSuccesses
     *        The list of the connection ids that were disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisconnectPlayerResult withDisconnectSuccesses(java.util.Collection<String> disconnectSuccesses) {
        setDisconnectSuccesses(disconnectSuccesses);
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
        if (getDisconnectFailures() != null)
            sb.append("DisconnectFailures: ").append(getDisconnectFailures()).append(",");
        if (getDisconnectSuccesses() != null)
            sb.append("DisconnectSuccesses: ").append(getDisconnectSuccesses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisconnectPlayerResult == false)
            return false;
        DisconnectPlayerResult other = (DisconnectPlayerResult) obj;
        if (other.getDisconnectFailures() == null ^ this.getDisconnectFailures() == null)
            return false;
        if (other.getDisconnectFailures() != null && other.getDisconnectFailures().equals(this.getDisconnectFailures()) == false)
            return false;
        if (other.getDisconnectSuccesses() == null ^ this.getDisconnectSuccesses() == null)
            return false;
        if (other.getDisconnectSuccesses() != null && other.getDisconnectSuccesses().equals(this.getDisconnectSuccesses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisconnectFailures() == null) ? 0 : getDisconnectFailures().hashCode());
        hashCode = prime * hashCode + ((getDisconnectSuccesses() == null) ? 0 : getDisconnectSuccesses().hashCode());
        return hashCode;
    }

    @Override
    public DisconnectPlayerResult clone() {
        try {
            return (DisconnectPlayerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
