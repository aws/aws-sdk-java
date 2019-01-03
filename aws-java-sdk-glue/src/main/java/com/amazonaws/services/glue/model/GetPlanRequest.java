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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPlan" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of mappings from a source table to target tables.
     * </p>
     */
    private java.util.List<MappingEntry> mapping;
    /**
     * <p>
     * The source table.
     * </p>
     */
    private CatalogEntry source;
    /**
     * <p>
     * The target tables.
     * </p>
     */
    private java.util.List<CatalogEntry> sinks;
    /**
     * <p>
     * Parameters for the mapping.
     * </p>
     */
    private Location location;
    /**
     * <p>
     * The programming language of the code to perform the mapping.
     * </p>
     */
    private String language;

    /**
     * <p>
     * The list of mappings from a source table to target tables.
     * </p>
     * 
     * @return The list of mappings from a source table to target tables.
     */

    public java.util.List<MappingEntry> getMapping() {
        return mapping;
    }

    /**
     * <p>
     * The list of mappings from a source table to target tables.
     * </p>
     * 
     * @param mapping
     *        The list of mappings from a source table to target tables.
     */

    public void setMapping(java.util.Collection<MappingEntry> mapping) {
        if (mapping == null) {
            this.mapping = null;
            return;
        }

        this.mapping = new java.util.ArrayList<MappingEntry>(mapping);
    }

    /**
     * <p>
     * The list of mappings from a source table to target tables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMapping(java.util.Collection)} or {@link #withMapping(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param mapping
     *        The list of mappings from a source table to target tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlanRequest withMapping(MappingEntry... mapping) {
        if (this.mapping == null) {
            setMapping(new java.util.ArrayList<MappingEntry>(mapping.length));
        }
        for (MappingEntry ele : mapping) {
            this.mapping.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of mappings from a source table to target tables.
     * </p>
     * 
     * @param mapping
     *        The list of mappings from a source table to target tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlanRequest withMapping(java.util.Collection<MappingEntry> mapping) {
        setMapping(mapping);
        return this;
    }

    /**
     * <p>
     * The source table.
     * </p>
     * 
     * @param source
     *        The source table.
     */

    public void setSource(CatalogEntry source) {
        this.source = source;
    }

    /**
     * <p>
     * The source table.
     * </p>
     * 
     * @return The source table.
     */

    public CatalogEntry getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source table.
     * </p>
     * 
     * @param source
     *        The source table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlanRequest withSource(CatalogEntry source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The target tables.
     * </p>
     * 
     * @return The target tables.
     */

    public java.util.List<CatalogEntry> getSinks() {
        return sinks;
    }

    /**
     * <p>
     * The target tables.
     * </p>
     * 
     * @param sinks
     *        The target tables.
     */

    public void setSinks(java.util.Collection<CatalogEntry> sinks) {
        if (sinks == null) {
            this.sinks = null;
            return;
        }

        this.sinks = new java.util.ArrayList<CatalogEntry>(sinks);
    }

    /**
     * <p>
     * The target tables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSinks(java.util.Collection)} or {@link #withSinks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sinks
     *        The target tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlanRequest withSinks(CatalogEntry... sinks) {
        if (this.sinks == null) {
            setSinks(new java.util.ArrayList<CatalogEntry>(sinks.length));
        }
        for (CatalogEntry ele : sinks) {
            this.sinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target tables.
     * </p>
     * 
     * @param sinks
     *        The target tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlanRequest withSinks(java.util.Collection<CatalogEntry> sinks) {
        setSinks(sinks);
        return this;
    }

    /**
     * <p>
     * Parameters for the mapping.
     * </p>
     * 
     * @param location
     *        Parameters for the mapping.
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * Parameters for the mapping.
     * </p>
     * 
     * @return Parameters for the mapping.
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Parameters for the mapping.
     * </p>
     * 
     * @param location
     *        Parameters for the mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlanRequest withLocation(Location location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The programming language of the code to perform the mapping.
     * </p>
     * 
     * @param language
     *        The programming language of the code to perform the mapping.
     * @see Language
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The programming language of the code to perform the mapping.
     * </p>
     * 
     * @return The programming language of the code to perform the mapping.
     * @see Language
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The programming language of the code to perform the mapping.
     * </p>
     * 
     * @param language
     *        The programming language of the code to perform the mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Language
     */

    public GetPlanRequest withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The programming language of the code to perform the mapping.
     * </p>
     * 
     * @param language
     *        The programming language of the code to perform the mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Language
     */

    public GetPlanRequest withLanguage(Language language) {
        this.language = language.toString();
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
        if (getMapping() != null)
            sb.append("Mapping: ").append(getMapping()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSinks() != null)
            sb.append("Sinks: ").append(getSinks()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPlanRequest == false)
            return false;
        GetPlanRequest other = (GetPlanRequest) obj;
        if (other.getMapping() == null ^ this.getMapping() == null)
            return false;
        if (other.getMapping() != null && other.getMapping().equals(this.getMapping()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSinks() == null ^ this.getSinks() == null)
            return false;
        if (other.getSinks() != null && other.getSinks().equals(this.getSinks()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMapping() == null) ? 0 : getMapping().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSinks() == null) ? 0 : getSinks().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        return hashCode;
    }

    @Override
    public GetPlanRequest clone() {
        return (GetPlanRequest) super.clone();
    }

}
