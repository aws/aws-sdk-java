/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DescribeApplicationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application for which you want to get the version description.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The ID of the application version for which you want to get the description.
     * </p>
     */
    private Long applicationVersionId;

    /**
     * <p>
     * The name of the application for which you want to get the version description.
     * </p>
     * 
     * @param applicationName
     *        The name of the application for which you want to get the version description.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application for which you want to get the version description.
     * </p>
     * 
     * @return The name of the application for which you want to get the version description.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application for which you want to get the version description.
     * </p>
     * 
     * @param applicationName
     *        The name of the application for which you want to get the version description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationVersionRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The ID of the application version for which you want to get the description.
     * </p>
     * 
     * @param applicationVersionId
     *        The ID of the application version for which you want to get the description.
     */

    public void setApplicationVersionId(Long applicationVersionId) {
        this.applicationVersionId = applicationVersionId;
    }

    /**
     * <p>
     * The ID of the application version for which you want to get the description.
     * </p>
     * 
     * @return The ID of the application version for which you want to get the description.
     */

    public Long getApplicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * <p>
     * The ID of the application version for which you want to get the description.
     * </p>
     * 
     * @param applicationVersionId
     *        The ID of the application version for which you want to get the description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationVersionRequest withApplicationVersionId(Long applicationVersionId) {
        setApplicationVersionId(applicationVersionId);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getApplicationVersionId() != null)
            sb.append("ApplicationVersionId: ").append(getApplicationVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationVersionRequest == false)
            return false;
        DescribeApplicationVersionRequest other = (DescribeApplicationVersionRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getApplicationVersionId() == null ^ this.getApplicationVersionId() == null)
            return false;
        if (other.getApplicationVersionId() != null && other.getApplicationVersionId().equals(this.getApplicationVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionId() == null) ? 0 : getApplicationVersionId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationVersionRequest clone() {
        return (DescribeApplicationVersionRequest) super.clone();
    }

}
