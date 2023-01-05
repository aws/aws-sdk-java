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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ImportSignalCatalog" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportSignalCatalogRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the signal catalog to import.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A brief description of the signal catalog.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The contents of the Vehicle Signal Specification (VSS) configuration. VSS is a precise language used to describe
     * and model signals in vehicle networks.
     * </p>
     */
    private FormattedVss vss;
    /**
     * <p>
     * Metadata that can be used to manage the signal catalog.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the signal catalog to import.
     * </p>
     * 
     * @param name
     *        The name of the signal catalog to import.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the signal catalog to import.
     * </p>
     * 
     * @return The name of the signal catalog to import.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the signal catalog to import.
     * </p>
     * 
     * @param name
     *        The name of the signal catalog to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSignalCatalogRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A brief description of the signal catalog.
     * </p>
     * 
     * @param description
     *        A brief description of the signal catalog.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the signal catalog.
     * </p>
     * 
     * @return A brief description of the signal catalog.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the signal catalog.
     * </p>
     * 
     * @param description
     *        A brief description of the signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSignalCatalogRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The contents of the Vehicle Signal Specification (VSS) configuration. VSS is a precise language used to describe
     * and model signals in vehicle networks.
     * </p>
     * 
     * @param vss
     *        The contents of the Vehicle Signal Specification (VSS) configuration. VSS is a precise language used to
     *        describe and model signals in vehicle networks.
     */

    public void setVss(FormattedVss vss) {
        this.vss = vss;
    }

    /**
     * <p>
     * The contents of the Vehicle Signal Specification (VSS) configuration. VSS is a precise language used to describe
     * and model signals in vehicle networks.
     * </p>
     * 
     * @return The contents of the Vehicle Signal Specification (VSS) configuration. VSS is a precise language used to
     *         describe and model signals in vehicle networks.
     */

    public FormattedVss getVss() {
        return this.vss;
    }

    /**
     * <p>
     * The contents of the Vehicle Signal Specification (VSS) configuration. VSS is a precise language used to describe
     * and model signals in vehicle networks.
     * </p>
     * 
     * @param vss
     *        The contents of the Vehicle Signal Specification (VSS) configuration. VSS is a precise language used to
     *        describe and model signals in vehicle networks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSignalCatalogRequest withVss(FormattedVss vss) {
        setVss(vss);
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the signal catalog.
     * </p>
     * 
     * @return Metadata that can be used to manage the signal catalog.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the signal catalog.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the signal catalog.
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
     * Metadata that can be used to manage the signal catalog.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSignalCatalogRequest withTags(Tag... tags) {
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
     * Metadata that can be used to manage the signal catalog.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSignalCatalogRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVss() != null)
            sb.append("Vss: ").append(getVss()).append(",");
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

        if (obj instanceof ImportSignalCatalogRequest == false)
            return false;
        ImportSignalCatalogRequest other = (ImportSignalCatalogRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVss() == null ^ this.getVss() == null)
            return false;
        if (other.getVss() != null && other.getVss().equals(this.getVss()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVss() == null) ? 0 : getVss().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImportSignalCatalogRequest clone() {
        return (ImportSignalCatalogRequest) super.clone();
    }

}
