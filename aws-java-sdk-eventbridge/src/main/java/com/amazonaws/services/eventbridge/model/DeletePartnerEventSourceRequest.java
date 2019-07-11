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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeletePartnerEventSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePartnerEventSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the event source to delete.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The AWS account ID of the AWS customer that the event source was created for.
     * </p>
     */
    private String account;

    /**
     * <p>
     * The name of the event source to delete.
     * </p>
     * 
     * @param name
     *        The name of the event source to delete.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the event source to delete.
     * </p>
     * 
     * @return The name of the event source to delete.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the event source to delete.
     * </p>
     * 
     * @param name
     *        The name of the event source to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePartnerEventSourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the AWS customer that the event source was created for.
     * </p>
     * 
     * @param account
     *        The AWS account ID of the AWS customer that the event source was created for.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The AWS account ID of the AWS customer that the event source was created for.
     * </p>
     * 
     * @return The AWS account ID of the AWS customer that the event source was created for.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The AWS account ID of the AWS customer that the event source was created for.
     * </p>
     * 
     * @param account
     *        The AWS account ID of the AWS customer that the event source was created for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePartnerEventSourceRequest withAccount(String account) {
        setAccount(account);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePartnerEventSourceRequest == false)
            return false;
        DeletePartnerEventSourceRequest other = (DeletePartnerEventSourceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        return hashCode;
    }

    @Override
    public DeletePartnerEventSourceRequest clone() {
        return (DeletePartnerEventSourceRequest) super.clone();
    }

}
