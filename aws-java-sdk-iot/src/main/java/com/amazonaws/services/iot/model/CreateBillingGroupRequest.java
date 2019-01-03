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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBillingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name you wish to give to the billing group.
     * </p>
     */
    private String billingGroupName;
    /**
     * <p>
     * The properties of the billing group.
     * </p>
     */
    private BillingGroupProperties billingGroupProperties;
    /**
     * <p>
     * Metadata which can be used to manage the billing group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name you wish to give to the billing group.
     * </p>
     * 
     * @param billingGroupName
     *        The name you wish to give to the billing group.
     */

    public void setBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
    }

    /**
     * <p>
     * The name you wish to give to the billing group.
     * </p>
     * 
     * @return The name you wish to give to the billing group.
     */

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    /**
     * <p>
     * The name you wish to give to the billing group.
     * </p>
     * 
     * @param billingGroupName
     *        The name you wish to give to the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillingGroupRequest withBillingGroupName(String billingGroupName) {
        setBillingGroupName(billingGroupName);
        return this;
    }

    /**
     * <p>
     * The properties of the billing group.
     * </p>
     * 
     * @param billingGroupProperties
     *        The properties of the billing group.
     */

    public void setBillingGroupProperties(BillingGroupProperties billingGroupProperties) {
        this.billingGroupProperties = billingGroupProperties;
    }

    /**
     * <p>
     * The properties of the billing group.
     * </p>
     * 
     * @return The properties of the billing group.
     */

    public BillingGroupProperties getBillingGroupProperties() {
        return this.billingGroupProperties;
    }

    /**
     * <p>
     * The properties of the billing group.
     * </p>
     * 
     * @param billingGroupProperties
     *        The properties of the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillingGroupRequest withBillingGroupProperties(BillingGroupProperties billingGroupProperties) {
        setBillingGroupProperties(billingGroupProperties);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the billing group.
     * </p>
     * 
     * @return Metadata which can be used to manage the billing group.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the billing group.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the billing group.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the billing group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillingGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the billing group.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillingGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getBillingGroupName() != null)
            sb.append("BillingGroupName: ").append(getBillingGroupName()).append(",");
        if (getBillingGroupProperties() != null)
            sb.append("BillingGroupProperties: ").append(getBillingGroupProperties()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBillingGroupRequest == false)
            return false;
        CreateBillingGroupRequest other = (CreateBillingGroupRequest) obj;
        if (other.getBillingGroupName() == null ^ this.getBillingGroupName() == null)
            return false;
        if (other.getBillingGroupName() != null && other.getBillingGroupName().equals(this.getBillingGroupName()) == false)
            return false;
        if (other.getBillingGroupProperties() == null ^ this.getBillingGroupProperties() == null)
            return false;
        if (other.getBillingGroupProperties() != null && other.getBillingGroupProperties().equals(this.getBillingGroupProperties()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBillingGroupName() == null) ? 0 : getBillingGroupName().hashCode());
        hashCode = prime * hashCode + ((getBillingGroupProperties() == null) ? 0 : getBillingGroupProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateBillingGroupRequest clone() {
        return (CreateBillingGroupRequest) super.clone();
    }

}
