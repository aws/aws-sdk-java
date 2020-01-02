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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeConfigurationRevision"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationRevisionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the configuration was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The description of the configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The revision number.
     * </p>
     */
    private Long revision;
    /**
     * <p>
     * Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     * contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI, the
     * contents of <filename>server.properties</filename> can be in plaintext.
     * </p>
     */
    private java.nio.ByteBuffer serverProperties;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @param arn
     *        <p>
     *        The Amazon Resource Name (ARN) of the configuration.
     *        </p>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the configuration.
     *         </p>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @param arn
     *        <p>
     *        The Amazon Resource Name (ARN) of the configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRevisionResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the configuration was created.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        The time when the configuration was created.
     *        </p>
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the configuration was created.
     * </p>
     * 
     * @return <p>
     *         The time when the configuration was created.
     *         </p>
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the configuration was created.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        The time when the configuration was created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRevisionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The description of the configuration.
     * </p>
     * 
     * @param description
     *        <p>
     *        The description of the configuration.
     *        </p>
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the configuration.
     * </p>
     * 
     * @return <p>
     *         The description of the configuration.
     *         </p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the configuration.
     * </p>
     * 
     * @param description
     *        <p>
     *        The description of the configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRevisionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The revision number.
     * </p>
     * 
     * @param revision
     *        <p>
     *        The revision number.
     *        </p>
     */

    public void setRevision(Long revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision number.
     * </p>
     * 
     * @return <p>
     *         The revision number.
     *         </p>
     */

    public Long getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision number.
     * </p>
     * 
     * @param revision
     *        <p>
     *        The revision number.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRevisionResult withRevision(Long revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     * contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI, the
     * contents of <filename>server.properties</filename> can be in plaintext.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param serverProperties
     *        <p>
     *        Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     *        contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI,
     *        the contents of <filename>server.properties</filename> can be in plaintext.
     *        </p>
     */

    public void setServerProperties(java.nio.ByteBuffer serverProperties) {
        this.serverProperties = serverProperties;
    }

    /**
     * <p>
     * Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     * contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI, the
     * contents of <filename>server.properties</filename> can be in plaintext.
     * </p>
     * 
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}
     * . Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return <p>
     *         Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     *         contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI,
     *         the contents of <filename>server.properties</filename> can be in plaintext.
     *         </p>
     */

    public java.nio.ByteBuffer getServerProperties() {
        return this.serverProperties;
    }

    /**
     * <p>
     * Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     * contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI, the
     * contents of <filename>server.properties</filename> can be in plaintext.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param serverProperties
     *        <p>
     *        Contents of the <filename>server.properties</filename> file. When using the API, you must ensure that the
     *        contents of the file are base64 encoded. When using the AWS Management Console, the SDK, or the AWS CLI,
     *        the contents of <filename>server.properties</filename> can be in plaintext.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRevisionResult withServerProperties(java.nio.ByteBuffer serverProperties) {
        setServerProperties(serverProperties);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getServerProperties() != null)
            sb.append("ServerProperties: ").append(getServerProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationRevisionResult == false)
            return false;
        DescribeConfigurationRevisionResult other = (DescribeConfigurationRevisionResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getServerProperties() == null ^ this.getServerProperties() == null)
            return false;
        if (other.getServerProperties() != null && other.getServerProperties().equals(this.getServerProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getServerProperties() == null) ? 0 : getServerProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationRevisionResult clone() {
        try {
            return (DescribeConfigurationRevisionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
