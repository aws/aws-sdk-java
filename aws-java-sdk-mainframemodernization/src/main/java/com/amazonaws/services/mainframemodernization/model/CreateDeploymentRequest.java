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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application identifier.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The version of the application to deploy.
     * </p>
     */
    private Integer applicationVersion;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a deployment.
     * The service generates the clientToken when the API call is triggered. The token expires after one hour, so if you
     * retry the API within this timeframe with the same clientToken, you will get the same response. The service also
     * handles deleting the clientToken after it expires.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The identifier of the runtime environment where you want to deploy this application.
     * </p>
     */
    private String environmentId;

    /**
     * <p>
     * The application identifier.
     * </p>
     * 
     * @param applicationId
     *        The application identifier.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application identifier.
     * </p>
     * 
     * @return The application identifier.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application identifier.
     * </p>
     * 
     * @param applicationId
     *        The application identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The version of the application to deploy.
     * </p>
     * 
     * @param applicationVersion
     *        The version of the application to deploy.
     */

    public void setApplicationVersion(Integer applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    /**
     * <p>
     * The version of the application to deploy.
     * </p>
     * 
     * @return The version of the application to deploy.
     */

    public Integer getApplicationVersion() {
        return this.applicationVersion;
    }

    /**
     * <p>
     * The version of the application to deploy.
     * </p>
     * 
     * @param applicationVersion
     *        The version of the application to deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withApplicationVersion(Integer applicationVersion) {
        setApplicationVersion(applicationVersion);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a deployment.
     * The service generates the clientToken when the API call is triggered. The token expires after one hour, so if you
     * retry the API within this timeframe with the same clientToken, you will get the same response. The service also
     * handles deleting the clientToken after it expires.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a
     *        deployment. The service generates the clientToken when the API call is triggered. The token expires after
     *        one hour, so if you retry the API within this timeframe with the same clientToken, you will get the same
     *        response. The service also handles deleting the clientToken after it expires.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a deployment.
     * The service generates the clientToken when the API call is triggered. The token expires after one hour, so if you
     * retry the API within this timeframe with the same clientToken, you will get the same response. The service also
     * handles deleting the clientToken after it expires.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a
     *         deployment. The service generates the clientToken when the API call is triggered. The token expires after
     *         one hour, so if you retry the API within this timeframe with the same clientToken, you will get the same
     *         response. The service also handles deleting the clientToken after it expires.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a deployment.
     * The service generates the clientToken when the API call is triggered. The token expires after one hour, so if you
     * retry the API within this timeframe with the same clientToken, you will get the same response. The service also
     * handles deleting the clientToken after it expires.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a
     *        deployment. The service generates the clientToken when the API call is triggered. The token expires after
     *        one hour, so if you retry the API within this timeframe with the same clientToken, you will get the same
     *        response. The service also handles deleting the clientToken after it expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the runtime environment where you want to deploy this application.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the runtime environment where you want to deploy this application.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The identifier of the runtime environment where you want to deploy this application.
     * </p>
     * 
     * @return The identifier of the runtime environment where you want to deploy this application.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The identifier of the runtime environment where you want to deploy this application.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the runtime environment where you want to deploy this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
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
            sb.append("ApplicationVersion: ").append(getApplicationVersion()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId());
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
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getApplicationVersion() == null ^ this.getApplicationVersion() == null)
            return false;
        if (other.getApplicationVersion() != null && other.getApplicationVersion().equals(this.getApplicationVersion()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersion() == null) ? 0 : getApplicationVersion().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentRequest clone() {
        return (CreateDeploymentRequest) super.clone();
    }

}
