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

/**
 * <p>
 * The output from the DescribeThing operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeThingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The default client ID.
     * </p>
     */
    private String defaultClientId;
    /**
     * <p>
     * The name of the thing.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The ID of the thing to describe.
     * </p>
     */
    private String thingId;
    /**
     * <p>
     * The ARN of the thing to describe.
     * </p>
     */
    private String thingArn;
    /**
     * <p>
     * The thing type name.
     * </p>
     */
    private String thingTypeName;
    /**
     * <p>
     * The thing attributes.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * The current version of the thing record in the registry.
     * </p>
     * <note>
     * <p>
     * To avoid unintentional changes to the information in the registry, you can pass the version information in the
     * <code>expectedVersion</code> parameter of the <code>UpdateThing</code> and <code>DeleteThing</code> calls.
     * </p>
     * </note>
     */
    private Long version;
    /**
     * <p>
     * The name of the billing group the thing belongs to.
     * </p>
     */
    private String billingGroupName;

    /**
     * <p>
     * The default client ID.
     * </p>
     * 
     * @param defaultClientId
     *        The default client ID.
     */

    public void setDefaultClientId(String defaultClientId) {
        this.defaultClientId = defaultClientId;
    }

    /**
     * <p>
     * The default client ID.
     * </p>
     * 
     * @return The default client ID.
     */

    public String getDefaultClientId() {
        return this.defaultClientId;
    }

    /**
     * <p>
     * The default client ID.
     * </p>
     * 
     * @param defaultClientId
     *        The default client ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingResult withDefaultClientId(String defaultClientId) {
        setDefaultClientId(defaultClientId);
        return this;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @return The name of the thing.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingResult withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The ID of the thing to describe.
     * </p>
     * 
     * @param thingId
     *        The ID of the thing to describe.
     */

    public void setThingId(String thingId) {
        this.thingId = thingId;
    }

    /**
     * <p>
     * The ID of the thing to describe.
     * </p>
     * 
     * @return The ID of the thing to describe.
     */

    public String getThingId() {
        return this.thingId;
    }

    /**
     * <p>
     * The ID of the thing to describe.
     * </p>
     * 
     * @param thingId
     *        The ID of the thing to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingResult withThingId(String thingId) {
        setThingId(thingId);
        return this;
    }

    /**
     * <p>
     * The ARN of the thing to describe.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing to describe.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of the thing to describe.
     * </p>
     * 
     * @return The ARN of the thing to describe.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * <p>
     * The ARN of the thing to describe.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingResult withThingArn(String thingArn) {
        setThingArn(thingArn);
        return this;
    }

    /**
     * <p>
     * The thing type name.
     * </p>
     * 
     * @param thingTypeName
     *        The thing type name.
     */

    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The thing type name.
     * </p>
     * 
     * @return The thing type name.
     */

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    /**
     * <p>
     * The thing type name.
     * </p>
     * 
     * @param thingTypeName
     *        The thing type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingResult withThingTypeName(String thingTypeName) {
        setThingTypeName(thingTypeName);
        return this;
    }

    /**
     * <p>
     * The thing attributes.
     * </p>
     * 
     * @return The thing attributes.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The thing attributes.
     * </p>
     * 
     * @param attributes
     *        The thing attributes.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The thing attributes.
     * </p>
     * 
     * @param attributes
     *        The thing attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingResult withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public DescribeThingResult addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingResult clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The current version of the thing record in the registry.
     * </p>
     * <note>
     * <p>
     * To avoid unintentional changes to the information in the registry, you can pass the version information in the
     * <code>expectedVersion</code> parameter of the <code>UpdateThing</code> and <code>DeleteThing</code> calls.
     * </p>
     * </note>
     * 
     * @param version
     *        The current version of the thing record in the registry.</p> <note>
     *        <p>
     *        To avoid unintentional changes to the information in the registry, you can pass the version information in
     *        the <code>expectedVersion</code> parameter of the <code>UpdateThing</code> and <code>DeleteThing</code>
     *        calls.
     *        </p>
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The current version of the thing record in the registry.
     * </p>
     * <note>
     * <p>
     * To avoid unintentional changes to the information in the registry, you can pass the version information in the
     * <code>expectedVersion</code> parameter of the <code>UpdateThing</code> and <code>DeleteThing</code> calls.
     * </p>
     * </note>
     * 
     * @return The current version of the thing record in the registry.</p> <note>
     *         <p>
     *         To avoid unintentional changes to the information in the registry, you can pass the version information
     *         in the <code>expectedVersion</code> parameter of the <code>UpdateThing</code> and
     *         <code>DeleteThing</code> calls.
     *         </p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The current version of the thing record in the registry.
     * </p>
     * <note>
     * <p>
     * To avoid unintentional changes to the information in the registry, you can pass the version information in the
     * <code>expectedVersion</code> parameter of the <code>UpdateThing</code> and <code>DeleteThing</code> calls.
     * </p>
     * </note>
     * 
     * @param version
     *        The current version of the thing record in the registry.</p> <note>
     *        <p>
     *        To avoid unintentional changes to the information in the registry, you can pass the version information in
     *        the <code>expectedVersion</code> parameter of the <code>UpdateThing</code> and <code>DeleteThing</code>
     *        calls.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingResult withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The name of the billing group the thing belongs to.
     * </p>
     * 
     * @param billingGroupName
     *        The name of the billing group the thing belongs to.
     */

    public void setBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
    }

    /**
     * <p>
     * The name of the billing group the thing belongs to.
     * </p>
     * 
     * @return The name of the billing group the thing belongs to.
     */

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    /**
     * <p>
     * The name of the billing group the thing belongs to.
     * </p>
     * 
     * @param billingGroupName
     *        The name of the billing group the thing belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingResult withBillingGroupName(String billingGroupName) {
        setBillingGroupName(billingGroupName);
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
        if (getDefaultClientId() != null)
            sb.append("DefaultClientId: ").append(getDefaultClientId()).append(",");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getThingId() != null)
            sb.append("ThingId: ").append(getThingId()).append(",");
        if (getThingArn() != null)
            sb.append("ThingArn: ").append(getThingArn()).append(",");
        if (getThingTypeName() != null)
            sb.append("ThingTypeName: ").append(getThingTypeName()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getBillingGroupName() != null)
            sb.append("BillingGroupName: ").append(getBillingGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThingResult == false)
            return false;
        DescribeThingResult other = (DescribeThingResult) obj;
        if (other.getDefaultClientId() == null ^ this.getDefaultClientId() == null)
            return false;
        if (other.getDefaultClientId() != null && other.getDefaultClientId().equals(this.getDefaultClientId()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingId() == null ^ this.getThingId() == null)
            return false;
        if (other.getThingId() != null && other.getThingId().equals(this.getThingId()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getBillingGroupName() == null ^ this.getBillingGroupName() == null)
            return false;
        if (other.getBillingGroupName() != null && other.getBillingGroupName().equals(this.getBillingGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultClientId() == null) ? 0 : getDefaultClientId().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingId() == null) ? 0 : getThingId().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        hashCode = prime * hashCode + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getBillingGroupName() == null) ? 0 : getBillingGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeThingResult clone() {
        try {
            return (DescribeThingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
