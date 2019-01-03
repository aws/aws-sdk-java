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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DescribeApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Displays verbose information about a Kinesis Data Analytics application, including the application's job plan.
     * </p>
     */
    private Boolean includeAdditionalDetails;

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Displays verbose information about a Kinesis Data Analytics application, including the application's job plan.
     * </p>
     * 
     * @param includeAdditionalDetails
     *        Displays verbose information about a Kinesis Data Analytics application, including the application's job
     *        plan.
     */

    public void setIncludeAdditionalDetails(Boolean includeAdditionalDetails) {
        this.includeAdditionalDetails = includeAdditionalDetails;
    }

    /**
     * <p>
     * Displays verbose information about a Kinesis Data Analytics application, including the application's job plan.
     * </p>
     * 
     * @return Displays verbose information about a Kinesis Data Analytics application, including the application's job
     *         plan.
     */

    public Boolean getIncludeAdditionalDetails() {
        return this.includeAdditionalDetails;
    }

    /**
     * <p>
     * Displays verbose information about a Kinesis Data Analytics application, including the application's job plan.
     * </p>
     * 
     * @param includeAdditionalDetails
     *        Displays verbose information about a Kinesis Data Analytics application, including the application's job
     *        plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationRequest withIncludeAdditionalDetails(Boolean includeAdditionalDetails) {
        setIncludeAdditionalDetails(includeAdditionalDetails);
        return this;
    }

    /**
     * <p>
     * Displays verbose information about a Kinesis Data Analytics application, including the application's job plan.
     * </p>
     * 
     * @return Displays verbose information about a Kinesis Data Analytics application, including the application's job
     *         plan.
     */

    public Boolean isIncludeAdditionalDetails() {
        return this.includeAdditionalDetails;
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getIncludeAdditionalDetails() != null)
            sb.append("IncludeAdditionalDetails: ").append(getIncludeAdditionalDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationRequest == false)
            return false;
        DescribeApplicationRequest other = (DescribeApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getIncludeAdditionalDetails() == null ^ this.getIncludeAdditionalDetails() == null)
            return false;
        if (other.getIncludeAdditionalDetails() != null && other.getIncludeAdditionalDetails().equals(this.getIncludeAdditionalDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getIncludeAdditionalDetails() == null) ? 0 : getIncludeAdditionalDetails().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationRequest clone() {
        return (DescribeApplicationRequest) super.clone();
    }

}
