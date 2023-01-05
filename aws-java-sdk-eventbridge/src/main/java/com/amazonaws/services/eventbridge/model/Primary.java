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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The primary Region of the endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/Primary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Primary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the health check used by the endpoint to determine whether failover is triggered.
     * </p>
     */
    private String healthCheck;

    /**
     * <p>
     * The ARN of the health check used by the endpoint to determine whether failover is triggered.
     * </p>
     * 
     * @param healthCheck
     *        The ARN of the health check used by the endpoint to determine whether failover is triggered.
     */

    public void setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * The ARN of the health check used by the endpoint to determine whether failover is triggered.
     * </p>
     * 
     * @return The ARN of the health check used by the endpoint to determine whether failover is triggered.
     */

    public String getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * The ARN of the health check used by the endpoint to determine whether failover is triggered.
     * </p>
     * 
     * @param healthCheck
     *        The ARN of the health check used by the endpoint to determine whether failover is triggered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Primary withHealthCheck(String healthCheck) {
        setHealthCheck(healthCheck);
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
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Primary == false)
            return false;
        Primary other = (Primary) obj;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        return hashCode;
    }

    @Override
    public Primary clone() {
        try {
            return (Primary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.PrimaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
