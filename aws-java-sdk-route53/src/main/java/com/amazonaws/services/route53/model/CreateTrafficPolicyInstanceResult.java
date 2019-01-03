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
 * A complex type that contains the response information for the <code>CreateTrafficPolicyInstance</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicyInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrafficPolicyInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains settings for the new traffic policy instance.
     * </p>
     */
    private TrafficPolicyInstance trafficPolicyInstance;
    /**
     * <p>
     * A unique URL that represents a new traffic policy instance.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A complex type that contains settings for the new traffic policy instance.
     * </p>
     * 
     * @param trafficPolicyInstance
     *        A complex type that contains settings for the new traffic policy instance.
     */

    public void setTrafficPolicyInstance(TrafficPolicyInstance trafficPolicyInstance) {
        this.trafficPolicyInstance = trafficPolicyInstance;
    }

    /**
     * <p>
     * A complex type that contains settings for the new traffic policy instance.
     * </p>
     * 
     * @return A complex type that contains settings for the new traffic policy instance.
     */

    public TrafficPolicyInstance getTrafficPolicyInstance() {
        return this.trafficPolicyInstance;
    }

    /**
     * <p>
     * A complex type that contains settings for the new traffic policy instance.
     * </p>
     * 
     * @param trafficPolicyInstance
     *        A complex type that contains settings for the new traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyInstanceResult withTrafficPolicyInstance(TrafficPolicyInstance trafficPolicyInstance) {
        setTrafficPolicyInstance(trafficPolicyInstance);
        return this;
    }

    /**
     * <p>
     * A unique URL that represents a new traffic policy instance.
     * </p>
     * 
     * @param location
     *        A unique URL that represents a new traffic policy instance.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * A unique URL that represents a new traffic policy instance.
     * </p>
     * 
     * @return A unique URL that represents a new traffic policy instance.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * A unique URL that represents a new traffic policy instance.
     * </p>
     * 
     * @param location
     *        A unique URL that represents a new traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyInstanceResult withLocation(String location) {
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
        if (getTrafficPolicyInstance() != null)
            sb.append("TrafficPolicyInstance: ").append(getTrafficPolicyInstance()).append(",");
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

        if (obj instanceof CreateTrafficPolicyInstanceResult == false)
            return false;
        CreateTrafficPolicyInstanceResult other = (CreateTrafficPolicyInstanceResult) obj;
        if (other.getTrafficPolicyInstance() == null ^ this.getTrafficPolicyInstance() == null)
            return false;
        if (other.getTrafficPolicyInstance() != null && other.getTrafficPolicyInstance().equals(this.getTrafficPolicyInstance()) == false)
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

        hashCode = prime * hashCode + ((getTrafficPolicyInstance() == null) ? 0 : getTrafficPolicyInstance().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrafficPolicyInstanceResult clone() {
        try {
            return (CreateTrafficPolicyInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
