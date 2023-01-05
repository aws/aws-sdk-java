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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UpdateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the application you want to update.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The current version of the application to update.
     * </p>
     */
    private Integer currentApplicationVersion;
    /**
     * <p>
     * The application definition for this application. You can specify either inline JSON or an S3 bucket location.
     * </p>
     */
    private Definition definition;
    /**
     * <p>
     * The description of the application to update.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The unique identifier of the application you want to update.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application you want to update.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application you want to update.
     * </p>
     * 
     * @return The unique identifier of the application you want to update.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application you want to update.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The current version of the application to update.
     * </p>
     * 
     * @param currentApplicationVersion
     *        The current version of the application to update.
     */

    public void setCurrentApplicationVersion(Integer currentApplicationVersion) {
        this.currentApplicationVersion = currentApplicationVersion;
    }

    /**
     * <p>
     * The current version of the application to update.
     * </p>
     * 
     * @return The current version of the application to update.
     */

    public Integer getCurrentApplicationVersion() {
        return this.currentApplicationVersion;
    }

    /**
     * <p>
     * The current version of the application to update.
     * </p>
     * 
     * @param currentApplicationVersion
     *        The current version of the application to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withCurrentApplicationVersion(Integer currentApplicationVersion) {
        setCurrentApplicationVersion(currentApplicationVersion);
        return this;
    }

    /**
     * <p>
     * The application definition for this application. You can specify either inline JSON or an S3 bucket location.
     * </p>
     * 
     * @param definition
     *        The application definition for this application. You can specify either inline JSON or an S3 bucket
     *        location.
     */

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The application definition for this application. You can specify either inline JSON or an S3 bucket location.
     * </p>
     * 
     * @return The application definition for this application. You can specify either inline JSON or an S3 bucket
     *         location.
     */

    public Definition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The application definition for this application. You can specify either inline JSON or an S3 bucket location.
     * </p>
     * 
     * @param definition
     *        The application definition for this application. You can specify either inline JSON or an S3 bucket
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withDefinition(Definition definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The description of the application to update.
     * </p>
     * 
     * @param description
     *        The description of the application to update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application to update.
     * </p>
     * 
     * @return The description of the application to update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application to update.
     * </p>
     * 
     * @param description
     *        The description of the application to update.
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCurrentApplicationVersion() != null)
            sb.append("CurrentApplicationVersion: ").append(getCurrentApplicationVersion()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
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
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCurrentApplicationVersion() == null ^ this.getCurrentApplicationVersion() == null)
            return false;
        if (other.getCurrentApplicationVersion() != null && other.getCurrentApplicationVersion().equals(this.getCurrentApplicationVersion()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplicationVersion() == null) ? 0 : getCurrentApplicationVersion().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
