/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the Amazon Redshift storage as part of the configuration of an Amazon Redshift data source run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RedshiftStorage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftStorage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details of the Amazon Redshift cluster source.
     * </p>
     */
    private RedshiftClusterStorage redshiftClusterSource;
    /**
     * <p>
     * The details of the Amazon Redshift Serverless workgroup source.
     * </p>
     */
    private RedshiftServerlessStorage redshiftServerlessSource;

    /**
     * <p>
     * The details of the Amazon Redshift cluster source.
     * </p>
     * 
     * @param redshiftClusterSource
     *        The details of the Amazon Redshift cluster source.
     */

    public void setRedshiftClusterSource(RedshiftClusterStorage redshiftClusterSource) {
        this.redshiftClusterSource = redshiftClusterSource;
    }

    /**
     * <p>
     * The details of the Amazon Redshift cluster source.
     * </p>
     * 
     * @return The details of the Amazon Redshift cluster source.
     */

    public RedshiftClusterStorage getRedshiftClusterSource() {
        return this.redshiftClusterSource;
    }

    /**
     * <p>
     * The details of the Amazon Redshift cluster source.
     * </p>
     * 
     * @param redshiftClusterSource
     *        The details of the Amazon Redshift cluster source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftStorage withRedshiftClusterSource(RedshiftClusterStorage redshiftClusterSource) {
        setRedshiftClusterSource(redshiftClusterSource);
        return this;
    }

    /**
     * <p>
     * The details of the Amazon Redshift Serverless workgroup source.
     * </p>
     * 
     * @param redshiftServerlessSource
     *        The details of the Amazon Redshift Serverless workgroup source.
     */

    public void setRedshiftServerlessSource(RedshiftServerlessStorage redshiftServerlessSource) {
        this.redshiftServerlessSource = redshiftServerlessSource;
    }

    /**
     * <p>
     * The details of the Amazon Redshift Serverless workgroup source.
     * </p>
     * 
     * @return The details of the Amazon Redshift Serverless workgroup source.
     */

    public RedshiftServerlessStorage getRedshiftServerlessSource() {
        return this.redshiftServerlessSource;
    }

    /**
     * <p>
     * The details of the Amazon Redshift Serverless workgroup source.
     * </p>
     * 
     * @param redshiftServerlessSource
     *        The details of the Amazon Redshift Serverless workgroup source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftStorage withRedshiftServerlessSource(RedshiftServerlessStorage redshiftServerlessSource) {
        setRedshiftServerlessSource(redshiftServerlessSource);
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
        if (getRedshiftClusterSource() != null)
            sb.append("RedshiftClusterSource: ").append(getRedshiftClusterSource()).append(",");
        if (getRedshiftServerlessSource() != null)
            sb.append("RedshiftServerlessSource: ").append(getRedshiftServerlessSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftStorage == false)
            return false;
        RedshiftStorage other = (RedshiftStorage) obj;
        if (other.getRedshiftClusterSource() == null ^ this.getRedshiftClusterSource() == null)
            return false;
        if (other.getRedshiftClusterSource() != null && other.getRedshiftClusterSource().equals(this.getRedshiftClusterSource()) == false)
            return false;
        if (other.getRedshiftServerlessSource() == null ^ this.getRedshiftServerlessSource() == null)
            return false;
        if (other.getRedshiftServerlessSource() != null && other.getRedshiftServerlessSource().equals(this.getRedshiftServerlessSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRedshiftClusterSource() == null) ? 0 : getRedshiftClusterSource().hashCode());
        hashCode = prime * hashCode + ((getRedshiftServerlessSource() == null) ? 0 : getRedshiftServerlessSource().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftStorage clone() {
        try {
            return (RedshiftStorage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.RedshiftStorageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
