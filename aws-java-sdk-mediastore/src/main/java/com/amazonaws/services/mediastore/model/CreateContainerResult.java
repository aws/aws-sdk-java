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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/CreateContainer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContainerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * ContainerARN: The Amazon Resource Name (ARN) of the newly created container. The ARN has the following format:
     * arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;. For example:
     * arn:aws:mediastore:us-west-2:111122223333:container/movies
     * </p>
     * <p>
     * ContainerName: The container name as specified in the request.
     * </p>
     * <p>
     * CreationTime: Unix time stamp.
     * </p>
     * <p>
     * Status: The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     * <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     * <code>CREATING</code>. When an endpoint is available, the status changes to <code>ACTIVE</code>.
     * </p>
     * <p>
     * The return value does not include the container's endpoint. To make downstream requests, you must obtain this
     * value by using <a>DescribeContainer</a> or <a>ListContainers</a>.
     * </p>
     */
    private Container container;

    /**
     * <p>
     * ContainerARN: The Amazon Resource Name (ARN) of the newly created container. The ARN has the following format:
     * arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;. For example:
     * arn:aws:mediastore:us-west-2:111122223333:container/movies
     * </p>
     * <p>
     * ContainerName: The container name as specified in the request.
     * </p>
     * <p>
     * CreationTime: Unix time stamp.
     * </p>
     * <p>
     * Status: The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     * <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     * <code>CREATING</code>. When an endpoint is available, the status changes to <code>ACTIVE</code>.
     * </p>
     * <p>
     * The return value does not include the container's endpoint. To make downstream requests, you must obtain this
     * value by using <a>DescribeContainer</a> or <a>ListContainers</a>.
     * </p>
     * 
     * @param container
     *        ContainerARN: The Amazon Resource Name (ARN) of the newly created container. The ARN has the following
     *        format: arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of
     *        container&gt;. For example: arn:aws:mediastore:us-west-2:111122223333:container/movies </p>
     *        <p>
     *        ContainerName: The container name as specified in the request.
     *        </p>
     *        <p>
     *        CreationTime: Unix time stamp.
     *        </p>
     *        <p>
     *        Status: The status of container creation or deletion. The status is one of the following:
     *        <code>CREATING</code>, <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the
     *        container, the status is <code>CREATING</code>. When an endpoint is available, the status changes to
     *        <code>ACTIVE</code>.
     *        </p>
     *        <p>
     *        The return value does not include the container's endpoint. To make downstream requests, you must obtain
     *        this value by using <a>DescribeContainer</a> or <a>ListContainers</a>.
     */

    public void setContainer(Container container) {
        this.container = container;
    }

    /**
     * <p>
     * ContainerARN: The Amazon Resource Name (ARN) of the newly created container. The ARN has the following format:
     * arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;. For example:
     * arn:aws:mediastore:us-west-2:111122223333:container/movies
     * </p>
     * <p>
     * ContainerName: The container name as specified in the request.
     * </p>
     * <p>
     * CreationTime: Unix time stamp.
     * </p>
     * <p>
     * Status: The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     * <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     * <code>CREATING</code>. When an endpoint is available, the status changes to <code>ACTIVE</code>.
     * </p>
     * <p>
     * The return value does not include the container's endpoint. To make downstream requests, you must obtain this
     * value by using <a>DescribeContainer</a> or <a>ListContainers</a>.
     * </p>
     * 
     * @return ContainerARN: The Amazon Resource Name (ARN) of the newly created container. The ARN has the following
     *         format: arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of
     *         container&gt;. For example: arn:aws:mediastore:us-west-2:111122223333:container/movies </p>
     *         <p>
     *         ContainerName: The container name as specified in the request.
     *         </p>
     *         <p>
     *         CreationTime: Unix time stamp.
     *         </p>
     *         <p>
     *         Status: The status of container creation or deletion. The status is one of the following:
     *         <code>CREATING</code>, <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the
     *         container, the status is <code>CREATING</code>. When an endpoint is available, the status changes to
     *         <code>ACTIVE</code>.
     *         </p>
     *         <p>
     *         The return value does not include the container's endpoint. To make downstream requests, you must obtain
     *         this value by using <a>DescribeContainer</a> or <a>ListContainers</a>.
     */

    public Container getContainer() {
        return this.container;
    }

    /**
     * <p>
     * ContainerARN: The Amazon Resource Name (ARN) of the newly created container. The ARN has the following format:
     * arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;. For example:
     * arn:aws:mediastore:us-west-2:111122223333:container/movies
     * </p>
     * <p>
     * ContainerName: The container name as specified in the request.
     * </p>
     * <p>
     * CreationTime: Unix time stamp.
     * </p>
     * <p>
     * Status: The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     * <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     * <code>CREATING</code>. When an endpoint is available, the status changes to <code>ACTIVE</code>.
     * </p>
     * <p>
     * The return value does not include the container's endpoint. To make downstream requests, you must obtain this
     * value by using <a>DescribeContainer</a> or <a>ListContainers</a>.
     * </p>
     * 
     * @param container
     *        ContainerARN: The Amazon Resource Name (ARN) of the newly created container. The ARN has the following
     *        format: arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of
     *        container&gt;. For example: arn:aws:mediastore:us-west-2:111122223333:container/movies </p>
     *        <p>
     *        ContainerName: The container name as specified in the request.
     *        </p>
     *        <p>
     *        CreationTime: Unix time stamp.
     *        </p>
     *        <p>
     *        Status: The status of container creation or deletion. The status is one of the following:
     *        <code>CREATING</code>, <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the
     *        container, the status is <code>CREATING</code>. When an endpoint is available, the status changes to
     *        <code>ACTIVE</code>.
     *        </p>
     *        <p>
     *        The return value does not include the container's endpoint. To make downstream requests, you must obtain
     *        this value by using <a>DescribeContainer</a> or <a>ListContainers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerResult withContainer(Container container) {
        setContainer(container);
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
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContainerResult == false)
            return false;
        CreateContainerResult other = (CreateContainerResult) obj;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        return hashCode;
    }

    @Override
    public CreateContainerResult clone() {
        try {
            return (CreateContainerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
