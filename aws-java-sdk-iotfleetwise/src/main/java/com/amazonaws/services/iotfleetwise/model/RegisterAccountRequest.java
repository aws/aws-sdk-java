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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/RegisterAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private TimestreamResources timestreamResources;
    /**
     * <p>
     * The IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream.
     * </p>
     */
    @Deprecated
    private IamResources iamResources;

    /**
     * @param timestreamResources
     */

    public void setTimestreamResources(TimestreamResources timestreamResources) {
        this.timestreamResources = timestreamResources;
    }

    /**
     * @return
     */

    public TimestreamResources getTimestreamResources() {
        return this.timestreamResources;
    }

    /**
     * @param timestreamResources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterAccountRequest withTimestreamResources(TimestreamResources timestreamResources) {
        setTimestreamResources(timestreamResources);
        return this;
    }

    /**
     * <p>
     * The IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream.
     * </p>
     * 
     * @param iamResources
     *        The IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream.
     */
    @Deprecated
    public void setIamResources(IamResources iamResources) {
        this.iamResources = iamResources;
    }

    /**
     * <p>
     * The IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream.
     * </p>
     * 
     * @return The IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream.
     */
    @Deprecated
    public IamResources getIamResources() {
        return this.iamResources;
    }

    /**
     * <p>
     * The IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream.
     * </p>
     * 
     * @param iamResources
     *        The IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public RegisterAccountRequest withIamResources(IamResources iamResources) {
        setIamResources(iamResources);
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
        if (getTimestreamResources() != null)
            sb.append("TimestreamResources: ").append(getTimestreamResources()).append(",");
        if (getIamResources() != null)
            sb.append("IamResources: ").append(getIamResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterAccountRequest == false)
            return false;
        RegisterAccountRequest other = (RegisterAccountRequest) obj;
        if (other.getTimestreamResources() == null ^ this.getTimestreamResources() == null)
            return false;
        if (other.getTimestreamResources() != null && other.getTimestreamResources().equals(this.getTimestreamResources()) == false)
            return false;
        if (other.getIamResources() == null ^ this.getIamResources() == null)
            return false;
        if (other.getIamResources() != null && other.getIamResources().equals(this.getIamResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestreamResources() == null) ? 0 : getTimestreamResources().hashCode());
        hashCode = prime * hashCode + ((getIamResources() == null) ? 0 : getIamResources().hashCode());
        return hashCode;
    }

    @Override
    public RegisterAccountRequest clone() {
        return (RegisterAccountRequest) super.clone();
    }

}
