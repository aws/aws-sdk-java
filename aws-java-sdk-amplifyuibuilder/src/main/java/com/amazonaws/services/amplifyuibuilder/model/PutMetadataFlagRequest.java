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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/PutMetadataFlag" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMetadataFlagRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for the Amplify app.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The metadata information to store.
     * </p>
     */
    private PutMetadataFlagBody body;
    /**
     * <p>
     * The name of the backend environment that is part of the Amplify app.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The name of the feature associated with the metadata.
     * </p>
     */
    private String featureName;

    /**
     * <p>
     * The unique ID for the Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID for the Amplify app.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for the Amplify app.
     * </p>
     * 
     * @return The unique ID for the Amplify app.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID for the Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetadataFlagRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The metadata information to store.
     * </p>
     * 
     * @param body
     *        The metadata information to store.
     */

    public void setBody(PutMetadataFlagBody body) {
        this.body = body;
    }

    /**
     * <p>
     * The metadata information to store.
     * </p>
     * 
     * @return The metadata information to store.
     */

    public PutMetadataFlagBody getBody() {
        return this.body;
    }

    /**
     * <p>
     * The metadata information to store.
     * </p>
     * 
     * @param body
     *        The metadata information to store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetadataFlagRequest withBody(PutMetadataFlagBody body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The name of the backend environment that is part of the Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment that is part of the Amplify app.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the backend environment that is part of the Amplify app.
     * </p>
     * 
     * @return The name of the backend environment that is part of the Amplify app.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the backend environment that is part of the Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment that is part of the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetadataFlagRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The name of the feature associated with the metadata.
     * </p>
     * 
     * @param featureName
     *        The name of the feature associated with the metadata.
     */

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * <p>
     * The name of the feature associated with the metadata.
     * </p>
     * 
     * @return The name of the feature associated with the metadata.
     */

    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * <p>
     * The name of the feature associated with the metadata.
     * </p>
     * 
     * @param featureName
     *        The name of the feature associated with the metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetadataFlagRequest withFeatureName(String featureName) {
        setFeatureName(featureName);
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getFeatureName() != null)
            sb.append("FeatureName: ").append(getFeatureName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMetadataFlagRequest == false)
            return false;
        PutMetadataFlagRequest other = (PutMetadataFlagRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getFeatureName() == null ^ this.getFeatureName() == null)
            return false;
        if (other.getFeatureName() != null && other.getFeatureName().equals(this.getFeatureName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getFeatureName() == null) ? 0 : getFeatureName().hashCode());
        return hashCode;
    }

    @Override
    public PutMetadataFlagRequest clone() {
        return (PutMetadataFlagRequest) super.clone();
    }

}
