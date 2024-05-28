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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains an optional comment about your Amazon Route 53 hosted zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRoute53HostedZoneConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRoute53HostedZoneConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Any comments that you include about the hosted zone.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * Any comments that you include about the hosted zone.
     * </p>
     * 
     * @param comment
     *        Any comments that you include about the hosted zone.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Any comments that you include about the hosted zone.
     * </p>
     * 
     * @return Any comments that you include about the hosted zone.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * Any comments that you include about the hosted zone.
     * </p>
     * 
     * @param comment
     *        Any comments that you include about the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53HostedZoneConfigDetails withComment(String comment) {
        setComment(comment);
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRoute53HostedZoneConfigDetails == false)
            return false;
        AwsRoute53HostedZoneConfigDetails other = (AwsRoute53HostedZoneConfigDetails) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public AwsRoute53HostedZoneConfigDetails clone() {
        try {
            return (AwsRoute53HostedZoneConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRoute53HostedZoneConfigDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
