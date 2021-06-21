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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribePublisher" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePublisherResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the extension publisher.
     * </p>
     */
    private String publisherId;
    /**
     * <p>
     * Whether the publisher is verified. Currently, all registered publishers are verified.
     * </p>
     */
    private String publisherStatus;
    /**
     * <p>
     * The type of account used as the identity provider when registering this publisher with CloudFormation.
     * </p>
     */
    private String identityProvider;
    /**
     * <p>
     * The URL to the publisher's profile with the identity provider.
     * </p>
     */
    private String publisherProfile;

    /**
     * <p>
     * The ID of the extension publisher.
     * </p>
     * 
     * @param publisherId
     *        The ID of the extension publisher.
     */

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * <p>
     * The ID of the extension publisher.
     * </p>
     * 
     * @return The ID of the extension publisher.
     */

    public String getPublisherId() {
        return this.publisherId;
    }

    /**
     * <p>
     * The ID of the extension publisher.
     * </p>
     * 
     * @param publisherId
     *        The ID of the extension publisher.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePublisherResult withPublisherId(String publisherId) {
        setPublisherId(publisherId);
        return this;
    }

    /**
     * <p>
     * Whether the publisher is verified. Currently, all registered publishers are verified.
     * </p>
     * 
     * @param publisherStatus
     *        Whether the publisher is verified. Currently, all registered publishers are verified.
     * @see PublisherStatus
     */

    public void setPublisherStatus(String publisherStatus) {
        this.publisherStatus = publisherStatus;
    }

    /**
     * <p>
     * Whether the publisher is verified. Currently, all registered publishers are verified.
     * </p>
     * 
     * @return Whether the publisher is verified. Currently, all registered publishers are verified.
     * @see PublisherStatus
     */

    public String getPublisherStatus() {
        return this.publisherStatus;
    }

    /**
     * <p>
     * Whether the publisher is verified. Currently, all registered publishers are verified.
     * </p>
     * 
     * @param publisherStatus
     *        Whether the publisher is verified. Currently, all registered publishers are verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PublisherStatus
     */

    public DescribePublisherResult withPublisherStatus(String publisherStatus) {
        setPublisherStatus(publisherStatus);
        return this;
    }

    /**
     * <p>
     * Whether the publisher is verified. Currently, all registered publishers are verified.
     * </p>
     * 
     * @param publisherStatus
     *        Whether the publisher is verified. Currently, all registered publishers are verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PublisherStatus
     */

    public DescribePublisherResult withPublisherStatus(PublisherStatus publisherStatus) {
        this.publisherStatus = publisherStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of account used as the identity provider when registering this publisher with CloudFormation.
     * </p>
     * 
     * @param identityProvider
     *        The type of account used as the identity provider when registering this publisher with CloudFormation.
     * @see IdentityProvider
     */

    public void setIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
    }

    /**
     * <p>
     * The type of account used as the identity provider when registering this publisher with CloudFormation.
     * </p>
     * 
     * @return The type of account used as the identity provider when registering this publisher with CloudFormation.
     * @see IdentityProvider
     */

    public String getIdentityProvider() {
        return this.identityProvider;
    }

    /**
     * <p>
     * The type of account used as the identity provider when registering this publisher with CloudFormation.
     * </p>
     * 
     * @param identityProvider
     *        The type of account used as the identity provider when registering this publisher with CloudFormation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProvider
     */

    public DescribePublisherResult withIdentityProvider(String identityProvider) {
        setIdentityProvider(identityProvider);
        return this;
    }

    /**
     * <p>
     * The type of account used as the identity provider when registering this publisher with CloudFormation.
     * </p>
     * 
     * @param identityProvider
     *        The type of account used as the identity provider when registering this publisher with CloudFormation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProvider
     */

    public DescribePublisherResult withIdentityProvider(IdentityProvider identityProvider) {
        this.identityProvider = identityProvider.toString();
        return this;
    }

    /**
     * <p>
     * The URL to the publisher's profile with the identity provider.
     * </p>
     * 
     * @param publisherProfile
     *        The URL to the publisher's profile with the identity provider.
     */

    public void setPublisherProfile(String publisherProfile) {
        this.publisherProfile = publisherProfile;
    }

    /**
     * <p>
     * The URL to the publisher's profile with the identity provider.
     * </p>
     * 
     * @return The URL to the publisher's profile with the identity provider.
     */

    public String getPublisherProfile() {
        return this.publisherProfile;
    }

    /**
     * <p>
     * The URL to the publisher's profile with the identity provider.
     * </p>
     * 
     * @param publisherProfile
     *        The URL to the publisher's profile with the identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePublisherResult withPublisherProfile(String publisherProfile) {
        setPublisherProfile(publisherProfile);
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
        if (getPublisherId() != null)
            sb.append("PublisherId: ").append(getPublisherId()).append(",");
        if (getPublisherStatus() != null)
            sb.append("PublisherStatus: ").append(getPublisherStatus()).append(",");
        if (getIdentityProvider() != null)
            sb.append("IdentityProvider: ").append(getIdentityProvider()).append(",");
        if (getPublisherProfile() != null)
            sb.append("PublisherProfile: ").append(getPublisherProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePublisherResult == false)
            return false;
        DescribePublisherResult other = (DescribePublisherResult) obj;
        if (other.getPublisherId() == null ^ this.getPublisherId() == null)
            return false;
        if (other.getPublisherId() != null && other.getPublisherId().equals(this.getPublisherId()) == false)
            return false;
        if (other.getPublisherStatus() == null ^ this.getPublisherStatus() == null)
            return false;
        if (other.getPublisherStatus() != null && other.getPublisherStatus().equals(this.getPublisherStatus()) == false)
            return false;
        if (other.getIdentityProvider() == null ^ this.getIdentityProvider() == null)
            return false;
        if (other.getIdentityProvider() != null && other.getIdentityProvider().equals(this.getIdentityProvider()) == false)
            return false;
        if (other.getPublisherProfile() == null ^ this.getPublisherProfile() == null)
            return false;
        if (other.getPublisherProfile() != null && other.getPublisherProfile().equals(this.getPublisherProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublisherId() == null) ? 0 : getPublisherId().hashCode());
        hashCode = prime * hashCode + ((getPublisherStatus() == null) ? 0 : getPublisherStatus().hashCode());
        hashCode = prime * hashCode + ((getIdentityProvider() == null) ? 0 : getIdentityProvider().hashCode());
        hashCode = prime * hashCode + ((getPublisherProfile() == null) ? 0 : getPublisherProfile().hashCode());
        return hashCode;
    }

    @Override
    public DescribePublisherResult clone() {
        try {
            return (DescribePublisherResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
