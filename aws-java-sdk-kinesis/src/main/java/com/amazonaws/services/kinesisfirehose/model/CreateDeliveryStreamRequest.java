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
 * Contains the parameters for <a>CreateDeliveryStream</a>.
 * </p>
 */
public class CreateDeliveryStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     */
    private String deliveryStreamName;
    /**
     * <p>
     * The destination in Amazon S3. This value must be specified if <b>ElasticsearchDestinationConfiguration</b> or
     * <b>RedshiftDestinationConfiguration</b> is specified (see restrictions listed above).
     * </p>
     */
    private S3DestinationConfiguration s3DestinationConfiguration;
    /**
     * <p>
     * The destination in Amazon Redshift. This value cannot be specified if Amazon S3 or Amazon Elasticsearch is the
     * desired destination (see restrictions listed above).
     * </p>
     */
    private RedshiftDestinationConfiguration redshiftDestinationConfiguration;
    /**
     * <p>
     * The destination in Amazon ES. This value cannot be specified if Amazon S3 or Amazon Redshift is the desired
     * destination (see restrictions listed above).
     * </p>
     */
    private ElasticsearchDestinationConfiguration elasticsearchDestinationConfiguration;

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

    public CreateDeliveryStreamRequest withDeliveryStreamName(String deliveryStreamName) {
        setDeliveryStreamName(deliveryStreamName);
        return this;
    }

    /**
     * <p>
     * The destination in Amazon S3. This value must be specified if <b>ElasticsearchDestinationConfiguration</b> or
     * <b>RedshiftDestinationConfiguration</b> is specified (see restrictions listed above).
     * </p>
     * 
     * @param s3DestinationConfiguration
     *        The destination in Amazon S3. This value must be specified if <b>ElasticsearchDestinationConfiguration</b>
     *        or <b>RedshiftDestinationConfiguration</b> is specified (see restrictions listed above).
     */

    public void setS3DestinationConfiguration(S3DestinationConfiguration s3DestinationConfiguration) {
        this.s3DestinationConfiguration = s3DestinationConfiguration;
    }

    /**
     * <p>
     * The destination in Amazon S3. This value must be specified if <b>ElasticsearchDestinationConfiguration</b> or
     * <b>RedshiftDestinationConfiguration</b> is specified (see restrictions listed above).
     * </p>
     * 
     * @return The destination in Amazon S3. This value must be specified if
     *         <b>ElasticsearchDestinationConfiguration</b> or <b>RedshiftDestinationConfiguration</b> is specified (see
     *         restrictions listed above).
     */

    public S3DestinationConfiguration getS3DestinationConfiguration() {
        return this.s3DestinationConfiguration;
    }

    /**
     * <p>
     * The destination in Amazon S3. This value must be specified if <b>ElasticsearchDestinationConfiguration</b> or
     * <b>RedshiftDestinationConfiguration</b> is specified (see restrictions listed above).
     * </p>
     * 
     * @param s3DestinationConfiguration
     *        The destination in Amazon S3. This value must be specified if <b>ElasticsearchDestinationConfiguration</b>
     *        or <b>RedshiftDestinationConfiguration</b> is specified (see restrictions listed above).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryStreamRequest withS3DestinationConfiguration(S3DestinationConfiguration s3DestinationConfiguration) {
        setS3DestinationConfiguration(s3DestinationConfiguration);
        return this;
    }

    /**
     * <p>
     * The destination in Amazon Redshift. This value cannot be specified if Amazon S3 or Amazon Elasticsearch is the
     * desired destination (see restrictions listed above).
     * </p>
     * 
     * @param redshiftDestinationConfiguration
     *        The destination in Amazon Redshift. This value cannot be specified if Amazon S3 or Amazon Elasticsearch is
     *        the desired destination (see restrictions listed above).
     */

    public void setRedshiftDestinationConfiguration(RedshiftDestinationConfiguration redshiftDestinationConfiguration) {
        this.redshiftDestinationConfiguration = redshiftDestinationConfiguration;
    }

    /**
     * <p>
     * The destination in Amazon Redshift. This value cannot be specified if Amazon S3 or Amazon Elasticsearch is the
     * desired destination (see restrictions listed above).
     * </p>
     * 
     * @return The destination in Amazon Redshift. This value cannot be specified if Amazon S3 or Amazon Elasticsearch
     *         is the desired destination (see restrictions listed above).
     */

    public RedshiftDestinationConfiguration getRedshiftDestinationConfiguration() {
        return this.redshiftDestinationConfiguration;
    }

    /**
     * <p>
     * The destination in Amazon Redshift. This value cannot be specified if Amazon S3 or Amazon Elasticsearch is the
     * desired destination (see restrictions listed above).
     * </p>
     * 
     * @param redshiftDestinationConfiguration
     *        The destination in Amazon Redshift. This value cannot be specified if Amazon S3 or Amazon Elasticsearch is
     *        the desired destination (see restrictions listed above).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryStreamRequest withRedshiftDestinationConfiguration(RedshiftDestinationConfiguration redshiftDestinationConfiguration) {
        setRedshiftDestinationConfiguration(redshiftDestinationConfiguration);
        return this;
    }

    /**
     * <p>
     * The destination in Amazon ES. This value cannot be specified if Amazon S3 or Amazon Redshift is the desired
     * destination (see restrictions listed above).
     * </p>
     * 
     * @param elasticsearchDestinationConfiguration
     *        The destination in Amazon ES. This value cannot be specified if Amazon S3 or Amazon Redshift is the
     *        desired destination (see restrictions listed above).
     */

    public void setElasticsearchDestinationConfiguration(ElasticsearchDestinationConfiguration elasticsearchDestinationConfiguration) {
        this.elasticsearchDestinationConfiguration = elasticsearchDestinationConfiguration;
    }

    /**
     * <p>
     * The destination in Amazon ES. This value cannot be specified if Amazon S3 or Amazon Redshift is the desired
     * destination (see restrictions listed above).
     * </p>
     * 
     * @return The destination in Amazon ES. This value cannot be specified if Amazon S3 or Amazon Redshift is the
     *         desired destination (see restrictions listed above).
     */

    public ElasticsearchDestinationConfiguration getElasticsearchDestinationConfiguration() {
        return this.elasticsearchDestinationConfiguration;
    }

    /**
     * <p>
     * The destination in Amazon ES. This value cannot be specified if Amazon S3 or Amazon Redshift is the desired
     * destination (see restrictions listed above).
     * </p>
     * 
     * @param elasticsearchDestinationConfiguration
     *        The destination in Amazon ES. This value cannot be specified if Amazon S3 or Amazon Redshift is the
     *        desired destination (see restrictions listed above).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryStreamRequest withElasticsearchDestinationConfiguration(ElasticsearchDestinationConfiguration elasticsearchDestinationConfiguration) {
        setElasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration);
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
        if (getS3DestinationConfiguration() != null)
            sb.append("S3DestinationConfiguration: " + getS3DestinationConfiguration() + ",");
        if (getRedshiftDestinationConfiguration() != null)
            sb.append("RedshiftDestinationConfiguration: " + getRedshiftDestinationConfiguration() + ",");
        if (getElasticsearchDestinationConfiguration() != null)
            sb.append("ElasticsearchDestinationConfiguration: " + getElasticsearchDestinationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeliveryStreamRequest == false)
            return false;
        CreateDeliveryStreamRequest other = (CreateDeliveryStreamRequest) obj;
        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false)
            return false;
        if (other.getS3DestinationConfiguration() == null ^ this.getS3DestinationConfiguration() == null)
            return false;
        if (other.getS3DestinationConfiguration() != null && other.getS3DestinationConfiguration().equals(this.getS3DestinationConfiguration()) == false)
            return false;
        if (other.getRedshiftDestinationConfiguration() == null ^ this.getRedshiftDestinationConfiguration() == null)
            return false;
        if (other.getRedshiftDestinationConfiguration() != null
                && other.getRedshiftDestinationConfiguration().equals(this.getRedshiftDestinationConfiguration()) == false)
            return false;
        if (other.getElasticsearchDestinationConfiguration() == null ^ this.getElasticsearchDestinationConfiguration() == null)
            return false;
        if (other.getElasticsearchDestinationConfiguration() != null
                && other.getElasticsearchDestinationConfiguration().equals(this.getElasticsearchDestinationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationConfiguration() == null) ? 0 : getS3DestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRedshiftDestinationConfiguration() == null) ? 0 : getRedshiftDestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchDestinationConfiguration() == null) ? 0 : getElasticsearchDestinationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeliveryStreamRequest clone() {
        return (CreateDeliveryStreamRequest) super.clone();
    }
}
