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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListRoutingControls"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRoutingControlsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of routing controls.
     * </p>
     */
    private java.util.List<RoutingControl> routingControls;

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @return The token that identifies which batch of results you want to see.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingControlsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of routing controls.
     * </p>
     * 
     * @return An array of routing controls.
     */

    public java.util.List<RoutingControl> getRoutingControls() {
        return routingControls;
    }

    /**
     * <p>
     * An array of routing controls.
     * </p>
     * 
     * @param routingControls
     *        An array of routing controls.
     */

    public void setRoutingControls(java.util.Collection<RoutingControl> routingControls) {
        if (routingControls == null) {
            this.routingControls = null;
            return;
        }

        this.routingControls = new java.util.ArrayList<RoutingControl>(routingControls);
    }

    /**
     * <p>
     * An array of routing controls.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingControls(java.util.Collection)} or {@link #withRoutingControls(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param routingControls
     *        An array of routing controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingControlsResult withRoutingControls(RoutingControl... routingControls) {
        if (this.routingControls == null) {
            setRoutingControls(new java.util.ArrayList<RoutingControl>(routingControls.length));
        }
        for (RoutingControl ele : routingControls) {
            this.routingControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of routing controls.
     * </p>
     * 
     * @param routingControls
     *        An array of routing controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingControlsResult withRoutingControls(java.util.Collection<RoutingControl> routingControls) {
        setRoutingControls(routingControls);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRoutingControls() != null)
            sb.append("RoutingControls: ").append(getRoutingControls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoutingControlsResult == false)
            return false;
        ListRoutingControlsResult other = (ListRoutingControlsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRoutingControls() == null ^ this.getRoutingControls() == null)
            return false;
        if (other.getRoutingControls() != null && other.getRoutingControls().equals(this.getRoutingControls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRoutingControls() == null) ? 0 : getRoutingControls().hashCode());
        return hashCode;
    }

    @Override
    public ListRoutingControlsResult clone() {
        try {
            return (ListRoutingControlsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
