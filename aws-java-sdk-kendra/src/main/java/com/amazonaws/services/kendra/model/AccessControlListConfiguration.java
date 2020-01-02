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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Access Control List files for the documents in a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AccessControlListConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessControlListConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Path to the AWS S3 bucket that contains the ACL files.
     * </p>
     */
    private String keyPath;

    /**
     * <p>
     * Path to the AWS S3 bucket that contains the ACL files.
     * </p>
     * 
     * @param keyPath
     *        Path to the AWS S3 bucket that contains the ACL files.
     */

    public void setKeyPath(String keyPath) {
        this.keyPath = keyPath;
    }

    /**
     * <p>
     * Path to the AWS S3 bucket that contains the ACL files.
     * </p>
     * 
     * @return Path to the AWS S3 bucket that contains the ACL files.
     */

    public String getKeyPath() {
        return this.keyPath;
    }

    /**
     * <p>
     * Path to the AWS S3 bucket that contains the ACL files.
     * </p>
     * 
     * @param keyPath
     *        Path to the AWS S3 bucket that contains the ACL files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlListConfiguration withKeyPath(String keyPath) {
        setKeyPath(keyPath);
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
        if (getKeyPath() != null)
            sb.append("KeyPath: ").append(getKeyPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessControlListConfiguration == false)
            return false;
        AccessControlListConfiguration other = (AccessControlListConfiguration) obj;
        if (other.getKeyPath() == null ^ this.getKeyPath() == null)
            return false;
        if (other.getKeyPath() != null && other.getKeyPath().equals(this.getKeyPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPath() == null) ? 0 : getKeyPath().hashCode());
        return hashCode;
    }

    @Override
    public AccessControlListConfiguration clone() {
        try {
            return (AccessControlListConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.AccessControlListConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
