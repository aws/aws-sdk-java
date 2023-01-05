/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes updates or additions to a dataset. A Single update or addition is an entry (JSON Line) that provides
 * information about a single image. To update an existing entry, you match the <code>source-ref</code> field of the
 * update entry with the <code>source-ref</code> filed of the entry that you want to update. If the
 * <code>source-ref</code> field doesn't match an existing entry, the entry is added to dataset as a new entry.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetChanges implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Base64-encoded binary data object containing one or JSON lines that either update the dataset or are additions
     * to the dataset. You change a dataset by calling <a>UpdateDatasetEntries</a>. If you are using an AWS SDK to call
     * <code>UpdateDatasetEntries</code>, you don't need to encode <code>Changes</code> as the SDK encodes the data for
     * you.
     * </p>
     * <p>
     * For example JSON lines, see Image-Level labels in manifest files and and Object localization in manifest files in
     * the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     */
    private java.nio.ByteBuffer groundTruth;

    /**
     * <p>
     * A Base64-encoded binary data object containing one or JSON lines that either update the dataset or are additions
     * to the dataset. You change a dataset by calling <a>UpdateDatasetEntries</a>. If you are using an AWS SDK to call
     * <code>UpdateDatasetEntries</code>, you don't need to encode <code>Changes</code> as the SDK encodes the data for
     * you.
     * </p>
     * <p>
     * For example JSON lines, see Image-Level labels in manifest files and and Object localization in manifest files in
     * the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
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
     * @param groundTruth
     *        A Base64-encoded binary data object containing one or JSON lines that either update the dataset or are
     *        additions to the dataset. You change a dataset by calling <a>UpdateDatasetEntries</a>. If you are using an
     *        AWS SDK to call <code>UpdateDatasetEntries</code>, you don't need to encode <code>Changes</code> as the
     *        SDK encodes the data for you. </p>
     *        <p>
     *        For example JSON lines, see Image-Level labels in manifest files and and Object localization in manifest
     *        files in the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     */

    public void setGroundTruth(java.nio.ByteBuffer groundTruth) {
        this.groundTruth = groundTruth;
    }

    /**
     * <p>
     * A Base64-encoded binary data object containing one or JSON lines that either update the dataset or are additions
     * to the dataset. You change a dataset by calling <a>UpdateDatasetEntries</a>. If you are using an AWS SDK to call
     * <code>UpdateDatasetEntries</code>, you don't need to encode <code>Changes</code> as the SDK encodes the data for
     * you.
     * </p>
     * <p>
     * For example JSON lines, see Image-Level labels in manifest files and and Object localization in manifest files in
     * the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A Base64-encoded binary data object containing one or JSON lines that either update the dataset or are
     *         additions to the dataset. You change a dataset by calling <a>UpdateDatasetEntries</a>. If you are using
     *         an AWS SDK to call <code>UpdateDatasetEntries</code>, you don't need to encode <code>Changes</code> as
     *         the SDK encodes the data for you. </p>
     *         <p>
     *         For example JSON lines, see Image-Level labels in manifest files and and Object localization in manifest
     *         files in the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     */

    public java.nio.ByteBuffer getGroundTruth() {
        return this.groundTruth;
    }

    /**
     * <p>
     * A Base64-encoded binary data object containing one or JSON lines that either update the dataset or are additions
     * to the dataset. You change a dataset by calling <a>UpdateDatasetEntries</a>. If you are using an AWS SDK to call
     * <code>UpdateDatasetEntries</code>, you don't need to encode <code>Changes</code> as the SDK encodes the data for
     * you.
     * </p>
     * <p>
     * For example JSON lines, see Image-Level labels in manifest files and and Object localization in manifest files in
     * the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
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
     * @param groundTruth
     *        A Base64-encoded binary data object containing one or JSON lines that either update the dataset or are
     *        additions to the dataset. You change a dataset by calling <a>UpdateDatasetEntries</a>. If you are using an
     *        AWS SDK to call <code>UpdateDatasetEntries</code>, you don't need to encode <code>Changes</code> as the
     *        SDK encodes the data for you. </p>
     *        <p>
     *        For example JSON lines, see Image-Level labels in manifest files and and Object localization in manifest
     *        files in the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetChanges withGroundTruth(java.nio.ByteBuffer groundTruth) {
        setGroundTruth(groundTruth);
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
        if (getGroundTruth() != null)
            sb.append("GroundTruth: ").append(getGroundTruth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetChanges == false)
            return false;
        DatasetChanges other = (DatasetChanges) obj;
        if (other.getGroundTruth() == null ^ this.getGroundTruth() == null)
            return false;
        if (other.getGroundTruth() != null && other.getGroundTruth().equals(this.getGroundTruth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroundTruth() == null) ? 0 : getGroundTruth().hashCode());
        return hashCode;
    }

    @Override
    public DatasetChanges clone() {
        try {
            return (DatasetChanges) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DatasetChangesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
