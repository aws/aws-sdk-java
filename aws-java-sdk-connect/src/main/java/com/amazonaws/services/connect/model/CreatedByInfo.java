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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information on the identity that created the file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreatedByInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatedByInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An agent ARN representing a <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     * >connect user</a>.
     * </p>
     */
    private String connectUserArn;
    /**
     * <p>
     * STS or IAM ARN representing the identity of API Caller. SDK users cannot populate this and this value is
     * calculated automatically if <code>ConnectUserArn</code> is not provided.
     * </p>
     */
    private String aWSIdentityArn;

    /**
     * <p>
     * An agent ARN representing a <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     * >connect user</a>.
     * </p>
     * 
     * @param connectUserArn
     *        An agent ARN representing a <a href=
     *        "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     *        >connect user</a>.
     */

    public void setConnectUserArn(String connectUserArn) {
        this.connectUserArn = connectUserArn;
    }

    /**
     * <p>
     * An agent ARN representing a <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     * >connect user</a>.
     * </p>
     * 
     * @return An agent ARN representing a <a href=
     *         "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     *         >connect user</a>.
     */

    public String getConnectUserArn() {
        return this.connectUserArn;
    }

    /**
     * <p>
     * An agent ARN representing a <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     * >connect user</a>.
     * </p>
     * 
     * @param connectUserArn
     *        An agent ARN representing a <a href=
     *        "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-resources-for-iam-policies"
     *        >connect user</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatedByInfo withConnectUserArn(String connectUserArn) {
        setConnectUserArn(connectUserArn);
        return this;
    }

    /**
     * <p>
     * STS or IAM ARN representing the identity of API Caller. SDK users cannot populate this and this value is
     * calculated automatically if <code>ConnectUserArn</code> is not provided.
     * </p>
     * 
     * @param aWSIdentityArn
     *        STS or IAM ARN representing the identity of API Caller. SDK users cannot populate this and this value is
     *        calculated automatically if <code>ConnectUserArn</code> is not provided.
     */

    public void setAWSIdentityArn(String aWSIdentityArn) {
        this.aWSIdentityArn = aWSIdentityArn;
    }

    /**
     * <p>
     * STS or IAM ARN representing the identity of API Caller. SDK users cannot populate this and this value is
     * calculated automatically if <code>ConnectUserArn</code> is not provided.
     * </p>
     * 
     * @return STS or IAM ARN representing the identity of API Caller. SDK users cannot populate this and this value is
     *         calculated automatically if <code>ConnectUserArn</code> is not provided.
     */

    public String getAWSIdentityArn() {
        return this.aWSIdentityArn;
    }

    /**
     * <p>
     * STS or IAM ARN representing the identity of API Caller. SDK users cannot populate this and this value is
     * calculated automatically if <code>ConnectUserArn</code> is not provided.
     * </p>
     * 
     * @param aWSIdentityArn
     *        STS or IAM ARN representing the identity of API Caller. SDK users cannot populate this and this value is
     *        calculated automatically if <code>ConnectUserArn</code> is not provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatedByInfo withAWSIdentityArn(String aWSIdentityArn) {
        setAWSIdentityArn(aWSIdentityArn);
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
        if (getConnectUserArn() != null)
            sb.append("ConnectUserArn: ").append(getConnectUserArn()).append(",");
        if (getAWSIdentityArn() != null)
            sb.append("AWSIdentityArn: ").append(getAWSIdentityArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatedByInfo == false)
            return false;
        CreatedByInfo other = (CreatedByInfo) obj;
        if (other.getConnectUserArn() == null ^ this.getConnectUserArn() == null)
            return false;
        if (other.getConnectUserArn() != null && other.getConnectUserArn().equals(this.getConnectUserArn()) == false)
            return false;
        if (other.getAWSIdentityArn() == null ^ this.getAWSIdentityArn() == null)
            return false;
        if (other.getAWSIdentityArn() != null && other.getAWSIdentityArn().equals(this.getAWSIdentityArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectUserArn() == null) ? 0 : getConnectUserArn().hashCode());
        hashCode = prime * hashCode + ((getAWSIdentityArn() == null) ? 0 : getAWSIdentityArn().hashCode());
        return hashCode;
    }

    @Override
    public CreatedByInfo clone() {
        try {
            return (CreatedByInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.CreatedByInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
