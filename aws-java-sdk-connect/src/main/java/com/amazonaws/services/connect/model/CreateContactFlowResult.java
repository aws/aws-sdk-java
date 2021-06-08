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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateContactFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContactFlowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     */
    private String contactFlowId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     */
    private String contactFlowArn;

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the contact flow.
     */

    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * 
     * @return The identifier of the contact flow.
     */

    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactFlowResult withContactFlowId(String contactFlowId) {
        setContactFlowId(contactFlowId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     * 
     * @param contactFlowArn
     *        The Amazon Resource Name (ARN) of the contact flow.
     */

    public void setContactFlowArn(String contactFlowArn) {
        this.contactFlowArn = contactFlowArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact flow.
     */

    public String getContactFlowArn() {
        return this.contactFlowArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     * 
     * @param contactFlowArn
     *        The Amazon Resource Name (ARN) of the contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactFlowResult withContactFlowArn(String contactFlowArn) {
        setContactFlowArn(contactFlowArn);
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
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: ").append(getContactFlowId()).append(",");
        if (getContactFlowArn() != null)
            sb.append("ContactFlowArn: ").append(getContactFlowArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContactFlowResult == false)
            return false;
        CreateContactFlowResult other = (CreateContactFlowResult) obj;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getContactFlowArn() == null ^ this.getContactFlowArn() == null)
            return false;
        if (other.getContactFlowArn() != null && other.getContactFlowArn().equals(this.getContactFlowArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getContactFlowArn() == null) ? 0 : getContactFlowArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateContactFlowResult clone() {
        try {
            return (CreateContactFlowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
