/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a blueprint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Blueprint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Blueprint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the blueprint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time the blueprint was registered.
     * </p>
     */
    private java.util.Date createdOn;
    /**
     * <p>
     * The date and time the blueprint was last modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;
    /**
     * <p>
     * A JSON string that indicates the list of parameter specifications for the blueprint.
     * </p>
     */
    private String parameterSpec;
    /**
     * <p>
     * Specifies the path in Amazon S3 where the blueprint is published.
     * </p>
     */
    private String blueprintLocation;
    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is copied when you call
     * <code>CreateBlueprint/UpdateBlueprint</code> to register the blueprint in Glue.
     * </p>
     */
    private String blueprintServiceLocation;
    /**
     * <p>
     * The status of the blueprint registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creating — The blueprint registration is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Active — The blueprint has been successfully registered.
     * </p>
     * </li>
     * <li>
     * <p>
     * Updating — An update to the blueprint registration is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed — The blueprint registration failed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * An error message.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * When there are multiple versions of a blueprint and the latest version has some errors, this attribute indicates
     * the last successful blueprint definition that is available with the service.
     * </p>
     */
    private LastActiveDefinition lastActiveDefinition;

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param name
     *        The name of the blueprint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @return The name of the blueprint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param name
     *        The name of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the blueprint.
     * </p>
     * 
     * @param description
     *        The description of the blueprint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the blueprint.
     * </p>
     * 
     * @return The description of the blueprint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the blueprint.
     * </p>
     * 
     * @param description
     *        The description of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time the blueprint was registered.
     * </p>
     * 
     * @param createdOn
     *        The date and time the blueprint was registered.
     */

    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * <p>
     * The date and time the blueprint was registered.
     * </p>
     * 
     * @return The date and time the blueprint was registered.
     */

    public java.util.Date getCreatedOn() {
        return this.createdOn;
    }

    /**
     * <p>
     * The date and time the blueprint was registered.
     * </p>
     * 
     * @param createdOn
     *        The date and time the blueprint was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withCreatedOn(java.util.Date createdOn) {
        setCreatedOn(createdOn);
        return this;
    }

    /**
     * <p>
     * The date and time the blueprint was last modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The date and time the blueprint was last modified.
     */

    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The date and time the blueprint was last modified.
     * </p>
     * 
     * @return The date and time the blueprint was last modified.
     */

    public java.util.Date getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * <p>
     * The date and time the blueprint was last modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The date and time the blueprint was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
        return this;
    }

    /**
     * <p>
     * A JSON string that indicates the list of parameter specifications for the blueprint.
     * </p>
     * 
     * @param parameterSpec
     *        A JSON string that indicates the list of parameter specifications for the blueprint.
     */

    public void setParameterSpec(String parameterSpec) {
        this.parameterSpec = parameterSpec;
    }

    /**
     * <p>
     * A JSON string that indicates the list of parameter specifications for the blueprint.
     * </p>
     * 
     * @return A JSON string that indicates the list of parameter specifications for the blueprint.
     */

    public String getParameterSpec() {
        return this.parameterSpec;
    }

    /**
     * <p>
     * A JSON string that indicates the list of parameter specifications for the blueprint.
     * </p>
     * 
     * @param parameterSpec
     *        A JSON string that indicates the list of parameter specifications for the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withParameterSpec(String parameterSpec) {
        setParameterSpec(parameterSpec);
        return this;
    }

    /**
     * <p>
     * Specifies the path in Amazon S3 where the blueprint is published.
     * </p>
     * 
     * @param blueprintLocation
     *        Specifies the path in Amazon S3 where the blueprint is published.
     */

    public void setBlueprintLocation(String blueprintLocation) {
        this.blueprintLocation = blueprintLocation;
    }

    /**
     * <p>
     * Specifies the path in Amazon S3 where the blueprint is published.
     * </p>
     * 
     * @return Specifies the path in Amazon S3 where the blueprint is published.
     */

    public String getBlueprintLocation() {
        return this.blueprintLocation;
    }

    /**
     * <p>
     * Specifies the path in Amazon S3 where the blueprint is published.
     * </p>
     * 
     * @param blueprintLocation
     *        Specifies the path in Amazon S3 where the blueprint is published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withBlueprintLocation(String blueprintLocation) {
        setBlueprintLocation(blueprintLocation);
        return this;
    }

    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is copied when you call
     * <code>CreateBlueprint/UpdateBlueprint</code> to register the blueprint in Glue.
     * </p>
     * 
     * @param blueprintServiceLocation
     *        Specifies a path in Amazon S3 where the blueprint is copied when you call
     *        <code>CreateBlueprint/UpdateBlueprint</code> to register the blueprint in Glue.
     */

    public void setBlueprintServiceLocation(String blueprintServiceLocation) {
        this.blueprintServiceLocation = blueprintServiceLocation;
    }

    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is copied when you call
     * <code>CreateBlueprint/UpdateBlueprint</code> to register the blueprint in Glue.
     * </p>
     * 
     * @return Specifies a path in Amazon S3 where the blueprint is copied when you call
     *         <code>CreateBlueprint/UpdateBlueprint</code> to register the blueprint in Glue.
     */

    public String getBlueprintServiceLocation() {
        return this.blueprintServiceLocation;
    }

    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is copied when you call
     * <code>CreateBlueprint/UpdateBlueprint</code> to register the blueprint in Glue.
     * </p>
     * 
     * @param blueprintServiceLocation
     *        Specifies a path in Amazon S3 where the blueprint is copied when you call
     *        <code>CreateBlueprint/UpdateBlueprint</code> to register the blueprint in Glue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withBlueprintServiceLocation(String blueprintServiceLocation) {
        setBlueprintServiceLocation(blueprintServiceLocation);
        return this;
    }

    /**
     * <p>
     * The status of the blueprint registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creating — The blueprint registration is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Active — The blueprint has been successfully registered.
     * </p>
     * </li>
     * <li>
     * <p>
     * Updating — An update to the blueprint registration is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed — The blueprint registration failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the blueprint registration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Creating — The blueprint registration is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Active — The blueprint has been successfully registered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Updating — An update to the blueprint registration is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed — The blueprint registration failed.
     *        </p>
     *        </li>
     * @see BlueprintStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the blueprint registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creating — The blueprint registration is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Active — The blueprint has been successfully registered.
     * </p>
     * </li>
     * <li>
     * <p>
     * Updating — An update to the blueprint registration is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed — The blueprint registration failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the blueprint registration.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Creating — The blueprint registration is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Active — The blueprint has been successfully registered.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Updating — An update to the blueprint registration is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed — The blueprint registration failed.
     *         </p>
     *         </li>
     * @see BlueprintStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the blueprint registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creating — The blueprint registration is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Active — The blueprint has been successfully registered.
     * </p>
     * </li>
     * <li>
     * <p>
     * Updating — An update to the blueprint registration is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed — The blueprint registration failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the blueprint registration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Creating — The blueprint registration is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Active — The blueprint has been successfully registered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Updating — An update to the blueprint registration is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed — The blueprint registration failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlueprintStatus
     */

    public Blueprint withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the blueprint registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creating — The blueprint registration is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Active — The blueprint has been successfully registered.
     * </p>
     * </li>
     * <li>
     * <p>
     * Updating — An update to the blueprint registration is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed — The blueprint registration failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the blueprint registration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Creating — The blueprint registration is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Active — The blueprint has been successfully registered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Updating — An update to the blueprint registration is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed — The blueprint registration failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlueprintStatus
     */

    public Blueprint withStatus(BlueprintStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * 
     * @param errorMessage
     *        An error message.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * 
     * @return An error message.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * 
     * @param errorMessage
     *        An error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * When there are multiple versions of a blueprint and the latest version has some errors, this attribute indicates
     * the last successful blueprint definition that is available with the service.
     * </p>
     * 
     * @param lastActiveDefinition
     *        When there are multiple versions of a blueprint and the latest version has some errors, this attribute
     *        indicates the last successful blueprint definition that is available with the service.
     */

    public void setLastActiveDefinition(LastActiveDefinition lastActiveDefinition) {
        this.lastActiveDefinition = lastActiveDefinition;
    }

    /**
     * <p>
     * When there are multiple versions of a blueprint and the latest version has some errors, this attribute indicates
     * the last successful blueprint definition that is available with the service.
     * </p>
     * 
     * @return When there are multiple versions of a blueprint and the latest version has some errors, this attribute
     *         indicates the last successful blueprint definition that is available with the service.
     */

    public LastActiveDefinition getLastActiveDefinition() {
        return this.lastActiveDefinition;
    }

    /**
     * <p>
     * When there are multiple versions of a blueprint and the latest version has some errors, this attribute indicates
     * the last successful blueprint definition that is available with the service.
     * </p>
     * 
     * @param lastActiveDefinition
     *        When there are multiple versions of a blueprint and the latest version has some errors, this attribute
     *        indicates the last successful blueprint definition that is available with the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withLastActiveDefinition(LastActiveDefinition lastActiveDefinition) {
        setLastActiveDefinition(lastActiveDefinition);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedOn() != null)
            sb.append("CreatedOn: ").append(getCreatedOn()).append(",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: ").append(getLastModifiedOn()).append(",");
        if (getParameterSpec() != null)
            sb.append("ParameterSpec: ").append(getParameterSpec()).append(",");
        if (getBlueprintLocation() != null)
            sb.append("BlueprintLocation: ").append(getBlueprintLocation()).append(",");
        if (getBlueprintServiceLocation() != null)
            sb.append("BlueprintServiceLocation: ").append(getBlueprintServiceLocation()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getLastActiveDefinition() != null)
            sb.append("LastActiveDefinition: ").append(getLastActiveDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Blueprint == false)
            return false;
        Blueprint other = (Blueprint) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedOn() == null ^ this.getCreatedOn() == null)
            return false;
        if (other.getCreatedOn() != null && other.getCreatedOn().equals(this.getCreatedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getParameterSpec() == null ^ this.getParameterSpec() == null)
            return false;
        if (other.getParameterSpec() != null && other.getParameterSpec().equals(this.getParameterSpec()) == false)
            return false;
        if (other.getBlueprintLocation() == null ^ this.getBlueprintLocation() == null)
            return false;
        if (other.getBlueprintLocation() != null && other.getBlueprintLocation().equals(this.getBlueprintLocation()) == false)
            return false;
        if (other.getBlueprintServiceLocation() == null ^ this.getBlueprintServiceLocation() == null)
            return false;
        if (other.getBlueprintServiceLocation() != null && other.getBlueprintServiceLocation().equals(this.getBlueprintServiceLocation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getLastActiveDefinition() == null ^ this.getLastActiveDefinition() == null)
            return false;
        if (other.getLastActiveDefinition() != null && other.getLastActiveDefinition().equals(this.getLastActiveDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedOn() == null) ? 0 : getCreatedOn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode + ((getParameterSpec() == null) ? 0 : getParameterSpec().hashCode());
        hashCode = prime * hashCode + ((getBlueprintLocation() == null) ? 0 : getBlueprintLocation().hashCode());
        hashCode = prime * hashCode + ((getBlueprintServiceLocation() == null) ? 0 : getBlueprintServiceLocation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLastActiveDefinition() == null) ? 0 : getLastActiveDefinition().hashCode());
        return hashCode;
    }

    @Override
    public Blueprint clone() {
        try {
            return (Blueprint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.BlueprintMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
