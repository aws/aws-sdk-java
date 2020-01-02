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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains summary information about a contact flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ContactFlowSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactFlowSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the contact flow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of contact flow.
     * </p>
     */
    private String contactFlowType;

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * 
     * @param id
     *        The identifier of the contact flow.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * 
     * @return The identifier of the contact flow.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * 
     * @param id
     *        The identifier of the contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the contact flow.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact flow.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * 
     * @param name
     *        The name of the contact flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * 
     * @return The name of the contact flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * 
     * @param name
     *        The name of the contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * 
     * @param contactFlowType
     *        The type of contact flow.
     * @see ContactFlowType
     */

    public void setContactFlowType(String contactFlowType) {
        this.contactFlowType = contactFlowType;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * 
     * @return The type of contact flow.
     * @see ContactFlowType
     */

    public String getContactFlowType() {
        return this.contactFlowType;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * 
     * @param contactFlowType
     *        The type of contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowType
     */

    public ContactFlowSummary withContactFlowType(String contactFlowType) {
        setContactFlowType(contactFlowType);
        return this;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * 
     * @param contactFlowType
     *        The type of contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowType
     */

    public ContactFlowSummary withContactFlowType(ContactFlowType contactFlowType) {
        this.contactFlowType = contactFlowType.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getContactFlowType() != null)
            sb.append("ContactFlowType: ").append(getContactFlowType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactFlowSummary == false)
            return false;
        ContactFlowSummary other = (ContactFlowSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getContactFlowType() == null ^ this.getContactFlowType() == null)
            return false;
        if (other.getContactFlowType() != null && other.getContactFlowType().equals(this.getContactFlowType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getContactFlowType() == null) ? 0 : getContactFlowType().hashCode());
        return hashCode;
    }

    @Override
    public ContactFlowSummary clone() {
        try {
            return (ContactFlowSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ContactFlowSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
