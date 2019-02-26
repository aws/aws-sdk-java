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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Import documentation parts from an external (e.g., OpenAPI) definition file.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportDocumentationPartsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * A query parameter to indicate whether to overwrite (<code>OVERWRITE</code>) any existing
     * <a>DocumentationParts</a> definition or to merge (<code>MERGE</code>) the new definition into the existing one.
     * The default value is <code>MERGE</code>.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * A query parameter to specify whether to rollback the documentation importation (<code>true</code>) or not (
     * <code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     * </p>
     */
    private Boolean failOnWarnings;
    /**
     * <p>
     * [Required] Raw byte array representing the to-be-imported documentation parts. To import from an OpenAPI file,
     * this is a JSON object.
     * </p>
     */
    private java.nio.ByteBuffer body;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDocumentationPartsRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * A query parameter to indicate whether to overwrite (<code>OVERWRITE</code>) any existing
     * <a>DocumentationParts</a> definition or to merge (<code>MERGE</code>) the new definition into the existing one.
     * The default value is <code>MERGE</code>.
     * </p>
     * 
     * @param mode
     *        A query parameter to indicate whether to overwrite (<code>OVERWRITE</code>) any existing
     *        <a>DocumentationParts</a> definition or to merge (<code>MERGE</code>) the new definition into the existing
     *        one. The default value is <code>MERGE</code>.
     * @see PutMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * A query parameter to indicate whether to overwrite (<code>OVERWRITE</code>) any existing
     * <a>DocumentationParts</a> definition or to merge (<code>MERGE</code>) the new definition into the existing one.
     * The default value is <code>MERGE</code>.
     * </p>
     * 
     * @return A query parameter to indicate whether to overwrite (<code>OVERWRITE</code>) any existing
     *         <a>DocumentationParts</a> definition or to merge (<code>MERGE</code>) the new definition into the
     *         existing one. The default value is <code>MERGE</code>.
     * @see PutMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * A query parameter to indicate whether to overwrite (<code>OVERWRITE</code>) any existing
     * <a>DocumentationParts</a> definition or to merge (<code>MERGE</code>) the new definition into the existing one.
     * The default value is <code>MERGE</code>.
     * </p>
     * 
     * @param mode
     *        A query parameter to indicate whether to overwrite (<code>OVERWRITE</code>) any existing
     *        <a>DocumentationParts</a> definition or to merge (<code>MERGE</code>) the new definition into the existing
     *        one. The default value is <code>MERGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PutMode
     */

    public ImportDocumentationPartsRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * A query parameter to indicate whether to overwrite (<code>OVERWRITE</code>) any existing
     * <a>DocumentationParts</a> definition or to merge (<code>MERGE</code>) the new definition into the existing one.
     * The default value is <code>MERGE</code>.
     * </p>
     * 
     * @param mode
     *        A query parameter to indicate whether to overwrite (<code>OVERWRITE</code>) any existing
     *        <a>DocumentationParts</a> definition or to merge (<code>MERGE</code>) the new definition into the existing
     *        one. The default value is <code>MERGE</code>.
     * @see PutMode
     */

    public void setMode(PutMode mode) {
        withMode(mode);
    }

    /**
     * <p>
     * A query parameter to indicate whether to overwrite (<code>OVERWRITE</code>) any existing
     * <a>DocumentationParts</a> definition or to merge (<code>MERGE</code>) the new definition into the existing one.
     * The default value is <code>MERGE</code>.
     * </p>
     * 
     * @param mode
     *        A query parameter to indicate whether to overwrite (<code>OVERWRITE</code>) any existing
     *        <a>DocumentationParts</a> definition or to merge (<code>MERGE</code>) the new definition into the existing
     *        one. The default value is <code>MERGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PutMode
     */

    public ImportDocumentationPartsRequest withMode(PutMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * A query parameter to specify whether to rollback the documentation importation (<code>true</code>) or not (
     * <code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     * </p>
     * 
     * @param failOnWarnings
     *        A query parameter to specify whether to rollback the documentation importation (<code>true</code>) or not
     *        (<code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     */

    public void setFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to specify whether to rollback the documentation importation (<code>true</code>) or not (
     * <code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     * </p>
     * 
     * @return A query parameter to specify whether to rollback the documentation importation (<code>true</code>) or not
     *         (<code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     */

    public Boolean getFailOnWarnings() {
        return this.failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to specify whether to rollback the documentation importation (<code>true</code>) or not (
     * <code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     * </p>
     * 
     * @param failOnWarnings
     *        A query parameter to specify whether to rollback the documentation importation (<code>true</code>) or not
     *        (<code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDocumentationPartsRequest withFailOnWarnings(Boolean failOnWarnings) {
        setFailOnWarnings(failOnWarnings);
        return this;
    }

    /**
     * <p>
     * A query parameter to specify whether to rollback the documentation importation (<code>true</code>) or not (
     * <code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     * </p>
     * 
     * @return A query parameter to specify whether to rollback the documentation importation (<code>true</code>) or not
     *         (<code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     */

    public Boolean isFailOnWarnings() {
        return this.failOnWarnings;
    }

    /**
     * <p>
     * [Required] Raw byte array representing the to-be-imported documentation parts. To import from an OpenAPI file,
     * this is a JSON object.
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
     * @param body
     *        [Required] Raw byte array representing the to-be-imported documentation parts. To import from an OpenAPI
     *        file, this is a JSON object.
     */

    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * [Required] Raw byte array representing the to-be-imported documentation parts. To import from an OpenAPI file,
     * this is a JSON object.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return [Required] Raw byte array representing the to-be-imported documentation parts. To import from an OpenAPI
     *         file, this is a JSON object.
     */

    public java.nio.ByteBuffer getBody() {
        return this.body;
    }

    /**
     * <p>
     * [Required] Raw byte array representing the to-be-imported documentation parts. To import from an OpenAPI file,
     * this is a JSON object.
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
     * @param body
     *        [Required] Raw byte array representing the to-be-imported documentation parts. To import from an OpenAPI
     *        file, this is a JSON object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDocumentationPartsRequest withBody(java.nio.ByteBuffer body) {
        setBody(body);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getFailOnWarnings() != null)
            sb.append("FailOnWarnings: ").append(getFailOnWarnings()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportDocumentationPartsRequest == false)
            return false;
        ImportDocumentationPartsRequest other = (ImportDocumentationPartsRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getFailOnWarnings() == null ^ this.getFailOnWarnings() == null)
            return false;
        if (other.getFailOnWarnings() != null && other.getFailOnWarnings().equals(this.getFailOnWarnings()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getFailOnWarnings() == null) ? 0 : getFailOnWarnings().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public ImportDocumentationPartsRequest clone() {
        return (ImportDocumentationPartsRequest) super.clone();
    }

}
