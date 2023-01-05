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
 * When there are multiple versions of a blueprint and the latest version has some errors, this attribute indicates the
 * last successful blueprint definition that is available with the service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/LastActiveDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LastActiveDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the blueprint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time the blueprint was last modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;
    /**
     * <p>
     * A JSON string specifying the parameters for the blueprint.
     * </p>
     */
    private String parameterSpec;
    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is published by the Glue developer.
     * </p>
     */
    private String blueprintLocation;
    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is copied when you create or update the blueprint.
     * </p>
     */
    private String blueprintServiceLocation;

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

    public LastActiveDefinition withDescription(String description) {
        setDescription(description);
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

    public LastActiveDefinition withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
        return this;
    }

    /**
     * <p>
     * A JSON string specifying the parameters for the blueprint.
     * </p>
     * 
     * @param parameterSpec
     *        A JSON string specifying the parameters for the blueprint.
     */

    public void setParameterSpec(String parameterSpec) {
        this.parameterSpec = parameterSpec;
    }

    /**
     * <p>
     * A JSON string specifying the parameters for the blueprint.
     * </p>
     * 
     * @return A JSON string specifying the parameters for the blueprint.
     */

    public String getParameterSpec() {
        return this.parameterSpec;
    }

    /**
     * <p>
     * A JSON string specifying the parameters for the blueprint.
     * </p>
     * 
     * @param parameterSpec
     *        A JSON string specifying the parameters for the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastActiveDefinition withParameterSpec(String parameterSpec) {
        setParameterSpec(parameterSpec);
        return this;
    }

    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is published by the Glue developer.
     * </p>
     * 
     * @param blueprintLocation
     *        Specifies a path in Amazon S3 where the blueprint is published by the Glue developer.
     */

    public void setBlueprintLocation(String blueprintLocation) {
        this.blueprintLocation = blueprintLocation;
    }

    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is published by the Glue developer.
     * </p>
     * 
     * @return Specifies a path in Amazon S3 where the blueprint is published by the Glue developer.
     */

    public String getBlueprintLocation() {
        return this.blueprintLocation;
    }

    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is published by the Glue developer.
     * </p>
     * 
     * @param blueprintLocation
     *        Specifies a path in Amazon S3 where the blueprint is published by the Glue developer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastActiveDefinition withBlueprintLocation(String blueprintLocation) {
        setBlueprintLocation(blueprintLocation);
        return this;
    }

    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is copied when you create or update the blueprint.
     * </p>
     * 
     * @param blueprintServiceLocation
     *        Specifies a path in Amazon S3 where the blueprint is copied when you create or update the blueprint.
     */

    public void setBlueprintServiceLocation(String blueprintServiceLocation) {
        this.blueprintServiceLocation = blueprintServiceLocation;
    }

    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is copied when you create or update the blueprint.
     * </p>
     * 
     * @return Specifies a path in Amazon S3 where the blueprint is copied when you create or update the blueprint.
     */

    public String getBlueprintServiceLocation() {
        return this.blueprintServiceLocation;
    }

    /**
     * <p>
     * Specifies a path in Amazon S3 where the blueprint is copied when you create or update the blueprint.
     * </p>
     * 
     * @param blueprintServiceLocation
     *        Specifies a path in Amazon S3 where the blueprint is copied when you create or update the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastActiveDefinition withBlueprintServiceLocation(String blueprintServiceLocation) {
        setBlueprintServiceLocation(blueprintServiceLocation);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: ").append(getLastModifiedOn()).append(",");
        if (getParameterSpec() != null)
            sb.append("ParameterSpec: ").append(getParameterSpec()).append(",");
        if (getBlueprintLocation() != null)
            sb.append("BlueprintLocation: ").append(getBlueprintLocation()).append(",");
        if (getBlueprintServiceLocation() != null)
            sb.append("BlueprintServiceLocation: ").append(getBlueprintServiceLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastActiveDefinition == false)
            return false;
        LastActiveDefinition other = (LastActiveDefinition) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode + ((getParameterSpec() == null) ? 0 : getParameterSpec().hashCode());
        hashCode = prime * hashCode + ((getBlueprintLocation() == null) ? 0 : getBlueprintLocation().hashCode());
        hashCode = prime * hashCode + ((getBlueprintServiceLocation() == null) ? 0 : getBlueprintServiceLocation().hashCode());
        return hashCode;
    }

    @Override
    public LastActiveDefinition clone() {
        try {
            return (LastActiveDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.LastActiveDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
