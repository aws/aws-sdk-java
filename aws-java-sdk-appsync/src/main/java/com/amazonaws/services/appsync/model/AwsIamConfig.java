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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The AWS IAM configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/AwsIamConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The signing region for AWS IAM authorization.
     * </p>
     */
    private String signingRegion;
    /**
     * <p>
     * The signing service name for AWS IAM authorization.
     * </p>
     */
    private String signingServiceName;

    /**
     * <p>
     * The signing region for AWS IAM authorization.
     * </p>
     * 
     * @param signingRegion
     *        The signing region for AWS IAM authorization.
     */

    public void setSigningRegion(String signingRegion) {
        this.signingRegion = signingRegion;
    }

    /**
     * <p>
     * The signing region for AWS IAM authorization.
     * </p>
     * 
     * @return The signing region for AWS IAM authorization.
     */

    public String getSigningRegion() {
        return this.signingRegion;
    }

    /**
     * <p>
     * The signing region for AWS IAM authorization.
     * </p>
     * 
     * @param signingRegion
     *        The signing region for AWS IAM authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamConfig withSigningRegion(String signingRegion) {
        setSigningRegion(signingRegion);
        return this;
    }

    /**
     * <p>
     * The signing service name for AWS IAM authorization.
     * </p>
     * 
     * @param signingServiceName
     *        The signing service name for AWS IAM authorization.
     */

    public void setSigningServiceName(String signingServiceName) {
        this.signingServiceName = signingServiceName;
    }

    /**
     * <p>
     * The signing service name for AWS IAM authorization.
     * </p>
     * 
     * @return The signing service name for AWS IAM authorization.
     */

    public String getSigningServiceName() {
        return this.signingServiceName;
    }

    /**
     * <p>
     * The signing service name for AWS IAM authorization.
     * </p>
     * 
     * @param signingServiceName
     *        The signing service name for AWS IAM authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamConfig withSigningServiceName(String signingServiceName) {
        setSigningServiceName(signingServiceName);
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
        if (getSigningRegion() != null)
            sb.append("SigningRegion: ").append(getSigningRegion()).append(",");
        if (getSigningServiceName() != null)
            sb.append("SigningServiceName: ").append(getSigningServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsIamConfig == false)
            return false;
        AwsIamConfig other = (AwsIamConfig) obj;
        if (other.getSigningRegion() == null ^ this.getSigningRegion() == null)
            return false;
        if (other.getSigningRegion() != null && other.getSigningRegion().equals(this.getSigningRegion()) == false)
            return false;
        if (other.getSigningServiceName() == null ^ this.getSigningServiceName() == null)
            return false;
        if (other.getSigningServiceName() != null && other.getSigningServiceName().equals(this.getSigningServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSigningRegion() == null) ? 0 : getSigningRegion().hashCode());
        hashCode = prime * hashCode + ((getSigningServiceName() == null) ? 0 : getSigningServiceName().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamConfig clone() {
        try {
            return (AwsIamConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.AwsIamConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
