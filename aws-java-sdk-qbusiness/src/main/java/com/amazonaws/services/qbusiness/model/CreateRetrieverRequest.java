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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateRetriever" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRetrieverRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of your Amazon Q Business application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The type of retriever you are using.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of your retriever.
     * </p>
     */
    private String displayName;

    private RetrieverConfiguration configuration;
    /**
     * <p>
     * The ARN of an IAM role used by Amazon Q Business to access the basic authentication credentials stored in a
     * Secrets Manager secret.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business application retriever.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A list of key-value pairs that identify or categorize the retriever. You can also use tags to help control access
     * to the retriever. Tag keys and values can consist of Unicode letters, digits, white space, and any of the
     * following symbols: _ . : / = + - @.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateRetrieverRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The type of retriever you are using.
     * </p>
     * 
     * @param type
     *        The type of retriever you are using.
     * @see RetrieverType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of retriever you are using.
     * </p>
     * 
     * @return The type of retriever you are using.
     * @see RetrieverType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of retriever you are using.
     * </p>
     * 
     * @param type
     *        The type of retriever you are using.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrieverType
     */

    public CreateRetrieverRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of retriever you are using.
     * </p>
     * 
     * @param type
     *        The type of retriever you are using.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrieverType
     */

    public CreateRetrieverRequest withType(RetrieverType type) {
        this.type = type.toString();
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

    public CreateRetrieverRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
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

    public CreateRetrieverRequest withConfiguration(RetrieverConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role used by Amazon Q Business to access the basic authentication credentials stored in a
     * Secrets Manager secret.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role used by Amazon Q Business to access the basic authentication credentials stored in
     *        a Secrets Manager secret.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role used by Amazon Q Business to access the basic authentication credentials stored in a
     * Secrets Manager secret.
     * </p>
     * 
     * @return The ARN of an IAM role used by Amazon Q Business to access the basic authentication credentials stored in
     *         a Secrets Manager secret.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role used by Amazon Q Business to access the basic authentication credentials stored in a
     * Secrets Manager secret.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role used by Amazon Q Business to access the basic authentication credentials stored in
     *        a Secrets Manager secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRetrieverRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business application retriever.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create your Amazon Q Business application retriever.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business application retriever.
     * </p>
     * 
     * @return A token that you provide to identify the request to create your Amazon Q Business application retriever.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business application retriever.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create your Amazon Q Business application retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRetrieverRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the retriever. You can also use tags to help control access
     * to the retriever. Tag keys and values can consist of Unicode letters, digits, white space, and any of the
     * following symbols: _ . : / = + - @.
     * </p>
     * 
     * @return A list of key-value pairs that identify or categorize the retriever. You can also use tags to help
     *         control access to the retriever. Tag keys and values can consist of Unicode letters, digits, white space,
     *         and any of the following symbols: _ . : / = + - @.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the retriever. You can also use tags to help control access
     * to the retriever. Tag keys and values can consist of Unicode letters, digits, white space, and any of the
     * following symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the retriever. You can also use tags to help control
     *        access to the retriever. Tag keys and values can consist of Unicode letters, digits, white space, and any
     *        of the following symbols: _ . : / = + - @.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the retriever. You can also use tags to help control access
     * to the retriever. Tag keys and values can consist of Unicode letters, digits, white space, and any of the
     * following symbols: _ . : / = + - @.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the retriever. You can also use tags to help control
     *        access to the retriever. Tag keys and values can consist of Unicode letters, digits, white space, and any
     *        of the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRetrieverRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the retriever. You can also use tags to help control access
     * to the retriever. Tag keys and values can consist of Unicode letters, digits, white space, and any of the
     * following symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the retriever. You can also use tags to help control
     *        access to the retriever. Tag keys and values can consist of Unicode letters, digits, white space, and any
     *        of the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRetrieverRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CreateRetrieverRequest == false)
            return false;
        CreateRetrieverRequest other = (CreateRetrieverRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRetrieverRequest clone() {
        return (CreateRetrieverRequest) super.clone();
    }

}
