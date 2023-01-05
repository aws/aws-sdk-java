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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetApplicationVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The specific version of the application.
     * </p>
     */
    private Integer applicationVersion;

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @return The unique identifier of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationVersionRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The specific version of the application.
     * </p>
     * 
     * @param applicationVersion
     *        The specific version of the application.
     */

    public void setApplicationVersion(Integer applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    /**
     * <p>
     * The specific version of the application.
     * </p>
     * 
     * @return The specific version of the application.
     */

    public Integer getApplicationVersion() {
        return this.applicationVersion;
    }

    /**
     * <p>
     * The specific version of the application.
     * </p>
     * 
     * @param applicationVersion
     *        The specific version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationVersionRequest withApplicationVersion(Integer applicationVersion) {
        setApplicationVersion(applicationVersion);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getApplicationVersion() != null)
            sb.append("ApplicationVersion: ").append(getApplicationVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationVersionRequest == false)
            return false;
        GetApplicationVersionRequest other = (GetApplicationVersionRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getApplicationVersion() == null ^ this.getApplicationVersion() == null)
            return false;
        if (other.getApplicationVersion() != null && other.getApplicationVersion().equals(this.getApplicationVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersion() == null) ? 0 : getApplicationVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationVersionRequest clone() {
        return (GetApplicationVersionRequest) super.clone();
    }

}
