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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/UpdateDatasetEntries" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDatasetEntriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project that contains the dataset that you want to update.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The type of the dataset that you want to update. Specify <code>train</code> to update the training dataset.
     * Specify <code>test</code> to update the test dataset. If you have a single dataset project, specify
     * <code>train</code>.
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * The entries to add to the dataset.
     * </p>
     */
    private java.nio.ByteBuffer changes;
    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>UpdateDatasetEntries</code> completes only once.
     * You choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>UpdateDatasetEntries</code>. In this case, safely retry your call to
     * <code>UpdateDatasetEntries</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     * the other input parameters are not the same as in the first request. Using a different value for
     * <code>ClientToken</code> is considered a new call to <code>UpdateDatasetEntries</code>. An idempotency token is
     * active for 8 hours.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the project that contains the dataset that you want to update.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the dataset that you want to update.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project that contains the dataset that you want to update.
     * </p>
     * 
     * @return The name of the project that contains the dataset that you want to update.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project that contains the dataset that you want to update.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the dataset that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetEntriesRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The type of the dataset that you want to update. Specify <code>train</code> to update the training dataset.
     * Specify <code>test</code> to update the test dataset. If you have a single dataset project, specify
     * <code>train</code>.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset that you want to update. Specify <code>train</code> to update the training
     *        dataset. Specify <code>test</code> to update the test dataset. If you have a single dataset project,
     *        specify <code>train</code>.
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The type of the dataset that you want to update. Specify <code>train</code> to update the training dataset.
     * Specify <code>test</code> to update the test dataset. If you have a single dataset project, specify
     * <code>train</code>.
     * </p>
     * 
     * @return The type of the dataset that you want to update. Specify <code>train</code> to update the training
     *         dataset. Specify <code>test</code> to update the test dataset. If you have a single dataset project,
     *         specify <code>train</code>.
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The type of the dataset that you want to update. Specify <code>train</code> to update the training dataset.
     * Specify <code>test</code> to update the test dataset. If you have a single dataset project, specify
     * <code>train</code>.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset that you want to update. Specify <code>train</code> to update the training
     *        dataset. Specify <code>test</code> to update the test dataset. If you have a single dataset project,
     *        specify <code>train</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetEntriesRequest withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * The entries to add to the dataset.
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
     * @param changes
     *        The entries to add to the dataset.
     */

    public void setChanges(java.nio.ByteBuffer changes) {
        this.changes = changes;
    }

    /**
     * <p>
     * The entries to add to the dataset.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The entries to add to the dataset.
     */

    public java.nio.ByteBuffer getChanges() {
        return this.changes;
    }

    /**
     * <p>
     * The entries to add to the dataset.
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
     * @param changes
     *        The entries to add to the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetEntriesRequest withChanges(java.nio.ByteBuffer changes) {
        setChanges(changes);
        return this;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>UpdateDatasetEntries</code> completes only once.
     * You choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>UpdateDatasetEntries</code>. In this case, safely retry your call to
     * <code>UpdateDatasetEntries</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     * the other input parameters are not the same as in the first request. Using a different value for
     * <code>ClientToken</code> is considered a new call to <code>UpdateDatasetEntries</code>. An idempotency token is
     * active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>UpdateDatasetEntries</code> completes
     *        only once. You choose the value to pass. For example, An issue, such as an network outage, might prevent
     *        you from getting a response from <code>UpdateDatasetEntries</code>. In this case, safely retry your call
     *        to <code>UpdateDatasetEntries</code> by using the same <code>ClientToken</code> parameter value. An error
     *        occurs if the other input parameters are not the same as in the first request. Using a different value for
     *        <code>ClientToken</code> is considered a new call to <code>UpdateDatasetEntries</code>. An idempotency
     *        token is active for 8 hours.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>UpdateDatasetEntries</code> completes only once.
     * You choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>UpdateDatasetEntries</code>. In this case, safely retry your call to
     * <code>UpdateDatasetEntries</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     * the other input parameters are not the same as in the first request. Using a different value for
     * <code>ClientToken</code> is considered a new call to <code>UpdateDatasetEntries</code>. An idempotency token is
     * active for 8 hours.
     * </p>
     * 
     * @return ClientToken is an idempotency token that ensures a call to <code>UpdateDatasetEntries</code> completes
     *         only once. You choose the value to pass. For example, An issue, such as an network outage, might prevent
     *         you from getting a response from <code>UpdateDatasetEntries</code>. In this case, safely retry your call
     *         to <code>UpdateDatasetEntries</code> by using the same <code>ClientToken</code> parameter value. An error
     *         occurs if the other input parameters are not the same as in the first request. Using a different value
     *         for <code>ClientToken</code> is considered a new call to <code>UpdateDatasetEntries</code>. An
     *         idempotency token is active for 8 hours.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>UpdateDatasetEntries</code> completes only once.
     * You choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>UpdateDatasetEntries</code>. In this case, safely retry your call to
     * <code>UpdateDatasetEntries</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     * the other input parameters are not the same as in the first request. Using a different value for
     * <code>ClientToken</code> is considered a new call to <code>UpdateDatasetEntries</code>. An idempotency token is
     * active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>UpdateDatasetEntries</code> completes
     *        only once. You choose the value to pass. For example, An issue, such as an network outage, might prevent
     *        you from getting a response from <code>UpdateDatasetEntries</code>. In this case, safely retry your call
     *        to <code>UpdateDatasetEntries</code> by using the same <code>ClientToken</code> parameter value. An error
     *        occurs if the other input parameters are not the same as in the first request. Using a different value for
     *        <code>ClientToken</code> is considered a new call to <code>UpdateDatasetEntries</code>. An idempotency
     *        token is active for 8 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetEntriesRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
        if (getChanges() != null)
            sb.append("Changes: ").append(getChanges()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDatasetEntriesRequest == false)
            return false;
        UpdateDatasetEntriesRequest other = (UpdateDatasetEntriesRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getChanges() == null ^ this.getChanges() == null)
            return false;
        if (other.getChanges() != null && other.getChanges().equals(this.getChanges()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getChanges() == null) ? 0 : getChanges().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDatasetEntriesRequest clone() {
        return (UpdateDatasetEntriesRequest) super.clone();
    }

}
