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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a Lambda layer version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsLambdaLayerVersionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsLambdaLayerVersionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version number.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * The layer's compatible runtimes. Maximum number of 5 items.
     * </p>
     * <p>
     * Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> | <code>java8</code> | <code>java11</code> |
     * <code>python2.7</code> | <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code> |
     * <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> | <code>go1.x</code> | <code>ruby2.5</code> |
     * <code>provided</code>
     * </p>
     */
    private java.util.List<String> compatibleRuntimes;
    /**
     * <p>
     * The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000.
     * </p>
     */
    private String createdDate;

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param version
     *        The version number.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @return The version number.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param version
     *        The version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaLayerVersionDetails withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The layer's compatible runtimes. Maximum number of 5 items.
     * </p>
     * <p>
     * Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> | <code>java8</code> | <code>java11</code> |
     * <code>python2.7</code> | <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code> |
     * <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> | <code>go1.x</code> | <code>ruby2.5</code> |
     * <code>provided</code>
     * </p>
     * 
     * @return The layer's compatible runtimes. Maximum number of 5 items.</p>
     *         <p>
     *         Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> | <code>java8</code> |
     *         <code>java11</code> | <code>python2.7</code> | <code>python3.6</code> | <code>python3.7</code> |
     *         <code>python3.8</code> | <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> | <code>go1.x</code> |
     *         <code>ruby2.5</code> | <code>provided</code>
     */

    public java.util.List<String> getCompatibleRuntimes() {
        return compatibleRuntimes;
    }

    /**
     * <p>
     * The layer's compatible runtimes. Maximum number of 5 items.
     * </p>
     * <p>
     * Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> | <code>java8</code> | <code>java11</code> |
     * <code>python2.7</code> | <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code> |
     * <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> | <code>go1.x</code> | <code>ruby2.5</code> |
     * <code>provided</code>
     * </p>
     * 
     * @param compatibleRuntimes
     *        The layer's compatible runtimes. Maximum number of 5 items.</p>
     *        <p>
     *        Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> | <code>java8</code> | <code>java11</code>
     *        | <code>python2.7</code> | <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code> |
     *        <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> | <code>go1.x</code> | <code>ruby2.5</code> |
     *        <code>provided</code>
     */

    public void setCompatibleRuntimes(java.util.Collection<String> compatibleRuntimes) {
        if (compatibleRuntimes == null) {
            this.compatibleRuntimes = null;
            return;
        }

        this.compatibleRuntimes = new java.util.ArrayList<String>(compatibleRuntimes);
    }

    /**
     * <p>
     * The layer's compatible runtimes. Maximum number of 5 items.
     * </p>
     * <p>
     * Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> | <code>java8</code> | <code>java11</code> |
     * <code>python2.7</code> | <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code> |
     * <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> | <code>go1.x</code> | <code>ruby2.5</code> |
     * <code>provided</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompatibleRuntimes(java.util.Collection)} or {@link #withCompatibleRuntimes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param compatibleRuntimes
     *        The layer's compatible runtimes. Maximum number of 5 items.</p>
     *        <p>
     *        Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> | <code>java8</code> | <code>java11</code>
     *        | <code>python2.7</code> | <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code> |
     *        <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> | <code>go1.x</code> | <code>ruby2.5</code> |
     *        <code>provided</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaLayerVersionDetails withCompatibleRuntimes(String... compatibleRuntimes) {
        if (this.compatibleRuntimes == null) {
            setCompatibleRuntimes(new java.util.ArrayList<String>(compatibleRuntimes.length));
        }
        for (String ele : compatibleRuntimes) {
            this.compatibleRuntimes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The layer's compatible runtimes. Maximum number of 5 items.
     * </p>
     * <p>
     * Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> | <code>java8</code> | <code>java11</code> |
     * <code>python2.7</code> | <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code> |
     * <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> | <code>go1.x</code> | <code>ruby2.5</code> |
     * <code>provided</code>
     * </p>
     * 
     * @param compatibleRuntimes
     *        The layer's compatible runtimes. Maximum number of 5 items.</p>
     *        <p>
     *        Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> | <code>java8</code> | <code>java11</code>
     *        | <code>python2.7</code> | <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code> |
     *        <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> | <code>go1.x</code> | <code>ruby2.5</code> |
     *        <code>provided</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaLayerVersionDetails withCompatibleRuntimes(java.util.Collection<String> compatibleRuntimes) {
        setCompatibleRuntimes(compatibleRuntimes);
        return this;
    }

    /**
     * <p>
     * The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000.
     * </p>
     * 
     * @param createdDate
     *        The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000.
     */

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000.
     * </p>
     * 
     * @return The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000.
     */

    public String getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000.
     * </p>
     * 
     * @param createdDate
     *        The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaLayerVersionDetails withCreatedDate(String createdDate) {
        setCreatedDate(createdDate);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getCompatibleRuntimes() != null)
            sb.append("CompatibleRuntimes: ").append(getCompatibleRuntimes()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsLambdaLayerVersionDetails == false)
            return false;
        AwsLambdaLayerVersionDetails other = (AwsLambdaLayerVersionDetails) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCompatibleRuntimes() == null ^ this.getCompatibleRuntimes() == null)
            return false;
        if (other.getCompatibleRuntimes() != null && other.getCompatibleRuntimes().equals(this.getCompatibleRuntimes()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getCompatibleRuntimes() == null) ? 0 : getCompatibleRuntimes().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public AwsLambdaLayerVersionDetails clone() {
        try {
            return (AwsLambdaLayerVersionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsLambdaLayerVersionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
