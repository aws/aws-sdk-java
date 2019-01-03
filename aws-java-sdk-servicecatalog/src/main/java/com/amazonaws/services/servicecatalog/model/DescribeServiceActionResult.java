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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeServiceAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServiceActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Detailed information about the self-service action.
     * </p>
     */
    private ServiceActionDetail serviceActionDetail;

    /**
     * <p>
     * Detailed information about the self-service action.
     * </p>
     * 
     * @param serviceActionDetail
     *        Detailed information about the self-service action.
     */

    public void setServiceActionDetail(ServiceActionDetail serviceActionDetail) {
        this.serviceActionDetail = serviceActionDetail;
    }

    /**
     * <p>
     * Detailed information about the self-service action.
     * </p>
     * 
     * @return Detailed information about the self-service action.
     */

    public ServiceActionDetail getServiceActionDetail() {
        return this.serviceActionDetail;
    }

    /**
     * <p>
     * Detailed information about the self-service action.
     * </p>
     * 
     * @param serviceActionDetail
     *        Detailed information about the self-service action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceActionResult withServiceActionDetail(ServiceActionDetail serviceActionDetail) {
        setServiceActionDetail(serviceActionDetail);
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
        if (getServiceActionDetail() != null)
            sb.append("ServiceActionDetail: ").append(getServiceActionDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServiceActionResult == false)
            return false;
        DescribeServiceActionResult other = (DescribeServiceActionResult) obj;
        if (other.getServiceActionDetail() == null ^ this.getServiceActionDetail() == null)
            return false;
        if (other.getServiceActionDetail() != null && other.getServiceActionDetail().equals(this.getServiceActionDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceActionDetail() == null) ? 0 : getServiceActionDetail().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServiceActionResult clone() {
        try {
            return (DescribeServiceActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
