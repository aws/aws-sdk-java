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
 * Describes the destination for a delivery stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DestinationDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the destination.
     * </p>
     */
    private String destinationId;
    /**
     * <p>
     * [Deprecated] The destination in Amazon S3.
     * </p>
     */
    private S3DestinationDescription s3DestinationDescription;
    /**
     * <p>
     * The destination in Amazon S3.
     * </p>
     */
    private ExtendedS3DestinationDescription extendedS3DestinationDescription;
    /**
     * <p>
     * The destination in Amazon Redshift.
     * </p>
     */
    private RedshiftDestinationDescription redshiftDestinationDescription;
    /**
     * <p>
     * The destination in Amazon ES.
     * </p>
     */
    private ElasticsearchDestinationDescription elasticsearchDestinationDescription;
    /**
     * <p>
     * The destination in Splunk.
     * </p>
     */
    private SplunkDestinationDescription splunkDestinationDescription;

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

    public DestinationDescription withDestinationId(String destinationId) {
        setDestinationId(destinationId);
        return this;
    }

    /**
     * <p>
     * [Deprecated] The destination in Amazon S3.
     * </p>
     * 
     * @param s3DestinationDescription
     *        [Deprecated] The destination in Amazon S3.
     */

    public void setS3DestinationDescription(S3DestinationDescription s3DestinationDescription) {
        this.s3DestinationDescription = s3DestinationDescription;
    }

    /**
     * <p>
     * [Deprecated] The destination in Amazon S3.
     * </p>
     * 
     * @return [Deprecated] The destination in Amazon S3.
     */

    public S3DestinationDescription getS3DestinationDescription() {
        return this.s3DestinationDescription;
    }

    /**
     * <p>
     * [Deprecated] The destination in Amazon S3.
     * </p>
     * 
     * @param s3DestinationDescription
     *        [Deprecated] The destination in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationDescription withS3DestinationDescription(S3DestinationDescription s3DestinationDescription) {
        setS3DestinationDescription(s3DestinationDescription);
        return this;
    }

    /**
     * <p>
     * The destination in Amazon S3.
     * </p>
     * 
     * @param extendedS3DestinationDescription
     *        The destination in Amazon S3.
     */

    public void setExtendedS3DestinationDescription(ExtendedS3DestinationDescription extendedS3DestinationDescription) {
        this.extendedS3DestinationDescription = extendedS3DestinationDescription;
    }

    /**
     * <p>
     * The destination in Amazon S3.
     * </p>
     * 
     * @return The destination in Amazon S3.
     */

    public ExtendedS3DestinationDescription getExtendedS3DestinationDescription() {
        return this.extendedS3DestinationDescription;
    }

    /**
     * <p>
     * The destination in Amazon S3.
     * </p>
     * 
     * @param extendedS3DestinationDescription
     *        The destination in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationDescription withExtendedS3DestinationDescription(ExtendedS3DestinationDescription extendedS3DestinationDescription) {
        setExtendedS3DestinationDescription(extendedS3DestinationDescription);
        return this;
    }

    /**
     * <p>
     * The destination in Amazon Redshift.
     * </p>
     * 
     * @param redshiftDestinationDescription
     *        The destination in Amazon Redshift.
     */

    public void setRedshiftDestinationDescription(RedshiftDestinationDescription redshiftDestinationDescription) {
        this.redshiftDestinationDescription = redshiftDestinationDescription;
    }

    /**
     * <p>
     * The destination in Amazon Redshift.
     * </p>
     * 
     * @return The destination in Amazon Redshift.
     */

    public RedshiftDestinationDescription getRedshiftDestinationDescription() {
        return this.redshiftDestinationDescription;
    }

    /**
     * <p>
     * The destination in Amazon Redshift.
     * </p>
     * 
     * @param redshiftDestinationDescription
     *        The destination in Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationDescription withRedshiftDestinationDescription(RedshiftDestinationDescription redshiftDestinationDescription) {
        setRedshiftDestinationDescription(redshiftDestinationDescription);
        return this;
    }

    /**
     * <p>
     * The destination in Amazon ES.
     * </p>
     * 
     * @param elasticsearchDestinationDescription
     *        The destination in Amazon ES.
     */

    public void setElasticsearchDestinationDescription(ElasticsearchDestinationDescription elasticsearchDestinationDescription) {
        this.elasticsearchDestinationDescription = elasticsearchDestinationDescription;
    }

    /**
     * <p>
     * The destination in Amazon ES.
     * </p>
     * 
     * @return The destination in Amazon ES.
     */

    public ElasticsearchDestinationDescription getElasticsearchDestinationDescription() {
        return this.elasticsearchDestinationDescription;
    }

    /**
     * <p>
     * The destination in Amazon ES.
     * </p>
     * 
     * @param elasticsearchDestinationDescription
     *        The destination in Amazon ES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationDescription withElasticsearchDestinationDescription(ElasticsearchDestinationDescription elasticsearchDestinationDescription) {
        setElasticsearchDestinationDescription(elasticsearchDestinationDescription);
        return this;
    }

    /**
     * <p>
     * The destination in Splunk.
     * </p>
     * 
     * @param splunkDestinationDescription
     *        The destination in Splunk.
     */

    public void setSplunkDestinationDescription(SplunkDestinationDescription splunkDestinationDescription) {
        this.splunkDestinationDescription = splunkDestinationDescription;
    }

    /**
     * <p>
     * The destination in Splunk.
     * </p>
     * 
     * @return The destination in Splunk.
     */

    public SplunkDestinationDescription getSplunkDestinationDescription() {
        return this.splunkDestinationDescription;
    }

    /**
     * <p>
     * The destination in Splunk.
     * </p>
     * 
     * @param splunkDestinationDescription
     *        The destination in Splunk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationDescription withSplunkDestinationDescription(SplunkDestinationDescription splunkDestinationDescription) {
        setSplunkDestinationDescription(splunkDestinationDescription);
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
        if (getDestinationId() != null)
            sb.append("DestinationId: ").append(getDestinationId()).append(",");
        if (getS3DestinationDescription() != null)
            sb.append("S3DestinationDescription: ").append(getS3DestinationDescription()).append(",");
        if (getExtendedS3DestinationDescription() != null)
            sb.append("ExtendedS3DestinationDescription: ").append(getExtendedS3DestinationDescription()).append(",");
        if (getRedshiftDestinationDescription() != null)
            sb.append("RedshiftDestinationDescription: ").append(getRedshiftDestinationDescription()).append(",");
        if (getElasticsearchDestinationDescription() != null)
            sb.append("ElasticsearchDestinationDescription: ").append(getElasticsearchDestinationDescription()).append(",");
        if (getSplunkDestinationDescription() != null)
            sb.append("SplunkDestinationDescription: ").append(getSplunkDestinationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationDescription == false)
            return false;
        DestinationDescription other = (DestinationDescription) obj;
        if (other.getDestinationId() == null ^ this.getDestinationId() == null)
            return false;
        if (other.getDestinationId() != null && other.getDestinationId().equals(this.getDestinationId()) == false)
            return false;
        if (other.getS3DestinationDescription() == null ^ this.getS3DestinationDescription() == null)
            return false;
        if (other.getS3DestinationDescription() != null && other.getS3DestinationDescription().equals(this.getS3DestinationDescription()) == false)
            return false;
        if (other.getExtendedS3DestinationDescription() == null ^ this.getExtendedS3DestinationDescription() == null)
            return false;
        if (other.getExtendedS3DestinationDescription() != null
                && other.getExtendedS3DestinationDescription().equals(this.getExtendedS3DestinationDescription()) == false)
            return false;
        if (other.getRedshiftDestinationDescription() == null ^ this.getRedshiftDestinationDescription() == null)
            return false;
        if (other.getRedshiftDestinationDescription() != null
                && other.getRedshiftDestinationDescription().equals(this.getRedshiftDestinationDescription()) == false)
            return false;
        if (other.getElasticsearchDestinationDescription() == null ^ this.getElasticsearchDestinationDescription() == null)
            return false;
        if (other.getElasticsearchDestinationDescription() != null
                && other.getElasticsearchDestinationDescription().equals(this.getElasticsearchDestinationDescription()) == false)
            return false;
        if (other.getSplunkDestinationDescription() == null ^ this.getSplunkDestinationDescription() == null)
            return false;
        if (other.getSplunkDestinationDescription() != null && other.getSplunkDestinationDescription().equals(this.getSplunkDestinationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationId() == null) ? 0 : getDestinationId().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationDescription() == null) ? 0 : getS3DestinationDescription().hashCode());
        hashCode = prime * hashCode + ((getExtendedS3DestinationDescription() == null) ? 0 : getExtendedS3DestinationDescription().hashCode());
        hashCode = prime * hashCode + ((getRedshiftDestinationDescription() == null) ? 0 : getRedshiftDestinationDescription().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchDestinationDescription() == null) ? 0 : getElasticsearchDestinationDescription().hashCode());
        hashCode = prime * hashCode + ((getSplunkDestinationDescription() == null) ? 0 : getSplunkDestinationDescription().hashCode());
        return hashCode;
    }

    @Override
    public DestinationDescription clone() {
        try {
            return (DestinationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.DestinationDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
