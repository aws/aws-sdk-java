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
package com.amazonaws.services.mobile.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure used to request a project be created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/CreateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Default region where project resources should be created.
     * </p>
     */
    private String region;
    /**
     * <p>
     * ZIP or YAML file which contains configuration settings to be used when creating the project. This may be the
     * contents of the file downloaded from the URL provided in an export project operation.
     * </p>
     */
    private java.nio.ByteBuffer contents;
    /**
     * <p>
     * Unique identifier for an exported snapshot of project configuration. This snapshot identifier is included in the
     * share URL when a project is exported.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * Name of the project.
     * </p>
     * 
     * @param name
     *        Name of the project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the project.
     * </p>
     * 
     * @return Name of the project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the project.
     * </p>
     * 
     * @param name
     *        Name of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Default region where project resources should be created.
     * </p>
     * 
     * @param region
     *        Default region where project resources should be created.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * Default region where project resources should be created.
     * </p>
     * 
     * @return Default region where project resources should be created.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * Default region where project resources should be created.
     * </p>
     * 
     * @param region
     *        Default region where project resources should be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * ZIP or YAML file which contains configuration settings to be used when creating the project. This may be the
     * contents of the file downloaded from the URL provided in an export project operation.
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
     * @param contents
     *        ZIP or YAML file which contains configuration settings to be used when creating the project. This may be
     *        the contents of the file downloaded from the URL provided in an export project operation.
     */

    public void setContents(java.nio.ByteBuffer contents) {
        this.contents = contents;
    }

    /**
     * <p>
     * ZIP or YAML file which contains configuration settings to be used when creating the project. This may be the
     * contents of the file downloaded from the URL provided in an export project operation.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return ZIP or YAML file which contains configuration settings to be used when creating the project. This may be
     *         the contents of the file downloaded from the URL provided in an export project operation.
     */

    public java.nio.ByteBuffer getContents() {
        return this.contents;
    }

    /**
     * <p>
     * ZIP or YAML file which contains configuration settings to be used when creating the project. This may be the
     * contents of the file downloaded from the URL provided in an export project operation.
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
     * @param contents
     *        ZIP or YAML file which contains configuration settings to be used when creating the project. This may be
     *        the contents of the file downloaded from the URL provided in an export project operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withContents(java.nio.ByteBuffer contents) {
        setContents(contents);
        return this;
    }

    /**
     * <p>
     * Unique identifier for an exported snapshot of project configuration. This snapshot identifier is included in the
     * share URL when a project is exported.
     * </p>
     * 
     * @param snapshotId
     *        Unique identifier for an exported snapshot of project configuration. This snapshot identifier is included
     *        in the share URL when a project is exported.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * Unique identifier for an exported snapshot of project configuration. This snapshot identifier is included in the
     * share URL when a project is exported.
     * </p>
     * 
     * @return Unique identifier for an exported snapshot of project configuration. This snapshot identifier is included
     *         in the share URL when a project is exported.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * Unique identifier for an exported snapshot of project configuration. This snapshot identifier is included in the
     * share URL when a project is exported.
     * </p>
     * 
     * @param snapshotId
     *        Unique identifier for an exported snapshot of project configuration. This snapshot identifier is included
     *        in the share URL when a project is exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getContents() != null)
            sb.append("Contents: ").append(getContents()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectRequest == false)
            return false;
        CreateProjectRequest other = (CreateProjectRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getContents() == null ^ this.getContents() == null)
            return false;
        if (other.getContents() != null && other.getContents().equals(this.getContents()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getContents() == null) ? 0 : getContents().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectRequest clone() {
        return (CreateProjectRequest) super.clone();
    }

}
