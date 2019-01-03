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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ElasticsearchSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticsearchSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by service to access the IAM role.
     * </p>
     */
    private String serviceAccessRoleArn;
    /**
     * <p>
     * The endpoint for the ElasticSearch cluster.
     * </p>
     */
    private String endpointUri;
    /**
     * <p>
     * The maximum percentage of records that can fail to be written before a full load operation stops.
     * </p>
     */
    private Integer fullLoadErrorPercentage;
    /**
     * <p>
     * The maximum number of seconds that DMS retries failed API requests to the Elasticsearch cluster.
     * </p>
     */
    private Integer errorRetryDuration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by service to access the IAM role.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) used by service to access the IAM role.
     */

    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by service to access the IAM role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) used by service to access the IAM role.
     */

    public String getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by service to access the IAM role.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) used by service to access the IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchSettings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        setServiceAccessRoleArn(serviceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The endpoint for the ElasticSearch cluster.
     * </p>
     * 
     * @param endpointUri
     *        The endpoint for the ElasticSearch cluster.
     */

    public void setEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
    }

    /**
     * <p>
     * The endpoint for the ElasticSearch cluster.
     * </p>
     * 
     * @return The endpoint for the ElasticSearch cluster.
     */

    public String getEndpointUri() {
        return this.endpointUri;
    }

    /**
     * <p>
     * The endpoint for the ElasticSearch cluster.
     * </p>
     * 
     * @param endpointUri
     *        The endpoint for the ElasticSearch cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchSettings withEndpointUri(String endpointUri) {
        setEndpointUri(endpointUri);
        return this;
    }

    /**
     * <p>
     * The maximum percentage of records that can fail to be written before a full load operation stops.
     * </p>
     * 
     * @param fullLoadErrorPercentage
     *        The maximum percentage of records that can fail to be written before a full load operation stops.
     */

    public void setFullLoadErrorPercentage(Integer fullLoadErrorPercentage) {
        this.fullLoadErrorPercentage = fullLoadErrorPercentage;
    }

    /**
     * <p>
     * The maximum percentage of records that can fail to be written before a full load operation stops.
     * </p>
     * 
     * @return The maximum percentage of records that can fail to be written before a full load operation stops.
     */

    public Integer getFullLoadErrorPercentage() {
        return this.fullLoadErrorPercentage;
    }

    /**
     * <p>
     * The maximum percentage of records that can fail to be written before a full load operation stops.
     * </p>
     * 
     * @param fullLoadErrorPercentage
     *        The maximum percentage of records that can fail to be written before a full load operation stops.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchSettings withFullLoadErrorPercentage(Integer fullLoadErrorPercentage) {
        setFullLoadErrorPercentage(fullLoadErrorPercentage);
        return this;
    }

    /**
     * <p>
     * The maximum number of seconds that DMS retries failed API requests to the Elasticsearch cluster.
     * </p>
     * 
     * @param errorRetryDuration
     *        The maximum number of seconds that DMS retries failed API requests to the Elasticsearch cluster.
     */

    public void setErrorRetryDuration(Integer errorRetryDuration) {
        this.errorRetryDuration = errorRetryDuration;
    }

    /**
     * <p>
     * The maximum number of seconds that DMS retries failed API requests to the Elasticsearch cluster.
     * </p>
     * 
     * @return The maximum number of seconds that DMS retries failed API requests to the Elasticsearch cluster.
     */

    public Integer getErrorRetryDuration() {
        return this.errorRetryDuration;
    }

    /**
     * <p>
     * The maximum number of seconds that DMS retries failed API requests to the Elasticsearch cluster.
     * </p>
     * 
     * @param errorRetryDuration
     *        The maximum number of seconds that DMS retries failed API requests to the Elasticsearch cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchSettings withErrorRetryDuration(Integer errorRetryDuration) {
        setErrorRetryDuration(errorRetryDuration);
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
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: ").append(getServiceAccessRoleArn()).append(",");
        if (getEndpointUri() != null)
            sb.append("EndpointUri: ").append(getEndpointUri()).append(",");
        if (getFullLoadErrorPercentage() != null)
            sb.append("FullLoadErrorPercentage: ").append(getFullLoadErrorPercentage()).append(",");
        if (getErrorRetryDuration() != null)
            sb.append("ErrorRetryDuration: ").append(getErrorRetryDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticsearchSettings == false)
            return false;
        ElasticsearchSettings other = (ElasticsearchSettings) obj;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getEndpointUri() == null ^ this.getEndpointUri() == null)
            return false;
        if (other.getEndpointUri() != null && other.getEndpointUri().equals(this.getEndpointUri()) == false)
            return false;
        if (other.getFullLoadErrorPercentage() == null ^ this.getFullLoadErrorPercentage() == null)
            return false;
        if (other.getFullLoadErrorPercentage() != null && other.getFullLoadErrorPercentage().equals(this.getFullLoadErrorPercentage()) == false)
            return false;
        if (other.getErrorRetryDuration() == null ^ this.getErrorRetryDuration() == null)
            return false;
        if (other.getErrorRetryDuration() != null && other.getErrorRetryDuration().equals(this.getErrorRetryDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointUri() == null) ? 0 : getEndpointUri().hashCode());
        hashCode = prime * hashCode + ((getFullLoadErrorPercentage() == null) ? 0 : getFullLoadErrorPercentage().hashCode());
        hashCode = prime * hashCode + ((getErrorRetryDuration() == null) ? 0 : getErrorRetryDuration().hashCode());
        return hashCode;
    }

    @Override
    public ElasticsearchSettings clone() {
        try {
            return (ElasticsearchSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ElasticsearchSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
