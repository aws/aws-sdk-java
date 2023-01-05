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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the basic information about a form.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FormSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for the app associated with the form summary.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The form's data source type.
     * </p>
     */
    private FormDataTypeConfig dataType;
    /**
     * <p>
     * The name of the backend environment that is part of the Amplify app.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The type of operation to perform on the form.
     * </p>
     */
    private String formActionType;
    /**
     * <p>
     * The ID of the form.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the form.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The unique ID for the app associated with the form summary.
     * </p>
     * 
     * @param appId
     *        The unique ID for the app associated with the form summary.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for the app associated with the form summary.
     * </p>
     * 
     * @return The unique ID for the app associated with the form summary.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID for the app associated with the form summary.
     * </p>
     * 
     * @param appId
     *        The unique ID for the app associated with the form summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormSummary withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The form's data source type.
     * </p>
     * 
     * @param dataType
     *        The form's data source type.
     */

    public void setDataType(FormDataTypeConfig dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The form's data source type.
     * </p>
     * 
     * @return The form's data source type.
     */

    public FormDataTypeConfig getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The form's data source type.
     * </p>
     * 
     * @param dataType
     *        The form's data source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormSummary withDataType(FormDataTypeConfig dataType) {
        setDataType(dataType);
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

    public FormSummary withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The type of operation to perform on the form.
     * </p>
     * 
     * @param formActionType
     *        The type of operation to perform on the form.
     * @see FormActionType
     */

    public void setFormActionType(String formActionType) {
        this.formActionType = formActionType;
    }

    /**
     * <p>
     * The type of operation to perform on the form.
     * </p>
     * 
     * @return The type of operation to perform on the form.
     * @see FormActionType
     */

    public String getFormActionType() {
        return this.formActionType;
    }

    /**
     * <p>
     * The type of operation to perform on the form.
     * </p>
     * 
     * @param formActionType
     *        The type of operation to perform on the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormActionType
     */

    public FormSummary withFormActionType(String formActionType) {
        setFormActionType(formActionType);
        return this;
    }

    /**
     * <p>
     * The type of operation to perform on the form.
     * </p>
     * 
     * @param formActionType
     *        The type of operation to perform on the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormActionType
     */

    public FormSummary withFormActionType(FormActionType formActionType) {
        this.formActionType = formActionType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the form.
     * </p>
     * 
     * @param id
     *        The ID of the form.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the form.
     * </p>
     * 
     * @return The ID of the form.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the form.
     * </p>
     * 
     * @param id
     *        The ID of the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the form.
     * </p>
     * 
     * @param name
     *        The name of the form.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the form.
     * </p>
     * 
     * @return The name of the form.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the form.
     * </p>
     * 
     * @param name
     *        The name of the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormSummary withName(String name) {
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getFormActionType() != null)
            sb.append("FormActionType: ").append(getFormActionType()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof FormSummary == false)
            return false;
        FormSummary other = (FormSummary) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getFormActionType() == null ^ this.getFormActionType() == null)
            return false;
        if (other.getFormActionType() != null && other.getFormActionType().equals(this.getFormActionType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getFormActionType() == null) ? 0 : getFormActionType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public FormSummary clone() {
        try {
            return (FormSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FormSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
