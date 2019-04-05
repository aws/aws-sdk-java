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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an UpdateApplication operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/UpdateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The current name of the application you want to change.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The new name to give the application.
     * </p>
     */
    private String newApplicationName;

    /**
     * <p>
     * The current name of the application you want to change.
     * </p>
     * 
     * @param applicationName
     *        The current name of the application you want to change.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The current name of the application you want to change.
     * </p>
     * 
     * @return The current name of the application you want to change.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The current name of the application you want to change.
     * </p>
     * 
     * @param applicationName
     *        The current name of the application you want to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The new name to give the application.
     * </p>
     * 
     * @param newApplicationName
     *        The new name to give the application.
     */

    public void setNewApplicationName(String newApplicationName) {
        this.newApplicationName = newApplicationName;
    }

    /**
     * <p>
     * The new name to give the application.
     * </p>
     * 
     * @return The new name to give the application.
     */

    public String getNewApplicationName() {
        return this.newApplicationName;
    }

    /**
     * <p>
     * The new name to give the application.
     * </p>
     * 
     * @param newApplicationName
     *        The new name to give the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withNewApplicationName(String newApplicationName) {
        setNewApplicationName(newApplicationName);
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
        if (getNewApplicationName() != null)
            sb.append("NewApplicationName: ").append(getNewApplicationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationRequest == false)
            return false;
        UpdateApplicationRequest other = (UpdateApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getNewApplicationName() == null ^ this.getNewApplicationName() == null)
            return false;
        if (other.getNewApplicationName() != null && other.getNewApplicationName().equals(this.getNewApplicationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getNewApplicationName() == null) ? 0 : getNewApplicationName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
