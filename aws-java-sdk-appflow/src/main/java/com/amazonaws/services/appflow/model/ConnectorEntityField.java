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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the data model of a connector field. For example, for an <i>account</i> entity, the fields would be
 * <i>account name</i>, <i>account ID</i>, and so on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ConnectorEntityField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorEntityField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the connector field.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The label applied to a connector entity field.
     * </p>
     */
    private String label;
    /**
     * <p>
     * Contains details regarding the supported <code>FieldType</code>, including the corresponding
     * <code>filterOperators</code> and <code>supportedValues</code>.
     * </p>
     */
    private SupportedFieldTypeDetails supportedFieldTypeDetails;
    /**
     * <p>
     * A description of the connector entity field.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The properties that can be applied to a field when the connector is being used as a source.
     * </p>
     */
    private SourceFieldProperties sourceProperties;
    /**
     * <p>
     * The properties applied to a field when the connector is being used as a destination.
     * </p>
     */
    private DestinationFieldProperties destinationProperties;

    /**
     * <p>
     * The unique identifier of the connector field.
     * </p>
     * 
     * @param identifier
     *        The unique identifier of the connector field.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique identifier of the connector field.
     * </p>
     * 
     * @return The unique identifier of the connector field.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique identifier of the connector field.
     * </p>
     * 
     * @param identifier
     *        The unique identifier of the connector field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorEntityField withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The label applied to a connector entity field.
     * </p>
     * 
     * @param label
     *        The label applied to a connector entity field.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label applied to a connector entity field.
     * </p>
     * 
     * @return The label applied to a connector entity field.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label applied to a connector entity field.
     * </p>
     * 
     * @param label
     *        The label applied to a connector entity field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorEntityField withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * Contains details regarding the supported <code>FieldType</code>, including the corresponding
     * <code>filterOperators</code> and <code>supportedValues</code>.
     * </p>
     * 
     * @param supportedFieldTypeDetails
     *        Contains details regarding the supported <code>FieldType</code>, including the corresponding
     *        <code>filterOperators</code> and <code>supportedValues</code>.
     */

    public void setSupportedFieldTypeDetails(SupportedFieldTypeDetails supportedFieldTypeDetails) {
        this.supportedFieldTypeDetails = supportedFieldTypeDetails;
    }

    /**
     * <p>
     * Contains details regarding the supported <code>FieldType</code>, including the corresponding
     * <code>filterOperators</code> and <code>supportedValues</code>.
     * </p>
     * 
     * @return Contains details regarding the supported <code>FieldType</code>, including the corresponding
     *         <code>filterOperators</code> and <code>supportedValues</code>.
     */

    public SupportedFieldTypeDetails getSupportedFieldTypeDetails() {
        return this.supportedFieldTypeDetails;
    }

    /**
     * <p>
     * Contains details regarding the supported <code>FieldType</code>, including the corresponding
     * <code>filterOperators</code> and <code>supportedValues</code>.
     * </p>
     * 
     * @param supportedFieldTypeDetails
     *        Contains details regarding the supported <code>FieldType</code>, including the corresponding
     *        <code>filterOperators</code> and <code>supportedValues</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorEntityField withSupportedFieldTypeDetails(SupportedFieldTypeDetails supportedFieldTypeDetails) {
        setSupportedFieldTypeDetails(supportedFieldTypeDetails);
        return this;
    }

    /**
     * <p>
     * A description of the connector entity field.
     * </p>
     * 
     * @param description
     *        A description of the connector entity field.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the connector entity field.
     * </p>
     * 
     * @return A description of the connector entity field.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the connector entity field.
     * </p>
     * 
     * @param description
     *        A description of the connector entity field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorEntityField withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The properties that can be applied to a field when the connector is being used as a source.
     * </p>
     * 
     * @param sourceProperties
     *        The properties that can be applied to a field when the connector is being used as a source.
     */

    public void setSourceProperties(SourceFieldProperties sourceProperties) {
        this.sourceProperties = sourceProperties;
    }

    /**
     * <p>
     * The properties that can be applied to a field when the connector is being used as a source.
     * </p>
     * 
     * @return The properties that can be applied to a field when the connector is being used as a source.
     */

    public SourceFieldProperties getSourceProperties() {
        return this.sourceProperties;
    }

    /**
     * <p>
     * The properties that can be applied to a field when the connector is being used as a source.
     * </p>
     * 
     * @param sourceProperties
     *        The properties that can be applied to a field when the connector is being used as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorEntityField withSourceProperties(SourceFieldProperties sourceProperties) {
        setSourceProperties(sourceProperties);
        return this;
    }

    /**
     * <p>
     * The properties applied to a field when the connector is being used as a destination.
     * </p>
     * 
     * @param destinationProperties
     *        The properties applied to a field when the connector is being used as a destination.
     */

    public void setDestinationProperties(DestinationFieldProperties destinationProperties) {
        this.destinationProperties = destinationProperties;
    }

    /**
     * <p>
     * The properties applied to a field when the connector is being used as a destination.
     * </p>
     * 
     * @return The properties applied to a field when the connector is being used as a destination.
     */

    public DestinationFieldProperties getDestinationProperties() {
        return this.destinationProperties;
    }

    /**
     * <p>
     * The properties applied to a field when the connector is being used as a destination.
     * </p>
     * 
     * @param destinationProperties
     *        The properties applied to a field when the connector is being used as a destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorEntityField withDestinationProperties(DestinationFieldProperties destinationProperties) {
        setDestinationProperties(destinationProperties);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getSupportedFieldTypeDetails() != null)
            sb.append("SupportedFieldTypeDetails: ").append(getSupportedFieldTypeDetails()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSourceProperties() != null)
            sb.append("SourceProperties: ").append(getSourceProperties()).append(",");
        if (getDestinationProperties() != null)
            sb.append("DestinationProperties: ").append(getDestinationProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorEntityField == false)
            return false;
        ConnectorEntityField other = (ConnectorEntityField) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getSupportedFieldTypeDetails() == null ^ this.getSupportedFieldTypeDetails() == null)
            return false;
        if (other.getSupportedFieldTypeDetails() != null && other.getSupportedFieldTypeDetails().equals(this.getSupportedFieldTypeDetails()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSourceProperties() == null ^ this.getSourceProperties() == null)
            return false;
        if (other.getSourceProperties() != null && other.getSourceProperties().equals(this.getSourceProperties()) == false)
            return false;
        if (other.getDestinationProperties() == null ^ this.getDestinationProperties() == null)
            return false;
        if (other.getDestinationProperties() != null && other.getDestinationProperties().equals(this.getDestinationProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getSupportedFieldTypeDetails() == null) ? 0 : getSupportedFieldTypeDetails().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSourceProperties() == null) ? 0 : getSourceProperties().hashCode());
        hashCode = prime * hashCode + ((getDestinationProperties() == null) ? 0 : getDestinationProperties().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorEntityField clone() {
        try {
            return (ConnectorEntityField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ConnectorEntityFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
