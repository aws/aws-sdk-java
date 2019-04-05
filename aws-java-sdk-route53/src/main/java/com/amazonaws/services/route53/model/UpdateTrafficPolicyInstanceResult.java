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
 * A complex type that contains information about the resource record sets that Amazon Route 53 created based on a
 * specified traffic policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateTrafficPolicyInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrafficPolicyInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains settings for the updated traffic policy instance.
     * </p>
     */
    private TrafficPolicyInstance trafficPolicyInstance;

    /**
     * <p>
     * A complex type that contains settings for the updated traffic policy instance.
     * </p>
     * 
     * @param trafficPolicyInstance
     *        A complex type that contains settings for the updated traffic policy instance.
     */

    public void setTrafficPolicyInstance(TrafficPolicyInstance trafficPolicyInstance) {
        this.trafficPolicyInstance = trafficPolicyInstance;
    }

    /**
     * <p>
     * A complex type that contains settings for the updated traffic policy instance.
     * </p>
     * 
     * @return A complex type that contains settings for the updated traffic policy instance.
     */

    public TrafficPolicyInstance getTrafficPolicyInstance() {
        return this.trafficPolicyInstance;
    }

    /**
     * <p>
     * A complex type that contains settings for the updated traffic policy instance.
     * </p>
     * 
     * @param trafficPolicyInstance
     *        A complex type that contains settings for the updated traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyInstanceResult withTrafficPolicyInstance(TrafficPolicyInstance trafficPolicyInstance) {
        setTrafficPolicyInstance(trafficPolicyInstance);
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
            sb.append("TrafficPolicyInstance: ").append(getTrafficPolicyInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrafficPolicyInstanceResult == false)
            return false;
        UpdateTrafficPolicyInstanceResult other = (UpdateTrafficPolicyInstanceResult) obj;
        if (other.getTrafficPolicyInstance() == null ^ this.getTrafficPolicyInstance() == null)
            return false;
        if (other.getTrafficPolicyInstance() != null && other.getTrafficPolicyInstance().equals(this.getTrafficPolicyInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficPolicyInstance() == null) ? 0 : getTrafficPolicyInstance().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrafficPolicyInstanceResult clone() {
        try {
            return (UpdateTrafficPolicyInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
