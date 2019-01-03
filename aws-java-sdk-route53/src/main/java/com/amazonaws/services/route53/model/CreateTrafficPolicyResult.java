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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains the response information for the <code>CreateTrafficPolicy</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrafficPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains settings for the new traffic policy.
     * </p>
     */
    private TrafficPolicy trafficPolicy;
    /**
     * <p>
     * A unique URL that represents a new traffic policy.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A complex type that contains settings for the new traffic policy.
     * </p>
     * 
     * @param trafficPolicy
     *        A complex type that contains settings for the new traffic policy.
     */

    public void setTrafficPolicy(TrafficPolicy trafficPolicy) {
        this.trafficPolicy = trafficPolicy;
    }

    /**
     * <p>
     * A complex type that contains settings for the new traffic policy.
     * </p>
     * 
     * @return A complex type that contains settings for the new traffic policy.
     */

    public TrafficPolicy getTrafficPolicy() {
        return this.trafficPolicy;
    }

    /**
     * <p>
     * A complex type that contains settings for the new traffic policy.
     * </p>
     * 
     * @param trafficPolicy
     *        A complex type that contains settings for the new traffic policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyResult withTrafficPolicy(TrafficPolicy trafficPolicy) {
        setTrafficPolicy(trafficPolicy);
        return this;
    }

    /**
     * <p>
     * A unique URL that represents a new traffic policy.
     * </p>
     * 
     * @param location
     *        A unique URL that represents a new traffic policy.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * A unique URL that represents a new traffic policy.
     * </p>
     * 
     * @return A unique URL that represents a new traffic policy.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * A unique URL that represents a new traffic policy.
     * </p>
     * 
     * @param location
     *        A unique URL that represents a new traffic policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyResult withLocation(String location) {
        setLocation(location);
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
        if (getTrafficPolicy() != null)
            sb.append("TrafficPolicy: ").append(getTrafficPolicy()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrafficPolicyResult == false)
            return false;
        CreateTrafficPolicyResult other = (CreateTrafficPolicyResult) obj;
        if (other.getTrafficPolicy() == null ^ this.getTrafficPolicy() == null)
            return false;
        if (other.getTrafficPolicy() != null && other.getTrafficPolicy().equals(this.getTrafficPolicy()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficPolicy() == null) ? 0 : getTrafficPolicy().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrafficPolicyResult clone() {
        try {
            return (CreateTrafficPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
