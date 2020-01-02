/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/AssociateRepository"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateRepositoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The repository to associate.
     * </p>
     */
    private Repository repository;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * <p>
     * If you want to add a new repository association, this parameter specifies a unique identifier for the new
     * repository association that helps ensure idempotency.
     * </p>
     * <p>
     * If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The
     * CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead
     * generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken
     * yourself for new versions and include that value in the request.
     * </p>
     * <p>
     * You typically only need to interact with this value if you implement your own retry logic and want to ensure that
     * a given repository association is not created twice. We recommend that you generate a UUID-type value to ensure
     * uniqueness within the specified repository association.
     * </p>
     * <p>
     * Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate repository associations
     * if there are failures and retries.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The repository to associate.
     * </p>
     * 
     * @param repository
     *        The repository to associate.
     */

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The repository to associate.
     * </p>
     * 
     * @return The repository to associate.
     */

    public Repository getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The repository to associate.
     * </p>
     * 
     * @param repository
     *        The repository to associate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateRepositoryRequest withRepository(Repository repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * <p>
     * If you want to add a new repository association, this parameter specifies a unique identifier for the new
     * repository association that helps ensure idempotency.
     * </p>
     * <p>
     * If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The
     * CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead
     * generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken
     * yourself for new versions and include that value in the request.
     * </p>
     * <p>
     * You typically only need to interact with this value if you implement your own retry logic and want to ensure that
     * a given repository association is not created twice. We recommend that you generate a UUID-type value to ensure
     * uniqueness within the specified repository association.
     * </p>
     * <p>
     * Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate repository associations
     * if there are failures and retries.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.</p>
     *        <p>
     *        If you want to add a new repository association, this parameter specifies a unique identifier for the new
     *        repository association that helps ensure idempotency.
     *        </p>
     *        <p>
     *        If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter
     *        empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use
     *        the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must
     *        generate a ClientRequestToken yourself for new versions and include that value in the request.
     *        </p>
     *        <p>
     *        You typically only need to interact with this value if you implement your own retry logic and want to
     *        ensure that a given repository association is not created twice. We recommend that you generate a
     *        UUID-type value to ensure uniqueness within the specified repository association.
     *        </p>
     *        <p>
     *        Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate repository
     *        associations if there are failures and retries.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * <p>
     * If you want to add a new repository association, this parameter specifies a unique identifier for the new
     * repository association that helps ensure idempotency.
     * </p>
     * <p>
     * If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The
     * CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead
     * generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken
     * yourself for new versions and include that value in the request.
     * </p>
     * <p>
     * You typically only need to interact with this value if you implement your own retry logic and want to ensure that
     * a given repository association is not created twice. We recommend that you generate a UUID-type value to ensure
     * uniqueness within the specified repository association.
     * </p>
     * <p>
     * Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate repository associations
     * if there are failures and retries.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.</p>
     *         <p>
     *         If you want to add a new repository association, this parameter specifies a unique identifier for the new
     *         repository association that helps ensure idempotency.
     *         </p>
     *         <p>
     *         If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter
     *         empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use
     *         the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must
     *         generate a ClientRequestToken yourself for new versions and include that value in the request.
     *         </p>
     *         <p>
     *         You typically only need to interact with this value if you implement your own retry logic and want to
     *         ensure that a given repository association is not created twice. We recommend that you generate a
     *         UUID-type value to ensure uniqueness within the specified repository association.
     *         </p>
     *         <p>
     *         Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate repository
     *         associations if there are failures and retries.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * <p>
     * If you want to add a new repository association, this parameter specifies a unique identifier for the new
     * repository association that helps ensure idempotency.
     * </p>
     * <p>
     * If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The
     * CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead
     * generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken
     * yourself for new versions and include that value in the request.
     * </p>
     * <p>
     * You typically only need to interact with this value if you implement your own retry logic and want to ensure that
     * a given repository association is not created twice. We recommend that you generate a UUID-type value to ensure
     * uniqueness within the specified repository association.
     * </p>
     * <p>
     * Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate repository associations
     * if there are failures and retries.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.</p>
     *        <p>
     *        If you want to add a new repository association, this parameter specifies a unique identifier for the new
     *        repository association that helps ensure idempotency.
     *        </p>
     *        <p>
     *        If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter
     *        empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use
     *        the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must
     *        generate a ClientRequestToken yourself for new versions and include that value in the request.
     *        </p>
     *        <p>
     *        You typically only need to interact with this value if you implement your own retry logic and want to
     *        ensure that a given repository association is not created twice. We recommend that you generate a
     *        UUID-type value to ensure uniqueness within the specified repository association.
     *        </p>
     *        <p>
     *        Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate repository
     *        associations if there are failures and retries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateRepositoryRequest withClientRequestToken(String clientRequestToken) {
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
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
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

        if (obj instanceof AssociateRepositoryRequest == false)
            return false;
        AssociateRepositoryRequest other = (AssociateRepositoryRequest) obj;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
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

        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public AssociateRepositoryRequest clone() {
        return (AssociateRepositoryRequest) super.clone();
    }

}
