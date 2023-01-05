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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetLoggingOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLoggingOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns information about log delivery to Amazon CloudWatch Logs.
     * </p>
     */
    private CloudWatchLogDeliveryOptions cloudWatchLogDelivery;

    /**
     * <p>
     * Returns information about log delivery to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchLogDelivery
     *        Returns information about log delivery to Amazon CloudWatch Logs.
     */

    public void setCloudWatchLogDelivery(CloudWatchLogDeliveryOptions cloudWatchLogDelivery) {
        this.cloudWatchLogDelivery = cloudWatchLogDelivery;
    }

    /**
     * <p>
     * Returns information about log delivery to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return Returns information about log delivery to Amazon CloudWatch Logs.
     */

    public CloudWatchLogDeliveryOptions getCloudWatchLogDelivery() {
        return this.cloudWatchLogDelivery;
    }

    /**
     * <p>
     * Returns information about log delivery to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchLogDelivery
     *        Returns information about log delivery to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoggingOptionsResult withCloudWatchLogDelivery(CloudWatchLogDeliveryOptions cloudWatchLogDelivery) {
        setCloudWatchLogDelivery(cloudWatchLogDelivery);
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
        if (getCloudWatchLogDelivery() != null)
            sb.append("CloudWatchLogDelivery: ").append(getCloudWatchLogDelivery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLoggingOptionsResult == false)
            return false;
        GetLoggingOptionsResult other = (GetLoggingOptionsResult) obj;
        if (other.getCloudWatchLogDelivery() == null ^ this.getCloudWatchLogDelivery() == null)
            return false;
        if (other.getCloudWatchLogDelivery() != null && other.getCloudWatchLogDelivery().equals(this.getCloudWatchLogDelivery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogDelivery() == null) ? 0 : getCloudWatchLogDelivery().hashCode());
        return hashCode;
    }

    @Override
    public GetLoggingOptionsResult clone() {
        try {
            return (GetLoggingOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
