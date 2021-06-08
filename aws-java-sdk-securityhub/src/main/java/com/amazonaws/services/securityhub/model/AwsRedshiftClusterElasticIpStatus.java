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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the elastic IP (EIP) address for an Amazon Redshift cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRedshiftClusterElasticIpStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterElasticIpStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The elastic IP address for the cluster.
     * </p>
     */
    private String elasticIp;
    /**
     * <p>
     * The status of the elastic IP address.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The elastic IP address for the cluster.
     * </p>
     * 
     * @param elasticIp
     *        The elastic IP address for the cluster.
     */

    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * <p>
     * The elastic IP address for the cluster.
     * </p>
     * 
     * @return The elastic IP address for the cluster.
     */

    public String getElasticIp() {
        return this.elasticIp;
    }

    /**
     * <p>
     * The elastic IP address for the cluster.
     * </p>
     * 
     * @param elasticIp
     *        The elastic IP address for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterElasticIpStatus withElasticIp(String elasticIp) {
        setElasticIp(elasticIp);
        return this;
    }

    /**
     * <p>
     * The status of the elastic IP address.
     * </p>
     * 
     * @param status
     *        The status of the elastic IP address.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the elastic IP address.
     * </p>
     * 
     * @return The status of the elastic IP address.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the elastic IP address.
     * </p>
     * 
     * @param status
     *        The status of the elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterElasticIpStatus withStatus(String status) {
        setStatus(status);
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
        if (getElasticIp() != null)
            sb.append("ElasticIp: ").append(getElasticIp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRedshiftClusterElasticIpStatus == false)
            return false;
        AwsRedshiftClusterElasticIpStatus other = (AwsRedshiftClusterElasticIpStatus) obj;
        if (other.getElasticIp() == null ^ this.getElasticIp() == null)
            return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsRedshiftClusterElasticIpStatus clone() {
        try {
            return (AwsRedshiftClusterElasticIpStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRedshiftClusterElasticIpStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
