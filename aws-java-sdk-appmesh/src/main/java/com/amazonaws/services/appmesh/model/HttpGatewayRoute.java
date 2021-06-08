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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents an HTTP gateway route.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/HttpGatewayRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpGatewayRoute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents the action to take if a match is determined.
     * </p>
     */
    private HttpGatewayRouteAction action;
    /**
     * <p>
     * An object that represents the criteria for determining a request match.
     * </p>
     */
    private HttpGatewayRouteMatch match;

    /**
     * <p>
     * An object that represents the action to take if a match is determined.
     * </p>
     * 
     * @param action
     *        An object that represents the action to take if a match is determined.
     */

    public void setAction(HttpGatewayRouteAction action) {
        this.action = action;
    }

    /**
     * <p>
     * An object that represents the action to take if a match is determined.
     * </p>
     * 
     * @return An object that represents the action to take if a match is determined.
     */

    public HttpGatewayRouteAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * An object that represents the action to take if a match is determined.
     * </p>
     * 
     * @param action
     *        An object that represents the action to take if a match is determined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRoute withAction(HttpGatewayRouteAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * An object that represents the criteria for determining a request match.
     * </p>
     * 
     * @param match
     *        An object that represents the criteria for determining a request match.
     */

    public void setMatch(HttpGatewayRouteMatch match) {
        this.match = match;
    }

    /**
     * <p>
     * An object that represents the criteria for determining a request match.
     * </p>
     * 
     * @return An object that represents the criteria for determining a request match.
     */

    public HttpGatewayRouteMatch getMatch() {
        return this.match;
    }

    /**
     * <p>
     * An object that represents the criteria for determining a request match.
     * </p>
     * 
     * @param match
     *        An object that represents the criteria for determining a request match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRoute withMatch(HttpGatewayRouteMatch match) {
        setMatch(match);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getMatch() != null)
            sb.append("Match: ").append(getMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpGatewayRoute == false)
            return false;
        HttpGatewayRoute other = (HttpGatewayRoute) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        return hashCode;
    }

    @Override
    public HttpGatewayRoute clone() {
        try {
            return (HttpGatewayRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.HttpGatewayRouteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
