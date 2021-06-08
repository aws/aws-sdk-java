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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The IAM principal that you allowing or denying access to an Amazon Lex action. You must provide a
 * <code>service</code> or an <code>arn</code>, but not both in the same statement. For more information, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html"> AWS JSON policy
 * elements: Principal </a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/Principal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Principal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS service that should allowed or denied access to an Amazon Lex action.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name of the AWS service that should allowed or denied access to an Amazon Lex action.
     * </p>
     * 
     * @param service
     *        The name of the AWS service that should allowed or denied access to an Amazon Lex action.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The name of the AWS service that should allowed or denied access to an Amazon Lex action.
     * </p>
     * 
     * @return The name of the AWS service that should allowed or denied access to an Amazon Lex action.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The name of the AWS service that should allowed or denied access to an Amazon Lex action.
     * </p>
     * 
     * @param service
     *        The name of the AWS service that should allowed or denied access to an Amazon Lex action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the principal.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the principal.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withArn(String arn) {
        setArn(arn);
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
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Principal == false)
            return false;
        Principal other = (Principal) obj;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public Principal clone() {
        try {
            return (Principal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.PrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
