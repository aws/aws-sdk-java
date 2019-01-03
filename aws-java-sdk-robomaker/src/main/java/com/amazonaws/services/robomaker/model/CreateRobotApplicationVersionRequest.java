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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobotApplicationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRobotApplicationVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application information for the robot application.
     * </p>
     */
    private String application;
    /**
     * <p>
     * The current revision id for the robot application. If you provide a value and it matches the latest revision ID,
     * a new version will be created.
     * </p>
     */
    private String currentRevisionId;

    /**
     * <p>
     * The application information for the robot application.
     * </p>
     * 
     * @param application
     *        The application information for the robot application.
     */

    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * <p>
     * The application information for the robot application.
     * </p>
     * 
     * @return The application information for the robot application.
     */

    public String getApplication() {
        return this.application;
    }

    /**
     * <p>
     * The application information for the robot application.
     * </p>
     * 
     * @param application
     *        The application information for the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotApplicationVersionRequest withApplication(String application) {
        setApplication(application);
        return this;
    }

    /**
     * <p>
     * The current revision id for the robot application. If you provide a value and it matches the latest revision ID,
     * a new version will be created.
     * </p>
     * 
     * @param currentRevisionId
     *        The current revision id for the robot application. If you provide a value and it matches the latest
     *        revision ID, a new version will be created.
     */

    public void setCurrentRevisionId(String currentRevisionId) {
        this.currentRevisionId = currentRevisionId;
    }

    /**
     * <p>
     * The current revision id for the robot application. If you provide a value and it matches the latest revision ID,
     * a new version will be created.
     * </p>
     * 
     * @return The current revision id for the robot application. If you provide a value and it matches the latest
     *         revision ID, a new version will be created.
     */

    public String getCurrentRevisionId() {
        return this.currentRevisionId;
    }

    /**
     * <p>
     * The current revision id for the robot application. If you provide a value and it matches the latest revision ID,
     * a new version will be created.
     * </p>
     * 
     * @param currentRevisionId
     *        The current revision id for the robot application. If you provide a value and it matches the latest
     *        revision ID, a new version will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotApplicationVersionRequest withCurrentRevisionId(String currentRevisionId) {
        setCurrentRevisionId(currentRevisionId);
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
        if (getApplication() != null)
            sb.append("Application: ").append(getApplication()).append(",");
        if (getCurrentRevisionId() != null)
            sb.append("CurrentRevisionId: ").append(getCurrentRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRobotApplicationVersionRequest == false)
            return false;
        CreateRobotApplicationVersionRequest other = (CreateRobotApplicationVersionRequest) obj;
        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null && other.getApplication().equals(this.getApplication()) == false)
            return false;
        if (other.getCurrentRevisionId() == null ^ this.getCurrentRevisionId() == null)
            return false;
        if (other.getCurrentRevisionId() != null && other.getCurrentRevisionId().equals(this.getCurrentRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplication() == null) ? 0 : getApplication().hashCode());
        hashCode = prime * hashCode + ((getCurrentRevisionId() == null) ? 0 : getCurrentRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateRobotApplicationVersionRequest clone() {
        return (CreateRobotApplicationVersionRequest) super.clone();
    }

}
