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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateCapability" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCapabilityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a system-assigned unique identifier for the capability.
     * </p>
     */
    private String capabilityId;
    /**
     * <p>
     * Specifies a new name for the capability, to replace the existing name.
     * </p>
     */
    private String name;
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
     * Specifies a system-assigned unique identifier for the capability.
     * </p>
     * 
     * @param capabilityId
     *        Specifies a system-assigned unique identifier for the capability.
     */

    public void setCapabilityId(String capabilityId) {
        this.capabilityId = capabilityId;
    }

    /**
     * <p>
     * Specifies a system-assigned unique identifier for the capability.
     * </p>
     * 
     * @return Specifies a system-assigned unique identifier for the capability.
     */

    public String getCapabilityId() {
        return this.capabilityId;
    }

    /**
     * <p>
     * Specifies a system-assigned unique identifier for the capability.
     * </p>
     * 
     * @param capabilityId
     *        Specifies a system-assigned unique identifier for the capability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCapabilityRequest withCapabilityId(String capabilityId) {
        setCapabilityId(capabilityId);
        return this;
    }

    /**
     * <p>
     * Specifies a new name for the capability, to replace the existing name.
     * </p>
     * 
     * @param name
     *        Specifies a new name for the capability, to replace the existing name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies a new name for the capability, to replace the existing name.
     * </p>
     * 
     * @return Specifies a new name for the capability, to replace the existing name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies a new name for the capability, to replace the existing name.
     * </p>
     * 
     * @param name
     *        Specifies a new name for the capability, to replace the existing name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCapabilityRequest withName(String name) {
        setName(name);
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

    public UpdateCapabilityRequest withConfiguration(CapabilityConfiguration configuration) {
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

    public UpdateCapabilityRequest withInstructionsDocuments(S3Location... instructionsDocuments) {
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

    public UpdateCapabilityRequest withInstructionsDocuments(java.util.Collection<S3Location> instructionsDocuments) {
        setInstructionsDocuments(instructionsDocuments);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getInstructionsDocuments() != null)
            sb.append("InstructionsDocuments: ").append(getInstructionsDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCapabilityRequest == false)
            return false;
        UpdateCapabilityRequest other = (UpdateCapabilityRequest) obj;
        if (other.getCapabilityId() == null ^ this.getCapabilityId() == null)
            return false;
        if (other.getCapabilityId() != null && other.getCapabilityId().equals(this.getCapabilityId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getInstructionsDocuments() == null ^ this.getInstructionsDocuments() == null)
            return false;
        if (other.getInstructionsDocuments() != null && other.getInstructionsDocuments().equals(this.getInstructionsDocuments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapabilityId() == null) ? 0 : getCapabilityId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInstructionsDocuments() == null) ? 0 : getInstructionsDocuments().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCapabilityRequest clone() {
        return (UpdateCapabilityRequest) super.clone();
    }

}
