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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Application ID.
     * </p>
     */
    private String applicationID;
    /**
     * <p>
     * Application description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Application name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Application ID.
     * </p>
     * 
     * @param applicationID
     *        Application ID.
     */

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    /**
     * <p>
     * Application ID.
     * </p>
     * 
     * @return Application ID.
     */

    public String getApplicationID() {
        return this.applicationID;
    }

    /**
     * <p>
     * Application ID.
     * </p>
     * 
     * @param applicationID
     *        Application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationID(String applicationID) {
        setApplicationID(applicationID);
        return this;
    }

    /**
     * <p>
     * Application description.
     * </p>
     * 
     * @param description
     *        Application description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Application description.
     * </p>
     * 
     * @return Application description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Application description.
     * </p>
     * 
     * @param description
     *        Application description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Application name.
     * </p>
     * 
     * @param name
     *        Application name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Application name.
     * </p>
     * 
     * @return Application name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Application name.
     * </p>
     * 
     * @param name
     *        Application name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withName(String name) {
        setName(name);
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
        if (getApplicationID() != null)
            sb.append("ApplicationID: ").append(getApplicationID()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
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
        if (other.getApplicationID() == null ^ this.getApplicationID() == null)
            return false;
        if (other.getApplicationID() != null && other.getApplicationID().equals(this.getApplicationID()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationID() == null) ? 0 : getApplicationID().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
