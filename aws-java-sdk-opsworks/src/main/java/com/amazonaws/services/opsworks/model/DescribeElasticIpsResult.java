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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeElasticIps</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeElasticIps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeElasticIpsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An <code>ElasticIps</code> object that describes the specified Elastic IP addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ElasticIp> elasticIps;

    /**
     * <p>
     * An <code>ElasticIps</code> object that describes the specified Elastic IP addresses.
     * </p>
     * 
     * @return An <code>ElasticIps</code> object that describes the specified Elastic IP addresses.
     */

    public java.util.List<ElasticIp> getElasticIps() {
        if (elasticIps == null) {
            elasticIps = new com.amazonaws.internal.SdkInternalList<ElasticIp>();
        }
        return elasticIps;
    }

    /**
     * <p>
     * An <code>ElasticIps</code> object that describes the specified Elastic IP addresses.
     * </p>
     * 
     * @param elasticIps
     *        An <code>ElasticIps</code> object that describes the specified Elastic IP addresses.
     */

    public void setElasticIps(java.util.Collection<ElasticIp> elasticIps) {
        if (elasticIps == null) {
            this.elasticIps = null;
            return;
        }

        this.elasticIps = new com.amazonaws.internal.SdkInternalList<ElasticIp>(elasticIps);
    }

    /**
     * <p>
     * An <code>ElasticIps</code> object that describes the specified Elastic IP addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticIps(java.util.Collection)} or {@link #withElasticIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param elasticIps
     *        An <code>ElasticIps</code> object that describes the specified Elastic IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticIpsResult withElasticIps(ElasticIp... elasticIps) {
        if (this.elasticIps == null) {
            setElasticIps(new com.amazonaws.internal.SdkInternalList<ElasticIp>(elasticIps.length));
        }
        for (ElasticIp ele : elasticIps) {
            this.elasticIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An <code>ElasticIps</code> object that describes the specified Elastic IP addresses.
     * </p>
     * 
     * @param elasticIps
     *        An <code>ElasticIps</code> object that describes the specified Elastic IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticIpsResult withElasticIps(java.util.Collection<ElasticIp> elasticIps) {
        setElasticIps(elasticIps);
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
        if (getElasticIps() != null)
            sb.append("ElasticIps: ").append(getElasticIps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeElasticIpsResult == false)
            return false;
        DescribeElasticIpsResult other = (DescribeElasticIpsResult) obj;
        if (other.getElasticIps() == null ^ this.getElasticIps() == null)
            return false;
        if (other.getElasticIps() != null && other.getElasticIps().equals(this.getElasticIps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElasticIps() == null) ? 0 : getElasticIps().hashCode());
        return hashCode;
    }

    @Override
    public DescribeElasticIpsResult clone() {
        try {
            return (DescribeElasticIpsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
