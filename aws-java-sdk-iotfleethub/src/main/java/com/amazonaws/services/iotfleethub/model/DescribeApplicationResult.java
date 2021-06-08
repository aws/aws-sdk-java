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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/DescribeApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Id of the web application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ARN of the web application.
     * </p>
     */
    private String applicationArn;
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
     * The current state of the web application.
     * </p>
     */
    private String applicationState;
    /**
     * <p>
     * The date (in Unix epoch time) when the application was created.
     * </p>
     */
    private Long applicationCreationDate;
    /**
     * <p>
     * The date (in Unix epoch time) when the application was last updated.
     * </p>
     */
    private Long applicationLastUpdateDate;
    /**
     * <p>
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Id of the single sign-on client that you use to authenticate and authorize users on the web application.
     * </p>
     */
    private String ssoClientId;
    /**
     * <p>
     * A message indicating why the <code>DescribeApplication</code> API failed.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * A set of key/value pairs that you can use to manage the web application resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public DescribeApplicationResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ARN of the web application.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the web application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The ARN of the web application.
     * </p>
     * 
     * @return The ARN of the web application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The ARN of the web application.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
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

    public DescribeApplicationResult withApplicationName(String applicationName) {
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

    public DescribeApplicationResult withApplicationDescription(String applicationDescription) {
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

    public DescribeApplicationResult withApplicationUrl(String applicationUrl) {
        setApplicationUrl(applicationUrl);
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

    public DescribeApplicationResult withApplicationState(String applicationState) {
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

    public DescribeApplicationResult withApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState.toString();
        return this;
    }

    /**
     * <p>
     * The date (in Unix epoch time) when the application was created.
     * </p>
     * 
     * @param applicationCreationDate
     *        The date (in Unix epoch time) when the application was created.
     */

    public void setApplicationCreationDate(Long applicationCreationDate) {
        this.applicationCreationDate = applicationCreationDate;
    }

    /**
     * <p>
     * The date (in Unix epoch time) when the application was created.
     * </p>
     * 
     * @return The date (in Unix epoch time) when the application was created.
     */

    public Long getApplicationCreationDate() {
        return this.applicationCreationDate;
    }

    /**
     * <p>
     * The date (in Unix epoch time) when the application was created.
     * </p>
     * 
     * @param applicationCreationDate
     *        The date (in Unix epoch time) when the application was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withApplicationCreationDate(Long applicationCreationDate) {
        setApplicationCreationDate(applicationCreationDate);
        return this;
    }

    /**
     * <p>
     * The date (in Unix epoch time) when the application was last updated.
     * </p>
     * 
     * @param applicationLastUpdateDate
     *        The date (in Unix epoch time) when the application was last updated.
     */

    public void setApplicationLastUpdateDate(Long applicationLastUpdateDate) {
        this.applicationLastUpdateDate = applicationLastUpdateDate;
    }

    /**
     * <p>
     * The date (in Unix epoch time) when the application was last updated.
     * </p>
     * 
     * @return The date (in Unix epoch time) when the application was last updated.
     */

    public Long getApplicationLastUpdateDate() {
        return this.applicationLastUpdateDate;
    }

    /**
     * <p>
     * The date (in Unix epoch time) when the application was last updated.
     * </p>
     * 
     * @param applicationLastUpdateDate
     *        The date (in Unix epoch time) when the application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withApplicationLastUpdateDate(Long applicationLastUpdateDate) {
        setApplicationLastUpdateDate(applicationLastUpdateDate);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that the web application assumes when it interacts with AWS IoT Core.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core.
     * </p>
     * 
     * @return The ARN of the role that the web application assumes when it interacts with AWS IoT Core.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that the web application assumes when it interacts with AWS IoT Core.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Id of the single sign-on client that you use to authenticate and authorize users on the web application.
     * </p>
     * 
     * @param ssoClientId
     *        The Id of the single sign-on client that you use to authenticate and authorize users on the web
     *        application.
     */

    public void setSsoClientId(String ssoClientId) {
        this.ssoClientId = ssoClientId;
    }

    /**
     * <p>
     * The Id of the single sign-on client that you use to authenticate and authorize users on the web application.
     * </p>
     * 
     * @return The Id of the single sign-on client that you use to authenticate and authorize users on the web
     *         application.
     */

    public String getSsoClientId() {
        return this.ssoClientId;
    }

    /**
     * <p>
     * The Id of the single sign-on client that you use to authenticate and authorize users on the web application.
     * </p>
     * 
     * @param ssoClientId
     *        The Id of the single sign-on client that you use to authenticate and authorize users on the web
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withSsoClientId(String ssoClientId) {
        setSsoClientId(ssoClientId);
        return this;
    }

    /**
     * <p>
     * A message indicating why the <code>DescribeApplication</code> API failed.
     * </p>
     * 
     * @param errorMessage
     *        A message indicating why the <code>DescribeApplication</code> API failed.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A message indicating why the <code>DescribeApplication</code> API failed.
     * </p>
     * 
     * @return A message indicating why the <code>DescribeApplication</code> API failed.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A message indicating why the <code>DescribeApplication</code> API failed.
     * </p>
     * 
     * @param errorMessage
     *        A message indicating why the <code>DescribeApplication</code> API failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * A set of key/value pairs that you can use to manage the web application resource.
     * </p>
     * 
     * @return A set of key/value pairs that you can use to manage the web application resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of key/value pairs that you can use to manage the web application resource.
     * </p>
     * 
     * @param tags
     *        A set of key/value pairs that you can use to manage the web application resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of key/value pairs that you can use to manage the web application resource.
     * </p>
     * 
     * @param tags
     *        A set of key/value pairs that you can use to manage the web application resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeApplicationResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationResult clearTagsEntries() {
        this.tags = null;
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getApplicationDescription() != null)
            sb.append("ApplicationDescription: ").append(getApplicationDescription()).append(",");
        if (getApplicationUrl() != null)
            sb.append("ApplicationUrl: ").append(getApplicationUrl()).append(",");
        if (getApplicationState() != null)
            sb.append("ApplicationState: ").append(getApplicationState()).append(",");
        if (getApplicationCreationDate() != null)
            sb.append("ApplicationCreationDate: ").append(getApplicationCreationDate()).append(",");
        if (getApplicationLastUpdateDate() != null)
            sb.append("ApplicationLastUpdateDate: ").append(getApplicationLastUpdateDate()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSsoClientId() != null)
            sb.append("SsoClientId: ").append(getSsoClientId()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationResult == false)
            return false;
        DescribeApplicationResult other = (DescribeApplicationResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
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
        if (other.getApplicationState() == null ^ this.getApplicationState() == null)
            return false;
        if (other.getApplicationState() != null && other.getApplicationState().equals(this.getApplicationState()) == false)
            return false;
        if (other.getApplicationCreationDate() == null ^ this.getApplicationCreationDate() == null)
            return false;
        if (other.getApplicationCreationDate() != null && other.getApplicationCreationDate().equals(this.getApplicationCreationDate()) == false)
            return false;
        if (other.getApplicationLastUpdateDate() == null ^ this.getApplicationLastUpdateDate() == null)
            return false;
        if (other.getApplicationLastUpdateDate() != null && other.getApplicationLastUpdateDate().equals(this.getApplicationLastUpdateDate()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSsoClientId() == null ^ this.getSsoClientId() == null)
            return false;
        if (other.getSsoClientId() != null && other.getSsoClientId().equals(this.getSsoClientId()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getApplicationDescription() == null) ? 0 : getApplicationDescription().hashCode());
        hashCode = prime * hashCode + ((getApplicationUrl() == null) ? 0 : getApplicationUrl().hashCode());
        hashCode = prime * hashCode + ((getApplicationState() == null) ? 0 : getApplicationState().hashCode());
        hashCode = prime * hashCode + ((getApplicationCreationDate() == null) ? 0 : getApplicationCreationDate().hashCode());
        hashCode = prime * hashCode + ((getApplicationLastUpdateDate() == null) ? 0 : getApplicationLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSsoClientId() == null) ? 0 : getSsoClientId().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationResult clone() {
        try {
            return (DescribeApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
