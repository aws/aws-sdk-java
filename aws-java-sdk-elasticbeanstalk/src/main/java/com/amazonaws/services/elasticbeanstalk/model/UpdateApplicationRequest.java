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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to update an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application to update. If no such application is found, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * A new description for the application.
     * </p>
     * <p>
     * Default: If not specified, AWS Elastic Beanstalk does not update the description.
     * </p>
     */
    private String description;

    /**
     * Default constructor for UpdateApplicationRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public UpdateApplicationRequest() {
    }

    /**
     * Constructs a new UpdateApplicationRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The name of the application to update. If no such application is found, <code>UpdateApplication</code>
     *        returns an <code>InvalidParameterValue</code> error.
     */
    public UpdateApplicationRequest(String applicationName) {
        setApplicationName(applicationName);
    }

    /**
     * <p>
     * The name of the application to update. If no such application is found, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to update. If no such application is found, <code>UpdateApplication</code>
     *        returns an <code>InvalidParameterValue</code> error.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to update. If no such application is found, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return The name of the application to update. If no such application is found, <code>UpdateApplication</code>
     *         returns an <code>InvalidParameterValue</code> error.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application to update. If no such application is found, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to update. If no such application is found, <code>UpdateApplication</code>
     *        returns an <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * A new description for the application.
     * </p>
     * <p>
     * Default: If not specified, AWS Elastic Beanstalk does not update the description.
     * </p>
     * 
     * @param description
     *        A new description for the application.</p>
     *        <p>
     *        Default: If not specified, AWS Elastic Beanstalk does not update the description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the application.
     * </p>
     * <p>
     * Default: If not specified, AWS Elastic Beanstalk does not update the description.
     * </p>
     * 
     * @return A new description for the application.</p>
     *         <p>
     *         Default: If not specified, AWS Elastic Beanstalk does not update the description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description for the application.
     * </p>
     * <p>
     * Default: If not specified, AWS Elastic Beanstalk does not update the description.
     * </p>
     * 
     * @param description
     *        A new description for the application.</p>
     *        <p>
     *        Default: If not specified, AWS Elastic Beanstalk does not update the description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withDescription(String description) {
        setDescription(description);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
