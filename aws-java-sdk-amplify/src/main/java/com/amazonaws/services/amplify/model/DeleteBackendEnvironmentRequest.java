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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request structure for the delete backend environment request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBackendEnvironment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBackendEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of an Amplify app.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The name of a backend environment of an Amplify app.
     * </p>
     */
    private String environmentName;

    /**
     * <p>
     * The unique ID of an Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID of an Amplify app.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID of an Amplify app.
     * </p>
     * 
     * @return The unique ID of an Amplify app.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID of an Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBackendEnvironmentRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The name of a backend environment of an Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of a backend environment of an Amplify app.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of a backend environment of an Amplify app.
     * </p>
     * 
     * @return The name of a backend environment of an Amplify app.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of a backend environment of an Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of a backend environment of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBackendEnvironmentRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBackendEnvironmentRequest == false)
            return false;
        DeleteBackendEnvironmentRequest other = (DeleteBackendEnvironmentRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBackendEnvironmentRequest clone() {
        return (DeleteBackendEnvironmentRequest) super.clone();
    }

}
