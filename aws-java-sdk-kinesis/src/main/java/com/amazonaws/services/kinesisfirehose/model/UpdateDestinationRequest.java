/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for <a>UpdateDestination</a>.
 * </p>
 */
public class UpdateDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     */
    private String deliveryStreamName;
    /**
     * <p>
     * Obtain this value from the <b>VersionId</b> result of the <a>DeliveryStreamDescription</a> operation. This value
     * is required, and helps the service to perform conditional operations. For example, if there is a interleaving
     * update and this value is null, then the update destination fails. After the update is successful, the
     * <b>VersionId</b> value is updated. The service then performs a merge of the old configuration with the new
     * configuration.
     * </p>
     */
    private String currentDeliveryStreamVersionId;
    /**
     * <p>
     * The ID of the destination.
     * </p>
     */
    private String destinationId;
    /**
     * <p>
     * Describes an update for a destination in Amazon S3.
     * </p>
     */
    private S3DestinationUpdate s3DestinationUpdate;
    /**
     * <p>
     * Describes an update for a destination in Amazon Redshift.
     * </p>
     */
    private RedshiftDestinationUpdate redshiftDestinationUpdate;
    /**
     * <p>
     * Describes an update for a destination in Amazon ES.
     * </p>
     */
    private ElasticsearchDestinationUpdate elasticsearchDestinationUpdate;

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

    public UpdateDestinationRequest withDeliveryStreamName(String deliveryStreamName) {
        setDeliveryStreamName(deliveryStreamName);
        return this;
    }

    /**
     * <p>
     * Obtain this value from the <b>VersionId</b> result of the <a>DeliveryStreamDescription</a> operation. This value
     * is required, and helps the service to perform conditional operations. For example, if there is a interleaving
     * update and this value is null, then the update destination fails. After the update is successful, the
     * <b>VersionId</b> value is updated. The service then performs a merge of the old configuration with the new
     * configuration.
     * </p>
     * 
     * @param currentDeliveryStreamVersionId
     *        Obtain this value from the <b>VersionId</b> result of the <a>DeliveryStreamDescription</a> operation. This
     *        value is required, and helps the service to perform conditional operations. For example, if there is a
     *        interleaving update and this value is null, then the update destination fails. After the update is
     *        successful, the <b>VersionId</b> value is updated. The service then performs a merge of the old
     *        configuration with the new configuration.
     */

    public void setCurrentDeliveryStreamVersionId(String currentDeliveryStreamVersionId) {
        this.currentDeliveryStreamVersionId = currentDeliveryStreamVersionId;
    }

    /**
     * <p>
     * Obtain this value from the <b>VersionId</b> result of the <a>DeliveryStreamDescription</a> operation. This value
     * is required, and helps the service to perform conditional operations. For example, if there is a interleaving
     * update and this value is null, then the update destination fails. After the update is successful, the
     * <b>VersionId</b> value is updated. The service then performs a merge of the old configuration with the new
     * configuration.
     * </p>
     * 
     * @return Obtain this value from the <b>VersionId</b> result of the <a>DeliveryStreamDescription</a> operation.
     *         This value is required, and helps the service to perform conditional operations. For example, if there is
     *         a interleaving update and this value is null, then the update destination fails. After the update is
     *         successful, the <b>VersionId</b> value is updated. The service then performs a merge of the old
     *         configuration with the new configuration.
     */

    public String getCurrentDeliveryStreamVersionId() {
        return this.currentDeliveryStreamVersionId;
    }

    /**
     * <p>
     * Obtain this value from the <b>VersionId</b> result of the <a>DeliveryStreamDescription</a> operation. This value
     * is required, and helps the service to perform conditional operations. For example, if there is a interleaving
     * update and this value is null, then the update destination fails. After the update is successful, the
     * <b>VersionId</b> value is updated. The service then performs a merge of the old configuration with the new
     * configuration.
     * </p>
     * 
     * @param currentDeliveryStreamVersionId
     *        Obtain this value from the <b>VersionId</b> result of the <a>DeliveryStreamDescription</a> operation. This
     *        value is required, and helps the service to perform conditional operations. For example, if there is a
     *        interleaving update and this value is null, then the update destination fails. After the update is
     *        successful, the <b>VersionId</b> value is updated. The service then performs a merge of the old
     *        configuration with the new configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDestinationRequest withCurrentDeliveryStreamVersionId(String currentDeliveryStreamVersionId) {
        setCurrentDeliveryStreamVersionId(currentDeliveryStreamVersionId);
        return this;
    }

    /**
     * <p>
     * The ID of the destination.
     * </p>
     * 
     * @param destinationId
     *        The ID of the destination.
     */

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * <p>
     * The ID of the destination.
     * </p>
     * 
     * @return The ID of the destination.
     */

    public String getDestinationId() {
        return this.destinationId;
    }

    /**
     * <p>
     * The ID of the destination.
     * </p>
     * 
     * @param destinationId
     *        The ID of the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDestinationRequest withDestinationId(String destinationId) {
        setDestinationId(destinationId);
        return this;
    }

    /**
     * <p>
     * Describes an update for a destination in Amazon S3.
     * </p>
     * 
     * @param s3DestinationUpdate
     *        Describes an update for a destination in Amazon S3.
     */

    public void setS3DestinationUpdate(S3DestinationUpdate s3DestinationUpdate) {
        this.s3DestinationUpdate = s3DestinationUpdate;
    }

    /**
     * <p>
     * Describes an update for a destination in Amazon S3.
     * </p>
     * 
     * @return Describes an update for a destination in Amazon S3.
     */

    public S3DestinationUpdate getS3DestinationUpdate() {
        return this.s3DestinationUpdate;
    }

    /**
     * <p>
     * Describes an update for a destination in Amazon S3.
     * </p>
     * 
     * @param s3DestinationUpdate
     *        Describes an update for a destination in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDestinationRequest withS3DestinationUpdate(S3DestinationUpdate s3DestinationUpdate) {
        setS3DestinationUpdate(s3DestinationUpdate);
        return this;
    }

    /**
     * <p>
     * Describes an update for a destination in Amazon Redshift.
     * </p>
     * 
     * @param redshiftDestinationUpdate
     *        Describes an update for a destination in Amazon Redshift.
     */

    public void setRedshiftDestinationUpdate(RedshiftDestinationUpdate redshiftDestinationUpdate) {
        this.redshiftDestinationUpdate = redshiftDestinationUpdate;
    }

    /**
     * <p>
     * Describes an update for a destination in Amazon Redshift.
     * </p>
     * 
     * @return Describes an update for a destination in Amazon Redshift.
     */

    public RedshiftDestinationUpdate getRedshiftDestinationUpdate() {
        return this.redshiftDestinationUpdate;
    }

    /**
     * <p>
     * Describes an update for a destination in Amazon Redshift.
     * </p>
     * 
     * @param redshiftDestinationUpdate
     *        Describes an update for a destination in Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDestinationRequest withRedshiftDestinationUpdate(RedshiftDestinationUpdate redshiftDestinationUpdate) {
        setRedshiftDestinationUpdate(redshiftDestinationUpdate);
        return this;
    }

    /**
     * <p>
     * Describes an update for a destination in Amazon ES.
     * </p>
     * 
     * @param elasticsearchDestinationUpdate
     *        Describes an update for a destination in Amazon ES.
     */

    public void setElasticsearchDestinationUpdate(ElasticsearchDestinationUpdate elasticsearchDestinationUpdate) {
        this.elasticsearchDestinationUpdate = elasticsearchDestinationUpdate;
    }

    /**
     * <p>
     * Describes an update for a destination in Amazon ES.
     * </p>
     * 
     * @return Describes an update for a destination in Amazon ES.
     */

    public ElasticsearchDestinationUpdate getElasticsearchDestinationUpdate() {
        return this.elasticsearchDestinationUpdate;
    }

    /**
     * <p>
     * Describes an update for a destination in Amazon ES.
     * </p>
     * 
     * @param elasticsearchDestinationUpdate
     *        Describes an update for a destination in Amazon ES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDestinationRequest withElasticsearchDestinationUpdate(ElasticsearchDestinationUpdate elasticsearchDestinationUpdate) {
        setElasticsearchDestinationUpdate(elasticsearchDestinationUpdate);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DeliveryStreamName: " + getDeliveryStreamName() + ",");
        if (getCurrentDeliveryStreamVersionId() != null)
            sb.append("CurrentDeliveryStreamVersionId: " + getCurrentDeliveryStreamVersionId() + ",");
        if (getDestinationId() != null)
            sb.append("DestinationId: " + getDestinationId() + ",");
        if (getS3DestinationUpdate() != null)
            sb.append("S3DestinationUpdate: " + getS3DestinationUpdate() + ",");
        if (getRedshiftDestinationUpdate() != null)
            sb.append("RedshiftDestinationUpdate: " + getRedshiftDestinationUpdate() + ",");
        if (getElasticsearchDestinationUpdate() != null)
            sb.append("ElasticsearchDestinationUpdate: " + getElasticsearchDestinationUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDestinationRequest == false)
            return false;
        UpdateDestinationRequest other = (UpdateDestinationRequest) obj;
        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false)
            return false;
        if (other.getCurrentDeliveryStreamVersionId() == null ^ this.getCurrentDeliveryStreamVersionId() == null)
            return false;
        if (other.getCurrentDeliveryStreamVersionId() != null
                && other.getCurrentDeliveryStreamVersionId().equals(this.getCurrentDeliveryStreamVersionId()) == false)
            return false;
        if (other.getDestinationId() == null ^ this.getDestinationId() == null)
            return false;
        if (other.getDestinationId() != null && other.getDestinationId().equals(this.getDestinationId()) == false)
            return false;
        if (other.getS3DestinationUpdate() == null ^ this.getS3DestinationUpdate() == null)
            return false;
        if (other.getS3DestinationUpdate() != null && other.getS3DestinationUpdate().equals(this.getS3DestinationUpdate()) == false)
            return false;
        if (other.getRedshiftDestinationUpdate() == null ^ this.getRedshiftDestinationUpdate() == null)
            return false;
        if (other.getRedshiftDestinationUpdate() != null && other.getRedshiftDestinationUpdate().equals(this.getRedshiftDestinationUpdate()) == false)
            return false;
        if (other.getElasticsearchDestinationUpdate() == null ^ this.getElasticsearchDestinationUpdate() == null)
            return false;
        if (other.getElasticsearchDestinationUpdate() != null
                && other.getElasticsearchDestinationUpdate().equals(this.getElasticsearchDestinationUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode());
        hashCode = prime * hashCode + ((getCurrentDeliveryStreamVersionId() == null) ? 0 : getCurrentDeliveryStreamVersionId().hashCode());
        hashCode = prime * hashCode + ((getDestinationId() == null) ? 0 : getDestinationId().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationUpdate() == null) ? 0 : getS3DestinationUpdate().hashCode());
        hashCode = prime * hashCode + ((getRedshiftDestinationUpdate() == null) ? 0 : getRedshiftDestinationUpdate().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchDestinationUpdate() == null) ? 0 : getElasticsearchDestinationUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDestinationRequest clone() {
        return (UpdateDestinationRequest) super.clone();
    }
}
