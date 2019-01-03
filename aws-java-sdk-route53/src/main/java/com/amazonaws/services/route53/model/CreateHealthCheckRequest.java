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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains the health check request information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateHealthCheck" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHealthCheckRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string that identifies the request and that allows you to retry a failed <code>CreateHealthCheck</code>
     * request without the risk of creating two identical health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> and settings as a
     * previous request, and if the health check doesn't exist, Amazon Route 53 creates the health check. If the health
     * check does exist, Route 53 returns the settings for the existing health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as a deleted
     * health check, regardless of the settings, Route 53 returns a <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as an existing
     * health check but with different settings, Route 53 returns a <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with a unique <code>CallerReference</code> but settings
     * identical to an existing health check, Route 53 creates the health check.
     * </p>
     * </li>
     * </ul>
     */
    private String callerReference;
    /**
     * <p>
     * A complex type that contains settings for a new health check.
     * </p>
     */
    private HealthCheckConfig healthCheckConfig;

    /**
     * <p>
     * A unique string that identifies the request and that allows you to retry a failed <code>CreateHealthCheck</code>
     * request without the risk of creating two identical health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> and settings as a
     * previous request, and if the health check doesn't exist, Amazon Route 53 creates the health check. If the health
     * check does exist, Route 53 returns the settings for the existing health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as a deleted
     * health check, regardless of the settings, Route 53 returns a <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as an existing
     * health check but with different settings, Route 53 returns a <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with a unique <code>CallerReference</code> but settings
     * identical to an existing health check, Route 53 creates the health check.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callerReference
     *        A unique string that identifies the request and that allows you to retry a failed
     *        <code>CreateHealthCheck</code> request without the risk of creating two identical health checks:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> and
     *        settings as a previous request, and if the health check doesn't exist, Amazon Route 53 creates the health
     *        check. If the health check does exist, Route 53 returns the settings for the existing health check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as a
     *        deleted health check, regardless of the settings, Route 53 returns a <code>HealthCheckAlreadyExists</code>
     *        error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as an
     *        existing health check but with different settings, Route 53 returns a
     *        <code>HealthCheckAlreadyExists</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send a <code>CreateHealthCheck</code> request with a unique <code>CallerReference</code> but
     *        settings identical to an existing health check, Route 53 creates the health check.
     *        </p>
     *        </li>
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows you to retry a failed <code>CreateHealthCheck</code>
     * request without the risk of creating two identical health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> and settings as a
     * previous request, and if the health check doesn't exist, Amazon Route 53 creates the health check. If the health
     * check does exist, Route 53 returns the settings for the existing health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as a deleted
     * health check, regardless of the settings, Route 53 returns a <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as an existing
     * health check but with different settings, Route 53 returns a <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with a unique <code>CallerReference</code> but settings
     * identical to an existing health check, Route 53 creates the health check.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A unique string that identifies the request and that allows you to retry a failed
     *         <code>CreateHealthCheck</code> request without the risk of creating two identical health checks:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> and
     *         settings as a previous request, and if the health check doesn't exist, Amazon Route 53 creates the health
     *         check. If the health check does exist, Route 53 returns the settings for the existing health check.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as a
     *         deleted health check, regardless of the settings, Route 53 returns a
     *         <code>HealthCheckAlreadyExists</code> error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as an
     *         existing health check but with different settings, Route 53 returns a
     *         <code>HealthCheckAlreadyExists</code> error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you send a <code>CreateHealthCheck</code> request with a unique <code>CallerReference</code> but
     *         settings identical to an existing health check, Route 53 creates the health check.
     *         </p>
     *         </li>
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows you to retry a failed <code>CreateHealthCheck</code>
     * request without the risk of creating two identical health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> and settings as a
     * previous request, and if the health check doesn't exist, Amazon Route 53 creates the health check. If the health
     * check does exist, Route 53 returns the settings for the existing health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as a deleted
     * health check, regardless of the settings, Route 53 returns a <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as an existing
     * health check but with different settings, Route 53 returns a <code>HealthCheckAlreadyExists</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a <code>CreateHealthCheck</code> request with a unique <code>CallerReference</code> but settings
     * identical to an existing health check, Route 53 creates the health check.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callerReference
     *        A unique string that identifies the request and that allows you to retry a failed
     *        <code>CreateHealthCheck</code> request without the risk of creating two identical health checks:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> and
     *        settings as a previous request, and if the health check doesn't exist, Amazon Route 53 creates the health
     *        check. If the health check does exist, Route 53 returns the settings for the existing health check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as a
     *        deleted health check, regardless of the settings, Route 53 returns a <code>HealthCheckAlreadyExists</code>
     *        error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send a <code>CreateHealthCheck</code> request with the same <code>CallerReference</code> as an
     *        existing health check but with different settings, Route 53 returns a
     *        <code>HealthCheckAlreadyExists</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you send a <code>CreateHealthCheck</code> request with a unique <code>CallerReference</code> but
     *        settings identical to an existing health check, Route 53 creates the health check.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHealthCheckRequest withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * A complex type that contains settings for a new health check.
     * </p>
     * 
     * @param healthCheckConfig
     *        A complex type that contains settings for a new health check.
     */

    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * <p>
     * A complex type that contains settings for a new health check.
     * </p>
     * 
     * @return A complex type that contains settings for a new health check.
     */

    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * <p>
     * A complex type that contains settings for a new health check.
     * </p>
     * 
     * @param healthCheckConfig
     *        A complex type that contains settings for a new health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHealthCheckRequest withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        setHealthCheckConfig(healthCheckConfig);
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
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference()).append(",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: ").append(getHealthCheckConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHealthCheckRequest == false)
            return false;
        CreateHealthCheckRequest other = (CreateHealthCheckRequest) obj;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getHealthCheckConfig() == null ^ this.getHealthCheckConfig() == null)
            return false;
        if (other.getHealthCheckConfig() != null && other.getHealthCheckConfig().equals(this.getHealthCheckConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckConfig() == null) ? 0 : getHealthCheckConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateHealthCheckRequest clone() {
        return (CreateHealthCheckRequest) super.clone();
    }

}
