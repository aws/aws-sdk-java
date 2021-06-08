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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of information about a AWS IoT Device Management web application.
 * </p>
 * <note>
 * <p>
 * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/ApplicationSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The URL of the web application.
     * </p>
     */
    private String applicationUrl;
    /**
     * <p>
     * The date (in Unix epoch time) when the web application was created.
     * </p>
     */
    private Long applicationCreationDate;
    /**
     * <p>
     * The date (in Unix epoch time) when the web application was last updated.
     * </p>
     */
    private Long applicationLastUpdateDate;
    /**
     * <p>
     * The current state of the web application.
     * </p>
     */
    private String applicationState;

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

    public ApplicationSummary withApplicationId(String applicationId) {
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

    public ApplicationSummary withApplicationName(String applicationName) {
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

    public ApplicationSummary withApplicationDescription(String applicationDescription) {
        setApplicationDescription(applicationDescription);
        return this;
    }

    /**
     * <p>
     * The URL of the web application.
     * </p>
     * 
     * @param applicationUrl
     *        The URL of the web application.
     */

    public void setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
    }

    /**
     * <p>
     * The URL of the web application.
     * </p>
     * 
     * @return The URL of the web application.
     */

    public String getApplicationUrl() {
        return this.applicationUrl;
    }

    /**
     * <p>
     * The URL of the web application.
     * </p>
     * 
     * @param applicationUrl
     *        The URL of the web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withApplicationUrl(String applicationUrl) {
        setApplicationUrl(applicationUrl);
        return this;
    }

    /**
     * <p>
     * The date (in Unix epoch time) when the web application was created.
     * </p>
     * 
     * @param applicationCreationDate
     *        The date (in Unix epoch time) when the web application was created.
     */

    public void setApplicationCreationDate(Long applicationCreationDate) {
        this.applicationCreationDate = applicationCreationDate;
    }

    /**
     * <p>
     * The date (in Unix epoch time) when the web application was created.
     * </p>
     * 
     * @return The date (in Unix epoch time) when the web application was created.
     */

    public Long getApplicationCreationDate() {
        return this.applicationCreationDate;
    }

    /**
     * <p>
     * The date (in Unix epoch time) when the web application was created.
     * </p>
     * 
     * @param applicationCreationDate
     *        The date (in Unix epoch time) when the web application was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withApplicationCreationDate(Long applicationCreationDate) {
        setApplicationCreationDate(applicationCreationDate);
        return this;
    }

    /**
     * <p>
     * The date (in Unix epoch time) when the web application was last updated.
     * </p>
     * 
     * @param applicationLastUpdateDate
     *        The date (in Unix epoch time) when the web application was last updated.
     */

    public void setApplicationLastUpdateDate(Long applicationLastUpdateDate) {
        this.applicationLastUpdateDate = applicationLastUpdateDate;
    }

    /**
     * <p>
     * The date (in Unix epoch time) when the web application was last updated.
     * </p>
     * 
     * @return The date (in Unix epoch time) when the web application was last updated.
     */

    public Long getApplicationLastUpdateDate() {
        return this.applicationLastUpdateDate;
    }

    /**
     * <p>
     * The date (in Unix epoch time) when the web application was last updated.
     * </p>
     * 
     * @param applicationLastUpdateDate
     *        The date (in Unix epoch time) when the web application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withApplicationLastUpdateDate(Long applicationLastUpdateDate) {
        setApplicationLastUpdateDate(applicationLastUpdateDate);
        return this;
    }

    /**
     * <p>
     * The current state of the web application.
     * </p>
     * 
     * @param applicationState
     *        The current state of the web application.
     * @see ApplicationState
     */

    public void setApplicationState(String applicationState) {
        this.applicationState = applicationState;
    }

    /**
     * <p>
     * The current state of the web application.
     * </p>
     * 
     * @return The current state of the web application.
     * @see ApplicationState
     */

    public String getApplicationState() {
        return this.applicationState;
    }

    /**
     * <p>
     * The current state of the web application.
     * </p>
     * 
     * @param applicationState
     *        The current state of the web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationState
     */

    public ApplicationSummary withApplicationState(String applicationState) {
        setApplicationState(applicationState);
        return this;
    }

    /**
     * <p>
     * The current state of the web application.
     * </p>
     * 
     * @param applicationState
     *        The current state of the web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationState
     */

    public ApplicationSummary withApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState.toString();
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
        if (getApplicationUrl() != null)
            sb.append("ApplicationUrl: ").append(getApplicationUrl()).append(",");
        if (getApplicationCreationDate() != null)
            sb.append("ApplicationCreationDate: ").append(getApplicationCreationDate()).append(",");
        if (getApplicationLastUpdateDate() != null)
            sb.append("ApplicationLastUpdateDate: ").append(getApplicationLastUpdateDate()).append(",");
        if (getApplicationState() != null)
            sb.append("ApplicationState: ").append(getApplicationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationSummary == false)
            return false;
        ApplicationSummary other = (ApplicationSummary) obj;
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
        if (other.getApplicationUrl() == null ^ this.getApplicationUrl() == null)
            return false;
        if (other.getApplicationUrl() != null && other.getApplicationUrl().equals(this.getApplicationUrl()) == false)
            return false;
        if (other.getApplicationCreationDate() == null ^ this.getApplicationCreationDate() == null)
            return false;
        if (other.getApplicationCreationDate() != null && other.getApplicationCreationDate().equals(this.getApplicationCreationDate()) == false)
            return false;
        if (other.getApplicationLastUpdateDate() == null ^ this.getApplicationLastUpdateDate() == null)
            return false;
        if (other.getApplicationLastUpdateDate() != null && other.getApplicationLastUpdateDate().equals(this.getApplicationLastUpdateDate()) == false)
            return false;
        if (other.getApplicationState() == null ^ this.getApplicationState() == null)
            return false;
        if (other.getApplicationState() != null && other.getApplicationState().equals(this.getApplicationState()) == false)
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
        hashCode = prime * hashCode + ((getApplicationUrl() == null) ? 0 : getApplicationUrl().hashCode());
        hashCode = prime * hashCode + ((getApplicationCreationDate() == null) ? 0 : getApplicationCreationDate().hashCode());
        hashCode = prime * hashCode + ((getApplicationLastUpdateDate() == null) ? 0 : getApplicationLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getApplicationState() == null) ? 0 : getApplicationState().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSummary clone() {
        try {
            return (ApplicationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleethub.model.transform.ApplicationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
