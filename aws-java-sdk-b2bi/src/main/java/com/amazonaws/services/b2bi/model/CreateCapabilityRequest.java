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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateCapability" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCapabilityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the capability, used to identify it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Specifies a structure that contains the details for a capability.
     * </p>
     */
    private CapabilityConfiguration configuration;
    /**
     * <p>
     * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     * capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * </p>
     */
    private java.util.List<S3Location> instructionsDocuments;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the name of the capability, used to identify it.
     * </p>
     * 
     * @param name
     *        Specifies the name of the capability, used to identify it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the capability, used to identify it.
     * </p>
     * 
     * @return Specifies the name of the capability, used to identify it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the capability, used to identify it.
     * </p>
     * 
     * @param name
     *        Specifies the name of the capability, used to identify it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @param type
     *        Specifies the type of the capability. Currently, only <code>edi</code> is supported.
     * @see CapabilityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @return Specifies the type of the capability. Currently, only <code>edi</code> is supported.
     * @see CapabilityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @param type
     *        Specifies the type of the capability. Currently, only <code>edi</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilityType
     */

    public CreateCapabilityRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @param type
     *        Specifies the type of the capability. Currently, only <code>edi</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilityType
     */

    public CreateCapabilityRequest withType(CapabilityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a structure that contains the details for a capability.
     * </p>
     * 
     * @param configuration
     *        Specifies a structure that contains the details for a capability.
     */

    public void setConfiguration(CapabilityConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Specifies a structure that contains the details for a capability.
     * </p>
     * 
     * @return Specifies a structure that contains the details for a capability.
     */

    public CapabilityConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Specifies a structure that contains the details for a capability.
     * </p>
     * 
     * @param configuration
     *        Specifies a structure that contains the details for a capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityRequest withConfiguration(CapabilityConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     * capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * </p>
     * 
     * @return Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     *         capability. Each item contains the name of the bucket and the key, to identify the document's location.
     */

    public java.util.List<S3Location> getInstructionsDocuments() {
        return instructionsDocuments;
    }

    /**
     * <p>
     * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     * capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * </p>
     * 
     * @param instructionsDocuments
     *        Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     *        capability. Each item contains the name of the bucket and the key, to identify the document's location.
     */

    public void setInstructionsDocuments(java.util.Collection<S3Location> instructionsDocuments) {
        if (instructionsDocuments == null) {
            this.instructionsDocuments = null;
            return;
        }

        this.instructionsDocuments = new java.util.ArrayList<S3Location>(instructionsDocuments);
    }

    /**
     * <p>
     * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     * capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstructionsDocuments(java.util.Collection)} or
     * {@link #withInstructionsDocuments(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instructionsDocuments
     *        Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     *        capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityRequest withInstructionsDocuments(S3Location... instructionsDocuments) {
        if (this.instructionsDocuments == null) {
            setInstructionsDocuments(new java.util.ArrayList<S3Location>(instructionsDocuments.length));
        }
        for (S3Location ele : instructionsDocuments) {
            this.instructionsDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     * capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * </p>
     * 
     * @param instructionsDocuments
     *        Specifies one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     *        capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityRequest withInstructionsDocuments(java.util.Collection<S3Location> instructionsDocuments) {
        setInstructionsDocuments(instructionsDocuments);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param clientToken
     *        Reserved for future use.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param clientToken
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     * 
     * @return Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by
     *         type. You can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type.
     *        You can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
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
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type.
     *        You can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityRequest withTags(Tag... tags) {
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
     * Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type. You
     * can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs assigned to ARNs that you can use to group and search for resources by type.
     *        You can attach this metadata to resources (capabilities, partnerships, and so on) for any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getInstructionsDocuments() != null)
            sb.append("InstructionsDocuments: ").append(getInstructionsDocuments()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CreateCapabilityRequest == false)
            return false;
        CreateCapabilityRequest other = (CreateCapabilityRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getInstructionsDocuments() == null ^ this.getInstructionsDocuments() == null)
            return false;
        if (other.getInstructionsDocuments() != null && other.getInstructionsDocuments().equals(this.getInstructionsDocuments()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInstructionsDocuments() == null) ? 0 : getInstructionsDocuments().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCapabilityRequest clone() {
        return (CreateCapabilityRequest) super.clone();
    }

}
