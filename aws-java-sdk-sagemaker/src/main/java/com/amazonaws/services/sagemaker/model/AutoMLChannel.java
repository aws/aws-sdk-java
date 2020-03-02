/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Similar to Channel. A channel is a named input source that training algorithms can consume. Refer to Channel for
 * detailed descriptions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLChannel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data source.
     * </p>
     */
    private AutoMLDataSource dataSource;
    /**
     * <p>
     * You can use Gzip or None. The default value is None.
     * </p>
     */
    private String compressionType;
    /**
     * <p>
     * The name of the target variable in supervised learning, a.k.a. 'y'.
     * </p>
     */
    private String targetAttributeName;

    /**
     * <p>
     * The data source.
     * </p>
     * 
     * @param dataSource
     *        The data source.
     */

    public void setDataSource(AutoMLDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data source.
     * </p>
     * 
     * @return The data source.
     */

    public AutoMLDataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The data source.
     * </p>
     * 
     * @param dataSource
     *        The data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLChannel withDataSource(AutoMLDataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * You can use Gzip or None. The default value is None.
     * </p>
     * 
     * @param compressionType
     *        You can use Gzip or None. The default value is None.
     * @see CompressionType
     */

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * You can use Gzip or None. The default value is None.
     * </p>
     * 
     * @return You can use Gzip or None. The default value is None.
     * @see CompressionType
     */

    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * <p>
     * You can use Gzip or None. The default value is None.
     * </p>
     * 
     * @param compressionType
     *        You can use Gzip or None. The default value is None.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public AutoMLChannel withCompressionType(String compressionType) {
        setCompressionType(compressionType);
        return this;
    }

    /**
     * <p>
     * You can use Gzip or None. The default value is None.
     * </p>
     * 
     * @param compressionType
     *        You can use Gzip or None. The default value is None.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public AutoMLChannel withCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the target variable in supervised learning, a.k.a. 'y'.
     * </p>
     * 
     * @param targetAttributeName
     *        The name of the target variable in supervised learning, a.k.a. 'y'.
     */

    public void setTargetAttributeName(String targetAttributeName) {
        this.targetAttributeName = targetAttributeName;
    }

    /**
     * <p>
     * The name of the target variable in supervised learning, a.k.a. 'y'.
     * </p>
     * 
     * @return The name of the target variable in supervised learning, a.k.a. 'y'.
     */

    public String getTargetAttributeName() {
        return this.targetAttributeName;
    }

    /**
     * <p>
     * The name of the target variable in supervised learning, a.k.a. 'y'.
     * </p>
     * 
     * @param targetAttributeName
     *        The name of the target variable in supervised learning, a.k.a. 'y'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLChannel withTargetAttributeName(String targetAttributeName) {
        setTargetAttributeName(targetAttributeName);
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getCompressionType() != null)
            sb.append("CompressionType: ").append(getCompressionType()).append(",");
        if (getTargetAttributeName() != null)
            sb.append("TargetAttributeName: ").append(getTargetAttributeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLChannel == false)
            return false;
        AutoMLChannel other = (AutoMLChannel) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        if (other.getTargetAttributeName() == null ^ this.getTargetAttributeName() == null)
            return false;
        if (other.getTargetAttributeName() != null && other.getTargetAttributeName().equals(this.getTargetAttributeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode + ((getTargetAttributeName() == null) ? 0 : getTargetAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLChannel clone() {
        try {
            return (AutoMLChannel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
