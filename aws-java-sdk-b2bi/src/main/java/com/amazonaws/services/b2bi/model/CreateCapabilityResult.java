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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateCapability" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCapabilityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a system-assigned unique identifier for the capability.
     * </p>
     */
    private String capabilityId;
    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     * partnership, profile, or transformer.
     * </p>
     */
    private String capabilityArn;
    /**
     * <p>
     * Returns the name of the capability used to identify it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Returns a structure that contains the details for a capability.
     * </p>
     */
    private CapabilityConfiguration configuration;
    /**
     * <p>
     * Returns one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     * capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * </p>
     */
    private java.util.List<S3Location> instructionsDocuments;
    /**
     * <p>
     * Returns a timestamp for creation date and time of the capability.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * Returns a system-assigned unique identifier for the capability.
     * </p>
     * 
     * @param capabilityId
     *        Returns a system-assigned unique identifier for the capability.
     */

    public void setCapabilityId(String capabilityId) {
        this.capabilityId = capabilityId;
    }

    /**
     * <p>
     * Returns a system-assigned unique identifier for the capability.
     * </p>
     * 
     * @return Returns a system-assigned unique identifier for the capability.
     */

    public String getCapabilityId() {
        return this.capabilityId;
    }

    /**
     * <p>
     * Returns a system-assigned unique identifier for the capability.
     * </p>
     * 
     * @param capabilityId
     *        Returns a system-assigned unique identifier for the capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityResult withCapabilityId(String capabilityId) {
        setCapabilityId(capabilityId);
        return this;
    }

    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     * partnership, profile, or transformer.
     * </p>
     * 
     * @param capabilityArn
     *        Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     *        partnership, profile, or transformer.
     */

    public void setCapabilityArn(String capabilityArn) {
        this.capabilityArn = capabilityArn;
    }

    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     * partnership, profile, or transformer.
     * </p>
     * 
     * @return Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     *         partnership, profile, or transformer.
     */

    public String getCapabilityArn() {
        return this.capabilityArn;
    }

    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     * partnership, profile, or transformer.
     * </p>
     * 
     * @param capabilityArn
     *        Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     *        partnership, profile, or transformer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityResult withCapabilityArn(String capabilityArn) {
        setCapabilityArn(capabilityArn);
        return this;
    }

    /**
     * <p>
     * Returns the name of the capability used to identify it.
     * </p>
     * 
     * @param name
     *        Returns the name of the capability used to identify it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Returns the name of the capability used to identify it.
     * </p>
     * 
     * @return Returns the name of the capability used to identify it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Returns the name of the capability used to identify it.
     * </p>
     * 
     * @param name
     *        Returns the name of the capability used to identify it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @param type
     *        Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * @see CapabilityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @return Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * @see CapabilityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @param type
     *        Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilityType
     */

    public CreateCapabilityResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @param type
     *        Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapabilityType
     */

    public CreateCapabilityResult withType(CapabilityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Returns a structure that contains the details for a capability.
     * </p>
     * 
     * @param configuration
     *        Returns a structure that contains the details for a capability.
     */

    public void setConfiguration(CapabilityConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Returns a structure that contains the details for a capability.
     * </p>
     * 
     * @return Returns a structure that contains the details for a capability.
     */

    public CapabilityConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Returns a structure that contains the details for a capability.
     * </p>
     * 
     * @param configuration
     *        Returns a structure that contains the details for a capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityResult withConfiguration(CapabilityConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Returns one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     * capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * </p>
     * 
     * @return Returns one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     *         capability. Each item contains the name of the bucket and the key, to identify the document's location.
     */

    public java.util.List<S3Location> getInstructionsDocuments() {
        return instructionsDocuments;
    }

    /**
     * <p>
     * Returns one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     * capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * </p>
     * 
     * @param instructionsDocuments
     *        Returns one or more locations in Amazon S3, each specifying an EDI document that can be used with this
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
     * Returns one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     * capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstructionsDocuments(java.util.Collection)} or
     * {@link #withInstructionsDocuments(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instructionsDocuments
     *        Returns one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     *        capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityResult withInstructionsDocuments(S3Location... instructionsDocuments) {
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
     * Returns one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     * capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * </p>
     * 
     * @param instructionsDocuments
     *        Returns one or more locations in Amazon S3, each specifying an EDI document that can be used with this
     *        capability. Each item contains the name of the bucket and the key, to identify the document's location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityResult withInstructionsDocuments(java.util.Collection<S3Location> instructionsDocuments) {
        setInstructionsDocuments(instructionsDocuments);
        return this;
    }

    /**
     * <p>
     * Returns a timestamp for creation date and time of the capability.
     * </p>
     * 
     * @param createdAt
     *        Returns a timestamp for creation date and time of the capability.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Returns a timestamp for creation date and time of the capability.
     * </p>
     * 
     * @return Returns a timestamp for creation date and time of the capability.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Returns a timestamp for creation date and time of the capability.
     * </p>
     * 
     * @param createdAt
     *        Returns a timestamp for creation date and time of the capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapabilityResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getCapabilityId() != null)
            sb.append("CapabilityId: ").append(getCapabilityId()).append(",");
        if (getCapabilityArn() != null)
            sb.append("CapabilityArn: ").append(getCapabilityArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getInstructionsDocuments() != null)
            sb.append("InstructionsDocuments: ").append(getInstructionsDocuments()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCapabilityResult == false)
            return false;
        CreateCapabilityResult other = (CreateCapabilityResult) obj;
        if (other.getCapabilityId() == null ^ this.getCapabilityId() == null)
            return false;
        if (other.getCapabilityId() != null && other.getCapabilityId().equals(this.getCapabilityId()) == false)
            return false;
        if (other.getCapabilityArn() == null ^ this.getCapabilityArn() == null)
            return false;
        if (other.getCapabilityArn() != null && other.getCapabilityArn().equals(this.getCapabilityArn()) == false)
            return false;
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
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapabilityId() == null) ? 0 : getCapabilityId().hashCode());
        hashCode = prime * hashCode + ((getCapabilityArn() == null) ? 0 : getCapabilityArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInstructionsDocuments() == null) ? 0 : getInstructionsDocuments().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public CreateCapabilityResult clone() {
        try {
            return (CreateCapabilityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
