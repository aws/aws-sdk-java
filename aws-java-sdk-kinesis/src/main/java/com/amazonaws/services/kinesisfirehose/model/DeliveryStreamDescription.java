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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a delivery stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DeliveryStreamDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliveryStreamDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     */
    private String deliveryStreamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     */
    private String deliveryStreamARN;
    /**
     * <p>
     * The status of the delivery stream.
     * </p>
     */
    private String deliveryStreamStatus;
    /**
     * <p>
     * Indicates the server-side encryption (SSE) status for the delivery stream.
     * </p>
     */
    private DeliveryStreamEncryptionConfiguration deliveryStreamEncryptionConfiguration;
    /**
     * <p>
     * The delivery stream type. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     * </p>
     * </li>
     * </ul>
     */
    private String deliveryStreamType;
    /**
     * <p>
     * Each time the destination is updated for a delivery stream, the version ID is changed, and the current version ID
     * is required when updating the destination. This is so that the service knows it is applying the changes to the
     * correct version of the delivery stream.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * The date and time that the delivery stream was created.
     * </p>
     */
    private java.util.Date createTimestamp;
    /**
     * <p>
     * The date and time that the delivery stream was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTimestamp;
    /**
     * <p>
     * If the <code>DeliveryStreamType</code> parameter is <code>KinesisStreamAsSource</code>, a
     * <a>SourceDescription</a> object describing the source Kinesis data stream.
     * </p>
     */
    private SourceDescription source;
    /**
     * <p>
     * The destinations.
     * </p>
     */
    private java.util.List<DestinationDescription> destinations;
    /**
     * <p>
     * Indicates whether there are more destinations available to list.
     * </p>
     */
    private Boolean hasMoreDestinations;

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream.
     */

    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @return The name of the delivery stream.
     */

    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withDeliveryStreamName(String deliveryStreamName) {
        setDeliveryStreamName(deliveryStreamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param deliveryStreamARN
     *        The Amazon Resource Name (ARN) of the delivery stream. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     */

    public void setDeliveryStreamARN(String deliveryStreamARN) {
        this.deliveryStreamARN = deliveryStreamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the delivery stream. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a>.
     */

    public String getDeliveryStreamARN() {
        return this.deliveryStreamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param deliveryStreamARN
     *        The Amazon Resource Name (ARN) of the delivery stream. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withDeliveryStreamARN(String deliveryStreamARN) {
        setDeliveryStreamARN(deliveryStreamARN);
        return this;
    }

    /**
     * <p>
     * The status of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamStatus
     *        The status of the delivery stream.
     * @see DeliveryStreamStatus
     */

    public void setDeliveryStreamStatus(String deliveryStreamStatus) {
        this.deliveryStreamStatus = deliveryStreamStatus;
    }

    /**
     * <p>
     * The status of the delivery stream.
     * </p>
     * 
     * @return The status of the delivery stream.
     * @see DeliveryStreamStatus
     */

    public String getDeliveryStreamStatus() {
        return this.deliveryStreamStatus;
    }

    /**
     * <p>
     * The status of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamStatus
     *        The status of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamStatus
     */

    public DeliveryStreamDescription withDeliveryStreamStatus(String deliveryStreamStatus) {
        setDeliveryStreamStatus(deliveryStreamStatus);
        return this;
    }

    /**
     * <p>
     * The status of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamStatus
     *        The status of the delivery stream.
     * @see DeliveryStreamStatus
     */

    public void setDeliveryStreamStatus(DeliveryStreamStatus deliveryStreamStatus) {
        withDeliveryStreamStatus(deliveryStreamStatus);
    }

    /**
     * <p>
     * The status of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamStatus
     *        The status of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamStatus
     */

    public DeliveryStreamDescription withDeliveryStreamStatus(DeliveryStreamStatus deliveryStreamStatus) {
        this.deliveryStreamStatus = deliveryStreamStatus.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the server-side encryption (SSE) status for the delivery stream.
     * </p>
     * 
     * @param deliveryStreamEncryptionConfiguration
     *        Indicates the server-side encryption (SSE) status for the delivery stream.
     */

    public void setDeliveryStreamEncryptionConfiguration(DeliveryStreamEncryptionConfiguration deliveryStreamEncryptionConfiguration) {
        this.deliveryStreamEncryptionConfiguration = deliveryStreamEncryptionConfiguration;
    }

    /**
     * <p>
     * Indicates the server-side encryption (SSE) status for the delivery stream.
     * </p>
     * 
     * @return Indicates the server-side encryption (SSE) status for the delivery stream.
     */

    public DeliveryStreamEncryptionConfiguration getDeliveryStreamEncryptionConfiguration() {
        return this.deliveryStreamEncryptionConfiguration;
    }

    /**
     * <p>
     * Indicates the server-side encryption (SSE) status for the delivery stream.
     * </p>
     * 
     * @param deliveryStreamEncryptionConfiguration
     *        Indicates the server-side encryption (SSE) status for the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withDeliveryStreamEncryptionConfiguration(DeliveryStreamEncryptionConfiguration deliveryStreamEncryptionConfiguration) {
        setDeliveryStreamEncryptionConfiguration(deliveryStreamEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The delivery stream type. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliveryStreamType
     *        The delivery stream type. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     *        </p>
     *        </li>
     * @see DeliveryStreamType
     */

    public void setDeliveryStreamType(String deliveryStreamType) {
        this.deliveryStreamType = deliveryStreamType;
    }

    /**
     * <p>
     * The delivery stream type. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The delivery stream type. This can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     *         </p>
     *         </li>
     * @see DeliveryStreamType
     */

    public String getDeliveryStreamType() {
        return this.deliveryStreamType;
    }

    /**
     * <p>
     * The delivery stream type. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliveryStreamType
     *        The delivery stream type. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamType
     */

    public DeliveryStreamDescription withDeliveryStreamType(String deliveryStreamType) {
        setDeliveryStreamType(deliveryStreamType);
        return this;
    }

    /**
     * <p>
     * The delivery stream type. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliveryStreamType
     *        The delivery stream type. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     *        </p>
     *        </li>
     * @see DeliveryStreamType
     */

    public void setDeliveryStreamType(DeliveryStreamType deliveryStreamType) {
        withDeliveryStreamType(deliveryStreamType);
    }

    /**
     * <p>
     * The delivery stream type. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliveryStreamType
     *        The delivery stream type. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamType
     */

    public DeliveryStreamDescription withDeliveryStreamType(DeliveryStreamType deliveryStreamType) {
        this.deliveryStreamType = deliveryStreamType.toString();
        return this;
    }

    /**
     * <p>
     * Each time the destination is updated for a delivery stream, the version ID is changed, and the current version ID
     * is required when updating the destination. This is so that the service knows it is applying the changes to the
     * correct version of the delivery stream.
     * </p>
     * 
     * @param versionId
     *        Each time the destination is updated for a delivery stream, the version ID is changed, and the current
     *        version ID is required when updating the destination. This is so that the service knows it is applying the
     *        changes to the correct version of the delivery stream.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Each time the destination is updated for a delivery stream, the version ID is changed, and the current version ID
     * is required when updating the destination. This is so that the service knows it is applying the changes to the
     * correct version of the delivery stream.
     * </p>
     * 
     * @return Each time the destination is updated for a delivery stream, the version ID is changed, and the current
     *         version ID is required when updating the destination. This is so that the service knows it is applying
     *         the changes to the correct version of the delivery stream.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * Each time the destination is updated for a delivery stream, the version ID is changed, and the current version ID
     * is required when updating the destination. This is so that the service knows it is applying the changes to the
     * correct version of the delivery stream.
     * </p>
     * 
     * @param versionId
     *        Each time the destination is updated for a delivery stream, the version ID is changed, and the current
     *        version ID is required when updating the destination. This is so that the service knows it is applying the
     *        changes to the correct version of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * The date and time that the delivery stream was created.
     * </p>
     * 
     * @param createTimestamp
     *        The date and time that the delivery stream was created.
     */

    public void setCreateTimestamp(java.util.Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * <p>
     * The date and time that the delivery stream was created.
     * </p>
     * 
     * @return The date and time that the delivery stream was created.
     */

    public java.util.Date getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * <p>
     * The date and time that the delivery stream was created.
     * </p>
     * 
     * @param createTimestamp
     *        The date and time that the delivery stream was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withCreateTimestamp(java.util.Date createTimestamp) {
        setCreateTimestamp(createTimestamp);
        return this;
    }

    /**
     * <p>
     * The date and time that the delivery stream was last updated.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The date and time that the delivery stream was last updated.
     */

    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    /**
     * <p>
     * The date and time that the delivery stream was last updated.
     * </p>
     * 
     * @return The date and time that the delivery stream was last updated.
     */

    public java.util.Date getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    /**
     * <p>
     * The date and time that the delivery stream was last updated.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The date and time that the delivery stream was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        setLastUpdateTimestamp(lastUpdateTimestamp);
        return this;
    }

    /**
     * <p>
     * If the <code>DeliveryStreamType</code> parameter is <code>KinesisStreamAsSource</code>, a
     * <a>SourceDescription</a> object describing the source Kinesis data stream.
     * </p>
     * 
     * @param source
     *        If the <code>DeliveryStreamType</code> parameter is <code>KinesisStreamAsSource</code>, a
     *        <a>SourceDescription</a> object describing the source Kinesis data stream.
     */

    public void setSource(SourceDescription source) {
        this.source = source;
    }

    /**
     * <p>
     * If the <code>DeliveryStreamType</code> parameter is <code>KinesisStreamAsSource</code>, a
     * <a>SourceDescription</a> object describing the source Kinesis data stream.
     * </p>
     * 
     * @return If the <code>DeliveryStreamType</code> parameter is <code>KinesisStreamAsSource</code>, a
     *         <a>SourceDescription</a> object describing the source Kinesis data stream.
     */

    public SourceDescription getSource() {
        return this.source;
    }

    /**
     * <p>
     * If the <code>DeliveryStreamType</code> parameter is <code>KinesisStreamAsSource</code>, a
     * <a>SourceDescription</a> object describing the source Kinesis data stream.
     * </p>
     * 
     * @param source
     *        If the <code>DeliveryStreamType</code> parameter is <code>KinesisStreamAsSource</code>, a
     *        <a>SourceDescription</a> object describing the source Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withSource(SourceDescription source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The destinations.
     * </p>
     * 
     * @return The destinations.
     */

    public java.util.List<DestinationDescription> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * The destinations.
     * </p>
     * 
     * @param destinations
     *        The destinations.
     */

    public void setDestinations(java.util.Collection<DestinationDescription> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<DestinationDescription>(destinations);
    }

    /**
     * <p>
     * The destinations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        The destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withDestinations(DestinationDescription... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<DestinationDescription>(destinations.length));
        }
        for (DestinationDescription ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destinations.
     * </p>
     * 
     * @param destinations
     *        The destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withDestinations(java.util.Collection<DestinationDescription> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are more destinations available to list.
     * </p>
     * 
     * @param hasMoreDestinations
     *        Indicates whether there are more destinations available to list.
     */

    public void setHasMoreDestinations(Boolean hasMoreDestinations) {
        this.hasMoreDestinations = hasMoreDestinations;
    }

    /**
     * <p>
     * Indicates whether there are more destinations available to list.
     * </p>
     * 
     * @return Indicates whether there are more destinations available to list.
     */

    public Boolean getHasMoreDestinations() {
        return this.hasMoreDestinations;
    }

    /**
     * <p>
     * Indicates whether there are more destinations available to list.
     * </p>
     * 
     * @param hasMoreDestinations
     *        Indicates whether there are more destinations available to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withHasMoreDestinations(Boolean hasMoreDestinations) {
        setHasMoreDestinations(hasMoreDestinations);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are more destinations available to list.
     * </p>
     * 
     * @return Indicates whether there are more destinations available to list.
     */

    public Boolean isHasMoreDestinations() {
        return this.hasMoreDestinations;
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
        if (getDeliveryStreamName() != null)
            sb.append("DeliveryStreamName: ").append(getDeliveryStreamName()).append(",");
        if (getDeliveryStreamARN() != null)
            sb.append("DeliveryStreamARN: ").append(getDeliveryStreamARN()).append(",");
        if (getDeliveryStreamStatus() != null)
            sb.append("DeliveryStreamStatus: ").append(getDeliveryStreamStatus()).append(",");
        if (getDeliveryStreamEncryptionConfiguration() != null)
            sb.append("DeliveryStreamEncryptionConfiguration: ").append(getDeliveryStreamEncryptionConfiguration()).append(",");
        if (getDeliveryStreamType() != null)
            sb.append("DeliveryStreamType: ").append(getDeliveryStreamType()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getCreateTimestamp() != null)
            sb.append("CreateTimestamp: ").append(getCreateTimestamp()).append(",");
        if (getLastUpdateTimestamp() != null)
            sb.append("LastUpdateTimestamp: ").append(getLastUpdateTimestamp()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getHasMoreDestinations() != null)
            sb.append("HasMoreDestinations: ").append(getHasMoreDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliveryStreamDescription == false)
            return false;
        DeliveryStreamDescription other = (DeliveryStreamDescription) obj;
        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false)
            return false;
        if (other.getDeliveryStreamARN() == null ^ this.getDeliveryStreamARN() == null)
            return false;
        if (other.getDeliveryStreamARN() != null && other.getDeliveryStreamARN().equals(this.getDeliveryStreamARN()) == false)
            return false;
        if (other.getDeliveryStreamStatus() == null ^ this.getDeliveryStreamStatus() == null)
            return false;
        if (other.getDeliveryStreamStatus() != null && other.getDeliveryStreamStatus().equals(this.getDeliveryStreamStatus()) == false)
            return false;
        if (other.getDeliveryStreamEncryptionConfiguration() == null ^ this.getDeliveryStreamEncryptionConfiguration() == null)
            return false;
        if (other.getDeliveryStreamEncryptionConfiguration() != null
                && other.getDeliveryStreamEncryptionConfiguration().equals(this.getDeliveryStreamEncryptionConfiguration()) == false)
            return false;
        if (other.getDeliveryStreamType() == null ^ this.getDeliveryStreamType() == null)
            return false;
        if (other.getDeliveryStreamType() != null && other.getDeliveryStreamType().equals(this.getDeliveryStreamType()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getCreateTimestamp() == null ^ this.getCreateTimestamp() == null)
            return false;
        if (other.getCreateTimestamp() != null && other.getCreateTimestamp().equals(this.getCreateTimestamp()) == false)
            return false;
        if (other.getLastUpdateTimestamp() == null ^ this.getLastUpdateTimestamp() == null)
            return false;
        if (other.getLastUpdateTimestamp() != null && other.getLastUpdateTimestamp().equals(this.getLastUpdateTimestamp()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getHasMoreDestinations() == null ^ this.getHasMoreDestinations() == null)
            return false;
        if (other.getHasMoreDestinations() != null && other.getHasMoreDestinations().equals(this.getHasMoreDestinations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStreamARN() == null) ? 0 : getDeliveryStreamARN().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStreamStatus() == null) ? 0 : getDeliveryStreamStatus().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStreamEncryptionConfiguration() == null) ? 0 : getDeliveryStreamEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStreamType() == null) ? 0 : getDeliveryStreamType().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTimestamp() == null) ? 0 : getLastUpdateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getHasMoreDestinations() == null) ? 0 : getHasMoreDestinations().hashCode());
        return hashCode;
    }

    @Override
    public DeliveryStreamDescription clone() {
        try {
            return (DeliveryStreamDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.DeliveryStreamDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
