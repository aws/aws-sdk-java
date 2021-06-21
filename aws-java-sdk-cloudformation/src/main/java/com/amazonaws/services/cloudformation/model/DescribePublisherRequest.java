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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribePublisher" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePublisherRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the extension publisher.
     * </p>
     * <p>
     * If you do not supply a <code>PublisherId</code>, and you have registered as an extension publisher,
     * <code>DescribePublisher</code> returns information about your own publisher account.
     * </p>
     */
    private String publisherId;

    /**
     * <p>
     * The ID of the extension publisher.
     * </p>
     * <p>
     * If you do not supply a <code>PublisherId</code>, and you have registered as an extension publisher,
     * <code>DescribePublisher</code> returns information about your own publisher account.
     * </p>
     * 
     * @param publisherId
     *        The ID of the extension publisher.</p>
     *        <p>
     *        If you do not supply a <code>PublisherId</code>, and you have registered as an extension publisher,
     *        <code>DescribePublisher</code> returns information about your own publisher account.
     */

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * <p>
     * The ID of the extension publisher.
     * </p>
     * <p>
     * If you do not supply a <code>PublisherId</code>, and you have registered as an extension publisher,
     * <code>DescribePublisher</code> returns information about your own publisher account.
     * </p>
     * 
     * @return The ID of the extension publisher.</p>
     *         <p>
     *         If you do not supply a <code>PublisherId</code>, and you have registered as an extension publisher,
     *         <code>DescribePublisher</code> returns information about your own publisher account.
     */

    public String getPublisherId() {
        return this.publisherId;
    }

    /**
     * <p>
     * The ID of the extension publisher.
     * </p>
     * <p>
     * If you do not supply a <code>PublisherId</code>, and you have registered as an extension publisher,
     * <code>DescribePublisher</code> returns information about your own publisher account.
     * </p>
     * 
     * @param publisherId
     *        The ID of the extension publisher.</p>
     *        <p>
     *        If you do not supply a <code>PublisherId</code>, and you have registered as an extension publisher,
     *        <code>DescribePublisher</code> returns information about your own publisher account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePublisherRequest withPublisherId(String publisherId) {
        setPublisherId(publisherId);
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
            sb.append("PublisherId: ").append(getPublisherId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePublisherRequest == false)
            return false;
        DescribePublisherRequest other = (DescribePublisherRequest) obj;
        if (other.getPublisherId() == null ^ this.getPublisherId() == null)
            return false;
        if (other.getPublisherId() != null && other.getPublisherId().equals(this.getPublisherId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublisherId() == null) ? 0 : getPublisherId().hashCode());
        return hashCode;
    }

    @Override
    public DescribePublisherRequest clone() {
        return (DescribePublisherRequest) super.clone();
    }

}
