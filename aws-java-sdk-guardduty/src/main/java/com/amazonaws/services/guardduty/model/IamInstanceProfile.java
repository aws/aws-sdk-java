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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The profile information of the EC2 instance.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/IamInstanceProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IamInstanceProfile implements Serializable, Cloneable, StructuredPojo {

    /** AWS EC2 instance profile ARN. */
    private String arn;
    /** AWS EC2 instance profile ID. */
    private String id;

    /**
     * AWS EC2 instance profile ARN.
     * 
     * @param arn
     *        AWS EC2 instance profile ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * AWS EC2 instance profile ARN.
     * 
     * @return AWS EC2 instance profile ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * AWS EC2 instance profile ARN.
     * 
     * @param arn
     *        AWS EC2 instance profile ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamInstanceProfile withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * AWS EC2 instance profile ID.
     * 
     * @param id
     *        AWS EC2 instance profile ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * AWS EC2 instance profile ID.
     * 
     * @return AWS EC2 instance profile ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * AWS EC2 instance profile ID.
     * 
     * @param id
     *        AWS EC2 instance profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamInstanceProfile withId(String id) {
        setId(id);
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
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IamInstanceProfile == false)
            return false;
        IamInstanceProfile other = (IamInstanceProfile) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public IamInstanceProfile clone() {
        try {
            return (IamInstanceProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.IamInstanceProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
