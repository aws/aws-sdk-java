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
package com.amazonaws.services.schemas.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/StopDiscoverer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDiscovererResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     */
    private String discovererId;
    /**
     * <p>
     * The state of the discoverer.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     * 
     * @param discovererId
     *        The ID of the discoverer.
     */

    public void setDiscovererId(String discovererId) {
        this.discovererId = discovererId;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     * 
     * @return The ID of the discoverer.
     */

    public String getDiscovererId() {
        return this.discovererId;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     * 
     * @param discovererId
     *        The ID of the discoverer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDiscovererResult withDiscovererId(String discovererId) {
        setDiscovererId(discovererId);
        return this;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * 
     * @param state
     *        The state of the discoverer.
     * @see DiscovererState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * 
     * @return The state of the discoverer.
     * @see DiscovererState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * 
     * @param state
     *        The state of the discoverer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscovererState
     */

    public StopDiscovererResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * 
     * @param state
     *        The state of the discoverer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscovererState
     */

    public StopDiscovererResult withState(DiscovererState state) {
        this.state = state.toString();
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
        if (getDiscovererId() != null)
            sb.append("DiscovererId: ").append(getDiscovererId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDiscovererResult == false)
            return false;
        StopDiscovererResult other = (StopDiscovererResult) obj;
        if (other.getDiscovererId() == null ^ this.getDiscovererId() == null)
            return false;
        if (other.getDiscovererId() != null && other.getDiscovererId().equals(this.getDiscovererId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiscovererId() == null) ? 0 : getDiscovererId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public StopDiscovererResult clone() {
        try {
            return (StopDiscovererResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
