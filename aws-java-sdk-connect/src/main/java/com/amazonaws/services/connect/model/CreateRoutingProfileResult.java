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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRoutingProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoutingProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing profile.
     * </p>
     */
    private String routingProfileArn;
    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     */
    private String routingProfileId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing profile.
     * </p>
     * 
     * @param routingProfileArn
     *        The Amazon Resource Name (ARN) of the routing profile.
     */

    public void setRoutingProfileArn(String routingProfileArn) {
        this.routingProfileArn = routingProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the routing profile.
     */

    public String getRoutingProfileArn() {
        return this.routingProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing profile.
     * </p>
     * 
     * @param routingProfileArn
     *        The Amazon Resource Name (ARN) of the routing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingProfileResult withRoutingProfileArn(String routingProfileArn) {
        setRoutingProfileArn(routingProfileArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     * 
     * @param routingProfileId
     *        The identifier of the routing profile.
     */

    public void setRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     * 
     * @return The identifier of the routing profile.
     */

    public String getRoutingProfileId() {
        return this.routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     * 
     * @param routingProfileId
     *        The identifier of the routing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoutingProfileResult withRoutingProfileId(String routingProfileId) {
        setRoutingProfileId(routingProfileId);
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
        if (getRoutingProfileArn() != null)
            sb.append("RoutingProfileArn: ").append(getRoutingProfileArn()).append(",");
        if (getRoutingProfileId() != null)
            sb.append("RoutingProfileId: ").append(getRoutingProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoutingProfileResult == false)
            return false;
        CreateRoutingProfileResult other = (CreateRoutingProfileResult) obj;
        if (other.getRoutingProfileArn() == null ^ this.getRoutingProfileArn() == null)
            return false;
        if (other.getRoutingProfileArn() != null && other.getRoutingProfileArn().equals(this.getRoutingProfileArn()) == false)
            return false;
        if (other.getRoutingProfileId() == null ^ this.getRoutingProfileId() == null)
            return false;
        if (other.getRoutingProfileId() != null && other.getRoutingProfileId().equals(this.getRoutingProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoutingProfileArn() == null) ? 0 : getRoutingProfileArn().hashCode());
        hashCode = prime * hashCode + ((getRoutingProfileId() == null) ? 0 : getRoutingProfileId().hashCode());
        return hashCode;
    }

    @Override
    public CreateRoutingProfileResult clone() {
        try {
            return (CreateRoutingProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
