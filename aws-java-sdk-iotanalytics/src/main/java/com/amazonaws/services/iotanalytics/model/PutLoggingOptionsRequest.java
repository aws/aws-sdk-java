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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/PutLoggingOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLoggingOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The new values of the AWS IoT Analytics logging options.
     * </p>
     */
    private LoggingOptions loggingOptions;

    /**
     * <p>
     * The new values of the AWS IoT Analytics logging options.
     * </p>
     * 
     * @param loggingOptions
     *        The new values of the AWS IoT Analytics logging options.
     */

    public void setLoggingOptions(LoggingOptions loggingOptions) {
        this.loggingOptions = loggingOptions;
    }

    /**
     * <p>
     * The new values of the AWS IoT Analytics logging options.
     * </p>
     * 
     * @return The new values of the AWS IoT Analytics logging options.
     */

    public LoggingOptions getLoggingOptions() {
        return this.loggingOptions;
    }

    /**
     * <p>
     * The new values of the AWS IoT Analytics logging options.
     * </p>
     * 
     * @param loggingOptions
     *        The new values of the AWS IoT Analytics logging options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLoggingOptionsRequest withLoggingOptions(LoggingOptions loggingOptions) {
        setLoggingOptions(loggingOptions);
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
        if (getLoggingOptions() != null)
            sb.append("LoggingOptions: ").append(getLoggingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLoggingOptionsRequest == false)
            return false;
        PutLoggingOptionsRequest other = (PutLoggingOptionsRequest) obj;
        if (other.getLoggingOptions() == null ^ this.getLoggingOptions() == null)
            return false;
        if (other.getLoggingOptions() != null && other.getLoggingOptions().equals(this.getLoggingOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoggingOptions() == null) ? 0 : getLoggingOptions().hashCode());
        return hashCode;
    }

    @Override
    public PutLoggingOptionsRequest clone() {
        return (PutLoggingOptionsRequest) super.clone();
    }

}
