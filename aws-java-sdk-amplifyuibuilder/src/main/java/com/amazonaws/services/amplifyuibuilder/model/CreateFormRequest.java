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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CreateForm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFormRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the Amplify app to associate with the form.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The unique client token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * Represents the configuration of the form to create.
     * </p>
     */
    private CreateFormData formToCreate;

    /**
     * <p>
     * The unique ID of the Amplify app to associate with the form.
     * </p>
     * 
     * @param appId
     *        The unique ID of the Amplify app to associate with the form.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID of the Amplify app to associate with the form.
     * </p>
     * 
     * @return The unique ID of the Amplify app to associate with the form.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID of the Amplify app to associate with the form.
     * </p>
     * 
     * @param appId
     *        The unique ID of the Amplify app to associate with the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The unique client token.
     * </p>
     * 
     * @param clientToken
     *        The unique client token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique client token.
     * </p>
     * 
     * @return The unique client token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique client token.
     * </p>
     * 
     * @param clientToken
     *        The unique client token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment that is a part of the Amplify app.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     * 
     * @return The name of the backend environment that is a part of the Amplify app.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment that is a part of the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * Represents the configuration of the form to create.
     * </p>
     * 
     * @param formToCreate
     *        Represents the configuration of the form to create.
     */

    public void setFormToCreate(CreateFormData formToCreate) {
        this.formToCreate = formToCreate;
    }

    /**
     * <p>
     * Represents the configuration of the form to create.
     * </p>
     * 
     * @return Represents the configuration of the form to create.
     */

    public CreateFormData getFormToCreate() {
        return this.formToCreate;
    }

    /**
     * <p>
     * Represents the configuration of the form to create.
     * </p>
     * 
     * @param formToCreate
     *        Represents the configuration of the form to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFormRequest withFormToCreate(CreateFormData formToCreate) {
        setFormToCreate(formToCreate);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getFormToCreate() != null)
            sb.append("FormToCreate: ").append(getFormToCreate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFormRequest == false)
            return false;
        CreateFormRequest other = (CreateFormRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getFormToCreate() == null ^ this.getFormToCreate() == null)
            return false;
        if (other.getFormToCreate() != null && other.getFormToCreate().equals(this.getFormToCreate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getFormToCreate() == null) ? 0 : getFormToCreate().hashCode());
        return hashCode;
    }

    @Override
    public CreateFormRequest clone() {
        return (CreateFormRequest) super.clone();
    }

}
