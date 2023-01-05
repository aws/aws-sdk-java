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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateExperience" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExperienceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for your Amazon Kendra experience.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     * <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores your user
     * and group information. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Configuration information for your Amazon Kendra experience. This includes
     * <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     * <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to your
     * Amazon Kendra experience.
     * </p>
     */
    private ExperienceConfiguration configuration;
    /**
     * <p>
     * A description for your Amazon Kendra experience.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Kendra experience. Multiple calls to the
     * <code>CreateExperience</code> API with the same client token creates only one Amazon Kendra experience.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A name for your Amazon Kendra experience.
     * </p>
     * 
     * @param name
     *        A name for your Amazon Kendra experience.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for your Amazon Kendra experience.
     * </p>
     * 
     * @return A name for your Amazon Kendra experience.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for your Amazon Kendra experience.
     * </p>
     * 
     * @param name
     *        A name for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperienceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for your Amazon Kendra experience.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @return The identifier of the index for your Amazon Kendra experience.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperienceRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     * <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores your user
     * and group information. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     *        <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores
     *        your user and group information. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     * <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores your user
     * and group information. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     *         <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores
     *         your user and group information. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     * <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores your user
     * and group information. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     *        <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores
     *        your user and group information. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperienceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Configuration information for your Amazon Kendra experience. This includes
     * <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     * <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to your
     * Amazon Kendra experience.
     * </p>
     * 
     * @param configuration
     *        Configuration information for your Amazon Kendra experience. This includes
     *        <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     *        <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to
     *        your Amazon Kendra experience.
     */

    public void setConfiguration(ExperienceConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Configuration information for your Amazon Kendra experience. This includes
     * <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     * <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to your
     * Amazon Kendra experience.
     * </p>
     * 
     * @return Configuration information for your Amazon Kendra experience. This includes
     *         <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     *         <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to
     *         your Amazon Kendra experience.
     */

    public ExperienceConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Configuration information for your Amazon Kendra experience. This includes
     * <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     * <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to your
     * Amazon Kendra experience.
     * </p>
     * 
     * @param configuration
     *        Configuration information for your Amazon Kendra experience. This includes
     *        <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     *        <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to
     *        your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperienceRequest withConfiguration(ExperienceConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * A description for your Amazon Kendra experience.
     * </p>
     * 
     * @param description
     *        A description for your Amazon Kendra experience.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for your Amazon Kendra experience.
     * </p>
     * 
     * @return A description for your Amazon Kendra experience.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for your Amazon Kendra experience.
     * </p>
     * 
     * @param description
     *        A description for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperienceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Kendra experience. Multiple calls to the
     * <code>CreateExperience</code> API with the same client token creates only one Amazon Kendra experience.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create your Amazon Kendra experience. Multiple calls
     *        to the <code>CreateExperience</code> API with the same client token creates only one Amazon Kendra
     *        experience.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Kendra experience. Multiple calls to the
     * <code>CreateExperience</code> API with the same client token creates only one Amazon Kendra experience.
     * </p>
     * 
     * @return A token that you provide to identify the request to create your Amazon Kendra experience. Multiple calls
     *         to the <code>CreateExperience</code> API with the same client token creates only one Amazon Kendra
     *         experience.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Kendra experience. Multiple calls to the
     * <code>CreateExperience</code> API with the same client token creates only one Amazon Kendra experience.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create your Amazon Kendra experience. Multiple calls
     *        to the <code>CreateExperience</code> API with the same client token creates only one Amazon Kendra
     *        experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperienceRequest withClientToken(String clientToken) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateExperienceRequest == false)
            return false;
        CreateExperienceRequest other = (CreateExperienceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateExperienceRequest clone() {
        return (CreateExperienceRequest) super.clone();
    }

}
