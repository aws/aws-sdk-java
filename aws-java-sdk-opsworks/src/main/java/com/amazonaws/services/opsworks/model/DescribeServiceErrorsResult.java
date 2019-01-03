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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeServiceErrors</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeServiceErrors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServiceErrorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>ServiceError</code> objects that describe the specified service errors.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceError> serviceErrors;

    /**
     * <p>
     * An array of <code>ServiceError</code> objects that describe the specified service errors.
     * </p>
     * 
     * @return An array of <code>ServiceError</code> objects that describe the specified service errors.
     */

    public java.util.List<ServiceError> getServiceErrors() {
        if (serviceErrors == null) {
            serviceErrors = new com.amazonaws.internal.SdkInternalList<ServiceError>();
        }
        return serviceErrors;
    }

    /**
     * <p>
     * An array of <code>ServiceError</code> objects that describe the specified service errors.
     * </p>
     * 
     * @param serviceErrors
     *        An array of <code>ServiceError</code> objects that describe the specified service errors.
     */

    public void setServiceErrors(java.util.Collection<ServiceError> serviceErrors) {
        if (serviceErrors == null) {
            this.serviceErrors = null;
            return;
        }

        this.serviceErrors = new com.amazonaws.internal.SdkInternalList<ServiceError>(serviceErrors);
    }

    /**
     * <p>
     * An array of <code>ServiceError</code> objects that describe the specified service errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceErrors(java.util.Collection)} or {@link #withServiceErrors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param serviceErrors
     *        An array of <code>ServiceError</code> objects that describe the specified service errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceErrorsResult withServiceErrors(ServiceError... serviceErrors) {
        if (this.serviceErrors == null) {
            setServiceErrors(new com.amazonaws.internal.SdkInternalList<ServiceError>(serviceErrors.length));
        }
        for (ServiceError ele : serviceErrors) {
            this.serviceErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ServiceError</code> objects that describe the specified service errors.
     * </p>
     * 
     * @param serviceErrors
     *        An array of <code>ServiceError</code> objects that describe the specified service errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceErrorsResult withServiceErrors(java.util.Collection<ServiceError> serviceErrors) {
        setServiceErrors(serviceErrors);
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
        if (getServiceErrors() != null)
            sb.append("ServiceErrors: ").append(getServiceErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServiceErrorsResult == false)
            return false;
        DescribeServiceErrorsResult other = (DescribeServiceErrorsResult) obj;
        if (other.getServiceErrors() == null ^ this.getServiceErrors() == null)
            return false;
        if (other.getServiceErrors() != null && other.getServiceErrors().equals(this.getServiceErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceErrors() == null) ? 0 : getServiceErrors().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServiceErrorsResult clone() {
        try {
            return (DescribeServiceErrorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
