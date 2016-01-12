/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>>
 * A complex type that contains information about the request to create a health
 * check.
 * </p>
 */
public class CreateHealthCheckRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHealthCheck</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you create a health check.
     * <code>CallerReference</code> can be any unique string; you might choose
     * to use a string that identifies your project.
     * </p>
     * <p>
     * Valid characters are any Unicode code points that are legal in an XML 1.0
     * document. The UTF-8 encoding of the value must be less than 128 bytes.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * A complex type that contains health check configuration.
     * </p>
     */
    private HealthCheckConfig healthCheckConfig;

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHealthCheck</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you create a health check.
     * <code>CallerReference</code> can be any unique string; you might choose
     * to use a string that identifies your project.
     * </p>
     * <p>
     * Valid characters are any Unicode code points that are legal in an XML 1.0
     * document. The UTF-8 encoding of the value must be less than 128 bytes.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request and that allows failed
     *        <code>CreateHealthCheck</code> requests to be retried without the
     *        risk of executing the operation twice. You must use a unique
     *        <code>CallerReference</code> string every time you create a health
     *        check. <code>CallerReference</code> can be any unique string; you
     *        might choose to use a string that identifies your project.</p>
     *        <p>
     *        Valid characters are any Unicode code points that are legal in an
     *        XML 1.0 document. The UTF-8 encoding of the value must be less
     *        than 128 bytes.
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHealthCheck</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you create a health check.
     * <code>CallerReference</code> can be any unique string; you might choose
     * to use a string that identifies your project.
     * </p>
     * <p>
     * Valid characters are any Unicode code points that are legal in an XML 1.0
     * document. The UTF-8 encoding of the value must be less than 128 bytes.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows
     *         failed <code>CreateHealthCheck</code> requests to be retried
     *         without the risk of executing the operation twice. You must use a
     *         unique <code>CallerReference</code> string every time you create
     *         a health check. <code>CallerReference</code> can be any unique
     *         string; you might choose to use a string that identifies your
     *         project.</p>
     *         <p>
     *         Valid characters are any Unicode code points that are legal in an
     *         XML 1.0 document. The UTF-8 encoding of the value must be less
     *         than 128 bytes.
     */
    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHealthCheck</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you create a health check.
     * <code>CallerReference</code> can be any unique string; you might choose
     * to use a string that identifies your project.
     * </p>
     * <p>
     * Valid characters are any Unicode code points that are legal in an XML 1.0
     * document. The UTF-8 encoding of the value must be less than 128 bytes.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request and that allows failed
     *        <code>CreateHealthCheck</code> requests to be retried without the
     *        risk of executing the operation twice. You must use a unique
     *        <code>CallerReference</code> string every time you create a health
     *        check. <code>CallerReference</code> can be any unique string; you
     *        might choose to use a string that identifies your project.</p>
     *        <p>
     *        Valid characters are any Unicode code points that are legal in an
     *        XML 1.0 document. The UTF-8 encoding of the value must be less
     *        than 128 bytes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateHealthCheckRequest withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * A complex type that contains health check configuration.
     * </p>
     * 
     * @param healthCheckConfig
     *        A complex type that contains health check configuration.
     */
    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * <p>
     * A complex type that contains health check configuration.
     * </p>
     * 
     * @return A complex type that contains health check configuration.
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * <p>
     * A complex type that contains health check configuration.
     * </p>
     * 
     * @param healthCheckConfig
     *        A complex type that contains health check configuration.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateHealthCheckRequest withHealthCheckConfig(
            HealthCheckConfig healthCheckConfig) {
        setHealthCheckConfig(healthCheckConfig);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: " + getHealthCheckConfig());
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
        if (other.getCallerReference() == null
                ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getHealthCheckConfig() == null
                ^ this.getHealthCheckConfig() == null)
            return false;
        if (other.getHealthCheckConfig() != null
                && other.getHealthCheckConfig().equals(
                        this.getHealthCheckConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckConfig() == null) ? 0
                        : getHealthCheckConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateHealthCheckRequest clone() {
        return (CreateHealthCheckRequest) super.clone();
    }
}