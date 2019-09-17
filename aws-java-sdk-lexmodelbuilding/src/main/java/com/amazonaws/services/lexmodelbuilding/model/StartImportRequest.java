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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/StartImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartImportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A zip archive in binary format. The archive should contain one file, a JSON file containing the resource to
     * import. The resource should match the type specified in the <code>resourceType</code> field.
     * </p>
     */
    private java.nio.ByteBuffer payload;
    /**
     * <p>
     * Specifies the type of resource to export. Each resource also exports any resources that it depends on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A bot exports dependent intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * An intent exports dependent slot types.
     * </p>
     * </li>
     * </ul>
     */
    private String resourceType;
    /**
     * <p>
     * Specifies the action that the <code>StartImport</code> operation should take when there is an existing resource
     * with the same name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import file
     * and an existing resource. The name of the resource causing the conflict is in the <code>failureReason</code>
     * field of the response to the <code>GetImport</code> operation.
     * </p>
     * <p>
     * OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource. The
     * $LASTEST version of the existing resource is overwritten with the data from the import file.
     * </p>
     * </li>
     * </ul>
     */
    private String mergeStrategy;

    /**
     * <p>
     * A zip archive in binary format. The archive should contain one file, a JSON file containing the resource to
     * import. The resource should match the type specified in the <code>resourceType</code> field.
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
     * @param payload
     *        A zip archive in binary format. The archive should contain one file, a JSON file containing the resource
     *        to import. The resource should match the type specified in the <code>resourceType</code> field.
     */

    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * A zip archive in binary format. The archive should contain one file, a JSON file containing the resource to
     * import. The resource should match the type specified in the <code>resourceType</code> field.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A zip archive in binary format. The archive should contain one file, a JSON file containing the resource
     *         to import. The resource should match the type specified in the <code>resourceType</code> field.
     */

    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * A zip archive in binary format. The archive should contain one file, a JSON file containing the resource to
     * import. The resource should match the type specified in the <code>resourceType</code> field.
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
     * @param payload
     *        A zip archive in binary format. The archive should contain one file, a JSON file containing the resource
     *        to import. The resource should match the type specified in the <code>resourceType</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportRequest withPayload(java.nio.ByteBuffer payload) {
        setPayload(payload);
        return this;
    }

    /**
     * <p>
     * Specifies the type of resource to export. Each resource also exports any resources that it depends on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A bot exports dependent intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * An intent exports dependent slot types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        Specifies the type of resource to export. Each resource also exports any resources that it depends on.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A bot exports dependent intents.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An intent exports dependent slot types.
     *        </p>
     *        </li>
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specifies the type of resource to export. Each resource also exports any resources that it depends on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A bot exports dependent intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * An intent exports dependent slot types.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the type of resource to export. Each resource also exports any resources that it depends on.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A bot exports dependent intents.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An intent exports dependent slot types.
     *         </p>
     *         </li>
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Specifies the type of resource to export. Each resource also exports any resources that it depends on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A bot exports dependent intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * An intent exports dependent slot types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        Specifies the type of resource to export. Each resource also exports any resources that it depends on.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A bot exports dependent intents.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An intent exports dependent slot types.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public StartImportRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of resource to export. Each resource also exports any resources that it depends on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A bot exports dependent intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * An intent exports dependent slot types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        Specifies the type of resource to export. Each resource also exports any resources that it depends on.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A bot exports dependent intents.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An intent exports dependent slot types.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public StartImportRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the action that the <code>StartImport</code> operation should take when there is an existing resource
     * with the same name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import file
     * and an existing resource. The name of the resource causing the conflict is in the <code>failureReason</code>
     * field of the response to the <code>GetImport</code> operation.
     * </p>
     * <p>
     * OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource. The
     * $LASTEST version of the existing resource is overwritten with the data from the import file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mergeStrategy
     *        Specifies the action that the <code>StartImport</code> operation should take when there is an existing
     *        resource with the same name.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import
     *        file and an existing resource. The name of the resource causing the conflict is in the
     *        <code>failureReason</code> field of the response to the <code>GetImport</code> operation.
     *        </p>
     *        <p>
     *        OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource.
     *        The $LASTEST version of the existing resource is overwritten with the data from the import file.
     *        </p>
     *        </li>
     * @see MergeStrategy
     */

    public void setMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    /**
     * <p>
     * Specifies the action that the <code>StartImport</code> operation should take when there is an existing resource
     * with the same name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import file
     * and an existing resource. The name of the resource causing the conflict is in the <code>failureReason</code>
     * field of the response to the <code>GetImport</code> operation.
     * </p>
     * <p>
     * OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource. The
     * $LASTEST version of the existing resource is overwritten with the data from the import file.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the action that the <code>StartImport</code> operation should take when there is an existing
     *         resource with the same name.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import
     *         file and an existing resource. The name of the resource causing the conflict is in the
     *         <code>failureReason</code> field of the response to the <code>GetImport</code> operation.
     *         </p>
     *         <p>
     *         OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource.
     *         The $LASTEST version of the existing resource is overwritten with the data from the import file.
     *         </p>
     *         </li>
     * @see MergeStrategy
     */

    public String getMergeStrategy() {
        return this.mergeStrategy;
    }

    /**
     * <p>
     * Specifies the action that the <code>StartImport</code> operation should take when there is an existing resource
     * with the same name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import file
     * and an existing resource. The name of the resource causing the conflict is in the <code>failureReason</code>
     * field of the response to the <code>GetImport</code> operation.
     * </p>
     * <p>
     * OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource. The
     * $LASTEST version of the existing resource is overwritten with the data from the import file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mergeStrategy
     *        Specifies the action that the <code>StartImport</code> operation should take when there is an existing
     *        resource with the same name.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import
     *        file and an existing resource. The name of the resource causing the conflict is in the
     *        <code>failureReason</code> field of the response to the <code>GetImport</code> operation.
     *        </p>
     *        <p>
     *        OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource.
     *        The $LASTEST version of the existing resource is overwritten with the data from the import file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public StartImportRequest withMergeStrategy(String mergeStrategy) {
        setMergeStrategy(mergeStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies the action that the <code>StartImport</code> operation should take when there is an existing resource
     * with the same name.
     * </p>
     * <ul>
     * <li>
     * <p>
     * FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import file
     * and an existing resource. The name of the resource causing the conflict is in the <code>failureReason</code>
     * field of the response to the <code>GetImport</code> operation.
     * </p>
     * <p>
     * OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource. The
     * $LASTEST version of the existing resource is overwritten with the data from the import file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mergeStrategy
     *        Specifies the action that the <code>StartImport</code> operation should take when there is an existing
     *        resource with the same name.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import
     *        file and an existing resource. The name of the resource causing the conflict is in the
     *        <code>failureReason</code> field of the response to the <code>GetImport</code> operation.
     *        </p>
     *        <p>
     *        OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource.
     *        The $LASTEST version of the existing resource is overwritten with the data from the import file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MergeStrategy
     */

    public StartImportRequest withMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
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
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getMergeStrategy() != null)
            sb.append("MergeStrategy: ").append(getMergeStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImportRequest == false)
            return false;
        StartImportRequest other = (StartImportRequest) obj;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getMergeStrategy() == null ^ this.getMergeStrategy() == null)
            return false;
        if (other.getMergeStrategy() != null && other.getMergeStrategy().equals(this.getMergeStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getMergeStrategy() == null) ? 0 : getMergeStrategy().hashCode());
        return hashCode;
    }

    @Override
    public StartImportRequest clone() {
        return (StartImportRequest) super.clone();
    }

}
