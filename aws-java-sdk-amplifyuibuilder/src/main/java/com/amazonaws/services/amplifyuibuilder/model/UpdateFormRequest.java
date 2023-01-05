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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateForm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFormRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for the Amplify app.
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
     * The name of the backend environment that is part of the Amplify app.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The unique ID for the form.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The request accepts the following data in JSON format.
     * </p>
     */
    private UpdateFormData updatedForm;

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

    public UpdateFormRequest withAppId(String appId) {
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

    public UpdateFormRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public UpdateFormRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The unique ID for the form.
     * </p>
     * 
     * @param id
     *        The unique ID for the form.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for the form.
     * </p>
     * 
     * @return The unique ID for the form.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID for the form.
     * </p>
     * 
     * @param id
     *        The unique ID for the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The request accepts the following data in JSON format.
     * </p>
     * 
     * @param updatedForm
     *        The request accepts the following data in JSON format.
     */

    public void setUpdatedForm(UpdateFormData updatedForm) {
        this.updatedForm = updatedForm;
    }

    /**
     * <p>
     * The request accepts the following data in JSON format.
     * </p>
     * 
     * @return The request accepts the following data in JSON format.
     */

    public UpdateFormData getUpdatedForm() {
        return this.updatedForm;
    }

    /**
     * <p>
     * The request accepts the following data in JSON format.
     * </p>
     * 
     * @param updatedForm
     *        The request accepts the following data in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFormRequest withUpdatedForm(UpdateFormData updatedForm) {
        setUpdatedForm(updatedForm);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getUpdatedForm() != null)
            sb.append("UpdatedForm: ").append(getUpdatedForm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFormRequest == false)
            return false;
        UpdateFormRequest other = (UpdateFormRequest) obj;
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
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getUpdatedForm() == null ^ this.getUpdatedForm() == null)
            return false;
        if (other.getUpdatedForm() != null && other.getUpdatedForm().equals(this.getUpdatedForm()) == false)
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
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedForm() == null) ? 0 : getUpdatedForm().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFormRequest clone() {
        return (UpdateFormRequest) super.clone();
    }

}
