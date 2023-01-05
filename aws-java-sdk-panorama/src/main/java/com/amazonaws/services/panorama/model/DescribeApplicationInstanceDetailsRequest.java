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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeApplicationInstanceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationInstanceDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application instance's ID.
     * </p>
     */
    private String applicationInstanceId;

    /**
     * <p>
     * The application instance's ID.
     * </p>
     * 
     * @param applicationInstanceId
     *        The application instance's ID.
     */

    public void setApplicationInstanceId(String applicationInstanceId) {
        this.applicationInstanceId = applicationInstanceId;
    }

    /**
     * <p>
     * The application instance's ID.
     * </p>
     * 
     * @return The application instance's ID.
     */

    public String getApplicationInstanceId() {
        return this.applicationInstanceId;
    }

    /**
     * <p>
     * The application instance's ID.
     * </p>
     * 
     * @param applicationInstanceId
     *        The application instance's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationInstanceDetailsRequest withApplicationInstanceId(String applicationInstanceId) {
        setApplicationInstanceId(applicationInstanceId);
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
        if (getApplicationInstanceId() != null)
            sb.append("ApplicationInstanceId: ").append(getApplicationInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationInstanceDetailsRequest == false)
            return false;
        DescribeApplicationInstanceDetailsRequest other = (DescribeApplicationInstanceDetailsRequest) obj;
        if (other.getApplicationInstanceId() == null ^ this.getApplicationInstanceId() == null)
            return false;
        if (other.getApplicationInstanceId() != null && other.getApplicationInstanceId().equals(this.getApplicationInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationInstanceId() == null) ? 0 : getApplicationInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationInstanceDetailsRequest clone() {
        return (DescribeApplicationInstanceDetailsRequest) super.clone();
    }

}
