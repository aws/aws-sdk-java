/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateRetriever" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRetrieverRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of your Amazon Q Business application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of your retriever.
     * </p>
     */
    private String retrieverId;

    private RetrieverConfiguration configuration;
    /**
     * <p>
     * The name of your retriever.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the retriever and required resources.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The identifier of your Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of your Amazon Q Business application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of your Amazon Q Business application.
     * </p>
     * 
     * @return The identifier of your Amazon Q Business application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of your Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of your Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRetrieverRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of your retriever.
     * </p>
     * 
     * @param retrieverId
     *        The identifier of your retriever.
     */

    public void setRetrieverId(String retrieverId) {
        this.retrieverId = retrieverId;
    }

    /**
     * <p>
     * The identifier of your retriever.
     * </p>
     * 
     * @return The identifier of your retriever.
     */

    public String getRetrieverId() {
        return this.retrieverId;
    }

    /**
     * <p>
     * The identifier of your retriever.
     * </p>
     * 
     * @param retrieverId
     *        The identifier of your retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRetrieverRequest withRetrieverId(String retrieverId) {
        setRetrieverId(retrieverId);
        return this;
    }

    /**
     * @param configuration
     */

    public void setConfiguration(RetrieverConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * @return
     */

    public RetrieverConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * @param configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRetrieverRequest withConfiguration(RetrieverConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The name of your retriever.
     * </p>
     * 
     * @param displayName
     *        The name of your retriever.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of your retriever.
     * </p>
     * 
     * @return The name of your retriever.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of your retriever.
     * </p>
     * 
     * @param displayName
     *        The name of your retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRetrieverRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the retriever and required resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role with permission to access the retriever and required
     *        resources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the retriever and required resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role with permission to access the retriever and required
     *         resources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the retriever and required resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role with permission to access the retriever and required
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRetrieverRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getRetrieverId() != null)
            sb.append("RetrieverId: ").append(getRetrieverId()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRetrieverRequest == false)
            return false;
        UpdateRetrieverRequest other = (UpdateRetrieverRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getRetrieverId() == null ^ this.getRetrieverId() == null)
            return false;
        if (other.getRetrieverId() != null && other.getRetrieverId().equals(this.getRetrieverId()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getRetrieverId() == null) ? 0 : getRetrieverId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRetrieverRequest clone() {
        return (UpdateRetrieverRequest) super.clone();
    }

}
