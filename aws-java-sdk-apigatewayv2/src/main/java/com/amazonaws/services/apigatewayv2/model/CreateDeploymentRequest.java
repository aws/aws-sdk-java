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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The description for the deployment resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the Stage resource for the Deployment resource to create.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @return The API identifier.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The description for the deployment resource.
     * </p>
     * 
     * @param description
     *        The description for the deployment resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the deployment resource.
     * </p>
     * 
     * @return The description for the deployment resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the deployment resource.
     * </p>
     * 
     * @param description
     *        The description for the deployment resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the Stage resource for the Deployment resource to create.
     * </p>
     * 
     * @param stageName
     *        The name of the Stage resource for the Deployment resource to create.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the Stage resource for the Deployment resource to create.
     * </p>
     * 
     * @return The name of the Stage resource for the Deployment resource to create.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the Stage resource for the Deployment resource to create.
     * </p>
     * 
     * @param stageName
     *        The name of the Stage resource for the Deployment resource to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withStageName(String stageName) {
        setStageName(stageName);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentRequest == false)
            return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentRequest clone() {
        return (CreateDeploymentRequest) super.clone();
    }

}
