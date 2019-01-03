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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex data type that includes information about the failover criteria for an origin group, including the status
 * codes for which CloudFront will failover from the primary origin to the second origin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/OriginGroupFailoverCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginGroupFailoverCriteria implements Serializable, Cloneable {

    /**
     * <p>
     * The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the second
     * origin.
     * </p>
     */
    private StatusCodes statusCodes;

    /**
     * <p>
     * The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the second
     * origin.
     * </p>
     * 
     * @param statusCodes
     *        The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the
     *        second origin.
     */

    public void setStatusCodes(StatusCodes statusCodes) {
        this.statusCodes = statusCodes;
    }

    /**
     * <p>
     * The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the second
     * origin.
     * </p>
     * 
     * @return The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the
     *         second origin.
     */

    public StatusCodes getStatusCodes() {
        return this.statusCodes;
    }

    /**
     * <p>
     * The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the second
     * origin.
     * </p>
     * 
     * @param statusCodes
     *        The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the
     *        second origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginGroupFailoverCriteria withStatusCodes(StatusCodes statusCodes) {
        setStatusCodes(statusCodes);
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
        if (getStatusCodes() != null)
            sb.append("StatusCodes: ").append(getStatusCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginGroupFailoverCriteria == false)
            return false;
        OriginGroupFailoverCriteria other = (OriginGroupFailoverCriteria) obj;
        if (other.getStatusCodes() == null ^ this.getStatusCodes() == null)
            return false;
        if (other.getStatusCodes() != null && other.getStatusCodes().equals(this.getStatusCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCodes() == null) ? 0 : getStatusCodes().hashCode());
        return hashCode;
    }

    @Override
    public OriginGroupFailoverCriteria clone() {
        try {
            return (OriginGroupFailoverCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
