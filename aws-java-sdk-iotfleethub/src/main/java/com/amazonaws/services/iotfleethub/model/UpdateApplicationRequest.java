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
package com.amazonaws.services.iotfleethub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/UpdateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Id of the web application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The name of the web application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * An optional description of the web application.
     * </p>
     */
    private String applicationDescription;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The unique Id of the web application.
     * </p>
     * 
     * @param applicationId
     *        The unique Id of the web application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique Id of the web application.
     * </p>
     * 
     * @return The unique Id of the web application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique Id of the web application.
     * </p>
     * 
     * @param applicationId
     *        The unique Id of the web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The name of the web application.
     * </p>
     * 
     * @param applicationName
     *        The name of the web application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the web application.
     * </p>
     * 
     * @return The name of the web application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the web application.
     * </p>
     * 
     * @param applicationName
     *        The name of the web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * An optional description of the web application.
     * </p>
     * 
     * @param applicationDescription
     *        An optional description of the web application.
     */

    public void setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
    }

    /**
     * <p>
     * An optional description of the web application.
     * </p>
     * 
     * @return An optional description of the web application.
     */

    public String getApplicationDescription() {
        return this.applicationDescription;
    }

    /**
     * <p>
     * An optional description of the web application.
     * </p>
     * 
     * @param applicationDescription
     *        An optional description of the web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationDescription(String applicationDescription) {
        setApplicationDescription(applicationDescription);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @return A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *         reuse this client token if a new idempotent request is required.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getApplicationDescription() != null)
            sb.append("ApplicationDescription: ").append(getApplicationDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
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
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getApplicationDescription() == null ^ this.getApplicationDescription() == null)
            return false;
        if (other.getApplicationDescription() != null && other.getApplicationDescription().equals(this.getApplicationDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getApplicationDescription() == null) ? 0 : getApplicationDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
