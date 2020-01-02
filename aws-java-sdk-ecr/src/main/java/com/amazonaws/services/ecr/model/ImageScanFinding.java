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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an image scan finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ImageScanFinding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageScanFinding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name associated with the finding, usually a CVE number.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the finding.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A link containing additional details about the security vulnerability.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * The finding severity.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * A collection of attributes of the host from which the finding is generated.
     * </p>
     */
    private java.util.List<Attribute> attributes;

    /**
     * <p>
     * The name associated with the finding, usually a CVE number.
     * </p>
     * 
     * @param name
     *        The name associated with the finding, usually a CVE number.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name associated with the finding, usually a CVE number.
     * </p>
     * 
     * @return The name associated with the finding, usually a CVE number.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name associated with the finding, usually a CVE number.
     * </p>
     * 
     * @param name
     *        The name associated with the finding, usually a CVE number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @param description
     *        The description of the finding.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @return The description of the finding.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @param description
     *        The description of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A link containing additional details about the security vulnerability.
     * </p>
     * 
     * @param uri
     *        A link containing additional details about the security vulnerability.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * A link containing additional details about the security vulnerability.
     * </p>
     * 
     * @return A link containing additional details about the security vulnerability.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * A link containing additional details about the security vulnerability.
     * </p>
     * 
     * @param uri
     *        A link containing additional details about the security vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The finding severity.
     * </p>
     * 
     * @param severity
     *        The finding severity.
     * @see FindingSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The finding severity.
     * </p>
     * 
     * @return The finding severity.
     * @see FindingSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The finding severity.
     * </p>
     * 
     * @param severity
     *        The finding severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingSeverity
     */

    public ImageScanFinding withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The finding severity.
     * </p>
     * 
     * @param severity
     *        The finding severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingSeverity
     */

    public ImageScanFinding withSeverity(FindingSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * A collection of attributes of the host from which the finding is generated.
     * </p>
     * 
     * @return A collection of attributes of the host from which the finding is generated.
     */

    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A collection of attributes of the host from which the finding is generated.
     * </p>
     * 
     * @param attributes
     *        A collection of attributes of the host from which the finding is generated.
     */

    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * A collection of attributes of the host from which the finding is generated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        A collection of attributes of the host from which the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of attributes of the host from which the finding is generated.
     * </p>
     * 
     * @param attributes
     *        A collection of attributes of the host from which the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFinding withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
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
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageScanFinding == false)
            return false;
        ImageScanFinding other = (ImageScanFinding) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ImageScanFinding clone() {
        try {
            return (ImageScanFinding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ImageScanFindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
