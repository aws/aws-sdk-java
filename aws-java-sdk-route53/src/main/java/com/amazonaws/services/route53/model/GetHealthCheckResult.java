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
 * A complex type that contains the response to a <code>GetHealthCheck</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheck" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHealthCheckResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains information about one health check that is associated with the current AWS account.
     * </p>
     */
    private HealthCheck healthCheck;

    /**
     * <p>
     * A complex type that contains information about one health check that is associated with the current AWS account.
     * </p>
     * 
     * @param healthCheck
     *        A complex type that contains information about one health check that is associated with the current AWS
     *        account.
     */

    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * A complex type that contains information about one health check that is associated with the current AWS account.
     * </p>
     * 
     * @return A complex type that contains information about one health check that is associated with the current AWS
     *         account.
     */

    public HealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * A complex type that contains information about one health check that is associated with the current AWS account.
     * </p>
     * 
     * @param healthCheck
     *        A complex type that contains information about one health check that is associated with the current AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthCheckResult withHealthCheck(HealthCheck healthCheck) {
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

        if (obj instanceof GetHealthCheckResult == false)
            return false;
        GetHealthCheckResult other = (GetHealthCheckResult) obj;
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
    public GetHealthCheckResult clone() {
        try {
            return (GetHealthCheckResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
