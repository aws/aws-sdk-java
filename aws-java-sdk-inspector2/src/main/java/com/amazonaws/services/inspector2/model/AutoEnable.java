/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents which scan types are automatically enabled for new members of your Amazon Inspector organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AutoEnable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoEnable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents whether Amazon EC2 scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     */
    private Boolean ec2;
    /**
     * <p>
     * Represents whether Amazon ECR scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     */
    private Boolean ecr;
    /**
     * <p>
     * Represents whether AWS Lambda scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     */
    private Boolean lambda;

    /**
     * <p>
     * Represents whether Amazon EC2 scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     * 
     * @param ec2
     *        Represents whether Amazon EC2 scans are automatically enabled for new members of your Amazon Inspector
     *        organization.
     */

    public void setEc2(Boolean ec2) {
        this.ec2 = ec2;
    }

    /**
     * <p>
     * Represents whether Amazon EC2 scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     * 
     * @return Represents whether Amazon EC2 scans are automatically enabled for new members of your Amazon Inspector
     *         organization.
     */

    public Boolean getEc2() {
        return this.ec2;
    }

    /**
     * <p>
     * Represents whether Amazon EC2 scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     * 
     * @param ec2
     *        Represents whether Amazon EC2 scans are automatically enabled for new members of your Amazon Inspector
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoEnable withEc2(Boolean ec2) {
        setEc2(ec2);
        return this;
    }

    /**
     * <p>
     * Represents whether Amazon EC2 scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     * 
     * @return Represents whether Amazon EC2 scans are automatically enabled for new members of your Amazon Inspector
     *         organization.
     */

    public Boolean isEc2() {
        return this.ec2;
    }

    /**
     * <p>
     * Represents whether Amazon ECR scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     * 
     * @param ecr
     *        Represents whether Amazon ECR scans are automatically enabled for new members of your Amazon Inspector
     *        organization.
     */

    public void setEcr(Boolean ecr) {
        this.ecr = ecr;
    }

    /**
     * <p>
     * Represents whether Amazon ECR scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     * 
     * @return Represents whether Amazon ECR scans are automatically enabled for new members of your Amazon Inspector
     *         organization.
     */

    public Boolean getEcr() {
        return this.ecr;
    }

    /**
     * <p>
     * Represents whether Amazon ECR scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     * 
     * @param ecr
     *        Represents whether Amazon ECR scans are automatically enabled for new members of your Amazon Inspector
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoEnable withEcr(Boolean ecr) {
        setEcr(ecr);
        return this;
    }

    /**
     * <p>
     * Represents whether Amazon ECR scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     * 
     * @return Represents whether Amazon ECR scans are automatically enabled for new members of your Amazon Inspector
     *         organization.
     */

    public Boolean isEcr() {
        return this.ecr;
    }

    /**
     * <p>
     * Represents whether AWS Lambda scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     * 
     * @param lambda
     *        Represents whether AWS Lambda scans are automatically enabled for new members of your Amazon Inspector
     *        organization.
     */

    public void setLambda(Boolean lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * Represents whether AWS Lambda scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     * 
     * @return Represents whether AWS Lambda scans are automatically enabled for new members of your Amazon Inspector
     *         organization.
     */

    public Boolean getLambda() {
        return this.lambda;
    }

    /**
     * <p>
     * Represents whether AWS Lambda scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     * 
     * @param lambda
     *        Represents whether AWS Lambda scans are automatically enabled for new members of your Amazon Inspector
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoEnable withLambda(Boolean lambda) {
        setLambda(lambda);
        return this;
    }

    /**
     * <p>
     * Represents whether AWS Lambda scans are automatically enabled for new members of your Amazon Inspector
     * organization.
     * </p>
     * 
     * @return Represents whether AWS Lambda scans are automatically enabled for new members of your Amazon Inspector
     *         organization.
     */

    public Boolean isLambda() {
        return this.lambda;
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
        if (getEc2() != null)
            sb.append("Ec2: ").append(getEc2()).append(",");
        if (getEcr() != null)
            sb.append("Ecr: ").append(getEcr()).append(",");
        if (getLambda() != null)
            sb.append("Lambda: ").append(getLambda());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoEnable == false)
            return false;
        AutoEnable other = (AutoEnable) obj;
        if (other.getEc2() == null ^ this.getEc2() == null)
            return false;
        if (other.getEc2() != null && other.getEc2().equals(this.getEc2()) == false)
            return false;
        if (other.getEcr() == null ^ this.getEcr() == null)
            return false;
        if (other.getEcr() != null && other.getEcr().equals(this.getEcr()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEc2() == null) ? 0 : getEc2().hashCode());
        hashCode = prime * hashCode + ((getEcr() == null) ? 0 : getEcr().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        return hashCode;
    }

    @Override
    public AutoEnable clone() {
        try {
            return (AutoEnable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.AutoEnableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
