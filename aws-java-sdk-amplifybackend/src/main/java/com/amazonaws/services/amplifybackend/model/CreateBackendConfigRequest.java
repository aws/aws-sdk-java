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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request body for CreateBackendConfig.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackendConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The app ID.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The app ID for the backend manager.
     * </p>
     */
    private String backendManagerAppId;

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @return The app ID.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendConfigRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The app ID for the backend manager.
     * </p>
     * 
     * @param backendManagerAppId
     *        The app ID for the backend manager.
     */

    public void setBackendManagerAppId(String backendManagerAppId) {
        this.backendManagerAppId = backendManagerAppId;
    }

    /**
     * <p>
     * The app ID for the backend manager.
     * </p>
     * 
     * @return The app ID for the backend manager.
     */

    public String getBackendManagerAppId() {
        return this.backendManagerAppId;
    }

    /**
     * <p>
     * The app ID for the backend manager.
     * </p>
     * 
     * @param backendManagerAppId
     *        The app ID for the backend manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendConfigRequest withBackendManagerAppId(String backendManagerAppId) {
        setBackendManagerAppId(backendManagerAppId);
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
        if (getBackendManagerAppId() != null)
            sb.append("BackendManagerAppId: ").append(getBackendManagerAppId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackendConfigRequest == false)
            return false;
        CreateBackendConfigRequest other = (CreateBackendConfigRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBackendManagerAppId() == null ^ this.getBackendManagerAppId() == null)
            return false;
        if (other.getBackendManagerAppId() != null && other.getBackendManagerAppId().equals(this.getBackendManagerAppId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBackendManagerAppId() == null) ? 0 : getBackendManagerAppId().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackendConfigRequest clone() {
        return (CreateBackendConfigRequest) super.clone();
    }

}
