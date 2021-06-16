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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the primary or replica key in a multi-Region key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/MultiRegionKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiRegionKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Displays the key ARN of a primary or replica key of a multi-Region key.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Displays the AWS Region of a primary or replica key in a multi-Region key.
     * </p>
     */
    private String region;

    /**
     * <p>
     * Displays the key ARN of a primary or replica key of a multi-Region key.
     * </p>
     * 
     * @param arn
     *        Displays the key ARN of a primary or replica key of a multi-Region key.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Displays the key ARN of a primary or replica key of a multi-Region key.
     * </p>
     * 
     * @return Displays the key ARN of a primary or replica key of a multi-Region key.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Displays the key ARN of a primary or replica key of a multi-Region key.
     * </p>
     * 
     * @param arn
     *        Displays the key ARN of a primary or replica key of a multi-Region key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionKey withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Displays the AWS Region of a primary or replica key in a multi-Region key.
     * </p>
     * 
     * @param region
     *        Displays the AWS Region of a primary or replica key in a multi-Region key.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * Displays the AWS Region of a primary or replica key in a multi-Region key.
     * </p>
     * 
     * @return Displays the AWS Region of a primary or replica key in a multi-Region key.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * Displays the AWS Region of a primary or replica key in a multi-Region key.
     * </p>
     * 
     * @param region
     *        Displays the AWS Region of a primary or replica key in a multi-Region key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiRegionKey withRegion(String region) {
        setRegion(region);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiRegionKey == false)
            return false;
        MultiRegionKey other = (MultiRegionKey) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public MultiRegionKey clone() {
        try {
            return (MultiRegionKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kms.model.transform.MultiRegionKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
