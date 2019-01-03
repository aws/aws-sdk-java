/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreatePullRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePullRequestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The title of the pull request. This title will be used to identify the pull request to other users in the
     * repository.
     * </p>
     */
    private String title;
    /**
     * <p>
     * A description of the pull request.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The targets for the pull request, including the source of the code to be reviewed (the source branch), and the
     * destination where the creator of the pull request intends the code to be merged after the pull request is closed
     * (the destination branch).
     * </p>
     */
    private java.util.List<Target> targets;
    /**
     * <p>
     * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request is received with the same parameters and a token is included, the
     * request will return information about the initial request that used that token.
     * </p>
     * <note>
     * <p>
     * The AWS SDKs prepopulate client request tokens. If using an AWS SDK, you do not have to generate an idempotency
     * token, as this will be done for you.
     * </p>
     * </note>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The title of the pull request. This title will be used to identify the pull request to other users in the
     * repository.
     * </p>
     * 
     * @param title
     *        The title of the pull request. This title will be used to identify the pull request to other users in the
     *        repository.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the pull request. This title will be used to identify the pull request to other users in the
     * repository.
     * </p>
     * 
     * @return The title of the pull request. This title will be used to identify the pull request to other users in the
     *         repository.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the pull request. This title will be used to identify the pull request to other users in the
     * repository.
     * </p>
     * 
     * @param title
     *        The title of the pull request. This title will be used to identify the pull request to other users in the
     *        repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePullRequestRequest withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * A description of the pull request.
     * </p>
     * 
     * @param description
     *        A description of the pull request.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the pull request.
     * </p>
     * 
     * @return A description of the pull request.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the pull request.
     * </p>
     * 
     * @param description
     *        A description of the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePullRequestRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The targets for the pull request, including the source of the code to be reviewed (the source branch), and the
     * destination where the creator of the pull request intends the code to be merged after the pull request is closed
     * (the destination branch).
     * </p>
     * 
     * @return The targets for the pull request, including the source of the code to be reviewed (the source branch),
     *         and the destination where the creator of the pull request intends the code to be merged after the pull
     *         request is closed (the destination branch).
     */

    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets for the pull request, including the source of the code to be reviewed (the source branch), and the
     * destination where the creator of the pull request intends the code to be merged after the pull request is closed
     * (the destination branch).
     * </p>
     * 
     * @param targets
     *        The targets for the pull request, including the source of the code to be reviewed (the source branch), and
     *        the destination where the creator of the pull request intends the code to be merged after the pull request
     *        is closed (the destination branch).
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>
     * The targets for the pull request, including the source of the code to be reviewed (the source branch), and the
     * destination where the creator of the pull request intends the code to be merged after the pull request is closed
     * (the destination branch).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets for the pull request, including the source of the code to be reviewed (the source branch), and
     *        the destination where the creator of the pull request intends the code to be merged after the pull request
     *        is closed (the destination branch).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePullRequestRequest withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets for the pull request, including the source of the code to be reviewed (the source branch), and the
     * destination where the creator of the pull request intends the code to be merged after the pull request is closed
     * (the destination branch).
     * </p>
     * 
     * @param targets
     *        The targets for the pull request, including the source of the code to be reviewed (the source branch), and
     *        the destination where the creator of the pull request intends the code to be merged after the pull request
     *        is closed (the destination branch).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePullRequestRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request is received with the same parameters and a token is included, the
     * request will return information about the initial request that used that token.
     * </p>
     * <note>
     * <p>
     * The AWS SDKs prepopulate client request tokens. If using an AWS SDK, you do not have to generate an idempotency
     * token, as this will be done for you.
     * </p>
     * </note>
     * 
     * @param clientRequestToken
     *        A unique, client-generated idempotency token that when provided in a request, ensures the request cannot
     *        be repeated with a changed parameter. If a request is received with the same parameters and a token is
     *        included, the request will return information about the initial request that used that token.</p> <note>
     *        <p>
     *        The AWS SDKs prepopulate client request tokens. If using an AWS SDK, you do not have to generate an
     *        idempotency token, as this will be done for you.
     *        </p>
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request is received with the same parameters and a token is included, the
     * request will return information about the initial request that used that token.
     * </p>
     * <note>
     * <p>
     * The AWS SDKs prepopulate client request tokens. If using an AWS SDK, you do not have to generate an idempotency
     * token, as this will be done for you.
     * </p>
     * </note>
     * 
     * @return A unique, client-generated idempotency token that when provided in a request, ensures the request cannot
     *         be repeated with a changed parameter. If a request is received with the same parameters and a token is
     *         included, the request will return information about the initial request that used that token.</p> <note>
     *         <p>
     *         The AWS SDKs prepopulate client request tokens. If using an AWS SDK, you do not have to generate an
     *         idempotency token, as this will be done for you.
     *         </p>
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request is received with the same parameters and a token is included, the
     * request will return information about the initial request that used that token.
     * </p>
     * <note>
     * <p>
     * The AWS SDKs prepopulate client request tokens. If using an AWS SDK, you do not have to generate an idempotency
     * token, as this will be done for you.
     * </p>
     * </note>
     * 
     * @param clientRequestToken
     *        A unique, client-generated idempotency token that when provided in a request, ensures the request cannot
     *        be repeated with a changed parameter. If a request is received with the same parameters and a token is
     *        included, the request will return information about the initial request that used that token.</p> <note>
     *        <p>
     *        The AWS SDKs prepopulate client request tokens. If using an AWS SDK, you do not have to generate an
     *        idempotency token, as this will be done for you.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePullRequestRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePullRequestRequest == false)
            return false;
        CreatePullRequestRequest other = (CreatePullRequestRequest) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreatePullRequestRequest clone() {
        return (CreatePullRequestRequest) super.clone();
    }

}
