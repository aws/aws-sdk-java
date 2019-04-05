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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a function's deployment package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/FunctionCodeLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionCodeLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The service that's hosting the file.
     * </p>
     */
    private String repositoryType;
    /**
     * <p>
     * A presigned URL that you can use to download the deployment package.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The service that's hosting the file.
     * </p>
     * 
     * @param repositoryType
     *        The service that's hosting the file.
     */

    public void setRepositoryType(String repositoryType) {
        this.repositoryType = repositoryType;
    }

    /**
     * <p>
     * The service that's hosting the file.
     * </p>
     * 
     * @return The service that's hosting the file.
     */

    public String getRepositoryType() {
        return this.repositoryType;
    }

    /**
     * <p>
     * The service that's hosting the file.
     * </p>
     * 
     * @param repositoryType
     *        The service that's hosting the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionCodeLocation withRepositoryType(String repositoryType) {
        setRepositoryType(repositoryType);
        return this;
    }

    /**
     * <p>
     * A presigned URL that you can use to download the deployment package.
     * </p>
     * 
     * @param location
     *        A presigned URL that you can use to download the deployment package.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * A presigned URL that you can use to download the deployment package.
     * </p>
     * 
     * @return A presigned URL that you can use to download the deployment package.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * A presigned URL that you can use to download the deployment package.
     * </p>
     * 
     * @param location
     *        A presigned URL that you can use to download the deployment package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionCodeLocation withLocation(String location) {
        setLocation(location);
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
        if (getRepositoryType() != null)
            sb.append("RepositoryType: ").append(getRepositoryType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionCodeLocation == false)
            return false;
        FunctionCodeLocation other = (FunctionCodeLocation) obj;
        if (other.getRepositoryType() == null ^ this.getRepositoryType() == null)
            return false;
        if (other.getRepositoryType() != null && other.getRepositoryType().equals(this.getRepositoryType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryType() == null) ? 0 : getRepositoryType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public FunctionCodeLocation clone() {
        try {
            return (FunctionCodeLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.FunctionCodeLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
